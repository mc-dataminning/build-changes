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

public class bqg<T extends bqa> implements cmk, dtp<bqa, T> {
   private static final Logger bA = LogUtils.getLogger();
   private final in.c<bqg<?>> bB = kt.g.f(this);
   private static final float bC = 1.3964844F;
   private static final int bD = 10;
   public static final bqg<cdo> a = a("allay", bqg.a.a(cdo::new, bqw.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bqg<bpw> b = a("area_effect_cloud", bqg.a.<bpw>a(bpw::new, bqw.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bqg<cdr> c = a("armadillo", bqg.a.a(cdr::new, bqw.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bqg<cga> d = a("armor_stand", bqg.a.<cga>a(cga::new, bqw.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bqg<cki> e = a("arrow", bqg.a.<cki>a(cki::new, bqw.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqg<cdu> f = a("axolotl", bqg.a.a(cdu::new, bqw.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bqg<ccd> g = a("bat", bqg.a.a(ccd::new, bqw.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bqg<ccj> h = a("bee", bqg.a.a(ccj::new, bqw.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bqg<cgp> i = a("blaze", bqg.a.a(cgp::new, bqw.a).c().a(0.6F, 1.8F).a(8));
   public static final bqg<bpz.b> j = a("block_display", bqg.a.a(bpz.b::new, bqw.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqg<clx> k = a("boat", bqg.a.<clx>a(clx::new, bqw.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bqg<cgq> l = a("bogged", bqg.a.a(cgq::new, bqw.a).a(0.6F, 1.99F).a(1.74F).a(8).a(cmp.c));
   public static final bqg<cic> m = a("breeze", bqg.a.a(cic::new, bqw.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cmp.c));
   public static final bqg<clj> n = a("breeze_wind_charge", bqg.a.<clj>a(clj::new, bqw.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cmp.c));
   public static final bqg<cdz> o = a("camel", bqg.a.a(cdz::new, bqw.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bqg<ccl> p = a("cat", bqg.a.a(ccl::new, bqw.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bqg<cgr> q = a("cave_spider", bqg.a.a(cgr::new, bqw.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bqg<cly> r = a("chest_boat", bqg.a.<cly>a(cly::new, bqw.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bqg<cmc> s = a("chest_minecart", bqg.a.<cmc>a(cmc::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<ccn> t = a("chicken", bqg.a.a(ccn::new, bqw.b).a(0.4F, 0.7F).a(0.644F).a(new esj(0.0, 0.7, -0.1)).a(10));
   public static final bqg<cco> u = a("cod", bqg.a.a(cco::new, bqw.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bqg<cmd> v = a("command_block_minecart", bqg.a.<cmd>a(cmd::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<ccp> w = a("cow", bqg.a.a(ccp::new, bqw.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bqg<cgs> x = a("creeper", bqg.a.a(cgs::new, bqw.a).a(0.6F, 1.7F).a(8));
   public static final bqg<ccq> y = a("dolphin", bqg.a.a(ccq::new, bqw.f).a(0.9F, 0.6F).a(0.3F));
   public static final bqg<cen> z = a("donkey", bqg.a.a(cen::new, bqw.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bqg<ckj> A = a("dragon_fireball", bqg.a.<ckj>a(ckj::new, bqw.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bqg<cgu> B = a("drowned", bqg.a.a(cgu::new, bqw.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bqg<clb> C = a("egg", bqg.a.<clb>a(clb::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<cgv> D = a("elder_guardian", bqg.a.a(cgv::new, bqw.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bqg<cfd> E = a("end_crystal", bqg.a.<cfd>a(cfd::new, bqw.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bqg<cfe> F = a("ender_dragon", bqg.a.a(cfe::new, bqw.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bqg<clc> G = a("ender_pearl", bqg.a.<clc>a(clc::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<cgw> H = a("enderman", bqg.a.a(cgw::new, bqw.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bqg<cgx> I = a("endermite", bqg.a.a(cgx::new, bqw.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bqg<cgz> J = a("evoker", bqg.a.a(cgz::new, bqw.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqg<ckk> K = a("evoker_fangs", bqg.a.<ckk>a(ckk::new, bqw.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bqg<cld> L = a("experience_bottle", bqg.a.<cld>a(cld::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<bqj> M = a("experience_orb", bqg.a.<bqj>a(bqj::new, bqw.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bqg<ckl> N = a("eye_of_ender", bqg.a.<ckl>a(ckl::new, bqw.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bqg<cgj> O = a("falling_block", bqg.a.<cgj>a(cgj::new, bqw.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bqg<ckn> P = a("firework_rocket", bqg.a.<ckn>a(ckn::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<ccs> Q = a("fox", bqg.a.a(ccs::new, bqw.b).a(0.6F, 0.7F).a(0.4F).a(new esj(0.0, 0.6375, -0.25)).a(8).a(dcj.oi));
   public static final bqg<cec> R = a("frog", bqg.a.a(cec::new, bqw.b).a(0.5F, 0.5F).a(new esj(0.0, 0.375, -0.25)).a(10));
   public static final bqg<cme> S = a("furnace_minecart", bqg.a.<cme>a(cme::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<cha> T = a("ghast", bqg.a.a(cha::new, bqw.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bqg<chb> U = a("giant", bqg.a.a(chb::new, bqw.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bqg<cgb> V = a("glow_item_frame", bqg.a.<cgb>a(cgb::new, bqw.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bqg<bql> W = a("glow_squid", bqg.a.a(bql::new, bqw.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bqg<cei> X = a("goat", bqg.a.a(cei::new, bqw.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bqg<chc> Y = a("guardian", bqg.a.a(chc::new, bqw.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bqg<cik> Z = a("hoglin", bqg.a.a(cik::new, bqw.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bqg<cmf> aa = a("hopper_minecart", bqg.a.<cmf>a(cmf::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<ceo> ab = a("horse", bqg.a.a(ceo::new, bqw.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bqg<chd> ac = a("husk", bqg.a.a(chd::new, bqw.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bqg<che> ad = a("illusioner", bqg.a.a(che::new, bqw.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqg<bqo> ae = a("interaction", bqg.a.a(bqo::new, bqw.h).a(0.0F, 0.0F).a(10));
   public static final bqg<ccu> af = a("iron_golem", bqg.a.a(ccu::new, bqw.h).a(1.4F, 2.7F).a(10));
   public static final bqg<cgk> ag = a("item", bqg.a.<cgk>a(cgk::new, bqw.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bqg<bpz.g> ah = a("item_display", bqg.a.a(bpz.g::new, bqw.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqg<cgd> ai = a("item_frame", bqg.a.<cgd>a(cgd::new, bqw.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bqg<ckq> aj = a("fireball", bqg.a.<ckq>a(ckq::new, bqw.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bqg<cge> ak = a("leash_knot", bqg.a.<cge>a(cge::new, bqw.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bqg<bqs> al = a("lightning_bolt", bqg.a.a(bqs::new, bqw.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bqg<cep> am = a("llama", bqg.a.a(cep::new, bqw.b).a(0.9F, 1.87F).a(1.7765F).a(new esj(0.0, 1.37, -0.3)).a(10));
   public static final bqg<ckr> an = a("llama_spit", bqg.a.<ckr>a(ckr::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<chf> ao = a("magma_cube", bqg.a.a(chf::new, bqw.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bqg<bqu> ap = a("marker", bqg.a.a(bqu::new, bqw.h).a(0.0F, 0.0F).a(0));
   public static final bqg<cmb> aq = a("minecart", bqg.a.<cmb>a(cmb::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<ccv> ar = a("mooshroom", bqg.a.a(ccv::new, bqw.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bqg<cer> as = a("mule", bqg.a.a(cer::new, bqw.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bqg<ccw> at = a("ocelot", bqg.a.a(ccw::new, bqw.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bqg<cgf> au = a("painting", bqg.a.<cgf>a(cgf::new, bqw.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bqg<ccx> av = a("panda", bqg.a.a(ccx::new, bqw.b).a(1.3F, 1.25F).a(10));
   public static final bqg<ccy> aw = a("parrot", bqg.a.a(ccy::new, bqw.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bqg<chi> ax = a("phantom", bqg.a.a(chi::new, bqw.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bqg<ccz> ay = a("pig", bqg.a.a(ccz::new, bqw.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bqg<ciq> az = a("piglin", bqg.a.a(ciq::new, bqw.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bqg<cit> aA = a("piglin_brute", bqg.a.a(cit::new, bqw.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bqg<chj> aB = a("pillager", bqg.a.a(chj::new, bqw.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqg<cda> aC = a("polar_bear", bqg.a.a(cda::new, bqw.b).a(dcj.qP).a(1.4F, 1.4F).a(10));
   public static final bqg<cle> aD = a("potion", bqg.a.<cle>a(cle::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<cdb> aE = a("pufferfish", bqg.a.a(cdb::new, bqw.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bqg<cdc> aF = a("rabbit", bqg.a.a(cdc::new, bqw.b).a(0.4F, 0.5F).a(8));
   public static final bqg<chl> aG = a("ravager", bqg.a.a(chl::new, bqw.a).a(1.95F, 2.2F).a(new esj(0.0, 2.2625, -0.0625)).a(10));
   public static final bqg<cdd> aH = a("salmon", bqg.a.a(cdd::new, bqw.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bqg<cde> aI = a("sheep", bqg.a.a(cde::new, bqw.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bqg<chm> aJ = a("shulker", bqg.a.a(chm::new, bqw.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bqg<ckv> aK = a("shulker_bullet", bqg.a.<ckv>a(ckv::new, bqw.h).a(0.3125F, 0.3125F).a(8));
   public static final bqg<chn> aL = a("silverfish", bqg.a.a(chn::new, bqw.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bqg<cho> aM = a("skeleton", bqg.a.a(cho::new, bqw.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bqg<ces> aN = a("skeleton_horse", bqg.a.a(ces::new, bqw.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bqg<chp> aO = a("slime", bqg.a.a(chp::new, bqw.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bqg<ckw> aP = a("small_fireball", bqg.a.<ckw>a(ckw::new, bqw.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bqg<cez> aQ = a("sniffer", bqg.a.a(cez::new, bqw.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bqg<cdg> aR = a("snow_golem", bqg.a.a(cdg::new, bqw.h).a(dcj.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bqg<ckx> aS = a("snowball", bqg.a.<ckx>a(ckx::new, bqw.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bqg<cmg> aT = a("spawner_minecart", bqg.a.<cmg>a(cmg::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<cky> aU = a("spectral_arrow", bqg.a.<cky>a(cky::new, bqw.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqg<chr> aV = a("spider", bqg.a.a(chr::new, bqw.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bqg<cdh> aW = a("squid", bqg.a.a(cdh::new, bqw.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bqg<chs> aX = a("stray", bqg.a.a(chs::new, bqw.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(dcj.qP).a(8));
   public static final bqg<cht> aY = a("strider", bqg.a.a(cht::new, bqw.b).c().a(0.9F, 1.7F).a(10));
   public static final bqg<cef> aZ = a("tadpole", bqg.a.a(cef::new, bqw.b).a(cef.c, cef.d).a(cef.d * 0.65F).a(10));
   public static final bqg<bpz.l> ba = a("text_display", bqg.a.a(bpz.l::new, bqw.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bqg<cgl> bb = a("tnt", bqg.a.<cgl>a(cgl::new, bqw.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bqg<cmh> bc = a("tnt_minecart", bqg.a.<cmh>a(cmh::new, bqw.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bqg<ceu> bd = a("trader_llama", bqg.a.a(ceu::new, bqw.b).a(0.9F, 1.87F).a(1.7765F).a(new esj(0.0, 1.37, -0.3)).a(10));
   public static final bqg<clf> be = a("trident", bqg.a.<clf>a(clf::new, bqw.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bqg<cdi> bf = a("tropical_fish", bqg.a.a(cdi::new, bqw.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bqg<cdj> bg = a("turtle", bqg.a.a(cdj::new, bqw.b).a(1.2F, 0.4F).a(new esj(0.0, 0.55625, -0.25)).a(10));
   public static final bqg<chu> bh = a("vex", bqg.a.a(chu::new, bqw.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bqg<cjn> bi = a("villager", bqg.a.<cjn>a(cjn::new, bqw.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bqg<chv> bj = a("vindicator", bqg.a.a(chv::new, bqw.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bqg<cjt> bk = a("wandering_trader", bqg.a.a(cjt::new, bqw.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bqg<cje> bl = a("warden", bqg.a.a(cje::new, bqw.a).a(0.9F, 2.9F).a(3.15F).a(bqb.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bqg<clk> bm = a("wind_charge", bqg.a.<clk>a(clk::new, bqw.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cmp.c));
   public static final bqg<chw> bn = a("witch", bqg.a.a(chw::new, bqw.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bqg<cfy> bo = a("wither", bqg.a.a(cfy::new, bqw.a).c().a(dcj.cd).a(0.9F, 3.5F).a(10));
   public static final bqg<chx> bp = a("wither_skeleton", bqg.a.a(chx::new, bqw.a).c().a(dcj.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bqg<clg> bq = a("wither_skull", bqg.a.<clg>a(clg::new, bqw.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bqg<cdl> br = a("wolf", bqg.a.a(cdl::new, bqw.b).a(0.6F, 0.85F).a(0.68F).a(new esj(0.0, 0.81875, -0.0625)).a(10));
   public static final bqg<chy> bs = a("zoglin", bqg.a.a(chy::new, bqw.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bqg<chz> bt = a("zombie", bqg.a.<chz>a(chz::new, bqw.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bqg<cew> bu = a("zombie_horse", bqg.a.a(cew::new, bqw.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bqg<cia> bv = a("zombie_villager", bqg.a.a(cia::new, bqw.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bqg<cib> bw = a("zombified_piglin", bqg.a.a(cib::new, bqw.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bqg<cka> bx = a("player", bqg.a.<cka>a(bqw.h).b().a().a(0.6F, 1.8F).a(1.62F).a(cka.bS).a(32).b(2));
   public static final bqg<cko> by = a("fishing_bobber", bqg.a.<cko>a(cko::new, bqw.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bqg.b<T> bE;
   private final bqw bF;
   private final ImmutableSet<dch> bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final int bL;
   private final int bM;
   @Nullable
   private String bN;
   @Nullable
   private wi bO;
   @Nullable
   private ajv bP;
   private final bqd bQ;
   private final cmn bR;

   private static <T extends bqa> bqg<T> a(String $$0, bqg.a<T> $$1) {
      return ja.a(kt.g, $$0, $$1.a($$0));
   }

   public static ajv a(bqg<?> $$0) {
      return kt.g.b($$0);
   }

   public static Optional<bqg<?>> a(String $$0) {
      return kt.g.b(ajv.a($$0));
   }

   public bqg(bqg.b<T> $$0, bqw $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dch> $$6, bqd $$7, int $$8, int $$9, cmn $$10) {
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
   public T a(apu $$0, @Nullable crs $$1, @Nullable cka $$2, id $$3, bqx $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bqa> Consumer<T> a(apu $$0, crs $$1, @Nullable cka $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bqa> Consumer<T> a(Consumer<T> $$0, apu $$1, crs $$2, @Nullable cka $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bqa> Consumer<T> a(Consumer<T> $$0, crs $$1) {
      wi $$2 = $$1.a(jr.d);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bqa> Consumer<T> b(Consumer<T> $$0, apu $$1, crs $$2, @Nullable cka $$3) {
      cuc $$4 = $$2.a(jr.D, cuc.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(apu $$0, id $$1, bqx $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(apu $$0, @Nullable Consumer<T> $$1, id $$2, bqx $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(apu $$0, @Nullable Consumer<T> $$1, id $$2, bqx $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((czg)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, axm.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bqv $$9) {
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

   protected static double a(czj $$0, id $$1, boolean $$2, ese $$3) {
      ese $$4 = new ese($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<etc> $$5 = $$0.d(null, $$4);
      return 1.0 + esz.a(ij.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(czg $$0, @Nullable cka $$1, @Nullable bqa $$2, cuc $$3) {
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

   public bqw f() {
      return this.bF;
   }

   public String g() {
      if (this.bN == null) {
         this.bN = ac.a("entity", kt.g.b(this));
      }

      return this.bN;
   }

   public wi h() {
      if (this.bO == null) {
         this.bO = wi.c(this.g());
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

   public ajv j() {
      if (this.bP == null) {
         ajv $$0 = kt.g.b(this);
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
   public cmn m() {
      return this.bR;
   }

   @Nullable
   public T a(czg $$0) {
      return !this.a($$0.J()) ? null : this.bE.create(this, $$0);
   }

   public static Optional<bqa> a(to $$0, czg $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bA.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ese a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ese($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dpi $$0) {
      if (this.bG.contains($$0.b())) {
         return false;
      } else {
         return !this.bJ && elo.a($$0) ? true : $$0.a(dcj.cd) || $$0.a(dcj.oi) || $$0.a(dcj.dQ) || $$0.a(dcj.qP);
      }
   }

   public bqd n() {
      return this.bQ;
   }

   public static Optional<bqg<?>> a(to $$0) {
      return kt.g.b(new ajv($$0.l("id")));
   }

   @Nullable
   public static bqa a(to $$0, czg $$1, Function<bqa, bqa> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            tu $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bqa $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bqa)$$3;
      }).orElse(null);
   }

   public static Stream<bqa> a(final List<? extends ul> $$0, final czg $$1) {
      final Spliterator<? extends ul> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bqa>() {
         @Override
         public boolean tryAdvance(Consumer<? super bqa> $$0x) {
            return $$2.tryAdvance($$2xx -> bqg.a((to)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bqa> trySplit() {
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

   private static Optional<bqa> b(to $$0, czg $$1) {
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

   public boolean a(avt<bqg<?>> $$0) {
      return this.bB.a($$0);
   }

   public boolean a(ir<bqg<?>> $$0) {
      return $$0.a(this.bB);
   }

   @Nullable
   public T a(bqa $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bqa> a() {
      return bqa.class;
   }

   @Deprecated
   public in.c<bqg<?>> r() {
      return this.bB;
   }

   public static class a<T extends bqa> {
      private final bqg.b<T> a;
      private final bqw b;
      private ImmutableSet<dch> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bqd j = bqd.b(0.6F, 1.8F);
      private bqc.a k = bqc.a();
      private cmn l = cmp.g;

      private a(bqg.b<T> $$0, bqw $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bqw.b || $$1 == bqw.h;
      }

      public static <T extends bqa> bqg.a<T> a(bqg.b<T> $$0, bqw $$1) {
         return new bqg.a<>($$0, $$1);
      }

      public static <T extends bqa> bqg.a<T> a(bqw $$0) {
         return new bqg.a<>(($$0x, $$1) -> null, $$0);
      }

      public bqg.a<T> a(float $$0, float $$1) {
         this.j = bqd.b($$0, $$1);
         return this;
      }

      public bqg.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bqg.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bqb.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bqg.a<T> a(esj... $$0) {
         for (esj $$1 : $$0) {
            this.k = this.k.a(bqb.a, $$1);
         }

         return this;
      }

      public bqg.a<T> a(esj $$0) {
         return this.a(bqb.b, $$0);
      }

      public bqg.a<T> b(float $$0) {
         return this.a(bqb.b, 0.0F, -$$0, 0.0F);
      }

      public bqg.a<T> c(float $$0) {
         return this.a(bqb.c, 0.0F, $$0, 0.0F);
      }

      public bqg.a<T> a(bqb $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bqg.a<T> a(bqb $$0, esj $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bqg.a<T> a() {
         this.e = false;
         return this;
      }

      public bqg.a<T> b() {
         this.d = false;
         return this;
      }

      public bqg.a<T> c() {
         this.f = true;
         return this;
      }

      public bqg.a<T> a(dch... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bqg.a<T> d() {
         this.g = true;
         return this;
      }

      public bqg.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bqg.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bqg.a<T> a(cml... $$0) {
         this.l = cmp.e.a($$0);
         return this;
      }

      public bqg<T> a(String $$0) {
         if (this.d) {
            ac.a(bff.y, $$0);
         }

         return new bqg<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bqa> {
      T create(bqg<T> var1, czg var2);
   }
}
