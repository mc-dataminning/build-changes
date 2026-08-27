import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class ecj {
   private static final Set<aeu> aI = Sets.newHashSet();
   private static final Set<aeu> aJ = Collections.unmodifiableSet(aI);
   public static final aeu a = new aeu("empty");
   public static final aeu b = a("chests/spawn_bonus_chest");
   public static final aeu c = a("chests/end_city_treasure");
   public static final aeu d = a("chests/simple_dungeon");
   public static final aeu e = a("chests/village/village_weaponsmith");
   public static final aeu f = a("chests/village/village_toolsmith");
   public static final aeu g = a("chests/village/village_armorer");
   public static final aeu h = a("chests/village/village_cartographer");
   public static final aeu i = a("chests/village/village_mason");
   public static final aeu j = a("chests/village/village_shepherd");
   public static final aeu k = a("chests/village/village_butcher");
   public static final aeu l = a("chests/village/village_fletcher");
   public static final aeu m = a("chests/village/village_fisher");
   public static final aeu n = a("chests/village/village_tannery");
   public static final aeu o = a("chests/village/village_temple");
   public static final aeu p = a("chests/village/village_desert_house");
   public static final aeu q = a("chests/village/village_plains_house");
   public static final aeu r = a("chests/village/village_taiga_house");
   public static final aeu s = a("chests/village/village_snowy_house");
   public static final aeu t = a("chests/village/village_savanna_house");
   public static final aeu u = a("chests/abandoned_mineshaft");
   public static final aeu v = a("chests/nether_bridge");
   public static final aeu w = a("chests/stronghold_library");
   public static final aeu x = a("chests/stronghold_crossing");
   public static final aeu y = a("chests/stronghold_corridor");
   public static final aeu z = a("chests/desert_pyramid");
   public static final aeu A = a("chests/jungle_temple");
   public static final aeu B = a("chests/jungle_temple_dispenser");
   public static final aeu C = a("chests/igloo_chest");
   public static final aeu D = a("chests/woodland_mansion");
   public static final aeu E = a("chests/underwater_ruin_small");
   public static final aeu F = a("chests/underwater_ruin_big");
   public static final aeu G = a("chests/buried_treasure");
   public static final aeu H = a("chests/shipwreck_map");
   public static final aeu I = a("chests/shipwreck_supply");
   public static final aeu J = a("chests/shipwreck_treasure");
   public static final aeu K = a("chests/pillager_outpost");
   public static final aeu L = a("chests/bastion_treasure");
   public static final aeu M = a("chests/bastion_other");
   public static final aeu N = a("chests/bastion_bridge");
   public static final aeu O = a("chests/bastion_hoglin_stable");
   public static final aeu P = a("chests/ancient_city");
   public static final aeu Q = a("chests/ancient_city_ice_box");
   public static final aeu R = a("chests/ruined_portal");
   public static final aeu S = a("entities/sheep/white");
   public static final aeu T = a("entities/sheep/orange");
   public static final aeu U = a("entities/sheep/magenta");
   public static final aeu V = a("entities/sheep/light_blue");
   public static final aeu W = a("entities/sheep/yellow");
   public static final aeu X = a("entities/sheep/lime");
   public static final aeu Y = a("entities/sheep/pink");
   public static final aeu Z = a("entities/sheep/gray");
   public static final aeu aa = a("entities/sheep/light_gray");
   public static final aeu ab = a("entities/sheep/cyan");
   public static final aeu ac = a("entities/sheep/purple");
   public static final aeu ad = a("entities/sheep/blue");
   public static final aeu ae = a("entities/sheep/brown");
   public static final aeu af = a("entities/sheep/green");
   public static final aeu ag = a("entities/sheep/red");
   public static final aeu ah = a("entities/sheep/black");
   public static final aeu ai = a("gameplay/fishing");
   public static final aeu aj = a("gameplay/fishing/junk");
   public static final aeu ak = a("gameplay/fishing/treasure");
   public static final aeu al = a("gameplay/fishing/fish");
   public static final aeu am = a("gameplay/cat_morning_gift");
   public static final aeu an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final aeu ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final aeu ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final aeu aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final aeu ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final aeu as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final aeu at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final aeu au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final aeu av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final aeu aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final aeu ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final aeu ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final aeu az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final aeu aA = a("gameplay/sniffer_digging");
   public static final aeu aB = a("gameplay/piglin_bartering");
   public static final aeu aC = a("archaeology/desert_well");
   public static final aeu aD = a("archaeology/desert_pyramid");
   public static final aeu aE = a("archaeology/trail_ruins_common");
   public static final aeu aF = a("archaeology/trail_ruins_rare");
   public static final aeu aG = a("archaeology/ocean_ruin_warm");
   public static final aeu aH = a("archaeology/ocean_ruin_cold");

   private static aeu a(String $$0) {
      return a(new aeu($$0));
   }

   private static aeu a(aeu $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<aeu> a() {
      return aJ;
   }
}
