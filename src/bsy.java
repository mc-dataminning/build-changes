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

public class bsy<T extends bss> implements cpg, dwh<bss, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ji.c<bsy<?>> bC = lp.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsy<cgj> a = a("allay", bsy.a.a(cgj::new, btq.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsy<bso> b = a("area_effect_cloud", bsy.a.<bso>a(bso::new, btq.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsy<cgm> c = a("armadillo", bsy.a.a(cgm::new, btq.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsy<civ> d = a("armor_stand", bsy.a.<civ>a(civ::new, btq.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsy<cnd> e = a("arrow", bsy.a.<cnd>a(cnd::new, btq.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsy<cgp> f = a("axolotl", bsy.a.a(cgp::new, btq.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsy<cey> g = a("bat", bsy.a.a(cey::new, btq.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsy<cfe> h = a("bee", bsy.a.a(cfe::new, btq.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsy<cjk> i = a("blaze", bsy.a.a(cjk::new, btq.a).c().a(0.6F, 1.8F).a(8));
   public static final bsy<bsr.b> j = a("block_display", bsy.a.a(bsr.b::new, btq.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsy<cot> k = a("boat", bsy.a.<cot>a(cot::new, btq.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsy<cjl> l = a("bogged", bsy.a.a(cjl::new, btq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(cpl.c));
   public static final bsy<ckx> m = a("breeze", bsy.a.a(ckx::new, btq.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(cpl.c));
   public static final bsy<coe> n = a("breeze_wind_charge", bsy.a.<coe>a(coe::new, btq.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpl.c));
   public static final bsy<cgu> o = a("camel", bsy.a.a(cgu::new, btq.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsy<cfg> p = a("cat", bsy.a.a(cfg::new, btq.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsy<cjm> q = a("cave_spider", bsy.a.a(cjm::new, btq.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsy<cou> r = a("chest_boat", bsy.a.<cou>a(cou::new, btq.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsy<coy> s = a("chest_minecart", bsy.a.<coy>a(coy::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<cfi> t = a("chicken", bsy.a.a(cfi::new, btq.b).a(0.4F, 0.7F).b(0.644F).a(new evp(0.0, 0.7, -0.1)).a(10));
   public static final bsy<cfj> u = a("cod", bsy.a.a(cfj::new, btq.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsy<coz> v = a("command_block_minecart", bsy.a.<coz>a(coz::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<cfk> w = a("cow", bsy.a.a(cfk::new, btq.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsy<cjn> x = a("creeper", bsy.a.a(cjn::new, btq.a).a(0.6F, 1.7F).a(8));
   public static final bsy<cfl> y = a("dolphin", bsy.a.a(cfl::new, btq.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsy<chi> z = a("donkey", bsy.a.a(chi::new, btq.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsy<cne> A = a("dragon_fireball", bsy.a.<cne>a(cne::new, btq.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsy<cjp> B = a("drowned", bsy.a.a(cjp::new, btq.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsy<cnw> C = a("egg", bsy.a.<cnw>a(cnw::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<cjq> D = a("elder_guardian", bsy.a.a(cjq::new, btq.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsy<chy> E = a("end_crystal", bsy.a.<chy>a(chy::new, btq.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsy<chz> F = a("ender_dragon", bsy.a.a(chz::new, btq.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsy<cnx> G = a("ender_pearl", bsy.a.<cnx>a(cnx::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<cjr> H = a("enderman", bsy.a.a(cjr::new, btq.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsy<cjs> I = a("endermite", bsy.a.a(cjs::new, btq.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsy<cju> J = a("evoker", bsy.a.a(cju::new, btq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsy<cnf> K = a("evoker_fangs", bsy.a.<cnf>a(cnf::new, btq.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsy<cny> L = a("experience_bottle", bsy.a.<cny>a(cny::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<btd> M = a("experience_orb", bsy.a.<btd>a(btd::new, btq.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsy<cng> N = a("eye_of_ender", bsy.a.<cng>a(cng::new, btq.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsy<cje> O = a("falling_block", bsy.a.<cje>a(cje::new, btq.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsy<cni> P = a("firework_rocket", bsy.a.<cni>a(cni::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<cfn> Q = a("fox", bsy.a.a(cfn::new, btq.b).a(0.6F, 0.7F).b(0.4F).a(new evp(0.0, 0.6375, -0.25)).a(8).a(dez.oi));
   public static final bsy<cgx> R = a("frog", bsy.a.a(cgx::new, btq.b).a(0.5F, 0.5F).a(new evp(0.0, 0.375, -0.25)).a(10));
   public static final bsy<cpa> S = a("furnace_minecart", bsy.a.<cpa>a(cpa::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<cjv> T = a("ghast", bsy.a.a(cjv::new, btq.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsy<cjw> U = a("giant", bsy.a.a(cjw::new, btq.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsy<ciw> V = a("glow_item_frame", bsy.a.<ciw>a(ciw::new, btq.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsy<btf> W = a("glow_squid", bsy.a.a(btf::new, btq.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsy<chd> X = a("goat", bsy.a.a(chd::new, btq.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsy<cjx> Y = a("guardian", bsy.a.a(cjx::new, btq.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsy<clf> Z = a("hoglin", bsy.a.a(clf::new, btq.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsy<cpb> aa = a("hopper_minecart", bsy.a.<cpb>a(cpb::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<chj> ab = a("horse", bsy.a.a(chj::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsy<cjy> ac = a("husk", bsy.a.a(cjy::new, btq.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsy<cjz> ad = a("illusioner", bsy.a.a(cjz::new, btq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsy<bti> ae = a("interaction", bsy.a.a(bti::new, btq.h).a(0.0F, 0.0F).a(10));
   public static final bsy<cfp> af = a("iron_golem", bsy.a.a(cfp::new, btq.h).a(1.4F, 2.7F).a(10));
   public static final bsy<cjf> ag = a("item", bsy.a.<cjf>a(cjf::new, btq.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsy<bsr.g> ah = a("item_display", bsy.a.a(bsr.g::new, btq.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsy<ciy> ai = a("item_frame", bsy.a.<ciy>a(ciy::new, btq.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsy<btu> aj = a("ominous_item_spawner", bsy.a.a(btu::new, btq.h).a(0.25F, 0.25F).a(8).a(cpl.c));
   public static final bsy<cnl> ak = a("fireball", bsy.a.<cnl>a(cnl::new, btq.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsy<ciz> al = a("leash_knot", bsy.a.<ciz>a(ciz::new, btq.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsy<btm> am = a("lightning_bolt", bsy.a.a(btm::new, btq.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsy<chk> an = a("llama", bsy.a.a(chk::new, btq.b).a(0.9F, 1.87F).b(1.7765F).a(new evp(0.0, 1.37, -0.3)).a(10));
   public static final bsy<cnm> ao = a("llama_spit", bsy.a.<cnm>a(cnm::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<cka> ap = a("magma_cube", bsy.a.a(cka::new, btq.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsy<bto> aq = a("marker", bsy.a.a(bto::new, btq.h).a(0.0F, 0.0F).a(0));
   public static final bsy<cox> ar = a("minecart", bsy.a.<cox>a(cox::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<cfq> as = a("mooshroom", bsy.a.a(cfq::new, btq.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsy<chm> at = a("mule", bsy.a.a(chm::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsy<cfr> au = a("ocelot", bsy.a.a(cfr::new, btq.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsy<cja> av = a("painting", bsy.a.<cja>a(cja::new, btq.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsy<cfs> aw = a("panda", bsy.a.a(cfs::new, btq.b).a(1.3F, 1.25F).a(10));
   public static final bsy<cft> ax = a("parrot", bsy.a.a(cft::new, btq.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsy<ckd> ay = a("phantom", bsy.a.a(ckd::new, btq.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsy<cfu> az = a("pig", bsy.a.a(cfu::new, btq.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsy<cll> aA = a("piglin", bsy.a.a(cll::new, btq.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsy<clo> aB = a("piglin_brute", bsy.a.a(clo::new, btq.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsy<cke> aC = a("pillager", bsy.a.a(cke::new, btq.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsy<cfv> aD = a("polar_bear", bsy.a.a(cfv::new, btq.b).a(dez.qP).a(1.4F, 1.4F).a(10));
   public static final bsy<cnz> aE = a("potion", bsy.a.<cnz>a(cnz::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<cfw> aF = a("pufferfish", bsy.a.a(cfw::new, btq.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsy<cfx> aG = a("rabbit", bsy.a.a(cfx::new, btq.b).a(0.4F, 0.5F).a(8));
   public static final bsy<ckg> aH = a("ravager", bsy.a.a(ckg::new, btq.a).a(1.95F, 2.2F).a(new evp(0.0, 2.2625, -0.0625)).a(10));
   public static final bsy<cfy> aI = a("salmon", bsy.a.a(cfy::new, btq.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsy<cfz> aJ = a("sheep", bsy.a.a(cfz::new, btq.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsy<ckh> aK = a("shulker", bsy.a.a(ckh::new, btq.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsy<cnq> aL = a("shulker_bullet", bsy.a.<cnq>a(cnq::new, btq.h).a(0.3125F, 0.3125F).a(8));
   public static final bsy<cki> aM = a("silverfish", bsy.a.a(cki::new, btq.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsy<ckj> aN = a("skeleton", bsy.a.a(ckj::new, btq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsy<chn> aO = a("skeleton_horse", bsy.a.a(chn::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsy<ckk> aP = a("slime", bsy.a.a(ckk::new, btq.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsy<cnr> aQ = a("small_fireball", bsy.a.<cnr>a(cnr::new, btq.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsy<chu> aR = a("sniffer", bsy.a.a(chu::new, btq.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsy<cgb> aS = a("snow_golem", bsy.a.a(cgb::new, btq.h).a(dez.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsy<cns> aT = a("snowball", bsy.a.<cns>a(cns::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsy<cpc> aU = a("spawner_minecart", bsy.a.<cpc>a(cpc::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<cnt> aV = a("spectral_arrow", bsy.a.<cnt>a(cnt::new, btq.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsy<ckm> aW = a("spider", bsy.a.a(ckm::new, btq.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsy<cgc> aX = a("squid", bsy.a.a(cgc::new, btq.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsy<ckn> aY = a("stray", bsy.a.a(ckn::new, btq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dez.qP).a(8));
   public static final bsy<cko> aZ = a("strider", bsy.a.a(cko::new, btq.b).c().a(0.9F, 1.7F).a(10));
   public static final bsy<cha> ba = a("tadpole", bsy.a.a(cha::new, btq.b).a(cha.c, cha.d).b(cha.d * 0.65F).a(10));
   public static final bsy<bsr.l> bb = a("text_display", bsy.a.a(bsr.l::new, btq.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsy<cjg> bc = a("tnt", bsy.a.<cjg>a(cjg::new, btq.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsy<cpd> bd = a("tnt_minecart", bsy.a.<cpd>a(cpd::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsy<chp> be = a("trader_llama", bsy.a.a(chp::new, btq.b).a(0.9F, 1.87F).b(1.7765F).a(new evp(0.0, 1.37, -0.3)).a(10));
   public static final bsy<coa> bf = a("trident", bsy.a.<coa>a(coa::new, btq.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsy<cgd> bg = a("tropical_fish", bsy.a.a(cgd::new, btq.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsy<cge> bh = a("turtle", bsy.a.a(cge::new, btq.b).a(1.2F, 0.4F).a(new evp(0.0, 0.55625, -0.25)).a(10));
   public static final bsy<ckp> bi = a("vex", bsy.a.a(ckp::new, btq.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsy<cmi> bj = a("villager", bsy.a.<cmi>a(cmi::new, btq.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsy<ckq> bk = a("vindicator", bsy.a.a(ckq::new, btq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsy<cmo> bl = a("wandering_trader", bsy.a.a(cmo::new, btq.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsy<clz> bm = a("warden", bsy.a.a(clz::new, btq.a).a(0.9F, 2.9F).a(3.15F).a(bst.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsy<cof> bn = a("wind_charge", bsy.a.<cof>a(cof::new, btq.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpl.c));
   public static final bsy<ckr> bo = a("witch", bsy.a.a(ckr::new, btq.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsy<cit> bp = a("wither", bsy.a.a(cit::new, btq.a).c().a(dez.cd).a(0.9F, 3.5F).a(10));
   public static final bsy<cks> bq = a("wither_skeleton", bsy.a.a(cks::new, btq.a).c().a(dez.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsy<cob> br = a("wither_skull", bsy.a.<cob>a(cob::new, btq.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsy<cgg> bs = a("wolf", bsy.a.a(cgg::new, btq.b).a(0.6F, 0.85F).b(0.68F).a(new evp(0.0, 0.81875, -0.0625)).a(10));
   public static final bsy<ckt> bt = a("zoglin", bsy.a.a(ckt::new, btq.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsy<cku> bu = a("zombie", bsy.a.<cku>a(cku::new, btq.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsy<chr> bv = a("zombie_horse", bsy.a.a(chr::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsy<ckv> bw = a("zombie_villager", bsy.a.a(ckv::new, btq.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsy<ckw> bx = a("zombified_piglin", bsy.a.a(ckw::new, btq.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsy<cmv> by = a("player", bsy.a.<cmv>a(btq.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmv.bT).a(32).b(2));
   public static final bsy<cnj> bz = a("fishing_bobber", bsy.a.<cnj>a(cnj::new, btq.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsy.b<T> bF;
   private final btq bG;
   private final ImmutableSet<dex> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private xo bP;
   @Nullable
   private ald<eql> bQ;
   private final bsv bR;
   private final float bS;
   private final cpj bT;

   private static <T extends bss> bsy<T> a(String $$0, bsy.a<T> $$1) {
      return jv.a(lp.g, $$0, $$1.a($$0));
   }

   public static ale a(bsy<?> $$0) {
      return lp.g.b($$0);
   }

   public static Optional<bsy<?>> a(String $$0) {
      return lp.g.b(ale.a($$0));
   }

   public bsy(bsy.b<T> $$0, btq $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dex> $$6, bsv $$7, float $$8, int $$9, int $$10, cpj $$11) {
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
   public T a(are $$0, @Nullable cun $$1, @Nullable cmv $$2, iz $$3, btr $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bss> Consumer<T> a(are $$0, cun $$1, @Nullable cmv $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bss> Consumer<T> a(Consumer<T> $$0, are $$1, cun $$2, @Nullable cmv $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bss> Consumer<T> a(Consumer<T> $$0, cun $$1) {
      xo $$2 = $$1.a(km.f);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bss> Consumer<T> b(Consumer<T> $$0, are $$1, cun $$2, @Nullable cmv $$3) {
      cxc $$4 = $$2.a(km.L, cxc.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(are $$0, iz $$1, btr $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(are $$0, @Nullable Consumer<T> $$1, iz $$2, btr $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(are $$0, @Nullable Consumer<T> $$1, iz $$2, btr $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dbw)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cK());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayx.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btp $$9) {
            $$9.ba = $$9.dF();
            $$9.aY = $$9.dF();
            $$9.a($$0, $$0.d_($$9.dp()), $$3, null);
            $$9.Q();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dbz $$0, iz $$1, boolean $$2, evk $$3) {
      evk $$4 = new evk($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewi> $$5 = $$0.d(null, $$4);
      return 1.0 + ewf.a(je.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dbw $$0, @Nullable cmv $$1, @Nullable bss $$2, cxc $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cP() || $$1 != null && $$4.ah().f($$1.gb())) {
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

   public btq f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lp.g.b(this));
      }

      return this.bO;
   }

   public xo h() {
      if (this.bP == null) {
         this.bP = xo.c(this.g());
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

   public ald<eql> k() {
      if (this.bQ == null) {
         ale $$0 = lp.g.b(this);
         this.bQ = ald.a(lq.aU, $$0.d("entities/"));
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
   public T a(dbw $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bss> a(ur $$0, dbw $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evk a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evk($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsa $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eog.a($$0) ? true : $$0.a(dez.cd) || $$0.a(dez.oi) || $$0.a(dez.dQ) || $$0.a(dez.qP);
      }
   }

   public bsv n() {
      return this.bR;
   }

   public static Optional<bsy<?>> a(ur $$0) {
      return lp.g.b(new ale($$0.l("id")));
   }

   @Nullable
   public static bss a(ur $$0, dbw $$1, Function<bss, bss> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ux $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bss $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bss)$$3;
      }).orElse(null);
   }

   public static Stream<bss> a(final List<? extends vo> $$0, final dbw $$1) {
      final Spliterator<? extends vo> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bss>() {
         @Override
         public boolean tryAdvance(Consumer<? super bss> $$0x) {
            return $$2.tryAdvance($$2xx -> bsy.a((ur)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bss> trySplit() {
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

   private static Optional<bss> b(ur $$0, dbw $$1) {
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

   public boolean a(axe<bsy<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jm<bsy<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bss $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bss> a() {
      return bss.class;
   }

   @Deprecated
   public ji.c<bsy<?>> r() {
      return this.bC;
   }

   public static class a<T extends bss> {
      private final bsy.b<T> a;
      private final btq b;
      private ImmutableSet<dex> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsv j = bsv.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsu.a l = bsu.a();
      private cpj m = cpl.g;

      private a(bsy.b<T> $$0, btq $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btq.b || $$1 == btq.h;
      }

      public static <T extends bss> bsy.a<T> a(bsy.b<T> $$0, btq $$1) {
         return new bsy.a<>($$0, $$1);
      }

      public static <T extends bss> bsy.a<T> a(btq $$0) {
         return new bsy.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsy.a<T> a(float $$0, float $$1) {
         this.j = bsv.b($$0, $$1);
         return this;
      }

      public bsy.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsy.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsy.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bst.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsy.a<T> a(evp... $$0) {
         for (evp $$1 : $$0) {
            this.l = this.l.a(bst.a, $$1);
         }

         return this;
      }

      public bsy.a<T> a(evp $$0) {
         return this.a(bst.b, $$0);
      }

      public bsy.a<T> c(float $$0) {
         return this.a(bst.b, 0.0F, -$$0, 0.0F);
      }

      public bsy.a<T> d(float $$0) {
         return this.a(bst.c, 0.0F, $$0, 0.0F);
      }

      public bsy.a<T> a(bst $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsy.a<T> a(bst $$0, evp $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsy.a<T> a() {
         this.e = false;
         return this;
      }

      public bsy.a<T> b() {
         this.d = false;
         return this;
      }

      public bsy.a<T> c() {
         this.f = true;
         return this;
      }

      public bsy.a<T> a(dex... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsy.a<T> d() {
         this.g = true;
         return this;
      }

      public bsy.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsy.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsy.a<T> a(cph... $$0) {
         this.m = cpl.e.a($$0);
         return this;
      }

      public bsy<T> a(String $$0) {
         if (this.d) {
            ac.a(bgv.A, $$0);
         }

         return new bsy<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bss> {
      T create(bsy<T> var1, dbw var2);
   }
}
