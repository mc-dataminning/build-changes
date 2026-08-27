import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fmo {
   private static final String cm = "main";
   private static final Set<fmn> cn = Sets.newHashSet();
   public static final fmn a = a("allay");
   public static final fmn b = a("armor_stand");
   public static final fmn c = b("armor_stand");
   public static final fmn d = c("armor_stand");
   public static final fmn e = a("axolotl");
   public static final fmn f = a("banner");
   public static final fmn g = a("bat");
   public static final fmn h = a("bed_foot");
   public static final fmn i = a("bed_head");
   public static final fmn j = a("bee");
   public static final fmn k = a("bell");
   public static final fmn l = a("blaze");
   public static final fmn m = a("book");
   public static final fmn n = a("breeze");
   public static final fmn o = a("breeze", "wind");
   public static final fmn p = a("breeze", "eyes");
   public static final fmn q = a("cat");
   public static final fmn r = a("cat", "collar");
   public static final fmn s = a("camel");
   public static final fmn t = a("cave_spider");
   public static final fmn u = a("chest");
   public static final fmn v = a("chest_minecart");
   public static final fmn w = a("chicken");
   public static final fmn x = a("cod");
   public static final fmn y = a("command_block_minecart");
   public static final fmn z = a("conduit", "cage");
   public static final fmn A = a("conduit", "eye");
   public static final fmn B = a("conduit", "shell");
   public static final fmn C = a("conduit", "wind");
   public static final fmn D = a("cow");
   public static final fmn E = a("creeper");
   public static final fmn F = a("creeper", "armor");
   public static final fmn G = a("creeper_head");
   public static final fmn H = a("decorated_pot_base");
   public static final fmn I = a("decorated_pot_sides");
   public static final fmn J = a("dolphin");
   public static final fmn K = a("donkey");
   public static final fmn L = a("double_chest_left");
   public static final fmn M = a("double_chest_right");
   public static final fmn N = a("dragon_skull");
   public static final fmn O = a("drowned");
   public static final fmn P = b("drowned");
   public static final fmn Q = c("drowned");
   public static final fmn R = a("drowned", "outer");
   public static final fmn S = a("elder_guardian");
   public static final fmn T = a("elytra");
   public static final fmn U = a("enderman");
   public static final fmn V = a("endermite");
   public static final fmn W = a("ender_dragon");
   public static final fmn X = a("end_crystal");
   public static final fmn Y = a("evoker");
   public static final fmn Z = a("evoker_fangs");
   public static final fmn aa = a("fox");
   public static final fmn ab = a("frog");
   public static final fmn ac = a("furnace_minecart");
   public static final fmn ad = a("ghast");
   public static final fmn ae = a("giant");
   public static final fmn af = b("giant");
   public static final fmn ag = c("giant");
   public static final fmn ah = a("glow_squid");
   public static final fmn ai = a("goat");
   public static final fmn aj = a("guardian");
   public static final fmn ak = a("hoglin");
   public static final fmn al = a("hopper_minecart");
   public static final fmn am = a("horse");
   public static final fmn an = a("horse_armor");
   public static final fmn ao = a("husk");
   public static final fmn ap = b("husk");
   public static final fmn aq = c("husk");
   public static final fmn ar = a("illusioner");
   public static final fmn as = a("iron_golem");
   public static final fmn at = a("leash_knot");
   public static final fmn au = a("llama");
   public static final fmn av = a("llama", "decor");
   public static final fmn aw = a("llama_spit");
   public static final fmn ax = a("magma_cube");
   public static final fmn ay = a("minecart");
   public static final fmn az = a("mooshroom");
   public static final fmn aA = a("mule");
   public static final fmn aB = a("ocelot");
   public static final fmn aC = a("panda");
   public static final fmn aD = a("parrot");
   public static final fmn aE = a("phantom");
   public static final fmn aF = a("pig");
   public static final fmn aG = a("piglin");
   public static final fmn aH = a("piglin_brute");
   public static final fmn aI = b("piglin_brute");
   public static final fmn aJ = c("piglin_brute");
   public static final fmn aK = a("piglin_head");
   public static final fmn aL = b("piglin");
   public static final fmn aM = c("piglin");
   public static final fmn aN = a("pig", "saddle");
   public static final fmn aO = a("pillager");
   public static final fmn aP = a("player");
   public static final fmn aQ = a("player_head");
   public static final fmn aR = b("player");
   public static final fmn aS = c("player");
   public static final fmn aT = a("player_slim");
   public static final fmn aU = b("player_slim");
   public static final fmn aV = c("player_slim");
   public static final fmn aW = a("spin_attack");
   public static final fmn aX = a("polar_bear");
   public static final fmn aY = a("pufferfish_big");
   public static final fmn aZ = a("pufferfish_medium");
   public static final fmn ba = a("pufferfish_small");
   public static final fmn bb = a("rabbit");
   public static final fmn bc = a("ravager");
   public static final fmn bd = a("salmon");
   public static final fmn be = a("sheep");
   public static final fmn bf = a("sheep", "fur");
   public static final fmn bg = a("shield");
   public static final fmn bh = a("shulker");
   public static final fmn bi = a("shulker_bullet");
   public static final fmn bj = a("silverfish");
   public static final fmn bk = a("skeleton");
   public static final fmn bl = a("skeleton_horse");
   public static final fmn bm = b("skeleton");
   public static final fmn bn = c("skeleton");
   public static final fmn bo = a("skeleton_skull");
   public static final fmn bp = a("slime");
   public static final fmn bq = a("slime", "outer");
   public static final fmn br = a("sniffer");
   public static final fmn bs = a("snow_golem");
   public static final fmn bt = a("spawner_minecart");
   public static final fmn bu = a("spider");
   public static final fmn bv = a("squid");
   public static final fmn bw = a("stray");
   public static final fmn bx = b("stray");
   public static final fmn by = c("stray");
   public static final fmn bz = a("stray", "outer");
   public static final fmn bA = a("strider");
   public static final fmn bB = a("strider", "saddle");
   public static final fmn bC = a("tadpole");
   public static final fmn bD = a("tnt_minecart");
   public static final fmn bE = a("trader_llama");
   public static final fmn bF = a("trident");
   public static final fmn bG = a("tropical_fish_large");
   public static final fmn bH = a("tropical_fish_large", "pattern");
   public static final fmn bI = a("tropical_fish_small");
   public static final fmn bJ = a("tropical_fish_small", "pattern");
   public static final fmn bK = a("turtle");
   public static final fmn bL = a("vex");
   public static final fmn bM = a("villager");
   public static final fmn bN = a("vindicator");
   public static final fmn bO = a("warden");
   public static final fmn bP = a("wandering_trader");
   public static final fmn bQ = a("wind_charge");
   public static final fmn bR = a("witch");
   public static final fmn bS = a("wither");
   public static final fmn bT = a("wither", "armor");
   public static final fmn bU = a("wither_skeleton");
   public static final fmn bV = b("wither_skeleton");
   public static final fmn bW = c("wither_skeleton");
   public static final fmn bX = a("wither_skeleton_skull");
   public static final fmn bY = a("wither_skull");
   public static final fmn bZ = a("wolf");
   public static final fmn ca = a("zoglin");
   public static final fmn cb = a("zombie");
   public static final fmn cc = a("zombie_head");
   public static final fmn cd = a("zombie_horse");
   public static final fmn ce = b("zombie");
   public static final fmn cf = c("zombie");
   public static final fmn cg = a("zombie_villager");
   public static final fmn ch = b("zombie_villager");
   public static final fmn ci = c("zombie_villager");
   public static final fmn cj = a("zombified_piglin");
   public static final fmn ck = b("zombified_piglin");
   public static final fmn cl = c("zombified_piglin");

   private static fmn a(String $$0) {
      return a($$0, "main");
   }

   private static fmn a(String $$0, String $$1) {
      fmn $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fmn b(String $$0, String $$1) {
      return new fmn(new ahd("minecraft", $$0), $$1);
   }

   private static fmn b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fmn c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fmn a(cgv.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fmn b(cgv.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fmn c(cgv.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fmn d(cgv.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fmn a(dkn $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fmn b(dkn $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fmn> a() {
      return cn.stream();
   }
}
