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

public class bvq<T extends bvj> implements csp, ece<bvj, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jq.c<bvq<?>> bW = ma.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bvq<crx> a = a("acacia_boat", bvq.a.a(a(() -> cxs.ow), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> b = a("acacia_chest_boat", bvq.a.a(b(() -> cxs.ox), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cjc> c = a("allay", bvq.a.a(cjc::new, bwi.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bvq<bvc> d = a("area_effect_cloud", bvq.a.<bvc>a(bvc::new, bwi.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvq<cjf> e = a("armadillo", bvq.a.a(cjf::new, bwi.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bvq<clp> f = a("armor_stand", bvq.a.<clp>a(clp::new, bwi.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bvq<cqf> g = a("arrow", bvq.a.<cqf>a(cqf::new, bwi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvq<cji> h = a("axolotl", bvq.a.a(cji::new, bwi.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bvq<crz> i = a("bamboo_chest_raft", bvq.a.a(d(() -> cxs.oH), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<csm> j = a("bamboo_raft", bvq.a.a(c(() -> cxs.oG), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<chq> k = a("bat", bvq.a.a(chq::new, bwi.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bvq<chx> l = a("bee", bvq.a.a(chx::new, bwi.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bvq<crx> m = a("birch_boat", bvq.a.a(a(() -> cxs.os), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> n = a("birch_chest_boat", bvq.a.a(b(() -> cxs.ot), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cmf> o = a("blaze", bvq.a.a(cmf::new, bwi.a).c().a(0.6F, 1.8F).a(8));
   public static final bvq<bvh.b> p = a("block_display", bvq.a.a(bvh.b::new, bwi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvq<cmg> q = a("bogged", bvq.a.a(cmg::new, bwi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvq<cns> r = a("breeze", bvq.a.a(cns::new, bwi.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bvq<crg> s = a("breeze_wind_charge", bvq.a.<crg>a(crg::new, bwi.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvq<cjn> t = a("camel", bvq.a.a(cjn::new, bwi.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bvq<chz> u = a("cat", bvq.a.a(chz::new, bwi.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bvq<cmh> v = a("cave_spider", bvq.a.a(cmh::new, bwi.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bvq<crx> w = a("cherry_boat", bvq.a.a(a(() -> cxs.oy), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> x = a("cherry_chest_boat", bvq.a.a(b(() -> cxs.oz), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cse> y = a("chest_minecart", bvq.a.a(cse::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<cib> z = a("chicken", bvq.a.a(cib::new, bwi.b).a(0.4F, 0.7F).b(0.644F).a(new fbx(0.0, 0.7, -0.1)).a(10));
   public static final bvq<cic> A = a("cod", bvq.a.a(cic::new, bwi.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bvq<csf> B = a("command_block_minecart", bvq.a.a(csf::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<cid> C = a("cow", bvq.a.a(cid::new, bwi.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvq<coa> D = a("creaking", bvq.a.a(coa::new, bwi.a).c().a(0.9F, 2.7F).b(2.3F).a(8).a(csu.b));
   public static final bvq<coc> E = a("creaking_transient", bvq.a.a(coc::new, bwi.a).b().a().c().a(0.9F, 2.7F).b(2.3F).a(8).a(csu.b));
   public static final bvq<cmi> F = a("creeper", bvq.a.a(cmi::new, bwi.a).a(0.6F, 1.7F).a(8));
   public static final bvq<crx> G = a("dark_oak_boat", bvq.a.a(a(() -> cxs.oA), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> H = a("dark_oak_chest_boat", bvq.a.a(b(() -> cxs.oB), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cie> I = a("dolphin", bvq.a.a(cie::new, bwi.f).a(0.9F, 0.6F).b(0.3F));
   public static final bvq<ckb> J = a("donkey", bvq.a.a(ckb::new, bwi.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bvq<cqg> K = a("dragon_fireball", bvq.a.<cqg>a(cqg::new, bwi.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvq<cmk> L = a("drowned", bvq.a.a(cmk::new, bwi.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvq<cqy> M = a("egg", bvq.a.<cqy>a(cqy::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<cml> N = a("elder_guardian", bvq.a.a(cml::new, bwi.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bvq<cmm> O = a("enderman", bvq.a.a(cmm::new, bwi.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bvq<cmn> P = a("endermite", bvq.a.a(cmn::new, bwi.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvq<ckt> Q = a("ender_dragon", bvq.a.a(ckt::new, bwi.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bvq<cqz> R = a("ender_pearl", bvq.a.<cqz>a(cqz::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<cks> S = a("end_crystal", bvq.a.<cks>a(cks::new, bwi.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvq<cmp> T = a("evoker", bvq.a.a(cmp::new, bwi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvq<cqh> U = a("evoker_fangs", bvq.a.<cqh>a(cqh::new, bwi.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bvq<cra> V = a("experience_bottle", bvq.a.<cra>a(cra::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<bvv> W = a("experience_orb", bvq.a.<bvv>a(bvv::new, bwi.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bvq<cqi> X = a("eye_of_ender", bvq.a.<cqi>a(cqi::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bvq<clz> Y = a("falling_block", bvq.a.<clz>a(clz::new, bwi.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bvq<cqn> Z = a("fireball", bvq.a.<cqn>a(cqn::new, bwi.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvq<cqk> aa = a("firework_rocket", bvq.a.<cqk>a(cqk::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<cig> ab = a("fox", bvq.a.a(cig::new, bwi.b).a(0.6F, 0.7F).b(0.4F).a(new fbx(0.0, 0.6375, -0.25)).a(8).a(dkn.oD));
   public static final bvq<cjq> ac = a("frog", bvq.a.a(cjq::new, bwi.b).a(0.5F, 0.5F).a(new fbx(0.0, 0.375, -0.25)).a(10));
   public static final bvq<csg> ad = a("furnace_minecart", bvq.a.a(csg::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<cmq> ae = a("ghast", bvq.a.a(cmq::new, bwi.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bvq<cmr> af = a("giant", bvq.a.a(cmr::new, bwi.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bvq<clr> ag = a("glow_item_frame", bvq.a.<clr>a(clr::new, bwi.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvq<bvx> ah = a("glow_squid", bvq.a.a(bvx::new, bwi.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bvq<cjw> ai = a("goat", bvq.a.a(cjw::new, bwi.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bvq<cms> aj = a("guardian", bvq.a.a(cms::new, bwi.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bvq<coe> ak = a("hoglin", bvq.a.a(coe::new, bwi.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvq<csh> al = a("hopper_minecart", bvq.a.a(csh::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<ckc> am = a("horse", bvq.a.a(ckc::new, bwi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bvq<cmt> an = a("husk", bvq.a.a(cmt::new, bwi.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bvq<cmu> ao = a("illusioner", bvq.a.a(cmu::new, bwi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvq<bwa> ap = a("interaction", bvq.a.a(bwa::new, bwi.h).e().a(0.0F, 0.0F).a(10));
   public static final bvq<cii> aq = a("iron_golem", bvq.a.a(cii::new, bwi.h).a(1.4F, 2.7F).a(10));
   public static final bvq<cma> ar = a("item", bvq.a.<cma>a(cma::new, bwi.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bvq<bvh.g> as = a("item_display", bvq.a.a(bvh.g::new, bwi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvq<clt> at = a("item_frame", bvq.a.<clt>a(clt::new, bwi.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvq<crx> au = a("jungle_boat", bvq.a.a(a(() -> cxs.ou), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> av = a("jungle_chest_boat", bvq.a.a(b(() -> cxs.ov), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<clu> aw = a("leash_knot", bvq.a.<clu>a(clu::new, bwi.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bvq<bwe> ax = a("lightning_bolt", bvq.a.a(bwe::new, bwi.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvq<ckd> ay = a("llama", bvq.a.a(ckd::new, bwi.b).a(0.9F, 1.87F).b(1.7765F).a(new fbx(0.0, 1.37, -0.3)).a(10));
   public static final bvq<cqo> az = a("llama_spit", bvq.a.<cqo>a(cqo::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<cmv> aA = a("magma_cube", bvq.a.a(cmv::new, bwi.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bvq<crx> aB = a("mangrove_boat", bvq.a.a(a(() -> cxs.oE), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> aC = a("mangrove_chest_boat", bvq.a.a(b(() -> cxs.oF), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<bwg> aD = a("marker", bvq.a.a(bwg::new, bwi.h).e().a(0.0F, 0.0F).a(0));
   public static final bvq<csc> aE = a("minecart", bvq.a.a(csc::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<cij> aF = a("mooshroom", bvq.a.a(cij::new, bwi.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvq<ckf> aG = a("mule", bvq.a.a(ckf::new, bwi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bvq<crx> aH = a("oak_boat", bvq.a.a(a(() -> cxs.oo), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> aI = a("oak_chest_boat", bvq.a.a(b(() -> cxs.op), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cik> aJ = a("ocelot", bvq.a.a(cik::new, bwi.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bvq<bwl> aK = a("ominous_item_spawner", bvq.a.a(bwl::new, bwi.h).e().a(0.25F, 0.25F).a(8));
   public static final bvq<clv> aL = a("painting", bvq.a.<clv>a(clv::new, bwi.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvq<crx> aM = a("pale_oak_boat", bvq.a.a(a(() -> cxs.oC), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10).a(csu.b));
   public static final bvq<cry> aN = a("pale_oak_chest_boat", bvq.a.a(b(() -> cxs.oD), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10).a(csu.b));
   public static final bvq<cil> aO = a("panda", bvq.a.a(cil::new, bwi.b).a(1.3F, 1.25F).a(10));
   public static final bvq<cim> aP = a("parrot", bvq.a.a(cim::new, bwi.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bvq<cmy> aQ = a("phantom", bvq.a.a(cmy::new, bwi.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bvq<cin> aR = a("pig", bvq.a.a(cin::new, bwi.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bvq<cok> aS = a("piglin", bvq.a.a(cok::new, bwi.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvq<coo> aT = a("piglin_brute", bvq.a.a(coo::new, bwi.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvq<cmz> aU = a("pillager", bvq.a.a(cmz::new, bwi.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvq<cio> aV = a("polar_bear", bvq.a.a(cio::new, bwi.b).a(dkn.rk).a(1.4F, 1.4F).a(10));
   public static final bvq<crb> aW = a("potion", bvq.a.<crb>a(crb::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<cip> aX = a("pufferfish", bvq.a.a(cip::new, bwi.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bvq<ciq> aY = a("rabbit", bvq.a.a(ciq::new, bwi.b).a(0.4F, 0.5F).a(8));
   public static final bvq<cnb> aZ = a("ravager", bvq.a.a(cnb::new, bwi.a).a(1.95F, 2.2F).a(new fbx(0.0, 2.2625, -0.0625)).a(10));
   public static final bvq<cir> ba = a("salmon", bvq.a.a(cir::new, bwi.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bvq<cis> bb = a("sheep", bvq.a.a(cis::new, bwi.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bvq<cnc> bc = a("shulker", bvq.a.a(cnc::new, bwi.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bvq<cqs> bd = a("shulker_bullet", bvq.a.<cqs>a(cqs::new, bwi.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bvq<cnd> be = a("silverfish", bvq.a.a(cnd::new, bwi.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvq<cne> bf = a("skeleton", bvq.a.a(cne::new, bwi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvq<ckg> bg = a("skeleton_horse", bvq.a.a(ckg::new, bwi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvq<cnf> bh = a("slime", bvq.a.a(cnf::new, bwi.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bvq<cqt> bi = a("small_fireball", bvq.a.<cqt>a(cqt::new, bwi.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvq<ckn> bj = a("sniffer", bvq.a.a(ckn::new, bwi.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bvq<cqu> bk = a("snowball", bvq.a.<cqu>a(cqu::new, bwi.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvq<ciu> bl = a("snow_golem", bvq.a.a(ciu::new, bwi.h).a(dkn.rk).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bvq<csi> bm = a("spawner_minecart", bvq.a.a(csi::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<cqv> bn = a("spectral_arrow", bvq.a.<cqv>a(cqv::new, bwi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvq<cnh> bo = a("spider", bvq.a.a(cnh::new, bwi.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bvq<crx> bp = a("spruce_boat", bvq.a.a(a(() -> cxs.oq), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<cry> bq = a("spruce_chest_boat", bvq.a.a(b(() -> cxs.or), bwi.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvq<civ> br = a("squid", bvq.a.a(civ::new, bwi.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bvq<cni> bs = a("stray", bvq.a.a(cni::new, bwi.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dkn.rk).a(8));
   public static final bvq<cnj> bt = a("strider", bvq.a.a(cnj::new, bwi.b).c().a(0.9F, 1.7F).a(10));
   public static final bvq<cjt> bu = a("tadpole", bvq.a.a(cjt::new, bwi.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bvq<bvh.l> bv = a("text_display", bvq.a.a(bvh.l::new, bwi.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvq<cmb> bw = a("tnt", bvq.a.<cmb>a(cmb::new, bwi.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bvq<csj> bx = a("tnt_minecart", bvq.a.a(csj::new, bwi.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvq<cki> by = a("trader_llama", bvq.a.a(cki::new, bwi.b).a(0.9F, 1.87F).b(1.7765F).a(new fbx(0.0, 1.37, -0.3)).a(10));
   public static final bvq<crc> bz = a("trident", bvq.a.<crc>a(crc::new, bwi.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvq<ciw> bA = a("tropical_fish", bvq.a.a(ciw::new, bwi.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bvq<cix> bB = a("turtle", bvq.a.a(cix::new, bwi.b).a(1.2F, 0.4F).a(new fbx(0.0, 0.55625, -0.25)).a(10));
   public static final bvq<cnk> bC = a("vex", bvq.a.a(cnk::new, bwi.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bvq<cpi> bD = a("villager", bvq.a.<cpi>a(cpi::new, bwi.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvq<cnl> bE = a("vindicator", bvq.a.a(cnl::new, bwi.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvq<cpo> bF = a("wandering_trader", bvq.a.a(cpo::new, bwi.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvq<coz> bG = a("warden", bvq.a.a(coz::new, bwi.a).a(0.9F, 2.9F).a(3.15F).a(bvk.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bvq<crh> bH = a("wind_charge", bvq.a.<crh>a(crh::new, bwi.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvq<cnm> bI = a("witch", bvq.a.a(cnm::new, bwi.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bvq<cln> bJ = a("wither", bvq.a.a(cln::new, bwi.a).c().a(dkn.ck).a(0.9F, 3.5F).a(10));
   public static final bvq<cnn> bK = a("wither_skeleton", bvq.a.a(cnn::new, bwi.a).c().a(dkn.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bvq<crd> bL = a("wither_skull", bvq.a.<crd>a(crd::new, bwi.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvq<ciz> bM = a("wolf", bvq.a.a(ciz::new, bwi.b).a(0.6F, 0.85F).b(0.68F).a(new fbx(0.0, 0.81875, -0.0625)).a(10));
   public static final bvq<cno> bN = a("zoglin", bvq.a.a(cno::new, bwi.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvq<cnp> bO = a("zombie", bvq.a.<cnp>a(cnp::new, bwi.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvq<ckk> bP = a("zombie_horse", bvq.a.a(ckk::new, bwi.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvq<cnq> bQ = a("zombie_villager", bvq.a.a(cnq::new, bwi.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bvq<cnr> bR = a("zombified_piglin", bvq.a.a(cnr::new, bwi.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bvq<cpw> bS = a("player", bvq.a.<cpw>a(bwi.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cpw.bV).a(32).b(2));
   public static final bvq<cql> bT = a("fishing_bobber", bvq.a.<cql>a(cql::new, bwi.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bvq.b<T> bZ;
   private final bwi ca;
   private final ImmutableSet<dkl> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private xv cj;
   private final Optional<aly<ewt>> ck;
   private final bvm cl;
   private final float cm;
   private final css cn;

   private static <T extends bvj> bvq<T> a(aly<bvq<?>> $$0, bvq.a<T> $$1) {
      return kd.a(ma.f, $$0, $$1.a($$0));
   }

   private static aly<bvq<?>> b(String $$0) {
      return aly.a(mb.z, alz.b($$0));
   }

   private static <T extends bvj> bvq<T> a(String $$0, bvq.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alz a(bvq<?> $$0) {
      return ma.f.b($$0);
   }

   public static Optional<bvq<?>> a(String $$0) {
      return ma.f.b(alz.c($$0));
   }

   public bvq(
      bvq.b<T> $$0,
      bwi $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dkl> $$6,
      bvm $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<aly<ewt>> $$12,
      css $$13
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
   public T a(ash $$0, @Nullable cxo $$1, @Nullable cpw $$2, jh $$3, bvp $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bvj> Consumer<T> a(dhh $$0, cxo $$1, @Nullable cpw $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bvj> Consumer<T> a(Consumer<T> $$0, dhh $$1, cxo $$2, @Nullable cpw $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bvj> Consumer<T> a(Consumer<T> $$0, cxo $$1) {
      xv $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bvj> Consumer<T> b(Consumer<T> $$0, dhh $$1, cxo $$2, @Nullable cpw $$3) {
      czx $$4 = $$2.a(ku.W, czx.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ash $$0, jh $$1, bvp $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ash $$0, @Nullable Consumer<T> $$1, jh $$2, bvp $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(ash $$0, @Nullable Consumer<T> $$1, jh $$2, bvp $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, bae.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bwh $$9) {
            $$9.aZ = $$9.dL();
            $$9.aX = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
            $$9.R();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dhk $$0, jh $$1, boolean $$2, fbs $$3) {
      fbs $$4 = new fbs($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fcr> $$5 = $$0.d(null, $$4);
      return 1.0 + fco.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dhh $$0, @Nullable cpw $$1, @Nullable bvj $$2, czx $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cW() || $$1 != null && $$4.ag().f($$1.gf())) {
            $$3.a($$2);
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

   public bwi f() {
      return this.ca;
   }

   public String g() {
      return this.ci;
   }

   public xv h() {
      if (this.cj == null) {
         this.cj = xv.c(this.g());
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

   public Optional<aly<ewt>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public css i() {
      return this.cn;
   }

   @Nullable
   public T a(dhh $$0, bvp $$1) {
      return !this.a($$0.J()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bvj> a(ux $$0, dhh $$1, bvp $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fbs a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fbs($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dxu $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && euj.a($$0) ? true : $$0.a(dkn.ck) || $$0.a(dkn.oD) || $$0.a(dkn.ed) || $$0.a(dkn.rk);
      }
   }

   public bvm n() {
      return this.cl;
   }

   public static Optional<bvq<?>> a(ux $$0) {
      return ma.f.b(alz.a($$0.l("id")));
   }

   @Nullable
   public static bvj a(ux $$0, dhh $$1, bvp $$2, Function<bvj, bvj> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            vd $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bvj $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bvj)$$4;
      }).orElse(null);
   }

   public static Stream<bvj> a(final List<? extends vu> $$0, final dhh $$1, final bvp $$2) {
      final Spliterator<? extends vu> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bvj>() {
         @Override
         public boolean tryAdvance(Consumer<? super bvj> $$0x) {
            return $$3.tryAdvance($$3xx -> bvq.a((ux)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bvj> trySplit() {
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

   private static Optional<bvj> b(ux $$0, dhh $$1, bvp $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bV.warn("Exception loading entity: ", var4);
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
      return this != bS && this != az && this != bJ && this != k && this != at && this != ag && this != aw && this != aL && this != S && this != U;
   }

   public boolean a(ayk<bvq<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ju<bvq<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bvj $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bvj> a() {
      return bvj.class;
   }

   @Deprecated
   public jq.c<bvq<?>> r() {
      return this.bW;
   }

   private static bvq.b<crx> a(Supplier<cxk> $$0) {
      return ($$1, $$2) -> new crx($$1, $$2, $$0);
   }

   private static bvq.b<cry> b(Supplier<cxk> $$0) {
      return ($$1, $$2) -> new cry($$1, $$2, $$0);
   }

   private static bvq.b<csm> c(Supplier<cxk> $$0) {
      return ($$1, $$2) -> new csm($$1, $$2, $$0);
   }

   private static bvq.b<crz> d(Supplier<cxk> $$0) {
      return ($$1, $$2) -> new crz($$1, $$2, $$0);
   }

   public static class a<T extends bvj> {
      private final bvq.b<T> a;
      private final bwi b;
      private ImmutableSet<dkl> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bvm j = bvm.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bvl.a l = bvl.a();
      private css m = csu.h;
      private alr<bvq<?>, Optional<aly<ewt>>> n = $$0x -> Optional.of(aly.a(mb.bg, $$0x.a().f("entities/")));
      private alr<bvq<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bvq.b<T> $$0, bwi $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bwi.b || $$1 == bwi.h;
      }

      public static <T extends bvj> bvq.a<T> a(bvq.b<T> $$0, bwi $$1) {
         return new bvq.a<>($$0, $$1);
      }

      public static <T extends bvj> bvq.a<T> a(bwi $$0) {
         return new bvq.a<>(($$0x, $$1) -> null, $$0);
      }

      public bvq.a<T> a(float $$0, float $$1) {
         this.j = bvm.b($$0, $$1);
         return this;
      }

      public bvq.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bvq.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bvq.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bvk.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bvq.a<T> a(fbx... $$0) {
         for (fbx $$1 : $$0) {
            this.l = this.l.a(bvk.a, $$1);
         }

         return this;
      }

      public bvq.a<T> a(fbx $$0) {
         return this.a(bvk.b, $$0);
      }

      public bvq.a<T> c(float $$0) {
         return this.a(bvk.b, 0.0F, -$$0, 0.0F);
      }

      public bvq.a<T> d(float $$0) {
         return this.a(bvk.c, 0.0F, $$0, 0.0F);
      }

      public bvq.a<T> a(bvk $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bvq.a<T> a(bvk $$0, fbx $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bvq.a<T> a() {
         this.e = false;
         return this;
      }

      public bvq.a<T> b() {
         this.d = false;
         return this;
      }

      public bvq.a<T> c() {
         this.f = true;
         return this;
      }

      public bvq.a<T> a(dkl... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bvq.a<T> d() {
         this.g = true;
         return this;
      }

      public bvq.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bvq.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bvq.a<T> a(csq... $$0) {
         this.m = csu.f.a($$0);
         return this;
      }

      public bvq.a<T> e() {
         this.n = alr.fixed(Optional.empty());
         return this;
      }

      public bvq<T> a(aly<bvq<?>> $$0) {
         if (this.d) {
            ae.a(biw.A, $$0.a().toString());
         }

         return new bvq<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bvj> {
      T create(bvq<T> var1, dhh var2);
   }
}
