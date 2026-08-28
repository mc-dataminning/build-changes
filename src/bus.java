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

public class bus<T extends bul> implements crn, eaf<bul, T> {
   private static final Logger bR = LogUtils.getLogger();
   private final jq.c<bus<?>> bS = lz.f.f(this);
   private static final float bT = 1.3964844F;
   private static final int bU = 10;
   public static final bus<cqv> a = a("acacia_boat", bus.a.a(a(() -> cwq.od), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> b = a("acacia_chest_boat", bus.a.a(b(() -> cwq.oe), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cie> c = a("allay", bus.a.a(cie::new, bvk.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bus<bue> d = a("area_effect_cloud", bus.a.<bue>a(bue::new, bvk.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bus<cih> e = a("armadillo", bus.a.a(cih::new, bvk.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bus<ckr> f = a("armor_stand", bus.a.<ckr>a(ckr::new, bvk.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bus<cpd> g = a("arrow", bus.a.<cpd>a(cpd::new, bvk.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bus<cik> h = a("axolotl", bus.a.a(cik::new, bvk.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bus<cqx> i = a("bamboo_chest_raft", bus.a.a(d(() -> cwq.om), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<crk> j = a("bamboo_raft", bus.a.a(c(() -> cwq.ol), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cgs> k = a("bat", bus.a.a(cgs::new, bvk.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bus<cgz> l = a("bee", bus.a.a(cgz::new, bvk.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bus<cqv> m = a("birch_boat", bus.a.a(a(() -> cwq.nZ), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> n = a("birch_chest_boat", bus.a.a(b(() -> cwq.oa), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<clh> o = a("blaze", bus.a.a(clh::new, bvk.a).c().a(0.6F, 1.8F).a(8));
   public static final bus<buj.b> p = a("block_display", bus.a.a(buj.b::new, bvk.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bus<cli> q = a("bogged", bus.a.a(cli::new, bvk.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bus<cmu> r = a("breeze", bus.a.a(cmu::new, bvk.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bus<cqe> s = a("breeze_wind_charge", bus.a.<cqe>a(cqe::new, bvk.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bus<cip> t = a("camel", bus.a.a(cip::new, bvk.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bus<chb> u = a("cat", bus.a.a(chb::new, bvk.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bus<clj> v = a("cave_spider", bus.a.a(clj::new, bvk.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bus<cqv> w = a("cherry_boat", bus.a.a(a(() -> cwq.of), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> x = a("cherry_chest_boat", bus.a.a(b(() -> cwq.og), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<crc> y = a("chest_minecart", bus.a.a(crc::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<chd> z = a("chicken", bus.a.a(chd::new, bvk.b).a(0.4F, 0.7F).b(0.644F).a(new ezy(0.0, 0.7, -0.1)).a(10));
   public static final bus<che> A = a("cod", bus.a.a(che::new, bvk.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bus<crd> B = a("command_block_minecart", bus.a.a(crd::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<chf> C = a("cow", bus.a.a(chf::new, bvk.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bus<clk> D = a("creeper", bus.a.a(clk::new, bvk.a).a(0.6F, 1.7F).a(8));
   public static final bus<cqv> E = a("dark_oak_boat", bus.a.a(a(() -> cwq.oh), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> F = a("dark_oak_chest_boat", bus.a.a(b(() -> cwq.oi), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chg> G = a("dolphin", bus.a.a(chg::new, bvk.f).a(0.9F, 0.6F).b(0.3F));
   public static final bus<cjd> H = a("donkey", bus.a.a(cjd::new, bvk.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bus<cpe> I = a("dragon_fireball", bus.a.<cpe>a(cpe::new, bvk.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bus<clm> J = a("drowned", bus.a.a(clm::new, bvk.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cpw> K = a("egg", bus.a.<cpw>a(cpw::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<cln> L = a("elder_guardian", bus.a.a(cln::new, bvk.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bus<clo> M = a("enderman", bus.a.a(clo::new, bvk.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bus<clp> N = a("endermite", bus.a.a(clp::new, bvk.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bus<cjv> O = a("ender_dragon", bus.a.a(cjv::new, bvk.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bus<cpx> P = a("ender_pearl", bus.a.<cpx>a(cpx::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<cju> Q = a("end_crystal", bus.a.<cju>a(cju::new, bvk.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bus<clr> R = a("evoker", bus.a.a(clr::new, bvk.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<cpf> S = a("evoker_fangs", bus.a.<cpf>a(cpf::new, bvk.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bus<cpy> T = a("experience_bottle", bus.a.<cpy>a(cpy::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<bux> U = a("experience_orb", bus.a.<bux>a(bux::new, bvk.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bus<cpg> V = a("eye_of_ender", bus.a.<cpg>a(cpg::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bus<clb> W = a("falling_block", bus.a.<clb>a(clb::new, bvk.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bus<cpl> X = a("fireball", bus.a.<cpl>a(cpl::new, bvk.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bus<cpi> Y = a("firework_rocket", bus.a.<cpi>a(cpi::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<chi> Z = a("fox", bus.a.a(chi::new, bvk.b).a(0.6F, 0.7F).b(0.4F).a(new ezy(0.0, 0.6375, -0.25)).a(8).a(dis.oi));
   public static final bus<cis> aa = a("frog", bus.a.a(cis::new, bvk.b).a(0.5F, 0.5F).a(new ezy(0.0, 0.375, -0.25)).a(10));
   public static final bus<cre> ab = a("furnace_minecart", bus.a.a(cre::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cls> ac = a("ghast", bus.a.a(cls::new, bvk.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bus<clt> ad = a("giant", bus.a.a(clt::new, bvk.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bus<ckt> ae = a("glow_item_frame", bus.a.<ckt>a(ckt::new, bvk.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bus<buz> af = a("glow_squid", bus.a.a(buz::new, bvk.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bus<ciy> ag = a("goat", bus.a.a(ciy::new, bvk.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bus<clu> ah = a("guardian", bus.a.a(clu::new, bvk.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bus<cnc> ai = a("hoglin", bus.a.a(cnc::new, bvk.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bus<crf> aj = a("hopper_minecart", bus.a.a(crf::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cje> ak = a("horse", bus.a.a(cje::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bus<clv> al = a("husk", bus.a.a(clv::new, bvk.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bus<clw> am = a("illusioner", bus.a.a(clw::new, bvk.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<bvc> an = a("interaction", bus.a.a(bvc::new, bvk.h).e().a(0.0F, 0.0F).a(10));
   public static final bus<chk> ao = a("iron_golem", bus.a.a(chk::new, bvk.h).a(1.4F, 2.7F).a(10));
   public static final bus<clc> ap = a("item", bus.a.<clc>a(clc::new, bvk.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bus<buj.g> aq = a("item_display", bus.a.a(buj.g::new, bvk.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bus<ckv> ar = a("item_frame", bus.a.<ckv>a(ckv::new, bvk.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bus<cqv> as = a("jungle_boat", bus.a.a(a(() -> cwq.ob), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> at = a("jungle_chest_boat", bus.a.a(b(() -> cwq.oc), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<ckw> au = a("leash_knot", bus.a.<ckw>a(ckw::new, bvk.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bus<bvg> av = a("lightning_bolt", bus.a.a(bvg::new, bvk.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bus<cjf> aw = a("llama", bus.a.a(cjf::new, bvk.b).a(0.9F, 1.87F).b(1.7765F).a(new ezy(0.0, 1.37, -0.3)).a(10));
   public static final bus<cpm> ax = a("llama_spit", bus.a.<cpm>a(cpm::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<clx> ay = a("magma_cube", bus.a.a(clx::new, bvk.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bus<cqv> az = a("mangrove_boat", bus.a.a(a(() -> cwq.oj), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> aA = a("mangrove_chest_boat", bus.a.a(b(() -> cwq.ok), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<bvi> aB = a("marker", bus.a.a(bvi::new, bvk.h).e().a(0.0F, 0.0F).a(0));
   public static final bus<cra> aC = a("minecart", bus.a.a(cra::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<chl> aD = a("mooshroom", bus.a.a(chl::new, bvk.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bus<cjh> aE = a("mule", bus.a.a(cjh::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bus<cqv> aF = a("oak_boat", bus.a.a(a(() -> cwq.nV), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> aG = a("oak_chest_boat", bus.a.a(b(() -> cwq.nW), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chm> aH = a("ocelot", bus.a.a(chm::new, bvk.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bus<bvn> aI = a("ominous_item_spawner", bus.a.a(bvn::new, bvk.h).e().a(0.25F, 0.25F).a(8));
   public static final bus<ckx> aJ = a("painting", bus.a.<ckx>a(ckx::new, bvk.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bus<chn> aK = a("panda", bus.a.a(chn::new, bvk.b).a(1.3F, 1.25F).a(10));
   public static final bus<cho> aL = a("parrot", bus.a.a(cho::new, bvk.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bus<cma> aM = a("phantom", bus.a.a(cma::new, bvk.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bus<chp> aN = a("pig", bus.a.a(chp::new, bvk.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bus<cni> aO = a("piglin", bus.a.a(cni::new, bvk.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cnl> aP = a("piglin_brute", bus.a.a(cnl::new, bvk.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cmb> aQ = a("pillager", bus.a.a(cmb::new, bvk.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<chq> aR = a("polar_bear", bus.a.a(chq::new, bvk.b).a(dis.qP).a(1.4F, 1.4F).a(10));
   public static final bus<cpz> aS = a("potion", bus.a.<cpz>a(cpz::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<chr> aT = a("pufferfish", bus.a.a(chr::new, bvk.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bus<chs> aU = a("rabbit", bus.a.a(chs::new, bvk.b).a(0.4F, 0.5F).a(8));
   public static final bus<cmd> aV = a("ravager", bus.a.a(cmd::new, bvk.a).a(1.95F, 2.2F).a(new ezy(0.0, 2.2625, -0.0625)).a(10));
   public static final bus<cht> aW = a("salmon", bus.a.a(cht::new, bvk.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bus<chu> aX = a("sheep", bus.a.a(chu::new, bvk.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bus<cme> aY = a("shulker", bus.a.a(cme::new, bvk.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bus<cpq> aZ = a("shulker_bullet", bus.a.<cpq>a(cpq::new, bvk.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bus<cmf> ba = a("silverfish", bus.a.a(cmf::new, bvk.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bus<cmg> bb = a("skeleton", bus.a.a(cmg::new, bvk.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bus<cji> bc = a("skeleton_horse", bus.a.a(cji::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bus<cmh> bd = a("slime", bus.a.a(cmh::new, bvk.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bus<cpr> be = a("small_fireball", bus.a.<cpr>a(cpr::new, bvk.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bus<cjp> bf = a("sniffer", bus.a.a(cjp::new, bvk.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bus<cps> bg = a("snowball", bus.a.<cps>a(cps::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<chw> bh = a("snow_golem", bus.a.a(chw::new, bvk.h).a(dis.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bus<crg> bi = a("spawner_minecart", bus.a.a(crg::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cpt> bj = a("spectral_arrow", bus.a.<cpt>a(cpt::new, bvk.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bus<cmj> bk = a("spider", bus.a.a(cmj::new, bvk.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bus<cqv> bl = a("spruce_boat", bus.a.a(a(() -> cwq.nX), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqw> bm = a("spruce_chest_boat", bus.a.a(b(() -> cwq.nY), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chx> bn = a("squid", bus.a.a(chx::new, bvk.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bus<cmk> bo = a("stray", bus.a.a(cmk::new, bvk.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dis.qP).a(8));
   public static final bus<cml> bp = a("strider", bus.a.a(cml::new, bvk.b).c().a(0.9F, 1.7F).a(10));
   public static final bus<civ> bq = a("tadpole", bus.a.a(civ::new, bvk.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bus<buj.l> br = a("text_display", bus.a.a(buj.l::new, bvk.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bus<cld> bs = a("tnt", bus.a.<cld>a(cld::new, bvk.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bus<crh> bt = a("tnt_minecart", bus.a.a(crh::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cjk> bu = a("trader_llama", bus.a.a(cjk::new, bvk.b).a(0.9F, 1.87F).b(1.7765F).a(new ezy(0.0, 1.37, -0.3)).a(10));
   public static final bus<cqa> bv = a("trident", bus.a.<cqa>a(cqa::new, bvk.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bus<chy> bw = a("tropical_fish", bus.a.a(chy::new, bvk.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bus<chz> bx = a("turtle", bus.a.a(chz::new, bvk.b).a(1.2F, 0.4F).a(new ezy(0.0, 0.55625, -0.25)).a(10));
   public static final bus<cmm> by = a("vex", bus.a.a(cmm::new, bvk.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bus<cof> bz = a("villager", bus.a.<cof>a(cof::new, bvk.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bus<cmn> bA = a("vindicator", bus.a.a(cmn::new, bvk.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<col> bB = a("wandering_trader", bus.a.a(col::new, bvk.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bus<cnw> bC = a("warden", bus.a.a(cnw::new, bvk.a).a(0.9F, 2.9F).a(3.15F).a(bum.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bus<cqf> bD = a("wind_charge", bus.a.<cqf>a(cqf::new, bvk.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bus<cmo> bE = a("witch", bus.a.a(cmo::new, bvk.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bus<ckp> bF = a("wither", bus.a.a(ckp::new, bvk.a).c().a(dis.cd).a(0.9F, 3.5F).a(10));
   public static final bus<cmp> bG = a("wither_skeleton", bus.a.a(cmp::new, bvk.a).c().a(dis.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bus<cqb> bH = a("wither_skull", bus.a.<cqb>a(cqb::new, bvk.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bus<cib> bI = a("wolf", bus.a.a(cib::new, bvk.b).a(0.6F, 0.85F).b(0.68F).a(new ezy(0.0, 0.81875, -0.0625)).a(10));
   public static final bus<cmq> bJ = a("zoglin", bus.a.a(cmq::new, bvk.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bus<cmr> bK = a("zombie", bus.a.<cmr>a(cmr::new, bvk.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cjm> bL = a("zombie_horse", bus.a.a(cjm::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bus<cms> bM = a("zombie_villager", bus.a.a(cms::new, bvk.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bus<cmt> bN = a("zombified_piglin", bus.a.a(cmt::new, bvk.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bus<cou> bO = a("player", bus.a.<cou>a(bvk.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cou.bU).a(32).b(2));
   public static final bus<cpj> bP = a("fishing_bobber", bus.a.<cpj>a(cpj::new, bvk.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bus.b<T> bV;
   private final bvk bW;
   private final ImmutableSet<diq> bX;
   private final boolean bY;
   private final boolean bZ;
   private final boolean ca;
   private final boolean cb;
   private final int cc;
   private final int cd;
   private final String ce;
   @Nullable
   private xj cf;
   private final Optional<ali<eus>> cg;
   private final buo ch;
   private final float ci;
   private final crq cj;

   private static <T extends bul> bus<T> a(ali<bus<?>> $$0, bus.a<T> $$1) {
      return kd.a(lz.f, $$0, $$1.a($$0));
   }

   private static ali<bus<?>> b(String $$0) {
      return ali.a(ma.z, alj.b($$0));
   }

   private static <T extends bul> bus<T> a(String $$0, bus.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alj a(bus<?> $$0) {
      return lz.f.b($$0);
   }

   public static Optional<bus<?>> a(String $$0) {
      return lz.f.b(alj.c($$0));
   }

   public bus(
      bus.b<T> $$0,
      bvk $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<diq> $$6,
      buo $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<ali<eus>> $$12,
      crq $$13
   ) {
      this.bV = $$0;
      this.bW = $$1;
      this.cb = $$5;
      this.bY = $$2;
      this.bZ = $$3;
      this.ca = $$4;
      this.bX = $$6;
      this.ch = $$7;
      this.ci = $$8;
      this.cc = $$9;
      this.cd = $$10;
      this.ce = $$11;
      this.cg = $$12;
      this.cj = $$13;
   }

   @Nullable
   public T a(arp $$0, @Nullable cwm $$1, @Nullable cou $$2, jh $$3, bur $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bul> Consumer<T> a(dfm $$0, cwm $$1, @Nullable cou $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bul> Consumer<T> a(Consumer<T> $$0, dfm $$1, cwm $$2, @Nullable cou $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bul> Consumer<T> a(Consumer<T> $$0, cwm $$1) {
      xj $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bul> Consumer<T> b(Consumer<T> $$0, dfm $$1, cwm $$2, @Nullable cou $$3) {
      cyv $$4 = $$2.a(ku.W, cyv.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arp $$0, jh $$1, bur $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arp $$0, @Nullable Consumer<T> $$1, jh $$2, bur $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arp $$0, @Nullable Consumer<T> $$1, jh $$2, bur $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azm.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvj $$9) {
            $$9.aY = $$9.dL();
            $$9.aW = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
            $$9.R();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dfp $$0, jh $$1, boolean $$2, ezt $$3) {
      ezt $$4 = new ezt($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fas> $$5 = $$0.d(null, $$4);
      return 1.0 + fap.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dfm $$0, @Nullable cou $$1, @Nullable bul $$2, cyv $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cW() || $$1 != null && $$4.ag().f($$1.gf())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bY;
   }

   public boolean c() {
      return this.bZ;
   }

   public boolean d() {
      return this.ca;
   }

   public boolean e() {
      return this.cb;
   }

   public bvk f() {
      return this.bW;
   }

   public String g() {
      return this.ce;
   }

   public xj h() {
      if (this.cf == null) {
         this.cf = xj.c(this.g());
      }

      return this.cf;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<ali<eus>> k() {
      return this.cg;
   }

   public float l() {
      return this.ch.a();
   }

   public float m() {
      return this.ch.b();
   }

   @Override
   public crq i() {
      return this.cj;
   }

   @Nullable
   public T a(dfm $$0, bur $$1) {
      return !this.a($$0.J()) ? null : this.bV.create(this, $$0);
   }

   public static Optional<bul> a(ul $$0, dfm $$1, bur $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bR.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ezt a(double $$0, double $$1, double $$2) {
      float $$3 = this.ci * this.l() / 2.0F;
      float $$4 = this.ci * this.m();
      return new ezt($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dvv $$0) {
      if (this.bX.contains($$0.b())) {
         return false;
      } else {
         return !this.ca && esi.a($$0) ? true : $$0.a(dis.cd) || $$0.a(dis.oi) || $$0.a(dis.dQ) || $$0.a(dis.qP);
      }
   }

   public buo n() {
      return this.ch;
   }

   public static Optional<bus<?>> a(ul $$0) {
      return lz.f.b(alj.a($$0.l("id")));
   }

   @Nullable
   public static bul a(ul $$0, dfm $$1, bur $$2, Function<bul, bul> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            ur $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bul $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bul)$$4;
      }).orElse(null);
   }

   public static Stream<bul> a(final List<? extends vi> $$0, final dfm $$1, final bur $$2) {
      final Spliterator<? extends vi> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bul>() {
         @Override
         public boolean tryAdvance(Consumer<? super bul> $$0x) {
            return $$3.tryAdvance($$3xx -> bus.a((ul)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bul> trySplit() {
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

   private static Optional<bul> b(ul $$0, dfm $$1, bur $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bR.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.cc;
   }

   public int p() {
      return this.cd;
   }

   public boolean q() {
      return this != bO && this != ax && this != bF && this != k && this != ar && this != ae && this != au && this != aJ && this != Q && this != S;
   }

   public boolean a(axs<bus<?>> $$0) {
      return this.bS.a($$0);
   }

   public boolean a(ju<bus<?>> $$0) {
      return $$0.a(this.bS);
   }

   @Nullable
   public T a(bul $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bul> a() {
      return bul.class;
   }

   @Deprecated
   public jq.c<bus<?>> r() {
      return this.bS;
   }

   private static bus.b<cqv> a(Supplier<cwi> $$0) {
      return ($$1, $$2) -> new cqv($$1, $$2, $$0);
   }

   private static bus.b<cqw> b(Supplier<cwi> $$0) {
      return ($$1, $$2) -> new cqw($$1, $$2, $$0);
   }

   private static bus.b<crk> c(Supplier<cwi> $$0) {
      return ($$1, $$2) -> new crk($$1, $$2, $$0);
   }

   private static bus.b<cqx> d(Supplier<cwi> $$0) {
      return ($$1, $$2) -> new cqx($$1, $$2, $$0);
   }

   public static class a<T extends bul> {
      private final bus.b<T> a;
      private final bvk b;
      private ImmutableSet<diq> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private buo j = buo.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bun.a l = bun.a();
      private crq m = crs.g;
      private alb<bus<?>, Optional<ali<eus>>> n = $$0x -> Optional.of(ali.a(ma.bd, $$0x.a().f("entities/")));
      private alb<bus<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bus.b<T> $$0, bvk $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvk.b || $$1 == bvk.h;
      }

      public static <T extends bul> bus.a<T> a(bus.b<T> $$0, bvk $$1) {
         return new bus.a<>($$0, $$1);
      }

      public static <T extends bul> bus.a<T> a(bvk $$0) {
         return new bus.a<>(($$0x, $$1) -> null, $$0);
      }

      public bus.a<T> a(float $$0, float $$1) {
         this.j = buo.b($$0, $$1);
         return this;
      }

      public bus.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bus.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bus.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bum.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bus.a<T> a(ezy... $$0) {
         for (ezy $$1 : $$0) {
            this.l = this.l.a(bum.a, $$1);
         }

         return this;
      }

      public bus.a<T> a(ezy $$0) {
         return this.a(bum.b, $$0);
      }

      public bus.a<T> c(float $$0) {
         return this.a(bum.b, 0.0F, -$$0, 0.0F);
      }

      public bus.a<T> d(float $$0) {
         return this.a(bum.c, 0.0F, $$0, 0.0F);
      }

      public bus.a<T> a(bum $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bus.a<T> a(bum $$0, ezy $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bus.a<T> a() {
         this.e = false;
         return this;
      }

      public bus.a<T> b() {
         this.d = false;
         return this;
      }

      public bus.a<T> c() {
         this.f = true;
         return this;
      }

      public bus.a<T> a(diq... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bus.a<T> d() {
         this.g = true;
         return this;
      }

      public bus.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bus.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bus.a<T> a(cro... $$0) {
         this.m = crs.e.a($$0);
         return this;
      }

      public bus.a<T> e() {
         this.n = alb.fixed(Optional.empty());
         return this;
      }

      public bus<T> a(ali<bus<?>> $$0) {
         if (this.d) {
            ae.a(bia.A, $$0.a().toString());
         }

         return new bus<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bul> {
      T create(bus<T> var1, dfm var2);
   }
}
