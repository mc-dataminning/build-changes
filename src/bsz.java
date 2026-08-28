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

public class bsz<T extends bst> implements cph, dwi<bst, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ji.c<bsz<?>> bC = lp.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsz<cgk> a = a("allay", bsz.a.a(cgk::new, btr.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsz<bsp> b = a("area_effect_cloud", bsz.a.<bsp>a(bsp::new, btr.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsz<cgn> c = a("armadillo", bsz.a.a(cgn::new, btr.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsz<ciw> d = a("armor_stand", bsz.a.<ciw>a(ciw::new, btr.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsz<cne> e = a("arrow", bsz.a.<cne>a(cne::new, btr.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsz<cgq> f = a("axolotl", bsz.a.a(cgq::new, btr.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsz<cez> g = a("bat", bsz.a.a(cez::new, btr.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsz<cff> h = a("bee", bsz.a.a(cff::new, btr.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsz<cjl> i = a("blaze", bsz.a.a(cjl::new, btr.a).c().a(0.6F, 1.8F).a(8));
   public static final bsz<bss.b> j = a("block_display", bsz.a.a(bss.b::new, btr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsz<cou> k = a("boat", bsz.a.<cou>a(cou::new, btr.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsz<cjm> l = a("bogged", bsz.a.a(cjm::new, btr.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(cpm.c));
   public static final bsz<cky> m = a("breeze", bsz.a.a(cky::new, btr.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(cpm.c));
   public static final bsz<cof> n = a("breeze_wind_charge", bsz.a.<cof>a(cof::new, btr.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpm.c));
   public static final bsz<cgv> o = a("camel", bsz.a.a(cgv::new, btr.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsz<cfh> p = a("cat", bsz.a.a(cfh::new, btr.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsz<cjn> q = a("cave_spider", bsz.a.a(cjn::new, btr.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsz<cov> r = a("chest_boat", bsz.a.<cov>a(cov::new, btr.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsz<coz> s = a("chest_minecart", bsz.a.<coz>a(coz::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<cfj> t = a("chicken", bsz.a.a(cfj::new, btr.b).a(0.4F, 0.7F).b(0.644F).a(new evq(0.0, 0.7, -0.1)).a(10));
   public static final bsz<cfk> u = a("cod", bsz.a.a(cfk::new, btr.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsz<cpa> v = a("command_block_minecart", bsz.a.<cpa>a(cpa::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<cfl> w = a("cow", bsz.a.a(cfl::new, btr.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsz<cjo> x = a("creeper", bsz.a.a(cjo::new, btr.a).a(0.6F, 1.7F).a(8));
   public static final bsz<cfm> y = a("dolphin", bsz.a.a(cfm::new, btr.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsz<chj> z = a("donkey", bsz.a.a(chj::new, btr.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsz<cnf> A = a("dragon_fireball", bsz.a.<cnf>a(cnf::new, btr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsz<cjq> B = a("drowned", bsz.a.a(cjq::new, btr.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsz<cnx> C = a("egg", bsz.a.<cnx>a(cnx::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<cjr> D = a("elder_guardian", bsz.a.a(cjr::new, btr.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsz<chz> E = a("end_crystal", bsz.a.<chz>a(chz::new, btr.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsz<cia> F = a("ender_dragon", bsz.a.a(cia::new, btr.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsz<cny> G = a("ender_pearl", bsz.a.<cny>a(cny::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<cjs> H = a("enderman", bsz.a.a(cjs::new, btr.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsz<cjt> I = a("endermite", bsz.a.a(cjt::new, btr.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsz<cjv> J = a("evoker", bsz.a.a(cjv::new, btr.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsz<cng> K = a("evoker_fangs", bsz.a.<cng>a(cng::new, btr.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsz<cnz> L = a("experience_bottle", bsz.a.<cnz>a(cnz::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<bte> M = a("experience_orb", bsz.a.<bte>a(bte::new, btr.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsz<cnh> N = a("eye_of_ender", bsz.a.<cnh>a(cnh::new, btr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsz<cjf> O = a("falling_block", bsz.a.<cjf>a(cjf::new, btr.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsz<cnj> P = a("firework_rocket", bsz.a.<cnj>a(cnj::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<cfo> Q = a("fox", bsz.a.a(cfo::new, btr.b).a(0.6F, 0.7F).b(0.4F).a(new evq(0.0, 0.6375, -0.25)).a(8).a(dfa.oi));
   public static final bsz<cgy> R = a("frog", bsz.a.a(cgy::new, btr.b).a(0.5F, 0.5F).a(new evq(0.0, 0.375, -0.25)).a(10));
   public static final bsz<cpb> S = a("furnace_minecart", bsz.a.<cpb>a(cpb::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<cjw> T = a("ghast", bsz.a.a(cjw::new, btr.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsz<cjx> U = a("giant", bsz.a.a(cjx::new, btr.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsz<cix> V = a("glow_item_frame", bsz.a.<cix>a(cix::new, btr.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsz<btg> W = a("glow_squid", bsz.a.a(btg::new, btr.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsz<che> X = a("goat", bsz.a.a(che::new, btr.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsz<cjy> Y = a("guardian", bsz.a.a(cjy::new, btr.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsz<clg> Z = a("hoglin", bsz.a.a(clg::new, btr.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsz<cpc> aa = a("hopper_minecart", bsz.a.<cpc>a(cpc::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<chk> ab = a("horse", bsz.a.a(chk::new, btr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsz<cjz> ac = a("husk", bsz.a.a(cjz::new, btr.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsz<cka> ad = a("illusioner", bsz.a.a(cka::new, btr.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsz<btj> ae = a("interaction", bsz.a.a(btj::new, btr.h).a(0.0F, 0.0F).a(10));
   public static final bsz<cfq> af = a("iron_golem", bsz.a.a(cfq::new, btr.h).a(1.4F, 2.7F).a(10));
   public static final bsz<cjg> ag = a("item", bsz.a.<cjg>a(cjg::new, btr.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsz<bss.g> ah = a("item_display", bsz.a.a(bss.g::new, btr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsz<ciz> ai = a("item_frame", bsz.a.<ciz>a(ciz::new, btr.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsz<btv> aj = a("ominous_item_spawner", bsz.a.a(btv::new, btr.h).a(0.25F, 0.25F).a(8).a(cpm.c));
   public static final bsz<cnm> ak = a("fireball", bsz.a.<cnm>a(cnm::new, btr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsz<cja> al = a("leash_knot", bsz.a.<cja>a(cja::new, btr.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsz<btn> am = a("lightning_bolt", bsz.a.a(btn::new, btr.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsz<chl> an = a("llama", bsz.a.a(chl::new, btr.b).a(0.9F, 1.87F).b(1.7765F).a(new evq(0.0, 1.37, -0.3)).a(10));
   public static final bsz<cnn> ao = a("llama_spit", bsz.a.<cnn>a(cnn::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<ckb> ap = a("magma_cube", bsz.a.a(ckb::new, btr.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsz<btp> aq = a("marker", bsz.a.a(btp::new, btr.h).a(0.0F, 0.0F).a(0));
   public static final bsz<coy> ar = a("minecart", bsz.a.<coy>a(coy::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<cfr> as = a("mooshroom", bsz.a.a(cfr::new, btr.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsz<chn> at = a("mule", bsz.a.a(chn::new, btr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsz<cfs> au = a("ocelot", bsz.a.a(cfs::new, btr.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsz<cjb> av = a("painting", bsz.a.<cjb>a(cjb::new, btr.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsz<cft> aw = a("panda", bsz.a.a(cft::new, btr.b).a(1.3F, 1.25F).a(10));
   public static final bsz<cfu> ax = a("parrot", bsz.a.a(cfu::new, btr.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsz<cke> ay = a("phantom", bsz.a.a(cke::new, btr.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsz<cfv> az = a("pig", bsz.a.a(cfv::new, btr.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsz<clm> aA = a("piglin", bsz.a.a(clm::new, btr.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsz<clp> aB = a("piglin_brute", bsz.a.a(clp::new, btr.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsz<ckf> aC = a("pillager", bsz.a.a(ckf::new, btr.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsz<cfw> aD = a("polar_bear", bsz.a.a(cfw::new, btr.b).a(dfa.qP).a(1.4F, 1.4F).a(10));
   public static final bsz<coa> aE = a("potion", bsz.a.<coa>a(coa::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<cfx> aF = a("pufferfish", bsz.a.a(cfx::new, btr.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsz<cfy> aG = a("rabbit", bsz.a.a(cfy::new, btr.b).a(0.4F, 0.5F).a(8));
   public static final bsz<ckh> aH = a("ravager", bsz.a.a(ckh::new, btr.a).a(1.95F, 2.2F).a(new evq(0.0, 2.2625, -0.0625)).a(10));
   public static final bsz<cfz> aI = a("salmon", bsz.a.a(cfz::new, btr.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsz<cga> aJ = a("sheep", bsz.a.a(cga::new, btr.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsz<cki> aK = a("shulker", bsz.a.a(cki::new, btr.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsz<cnr> aL = a("shulker_bullet", bsz.a.<cnr>a(cnr::new, btr.h).a(0.3125F, 0.3125F).a(8));
   public static final bsz<ckj> aM = a("silverfish", bsz.a.a(ckj::new, btr.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsz<ckk> aN = a("skeleton", bsz.a.a(ckk::new, btr.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsz<cho> aO = a("skeleton_horse", bsz.a.a(cho::new, btr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsz<ckl> aP = a("slime", bsz.a.a(ckl::new, btr.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsz<cns> aQ = a("small_fireball", bsz.a.<cns>a(cns::new, btr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsz<chv> aR = a("sniffer", bsz.a.a(chv::new, btr.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsz<cgc> aS = a("snow_golem", bsz.a.a(cgc::new, btr.h).a(dfa.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsz<cnt> aT = a("snowball", bsz.a.<cnt>a(cnt::new, btr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsz<cpd> aU = a("spawner_minecart", bsz.a.<cpd>a(cpd::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<cnu> aV = a("spectral_arrow", bsz.a.<cnu>a(cnu::new, btr.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsz<ckn> aW = a("spider", bsz.a.a(ckn::new, btr.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsz<cgd> aX = a("squid", bsz.a.a(cgd::new, btr.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsz<cko> aY = a("stray", bsz.a.a(cko::new, btr.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfa.qP).a(8));
   public static final bsz<ckp> aZ = a("strider", bsz.a.a(ckp::new, btr.b).c().a(0.9F, 1.7F).a(10));
   public static final bsz<chb> ba = a("tadpole", bsz.a.a(chb::new, btr.b).a(chb.c, chb.d).b(chb.d * 0.65F).a(10));
   public static final bsz<bss.l> bb = a("text_display", bsz.a.a(bss.l::new, btr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsz<cjh> bc = a("tnt", bsz.a.<cjh>a(cjh::new, btr.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsz<cpe> bd = a("tnt_minecart", bsz.a.<cpe>a(cpe::new, btr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsz<chq> be = a("trader_llama", bsz.a.a(chq::new, btr.b).a(0.9F, 1.87F).b(1.7765F).a(new evq(0.0, 1.37, -0.3)).a(10));
   public static final bsz<cob> bf = a("trident", bsz.a.<cob>a(cob::new, btr.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsz<cge> bg = a("tropical_fish", bsz.a.a(cge::new, btr.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsz<cgf> bh = a("turtle", bsz.a.a(cgf::new, btr.b).a(1.2F, 0.4F).a(new evq(0.0, 0.55625, -0.25)).a(10));
   public static final bsz<ckq> bi = a("vex", bsz.a.a(ckq::new, btr.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsz<cmj> bj = a("villager", bsz.a.<cmj>a(cmj::new, btr.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsz<ckr> bk = a("vindicator", bsz.a.a(ckr::new, btr.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsz<cmp> bl = a("wandering_trader", bsz.a.a(cmp::new, btr.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsz<cma> bm = a("warden", bsz.a.a(cma::new, btr.a).a(0.9F, 2.9F).a(3.15F).a(bsu.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsz<cog> bn = a("wind_charge", bsz.a.<cog>a(cog::new, btr.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpm.c));
   public static final bsz<cks> bo = a("witch", bsz.a.a(cks::new, btr.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsz<ciu> bp = a("wither", bsz.a.a(ciu::new, btr.a).c().a(dfa.cd).a(0.9F, 3.5F).a(10));
   public static final bsz<ckt> bq = a("wither_skeleton", bsz.a.a(ckt::new, btr.a).c().a(dfa.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsz<coc> br = a("wither_skull", bsz.a.<coc>a(coc::new, btr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsz<cgh> bs = a("wolf", bsz.a.a(cgh::new, btr.b).a(0.6F, 0.85F).b(0.68F).a(new evq(0.0, 0.81875, -0.0625)).a(10));
   public static final bsz<cku> bt = a("zoglin", bsz.a.a(cku::new, btr.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsz<ckv> bu = a("zombie", bsz.a.<ckv>a(ckv::new, btr.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsz<chs> bv = a("zombie_horse", bsz.a.a(chs::new, btr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsz<ckw> bw = a("zombie_villager", bsz.a.a(ckw::new, btr.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsz<ckx> bx = a("zombified_piglin", bsz.a.a(ckx::new, btr.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsz<cmw> by = a("player", bsz.a.<cmw>a(btr.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmw.bT).a(32).b(2));
   public static final bsz<cnk> bz = a("fishing_bobber", bsz.a.<cnk>a(cnk::new, btr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsz.b<T> bF;
   private final btr bG;
   private final ImmutableSet<dey> bH;
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
   private ald<eqm> bQ;
   private final bsw bR;
   private final float bS;
   private final cpk bT;

   private static <T extends bst> bsz<T> a(String $$0, bsz.a<T> $$1) {
      return jv.a(lp.g, $$0, $$1.a($$0));
   }

   public static ale a(bsz<?> $$0) {
      return lp.g.b($$0);
   }

   public static Optional<bsz<?>> a(String $$0) {
      return lp.g.b(ale.a($$0));
   }

   public bsz(bsz.b<T> $$0, btr $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dey> $$6, bsw $$7, float $$8, int $$9, int $$10, cpk $$11) {
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
   public T a(are $$0, @Nullable cuo $$1, @Nullable cmw $$2, iz $$3, bts $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bst> Consumer<T> a(are $$0, cuo $$1, @Nullable cmw $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bst> Consumer<T> a(Consumer<T> $$0, are $$1, cuo $$2, @Nullable cmw $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bst> Consumer<T> a(Consumer<T> $$0, cuo $$1) {
      xo $$2 = $$1.a(km.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bst> Consumer<T> b(Consumer<T> $$0, are $$1, cuo $$2, @Nullable cmw $$3) {
      cxd $$4 = $$2.a(km.M, cxd.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(are $$0, iz $$1, bts $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(are $$0, @Nullable Consumer<T> $$1, iz $$2, bts $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(are $$0, @Nullable Consumer<T> $$1, iz $$2, bts $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dbx)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayy.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btq $$9) {
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

   protected static double a(dca $$0, iz $$1, boolean $$2, evl $$3) {
      evl $$4 = new evl($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewj> $$5 = $$0.d(null, $$4);
      return 1.0 + ewg.a(je.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dbx $$0, @Nullable cmw $$1, @Nullable bst $$2, cxd $$3) {
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

   public btr f() {
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

   public ald<eqm> k() {
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
   public cpk i() {
      return this.bT;
   }

   @Nullable
   public T a(dbx $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bst> a(ur $$0, dbx $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evl a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evl($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsb $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eoh.a($$0) ? true : $$0.a(dfa.cd) || $$0.a(dfa.oi) || $$0.a(dfa.dQ) || $$0.a(dfa.qP);
      }
   }

   public bsw n() {
      return this.bR;
   }

   public static Optional<bsz<?>> a(ur $$0) {
      return lp.g.b(new ale($$0.l("id")));
   }

   @Nullable
   public static bst a(ur $$0, dbx $$1, Function<bst, bst> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ux $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bst $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bst)$$3;
      }).orElse(null);
   }

   public static Stream<bst> a(final List<? extends vo> $$0, final dbx $$1) {
      final Spliterator<? extends vo> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bst>() {
         @Override
         public boolean tryAdvance(Consumer<? super bst> $$0x) {
            return $$2.tryAdvance($$2xx -> bsz.a((ur)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bst> trySplit() {
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

   private static Optional<bst> b(ur $$0, dbx $$1) {
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

   public boolean a(axe<bsz<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jm<bsz<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bst $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bst> a() {
      return bst.class;
   }

   @Deprecated
   public ji.c<bsz<?>> r() {
      return this.bC;
   }

   public static class a<T extends bst> {
      private final bsz.b<T> a;
      private final btr b;
      private ImmutableSet<dey> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsw j = bsw.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsv.a l = bsv.a();
      private cpk m = cpm.g;

      private a(bsz.b<T> $$0, btr $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btr.b || $$1 == btr.h;
      }

      public static <T extends bst> bsz.a<T> a(bsz.b<T> $$0, btr $$1) {
         return new bsz.a<>($$0, $$1);
      }

      public static <T extends bst> bsz.a<T> a(btr $$0) {
         return new bsz.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsz.a<T> a(float $$0, float $$1) {
         this.j = bsw.b($$0, $$1);
         return this;
      }

      public bsz.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsz.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsz.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsu.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsz.a<T> a(evq... $$0) {
         for (evq $$1 : $$0) {
            this.l = this.l.a(bsu.a, $$1);
         }

         return this;
      }

      public bsz.a<T> a(evq $$0) {
         return this.a(bsu.b, $$0);
      }

      public bsz.a<T> c(float $$0) {
         return this.a(bsu.b, 0.0F, -$$0, 0.0F);
      }

      public bsz.a<T> d(float $$0) {
         return this.a(bsu.c, 0.0F, $$0, 0.0F);
      }

      public bsz.a<T> a(bsu $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsz.a<T> a(bsu $$0, evq $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsz.a<T> a() {
         this.e = false;
         return this;
      }

      public bsz.a<T> b() {
         this.d = false;
         return this;
      }

      public bsz.a<T> c() {
         this.f = true;
         return this;
      }

      public bsz.a<T> a(dey... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsz.a<T> d() {
         this.g = true;
         return this;
      }

      public bsz.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsz.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsz.a<T> a(cpi... $$0) {
         this.m = cpm.e.a($$0);
         return this;
      }

      public bsz<T> a(String $$0) {
         if (this.d) {
            ac.a(bgw.A, $$0);
         }

         return new bsz<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bst> {
      T create(bsz<T> var1, dbx var2);
   }
}
