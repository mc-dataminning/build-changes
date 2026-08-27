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

public class bqr<T extends bql> implements cmv, duf<bql, T> {
   private static final Logger bA = LogUtils.getLogger();
   private final iv.c<bqr<?>> bB = lc.g.f(this);
   private static final float bC = 1.3964844F;
   private static final int bD = 10;
   public static final bqr<cdz> a = a("allay", bqr.a.a(cdz::new, brh.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bqr<bqh> b = a("area_effect_cloud", bqr.a.<bqh>a(bqh::new, brh.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bqr<cec> c = a("armadillo", bqr.a.a(cec::new, brh.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bqr<cgl> d = a("armor_stand", bqr.a.<cgl>a(cgl::new, brh.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bqr<ckt> e = a("arrow", bqr.a.<ckt>a(ckt::new, brh.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqr<cef> f = a("axolotl", bqr.a.a(cef::new, brh.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bqr<cco> g = a("bat", bqr.a.a(cco::new, brh.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bqr<ccu> h = a("bee", bqr.a.a(ccu::new, brh.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bqr<cha> i = a("blaze", bqr.a.a(cha::new, brh.a).c().a(0.6F, 1.8F).a(8));
   public static final bqr<bqk.b> j = a("block_display", bqr.a.a(bqk.b::new, brh.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqr<cmi> k = a("boat", bqr.a.<cmi>a(cmi::new, brh.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bqr<chb> l = a("bogged", bqr.a.a(chb::new, brh.a).a(0.6F, 1.99F).a(1.74F).a(8).a(cna.c));
   public static final bqr<cin> m = a("breeze", bqr.a.a(cin::new, brh.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cna.c));
   public static final bqr<clu> n = a("breeze_wind_charge", bqr.a.<clu>a(clu::new, brh.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cna.c));
   public static final bqr<cek> o = a("camel", bqr.a.a(cek::new, brh.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bqr<ccw> p = a("cat", bqr.a.a(ccw::new, brh.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bqr<chc> q = a("cave_spider", bqr.a.a(chc::new, brh.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bqr<cmj> r = a("chest_boat", bqr.a.<cmj>a(cmj::new, brh.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bqr<cmn> s = a("chest_minecart", bqr.a.<cmn>a(cmn::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<ccy> t = a("chicken", bqr.a.a(ccy::new, brh.b).a(0.4F, 0.7F).a(0.644F).a(new etf(0.0, 0.7, -0.1)).a(10));
   public static final bqr<ccz> u = a("cod", bqr.a.a(ccz::new, brh.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bqr<cmo> v = a("command_block_minecart", bqr.a.<cmo>a(cmo::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<cda> w = a("cow", bqr.a.a(cda::new, brh.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bqr<chd> x = a("creeper", bqr.a.a(chd::new, brh.a).a(0.6F, 1.7F).a(8));
   public static final bqr<cdb> y = a("dolphin", bqr.a.a(cdb::new, brh.f).a(0.9F, 0.6F).a(0.3F));
   public static final bqr<cey> z = a("donkey", bqr.a.a(cey::new, brh.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bqr<cku> A = a("dragon_fireball", bqr.a.<cku>a(cku::new, brh.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bqr<chf> B = a("drowned", bqr.a.a(chf::new, brh.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bqr<clm> C = a("egg", bqr.a.<clm>a(clm::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<chg> D = a("elder_guardian", bqr.a.a(chg::new, brh.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bqr<cfo> E = a("end_crystal", bqr.a.<cfo>a(cfo::new, brh.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bqr<cfp> F = a("ender_dragon", bqr.a.a(cfp::new, brh.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bqr<cln> G = a("ender_pearl", bqr.a.<cln>a(cln::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<chh> H = a("enderman", bqr.a.a(chh::new, brh.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bqr<chi> I = a("endermite", bqr.a.a(chi::new, brh.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bqr<chk> J = a("evoker", bqr.a.a(chk::new, brh.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqr<ckv> K = a("evoker_fangs", bqr.a.<ckv>a(ckv::new, brh.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bqr<clo> L = a("experience_bottle", bqr.a.<clo>a(clo::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<bqu> M = a("experience_orb", bqr.a.<bqu>a(bqu::new, brh.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bqr<ckw> N = a("eye_of_ender", bqr.a.<ckw>a(ckw::new, brh.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bqr<cgu> O = a("falling_block", bqr.a.<cgu>a(cgu::new, brh.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bqr<cky> P = a("firework_rocket", bqr.a.<cky>a(cky::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<cdd> Q = a("fox", bqr.a.a(cdd::new, brh.b).a(0.6F, 0.7F).a(0.4F).a(new etf(0.0, 0.6375, -0.25)).a(8).a(dcx.oi));
   public static final bqr<cen> R = a("frog", bqr.a.a(cen::new, brh.b).a(0.5F, 0.5F).a(new etf(0.0, 0.375, -0.25)).a(10));
   public static final bqr<cmp> S = a("furnace_minecart", bqr.a.<cmp>a(cmp::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<chl> T = a("ghast", bqr.a.a(chl::new, brh.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bqr<chm> U = a("giant", bqr.a.a(chm::new, brh.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bqr<cgm> V = a("glow_item_frame", bqr.a.<cgm>a(cgm::new, brh.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bqr<bqw> W = a("glow_squid", bqr.a.a(bqw::new, brh.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bqr<cet> X = a("goat", bqr.a.a(cet::new, brh.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bqr<chn> Y = a("guardian", bqr.a.a(chn::new, brh.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bqr<civ> Z = a("hoglin", bqr.a.a(civ::new, brh.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bqr<cmq> aa = a("hopper_minecart", bqr.a.<cmq>a(cmq::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<cez> ab = a("horse", bqr.a.a(cez::new, brh.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bqr<cho> ac = a("husk", bqr.a.a(cho::new, brh.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bqr<chp> ad = a("illusioner", bqr.a.a(chp::new, brh.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqr<bqz> ae = a("interaction", bqr.a.a(bqz::new, brh.h).a(0.0F, 0.0F).a(10));
   public static final bqr<cdf> af = a("iron_golem", bqr.a.a(cdf::new, brh.h).a(1.4F, 2.7F).a(10));
   public static final bqr<cgv> ag = a("item", bqr.a.<cgv>a(cgv::new, brh.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bqr<bqk.g> ah = a("item_display", bqr.a.a(bqk.g::new, brh.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqr<cgo> ai = a("item_frame", bqr.a.<cgo>a(cgo::new, brh.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bqr<clb> aj = a("fireball", bqr.a.<clb>a(clb::new, brh.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bqr<cgp> ak = a("leash_knot", bqr.a.<cgp>a(cgp::new, brh.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bqr<brd> al = a("lightning_bolt", bqr.a.a(brd::new, brh.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bqr<cfa> am = a("llama", bqr.a.a(cfa::new, brh.b).a(0.9F, 1.87F).a(1.7765F).a(new etf(0.0, 1.37, -0.3)).a(10));
   public static final bqr<clc> an = a("llama_spit", bqr.a.<clc>a(clc::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<chq> ao = a("magma_cube", bqr.a.a(chq::new, brh.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bqr<brf> ap = a("marker", bqr.a.a(brf::new, brh.h).a(0.0F, 0.0F).a(0));
   public static final bqr<cmm> aq = a("minecart", bqr.a.<cmm>a(cmm::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<cdg> ar = a("mooshroom", bqr.a.a(cdg::new, brh.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bqr<cfc> as = a("mule", bqr.a.a(cfc::new, brh.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bqr<cdh> at = a("ocelot", bqr.a.a(cdh::new, brh.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bqr<cgq> au = a("painting", bqr.a.<cgq>a(cgq::new, brh.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bqr<cdi> av = a("panda", bqr.a.a(cdi::new, brh.b).a(1.3F, 1.25F).a(10));
   public static final bqr<cdj> aw = a("parrot", bqr.a.a(cdj::new, brh.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bqr<cht> ax = a("phantom", bqr.a.a(cht::new, brh.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bqr<cdk> ay = a("pig", bqr.a.a(cdk::new, brh.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bqr<cjb> az = a("piglin", bqr.a.a(cjb::new, brh.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bqr<cje> aA = a("piglin_brute", bqr.a.a(cje::new, brh.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bqr<chu> aB = a("pillager", bqr.a.a(chu::new, brh.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqr<cdl> aC = a("polar_bear", bqr.a.a(cdl::new, brh.b).a(dcx.qP).a(1.4F, 1.4F).a(10));
   public static final bqr<clp> aD = a("potion", bqr.a.<clp>a(clp::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<cdm> aE = a("pufferfish", bqr.a.a(cdm::new, brh.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bqr<cdn> aF = a("rabbit", bqr.a.a(cdn::new, brh.b).a(0.4F, 0.5F).a(8));
   public static final bqr<chw> aG = a("ravager", bqr.a.a(chw::new, brh.a).a(1.95F, 2.2F).a(new etf(0.0, 2.2625, -0.0625)).a(10));
   public static final bqr<cdo> aH = a("salmon", bqr.a.a(cdo::new, brh.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bqr<cdp> aI = a("sheep", bqr.a.a(cdp::new, brh.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bqr<chx> aJ = a("shulker", bqr.a.a(chx::new, brh.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bqr<clg> aK = a("shulker_bullet", bqr.a.<clg>a(clg::new, brh.h).a(0.3125F, 0.3125F).a(8));
   public static final bqr<chy> aL = a("silverfish", bqr.a.a(chy::new, brh.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bqr<chz> aM = a("skeleton", bqr.a.a(chz::new, brh.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bqr<cfd> aN = a("skeleton_horse", bqr.a.a(cfd::new, brh.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bqr<cia> aO = a("slime", bqr.a.a(cia::new, brh.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bqr<clh> aP = a("small_fireball", bqr.a.<clh>a(clh::new, brh.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bqr<cfk> aQ = a("sniffer", bqr.a.a(cfk::new, brh.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bqr<cdr> aR = a("snow_golem", bqr.a.a(cdr::new, brh.h).a(dcx.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bqr<cli> aS = a("snowball", bqr.a.<cli>a(cli::new, brh.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqr<cmr> aT = a("spawner_minecart", bqr.a.<cmr>a(cmr::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<clj> aU = a("spectral_arrow", bqr.a.<clj>a(clj::new, brh.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqr<cic> aV = a("spider", bqr.a.a(cic::new, brh.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bqr<cds> aW = a("squid", bqr.a.a(cds::new, brh.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bqr<cid> aX = a("stray", bqr.a.a(cid::new, brh.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(dcx.qP).a(8));
   public static final bqr<cie> aY = a("strider", bqr.a.a(cie::new, brh.b).c().a(0.9F, 1.7F).a(10));
   public static final bqr<ceq> aZ = a("tadpole", bqr.a.a(ceq::new, brh.b).a(ceq.c, ceq.d).a(ceq.d * 0.65F).a(10));
   public static final bqr<bqk.l> ba = a("text_display", bqr.a.a(bqk.l::new, brh.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqr<cgw> bb = a("tnt", bqr.a.<cgw>a(cgw::new, brh.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bqr<cms> bc = a("tnt_minecart", bqr.a.<cms>a(cms::new, brh.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqr<cff> bd = a("trader_llama", bqr.a.a(cff::new, brh.b).a(0.9F, 1.87F).a(1.7765F).a(new etf(0.0, 1.37, -0.3)).a(10));
   public static final bqr<clq> be = a("trident", bqr.a.<clq>a(clq::new, brh.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqr<cdt> bf = a("tropical_fish", bqr.a.a(cdt::new, brh.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bqr<cdu> bg = a("turtle", bqr.a.a(cdu::new, brh.b).a(1.2F, 0.4F).a(new etf(0.0, 0.55625, -0.25)).a(10));
   public static final bqr<cif> bh = a("vex", bqr.a.a(cif::new, brh.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bqr<cjy> bi = a("villager", bqr.a.<cjy>a(cjy::new, brh.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bqr<cig> bj = a("vindicator", bqr.a.a(cig::new, brh.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqr<cke> bk = a("wandering_trader", bqr.a.a(cke::new, brh.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bqr<cjp> bl = a("warden", bqr.a.a(cjp::new, brh.a).a(0.9F, 2.9F).a(3.15F).a(bqm.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bqr<clv> bm = a("wind_charge", bqr.a.<clv>a(clv::new, brh.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cna.c));
   public static final bqr<cih> bn = a("witch", bqr.a.a(cih::new, brh.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bqr<cgj> bo = a("wither", bqr.a.a(cgj::new, brh.a).c().a(dcx.cd).a(0.9F, 3.5F).a(10));
   public static final bqr<cii> bp = a("wither_skeleton", bqr.a.a(cii::new, brh.a).c().a(dcx.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bqr<clr> bq = a("wither_skull", bqr.a.<clr>a(clr::new, brh.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bqr<cdw> br = a("wolf", bqr.a.a(cdw::new, brh.b).a(0.6F, 0.85F).a(0.68F).a(new etf(0.0, 0.81875, -0.0625)).a(10));
   public static final bqr<cij> bs = a("zoglin", bqr.a.a(cij::new, brh.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bqr<cik> bt = a("zombie", bqr.a.<cik>a(cik::new, brh.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bqr<cfh> bu = a("zombie_horse", bqr.a.a(cfh::new, brh.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bqr<cil> bv = a("zombie_villager", bqr.a.a(cil::new, brh.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bqr<cim> bw = a("zombified_piglin", bqr.a.a(cim::new, brh.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bqr<ckl> bx = a("player", bqr.a.<ckl>a(brh.h).b().a().a(0.6F, 1.8F).a(1.62F).a(ckl.bU).a(32).b(2));
   public static final bqr<ckz> by = a("fishing_bobber", bqr.a.<ckz>a(ckz::new, brh.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bqr.b<T> bE;
   private final brh bF;
   private final ImmutableSet<dcv> bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final int bL;
   private final int bM;
   @Nullable
   private String bN;
   @Nullable
   private ws bO;
   @Nullable
   private akf bP;
   private final bqo bQ;
   private final cmy bR;

   private static <T extends bql> bqr<T> a(String $$0, bqr.a<T> $$1) {
      return ji.a(lc.g, $$0, $$1.a($$0));
   }

   public static akf a(bqr<?> $$0) {
      return lc.g.b($$0);
   }

   public static Optional<bqr<?>> a(String $$0) {
      return lc.g.b(akf.a($$0));
   }

   public bqr(bqr.b<T> $$0, brh $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dcv> $$6, bqo $$7, int $$8, int $$9, cmy $$10) {
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
   public T a(aqe $$0, @Nullable csd $$1, @Nullable ckl $$2, im $$3, bri $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bql> Consumer<T> a(aqe $$0, csd $$1, @Nullable ckl $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bql> Consumer<T> a(Consumer<T> $$0, aqe $$1, csd $$2, @Nullable ckl $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bql> Consumer<T> a(Consumer<T> $$0, csd $$1) {
      ws $$2 = $$1.a(jz.d);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bql> Consumer<T> b(Consumer<T> $$0, aqe $$1, csd $$2, @Nullable ckl $$3) {
      cuq $$4 = $$2.a(jz.D, cuq.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqe $$0, im $$1, bri $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqe $$0, @Nullable Consumer<T> $$1, im $$2, bri $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqe $$0, @Nullable Consumer<T> $$1, im $$2, bri $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((czu)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cI());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, axw.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof brg $$9) {
            $$9.bb = $$9.dD();
            $$9.aZ = $$9.dD();
            $$9.a($$0, $$0.d_($$9.dn()), $$3, null);
            $$9.P();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(czx $$0, im $$1, boolean $$2, eta $$3) {
      eta $$4 = new eta($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ety> $$5 = $$0.d(null, $$4);
      return 1.0 + etv.a(ir.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(czu $$0, @Nullable ckl $$1, @Nullable bql $$2, cuq $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cN() || $$1 != null && $$4.ah().f($$1.fZ())) {
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

   public brh f() {
      return this.bF;
   }

   public String g() {
      if (this.bN == null) {
         this.bN = ac.a("entity", lc.g.b(this));
      }

      return this.bN;
   }

   public ws h() {
      if (this.bO == null) {
         this.bO = ws.c(this.g());
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

   public akf j() {
      if (this.bP == null) {
         akf $$0 = lc.g.b(this);
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
   public cmy m() {
      return this.bR;
   }

   @Nullable
   public T a(czu $$0) {
      return !this.a($$0.J()) ? null : this.bE.create(this, $$0);
   }

   public static Optional<bql> a(ty $$0, czu $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bA.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eta a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eta($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dpy $$0) {
      if (this.bG.contains($$0.b())) {
         return false;
      } else {
         return !this.bJ && eme.a($$0) ? true : $$0.a(dcx.cd) || $$0.a(dcx.oi) || $$0.a(dcx.dQ) || $$0.a(dcx.qP);
      }
   }

   public bqo n() {
      return this.bQ;
   }

   public static Optional<bqr<?>> a(ty $$0) {
      return lc.g.b(new akf($$0.l("id")));
   }

   @Nullable
   public static bql a(ty $$0, czu $$1, Function<bql, bql> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ue $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bql $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bql)$$3;
      }).orElse(null);
   }

   public static Stream<bql> a(final List<? extends uv> $$0, final czu $$1) {
      final Spliterator<? extends uv> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bql>() {
         @Override
         public boolean tryAdvance(Consumer<? super bql> $$0x) {
            return $$2.tryAdvance($$2xx -> bqr.a((ty)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bql> trySplit() {
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

   private static Optional<bql> b(ty $$0, czu $$1) {
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

   public boolean a(awd<bqr<?>> $$0) {
      return this.bB.a($$0);
   }

   public boolean a(iz<bqr<?>> $$0) {
      return $$0.a(this.bB);
   }

   @Nullable
   public T a(bql $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bql> a() {
      return bql.class;
   }

   @Deprecated
   public iv.c<bqr<?>> r() {
      return this.bB;
   }

   public static class a<T extends bql> {
      private final bqr.b<T> a;
      private final brh b;
      private ImmutableSet<dcv> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bqo j = bqo.b(0.6F, 1.8F);
      private bqn.a k = bqn.a();
      private cmy l = cna.g;

      private a(bqr.b<T> $$0, brh $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == brh.b || $$1 == brh.h;
      }

      public static <T extends bql> bqr.a<T> a(bqr.b<T> $$0, brh $$1) {
         return new bqr.a<>($$0, $$1);
      }

      public static <T extends bql> bqr.a<T> a(brh $$0) {
         return new bqr.a<>(($$0x, $$1) -> null, $$0);
      }

      public bqr.a<T> a(float $$0, float $$1) {
         this.j = bqo.b($$0, $$1);
         return this;
      }

      public bqr.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bqr.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bqm.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bqr.a<T> a(etf... $$0) {
         for (etf $$1 : $$0) {
            this.k = this.k.a(bqm.a, $$1);
         }

         return this;
      }

      public bqr.a<T> a(etf $$0) {
         return this.a(bqm.b, $$0);
      }

      public bqr.a<T> b(float $$0) {
         return this.a(bqm.b, 0.0F, -$$0, 0.0F);
      }

      public bqr.a<T> c(float $$0) {
         return this.a(bqm.c, 0.0F, $$0, 0.0F);
      }

      public bqr.a<T> a(bqm $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bqr.a<T> a(bqm $$0, etf $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bqr.a<T> a() {
         this.e = false;
         return this;
      }

      public bqr.a<T> b() {
         this.d = false;
         return this;
      }

      public bqr.a<T> c() {
         this.f = true;
         return this;
      }

      public bqr.a<T> a(dcv... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bqr.a<T> d() {
         this.g = true;
         return this;
      }

      public bqr.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bqr.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bqr.a<T> a(cmw... $$0) {
         this.l = cna.e.a($$0);
         return this;
      }

      public bqr<T> a(String $$0) {
         if (this.d) {
            ac.a(bfp.y, $$0);
         }

         return new bqr<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bql> {
      T create(bqr<T> var1, czu var2);
   }
}
