import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fpb {
   private static final String cm = "main";
   private static final Set<fpa> cn = Sets.newHashSet();
   public static final fpa a = a("allay");
   public static final fpa b = a("armadillo");
   public static final fpa c = a("armor_stand");
   public static final fpa d = b("armor_stand");
   public static final fpa e = c("armor_stand");
   public static final fpa f = a("axolotl");
   public static final fpa g = a("banner");
   public static final fpa h = a("bat");
   public static final fpa i = a("bed_foot");
   public static final fpa j = a("bed_head");
   public static final fpa k = a("bee");
   public static final fpa l = a("bell");
   public static final fpa m = a("blaze");
   public static final fpa n = a("book");
   public static final fpa o = a("breeze");
   public static final fpa p = a("cat");
   public static final fpa q = a("cat", "collar");
   public static final fpa r = a("camel");
   public static final fpa s = a("cave_spider");
   public static final fpa t = a("chest");
   public static final fpa u = a("chest_minecart");
   public static final fpa v = a("chicken");
   public static final fpa w = a("cod");
   public static final fpa x = a("command_block_minecart");
   public static final fpa y = a("conduit", "cage");
   public static final fpa z = a("conduit", "eye");
   public static final fpa A = a("conduit", "shell");
   public static final fpa B = a("conduit", "wind");
   public static final fpa C = a("cow");
   public static final fpa D = a("creeper");
   public static final fpa E = a("creeper", "armor");
   public static final fpa F = a("creeper_head");
   public static final fpa G = a("decorated_pot_base");
   public static final fpa H = a("decorated_pot_sides");
   public static final fpa I = a("dolphin");
   public static final fpa J = a("donkey");
   public static final fpa K = a("double_chest_left");
   public static final fpa L = a("double_chest_right");
   public static final fpa M = a("dragon_skull");
   public static final fpa N = a("drowned");
   public static final fpa O = b("drowned");
   public static final fpa P = c("drowned");
   public static final fpa Q = a("drowned", "outer");
   public static final fpa R = a("elder_guardian");
   public static final fpa S = a("elytra");
   public static final fpa T = a("enderman");
   public static final fpa U = a("endermite");
   public static final fpa V = a("ender_dragon");
   public static final fpa W = a("end_crystal");
   public static final fpa X = a("evoker");
   public static final fpa Y = a("evoker_fangs");
   public static final fpa Z = a("fox");
   public static final fpa aa = a("frog");
   public static final fpa ab = a("furnace_minecart");
   public static final fpa ac = a("ghast");
   public static final fpa ad = a("giant");
   public static final fpa ae = b("giant");
   public static final fpa af = c("giant");
   public static final fpa ag = a("glow_squid");
   public static final fpa ah = a("goat");
   public static final fpa ai = a("guardian");
   public static final fpa aj = a("hoglin");
   public static final fpa ak = a("hopper_minecart");
   public static final fpa al = a("horse");
   public static final fpa am = a("horse_armor");
   public static final fpa an = a("husk");
   public static final fpa ao = b("husk");
   public static final fpa ap = c("husk");
   public static final fpa aq = a("illusioner");
   public static final fpa ar = a("iron_golem");
   public static final fpa as = a("leash_knot");
   public static final fpa at = a("llama");
   public static final fpa au = a("llama", "decor");
   public static final fpa av = a("llama_spit");
   public static final fpa aw = a("magma_cube");
   public static final fpa ax = a("minecart");
   public static final fpa ay = a("mooshroom");
   public static final fpa az = a("mule");
   public static final fpa aA = a("ocelot");
   public static final fpa aB = a("panda");
   public static final fpa aC = a("parrot");
   public static final fpa aD = a("phantom");
   public static final fpa aE = a("pig");
   public static final fpa aF = a("piglin");
   public static final fpa aG = a("piglin_brute");
   public static final fpa aH = b("piglin_brute");
   public static final fpa aI = c("piglin_brute");
   public static final fpa aJ = a("piglin_head");
   public static final fpa aK = b("piglin");
   public static final fpa aL = c("piglin");
   public static final fpa aM = a("pig", "saddle");
   public static final fpa aN = a("pillager");
   public static final fpa aO = a("player");
   public static final fpa aP = a("player_head");
   public static final fpa aQ = b("player");
   public static final fpa aR = c("player");
   public static final fpa aS = a("player_slim");
   public static final fpa aT = b("player_slim");
   public static final fpa aU = c("player_slim");
   public static final fpa aV = a("spin_attack");
   public static final fpa aW = a("polar_bear");
   public static final fpa aX = a("pufferfish_big");
   public static final fpa aY = a("pufferfish_medium");
   public static final fpa aZ = a("pufferfish_small");
   public static final fpa ba = a("rabbit");
   public static final fpa bb = a("ravager");
   public static final fpa bc = a("salmon");
   public static final fpa bd = a("sheep");
   public static final fpa be = a("sheep", "fur");
   public static final fpa bf = a("shield");
   public static final fpa bg = a("shulker");
   public static final fpa bh = a("shulker_bullet");
   public static final fpa bi = a("silverfish");
   public static final fpa bj = a("skeleton");
   public static final fpa bk = a("skeleton_horse");
   public static final fpa bl = b("skeleton");
   public static final fpa bm = c("skeleton");
   public static final fpa bn = a("skeleton_skull");
   public static final fpa bo = a("slime");
   public static final fpa bp = a("slime", "outer");
   public static final fpa bq = a("sniffer");
   public static final fpa br = a("snow_golem");
   public static final fpa bs = a("spawner_minecart");
   public static final fpa bt = a("spider");
   public static final fpa bu = a("squid");
   public static final fpa bv = a("stray");
   public static final fpa bw = b("stray");
   public static final fpa bx = c("stray");
   public static final fpa by = a("stray", "outer");
   public static final fpa bz = a("strider");
   public static final fpa bA = a("strider", "saddle");
   public static final fpa bB = a("tadpole");
   public static final fpa bC = a("tnt_minecart");
   public static final fpa bD = a("trader_llama");
   public static final fpa bE = a("trident");
   public static final fpa bF = a("tropical_fish_large");
   public static final fpa bG = a("tropical_fish_large", "pattern");
   public static final fpa bH = a("tropical_fish_small");
   public static final fpa bI = a("tropical_fish_small", "pattern");
   public static final fpa bJ = a("turtle");
   public static final fpa bK = a("vex");
   public static final fpa bL = a("villager");
   public static final fpa bM = a("vindicator");
   public static final fpa bN = a("warden");
   public static final fpa bO = a("wandering_trader");
   public static final fpa bP = a("wind_charge");
   public static final fpa bQ = a("witch");
   public static final fpa bR = a("wither");
   public static final fpa bS = a("wither", "armor");
   public static final fpa bT = a("wither_skeleton");
   public static final fpa bU = b("wither_skeleton");
   public static final fpa bV = c("wither_skeleton");
   public static final fpa bW = a("wither_skeleton_skull");
   public static final fpa bX = a("wither_skull");
   public static final fpa bY = a("wolf");
   public static final fpa bZ = a("wolf_armor");
   public static final fpa ca = a("zoglin");
   public static final fpa cb = a("zombie");
   public static final fpa cc = a("zombie_head");
   public static final fpa cd = a("zombie_horse");
   public static final fpa ce = b("zombie");
   public static final fpa cf = c("zombie");
   public static final fpa cg = a("zombie_villager");
   public static final fpa ch = b("zombie_villager");
   public static final fpa ci = c("zombie_villager");
   public static final fpa cj = a("zombified_piglin");
   public static final fpa ck = b("zombified_piglin");
   public static final fpa cl = c("zombified_piglin");

   private static fpa a(String $$0) {
      return a($$0, "main");
   }

   private static fpa a(String $$0, String $$1) {
      fpa $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fpa b(String $$0, String $$1) {
      return new fpa(new aiy("minecraft", $$0), $$1);
   }

   private static fpa b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fpa c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fpa a(cjc.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fpa b(cjc.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fpa c(cjc.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fpa d(cjc.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fpa a(dms $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fpa b(dms $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fpa> a() {
      return cn.stream();
   }
}
