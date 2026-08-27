import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fks {
   private static final String ci = "main";
   private static final Set<fkr> cj = Sets.newHashSet();
   public static final fkr a = a("allay");
   public static final fkr b = a("armor_stand");
   public static final fkr c = b("armor_stand");
   public static final fkr d = c("armor_stand");
   public static final fkr e = a("axolotl");
   public static final fkr f = a("banner");
   public static final fkr g = a("bat");
   public static final fkr h = a("bed_foot");
   public static final fkr i = a("bed_head");
   public static final fkr j = a("bee");
   public static final fkr k = a("bell");
   public static final fkr l = a("blaze");
   public static final fkr m = a("book");
   public static final fkr n = a("cat");
   public static final fkr o = a("cat", "collar");
   public static final fkr p = a("camel");
   public static final fkr q = a("cave_spider");
   public static final fkr r = a("chest");
   public static final fkr s = a("chest_minecart");
   public static final fkr t = a("chicken");
   public static final fkr u = a("cod");
   public static final fkr v = a("command_block_minecart");
   public static final fkr w = a("conduit", "cage");
   public static final fkr x = a("conduit", "eye");
   public static final fkr y = a("conduit", "shell");
   public static final fkr z = a("conduit", "wind");
   public static final fkr A = a("cow");
   public static final fkr B = a("creeper");
   public static final fkr C = a("creeper", "armor");
   public static final fkr D = a("creeper_head");
   public static final fkr E = a("decorated_pot_base");
   public static final fkr F = a("decorated_pot_sides");
   public static final fkr G = a("dolphin");
   public static final fkr H = a("donkey");
   public static final fkr I = a("double_chest_left");
   public static final fkr J = a("double_chest_right");
   public static final fkr K = a("dragon_skull");
   public static final fkr L = a("drowned");
   public static final fkr M = b("drowned");
   public static final fkr N = c("drowned");
   public static final fkr O = a("drowned", "outer");
   public static final fkr P = a("elder_guardian");
   public static final fkr Q = a("elytra");
   public static final fkr R = a("enderman");
   public static final fkr S = a("endermite");
   public static final fkr T = a("ender_dragon");
   public static final fkr U = a("end_crystal");
   public static final fkr V = a("evoker");
   public static final fkr W = a("evoker_fangs");
   public static final fkr X = a("fox");
   public static final fkr Y = a("frog");
   public static final fkr Z = a("furnace_minecart");
   public static final fkr aa = a("ghast");
   public static final fkr ab = a("giant");
   public static final fkr ac = b("giant");
   public static final fkr ad = c("giant");
   public static final fkr ae = a("glow_squid");
   public static final fkr af = a("goat");
   public static final fkr ag = a("guardian");
   public static final fkr ah = a("hoglin");
   public static final fkr ai = a("hopper_minecart");
   public static final fkr aj = a("horse");
   public static final fkr ak = a("horse_armor");
   public static final fkr al = a("husk");
   public static final fkr am = b("husk");
   public static final fkr an = c("husk");
   public static final fkr ao = a("illusioner");
   public static final fkr ap = a("iron_golem");
   public static final fkr aq = a("leash_knot");
   public static final fkr ar = a("llama");
   public static final fkr as = a("llama", "decor");
   public static final fkr at = a("llama_spit");
   public static final fkr au = a("magma_cube");
   public static final fkr av = a("minecart");
   public static final fkr aw = a("mooshroom");
   public static final fkr ax = a("mule");
   public static final fkr ay = a("ocelot");
   public static final fkr az = a("panda");
   public static final fkr aA = a("parrot");
   public static final fkr aB = a("phantom");
   public static final fkr aC = a("pig");
   public static final fkr aD = a("piglin");
   public static final fkr aE = a("piglin_brute");
   public static final fkr aF = b("piglin_brute");
   public static final fkr aG = c("piglin_brute");
   public static final fkr aH = a("piglin_head");
   public static final fkr aI = b("piglin");
   public static final fkr aJ = c("piglin");
   public static final fkr aK = a("pig", "saddle");
   public static final fkr aL = a("pillager");
   public static final fkr aM = a("player");
   public static final fkr aN = a("player_head");
   public static final fkr aO = b("player");
   public static final fkr aP = c("player");
   public static final fkr aQ = a("player_slim");
   public static final fkr aR = b("player_slim");
   public static final fkr aS = c("player_slim");
   public static final fkr aT = a("spin_attack");
   public static final fkr aU = a("polar_bear");
   public static final fkr aV = a("pufferfish_big");
   public static final fkr aW = a("pufferfish_medium");
   public static final fkr aX = a("pufferfish_small");
   public static final fkr aY = a("rabbit");
   public static final fkr aZ = a("ravager");
   public static final fkr ba = a("salmon");
   public static final fkr bb = a("sheep");
   public static final fkr bc = a("sheep", "fur");
   public static final fkr bd = a("shield");
   public static final fkr be = a("shulker");
   public static final fkr bf = a("shulker_bullet");
   public static final fkr bg = a("silverfish");
   public static final fkr bh = a("skeleton");
   public static final fkr bi = a("skeleton_horse");
   public static final fkr bj = b("skeleton");
   public static final fkr bk = c("skeleton");
   public static final fkr bl = a("skeleton_skull");
   public static final fkr bm = a("slime");
   public static final fkr bn = a("slime", "outer");
   public static final fkr bo = a("sniffer");
   public static final fkr bp = a("snow_golem");
   public static final fkr bq = a("spawner_minecart");
   public static final fkr br = a("spider");
   public static final fkr bs = a("squid");
   public static final fkr bt = a("stray");
   public static final fkr bu = b("stray");
   public static final fkr bv = c("stray");
   public static final fkr bw = a("stray", "outer");
   public static final fkr bx = a("strider");
   public static final fkr by = a("strider", "saddle");
   public static final fkr bz = a("tadpole");
   public static final fkr bA = a("tnt_minecart");
   public static final fkr bB = a("trader_llama");
   public static final fkr bC = a("trident");
   public static final fkr bD = a("tropical_fish_large");
   public static final fkr bE = a("tropical_fish_large", "pattern");
   public static final fkr bF = a("tropical_fish_small");
   public static final fkr bG = a("tropical_fish_small", "pattern");
   public static final fkr bH = a("turtle");
   public static final fkr bI = a("vex");
   public static final fkr bJ = a("villager");
   public static final fkr bK = a("vindicator");
   public static final fkr bL = a("warden");
   public static final fkr bM = a("wandering_trader");
   public static final fkr bN = a("witch");
   public static final fkr bO = a("wither");
   public static final fkr bP = a("wither", "armor");
   public static final fkr bQ = a("wither_skeleton");
   public static final fkr bR = b("wither_skeleton");
   public static final fkr bS = c("wither_skeleton");
   public static final fkr bT = a("wither_skeleton_skull");
   public static final fkr bU = a("wither_skull");
   public static final fkr bV = a("wolf");
   public static final fkr bW = a("zoglin");
   public static final fkr bX = a("zombie");
   public static final fkr bY = a("zombie_head");
   public static final fkr bZ = a("zombie_horse");
   public static final fkr ca = b("zombie");
   public static final fkr cb = c("zombie");
   public static final fkr cc = a("zombie_villager");
   public static final fkr cd = b("zombie_villager");
   public static final fkr ce = c("zombie_villager");
   public static final fkr cf = a("zombified_piglin");
   public static final fkr cg = b("zombified_piglin");
   public static final fkr ch = c("zombified_piglin");

   private static fkr a(String $$0) {
      return a($$0, "main");
   }

   private static fkr a(String $$0, String $$1) {
      fkr $$2 = b($$0, $$1);
      if (!cj.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fkr b(String $$0, String $$1) {
      return new fkr(new agm("minecraft", $$0), $$1);
   }

   private static fkr b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fkr c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fkr a(cfs.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fkr b(cfs.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fkr c(cfs.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fkr d(cfs.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fkr a(dja $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fkr b(dja $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fkr> a() {
      return cj.stream();
   }
}
