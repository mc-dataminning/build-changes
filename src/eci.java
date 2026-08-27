import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class eci {
   private static final Set<aez> aI = Sets.newHashSet();
   private static final Set<aez> aJ = Collections.unmodifiableSet(aI);
   public static final aez a = new aez("empty");
   public static final aez b = a("chests/spawn_bonus_chest");
   public static final aez c = a("chests/end_city_treasure");
   public static final aez d = a("chests/simple_dungeon");
   public static final aez e = a("chests/village/village_weaponsmith");
   public static final aez f = a("chests/village/village_toolsmith");
   public static final aez g = a("chests/village/village_armorer");
   public static final aez h = a("chests/village/village_cartographer");
   public static final aez i = a("chests/village/village_mason");
   public static final aez j = a("chests/village/village_shepherd");
   public static final aez k = a("chests/village/village_butcher");
   public static final aez l = a("chests/village/village_fletcher");
   public static final aez m = a("chests/village/village_fisher");
   public static final aez n = a("chests/village/village_tannery");
   public static final aez o = a("chests/village/village_temple");
   public static final aez p = a("chests/village/village_desert_house");
   public static final aez q = a("chests/village/village_plains_house");
   public static final aez r = a("chests/village/village_taiga_house");
   public static final aez s = a("chests/village/village_snowy_house");
   public static final aez t = a("chests/village/village_savanna_house");
   public static final aez u = a("chests/abandoned_mineshaft");
   public static final aez v = a("chests/nether_bridge");
   public static final aez w = a("chests/stronghold_library");
   public static final aez x = a("chests/stronghold_crossing");
   public static final aez y = a("chests/stronghold_corridor");
   public static final aez z = a("chests/desert_pyramid");
   public static final aez A = a("chests/jungle_temple");
   public static final aez B = a("chests/jungle_temple_dispenser");
   public static final aez C = a("chests/igloo_chest");
   public static final aez D = a("chests/woodland_mansion");
   public static final aez E = a("chests/underwater_ruin_small");
   public static final aez F = a("chests/underwater_ruin_big");
   public static final aez G = a("chests/buried_treasure");
   public static final aez H = a("chests/shipwreck_map");
   public static final aez I = a("chests/shipwreck_supply");
   public static final aez J = a("chests/shipwreck_treasure");
   public static final aez K = a("chests/pillager_outpost");
   public static final aez L = a("chests/bastion_treasure");
   public static final aez M = a("chests/bastion_other");
   public static final aez N = a("chests/bastion_bridge");
   public static final aez O = a("chests/bastion_hoglin_stable");
   public static final aez P = a("chests/ancient_city");
   public static final aez Q = a("chests/ancient_city_ice_box");
   public static final aez R = a("chests/ruined_portal");
   public static final aez S = a("entities/sheep/white");
   public static final aez T = a("entities/sheep/orange");
   public static final aez U = a("entities/sheep/magenta");
   public static final aez V = a("entities/sheep/light_blue");
   public static final aez W = a("entities/sheep/yellow");
   public static final aez X = a("entities/sheep/lime");
   public static final aez Y = a("entities/sheep/pink");
   public static final aez Z = a("entities/sheep/gray");
   public static final aez aa = a("entities/sheep/light_gray");
   public static final aez ab = a("entities/sheep/cyan");
   public static final aez ac = a("entities/sheep/purple");
   public static final aez ad = a("entities/sheep/blue");
   public static final aez ae = a("entities/sheep/brown");
   public static final aez af = a("entities/sheep/green");
   public static final aez ag = a("entities/sheep/red");
   public static final aez ah = a("entities/sheep/black");
   public static final aez ai = a("gameplay/fishing");
   public static final aez aj = a("gameplay/fishing/junk");
   public static final aez ak = a("gameplay/fishing/treasure");
   public static final aez al = a("gameplay/fishing/fish");
   public static final aez am = a("gameplay/cat_morning_gift");
   public static final aez an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aez ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aez ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aez aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aez ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aez as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aez at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aez au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aez av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aez aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aez ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aez ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aez az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aez aA = a("gameplay/sniffer_digging");
   public static final aez aB = a("gameplay/piglin_bartering");
   public static final aez aC = a("archaeology/desert_well");
   public static final aez aD = a("archaeology/desert_pyramid");
   public static final aez aE = a("archaeology/trail_ruins_common");
   public static final aez aF = a("archaeology/trail_ruins_rare");
   public static final aez aG = a("archaeology/ocean_ruin_warm");
   public static final aez aH = a("archaeology/ocean_ruin_cold");

   private static aez a(String $$0) {
      return a(new aez($$0));
   }

   private static aez a(aez $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aez> a() {
      return aJ;
   }
}
