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

public class bpc<T extends bow> implements clc, drb<bow, T> {
   private static final Logger bA = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final il.c<bpc<?>> bB = ki.g.f(this);
   private static final float bC = 1.3964844F;
   private static final int bD = 10;
   public static final bpc<cch> b = a("allay", bpc.a.a(cch::new, bpr.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bpc<bot> c = a("area_effect_cloud", bpc.a.<bot>a(bot::new, bpr.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bpc<cck> d = a("armadillo", bpc.a.a(cck::new, bpr.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bpc<cet> e = a("armor_stand", bpc.a.<cet>a(cet::new, bpr.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bpc<cja> f = a("arrow", bpc.a.<cja>a(cja::new, bpr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bpc<ccn> g = a("axolotl", bpc.a.a(ccn::new, bpr.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bpc<cay> h = a("bat", bpc.a.a(cay::new, bpr.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bpc<cbe> i = a("bee", bpc.a.a(cbe::new, bpr.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bpc<cfi> j = a("blaze", bpc.a.a(cfi::new, bpr.a).c().a(0.6F, 1.8F).a(8));
   public static final bpc<bov.b> k = a("block_display", bpc.a.a(bov.b::new, bpr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bpc<ckp> l = a("boat", bpc.a.<ckp>a(ckp::new, bpr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bpc<cgu> m = a("breeze", bpc.a.a(cgu::new, bpr.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(clh.c));
   public static final bpc<ckb> n = a("breeze_wind_charge", bpc.a.<ckb>a(ckb::new, bpr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(clh.c));
   public static final bpc<ccs> o = a("camel", bpc.a.a(ccs::new, bpr.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bpc<cbg> p = a("cat", bpc.a.a(cbg::new, bpr.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bpc<cfj> q = a("cave_spider", bpc.a.a(cfj::new, bpr.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bpc<ckq> r = a("chest_boat", bpc.a.<ckq>a(ckq::new, bpr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bpc<cku> s = a("chest_minecart", bpc.a.<cku>a(cku::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cbi> t = a("chicken", bpc.a.a(cbi::new, bpr.b).a(0.4F, 0.7F).a(0.644F).a(new epr(0.0, 0.7, -0.1)).a(10));
   public static final bpc<cbj> u = a("cod", bpc.a.a(cbj::new, bpr.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bpc<ckv> v = a("command_block_minecart", bpc.a.<ckv>a(ckv::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cbk> w = a("cow", bpc.a.a(cbk::new, bpr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bpc<cfk> x = a("creeper", bpc.a.a(cfk::new, bpr.a).a(0.6F, 1.7F).a(8));
   public static final bpc<cbl> y = a("dolphin", bpc.a.a(cbl::new, bpr.f).a(0.9F, 0.6F).a(0.3F));
   public static final bpc<cdg> z = a("donkey", bpc.a.a(cdg::new, bpr.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bpc<cjb> A = a("dragon_fireball", bpc.a.<cjb>a(cjb::new, bpr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bpc<cfm> B = a("drowned", bpc.a.a(cfm::new, bpr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bpc<cjt> C = a("egg", bpc.a.<cjt>a(cjt::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<cfn> D = a("elder_guardian", bpc.a.a(cfn::new, bpr.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bpc<cdw> E = a("end_crystal", bpc.a.<cdw>a(cdw::new, bpr.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bpc<cdx> F = a("ender_dragon", bpc.a.a(cdx::new, bpr.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bpc<cju> G = a("ender_pearl", bpc.a.<cju>a(cju::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<cfo> H = a("enderman", bpc.a.a(cfo::new, bpr.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bpc<cfp> I = a("endermite", bpc.a.a(cfp::new, bpr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bpc<cfr> J = a("evoker", bpc.a.a(cfr::new, bpr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpc<cjc> K = a("evoker_fangs", bpc.a.<cjc>a(cjc::new, bpr.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bpc<cjv> L = a("experience_bottle", bpc.a.<cjv>a(cjv::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<bpe> M = a("experience_orb", bpc.a.<bpe>a(bpe::new, bpr.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bpc<cjd> N = a("eye_of_ender", bpc.a.<cjd>a(cjd::new, bpr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bpc<cfc> O = a("falling_block", bpc.a.<cfc>a(cfc::new, bpr.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bpc<cjf> P = a("firework_rocket", bpc.a.<cjf>a(cjf::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<cbn> Q = a("fox", bpc.a.a(cbn::new, bpr.b).a(0.6F, 0.7F).a(0.4F).a(new epr(0.0, 0.6375, -0.25)).a(8).a(dac.oi));
   public static final bpc<ccv> R = a("frog", bpc.a.a(ccv::new, bpr.b).a(0.5F, 0.5F).a(new epr(0.0, 0.375, -0.25)).a(10));
   public static final bpc<ckw> S = a("furnace_minecart", bpc.a.<ckw>a(ckw::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cfs> T = a("ghast", bpc.a.a(cfs::new, bpr.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bpc<cft> U = a("giant", bpc.a.a(cft::new, bpr.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bpc<ceu> V = a("glow_item_frame", bpc.a.<ceu>a(ceu::new, bpr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bpc<bpg> W = a("glow_squid", bpc.a.a(bpg::new, bpr.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bpc<cdb> X = a("goat", bpc.a.a(cdb::new, bpr.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bpc<cfu> Y = a("guardian", bpc.a.a(cfu::new, bpr.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bpc<chc> Z = a("hoglin", bpc.a.a(chc::new, bpr.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bpc<ckx> aa = a("hopper_minecart", bpc.a.<ckx>a(ckx::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cdh> ab = a("horse", bpc.a.a(cdh::new, bpr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bpc<cfv> ac = a("husk", bpc.a.a(cfv::new, bpr.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bpc<cfw> ad = a("illusioner", bpc.a.a(cfw::new, bpr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpc<bpj> ae = a("interaction", bpc.a.a(bpj::new, bpr.h).a(0.0F, 0.0F).a(10));
   public static final bpc<cbp> af = a("iron_golem", bpc.a.a(cbp::new, bpr.h).a(1.4F, 2.7F).a(10));
   public static final bpc<cfd> ag = a("item", bpc.a.<cfd>a(cfd::new, bpr.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bpc<bov.g> ah = a("item_display", bpc.a.a(bov.g::new, bpr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bpc<cew> ai = a("item_frame", bpc.a.<cew>a(cew::new, bpr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bpc<cji> aj = a("fireball", bpc.a.<cji>a(cji::new, bpr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bpc<cex> ak = a("leash_knot", bpc.a.<cex>a(cex::new, bpr.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bpc<bpn> al = a("lightning_bolt", bpc.a.a(bpn::new, bpr.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bpc<cdi> am = a("llama", bpc.a.a(cdi::new, bpr.b).a(0.9F, 1.87F).a(1.7765F).a(new epr(0.0, 1.37, -0.3)).a(10));
   public static final bpc<cjj> an = a("llama_spit", bpc.a.<cjj>a(cjj::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<cfx> ao = a("magma_cube", bpc.a.a(cfx::new, bpr.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bpc<bpp> ap = a("marker", bpc.a.a(bpp::new, bpr.h).a(0.0F, 0.0F).a(0));
   public static final bpc<ckt> aq = a("minecart", bpc.a.<ckt>a(ckt::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cbq> ar = a("mooshroom", bpc.a.a(cbq::new, bpr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bpc<cdk> as = a("mule", bpc.a.a(cdk::new, bpr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bpc<cbr> at = a("ocelot", bpc.a.a(cbr::new, bpr.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bpc<cey> au = a("painting", bpc.a.<cey>a(cey::new, bpr.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bpc<cbs> av = a("panda", bpc.a.a(cbs::new, bpr.b).a(1.3F, 1.25F).a(10));
   public static final bpc<cbt> aw = a("parrot", bpc.a.a(cbt::new, bpr.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bpc<cga> ax = a("phantom", bpc.a.a(cga::new, bpr.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bpc<cbu> ay = a("pig", bpc.a.a(cbu::new, bpr.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bpc<chi> az = a("piglin", bpc.a.a(chi::new, bpr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bpc<chl> aA = a("piglin_brute", bpc.a.a(chl::new, bpr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bpc<cgb> aB = a("pillager", bpc.a.a(cgb::new, bpr.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpc<cbv> aC = a("polar_bear", bpc.a.a(cbv::new, bpr.b).a(dac.qP).a(1.4F, 1.4F).a(10));
   public static final bpc<cjw> aD = a("potion", bpc.a.<cjw>a(cjw::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<cbw> aE = a("pufferfish", bpc.a.a(cbw::new, bpr.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bpc<cbx> aF = a("rabbit", bpc.a.a(cbx::new, bpr.b).a(0.4F, 0.5F).a(8));
   public static final bpc<cgd> aG = a("ravager", bpc.a.a(cgd::new, bpr.a).a(1.95F, 2.2F).a(new epr(0.0, 2.2625, -0.0625)).a(10));
   public static final bpc<cby> aH = a("salmon", bpc.a.a(cby::new, bpr.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bpc<cbz> aI = a("sheep", bpc.a.a(cbz::new, bpr.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bpc<cge> aJ = a("shulker", bpc.a.a(cge::new, bpr.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bpc<cjn> aK = a("shulker_bullet", bpc.a.<cjn>a(cjn::new, bpr.h).a(0.3125F, 0.3125F).a(8));
   public static final bpc<cgf> aL = a("silverfish", bpc.a.a(cgf::new, bpr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bpc<cgg> aM = a("skeleton", bpc.a.a(cgg::new, bpr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bpc<cdl> aN = a("skeleton_horse", bpc.a.a(cdl::new, bpr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bpc<cgh> aO = a("slime", bpc.a.a(cgh::new, bpr.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bpc<cjo> aP = a("small_fireball", bpc.a.<cjo>a(cjo::new, bpr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bpc<cds> aQ = a("sniffer", bpc.a.a(cds::new, bpr.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bpc<ccb> aR = a("snow_golem", bpc.a.a(ccb::new, bpr.h).a(dac.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bpc<cjp> aS = a("snowball", bpc.a.<cjp>a(cjp::new, bpr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpc<cky> aT = a("spawner_minecart", bpc.a.<cky>a(cky::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cjq> aU = a("spectral_arrow", bpc.a.<cjq>a(cjq::new, bpr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bpc<cgj> aV = a("spider", bpc.a.a(cgj::new, bpr.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bpc<ccc> aW = a("squid", bpc.a.a(ccc::new, bpr.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bpc<cgk> aX = a("stray", bpc.a.a(cgk::new, bpr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(dac.qP).a(8));
   public static final bpc<cgl> aY = a("strider", bpc.a.a(cgl::new, bpr.b).c().a(0.9F, 1.7F).a(10));
   public static final bpc<ccy> aZ = a("tadpole", bpc.a.a(ccy::new, bpr.b).a(ccy.c, ccy.d).a(ccy.d * 0.65F).a(10));
   public static final bpc<bov.l> ba = a("text_display", bpc.a.a(bov.l::new, bpr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bpc<cfe> bb = a("tnt", bpc.a.<cfe>a(cfe::new, bpr.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bpc<ckz> bc = a("tnt_minecart", bpc.a.<ckz>a(ckz::new, bpr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpc<cdn> bd = a("trader_llama", bpc.a.a(cdn::new, bpr.b).a(0.9F, 1.87F).a(1.7765F).a(new epr(0.0, 1.37, -0.3)).a(10));
   public static final bpc<cjx> be = a("trident", bpc.a.<cjx>a(cjx::new, bpr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bpc<ccd> bf = a("tropical_fish", bpc.a.a(ccd::new, bpr.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bpc<cce> bg = a("turtle", bpc.a.a(cce::new, bpr.b).a(1.2F, 0.4F).a(new epr(0.0, 0.55625, -0.25)).a(10));
   public static final bpc<cgm> bh = a("vex", bpc.a.a(cgm::new, bpr.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bpc<cif> bi = a("villager", bpc.a.<cif>a(cif::new, bpr.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bpc<cgn> bj = a("vindicator", bpc.a.a(cgn::new, bpr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpc<cil> bk = a("wandering_trader", bpc.a.a(cil::new, bpr.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bpc<chw> bl = a("warden", bpc.a.a(chw::new, bpr.a).a(0.9F, 2.9F).a(3.15F).a(box.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bpc<ckc> bm = a("wind_charge", bpc.a.<ckc>a(ckc::new, bpr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(clh.c));
   public static final bpc<cgo> bn = a("witch", bpc.a.a(cgo::new, bpr.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bpc<cer> bo = a("wither", bpc.a.a(cer::new, bpr.a).c().a(dac.cd).a(0.9F, 3.5F).a(10));
   public static final bpc<cgp> bp = a("wither_skeleton", bpc.a.a(cgp::new, bpr.a).c().a(dac.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bpc<cjy> bq = a("wither_skull", bpc.a.<cjy>a(cjy::new, bpr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bpc<ccg> br = a("wolf", bpc.a.a(ccg::new, bpr.b).a(0.6F, 0.85F).a(0.68F).a(new epr(0.0, 0.81875, -0.0625)).a(10));
   public static final bpc<cgq> bs = a("zoglin", bpc.a.a(cgq::new, bpr.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bpc<cgr> bt = a("zombie", bpc.a.<cgr>a(cgr::new, bpr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bpc<cdp> bu = a("zombie_horse", bpc.a.a(cdp::new, bpr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bpc<cgs> bv = a("zombie_villager", bpc.a.a(cgs::new, bpr.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bpc<cgt> bw = a("zombified_piglin", bpc.a.a(cgt::new, bpr.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bpc<cis> bx = a("player", bpc.a.<cis>a(bpr.h).b().a().a(0.6F, 1.8F).a(1.62F).a(cis.bR).a(32).b(2));
   public static final bpc<cjg> by = a("fishing_bobber", bpc.a.<cjg>a(cjg::new, bpr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bpc.b<T> bE;
   private final bpr bF;
   private final ImmutableSet<daa> bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final int bL;
   private final int bM;
   @Nullable
   private String bN;
   @Nullable
   private vu bO;
   @Nullable
   private ajh bP;
   private final boz bQ;
   private final clf bR;

   private static <T extends bow> bpc<T> a(String $$0, bpc.a<T> $$1) {
      return iy.a(ki.g, $$0, $$1.a($$0));
   }

   public static ajh a(bpc<?> $$0) {
      return ki.g.b($$0);
   }

   public static Optional<bpc<?>> a(String $$0) {
      return ki.g.b(ajh.a($$0));
   }

   public bpc(bpc.b<T> $$0, bpr $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<daa> $$6, boz $$7, int $$8, int $$9, clf $$10) {
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
   public T a(apf $$0, @Nullable cqk $$1, @Nullable cis $$2, ib $$3, bps $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bow> Consumer<T> a(apf $$0, cqk $$1, @Nullable cis $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bow> Consumer<T> a(Consumer<T> $$0, apf $$1, cqk $$2, @Nullable cis $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bow> Consumer<T> a(Consumer<T> $$0, cqk $$1) {
      return $$1.B() ? $$0.andThen($$1x -> $$1x.b($$1.z())) : $$0;
   }

   public static <T extends bow> Consumer<T> b(Consumer<T> $$0, apf $$1, cqk $$2, @Nullable cis $$3) {
      ta $$4 = $$2.w();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(apf $$0, ib $$1, bps $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(apf $$0, @Nullable Consumer<T> $$1, ib $$2, bps $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(apf $$0, @Nullable Consumer<T> $$1, ib $$2, bps $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((cwz)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, aww.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bpq $$9) {
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

   protected static double a(cxc $$0, ib $$1, boolean $$2, epm $$3) {
      epm $$4 = new epm($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eqk> $$5 = $$0.d(null, $$4);
      return 1.0 + eqh.a(ih.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cwz $$0, @Nullable cis $$1, @Nullable bow $$2, @Nullable ta $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ah().f($$1.fY())) {
               ta $$5 = $$2.f(new ta());
               UUID $$6 = $$2.cw();
               $$5.a($$3.p("EntityTag"));
               $$2.a_($$6);
               $$2.g($$5);
            }
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

   public bpr f() {
      return this.bF;
   }

   public String g() {
      if (this.bN == null) {
         this.bN = ac.a("entity", ki.g.b(this));
      }

      return this.bN;
   }

   public vu h() {
      if (this.bO == null) {
         this.bO = vu.c(this.g());
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

   public ajh j() {
      if (this.bP == null) {
         ajh $$0 = ki.g.b(this);
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
   public clf m() {
      return this.bR;
   }

   @Nullable
   public T a(cwz $$0) {
      return !this.a($$0.I()) ? null : this.bE.create(this, $$0);
   }

   public static Optional<bow> a(ta $$0, cwz $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bA.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public epm a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new epm($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dmz $$0) {
      if (this.bG.contains($$0.b())) {
         return false;
      } else {
         return !this.bJ && ejh.a($$0) ? true : $$0.a(dac.cd) || $$0.a(dac.oi) || $$0.a(dac.dQ) || $$0.a(dac.qP);
      }
   }

   public boz n() {
      return this.bQ;
   }

   public static Optional<bpc<?>> a(ta $$0) {
      return ki.g.b(new ajh($$0.l("id")));
   }

   @Nullable
   public static bow a(ta $$0, cwz $$1, Function<bow, bow> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            tg $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bow $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bow)$$3;
      }).orElse(null);
   }

   public static Stream<bow> a(final List<? extends tx> $$0, final cwz $$1) {
      final Spliterator<? extends tx> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bow>() {
         @Override
         public boolean tryAdvance(Consumer<? super bow> $$0x) {
            return $$2.tryAdvance($$2xx -> bpc.a((ta)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bow> trySplit() {
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

   private static Optional<bow> b(ta $$0, cwz $$1) {
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
      return this != bx && this != an && this != bo && this != h && this != ai && this != V && this != ak && this != au && this != E && this != K;
   }

   public boolean a(avd<bpc<?>> $$0) {
      return this.bB.a($$0);
   }

   public boolean a(ip<bpc<?>> $$0) {
      return $$0.a(this.bB);
   }

   @Nullable
   public T a(bow $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bow> a() {
      return bow.class;
   }

   @Deprecated
   public il.c<bpc<?>> r() {
      return this.bB;
   }

   public static class a<T extends bow> {
      private final bpc.b<T> a;
      private final bpr b;
      private ImmutableSet<daa> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private boz j = boz.b(0.6F, 1.8F);
      private boy.a k = boy.a();
      private clf l = clh.g;

      private a(bpc.b<T> $$0, bpr $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bpr.b || $$1 == bpr.h;
      }

      public static <T extends bow> bpc.a<T> a(bpc.b<T> $$0, bpr $$1) {
         return new bpc.a<>($$0, $$1);
      }

      public static <T extends bow> bpc.a<T> a(bpr $$0) {
         return new bpc.a<>(($$0x, $$1) -> null, $$0);
      }

      public bpc.a<T> a(float $$0, float $$1) {
         this.j = boz.b($$0, $$1);
         return this;
      }

      public bpc.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bpc.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(box.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bpc.a<T> a(epr... $$0) {
         for (epr $$1 : $$0) {
            this.k = this.k.a(box.a, $$1);
         }

         return this;
      }

      public bpc.a<T> a(epr $$0) {
         return this.a(box.b, $$0);
      }

      public bpc.a<T> b(float $$0) {
         return this.a(box.b, 0.0F, -$$0, 0.0F);
      }

      public bpc.a<T> c(float $$0) {
         return this.a(box.c, 0.0F, $$0, 0.0F);
      }

      public bpc.a<T> a(box $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bpc.a<T> a(box $$0, epr $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bpc.a<T> a() {
         this.e = false;
         return this;
      }

      public bpc.a<T> b() {
         this.d = false;
         return this;
      }

      public bpc.a<T> c() {
         this.f = true;
         return this;
      }

      public bpc.a<T> a(daa... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bpc.a<T> d() {
         this.g = true;
         return this;
      }

      public bpc.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bpc.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bpc.a<T> a(cld... $$0) {
         this.l = clh.e.a($$0);
         return this;
      }

      public bpc<T> a(String $$0) {
         if (this.d) {
            ac.a(beh.x, $$0);
         }

         return new bpc<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bow> {
      T create(bpc<T> var1, cwz var2);
   }
}
