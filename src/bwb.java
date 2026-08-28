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

public class bwb<T extends bvs> implements ctb, ecy<bvs, T> {
   private static final Logger bU = LogUtils.getLogger();
   private final js.c<bwb<?>> bV = md.f.f(this);
   private static final float bW = 1.3964844F;
   private static final int bX = 10;
   public static final bwb<csj> a = a("acacia_boat", bwb.a.a(a(() -> cyc.oH), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> b = a("acacia_chest_boat", bwb.a.a(b(() -> cyc.oI), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<cjp> c = a("allay", bwb.a.a(cjp::new, bwu.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bwb<bvk> d = a("area_effect_cloud", bwb.a.<bvk>a(bvk::new, bwu.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwb<cjs> e = a("armadillo", bwb.a.a(cjs::new, bwu.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bwb<cmc> f = a("armor_stand", bwb.a.<cmc>a(cmc::new, bwu.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bwb<cqr> g = a("arrow", bwb.a.<cqr>a(cqr::new, bwu.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwb<cjv> h = a("axolotl", bwb.a.a(cjv::new, bwu.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bwb<csl> i = a("bamboo_chest_raft", bwb.a.a(d(() -> cyc.oS), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csy> j = a("bamboo_raft", bwb.a.a(c(() -> cyc.oR), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<cia> k = a("bat", bwb.a.a(cia::new, bwu.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bwb<cih> l = a("bee", bwb.a.a(cih::new, bwu.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bwb<csj> m = a("birch_boat", bwb.a.a(a(() -> cyc.oD), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> n = a("birch_chest_boat", bwb.a.a(b(() -> cyc.oE), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<cms> o = a("blaze", bwb.a.a(cms::new, bwu.a).c().a(0.6F, 1.8F).a(8));
   public static final bwb<bvp.b> p = a("block_display", bwb.a.a(bvp.b::new, bwu.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwb<cmt> q = a("bogged", bwb.a.a(cmt::new, bwu.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwb<cof> r = a("breeze", bwb.a.a(cof::new, bwu.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bwb<crs> s = a("breeze_wind_charge", bwb.a.<crs>a(crs::new, bwu.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwb<cka> t = a("camel", bwb.a.a(cka::new, bwu.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bwb<cij> u = a("cat", bwb.a.a(cij::new, bwu.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bwb<cmu> v = a("cave_spider", bwb.a.a(cmu::new, bwu.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bwb<csj> w = a("cherry_boat", bwb.a.a(a(() -> cyc.oJ), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> x = a("cherry_chest_boat", bwb.a.a(b(() -> cyc.oK), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csq> y = a("chest_minecart", bwb.a.a(csq::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<cil> z = a("chicken", bwb.a.a(cil::new, bwu.b).a(0.4F, 0.7F).b(0.644F).a(new fcu(0.0, 0.7, -0.1)).a(10));
   public static final bwb<cim> A = a("cod", bwb.a.a(cim::new, bwu.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bwb<csr> B = a("command_block_minecart", bwb.a.a(csr::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<cin> C = a("cow", bwb.a.a(cin::new, bwu.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwb<coo> D = a("creaking", bwb.a.a(coo::new, bwu.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bwb<cmv> E = a("creeper", bwb.a.a(cmv::new, bwu.a).a(0.6F, 1.7F).a(8));
   public static final bwb<csj> F = a("dark_oak_boat", bwb.a.a(a(() -> cyc.oL), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> G = a("dark_oak_chest_boat", bwb.a.a(b(() -> cyc.oM), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<cio> H = a("dolphin", bwb.a.a(cio::new, bwu.f).a(0.9F, 0.6F).b(0.3F));
   public static final bwb<cko> I = a("donkey", bwb.a.a(cko::new, bwu.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bwb<cqs> J = a("dragon_fireball", bwb.a.<cqs>a(cqs::new, bwu.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwb<cmx> K = a("drowned", bwb.a.a(cmx::new, bwu.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwb<crk> L = a("egg", bwb.a.<crk>a(crk::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<cmy> M = a("elder_guardian", bwb.a.a(cmy::new, bwu.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bwb<cmz> N = a("enderman", bwb.a.a(cmz::new, bwu.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bwb<cna> O = a("endermite", bwb.a.a(cna::new, bwu.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwb<clg> P = a("ender_dragon", bwb.a.a(clg::new, bwu.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bwb<crl> Q = a("ender_pearl", bwb.a.<crl>a(crl::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<clf> R = a("end_crystal", bwb.a.<clf>a(clf::new, bwu.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwb<cnc> S = a("evoker", bwb.a.a(cnc::new, bwu.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwb<cqt> T = a("evoker_fangs", bwb.a.<cqt>a(cqt::new, bwu.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bwb<crm> U = a("experience_bottle", bwb.a.<crm>a(crm::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<bwg> V = a("experience_orb", bwb.a.<bwg>a(bwg::new, bwu.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bwb<cqu> W = a("eye_of_ender", bwb.a.<cqu>a(cqu::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bwb<cmm> X = a("falling_block", bwb.a.<cmm>a(cmm::new, bwu.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bwb<cqz> Y = a("fireball", bwb.a.<cqz>a(cqz::new, bwu.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwb<cqw> Z = a("firework_rocket", bwb.a.<cqw>a(cqw::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<ciq> aa = a("fox", bwb.a.a(ciq::new, bwu.b).a(0.6F, 0.7F).b(0.4F).a(new fcu(0.0, 0.6375, -0.25)).a(8).a(dkw.oK));
   public static final bwb<ckd> ab = a("frog", bwb.a.a(ckd::new, bwu.b).a(0.5F, 0.5F).a(new fcu(0.0, 0.375, -0.25)).a(10));
   public static final bwb<css> ac = a("furnace_minecart", bwb.a.a(css::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<cnd> ad = a("ghast", bwb.a.a(cnd::new, bwu.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bwb<cne> ae = a("giant", bwb.a.a(cne::new, bwu.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bwb<cme> af = a("glow_item_frame", bwb.a.<cme>a(cme::new, bwu.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwb<bwi> ag = a("glow_squid", bwb.a.a(bwi::new, bwu.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bwb<ckj> ah = a("goat", bwb.a.a(ckj::new, bwu.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bwb<cnf> ai = a("guardian", bwb.a.a(cnf::new, bwu.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bwb<cor> aj = a("hoglin", bwb.a.a(cor::new, bwu.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwb<cst> ak = a("hopper_minecart", bwb.a.a(cst::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<ckp> al = a("horse", bwb.a.a(ckp::new, bwu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bwb<cng> am = a("husk", bwb.a.a(cng::new, bwu.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bwb<cnh> an = a("illusioner", bwb.a.a(cnh::new, bwu.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwb<bwl> ao = a("interaction", bwb.a.a(bwl::new, bwu.h).e().a(0.0F, 0.0F).a(10));
   public static final bwb<cis> ap = a("iron_golem", bwb.a.a(cis::new, bwu.h).a(1.4F, 2.7F).a(10));
   public static final bwb<cmn> aq = a("item", bwb.a.<cmn>a(cmn::new, bwu.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bwb<bvp.g> ar = a("item_display", bwb.a.a(bvp.g::new, bwu.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwb<cmg> as = a("item_frame", bwb.a.<cmg>a(cmg::new, bwu.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwb<csj> at = a("jungle_boat", bwb.a.a(a(() -> cyc.oF), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> au = a("jungle_chest_boat", bwb.a.a(b(() -> cyc.oG), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<cmh> av = a("leash_knot", bwb.a.<cmh>a(cmh::new, bwu.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bwb<bwq> aw = a("lightning_bolt", bwb.a.a(bwq::new, bwu.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwb<ckq> ax = a("llama", bwb.a.a(ckq::new, bwu.b).a(0.9F, 1.87F).b(1.7765F).a(new fcu(0.0, 1.37, -0.3)).a(10));
   public static final bwb<cra> ay = a("llama_spit", bwb.a.<cra>a(cra::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<cni> az = a("magma_cube", bwb.a.a(cni::new, bwu.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bwb<csj> aA = a("mangrove_boat", bwb.a.a(a(() -> cyc.oP), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> aB = a("mangrove_chest_boat", bwb.a.a(b(() -> cyc.oQ), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<bws> aC = a("marker", bwb.a.a(bws::new, bwu.h).e().a(0.0F, 0.0F).a(0));
   public static final bwb<cso> aD = a("minecart", bwb.a.a(cso::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<cit> aE = a("mooshroom", bwb.a.a(cit::new, bwu.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwb<cks> aF = a("mule", bwb.a.a(cks::new, bwu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bwb<csj> aG = a("oak_boat", bwb.a.a(a(() -> cyc.oz), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> aH = a("oak_chest_boat", bwb.a.a(b(() -> cyc.oA), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<ciu> aI = a("ocelot", bwb.a.a(ciu::new, bwu.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bwb<bwx> aJ = a("ominous_item_spawner", bwb.a.a(bwx::new, bwu.h).e().a(0.25F, 0.25F).a(8));
   public static final bwb<cmi> aK = a("painting", bwb.a.<cmi>a(cmi::new, bwu.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwb<csj> aL = a("pale_oak_boat", bwb.a.a(a(() -> cyc.oN), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> aM = a("pale_oak_chest_boat", bwb.a.a(b(() -> cyc.oO), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<civ> aN = a("panda", bwb.a.a(civ::new, bwu.b).a(1.3F, 1.25F).a(10));
   public static final bwb<ciw> aO = a("parrot", bwb.a.a(ciw::new, bwu.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bwb<cnl> aP = a("phantom", bwb.a.a(cnl::new, bwu.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bwb<cix> aQ = a("pig", bwb.a.a(cix::new, bwu.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bwb<cox> aR = a("piglin", bwb.a.a(cox::new, bwu.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwb<cpa> aS = a("piglin_brute", bwb.a.a(cpa::new, bwu.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwb<cnm> aT = a("pillager", bwb.a.a(cnm::new, bwu.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwb<cja> aU = a("polar_bear", bwb.a.a(cja::new, bwu.b).a(dkw.rt).a(1.4F, 1.4F).a(10));
   public static final bwb<crn> aV = a("potion", bwb.a.<crn>a(crn::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<cjb> aW = a("pufferfish", bwb.a.a(cjb::new, bwu.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bwb<cjc> aX = a("rabbit", bwb.a.a(cjc::new, bwu.b).a(0.4F, 0.5F).a(8));
   public static final bwb<cno> aY = a("ravager", bwb.a.a(cno::new, bwu.a).a(1.95F, 2.2F).a(new fcu(0.0, 2.2625, -0.0625)).a(10));
   public static final bwb<cjd> aZ = a("salmon", bwb.a.a(cjd::new, bwu.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bwb<cje> ba = a("sheep", bwb.a.a(cje::new, bwu.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bwb<cnp> bb = a("shulker", bwb.a.a(cnp::new, bwu.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bwb<cre> bc = a("shulker_bullet", bwb.a.<cre>a(cre::new, bwu.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bwb<cnq> bd = a("silverfish", bwb.a.a(cnq::new, bwu.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwb<cnr> be = a("skeleton", bwb.a.a(cnr::new, bwu.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwb<ckt> bf = a("skeleton_horse", bwb.a.a(ckt::new, bwu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwb<cns> bg = a("slime", bwb.a.a(cns::new, bwu.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bwb<crf> bh = a("small_fireball", bwb.a.<crf>a(crf::new, bwu.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwb<cla> bi = a("sniffer", bwb.a.a(cla::new, bwu.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bwb<crg> bj = a("snowball", bwb.a.<crg>a(crg::new, bwu.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwb<cjg> bk = a("snow_golem", bwb.a.a(cjg::new, bwu.h).a(dkw.rt).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bwb<csu> bl = a("spawner_minecart", bwb.a.a(csu::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<crh> bm = a("spectral_arrow", bwb.a.<crh>a(crh::new, bwu.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwb<cnu> bn = a("spider", bwb.a.a(cnu::new, bwu.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bwb<csj> bo = a("spruce_boat", bwb.a.a(a(() -> cyc.oB), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<csk> bp = a("spruce_chest_boat", bwb.a.a(b(() -> cyc.oC), bwu.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwb<cjh> bq = a("squid", bwb.a.a(cjh::new, bwu.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bwb<cnv> br = a("stray", bwb.a.a(cnv::new, bwu.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dkw.rt).a(8));
   public static final bwb<cnw> bs = a("strider", bwb.a.a(cnw::new, bwu.b).c().a(0.9F, 1.7F).a(10));
   public static final bwb<ckg> bt = a("tadpole", bwb.a.a(ckg::new, bwu.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bwb<bvp.k> bu = a("text_display", bwb.a.a(bvp.k::new, bwu.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwb<cmo> bv = a("tnt", bwb.a.<cmo>a(cmo::new, bwu.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bwb<csv> bw = a("tnt_minecart", bwb.a.a(csv::new, bwu.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwb<ckv> bx = a("trader_llama", bwb.a.a(ckv::new, bwu.b).a(0.9F, 1.87F).b(1.7765F).a(new fcu(0.0, 1.37, -0.3)).a(10));
   public static final bwb<cro> by = a("trident", bwb.a.<cro>a(cro::new, bwu.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwb<cjj> bz = a("tropical_fish", bwb.a.a(cjj::new, bwu.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bwb<cjk> bA = a("turtle", bwb.a.a(cjk::new, bwu.b).a(1.2F, 0.4F).a(new fcu(0.0, 0.55625, -0.25)).a(10));
   public static final bwb<cnx> bB = a("vex", bwb.a.a(cnx::new, bwu.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bwb<cpu> bC = a("villager", bwb.a.<cpu>a(cpu::new, bwu.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwb<cny> bD = a("vindicator", bwb.a.a(cny::new, bwu.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwb<cqa> bE = a("wandering_trader", bwb.a.a(cqa::new, bwu.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwb<cpl> bF = a("warden", bwb.a.a(cpl::new, bwu.a).a(0.9F, 2.9F).a(3.15F).a(bvt.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bwb<crt> bG = a("wind_charge", bwb.a.<crt>a(crt::new, bwu.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwb<cnz> bH = a("witch", bwb.a.a(cnz::new, bwu.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bwb<cma> bI = a("wither", bwb.a.a(cma::new, bwu.a).c().a(dkw.ck).a(0.9F, 3.5F).a(10));
   public static final bwb<coa> bJ = a("wither_skeleton", bwb.a.a(coa::new, bwu.a).c().a(dkw.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bwb<crp> bK = a("wither_skull", bwb.a.<crp>a(crp::new, bwu.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwb<cjm> bL = a("wolf", bwb.a.a(cjm::new, bwu.b).a(0.6F, 0.85F).b(0.68F).a(new fcu(0.0, 0.81875, -0.0625)).a(10));
   public static final bwb<cob> bM = a("zoglin", bwb.a.a(cob::new, bwu.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwb<coc> bN = a("zombie", bwb.a.<coc>a(coc::new, bwu.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwb<ckx> bO = a("zombie_horse", bwb.a.a(ckx::new, bwu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwb<cod> bP = a("zombie_villager", bwb.a.a(cod::new, bwu.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bwb<coe> bQ = a("zombified_piglin", bwb.a.a(coe::new, bwu.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bwb<cqi> bR = a("player", bwb.a.<cqi>a(bwu.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cqi.bG).a(32).b(2));
   public static final bwb<cqx> bS = a("fishing_bobber", bwb.a.<cqx>a(cqx::new, bwu.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bwb<?>> bY = Set.of(X, B, bl);
   private final bwb.b<T> bZ;
   private final bwu ca;
   private final ImmutableSet<dku> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private wv cj;
   private final Optional<alc<exq>> ck;
   private final bvv cl;
   private final float cm;
   private final cte cn;

   private static <T extends bvs> bwb<T> a(alc<bwb<?>> $$0, bwb.a<T> $$1) {
      return kf.a(md.f, $$0, $$1.a($$0));
   }

   private static alc<bwb<?>> b(String $$0) {
      return alc.a(me.z, ald.b($$0));
   }

   private static <T extends bvs> bwb<T> a(String $$0, bwb.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static ald a(bwb<?> $$0) {
      return md.f.b($$0);
   }

   public static Optional<bwb<?>> a(String $$0) {
      return md.f.b(ald.c($$0));
   }

   public bwb(
      bwb.b<T> $$0,
      bwu $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dku> $$6,
      bvv $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alc<exq>> $$12,
      cte $$13
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
   public T a(arn $$0, @Nullable cxy $$1, @Nullable bwr $$2, jj $$3, bwa $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bvs> Consumer<T> a(dhp $$0, cxy $$1, @Nullable bwr $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bvs> Consumer<T> a(Consumer<T> $$0, dhp $$1, cxy $$2, @Nullable bwr $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bvs> Consumer<T> a(Consumer<T> $$0, cxy $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bvs> Consumer<T> b(Consumer<T> $$0, dhp $$1, cxy $$2, @Nullable bwr $$3) {
      dae $$4 = $$2.a(kx.Y, dae.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arn $$0, jj $$1, bwa $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arn $$0, @Nullable Consumer<T> $$1, jj $$2, bwa $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bwt $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(arn $$0, @Nullable Consumer<T> $$1, jj $$2, bwa $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azk.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bwt $$9) {
            $$9.aW = $$9.dL();
            $$9.aU = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dhs $$0, jj $$1, boolean $$2, fcp $$3) {
      fcp $$4 = new fcp($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fdo> $$5 = $$0.d(null, $$4);
      return 1.0 + fdl.a(jo.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dhp $$0, @Nullable bwr $$1, @Nullable bvs $$2, dae $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bwb<?> $$5 = $$3.a($$4.ba(), me.z);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 instanceof cqi $$6 && $$4.ag().f($$6.gh())) {
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

   public bwu f() {
      return this.ca;
   }

   public String g() {
      return this.ci;
   }

   public wv h() {
      if (this.cj == null) {
         this.cj = wv.c(this.g());
      }

      return this.cj;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<alc<exq>> j() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public cte k() {
      return this.cn;
   }

   @Nullable
   public T a(dhp $$0, bwa $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bvs> a(tw $$0, dhp $$1, bwa $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bU.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fcp a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fcp($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dym $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && evg.a($$0) ? true : $$0.a(dkw.ck) || $$0.a(dkw.oK) || $$0.a(dkw.ed) || $$0.a(dkw.rt);
      }
   }

   public bvv n() {
      return this.cl;
   }

   public static Optional<bwb<?>> a(tw $$0) {
      return md.f.b(ald.a($$0.l("id")));
   }

   @Nullable
   public static bvs a(tw $$0, dhp $$1, bwa $$2, Function<bvs, bvs> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            uc $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bvs $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bvs)$$4;
      }).orElse(null);
   }

   public static Stream<bvs> a(final List<? extends ut> $$0, final dhp $$1, final bwa $$2) {
      final Spliterator<? extends ut> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bvs>() {
         @Override
         public boolean tryAdvance(Consumer<? super bvs> $$0x) {
            return $$3.tryAdvance($$3xx -> bwb.a((tw)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Nullable
         @Override
         public Spliterator<bvs> trySplit() {
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

   private static Optional<bvs> b(tw $$0, dhp $$1, bwa $$2) {
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

   public boolean a(axp<bwb<?>> $$0) {
      return this.bV.a($$0);
   }

   public boolean a(jw<bwb<?>> $$0) {
      return $$0.a(this.bV);
   }

   @Nullable
   public T a(bvs $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bvs> a() {
      return bvs.class;
   }

   @Deprecated
   public js.c<bwb<?>> r() {
      return this.bV;
   }

   private static bwb.b<csj> a(Supplier<cxu> $$0) {
      return ($$1, $$2) -> new csj($$1, $$2, $$0);
   }

   private static bwb.b<csk> b(Supplier<cxu> $$0) {
      return ($$1, $$2) -> new csk($$1, $$2, $$0);
   }

   private static bwb.b<csy> c(Supplier<cxu> $$0) {
      return ($$1, $$2) -> new csy($$1, $$2, $$0);
   }

   private static bwb.b<csl> d(Supplier<cxu> $$0) {
      return ($$1, $$2) -> new csl($$1, $$2, $$0);
   }

   public boolean s() {
      return bY.contains(this);
   }

   public static class a<T extends bvs> {
      private final bwb.b<T> a;
      private final bwu b;
      private ImmutableSet<dku> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bvv j = bvv.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bvu.a l = bvu.a();
      private cte m = ctg.g;
      private akv<bwb<?>, Optional<alc<exq>>> n = $$0x -> Optional.of(alc.a(me.bn, $$0x.a().f("entities/")));
      private final akv<bwb<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bwb.b<T> $$0, bwu $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bwu.b || $$1 == bwu.h;
      }

      public static <T extends bvs> bwb.a<T> a(bwb.b<T> $$0, bwu $$1) {
         return new bwb.a<>($$0, $$1);
      }

      public static <T extends bvs> bwb.a<T> a(bwu $$0) {
         return new bwb.a<>(($$0x, $$1) -> null, $$0);
      }

      public bwb.a<T> a(float $$0, float $$1) {
         this.j = bvv.b($$0, $$1);
         return this;
      }

      public bwb.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bwb.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bwb.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bvt.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bwb.a<T> a(fcu... $$0) {
         for (fcu $$1 : $$0) {
            this.l = this.l.a(bvt.a, $$1);
         }

         return this;
      }

      public bwb.a<T> a(fcu $$0) {
         return this.a(bvt.b, $$0);
      }

      public bwb.a<T> c(float $$0) {
         return this.a(bvt.b, 0.0F, -$$0, 0.0F);
      }

      public bwb.a<T> d(float $$0) {
         return this.a(bvt.c, 0.0F, $$0, 0.0F);
      }

      public bwb.a<T> a(bvt $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bwb.a<T> a(bvt $$0, fcu $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bwb.a<T> a() {
         this.e = false;
         return this;
      }

      public bwb.a<T> b() {
         this.d = false;
         return this;
      }

      public bwb.a<T> c() {
         this.f = true;
         return this;
      }

      public bwb.a<T> a(dku... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bwb.a<T> d() {
         this.g = true;
         return this;
      }

      public bwb.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bwb.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bwb.a<T> a(ctc... $$0) {
         this.m = ctg.e.a($$0);
         return this;
      }

      public bwb.a<T> e() {
         this.n = akv.fixed(Optional.empty());
         return this;
      }

      public bwb<T> a(alc<bwb<?>> $$0) {
         if (this.d) {
            af.a(biq.C, $$0.a().toString());
         }

         return new bwb<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bvs> {
      @Nullable
      T create(bwb<T> var1, dhp var2);
   }
}
