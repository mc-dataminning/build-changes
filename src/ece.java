import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class ece {
   private static final Set<aer> aI = Sets.newHashSet();
   private static final Set<aer> aJ = Collections.unmodifiableSet(aI);
   public static final aer a = new aer("empty");
   public static final aer b = a("chests/spawn_bonus_chest");
   public static final aer c = a("chests/end_city_treasure");
   public static final aer d = a("chests/simple_dungeon");
   public static final aer e = a("chests/village/village_weaponsmith");
   public static final aer f = a("chests/village/village_toolsmith");
   public static final aer g = a("chests/village/village_armorer");
   public static final aer h = a("chests/village/village_cartographer");
   public static final aer i = a("chests/village/village_mason");
   public static final aer j = a("chests/village/village_shepherd");
   public static final aer k = a("chests/village/village_butcher");
   public static final aer l = a("chests/village/village_fletcher");
   public static final aer m = a("chests/village/village_fisher");
   public static final aer n = a("chests/village/village_tannery");
   public static final aer o = a("chests/village/village_temple");
   public static final aer p = a("chests/village/village_desert_house");
   public static final aer q = a("chests/village/village_plains_house");
   public static final aer r = a("chests/village/village_taiga_house");
   public static final aer s = a("chests/village/village_snowy_house");
   public static final aer t = a("chests/village/village_savanna_house");
   public static final aer u = a("chests/abandoned_mineshaft");
   public static final aer v = a("chests/nether_bridge");
   public static final aer w = a("chests/stronghold_library");
   public static final aer x = a("chests/stronghold_crossing");
   public static final aer y = a("chests/stronghold_corridor");
   public static final aer z = a("chests/desert_pyramid");
   public static final aer A = a("chests/jungle_temple");
   public static final aer B = a("chests/jungle_temple_dispenser");
   public static final aer C = a("chests/igloo_chest");
   public static final aer D = a("chests/woodland_mansion");
   public static final aer E = a("chests/underwater_ruin_small");
   public static final aer F = a("chests/underwater_ruin_big");
   public static final aer G = a("chests/buried_treasure");
   public static final aer H = a("chests/shipwreck_map");
   public static final aer I = a("chests/shipwreck_supply");
   public static final aer J = a("chests/shipwreck_treasure");
   public static final aer K = a("chests/pillager_outpost");
   public static final aer L = a("chests/bastion_treasure");
   public static final aer M = a("chests/bastion_other");
   public static final aer N = a("chests/bastion_bridge");
   public static final aer O = a("chests/bastion_hoglin_stable");
   public static final aer P = a("chests/ancient_city");
   public static final aer Q = a("chests/ancient_city_ice_box");
   public static final aer R = a("chests/ruined_portal");
   public static final aer S = a("entities/sheep/white");
   public static final aer T = a("entities/sheep/orange");
   public static final aer U = a("entities/sheep/magenta");
   public static final aer V = a("entities/sheep/light_blue");
   public static final aer W = a("entities/sheep/yellow");
   public static final aer X = a("entities/sheep/lime");
   public static final aer Y = a("entities/sheep/pink");
   public static final aer Z = a("entities/sheep/gray");
   public static final aer aa = a("entities/sheep/light_gray");
   public static final aer ab = a("entities/sheep/cyan");
   public static final aer ac = a("entities/sheep/purple");
   public static final aer ad = a("entities/sheep/blue");
   public static final aer ae = a("entities/sheep/brown");
   public static final aer af = a("entities/sheep/green");
   public static final aer ag = a("entities/sheep/red");
   public static final aer ah = a("entities/sheep/black");
   public static final aer ai = a("gameplay/fishing");
   public static final aer aj = a("gameplay/fishing/junk");
   public static final aer ak = a("gameplay/fishing/treasure");
   public static final aer al = a("gameplay/fishing/fish");
   public static final aer am = a("gameplay/cat_morning_gift");
   public static final aer an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aer ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aer ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aer aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aer ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aer as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aer at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aer au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aer av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aer aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aer ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aer ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aer az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aer aA = a("gameplay/sniffer_digging");
   public static final aer aB = a("gameplay/piglin_bartering");
   public static final aer aC = a("archaeology/desert_well");
   public static final aer aD = a("archaeology/desert_pyramid");
   public static final aer aE = a("archaeology/trail_ruins_common");
   public static final aer aF = a("archaeology/trail_ruins_rare");
   public static final aer aG = a("archaeology/ocean_ruin_warm");
   public static final aer aH = a("archaeology/ocean_ruin_cold");

   private static aer a(String $$0) {
      return a(new aer($$0));
   }

   private static aer a(aer $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aer> a() {
      return aJ;
   }
}
