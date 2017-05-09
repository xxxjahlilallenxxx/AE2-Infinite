package main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Register.MODID, name = Register.NAME, version = Register.VERSION)
public class Register {

	public static final String MODID = "ae2Infinite";
	public static final String NAME = "AE2 Infinite";
	public static final String VERSION = "1.7.10-1.0.0";
	
	@Instance
	public static Register instance = new Register();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
