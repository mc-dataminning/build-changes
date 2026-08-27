import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fpi {
   private static final String cm = "main";
   private static final Set<fph> cn = Sets.newHashSet();
   public static final fph a = a("allay");
   public static final fph b = a("armadillo");
   public static final fph c = a("armor_stand");
   public static final fph d = b("armor_stand");
   public static final fph e = c("armor_stand");
   public static final fph f = a("axolotl");
   public static final fph g = a("banner");
   public static final fph h = a("bat");
   public static final fph i = a("bed_foot");
   public static final fph j = a("bed_head");
   public static final fph k = a("bee");
   public static final fph l = a("bell");
   public static final fph m = a("blaze");
   public static final fph n = a("book");
   public static final fph o = a("breeze");
   public static final fph p = a("cat");
   public static final fph q = a("cat", "collar");
   public static final fph r = a("camel");
   public static final fph s = a("cave_spider");
   public static final fph t = a("chest");
   public static final fph u = a("chest_minecart");
   public static final fph v = a("chicken");
   public static final fph w = a("cod");
   public static final fph x = a("command_block_minecart");
   public static final fph y = a("conduit", "cage");
   public static final fph z = a("conduit", "eye");
   public static final fph A = a("conduit", "shell");
   public static final fph B = a("conduit", "wind");
   public static final fph C = a("cow");
   public static final fph D = a("creeper");
   public static final fph E = a("creeper", "armor");
   public static final fph F = a("creeper_head");
   public static final fph G = a("decorated_pot_base");
   public static final fph H = a("decorated_pot_sides");
   public static final fph I = a("dolphin");
   public static final fph J = a("donkey");
   public static final fph K = a("double_chest_left");
   public static final fph L = a("double_chest_right");
   public static final fph M = a("dragon_skull");
   public static final fph N = a("drowned");
   public static final fph O = b("drowned");
   public static final fph P = c("drowned");
   public static final fph Q = a("drowned", "outer");
   public static final fph R = a("elder_guardian");
   public static final fph S = a("elytra");
   public static final fph T = a("enderman");
   public static final fph U = a("endermite");
   public static final fph V = a("ender_dragon");
   public static final fph W = a("end_crystal");
   public static final fph X = a("evoker");
   public static final fph Y = a("evoker_fangs");
   public static final fph Z = a("fox");
   public static final fph aa = a("frog");
   public static final fph ab = a("furnace_minecart");
   public static final fph ac = a("ghast");
   public static final fph ad = a("giant");
   public static final fph ae = b("giant");
   public static final fph af = c("giant");
   public static final fph ag = a("glow_squid");
   public static final fph ah = a("goat");
   public static final fph ai = a("guardian");
   public static final fph aj = a("hoglin");
   public static final fph ak = a("hopper_minecart");
   public static final fph al = a("horse");
   public static final fph am = a("horse_armor");
   public static final fph an = a("husk");
   public static final fph ao = b("husk");
   public static final fph ap = c("husk");
   public static final fph aq = a("illusioner");
   public static final fph ar = a("iron_golem");
   public static final fph as = a("leash_knot");
   public static final fph at = a("llama");
   public static final fph au = a("llama", "decor");
   public static final fph av = a("llama_spit");
   public static final fph aw = a("magma_cube");
   public static final fph ax = a("minecart");
   public static final fph ay = a("mooshroom");
   public static final fph az = a("mule");
   public static final fph aA = a("ocelot");
   public static final fph aB = a("panda");
   public static final fph aC = a("parrot");
   public static final fph aD = a("phantom");
   public static final fph aE = a("pig");
   public static final fph aF = a("piglin");
   public static final fph aG = a("piglin_brute");
   public static final fph aH = b("piglin_brute");
   public static final fph aI = c("piglin_brute");
   public static final fph aJ = a("piglin_head");
   public static final fph aK = b("piglin");
   public static final fph aL = c("piglin");
   public static final fph aM = a("pig", "saddle");
   public static final fph aN = a("pillager");
   public static final fph aO = a("player");
   public static final fph aP = a("player_head");
   public static final fph aQ = b("player");
   public static final fph aR = c("player");
   public static final fph aS = a("player_slim");
   public static final fph aT = b("player_slim");
   public static final fph aU = c("player_slim");
   public static final fph aV = a("spin_attack");
   public static final fph aW = a("polar_bear");
   public static final fph aX = a("pufferfish_big");
   public static final fph aY = a("pufferfish_medium");
   public static final fph aZ = a("pufferfish_small");
   public static final fph ba = a("rabbit");
   public static final fph bb = a("ravager");
   public static final fph bc = a("salmon");
   public static final fph bd = a("sheep");
   public static final fph be = a("sheep", "fur");
   public static final fph bf = a("shield");
   public static final fph bg = a("shulker");
   public static final fph bh = a("shulker_bullet");
   public static final fph bi = a("silverfish");
   public static final fph bj = a("skeleton");
   public static final fph bk = a("skeleton_horse");
   public static final fph bl = b("skeleton");
   public static final fph bm = c("skeleton");
   public static final fph bn = a("skeleton_skull");
   public static final fph bo = a("slime");
   public static final fph bp = a("slime", "outer");
   public static final fph bq = a("sniffer");
   public static final fph br = a("snow_golem");
   public static final fph bs = a("spawner_minecart");
   public static final fph bt = a("spider");
   public static final fph bu = a("squid");
   public static final fph bv = a("stray");
   public static final fph bw = b("stray");
   public static final fph bx = c("stray");
   public static final fph by = a("stray", "outer");
   public static final fph bz = a("strider");
   public static final fph bA = a("strider", "saddle");
   public static final fph bB = a("tadpole");
   public static final fph bC = a("tnt_minecart");
   public static final fph bD = a("trader_llama");
   public static final fph bE = a("trident");
   public static final fph bF = a("tropical_fish_large");
   public static final fph bG = a("tropical_fish_large", "pattern");
   public static final fph bH = a("tropical_fish_small");
   public static final fph bI = a("tropical_fish_small", "pattern");
   public static final fph bJ = a("turtle");
   public static final fph bK = a("vex");
   public static final fph bL = a("villager");
   public static final fph bM = a("vindicator");
   public static final fph bN = a("warden");
   public static final fph bO = a("wandering_trader");
   public static final fph bP = a("wind_charge");
   public static final fph bQ = a("witch");
   public static final fph bR = a("wither");
   public static final fph bS = a("wither", "armor");
   public static final fph bT = a("wither_skeleton");
   public static final fph bU = b("wither_skeleton");
   public static final fph bV = c("wither_skeleton");
   public static final fph bW = a("wither_skeleton_skull");
   public static final fph bX = a("wither_skull");
   public static final fph bY = a("wolf");
   public static final fph bZ = a("wolf_armor");
   public static final fph ca = a("zoglin");
   public static final fph cb = a("zombie");
   public static final fph cc = a("zombie_head");
   public static final fph cd = a("zombie_horse");
   public static final fph ce = b("zombie");
   public static final fph cf = c("zombie");
   public static final fph cg = a("zombie_villager");
   public static final fph ch = b("zombie_villager");
   public static final fph ci = c("zombie_villager");
   public static final fph cj = a("zombified_piglin");
   public static final fph ck = b("zombified_piglin");
   public static final fph cl = c("zombified_piglin");

   private static fph a(String $$0) {
      return a($$0, "main");
   }

   private static fph a(String $$0, String $$1) {
      fph $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fph b(String $$0, String $$1) {
      return new fph(new aiy("minecraft", $$0), $$1);
   }

   private static fph b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fph c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fph a(cjg.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fph b(cjg.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fph c(cjg.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fph d(cjg.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fph a(dmw $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fph b(dmw $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fph> a() {
      return cn.stream();
   }
}
