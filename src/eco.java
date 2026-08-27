import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class eco {
   private static final Set<aex> aI = Sets.newHashSet();
   private static final Set<aex> aJ = Collections.unmodifiableSet(aI);
   public static final aex a = new aex("empty");
   public static final aex b = a("chests/spawn_bonus_chest");
   public static final aex c = a("chests/end_city_treasure");
   public static final aex d = a("chests/simple_dungeon");
   public static final aex e = a("chests/village/village_weaponsmith");
   public static final aex f = a("chests/village/village_toolsmith");
   public static final aex g = a("chests/village/village_armorer");
   public static final aex h = a("chests/village/village_cartographer");
   public static final aex i = a("chests/village/village_mason");
   public static final aex j = a("chests/village/village_shepherd");
   public static final aex k = a("chests/village/village_butcher");
   public static final aex l = a("chests/village/village_fletcher");
   public static final aex m = a("chests/village/village_fisher");
   public static final aex n = a("chests/village/village_tannery");
   public static final aex o = a("chests/village/village_temple");
   public static final aex p = a("chests/village/village_desert_house");
   public static final aex q = a("chests/village/village_plains_house");
   public static final aex r = a("chests/village/village_taiga_house");
   public static final aex s = a("chests/village/village_snowy_house");
   public static final aex t = a("chests/village/village_savanna_house");
   public static final aex u = a("chests/abandoned_mineshaft");
   public static final aex v = a("chests/nether_bridge");
   public static final aex w = a("chests/stronghold_library");
   public static final aex x = a("chests/stronghold_crossing");
   public static final aex y = a("chests/stronghold_corridor");
   public static final aex z = a("chests/desert_pyramid");
   public static final aex A = a("chests/jungle_temple");
   public static final aex B = a("chests/jungle_temple_dispenser");
   public static final aex C = a("chests/igloo_chest");
   public static final aex D = a("chests/woodland_mansion");
   public static final aex E = a("chests/underwater_ruin_small");
   public static final aex F = a("chests/underwater_ruin_big");
   public static final aex G = a("chests/buried_treasure");
   public static final aex H = a("chests/shipwreck_map");
   public static final aex I = a("chests/shipwreck_supply");
   public static final aex J = a("chests/shipwreck_treasure");
   public static final aex K = a("chests/pillager_outpost");
   public static final aex L = a("chests/bastion_treasure");
   public static final aex M = a("chests/bastion_other");
   public static final aex N = a("chests/bastion_bridge");
   public static final aex O = a("chests/bastion_hoglin_stable");
   public static final aex P = a("chests/ancient_city");
   public static final aex Q = a("chests/ancient_city_ice_box");
   public static final aex R = a("chests/ruined_portal");
   public static final aex S = a("entities/sheep/white");
   public static final aex T = a("entities/sheep/orange");
   public static final aex U = a("entities/sheep/magenta");
   public static final aex V = a("entities/sheep/light_blue");
   public static final aex W = a("entities/sheep/yellow");
   public static final aex X = a("entities/sheep/lime");
   public static final aex Y = a("entities/sheep/pink");
   public static final aex Z = a("entities/sheep/gray");
   public static final aex aa = a("entities/sheep/light_gray");
   public static final aex ab = a("entities/sheep/cyan");
   public static final aex ac = a("entities/sheep/purple");
   public static final aex ad = a("entities/sheep/blue");
   public static final aex ae = a("entities/sheep/brown");
   public static final aex af = a("entities/sheep/green");
   public static final aex ag = a("entities/sheep/red");
   public static final aex ah = a("entities/sheep/black");
   public static final aex ai = a("gameplay/fishing");
   public static final aex aj = a("gameplay/fishing/junk");
   public static final aex ak = a("gameplay/fishing/treasure");
   public static final aex al = a("gameplay/fishing/fish");
   public static final aex am = a("gameplay/cat_morning_gift");
   public static final aex an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aex ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aex ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aex aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aex ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aex as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aex at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aex au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aex av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aex aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aex ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aex ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aex az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aex aA = a("gameplay/sniffer_digging");
   public static final aex aB = a("gameplay/piglin_bartering");
   public static final aex aC = a("archaeology/desert_well");
   public static final aex aD = a("archaeology/desert_pyramid");
   public static final aex aE = a("archaeology/trail_ruins_common");
   public static final aex aF = a("archaeology/trail_ruins_rare");
   public static final aex aG = a("archaeology/ocean_ruin_warm");
   public static final aex aH = a("archaeology/ocean_ruin_cold");

   private static aex a(String $$0) {
      return a(new aex($$0));
   }

   private static aex a(aex $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aex> a() {
      return aJ;
   }
}
