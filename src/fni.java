import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fni {
   private static final String cm = "main";
   private static final Set<fnh> cn = Sets.newHashSet();
   public static final fnh a = a("allay");
   public static final fnh b = a("armadillo");
   public static final fnh c = a("armor_stand");
   public static final fnh d = b("armor_stand");
   public static final fnh e = c("armor_stand");
   public static final fnh f = a("axolotl");
   public static final fnh g = a("banner");
   public static final fnh h = a("bat");
   public static final fnh i = a("bed_foot");
   public static final fnh j = a("bed_head");
   public static final fnh k = a("bee");
   public static final fnh l = a("bell");
   public static final fnh m = a("blaze");
   public static final fnh n = a("book");
   public static final fnh o = a("breeze");
   public static final fnh p = a("cat");
   public static final fnh q = a("cat", "collar");
   public static final fnh r = a("camel");
   public static final fnh s = a("cave_spider");
   public static final fnh t = a("chest");
   public static final fnh u = a("chest_minecart");
   public static final fnh v = a("chicken");
   public static final fnh w = a("cod");
   public static final fnh x = a("command_block_minecart");
   public static final fnh y = a("conduit", "cage");
   public static final fnh z = a("conduit", "eye");
   public static final fnh A = a("conduit", "shell");
   public static final fnh B = a("conduit", "wind");
   public static final fnh C = a("cow");
   public static final fnh D = a("creeper");
   public static final fnh E = a("creeper", "armor");
   public static final fnh F = a("creeper_head");
   public static final fnh G = a("decorated_pot_base");
   public static final fnh H = a("decorated_pot_sides");
   public static final fnh I = a("dolphin");
   public static final fnh J = a("donkey");
   public static final fnh K = a("double_chest_left");
   public static final fnh L = a("double_chest_right");
   public static final fnh M = a("dragon_skull");
   public static final fnh N = a("drowned");
   public static final fnh O = b("drowned");
   public static final fnh P = c("drowned");
   public static final fnh Q = a("drowned", "outer");
   public static final fnh R = a("elder_guardian");
   public static final fnh S = a("elytra");
   public static final fnh T = a("enderman");
   public static final fnh U = a("endermite");
   public static final fnh V = a("ender_dragon");
   public static final fnh W = a("end_crystal");
   public static final fnh X = a("evoker");
   public static final fnh Y = a("evoker_fangs");
   public static final fnh Z = a("fox");
   public static final fnh aa = a("frog");
   public static final fnh ab = a("furnace_minecart");
   public static final fnh ac = a("ghast");
   public static final fnh ad = a("giant");
   public static final fnh ae = b("giant");
   public static final fnh af = c("giant");
   public static final fnh ag = a("glow_squid");
   public static final fnh ah = a("goat");
   public static final fnh ai = a("guardian");
   public static final fnh aj = a("hoglin");
   public static final fnh ak = a("hopper_minecart");
   public static final fnh al = a("horse");
   public static final fnh am = a("horse_armor");
   public static final fnh an = a("husk");
   public static final fnh ao = b("husk");
   public static final fnh ap = c("husk");
   public static final fnh aq = a("illusioner");
   public static final fnh ar = a("iron_golem");
   public static final fnh as = a("leash_knot");
   public static final fnh at = a("llama");
   public static final fnh au = a("llama", "decor");
   public static final fnh av = a("llama_spit");
   public static final fnh aw = a("magma_cube");
   public static final fnh ax = a("minecart");
   public static final fnh ay = a("mooshroom");
   public static final fnh az = a("mule");
   public static final fnh aA = a("ocelot");
   public static final fnh aB = a("panda");
   public static final fnh aC = a("parrot");
   public static final fnh aD = a("phantom");
   public static final fnh aE = a("pig");
   public static final fnh aF = a("piglin");
   public static final fnh aG = a("piglin_brute");
   public static final fnh aH = b("piglin_brute");
   public static final fnh aI = c("piglin_brute");
   public static final fnh aJ = a("piglin_head");
   public static final fnh aK = b("piglin");
   public static final fnh aL = c("piglin");
   public static final fnh aM = a("pig", "saddle");
   public static final fnh aN = a("pillager");
   public static final fnh aO = a("player");
   public static final fnh aP = a("player_head");
   public static final fnh aQ = b("player");
   public static final fnh aR = c("player");
   public static final fnh aS = a("player_slim");
   public static final fnh aT = b("player_slim");
   public static final fnh aU = c("player_slim");
   public static final fnh aV = a("spin_attack");
   public static final fnh aW = a("polar_bear");
   public static final fnh aX = a("pufferfish_big");
   public static final fnh aY = a("pufferfish_medium");
   public static final fnh aZ = a("pufferfish_small");
   public static final fnh ba = a("rabbit");
   public static final fnh bb = a("ravager");
   public static final fnh bc = a("salmon");
   public static final fnh bd = a("sheep");
   public static final fnh be = a("sheep", "fur");
   public static final fnh bf = a("shield");
   public static final fnh bg = a("shulker");
   public static final fnh bh = a("shulker_bullet");
   public static final fnh bi = a("silverfish");
   public static final fnh bj = a("skeleton");
   public static final fnh bk = a("skeleton_horse");
   public static final fnh bl = b("skeleton");
   public static final fnh bm = c("skeleton");
   public static final fnh bn = a("skeleton_skull");
   public static final fnh bo = a("slime");
   public static final fnh bp = a("slime", "outer");
   public static final fnh bq = a("sniffer");
   public static final fnh br = a("snow_golem");
   public static final fnh bs = a("spawner_minecart");
   public static final fnh bt = a("spider");
   public static final fnh bu = a("squid");
   public static final fnh bv = a("stray");
   public static final fnh bw = b("stray");
   public static final fnh bx = c("stray");
   public static final fnh by = a("stray", "outer");
   public static final fnh bz = a("strider");
   public static final fnh bA = a("strider", "saddle");
   public static final fnh bB = a("tadpole");
   public static final fnh bC = a("tnt_minecart");
   public static final fnh bD = a("trader_llama");
   public static final fnh bE = a("trident");
   public static final fnh bF = a("tropical_fish_large");
   public static final fnh bG = a("tropical_fish_large", "pattern");
   public static final fnh bH = a("tropical_fish_small");
   public static final fnh bI = a("tropical_fish_small", "pattern");
   public static final fnh bJ = a("turtle");
   public static final fnh bK = a("vex");
   public static final fnh bL = a("villager");
   public static final fnh bM = a("vindicator");
   public static final fnh bN = a("warden");
   public static final fnh bO = a("wandering_trader");
   public static final fnh bP = a("wind_charge");
   public static final fnh bQ = a("witch");
   public static final fnh bR = a("wither");
   public static final fnh bS = a("wither", "armor");
   public static final fnh bT = a("wither_skeleton");
   public static final fnh bU = b("wither_skeleton");
   public static final fnh bV = c("wither_skeleton");
   public static final fnh bW = a("wither_skeleton_skull");
   public static final fnh bX = a("wither_skull");
   public static final fnh bY = a("wolf");
   public static final fnh bZ = a("wolf_armor");
   public static final fnh ca = a("zoglin");
   public static final fnh cb = a("zombie");
   public static final fnh cc = a("zombie_head");
   public static final fnh cd = a("zombie_horse");
   public static final fnh ce = b("zombie");
   public static final fnh cf = c("zombie");
   public static final fnh cg = a("zombie_villager");
   public static final fnh ch = b("zombie_villager");
   public static final fnh ci = c("zombie_villager");
   public static final fnh cj = a("zombified_piglin");
   public static final fnh ck = b("zombified_piglin");
   public static final fnh cl = c("zombified_piglin");

   private static fnh a(String $$0) {
      return a($$0, "main");
   }

   private static fnh a(String $$0, String $$1) {
      fnh $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fnh b(String $$0, String $$1) {
      return new fnh(new ahh("minecraft", $$0), $$1);
   }

   private static fnh b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fnh c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fnh a(chk.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fnh b(chk.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fnh c(chk.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fnh d(chk.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fnh a(dlc $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fnh b(dlc $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fnh> a() {
      return cn.stream();
   }
}
