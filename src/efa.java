import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class efa {
   private static final Set<agm> aI = Sets.newHashSet();
   private static final Set<agm> aJ = Collections.unmodifiableSet(aI);
   public static final agm a = new agm("empty");
   public static final agm b = a("chests/spawn_bonus_chest");
   public static final agm c = a("chests/end_city_treasure");
   public static final agm d = a("chests/simple_dungeon");
   public static final agm e = a("chests/village/village_weaponsmith");
   public static final agm f = a("chests/village/village_toolsmith");
   public static final agm g = a("chests/village/village_armorer");
   public static final agm h = a("chests/village/village_cartographer");
   public static final agm i = a("chests/village/village_mason");
   public static final agm j = a("chests/village/village_shepherd");
   public static final agm k = a("chests/village/village_butcher");
   public static final agm l = a("chests/village/village_fletcher");
   public static final agm m = a("chests/village/village_fisher");
   public static final agm n = a("chests/village/village_tannery");
   public static final agm o = a("chests/village/village_temple");
   public static final agm p = a("chests/village/village_desert_house");
   public static final agm q = a("chests/village/village_plains_house");
   public static final agm r = a("chests/village/village_taiga_house");
   public static final agm s = a("chests/village/village_snowy_house");
   public static final agm t = a("chests/village/village_savanna_house");
   public static final agm u = a("chests/abandoned_mineshaft");
   public static final agm v = a("chests/nether_bridge");
   public static final agm w = a("chests/stronghold_library");
   public static final agm x = a("chests/stronghold_crossing");
   public static final agm y = a("chests/stronghold_corridor");
   public static final agm z = a("chests/desert_pyramid");
   public static final agm A = a("chests/jungle_temple");
   public static final agm B = a("chests/jungle_temple_dispenser");
   public static final agm C = a("chests/igloo_chest");
   public static final agm D = a("chests/woodland_mansion");
   public static final agm E = a("chests/underwater_ruin_small");
   public static final agm F = a("chests/underwater_ruin_big");
   public static final agm G = a("chests/buried_treasure");
   public static final agm H = a("chests/shipwreck_map");
   public static final agm I = a("chests/shipwreck_supply");
   public static final agm J = a("chests/shipwreck_treasure");
   public static final agm K = a("chests/pillager_outpost");
   public static final agm L = a("chests/bastion_treasure");
   public static final agm M = a("chests/bastion_other");
   public static final agm N = a("chests/bastion_bridge");
   public static final agm O = a("chests/bastion_hoglin_stable");
   public static final agm P = a("chests/ancient_city");
   public static final agm Q = a("chests/ancient_city_ice_box");
   public static final agm R = a("chests/ruined_portal");
   public static final agm S = a("entities/sheep/white");
   public static final agm T = a("entities/sheep/orange");
   public static final agm U = a("entities/sheep/magenta");
   public static final agm V = a("entities/sheep/light_blue");
   public static final agm W = a("entities/sheep/yellow");
   public static final agm X = a("entities/sheep/lime");
   public static final agm Y = a("entities/sheep/pink");
   public static final agm Z = a("entities/sheep/gray");
   public static final agm aa = a("entities/sheep/light_gray");
   public static final agm ab = a("entities/sheep/cyan");
   public static final agm ac = a("entities/sheep/purple");
   public static final agm ad = a("entities/sheep/blue");
   public static final agm ae = a("entities/sheep/brown");
   public static final agm af = a("entities/sheep/green");
   public static final agm ag = a("entities/sheep/red");
   public static final agm ah = a("entities/sheep/black");
   public static final agm ai = a("gameplay/fishing");
   public static final agm aj = a("gameplay/fishing/junk");
   public static final agm ak = a("gameplay/fishing/treasure");
   public static final agm al = a("gameplay/fishing/fish");
   public static final agm am = a("gameplay/cat_morning_gift");
   public static final agm an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final agm ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final agm ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final agm aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final agm ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final agm as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final agm at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final agm au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final agm av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final agm aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final agm ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final agm ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final agm az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final agm aA = a("gameplay/sniffer_digging");
   public static final agm aB = a("gameplay/piglin_bartering");
   public static final agm aC = a("archaeology/desert_well");
   public static final agm aD = a("archaeology/desert_pyramid");
   public static final agm aE = a("archaeology/trail_ruins_common");
   public static final agm aF = a("archaeology/trail_ruins_rare");
   public static final agm aG = a("archaeology/ocean_ruin_warm");
   public static final agm aH = a("archaeology/ocean_ruin_cold");

   private static agm a(String $$0) {
      return a(new agm($$0));
   }

   private static agm a(agm $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<agm> a() {
      return aJ;
   }
}
