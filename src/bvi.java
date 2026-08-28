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

public class bvi<T extends bvb> implements csh, eby<bvb, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jq.c<bvi<?>> bW = ma.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bvi<crp> a = a("acacia_boat", bvi.a.a(a(() -> cxk.oF), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> b = a("acacia_chest_boat", bvi.a.a(b(() -> cxk.oG), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<ciu> c = a("allay", bvi.a.a(ciu::new, bwa.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bvi<buu> d = a("area_effect_cloud", bvi.a.<buu>a(buu::new, bwa.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<cix> e = a("armadillo", bvi.a.a(cix::new, bwa.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bvi<clh> f = a("armor_stand", bvi.a.<clh>a(clh::new, bwa.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bvi<cpx> g = a("arrow", bvi.a.<cpx>a(cpx::new, bwa.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvi<cja> h = a("axolotl", bvi.a.a(cja::new, bwa.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bvi<crr> i = a("bamboo_chest_raft", bvi.a.a(d(() -> cxk.oQ), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cse> j = a("bamboo_raft", bvi.a.a(c(() -> cxk.oP), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<chi> k = a("bat", bvi.a.a(chi::new, bwa.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bvi<chp> l = a("bee", bvi.a.a(chp::new, bwa.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bvi<crp> m = a("birch_boat", bvi.a.a(a(() -> cxk.oB), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> n = a("birch_chest_boat", bvi.a.a(b(() -> cxk.oC), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<clx> o = a("blaze", bvi.a.a(clx::new, bwa.a).c().a(0.6F, 1.8F).a(8));
   public static final bvi<buz.b> p = a("block_display", bvi.a.a(buz.b::new, bwa.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvi<cly> q = a("bogged", bvi.a.a(cly::new, bwa.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvi<cnk> r = a("breeze", bvi.a.a(cnk::new, bwa.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bvi<cqy> s = a("breeze_wind_charge", bvi.a.<cqy>a(cqy::new, bwa.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvi<cjf> t = a("camel", bvi.a.a(cjf::new, bwa.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bvi<chr> u = a("cat", bvi.a.a(chr::new, bwa.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bvi<clz> v = a("cave_spider", bvi.a.a(clz::new, bwa.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bvi<crp> w = a("cherry_boat", bvi.a.a(a(() -> cxk.oH), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> x = a("cherry_chest_boat", bvi.a.a(b(() -> cxk.oI), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crw> y = a("chest_minecart", bvi.a.a(crw::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cht> z = a("chicken", bvi.a.a(cht::new, bwa.b).a(0.4F, 0.7F).b(0.644F).a(new fbr(0.0, 0.7, -0.1)).a(10));
   public static final bvi<chu> A = a("cod", bvi.a.a(chu::new, bwa.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bvi<crx> B = a("command_block_minecart", bvi.a.a(crx::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<chv> C = a("cow", bvi.a.a(chv::new, bwa.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvi<cns> D = a("creaking", bvi.a.a(cns::new, bwa.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bvi<cnu> E = a("creaking_transient", bvi.a.a(cnu::new, bwa.a).b().a().c().a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bvi<cma> F = a("creeper", bvi.a.a(cma::new, bwa.a).a(0.6F, 1.7F).a(8));
   public static final bvi<crp> G = a("dark_oak_boat", bvi.a.a(a(() -> cxk.oJ), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> H = a("dark_oak_chest_boat", bvi.a.a(b(() -> cxk.oK), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<chw> I = a("dolphin", bvi.a.a(chw::new, bwa.f).a(0.9F, 0.6F).b(0.3F));
   public static final bvi<cjt> J = a("donkey", bvi.a.a(cjt::new, bwa.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bvi<cpy> K = a("dragon_fireball", bvi.a.<cpy>a(cpy::new, bwa.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvi<cmc> L = a("drowned", bvi.a.a(cmc::new, bwa.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<cqq> M = a("egg", bvi.a.<cqq>a(cqq::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cmd> N = a("elder_guardian", bvi.a.a(cmd::new, bwa.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bvi<cme> O = a("enderman", bvi.a.a(cme::new, bwa.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bvi<cmf> P = a("endermite", bvi.a.a(cmf::new, bwa.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvi<ckl> Q = a("ender_dragon", bvi.a.a(ckl::new, bwa.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bvi<cqr> R = a("ender_pearl", bvi.a.<cqr>a(cqr::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<ckk> S = a("end_crystal", bvi.a.<ckk>a(ckk::new, bwa.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvi<cmh> T = a("evoker", bvi.a.a(cmh::new, bwa.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<cpz> U = a("evoker_fangs", bvi.a.<cpz>a(cpz::new, bwa.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bvi<cqs> V = a("experience_bottle", bvi.a.<cqs>a(cqs::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<bvn> W = a("experience_orb", bvi.a.<bvn>a(bvn::new, bwa.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bvi<cqa> X = a("eye_of_ender", bvi.a.<cqa>a(cqa::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bvi<clr> Y = a("falling_block", bvi.a.<clr>a(clr::new, bwa.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bvi<cqf> Z = a("fireball", bvi.a.<cqf>a(cqf::new, bwa.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvi<cqc> aa = a("firework_rocket", bvi.a.<cqc>a(cqc::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<chy> ab = a("fox", bvi.a.a(chy::new, bwa.b).a(0.6F, 0.7F).b(0.4F).a(new fbr(0.0, 0.6375, -0.25)).a(8).a(dkf.oK));
   public static final bvi<cji> ac = a("frog", bvi.a.a(cji::new, bwa.b).a(0.5F, 0.5F).a(new fbr(0.0, 0.375, -0.25)).a(10));
   public static final bvi<cry> ad = a("furnace_minecart", bvi.a.a(cry::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cmi> ae = a("ghast", bvi.a.a(cmi::new, bwa.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bvi<cmj> af = a("giant", bvi.a.a(cmj::new, bwa.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bvi<clj> ag = a("glow_item_frame", bvi.a.<clj>a(clj::new, bwa.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<bvp> ah = a("glow_squid", bvi.a.a(bvp::new, bwa.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bvi<cjo> ai = a("goat", bvi.a.a(cjo::new, bwa.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bvi<cmk> aj = a("guardian", bvi.a.a(cmk::new, bwa.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bvi<cnw> ak = a("hoglin", bvi.a.a(cnw::new, bwa.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvi<crz> al = a("hopper_minecart", bvi.a.a(crz::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cju> am = a("horse", bvi.a.a(cju::new, bwa.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bvi<cml> an = a("husk", bvi.a.a(cml::new, bwa.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bvi<cmm> ao = a("illusioner", bvi.a.a(cmm::new, bwa.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<bvs> ap = a("interaction", bvi.a.a(bvs::new, bwa.h).e().a(0.0F, 0.0F).a(10));
   public static final bvi<cia> aq = a("iron_golem", bvi.a.a(cia::new, bwa.h).a(1.4F, 2.7F).a(10));
   public static final bvi<cls> ar = a("item", bvi.a.<cls>a(cls::new, bwa.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bvi<buz.g> as = a("item_display", bvi.a.a(buz.g::new, bwa.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvi<cll> at = a("item_frame", bvi.a.<cll>a(cll::new, bwa.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<crp> au = a("jungle_boat", bvi.a.a(a(() -> cxk.oD), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> av = a("jungle_chest_boat", bvi.a.a(b(() -> cxk.oE), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<clm> aw = a("leash_knot", bvi.a.<clm>a(clm::new, bwa.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<bvw> ax = a("lightning_bolt", bvi.a.a(bvw::new, bwa.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvi<cjv> ay = a("llama", bvi.a.a(cjv::new, bwa.b).a(0.9F, 1.87F).b(1.7765F).a(new fbr(0.0, 1.37, -0.3)).a(10));
   public static final bvi<cqg> az = a("llama_spit", bvi.a.<cqg>a(cqg::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cmn> aA = a("magma_cube", bvi.a.a(cmn::new, bwa.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bvi<crp> aB = a("mangrove_boat", bvi.a.a(a(() -> cxk.oN), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> aC = a("mangrove_chest_boat", bvi.a.a(b(() -> cxk.oO), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<bvy> aD = a("marker", bvi.a.a(bvy::new, bwa.h).e().a(0.0F, 0.0F).a(0));
   public static final bvi<cru> aE = a("minecart", bvi.a.a(cru::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cib> aF = a("mooshroom", bvi.a.a(cib::new, bwa.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvi<cjx> aG = a("mule", bvi.a.a(cjx::new, bwa.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bvi<crp> aH = a("oak_boat", bvi.a.a(a(() -> cxk.ox), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> aI = a("oak_chest_boat", bvi.a.a(b(() -> cxk.oy), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cic> aJ = a("ocelot", bvi.a.a(cic::new, bwa.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bvi<bwd> aK = a("ominous_item_spawner", bvi.a.a(bwd::new, bwa.h).e().a(0.25F, 0.25F).a(8));
   public static final bvi<cln> aL = a("painting", bvi.a.<cln>a(cln::new, bwa.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<crp> aM = a("pale_oak_boat", bvi.a.a(a(() -> cxk.oL), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> aN = a("pale_oak_chest_boat", bvi.a.a(b(() -> cxk.oM), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cid> aO = a("panda", bvi.a.a(cid::new, bwa.b).a(1.3F, 1.25F).a(10));
   public static final bvi<cie> aP = a("parrot", bvi.a.a(cie::new, bwa.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bvi<cmq> aQ = a("phantom", bvi.a.a(cmq::new, bwa.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bvi<cif> aR = a("pig", bvi.a.a(cif::new, bwa.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bvi<coc> aS = a("piglin", bvi.a.a(coc::new, bwa.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<cof> aT = a("piglin_brute", bvi.a.a(cof::new, bwa.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<cmr> aU = a("pillager", bvi.a.a(cmr::new, bwa.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<cig> aV = a("polar_bear", bvi.a.a(cig::new, bwa.b).a(dkf.rr).a(1.4F, 1.4F).a(10));
   public static final bvi<cqt> aW = a("potion", bvi.a.<cqt>a(cqt::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cih> aX = a("pufferfish", bvi.a.a(cih::new, bwa.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bvi<cii> aY = a("rabbit", bvi.a.a(cii::new, bwa.b).a(0.4F, 0.5F).a(8));
   public static final bvi<cmt> aZ = a("ravager", bvi.a.a(cmt::new, bwa.a).a(1.95F, 2.2F).a(new fbr(0.0, 2.2625, -0.0625)).a(10));
   public static final bvi<cij> ba = a("salmon", bvi.a.a(cij::new, bwa.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bvi<cik> bb = a("sheep", bvi.a.a(cik::new, bwa.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bvi<cmu> bc = a("shulker", bvi.a.a(cmu::new, bwa.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bvi<cqk> bd = a("shulker_bullet", bvi.a.<cqk>a(cqk::new, bwa.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bvi<cmv> be = a("silverfish", bvi.a.a(cmv::new, bwa.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvi<cmw> bf = a("skeleton", bvi.a.a(cmw::new, bwa.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvi<cjy> bg = a("skeleton_horse", bvi.a.a(cjy::new, bwa.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvi<cmx> bh = a("slime", bvi.a.a(cmx::new, bwa.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bvi<cql> bi = a("small_fireball", bvi.a.<cql>a(cql::new, bwa.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvi<ckf> bj = a("sniffer", bvi.a.a(ckf::new, bwa.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bvi<cqm> bk = a("snowball", bvi.a.<cqm>a(cqm::new, bwa.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cim> bl = a("snow_golem", bvi.a.a(cim::new, bwa.h).a(dkf.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bvi<csa> bm = a("spawner_minecart", bvi.a.a(csa::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cqn> bn = a("spectral_arrow", bvi.a.<cqn>a(cqn::new, bwa.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvi<cmz> bo = a("spider", bvi.a.a(cmz::new, bwa.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bvi<crp> bp = a("spruce_boat", bvi.a.a(a(() -> cxk.oz), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crq> bq = a("spruce_chest_boat", bvi.a.a(b(() -> cxk.oA), bwa.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cin> br = a("squid", bvi.a.a(cin::new, bwa.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bvi<cna> bs = a("stray", bvi.a.a(cna::new, bwa.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dkf.rr).a(8));
   public static final bvi<cnb> bt = a("strider", bvi.a.a(cnb::new, bwa.b).c().a(0.9F, 1.7F).a(10));
   public static final bvi<cjl> bu = a("tadpole", bvi.a.a(cjl::new, bwa.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bvi<buz.l> bv = a("text_display", bvi.a.a(buz.l::new, bwa.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvi<clt> bw = a("tnt", bvi.a.<clt>a(clt::new, bwa.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bvi<csb> bx = a("tnt_minecart", bvi.a.a(csb::new, bwa.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cka> by = a("trader_llama", bvi.a.a(cka::new, bwa.b).a(0.9F, 1.87F).b(1.7765F).a(new fbr(0.0, 1.37, -0.3)).a(10));
   public static final bvi<cqu> bz = a("trident", bvi.a.<cqu>a(cqu::new, bwa.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvi<cio> bA = a("tropical_fish", bvi.a.a(cio::new, bwa.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bvi<cip> bB = a("turtle", bvi.a.a(cip::new, bwa.b).a(1.2F, 0.4F).a(new fbr(0.0, 0.55625, -0.25)).a(10));
   public static final bvi<cnc> bC = a("vex", bvi.a.a(cnc::new, bwa.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bvi<cpa> bD = a("villager", bvi.a.<cpa>a(cpa::new, bwa.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvi<cnd> bE = a("vindicator", bvi.a.a(cnd::new, bwa.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<cpg> bF = a("wandering_trader", bvi.a.a(cpg::new, bwa.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvi<cor> bG = a("warden", bvi.a.a(cor::new, bwa.a).a(0.9F, 2.9F).a(3.15F).a(bvc.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bvi<cqz> bH = a("wind_charge", bvi.a.<cqz>a(cqz::new, bwa.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvi<cne> bI = a("witch", bvi.a.a(cne::new, bwa.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bvi<clf> bJ = a("wither", bvi.a.a(clf::new, bwa.a).c().a(dkf.ck).a(0.9F, 3.5F).a(10));
   public static final bvi<cnf> bK = a("wither_skeleton", bvi.a.a(cnf::new, bwa.a).c().a(dkf.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bvi<cqv> bL = a("wither_skull", bvi.a.<cqv>a(cqv::new, bwa.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvi<cir> bM = a("wolf", bvi.a.a(cir::new, bwa.b).a(0.6F, 0.85F).b(0.68F).a(new fbr(0.0, 0.81875, -0.0625)).a(10));
   public static final bvi<cng> bN = a("zoglin", bvi.a.a(cng::new, bwa.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvi<cnh> bO = a("zombie", bvi.a.<cnh>a(cnh::new, bwa.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<ckc> bP = a("zombie_horse", bvi.a.a(ckc::new, bwa.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvi<cni> bQ = a("zombie_villager", bvi.a.a(cni::new, bwa.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bvi<cnj> bR = a("zombified_piglin", bvi.a.a(cnj::new, bwa.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bvi<cpo> bS = a("player", bvi.a.<cpo>a(bwa.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cpo.bV).a(32).b(2));
   public static final bvi<cqd> bT = a("fishing_bobber", bvi.a.<cqd>a(cqd::new, bwa.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bvi.b<T> bZ;
   private final bwa ca;
   private final ImmutableSet<dkd> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private xk cj;
   private final Optional<alo<ewn>> ck;
   private final bve cl;
   private final float cm;
   private final csk cn;

   private static <T extends bvb> bvi<T> a(alo<bvi<?>> $$0, bvi.a<T> $$1) {
      return kd.a(ma.f, $$0, $$1.a($$0));
   }

   private static alo<bvi<?>> b(String $$0) {
      return alo.a(mb.z, alp.b($$0));
   }

   private static <T extends bvb> bvi<T> a(String $$0, bvi.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alp a(bvi<?> $$0) {
      return ma.f.b($$0);
   }

   public static Optional<bvi<?>> a(String $$0) {
      return ma.f.b(alp.c($$0));
   }

   public bvi(
      bvi.b<T> $$0,
      bwa $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dkd> $$6,
      bve $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alo<ewn>> $$12,
      csk $$13
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
   public T a(arx $$0, @Nullable cxg $$1, @Nullable cpo $$2, jh $$3, bvh $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bvb> Consumer<T> a(dgz $$0, cxg $$1, @Nullable cpo $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bvb> Consumer<T> a(Consumer<T> $$0, dgz $$1, cxg $$2, @Nullable cpo $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bvb> Consumer<T> a(Consumer<T> $$0, cxg $$1) {
      xk $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bvb> Consumer<T> b(Consumer<T> $$0, dgz $$1, cxg $$2, @Nullable cpo $$3) {
      czp $$4 = $$2.a(ku.W, czp.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arx $$0, jh $$1, bvh $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arx $$0, @Nullable Consumer<T> $$1, jh $$2, bvh $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arx $$0, @Nullable Consumer<T> $$1, jh $$2, bvh $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azu.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvz $$9) {
            $$9.aZ = $$9.dM();
            $$9.aX = $$9.dM();
            $$9.a($$0, $$0.d_($$9.dw()), $$3, null);
            $$9.R();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dhc $$0, jh $$1, boolean $$2, fbm $$3) {
      fbm $$4 = new fbm($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fcl> $$5 = $$0.d(null, $$4);
      return 1.0 + fci.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgz $$0, @Nullable cpo $$1, @Nullable bvb $$2, czp $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cW() || $$1 != null && $$4.ag().f($$1.gh())) {
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

   public bwa f() {
      return this.ca;
   }

   public String g() {
      return this.ci;
   }

   public xk h() {
      if (this.cj == null) {
         this.cj = xk.c(this.g());
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

   public Optional<alo<ewn>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public csk i() {
      return this.cn;
   }

   @Nullable
   public T a(dgz $$0, bvh $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bvb> a(um $$0, dgz $$1, bvh $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fbm a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fbm($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dxo $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && eud.a($$0) ? true : $$0.a(dkf.ck) || $$0.a(dkf.oK) || $$0.a(dkf.ed) || $$0.a(dkf.rr);
      }
   }

   public bve n() {
      return this.cl;
   }

   public static Optional<bvi<?>> a(um $$0) {
      return ma.f.b(alp.a($$0.l("id")));
   }

   @Nullable
   public static bvb a(um $$0, dgz $$1, bvh $$2, Function<bvb, bvb> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            us $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bvb $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bvb)$$4;
      }).orElse(null);
   }

   public static Stream<bvb> a(final List<? extends vj> $$0, final dgz $$1, final bvh $$2) {
      final Spliterator<? extends vj> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bvb>() {
         @Override
         public boolean tryAdvance(Consumer<? super bvb> $$0x) {
            return $$3.tryAdvance($$3xx -> bvi.a((um)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bvb> trySplit() {
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

   private static Optional<bvb> b(um $$0, dgz $$1, bvh $$2) {
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

   public boolean a(aya<bvi<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ju<bvi<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bvb $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bvb> a() {
      return bvb.class;
   }

   @Deprecated
   public jq.c<bvi<?>> r() {
      return this.bW;
   }

   private static bvi.b<crp> a(Supplier<cxc> $$0) {
      return ($$1, $$2) -> new crp($$1, $$2, $$0);
   }

   private static bvi.b<crq> b(Supplier<cxc> $$0) {
      return ($$1, $$2) -> new crq($$1, $$2, $$0);
   }

   private static bvi.b<cse> c(Supplier<cxc> $$0) {
      return ($$1, $$2) -> new cse($$1, $$2, $$0);
   }

   private static bvi.b<crr> d(Supplier<cxc> $$0) {
      return ($$1, $$2) -> new crr($$1, $$2, $$0);
   }

   public static class a<T extends bvb> {
      private final bvi.b<T> a;
      private final bwa b;
      private ImmutableSet<dkd> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bve j = bve.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bvd.a l = bvd.a();
      private csk m = csm.g;
      private alh<bvi<?>, Optional<alo<ewn>>> n = $$0x -> Optional.of(alo.a(mb.bg, $$0x.a().f("entities/")));
      private alh<bvi<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bvi.b<T> $$0, bwa $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bwa.b || $$1 == bwa.h;
      }

      public static <T extends bvb> bvi.a<T> a(bvi.b<T> $$0, bwa $$1) {
         return new bvi.a<>($$0, $$1);
      }

      public static <T extends bvb> bvi.a<T> a(bwa $$0) {
         return new bvi.a<>(($$0x, $$1) -> null, $$0);
      }

      public bvi.a<T> a(float $$0, float $$1) {
         this.j = bve.b($$0, $$1);
         return this;
      }

      public bvi.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bvi.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bvi.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bvc.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bvi.a<T> a(fbr... $$0) {
         for (fbr $$1 : $$0) {
            this.l = this.l.a(bvc.a, $$1);
         }

         return this;
      }

      public bvi.a<T> a(fbr $$0) {
         return this.a(bvc.b, $$0);
      }

      public bvi.a<T> c(float $$0) {
         return this.a(bvc.b, 0.0F, -$$0, 0.0F);
      }

      public bvi.a<T> d(float $$0) {
         return this.a(bvc.c, 0.0F, $$0, 0.0F);
      }

      public bvi.a<T> a(bvc $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bvi.a<T> a(bvc $$0, fbr $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bvi.a<T> a() {
         this.e = false;
         return this;
      }

      public bvi.a<T> b() {
         this.d = false;
         return this;
      }

      public bvi.a<T> c() {
         this.f = true;
         return this;
      }

      public bvi.a<T> a(dkd... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bvi.a<T> d() {
         this.g = true;
         return this;
      }

      public bvi.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bvi.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bvi.a<T> a(csi... $$0) {
         this.m = csm.e.a($$0);
         return this;
      }

      public bvi.a<T> e() {
         this.n = alh.fixed(Optional.empty());
         return this;
      }

      public bvi<T> a(alo<bvi<?>> $$0) {
         if (this.d) {
            ae.a(bin.A, $$0.a().toString());
         }

         return new bvi<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bvb> {
      T create(bvi<T> var1, dgz var2);
   }
}
