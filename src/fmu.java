import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fmu {
   private static final String cm = "main";
   private static final Set<fmt> cn = Sets.newHashSet();
   public static final fmt a = a("allay");
   public static final fmt b = a("armor_stand");
   public static final fmt c = b("armor_stand");
   public static final fmt d = c("armor_stand");
   public static final fmt e = a("axolotl");
   public static final fmt f = a("banner");
   public static final fmt g = a("bat");
   public static final fmt h = a("bed_foot");
   public static final fmt i = a("bed_head");
   public static final fmt j = a("bee");
   public static final fmt k = a("bell");
   public static final fmt l = a("blaze");
   public static final fmt m = a("book");
   public static final fmt n = a("breeze");
   public static final fmt o = a("breeze", "wind");
   public static final fmt p = a("breeze", "eyes");
   public static final fmt q = a("cat");
   public static final fmt r = a("cat", "collar");
   public static final fmt s = a("camel");
   public static final fmt t = a("cave_spider");
   public static final fmt u = a("chest");
   public static final fmt v = a("chest_minecart");
   public static final fmt w = a("chicken");
   public static final fmt x = a("cod");
   public static final fmt y = a("command_block_minecart");
   public static final fmt z = a("conduit", "cage");
   public static final fmt A = a("conduit", "eye");
   public static final fmt B = a("conduit", "shell");
   public static final fmt C = a("conduit", "wind");
   public static final fmt D = a("cow");
   public static final fmt E = a("creeper");
   public static final fmt F = a("creeper", "armor");
   public static final fmt G = a("creeper_head");
   public static final fmt H = a("decorated_pot_base");
   public static final fmt I = a("decorated_pot_sides");
   public static final fmt J = a("dolphin");
   public static final fmt K = a("donkey");
   public static final fmt L = a("double_chest_left");
   public static final fmt M = a("double_chest_right");
   public static final fmt N = a("dragon_skull");
   public static final fmt O = a("drowned");
   public static final fmt P = b("drowned");
   public static final fmt Q = c("drowned");
   public static final fmt R = a("drowned", "outer");
   public static final fmt S = a("elder_guardian");
   public static final fmt T = a("elytra");
   public static final fmt U = a("enderman");
   public static final fmt V = a("endermite");
   public static final fmt W = a("ender_dragon");
   public static final fmt X = a("end_crystal");
   public static final fmt Y = a("evoker");
   public static final fmt Z = a("evoker_fangs");
   public static final fmt aa = a("fox");
   public static final fmt ab = a("frog");
   public static final fmt ac = a("furnace_minecart");
   public static final fmt ad = a("ghast");
   public static final fmt ae = a("giant");
   public static final fmt af = b("giant");
   public static final fmt ag = c("giant");
   public static final fmt ah = a("glow_squid");
   public static final fmt ai = a("goat");
   public static final fmt aj = a("guardian");
   public static final fmt ak = a("hoglin");
   public static final fmt al = a("hopper_minecart");
   public static final fmt am = a("horse");
   public static final fmt an = a("horse_armor");
   public static final fmt ao = a("husk");
   public static final fmt ap = b("husk");
   public static final fmt aq = c("husk");
   public static final fmt ar = a("illusioner");
   public static final fmt as = a("iron_golem");
   public static final fmt at = a("leash_knot");
   public static final fmt au = a("llama");
   public static final fmt av = a("llama", "decor");
   public static final fmt aw = a("llama_spit");
   public static final fmt ax = a("magma_cube");
   public static final fmt ay = a("minecart");
   public static final fmt az = a("mooshroom");
   public static final fmt aA = a("mule");
   public static final fmt aB = a("ocelot");
   public static final fmt aC = a("panda");
   public static final fmt aD = a("parrot");
   public static final fmt aE = a("phantom");
   public static final fmt aF = a("pig");
   public static final fmt aG = a("piglin");
   public static final fmt aH = a("piglin_brute");
   public static final fmt aI = b("piglin_brute");
   public static final fmt aJ = c("piglin_brute");
   public static final fmt aK = a("piglin_head");
   public static final fmt aL = b("piglin");
   public static final fmt aM = c("piglin");
   public static final fmt aN = a("pig", "saddle");
   public static final fmt aO = a("pillager");
   public static final fmt aP = a("player");
   public static final fmt aQ = a("player_head");
   public static final fmt aR = b("player");
   public static final fmt aS = c("player");
   public static final fmt aT = a("player_slim");
   public static final fmt aU = b("player_slim");
   public static final fmt aV = c("player_slim");
   public static final fmt aW = a("spin_attack");
   public static final fmt aX = a("polar_bear");
   public static final fmt aY = a("pufferfish_big");
   public static final fmt aZ = a("pufferfish_medium");
   public static final fmt ba = a("pufferfish_small");
   public static final fmt bb = a("rabbit");
   public static final fmt bc = a("ravager");
   public static final fmt bd = a("salmon");
   public static final fmt be = a("sheep");
   public static final fmt bf = a("sheep", "fur");
   public static final fmt bg = a("shield");
   public static final fmt bh = a("shulker");
   public static final fmt bi = a("shulker_bullet");
   public static final fmt bj = a("silverfish");
   public static final fmt bk = a("skeleton");
   public static final fmt bl = a("skeleton_horse");
   public static final fmt bm = b("skeleton");
   public static final fmt bn = c("skeleton");
   public static final fmt bo = a("skeleton_skull");
   public static final fmt bp = a("slime");
   public static final fmt bq = a("slime", "outer");
   public static final fmt br = a("sniffer");
   public static final fmt bs = a("snow_golem");
   public static final fmt bt = a("spawner_minecart");
   public static final fmt bu = a("spider");
   public static final fmt bv = a("squid");
   public static final fmt bw = a("stray");
   public static final fmt bx = b("stray");
   public static final fmt by = c("stray");
   public static final fmt bz = a("stray", "outer");
   public static final fmt bA = a("strider");
   public static final fmt bB = a("strider", "saddle");
   public static final fmt bC = a("tadpole");
   public static final fmt bD = a("tnt_minecart");
   public static final fmt bE = a("trader_llama");
   public static final fmt bF = a("trident");
   public static final fmt bG = a("tropical_fish_large");
   public static final fmt bH = a("tropical_fish_large", "pattern");
   public static final fmt bI = a("tropical_fish_small");
   public static final fmt bJ = a("tropical_fish_small", "pattern");
   public static final fmt bK = a("turtle");
   public static final fmt bL = a("vex");
   public static final fmt bM = a("villager");
   public static final fmt bN = a("vindicator");
   public static final fmt bO = a("warden");
   public static final fmt bP = a("wandering_trader");
   public static final fmt bQ = a("wind_charge");
   public static final fmt bR = a("witch");
   public static final fmt bS = a("wither");
   public static final fmt bT = a("wither", "armor");
   public static final fmt bU = a("wither_skeleton");
   public static final fmt bV = b("wither_skeleton");
   public static final fmt bW = c("wither_skeleton");
   public static final fmt bX = a("wither_skeleton_skull");
   public static final fmt bY = a("wither_skull");
   public static final fmt bZ = a("wolf");
   public static final fmt ca = a("zoglin");
   public static final fmt cb = a("zombie");
   public static final fmt cc = a("zombie_head");
   public static final fmt cd = a("zombie_horse");
   public static final fmt ce = b("zombie");
   public static final fmt cf = c("zombie");
   public static final fmt cg = a("zombie_villager");
   public static final fmt ch = b("zombie_villager");
   public static final fmt ci = c("zombie_villager");
   public static final fmt cj = a("zombified_piglin");
   public static final fmt ck = b("zombified_piglin");
   public static final fmt cl = c("zombified_piglin");

   private static fmt a(String $$0) {
      return a($$0, "main");
   }

   private static fmt a(String $$0, String $$1) {
      fmt $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fmt b(String $$0, String $$1) {
      return new fmt(new ahg("minecraft", $$0), $$1);
   }

   private static fmt b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fmt c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fmt a(chb.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fmt b(chb.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fmt c(chb.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fmt d(chb.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fmt a(dkt $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fmt b(dkt $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fmt> a() {
      return cn.stream();
   }
}
