import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class eco {
   private static final Set<aew> aI = Sets.newHashSet();
   private static final Set<aew> aJ = Collections.unmodifiableSet(aI);
   public static final aew a = new aew("empty");
   public static final aew b = a("chests/spawn_bonus_chest");
   public static final aew c = a("chests/end_city_treasure");
   public static final aew d = a("chests/simple_dungeon");
   public static final aew e = a("chests/village/village_weaponsmith");
   public static final aew f = a("chests/village/village_toolsmith");
   public static final aew g = a("chests/village/village_armorer");
   public static final aew h = a("chests/village/village_cartographer");
   public static final aew i = a("chests/village/village_mason");
   public static final aew j = a("chests/village/village_shepherd");
   public static final aew k = a("chests/village/village_butcher");
   public static final aew l = a("chests/village/village_fletcher");
   public static final aew m = a("chests/village/village_fisher");
   public static final aew n = a("chests/village/village_tannery");
   public static final aew o = a("chests/village/village_temple");
   public static final aew p = a("chests/village/village_desert_house");
   public static final aew q = a("chests/village/village_plains_house");
   public static final aew r = a("chests/village/village_taiga_house");
   public static final aew s = a("chests/village/village_snowy_house");
   public static final aew t = a("chests/village/village_savanna_house");
   public static final aew u = a("chests/abandoned_mineshaft");
   public static final aew v = a("chests/nether_bridge");
   public static final aew w = a("chests/stronghold_library");
   public static final aew x = a("chests/stronghold_crossing");
   public static final aew y = a("chests/stronghold_corridor");
   public static final aew z = a("chests/desert_pyramid");
   public static final aew A = a("chests/jungle_temple");
   public static final aew B = a("chests/jungle_temple_dispenser");
   public static final aew C = a("chests/igloo_chest");
   public static final aew D = a("chests/woodland_mansion");
   public static final aew E = a("chests/underwater_ruin_small");
   public static final aew F = a("chests/underwater_ruin_big");
   public static final aew G = a("chests/buried_treasure");
   public static final aew H = a("chests/shipwreck_map");
   public static final aew I = a("chests/shipwreck_supply");
   public static final aew J = a("chests/shipwreck_treasure");
   public static final aew K = a("chests/pillager_outpost");
   public static final aew L = a("chests/bastion_treasure");
   public static final aew M = a("chests/bastion_other");
   public static final aew N = a("chests/bastion_bridge");
   public static final aew O = a("chests/bastion_hoglin_stable");
   public static final aew P = a("chests/ancient_city");
   public static final aew Q = a("chests/ancient_city_ice_box");
   public static final aew R = a("chests/ruined_portal");
   public static final aew S = a("entities/sheep/white");
   public static final aew T = a("entities/sheep/orange");
   public static final aew U = a("entities/sheep/magenta");
   public static final aew V = a("entities/sheep/light_blue");
   public static final aew W = a("entities/sheep/yellow");
   public static final aew X = a("entities/sheep/lime");
   public static final aew Y = a("entities/sheep/pink");
   public static final aew Z = a("entities/sheep/gray");
   public static final aew aa = a("entities/sheep/light_gray");
   public static final aew ab = a("entities/sheep/cyan");
   public static final aew ac = a("entities/sheep/purple");
   public static final aew ad = a("entities/sheep/blue");
   public static final aew ae = a("entities/sheep/brown");
   public static final aew af = a("entities/sheep/green");
   public static final aew ag = a("entities/sheep/red");
   public static final aew ah = a("entities/sheep/black");
   public static final aew ai = a("gameplay/fishing");
   public static final aew aj = a("gameplay/fishing/junk");
   public static final aew ak = a("gameplay/fishing/treasure");
   public static final aew al = a("gameplay/fishing/fish");
   public static final aew am = a("gameplay/cat_morning_gift");
   public static final aew an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aew ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aew ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aew aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aew ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aew as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aew at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aew au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aew av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aew aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aew ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aew ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aew az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aew aA = a("gameplay/sniffer_digging");
   public static final aew aB = a("gameplay/piglin_bartering");
   public static final aew aC = a("archaeology/desert_well");
   public static final aew aD = a("archaeology/desert_pyramid");
   public static final aew aE = a("archaeology/trail_ruins_common");
   public static final aew aF = a("archaeology/trail_ruins_rare");
   public static final aew aG = a("archaeology/ocean_ruin_warm");
   public static final aew aH = a("archaeology/ocean_ruin_cold");

   private static aew a(String $$0) {
      return a(new aew($$0));
   }

   private static aew a(aew $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aew> a() {
      return aJ;
   }
}
