import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bnw<T extends bnq> implements cjt, dpk<bnq, T> {
   private static final Logger bz = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ij.c<bnw<?>> bA = kf.g.g(this);
   private static final float bB = 1.3964844F;
   private static final int bC = 10;
   public static final bnw<cbb> b = a("allay", bnw.a.a(cbb::new, bol.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bnw<bnn> c = a("area_effect_cloud", bnw.a.<bnn>a(bnn::new, bol.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bnw<cbe> d = a("armadillo", bnw.a.a(cbe::new, bol.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bnw<cdm> e = a("armor_stand", bnw.a.<cdm>a(cdm::new, bol.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bnw<cht> f = a("arrow", bnw.a.<cht>a(cht::new, bol.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bnw<cbh> g = a("axolotl", bnw.a.a(cbh::new, bol.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bnw<bzs> h = a("bat", bnw.a.a(bzs::new, bol.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bnw<bzy> i = a("bee", bnw.a.a(bzy::new, bol.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bnw<ceb> j = a("blaze", bnw.a.a(ceb::new, bol.a).c().a(0.6F, 1.8F).a(8));
   public static final bnw<bnp.b> k = a("block_display", bnw.a.a(bnp.b::new, bol.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bnw<cjg> l = a("boat", bnw.a.<cjg>a(cjg::new, bol.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bnw<cfn> m = a("breeze", bnw.a.a(cfn::new, bol.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cjy.c));
   public static final bnw<cbm> n = a("camel", bnw.a.a(cbm::new, bol.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bnw<caa> o = a("cat", bnw.a.a(caa::new, bol.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bnw<cec> p = a("cave_spider", bnw.a.a(cec::new, bol.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bnw<cjh> q = a("chest_boat", bnw.a.<cjh>a(cjh::new, bol.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bnw<cjl> r = a("chest_minecart", bnw.a.<cjl>a(cjl::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<cac> s = a("chicken", bnw.a.a(cac::new, bol.b).a(0.4F, 0.7F).a(0.644F).a(new enz(0.0, 0.7, -0.1)).a(10));
   public static final bnw<cad> t = a("cod", bnw.a.a(cad::new, bol.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bnw<cjm> u = a("command_block_minecart", bnw.a.<cjm>a(cjm::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<cae> v = a("cow", bnw.a.a(cae::new, bol.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bnw<ced> w = a("creeper", bnw.a.a(ced::new, bol.a).a(0.6F, 1.7F).a(8));
   public static final bnw<caf> x = a("dolphin", bnw.a.a(caf::new, bol.f).a(0.9F, 0.6F).a(0.3F));
   public static final bnw<cca> y = a("donkey", bnw.a.a(cca::new, bol.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bnw<chu> z = a("dragon_fireball", bnw.a.<chu>a(chu::new, bol.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bnw<cef> A = a("drowned", bnw.a.a(cef::new, bol.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bnw<cim> B = a("egg", bnw.a.<cim>a(cim::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<ceg> C = a("elder_guardian", bnw.a.a(ceg::new, bol.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bnw<ccp> D = a("end_crystal", bnw.a.<ccp>a(ccp::new, bol.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bnw<ccq> E = a("ender_dragon", bnw.a.a(ccq::new, bol.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bnw<cin> F = a("ender_pearl", bnw.a.<cin>a(cin::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<ceh> G = a("enderman", bnw.a.a(ceh::new, bol.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bnw<cei> H = a("endermite", bnw.a.a(cei::new, bol.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bnw<cek> I = a("evoker", bnw.a.a(cek::new, bol.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnw<chv> J = a("evoker_fangs", bnw.a.<chv>a(chv::new, bol.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bnw<cio> K = a("experience_bottle", bnw.a.<cio>a(cio::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<bny> L = a("experience_orb", bnw.a.<bny>a(bny::new, bol.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bnw<chw> M = a("eye_of_ender", bnw.a.<chw>a(chw::new, bol.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bnw<cdv> N = a("falling_block", bnw.a.<cdv>a(cdv::new, bol.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bnw<chy> O = a("firework_rocket", bnw.a.<chy>a(chy::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<cah> P = a("fox", bnw.a.a(cah::new, bol.b).a(0.6F, 0.7F).a(0.4F).a(new enz(0.0, 0.6375, -0.25)).a(8).a(cyu.oi));
   public static final bnw<cbp> Q = a("frog", bnw.a.a(cbp::new, bol.b).a(0.5F, 0.5F).a(new enz(0.0, 0.375, -0.25)).a(10));
   public static final bnw<cjn> R = a("furnace_minecart", bnw.a.<cjn>a(cjn::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<cel> S = a("ghast", bnw.a.a(cel::new, bol.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bnw<cem> T = a("giant", bnw.a.a(cem::new, bol.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bnw<cdn> U = a("glow_item_frame", bnw.a.<cdn>a(cdn::new, bol.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bnw<boa> V = a("glow_squid", bnw.a.a(boa::new, bol.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bnw<cbv> W = a("goat", bnw.a.a(cbv::new, bol.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bnw<cen> X = a("guardian", bnw.a.a(cen::new, bol.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bnw<cfv> Y = a("hoglin", bnw.a.a(cfv::new, bol.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bnw<cjo> Z = a("hopper_minecart", bnw.a.<cjo>a(cjo::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<ccb> aa = a("horse", bnw.a.a(ccb::new, bol.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bnw<ceo> ab = a("husk", bnw.a.a(ceo::new, bol.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bnw<cep> ac = a("illusioner", bnw.a.a(cep::new, bol.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnw<bod> ad = a("interaction", bnw.a.a(bod::new, bol.h).a(0.0F, 0.0F).a(10));
   public static final bnw<caj> ae = a("iron_golem", bnw.a.a(caj::new, bol.h).a(1.4F, 2.7F).a(10));
   public static final bnw<cdw> af = a("item", bnw.a.<cdw>a(cdw::new, bol.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bnw<bnp.g> ag = a("item_display", bnw.a.a(bnp.g::new, bol.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bnw<cdp> ah = a("item_frame", bnw.a.<cdp>a(cdp::new, bol.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bnw<cib> ai = a("fireball", bnw.a.<cib>a(cib::new, bol.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bnw<cdq> aj = a("leash_knot", bnw.a.<cdq>a(cdq::new, bol.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bnw<boh> ak = a("lightning_bolt", bnw.a.a(boh::new, bol.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bnw<ccc> al = a("llama", bnw.a.a(ccc::new, bol.b).a(0.9F, 1.87F).a(1.7765F).a(new enz(0.0, 1.37, -0.3)).a(10));
   public static final bnw<cic> am = a("llama_spit", bnw.a.<cic>a(cic::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<ceq> an = a("magma_cube", bnw.a.a(ceq::new, bol.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bnw<boj> ao = a("marker", bnw.a.a(boj::new, bol.h).a(0.0F, 0.0F).a(0));
   public static final bnw<cjk> ap = a("minecart", bnw.a.<cjk>a(cjk::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<cak> aq = a("mooshroom", bnw.a.a(cak::new, bol.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bnw<cce> ar = a("mule", bnw.a.a(cce::new, bol.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bnw<cal> as = a("ocelot", bnw.a.a(cal::new, bol.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bnw<cdr> at = a("painting", bnw.a.<cdr>a(cdr::new, bol.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bnw<cam> au = a("panda", bnw.a.a(cam::new, bol.b).a(1.3F, 1.25F).a(10));
   public static final bnw<can> av = a("parrot", bnw.a.a(can::new, bol.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bnw<cet> aw = a("phantom", bnw.a.a(cet::new, bol.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bnw<cao> ax = a("pig", bnw.a.a(cao::new, bol.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bnw<cgb> ay = a("piglin", bnw.a.a(cgb::new, bol.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bnw<cge> az = a("piglin_brute", bnw.a.a(cge::new, bol.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bnw<ceu> aA = a("pillager", bnw.a.a(ceu::new, bol.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnw<cap> aB = a("polar_bear", bnw.a.a(cap::new, bol.b).a(cyu.qP).a(1.4F, 1.4F).a(10));
   public static final bnw<cip> aC = a("potion", bnw.a.<cip>a(cip::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<caq> aD = a("pufferfish", bnw.a.a(caq::new, bol.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bnw<car> aE = a("rabbit", bnw.a.a(car::new, bol.b).a(0.4F, 0.5F).a(8));
   public static final bnw<cew> aF = a("ravager", bnw.a.a(cew::new, bol.a).a(1.95F, 2.2F).a(new enz(0.0, 2.2625, -0.0625)).a(10));
   public static final bnw<cas> aG = a("salmon", bnw.a.a(cas::new, bol.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bnw<cat> aH = a("sheep", bnw.a.a(cat::new, bol.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bnw<cex> aI = a("shulker", bnw.a.a(cex::new, bol.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bnw<cig> aJ = a("shulker_bullet", bnw.a.<cig>a(cig::new, bol.h).a(0.3125F, 0.3125F).a(8));
   public static final bnw<cey> aK = a("silverfish", bnw.a.a(cey::new, bol.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bnw<cez> aL = a("skeleton", bnw.a.a(cez::new, bol.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bnw<ccf> aM = a("skeleton_horse", bnw.a.a(ccf::new, bol.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bnw<cfa> aN = a("slime", bnw.a.a(cfa::new, bol.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bnw<cih> aO = a("small_fireball", bnw.a.<cih>a(cih::new, bol.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bnw<ccm> aP = a("sniffer", bnw.a.a(ccm::new, bol.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bnw<cav> aQ = a("snow_golem", bnw.a.a(cav::new, bol.h).a(cyu.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bnw<cii> aR = a("snowball", bnw.a.<cii>a(cii::new, bol.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnw<cjp> aS = a("spawner_minecart", bnw.a.<cjp>a(cjp::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<cij> aT = a("spectral_arrow", bnw.a.<cij>a(cij::new, bol.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bnw<cfc> aU = a("spider", bnw.a.a(cfc::new, bol.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bnw<caw> aV = a("squid", bnw.a.a(caw::new, bol.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bnw<cfd> aW = a("stray", bnw.a.a(cfd::new, bol.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(cyu.qP).a(8));
   public static final bnw<cfe> aX = a("strider", bnw.a.a(cfe::new, bol.b).c().a(0.9F, 1.7F).a(10));
   public static final bnw<cbs> aY = a("tadpole", bnw.a.a(cbs::new, bol.b).a(cbs.c, cbs.d).a(cbs.d * 0.65F).a(10));
   public static final bnw<bnp.l> aZ = a("text_display", bnw.a.a(bnp.l::new, bol.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bnw<cdx> ba = a("tnt", bnw.a.<cdx>a(cdx::new, bol.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bnw<cjq> bb = a("tnt_minecart", bnw.a.<cjq>a(cjq::new, bol.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnw<cch> bc = a("trader_llama", bnw.a.a(cch::new, bol.b).a(0.9F, 1.87F).a(1.7765F).a(new enz(0.0, 1.37, -0.3)).a(10));
   public static final bnw<ciq> bd = a("trident", bnw.a.<ciq>a(ciq::new, bol.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bnw<cax> be = a("tropical_fish", bnw.a.a(cax::new, bol.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bnw<cay> bf = a("turtle", bnw.a.a(cay::new, bol.b).a(1.2F, 0.4F).a(new enz(0.0, 0.55625, -0.25)).a(10));
   public static final bnw<cff> bg = a("vex", bnw.a.a(cff::new, bol.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bnw<cgy> bh = a("villager", bnw.a.<cgy>a(cgy::new, bol.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bnw<cfg> bi = a("vindicator", bnw.a.a(cfg::new, bol.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnw<che> bj = a("wandering_trader", bnw.a.a(che::new, bol.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bnw<cgp> bk = a("warden", bnw.a.a(cgp::new, bol.a).a(0.9F, 2.9F).a(3.15F).a(bnr.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bnw<cir> bl = a("wind_charge", bnw.a.<cir>a(cir::new, bol.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cjy.c));
   public static final bnw<cfh> bm = a("witch", bnw.a.a(cfh::new, bol.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bnw<cdk> bn = a("wither", bnw.a.a(cdk::new, bol.a).c().a(cyu.cd).a(0.9F, 3.5F).a(10));
   public static final bnw<cfi> bo = a("wither_skeleton", bnw.a.a(cfi::new, bol.a).c().a(cyu.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bnw<cis> bp = a("wither_skull", bnw.a.<cis>a(cis::new, bol.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bnw<cba> bq = a("wolf", bnw.a.a(cba::new, bol.b).a(0.6F, 0.85F).a(0.68F).a(new enz(0.0, 0.81875, -0.0625)).a(10));
   public static final bnw<cfj> br = a("zoglin", bnw.a.a(cfj::new, bol.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bnw<cfk> bs = a("zombie", bnw.a.<cfk>a(cfk::new, bol.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bnw<ccj> bt = a("zombie_horse", bnw.a.a(ccj::new, bol.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bnw<cfl> bu = a("zombie_villager", bnw.a.a(cfl::new, bol.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bnw<cfm> bv = a("zombified_piglin", bnw.a.a(cfm::new, bol.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bnw<chl> bw = a("player", bnw.a.<chl>a(bol.h).b().a().a(0.6F, 1.8F).a(1.62F).a(chl.bO).a(32).b(2));
   public static final bnw<chz> bx = a("fishing_bobber", bnw.a.<chz>a(chz::new, bol.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bnw.b<T> bD;
   private final bol bE;
   private final ImmutableSet<cys> bF;
   private final boolean bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final int bK;
   private final int bL;
   @Nullable
   private String bM;
   @Nullable
   private vq bN;
   @Nullable
   private aiy bO;
   private final bnt bP;
   private final cjw bQ;

   private static <T extends bnq> bnw<T> a(String $$0, bnw.a<T> $$1) {
      return iv.a(kf.g, $$0, $$1.a($$0));
   }

   public static aiy a(bnw<?> $$0) {
      return kf.g.b($$0);
   }

   public static Optional<bnw<?>> a(String $$0) {
      return kf.g.b(aiy.a($$0));
   }

   public bnw(bnw.b<T> $$0, bol $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cys> $$6, bnt $$7, int $$8, int $$9, cjw $$10) {
      this.bD = $$0;
      this.bE = $$1;
      this.bJ = $$5;
      this.bG = $$2;
      this.bH = $$3;
      this.bI = $$4;
      this.bF = $$6;
      this.bP = $$7;
      this.bK = $$8;
      this.bL = $$9;
      this.bQ = $$10;
   }

   @Nullable
   public T a(aow $$0, @Nullable cpd $$1, @Nullable chl $$2, hz $$3, bom $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      sw $$7;
      if ($$1 != null) {
         $$7 = $$1.w();
         $$8 = a($$0, $$1, $$2);
      } else {
         $$8 = $$0x -> {
         };
         $$7 = null;
      }

      return this.a($$0, $$7, $$8, $$3, $$4, $$5, $$6);
   }

   public static <T extends bnq> Consumer<T> a(aow $$0, cpd $$1, @Nullable chl $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bnq> Consumer<T> a(Consumer<T> $$0, aow $$1, cpd $$2, @Nullable chl $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bnq> Consumer<T> a(Consumer<T> $$0, cpd $$1) {
      return $$1.B() ? $$0.andThen($$1x -> $$1x.b($$1.z())) : $$0;
   }

   public static <T extends bnq> Consumer<T> b(Consumer<T> $$0, aow $$1, cpd $$2, @Nullable chl $$3) {
      sw $$4 = $$2.w();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aow $$0, hz $$1, bom $$2) {
      return this.a($$0, (sw)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aow $$0, @Nullable sw $$1, @Nullable Consumer<T> $$2, hz $$3, bom $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(aow $$0, @Nullable sw $$1, @Nullable Consumer<T> $$2, hz $$3, bom $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cvr)$$0);
      if ($$7 == null) {
         return null;
      } else {
         double $$8;
         if ($$5) {
            $$7.a_((double)$$3.u() + 0.5, (double)($$3.v() + 1), (double)$$3.w() + 0.5);
            $$8 = a($$0, $$3, $$6, $$7.cH());
         } else {
            $$8 = 0.0;
         }

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, awi.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bok $$10) {
            $$10.aW = $$10.dC();
            $$10.aU = $$10.dC();
            $$10.a($$0, $$0.d_($$10.dm()), $$4, null, $$1);
            $$10.R();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(cvu $$0, hz $$1, boolean $$2, enu $$3) {
      enu $$4 = new enu($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eos> $$5 = $$0.d(null, $$4);
      return 1.0 + eop.a(ie.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cvr $$0, @Nullable chl $$1, @Nullable bnq $$2, @Nullable sw $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ag().f($$1.fS())) {
               sw $$5 = $$2.f(new sw());
               UUID $$6 = $$2.cw();
               $$5.a($$3.p("EntityTag"));
               $$2.a_($$6);
               $$2.g($$5);
            }
         }
      }
   }

   public boolean b() {
      return this.bG;
   }

   public boolean c() {
      return this.bH;
   }

   public boolean d() {
      return this.bI;
   }

   public boolean e() {
      return this.bJ;
   }

   public bol f() {
      return this.bE;
   }

   public String g() {
      if (this.bM == null) {
         this.bM = ac.a("entity", kf.g.b(this));
      }

      return this.bM;
   }

   public vq h() {
      if (this.bN == null) {
         this.bN = vq.c(this.g());
      }

      return this.bN;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public aiy j() {
      if (this.bO == null) {
         aiy $$0 = kf.g.b(this);
         this.bO = $$0.d("entities/");
      }

      return this.bO;
   }

   public float k() {
      return this.bP.a();
   }

   public float l() {
      return this.bP.b();
   }

   @Override
   public cjw m() {
      return this.bQ;
   }

   @Nullable
   public T a(cvr $$0) {
      return !this.a($$0.I()) ? null : this.bD.create(this, $$0);
   }

   public static Optional<bnq> a(sw $$0, cvr $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bz.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public enu a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new enu($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dlj $$0) {
      if (this.bF.contains($$0.b())) {
         return false;
      } else {
         return !this.bI && ehq.a($$0) ? true : $$0.a(cyu.cd) || $$0.a(cyu.oi) || $$0.a(cyu.dQ) || $$0.a(cyu.qP);
      }
   }

   public bnt n() {
      return this.bP;
   }

   public static Optional<bnw<?>> a(sw $$0) {
      return kf.g.b(new aiy($$0.l("id")));
   }

   @Nullable
   public static bnq a(sw $$0, cvr $$1, Function<bnq, bnq> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            tc $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bnq $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bnq)$$3;
      }).orElse(null);
   }

   public static Stream<bnq> a(final List<? extends tt> $$0, final cvr $$1) {
      final Spliterator<? extends tt> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bnq>() {
         @Override
         public boolean tryAdvance(Consumer<? super bnq> $$0x) {
            return $$2.tryAdvance($$2xx -> bnw.a((sw)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bnq> trySplit() {
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

   private static Optional<bnq> b(sw $$0, cvr $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bz.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bK;
   }

   public int p() {
      return this.bL;
   }

   public boolean q() {
      return this != bw && this != am && this != bn && this != h && this != ah && this != U && this != aj && this != at && this != D && this != J;
   }

   public boolean a(aup<bnw<?>> $$0) {
      return this.bA.a($$0);
   }

   public boolean a(in<bnw<?>> $$0) {
      return $$0.a(this.bA);
   }

   @Nullable
   public T a(bnq $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bnq> a() {
      return bnq.class;
   }

   @Deprecated
   public ij.c<bnw<?>> r() {
      return this.bA;
   }

   public static class a<T extends bnq> {
      private final bnw.b<T> a;
      private final bol b;
      private ImmutableSet<cys> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bnt j = bnt.b(0.6F, 1.8F);
      private bns.a k = bns.a();
      private cjw l = cjy.g;

      private a(bnw.b<T> $$0, bol $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bol.b || $$1 == bol.h;
      }

      public static <T extends bnq> bnw.a<T> a(bnw.b<T> $$0, bol $$1) {
         return new bnw.a<>($$0, $$1);
      }

      public static <T extends bnq> bnw.a<T> a(bol $$0) {
         return new bnw.a<>(($$0x, $$1) -> null, $$0);
      }

      public bnw.a<T> a(float $$0, float $$1) {
         this.j = bnt.b($$0, $$1);
         return this;
      }

      public bnw.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bnw.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bnr.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bnw.a<T> a(enz... $$0) {
         for (enz $$1 : $$0) {
            this.k = this.k.a(bnr.a, $$1);
         }

         return this;
      }

      public bnw.a<T> a(enz $$0) {
         return this.a(bnr.b, $$0);
      }

      public bnw.a<T> b(float $$0) {
         return this.a(bnr.b, 0.0F, -$$0, 0.0F);
      }

      public bnw.a<T> c(float $$0) {
         return this.a(bnr.c, 0.0F, $$0, 0.0F);
      }

      public bnw.a<T> a(bnr $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bnw.a<T> a(bnr $$0, enz $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bnw.a<T> a() {
         this.e = false;
         return this;
      }

      public bnw.a<T> b() {
         this.d = false;
         return this;
      }

      public bnw.a<T> c() {
         this.f = true;
         return this;
      }

      public bnw.a<T> a(cys... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bnw.a<T> d() {
         this.g = true;
         return this;
      }

      public bnw.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bnw.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bnw.a<T> a(cju... $$0) {
         this.l = cjy.e.a($$0);
         return this;
      }

      public bnw<T> a(String $$0) {
         if (this.d) {
            ac.a(bdn.x, $$0);
         }

         return new bnw<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bnq> {
      T create(bnw<T> var1, cvr var2);
   }
}
