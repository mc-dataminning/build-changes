import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bxn<T extends bxe> implements cvp, egc<bxe, T> {
   private static final Logger bW = LogUtils.getLogger();
   private final jg.c<bxn<?>> bX = mh.f.f(this);
   public static final Codec<bxn<?>> a = mh.f.q();
   private static final float bY = 1.3964844F;
   private static final int bZ = 10;
   public static final bxn<cux> b = a("acacia_boat", bxn.a.a(a(() -> dao.oM), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> c = a("acacia_chest_boat", bxn.a.a(b(() -> dao.oN), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cle> d = a("allay", bxn.a.a(cle::new, byi.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bxn<bww> e = a("area_effect_cloud", bxn.a.<bww>a(bww::new, byi.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bxn<clh> f = a("armadillo", bxn.a.a(clh::new, byi.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bxn<coc> g = a("armor_stand", bxn.a.<coc>a(coc::new, byi.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bxn<cst> h = a("arrow", bxn.a.<cst>a(cst::new, byi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxn<clk> i = a("axolotl", bxn.a.a(clk::new, byi.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bxn<cuz> j = a("bamboo_chest_raft", bxn.a.a(d(() -> dao.oX), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cvm> k = a("bamboo_raft", bxn.a.a(c(() -> dao.oW), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cjo> l = a("bat", bxn.a.a(cjo::new, byi.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bxn<cjw> m = a("bee", bxn.a.a(cjw::new, byi.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bxn<cux> n = a("birch_boat", bxn.a.a(a(() -> dao.oI), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> o = a("birch_chest_boat", bxn.a.a(b(() -> dao.oJ), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cot> p = a("blaze", bxn.a.a(cot::new, byi.a).c().a(0.6F, 1.8F).a(8));
   public static final bxn<bxb.b> q = a("block_display", bxn.a.a(bxb.b::new, byi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxn<cou> r = a("bogged", bxn.a.a(cou::new, byi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bxn<cqg> s = a("breeze", bxn.a.a(cqg::new, byi.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bxn<ctv> t = a("breeze_wind_charge", bxn.a.<ctv>a(ctv::new, byi.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bxn<clp> u = a("camel", bxn.a.a(clp::new, byi.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bxn<cjy> v = a("cat", bxn.a.a(cjy::new, byi.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bxn<cov> w = a("cave_spider", bxn.a.a(cov::new, byi.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bxn<cux> x = a("cherry_boat", bxn.a.a(a(() -> dao.oO), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> y = a("cherry_chest_boat", bxn.a.a(b(() -> dao.oP), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cve> z = a("chest_minecart", bxn.a.a(cve::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<ckb> A = a("chicken", bxn.a.a(ckb::new, byi.b).a(0.4F, 0.7F).b(0.644F).a(new fgc(0.0, 0.7, -0.1)).a(10));
   public static final bxn<cke> B = a("cod", bxn.a.a(cke::new, byi.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bxn<cvf> C = a("command_block_minecart", bxn.a.a(cvf::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<ckf> D = a("cow", bxn.a.a(ckf::new, byi.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bxn<cqo> E = a("creaking", bxn.a.a(cqo::new, byi.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bxn<cow> F = a("creeper", bxn.a.a(cow::new, byi.a).a(0.6F, 1.7F).a(8));
   public static final bxn<cux> G = a("dark_oak_boat", bxn.a.a(a(() -> dao.oQ), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> H = a("dark_oak_chest_boat", bxn.a.a(b(() -> dao.oR), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cki> I = a("dolphin", bxn.a.a(cki::new, byi.f).a(0.9F, 0.6F).b(0.3F));
   public static final bxn<cmf> J = a("donkey", bxn.a.a(cmf::new, byi.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bxn<csu> K = a("dragon_fireball", bxn.a.<csu>a(csu::new, byi.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bxn<coy> L = a("drowned", bxn.a.a(coy::new, byi.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bxn<ctm> M = a("egg", bxn.a.<ctm>a(ctm::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<coz> N = a("elder_guardian", bxn.a.a(coz::new, byi.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bxn<cpa> O = a("enderman", bxn.a.a(cpa::new, byi.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bxn<cpb> P = a("endermite", bxn.a.a(cpb::new, byi.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bxn<cng> Q = a("ender_dragon", bxn.a.a(cng::new, byi.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bxn<ctn> R = a("ender_pearl", bxn.a.<ctn>a(ctn::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<cnf> S = a("end_crystal", bxn.a.<cnf>a(cnf::new, byi.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bxn<cpd> T = a("evoker", bxn.a.a(cpd::new, byi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxn<csv> U = a("evoker_fangs", bxn.a.<csv>a(csv::new, byi.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bxn<cto> V = a("experience_bottle", bxn.a.<cto>a(cto::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<bxs> W = a("experience_orb", bxn.a.<bxs>a(bxs::new, byi.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bxn<csw> X = a("eye_of_ender", bxn.a.<csw>a(csw::new, byi.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bxn<com> Y = a("falling_block", bxn.a.<com>a(com::new, byi.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bxn<ctb> Z = a("fireball", bxn.a.<ctb>a(ctb::new, byi.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bxn<csy> aa = a("firework_rocket", bxn.a.<csy>a(csy::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<ckk> ab = a("fox", bxn.a.a(ckk::new, byi.b).a(0.6F, 0.7F).b(0.4F).a(new fgc(0.0, 0.6375, -0.25)).a(8).a(dnq.oO));
   public static final bxn<cls> ac = a("frog", bxn.a.a(cls::new, byi.b).a(0.5F, 0.5F).a(new fgc(0.0, 0.375, -0.25)).a(10));
   public static final bxn<cvg> ad = a("furnace_minecart", bxn.a.a(cvg::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<cpe> ae = a("ghast", bxn.a.a(cpe::new, byi.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bxn<cpf> af = a("giant", bxn.a.a(cpf::new, byi.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bxn<coe> ag = a("glow_item_frame", bxn.a.<coe>a(coe::new, byi.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bxn<bxu> ah = a("glow_squid", bxn.a.a(bxu::new, byi.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bxn<cma> ai = a("goat", bxn.a.a(cma::new, byi.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bxn<cpg> aj = a("guardian", bxn.a.a(cpg::new, byi.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bxn<cqr> ak = a("hoglin", bxn.a.a(cqr::new, byi.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bxn<cvh> al = a("hopper_minecart", bxn.a.a(cvh::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<cmg> am = a("horse", bxn.a.a(cmg::new, byi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bxn<cph> an = a("husk", bxn.a.a(cph::new, byi.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bxn<cpi> ao = a("illusioner", bxn.a.a(cpi::new, byi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxn<bxz> ap = a("interaction", bxn.a.a(bxz::new, byi.h).e().a(0.0F, 0.0F).a(10));
   public static final bxn<ckl> aq = a("iron_golem", bxn.a.a(ckl::new, byi.h).a(1.4F, 2.7F).a(10));
   public static final bxn<coo> ar = a("item", bxn.a.<coo>a(coo::new, byi.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bxn<bxb.g> as = a("item_display", bxn.a.a(bxb.g::new, byi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxn<cog> at = a("item_frame", bxn.a.<cog>a(cog::new, byi.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bxn<cux> au = a("jungle_boat", bxn.a.a(a(() -> dao.oK), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> av = a("jungle_chest_boat", bxn.a.a(b(() -> dao.oL), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<coh> aw = a("leash_knot", bxn.a.<coh>a(coh::new, byi.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bxn<bye> ax = a("lightning_bolt", bxn.a.a(bye::new, byi.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bxn<cmh> ay = a("llama", bxn.a.a(cmh::new, byi.b).a(0.9F, 1.87F).b(1.7765F).a(new fgc(0.0, 1.37, -0.3)).a(10));
   public static final bxn<ctc> az = a("llama_spit", bxn.a.<ctc>a(ctc::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<cpj> aA = a("magma_cube", bxn.a.a(cpj::new, byi.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bxn<cux> aB = a("mangrove_boat", bxn.a.a(a(() -> dao.oU), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> aC = a("mangrove_chest_boat", bxn.a.a(b(() -> dao.oV), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<byg> aD = a("marker", bxn.a.a(byg::new, byi.h).e().a(0.0F, 0.0F).a(0));
   public static final bxn<cvc> aE = a("minecart", bxn.a.a(cvc::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<ckm> aF = a("mooshroom", bxn.a.a(ckm::new, byi.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bxn<cmj> aG = a("mule", bxn.a.a(cmj::new, byi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bxn<cux> aH = a("oak_boat", bxn.a.a(a(() -> dao.oE), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> aI = a("oak_chest_boat", bxn.a.a(b(() -> dao.oF), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<ckn> aJ = a("ocelot", bxn.a.a(ckn::new, byi.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bxn<byl> aK = a("ominous_item_spawner", bxn.a.a(byl::new, byi.h).e().a(0.25F, 0.25F).a(8));
   public static final bxn<coi> aL = a("painting", bxn.a.<coi>a(coi::new, byi.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bxn<cux> aM = a("pale_oak_boat", bxn.a.a(a(() -> dao.oS), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> aN = a("pale_oak_chest_boat", bxn.a.a(b(() -> dao.oT), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cko> aO = a("panda", bxn.a.a(cko::new, byi.b).a(1.3F, 1.25F).a(10));
   public static final bxn<ckp> aP = a("parrot", bxn.a.a(ckp::new, byi.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bxn<cpm> aQ = a("phantom", bxn.a.a(cpm::new, byi.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bxn<ckq> aR = a("pig", bxn.a.a(ckq::new, byi.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bxn<cqx> aS = a("piglin", bxn.a.a(cqx::new, byi.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bxn<cra> aT = a("piglin_brute", bxn.a.a(cra::new, byi.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bxn<cpn> aU = a("pillager", bxn.a.a(cpn::new, byi.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxn<ckt> aV = a("polar_bear", bxn.a.a(ckt::new, byi.b).a(dnq.rx).a(1.4F, 1.4F).a(10));
   public static final bxn<ctq> aW = a("splash_potion", bxn.a.<ctq>a(ctq::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<ctp> aX = a("lingering_potion", bxn.a.<ctp>a(ctp::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<cku> aY = a("pufferfish", bxn.a.a(cku::new, byi.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bxn<ckv> aZ = a("rabbit", bxn.a.a(ckv::new, byi.b).a(0.4F, 0.5F).a(8));
   public static final bxn<cpp> ba = a("ravager", bxn.a.a(cpp::new, byi.a).a(1.95F, 2.2F).a(new fgc(0.0, 2.2625, -0.0625)).a(10));
   public static final bxn<ckw> bb = a("salmon", bxn.a.a(ckw::new, byi.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bxn<cmr> bc = a("sheep", bxn.a.a(cmr::new, byi.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bxn<cpq> bd = a("shulker", bxn.a.a(cpq::new, byi.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bxn<ctg> be = a("shulker_bullet", bxn.a.<ctg>a(ctg::new, byi.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bxn<cpr> bf = a("silverfish", bxn.a.a(cpr::new, byi.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bxn<cps> bg = a("skeleton", bxn.a.a(cps::new, byi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bxn<cmk> bh = a("skeleton_horse", bxn.a.a(cmk::new, byi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bxn<cpt> bi = a("slime", bxn.a.a(cpt::new, byi.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bxn<cth> bj = a("small_fireball", bxn.a.<cth>a(cth::new, byi.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bxn<cmu> bk = a("sniffer", bxn.a.a(cmu::new, byi.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bxn<cti> bl = a("snowball", bxn.a.<cti>a(cti::new, byi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxn<cky> bm = a("snow_golem", bxn.a.a(cky::new, byi.h).a(dnq.rx).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bxn<cvi> bn = a("spawner_minecart", bxn.a.a(cvi::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<ctj> bo = a("spectral_arrow", bxn.a.<ctj>a(ctj::new, byi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxn<cpv> bp = a("spider", bxn.a.a(cpv::new, byi.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bxn<cux> bq = a("spruce_boat", bxn.a.a(a(() -> dao.oG), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<cuy> br = a("spruce_chest_boat", bxn.a.a(b(() -> dao.oH), byi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxn<ckz> bs = a("squid", bxn.a.a(ckz::new, byi.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bxn<cpw> bt = a("stray", bxn.a.a(cpw::new, byi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dnq.rx).a(8));
   public static final bxn<cpx> bu = a("strider", bxn.a.a(cpx::new, byi.b).c().a(0.9F, 1.7F).a(10));
   public static final bxn<clx> bv = a("tadpole", bxn.a.a(clx::new, byi.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bxn<bxb.k> bw = a("text_display", bxn.a.a(bxb.k::new, byi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxn<cop> bx = a("tnt", bxn.a.<cop>a(cop::new, byi.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bxn<cvj> by = a("tnt_minecart", bxn.a.a(cvj::new, byi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxn<cmm> bz = a("trader_llama", bxn.a.a(cmm::new, byi.b).a(0.9F, 1.87F).b(1.7765F).a(new fgc(0.0, 1.37, -0.3)).a(10));
   public static final bxn<ctr> bA = a("trident", bxn.a.<ctr>a(ctr::new, byi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxn<clb> bB = a("tropical_fish", bxn.a.a(clb::new, byi.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bxn<clc> bC = a("turtle", bxn.a.a(clc::new, byi.b).a(1.2F, 0.4F).a(new fgc(0.0, 0.55625, -0.25)).a(10));
   public static final bxn<cpy> bD = a("vex", bxn.a.a(cpy::new, byi.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bxn<cru> bE = a("villager", bxn.a.<cru>a(cru::new, byi.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bxn<cpz> bF = a("vindicator", bxn.a.a(cpz::new, byi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxn<csa> bG = a("wandering_trader", bxn.a.a(csa::new, byi.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bxn<crl> bH = a("warden", bxn.a.a(crl::new, byi.a).a(0.9F, 2.9F).a(3.15F).a(bxf.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bxn<ctw> bI = a("wind_charge", bxn.a.<ctw>a(ctw::new, byi.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bxn<cqa> bJ = a("witch", bxn.a.a(cqa::new, byi.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bxn<coa> bK = a("wither", bxn.a.a(coa::new, byi.a).c().a(dnq.cn).a(0.9F, 3.5F).a(10));
   public static final bxn<cqb> bL = a("wither_skeleton", bxn.a.a(cqb::new, byi.a).c().a(dnq.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bxn<cts> bM = a("wither_skull", bxn.a.<cts>a(cts::new, byi.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bxn<cmx> bN = a("wolf", bxn.a.a(cmx::new, byi.b).a(0.6F, 0.85F).b(0.68F).a(new fgc(0.0, 0.81875, -0.0625)).a(10));
   public static final bxn<cqc> bO = a("zoglin", bxn.a.a(cqc::new, byi.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bxn<cqd> bP = a("zombie", bxn.a.<cqd>a(cqd::new, byi.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bxn<cmo> bQ = a("zombie_horse", bxn.a.a(cmo::new, byi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bxn<cqe> bR = a("zombie_villager", bxn.a.a(cqe::new, byi.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bxn<cqf> bS = a("zombified_piglin", bxn.a.a(cqf::new, byi.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bxn<csi> bT = a("player", bxn.a.<csi>a(byi.h).b().a().a(0.6F, 1.8F).b(1.62F).a(csi.bI).a(32).b(2));
   public static final bxn<csz> bU = a("fishing_bobber", bxn.a.<csz>a(csz::new, byi.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bxn<?>> ca = Set.of(Y, C, bn);
   private final bxn.b<T> cb;
   private final byi cc;
   private final ImmutableSet<dno> cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final boolean ch;
   private final int ci;
   private final int cj;
   private final String ck;
   @Nullable
   private xg cl;
   private final Optional<alq<fay>> cm;
   private final bxh cn;
   private final float co;
   private final cvs cp;

   private static <T extends bxe> bxn<T> a(alq<bxn<?>> $$0, bxn.a<T> $$1) {
      return jt.a(mh.f, $$0, $$1.a($$0));
   }

   private static alq<bxn<?>> b(String $$0) {
      return alq.a(mi.B, alr.b($$0));
   }

   private static <T extends bxe> bxn<T> a(String $$0, bxn.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alr a(bxn<?> $$0) {
      return mh.f.b($$0);
   }

   public static Optional<bxn<?>> a(String $$0) {
      return mh.f.b(alr.c($$0));
   }

   public bxn(
      bxn.b<T> $$0,
      byi $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dno> $$6,
      bxh $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alq<fay>> $$12,
      cvs $$13
   ) {
      this.cb = $$0;
      this.cc = $$1;
      this.ch = $$5;
      this.ce = $$2;
      this.cf = $$3;
      this.cg = $$4;
      this.cd = $$6;
      this.cn = $$7;
      this.co = $$8;
      this.ci = $$9;
      this.cj = $$10;
      this.ck = $$11;
      this.cm = $$12;
      this.cp = $$13;
   }

   @Nullable
   public T a(asb $$0, @Nullable dak $$1, @Nullable byf $$2, iw $$3, bxm $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bxe> Consumer<T> a(dkj $$0, dak $$1, @Nullable byf $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bxe> Consumer<T> a(Consumer<T> $$0, dkj $$1, dak $$2, @Nullable byf $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bxe> Consumer<T> a(Consumer<T> $$0, dak $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bxe> Consumer<T> b(Consumer<T> $$0, dkj $$1, dak $$2, @Nullable byf $$3) {
      dcs $$4 = $$2.a(kl.Y, dcs.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(asb $$0, iw $$1, bxm $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(asb $$0, @Nullable Consumer<T> $$1, iw $$2, bxm $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof byh $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(asb $$0, @Nullable Consumer<T> $$1, iw $$2, bxm $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azz.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof byh $$9) {
            $$9.aX = $$9.dL();
            $$9.aV = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dkm $$0, iw $$1, boolean $$2, ffx $$3) {
      ffx $$4 = new ffx($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fgw> $$5 = $$0.d(null, $$4);
      return 1.0 + fgt.a(jc.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dkj $$0, @Nullable byf $$1, @Nullable bxe $$2, dcs $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bxn<?> $$5 = $$3.a($$4.ba(), mi.B);
         if ($$2.an() == $$5) {
            if ($$0.C || !$$2.an().s() || $$1 instanceof csi $$6 && $$4.ag().f($$6.gi())) {
               $$3.a($$2);
            }
         }
      }
   }

   public boolean b() {
      return this.ce;
   }

   public boolean c() {
      return this.cf;
   }

   public boolean d() {
      return this.cg;
   }

   public boolean e() {
      return this.ch;
   }

   public byi f() {
      return this.cc;
   }

   public String g() {
      return this.ck;
   }

   public xg h() {
      if (this.cl == null) {
         this.cl = xg.c(this.g());
      }

      return this.cl;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<alq<fay>> j() {
      return this.cm;
   }

   public float l() {
      return this.cn.a();
   }

   public float m() {
      return this.cn.b();
   }

   @Override
   public cvs k() {
      return this.cp;
   }

   @Nullable
   public T a(dkj $$0, bxm $$1) {
      return !this.a($$0.K()) ? null : this.cb.create(this, $$0);
   }

   public static Optional<bxe> a(ua $$0, dkj $$1, bxm $$2) {
      return ag.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.i($$0), () -> bW.warn("Skipping Entity with id {}", $$0.b("id", "[invalid]")));
   }

   public ffx a(double $$0, double $$1, double $$2) {
      float $$3 = this.co * this.l() / 2.0F;
      float $$4 = this.co * this.m();
      return new ffx($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(ebq $$0) {
      if (this.cd.contains($$0.b())) {
         return false;
      } else {
         return !this.cg && eyn.a($$0) ? true : $$0.a(dnq.cn) || $$0.a(dnq.oO) || $$0.a(dnq.eg) || $$0.a(dnq.rx);
      }
   }

   public bxh n() {
      return this.cn;
   }

   public static Optional<bxn<?>> a(ua $$0) {
      return $$0.a("id", a);
   }

   @Nullable
   public static bxe a(ua $$0, dkj $$1, bxm $$2, Function<bxe, bxe> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         ug $$5 = $$0.p("Passengers");

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            bxe $$7 = a($$5.b($$6), $$1, $$2, $$3);
            if ($$7 != null) {
               $$7.a($$4, true);
            }
         }

         return (bxe)$$4;
      }).orElse(null);
   }

   public static Stream<bxe> a(List<? extends va> $$0, dkj $$1, bxm $$2) {
      return $$0.stream().flatMap($$0x -> $$0x.s_().stream()).mapMulti(($$2x, $$3) -> a($$2x, $$1, $$2, $$1xx -> {
            $$3.accept($$1xx);
            return $$1xx;
         }));
   }

   private static Optional<bxe> b(ua $$0, dkj $$1, bxm $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bW.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.ci;
   }

   public int p() {
      return this.cj;
   }

   public boolean q() {
      return this != bT && this != az && this != bK && this != l && this != at && this != ag && this != aw && this != aL && this != S && this != U;
   }

   public boolean a(ayc<bxn<?>> $$0) {
      return this.bX.a($$0);
   }

   public boolean a(jk<bxn<?>> $$0) {
      return $$0.a(this.bX);
   }

   @Nullable
   public T a(bxe $$0) {
      return (T)($$0.an() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bxe> a() {
      return bxe.class;
   }

   @Deprecated
   public jg.c<bxn<?>> r() {
      return this.bX;
   }

   private static bxn.b<cux> a(Supplier<dag> $$0) {
      return ($$1, $$2) -> new cux($$1, $$2, $$0);
   }

   private static bxn.b<cuy> b(Supplier<dag> $$0) {
      return ($$1, $$2) -> new cuy($$1, $$2, $$0);
   }

   private static bxn.b<cvm> c(Supplier<dag> $$0) {
      return ($$1, $$2) -> new cvm($$1, $$2, $$0);
   }

   private static bxn.b<cuz> d(Supplier<dag> $$0) {
      return ($$1, $$2) -> new cuz($$1, $$2, $$0);
   }

   public boolean s() {
      return ca.contains(this);
   }

   public static class a<T extends bxe> {
      private final bxn.b<T> a;
      private final byi b;
      private ImmutableSet<dno> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bxh j = bxh.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bxg.a l = bxg.a();
      private cvs m = cvu.g;
      private alj<bxn<?>, Optional<alq<fay>>> n = $$0x -> Optional.of(alq.a(mi.br, $$0x.a().f("entities/")));
      private final alj<bxn<?>, String> o = $$0x -> ag.a("entity", $$0x.a());

      private a(bxn.b<T> $$0, byi $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == byi.b || $$1 == byi.h;
      }

      public static <T extends bxe> bxn.a<T> a(bxn.b<T> $$0, byi $$1) {
         return new bxn.a<>($$0, $$1);
      }

      public static <T extends bxe> bxn.a<T> a(byi $$0) {
         return new bxn.a<>(($$0x, $$1) -> null, $$0);
      }

      public bxn.a<T> a(float $$0, float $$1) {
         this.j = bxh.b($$0, $$1);
         return this;
      }

      public bxn.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bxn.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bxn.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bxf.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bxn.a<T> a(fgc... $$0) {
         for (fgc $$1 : $$0) {
            this.l = this.l.a(bxf.a, $$1);
         }

         return this;
      }

      public bxn.a<T> a(fgc $$0) {
         return this.a(bxf.b, $$0);
      }

      public bxn.a<T> c(float $$0) {
         return this.a(bxf.b, 0.0F, -$$0, 0.0F);
      }

      public bxn.a<T> d(float $$0) {
         return this.a(bxf.c, 0.0F, $$0, 0.0F);
      }

      public bxn.a<T> a(bxf $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bxn.a<T> a(bxf $$0, fgc $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bxn.a<T> a() {
         this.e = false;
         return this;
      }

      public bxn.a<T> b() {
         this.d = false;
         return this;
      }

      public bxn.a<T> c() {
         this.f = true;
         return this;
      }

      public bxn.a<T> a(dno... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bxn.a<T> d() {
         this.g = true;
         return this;
      }

      public bxn.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bxn.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bxn.a<T> a(cvq... $$0) {
         this.m = cvu.e.a($$0);
         return this;
      }

      public bxn.a<T> e() {
         this.n = alj.fixed(Optional.empty());
         return this;
      }

      public bxn<T> a(alq<bxn<?>> $$0) {
         if (this.d) {
            ag.a(bjm.C, $$0.a().toString());
         }

         return new bxn<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bxe> {
      @Nullable
      T create(bxn<T> var1, dkj var2);
   }
}
