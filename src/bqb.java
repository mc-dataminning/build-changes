import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bqb<T extends bpv> implements cmd, dtg<bpv, T> {
   private static final Logger bA = LogUtils.getLogger();
   private final il.c<bqb<?>> bB = kr.g.f(this);
   private static final float bC = 1.3964844F;
   private static final int bD = 10;
   public static final bqb<cdh> a = a("allay", bqb.a.a(cdh::new, bqr.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bqb<bpr> b = a("area_effect_cloud", bqb.a.<bpr>a(bpr::new, bqr.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bqb<cdk> c = a("armadillo", bqb.a.a(cdk::new, bqr.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bqb<cft> d = a("armor_stand", bqb.a.<cft>a(cft::new, bqr.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bqb<ckb> e = a("arrow", bqb.a.<ckb>a(ckb::new, bqr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqb<cdn> f = a("axolotl", bqb.a.a(cdn::new, bqr.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bqb<cby> g = a("bat", bqb.a.a(cby::new, bqr.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bqb<cce> h = a("bee", bqb.a.a(cce::new, bqr.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bqb<cgi> i = a("blaze", bqb.a.a(cgi::new, bqr.a).c().a(0.6F, 1.8F).a(8));
   public static final bqb<bpu.b> j = a("block_display", bqb.a.a(bpu.b::new, bqr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqb<clq> k = a("boat", bqb.a.<clq>a(clq::new, bqr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bqb<cgj> l = a("bogged", bqb.a.a(cgj::new, bqr.a).a(0.6F, 1.99F).a(1.74F).a(8).a(cmi.c));
   public static final bqb<chv> m = a("breeze", bqb.a.a(chv::new, bqr.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cmi.c));
   public static final bqb<clc> n = a("breeze_wind_charge", bqb.a.<clc>a(clc::new, bqr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cmi.c));
   public static final bqb<cds> o = a("camel", bqb.a.a(cds::new, bqr.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bqb<ccg> p = a("cat", bqb.a.a(ccg::new, bqr.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bqb<cgk> q = a("cave_spider", bqb.a.a(cgk::new, bqr.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bqb<clr> r = a("chest_boat", bqb.a.<clr>a(clr::new, bqr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bqb<clv> s = a("chest_minecart", bqb.a.<clv>a(clv::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<cci> t = a("chicken", bqb.a.a(cci::new, bqr.b).a(0.4F, 0.7F).a(0.644F).a(new esa(0.0, 0.7, -0.1)).a(10));
   public static final bqb<ccj> u = a("cod", bqb.a.a(ccj::new, bqr.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bqb<clw> v = a("command_block_minecart", bqb.a.<clw>a(clw::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<cck> w = a("cow", bqb.a.a(cck::new, bqr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bqb<cgl> x = a("creeper", bqb.a.a(cgl::new, bqr.a).a(0.6F, 1.7F).a(8));
   public static final bqb<ccl> y = a("dolphin", bqb.a.a(ccl::new, bqr.f).a(0.9F, 0.6F).a(0.3F));
   public static final bqb<ceg> z = a("donkey", bqb.a.a(ceg::new, bqr.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bqb<ckc> A = a("dragon_fireball", bqb.a.<ckc>a(ckc::new, bqr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bqb<cgn> B = a("drowned", bqb.a.a(cgn::new, bqr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bqb<cku> C = a("egg", bqb.a.<cku>a(cku::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<cgo> D = a("elder_guardian", bqb.a.a(cgo::new, bqr.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bqb<cew> E = a("end_crystal", bqb.a.<cew>a(cew::new, bqr.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bqb<cex> F = a("ender_dragon", bqb.a.a(cex::new, bqr.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bqb<ckv> G = a("ender_pearl", bqb.a.<ckv>a(ckv::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<cgp> H = a("enderman", bqb.a.a(cgp::new, bqr.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bqb<cgq> I = a("endermite", bqb.a.a(cgq::new, bqr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bqb<cgs> J = a("evoker", bqb.a.a(cgs::new, bqr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqb<ckd> K = a("evoker_fangs", bqb.a.<ckd>a(ckd::new, bqr.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bqb<ckw> L = a("experience_bottle", bqb.a.<ckw>a(ckw::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<bqe> M = a("experience_orb", bqb.a.<bqe>a(bqe::new, bqr.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bqb<cke> N = a("eye_of_ender", bqb.a.<cke>a(cke::new, bqr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bqb<cgc> O = a("falling_block", bqb.a.<cgc>a(cgc::new, bqr.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bqb<ckg> P = a("firework_rocket", bqb.a.<ckg>a(ckg::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<ccn> Q = a("fox", bqb.a.a(ccn::new, bqr.b).a(0.6F, 0.7F).a(0.4F).a(new esa(0.0, 0.6375, -0.25)).a(8).a(dca.oi));
   public static final bqb<cdv> R = a("frog", bqb.a.a(cdv::new, bqr.b).a(0.5F, 0.5F).a(new esa(0.0, 0.375, -0.25)).a(10));
   public static final bqb<clx> S = a("furnace_minecart", bqb.a.<clx>a(clx::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<cgt> T = a("ghast", bqb.a.a(cgt::new, bqr.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bqb<cgu> U = a("giant", bqb.a.a(cgu::new, bqr.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bqb<cfu> V = a("glow_item_frame", bqb.a.<cfu>a(cfu::new, bqr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bqb<bqg> W = a("glow_squid", bqb.a.a(bqg::new, bqr.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bqb<ceb> X = a("goat", bqb.a.a(ceb::new, bqr.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bqb<cgv> Y = a("guardian", bqb.a.a(cgv::new, bqr.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bqb<cid> Z = a("hoglin", bqb.a.a(cid::new, bqr.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bqb<cly> aa = a("hopper_minecart", bqb.a.<cly>a(cly::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<ceh> ab = a("horse", bqb.a.a(ceh::new, bqr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bqb<cgw> ac = a("husk", bqb.a.a(cgw::new, bqr.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bqb<cgx> ad = a("illusioner", bqb.a.a(cgx::new, bqr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqb<bqj> ae = a("interaction", bqb.a.a(bqj::new, bqr.h).a(0.0F, 0.0F).a(10));
   public static final bqb<ccp> af = a("iron_golem", bqb.a.a(ccp::new, bqr.h).a(1.4F, 2.7F).a(10));
   public static final bqb<cgd> ag = a("item", bqb.a.<cgd>a(cgd::new, bqr.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bqb<bpu.g> ah = a("item_display", bqb.a.a(bpu.g::new, bqr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqb<cfw> ai = a("item_frame", bqb.a.<cfw>a(cfw::new, bqr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bqb<ckj> aj = a("fireball", bqb.a.<ckj>a(ckj::new, bqr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bqb<cfx> ak = a("leash_knot", bqb.a.<cfx>a(cfx::new, bqr.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bqb<bqn> al = a("lightning_bolt", bqb.a.a(bqn::new, bqr.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bqb<cei> am = a("llama", bqb.a.a(cei::new, bqr.b).a(0.9F, 1.87F).a(1.7765F).a(new esa(0.0, 1.37, -0.3)).a(10));
   public static final bqb<ckk> an = a("llama_spit", bqb.a.<ckk>a(ckk::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<cgy> ao = a("magma_cube", bqb.a.a(cgy::new, bqr.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bqb<bqp> ap = a("marker", bqb.a.a(bqp::new, bqr.h).a(0.0F, 0.0F).a(0));
   public static final bqb<clu> aq = a("minecart", bqb.a.<clu>a(clu::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<ccq> ar = a("mooshroom", bqb.a.a(ccq::new, bqr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bqb<cek> as = a("mule", bqb.a.a(cek::new, bqr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bqb<ccr> at = a("ocelot", bqb.a.a(ccr::new, bqr.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bqb<cfy> au = a("painting", bqb.a.<cfy>a(cfy::new, bqr.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bqb<ccs> av = a("panda", bqb.a.a(ccs::new, bqr.b).a(1.3F, 1.25F).a(10));
   public static final bqb<cct> aw = a("parrot", bqb.a.a(cct::new, bqr.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bqb<chb> ax = a("phantom", bqb.a.a(chb::new, bqr.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bqb<ccu> ay = a("pig", bqb.a.a(ccu::new, bqr.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bqb<cij> az = a("piglin", bqb.a.a(cij::new, bqr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bqb<cim> aA = a("piglin_brute", bqb.a.a(cim::new, bqr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bqb<chc> aB = a("pillager", bqb.a.a(chc::new, bqr.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqb<ccv> aC = a("polar_bear", bqb.a.a(ccv::new, bqr.b).a(dca.qP).a(1.4F, 1.4F).a(10));
   public static final bqb<ckx> aD = a("potion", bqb.a.<ckx>a(ckx::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<ccw> aE = a("pufferfish", bqb.a.a(ccw::new, bqr.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bqb<ccx> aF = a("rabbit", bqb.a.a(ccx::new, bqr.b).a(0.4F, 0.5F).a(8));
   public static final bqb<che> aG = a("ravager", bqb.a.a(che::new, bqr.a).a(1.95F, 2.2F).a(new esa(0.0, 2.2625, -0.0625)).a(10));
   public static final bqb<ccy> aH = a("salmon", bqb.a.a(ccy::new, bqr.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bqb<ccz> aI = a("sheep", bqb.a.a(ccz::new, bqr.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bqb<chf> aJ = a("shulker", bqb.a.a(chf::new, bqr.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bqb<cko> aK = a("shulker_bullet", bqb.a.<cko>a(cko::new, bqr.h).a(0.3125F, 0.3125F).a(8));
   public static final bqb<chg> aL = a("silverfish", bqb.a.a(chg::new, bqr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bqb<chh> aM = a("skeleton", bqb.a.a(chh::new, bqr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bqb<cel> aN = a("skeleton_horse", bqb.a.a(cel::new, bqr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bqb<chi> aO = a("slime", bqb.a.a(chi::new, bqr.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bqb<ckp> aP = a("small_fireball", bqb.a.<ckp>a(ckp::new, bqr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bqb<ces> aQ = a("sniffer", bqb.a.a(ces::new, bqr.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bqb<cdb> aR = a("snow_golem", bqb.a.a(cdb::new, bqr.h).a(dca.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bqb<ckq> aS = a("snowball", bqb.a.<ckq>a(ckq::new, bqr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqb<clz> aT = a("spawner_minecart", bqb.a.<clz>a(clz::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<ckr> aU = a("spectral_arrow", bqb.a.<ckr>a(ckr::new, bqr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqb<chk> aV = a("spider", bqb.a.a(chk::new, bqr.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bqb<cdc> aW = a("squid", bqb.a.a(cdc::new, bqr.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bqb<chl> aX = a("stray", bqb.a.a(chl::new, bqr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(dca.qP).a(8));
   public static final bqb<chm> aY = a("strider", bqb.a.a(chm::new, bqr.b).c().a(0.9F, 1.7F).a(10));
   public static final bqb<cdy> aZ = a("tadpole", bqb.a.a(cdy::new, bqr.b).a(cdy.c, cdy.d).a(cdy.d * 0.65F).a(10));
   public static final bqb<bpu.l> ba = a("text_display", bqb.a.a(bpu.l::new, bqr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqb<cge> bb = a("tnt", bqb.a.<cge>a(cge::new, bqr.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bqb<cma> bc = a("tnt_minecart", bqb.a.<cma>a(cma::new, bqr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqb<cen> bd = a("trader_llama", bqb.a.a(cen::new, bqr.b).a(0.9F, 1.87F).a(1.7765F).a(new esa(0.0, 1.37, -0.3)).a(10));
   public static final bqb<cky> be = a("trident", bqb.a.<cky>a(cky::new, bqr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqb<cdd> bf = a("tropical_fish", bqb.a.a(cdd::new, bqr.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bqb<cde> bg = a("turtle", bqb.a.a(cde::new, bqr.b).a(1.2F, 0.4F).a(new esa(0.0, 0.55625, -0.25)).a(10));
   public static final bqb<chn> bh = a("vex", bqb.a.a(chn::new, bqr.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bqb<cjg> bi = a("villager", bqb.a.<cjg>a(cjg::new, bqr.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bqb<cho> bj = a("vindicator", bqb.a.a(cho::new, bqr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqb<cjm> bk = a("wandering_trader", bqb.a.a(cjm::new, bqr.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bqb<cix> bl = a("warden", bqb.a.a(cix::new, bqr.a).a(0.9F, 2.9F).a(3.15F).a(bpw.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bqb<cld> bm = a("wind_charge", bqb.a.<cld>a(cld::new, bqr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cmi.c));
   public static final bqb<chp> bn = a("witch", bqb.a.a(chp::new, bqr.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bqb<cfr> bo = a("wither", bqb.a.a(cfr::new, bqr.a).c().a(dca.cd).a(0.9F, 3.5F).a(10));
   public static final bqb<chq> bp = a("wither_skeleton", bqb.a.a(chq::new, bqr.a).c().a(dca.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bqb<ckz> bq = a("wither_skull", bqb.a.<ckz>a(ckz::new, bqr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bqb<cdg> br = a("wolf", bqb.a.a(cdg::new, bqr.b).a(0.6F, 0.85F).a(0.68F).a(new esa(0.0, 0.81875, -0.0625)).a(10));
   public static final bqb<chr> bs = a("zoglin", bqb.a.a(chr::new, bqr.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bqb<chs> bt = a("zombie", bqb.a.<chs>a(chs::new, bqr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bqb<cep> bu = a("zombie_horse", bqb.a.a(cep::new, bqr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bqb<cht> bv = a("zombie_villager", bqb.a.a(cht::new, bqr.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bqb<chu> bw = a("zombified_piglin", bqb.a.a(chu::new, bqr.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bqb<cjt> bx = a("player", bqb.a.<cjt>a(bqr.h).b().a().a(0.6F, 1.8F).a(1.62F).a(cjt.bQ).a(32).b(2));
   public static final bqb<ckh> by = a("fishing_bobber", bqb.a.<ckh>a(ckh::new, bqr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bqb.b<T> bE;
   private final bqr bF;
   private final ImmutableSet<dby> bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final int bL;
   private final int bM;
   @Nullable
   private String bN;
   @Nullable
   private wg bO;
   @Nullable
   private ajt bP;
   private final bpy bQ;
   private final cmg bR;

   private static <T extends bpv> bqb<T> a(String $$0, bqb.a<T> $$1) {
      return iy.a(kr.g, $$0, $$1.a($$0));
   }

   public static ajt a(bqb<?> $$0) {
      return kr.g.b($$0);
   }

   public static Optional<bqb<?>> a(String $$0) {
      return kr.g.b(ajt.a($$0));
   }

   public bqb(bqb.b<T> $$0, bqr $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dby> $$6, bpy $$7, int $$8, int $$9, cmg $$10) {
      this.bE = $$0;
      this.bF = $$1;
      this.bK = $$5;
      this.bH = $$2;
      this.bI = $$3;
      this.bJ = $$4;
      this.bG = $$6;
      this.bQ = $$7;
      this.bL = $$8;
      this.bM = $$9;
      this.bR = $$10;
   }

   @Nullable
   public T a(aps $$0, @Nullable crj $$1, @Nullable cjt $$2, ib $$3, bqs $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bpv> Consumer<T> a(aps $$0, crj $$1, @Nullable cjt $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bpv> Consumer<T> a(Consumer<T> $$0, aps $$1, crj $$2, @Nullable cjt $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bpv> Consumer<T> a(Consumer<T> $$0, crj $$1) {
      wg $$2 = $$1.a(jp.d);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bpv> Consumer<T> b(Consumer<T> $$0, aps $$1, crj $$2, @Nullable cjt $$3) {
      ctt $$4 = $$2.a(jp.D, ctt.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aps $$0, ib $$1, bqs $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aps $$0, @Nullable Consumer<T> $$1, ib $$2, bqs $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aps $$0, @Nullable Consumer<T> $$1, ib $$2, bqs $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((cyx)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cH());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, axk.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bqq $$9) {
            $$9.aZ = $$9.dC();
            $$9.aX = $$9.dC();
            $$9.a($$0, $$0.d_($$9.dm()), $$3, null);
            $$9.P();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(cza $$0, ib $$1, boolean $$2, erv $$3) {
      erv $$4 = new erv($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<est> $$5 = $$0.d(null, $$4);
      return 1.0 + esq.a(ih.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cyx $$0, @Nullable cjt $$1, @Nullable bpv $$2, ctt $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cM() || $$1 != null && $$4.ah().f($$1.fY())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bH;
   }

   public boolean c() {
      return this.bI;
   }

   public boolean d() {
      return this.bJ;
   }

   public boolean e() {
      return this.bK;
   }

   public bqr f() {
      return this.bF;
   }

   public String g() {
      if (this.bN == null) {
         this.bN = ac.a("entity", kr.g.b(this));
      }

      return this.bN;
   }

   public wg h() {
      if (this.bO == null) {
         this.bO = wg.c(this.g());
      }

      return this.bO;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public ajt j() {
      if (this.bP == null) {
         ajt $$0 = kr.g.b(this);
         this.bP = $$0.d("entities/");
      }

      return this.bP;
   }

   public float k() {
      return this.bQ.a();
   }

   public float l() {
      return this.bQ.b();
   }

   @Override
   public cmg m() {
      return this.bR;
   }

   @Nullable
   public T a(cyx $$0) {
      return !this.a($$0.J()) ? null : this.bE.create(this, $$0);
   }

   public static Optional<bpv> a(tm $$0, cyx $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bA.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public erv a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new erv($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(doz $$0) {
      if (this.bG.contains($$0.b())) {
         return false;
      } else {
         return !this.bJ && elf.a($$0) ? true : $$0.a(dca.cd) || $$0.a(dca.oi) || $$0.a(dca.dQ) || $$0.a(dca.qP);
      }
   }

   public bpy n() {
      return this.bQ;
   }

   public static Optional<bqb<?>> a(tm $$0) {
      return kr.g.b(new ajt($$0.l("id")));
   }

   @Nullable
   public static bpv a(tm $$0, cyx $$1, Function<bpv, bpv> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ts $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bpv $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bpv)$$3;
      }).orElse(null);
   }

   public static Stream<bpv> a(final List<? extends uj> $$0, final cyx $$1) {
      final Spliterator<? extends uj> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bpv>() {
         @Override
         public boolean tryAdvance(Consumer<? super bpv> $$0x) {
            return $$2.tryAdvance($$2xx -> bqb.a((tm)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bpv> trySplit() {
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

   private static Optional<bpv> b(tm $$0, cyx $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bA.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bL;
   }

   public int p() {
      return this.bM;
   }

   public boolean q() {
      return this != bx && this != an && this != bo && this != g && this != ai && this != V && this != ak && this != au && this != E && this != K;
   }

   public boolean a(avr<bqb<?>> $$0) {
      return this.bB.a($$0);
   }

   public boolean a(ip<bqb<?>> $$0) {
      return $$0.a(this.bB);
   }

   @Nullable
   public T a(bpv $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bpv> a() {
      return bpv.class;
   }

   @Deprecated
   public il.c<bqb<?>> r() {
      return this.bB;
   }

   public static class a<T extends bpv> {
      private final bqb.b<T> a;
      private final bqr b;
      private ImmutableSet<dby> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bpy j = bpy.b(0.6F, 1.8F);
      private bpx.a k = bpx.a();
      private cmg l = cmi.g;

      private a(bqb.b<T> $$0, bqr $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bqr.b || $$1 == bqr.h;
      }

      public static <T extends bpv> bqb.a<T> a(bqb.b<T> $$0, bqr $$1) {
         return new bqb.a<>($$0, $$1);
      }

      public static <T extends bpv> bqb.a<T> a(bqr $$0) {
         return new bqb.a<>(($$0x, $$1) -> null, $$0);
      }

      public bqb.a<T> a(float $$0, float $$1) {
         this.j = bpy.b($$0, $$1);
         return this;
      }

      public bqb.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bqb.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bpw.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bqb.a<T> a(esa... $$0) {
         for (esa $$1 : $$0) {
            this.k = this.k.a(bpw.a, $$1);
         }

         return this;
      }

      public bqb.a<T> a(esa $$0) {
         return this.a(bpw.b, $$0);
      }

      public bqb.a<T> b(float $$0) {
         return this.a(bpw.b, 0.0F, -$$0, 0.0F);
      }

      public bqb.a<T> c(float $$0) {
         return this.a(bpw.c, 0.0F, $$0, 0.0F);
      }

      public bqb.a<T> a(bpw $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bqb.a<T> a(bpw $$0, esa $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bqb.a<T> a() {
         this.e = false;
         return this;
      }

      public bqb.a<T> b() {
         this.d = false;
         return this;
      }

      public bqb.a<T> c() {
         this.f = true;
         return this;
      }

      public bqb.a<T> a(dby... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bqb.a<T> d() {
         this.g = true;
         return this;
      }

      public bqb.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bqb.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bqb.a<T> a(cme... $$0) {
         this.l = cmi.e.a($$0);
         return this;
      }

      public bqb<T> a(String $$0) {
         if (this.d) {
            ac.a(bfa.y, $$0);
         }

         return new bqb<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bpv> {
      T create(bqb<T> var1, cyx var2);
   }
}
