import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class edg {
   private static final Set<afw> aI = Sets.newHashSet();
   private static final Set<afw> aJ = Collections.unmodifiableSet(aI);
   public static final afw a = new afw("empty");
   public static final afw b = a("chests/spawn_bonus_chest");
   public static final afw c = a("chests/end_city_treasure");
   public static final afw d = a("chests/simple_dungeon");
   public static final afw e = a("chests/village/village_weaponsmith");
   public static final afw f = a("chests/village/village_toolsmith");
   public static final afw g = a("chests/village/village_armorer");
   public static final afw h = a("chests/village/village_cartographer");
   public static final afw i = a("chests/village/village_mason");
   public static final afw j = a("chests/village/village_shepherd");
   public static final afw k = a("chests/village/village_butcher");
   public static final afw l = a("chests/village/village_fletcher");
   public static final afw m = a("chests/village/village_fisher");
   public static final afw n = a("chests/village/village_tannery");
   public static final afw o = a("chests/village/village_temple");
   public static final afw p = a("chests/village/village_desert_house");
   public static final afw q = a("chests/village/village_plains_house");
   public static final afw r = a("chests/village/village_taiga_house");
   public static final afw s = a("chests/village/village_snowy_house");
   public static final afw t = a("chests/village/village_savanna_house");
   public static final afw u = a("chests/abandoned_mineshaft");
   public static final afw v = a("chests/nether_bridge");
   public static final afw w = a("chests/stronghold_library");
   public static final afw x = a("chests/stronghold_crossing");
   public static final afw y = a("chests/stronghold_corridor");
   public static final afw z = a("chests/desert_pyramid");
   public static final afw A = a("chests/jungle_temple");
   public static final afw B = a("chests/jungle_temple_dispenser");
   public static final afw C = a("chests/igloo_chest");
   public static final afw D = a("chests/woodland_mansion");
   public static final afw E = a("chests/underwater_ruin_small");
   public static final afw F = a("chests/underwater_ruin_big");
   public static final afw G = a("chests/buried_treasure");
   public static final afw H = a("chests/shipwreck_map");
   public static final afw I = a("chests/shipwreck_supply");
   public static final afw J = a("chests/shipwreck_treasure");
   public static final afw K = a("chests/pillager_outpost");
   public static final afw L = a("chests/bastion_treasure");
   public static final afw M = a("chests/bastion_other");
   public static final afw N = a("chests/bastion_bridge");
   public static final afw O = a("chests/bastion_hoglin_stable");
   public static final afw P = a("chests/ancient_city");
   public static final afw Q = a("chests/ancient_city_ice_box");
   public static final afw R = a("chests/ruined_portal");
   public static final afw S = a("entities/sheep/white");
   public static final afw T = a("entities/sheep/orange");
   public static final afw U = a("entities/sheep/magenta");
   public static final afw V = a("entities/sheep/light_blue");
   public static final afw W = a("entities/sheep/yellow");
   public static final afw X = a("entities/sheep/lime");
   public static final afw Y = a("entities/sheep/pink");
   public static final afw Z = a("entities/sheep/gray");
   public static final afw aa = a("entities/sheep/light_gray");
   public static final afw ab = a("entities/sheep/cyan");
   public static final afw ac = a("entities/sheep/purple");
   public static final afw ad = a("entities/sheep/blue");
   public static final afw ae = a("entities/sheep/brown");
   public static final afw af = a("entities/sheep/green");
   public static final afw ag = a("entities/sheep/red");
   public static final afw ah = a("entities/sheep/black");
   public static final afw ai = a("gameplay/fishing");
   public static final afw aj = a("gameplay/fishing/junk");
   public static final afw ak = a("gameplay/fishing/treasure");
   public static final afw al = a("gameplay/fishing/fish");
   public static final afw am = a("gameplay/cat_morning_gift");
   public static final afw an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final afw ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final afw ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final afw aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final afw ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final afw as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final afw at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final afw au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final afw av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final afw aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final afw ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final afw ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final afw az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final afw aA = a("gameplay/sniffer_digging");
   public static final afw aB = a("gameplay/piglin_bartering");
   public static final afw aC = a("archaeology/desert_well");
   public static final afw aD = a("archaeology/desert_pyramid");
   public static final afw aE = a("archaeology/trail_ruins_common");
   public static final afw aF = a("archaeology/trail_ruins_rare");
   public static final afw aG = a("archaeology/ocean_ruin_warm");
   public static final afw aH = a("archaeology/ocean_ruin_cold");

   private static afw a(String $$0) {
      return a(new afw($$0));
   }

   private static afw a(afw $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<afw> a() {
      return aJ;
   }
}
