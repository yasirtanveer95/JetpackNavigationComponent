package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        val navController =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
        // setupActionBarWithNavController(navController, viewBinding.drawerLayout)
        //AppBarConfiguration(navController.graph, viewBinding.drawerLayout)
        viewBinding.navView.setupWithNavController(navController)
        viewBinding.bottomNav.setupWithNavController(navController)
//        viewBinding.bottomNav.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.blankFragment2 -> {
//                    navController.navigate(R.id.action_blankFragment1_to_blankFragment2)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.blankFragment3 -> {
//                    navController.navigate(R.id.action_blankFragment2_to_blankFragment3)
//                    return@setOnItemSelectedListener true
//                }
//                else -> {
//                    return@setOnItemSelectedListener false
//                }
//            }
//        }
    }

}