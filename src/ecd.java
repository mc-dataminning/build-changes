import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class ecd {
   private static final Set<aep> aI = Sets.newHashSet();
   private static final Set<aep> aJ = Collections.unmodifiableSet(aI);
   public static final aep a = new aep("empty");
   public static final aep b = a("chests/spawn_bonus_chest");
   public static final aep c = a("chests/end_city_treasure");
   public static final aep d = a("chests/simple_dungeon");
   public static final aep e = a("chests/village/village_weaponsmith");
   public static final aep f = a("chests/village/village_toolsmith");
   public static final aep g = a("chests/village/village_armorer");
   public static final aep h = a("chests/village/village_cartographer");
   public static final aep i = a("chests/village/village_mason");
   public static final aep j = a("chests/village/village_shepherd");
   public static final aep k = a("chests/village/village_butcher");
   public static final aep l = a("chests/village/village_fletcher");
   public static final aep m = a("chests/village/village_fisher");
   public static final aep n = a("chests/village/village_tannery");
   public static final aep o = a("chests/village/village_temple");
   public static final aep p = a("chests/village/village_desert_house");
   public static final aep q = a("chests/village/village_plains_house");
   public static final aep r = a("chests/village/village_taiga_house");
   public static final aep s = a("chests/village/village_snowy_house");
   public static final aep t = a("chests/village/village_savanna_house");
   public static final aep u = a("chests/abandoned_mineshaft");
   public static final aep v = a("chests/nether_bridge");
   public static final aep w = a("chests/stronghold_library");
   public static final aep x = a("chests/stronghold_crossing");
   public static final aep y = a("chests/stronghold_corridor");
   public static final aep z = a("chests/desert_pyramid");
   public static final aep A = a("chests/jungle_temple");
   public static final aep B = a("chests/jungle_temple_dispenser");
   public static final aep C = a("chests/igloo_chest");
   public static final aep D = a("chests/woodland_mansion");
   public static final aep E = a("chests/underwater_ruin_small");
   public static final aep F = a("chests/underwater_ruin_big");
   public static final aep G = a("chests/buried_treasure");
   public static final aep H = a("chests/shipwreck_map");
   public static final aep I = a("chests/shipwreck_supply");
   public static final aep J = a("chests/shipwreck_treasure");
   public static final aep K = a("chests/pillager_outpost");
   public static final aep L = a("chests/bastion_treasure");
   public static final aep M = a("chests/bastion_other");
   public static final aep N = a("chests/bastion_bridge");
   public static final aep O = a("chests/bastion_hoglin_stable");
   public static final aep P = a("chests/ancient_city");
   public static final aep Q = a("chests/ancient_city_ice_box");
   public static final aep R = a("chests/ruined_portal");
   public static final aep S = a("entities/sheep/white");
   public static final aep T = a("entities/sheep/orange");
   public static final aep U = a("entities/sheep/magenta");
   public static final aep V = a("entities/sheep/light_blue");
   public static final aep W = a("entities/sheep/yellow");
   public static final aep X = a("entities/sheep/lime");
   public static final aep Y = a("entities/sheep/pink");
   public static final aep Z = a("entities/sheep/gray");
   public static final aep aa = a("entities/sheep/light_gray");
   public static final aep ab = a("entities/sheep/cyan");
   public static final aep ac = a("entities/sheep/purple");
   public static final aep ad = a("entities/sheep/blue");
   public static final aep ae = a("entities/sheep/brown");
   public static final aep af = a("entities/sheep/green");
   public static final aep ag = a("entities/sheep/red");
   public static final aep ah = a("entities/sheep/black");
   public static final aep ai = a("gameplay/fishing");
   public static final aep aj = a("gameplay/fishing/junk");
   public static final aep ak = a("gameplay/fishing/treasure");
   public static final aep al = a("gameplay/fishing/fish");
   public static final aep am = a("gameplay/cat_morning_gift");
   public static final aep an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aep ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aep ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aep aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aep ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aep as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aep at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aep au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aep av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aep aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aep ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aep ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aep az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aep aA = a("gameplay/sniffer_digging");
   public static final aep aB = a("gameplay/piglin_bartering");
   public static final aep aC = a("archaeology/desert_well");
   public static final aep aD = a("archaeology/desert_pyramid");
   public static final aep aE = a("archaeology/trail_ruins_common");
   public static final aep aF = a("archaeology/trail_ruins_rare");
   public static final aep aG = a("archaeology/ocean_ruin_warm");
   public static final aep aH = a("archaeology/ocean_ruin_cold");

   private static aep a(String $$0) {
      return a(new aep($$0));
   }

   private static aep a(aep $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aep> a() {
      return aJ;
   }
}
