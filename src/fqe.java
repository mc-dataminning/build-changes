import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fqe {
   private static final String cm = "main";
   private static final Set<fqd> cn = Sets.newHashSet();
   public static final fqd a = a("allay");
   public static final fqd b = a("armadillo");
   public static final fqd c = a("armor_stand");
   public static final fqd d = b("armor_stand");
   public static final fqd e = c("armor_stand");
   public static final fqd f = a("axolotl");
   public static final fqd g = a("banner");
   public static final fqd h = a("bat");
   public static final fqd i = a("bed_foot");
   public static final fqd j = a("bed_head");
   public static final fqd k = a("bee");
   public static final fqd l = a("bell");
   public static final fqd m = a("blaze");
   public static final fqd n = a("book");
   public static final fqd o = a("breeze");
   public static final fqd p = a("cat");
   public static final fqd q = a("cat", "collar");
   public static final fqd r = a("camel");
   public static final fqd s = a("cave_spider");
   public static final fqd t = a("chest");
   public static final fqd u = a("chest_minecart");
   public static final fqd v = a("chicken");
   public static final fqd w = a("cod");
   public static final fqd x = a("command_block_minecart");
   public static final fqd y = a("conduit", "cage");
   public static final fqd z = a("conduit", "eye");
   public static final fqd A = a("conduit", "shell");
   public static final fqd B = a("conduit", "wind");
   public static final fqd C = a("cow");
   public static final fqd D = a("creeper");
   public static final fqd E = a("creeper", "armor");
   public static final fqd F = a("creeper_head");
   public static final fqd G = a("decorated_pot_base");
   public static final fqd H = a("decorated_pot_sides");
   public static final fqd I = a("dolphin");
   public static final fqd J = a("donkey");
   public static final fqd K = a("double_chest_left");
   public static final fqd L = a("double_chest_right");
   public static final fqd M = a("dragon_skull");
   public static final fqd N = a("drowned");
   public static final fqd O = b("drowned");
   public static final fqd P = c("drowned");
   public static final fqd Q = a("drowned", "outer");
   public static final fqd R = a("elder_guardian");
   public static final fqd S = a("elytra");
   public static final fqd T = a("enderman");
   public static final fqd U = a("endermite");
   public static final fqd V = a("ender_dragon");
   public static final fqd W = a("end_crystal");
   public static final fqd X = a("evoker");
   public static final fqd Y = a("evoker_fangs");
   public static final fqd Z = a("fox");
   public static final fqd aa = a("frog");
   public static final fqd ab = a("furnace_minecart");
   public static final fqd ac = a("ghast");
   public static final fqd ad = a("giant");
   public static final fqd ae = b("giant");
   public static final fqd af = c("giant");
   public static final fqd ag = a("glow_squid");
   public static final fqd ah = a("goat");
   public static final fqd ai = a("guardian");
   public static final fqd aj = a("hoglin");
   public static final fqd ak = a("hopper_minecart");
   public static final fqd al = a("horse");
   public static final fqd am = a("horse_armor");
   public static final fqd an = a("husk");
   public static final fqd ao = b("husk");
   public static final fqd ap = c("husk");
   public static final fqd aq = a("illusioner");
   public static final fqd ar = a("iron_golem");
   public static final fqd as = a("leash_knot");
   public static final fqd at = a("llama");
   public static final fqd au = a("llama", "decor");
   public static final fqd av = a("llama_spit");
   public static final fqd aw = a("magma_cube");
   public static final fqd ax = a("minecart");
   public static final fqd ay = a("mooshroom");
   public static final fqd az = a("mule");
   public static final fqd aA = a("ocelot");
   public static final fqd aB = a("panda");
   public static final fqd aC = a("parrot");
   public static final fqd aD = a("phantom");
   public static final fqd aE = a("pig");
   public static final fqd aF = a("piglin");
   public static final fqd aG = a("piglin_brute");
   public static final fqd aH = b("piglin_brute");
   public static final fqd aI = c("piglin_brute");
   public static final fqd aJ = a("piglin_head");
   public static final fqd aK = b("piglin");
   public static final fqd aL = c("piglin");
   public static final fqd aM = a("pig", "saddle");
   public static final fqd aN = a("pillager");
   public static final fqd aO = a("player");
   public static final fqd aP = a("player_head");
   public static final fqd aQ = b("player");
   public static final fqd aR = c("player");
   public static final fqd aS = a("player_slim");
   public static final fqd aT = b("player_slim");
   public static final fqd aU = c("player_slim");
   public static final fqd aV = a("spin_attack");
   public static final fqd aW = a("polar_bear");
   public static final fqd aX = a("pufferfish_big");
   public static final fqd aY = a("pufferfish_medium");
   public static final fqd aZ = a("pufferfish_small");
   public static final fqd ba = a("rabbit");
   public static final fqd bb = a("ravager");
   public static final fqd bc = a("salmon");
   public static final fqd bd = a("sheep");
   public static final fqd be = a("sheep", "fur");
   public static final fqd bf = a("shield");
   public static final fqd bg = a("shulker");
   public static final fqd bh = a("shulker_bullet");
   public static final fqd bi = a("silverfish");
   public static final fqd bj = a("skeleton");
   public static final fqd bk = a("skeleton_horse");
   public static final fqd bl = b("skeleton");
   public static final fqd bm = c("skeleton");
   public static final fqd bn = a("skeleton_skull");
   public static final fqd bo = a("slime");
   public static final fqd bp = a("slime", "outer");
   public static final fqd bq = a("sniffer");
   public static final fqd br = a("snow_golem");
   public static final fqd bs = a("spawner_minecart");
   public static final fqd bt = a("spider");
   public static final fqd bu = a("squid");
   public static final fqd bv = a("stray");
   public static final fqd bw = b("stray");
   public static final fqd bx = c("stray");
   public static final fqd by = a("stray", "outer");
   public static final fqd bz = a("strider");
   public static final fqd bA = a("strider", "saddle");
   public static final fqd bB = a("tadpole");
   public static final fqd bC = a("tnt_minecart");
   public static final fqd bD = a("trader_llama");
   public static final fqd bE = a("trident");
   public static final fqd bF = a("tropical_fish_large");
   public static final fqd bG = a("tropical_fish_large", "pattern");
   public static final fqd bH = a("tropical_fish_small");
   public static final fqd bI = a("tropical_fish_small", "pattern");
   public static final fqd bJ = a("turtle");
   public static final fqd bK = a("vex");
   public static final fqd bL = a("villager");
   public static final fqd bM = a("vindicator");
   public static final fqd bN = a("warden");
   public static final fqd bO = a("wandering_trader");
   public static final fqd bP = a("wind_charge");
   public static final fqd bQ = a("witch");
   public static final fqd bR = a("wither");
   public static final fqd bS = a("wither", "armor");
   public static final fqd bT = a("wither_skeleton");
   public static final fqd bU = b("wither_skeleton");
   public static final fqd bV = c("wither_skeleton");
   public static final fqd bW = a("wither_skeleton_skull");
   public static final fqd bX = a("wither_skull");
   public static final fqd bY = a("wolf");
   public static final fqd bZ = a("wolf_armor");
   public static final fqd ca = a("zoglin");
   public static final fqd cb = a("zombie");
   public static final fqd cc = a("zombie_head");
   public static final fqd cd = a("zombie_horse");
   public static final fqd ce = b("zombie");
   public static final fqd cf = c("zombie");
   public static final fqd cg = a("zombie_villager");
   public static final fqd ch = b("zombie_villager");
   public static final fqd ci = c("zombie_villager");
   public static final fqd cj = a("zombified_piglin");
   public static final fqd ck = b("zombified_piglin");
   public static final fqd cl = c("zombified_piglin");

   private static fqd a(String $$0) {
      return a($$0, "main");
   }

   private static fqd a(String $$0, String $$1) {
      fqd $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fqd b(String $$0, String $$1) {
      return new fqd(new ajc("minecraft", $$0), $$1);
   }

   private static fqd b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fqd c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fqd a(cjv.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fqd b(cjv.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fqd c(cjv.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fqd d(cjv.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fqd a(dnr $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fqd b(dnr $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fqd> a() {
      return cn.stream();
   }
}
