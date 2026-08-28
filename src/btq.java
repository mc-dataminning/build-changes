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

public class btq<T extends btj> implements cqe, dyl<btj, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jn.c<btq<?>> bC = lu.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final btq<chb> a = a("allay", btq.a.a(chb::new, bui.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final btq<bte> b = a("area_effect_cloud", btq.a.<bte>a(bte::new, bui.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btq<che> c = a("armadillo", btq.a.a(che::new, bui.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final btq<cjo> d = a("armor_stand", btq.a.<cjo>a(cjo::new, bui.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final btq<cny> e = a("arrow", btq.a.<cny>a(cny::new, bui.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btq<chh> f = a("axolotl", btq.a.a(chh::new, bui.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final btq<cfp> g = a("bat", btq.a.a(cfp::new, bui.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final btq<cfw> h = a("bee", btq.a.a(cfw::new, bui.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final btq<cke> i = a("blaze", btq.a.a(cke::new, bui.a).c().a(0.6F, 1.8F).a(8));
   public static final btq<bth.b> j = a("block_display", btq.a.a(bth.b::new, bui.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btq<cpo> k = a("boat", btq.a.<cpo>a(cpo::new, bui.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btq<ckf> l = a("bogged", btq.a.a(ckf::new, bui.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final btq<clr> m = a("breeze", btq.a.a(clr::new, bui.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final btq<cpa> n = a("breeze_wind_charge", btq.a.<cpa>a(cpa::new, bui.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final btq<chm> o = a("camel", btq.a.a(chm::new, bui.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final btq<cfy> p = a("cat", btq.a.a(cfy::new, bui.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final btq<ckg> q = a("cave_spider", btq.a.a(ckg::new, bui.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final btq<cpp> r = a("chest_boat", btq.a.<cpp>a(cpp::new, bui.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btq<cpu> s = a("chest_minecart", btq.a.<cpu>a(cpu::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<cga> t = a("chicken", btq.a.a(cga::new, bui.b).a(0.4F, 0.7F).b(0.644F).a(new eye(0.0, 0.7, -0.1)).a(10));
   public static final btq<cgb> u = a("cod", btq.a.a(cgb::new, bui.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final btq<cpv> v = a("command_block_minecart", btq.a.<cpv>a(cpv::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<cgc> w = a("cow", btq.a.a(cgc::new, bui.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btq<ckh> x = a("creeper", btq.a.a(ckh::new, bui.a).a(0.6F, 1.7F).a(8));
   public static final btq<cgd> y = a("dolphin", btq.a.a(cgd::new, bui.f).a(0.9F, 0.6F).b(0.3F));
   public static final btq<cia> z = a("donkey", btq.a.a(cia::new, bui.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final btq<cnz> A = a("dragon_fireball", btq.a.<cnz>a(cnz::new, bui.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btq<ckj> B = a("drowned", btq.a.a(ckj::new, bui.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btq<cos> C = a("egg", btq.a.<cos>a(cos::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<ckk> D = a("elder_guardian", btq.a.a(ckk::new, bui.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final btq<cir> E = a("end_crystal", btq.a.<cir>a(cir::new, bui.h).c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final btq<cis> F = a("ender_dragon", btq.a.a(cis::new, bui.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final btq<cot> G = a("ender_pearl", btq.a.<cot>a(cot::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<ckl> H = a("enderman", btq.a.a(ckl::new, bui.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final btq<ckm> I = a("endermite", btq.a.a(ckm::new, bui.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btq<cko> J = a("evoker", btq.a.a(cko::new, bui.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btq<coa> K = a("evoker_fangs", btq.a.<coa>a(coa::new, bui.h).a(0.5F, 0.8F).a(6).b(2));
   public static final btq<cou> L = a("experience_bottle", btq.a.<cou>a(cou::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<btv> M = a("experience_orb", btq.a.<btv>a(btv::new, bui.h).a(0.5F, 0.5F).a(6).b(20));
   public static final btq<cob> N = a("eye_of_ender", btq.a.<cob>a(cob::new, bui.h).a(0.25F, 0.25F).a(4).b(4));
   public static final btq<cjy> O = a("falling_block", btq.a.<cjy>a(cjy::new, bui.h).a(0.98F, 0.98F).a(10).b(20));
   public static final btq<cod> P = a("firework_rocket", btq.a.<cod>a(cod::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<cgf> Q = a("fox", btq.a.a(cgf::new, bui.b).a(0.6F, 0.7F).b(0.4F).a(new eye(0.0, 0.6375, -0.25)).a(8).a(dgx.oi));
   public static final btq<chp> R = a("frog", btq.a.a(chp::new, bui.b).a(0.5F, 0.5F).a(new eye(0.0, 0.375, -0.25)).a(10));
   public static final btq<cpw> S = a("furnace_minecart", btq.a.<cpw>a(cpw::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<ckp> T = a("ghast", btq.a.a(ckp::new, bui.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final btq<ckq> U = a("giant", btq.a.a(ckq::new, bui.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final btq<cjq> V = a("glow_item_frame", btq.a.<cjq>a(cjq::new, bui.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btq<btx> W = a("glow_squid", btq.a.a(btx::new, bui.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final btq<chv> X = a("goat", btq.a.a(chv::new, bui.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final btq<ckr> Y = a("guardian", btq.a.a(ckr::new, bui.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final btq<clz> Z = a("hoglin", btq.a.a(clz::new, bui.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btq<cpx> aa = a("hopper_minecart", btq.a.<cpx>a(cpx::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<cib> ab = a("horse", btq.a.a(cib::new, bui.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final btq<cks> ac = a("husk", btq.a.a(cks::new, bui.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final btq<ckt> ad = a("illusioner", btq.a.a(ckt::new, bui.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btq<bua> ae = a("interaction", btq.a.a(bua::new, bui.h).a(0.0F, 0.0F).a(10));
   public static final btq<cgh> af = a("iron_golem", btq.a.a(cgh::new, bui.h).a(1.4F, 2.7F).a(10));
   public static final btq<cjz> ag = a("item", btq.a.<cjz>a(cjz::new, bui.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final btq<bth.g> ah = a("item_display", btq.a.a(bth.g::new, bui.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btq<cjs> ai = a("item_frame", btq.a.<cjs>a(cjs::new, bui.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btq<bul> aj = a("ominous_item_spawner", btq.a.a(bul::new, bui.h).a(0.25F, 0.25F).a(8));
   public static final btq<cog> ak = a("fireball", btq.a.<cog>a(cog::new, bui.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btq<cjt> al = a("leash_knot", btq.a.<cjt>a(cjt::new, bui.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final btq<bue> am = a("lightning_bolt", btq.a.a(bue::new, bui.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final btq<cic> an = a("llama", btq.a.a(cic::new, bui.b).a(0.9F, 1.87F).b(1.7765F).a(new eye(0.0, 1.37, -0.3)).a(10));
   public static final btq<coh> ao = a("llama_spit", btq.a.<coh>a(coh::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<cku> ap = a("magma_cube", btq.a.a(cku::new, bui.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final btq<bug> aq = a("marker", btq.a.a(bug::new, bui.h).a(0.0F, 0.0F).a(0));
   public static final btq<cps> ar = a("minecart", btq.a.<cps>a(cps::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<cgi> as = a("mooshroom", btq.a.a(cgi::new, bui.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btq<cie> at = a("mule", btq.a.a(cie::new, bui.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final btq<cgj> au = a("ocelot", btq.a.a(cgj::new, bui.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final btq<cju> av = a("painting", btq.a.<cju>a(cju::new, bui.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btq<cgk> aw = a("panda", btq.a.a(cgk::new, bui.b).a(1.3F, 1.25F).a(10));
   public static final btq<cgl> ax = a("parrot", btq.a.a(cgl::new, bui.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final btq<ckx> ay = a("phantom", btq.a.a(ckx::new, bui.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final btq<cgm> az = a("pig", btq.a.a(cgm::new, bui.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final btq<cmf> aA = a("piglin", btq.a.a(cmf::new, bui.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btq<cmi> aB = a("piglin_brute", btq.a.a(cmi::new, bui.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btq<cky> aC = a("pillager", btq.a.a(cky::new, bui.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btq<cgn> aD = a("polar_bear", btq.a.a(cgn::new, bui.b).a(dgx.qP).a(1.4F, 1.4F).a(10));
   public static final btq<cov> aE = a("potion", btq.a.<cov>a(cov::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<cgo> aF = a("pufferfish", btq.a.a(cgo::new, bui.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final btq<cgp> aG = a("rabbit", btq.a.a(cgp::new, bui.b).a(0.4F, 0.5F).a(8));
   public static final btq<cla> aH = a("ravager", btq.a.a(cla::new, bui.a).a(1.95F, 2.2F).a(new eye(0.0, 2.2625, -0.0625)).a(10));
   public static final btq<cgq> aI = a("salmon", btq.a.a(cgq::new, bui.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final btq<cgr> aJ = a("sheep", btq.a.a(cgr::new, bui.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final btq<clb> aK = a("shulker", btq.a.a(clb::new, bui.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final btq<col> aL = a("shulker_bullet", btq.a.<col>a(col::new, bui.h).a(0.3125F, 0.3125F).a(8));
   public static final btq<clc> aM = a("silverfish", btq.a.a(clc::new, bui.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btq<cld> aN = a("skeleton", btq.a.a(cld::new, bui.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final btq<cif> aO = a("skeleton_horse", btq.a.a(cif::new, bui.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btq<cle> aP = a("slime", btq.a.a(cle::new, bui.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final btq<com> aQ = a("small_fireball", btq.a.<com>a(com::new, bui.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btq<cim> aR = a("sniffer", btq.a.a(cim::new, bui.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final btq<cgt> aS = a("snow_golem", btq.a.a(cgt::new, bui.h).a(dgx.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final btq<coo> aT = a("snowball", btq.a.<coo>a(coo::new, bui.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btq<cpy> aU = a("spawner_minecart", btq.a.<cpy>a(cpy::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<cop> aV = a("spectral_arrow", btq.a.<cop>a(cop::new, bui.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btq<clg> aW = a("spider", btq.a.a(clg::new, bui.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final btq<cgu> aX = a("squid", btq.a.a(cgu::new, bui.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final btq<clh> aY = a("stray", btq.a.a(clh::new, bui.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dgx.qP).a(8));
   public static final btq<cli> aZ = a("strider", btq.a.a(cli::new, bui.b).c().a(0.9F, 1.7F).a(10));
   public static final btq<chs> ba = a("tadpole", btq.a.a(chs::new, bui.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final btq<bth.l> bb = a("text_display", btq.a.a(bth.l::new, bui.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btq<cka> bc = a("tnt", btq.a.<cka>a(cka::new, bui.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final btq<cpz> bd = a("tnt_minecart", btq.a.<cpz>a(cpz::new, bui.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btq<cih> be = a("trader_llama", btq.a.a(cih::new, bui.b).a(0.9F, 1.87F).b(1.7765F).a(new eye(0.0, 1.37, -0.3)).a(10));
   public static final btq<cow> bf = a("trident", btq.a.<cow>a(cow::new, bui.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btq<cgv> bg = a("tropical_fish", btq.a.a(cgv::new, bui.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final btq<cgw> bh = a("turtle", btq.a.a(cgw::new, bui.b).a(1.2F, 0.4F).a(new eye(0.0, 0.55625, -0.25)).a(10));
   public static final btq<clj> bi = a("vex", btq.a.a(clj::new, bui.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final btq<cnc> bj = a("villager", btq.a.<cnc>a(cnc::new, bui.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btq<clk> bk = a("vindicator", btq.a.a(clk::new, bui.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btq<cni> bl = a("wandering_trader", btq.a.a(cni::new, bui.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btq<cmt> bm = a("warden", btq.a.a(cmt::new, bui.a).a(0.9F, 2.9F).a(3.15F).a(btk.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final btq<cpb> bn = a("wind_charge", btq.a.<cpb>a(cpb::new, bui.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final btq<cll> bo = a("witch", btq.a.a(cll::new, bui.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final btq<cjm> bp = a("wither", btq.a.a(cjm::new, bui.a).c().a(dgx.cd).a(0.9F, 3.5F).a(10));
   public static final btq<clm> bq = a("wither_skeleton", btq.a.a(clm::new, bui.a).c().a(dgx.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final btq<cox> br = a("wither_skull", btq.a.<cox>a(cox::new, bui.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btq<cgy> bs = a("wolf", btq.a.a(cgy::new, bui.b).a(0.6F, 0.85F).b(0.68F).a(new eye(0.0, 0.81875, -0.0625)).a(10));
   public static final btq<cln> bt = a("zoglin", btq.a.a(cln::new, bui.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btq<clo> bu = a("zombie", btq.a.<clo>a(clo::new, bui.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btq<cij> bv = a("zombie_horse", btq.a.a(cij::new, bui.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btq<clp> bw = a("zombie_villager", btq.a.a(clp::new, bui.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final btq<clq> bx = a("zombified_piglin", btq.a.a(clq::new, bui.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final btq<cnp> by = a("player", btq.a.<cnp>a(bui.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cnp.bS).a(32).b(2));
   public static final btq<coe> bz = a("fishing_bobber", btq.a.<coe>a(coe::new, bui.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final btq.b<T> bF;
   private final bui bG;
   private final ImmutableSet<dgv> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private xd bP;
   @Nullable
   private ala<esy> bQ;
   private final btm bR;
   private final float bS;
   private final cqh bT;

   private static <T extends btj> btq<T> a(String $$0, btq.a<T> $$1) {
      return ka.a(lu.f, $$0, $$1.a($$0));
   }

   public static alb a(btq<?> $$0) {
      return lu.f.b($$0);
   }

   public static Optional<btq<?>> a(String $$0) {
      return lu.f.b(alb.c($$0));
   }

   public btq(btq.b<T> $$0, bui $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dgv> $$6, btm $$7, float $$8, int $$9, int $$10, cqh $$11) {
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
      this.bT = $$11;
   }

   @Nullable
   public T a(arg $$0, @Nullable cvl $$1, @Nullable cnp $$2, je $$3, btp $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends btj> Consumer<T> a(arg $$0, cvl $$1, @Nullable cnp $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends btj> Consumer<T> a(Consumer<T> $$0, arg $$1, cvl $$2, @Nullable cnp $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends btj> Consumer<T> a(Consumer<T> $$0, cvl $$1) {
      xd $$2 = $$1.a(kr.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends btj> Consumer<T> b(Consumer<T> $$0, arg $$1, cvl $$2, @Nullable cnp $$3) {
      cya $$4 = $$2.a(kr.O, cya.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arg $$0, je $$1, btp $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arg $$0, @Nullable Consumer<T> $$1, je $$2, btp $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arg $$0, @Nullable Consumer<T> $$1, je $$2, btp $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azc.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof buh $$9) {
            $$9.aW = $$9.dI();
            $$9.aU = $$9.dI();
            $$9.a($$0, $$0.d_($$9.ds()), $$3, null);
            $$9.U();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(ddv $$0, je $$1, boolean $$2, exz $$3) {
      exz $$4 = new exz($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eyx> $$5 = $$0.d(null, $$4);
      return 1.0 + eyu.a(jj.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dds $$0, @Nullable cnp $$1, @Nullable btj $$2, cya $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cT() || $$1 != null && $$4.ag().f($$1.gb())) {
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

   public bui f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ad.a("entity", lu.f.b(this));
      }

      return this.bO;
   }

   public xd h() {
      if (this.bP == null) {
         this.bP = xd.c(this.g());
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

   public ala<esy> k() {
      if (this.bQ == null) {
         alb $$0 = lu.f.b(this);
         this.bQ = ala.a(lv.bc, $$0.f("entities/"));
      }

      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public cqh i() {
      return this.bT;
   }

   @Nullable
   public T a(dds $$0, btp $$1) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<btj> a(uf $$0, dds $$1, btp $$2) {
      return ad.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public exz a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new exz($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dua $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eqo.a($$0) ? true : $$0.a(dgx.cd) || $$0.a(dgx.oi) || $$0.a(dgx.dQ) || $$0.a(dgx.qP);
      }
   }

   public btm n() {
      return this.bR;
   }

   public static Optional<btq<?>> a(uf $$0) {
      return lu.f.b(alb.a($$0.l("id")));
   }

   @Nullable
   public static btj a(uf $$0, dds $$1, btp $$2, Function<btj, btj> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            ul $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               btj $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (btj)$$4;
      }).orElse(null);
   }

   public static Stream<btj> a(final List<? extends vc> $$0, final dds $$1, final btp $$2) {
      final Spliterator<? extends vc> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<btj>() {
         @Override
         public boolean tryAdvance(Consumer<? super btj> $$0x) {
            return $$3.tryAdvance($$3xx -> btq.a((uf)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<btj> trySplit() {
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

   private static Optional<btj> b(uf $$0, dds $$1, btp $$2) {
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

   public boolean a(axi<btq<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jr<btq<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(btj $$0) {
      return (T)($$0.ao() == this ? $$0 : null);
   }

   @Override
   public Class<? extends btj> a() {
      return btj.class;
   }

   @Deprecated
   public jn.c<btq<?>> r() {
      return this.bC;
   }

   public static class a<T extends btj> {
      private final btq.b<T> a;
      private final bui b;
      private ImmutableSet<dgv> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private btm j = btm.b(0.6F, 1.8F);
      private float k = 1.0F;
      private btl.a l = btl.a();
      private cqh m = cqj.h;

      private a(btq.b<T> $$0, bui $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bui.b || $$1 == bui.h;
      }

      public static <T extends btj> btq.a<T> a(btq.b<T> $$0, bui $$1) {
         return new btq.a<>($$0, $$1);
      }

      public static <T extends btj> btq.a<T> a(bui $$0) {
         return new btq.a<>(($$0x, $$1) -> null, $$0);
      }

      public btq.a<T> a(float $$0, float $$1) {
         this.j = btm.b($$0, $$1);
         return this;
      }

      public btq.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public btq.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public btq.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(btk.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public btq.a<T> a(eye... $$0) {
         for (eye $$1 : $$0) {
            this.l = this.l.a(btk.a, $$1);
         }

         return this;
      }

      public btq.a<T> a(eye $$0) {
         return this.a(btk.b, $$0);
      }

      public btq.a<T> c(float $$0) {
         return this.a(btk.b, 0.0F, -$$0, 0.0F);
      }

      public btq.a<T> d(float $$0) {
         return this.a(btk.c, 0.0F, $$0, 0.0F);
      }

      public btq.a<T> a(btk $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public btq.a<T> a(btk $$0, eye $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public btq.a<T> a() {
         this.e = false;
         return this;
      }

      public btq.a<T> b() {
         this.d = false;
         return this;
      }

      public btq.a<T> c() {
         this.f = true;
         return this;
      }

      public btq.a<T> a(dgv... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public btq.a<T> d() {
         this.g = true;
         return this;
      }

      public btq.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public btq.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public btq.a<T> a(cqf... $$0) {
         this.m = cqj.f.a($$0);
         return this;
      }

      public btq<T> a(String $$0) {
         if (this.d) {
            ad.a(bhk.A, $$0);
         }

         return new btq<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends btj> {
      T create(btq<T> var1, dds var2);
   }
}
