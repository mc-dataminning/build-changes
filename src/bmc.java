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

public class bmc<T extends blw> implements chx, dnn<blw, T> {
   private static final Logger bz = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ih.c<bmc<?>> bA = kd.g.f(this);
   private static final float bB = 1.3964844F;
   private static final int bC = 10;
   public static final bmc<bzg> b = a("allay", bmc.a.a(bzg::new, bmr.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bmc<blt> c = a("area_effect_cloud", bmc.a.<blt>a(blt::new, bmr.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bmc<bzj> d = a("armadillo", bmc.a.a(bzj::new, bmr.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bmc<cbr> e = a("armor_stand", bmc.a.<cbr>a(cbr::new, bmr.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bmc<cfy> f = a("arrow", bmc.a.<cfy>a(cfy::new, bmr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bmc<bzm> g = a("axolotl", bmc.a.a(bzm::new, bmr.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bmc<bxx> h = a("bat", bmc.a.a(bxx::new, bmr.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bmc<byd> i = a("bee", bmc.a.a(byd::new, bmr.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bmc<ccg> j = a("blaze", bmc.a.a(ccg::new, bmr.a).c().a(0.6F, 1.8F).a(8));
   public static final bmc<blv.b> k = a("block_display", bmc.a.a(blv.b::new, bmr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bmc<chk> l = a("boat", bmc.a.<chk>a(chk::new, bmr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bmc<cds> m = a("breeze", bmc.a.a(cds::new, bmr.a).a(0.6F, 1.7F).a(10).a(cic.c));
   public static final bmc<bzr> n = a("camel", bmc.a.a(bzr::new, bmr.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bmc<byf> o = a("cat", bmc.a.a(byf::new, bmr.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bmc<cch> p = a("cave_spider", bmc.a.a(cch::new, bmr.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bmc<chl> q = a("chest_boat", bmc.a.<chl>a(chl::new, bmr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bmc<chp> r = a("chest_minecart", bmc.a.<chp>a(chp::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<byh> s = a("chicken", bmc.a.a(byh::new, bmr.b).a(0.4F, 0.7F).a(0.644F).a(new emc(0.0, 0.7, -0.1)).a(10));
   public static final bmc<byi> t = a("cod", bmc.a.a(byi::new, bmr.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bmc<chq> u = a("command_block_minecart", bmc.a.<chq>a(chq::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<byj> v = a("cow", bmc.a.a(byj::new, bmr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bmc<cci> w = a("creeper", bmc.a.a(cci::new, bmr.a).a(0.6F, 1.7F).a(8));
   public static final bmc<byk> x = a("dolphin", bmc.a.a(byk::new, bmr.f).a(0.9F, 0.6F).a(0.3F));
   public static final bmc<caf> y = a("donkey", bmc.a.a(caf::new, bmr.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bmc<cfz> z = a("dragon_fireball", bmc.a.<cfz>a(cfz::new, bmr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bmc<cck> A = a("drowned", bmc.a.a(cck::new, bmr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bmc<cgq> B = a("egg", bmc.a.<cgq>a(cgq::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<ccl> C = a("elder_guardian", bmc.a.a(ccl::new, bmr.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bmc<cau> D = a("end_crystal", bmc.a.<cau>a(cau::new, bmr.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bmc<cav> E = a("ender_dragon", bmc.a.a(cav::new, bmr.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bmc<cgr> F = a("ender_pearl", bmc.a.<cgr>a(cgr::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<ccm> G = a("enderman", bmc.a.a(ccm::new, bmr.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bmc<ccn> H = a("endermite", bmc.a.a(ccn::new, bmr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bmc<ccp> I = a("evoker", bmc.a.a(ccp::new, bmr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bmc<cga> J = a("evoker_fangs", bmc.a.<cga>a(cga::new, bmr.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bmc<cgs> K = a("experience_bottle", bmc.a.<cgs>a(cgs::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<bme> L = a("experience_orb", bmc.a.<bme>a(bme::new, bmr.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bmc<cgb> M = a("eye_of_ender", bmc.a.<cgb>a(cgb::new, bmr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bmc<cca> N = a("falling_block", bmc.a.<cca>a(cca::new, bmr.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bmc<cgd> O = a("firework_rocket", bmc.a.<cgd>a(cgd::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<bym> P = a("fox", bmc.a.a(bym::new, bmr.b).a(0.6F, 0.7F).a(0.4F).a(new emc(0.0, 0.6375, -0.25)).a(8).a(cxa.oi));
   public static final bmc<bzu> Q = a("frog", bmc.a.a(bzu::new, bmr.b).a(0.5F, 0.5F).a(new emc(0.0, 0.375, -0.25)).a(10));
   public static final bmc<chr> R = a("furnace_minecart", bmc.a.<chr>a(chr::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<ccq> S = a("ghast", bmc.a.a(ccq::new, bmr.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bmc<ccr> T = a("giant", bmc.a.a(ccr::new, bmr.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bmc<cbs> U = a("glow_item_frame", bmc.a.<cbs>a(cbs::new, bmr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bmc<bmg> V = a("glow_squid", bmc.a.a(bmg::new, bmr.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bmc<caa> W = a("goat", bmc.a.a(caa::new, bmr.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bmc<ccs> X = a("guardian", bmc.a.a(ccs::new, bmr.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bmc<cea> Y = a("hoglin", bmc.a.a(cea::new, bmr.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bmc<chs> Z = a("hopper_minecart", bmc.a.<chs>a(chs::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<cag> aa = a("horse", bmc.a.a(cag::new, bmr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bmc<cct> ab = a("husk", bmc.a.a(cct::new, bmr.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bmc<ccu> ac = a("illusioner", bmc.a.a(ccu::new, bmr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bmc<bmj> ad = a("interaction", bmc.a.a(bmj::new, bmr.h).a(0.0F, 0.0F).a(10));
   public static final bmc<byo> ae = a("iron_golem", bmc.a.a(byo::new, bmr.h).a(1.4F, 2.7F).a(10));
   public static final bmc<ccb> af = a("item", bmc.a.<ccb>a(ccb::new, bmr.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bmc<blv.g> ag = a("item_display", bmc.a.a(blv.g::new, bmr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bmc<cbu> ah = a("item_frame", bmc.a.<cbu>a(cbu::new, bmr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bmc<cgg> ai = a("fireball", bmc.a.<cgg>a(cgg::new, bmr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bmc<cbv> aj = a("leash_knot", bmc.a.<cbv>a(cbv::new, bmr.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bmc<bmn> ak = a("lightning_bolt", bmc.a.a(bmn::new, bmr.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bmc<cah> al = a("llama", bmc.a.a(cah::new, bmr.b).a(0.9F, 1.87F).a(1.7765F).a(new emc(0.0, 1.37, -0.3)).a(10));
   public static final bmc<cgh> am = a("llama_spit", bmc.a.<cgh>a(cgh::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<ccv> an = a("magma_cube", bmc.a.a(ccv::new, bmr.a).c().a(2.04F, 2.04F).a(1.275F).a(8));
   public static final bmc<bmp> ao = a("marker", bmc.a.a(bmp::new, bmr.h).a(0.0F, 0.0F).a(0));
   public static final bmc<cho> ap = a("minecart", bmc.a.<cho>a(cho::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<byp> aq = a("mooshroom", bmc.a.a(byp::new, bmr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bmc<caj> ar = a("mule", bmc.a.a(caj::new, bmr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bmc<byq> as = a("ocelot", bmc.a.a(byq::new, bmr.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bmc<cbw> at = a("painting", bmc.a.<cbw>a(cbw::new, bmr.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bmc<byr> au = a("panda", bmc.a.a(byr::new, bmr.b).a(1.3F, 1.25F).a(10));
   public static final bmc<bys> av = a("parrot", bmc.a.a(bys::new, bmr.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bmc<ccy> aw = a("phantom", bmc.a.a(ccy::new, bmr.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bmc<byt> ax = a("pig", bmc.a.a(byt::new, bmr.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bmc<ceg> ay = a("piglin", bmc.a.a(ceg::new, bmr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bmc<cej> az = a("piglin_brute", bmc.a.a(cej::new, bmr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bmc<ccz> aA = a("pillager", bmc.a.a(ccz::new, bmr.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bmc<byu> aB = a("polar_bear", bmc.a.a(byu::new, bmr.b).a(cxa.qP).a(1.4F, 1.4F).a(10));
   public static final bmc<cgt> aC = a("potion", bmc.a.<cgt>a(cgt::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<byv> aD = a("pufferfish", bmc.a.a(byv::new, bmr.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bmc<byw> aE = a("rabbit", bmc.a.a(byw::new, bmr.b).a(0.4F, 0.5F).a(8));
   public static final bmc<cdb> aF = a("ravager", bmc.a.a(cdb::new, bmr.a).a(1.95F, 2.2F).a(new emc(0.0, 2.2625, -0.0625)).a(10));
   public static final bmc<byx> aG = a("salmon", bmc.a.a(byx::new, bmr.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bmc<byy> aH = a("sheep", bmc.a.a(byy::new, bmr.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bmc<cdc> aI = a("shulker", bmc.a.a(cdc::new, bmr.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bmc<cgk> aJ = a("shulker_bullet", bmc.a.<cgk>a(cgk::new, bmr.h).a(0.3125F, 0.3125F).a(8));
   public static final bmc<cdd> aK = a("silverfish", bmc.a.a(cdd::new, bmr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bmc<cde> aL = a("skeleton", bmc.a.a(cde::new, bmr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bmc<cak> aM = a("skeleton_horse", bmc.a.a(cak::new, bmr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bmc<cdf> aN = a("slime", bmc.a.a(cdf::new, bmr.a).a(2.04F, 2.04F).a(1.275F).a(10));
   public static final bmc<cgl> aO = a("small_fireball", bmc.a.<cgl>a(cgl::new, bmr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bmc<car> aP = a("sniffer", bmc.a.a(car::new, bmr.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bmc<bza> aQ = a("snow_golem", bmc.a.a(bza::new, bmr.h).a(cxa.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bmc<cgm> aR = a("snowball", bmc.a.<cgm>a(cgm::new, bmr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bmc<cht> aS = a("spawner_minecart", bmc.a.<cht>a(cht::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<cgn> aT = a("spectral_arrow", bmc.a.<cgn>a(cgn::new, bmr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bmc<cdh> aU = a("spider", bmc.a.a(cdh::new, bmr.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bmc<bzb> aV = a("squid", bmc.a.a(bzb::new, bmr.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bmc<cdi> aW = a("stray", bmc.a.a(cdi::new, bmr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(cxa.qP).a(8));
   public static final bmc<cdj> aX = a("strider", bmc.a.a(cdj::new, bmr.b).c().a(0.9F, 1.7F).a(10));
   public static final bmc<bzx> aY = a("tadpole", bmc.a.a(bzx::new, bmr.b).a(bzx.c, bzx.d).a(bzx.d * 0.65F).a(10));
   public static final bmc<blv.l> aZ = a("text_display", bmc.a.a(blv.l::new, bmr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bmc<ccc> ba = a("tnt", bmc.a.<ccc>a(ccc::new, bmr.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bmc<chu> bb = a("tnt_minecart", bmc.a.<chu>a(chu::new, bmr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bmc<cam> bc = a("trader_llama", bmc.a.a(cam::new, bmr.b).a(0.9F, 1.87F).a(1.7765F).a(new emc(0.0, 1.37, -0.3)).a(10));
   public static final bmc<cgu> bd = a("trident", bmc.a.<cgu>a(cgu::new, bmr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bmc<bzc> be = a("tropical_fish", bmc.a.a(bzc::new, bmr.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bmc<bzd> bf = a("turtle", bmc.a.a(bzd::new, bmr.b).a(1.2F, 0.4F).a(new emc(0.0, 0.55625, -0.25)).a(10));
   public static final bmc<cdk> bg = a("vex", bmc.a.a(cdk::new, bmr.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bmc<cfd> bh = a("villager", bmc.a.<cfd>a(cfd::new, bmr.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bmc<cdl> bi = a("vindicator", bmc.a.a(cdl::new, bmr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bmc<cfj> bj = a("wandering_trader", bmc.a.a(cfj::new, bmr.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bmc<ceu> bk = a("warden", bmc.a.a(ceu::new, bmr.a).a(0.9F, 2.9F).a(3.15F).a(16).c());
   public static final bmc<cgv> bl = a("wind_charge", bmc.a.<cgv>a(cgv::new, bmr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cic.c));
   public static final bmc<cdm> bm = a("witch", bmc.a.a(cdm::new, bmr.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bmc<cbp> bn = a("wither", bmc.a.a(cbp::new, bmr.a).c().a(cxa.cd).a(0.9F, 3.5F).a(10));
   public static final bmc<cdn> bo = a("wither_skeleton", bmc.a.a(cdn::new, bmr.a).c().a(cxa.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bmc<cgw> bp = a("wither_skull", bmc.a.<cgw>a(cgw::new, bmr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bmc<bzf> bq = a("wolf", bmc.a.a(bzf::new, bmr.b).a(0.6F, 0.85F).a(0.68F).a(new emc(0.0, 0.81875, -0.0625)).a(10));
   public static final bmc<cdo> br = a("zoglin", bmc.a.a(cdo::new, bmr.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bmc<cdp> bs = a("zombie", bmc.a.<cdp>a(cdp::new, bmr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bmc<cao> bt = a("zombie_horse", bmc.a.a(cao::new, bmr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bmc<cdq> bu = a("zombie_villager", bmc.a.a(cdq::new, bmr.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bmc<cdr> bv = a("zombified_piglin", bmc.a.a(cdr::new, bmr.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bmc<cfq> bw = a("player", bmc.a.<cfq>a(bmr.h).b().a().a(0.6F, 1.8F).a(1.62F).a(cfq.bO).a(32).b(2));
   public static final bmc<cge> bx = a("fishing_bobber", bmc.a.<cge>a(cge::new, bmr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bmc.b<T> bD;
   private final bmr bE;
   private final ImmutableSet<cwy> bF;
   private final boolean bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final int bK;
   private final int bL;
   @Nullable
   private String bM;
   @Nullable
   private vg bN;
   @Nullable
   private ahh bO;
   private final blz bP;
   private final cia bQ;

   private static <T extends blw> bmc<T> a(String $$0, bmc.a<T> $$1) {
      return it.a(kd.g, $$0, $$1.a($$0));
   }

   public static ahh a(bmc<?> $$0) {
      return kd.g.b($$0);
   }

   public static Optional<bmc<?>> a(String $$0) {
      return kd.g.b(ahh.a($$0));
   }

   public bmc(bmc.b<T> $$0, bmr $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cwy> $$6, blz $$7, int $$8, int $$9, cia $$10) {
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
   public T a(ane $$0, @Nullable cng $$1, @Nullable cfq $$2, hx $$3, bms $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      so $$7;
      if ($$1 != null) {
         $$7 = $$1.v();
         $$8 = a($$0, $$1, $$2);
      } else {
         $$8 = $$0x -> {
         };
         $$7 = null;
      }

      return this.a($$0, $$7, $$8, $$3, $$4, $$5, $$6);
   }

   public static <T extends blw> Consumer<T> a(ane $$0, cng $$1, @Nullable cfq $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends blw> Consumer<T> a(Consumer<T> $$0, ane $$1, cng $$2, @Nullable cfq $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends blw> Consumer<T> a(Consumer<T> $$0, cng $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends blw> Consumer<T> b(Consumer<T> $$0, ane $$1, cng $$2, @Nullable cfq $$3) {
      so $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ane $$0, hx $$1, bms $$2) {
      return this.a($$0, (so)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ane $$0, @Nullable so $$1, @Nullable Consumer<T> $$2, hx $$3, bms $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(ane $$0, @Nullable so $$1, @Nullable Consumer<T> $$2, hx $$3, bms $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((ctx)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, aup.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bmq $$10) {
            $$10.aW = $$10.dB();
            $$10.aU = $$10.dB();
            $$10.a($$0, $$0.d_($$10.dl()), $$4, null, $$1);
            $$10.R();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(cua $$0, hx $$1, boolean $$2, elx $$3) {
      elx $$4 = new elx($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<emv> $$5 = $$0.d(null, $$4);
      return 1.0 + ems.a(ic.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(ctx $$0, @Nullable cfq $$1, @Nullable blw $$2, @Nullable so $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ae().f($$1.fR())) {
               so $$5 = $$2.f(new so());
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

   public bmr f() {
      return this.bE;
   }

   public String g() {
      if (this.bM == null) {
         this.bM = ac.a("entity", kd.g.b(this));
      }

      return this.bM;
   }

   public vg h() {
      if (this.bN == null) {
         this.bN = vg.c(this.g());
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

   public ahh j() {
      if (this.bO == null) {
         ahh $$0 = kd.g.b(this);
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
   public cia m() {
      return this.bQ;
   }

   @Nullable
   public T a(ctx $$0) {
      return !this.a($$0.I()) ? null : this.bD.create(this, $$0);
   }

   public static Optional<blw> a(so $$0, ctx $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bz.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public elx a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new elx($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(djp $$0) {
      if (this.bF.contains($$0.b())) {
         return false;
      } else {
         return !this.bI && eft.a($$0) ? true : $$0.a(cxa.cd) || $$0.a(cxa.oi) || $$0.a(cxa.dQ) || $$0.a(cxa.qP);
      }
   }

   public blz n() {
      return this.bP;
   }

   public static Optional<bmc<?>> a(so $$0) {
      return kd.g.b(new ahh($$0.l("id")));
   }

   @Nullable
   public static blw a(so $$0, ctx $$1, Function<blw, blw> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            su $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               blw $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (blw)$$3;
      }).orElse(null);
   }

   public static Stream<blw> a(final List<? extends tl> $$0, final ctx $$1) {
      final Spliterator<? extends tl> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<blw>() {
         @Override
         public boolean tryAdvance(Consumer<? super blw> $$0x) {
            return $$2.tryAdvance($$2xx -> bmc.a((so)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<blw> trySplit() {
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

   private static Optional<blw> b(so $$0, ctx $$1) {
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

   public boolean a(asx<bmc<?>> $$0) {
      return this.bA.a($$0);
   }

   public boolean a(il<bmc<?>> $$0) {
      return $$0.a(this.bA);
   }

   @Nullable
   public T a(blw $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends blw> a() {
      return blw.class;
   }

   @Deprecated
   public ih.c<bmc<?>> r() {
      return this.bA;
   }

   public static class a<T extends blw> {
      private final bmc.b<T> a;
      private final bmr b;
      private ImmutableSet<cwy> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private blz j = blz.b(0.6F, 1.8F);
      private bly.a k = bly.a();
      private cia l = cic.g;

      private a(bmc.b<T> $$0, bmr $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bmr.b || $$1 == bmr.h;
      }

      public static <T extends blw> bmc.a<T> a(bmc.b<T> $$0, bmr $$1) {
         return new bmc.a<>($$0, $$1);
      }

      public static <T extends blw> bmc.a<T> a(bmr $$0) {
         return new bmc.a<>(($$0x, $$1) -> null, $$0);
      }

      public bmc.a<T> a(float $$0, float $$1) {
         this.j = blz.b($$0, $$1);
         return this;
      }

      public bmc.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bmc.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(blx.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bmc.a<T> a(emc... $$0) {
         for (emc $$1 : $$0) {
            this.k = this.k.a(blx.a, $$1);
         }

         return this;
      }

      public bmc.a<T> a(emc $$0) {
         this.k = this.k.a(blx.b, $$0);
         return this;
      }

      public bmc.a<T> b(float $$0) {
         return this.a(new emc(0.0, (double)(-$$0), 0.0));
      }

      public bmc.a<T> c(float $$0) {
         this.k = this.k.a(blx.c, 0.0F, $$0, 0.0F);
         return this;
      }

      public bmc.a<T> a() {
         this.e = false;
         return this;
      }

      public bmc.a<T> b() {
         this.d = false;
         return this;
      }

      public bmc.a<T> c() {
         this.f = true;
         return this;
      }

      public bmc.a<T> a(cwy... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bmc.a<T> d() {
         this.g = true;
         return this;
      }

      public bmc.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bmc.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bmc.a<T> a(chy... $$0) {
         this.l = cic.e.a($$0);
         return this;
      }

      public bmc<T> a(String $$0) {
         if (this.d) {
            ac.a(bbw.x, $$0);
         }

         return new bmc<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends blw> {
      T create(bmc<T> var1, ctx var2);
   }
}
