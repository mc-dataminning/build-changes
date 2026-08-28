import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class buq<T extends buj> implements cro, ebf<buj, T> {
   private static final Logger bU = LogUtils.getLogger();
   private final jr.c<buq<?>> bV = mb.f.f(this);
   private static final float bW = 1.3964844F;
   private static final int bX = 10;
   public static final buq<cqw> a = a("acacia_boat", buq.a.a(a(() -> cwr.oF), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> b = a("acacia_chest_boat", buq.a.a(b(() -> cwr.oG), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cic> c = a("allay", buq.a.a(cic::new, bvi.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final buq<buc> d = a("area_effect_cloud", buq.a.<buc>a(buc::new, bvi.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final buq<cif> e = a("armadillo", buq.a.a(cif::new, bvi.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final buq<ckp> f = a("armor_stand", buq.a.<ckp>a(ckp::new, bvi.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final buq<cpe> g = a("arrow", buq.a.<cpe>a(cpe::new, bvi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final buq<cii> h = a("axolotl", buq.a.a(cii::new, bvi.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final buq<cqy> i = a("bamboo_chest_raft", buq.a.a(d(() -> cwr.oQ), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<crl> j = a("bamboo_raft", buq.a.a(c(() -> cwr.oP), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cgq> k = a("bat", buq.a.a(cgq::new, bvi.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final buq<cgx> l = a("bee", buq.a.a(cgx::new, bvi.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final buq<cqw> m = a("birch_boat", buq.a.a(a(() -> cwr.oB), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> n = a("birch_chest_boat", buq.a.a(b(() -> cwr.oC), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<clf> o = a("blaze", buq.a.a(clf::new, bvi.a).c().a(0.6F, 1.8F).a(8));
   public static final buq<buh.b> p = a("block_display", buq.a.a(buh.b::new, bvi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final buq<clg> q = a("bogged", buq.a.a(clg::new, bvi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final buq<cms> r = a("breeze", buq.a.a(cms::new, bvi.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final buq<cqf> s = a("breeze_wind_charge", buq.a.<cqf>a(cqf::new, bvi.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final buq<cin> t = a("camel", buq.a.a(cin::new, bvi.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final buq<cgz> u = a("cat", buq.a.a(cgz::new, bvi.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final buq<clh> v = a("cave_spider", buq.a.a(clh::new, bvi.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final buq<cqw> w = a("cherry_boat", buq.a.a(a(() -> cwr.oH), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> x = a("cherry_chest_boat", buq.a.a(b(() -> cwr.oI), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<crd> y = a("chest_minecart", buq.a.a(crd::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<chb> z = a("chicken", buq.a.a(chb::new, bvi.b).a(0.4F, 0.7F).b(0.644F).a(new fay(0.0, 0.7, -0.1)).a(10));
   public static final buq<chc> A = a("cod", buq.a.a(chc::new, bvi.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final buq<cre> B = a("command_block_minecart", buq.a.a(cre::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<chd> C = a("cow", buq.a.a(chd::new, bvi.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final buq<cna> D = a("creaking", buq.a.a(cna::new, bvi.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final buq<cli> E = a("creeper", buq.a.a(cli::new, bvi.a).a(0.6F, 1.7F).a(8));
   public static final buq<cqw> F = a("dark_oak_boat", buq.a.a(a(() -> cwr.oJ), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> G = a("dark_oak_chest_boat", buq.a.a(b(() -> cwr.oK), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<che> H = a("dolphin", buq.a.a(che::new, bvi.f).a(0.9F, 0.6F).b(0.3F));
   public static final buq<cjb> I = a("donkey", buq.a.a(cjb::new, bvi.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final buq<cpf> J = a("dragon_fireball", buq.a.<cpf>a(cpf::new, bvi.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final buq<clk> K = a("drowned", buq.a.a(clk::new, bvi.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final buq<cpx> L = a("egg", buq.a.<cpx>a(cpx::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<cll> M = a("elder_guardian", buq.a.a(cll::new, bvi.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final buq<clm> N = a("enderman", buq.a.a(clm::new, bvi.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final buq<cln> O = a("endermite", buq.a.a(cln::new, bvi.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final buq<cjt> P = a("ender_dragon", buq.a.a(cjt::new, bvi.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final buq<cpy> Q = a("ender_pearl", buq.a.<cpy>a(cpy::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<cjs> R = a("end_crystal", buq.a.<cjs>a(cjs::new, bvi.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final buq<clp> S = a("evoker", buq.a.a(clp::new, bvi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final buq<cpg> T = a("evoker_fangs", buq.a.<cpg>a(cpg::new, bvi.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final buq<cpz> U = a("experience_bottle", buq.a.<cpz>a(cpz::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<buv> V = a("experience_orb", buq.a.<buv>a(buv::new, bvi.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final buq<cph> W = a("eye_of_ender", buq.a.<cph>a(cph::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final buq<ckz> X = a("falling_block", buq.a.<ckz>a(ckz::new, bvi.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final buq<cpm> Y = a("fireball", buq.a.<cpm>a(cpm::new, bvi.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final buq<cpj> Z = a("firework_rocket", buq.a.<cpj>a(cpj::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<chg> aa = a("fox", buq.a.a(chg::new, bvi.b).a(0.6F, 0.7F).b(0.4F).a(new fay(0.0, 0.6375, -0.25)).a(8).a(djm.oK));
   public static final buq<ciq> ab = a("frog", buq.a.a(ciq::new, bvi.b).a(0.5F, 0.5F).a(new fay(0.0, 0.375, -0.25)).a(10));
   public static final buq<crf> ac = a("furnace_minecart", buq.a.a(crf::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<clq> ad = a("ghast", buq.a.a(clq::new, bvi.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final buq<clr> ae = a("giant", buq.a.a(clr::new, bvi.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final buq<ckr> af = a("glow_item_frame", buq.a.<ckr>a(ckr::new, bvi.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final buq<bux> ag = a("glow_squid", buq.a.a(bux::new, bvi.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final buq<ciw> ah = a("goat", buq.a.a(ciw::new, bvi.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final buq<cls> ai = a("guardian", buq.a.a(cls::new, bvi.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final buq<cnd> aj = a("hoglin", buq.a.a(cnd::new, bvi.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final buq<crg> ak = a("hopper_minecart", buq.a.a(crg::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<cjc> al = a("horse", buq.a.a(cjc::new, bvi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final buq<clt> am = a("husk", buq.a.a(clt::new, bvi.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final buq<clu> an = a("illusioner", buq.a.a(clu::new, bvi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final buq<bva> ao = a("interaction", buq.a.a(bva::new, bvi.h).e().a(0.0F, 0.0F).a(10));
   public static final buq<chi> ap = a("iron_golem", buq.a.a(chi::new, bvi.h).a(1.4F, 2.7F).a(10));
   public static final buq<cla> aq = a("item", buq.a.<cla>a(cla::new, bvi.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final buq<buh.g> ar = a("item_display", buq.a.a(buh.g::new, bvi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final buq<ckt> as = a("item_frame", buq.a.<ckt>a(ckt::new, bvi.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final buq<cqw> at = a("jungle_boat", buq.a.a(a(() -> cwr.oD), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> au = a("jungle_chest_boat", buq.a.a(b(() -> cwr.oE), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cku> av = a("leash_knot", buq.a.<cku>a(cku::new, bvi.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final buq<bve> aw = a("lightning_bolt", buq.a.a(bve::new, bvi.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final buq<cjd> ax = a("llama", buq.a.a(cjd::new, bvi.b).a(0.9F, 1.87F).b(1.7765F).a(new fay(0.0, 1.37, -0.3)).a(10));
   public static final buq<cpn> ay = a("llama_spit", buq.a.<cpn>a(cpn::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<clv> az = a("magma_cube", buq.a.a(clv::new, bvi.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final buq<cqw> aA = a("mangrove_boat", buq.a.a(a(() -> cwr.oN), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> aB = a("mangrove_chest_boat", buq.a.a(b(() -> cwr.oO), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<bvg> aC = a("marker", buq.a.a(bvg::new, bvi.h).e().a(0.0F, 0.0F).a(0));
   public static final buq<crb> aD = a("minecart", buq.a.a(crb::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<chj> aE = a("mooshroom", buq.a.a(chj::new, bvi.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final buq<cjf> aF = a("mule", buq.a.a(cjf::new, bvi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final buq<cqw> aG = a("oak_boat", buq.a.a(a(() -> cwr.ox), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> aH = a("oak_chest_boat", buq.a.a(b(() -> cwr.oy), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<chk> aI = a("ocelot", buq.a.a(chk::new, bvi.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final buq<bvl> aJ = a("ominous_item_spawner", buq.a.a(bvl::new, bvi.h).e().a(0.25F, 0.25F).a(8));
   public static final buq<ckv> aK = a("painting", buq.a.<ckv>a(ckv::new, bvi.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final buq<cqw> aL = a("pale_oak_boat", buq.a.a(a(() -> cwr.oL), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> aM = a("pale_oak_chest_boat", buq.a.a(b(() -> cwr.oM), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<chl> aN = a("panda", buq.a.a(chl::new, bvi.b).a(1.3F, 1.25F).a(10));
   public static final buq<chm> aO = a("parrot", buq.a.a(chm::new, bvi.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final buq<cly> aP = a("phantom", buq.a.a(cly::new, bvi.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final buq<chn> aQ = a("pig", buq.a.a(chn::new, bvi.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final buq<cnj> aR = a("piglin", buq.a.a(cnj::new, bvi.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final buq<cnm> aS = a("piglin_brute", buq.a.a(cnm::new, bvi.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final buq<clz> aT = a("pillager", buq.a.a(clz::new, bvi.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final buq<cho> aU = a("polar_bear", buq.a.a(cho::new, bvi.b).a(djm.rr).a(1.4F, 1.4F).a(10));
   public static final buq<cqa> aV = a("potion", buq.a.<cqa>a(cqa::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<chp> aW = a("pufferfish", buq.a.a(chp::new, bvi.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final buq<chq> aX = a("rabbit", buq.a.a(chq::new, bvi.b).a(0.4F, 0.5F).a(8));
   public static final buq<cmb> aY = a("ravager", buq.a.a(cmb::new, bvi.a).a(1.95F, 2.2F).a(new fay(0.0, 2.2625, -0.0625)).a(10));
   public static final buq<chr> aZ = a("salmon", buq.a.a(chr::new, bvi.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final buq<chs> ba = a("sheep", buq.a.a(chs::new, bvi.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final buq<cmc> bb = a("shulker", buq.a.a(cmc::new, bvi.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final buq<cpr> bc = a("shulker_bullet", buq.a.<cpr>a(cpr::new, bvi.h).e().a(0.3125F, 0.3125F).a(8));
   public static final buq<cmd> bd = a("silverfish", buq.a.a(cmd::new, bvi.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final buq<cme> be = a("skeleton", buq.a.a(cme::new, bvi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final buq<cjg> bf = a("skeleton_horse", buq.a.a(cjg::new, bvi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final buq<cmf> bg = a("slime", buq.a.a(cmf::new, bvi.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final buq<cps> bh = a("small_fireball", buq.a.<cps>a(cps::new, bvi.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final buq<cjn> bi = a("sniffer", buq.a.a(cjn::new, bvi.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final buq<cpt> bj = a("snowball", buq.a.<cpt>a(cpt::new, bvi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final buq<chu> bk = a("snow_golem", buq.a.a(chu::new, bvi.h).a(djm.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final buq<crh> bl = a("spawner_minecart", buq.a.a(crh::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<cpu> bm = a("spectral_arrow", buq.a.<cpu>a(cpu::new, bvi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final buq<cmh> bn = a("spider", buq.a.a(cmh::new, bvi.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final buq<cqw> bo = a("spruce_boat", buq.a.a(a(() -> cwr.oz), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<cqx> bp = a("spruce_chest_boat", buq.a.a(b(() -> cwr.oA), bvi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final buq<chv> bq = a("squid", buq.a.a(chv::new, bvi.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final buq<cmi> br = a("stray", buq.a.a(cmi::new, bvi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(djm.rr).a(8));
   public static final buq<cmj> bs = a("strider", buq.a.a(cmj::new, bvi.b).c().a(0.9F, 1.7F).a(10));
   public static final buq<cit> bt = a("tadpole", buq.a.a(cit::new, bvi.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final buq<buh.l> bu = a("text_display", buq.a.a(buh.l::new, bvi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final buq<clb> bv = a("tnt", buq.a.<clb>a(clb::new, bvi.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final buq<cri> bw = a("tnt_minecart", buq.a.a(cri::new, bvi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final buq<cji> bx = a("trader_llama", buq.a.a(cji::new, bvi.b).a(0.9F, 1.87F).b(1.7765F).a(new fay(0.0, 1.37, -0.3)).a(10));
   public static final buq<cqb> by = a("trident", buq.a.<cqb>a(cqb::new, bvi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final buq<chw> bz = a("tropical_fish", buq.a.a(chw::new, bvi.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final buq<chx> bA = a("turtle", buq.a.a(chx::new, bvi.b).a(1.2F, 0.4F).a(new fay(0.0, 0.55625, -0.25)).a(10));
   public static final buq<cmk> bB = a("vex", buq.a.a(cmk::new, bvi.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final buq<cog> bC = a("villager", buq.a.<cog>a(cog::new, bvi.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final buq<cml> bD = a("vindicator", buq.a.a(cml::new, bvi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final buq<com> bE = a("wandering_trader", buq.a.a(com::new, bvi.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final buq<cnx> bF = a("warden", buq.a.a(cnx::new, bvi.a).a(0.9F, 2.9F).a(3.15F).a(buk.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final buq<cqg> bG = a("wind_charge", buq.a.<cqg>a(cqg::new, bvi.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final buq<cmm> bH = a("witch", buq.a.a(cmm::new, bvi.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final buq<ckn> bI = a("wither", buq.a.a(ckn::new, bvi.a).c().a(djm.ck).a(0.9F, 3.5F).a(10));
   public static final buq<cmn> bJ = a("wither_skeleton", buq.a.a(cmn::new, bvi.a).c().a(djm.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final buq<cqc> bK = a("wither_skull", buq.a.<cqc>a(cqc::new, bvi.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final buq<chz> bL = a("wolf", buq.a.a(chz::new, bvi.b).a(0.6F, 0.85F).b(0.68F).a(new fay(0.0, 0.81875, -0.0625)).a(10));
   public static final buq<cmo> bM = a("zoglin", buq.a.a(cmo::new, bvi.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final buq<cmp> bN = a("zombie", buq.a.<cmp>a(cmp::new, bvi.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final buq<cjk> bO = a("zombie_horse", buq.a.a(cjk::new, bvi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final buq<cmq> bP = a("zombie_villager", buq.a.a(cmq::new, bvi.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final buq<cmr> bQ = a("zombified_piglin", buq.a.a(cmr::new, bvi.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final buq<cov> bR = a("player", buq.a.<cov>a(bvi.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cov.bU).a(32).b(2));
   public static final buq<cpk> bS = a("fishing_bobber", buq.a.<cpk>a(cpk::new, bvi.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final buq.b<T> bY;
   private final bvi bZ;
   private final ImmutableSet<djk> ca;
   private final boolean cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final int cf;
   private final int cg;
   private final String ch;
   @Nullable
   private wo ci;
   private final Optional<akt<evu>> cj;
   private final bum ck;
   private final float cl;
   private final crr cm;

   private static <T extends buj> buq<T> a(akt<buq<?>> $$0, buq.a<T> $$1) {
      return ke.a(mb.f, $$0, $$1.a($$0));
   }

   private static akt<buq<?>> b(String $$0) {
      return akt.a(mc.z, aku.b($$0));
   }

   private static <T extends buj> buq<T> a(String $$0, buq.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static aku a(buq<?> $$0) {
      return mb.f.b($$0);
   }

   public static Optional<buq<?>> a(String $$0) {
      return mb.f.b(aku.c($$0));
   }

   public buq(
      buq.b<T> $$0,
      bvi $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<djk> $$6,
      bum $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<akt<evu>> $$12,
      crr $$13
   ) {
      this.bY = $$0;
      this.bZ = $$1;
      this.ce = $$5;
      this.cb = $$2;
      this.cc = $$3;
      this.cd = $$4;
      this.ca = $$6;
      this.ck = $$7;
      this.cl = $$8;
      this.cf = $$9;
      this.cg = $$10;
      this.ch = $$11;
      this.cj = $$12;
      this.cm = $$13;
   }

   @Nullable
   public T a(arc $$0, @Nullable cwn $$1, @Nullable cov $$2, ji $$3, bup $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends buj> Consumer<T> a(dgg $$0, cwn $$1, @Nullable cov $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends buj> Consumer<T> a(Consumer<T> $$0, dgg $$1, cwn $$2, @Nullable cov $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends buj> Consumer<T> a(Consumer<T> $$0, cwn $$1) {
      wo $$2 = $$1.a(kv.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends buj> Consumer<T> b(Consumer<T> $$0, dgg $$1, cwn $$2, @Nullable cov $$3) {
      cyw $$4 = $$2.a(kv.W, cyw.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arc $$0, ji $$1, bup $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arc $$0, @Nullable Consumer<T> $$1, ji $$2, bup $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bvh $$7) {
            $$7.R();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(arc $$0, @Nullable Consumer<T> $$1, ji $$2, bup $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayy.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvh $$9) {
            $$9.aZ = $$9.dM();
            $$9.aX = $$9.dM();
            $$9.a($$0, $$0.d_($$9.dw()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dgj $$0, ji $$1, boolean $$2, fat $$3) {
      fat $$4 = new fat($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fbs> $$5 = $$0.d(null, $$4);
      return 1.0 + fbp.a(jn.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgg $$0, @Nullable cov $$1, @Nullable buj $$2, cyw $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cW() || $$1 != null && $$4.ag().f($$1.gh())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.cb;
   }

   public boolean c() {
      return this.cc;
   }

   public boolean d() {
      return this.cd;
   }

   public boolean e() {
      return this.ce;
   }

   public bvi f() {
      return this.bZ;
   }

   public String g() {
      return this.ch;
   }

   public wo h() {
      if (this.ci == null) {
         this.ci = wo.c(this.g());
      }

      return this.ci;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<akt<evu>> k() {
      return this.cj;
   }

   public float l() {
      return this.ck.a();
   }

   public float m() {
      return this.ck.b();
   }

   @Override
   public crr i() {
      return this.cm;
   }

   @Nullable
   public T a(dgg $$0, bup $$1) {
      return !this.a($$0.K()) ? null : this.bY.create(this, $$0);
   }

   public static Optional<buj> a(tq $$0, dgg $$1, bup $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bU.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fat a(double $$0, double $$1, double $$2) {
      float $$3 = this.cl * this.l() / 2.0F;
      float $$4 = this.cl * this.m();
      return new fat($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dwv $$0) {
      if (this.ca.contains($$0.b())) {
         return false;
      } else {
         return !this.cd && etk.a($$0) ? true : $$0.a(djm.ck) || $$0.a(djm.oK) || $$0.a(djm.ed) || $$0.a(djm.rr);
      }
   }

   public bum n() {
      return this.ck;
   }

   public static Optional<buq<?>> a(tq $$0) {
      return mb.f.b(aku.a($$0.l("id")));
   }

   @Nullable
   public static buj a(tq $$0, dgg $$1, bup $$2, Function<buj, buj> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            tw $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               buj $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (buj)$$4;
      }).orElse(null);
   }

   public static Stream<buj> a(final List<? extends un> $$0, final dgg $$1, final bup $$2) {
      final Spliterator<? extends un> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<buj>() {
         @Override
         public boolean tryAdvance(Consumer<? super buj> $$0x) {
            return $$3.tryAdvance($$3xx -> buq.a((tq)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<buj> trySplit() {
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

   private static Optional<buj> b(tq $$0, dgg $$1, bup $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bU.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.cf;
   }

   public int p() {
      return this.cg;
   }

   public boolean q() {
      return this != bR && this != ay && this != bI && this != k && this != as && this != af && this != av && this != aK && this != R && this != T;
   }

   public boolean a(axe<buq<?>> $$0) {
      return this.bV.a($$0);
   }

   public boolean a(jv<buq<?>> $$0) {
      return $$0.a(this.bV);
   }

   @Nullable
   public T a(buj $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends buj> a() {
      return buj.class;
   }

   @Deprecated
   public jr.c<buq<?>> r() {
      return this.bV;
   }

   private static buq.b<cqw> a(Supplier<cwj> $$0) {
      return ($$1, $$2) -> new cqw($$1, $$2, $$0);
   }

   private static buq.b<cqx> b(Supplier<cwj> $$0) {
      return ($$1, $$2) -> new cqx($$1, $$2, $$0);
   }

   private static buq.b<crl> c(Supplier<cwj> $$0) {
      return ($$1, $$2) -> new crl($$1, $$2, $$0);
   }

   private static buq.b<cqy> d(Supplier<cwj> $$0) {
      return ($$1, $$2) -> new cqy($$1, $$2, $$0);
   }

   public static class a<T extends buj> {
      private final buq.b<T> a;
      private final bvi b;
      private ImmutableSet<djk> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bum j = bum.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bul.a l = bul.a();
      private crr m = crt.g;
      private akm<buq<?>, Optional<akt<evu>>> n = $$0x -> Optional.of(akt.a(mc.bg, $$0x.a().f("entities/")));
      private akm<buq<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(buq.b<T> $$0, bvi $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvi.b || $$1 == bvi.h;
      }

      public static <T extends buj> buq.a<T> a(buq.b<T> $$0, bvi $$1) {
         return new buq.a<>($$0, $$1);
      }

      public static <T extends buj> buq.a<T> a(bvi $$0) {
         return new buq.a<>(($$0x, $$1) -> null, $$0);
      }

      public buq.a<T> a(float $$0, float $$1) {
         this.j = bum.b($$0, $$1);
         return this;
      }

      public buq.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public buq.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public buq.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(buk.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public buq.a<T> a(fay... $$0) {
         for (fay $$1 : $$0) {
            this.l = this.l.a(buk.a, $$1);
         }

         return this;
      }

      public buq.a<T> a(fay $$0) {
         return this.a(buk.b, $$0);
      }

      public buq.a<T> c(float $$0) {
         return this.a(buk.b, 0.0F, -$$0, 0.0F);
      }

      public buq.a<T> d(float $$0) {
         return this.a(buk.c, 0.0F, $$0, 0.0F);
      }

      public buq.a<T> a(buk $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public buq.a<T> a(buk $$0, fay $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public buq.a<T> a() {
         this.e = false;
         return this;
      }

      public buq.a<T> b() {
         this.d = false;
         return this;
      }

      public buq.a<T> c() {
         this.f = true;
         return this;
      }

      public buq.a<T> a(djk... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public buq.a<T> d() {
         this.g = true;
         return this;
      }

      public buq.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public buq.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public buq.a<T> a(crp... $$0) {
         this.m = crt.e.a($$0);
         return this;
      }

      public buq.a<T> e() {
         this.n = akm.fixed(Optional.empty());
         return this;
      }

      public buq<T> a(akt<buq<?>> $$0) {
         if (this.d) {
            af.a(bhv.A, $$0.a().toString());
         }

         return new buq<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends buj> {
      T create(buq<T> var1, dgg var2);
   }
}
