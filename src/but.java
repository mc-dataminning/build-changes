import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class but<T extends bum> implements crr, ebi<bum, T> {
   private static final Logger bU = LogUtils.getLogger();
   private final jr.c<but<?>> bV = mb.f.f(this);
   private static final float bW = 1.3964844F;
   private static final int bX = 10;
   public static final but<cqz> a = a("acacia_boat", but.a.a(a(() -> cwu.oF), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> b = a("acacia_chest_boat", but.a.a(b(() -> cwu.oG), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cif> c = a("allay", but.a.a(cif::new, bvl.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final but<buf> d = a("area_effect_cloud", but.a.<buf>a(buf::new, bvl.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final but<cii> e = a("armadillo", but.a.a(cii::new, bvl.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final but<cks> f = a("armor_stand", but.a.<cks>a(cks::new, bvl.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final but<cph> g = a("arrow", but.a.<cph>a(cph::new, bvl.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final but<cil> h = a("axolotl", but.a.a(cil::new, bvl.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final but<crb> i = a("bamboo_chest_raft", but.a.a(d(() -> cwu.oQ), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cro> j = a("bamboo_raft", but.a.a(c(() -> cwu.oP), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cgt> k = a("bat", but.a.a(cgt::new, bvl.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final but<cha> l = a("bee", but.a.a(cha::new, bvl.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final but<cqz> m = a("birch_boat", but.a.a(a(() -> cwu.oB), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> n = a("birch_chest_boat", but.a.a(b(() -> cwu.oC), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cli> o = a("blaze", but.a.a(cli::new, bvl.a).c().a(0.6F, 1.8F).a(8));
   public static final but<buk.b> p = a("block_display", but.a.a(buk.b::new, bvl.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final but<clj> q = a("bogged", but.a.a(clj::new, bvl.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final but<cmv> r = a("breeze", but.a.a(cmv::new, bvl.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final but<cqi> s = a("breeze_wind_charge", but.a.<cqi>a(cqi::new, bvl.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final but<ciq> t = a("camel", but.a.a(ciq::new, bvl.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final but<chc> u = a("cat", but.a.a(chc::new, bvl.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final but<clk> v = a("cave_spider", but.a.a(clk::new, bvl.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final but<cqz> w = a("cherry_boat", but.a.a(a(() -> cwu.oH), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> x = a("cherry_chest_boat", but.a.a(b(() -> cwu.oI), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<crg> y = a("chest_minecart", but.a.a(crg::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<che> z = a("chicken", but.a.a(che::new, bvl.b).a(0.4F, 0.7F).b(0.644F).a(new fbb(0.0, 0.7, -0.1)).a(10));
   public static final but<chf> A = a("cod", but.a.a(chf::new, bvl.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final but<crh> B = a("command_block_minecart", but.a.a(crh::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<chg> C = a("cow", but.a.a(chg::new, bvl.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final but<cnd> D = a("creaking", but.a.a(cnd::new, bvl.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final but<cll> E = a("creeper", but.a.a(cll::new, bvl.a).a(0.6F, 1.7F).a(8));
   public static final but<cqz> F = a("dark_oak_boat", but.a.a(a(() -> cwu.oJ), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> G = a("dark_oak_chest_boat", but.a.a(b(() -> cwu.oK), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<chh> H = a("dolphin", but.a.a(chh::new, bvl.f).a(0.9F, 0.6F).b(0.3F));
   public static final but<cje> I = a("donkey", but.a.a(cje::new, bvl.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final but<cpi> J = a("dragon_fireball", but.a.<cpi>a(cpi::new, bvl.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final but<cln> K = a("drowned", but.a.a(cln::new, bvl.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final but<cqa> L = a("egg", but.a.<cqa>a(cqa::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<clo> M = a("elder_guardian", but.a.a(clo::new, bvl.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final but<clp> N = a("enderman", but.a.a(clp::new, bvl.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final but<clq> O = a("endermite", but.a.a(clq::new, bvl.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final but<cjw> P = a("ender_dragon", but.a.a(cjw::new, bvl.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final but<cqb> Q = a("ender_pearl", but.a.<cqb>a(cqb::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<cjv> R = a("end_crystal", but.a.<cjv>a(cjv::new, bvl.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final but<cls> S = a("evoker", but.a.a(cls::new, bvl.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final but<cpj> T = a("evoker_fangs", but.a.<cpj>a(cpj::new, bvl.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final but<cqc> U = a("experience_bottle", but.a.<cqc>a(cqc::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<buy> V = a("experience_orb", but.a.<buy>a(buy::new, bvl.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final but<cpk> W = a("eye_of_ender", but.a.<cpk>a(cpk::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final but<clc> X = a("falling_block", but.a.<clc>a(clc::new, bvl.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final but<cpp> Y = a("fireball", but.a.<cpp>a(cpp::new, bvl.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final but<cpm> Z = a("firework_rocket", but.a.<cpm>a(cpm::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<chj> aa = a("fox", but.a.a(chj::new, bvl.b).a(0.6F, 0.7F).b(0.4F).a(new fbb(0.0, 0.6375, -0.25)).a(8).a(djp.oK));
   public static final but<cit> ab = a("frog", but.a.a(cit::new, bvl.b).a(0.5F, 0.5F).a(new fbb(0.0, 0.375, -0.25)).a(10));
   public static final but<cri> ac = a("furnace_minecart", but.a.a(cri::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<clt> ad = a("ghast", but.a.a(clt::new, bvl.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final but<clu> ae = a("giant", but.a.a(clu::new, bvl.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final but<cku> af = a("glow_item_frame", but.a.<cku>a(cku::new, bvl.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final but<bva> ag = a("glow_squid", but.a.a(bva::new, bvl.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final but<ciz> ah = a("goat", but.a.a(ciz::new, bvl.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final but<clv> ai = a("guardian", but.a.a(clv::new, bvl.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final but<cng> aj = a("hoglin", but.a.a(cng::new, bvl.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final but<crj> ak = a("hopper_minecart", but.a.a(crj::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<cjf> al = a("horse", but.a.a(cjf::new, bvl.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final but<clw> am = a("husk", but.a.a(clw::new, bvl.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final but<clx> an = a("illusioner", but.a.a(clx::new, bvl.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final but<bvd> ao = a("interaction", but.a.a(bvd::new, bvl.h).e().a(0.0F, 0.0F).a(10));
   public static final but<chl> ap = a("iron_golem", but.a.a(chl::new, bvl.h).a(1.4F, 2.7F).a(10));
   public static final but<cld> aq = a("item", but.a.<cld>a(cld::new, bvl.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final but<buk.g> ar = a("item_display", but.a.a(buk.g::new, bvl.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final but<ckw> as = a("item_frame", but.a.<ckw>a(ckw::new, bvl.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final but<cqz> at = a("jungle_boat", but.a.a(a(() -> cwu.oD), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> au = a("jungle_chest_boat", but.a.a(b(() -> cwu.oE), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<ckx> av = a("leash_knot", but.a.<ckx>a(ckx::new, bvl.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final but<bvh> aw = a("lightning_bolt", but.a.a(bvh::new, bvl.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final but<cjg> ax = a("llama", but.a.a(cjg::new, bvl.b).a(0.9F, 1.87F).b(1.7765F).a(new fbb(0.0, 1.37, -0.3)).a(10));
   public static final but<cpq> ay = a("llama_spit", but.a.<cpq>a(cpq::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<cly> az = a("magma_cube", but.a.a(cly::new, bvl.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final but<cqz> aA = a("mangrove_boat", but.a.a(a(() -> cwu.oN), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> aB = a("mangrove_chest_boat", but.a.a(b(() -> cwu.oO), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<bvj> aC = a("marker", but.a.a(bvj::new, bvl.h).e().a(0.0F, 0.0F).a(0));
   public static final but<cre> aD = a("minecart", but.a.a(cre::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<chm> aE = a("mooshroom", but.a.a(chm::new, bvl.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final but<cji> aF = a("mule", but.a.a(cji::new, bvl.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final but<cqz> aG = a("oak_boat", but.a.a(a(() -> cwu.ox), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> aH = a("oak_chest_boat", but.a.a(b(() -> cwu.oy), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<chn> aI = a("ocelot", but.a.a(chn::new, bvl.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final but<bvo> aJ = a("ominous_item_spawner", but.a.a(bvo::new, bvl.h).e().a(0.25F, 0.25F).a(8));
   public static final but<cky> aK = a("painting", but.a.<cky>a(cky::new, bvl.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final but<cqz> aL = a("pale_oak_boat", but.a.a(a(() -> cwu.oL), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> aM = a("pale_oak_chest_boat", but.a.a(b(() -> cwu.oM), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cho> aN = a("panda", but.a.a(cho::new, bvl.b).a(1.3F, 1.25F).a(10));
   public static final but<chp> aO = a("parrot", but.a.a(chp::new, bvl.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final but<cmb> aP = a("phantom", but.a.a(cmb::new, bvl.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final but<chq> aQ = a("pig", but.a.a(chq::new, bvl.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final but<cnm> aR = a("piglin", but.a.a(cnm::new, bvl.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final but<cnp> aS = a("piglin_brute", but.a.a(cnp::new, bvl.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final but<cmc> aT = a("pillager", but.a.a(cmc::new, bvl.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final but<chr> aU = a("polar_bear", but.a.a(chr::new, bvl.b).a(djp.rr).a(1.4F, 1.4F).a(10));
   public static final but<cqd> aV = a("potion", but.a.<cqd>a(cqd::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<chs> aW = a("pufferfish", but.a.a(chs::new, bvl.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final but<cht> aX = a("rabbit", but.a.a(cht::new, bvl.b).a(0.4F, 0.5F).a(8));
   public static final but<cme> aY = a("ravager", but.a.a(cme::new, bvl.a).a(1.95F, 2.2F).a(new fbb(0.0, 2.2625, -0.0625)).a(10));
   public static final but<chu> aZ = a("salmon", but.a.a(chu::new, bvl.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final but<chv> ba = a("sheep", but.a.a(chv::new, bvl.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final but<cmf> bb = a("shulker", but.a.a(cmf::new, bvl.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final but<cpu> bc = a("shulker_bullet", but.a.<cpu>a(cpu::new, bvl.h).e().a(0.3125F, 0.3125F).a(8));
   public static final but<cmg> bd = a("silverfish", but.a.a(cmg::new, bvl.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final but<cmh> be = a("skeleton", but.a.a(cmh::new, bvl.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final but<cjj> bf = a("skeleton_horse", but.a.a(cjj::new, bvl.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final but<cmi> bg = a("slime", but.a.a(cmi::new, bvl.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final but<cpv> bh = a("small_fireball", but.a.<cpv>a(cpv::new, bvl.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final but<cjq> bi = a("sniffer", but.a.a(cjq::new, bvl.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final but<cpw> bj = a("snowball", but.a.<cpw>a(cpw::new, bvl.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final but<chx> bk = a("snow_golem", but.a.a(chx::new, bvl.h).a(djp.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final but<crk> bl = a("spawner_minecart", but.a.a(crk::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<cpx> bm = a("spectral_arrow", but.a.<cpx>a(cpx::new, bvl.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final but<cmk> bn = a("spider", but.a.a(cmk::new, bvl.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final but<cqz> bo = a("spruce_boat", but.a.a(a(() -> cwu.oz), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<cra> bp = a("spruce_chest_boat", but.a.a(b(() -> cwu.oA), bvl.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final but<chy> bq = a("squid", but.a.a(chy::new, bvl.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final but<cml> br = a("stray", but.a.a(cml::new, bvl.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(djp.rr).a(8));
   public static final but<cmm> bs = a("strider", but.a.a(cmm::new, bvl.b).c().a(0.9F, 1.7F).a(10));
   public static final but<ciw> bt = a("tadpole", but.a.a(ciw::new, bvl.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final but<buk.l> bu = a("text_display", but.a.a(buk.l::new, bvl.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final but<cle> bv = a("tnt", but.a.<cle>a(cle::new, bvl.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final but<crl> bw = a("tnt_minecart", but.a.a(crl::new, bvl.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final but<cjl> bx = a("trader_llama", but.a.a(cjl::new, bvl.b).a(0.9F, 1.87F).b(1.7765F).a(new fbb(0.0, 1.37, -0.3)).a(10));
   public static final but<cqe> by = a("trident", but.a.<cqe>a(cqe::new, bvl.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final but<chz> bz = a("tropical_fish", but.a.a(chz::new, bvl.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final but<cia> bA = a("turtle", but.a.a(cia::new, bvl.b).a(1.2F, 0.4F).a(new fbb(0.0, 0.55625, -0.25)).a(10));
   public static final but<cmn> bB = a("vex", but.a.a(cmn::new, bvl.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final but<coj> bC = a("villager", but.a.<coj>a(coj::new, bvl.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final but<cmo> bD = a("vindicator", but.a.a(cmo::new, bvl.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final but<coq> bE = a("wandering_trader", but.a.a(coq::new, bvl.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final but<coa> bF = a("warden", but.a.a(coa::new, bvl.a).a(0.9F, 2.9F).a(3.15F).a(bun.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final but<cqj> bG = a("wind_charge", but.a.<cqj>a(cqj::new, bvl.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final but<cmp> bH = a("witch", but.a.a(cmp::new, bvl.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final but<ckq> bI = a("wither", but.a.a(ckq::new, bvl.a).c().a(djp.ck).a(0.9F, 3.5F).a(10));
   public static final but<cmq> bJ = a("wither_skeleton", but.a.a(cmq::new, bvl.a).c().a(djp.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final but<cqf> bK = a("wither_skull", but.a.<cqf>a(cqf::new, bvl.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final but<cic> bL = a("wolf", but.a.a(cic::new, bvl.b).a(0.6F, 0.85F).b(0.68F).a(new fbb(0.0, 0.81875, -0.0625)).a(10));
   public static final but<cmr> bM = a("zoglin", but.a.a(cmr::new, bvl.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final but<cms> bN = a("zombie", but.a.<cms>a(cms::new, bvl.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final but<cjn> bO = a("zombie_horse", but.a.a(cjn::new, bvl.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final but<cmt> bP = a("zombie_villager", but.a.a(cmt::new, bvl.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final but<cmu> bQ = a("zombified_piglin", but.a.a(cmu::new, bvl.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final but<coy> bR = a("player", but.a.<coy>a(bvl.h).b().a().a(0.6F, 1.8F).b(1.62F).a(coy.bU).a(32).b(2));
   public static final but<cpn> bS = a("fishing_bobber", but.a.<cpn>a(cpn::new, bvl.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<but<?>> bY = Set.of(X, B, bl);
   private final but.b<T> bZ;
   private final bvl ca;
   private final ImmutableSet<djn> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private wp cj;
   private final Optional<aku<evx>> ck;
   private final bup cl;
   private final float cm;
   private final cru cn;

   private static <T extends bum> but<T> a(aku<but<?>> $$0, but.a<T> $$1) {
      return ke.a(mb.f, $$0, $$1.a($$0));
   }

   private static aku<but<?>> b(String $$0) {
      return aku.a(mc.z, akv.b($$0));
   }

   private static <T extends bum> but<T> a(String $$0, but.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static akv a(but<?> $$0) {
      return mb.f.b($$0);
   }

   public static Optional<but<?>> a(String $$0) {
      return mb.f.b(akv.c($$0));
   }

   public but(
      but.b<T> $$0,
      bvl $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<djn> $$6,
      bup $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<aku<evx>> $$12,
      cru $$13
   ) {
      this.bZ = $$0;
      this.ca = $$1;
      this.cf = $$5;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cb = $$6;
      this.cl = $$7;
      this.cm = $$8;
      this.cg = $$9;
      this.ch = $$10;
      this.ci = $$11;
      this.ck = $$12;
      this.cn = $$13;
   }

   @Nullable
   public T a(ard $$0, @Nullable cwq $$1, @Nullable coy $$2, ji $$3, bus $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bum> Consumer<T> a(dgj $$0, cwq $$1, @Nullable coy $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bum> Consumer<T> a(Consumer<T> $$0, dgj $$1, cwq $$2, @Nullable coy $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bum> Consumer<T> a(Consumer<T> $$0, cwq $$1) {
      wp $$2 = $$1.a(kv.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bum> Consumer<T> b(Consumer<T> $$0, dgj $$1, cwq $$2, @Nullable coy $$3) {
      cyz $$4 = $$2.a(kv.W, cyz.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ard $$0, ji $$1, bus $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ard $$0, @Nullable Consumer<T> $$1, ji $$2, bus $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bvk $$7) {
            $$7.U();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(ard $$0, @Nullable Consumer<T> $$1, ji $$2, bus $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cR());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayz.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvk $$9) {
            $$9.aZ = $$9.dL();
            $$9.aX = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dgm $$0, ji $$1, boolean $$2, faw $$3) {
      faw $$4 = new faw($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fbv> $$5 = $$0.d(null, $$4);
      return 1.0 + fbs.a(jn.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgj $$0, @Nullable coy $$1, @Nullable bum $$2, cyz $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         but<?> $$5 = $$3.a($$4.ba(), mc.z);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 != null && $$4.ag().f($$1.gh())) {
               $$3.a($$2);
            }
         }
      }
   }

   public boolean b() {
      return this.cc;
   }

   public boolean c() {
      return this.cd;
   }

   public boolean d() {
      return this.ce;
   }

   public boolean e() {
      return this.cf;
   }

   public bvl f() {
      return this.ca;
   }

   public String g() {
      return this.ci;
   }

   public wp h() {
      if (this.cj == null) {
         this.cj = wp.c(this.g());
      }

      return this.cj;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<aku<evx>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public cru i() {
      return this.cn;
   }

   @Nullable
   public T a(dgj $$0, bus $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bum> a(tq $$0, dgj $$1, bus $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bU.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public faw a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new faw($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dwy $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && etn.a($$0) ? true : $$0.a(djp.ck) || $$0.a(djp.oK) || $$0.a(djp.ed) || $$0.a(djp.rr);
      }
   }

   public bup n() {
      return this.cl;
   }

   public static Optional<but<?>> a(tq $$0) {
      return mb.f.b(akv.a($$0.l("id")));
   }

   @Nullable
   public static bum a(tq $$0, dgj $$1, bus $$2, Function<bum, bum> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            tw $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bum $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bum)$$4;
      }).orElse(null);
   }

   public static Stream<bum> a(final List<? extends un> $$0, final dgj $$1, final bus $$2) {
      final Spliterator<? extends un> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bum>() {
         @Override
         public boolean tryAdvance(Consumer<? super bum> $$0x) {
            return $$3.tryAdvance($$3xx -> but.a((tq)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bum> trySplit() {
            return null;
         }

         @Override
         public long estimateSize() {
            return (long)$$0.size();
         }

         @Override
         public int characteristics() {
            return 1297;
         }
      }, false);
   }

   private static Optional<bum> b(tq $$0, dgj $$1, bus $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bU.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.cg;
   }

   public int p() {
      return this.ch;
   }

   public boolean q() {
      return this != bR && this != ay && this != bI && this != k && this != as && this != af && this != av && this != aK && this != R && this != T;
   }

   public boolean a(axf<but<?>> $$0) {
      return this.bV.a($$0);
   }

   public boolean a(jv<but<?>> $$0) {
      return $$0.a(this.bV);
   }

   @Nullable
   public T a(bum $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bum> a() {
      return bum.class;
   }

   @Deprecated
   public jr.c<but<?>> r() {
      return this.bV;
   }

   private static but.b<cqz> a(Supplier<cwm> $$0) {
      return ($$1, $$2) -> new cqz($$1, $$2, $$0);
   }

   private static but.b<cra> b(Supplier<cwm> $$0) {
      return ($$1, $$2) -> new cra($$1, $$2, $$0);
   }

   private static but.b<cro> c(Supplier<cwm> $$0) {
      return ($$1, $$2) -> new cro($$1, $$2, $$0);
   }

   private static but.b<crb> d(Supplier<cwm> $$0) {
      return ($$1, $$2) -> new crb($$1, $$2, $$0);
   }

   public boolean s() {
      return bY.contains(this);
   }

   public static class a<T extends bum> {
      private final but.b<T> a;
      private final bvl b;
      private ImmutableSet<djn> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bup j = bup.b(0.6F, 1.8F);
      private float k = 1.0F;
      private buo.a l = buo.a();
      private cru m = crw.g;
      private akn<but<?>, Optional<aku<evx>>> n = $$0x -> Optional.of(aku.a(mc.bg, $$0x.a().f("entities/")));
      private akn<but<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(but.b<T> $$0, bvl $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvl.b || $$1 == bvl.h;
      }

      public static <T extends bum> but.a<T> a(but.b<T> $$0, bvl $$1) {
         return new but.a<>($$0, $$1);
      }

      public static <T extends bum> but.a<T> a(bvl $$0) {
         return new but.a<>(($$0x, $$1) -> null, $$0);
      }

      public but.a<T> a(float $$0, float $$1) {
         this.j = bup.b($$0, $$1);
         return this;
      }

      public but.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public but.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public but.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bun.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public but.a<T> a(fbb... $$0) {
         for (fbb $$1 : $$0) {
            this.l = this.l.a(bun.a, $$1);
         }

         return this;
      }

      public but.a<T> a(fbb $$0) {
         return this.a(bun.b, $$0);
      }

      public but.a<T> c(float $$0) {
         return this.a(bun.b, 0.0F, -$$0, 0.0F);
      }

      public but.a<T> d(float $$0) {
         return this.a(bun.c, 0.0F, $$0, 0.0F);
      }

      public but.a<T> a(bun $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public but.a<T> a(bun $$0, fbb $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public but.a<T> a() {
         this.e = false;
         return this;
      }

      public but.a<T> b() {
         this.d = false;
         return this;
      }

      public but.a<T> c() {
         this.f = true;
         return this;
      }

      public but.a<T> a(djn... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public but.a<T> d() {
         this.g = true;
         return this;
      }

      public but.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public but.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public but.a<T> a(crs... $$0) {
         this.m = crw.e.a($$0);
         return this;
      }

      public but.a<T> e() {
         this.n = akn.fixed(Optional.empty());
         return this;
      }

      public but<T> a(aku<but<?>> $$0) {
         if (this.d) {
            af.a(bhy.A, $$0.a().toString());
         }

         return new but<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bum> {
      T create(but<T> var1, dgj var2);
   }
}
