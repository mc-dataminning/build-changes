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

public class bup<T extends bui> implements crg, dzy<bui, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jq.c<bup<?>> bC = lz.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bup<cib> a = a("allay", bup.a.a(cib::new, bvh.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bup<bub> b = a("area_effect_cloud", bup.a.<bub>a(bub::new, bvh.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bup<cie> c = a("armadillo", bup.a.a(cie::new, bvh.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bup<cko> d = a("armor_stand", bup.a.<cko>a(cko::new, bvh.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bup<cpa> e = a("arrow", bup.a.<cpa>a(cpa::new, bvh.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bup<cih> f = a("axolotl", bup.a.a(cih::new, bvh.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bup<cgp> g = a("bat", bup.a.a(cgp::new, bvh.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bup<cgw> h = a("bee", bup.a.a(cgw::new, bvh.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bup<cle> i = a("blaze", bup.a.a(cle::new, bvh.a).c().a(0.6F, 1.8F).a(8));
   public static final bup<bug.b> j = a("block_display", bup.a.a(bug.b::new, bvh.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bup<cqq> k = a("boat", bup.a.<cqq>a(cqq::new, bvh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bup<clf> l = a("bogged", bup.a.a(clf::new, bvh.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bup<cmr> m = a("breeze", bup.a.a(cmr::new, bvh.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bup<cqb> n = a("breeze_wind_charge", bup.a.<cqb>a(cqb::new, bvh.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bup<cim> o = a("camel", bup.a.a(cim::new, bvh.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bup<cgy> p = a("cat", bup.a.a(cgy::new, bvh.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bup<clg> q = a("cave_spider", bup.a.a(clg::new, bvh.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bup<cqr> r = a("chest_boat", bup.a.<cqr>a(cqr::new, bvh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bup<cqw> s = a("chest_minecart", bup.a.a(cqw::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<cha> t = a("chicken", bup.a.a(cha::new, bvh.b).a(0.4F, 0.7F).b(0.644F).a(new ezr(0.0, 0.7, -0.1)).a(10));
   public static final bup<chb> u = a("cod", bup.a.a(chb::new, bvh.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bup<cqx> v = a("command_block_minecart", bup.a.a(cqx::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<chc> w = a("cow", bup.a.a(chc::new, bvh.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bup<clh> x = a("creeper", bup.a.a(clh::new, bvh.a).a(0.6F, 1.7F).a(8));
   public static final bup<chd> y = a("dolphin", bup.a.a(chd::new, bvh.f).a(0.9F, 0.6F).b(0.3F));
   public static final bup<cja> z = a("donkey", bup.a.a(cja::new, bvh.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bup<cpb> A = a("dragon_fireball", bup.a.<cpb>a(cpb::new, bvh.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bup<clj> B = a("drowned", bup.a.a(clj::new, bvh.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bup<cpt> C = a("egg", bup.a.<cpt>a(cpt::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<clk> D = a("elder_guardian", bup.a.a(clk::new, bvh.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bup<cjr> E = a("end_crystal", bup.a.<cjr>a(cjr::new, bvh.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bup<cjs> F = a("ender_dragon", bup.a.a(cjs::new, bvh.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bup<cpu> G = a("ender_pearl", bup.a.<cpu>a(cpu::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<cll> H = a("enderman", bup.a.a(cll::new, bvh.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bup<clm> I = a("endermite", bup.a.a(clm::new, bvh.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bup<clo> J = a("evoker", bup.a.a(clo::new, bvh.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bup<cpc> K = a("evoker_fangs", bup.a.<cpc>a(cpc::new, bvh.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bup<cpv> L = a("experience_bottle", bup.a.<cpv>a(cpv::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<buu> M = a("experience_orb", bup.a.<buu>a(buu::new, bvh.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bup<cpd> N = a("eye_of_ender", bup.a.<cpd>a(cpd::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bup<cky> O = a("falling_block", bup.a.<cky>a(cky::new, bvh.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bup<cpf> P = a("firework_rocket", bup.a.<cpf>a(cpf::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<chf> Q = a("fox", bup.a.a(chf::new, bvh.b).a(0.6F, 0.7F).b(0.4F).a(new ezr(0.0, 0.6375, -0.25)).a(8).a(dil.oi));
   public static final bup<cip> R = a("frog", bup.a.a(cip::new, bvh.b).a(0.5F, 0.5F).a(new ezr(0.0, 0.375, -0.25)).a(10));
   public static final bup<cqy> S = a("furnace_minecart", bup.a.a(cqy::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<clp> T = a("ghast", bup.a.a(clp::new, bvh.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bup<clq> U = a("giant", bup.a.a(clq::new, bvh.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bup<ckq> V = a("glow_item_frame", bup.a.<ckq>a(ckq::new, bvh.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bup<buw> W = a("glow_squid", bup.a.a(buw::new, bvh.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bup<civ> X = a("goat", bup.a.a(civ::new, bvh.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bup<clr> Y = a("guardian", bup.a.a(clr::new, bvh.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bup<cmz> Z = a("hoglin", bup.a.a(cmz::new, bvh.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bup<cqz> aa = a("hopper_minecart", bup.a.a(cqz::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<cjb> ab = a("horse", bup.a.a(cjb::new, bvh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bup<cls> ac = a("husk", bup.a.a(cls::new, bvh.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bup<clt> ad = a("illusioner", bup.a.a(clt::new, bvh.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bup<buz> ae = a("interaction", bup.a.a(buz::new, bvh.h).e().a(0.0F, 0.0F).a(10));
   public static final bup<chh> af = a("iron_golem", bup.a.a(chh::new, bvh.h).a(1.4F, 2.7F).a(10));
   public static final bup<ckz> ag = a("item", bup.a.<ckz>a(ckz::new, bvh.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bup<bug.g> ah = a("item_display", bup.a.a(bug.g::new, bvh.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bup<cks> ai = a("item_frame", bup.a.<cks>a(cks::new, bvh.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bup<bvk> aj = a("ominous_item_spawner", bup.a.a(bvk::new, bvh.h).e().a(0.25F, 0.25F).a(8));
   public static final bup<cpi> ak = a("fireball", bup.a.<cpi>a(cpi::new, bvh.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bup<ckt> al = a("leash_knot", bup.a.<ckt>a(ckt::new, bvh.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bup<bvd> am = a("lightning_bolt", bup.a.a(bvd::new, bvh.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bup<cjc> an = a("llama", bup.a.a(cjc::new, bvh.b).a(0.9F, 1.87F).b(1.7765F).a(new ezr(0.0, 1.37, -0.3)).a(10));
   public static final bup<cpj> ao = a("llama_spit", bup.a.<cpj>a(cpj::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<clu> ap = a("magma_cube", bup.a.a(clu::new, bvh.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bup<bvf> aq = a("marker", bup.a.a(bvf::new, bvh.h).e().a(0.0F, 0.0F).a(0));
   public static final bup<cqu> ar = a("minecart", bup.a.a(cqu::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<chi> as = a("mooshroom", bup.a.a(chi::new, bvh.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bup<cje> at = a("mule", bup.a.a(cje::new, bvh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bup<chj> au = a("ocelot", bup.a.a(chj::new, bvh.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bup<cku> av = a("painting", bup.a.<cku>a(cku::new, bvh.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bup<chk> aw = a("panda", bup.a.a(chk::new, bvh.b).a(1.3F, 1.25F).a(10));
   public static final bup<chl> ax = a("parrot", bup.a.a(chl::new, bvh.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bup<clx> ay = a("phantom", bup.a.a(clx::new, bvh.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bup<chm> az = a("pig", bup.a.a(chm::new, bvh.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bup<cnf> aA = a("piglin", bup.a.a(cnf::new, bvh.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bup<cni> aB = a("piglin_brute", bup.a.a(cni::new, bvh.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bup<cly> aC = a("pillager", bup.a.a(cly::new, bvh.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bup<chn> aD = a("polar_bear", bup.a.a(chn::new, bvh.b).a(dil.qP).a(1.4F, 1.4F).a(10));
   public static final bup<cpw> aE = a("potion", bup.a.<cpw>a(cpw::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<cho> aF = a("pufferfish", bup.a.a(cho::new, bvh.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bup<chp> aG = a("rabbit", bup.a.a(chp::new, bvh.b).a(0.4F, 0.5F).a(8));
   public static final bup<cma> aH = a("ravager", bup.a.a(cma::new, bvh.a).a(1.95F, 2.2F).a(new ezr(0.0, 2.2625, -0.0625)).a(10));
   public static final bup<chq> aI = a("salmon", bup.a.a(chq::new, bvh.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bup<chr> aJ = a("sheep", bup.a.a(chr::new, bvh.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bup<cmb> aK = a("shulker", bup.a.a(cmb::new, bvh.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bup<cpn> aL = a("shulker_bullet", bup.a.<cpn>a(cpn::new, bvh.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bup<cmc> aM = a("silverfish", bup.a.a(cmc::new, bvh.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bup<cmd> aN = a("skeleton", bup.a.a(cmd::new, bvh.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bup<cjf> aO = a("skeleton_horse", bup.a.a(cjf::new, bvh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bup<cme> aP = a("slime", bup.a.a(cme::new, bvh.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bup<cpo> aQ = a("small_fireball", bup.a.<cpo>a(cpo::new, bvh.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bup<cjm> aR = a("sniffer", bup.a.a(cjm::new, bvh.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bup<cht> aS = a("snow_golem", bup.a.a(cht::new, bvh.h).a(dil.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bup<cpp> aT = a("snowball", bup.a.<cpp>a(cpp::new, bvh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bup<cra> aU = a("spawner_minecart", bup.a.a(cra::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<cpq> aV = a("spectral_arrow", bup.a.<cpq>a(cpq::new, bvh.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bup<cmg> aW = a("spider", bup.a.a(cmg::new, bvh.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bup<chu> aX = a("squid", bup.a.a(chu::new, bvh.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bup<cmh> aY = a("stray", bup.a.a(cmh::new, bvh.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dil.qP).a(8));
   public static final bup<cmi> aZ = a("strider", bup.a.a(cmi::new, bvh.b).c().a(0.9F, 1.7F).a(10));
   public static final bup<cis> ba = a("tadpole", bup.a.a(cis::new, bvh.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bup<bug.l> bb = a("text_display", bup.a.a(bug.l::new, bvh.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bup<cla> bc = a("tnt", bup.a.<cla>a(cla::new, bvh.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bup<crb> bd = a("tnt_minecart", bup.a.a(crb::new, bvh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bup<cjh> be = a("trader_llama", bup.a.a(cjh::new, bvh.b).a(0.9F, 1.87F).b(1.7765F).a(new ezr(0.0, 1.37, -0.3)).a(10));
   public static final bup<cpx> bf = a("trident", bup.a.<cpx>a(cpx::new, bvh.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bup<chv> bg = a("tropical_fish", bup.a.a(chv::new, bvh.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bup<chw> bh = a("turtle", bup.a.a(chw::new, bvh.b).a(1.2F, 0.4F).a(new ezr(0.0, 0.55625, -0.25)).a(10));
   public static final bup<cmj> bi = a("vex", bup.a.a(cmj::new, bvh.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bup<coc> bj = a("villager", bup.a.<coc>a(coc::new, bvh.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bup<cmk> bk = a("vindicator", bup.a.a(cmk::new, bvh.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bup<coi> bl = a("wandering_trader", bup.a.a(coi::new, bvh.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bup<cnt> bm = a("warden", bup.a.a(cnt::new, bvh.a).a(0.9F, 2.9F).a(3.15F).a(buj.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bup<cqc> bn = a("wind_charge", bup.a.<cqc>a(cqc::new, bvh.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bup<cml> bo = a("witch", bup.a.a(cml::new, bvh.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bup<ckm> bp = a("wither", bup.a.a(ckm::new, bvh.a).c().a(dil.cd).a(0.9F, 3.5F).a(10));
   public static final bup<cmm> bq = a("wither_skeleton", bup.a.a(cmm::new, bvh.a).c().a(dil.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bup<cpy> br = a("wither_skull", bup.a.<cpy>a(cpy::new, bvh.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bup<chy> bs = a("wolf", bup.a.a(chy::new, bvh.b).a(0.6F, 0.85F).b(0.68F).a(new ezr(0.0, 0.81875, -0.0625)).a(10));
   public static final bup<cmn> bt = a("zoglin", bup.a.a(cmn::new, bvh.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bup<cmo> bu = a("zombie", bup.a.<cmo>a(cmo::new, bvh.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bup<cjj> bv = a("zombie_horse", bup.a.a(cjj::new, bvh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bup<cmp> bw = a("zombie_villager", bup.a.a(cmp::new, bvh.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bup<cmq> bx = a("zombified_piglin", bup.a.a(cmq::new, bvh.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bup<cor> by = a("player", bup.a.<cor>a(bvh.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cor.bV).a(32).b(2));
   public static final bup<cpg> bz = a("fishing_bobber", bup.a.<cpg>a(cpg::new, bvh.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bup.b<T> bF;
   private final bvh bG;
   private final ImmutableSet<dij> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   private final String bO;
   @Nullable
   private xl bP;
   private final Optional<alk<eul>> bQ;
   private final bul bR;
   private final float bS;
   private final crj bT;

   private static <T extends bui> bup<T> a(alk<bup<?>> $$0, bup.a<T> $$1) {
      return kd.a(lz.f, $$0, $$1.a($$0));
   }

   private static alk<bup<?>> b(String $$0) {
      return alk.a(ma.z, all.b($$0));
   }

   private static <T extends bui> bup<T> a(String $$0, bup.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static all a(bup<?> $$0) {
      return lz.f.b($$0);
   }

   public static Optional<bup<?>> a(String $$0) {
      return lz.f.b(all.c($$0));
   }

   public bup(
      bup.b<T> $$0,
      bvh $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dij> $$6,
      bul $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alk<eul>> $$12,
      crj $$13
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
   public T a(arq $$0, @Nullable cwf $$1, @Nullable cor $$2, jh $$3, buo $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bui> Consumer<T> a(dff $$0, cwf $$1, @Nullable cor $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bui> Consumer<T> a(Consumer<T> $$0, dff $$1, cwf $$2, @Nullable cor $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bui> Consumer<T> a(Consumer<T> $$0, cwf $$1) {
      xl $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bui> Consumer<T> b(Consumer<T> $$0, dff $$1, cwf $$2, @Nullable cor $$3) {
      cyo $$4 = $$2.a(ku.W, cyo.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arq $$0, jh $$1, buo $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arq $$0, @Nullable Consumer<T> $$1, jh $$2, buo $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arq $$0, @Nullable Consumer<T> $$1, jh $$2, buo $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cT());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azn.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvg $$9) {
            $$9.aZ = $$9.dO();
            $$9.aX = $$9.dO();
            $$9.a($$0, $$0.d_($$9.dy()), $$3, null);
            $$9.U();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dfi $$0, jh $$1, boolean $$2, ezm $$3) {
      ezm $$4 = new ezm($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fal> $$5 = $$0.d(null, $$4);
      return 1.0 + fai.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dff $$0, @Nullable cor $$1, @Nullable bui $$2, cyo $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cY() || $$1 != null && $$4.ag().f($$1.gk())) {
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

   public bvh f() {
      return this.bG;
   }

   public String g() {
      return this.bO;
   }

   public xl h() {
      if (this.bP == null) {
         this.bP = xl.c(this.g());
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

   public Optional<alk<eul>> k() {
      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public crj i() {
      return this.bT;
   }

   @Nullable
   public T a(dff $$0, buo $$1) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bui> a(un $$0, dff $$1, buo $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ezm a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ezm($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dvo $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && esb.a($$0) ? true : $$0.a(dil.cd) || $$0.a(dil.oi) || $$0.a(dil.dQ) || $$0.a(dil.qP);
      }
   }

   public bul n() {
      return this.bR;
   }

   public static Optional<bup<?>> a(un $$0) {
      return lz.f.b(all.a($$0.l("id")));
   }

   @Nullable
   public static bui a(un $$0, dff $$1, buo $$2, Function<bui, bui> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            ut $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bui $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bui)$$4;
      }).orElse(null);
   }

   public static Stream<bui> a(final List<? extends vk> $$0, final dff $$1, final buo $$2) {
      final Spliterator<? extends vk> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bui>() {
         @Override
         public boolean tryAdvance(Consumer<? super bui> $$0x) {
            return $$3.tryAdvance($$3xx -> bup.a((un)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bui> trySplit() {
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

   private static Optional<bui> b(un $$0, dff $$1, buo $$2) {
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

   public boolean a(axt<bup<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(ju<bup<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bui $$0) {
      return (T)($$0.ar() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bui> a() {
      return bui.class;
   }

   @Deprecated
   public jq.c<bup<?>> r() {
      return this.bC;
   }

   public static class a<T extends bui> {
      private final bup.b<T> a;
      private final bvh b;
      private ImmutableSet<dij> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bul j = bul.b(0.6F, 1.8F);
      private float k = 1.0F;
      private buk.a l = buk.a();
      private crj m = crl.h;
      private ald<bup<?>, Optional<alk<eul>>> n = $$0x -> Optional.of(alk.a(ma.bd, $$0x.a().f("entities/")));
      private ald<bup<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bup.b<T> $$0, bvh $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvh.b || $$1 == bvh.h;
      }

      public static <T extends bui> bup.a<T> a(bup.b<T> $$0, bvh $$1) {
         return new bup.a<>($$0, $$1);
      }

      public static <T extends bui> bup.a<T> a(bvh $$0) {
         return new bup.a<>(($$0x, $$1) -> null, $$0);
      }

      public bup.a<T> a(float $$0, float $$1) {
         this.j = bul.b($$0, $$1);
         return this;
      }

      public bup.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bup.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bup.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(buj.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bup.a<T> a(ezr... $$0) {
         for (ezr $$1 : $$0) {
            this.l = this.l.a(buj.a, $$1);
         }

         return this;
      }

      public bup.a<T> a(ezr $$0) {
         return this.a(buj.b, $$0);
      }

      public bup.a<T> c(float $$0) {
         return this.a(buj.b, 0.0F, -$$0, 0.0F);
      }

      public bup.a<T> d(float $$0) {
         return this.a(buj.c, 0.0F, $$0, 0.0F);
      }

      public bup.a<T> a(buj $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bup.a<T> a(buj $$0, ezr $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bup.a<T> a() {
         this.e = false;
         return this;
      }

      public bup.a<T> b() {
         this.d = false;
         return this;
      }

      public bup.a<T> c() {
         this.f = true;
         return this;
      }

      public bup.a<T> a(dij... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bup.a<T> d() {
         this.g = true;
         return this;
      }

      public bup.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bup.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bup.a<T> a(crh... $$0) {
         this.m = crl.f.a($$0);
         return this;
      }

      public bup.a<T> e() {
         this.n = ald.fixed(Optional.empty());
         return this;
      }

      public bup<T> a(alk<bup<?>> $$0) {
         if (this.d) {
            ae.a(bhy.A, $$0.a().toString());
         }

         return new bup<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bui> {
      T create(bup<T> var1, dff var2);
   }
}
