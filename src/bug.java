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

public class bug<T extends btz> implements cqx, dzo<btz, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jp.c<bug<?>> bC = lx.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bug<chs> a = a("allay", bug.a.a(chs::new, buy.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bug<bts> b = a("area_effect_cloud", bug.a.<bts>a(bts::new, buy.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bug<chv> c = a("armadillo", bug.a.a(chv::new, buy.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bug<ckf> d = a("armor_stand", bug.a.<ckf>a(ckf::new, buy.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bug<cor> e = a("arrow", bug.a.<cor>a(cor::new, buy.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bug<chy> f = a("axolotl", bug.a.a(chy::new, buy.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bug<cgg> g = a("bat", bug.a.a(cgg::new, buy.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bug<cgn> h = a("bee", bug.a.a(cgn::new, buy.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bug<ckv> i = a("blaze", bug.a.a(ckv::new, buy.a).c().a(0.6F, 1.8F).a(8));
   public static final bug<btx.b> j = a("block_display", bug.a.a(btx.b::new, buy.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bug<cqh> k = a("boat", bug.a.<cqh>a(cqh::new, buy.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bug<ckw> l = a("bogged", bug.a.a(ckw::new, buy.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bug<cmi> m = a("breeze", bug.a.a(cmi::new, buy.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bug<cps> n = a("breeze_wind_charge", bug.a.<cps>a(cps::new, buy.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bug<cid> o = a("camel", bug.a.a(cid::new, buy.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bug<cgp> p = a("cat", bug.a.a(cgp::new, buy.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bug<ckx> q = a("cave_spider", bug.a.a(ckx::new, buy.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bug<cqi> r = a("chest_boat", bug.a.<cqi>a(cqi::new, buy.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bug<cqn> s = a("chest_minecart", bug.a.<cqn>a(cqn::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<cgr> t = a("chicken", bug.a.a(cgr::new, buy.b).a(0.4F, 0.7F).b(0.644F).a(new ezh(0.0, 0.7, -0.1)).a(10));
   public static final bug<cgs> u = a("cod", bug.a.a(cgs::new, buy.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bug<cqo> v = a("command_block_minecart", bug.a.<cqo>a(cqo::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<cgt> w = a("cow", bug.a.a(cgt::new, buy.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bug<cky> x = a("creeper", bug.a.a(cky::new, buy.a).a(0.6F, 1.7F).a(8));
   public static final bug<cgu> y = a("dolphin", bug.a.a(cgu::new, buy.f).a(0.9F, 0.6F).b(0.3F));
   public static final bug<cir> z = a("donkey", bug.a.a(cir::new, buy.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bug<cos> A = a("dragon_fireball", bug.a.<cos>a(cos::new, buy.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bug<cla> B = a("drowned", bug.a.a(cla::new, buy.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bug<cpk> C = a("egg", bug.a.<cpk>a(cpk::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<clb> D = a("elder_guardian", bug.a.a(clb::new, buy.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bug<cji> E = a("end_crystal", bug.a.<cji>a(cji::new, buy.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bug<cjj> F = a("ender_dragon", bug.a.a(cjj::new, buy.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bug<cpl> G = a("ender_pearl", bug.a.<cpl>a(cpl::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<clc> H = a("enderman", bug.a.a(clc::new, buy.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bug<cld> I = a("endermite", bug.a.a(cld::new, buy.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bug<clf> J = a("evoker", bug.a.a(clf::new, buy.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bug<cot> K = a("evoker_fangs", bug.a.<cot>a(cot::new, buy.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bug<cpm> L = a("experience_bottle", bug.a.<cpm>a(cpm::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<bul> M = a("experience_orb", bug.a.<bul>a(bul::new, buy.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bug<cou> N = a("eye_of_ender", bug.a.<cou>a(cou::new, buy.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bug<ckp> O = a("falling_block", bug.a.<ckp>a(ckp::new, buy.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bug<cow> P = a("firework_rocket", bug.a.<cow>a(cow::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<cgw> Q = a("fox", bug.a.a(cgw::new, buy.b).a(0.6F, 0.7F).b(0.4F).a(new ezh(0.0, 0.6375, -0.25)).a(8).a(dia.oi));
   public static final bug<cig> R = a("frog", bug.a.a(cig::new, buy.b).a(0.5F, 0.5F).a(new ezh(0.0, 0.375, -0.25)).a(10));
   public static final bug<cqp> S = a("furnace_minecart", bug.a.<cqp>a(cqp::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<clg> T = a("ghast", bug.a.a(clg::new, buy.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bug<clh> U = a("giant", bug.a.a(clh::new, buy.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bug<ckh> V = a("glow_item_frame", bug.a.<ckh>a(ckh::new, buy.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bug<bun> W = a("glow_squid", bug.a.a(bun::new, buy.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bug<cim> X = a("goat", bug.a.a(cim::new, buy.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bug<cli> Y = a("guardian", bug.a.a(cli::new, buy.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bug<cmq> Z = a("hoglin", bug.a.a(cmq::new, buy.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bug<cqq> aa = a("hopper_minecart", bug.a.<cqq>a(cqq::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<cis> ab = a("horse", bug.a.a(cis::new, buy.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bug<clj> ac = a("husk", bug.a.a(clj::new, buy.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bug<clk> ad = a("illusioner", bug.a.a(clk::new, buy.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bug<buq> ae = a("interaction", bug.a.a(buq::new, buy.h).e().a(0.0F, 0.0F).a(10));
   public static final bug<cgy> af = a("iron_golem", bug.a.a(cgy::new, buy.h).a(1.4F, 2.7F).a(10));
   public static final bug<ckq> ag = a("item", bug.a.<ckq>a(ckq::new, buy.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bug<btx.g> ah = a("item_display", bug.a.a(btx.g::new, buy.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bug<ckj> ai = a("item_frame", bug.a.<ckj>a(ckj::new, buy.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bug<bvb> aj = a("ominous_item_spawner", bug.a.a(bvb::new, buy.h).e().a(0.25F, 0.25F).a(8));
   public static final bug<coz> ak = a("fireball", bug.a.<coz>a(coz::new, buy.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bug<ckk> al = a("leash_knot", bug.a.<ckk>a(ckk::new, buy.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bug<buu> am = a("lightning_bolt", bug.a.a(buu::new, buy.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bug<cit> an = a("llama", bug.a.a(cit::new, buy.b).a(0.9F, 1.87F).b(1.7765F).a(new ezh(0.0, 1.37, -0.3)).a(10));
   public static final bug<cpa> ao = a("llama_spit", bug.a.<cpa>a(cpa::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<cll> ap = a("magma_cube", bug.a.a(cll::new, buy.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bug<buw> aq = a("marker", bug.a.a(buw::new, buy.h).e().a(0.0F, 0.0F).a(0));
   public static final bug<cql> ar = a("minecart", bug.a.<cql>a(cql::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<cgz> as = a("mooshroom", bug.a.a(cgz::new, buy.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bug<civ> at = a("mule", bug.a.a(civ::new, buy.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bug<cha> au = a("ocelot", bug.a.a(cha::new, buy.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bug<ckl> av = a("painting", bug.a.<ckl>a(ckl::new, buy.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bug<chb> aw = a("panda", bug.a.a(chb::new, buy.b).a(1.3F, 1.25F).a(10));
   public static final bug<chc> ax = a("parrot", bug.a.a(chc::new, buy.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bug<clo> ay = a("phantom", bug.a.a(clo::new, buy.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bug<chd> az = a("pig", bug.a.a(chd::new, buy.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bug<cmw> aA = a("piglin", bug.a.a(cmw::new, buy.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bug<cmz> aB = a("piglin_brute", bug.a.a(cmz::new, buy.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bug<clp> aC = a("pillager", bug.a.a(clp::new, buy.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bug<che> aD = a("polar_bear", bug.a.a(che::new, buy.b).a(dia.qP).a(1.4F, 1.4F).a(10));
   public static final bug<cpn> aE = a("potion", bug.a.<cpn>a(cpn::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<chf> aF = a("pufferfish", bug.a.a(chf::new, buy.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bug<chg> aG = a("rabbit", bug.a.a(chg::new, buy.b).a(0.4F, 0.5F).a(8));
   public static final bug<clr> aH = a("ravager", bug.a.a(clr::new, buy.a).a(1.95F, 2.2F).a(new ezh(0.0, 2.2625, -0.0625)).a(10));
   public static final bug<chh> aI = a("salmon", bug.a.a(chh::new, buy.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bug<chi> aJ = a("sheep", bug.a.a(chi::new, buy.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bug<cls> aK = a("shulker", bug.a.a(cls::new, buy.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bug<cpe> aL = a("shulker_bullet", bug.a.<cpe>a(cpe::new, buy.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bug<clt> aM = a("silverfish", bug.a.a(clt::new, buy.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bug<clu> aN = a("skeleton", bug.a.a(clu::new, buy.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bug<ciw> aO = a("skeleton_horse", bug.a.a(ciw::new, buy.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bug<clv> aP = a("slime", bug.a.a(clv::new, buy.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bug<cpf> aQ = a("small_fireball", bug.a.<cpf>a(cpf::new, buy.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bug<cjd> aR = a("sniffer", bug.a.a(cjd::new, buy.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bug<chk> aS = a("snow_golem", bug.a.a(chk::new, buy.h).a(dia.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bug<cpg> aT = a("snowball", bug.a.<cpg>a(cpg::new, buy.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bug<cqr> aU = a("spawner_minecart", bug.a.<cqr>a(cqr::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<cph> aV = a("spectral_arrow", bug.a.<cph>a(cph::new, buy.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bug<clx> aW = a("spider", bug.a.a(clx::new, buy.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bug<chl> aX = a("squid", bug.a.a(chl::new, buy.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bug<cly> aY = a("stray", bug.a.a(cly::new, buy.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dia.qP).a(8));
   public static final bug<clz> aZ = a("strider", bug.a.a(clz::new, buy.b).c().a(0.9F, 1.7F).a(10));
   public static final bug<cij> ba = a("tadpole", bug.a.a(cij::new, buy.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bug<btx.l> bb = a("text_display", bug.a.a(btx.l::new, buy.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bug<ckr> bc = a("tnt", bug.a.<ckr>a(ckr::new, buy.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bug<cqs> bd = a("tnt_minecart", bug.a.<cqs>a(cqs::new, buy.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bug<ciy> be = a("trader_llama", bug.a.a(ciy::new, buy.b).a(0.9F, 1.87F).b(1.7765F).a(new ezh(0.0, 1.37, -0.3)).a(10));
   public static final bug<cpo> bf = a("trident", bug.a.<cpo>a(cpo::new, buy.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bug<chm> bg = a("tropical_fish", bug.a.a(chm::new, buy.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bug<chn> bh = a("turtle", bug.a.a(chn::new, buy.b).a(1.2F, 0.4F).a(new ezh(0.0, 0.55625, -0.25)).a(10));
   public static final bug<cma> bi = a("vex", bug.a.a(cma::new, buy.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bug<cnt> bj = a("villager", bug.a.<cnt>a(cnt::new, buy.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bug<cmb> bk = a("vindicator", bug.a.a(cmb::new, buy.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bug<cnz> bl = a("wandering_trader", bug.a.a(cnz::new, buy.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bug<cnk> bm = a("warden", bug.a.a(cnk::new, buy.a).a(0.9F, 2.9F).a(3.15F).a(bua.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bug<cpt> bn = a("wind_charge", bug.a.<cpt>a(cpt::new, buy.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bug<cmc> bo = a("witch", bug.a.a(cmc::new, buy.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bug<ckd> bp = a("wither", bug.a.a(ckd::new, buy.a).c().a(dia.cd).a(0.9F, 3.5F).a(10));
   public static final bug<cmd> bq = a("wither_skeleton", bug.a.a(cmd::new, buy.a).c().a(dia.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bug<cpp> br = a("wither_skull", bug.a.<cpp>a(cpp::new, buy.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bug<chp> bs = a("wolf", bug.a.a(chp::new, buy.b).a(0.6F, 0.85F).b(0.68F).a(new ezh(0.0, 0.81875, -0.0625)).a(10));
   public static final bug<cme> bt = a("zoglin", bug.a.a(cme::new, buy.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bug<cmf> bu = a("zombie", bug.a.<cmf>a(cmf::new, buy.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bug<cja> bv = a("zombie_horse", bug.a.a(cja::new, buy.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bug<cmg> bw = a("zombie_villager", bug.a.a(cmg::new, buy.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bug<cmh> bx = a("zombified_piglin", bug.a.a(cmh::new, buy.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bug<coh> by = a("player", bug.a.<coh>a(buy.h).b().a().a(0.6F, 1.8F).b(1.62F).a(coh.bS).a(32).b(2));
   public static final bug<cox> bz = a("fishing_bobber", bug.a.<cox>a(cox::new, buy.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bug.b<T> bF;
   private final buy bG;
   private final ImmutableSet<dhy> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   private final String bO;
   @Nullable
   private xh bP;
   private final Optional<alg<eub>> bQ;
   private final buc bR;
   private final float bS;
   private final cra bT;

   private static <T extends btz> bug<T> a(alg<bug<?>> $$0, bug.a<T> $$1) {
      return kc.a(lx.f, $$0, $$1.a($$0));
   }

   private static alg<bug<?>> b(String $$0) {
      return alg.a(ly.z, alh.b($$0));
   }

   private static <T extends btz> bug<T> a(String $$0, bug.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alh a(bug<?> $$0) {
      return lx.f.b($$0);
   }

   public static Optional<bug<?>> a(String $$0) {
      return lx.f.b(alh.c($$0));
   }

   public bug(
      bug.b<T> $$0,
      buy $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dhy> $$6,
      buc $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alg<eub>> $$12,
      cra $$13
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
   public T a(arm $$0, @Nullable cvx $$1, @Nullable coh $$2, jg $$3, buf $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends btz> Consumer<T> a(dev $$0, cvx $$1, @Nullable coh $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends btz> Consumer<T> a(Consumer<T> $$0, dev $$1, cvx $$2, @Nullable coh $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends btz> Consumer<T> a(Consumer<T> $$0, cvx $$1) {
      xh $$2 = $$1.a(kt.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends btz> Consumer<T> b(Consumer<T> $$0, dev $$1, cvx $$2, @Nullable coh $$3) {
      cyg $$4 = $$2.a(kt.V, cyg.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arm $$0, jg $$1, buf $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arm $$0, @Nullable Consumer<T> $$1, jg $$2, buf $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arm $$0, @Nullable Consumer<T> $$1, jg $$2, buf $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cS());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azj.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bux $$9) {
            $$9.aW = $$9.dN();
            $$9.aU = $$9.dN();
            $$9.a($$0, $$0.d_($$9.dx()), $$3, null);
            $$9.U();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dey $$0, jg $$1, boolean $$2, ezc $$3) {
      ezc $$4 = new ezc($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fab> $$5 = $$0.d(null, $$4);
      return 1.0 + ezy.a(jl.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dev $$0, @Nullable coh $$1, @Nullable btz $$2, cyg $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cX() || $$1 != null && $$4.ag().f($$1.gj())) {
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

   public buy f() {
      return this.bG;
   }

   public String g() {
      return this.bO;
   }

   public xh h() {
      if (this.bP == null) {
         this.bP = xh.c(this.g());
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

   public Optional<alg<eub>> k() {
      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public cra i() {
      return this.bT;
   }

   @Nullable
   public T a(dev $$0, buf $$1) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<btz> a(uj $$0, dev $$1, buf $$2) {
      return ad.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ezc a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ezc($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dvd $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && err.a($$0) ? true : $$0.a(dia.cd) || $$0.a(dia.oi) || $$0.a(dia.dQ) || $$0.a(dia.qP);
      }
   }

   public buc n() {
      return this.bR;
   }

   public static Optional<bug<?>> a(uj $$0) {
      return lx.f.b(alh.a($$0.l("id")));
   }

   @Nullable
   public static btz a(uj $$0, dev $$1, buf $$2, Function<btz, btz> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            up $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               btz $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (btz)$$4;
      }).orElse(null);
   }

   public static Stream<btz> a(final List<? extends vg> $$0, final dev $$1, final buf $$2) {
      final Spliterator<? extends vg> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<btz>() {
         @Override
         public boolean tryAdvance(Consumer<? super btz> $$0x) {
            return $$3.tryAdvance($$3xx -> bug.a((uj)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<btz> trySplit() {
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

   private static Optional<btz> b(uj $$0, dev $$1, buf $$2) {
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

   public boolean a(axp<bug<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jt<bug<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(btz $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends btz> a() {
      return btz.class;
   }

   @Deprecated
   public jp.c<bug<?>> r() {
      return this.bC;
   }

   public static class a<T extends btz> {
      private final bug.b<T> a;
      private final buy b;
      private ImmutableSet<dhy> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private buc j = buc.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bub.a l = bub.a();
      private cra m = crc.h;
      private akz<bug<?>, Optional<alg<eub>>> n = $$0x -> Optional.of(alg.a(ly.bd, $$0x.a().f("entities/")));
      private akz<bug<?>, String> o = $$0x -> ad.a("entity", $$0x.a());

      private a(bug.b<T> $$0, buy $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == buy.b || $$1 == buy.h;
      }

      public static <T extends btz> bug.a<T> a(bug.b<T> $$0, buy $$1) {
         return new bug.a<>($$0, $$1);
      }

      public static <T extends btz> bug.a<T> a(buy $$0) {
         return new bug.a<>(($$0x, $$1) -> null, $$0);
      }

      public bug.a<T> a(float $$0, float $$1) {
         this.j = buc.b($$0, $$1);
         return this;
      }

      public bug.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bug.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bug.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bua.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bug.a<T> a(ezh... $$0) {
         for (ezh $$1 : $$0) {
            this.l = this.l.a(bua.a, $$1);
         }

         return this;
      }

      public bug.a<T> a(ezh $$0) {
         return this.a(bua.b, $$0);
      }

      public bug.a<T> c(float $$0) {
         return this.a(bua.b, 0.0F, -$$0, 0.0F);
      }

      public bug.a<T> d(float $$0) {
         return this.a(bua.c, 0.0F, $$0, 0.0F);
      }

      public bug.a<T> a(bua $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bug.a<T> a(bua $$0, ezh $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bug.a<T> a() {
         this.e = false;
         return this;
      }

      public bug.a<T> b() {
         this.d = false;
         return this;
      }

      public bug.a<T> c() {
         this.f = true;
         return this;
      }

      public bug.a<T> a(dhy... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bug.a<T> d() {
         this.g = true;
         return this;
      }

      public bug.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bug.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bug.a<T> a(cqy... $$0) {
         this.m = crc.f.a($$0);
         return this;
      }

      public bug.a<T> e() {
         this.n = akz.fixed(Optional.empty());
         return this;
      }

      public bug<T> a(alg<bug<?>> $$0) {
         if (this.d) {
            ad.a(bhs.A, $$0.a().toString());
         }

         return new bug<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends btz> {
      T create(bug<T> var1, dev var2);
   }
}
