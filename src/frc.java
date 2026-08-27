import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class frc {
   private static final String cm = "main";
   private static final Set<frb> cn = Sets.newHashSet();
   public static final frb a = a("allay");
   public static final frb b = a("armadillo");
   public static final frb c = a("armor_stand");
   public static final frb d = b("armor_stand");
   public static final frb e = c("armor_stand");
   public static final frb f = a("axolotl");
   public static final frb g = a("banner");
   public static final frb h = a("bat");
   public static final frb i = a("bed_foot");
   public static final frb j = a("bed_head");
   public static final frb k = a("bee");
   public static final frb l = a("bell");
   public static final frb m = a("blaze");
   public static final frb n = a("book");
   public static final frb o = a("breeze");
   public static final frb p = a("cat");
   public static final frb q = a("cat", "collar");
   public static final frb r = a("camel");
   public static final frb s = a("cave_spider");
   public static final frb t = a("chest");
   public static final frb u = a("chest_minecart");
   public static final frb v = a("chicken");
   public static final frb w = a("cod");
   public static final frb x = a("command_block_minecart");
   public static final frb y = a("conduit", "cage");
   public static final frb z = a("conduit", "eye");
   public static final frb A = a("conduit", "shell");
   public static final frb B = a("conduit", "wind");
   public static final frb C = a("cow");
   public static final frb D = a("creeper");
   public static final frb E = a("creeper", "armor");
   public static final frb F = a("creeper_head");
   public static final frb G = a("decorated_pot_base");
   public static final frb H = a("decorated_pot_sides");
   public static final frb I = a("dolphin");
   public static final frb J = a("donkey");
   public static final frb K = a("double_chest_left");
   public static final frb L = a("double_chest_right");
   public static final frb M = a("dragon_skull");
   public static final frb N = a("drowned");
   public static final frb O = b("drowned");
   public static final frb P = c("drowned");
   public static final frb Q = a("drowned", "outer");
   public static final frb R = a("elder_guardian");
   public static final frb S = a("elytra");
   public static final frb T = a("enderman");
   public static final frb U = a("endermite");
   public static final frb V = a("ender_dragon");
   public static final frb W = a("end_crystal");
   public static final frb X = a("evoker");
   public static final frb Y = a("evoker_fangs");
   public static final frb Z = a("fox");
   public static final frb aa = a("frog");
   public static final frb ab = a("furnace_minecart");
   public static final frb ac = a("ghast");
   public static final frb ad = a("giant");
   public static final frb ae = b("giant");
   public static final frb af = c("giant");
   public static final frb ag = a("glow_squid");
   public static final frb ah = a("goat");
   public static final frb ai = a("guardian");
   public static final frb aj = a("hoglin");
   public static final frb ak = a("hopper_minecart");
   public static final frb al = a("horse");
   public static final frb am = a("horse_armor");
   public static final frb an = a("husk");
   public static final frb ao = b("husk");
   public static final frb ap = c("husk");
   public static final frb aq = a("illusioner");
   public static final frb ar = a("iron_golem");
   public static final frb as = a("leash_knot");
   public static final frb at = a("llama");
   public static final frb au = a("llama", "decor");
   public static final frb av = a("llama_spit");
   public static final frb aw = a("magma_cube");
   public static final frb ax = a("minecart");
   public static final frb ay = a("mooshroom");
   public static final frb az = a("mule");
   public static final frb aA = a("ocelot");
   public static final frb aB = a("panda");
   public static final frb aC = a("parrot");
   public static final frb aD = a("phantom");
   public static final frb aE = a("pig");
   public static final frb aF = a("piglin");
   public static final frb aG = a("piglin_brute");
   public static final frb aH = b("piglin_brute");
   public static final frb aI = c("piglin_brute");
   public static final frb aJ = a("piglin_head");
   public static final frb aK = b("piglin");
   public static final frb aL = c("piglin");
   public static final frb aM = a("pig", "saddle");
   public static final frb aN = a("pillager");
   public static final frb aO = a("player");
   public static final frb aP = a("player_head");
   public static final frb aQ = b("player");
   public static final frb aR = c("player");
   public static final frb aS = a("player_slim");
   public static final frb aT = b("player_slim");
   public static final frb aU = c("player_slim");
   public static final frb aV = a("spin_attack");
   public static final frb aW = a("polar_bear");
   public static final frb aX = a("pufferfish_big");
   public static final frb aY = a("pufferfish_medium");
   public static final frb aZ = a("pufferfish_small");
   public static final frb ba = a("rabbit");
   public static final frb bb = a("ravager");
   public static final frb bc = a("salmon");
   public static final frb bd = a("sheep");
   public static final frb be = a("sheep", "fur");
   public static final frb bf = a("shield");
   public static final frb bg = a("shulker");
   public static final frb bh = a("shulker_bullet");
   public static final frb bi = a("silverfish");
   public static final frb bj = a("skeleton");
   public static final frb bk = a("skeleton_horse");
   public static final frb bl = b("skeleton");
   public static final frb bm = c("skeleton");
   public static final frb bn = a("skeleton_skull");
   public static final frb bo = a("slime");
   public static final frb bp = a("slime", "outer");
   public static final frb bq = a("sniffer");
   public static final frb br = a("snow_golem");
   public static final frb bs = a("spawner_minecart");
   public static final frb bt = a("spider");
   public static final frb bu = a("squid");
   public static final frb bv = a("stray");
   public static final frb bw = b("stray");
   public static final frb bx = c("stray");
   public static final frb by = a("stray", "outer");
   public static final frb bz = a("strider");
   public static final frb bA = a("strider", "saddle");
   public static final frb bB = a("tadpole");
   public static final frb bC = a("tnt_minecart");
   public static final frb bD = a("trader_llama");
   public static final frb bE = a("trident");
   public static final frb bF = a("tropical_fish_large");
   public static final frb bG = a("tropical_fish_large", "pattern");
   public static final frb bH = a("tropical_fish_small");
   public static final frb bI = a("tropical_fish_small", "pattern");
   public static final frb bJ = a("turtle");
   public static final frb bK = a("vex");
   public static final frb bL = a("villager");
   public static final frb bM = a("vindicator");
   public static final frb bN = a("warden");
   public static final frb bO = a("wandering_trader");
   public static final frb bP = a("wind_charge");
   public static final frb bQ = a("witch");
   public static final frb bR = a("wither");
   public static final frb bS = a("wither", "armor");
   public static final frb bT = a("wither_skeleton");
   public static final frb bU = b("wither_skeleton");
   public static final frb bV = c("wither_skeleton");
   public static final frb bW = a("wither_skeleton_skull");
   public static final frb bX = a("wither_skull");
   public static final frb bY = a("wolf");
   public static final frb bZ = a("wolf_armor");
   public static final frb ca = a("zoglin");
   public static final frb cb = a("zombie");
   public static final frb cc = a("zombie_head");
   public static final frb cd = a("zombie_horse");
   public static final frb ce = b("zombie");
   public static final frb cf = c("zombie");
   public static final frb cg = a("zombie_villager");
   public static final frb ch = b("zombie_villager");
   public static final frb ci = c("zombie_villager");
   public static final frb cj = a("zombified_piglin");
   public static final frb ck = b("zombified_piglin");
   public static final frb cl = c("zombified_piglin");

   private static frb a(String $$0) {
      return a($$0, "main");
   }

   private static frb a(String $$0, String $$1) {
      frb $$2 = b($$0, $$1);
      if (!cn.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static frb b(String $$0, String $$1) {
      return new frb(new ajh("minecraft", $$0), $$1);
   }

   private static frb b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static frb c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static frb a(ckp.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static frb b(ckp.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static frb c(ckp.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static frb d(ckp.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static frb a(dom $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static frb b(dom $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<frb> a() {
      return cn.stream();
   }
}
