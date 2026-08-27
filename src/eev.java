import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class eev {
   private static final Set<agi> aI = Sets.newHashSet();
   private static final Set<agi> aJ = Collections.unmodifiableSet(aI);
   public static final agi a = new agi("empty");
   public static final agi b = a("chests/spawn_bonus_chest");
   public static final agi c = a("chests/end_city_treasure");
   public static final agi d = a("chests/simple_dungeon");
   public static final agi e = a("chests/village/village_weaponsmith");
   public static final agi f = a("chests/village/village_toolsmith");
   public static final agi g = a("chests/village/village_armorer");
   public static final agi h = a("chests/village/village_cartographer");
   public static final agi i = a("chests/village/village_mason");
   public static final agi j = a("chests/village/village_shepherd");
   public static final agi k = a("chests/village/village_butcher");
   public static final agi l = a("chests/village/village_fletcher");
   public static final agi m = a("chests/village/village_fisher");
   public static final agi n = a("chests/village/village_tannery");
   public static final agi o = a("chests/village/village_temple");
   public static final agi p = a("chests/village/village_desert_house");
   public static final agi q = a("chests/village/village_plains_house");
   public static final agi r = a("chests/village/village_taiga_house");
   public static final agi s = a("chests/village/village_snowy_house");
   public static final agi t = a("chests/village/village_savanna_house");
   public static final agi u = a("chests/abandoned_mineshaft");
   public static final agi v = a("chests/nether_bridge");
   public static final agi w = a("chests/stronghold_library");
   public static final agi x = a("chests/stronghold_crossing");
   public static final agi y = a("chests/stronghold_corridor");
   public static final agi z = a("chests/desert_pyramid");
   public static final agi A = a("chests/jungle_temple");
   public static final agi B = a("chests/jungle_temple_dispenser");
   public static final agi C = a("chests/igloo_chest");
   public static final agi D = a("chests/woodland_mansion");
   public static final agi E = a("chests/underwater_ruin_small");
   public static final agi F = a("chests/underwater_ruin_big");
   public static final agi G = a("chests/buried_treasure");
   public static final agi H = a("chests/shipwreck_map");
   public static final agi I = a("chests/shipwreck_supply");
   public static final agi J = a("chests/shipwreck_treasure");
   public static final agi K = a("chests/pillager_outpost");
   public static final agi L = a("chests/bastion_treasure");
   public static final agi M = a("chests/bastion_other");
   public static final agi N = a("chests/bastion_bridge");
   public static final agi O = a("chests/bastion_hoglin_stable");
   public static final agi P = a("chests/ancient_city");
   public static final agi Q = a("chests/ancient_city_ice_box");
   public static final agi R = a("chests/ruined_portal");
   public static final agi S = a("entities/sheep/white");
   public static final agi T = a("entities/sheep/orange");
   public static final agi U = a("entities/sheep/magenta");
   public static final agi V = a("entities/sheep/light_blue");
   public static final agi W = a("entities/sheep/yellow");
   public static final agi X = a("entities/sheep/lime");
   public static final agi Y = a("entities/sheep/pink");
   public static final agi Z = a("entities/sheep/gray");
   public static final agi aa = a("entities/sheep/light_gray");
   public static final agi ab = a("entities/sheep/cyan");
   public static final agi ac = a("entities/sheep/purple");
   public static final agi ad = a("entities/sheep/blue");
   public static final agi ae = a("entities/sheep/brown");
   public static final agi af = a("entities/sheep/green");
   public static final agi ag = a("entities/sheep/red");
   public static final agi ah = a("entities/sheep/black");
   public static final agi ai = a("gameplay/fishing");
   public static final agi aj = a("gameplay/fishing/junk");
   public static final agi ak = a("gameplay/fishing/treasure");
   public static final agi al = a("gameplay/fishing/fish");
   public static final agi am = a("gameplay/cat_morning_gift");
   public static final agi an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final agi ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final agi ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final agi aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final agi ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final agi as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final agi at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final agi au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final agi av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final agi aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final agi ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final agi ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final agi az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final agi aA = a("gameplay/sniffer_digging");
   public static final agi aB = a("gameplay/piglin_bartering");
   public static final agi aC = a("archaeology/desert_well");
   public static final agi aD = a("archaeology/desert_pyramid");
   public static final agi aE = a("archaeology/trail_ruins_common");
   public static final agi aF = a("archaeology/trail_ruins_rare");
   public static final agi aG = a("archaeology/ocean_ruin_warm");
   public static final agi aH = a("archaeology/ocean_ruin_cold");

   private static agi a(String $$0) {
      return a(new agi($$0));
   }

   private static agi a(agi $$0) {
      if (aI.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<agi> a() {
      return aJ;
   }
}
