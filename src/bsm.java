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

public class bsm<T extends bsg> implements cov, dwu<bsg, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jj.c<bsm<?>> bC = lq.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsm<cfx> a = a("allay", bsm.a.a(cfx::new, bte.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsm<bsc> b = a("area_effect_cloud", bsm.a.<bsc>a(bsc::new, bte.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsm<cga> c = a("armadillo", bsm.a.a(cga::new, bte.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsm<cij> d = a("armor_stand", bsm.a.<cij>a(cij::new, bte.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsm<cms> e = a("arrow", bsm.a.<cms>a(cms::new, bte.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsm<cgd> f = a("axolotl", bsm.a.a(cgd::new, bte.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsm<cem> g = a("bat", bsm.a.a(cem::new, bte.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsm<ces> h = a("bee", bsm.a.a(ces::new, bte.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsm<ciz> i = a("blaze", bsm.a.a(ciz::new, bte.a).c().a(0.6F, 1.8F).a(8));
   public static final bsm<bsf.b> j = a("block_display", bsm.a.a(bsf.b::new, bte.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsm<coh> k = a("boat", bsm.a.<coh>a(coh::new, bte.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsm<cja> l = a("bogged", bsm.a.a(cja::new, bte.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsm<ckm> m = a("breeze", bsm.a.a(ckm::new, bte.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bsm<cnt> n = a("breeze_wind_charge", bsm.a.<cnt>a(cnt::new, bte.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsm<cgi> o = a("camel", bsm.a.a(cgi::new, bte.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsm<ceu> p = a("cat", bsm.a.a(ceu::new, bte.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsm<cjb> q = a("cave_spider", bsm.a.a(cjb::new, bte.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsm<coi> r = a("chest_boat", bsm.a.<coi>a(coi::new, bte.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsm<com> s = a("chest_minecart", bsm.a.<com>a(com::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<cew> t = a("chicken", bsm.a.a(cew::new, bte.b).a(0.4F, 0.7F).b(0.644F).a(new ewf(0.0, 0.7, -0.1)).a(10));
   public static final bsm<cex> u = a("cod", bsm.a.a(cex::new, bte.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsm<coo> v = a("command_block_minecart", bsm.a.<coo>a(coo::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<cey> w = a("cow", bsm.a.a(cey::new, bte.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsm<cjc> x = a("creeper", bsm.a.a(cjc::new, bte.a).a(0.6F, 1.7F).a(8));
   public static final bsm<cez> y = a("dolphin", bsm.a.a(cez::new, bte.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsm<cgw> z = a("donkey", bsm.a.a(cgw::new, bte.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsm<cmt> A = a("dragon_fireball", bsm.a.<cmt>a(cmt::new, bte.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsm<cje> B = a("drowned", bsm.a.a(cje::new, bte.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsm<cnl> C = a("egg", bsm.a.<cnl>a(cnl::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<cjf> D = a("elder_guardian", bsm.a.a(cjf::new, bte.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsm<chm> E = a("end_crystal", bsm.a.<chm>a(chm::new, bte.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsm<chn> F = a("ender_dragon", bsm.a.a(chn::new, bte.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsm<cnm> G = a("ender_pearl", bsm.a.<cnm>a(cnm::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<cjg> H = a("enderman", bsm.a.a(cjg::new, bte.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsm<cjh> I = a("endermite", bsm.a.a(cjh::new, bte.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsm<cjj> J = a("evoker", bsm.a.a(cjj::new, bte.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsm<cmu> K = a("evoker_fangs", bsm.a.<cmu>a(cmu::new, bte.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsm<cnn> L = a("experience_bottle", bsm.a.<cnn>a(cnn::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<bsr> M = a("experience_orb", bsm.a.<bsr>a(bsr::new, bte.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsm<cmv> N = a("eye_of_ender", bsm.a.<cmv>a(cmv::new, bte.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsm<cit> O = a("falling_block", bsm.a.<cit>a(cit::new, bte.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsm<cmx> P = a("firework_rocket", bsm.a.<cmx>a(cmx::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<cfb> Q = a("fox", bsm.a.a(cfb::new, bte.b).a(0.6F, 0.7F).b(0.4F).a(new ewf(0.0, 0.6375, -0.25)).a(8).a(dfj.oi));
   public static final bsm<cgl> R = a("frog", bsm.a.a(cgl::new, bte.b).a(0.5F, 0.5F).a(new ewf(0.0, 0.375, -0.25)).a(10));
   public static final bsm<cop> S = a("furnace_minecart", bsm.a.<cop>a(cop::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<cjk> T = a("ghast", bsm.a.a(cjk::new, bte.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsm<cjl> U = a("giant", bsm.a.a(cjl::new, bte.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsm<cil> V = a("glow_item_frame", bsm.a.<cil>a(cil::new, bte.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsm<bst> W = a("glow_squid", bsm.a.a(bst::new, bte.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsm<cgr> X = a("goat", bsm.a.a(cgr::new, bte.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsm<cjm> Y = a("guardian", bsm.a.a(cjm::new, bte.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsm<cku> Z = a("hoglin", bsm.a.a(cku::new, bte.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsm<coq> aa = a("hopper_minecart", bsm.a.<coq>a(coq::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<cgx> ab = a("horse", bsm.a.a(cgx::new, bte.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsm<cjn> ac = a("husk", bsm.a.a(cjn::new, bte.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsm<cjo> ad = a("illusioner", bsm.a.a(cjo::new, bte.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsm<bsw> ae = a("interaction", bsm.a.a(bsw::new, bte.h).a(0.0F, 0.0F).a(10));
   public static final bsm<cfd> af = a("iron_golem", bsm.a.a(cfd::new, bte.h).a(1.4F, 2.7F).a(10));
   public static final bsm<ciu> ag = a("item", bsm.a.<ciu>a(ciu::new, bte.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsm<bsf.g> ah = a("item_display", bsm.a.a(bsf.g::new, bte.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsm<cin> ai = a("item_frame", bsm.a.<cin>a(cin::new, bte.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsm<bti> aj = a("ominous_item_spawner", bsm.a.a(bti::new, bte.h).a(0.25F, 0.25F).a(8));
   public static final bsm<cna> ak = a("fireball", bsm.a.<cna>a(cna::new, bte.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsm<cio> al = a("leash_knot", bsm.a.<cio>a(cio::new, bte.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsm<bta> am = a("lightning_bolt", bsm.a.a(bta::new, bte.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsm<cgy> an = a("llama", bsm.a.a(cgy::new, bte.b).a(0.9F, 1.87F).b(1.7765F).a(new ewf(0.0, 1.37, -0.3)).a(10));
   public static final bsm<cnb> ao = a("llama_spit", bsm.a.<cnb>a(cnb::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<cjp> ap = a("magma_cube", bsm.a.a(cjp::new, bte.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsm<btc> aq = a("marker", bsm.a.a(btc::new, bte.h).a(0.0F, 0.0F).a(0));
   public static final bsm<col> ar = a("minecart", bsm.a.<col>a(col::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<cfe> as = a("mooshroom", bsm.a.a(cfe::new, bte.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsm<cha> at = a("mule", bsm.a.a(cha::new, bte.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsm<cff> au = a("ocelot", bsm.a.a(cff::new, bte.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsm<cip> av = a("painting", bsm.a.<cip>a(cip::new, bte.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsm<cfg> aw = a("panda", bsm.a.a(cfg::new, bte.b).a(1.3F, 1.25F).a(10));
   public static final bsm<cfh> ax = a("parrot", bsm.a.a(cfh::new, bte.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsm<cjs> ay = a("phantom", bsm.a.a(cjs::new, bte.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsm<cfi> az = a("pig", bsm.a.a(cfi::new, bte.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsm<cla> aA = a("piglin", bsm.a.a(cla::new, bte.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsm<cld> aB = a("piglin_brute", bsm.a.a(cld::new, bte.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsm<cjt> aC = a("pillager", bsm.a.a(cjt::new, bte.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsm<cfj> aD = a("polar_bear", bsm.a.a(cfj::new, bte.b).a(dfj.qP).a(1.4F, 1.4F).a(10));
   public static final bsm<cno> aE = a("potion", bsm.a.<cno>a(cno::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<cfk> aF = a("pufferfish", bsm.a.a(cfk::new, bte.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsm<cfl> aG = a("rabbit", bsm.a.a(cfl::new, bte.b).a(0.4F, 0.5F).a(8));
   public static final bsm<cjv> aH = a("ravager", bsm.a.a(cjv::new, bte.a).a(1.95F, 2.2F).a(new ewf(0.0, 2.2625, -0.0625)).a(10));
   public static final bsm<cfm> aI = a("salmon", bsm.a.a(cfm::new, bte.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsm<cfn> aJ = a("sheep", bsm.a.a(cfn::new, bte.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsm<cjw> aK = a("shulker", bsm.a.a(cjw::new, bte.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsm<cnf> aL = a("shulker_bullet", bsm.a.<cnf>a(cnf::new, bte.h).a(0.3125F, 0.3125F).a(8));
   public static final bsm<cjx> aM = a("silverfish", bsm.a.a(cjx::new, bte.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsm<cjy> aN = a("skeleton", bsm.a.a(cjy::new, bte.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsm<chb> aO = a("skeleton_horse", bsm.a.a(chb::new, bte.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsm<cjz> aP = a("slime", bsm.a.a(cjz::new, bte.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsm<cng> aQ = a("small_fireball", bsm.a.<cng>a(cng::new, bte.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsm<chi> aR = a("sniffer", bsm.a.a(chi::new, bte.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsm<cfp> aS = a("snow_golem", bsm.a.a(cfp::new, bte.h).a(dfj.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsm<cnh> aT = a("snowball", bsm.a.<cnh>a(cnh::new, bte.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsm<cor> aU = a("spawner_minecart", bsm.a.<cor>a(cor::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<cni> aV = a("spectral_arrow", bsm.a.<cni>a(cni::new, bte.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsm<ckb> aW = a("spider", bsm.a.a(ckb::new, bte.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsm<cfq> aX = a("squid", bsm.a.a(cfq::new, bte.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsm<ckc> aY = a("stray", bsm.a.a(ckc::new, bte.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfj.qP).a(8));
   public static final bsm<ckd> aZ = a("strider", bsm.a.a(ckd::new, bte.b).c().a(0.9F, 1.7F).a(10));
   public static final bsm<cgo> ba = a("tadpole", bsm.a.a(cgo::new, bte.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bsm<bsf.l> bb = a("text_display", bsm.a.a(bsf.l::new, bte.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsm<civ> bc = a("tnt", bsm.a.<civ>a(civ::new, bte.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsm<cos> bd = a("tnt_minecart", bsm.a.<cos>a(cos::new, bte.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsm<chd> be = a("trader_llama", bsm.a.a(chd::new, bte.b).a(0.9F, 1.87F).b(1.7765F).a(new ewf(0.0, 1.37, -0.3)).a(10));
   public static final bsm<cnp> bf = a("trident", bsm.a.<cnp>a(cnp::new, bte.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsm<cfr> bg = a("tropical_fish", bsm.a.a(cfr::new, bte.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsm<cfs> bh = a("turtle", bsm.a.a(cfs::new, bte.b).a(1.2F, 0.4F).a(new ewf(0.0, 0.55625, -0.25)).a(10));
   public static final bsm<cke> bi = a("vex", bsm.a.a(cke::new, bte.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsm<clx> bj = a("villager", bsm.a.<clx>a(clx::new, bte.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsm<ckf> bk = a("vindicator", bsm.a.a(ckf::new, bte.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsm<cmd> bl = a("wandering_trader", bsm.a.a(cmd::new, bte.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsm<clo> bm = a("warden", bsm.a.a(clo::new, bte.a).a(0.9F, 2.9F).a(3.15F).a(bsh.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsm<cnu> bn = a("wind_charge", bsm.a.<cnu>a(cnu::new, bte.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsm<ckg> bo = a("witch", bsm.a.a(ckg::new, bte.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsm<cih> bp = a("wither", bsm.a.a(cih::new, bte.a).c().a(dfj.cd).a(0.9F, 3.5F).a(10));
   public static final bsm<ckh> bq = a("wither_skeleton", bsm.a.a(ckh::new, bte.a).c().a(dfj.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsm<cnq> br = a("wither_skull", bsm.a.<cnq>a(cnq::new, bte.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsm<cfu> bs = a("wolf", bsm.a.a(cfu::new, bte.b).a(0.6F, 0.85F).b(0.68F).a(new ewf(0.0, 0.81875, -0.0625)).a(10));
   public static final bsm<cki> bt = a("zoglin", bsm.a.a(cki::new, bte.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsm<ckj> bu = a("zombie", bsm.a.<ckj>a(ckj::new, bte.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsm<chf> bv = a("zombie_horse", bsm.a.a(chf::new, bte.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsm<ckk> bw = a("zombie_villager", bsm.a.a(ckk::new, bte.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsm<ckl> bx = a("zombified_piglin", bsm.a.a(ckl::new, bte.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsm<cmk> by = a("player", bsm.a.<cmk>a(bte.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmk.bV).a(32).b(2));
   public static final bsm<cmy> bz = a("fishing_bobber", bsm.a.<cmy>a(cmy::new, bte.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsm.b<T> bF;
   private final bte bG;
   private final ImmutableSet<dfh> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private wu bP;
   @Nullable
   private akj<eqz> bQ;
   private final bsj bR;
   private final float bS;
   private final coy bT;

   private static <T extends bsg> bsm<T> a(String $$0, bsm.a<T> $$1) {
      return jw.a(lq.f, $$0, $$1.a($$0));
   }

   public static akk a(bsm<?> $$0) {
      return lq.f.b($$0);
   }

   public static Optional<bsm<?>> a(String $$0) {
      return lq.f.b(akk.a($$0));
   }

   public bsm(bsm.b<T> $$0, bte $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfh> $$6, bsj $$7, float $$8, int $$9, int $$10, coy $$11) {
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
   public T a(aqm $$0, @Nullable cuc $$1, @Nullable cmk $$2, ja $$3, btf $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsg> Consumer<T> a(aqm $$0, cuc $$1, @Nullable cmk $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsg> Consumer<T> a(Consumer<T> $$0, aqm $$1, cuc $$2, @Nullable cmk $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsg> Consumer<T> a(Consumer<T> $$0, cuc $$1) {
      wu $$2 = $$1.a(kn.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsg> Consumer<T> b(Consumer<T> $$0, aqm $$1, cuc $$2, @Nullable cmk $$3) {
      cwq $$4 = $$2.a(kn.M, cwq.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqm $$0, ja $$1, btf $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqm $$0, @Nullable Consumer<T> $$1, ja $$2, btf $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqm $$0, @Nullable Consumer<T> $$1, ja $$2, btf $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dcf)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayg.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btd $$9) {
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

   protected static double a(dci $$0, ja $$1, boolean $$2, ewa $$3) {
      ewa $$4 = new ewa($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewy> $$5 = $$0.d(null, $$4);
      return 1.0 + ewv.a(jf.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dcf $$0, @Nullable cmk $$1, @Nullable bsg $$2, cwq $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cQ() || $$1 != null && $$4.ai().f($$1.fY())) {
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

   public bte f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lq.f.b(this));
      }

      return this.bO;
   }

   public wu h() {
      if (this.bP == null) {
         this.bP = wu.c(this.g());
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

   public akj<eqz> k() {
      if (this.bQ == null) {
         akk $$0 = lq.f.b(this);
         this.bQ = akj.a(lr.bb, $$0.d("entities/"));
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
   public coy i() {
      return this.bT;
   }

   @Nullable
   public T a(dcf $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsg> a(tx $$0, dcf $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ewa a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ewa($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsk $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eou.a($$0) ? true : $$0.a(dfj.cd) || $$0.a(dfj.oi) || $$0.a(dfj.dQ) || $$0.a(dfj.qP);
      }
   }

   public bsj n() {
      return this.bR;
   }

   public static Optional<bsm<?>> a(tx $$0) {
      return lq.f.b(new akk($$0.l("id")));
   }

   @Nullable
   public static bsg a(tx $$0, dcf $$1, Function<bsg, bsg> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ud $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsg $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsg)$$3;
      }).orElse(null);
   }

   public static Stream<bsg> a(final List<? extends uu> $$0, final dcf $$1) {
      final Spliterator<? extends uu> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsg>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsg> $$0x) {
            return $$2.tryAdvance($$2xx -> bsm.a((tx)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsg> trySplit() {
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

   private static Optional<bsg> b(tx $$0, dcf $$1) {
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

   public boolean a(awm<bsm<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jn<bsm<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsg $$0) {
      return (T)($$0.al() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsg> a() {
      return bsg.class;
   }

   @Deprecated
   public jj.c<bsm<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsg> {
      private final bsm.b<T> a;
      private final bte b;
      private ImmutableSet<dfh> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsj j = bsj.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsi.a l = bsi.a();
      private coy m = cpa.f;

      private a(bsm.b<T> $$0, bte $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bte.b || $$1 == bte.h;
      }

      public static <T extends bsg> bsm.a<T> a(bsm.b<T> $$0, bte $$1) {
         return new bsm.a<>($$0, $$1);
      }

      public static <T extends bsg> bsm.a<T> a(bte $$0) {
         return new bsm.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsm.a<T> a(float $$0, float $$1) {
         this.j = bsj.b($$0, $$1);
         return this;
      }

      public bsm.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsm.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsm.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsh.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsm.a<T> a(ewf... $$0) {
         for (ewf $$1 : $$0) {
            this.l = this.l.a(bsh.a, $$1);
         }

         return this;
      }

      public bsm.a<T> a(ewf $$0) {
         return this.a(bsh.b, $$0);
      }

      public bsm.a<T> c(float $$0) {
         return this.a(bsh.b, 0.0F, -$$0, 0.0F);
      }

      public bsm.a<T> d(float $$0) {
         return this.a(bsh.c, 0.0F, $$0, 0.0F);
      }

      public bsm.a<T> a(bsh $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsm.a<T> a(bsh $$0, ewf $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsm.a<T> a() {
         this.e = false;
         return this;
      }

      public bsm.a<T> b() {
         this.d = false;
         return this;
      }

      public bsm.a<T> c() {
         this.f = true;
         return this;
      }

      public bsm.a<T> a(dfh... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsm.a<T> d() {
         this.g = true;
         return this;
      }

      public bsm.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsm.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsm.a<T> a(cow... $$0) {
         this.m = cpa.d.a($$0);
         return this;
      }

      public bsm<T> a(String $$0) {
         if (this.d) {
            ac.a(bgg.A, $$0);
         }

         return new bsm<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsg> {
      T create(bsm<T> var1, dcf var2);
   }
}
