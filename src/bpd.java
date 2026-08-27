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

public class bpd<T extends box> implements cle, drd<box, T> {
   private static final Logger bB = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final il.c<bpd<?>> bC = ki.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bpd<cci> b = a("allay", bpd.a.a(cci::new, bps.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bpd<bou> c = a("area_effect_cloud", bpd.a.<bou>a(bou::new, bps.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bpd<ccl> d = a("armadillo", bpd.a.a(ccl::new, bps.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bpd<ceu> e = a("armor_stand", bpd.a.<ceu>a(ceu::new, bps.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bpd<cjc> f = a("arrow", bpd.a.<cjc>a(cjc::new, bps.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bpd<cco> g = a("axolotl", bpd.a.a(cco::new, bps.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bpd<caz> h = a("bat", bpd.a.a(caz::new, bps.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bpd<cbf> i = a("bee", bpd.a.a(cbf::new, bps.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bpd<cfj> j = a("blaze", bpd.a.a(cfj::new, bps.a).c().a(0.6F, 1.8F).a(8));
   public static final bpd<bow.b> k = a("block_display", bpd.a.a(bow.b::new, bps.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bpd<ckr> l = a("boat", bpd.a.<ckr>a(ckr::new, bps.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bpd<cfk> m = a("bogged", bpd.a.a(cfk::new, bps.a).a(0.6F, 1.99F).a(1.74F).a(8).a(clj.c));
   public static final bpd<cgw> n = a("breeze", bpd.a.a(cgw::new, bps.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(clj.c));
   public static final bpd<ckd> o = a("breeze_wind_charge", bpd.a.<ckd>a(ckd::new, bps.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(clj.c));
   public static final bpd<cct> p = a("camel", bpd.a.a(cct::new, bps.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bpd<cbh> q = a("cat", bpd.a.a(cbh::new, bps.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bpd<cfl> r = a("cave_spider", bpd.a.a(cfl::new, bps.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bpd<cks> s = a("chest_boat", bpd.a.<cks>a(cks::new, bps.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bpd<ckw> t = a("chest_minecart", bpd.a.<ckw>a(ckw::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cbj> u = a("chicken", bpd.a.a(cbj::new, bps.b).a(0.4F, 0.7F).a(0.644F).a(new ept(0.0, 0.7, -0.1)).a(10));
   public static final bpd<cbk> v = a("cod", bpd.a.a(cbk::new, bps.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bpd<ckx> w = a("command_block_minecart", bpd.a.<ckx>a(ckx::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cbl> x = a("cow", bpd.a.a(cbl::new, bps.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bpd<cfm> y = a("creeper", bpd.a.a(cfm::new, bps.a).a(0.6F, 1.7F).a(8));
   public static final bpd<cbm> z = a("dolphin", bpd.a.a(cbm::new, bps.f).a(0.9F, 0.6F).a(0.3F));
   public static final bpd<cdh> A = a("donkey", bpd.a.a(cdh::new, bps.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bpd<cjd> B = a("dragon_fireball", bpd.a.<cjd>a(cjd::new, bps.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bpd<cfo> C = a("drowned", bpd.a.a(cfo::new, bps.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bpd<cjv> D = a("egg", bpd.a.<cjv>a(cjv::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<cfp> E = a("elder_guardian", bpd.a.a(cfp::new, bps.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bpd<cdx> F = a("end_crystal", bpd.a.<cdx>a(cdx::new, bps.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bpd<cdy> G = a("ender_dragon", bpd.a.a(cdy::new, bps.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bpd<cjw> H = a("ender_pearl", bpd.a.<cjw>a(cjw::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<cfq> I = a("enderman", bpd.a.a(cfq::new, bps.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bpd<cfr> J = a("endermite", bpd.a.a(cfr::new, bps.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bpd<cft> K = a("evoker", bpd.a.a(cft::new, bps.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpd<cje> L = a("evoker_fangs", bpd.a.<cje>a(cje::new, bps.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bpd<cjx> M = a("experience_bottle", bpd.a.<cjx>a(cjx::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<bpf> N = a("experience_orb", bpd.a.<bpf>a(bpf::new, bps.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bpd<cjf> O = a("eye_of_ender", bpd.a.<cjf>a(cjf::new, bps.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bpd<cfd> P = a("falling_block", bpd.a.<cfd>a(cfd::new, bps.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bpd<cjh> Q = a("firework_rocket", bpd.a.<cjh>a(cjh::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<cbo> R = a("fox", bpd.a.a(cbo::new, bps.b).a(0.6F, 0.7F).a(0.4F).a(new ept(0.0, 0.6375, -0.25)).a(8).a(dae.oi));
   public static final bpd<ccw> S = a("frog", bpd.a.a(ccw::new, bps.b).a(0.5F, 0.5F).a(new ept(0.0, 0.375, -0.25)).a(10));
   public static final bpd<cky> T = a("furnace_minecart", bpd.a.<cky>a(cky::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cfu> U = a("ghast", bpd.a.a(cfu::new, bps.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bpd<cfv> V = a("giant", bpd.a.a(cfv::new, bps.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bpd<cev> W = a("glow_item_frame", bpd.a.<cev>a(cev::new, bps.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bpd<bph> X = a("glow_squid", bpd.a.a(bph::new, bps.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bpd<cdc> Y = a("goat", bpd.a.a(cdc::new, bps.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bpd<cfw> Z = a("guardian", bpd.a.a(cfw::new, bps.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bpd<che> aa = a("hoglin", bpd.a.a(che::new, bps.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bpd<ckz> ab = a("hopper_minecart", bpd.a.<ckz>a(ckz::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cdi> ac = a("horse", bpd.a.a(cdi::new, bps.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bpd<cfx> ad = a("husk", bpd.a.a(cfx::new, bps.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bpd<cfy> ae = a("illusioner", bpd.a.a(cfy::new, bps.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpd<bpk> af = a("interaction", bpd.a.a(bpk::new, bps.h).a(0.0F, 0.0F).a(10));
   public static final bpd<cbq> ag = a("iron_golem", bpd.a.a(cbq::new, bps.h).a(1.4F, 2.7F).a(10));
   public static final bpd<cfe> ah = a("item", bpd.a.<cfe>a(cfe::new, bps.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bpd<bow.g> ai = a("item_display", bpd.a.a(bow.g::new, bps.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bpd<cex> aj = a("item_frame", bpd.a.<cex>a(cex::new, bps.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bpd<cjk> ak = a("fireball", bpd.a.<cjk>a(cjk::new, bps.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bpd<cey> al = a("leash_knot", bpd.a.<cey>a(cey::new, bps.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bpd<bpo> am = a("lightning_bolt", bpd.a.a(bpo::new, bps.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bpd<cdj> an = a("llama", bpd.a.a(cdj::new, bps.b).a(0.9F, 1.87F).a(1.7765F).a(new ept(0.0, 1.37, -0.3)).a(10));
   public static final bpd<cjl> ao = a("llama_spit", bpd.a.<cjl>a(cjl::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<cfz> ap = a("magma_cube", bpd.a.a(cfz::new, bps.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bpd<bpq> aq = a("marker", bpd.a.a(bpq::new, bps.h).a(0.0F, 0.0F).a(0));
   public static final bpd<ckv> ar = a("minecart", bpd.a.<ckv>a(ckv::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cbr> as = a("mooshroom", bpd.a.a(cbr::new, bps.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bpd<cdl> at = a("mule", bpd.a.a(cdl::new, bps.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bpd<cbs> au = a("ocelot", bpd.a.a(cbs::new, bps.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bpd<cez> av = a("painting", bpd.a.<cez>a(cez::new, bps.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bpd<cbt> aw = a("panda", bpd.a.a(cbt::new, bps.b).a(1.3F, 1.25F).a(10));
   public static final bpd<cbu> ax = a("parrot", bpd.a.a(cbu::new, bps.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bpd<cgc> ay = a("phantom", bpd.a.a(cgc::new, bps.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bpd<cbv> az = a("pig", bpd.a.a(cbv::new, bps.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bpd<chk> aA = a("piglin", bpd.a.a(chk::new, bps.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bpd<chn> aB = a("piglin_brute", bpd.a.a(chn::new, bps.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bpd<cgd> aC = a("pillager", bpd.a.a(cgd::new, bps.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpd<cbw> aD = a("polar_bear", bpd.a.a(cbw::new, bps.b).a(dae.qP).a(1.4F, 1.4F).a(10));
   public static final bpd<cjy> aE = a("potion", bpd.a.<cjy>a(cjy::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<cbx> aF = a("pufferfish", bpd.a.a(cbx::new, bps.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bpd<cby> aG = a("rabbit", bpd.a.a(cby::new, bps.b).a(0.4F, 0.5F).a(8));
   public static final bpd<cgf> aH = a("ravager", bpd.a.a(cgf::new, bps.a).a(1.95F, 2.2F).a(new ept(0.0, 2.2625, -0.0625)).a(10));
   public static final bpd<cbz> aI = a("salmon", bpd.a.a(cbz::new, bps.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bpd<cca> aJ = a("sheep", bpd.a.a(cca::new, bps.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bpd<cgg> aK = a("shulker", bpd.a.a(cgg::new, bps.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bpd<cjp> aL = a("shulker_bullet", bpd.a.<cjp>a(cjp::new, bps.h).a(0.3125F, 0.3125F).a(8));
   public static final bpd<cgh> aM = a("silverfish", bpd.a.a(cgh::new, bps.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bpd<cgi> aN = a("skeleton", bpd.a.a(cgi::new, bps.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bpd<cdm> aO = a("skeleton_horse", bpd.a.a(cdm::new, bps.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bpd<cgj> aP = a("slime", bpd.a.a(cgj::new, bps.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bpd<cjq> aQ = a("small_fireball", bpd.a.<cjq>a(cjq::new, bps.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bpd<cdt> aR = a("sniffer", bpd.a.a(cdt::new, bps.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bpd<ccc> aS = a("snow_golem", bpd.a.a(ccc::new, bps.h).a(dae.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bpd<cjr> aT = a("snowball", bpd.a.<cjr>a(cjr::new, bps.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bpd<cla> aU = a("spawner_minecart", bpd.a.<cla>a(cla::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cjs> aV = a("spectral_arrow", bpd.a.<cjs>a(cjs::new, bps.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bpd<cgl> aW = a("spider", bpd.a.a(cgl::new, bps.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bpd<ccd> aX = a("squid", bpd.a.a(ccd::new, bps.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bpd<cgm> aY = a("stray", bpd.a.a(cgm::new, bps.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(dae.qP).a(8));
   public static final bpd<cgn> aZ = a("strider", bpd.a.a(cgn::new, bps.b).c().a(0.9F, 1.7F).a(10));
   public static final bpd<ccz> ba = a("tadpole", bpd.a.a(ccz::new, bps.b).a(ccz.c, ccz.d).a(ccz.d * 0.65F).a(10));
   public static final bpd<bow.l> bb = a("text_display", bpd.a.a(bow.l::new, bps.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bpd<cff> bc = a("tnt", bpd.a.<cff>a(cff::new, bps.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bpd<clb> bd = a("tnt_minecart", bpd.a.<clb>a(clb::new, bps.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bpd<cdo> be = a("trader_llama", bpd.a.a(cdo::new, bps.b).a(0.9F, 1.87F).a(1.7765F).a(new ept(0.0, 1.37, -0.3)).a(10));
   public static final bpd<cjz> bf = a("trident", bpd.a.<cjz>a(cjz::new, bps.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bpd<cce> bg = a("tropical_fish", bpd.a.a(cce::new, bps.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bpd<ccf> bh = a("turtle", bpd.a.a(ccf::new, bps.b).a(1.2F, 0.4F).a(new ept(0.0, 0.55625, -0.25)).a(10));
   public static final bpd<cgo> bi = a("vex", bpd.a.a(cgo::new, bps.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bpd<cih> bj = a("villager", bpd.a.<cih>a(cih::new, bps.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bpd<cgp> bk = a("vindicator", bpd.a.a(cgp::new, bps.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bpd<cin> bl = a("wandering_trader", bpd.a.a(cin::new, bps.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bpd<chy> bm = a("warden", bpd.a.a(chy::new, bps.a).a(0.9F, 2.9F).a(3.15F).a(boy.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bpd<cke> bn = a("wind_charge", bpd.a.<cke>a(cke::new, bps.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(clj.c));
   public static final bpd<cgq> bo = a("witch", bpd.a.a(cgq::new, bps.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bpd<ces> bp = a("wither", bpd.a.a(ces::new, bps.a).c().a(dae.cd).a(0.9F, 3.5F).a(10));
   public static final bpd<cgr> bq = a("wither_skeleton", bpd.a.a(cgr::new, bps.a).c().a(dae.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bpd<cka> br = a("wither_skull", bpd.a.<cka>a(cka::new, bps.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bpd<cch> bs = a("wolf", bpd.a.a(cch::new, bps.b).a(0.6F, 0.85F).a(0.68F).a(new ept(0.0, 0.81875, -0.0625)).a(10));
   public static final bpd<cgs> bt = a("zoglin", bpd.a.a(cgs::new, bps.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bpd<cgt> bu = a("zombie", bpd.a.<cgt>a(cgt::new, bps.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bpd<cdq> bv = a("zombie_horse", bpd.a.a(cdq::new, bps.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bpd<cgu> bw = a("zombie_villager", bpd.a.a(cgu::new, bps.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bpd<cgv> bx = a("zombified_piglin", bpd.a.a(cgv::new, bps.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bpd<ciu> by = a("player", bpd.a.<ciu>a(bps.h).b().a().a(0.6F, 1.8F).a(1.62F).a(ciu.bR).a(32).b(2));
   public static final bpd<cji> bz = a("fishing_bobber", bpd.a.<cji>a(cji::new, bps.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bpd.b<T> bF;
   private final bps bG;
   private final ImmutableSet<dac> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private vu bP;
   @Nullable
   private ajh bQ;
   private final bpa bR;
   private final clh bS;

   private static <T extends box> bpd<T> a(String $$0, bpd.a<T> $$1) {
      return iy.a(ki.g, $$0, $$1.a($$0));
   }

   public static ajh a(bpd<?> $$0) {
      return ki.g.b($$0);
   }

   public static Optional<bpd<?>> a(String $$0) {
      return ki.g.b(ajh.a($$0));
   }

   public bpd(bpd.b<T> $$0, bps $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dac> $$6, bpa $$7, int $$8, int $$9, clh $$10) {
      this.bF = $$0;
      this.bG = $$1;
      this.bL = $$5;
      this.bI = $$2;
      this.bJ = $$3;
      this.bK = $$4;
      this.bH = $$6;
      this.bR = $$7;
      this.bM = $$8;
      this.bN = $$9;
      this.bS = $$10;
   }

   @Nullable
   public T a(apf $$0, @Nullable cqm $$1, @Nullable ciu $$2, ib $$3, bpt $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends box> Consumer<T> a(apf $$0, cqm $$1, @Nullable ciu $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends box> Consumer<T> a(Consumer<T> $$0, apf $$1, cqm $$2, @Nullable ciu $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends box> Consumer<T> a(Consumer<T> $$0, cqm $$1) {
      return $$1.B() ? $$0.andThen($$1x -> $$1x.b($$1.z())) : $$0;
   }

   public static <T extends box> Consumer<T> b(Consumer<T> $$0, apf $$1, cqm $$2, @Nullable ciu $$3) {
      ta $$4 = $$2.w();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(apf $$0, ib $$1, bpt $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(apf $$0, @Nullable Consumer<T> $$1, ib $$2, bpt $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(apf $$0, @Nullable Consumer<T> $$1, ib $$2, bpt $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((cxb)$$0);
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
         if ($$6 instanceof bpr $$9) {
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

   protected static double a(cxe $$0, ib $$1, boolean $$2, epo $$3) {
      epo $$4 = new epo($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eqm> $$5 = $$0.d(null, $$4);
      return 1.0 + eqj.a(ih.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cxb $$0, @Nullable ciu $$1, @Nullable box $$2, @Nullable ta $$3) {
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

   public bps f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", ki.g.b(this));
      }

      return this.bO;
   }

   public vu h() {
      if (this.bP == null) {
         this.bP = vu.c(this.g());
      }

      return this.bP;
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
      if (this.bQ == null) {
         ajh $$0 = ki.g.b(this);
         this.bQ = $$0.d("entities/");
      }

      return this.bQ;
   }

   public float k() {
      return this.bR.a();
   }

   public float l() {
      return this.bR.b();
   }

   @Override
   public clh m() {
      return this.bS;
   }

   @Nullable
   public T a(cxb $$0) {
      return !this.a($$0.I()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<box> a(ta $$0, cxb $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public epo a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new epo($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dnb $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && ejc.a($$0) ? true : $$0.a(dae.cd) || $$0.a(dae.oi) || $$0.a(dae.dQ) || $$0.a(dae.qP);
      }
   }

   public bpa n() {
      return this.bR;
   }

   public static Optional<bpd<?>> a(ta $$0) {
      return ki.g.b(new ajh($$0.l("id")));
   }

   @Nullable
   public static box a(ta $$0, cxb $$1, Function<box, box> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            tg $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               box $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (box)$$3;
      }).orElse(null);
   }

   public static Stream<box> a(final List<? extends tx> $$0, final cxb $$1) {
      final Spliterator<? extends tx> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<box>() {
         @Override
         public boolean tryAdvance(Consumer<? super box> $$0x) {
            return $$2.tryAdvance($$2xx -> bpd.a((ta)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<box> trySplit() {
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

   private static Optional<box> b(ta $$0, cxb $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bB.warn("Exception loading entity: ", var3);
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
      return this != by && this != ao && this != bp && this != h && this != aj && this != W && this != al && this != av && this != F && this != L;
   }

   public boolean a(avd<bpd<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(ip<bpd<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(box $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends box> a() {
      return box.class;
   }

   @Deprecated
   public il.c<bpd<?>> r() {
      return this.bC;
   }

   public static class a<T extends box> {
      private final bpd.b<T> a;
      private final bps b;
      private ImmutableSet<dac> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bpa j = bpa.b(0.6F, 1.8F);
      private boz.a k = boz.a();
      private clh l = clj.g;

      private a(bpd.b<T> $$0, bps $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bps.b || $$1 == bps.h;
      }

      public static <T extends box> bpd.a<T> a(bpd.b<T> $$0, bps $$1) {
         return new bpd.a<>($$0, $$1);
      }

      public static <T extends box> bpd.a<T> a(bps $$0) {
         return new bpd.a<>(($$0x, $$1) -> null, $$0);
      }

      public bpd.a<T> a(float $$0, float $$1) {
         this.j = bpa.b($$0, $$1);
         return this;
      }

      public bpd.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bpd.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(boy.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bpd.a<T> a(ept... $$0) {
         for (ept $$1 : $$0) {
            this.k = this.k.a(boy.a, $$1);
         }

         return this;
      }

      public bpd.a<T> a(ept $$0) {
         return this.a(boy.b, $$0);
      }

      public bpd.a<T> b(float $$0) {
         return this.a(boy.b, 0.0F, -$$0, 0.0F);
      }

      public bpd.a<T> c(float $$0) {
         return this.a(boy.c, 0.0F, $$0, 0.0F);
      }

      public bpd.a<T> a(boy $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bpd.a<T> a(boy $$0, ept $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bpd.a<T> a() {
         this.e = false;
         return this;
      }

      public bpd.a<T> b() {
         this.d = false;
         return this;
      }

      public bpd.a<T> c() {
         this.f = true;
         return this;
      }

      public bpd.a<T> a(dac... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bpd.a<T> d() {
         this.g = true;
         return this;
      }

      public bpd.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bpd.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bpd.a<T> a(clf... $$0) {
         this.l = clj.e.a($$0);
         return this;
      }

      public bpd<T> a(String $$0) {
         if (this.d) {
            ac.a(beh.x, $$0);
         }

         return new bpd<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends box> {
      T create(bpd<T> var1, cxb var2);
   }
}
