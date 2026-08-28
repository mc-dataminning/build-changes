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

public class bsw<T extends bsq> implements cpg, dxk<bsq, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jm.c<bsw<?>> bC = lt.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsw<cgi> a = a("allay", bsw.a.a(cgi::new, bto.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsw<bsm> b = a("area_effect_cloud", bsw.a.<bsm>a(bsm::new, bto.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsw<cgl> c = a("armadillo", bsw.a.a(cgl::new, bto.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsw<ciu> d = a("armor_stand", bsw.a.<ciu>a(ciu::new, bto.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsw<cnd> e = a("arrow", bsw.a.<cnd>a(cnd::new, bto.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsw<cgo> f = a("axolotl", bsw.a.a(cgo::new, bto.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsw<cex> g = a("bat", bsw.a.a(cex::new, bto.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsw<cfd> h = a("bee", bsw.a.a(cfd::new, bto.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsw<cjk> i = a("blaze", bsw.a.a(cjk::new, bto.a).c().a(0.6F, 1.8F).a(8));
   public static final bsw<bsp.b> j = a("block_display", bsw.a.a(bsp.b::new, bto.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsw<cot> k = a("boat", bsw.a.<cot>a(cot::new, bto.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsw<cjl> l = a("bogged", bsw.a.a(cjl::new, bto.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsw<ckx> m = a("breeze", bsw.a.a(ckx::new, bto.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bsw<coe> n = a("breeze_wind_charge", bsw.a.<coe>a(coe::new, bto.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsw<cgt> o = a("camel", bsw.a.a(cgt::new, bto.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsw<cff> p = a("cat", bsw.a.a(cff::new, bto.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsw<cjm> q = a("cave_spider", bsw.a.a(cjm::new, bto.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsw<cou> r = a("chest_boat", bsw.a.<cou>a(cou::new, bto.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsw<coy> s = a("chest_minecart", bsw.a.<coy>a(coy::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<cfh> t = a("chicken", bsw.a.a(cfh::new, bto.b).a(0.4F, 0.7F).b(0.644F).a(new eww(0.0, 0.7, -0.1)).a(10));
   public static final bsw<cfi> u = a("cod", bsw.a.a(cfi::new, bto.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsw<coz> v = a("command_block_minecart", bsw.a.<coz>a(coz::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<cfj> w = a("cow", bsw.a.a(cfj::new, bto.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsw<cjn> x = a("creeper", bsw.a.a(cjn::new, bto.a).a(0.6F, 1.7F).a(8));
   public static final bsw<cfk> y = a("dolphin", bsw.a.a(cfk::new, bto.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsw<chh> z = a("donkey", bsw.a.a(chh::new, bto.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsw<cne> A = a("dragon_fireball", bsw.a.<cne>a(cne::new, bto.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsw<cjp> B = a("drowned", bsw.a.a(cjp::new, bto.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsw<cnw> C = a("egg", bsw.a.<cnw>a(cnw::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<cjq> D = a("elder_guardian", bsw.a.a(cjq::new, bto.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsw<chx> E = a("end_crystal", bsw.a.<chx>a(chx::new, bto.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsw<chy> F = a("ender_dragon", bsw.a.a(chy::new, bto.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsw<cnx> G = a("ender_pearl", bsw.a.<cnx>a(cnx::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<cjr> H = a("enderman", bsw.a.a(cjr::new, bto.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsw<cjs> I = a("endermite", bsw.a.a(cjs::new, bto.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsw<cju> J = a("evoker", bsw.a.a(cju::new, bto.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsw<cnf> K = a("evoker_fangs", bsw.a.<cnf>a(cnf::new, bto.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsw<cny> L = a("experience_bottle", bsw.a.<cny>a(cny::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<btb> M = a("experience_orb", bsw.a.<btb>a(btb::new, bto.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsw<cng> N = a("eye_of_ender", bsw.a.<cng>a(cng::new, bto.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsw<cje> O = a("falling_block", bsw.a.<cje>a(cje::new, bto.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsw<cni> P = a("firework_rocket", bsw.a.<cni>a(cni::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<cfm> Q = a("fox", bsw.a.a(cfm::new, bto.b).a(0.6F, 0.7F).b(0.4F).a(new eww(0.0, 0.6375, -0.25)).a(8).a(dfy.oi));
   public static final bsw<cgw> R = a("frog", bsw.a.a(cgw::new, bto.b).a(0.5F, 0.5F).a(new eww(0.0, 0.375, -0.25)).a(10));
   public static final bsw<cpa> S = a("furnace_minecart", bsw.a.<cpa>a(cpa::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<cjv> T = a("ghast", bsw.a.a(cjv::new, bto.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsw<cjw> U = a("giant", bsw.a.a(cjw::new, bto.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsw<ciw> V = a("glow_item_frame", bsw.a.<ciw>a(ciw::new, bto.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsw<btd> W = a("glow_squid", bsw.a.a(btd::new, bto.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsw<chc> X = a("goat", bsw.a.a(chc::new, bto.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsw<cjx> Y = a("guardian", bsw.a.a(cjx::new, bto.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsw<clf> Z = a("hoglin", bsw.a.a(clf::new, bto.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsw<cpb> aa = a("hopper_minecart", bsw.a.<cpb>a(cpb::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<chi> ab = a("horse", bsw.a.a(chi::new, bto.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsw<cjy> ac = a("husk", bsw.a.a(cjy::new, bto.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsw<cjz> ad = a("illusioner", bsw.a.a(cjz::new, bto.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsw<btg> ae = a("interaction", bsw.a.a(btg::new, bto.h).a(0.0F, 0.0F).a(10));
   public static final bsw<cfo> af = a("iron_golem", bsw.a.a(cfo::new, bto.h).a(1.4F, 2.7F).a(10));
   public static final bsw<cjf> ag = a("item", bsw.a.<cjf>a(cjf::new, bto.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsw<bsp.g> ah = a("item_display", bsw.a.a(bsp.g::new, bto.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsw<ciy> ai = a("item_frame", bsw.a.<ciy>a(ciy::new, bto.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsw<bts> aj = a("ominous_item_spawner", bsw.a.a(bts::new, bto.h).a(0.25F, 0.25F).a(8));
   public static final bsw<cnl> ak = a("fireball", bsw.a.<cnl>a(cnl::new, bto.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsw<ciz> al = a("leash_knot", bsw.a.<ciz>a(ciz::new, bto.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsw<btk> am = a("lightning_bolt", bsw.a.a(btk::new, bto.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsw<chj> an = a("llama", bsw.a.a(chj::new, bto.b).a(0.9F, 1.87F).b(1.7765F).a(new eww(0.0, 1.37, -0.3)).a(10));
   public static final bsw<cnm> ao = a("llama_spit", bsw.a.<cnm>a(cnm::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<cka> ap = a("magma_cube", bsw.a.a(cka::new, bto.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsw<btm> aq = a("marker", bsw.a.a(btm::new, bto.h).a(0.0F, 0.0F).a(0));
   public static final bsw<cox> ar = a("minecart", bsw.a.<cox>a(cox::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<cfp> as = a("mooshroom", bsw.a.a(cfp::new, bto.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsw<chl> at = a("mule", bsw.a.a(chl::new, bto.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsw<cfq> au = a("ocelot", bsw.a.a(cfq::new, bto.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsw<cja> av = a("painting", bsw.a.<cja>a(cja::new, bto.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsw<cfr> aw = a("panda", bsw.a.a(cfr::new, bto.b).a(1.3F, 1.25F).a(10));
   public static final bsw<cfs> ax = a("parrot", bsw.a.a(cfs::new, bto.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsw<ckd> ay = a("phantom", bsw.a.a(ckd::new, bto.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsw<cft> az = a("pig", bsw.a.a(cft::new, bto.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsw<cll> aA = a("piglin", bsw.a.a(cll::new, bto.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsw<clo> aB = a("piglin_brute", bsw.a.a(clo::new, bto.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsw<cke> aC = a("pillager", bsw.a.a(cke::new, bto.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsw<cfu> aD = a("polar_bear", bsw.a.a(cfu::new, bto.b).a(dfy.qP).a(1.4F, 1.4F).a(10));
   public static final bsw<cnz> aE = a("potion", bsw.a.<cnz>a(cnz::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<cfv> aF = a("pufferfish", bsw.a.a(cfv::new, bto.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsw<cfw> aG = a("rabbit", bsw.a.a(cfw::new, bto.b).a(0.4F, 0.5F).a(8));
   public static final bsw<ckg> aH = a("ravager", bsw.a.a(ckg::new, bto.a).a(1.95F, 2.2F).a(new eww(0.0, 2.2625, -0.0625)).a(10));
   public static final bsw<cfx> aI = a("salmon", bsw.a.a(cfx::new, bto.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsw<cfy> aJ = a("sheep", bsw.a.a(cfy::new, bto.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsw<ckh> aK = a("shulker", bsw.a.a(ckh::new, bto.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsw<cnq> aL = a("shulker_bullet", bsw.a.<cnq>a(cnq::new, bto.h).a(0.3125F, 0.3125F).a(8));
   public static final bsw<cki> aM = a("silverfish", bsw.a.a(cki::new, bto.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsw<ckj> aN = a("skeleton", bsw.a.a(ckj::new, bto.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsw<chm> aO = a("skeleton_horse", bsw.a.a(chm::new, bto.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsw<ckk> aP = a("slime", bsw.a.a(ckk::new, bto.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsw<cnr> aQ = a("small_fireball", bsw.a.<cnr>a(cnr::new, bto.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsw<cht> aR = a("sniffer", bsw.a.a(cht::new, bto.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsw<cga> aS = a("snow_golem", bsw.a.a(cga::new, bto.h).a(dfy.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsw<cns> aT = a("snowball", bsw.a.<cns>a(cns::new, bto.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsw<cpc> aU = a("spawner_minecart", bsw.a.<cpc>a(cpc::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<cnt> aV = a("spectral_arrow", bsw.a.<cnt>a(cnt::new, bto.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsw<ckm> aW = a("spider", bsw.a.a(ckm::new, bto.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsw<cgb> aX = a("squid", bsw.a.a(cgb::new, bto.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsw<ckn> aY = a("stray", bsw.a.a(ckn::new, bto.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfy.qP).a(8));
   public static final bsw<cko> aZ = a("strider", bsw.a.a(cko::new, bto.b).c().a(0.9F, 1.7F).a(10));
   public static final bsw<cgz> ba = a("tadpole", bsw.a.a(cgz::new, bto.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bsw<bsp.l> bb = a("text_display", bsw.a.a(bsp.l::new, bto.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsw<cjg> bc = a("tnt", bsw.a.<cjg>a(cjg::new, bto.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsw<cpd> bd = a("tnt_minecart", bsw.a.<cpd>a(cpd::new, bto.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsw<cho> be = a("trader_llama", bsw.a.a(cho::new, bto.b).a(0.9F, 1.87F).b(1.7765F).a(new eww(0.0, 1.37, -0.3)).a(10));
   public static final bsw<coa> bf = a("trident", bsw.a.<coa>a(coa::new, bto.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsw<cgc> bg = a("tropical_fish", bsw.a.a(cgc::new, bto.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsw<cgd> bh = a("turtle", bsw.a.a(cgd::new, bto.b).a(1.2F, 0.4F).a(new eww(0.0, 0.55625, -0.25)).a(10));
   public static final bsw<ckp> bi = a("vex", bsw.a.a(ckp::new, bto.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsw<cmi> bj = a("villager", bsw.a.<cmi>a(cmi::new, bto.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsw<ckq> bk = a("vindicator", bsw.a.a(ckq::new, bto.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsw<cmo> bl = a("wandering_trader", bsw.a.a(cmo::new, bto.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsw<clz> bm = a("warden", bsw.a.a(clz::new, bto.a).a(0.9F, 2.9F).a(3.15F).a(bsr.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsw<cof> bn = a("wind_charge", bsw.a.<cof>a(cof::new, bto.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsw<ckr> bo = a("witch", bsw.a.a(ckr::new, bto.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsw<cis> bp = a("wither", bsw.a.a(cis::new, bto.a).c().a(dfy.cd).a(0.9F, 3.5F).a(10));
   public static final bsw<cks> bq = a("wither_skeleton", bsw.a.a(cks::new, bto.a).c().a(dfy.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsw<cob> br = a("wither_skull", bsw.a.<cob>a(cob::new, bto.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsw<cgf> bs = a("wolf", bsw.a.a(cgf::new, bto.b).a(0.6F, 0.85F).b(0.68F).a(new eww(0.0, 0.81875, -0.0625)).a(10));
   public static final bsw<ckt> bt = a("zoglin", bsw.a.a(ckt::new, bto.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsw<cku> bu = a("zombie", bsw.a.<cku>a(cku::new, bto.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsw<chq> bv = a("zombie_horse", bsw.a.a(chq::new, bto.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsw<ckv> bw = a("zombie_villager", bsw.a.a(ckv::new, bto.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsw<ckw> bx = a("zombified_piglin", bsw.a.a(ckw::new, bto.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsw<cmv> by = a("player", bsw.a.<cmv>a(bto.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmv.bV).a(32).b(2));
   public static final bsw<cnj> bz = a("fishing_bobber", bsw.a.<cnj>a(cnj::new, bto.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsw.b<T> bF;
   private final bto bG;
   private final ImmutableSet<dfw> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private wy bP;
   @Nullable
   private akp<erq> bQ;
   private final bst bR;
   private final float bS;
   private final cpj bT;

   private static <T extends bsq> bsw<T> a(String $$0, bsw.a<T> $$1) {
      return jz.a(lt.f, $$0, $$1.a($$0));
   }

   public static akq a(bsw<?> $$0) {
      return lt.f.b($$0);
   }

   public static Optional<bsw<?>> a(String $$0) {
      return lt.f.b(akq.c($$0));
   }

   public bsw(bsw.b<T> $$0, bto $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfw> $$6, bst $$7, float $$8, int $$9, int $$10, cpj $$11) {
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
   public T a(aqt $$0, @Nullable cuo $$1, @Nullable cmv $$2, jd $$3, btp $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsq> Consumer<T> a(aqt $$0, cuo $$1, @Nullable cmv $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsq> Consumer<T> a(Consumer<T> $$0, aqt $$1, cuo $$2, @Nullable cmv $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsq> Consumer<T> a(Consumer<T> $$0, cuo $$1) {
      wy $$2 = $$1.a(kq.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsq> Consumer<T> b(Consumer<T> $$0, aqt $$1, cuo $$2, @Nullable cmv $$3) {
      cxf $$4 = $$2.a(kq.M, cxf.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqt $$0, jd $$1, btp $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqt $$0, @Nullable Consumer<T> $$1, jd $$2, btp $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqt $$0, @Nullable Consumer<T> $$1, jd $$2, btp $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dcu)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cL());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayn.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btn $$9) {
            $$9.ba = $$9.dG();
            $$9.aY = $$9.dG();
            $$9.a($$0, $$0.d_($$9.dq()), $$3, null);
            $$9.Q();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dcx $$0, jd $$1, boolean $$2, ewr $$3) {
      ewr $$4 = new ewr($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<exp> $$5 = $$0.d(null, $$4);
      return 1.0 + exm.a(ji.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dcu $$0, @Nullable cmv $$1, @Nullable bsq $$2, cxf $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cQ() || $$1 != null && $$4.ah().f($$1.fY())) {
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

   public bto f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ad.a("entity", lt.f.b(this));
      }

      return this.bO;
   }

   public wy h() {
      if (this.bP == null) {
         this.bP = wy.c(this.g());
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

   public akp<erq> k() {
      if (this.bQ == null) {
         akq $$0 = lt.f.b(this);
         this.bQ = akp.a(lu.bc, $$0.f("entities/"));
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
   public cpj i() {
      return this.bT;
   }

   @Nullable
   public T a(dcu $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsq> a(ua $$0, dcu $$1) {
      return ad.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ewr a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ewr($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dta $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && epl.a($$0) ? true : $$0.a(dfy.cd) || $$0.a(dfy.oi) || $$0.a(dfy.dQ) || $$0.a(dfy.qP);
      }
   }

   public bst n() {
      return this.bR;
   }

   public static Optional<bsw<?>> a(ua $$0) {
      return lt.f.b(akq.a($$0.l("id")));
   }

   @Nullable
   public static bsq a(ua $$0, dcu $$1, Function<bsq, bsq> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ug $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsq $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsq)$$3;
      }).orElse(null);
   }

   public static Stream<bsq> a(final List<? extends ux> $$0, final dcu $$1) {
      final Spliterator<? extends ux> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsq>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsq> $$0x) {
            return $$2.tryAdvance($$2xx -> bsw.a((ua)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsq> trySplit() {
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

   private static Optional<bsq> b(ua $$0, dcu $$1) {
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
      return this != by && this != ao && this != bp && this != g && this != ai && this != V && this != al && this != av && this != E && this != K;
   }

   public boolean a(awt<bsw<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jq<bsw<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsq $$0) {
      return (T)($$0.am() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsq> a() {
      return bsq.class;
   }

   @Deprecated
   public jm.c<bsw<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsq> {
      private final bsw.b<T> a;
      private final bto b;
      private ImmutableSet<dfw> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bst j = bst.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bss.a l = bss.a();
      private cpj m = cpl.f;

      private a(bsw.b<T> $$0, bto $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bto.b || $$1 == bto.h;
      }

      public static <T extends bsq> bsw.a<T> a(bsw.b<T> $$0, bto $$1) {
         return new bsw.a<>($$0, $$1);
      }

      public static <T extends bsq> bsw.a<T> a(bto $$0) {
         return new bsw.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsw.a<T> a(float $$0, float $$1) {
         this.j = bst.b($$0, $$1);
         return this;
      }

      public bsw.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsw.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsw.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsr.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsw.a<T> a(eww... $$0) {
         for (eww $$1 : $$0) {
            this.l = this.l.a(bsr.a, $$1);
         }

         return this;
      }

      public bsw.a<T> a(eww $$0) {
         return this.a(bsr.b, $$0);
      }

      public bsw.a<T> c(float $$0) {
         return this.a(bsr.b, 0.0F, -$$0, 0.0F);
      }

      public bsw.a<T> d(float $$0) {
         return this.a(bsr.c, 0.0F, $$0, 0.0F);
      }

      public bsw.a<T> a(bsr $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsw.a<T> a(bsr $$0, eww $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsw.a<T> a() {
         this.e = false;
         return this;
      }

      public bsw.a<T> b() {
         this.d = false;
         return this;
      }

      public bsw.a<T> c() {
         this.f = true;
         return this;
      }

      public bsw.a<T> a(dfw... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsw.a<T> d() {
         this.g = true;
         return this;
      }

      public bsw.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsw.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsw.a<T> a(cph... $$0) {
         this.m = cpl.d.a($$0);
         return this;
      }

      public bsw<T> a(String $$0) {
         if (this.d) {
            ad.a(bgq.A, $$0);
         }

         return new bsw<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsq> {
      T create(bsw<T> var1, dcu var2);
   }
}
