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

public class bnu<T extends bno> implements cjp, dpd<bno, T> {
   private static final Logger bz = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ij.c<bnu<?>> bA = kf.g.g(this);
   private static final float bB = 1.3964844F;
   private static final int bC = 10;
   public static final bnu<cax> b = a("allay", bnu.a.a(cax::new, boj.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bnu<bnl> c = a("area_effect_cloud", bnu.a.<bnl>a(bnl::new, boj.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bnu<cba> d = a("armadillo", bnu.a.a(cba::new, boj.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bnu<cdi> e = a("armor_stand", bnu.a.<cdi>a(cdi::new, boj.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bnu<chp> f = a("arrow", bnu.a.<chp>a(chp::new, boj.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bnu<cbd> g = a("axolotl", bnu.a.a(cbd::new, boj.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bnu<bzo> h = a("bat", bnu.a.a(bzo::new, boj.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bnu<bzu> i = a("bee", bnu.a.a(bzu::new, boj.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bnu<cdx> j = a("blaze", bnu.a.a(cdx::new, boj.a).c().a(0.6F, 1.8F).a(8));
   public static final bnu<bnn.b> k = a("block_display", bnu.a.a(bnn.b::new, boj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bnu<cjc> l = a("boat", bnu.a.<cjc>a(cjc::new, boj.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bnu<cfj> m = a("breeze", bnu.a.a(cfj::new, boj.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cju.c));
   public static final bnu<cbi> n = a("camel", bnu.a.a(cbi::new, boj.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bnu<bzw> o = a("cat", bnu.a.a(bzw::new, boj.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bnu<cdy> p = a("cave_spider", bnu.a.a(cdy::new, boj.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bnu<cjd> q = a("chest_boat", bnu.a.<cjd>a(cjd::new, boj.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bnu<cjh> r = a("chest_minecart", bnu.a.<cjh>a(cjh::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<bzy> s = a("chicken", bnu.a.a(bzy::new, boj.b).a(0.4F, 0.7F).a(0.644F).a(new ens(0.0, 0.7, -0.1)).a(10));
   public static final bnu<bzz> t = a("cod", bnu.a.a(bzz::new, boj.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bnu<cji> u = a("command_block_minecart", bnu.a.<cji>a(cji::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<caa> v = a("cow", bnu.a.a(caa::new, boj.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bnu<cdz> w = a("creeper", bnu.a.a(cdz::new, boj.a).a(0.6F, 1.7F).a(8));
   public static final bnu<cab> x = a("dolphin", bnu.a.a(cab::new, boj.f).a(0.9F, 0.6F).a(0.3F));
   public static final bnu<cbw> y = a("donkey", bnu.a.a(cbw::new, boj.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bnu<chq> z = a("dragon_fireball", bnu.a.<chq>a(chq::new, boj.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bnu<ceb> A = a("drowned", bnu.a.a(ceb::new, boj.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bnu<cii> B = a("egg", bnu.a.<cii>a(cii::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<cec> C = a("elder_guardian", bnu.a.a(cec::new, boj.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bnu<ccl> D = a("end_crystal", bnu.a.<ccl>a(ccl::new, boj.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bnu<ccm> E = a("ender_dragon", bnu.a.a(ccm::new, boj.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bnu<cij> F = a("ender_pearl", bnu.a.<cij>a(cij::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<ced> G = a("enderman", bnu.a.a(ced::new, boj.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bnu<cee> H = a("endermite", bnu.a.a(cee::new, boj.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bnu<ceg> I = a("evoker", bnu.a.a(ceg::new, boj.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnu<chr> J = a("evoker_fangs", bnu.a.<chr>a(chr::new, boj.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bnu<cik> K = a("experience_bottle", bnu.a.<cik>a(cik::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<bnw> L = a("experience_orb", bnu.a.<bnw>a(bnw::new, boj.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bnu<chs> M = a("eye_of_ender", bnu.a.<chs>a(chs::new, boj.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bnu<cdr> N = a("falling_block", bnu.a.<cdr>a(cdr::new, boj.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bnu<chu> O = a("firework_rocket", bnu.a.<chu>a(chu::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<cad> P = a("fox", bnu.a.a(cad::new, boj.b).a(0.6F, 0.7F).a(0.4F).a(new ens(0.0, 0.6375, -0.25)).a(8).a(cyq.oi));
   public static final bnu<cbl> Q = a("frog", bnu.a.a(cbl::new, boj.b).a(0.5F, 0.5F).a(new ens(0.0, 0.375, -0.25)).a(10));
   public static final bnu<cjj> R = a("furnace_minecart", bnu.a.<cjj>a(cjj::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<ceh> S = a("ghast", bnu.a.a(ceh::new, boj.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bnu<cei> T = a("giant", bnu.a.a(cei::new, boj.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bnu<cdj> U = a("glow_item_frame", bnu.a.<cdj>a(cdj::new, boj.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bnu<bny> V = a("glow_squid", bnu.a.a(bny::new, boj.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bnu<cbr> W = a("goat", bnu.a.a(cbr::new, boj.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bnu<cej> X = a("guardian", bnu.a.a(cej::new, boj.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bnu<cfr> Y = a("hoglin", bnu.a.a(cfr::new, boj.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bnu<cjk> Z = a("hopper_minecart", bnu.a.<cjk>a(cjk::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<cbx> aa = a("horse", bnu.a.a(cbx::new, boj.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bnu<cek> ab = a("husk", bnu.a.a(cek::new, boj.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bnu<cel> ac = a("illusioner", bnu.a.a(cel::new, boj.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnu<bob> ad = a("interaction", bnu.a.a(bob::new, boj.h).a(0.0F, 0.0F).a(10));
   public static final bnu<caf> ae = a("iron_golem", bnu.a.a(caf::new, boj.h).a(1.4F, 2.7F).a(10));
   public static final bnu<cds> af = a("item", bnu.a.<cds>a(cds::new, boj.h).a(0.25F, 0.25F).a(0.1F).a(6).b(20));
   public static final bnu<bnn.g> ag = a("item_display", bnu.a.a(bnn.g::new, boj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bnu<cdl> ah = a("item_frame", bnu.a.<cdl>a(cdl::new, boj.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bnu<chx> ai = a("fireball", bnu.a.<chx>a(chx::new, boj.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bnu<cdm> aj = a("leash_knot", bnu.a.<cdm>a(cdm::new, boj.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bnu<bof> ak = a("lightning_bolt", bnu.a.a(bof::new, boj.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bnu<cby> al = a("llama", bnu.a.a(cby::new, boj.b).a(0.9F, 1.87F).a(1.7765F).a(new ens(0.0, 1.37, -0.3)).a(10));
   public static final bnu<chy> am = a("llama_spit", bnu.a.<chy>a(chy::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<cem> an = a("magma_cube", bnu.a.a(cem::new, boj.a).c().a(2.04F, 2.04F).a(1.275F).a(8));
   public static final bnu<boh> ao = a("marker", bnu.a.a(boh::new, boj.h).a(0.0F, 0.0F).a(0));
   public static final bnu<cjg> ap = a("minecart", bnu.a.<cjg>a(cjg::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<cag> aq = a("mooshroom", bnu.a.a(cag::new, boj.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bnu<cca> ar = a("mule", bnu.a.a(cca::new, boj.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bnu<cah> as = a("ocelot", bnu.a.a(cah::new, boj.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bnu<cdn> at = a("painting", bnu.a.<cdn>a(cdn::new, boj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bnu<cai> au = a("panda", bnu.a.a(cai::new, boj.b).a(1.3F, 1.25F).a(10));
   public static final bnu<caj> av = a("parrot", bnu.a.a(caj::new, boj.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bnu<cep> aw = a("phantom", bnu.a.a(cep::new, boj.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bnu<cak> ax = a("pig", bnu.a.a(cak::new, boj.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bnu<cfx> ay = a("piglin", bnu.a.a(cfx::new, boj.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bnu<cga> az = a("piglin_brute", bnu.a.a(cga::new, boj.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bnu<ceq> aA = a("pillager", bnu.a.a(ceq::new, boj.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnu<cal> aB = a("polar_bear", bnu.a.a(cal::new, boj.b).a(cyq.qP).a(1.4F, 1.4F).a(10));
   public static final bnu<cil> aC = a("potion", bnu.a.<cil>a(cil::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<cam> aD = a("pufferfish", bnu.a.a(cam::new, boj.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bnu<can> aE = a("rabbit", bnu.a.a(can::new, boj.b).a(0.4F, 0.5F).a(8));
   public static final bnu<ces> aF = a("ravager", bnu.a.a(ces::new, boj.a).a(1.95F, 2.2F).a(new ens(0.0, 2.2625, -0.0625)).a(10));
   public static final bnu<cao> aG = a("salmon", bnu.a.a(cao::new, boj.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bnu<cap> aH = a("sheep", bnu.a.a(cap::new, boj.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bnu<cet> aI = a("shulker", bnu.a.a(cet::new, boj.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bnu<cic> aJ = a("shulker_bullet", bnu.a.<cic>a(cic::new, boj.h).a(0.3125F, 0.3125F).a(8));
   public static final bnu<ceu> aK = a("silverfish", bnu.a.a(ceu::new, boj.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bnu<cev> aL = a("skeleton", bnu.a.a(cev::new, boj.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bnu<ccb> aM = a("skeleton_horse", bnu.a.a(ccb::new, boj.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bnu<cew> aN = a("slime", bnu.a.a(cew::new, boj.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bnu<cid> aO = a("small_fireball", bnu.a.<cid>a(cid::new, boj.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bnu<cci> aP = a("sniffer", bnu.a.a(cci::new, boj.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bnu<car> aQ = a("snow_golem", bnu.a.a(car::new, boj.h).a(cyq.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bnu<cie> aR = a("snowball", bnu.a.<cie>a(cie::new, boj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bnu<cjl> aS = a("spawner_minecart", bnu.a.<cjl>a(cjl::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<cif> aT = a("spectral_arrow", bnu.a.<cif>a(cif::new, boj.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bnu<cey> aU = a("spider", bnu.a.a(cey::new, boj.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bnu<cas> aV = a("squid", bnu.a.a(cas::new, boj.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bnu<cez> aW = a("stray", bnu.a.a(cez::new, boj.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(cyq.qP).a(8));
   public static final bnu<cfa> aX = a("strider", bnu.a.a(cfa::new, boj.b).c().a(0.9F, 1.7F).a(10));
   public static final bnu<cbo> aY = a("tadpole", bnu.a.a(cbo::new, boj.b).a(cbo.c, cbo.d).a(cbo.d * 0.65F).a(10));
   public static final bnu<bnn.l> aZ = a("text_display", bnu.a.a(bnn.l::new, boj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bnu<cdt> ba = a("tnt", bnu.a.<cdt>a(cdt::new, boj.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bnu<cjm> bb = a("tnt_minecart", bnu.a.<cjm>a(cjm::new, boj.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bnu<ccd> bc = a("trader_llama", bnu.a.a(ccd::new, boj.b).a(0.9F, 1.87F).a(1.7765F).a(new ens(0.0, 1.37, -0.3)).a(10));
   public static final bnu<cim> bd = a("trident", bnu.a.<cim>a(cim::new, boj.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bnu<cat> be = a("tropical_fish", bnu.a.a(cat::new, boj.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bnu<cau> bf = a("turtle", bnu.a.a(cau::new, boj.b).a(1.2F, 0.4F).a(new ens(0.0, 0.55625, -0.25)).a(10));
   public static final bnu<cfb> bg = a("vex", bnu.a.a(cfb::new, boj.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bnu<cgu> bh = a("villager", bnu.a.<cgu>a(cgu::new, boj.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bnu<cfc> bi = a("vindicator", bnu.a.a(cfc::new, boj.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bnu<cha> bj = a("wandering_trader", bnu.a.a(cha::new, boj.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bnu<cgl> bk = a("warden", bnu.a.a(cgl::new, boj.a).a(0.9F, 2.9F).a(3.15F).a(bnp.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bnu<cin> bl = a("wind_charge", bnu.a.<cin>a(cin::new, boj.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cju.c));
   public static final bnu<cfd> bm = a("witch", bnu.a.a(cfd::new, boj.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bnu<cdg> bn = a("wither", bnu.a.a(cdg::new, boj.a).c().a(cyq.cd).a(0.9F, 3.5F).a(10));
   public static final bnu<cfe> bo = a("wither_skeleton", bnu.a.a(cfe::new, boj.a).c().a(cyq.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bnu<cio> bp = a("wither_skull", bnu.a.<cio>a(cio::new, boj.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bnu<caw> bq = a("wolf", bnu.a.a(caw::new, boj.b).a(0.6F, 0.85F).a(0.68F).a(new ens(0.0, 0.81875, -0.0625)).a(10));
   public static final bnu<cff> br = a("zoglin", bnu.a.a(cff::new, boj.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bnu<cfg> bs = a("zombie", bnu.a.<cfg>a(cfg::new, boj.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bnu<ccf> bt = a("zombie_horse", bnu.a.a(ccf::new, boj.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bnu<cfh> bu = a("zombie_villager", bnu.a.a(cfh::new, boj.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bnu<cfi> bv = a("zombified_piglin", bnu.a.a(cfi::new, boj.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bnu<chh> bw = a("player", bnu.a.<chh>a(boj.h).b().a().a(0.6F, 1.8F).a(1.62F).a(chh.bO).a(32).b(2));
   public static final bnu<chv> bx = a("fishing_bobber", bnu.a.<chv>a(chv::new, boj.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bnu.b<T> bD;
   private final boj bE;
   private final ImmutableSet<cyo> bF;
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
   private final bnr bP;
   private final cjs bQ;

   private static <T extends bno> bnu<T> a(String $$0, bnu.a<T> $$1) {
      return iv.a(kf.g, $$0, $$1.a($$0));
   }

   public static aiy a(bnu<?> $$0) {
      return kf.g.b($$0);
   }

   public static Optional<bnu<?>> a(String $$0) {
      return kf.g.b(aiy.a($$0));
   }

   public bnu(bnu.b<T> $$0, boj $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cyo> $$6, bnr $$7, int $$8, int $$9, cjs $$10) {
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
   public T a(aov $$0, @Nullable coz $$1, @Nullable chh $$2, hz $$3, bok $$4, boolean $$5, boolean $$6) {
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

   public static <T extends bno> Consumer<T> a(aov $$0, coz $$1, @Nullable chh $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bno> Consumer<T> a(Consumer<T> $$0, aov $$1, coz $$2, @Nullable chh $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bno> Consumer<T> a(Consumer<T> $$0, coz $$1) {
      return $$1.B() ? $$0.andThen($$1x -> $$1x.b($$1.z())) : $$0;
   }

   public static <T extends bno> Consumer<T> b(Consumer<T> $$0, aov $$1, coz $$2, @Nullable chh $$3) {
      sw $$4 = $$2.w();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aov $$0, hz $$1, bok $$2) {
      return this.a($$0, (sw)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aov $$0, @Nullable sw $$1, @Nullable Consumer<T> $$2, hz $$3, bok $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(aov $$0, @Nullable sw $$1, @Nullable Consumer<T> $$2, hz $$3, bok $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cvn)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, awh.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof boi $$10) {
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

   protected static double a(cvq $$0, hz $$1, boolean $$2, enn $$3) {
      enn $$4 = new enn($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eol> $$5 = $$0.d(null, $$4);
      return 1.0 + eoi.a(ie.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cvn $$0, @Nullable chh $$1, @Nullable bno $$2, @Nullable sw $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ae().f($$1.fS())) {
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

   public boj f() {
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
   public cjs m() {
      return this.bQ;
   }

   @Nullable
   public T a(cvn $$0) {
      return !this.a($$0.I()) ? null : this.bD.create(this, $$0);
   }

   public static Optional<bno> a(sw $$0, cvn $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bz.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public enn a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new enn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dlf $$0) {
      if (this.bF.contains($$0.b())) {
         return false;
      } else {
         return !this.bI && ehj.a($$0) ? true : $$0.a(cyq.cd) || $$0.a(cyq.oi) || $$0.a(cyq.dQ) || $$0.a(cyq.qP);
      }
   }

   public bnr n() {
      return this.bP;
   }

   public static Optional<bnu<?>> a(sw $$0) {
      return kf.g.b(new aiy($$0.l("id")));
   }

   @Nullable
   public static bno a(sw $$0, cvn $$1, Function<bno, bno> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            tc $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bno $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bno)$$3;
      }).orElse(null);
   }

   public static Stream<bno> a(final List<? extends tt> $$0, final cvn $$1) {
      final Spliterator<? extends tt> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bno>() {
         @Override
         public boolean tryAdvance(Consumer<? super bno> $$0x) {
            return $$2.tryAdvance($$2xx -> bnu.a((sw)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bno> trySplit() {
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

   private static Optional<bno> b(sw $$0, cvn $$1) {
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

   public boolean a(auo<bnu<?>> $$0) {
      return this.bA.a($$0);
   }

   public boolean a(in<bnu<?>> $$0) {
      return $$0.a(this.bA);
   }

   @Nullable
   public T a(bno $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bno> a() {
      return bno.class;
   }

   @Deprecated
   public ij.c<bnu<?>> r() {
      return this.bA;
   }

   public static class a<T extends bno> {
      private final bnu.b<T> a;
      private final boj b;
      private ImmutableSet<cyo> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bnr j = bnr.b(0.6F, 1.8F);
      private bnq.a k = bnq.a();
      private cjs l = cju.g;

      private a(bnu.b<T> $$0, boj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == boj.b || $$1 == boj.h;
      }

      public static <T extends bno> bnu.a<T> a(bnu.b<T> $$0, boj $$1) {
         return new bnu.a<>($$0, $$1);
      }

      public static <T extends bno> bnu.a<T> a(boj $$0) {
         return new bnu.a<>(($$0x, $$1) -> null, $$0);
      }

      public bnu.a<T> a(float $$0, float $$1) {
         this.j = bnr.b($$0, $$1);
         return this;
      }

      public bnu.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bnu.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bnp.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bnu.a<T> a(ens... $$0) {
         for (ens $$1 : $$0) {
            this.k = this.k.a(bnp.a, $$1);
         }

         return this;
      }

      public bnu.a<T> a(ens $$0) {
         return this.a(bnp.b, $$0);
      }

      public bnu.a<T> b(float $$0) {
         return this.a(bnp.b, 0.0F, -$$0, 0.0F);
      }

      public bnu.a<T> c(float $$0) {
         return this.a(bnp.c, 0.0F, $$0, 0.0F);
      }

      public bnu.a<T> a(bnp $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bnu.a<T> a(bnp $$0, ens $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bnu.a<T> a() {
         this.e = false;
         return this;
      }

      public bnu.a<T> b() {
         this.d = false;
         return this;
      }

      public bnu.a<T> c() {
         this.f = true;
         return this;
      }

      public bnu.a<T> a(cyo... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bnu.a<T> d() {
         this.g = true;
         return this;
      }

      public bnu.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bnu.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bnu.a<T> a(cjq... $$0) {
         this.l = cju.e.a($$0);
         return this;
      }

      public bnu<T> a(String $$0) {
         if (this.d) {
            ac.a(bdn.x, $$0);
         }

         return new bnu<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bno> {
      T create(bnu<T> var1, cvn var2);
   }
}
