import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class ecq {
   private static final Set<aey> aI = Sets.newHashSet();
   private static final Set<aey> aJ = Collections.unmodifiableSet(aI);
   public static final aey a = new aey("empty");
   public static final aey b = a("chests/spawn_bonus_chest");
   public static final aey c = a("chests/end_city_treasure");
   public static final aey d = a("chests/simple_dungeon");
   public static final aey e = a("chests/village/village_weaponsmith");
   public static final aey f = a("chests/village/village_toolsmith");
   public static final aey g = a("chests/village/village_armorer");
   public static final aey h = a("chests/village/village_cartographer");
   public static final aey i = a("chests/village/village_mason");
   public static final aey j = a("chests/village/village_shepherd");
   public static final aey k = a("chests/village/village_butcher");
   public static final aey l = a("chests/village/village_fletcher");
   public static final aey m = a("chests/village/village_fisher");
   public static final aey n = a("chests/village/village_tannery");
   public static final aey o = a("chests/village/village_temple");
   public static final aey p = a("chests/village/village_desert_house");
   public static final aey q = a("chests/village/village_plains_house");
   public static final aey r = a("chests/village/village_taiga_house");
   public static final aey s = a("chests/village/village_snowy_house");
   public static final aey t = a("chests/village/village_savanna_house");
   public static final aey u = a("chests/abandoned_mineshaft");
   public static final aey v = a("chests/nether_bridge");
   public static final aey w = a("chests/stronghold_library");
   public static final aey x = a("chests/stronghold_crossing");
   public static final aey y = a("chests/stronghold_corridor");
   public static final aey z = a("chests/desert_pyramid");
   public static final aey A = a("chests/jungle_temple");
   public static final aey B = a("chests/jungle_temple_dispenser");
   public static final aey C = a("chests/igloo_chest");
   public static final aey D = a("chests/woodland_mansion");
   public static final aey E = a("chests/underwater_ruin_small");
   public static final aey F = a("chests/underwater_ruin_big");
   public static final aey G = a("chests/buried_treasure");
   public static final aey H = a("chests/shipwreck_map");
   public static final aey I = a("chests/shipwreck_supply");
   public static final aey J = a("chests/shipwreck_treasure");
   public static final aey K = a("chests/pillager_outpost");
   public static final aey L = a("chests/bastion_treasure");
   public static final aey M = a("chests/bastion_other");
   public static final aey N = a("chests/bastion_bridge");
   public static final aey O = a("chests/bastion_hoglin_stable");
   public static final aey P = a("chests/ancient_city");
   public static final aey Q = a("chests/ancient_city_ice_box");
   public static final aey R = a("chests/ruined_portal");
   public static final aey S = a("entities/sheep/white");
   public static final aey T = a("entities/sheep/orange");
   public static final aey U = a("entities/sheep/magenta");
   public static final aey V = a("entities/sheep/light_blue");
   public static final aey W = a("entities/sheep/yellow");
   public static final aey X = a("entities/sheep/lime");
   public static final aey Y = a("entities/sheep/pink");
   public static final aey Z = a("entities/sheep/gray");
   public static final aey aa = a("entities/sheep/light_gray");
   public static final aey ab = a("entities/sheep/cyan");
   public static final aey ac = a("entities/sheep/purple");
   public static final aey ad = a("entities/sheep/blue");
   public static final aey ae = a("entities/sheep/brown");
   public static final aey af = a("entities/sheep/green");
   public static final aey ag = a("entities/sheep/red");
   public static final aey ah = a("entities/sheep/black");
   public static final aey ai = a("gameplay/fishing");
   public static final aey aj = a("gameplay/fishing/junk");
   public static final aey ak = a("gameplay/fishing/treasure");
   public static final aey al = a("gameplay/fishing/fish");
   public static final aey am = a("gameplay/cat_morning_gift");
   public static final aey an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aey ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aey ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aey aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aey ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aey as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aey at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aey au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aey av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aey aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aey ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aey ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aey az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aey aA = a("gameplay/sniffer_digging");
   public static final aey aB = a("gameplay/piglin_bartering");
   public static final aey aC = a("archaeology/desert_well");
   public static final aey aD = a("archaeology/desert_pyramid");
   public static final aey aE = a("archaeology/trail_ruins_common");
   public static final aey aF = a("archaeology/trail_ruins_rare");
   public static final aey aG = a("archaeology/ocean_ruin_warm");
   public static final aey aH = a("archaeology/ocean_ruin_cold");

   private static aey a(String $$0) {
      return a(new aey($$0));
   }

   private static aey a(aey $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aey> a() {
      return aJ;
   }
}
