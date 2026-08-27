import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class dzg {
   private static final Set<acq> aI = Sets.newHashSet();
   private static final Set<acq> aJ = Collections.unmodifiableSet(aI);
   public static final acq a = new acq("empty");
   public static final acq b = a("chests/spawn_bonus_chest");
   public static final acq c = a("chests/end_city_treasure");
   public static final acq d = a("chests/simple_dungeon");
   public static final acq e = a("chests/village/village_weaponsmith");
   public static final acq f = a("chests/village/village_toolsmith");
   public static final acq g = a("chests/village/village_armorer");
   public static final acq h = a("chests/village/village_cartographer");
   public static final acq i = a("chests/village/village_mason");
   public static final acq j = a("chests/village/village_shepherd");
   public static final acq k = a("chests/village/village_butcher");
   public static final acq l = a("chests/village/village_fletcher");
   public static final acq m = a("chests/village/village_fisher");
   public static final acq n = a("chests/village/village_tannery");
   public static final acq o = a("chests/village/village_temple");
   public static final acq p = a("chests/village/village_desert_house");
   public static final acq q = a("chests/village/village_plains_house");
   public static final acq r = a("chests/village/village_taiga_house");
   public static final acq s = a("chests/village/village_snowy_house");
   public static final acq t = a("chests/village/village_savanna_house");
   public static final acq u = a("chests/abandoned_mineshaft");
   public static final acq v = a("chests/nether_bridge");
   public static final acq w = a("chests/stronghold_library");
   public static final acq x = a("chests/stronghold_crossing");
   public static final acq y = a("chests/stronghold_corridor");
   public static final acq z = a("chests/desert_pyramid");
   public static final acq A = a("chests/jungle_temple");
   public static final acq B = a("chests/jungle_temple_dispenser");
   public static final acq C = a("chests/igloo_chest");
   public static final acq D = a("chests/woodland_mansion");
   public static final acq E = a("chests/underwater_ruin_small");
   public static final acq F = a("chests/underwater_ruin_big");
   public static final acq G = a("chests/buried_treasure");
   public static final acq H = a("chests/shipwreck_map");
   public static final acq I = a("chests/shipwreck_supply");
   public static final acq J = a("chests/shipwreck_treasure");
   public static final acq K = a("chests/pillager_outpost");
   public static final acq L = a("chests/bastion_treasure");
   public static final acq M = a("chests/bastion_other");
   public static final acq N = a("chests/bastion_bridge");
   public static final acq O = a("chests/bastion_hoglin_stable");
   public static final acq P = a("chests/ancient_city");
   public static final acq Q = a("chests/ancient_city_ice_box");
   public static final acq R = a("chests/ruined_portal");
   public static final acq S = a("entities/sheep/white");
   public static final acq T = a("entities/sheep/orange");
   public static final acq U = a("entities/sheep/magenta");
   public static final acq V = a("entities/sheep/light_blue");
   public static final acq W = a("entities/sheep/yellow");
   public static final acq X = a("entities/sheep/lime");
   public static final acq Y = a("entities/sheep/pink");
   public static final acq Z = a("entities/sheep/gray");
   public static final acq aa = a("entities/sheep/light_gray");
   public static final acq ab = a("entities/sheep/cyan");
   public static final acq ac = a("entities/sheep/purple");
   public static final acq ad = a("entities/sheep/blue");
   public static final acq ae = a("entities/sheep/brown");
   public static final acq af = a("entities/sheep/green");
   public static final acq ag = a("entities/sheep/red");
   public static final acq ah = a("entities/sheep/black");
   public static final acq ai = a("gameplay/fishing");
   public static final acq aj = a("gameplay/fishing/junk");
   public static final acq ak = a("gameplay/fishing/treasure");
   public static final acq al = a("gameplay/fishing/fish");
   public static final acq am = a("gameplay/cat_morning_gift");
   public static final acq an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final acq ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final acq ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final acq aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final acq ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final acq as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final acq at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final acq au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final acq av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final acq aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final acq ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final acq ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final acq az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final acq aA = a("gameplay/sniffer_digging");
   public static final acq aB = a("gameplay/piglin_bartering");
   public static final acq aC = a("archaeology/desert_well");
   public static final acq aD = a("archaeology/desert_pyramid");
   public static final acq aE = a("archaeology/trail_ruins_common");
   public static final acq aF = a("archaeology/trail_ruins_rare");
   public static final acq aG = a("archaeology/ocean_ruin_warm");
   public static final acq aH = a("archaeology/ocean_ruin_cold");

   private static acq a(String $$0) {
      return a(new acq($$0));
   }

   private static acq a(acq $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<acq> a() {
      return aJ;
   }
}
