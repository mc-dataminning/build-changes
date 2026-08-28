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

public class bty<T extends btr> implements cqn, dzd<btr, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jo.c<bty<?>> bC = lv.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bty<chj> a = a("allay", bty.a.a(chj::new, buq.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bty<btm> b = a("area_effect_cloud", bty.a.<btm>a(btm::new, buq.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bty<chm> c = a("armadillo", bty.a.a(chm::new, buq.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bty<cjw> d = a("armor_stand", bty.a.<cjw>a(cjw::new, buq.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bty<cog> e = a("arrow", bty.a.<cog>a(cog::new, buq.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bty<chp> f = a("axolotl", bty.a.a(chp::new, buq.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bty<cfx> g = a("bat", bty.a.a(cfx::new, buq.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bty<cge> h = a("bee", bty.a.a(cge::new, buq.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bty<ckm> i = a("blaze", bty.a.a(ckm::new, buq.a).c().a(0.6F, 1.8F).a(8));
   public static final bty<btp.b> j = a("block_display", bty.a.a(btp.b::new, buq.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bty<cpx> k = a("boat", bty.a.<cpx>a(cpx::new, buq.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bty<ckn> l = a("bogged", bty.a.a(ckn::new, buq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bty<clz> m = a("breeze", bty.a.a(clz::new, buq.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bty<cpi> n = a("breeze_wind_charge", bty.a.<cpi>a(cpi::new, buq.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bty<chu> o = a("camel", bty.a.a(chu::new, buq.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bty<cgg> p = a("cat", bty.a.a(cgg::new, buq.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bty<cko> q = a("cave_spider", bty.a.a(cko::new, buq.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bty<cpy> r = a("chest_boat", bty.a.<cpy>a(cpy::new, buq.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bty<cqd> s = a("chest_minecart", bty.a.<cqd>a(cqd::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<cgi> t = a("chicken", bty.a.a(cgi::new, buq.b).a(0.4F, 0.7F).b(0.644F).a(new eyw(0.0, 0.7, -0.1)).a(10));
   public static final bty<cgj> u = a("cod", bty.a.a(cgj::new, buq.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bty<cqe> v = a("command_block_minecart", bty.a.<cqe>a(cqe::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<cgk> w = a("cow", bty.a.a(cgk::new, buq.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bty<ckp> x = a("creeper", bty.a.a(ckp::new, buq.a).a(0.6F, 1.7F).a(8));
   public static final bty<cgl> y = a("dolphin", bty.a.a(cgl::new, buq.f).a(0.9F, 0.6F).b(0.3F));
   public static final bty<cii> z = a("donkey", bty.a.a(cii::new, buq.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bty<coh> A = a("dragon_fireball", bty.a.<coh>a(coh::new, buq.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bty<ckr> B = a("drowned", bty.a.a(ckr::new, buq.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bty<cpa> C = a("egg", bty.a.<cpa>a(cpa::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<cks> D = a("elder_guardian", bty.a.a(cks::new, buq.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bty<ciz> E = a("end_crystal", bty.a.<ciz>a(ciz::new, buq.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bty<cja> F = a("ender_dragon", bty.a.a(cja::new, buq.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bty<cpb> G = a("ender_pearl", bty.a.<cpb>a(cpb::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<ckt> H = a("enderman", bty.a.a(ckt::new, buq.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bty<cku> I = a("endermite", bty.a.a(cku::new, buq.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bty<ckw> J = a("evoker", bty.a.a(ckw::new, buq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bty<coi> K = a("evoker_fangs", bty.a.<coi>a(coi::new, buq.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bty<cpc> L = a("experience_bottle", bty.a.<cpc>a(cpc::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<bud> M = a("experience_orb", bty.a.<bud>a(bud::new, buq.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bty<coj> N = a("eye_of_ender", bty.a.<coj>a(coj::new, buq.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bty<ckg> O = a("falling_block", bty.a.<ckg>a(ckg::new, buq.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bty<col> P = a("firework_rocket", bty.a.<col>a(col::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<cgn> Q = a("fox", bty.a.a(cgn::new, buq.b).a(0.6F, 0.7F).b(0.4F).a(new eyw(0.0, 0.6375, -0.25)).a(8).a(dho.oi));
   public static final bty<chx> R = a("frog", bty.a.a(chx::new, buq.b).a(0.5F, 0.5F).a(new eyw(0.0, 0.375, -0.25)).a(10));
   public static final bty<cqf> S = a("furnace_minecart", bty.a.<cqf>a(cqf::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<ckx> T = a("ghast", bty.a.a(ckx::new, buq.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bty<cky> U = a("giant", bty.a.a(cky::new, buq.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bty<cjy> V = a("glow_item_frame", bty.a.<cjy>a(cjy::new, buq.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bty<buf> W = a("glow_squid", bty.a.a(buf::new, buq.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bty<cid> X = a("goat", bty.a.a(cid::new, buq.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bty<ckz> Y = a("guardian", bty.a.a(ckz::new, buq.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bty<cmh> Z = a("hoglin", bty.a.a(cmh::new, buq.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bty<cqg> aa = a("hopper_minecart", bty.a.<cqg>a(cqg::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<cij> ab = a("horse", bty.a.a(cij::new, buq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bty<cla> ac = a("husk", bty.a.a(cla::new, buq.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bty<clb> ad = a("illusioner", bty.a.a(clb::new, buq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bty<bui> ae = a("interaction", bty.a.a(bui::new, buq.h).e().a(0.0F, 0.0F).a(10));
   public static final bty<cgp> af = a("iron_golem", bty.a.a(cgp::new, buq.h).a(1.4F, 2.7F).a(10));
   public static final bty<ckh> ag = a("item", bty.a.<ckh>a(ckh::new, buq.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bty<btp.g> ah = a("item_display", bty.a.a(btp.g::new, buq.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bty<cka> ai = a("item_frame", bty.a.<cka>a(cka::new, buq.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bty<but> aj = a("ominous_item_spawner", bty.a.a(but::new, buq.h).e().a(0.25F, 0.25F).a(8));
   public static final bty<cop> ak = a("fireball", bty.a.<cop>a(cop::new, buq.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bty<ckb> al = a("leash_knot", bty.a.<ckb>a(ckb::new, buq.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bty<bum> am = a("lightning_bolt", bty.a.a(bum::new, buq.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bty<cik> an = a("llama", bty.a.a(cik::new, buq.b).a(0.9F, 1.87F).b(1.7765F).a(new eyw(0.0, 1.37, -0.3)).a(10));
   public static final bty<coq> ao = a("llama_spit", bty.a.<coq>a(coq::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<clc> ap = a("magma_cube", bty.a.a(clc::new, buq.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bty<buo> aq = a("marker", bty.a.a(buo::new, buq.h).e().a(0.0F, 0.0F).a(0));
   public static final bty<cqb> ar = a("minecart", bty.a.<cqb>a(cqb::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<cgq> as = a("mooshroom", bty.a.a(cgq::new, buq.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bty<cim> at = a("mule", bty.a.a(cim::new, buq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bty<cgr> au = a("ocelot", bty.a.a(cgr::new, buq.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bty<ckc> av = a("painting", bty.a.<ckc>a(ckc::new, buq.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bty<cgs> aw = a("panda", bty.a.a(cgs::new, buq.b).a(1.3F, 1.25F).a(10));
   public static final bty<cgt> ax = a("parrot", bty.a.a(cgt::new, buq.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bty<clf> ay = a("phantom", bty.a.a(clf::new, buq.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bty<cgu> az = a("pig", bty.a.a(cgu::new, buq.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bty<cmn> aA = a("piglin", bty.a.a(cmn::new, buq.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bty<cmq> aB = a("piglin_brute", bty.a.a(cmq::new, buq.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bty<clg> aC = a("pillager", bty.a.a(clg::new, buq.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bty<cgv> aD = a("polar_bear", bty.a.a(cgv::new, buq.b).a(dho.qP).a(1.4F, 1.4F).a(10));
   public static final bty<cpd> aE = a("potion", bty.a.<cpd>a(cpd::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<cgw> aF = a("pufferfish", bty.a.a(cgw::new, buq.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bty<cgx> aG = a("rabbit", bty.a.a(cgx::new, buq.b).a(0.4F, 0.5F).a(8));
   public static final bty<cli> aH = a("ravager", bty.a.a(cli::new, buq.a).a(1.95F, 2.2F).a(new eyw(0.0, 2.2625, -0.0625)).a(10));
   public static final bty<cgy> aI = a("salmon", bty.a.a(cgy::new, buq.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bty<cgz> aJ = a("sheep", bty.a.a(cgz::new, buq.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bty<clj> aK = a("shulker", bty.a.a(clj::new, buq.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bty<cou> aL = a("shulker_bullet", bty.a.<cou>a(cou::new, buq.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bty<clk> aM = a("silverfish", bty.a.a(clk::new, buq.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bty<cll> aN = a("skeleton", bty.a.a(cll::new, buq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bty<cin> aO = a("skeleton_horse", bty.a.a(cin::new, buq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bty<clm> aP = a("slime", bty.a.a(clm::new, buq.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bty<cov> aQ = a("small_fireball", bty.a.<cov>a(cov::new, buq.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bty<ciu> aR = a("sniffer", bty.a.a(ciu::new, buq.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bty<chb> aS = a("snow_golem", bty.a.a(chb::new, buq.h).a(dho.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bty<cow> aT = a("snowball", bty.a.<cow>a(cow::new, buq.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bty<cqh> aU = a("spawner_minecart", bty.a.<cqh>a(cqh::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<cox> aV = a("spectral_arrow", bty.a.<cox>a(cox::new, buq.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bty<clo> aW = a("spider", bty.a.a(clo::new, buq.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bty<chc> aX = a("squid", bty.a.a(chc::new, buq.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bty<clp> aY = a("stray", bty.a.a(clp::new, buq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dho.qP).a(8));
   public static final bty<clq> aZ = a("strider", bty.a.a(clq::new, buq.b).c().a(0.9F, 1.7F).a(10));
   public static final bty<cia> ba = a("tadpole", bty.a.a(cia::new, buq.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bty<btp.l> bb = a("text_display", bty.a.a(btp.l::new, buq.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bty<cki> bc = a("tnt", bty.a.<cki>a(cki::new, buq.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bty<cqi> bd = a("tnt_minecart", bty.a.<cqi>a(cqi::new, buq.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bty<cip> be = a("trader_llama", bty.a.a(cip::new, buq.b).a(0.9F, 1.87F).b(1.7765F).a(new eyw(0.0, 1.37, -0.3)).a(10));
   public static final bty<cpe> bf = a("trident", bty.a.<cpe>a(cpe::new, buq.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bty<chd> bg = a("tropical_fish", bty.a.a(chd::new, buq.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bty<che> bh = a("turtle", bty.a.a(che::new, buq.b).a(1.2F, 0.4F).a(new eyw(0.0, 0.55625, -0.25)).a(10));
   public static final bty<clr> bi = a("vex", bty.a.a(clr::new, buq.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bty<cnk> bj = a("villager", bty.a.<cnk>a(cnk::new, buq.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bty<cls> bk = a("vindicator", bty.a.a(cls::new, buq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bty<cnq> bl = a("wandering_trader", bty.a.a(cnq::new, buq.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bty<cnb> bm = a("warden", bty.a.a(cnb::new, buq.a).a(0.9F, 2.9F).a(3.15F).a(bts.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bty<cpj> bn = a("wind_charge", bty.a.<cpj>a(cpj::new, buq.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bty<clt> bo = a("witch", bty.a.a(clt::new, buq.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bty<cju> bp = a("wither", bty.a.a(cju::new, buq.a).c().a(dho.cd).a(0.9F, 3.5F).a(10));
   public static final bty<clu> bq = a("wither_skeleton", bty.a.a(clu::new, buq.a).c().a(dho.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bty<cpf> br = a("wither_skull", bty.a.<cpf>a(cpf::new, buq.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bty<chg> bs = a("wolf", bty.a.a(chg::new, buq.b).a(0.6F, 0.85F).b(0.68F).a(new eyw(0.0, 0.81875, -0.0625)).a(10));
   public static final bty<clv> bt = a("zoglin", bty.a.a(clv::new, buq.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bty<clw> bu = a("zombie", bty.a.<clw>a(clw::new, buq.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bty<cir> bv = a("zombie_horse", bty.a.a(cir::new, buq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bty<clx> bw = a("zombie_villager", bty.a.a(clx::new, buq.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bty<cly> bx = a("zombified_piglin", bty.a.a(cly::new, buq.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bty<cnx> by = a("player", bty.a.<cnx>a(buq.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cnx.bR).a(32).b(2));
   public static final bty<com> bz = a("fishing_bobber", bty.a.<com>a(com::new, buq.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bty.b<T> bF;
   private final buq bG;
   private final ImmutableSet<dhm> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   private final String bO;
   @Nullable
   private xe bP;
   private final Optional<ald<etq>> bQ;
   private final btu bR;
   private final float bS;
   private final cqq bT;

   private static <T extends btr> bty<T> a(ald<bty<?>> $$0, bty.a<T> $$1) {
      return kb.a(lv.f, $$0, $$1.a($$0));
   }

   private static ald<bty<?>> b(String $$0) {
      return ald.a(lw.z, ale.b($$0));
   }

   private static <T extends btr> bty<T> a(String $$0, bty.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static ale a(bty<?> $$0) {
      return lv.f.b($$0);
   }

   public static Optional<bty<?>> a(String $$0) {
      return lv.f.b(ale.c($$0));
   }

   public bty(
      bty.b<T> $$0,
      buq $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dhm> $$6,
      btu $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<ald<etq>> $$12,
      cqq $$13
   ) {
      this.bF = $$0;
      this.bG = $$1;
      this.bL = $$5;
      this.bI = $$2;
      this.bJ = $$3;
      this.bK = $$4;
      this.bH = $$6;
      this.bR = $$7;
      this.bS = $$8;
      this.bM = $$9;
      this.bN = $$10;
      this.bO = $$11;
      this.bQ = $$12;
      this.bT = $$13;
   }

   @Nullable
   public T a(arj $$0, @Nullable cvs $$1, @Nullable cnx $$2, jf $$3, btx $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends btr> Consumer<T> a(dej $$0, cvs $$1, @Nullable cnx $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends btr> Consumer<T> a(Consumer<T> $$0, dej $$1, cvs $$2, @Nullable cnx $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends btr> Consumer<T> a(Consumer<T> $$0, cvs $$1) {
      xe $$2 = $$1.a(ks.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends btr> Consumer<T> b(Consumer<T> $$0, dej $$1, cvs $$2, @Nullable cnx $$3) {
      cyh $$4 = $$2.a(ks.R, cyh.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arj $$0, jf $$1, btx $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arj $$0, @Nullable Consumer<T> $$1, jf $$2, btx $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arj $$0, @Nullable Consumer<T> $$1, jf $$2, btx $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cO());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azf.h($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bup $$9) {
            $$9.aV = $$9.dI();
            $$9.aT = $$9.dI();
            $$9.a($$0, $$0.d_($$9.ds()), $$3, null);
            $$9.U();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dem $$0, jf $$1, boolean $$2, eyr $$3) {
      eyr $$4 = new eyr($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ezq> $$5 = $$0.d(null, $$4);
      return 1.0 + ezn.a(jk.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dej $$0, @Nullable cnx $$1, @Nullable btr $$2, cyh $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cT() || $$1 != null && $$4.ag().f($$1.gc())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bI;
   }

   public boolean c() {
      return this.bJ;
   }

   public boolean d() {
      return this.bK;
   }

   public boolean e() {
      return this.bL;
   }

   public buq f() {
      return this.bG;
   }

   public String g() {
      return this.bO;
   }

   public xe h() {
      if (this.bP == null) {
         this.bP = xe.c(this.g());
      }

      return this.bP;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<ald<etq>> k() {
      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public cqq i() {
      return this.bT;
   }

   @Nullable
   public T a(dej $$0, btx $$1) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<btr> a(ug $$0, dej $$1, btx $$2) {
      return ad.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eyr a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new eyr($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dus $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && erg.a($$0) ? true : $$0.a(dho.cd) || $$0.a(dho.oi) || $$0.a(dho.dQ) || $$0.a(dho.qP);
      }
   }

   public btu n() {
      return this.bR;
   }

   public static Optional<bty<?>> a(ug $$0) {
      return lv.f.b(ale.a($$0.l("id")));
   }

   @Nullable
   public static btr a(ug $$0, dej $$1, btx $$2, Function<btr, btr> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            um $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               btr $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (btr)$$4;
      }).orElse(null);
   }

   public static Stream<btr> a(final List<? extends vd> $$0, final dej $$1, final btx $$2) {
      final Spliterator<? extends vd> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<btr>() {
         @Override
         public boolean tryAdvance(Consumer<? super btr> $$0x) {
            return $$3.tryAdvance($$3xx -> bty.a((ug)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<btr> trySplit() {
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

   private static Optional<btr> b(ug $$0, dej $$1, btx $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bB.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bM;
   }

   public int p() {
      return this.bN;
   }

   public boolean q() {
      return this != by && this != ao && this != bp && this != g && this != ai && this != V && this != al && this != av && this != E && this != K;
   }

   public boolean a(axl<bty<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(js<bty<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(btr $$0) {
      return (T)($$0.ao() == this ? $$0 : null);
   }

   @Override
   public Class<? extends btr> a() {
      return btr.class;
   }

   @Deprecated
   public jo.c<bty<?>> r() {
      return this.bC;
   }

   public static class a<T extends btr> {
      private final bty.b<T> a;
      private final buq b;
      private ImmutableSet<dhm> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private btu j = btu.b(0.6F, 1.8F);
      private float k = 1.0F;
      private btt.a l = btt.a();
      private cqq m = cqs.h;
      private akw<bty<?>, Optional<ald<etq>>> n = $$0x -> Optional.of(ald.a(lw.be, $$0x.a().f("entities/")));
      private akw<bty<?>, String> o = $$0x -> ad.a("entity", $$0x.a());

      private a(bty.b<T> $$0, buq $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == buq.b || $$1 == buq.h;
      }

      public static <T extends btr> bty.a<T> a(bty.b<T> $$0, buq $$1) {
         return new bty.a<>($$0, $$1);
      }

      public static <T extends btr> bty.a<T> a(buq $$0) {
         return new bty.a<>(($$0x, $$1) -> null, $$0);
      }

      public bty.a<T> a(float $$0, float $$1) {
         this.j = btu.b($$0, $$1);
         return this;
      }

      public bty.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bty.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bty.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bts.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bty.a<T> a(eyw... $$0) {
         for (eyw $$1 : $$0) {
            this.l = this.l.a(bts.a, $$1);
         }

         return this;
      }

      public bty.a<T> a(eyw $$0) {
         return this.a(bts.b, $$0);
      }

      public bty.a<T> c(float $$0) {
         return this.a(bts.b, 0.0F, -$$0, 0.0F);
      }

      public bty.a<T> d(float $$0) {
         return this.a(bts.c, 0.0F, $$0, 0.0F);
      }

      public bty.a<T> a(bts $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bty.a<T> a(bts $$0, eyw $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bty.a<T> a() {
         this.e = false;
         return this;
      }

      public bty.a<T> b() {
         this.d = false;
         return this;
      }

      public bty.a<T> c() {
         this.f = true;
         return this;
      }

      public bty.a<T> a(dhm... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bty.a<T> d() {
         this.g = true;
         return this;
      }

      public bty.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bty.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bty.a<T> a(cqo... $$0) {
         this.m = cqs.f.a($$0);
         return this;
      }

      public bty.a<T> e() {
         this.n = akw.fixed(Optional.empty());
         return this;
      }

      public bty<T> a(ald<bty<?>> $$0) {
         if (this.d) {
            ad.a(bho.A, $$0.a().toString());
         }

         return new bty<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends btr> {
      T create(bty<T> var1, dej var2);
   }
}
