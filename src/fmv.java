import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fmv {
   private static final String cm = "main";
   private static final Set<fmu> cn = Sets.newHashSet();
   public static final fmu a = a("allay");
   public static final fmu b = a("armor_stand");
   public static final fmu c = b("armor_stand");
   public static final fmu d = c("armor_stand");
   public static final fmu e = a("axolotl");
   public static final fmu f = a("banner");
   public static final fmu g = a("bat");
   public static final fmu h = a("bed_foot");
   public static final fmu i = a("bed_head");
   public static final fmu j = a("bee");
   public static final fmu k = a("bell");
   public static final fmu l = a("blaze");
   public static final fmu m = a("book");
   public static final fmu n = a("breeze");
   public static final fmu o = a("breeze", "wind");
   public static final fmu p = a("breeze", "eyes");
   public static final fmu q = a("cat");
   public static final fmu r = a("cat", "collar");
   public static final fmu s = a("camel");
   public static final fmu t = a("cave_spider");
   public static final fmu u = a("chest");
   public static final fmu v = a("chest_minecart");
   public static final fmu w = a("chicken");
   public static final fmu x = a("cod");
   public static final fmu y = a("command_block_minecart");
   public static final fmu z = a("conduit", "cage");
   public static final fmu A = a("conduit", "eye");
   public static final fmu B = a("conduit", "shell");
   public static final fmu C = a("conduit", "wind");
   public static final fmu D = a("cow");
   public static final fmu E = a("creeper");
   public static final fmu F = a("creeper", "armor");
   public static final fmu G = a("creeper_head");
   public static final fmu H = a("decorated_pot_base");
   public static final fmu I = a("decorated_pot_sides");
   public static final fmu J = a("dolphin");
   public static final fmu K = a("donkey");
   public static final fmu L = a("double_chest_left");
   public static final fmu M = a("double_chest_right");
   public static final fmu N = a("dragon_skull");
   public static final fmu O = a("drowned");
   public static final fmu P = b("drowned");
   public static final fmu Q = c("drowned");
   public static final fmu R = a("drowned", "outer");
   public static final fmu S = a("elder_guardian");
   public static final fmu T = a("elytra");
   public static final fmu U = a("enderman");
   public static final fmu V = a("endermite");
   public static final fmu W = a("ender_dragon");
   public static final fmu X = a("end_crystal");
   public static final fmu Y = a("evoker");
   public static final fmu Z = a("evoker_fangs");
   public static final fmu aa = a("fox");
   public static final fmu ab = a("frog");
   public static final fmu ac = a("furnace_minecart");
   public static final fmu ad = a("ghast");
   public static final fmu ae = a("giant");
   public static final fmu af = b("giant");
   public static final fmu ag = c("giant");
   public static final fmu ah = a("glow_squid");
   public static final fmu ai = a("goat");
   public static final fmu aj = a("guardian");
   public static final fmu ak = a("hoglin");
   public static final fmu al = a("hopper_minecart");
   public static final fmu am = a("horse");
   public static final fmu an = a("horse_armor");
   public static final fmu ao = a("husk");
   public static final fmu ap = b("husk");
   public static final fmu aq = c("husk");
   public static final fmu ar = a("illusioner");
   public static final fmu as = a("iron_golem");
   public static final fmu at = a("leash_knot");
   public static final fmu au = a("llama");
   public static final fmu av = a("llama", "decor");
   public static final fmu aw = a("llama_spit");
   public static final fmu ax = a("magma_cube");
   public static final fmu ay = a("minecart");
   public static final fmu az = a("mooshroom");
   public static final fmu aA = a("mule");
   public static final fmu aB = a("ocelot");
   public static final fmu aC = a("panda");
   public static final fmu aD = a("parrot");
   public static final fmu aE = a("phantom");
   public static final fmu aF = a("pig");
   public static final fmu aG = a("piglin");
   public static final fmu aH = a("piglin_brute");
   public static final fmu aI = b("piglin_brute");
   public static final fmu aJ = c("piglin_brute");
   public static final fmu aK = a("piglin_head");
   public static final fmu aL = b("piglin");
   public static final fmu aM = c("piglin");
   public static final fmu aN = a("pig", "saddle");
   public static final fmu aO = a("pillager");
   public static final fmu aP = a("player");
   public static final fmu aQ = a("player_head");
   public static final fmu aR = b("player");
   public static final fmu aS = c("player");
   public static final fmu aT = a("player_slim");
   public static final fmu aU = b("player_slim");
   public static final fmu aV = c("player_slim");
   public static final fmu aW = a("spin_attack");
   public static final fmu aX = a("polar_bear");
   public static final fmu aY = a("pufferfish_big");
   public static final fmu aZ = a("pufferfish_medium");
   public static final fmu ba = a("pufferfish_small");
   public static final fmu bb = a("rabbit");
   public static final fmu bc = a("ravager");
   public static final fmu bd = a("salmon");
   public static final fmu be = a("sheep");
   public static final fmu bf = a("sheep", "fur");
   public static final fmu bg = a("shield");
   public static final fmu bh = a("shulker");
   public static final fmu bi = a("shulker_bullet");
   public static final fmu bj = a("silverfish");
   public static final fmu bk = a("skeleton");
   public static final fmu bl = a("skeleton_horse");
   public static final fmu bm = b("skeleton");
   public static final fmu bn = c("skeleton");
   public static final fmu bo = a("skeleton_skull");
   public static final fmu bp = a("slime");
   public static final fmu bq = a("slime", "outer");
   public static final fmu br = a("sniffer");
   public static final fmu bs = a("snow_golem");
   public static final fmu bt = a("spawner_minecart");
   public static final fmu bu = a("spider");
   public static final fmu bv = a("squid");
   public static final fmu bw = a("stray");
   public static final fmu bx = b("stray");
   public static final fmu by = c("stray");
   public static final fmu bz = a("stray", "outer");
   public static final fmu bA = a("strider");
   public static final fmu bB = a("strider", "saddle");
   public static final fmu bC = a("tadpole");
   public static final fmu bD = a("tnt_minecart");
   public static final fmu bE = a("trader_llama");
   public static final fmu bF = a("trident");
   public static final fmu bG = a("tropical_fish_large");
   public static final fmu bH = a("tropical_fish_large", "pattern");
   public static final fmu bI = a("tropical_fish_small");
   public static final fmu bJ = a("tropical_fish_small", "pattern");
   public static final fmu bK = a("turtle");
   public static final fmu bL = a("vex");
   public static final fmu bM = a("villager");
   public static final fmu bN = a("vindicator");
   public static final fmu bO = a("warden");
   public static final fmu bP = a("wandering_trader");
   public static final fmu bQ = a("wind_charge");
   public static final fmu bR = a("witch");
   public static final fmu bS = a("wither");
   public static final fmu bT = a("wither", "armor");
   public static final fmu bU = a("wither_skeleton");
   public static final fmu bV = b("wither_skeleton");
   public static final fmu bW = c("wither_skeleton");
   public static final fmu bX = a("wither_skeleton_skull");
   public static final fmu bY = a("wither_skull");
   public static final fmu bZ = a("wolf");
   public static final fmu ca = a("zoglin");
   public static final fmu cb = a("zombie");
   public static final fmu cc = a("zombie_head");
   public static final fmu cd = a("zombie_horse");
   public static final fmu ce = b("zombie");
   public static final fmu cf = c("zombie");
   public static final fmu cg = a("zombie_villager");
   public static final fmu ch = b("zombie_villager");
   public static final fmu ci = c("zombie_villager");
   public static final fmu cj = a("zombified_piglin");
   public static final fmu ck = b("zombified_piglin");
   public static final fmu cl = c("zombified_piglin");

   private static fmu a(String $$0) {
      return a($$0, "main");
   }

   private static fmu a(String $$0, String $$1) {
      fmu $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fmu b(String $$0, String $$1) {
      return new fmu(new ahg("minecraft", $$0), $$1);
   }

   private static fmu b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fmu c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fmu a(chb.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fmu b(chb.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fmu c(chb.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fmu d(chb.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fmu a(dkt $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fmu b(dkt $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fmu> a() {
      return cn.stream();
   }
}
