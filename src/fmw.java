import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fmw {
   private static final String cm = "main";
   private static final Set<fmv> cn = Sets.newHashSet();
   public static final fmv a = a("allay");
   public static final fmv b = a("armor_stand");
   public static final fmv c = b("armor_stand");
   public static final fmv d = c("armor_stand");
   public static final fmv e = a("axolotl");
   public static final fmv f = a("banner");
   public static final fmv g = a("bat");
   public static final fmv h = a("bed_foot");
   public static final fmv i = a("bed_head");
   public static final fmv j = a("bee");
   public static final fmv k = a("bell");
   public static final fmv l = a("blaze");
   public static final fmv m = a("book");
   public static final fmv n = a("breeze");
   public static final fmv o = a("breeze", "wind");
   public static final fmv p = a("breeze", "eyes");
   public static final fmv q = a("cat");
   public static final fmv r = a("cat", "collar");
   public static final fmv s = a("camel");
   public static final fmv t = a("cave_spider");
   public static final fmv u = a("chest");
   public static final fmv v = a("chest_minecart");
   public static final fmv w = a("chicken");
   public static final fmv x = a("cod");
   public static final fmv y = a("command_block_minecart");
   public static final fmv z = a("conduit", "cage");
   public static final fmv A = a("conduit", "eye");
   public static final fmv B = a("conduit", "shell");
   public static final fmv C = a("conduit", "wind");
   public static final fmv D = a("cow");
   public static final fmv E = a("creeper");
   public static final fmv F = a("creeper", "armor");
   public static final fmv G = a("creeper_head");
   public static final fmv H = a("decorated_pot_base");
   public static final fmv I = a("decorated_pot_sides");
   public static final fmv J = a("dolphin");
   public static final fmv K = a("donkey");
   public static final fmv L = a("double_chest_left");
   public static final fmv M = a("double_chest_right");
   public static final fmv N = a("dragon_skull");
   public static final fmv O = a("drowned");
   public static final fmv P = b("drowned");
   public static final fmv Q = c("drowned");
   public static final fmv R = a("drowned", "outer");
   public static final fmv S = a("elder_guardian");
   public static final fmv T = a("elytra");
   public static final fmv U = a("enderman");
   public static final fmv V = a("endermite");
   public static final fmv W = a("ender_dragon");
   public static final fmv X = a("end_crystal");
   public static final fmv Y = a("evoker");
   public static final fmv Z = a("evoker_fangs");
   public static final fmv aa = a("fox");
   public static final fmv ab = a("frog");
   public static final fmv ac = a("furnace_minecart");
   public static final fmv ad = a("ghast");
   public static final fmv ae = a("giant");
   public static final fmv af = b("giant");
   public static final fmv ag = c("giant");
   public static final fmv ah = a("glow_squid");
   public static final fmv ai = a("goat");
   public static final fmv aj = a("guardian");
   public static final fmv ak = a("hoglin");
   public static final fmv al = a("hopper_minecart");
   public static final fmv am = a("horse");
   public static final fmv an = a("horse_armor");
   public static final fmv ao = a("husk");
   public static final fmv ap = b("husk");
   public static final fmv aq = c("husk");
   public static final fmv ar = a("illusioner");
   public static final fmv as = a("iron_golem");
   public static final fmv at = a("leash_knot");
   public static final fmv au = a("llama");
   public static final fmv av = a("llama", "decor");
   public static final fmv aw = a("llama_spit");
   public static final fmv ax = a("magma_cube");
   public static final fmv ay = a("minecart");
   public static final fmv az = a("mooshroom");
   public static final fmv aA = a("mule");
   public static final fmv aB = a("ocelot");
   public static final fmv aC = a("panda");
   public static final fmv aD = a("parrot");
   public static final fmv aE = a("phantom");
   public static final fmv aF = a("pig");
   public static final fmv aG = a("piglin");
   public static final fmv aH = a("piglin_brute");
   public static final fmv aI = b("piglin_brute");
   public static final fmv aJ = c("piglin_brute");
   public static final fmv aK = a("piglin_head");
   public static final fmv aL = b("piglin");
   public static final fmv aM = c("piglin");
   public static final fmv aN = a("pig", "saddle");
   public static final fmv aO = a("pillager");
   public static final fmv aP = a("player");
   public static final fmv aQ = a("player_head");
   public static final fmv aR = b("player");
   public static final fmv aS = c("player");
   public static final fmv aT = a("player_slim");
   public static final fmv aU = b("player_slim");
   public static final fmv aV = c("player_slim");
   public static final fmv aW = a("spin_attack");
   public static final fmv aX = a("polar_bear");
   public static final fmv aY = a("pufferfish_big");
   public static final fmv aZ = a("pufferfish_medium");
   public static final fmv ba = a("pufferfish_small");
   public static final fmv bb = a("rabbit");
   public static final fmv bc = a("ravager");
   public static final fmv bd = a("salmon");
   public static final fmv be = a("sheep");
   public static final fmv bf = a("sheep", "fur");
   public static final fmv bg = a("shield");
   public static final fmv bh = a("shulker");
   public static final fmv bi = a("shulker_bullet");
   public static final fmv bj = a("silverfish");
   public static final fmv bk = a("skeleton");
   public static final fmv bl = a("skeleton_horse");
   public static final fmv bm = b("skeleton");
   public static final fmv bn = c("skeleton");
   public static final fmv bo = a("skeleton_skull");
   public static final fmv bp = a("slime");
   public static final fmv bq = a("slime", "outer");
   public static final fmv br = a("sniffer");
   public static final fmv bs = a("snow_golem");
   public static final fmv bt = a("spawner_minecart");
   public static final fmv bu = a("spider");
   public static final fmv bv = a("squid");
   public static final fmv bw = a("stray");
   public static final fmv bx = b("stray");
   public static final fmv by = c("stray");
   public static final fmv bz = a("stray", "outer");
   public static final fmv bA = a("strider");
   public static final fmv bB = a("strider", "saddle");
   public static final fmv bC = a("tadpole");
   public static final fmv bD = a("tnt_minecart");
   public static final fmv bE = a("trader_llama");
   public static final fmv bF = a("trident");
   public static final fmv bG = a("tropical_fish_large");
   public static final fmv bH = a("tropical_fish_large", "pattern");
   public static final fmv bI = a("tropical_fish_small");
   public static final fmv bJ = a("tropical_fish_small", "pattern");
   public static final fmv bK = a("turtle");
   public static final fmv bL = a("vex");
   public static final fmv bM = a("villager");
   public static final fmv bN = a("vindicator");
   public static final fmv bO = a("warden");
   public static final fmv bP = a("wandering_trader");
   public static final fmv bQ = a("wind_charge");
   public static final fmv bR = a("witch");
   public static final fmv bS = a("wither");
   public static final fmv bT = a("wither", "armor");
   public static final fmv bU = a("wither_skeleton");
   public static final fmv bV = b("wither_skeleton");
   public static final fmv bW = c("wither_skeleton");
   public static final fmv bX = a("wither_skeleton_skull");
   public static final fmv bY = a("wither_skull");
   public static final fmv bZ = a("wolf");
   public static final fmv ca = a("zoglin");
   public static final fmv cb = a("zombie");
   public static final fmv cc = a("zombie_head");
   public static final fmv cd = a("zombie_horse");
   public static final fmv ce = b("zombie");
   public static final fmv cf = c("zombie");
   public static final fmv cg = a("zombie_villager");
   public static final fmv ch = b("zombie_villager");
   public static final fmv ci = c("zombie_villager");
   public static final fmv cj = a("zombified_piglin");
   public static final fmv ck = b("zombified_piglin");
   public static final fmv cl = c("zombified_piglin");

   private static fmv a(String $$0) {
      return a($$0, "main");
   }

   private static fmv a(String $$0, String $$1) {
      fmv $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fmv b(String $$0, String $$1) {
      return new fmv(new ahg("minecraft", $$0), $$1);
   }

   private static fmv b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fmv c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fmv a(chc.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fmv b(chc.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fmv c(chc.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fmv d(chc.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fmv a(dku $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fmv b(dku $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fmv> a() {
      return cn.stream();
   }
}
