import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class eej {
   private static final Set<agg> aI = Sets.newHashSet();
   private static final Set<agg> aJ = Collections.unmodifiableSet(aI);
   public static final agg a = new agg("empty");
   public static final agg b = a("chests/spawn_bonus_chest");
   public static final agg c = a("chests/end_city_treasure");
   public static final agg d = a("chests/simple_dungeon");
   public static final agg e = a("chests/village/village_weaponsmith");
   public static final agg f = a("chests/village/village_toolsmith");
   public static final agg g = a("chests/village/village_armorer");
   public static final agg h = a("chests/village/village_cartographer");
   public static final agg i = a("chests/village/village_mason");
   public static final agg j = a("chests/village/village_shepherd");
   public static final agg k = a("chests/village/village_butcher");
   public static final agg l = a("chests/village/village_fletcher");
   public static final agg m = a("chests/village/village_fisher");
   public static final agg n = a("chests/village/village_tannery");
   public static final agg o = a("chests/village/village_temple");
   public static final agg p = a("chests/village/village_desert_house");
   public static final agg q = a("chests/village/village_plains_house");
   public static final agg r = a("chests/village/village_taiga_house");
   public static final agg s = a("chests/village/village_snowy_house");
   public static final agg t = a("chests/village/village_savanna_house");
   public static final agg u = a("chests/abandoned_mineshaft");
   public static final agg v = a("chests/nether_bridge");
   public static final agg w = a("chests/stronghold_library");
   public static final agg x = a("chests/stronghold_crossing");
   public static final agg y = a("chests/stronghold_corridor");
   public static final agg z = a("chests/desert_pyramid");
   public static final agg A = a("chests/jungle_temple");
   public static final agg B = a("chests/jungle_temple_dispenser");
   public static final agg C = a("chests/igloo_chest");
   public static final agg D = a("chests/woodland_mansion");
   public static final agg E = a("chests/underwater_ruin_small");
   public static final agg F = a("chests/underwater_ruin_big");
   public static final agg G = a("chests/buried_treasure");
   public static final agg H = a("chests/shipwreck_map");
   public static final agg I = a("chests/shipwreck_supply");
   public static final agg J = a("chests/shipwreck_treasure");
   public static final agg K = a("chests/pillager_outpost");
   public static final agg L = a("chests/bastion_treasure");
   public static final agg M = a("chests/bastion_other");
   public static final agg N = a("chests/bastion_bridge");
   public static final agg O = a("chests/bastion_hoglin_stable");
   public static final agg P = a("chests/ancient_city");
   public static final agg Q = a("chests/ancient_city_ice_box");
   public static final agg R = a("chests/ruined_portal");
   public static final agg S = a("entities/sheep/white");
   public static final agg T = a("entities/sheep/orange");
   public static final agg U = a("entities/sheep/magenta");
   public static final agg V = a("entities/sheep/light_blue");
   public static final agg W = a("entities/sheep/yellow");
   public static final agg X = a("entities/sheep/lime");
   public static final agg Y = a("entities/sheep/pink");
   public static final agg Z = a("entities/sheep/gray");
   public static final agg aa = a("entities/sheep/light_gray");
   public static final agg ab = a("entities/sheep/cyan");
   public static final agg ac = a("entities/sheep/purple");
   public static final agg ad = a("entities/sheep/blue");
   public static final agg ae = a("entities/sheep/brown");
   public static final agg af = a("entities/sheep/green");
   public static final agg ag = a("entities/sheep/red");
   public static final agg ah = a("entities/sheep/black");
   public static final agg ai = a("gameplay/fishing");
   public static final agg aj = a("gameplay/fishing/junk");
   public static final agg ak = a("gameplay/fishing/treasure");
   public static final agg al = a("gameplay/fishing/fish");
   public static final agg am = a("gameplay/cat_morning_gift");
   public static final agg an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final agg ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final agg ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final agg aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final agg ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final agg as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final agg at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final agg au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final agg av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final agg aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final agg ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final agg ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final agg az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final agg aA = a("gameplay/sniffer_digging");
   public static final agg aB = a("gameplay/piglin_bartering");
   public static final agg aC = a("archaeology/desert_well");
   public static final agg aD = a("archaeology/desert_pyramid");
   public static final agg aE = a("archaeology/trail_ruins_common");
   public static final agg aF = a("archaeology/trail_ruins_rare");
   public static final agg aG = a("archaeology/ocean_ruin_warm");
   public static final agg aH = a("archaeology/ocean_ruin_cold");

   private static agg a(String $$0) {
      return a(new agg($$0));
   }

   private static agg a(agg $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<agg> a() {
      return aJ;
   }
}
