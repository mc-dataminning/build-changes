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

public class btv<T extends bto> implements cqk, dyz<bto, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jn.c<btv<?>> bC = lu.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final btv<chg> a = a("allay", btv.a.a(chg::new, bun.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final btv<btj> b = a("area_effect_cloud", btv.a.<btj>a(btj::new, bun.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btv<chj> c = a("armadillo", btv.a.a(chj::new, bun.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final btv<cjt> d = a("armor_stand", btv.a.<cjt>a(cjt::new, bun.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final btv<cod> e = a("arrow", btv.a.<cod>a(cod::new, bun.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btv<chm> f = a("axolotl", btv.a.a(chm::new, bun.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final btv<cfu> g = a("bat", btv.a.a(cfu::new, bun.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final btv<cgb> h = a("bee", btv.a.a(cgb::new, bun.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final btv<ckj> i = a("blaze", btv.a.a(ckj::new, bun.a).c().a(0.6F, 1.8F).a(8));
   public static final btv<btm.b> j = a("block_display", btv.a.a(btm.b::new, bun.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btv<cpu> k = a("boat", btv.a.<cpu>a(cpu::new, bun.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btv<ckk> l = a("bogged", btv.a.a(ckk::new, bun.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final btv<clw> m = a("breeze", btv.a.a(clw::new, bun.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final btv<cpf> n = a("breeze_wind_charge", btv.a.<cpf>a(cpf::new, bun.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final btv<chr> o = a("camel", btv.a.a(chr::new, bun.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final btv<cgd> p = a("cat", btv.a.a(cgd::new, bun.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final btv<ckl> q = a("cave_spider", btv.a.a(ckl::new, bun.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final btv<cpv> r = a("chest_boat", btv.a.<cpv>a(cpv::new, bun.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btv<cqa> s = a("chest_minecart", btv.a.<cqa>a(cqa::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cgf> t = a("chicken", btv.a.a(cgf::new, bun.b).a(0.4F, 0.7F).b(0.644F).a(new eys(0.0, 0.7, -0.1)).a(10));
   public static final btv<cgg> u = a("cod", btv.a.a(cgg::new, bun.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final btv<cqb> v = a("command_block_minecart", btv.a.<cqb>a(cqb::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cgh> w = a("cow", btv.a.a(cgh::new, bun.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btv<ckm> x = a("creeper", btv.a.a(ckm::new, bun.a).a(0.6F, 1.7F).a(8));
   public static final btv<cgi> y = a("dolphin", btv.a.a(cgi::new, bun.f).a(0.9F, 0.6F).b(0.3F));
   public static final btv<cif> z = a("donkey", btv.a.a(cif::new, bun.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final btv<coe> A = a("dragon_fireball", btv.a.<coe>a(coe::new, bun.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btv<cko> B = a("drowned", btv.a.a(cko::new, bun.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btv<cox> C = a("egg", btv.a.<cox>a(cox::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<ckp> D = a("elder_guardian", btv.a.a(ckp::new, bun.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final btv<ciw> E = a("end_crystal", btv.a.<ciw>a(ciw::new, bun.h).c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final btv<cix> F = a("ender_dragon", btv.a.a(cix::new, bun.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final btv<coy> G = a("ender_pearl", btv.a.<coy>a(coy::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<ckq> H = a("enderman", btv.a.a(ckq::new, bun.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final btv<ckr> I = a("endermite", btv.a.a(ckr::new, bun.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btv<ckt> J = a("evoker", btv.a.a(ckt::new, bun.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btv<cof> K = a("evoker_fangs", btv.a.<cof>a(cof::new, bun.h).a(0.5F, 0.8F).a(6).b(2));
   public static final btv<coz> L = a("experience_bottle", btv.a.<coz>a(coz::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<bua> M = a("experience_orb", btv.a.<bua>a(bua::new, bun.h).a(0.5F, 0.5F).a(6).b(20));
   public static final btv<cog> N = a("eye_of_ender", btv.a.<cog>a(cog::new, bun.h).a(0.25F, 0.25F).a(4).b(4));
   public static final btv<ckd> O = a("falling_block", btv.a.<ckd>a(ckd::new, bun.h).a(0.98F, 0.98F).a(10).b(20));
   public static final btv<coi> P = a("firework_rocket", btv.a.<coi>a(coi::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<cgk> Q = a("fox", btv.a.a(cgk::new, bun.b).a(0.6F, 0.7F).b(0.4F).a(new eys(0.0, 0.6375, -0.25)).a(8).a(dhl.oi));
   public static final btv<chu> R = a("frog", btv.a.a(chu::new, bun.b).a(0.5F, 0.5F).a(new eys(0.0, 0.375, -0.25)).a(10));
   public static final btv<cqc> S = a("furnace_minecart", btv.a.<cqc>a(cqc::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cku> T = a("ghast", btv.a.a(cku::new, bun.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final btv<ckv> U = a("giant", btv.a.a(ckv::new, bun.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final btv<cjv> V = a("glow_item_frame", btv.a.<cjv>a(cjv::new, bun.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btv<buc> W = a("glow_squid", btv.a.a(buc::new, bun.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final btv<cia> X = a("goat", btv.a.a(cia::new, bun.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final btv<ckw> Y = a("guardian", btv.a.a(ckw::new, bun.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final btv<cme> Z = a("hoglin", btv.a.a(cme::new, bun.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btv<cqd> aa = a("hopper_minecart", btv.a.<cqd>a(cqd::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cig> ab = a("horse", btv.a.a(cig::new, bun.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final btv<ckx> ac = a("husk", btv.a.a(ckx::new, bun.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final btv<cky> ad = a("illusioner", btv.a.a(cky::new, bun.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btv<buf> ae = a("interaction", btv.a.a(buf::new, bun.h).a(0.0F, 0.0F).a(10));
   public static final btv<cgm> af = a("iron_golem", btv.a.a(cgm::new, bun.h).a(1.4F, 2.7F).a(10));
   public static final btv<cke> ag = a("item", btv.a.<cke>a(cke::new, bun.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final btv<btm.g> ah = a("item_display", btv.a.a(btm.g::new, bun.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btv<cjx> ai = a("item_frame", btv.a.<cjx>a(cjx::new, bun.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btv<buq> aj = a("ominous_item_spawner", btv.a.a(buq::new, bun.h).a(0.25F, 0.25F).a(8));
   public static final btv<col> ak = a("fireball", btv.a.<col>a(col::new, bun.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btv<cjy> al = a("leash_knot", btv.a.<cjy>a(cjy::new, bun.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final btv<buj> am = a("lightning_bolt", btv.a.a(buj::new, bun.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final btv<cih> an = a("llama", btv.a.a(cih::new, bun.b).a(0.9F, 1.87F).b(1.7765F).a(new eys(0.0, 1.37, -0.3)).a(10));
   public static final btv<com> ao = a("llama_spit", btv.a.<com>a(com::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<ckz> ap = a("magma_cube", btv.a.a(ckz::new, bun.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final btv<bul> aq = a("marker", btv.a.a(bul::new, bun.h).a(0.0F, 0.0F).a(0));
   public static final btv<cpy> ar = a("minecart", btv.a.<cpy>a(cpy::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cgn> as = a("mooshroom", btv.a.a(cgn::new, bun.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btv<cij> at = a("mule", btv.a.a(cij::new, bun.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final btv<cgo> au = a("ocelot", btv.a.a(cgo::new, bun.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final btv<cjz> av = a("painting", btv.a.<cjz>a(cjz::new, bun.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btv<cgp> aw = a("panda", btv.a.a(cgp::new, bun.b).a(1.3F, 1.25F).a(10));
   public static final btv<cgq> ax = a("parrot", btv.a.a(cgq::new, bun.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final btv<clc> ay = a("phantom", btv.a.a(clc::new, bun.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final btv<cgr> az = a("pig", btv.a.a(cgr::new, bun.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final btv<cmk> aA = a("piglin", btv.a.a(cmk::new, bun.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btv<cmn> aB = a("piglin_brute", btv.a.a(cmn::new, bun.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btv<cld> aC = a("pillager", btv.a.a(cld::new, bun.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btv<cgs> aD = a("polar_bear", btv.a.a(cgs::new, bun.b).a(dhl.qP).a(1.4F, 1.4F).a(10));
   public static final btv<cpa> aE = a("potion", btv.a.<cpa>a(cpa::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<cgt> aF = a("pufferfish", btv.a.a(cgt::new, bun.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final btv<cgu> aG = a("rabbit", btv.a.a(cgu::new, bun.b).a(0.4F, 0.5F).a(8));
   public static final btv<clf> aH = a("ravager", btv.a.a(clf::new, bun.a).a(1.95F, 2.2F).a(new eys(0.0, 2.2625, -0.0625)).a(10));
   public static final btv<cgv> aI = a("salmon", btv.a.a(cgv::new, bun.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final btv<cgw> aJ = a("sheep", btv.a.a(cgw::new, bun.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final btv<clg> aK = a("shulker", btv.a.a(clg::new, bun.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final btv<cor> aL = a("shulker_bullet", btv.a.<cor>a(cor::new, bun.h).a(0.3125F, 0.3125F).a(8));
   public static final btv<clh> aM = a("silverfish", btv.a.a(clh::new, bun.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btv<cli> aN = a("skeleton", btv.a.a(cli::new, bun.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final btv<cik> aO = a("skeleton_horse", btv.a.a(cik::new, bun.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btv<clj> aP = a("slime", btv.a.a(clj::new, bun.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final btv<cos> aQ = a("small_fireball", btv.a.<cos>a(cos::new, bun.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btv<cir> aR = a("sniffer", btv.a.a(cir::new, bun.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final btv<cgy> aS = a("snow_golem", btv.a.a(cgy::new, bun.h).a(dhl.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final btv<cot> aT = a("snowball", btv.a.<cot>a(cot::new, bun.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btv<cqe> aU = a("spawner_minecart", btv.a.<cqe>a(cqe::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cou> aV = a("spectral_arrow", btv.a.<cou>a(cou::new, bun.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btv<cll> aW = a("spider", btv.a.a(cll::new, bun.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final btv<cgz> aX = a("squid", btv.a.a(cgz::new, bun.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final btv<clm> aY = a("stray", btv.a.a(clm::new, bun.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dhl.qP).a(8));
   public static final btv<cln> aZ = a("strider", btv.a.a(cln::new, bun.b).c().a(0.9F, 1.7F).a(10));
   public static final btv<chx> ba = a("tadpole", btv.a.a(chx::new, bun.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final btv<btm.l> bb = a("text_display", btv.a.a(btm.l::new, bun.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btv<ckf> bc = a("tnt", btv.a.<ckf>a(ckf::new, bun.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final btv<cqf> bd = a("tnt_minecart", btv.a.<cqf>a(cqf::new, bun.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btv<cim> be = a("trader_llama", btv.a.a(cim::new, bun.b).a(0.9F, 1.87F).b(1.7765F).a(new eys(0.0, 1.37, -0.3)).a(10));
   public static final btv<cpb> bf = a("trident", btv.a.<cpb>a(cpb::new, bun.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btv<cha> bg = a("tropical_fish", btv.a.a(cha::new, bun.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final btv<chb> bh = a("turtle", btv.a.a(chb::new, bun.b).a(1.2F, 0.4F).a(new eys(0.0, 0.55625, -0.25)).a(10));
   public static final btv<clo> bi = a("vex", btv.a.a(clo::new, bun.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final btv<cnh> bj = a("villager", btv.a.<cnh>a(cnh::new, bun.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btv<clp> bk = a("vindicator", btv.a.a(clp::new, bun.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btv<cnn> bl = a("wandering_trader", btv.a.a(cnn::new, bun.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btv<cmy> bm = a("warden", btv.a.a(cmy::new, bun.a).a(0.9F, 2.9F).a(3.15F).a(btp.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final btv<cpg> bn = a("wind_charge", btv.a.<cpg>a(cpg::new, bun.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final btv<clq> bo = a("witch", btv.a.a(clq::new, bun.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final btv<cjr> bp = a("wither", btv.a.a(cjr::new, bun.a).c().a(dhl.cd).a(0.9F, 3.5F).a(10));
   public static final btv<clr> bq = a("wither_skeleton", btv.a.a(clr::new, bun.a).c().a(dhl.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final btv<cpc> br = a("wither_skull", btv.a.<cpc>a(cpc::new, bun.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btv<chd> bs = a("wolf", btv.a.a(chd::new, bun.b).a(0.6F, 0.85F).b(0.68F).a(new eys(0.0, 0.81875, -0.0625)).a(10));
   public static final btv<cls> bt = a("zoglin", btv.a.a(cls::new, bun.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btv<clt> bu = a("zombie", btv.a.<clt>a(clt::new, bun.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btv<cio> bv = a("zombie_horse", btv.a.a(cio::new, bun.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btv<clu> bw = a("zombie_villager", btv.a.a(clu::new, bun.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final btv<clv> bx = a("zombified_piglin", btv.a.a(clv::new, bun.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final btv<cnu> by = a("player", btv.a.<cnu>a(bun.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cnu.bR).a(32).b(2));
   public static final btv<coj> bz = a("fishing_bobber", btv.a.<coj>a(coj::new, bun.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final btv.b<T> bF;
   private final bun bG;
   private final ImmutableSet<dhj> bH;
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
   private alb<etm> bQ;
   private final btr bR;
   private final float bS;
   private final cqn bT;

   private static <T extends bto> btv<T> a(String $$0, btv.a<T> $$1) {
      return ka.a(lu.f, $$0, $$1.a($$0));
   }

   public static alc a(btv<?> $$0) {
      return lu.f.b($$0);
   }

   public static Optional<btv<?>> a(String $$0) {
      return lu.f.b(alc.c($$0));
   }

   public btv(btv.b<T> $$0, bun $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dhj> $$6, btr $$7, float $$8, int $$9, int $$10, cqn $$11) {
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
   public T a(arh $$0, @Nullable cvp $$1, @Nullable cnu $$2, je $$3, btu $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bto> Consumer<T> a(deg $$0, cvp $$1, @Nullable cnu $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bto> Consumer<T> a(Consumer<T> $$0, deg $$1, cvp $$2, @Nullable cnu $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bto> Consumer<T> a(Consumer<T> $$0, cvp $$1) {
      xd $$2 = $$1.a(kr.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bto> Consumer<T> b(Consumer<T> $$0, deg $$1, cvp $$2, @Nullable cnu $$3) {
      cye $$4 = $$2.a(kr.R, cye.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arh $$0, je $$1, btu $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arh $$0, @Nullable Consumer<T> $$1, je $$2, btu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arh $$0, @Nullable Consumer<T> $$1, je $$2, btu $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azd.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bum $$9) {
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

   protected static double a(dej $$0, je $$1, boolean $$2, eyn $$3) {
      eyn $$4 = new eyn($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ezm> $$5 = $$0.d(null, $$4);
      return 1.0 + ezj.a(jj.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(deg $$0, @Nullable cnu $$1, @Nullable bto $$2, cye $$3) {
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

   public bun f() {
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

   public alb<etm> k() {
      if (this.bQ == null) {
         alc $$0 = lu.f.b(this);
         this.bQ = alb.a(lv.bd, $$0.f("entities/"));
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
   public cqn i() {
      return this.bT;
   }

   @Nullable
   public T a(deg $$0, btu $$1) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bto> a(uf $$0, deg $$1, btu $$2) {
      return ad.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eyn a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new eyn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(duo $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && erc.a($$0) ? true : $$0.a(dhl.cd) || $$0.a(dhl.oi) || $$0.a(dhl.dQ) || $$0.a(dhl.qP);
      }
   }

   public btr n() {
      return this.bR;
   }

   public static Optional<btv<?>> a(uf $$0) {
      return lu.f.b(alc.a($$0.l("id")));
   }

   @Nullable
   public static bto a(uf $$0, deg $$1, btu $$2, Function<bto, bto> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            ul $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bto $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bto)$$4;
      }).orElse(null);
   }

   public static Stream<bto> a(final List<? extends vc> $$0, final deg $$1, final btu $$2) {
      final Spliterator<? extends vc> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bto>() {
         @Override
         public boolean tryAdvance(Consumer<? super bto> $$0x) {
            return $$3.tryAdvance($$3xx -> btv.a((uf)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bto> trySplit() {
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

   private static Optional<bto> b(uf $$0, deg $$1, btu $$2) {
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

   public boolean a(axj<btv<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jr<btv<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bto $$0) {
      return (T)($$0.ao() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bto> a() {
      return bto.class;
   }

   @Deprecated
   public jn.c<btv<?>> r() {
      return this.bC;
   }

   public static class a<T extends bto> {
      private final btv.b<T> a;
      private final bun b;
      private ImmutableSet<dhj> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private btr j = btr.b(0.6F, 1.8F);
      private float k = 1.0F;
      private btq.a l = btq.a();
      private cqn m = cqp.h;

      private a(btv.b<T> $$0, bun $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bun.b || $$1 == bun.h;
      }

      public static <T extends bto> btv.a<T> a(btv.b<T> $$0, bun $$1) {
         return new btv.a<>($$0, $$1);
      }

      public static <T extends bto> btv.a<T> a(bun $$0) {
         return new btv.a<>(($$0x, $$1) -> null, $$0);
      }

      public btv.a<T> a(float $$0, float $$1) {
         this.j = btr.b($$0, $$1);
         return this;
      }

      public btv.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public btv.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public btv.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(btp.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public btv.a<T> a(eys... $$0) {
         for (eys $$1 : $$0) {
            this.l = this.l.a(btp.a, $$1);
         }

         return this;
      }

      public btv.a<T> a(eys $$0) {
         return this.a(btp.b, $$0);
      }

      public btv.a<T> c(float $$0) {
         return this.a(btp.b, 0.0F, -$$0, 0.0F);
      }

      public btv.a<T> d(float $$0) {
         return this.a(btp.c, 0.0F, $$0, 0.0F);
      }

      public btv.a<T> a(btp $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public btv.a<T> a(btp $$0, eys $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public btv.a<T> a() {
         this.e = false;
         return this;
      }

      public btv.a<T> b() {
         this.d = false;
         return this;
      }

      public btv.a<T> c() {
         this.f = true;
         return this;
      }

      public btv.a<T> a(dhj... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public btv.a<T> d() {
         this.g = true;
         return this;
      }

      public btv.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public btv.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public btv.a<T> a(cql... $$0) {
         this.m = cqp.f.a($$0);
         return this;
      }

      public btv<T> a(String $$0) {
         if (this.d) {
            ad.a(bhm.A, $$0);
         }

         return new btv<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bto> {
      T create(btv<T> var1, deg var2);
   }
}
