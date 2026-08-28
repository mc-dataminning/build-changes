import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bwm<T extends bwd> implements cue, eel<bwd, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final je.c<bwm<?>> bW = mf.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bwm<ctm> a = a("acacia_boat", bwm.a.a(a(() -> czc.oJ), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> b = a("acacia_chest_boat", bwm.a.a(b(() -> czc.oK), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ckd> c = a("allay", bwm.a.a(ckd::new, bxf.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bwm<bvv> d = a("area_effect_cloud", bwm.a.<bvv>a(bvv::new, bxf.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwm<ckg> e = a("armadillo", bwm.a.a(ckg::new, bxf.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bwm<cms> f = a("armor_stand", bwm.a.<cms>a(cms::new, bxf.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bwm<cri> g = a("arrow", bwm.a.<cri>a(cri::new, bxf.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwm<ckj> h = a("axolotl", bwm.a.a(ckj::new, bxf.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bwm<cto> i = a("bamboo_chest_raft", bwm.a.a(d(() -> czc.oU), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cub> j = a("bamboo_raft", bwm.a.a(c(() -> czc.oT), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cil> k = a("bat", bwm.a.a(cil::new, bxf.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bwm<cit> l = a("bee", bwm.a.a(cit::new, bxf.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bwm<ctm> m = a("birch_boat", bwm.a.a(a(() -> czc.oF), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> n = a("birch_chest_boat", bwm.a.a(b(() -> czc.oG), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cni> o = a("blaze", bwm.a.a(cni::new, bxf.a).c().a(0.6F, 1.8F).a(8));
   public static final bwm<bwa.b> p = a("block_display", bwm.a.a(bwa.b::new, bxf.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwm<cnj> q = a("bogged", bwm.a.a(cnj::new, bxf.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwm<cow> r = a("breeze", bwm.a.a(cow::new, bxf.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bwm<csk> s = a("breeze_wind_charge", bwm.a.<csk>a(csk::new, bxf.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwm<cko> t = a("camel", bwm.a.a(cko::new, bxf.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bwm<civ> u = a("cat", bwm.a.a(civ::new, bxf.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bwm<cnk> v = a("cave_spider", bwm.a.a(cnk::new, bxf.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bwm<ctm> w = a("cherry_boat", bwm.a.a(a(() -> czc.oL), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> x = a("cherry_chest_boat", bwm.a.a(b(() -> czc.oM), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctt> y = a("chest_minecart", bwm.a.a(ctt::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<ciy> z = a("chicken", bwm.a.a(ciy::new, bxf.b).a(0.4F, 0.7F).b(0.644F).a(new fei(0.0, 0.7, -0.1)).a(10));
   public static final bwm<ciz> A = a("cod", bwm.a.a(ciz::new, bxf.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bwm<ctu> B = a("command_block_minecart", bwm.a.a(ctu::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<cja> C = a("cow", bwm.a.a(cja::new, bxf.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwm<cpe> D = a("creaking", bwm.a.a(cpe::new, bxf.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bwm<cnl> E = a("creeper", bwm.a.a(cnl::new, bxf.a).a(0.6F, 1.7F).a(8));
   public static final bwm<ctm> F = a("dark_oak_boat", bwm.a.a(a(() -> czc.oN), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> G = a("dark_oak_chest_boat", bwm.a.a(b(() -> czc.oO), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cjd> H = a("dolphin", bwm.a.a(cjd::new, bxf.f).a(0.9F, 0.6F).b(0.3F));
   public static final bwm<cle> I = a("donkey", bwm.a.a(cle::new, bxf.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bwm<crj> J = a("dragon_fireball", bwm.a.<crj>a(crj::new, bxf.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwm<cnn> K = a("drowned", bwm.a.a(cnn::new, bxf.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwm<csb> L = a("egg", bwm.a.<csb>a(csb::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<cno> M = a("elder_guardian", bwm.a.a(cno::new, bxf.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bwm<cnp> N = a("enderman", bwm.a.a(cnp::new, bxf.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bwm<cnq> O = a("endermite", bwm.a.a(cnq::new, bxf.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwm<clw> P = a("ender_dragon", bwm.a.a(clw::new, bxf.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bwm<csc> Q = a("ender_pearl", bwm.a.<csc>a(csc::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<clv> R = a("end_crystal", bwm.a.<clv>a(clv::new, bxf.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwm<cns> S = a("evoker", bwm.a.a(cns::new, bxf.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwm<crk> T = a("evoker_fangs", bwm.a.<crk>a(crk::new, bxf.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bwm<csd> U = a("experience_bottle", bwm.a.<csd>a(csd::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<bwr> V = a("experience_orb", bwm.a.<bwr>a(bwr::new, bxf.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bwm<crl> W = a("eye_of_ender", bwm.a.<crl>a(crl::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bwm<cnc> X = a("falling_block", bwm.a.<cnc>a(cnc::new, bxf.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bwm<crq> Y = a("fireball", bwm.a.<crq>a(crq::new, bxf.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwm<crn> Z = a("firework_rocket", bwm.a.<crn>a(crn::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<cjf> aa = a("fox", bwm.a.a(cjf::new, bxf.b).a(0.6F, 0.7F).b(0.4F).a(new fei(0.0, 0.6375, -0.25)).a(8).a(dmc.oL));
   public static final bwm<ckr> ab = a("frog", bwm.a.a(ckr::new, bxf.b).a(0.5F, 0.5F).a(new fei(0.0, 0.375, -0.25)).a(10));
   public static final bwm<ctv> ac = a("furnace_minecart", bwm.a.a(ctv::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<cnt> ad = a("ghast", bwm.a.a(cnt::new, bxf.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bwm<cnu> ae = a("giant", bwm.a.a(cnu::new, bxf.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bwm<cmu> af = a("glow_item_frame", bwm.a.<cmu>a(cmu::new, bxf.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwm<bwt> ag = a("glow_squid", bwm.a.a(bwt::new, bxf.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bwm<ckz> ah = a("goat", bwm.a.a(ckz::new, bxf.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bwm<cnv> ai = a("guardian", bwm.a.a(cnv::new, bxf.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bwm<cph> aj = a("hoglin", bwm.a.a(cph::new, bxf.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwm<ctw> ak = a("hopper_minecart", bwm.a.a(ctw::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<clf> al = a("horse", bwm.a.a(clf::new, bxf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bwm<cnw> am = a("husk", bwm.a.a(cnw::new, bxf.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bwm<cnx> an = a("illusioner", bwm.a.a(cnx::new, bxf.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwm<bww> ao = a("interaction", bwm.a.a(bww::new, bxf.h).e().a(0.0F, 0.0F).a(10));
   public static final bwm<cjg> ap = a("iron_golem", bwm.a.a(cjg::new, bxf.h).a(1.4F, 2.7F).a(10));
   public static final bwm<cnd> aq = a("item", bwm.a.<cnd>a(cnd::new, bxf.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bwm<bwa.g> ar = a("item_display", bwm.a.a(bwa.g::new, bxf.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwm<cmw> as = a("item_frame", bwm.a.<cmw>a(cmw::new, bxf.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwm<ctm> at = a("jungle_boat", bwm.a.a(a(() -> czc.oH), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> au = a("jungle_chest_boat", bwm.a.a(b(() -> czc.oI), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cmx> av = a("leash_knot", bwm.a.<cmx>a(cmx::new, bxf.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bwm<bxb> aw = a("lightning_bolt", bwm.a.a(bxb::new, bxf.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwm<clg> ax = a("llama", bwm.a.a(clg::new, bxf.b).a(0.9F, 1.87F).b(1.7765F).a(new fei(0.0, 1.37, -0.3)).a(10));
   public static final bwm<crr> ay = a("llama_spit", bwm.a.<crr>a(crr::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<cny> az = a("magma_cube", bwm.a.a(cny::new, bxf.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bwm<ctm> aA = a("mangrove_boat", bwm.a.a(a(() -> czc.oR), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> aB = a("mangrove_chest_boat", bwm.a.a(b(() -> czc.oS), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<bxd> aC = a("marker", bwm.a.a(bxd::new, bxf.h).e().a(0.0F, 0.0F).a(0));
   public static final bwm<ctr> aD = a("minecart", bwm.a.a(ctr::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<cjh> aE = a("mooshroom", bwm.a.a(cjh::new, bxf.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwm<cli> aF = a("mule", bwm.a.a(cli::new, bxf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bwm<ctm> aG = a("oak_boat", bwm.a.a(a(() -> czc.oB), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> aH = a("oak_chest_boat", bwm.a.a(b(() -> czc.oC), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cji> aI = a("ocelot", bwm.a.a(cji::new, bxf.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bwm<bxi> aJ = a("ominous_item_spawner", bwm.a.a(bxi::new, bxf.h).e().a(0.25F, 0.25F).a(8));
   public static final bwm<cmy> aK = a("painting", bwm.a.<cmy>a(cmy::new, bxf.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwm<ctm> aL = a("pale_oak_boat", bwm.a.a(a(() -> czc.oP), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> aM = a("pale_oak_chest_boat", bwm.a.a(b(() -> czc.oQ), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cjj> aN = a("panda", bwm.a.a(cjj::new, bxf.b).a(1.3F, 1.25F).a(10));
   public static final bwm<cjk> aO = a("parrot", bwm.a.a(cjk::new, bxf.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bwm<cob> aP = a("phantom", bwm.a.a(cob::new, bxf.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bwm<cjl> aQ = a("pig", bwm.a.a(cjl::new, bxf.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bwm<cpn> aR = a("piglin", bwm.a.a(cpn::new, bxf.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwm<cpq> aS = a("piglin_brute", bwm.a.a(cpq::new, bxf.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwm<coc> aT = a("pillager", bwm.a.a(coc::new, bxf.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwm<cjo> aU = a("polar_bear", bwm.a.a(cjo::new, bxf.b).a(dmc.ru).a(1.4F, 1.4F).a(10));
   public static final bwm<csf> aV = a("splash_potion", bwm.a.<csf>a(csf::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<cse> aW = a("lingering_potion", bwm.a.<cse>a(cse::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<cjp> aX = a("pufferfish", bwm.a.a(cjp::new, bxf.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bwm<cjq> aY = a("rabbit", bwm.a.a(cjq::new, bxf.b).a(0.4F, 0.5F).a(8));
   public static final bwm<coe> aZ = a("ravager", bwm.a.a(coe::new, bxf.a).a(1.95F, 2.2F).a(new fei(0.0, 2.2625, -0.0625)).a(10));
   public static final bwm<cjr> ba = a("salmon", bwm.a.a(cjr::new, bxf.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bwm<cjs> bb = a("sheep", bwm.a.a(cjs::new, bxf.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bwm<cof> bc = a("shulker", bwm.a.a(cof::new, bxf.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bwm<crv> bd = a("shulker_bullet", bwm.a.<crv>a(crv::new, bxf.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bwm<cog> be = a("silverfish", bwm.a.a(cog::new, bxf.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwm<coh> bf = a("skeleton", bwm.a.a(coh::new, bxf.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwm<clj> bg = a("skeleton_horse", bwm.a.a(clj::new, bxf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwm<coi> bh = a("slime", bwm.a.a(coi::new, bxf.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bwm<crw> bi = a("small_fireball", bwm.a.<crw>a(crw::new, bxf.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwm<clq> bj = a("sniffer", bwm.a.a(clq::new, bxf.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bwm<crx> bk = a("snowball", bwm.a.<crx>a(crx::new, bxf.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwm<cju> bl = a("snow_golem", bwm.a.a(cju::new, bxf.h).a(dmc.ru).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bwm<ctx> bm = a("spawner_minecart", bwm.a.a(ctx::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<cry> bn = a("spectral_arrow", bwm.a.<cry>a(cry::new, bxf.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwm<cok> bo = a("spider", bwm.a.a(cok::new, bxf.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bwm<ctm> bp = a("spruce_boat", bwm.a.a(a(() -> czc.oD), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<ctn> bq = a("spruce_chest_boat", bwm.a.a(b(() -> czc.oE), bxf.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwm<cjv> br = a("squid", bwm.a.a(cjv::new, bxf.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bwm<col> bs = a("stray", bwm.a.a(col::new, bxf.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dmc.ru).a(8));
   public static final bwm<com> bt = a("strider", bwm.a.a(com::new, bxf.b).c().a(0.9F, 1.7F).a(10));
   public static final bwm<ckw> bu = a("tadpole", bwm.a.a(ckw::new, bxf.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bwm<bwa.k> bv = a("text_display", bwm.a.a(bwa.k::new, bxf.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwm<cne> bw = a("tnt", bwm.a.<cne>a(cne::new, bxf.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bwm<cty> bx = a("tnt_minecart", bwm.a.a(cty::new, bxf.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwm<cll> by = a("trader_llama", bwm.a.a(cll::new, bxf.b).a(0.9F, 1.87F).b(1.7765F).a(new fei(0.0, 1.37, -0.3)).a(10));
   public static final bwm<csg> bz = a("trident", bwm.a.<csg>a(csg::new, bxf.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwm<cjx> bA = a("tropical_fish", bwm.a.a(cjx::new, bxf.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bwm<cjy> bB = a("turtle", bwm.a.a(cjy::new, bxf.b).a(1.2F, 0.4F).a(new fei(0.0, 0.55625, -0.25)).a(10));
   public static final bwm<coo> bC = a("vex", bwm.a.a(coo::new, bxf.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bwm<cqk> bD = a("villager", bwm.a.<cqk>a(cqk::new, bxf.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwm<cop> bE = a("vindicator", bwm.a.a(cop::new, bxf.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwm<cqq> bF = a("wandering_trader", bwm.a.a(cqq::new, bxf.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwm<cqb> bG = a("warden", bwm.a.a(cqb::new, bxf.a).a(0.9F, 2.9F).a(3.15F).a(bwe.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bwm<csl> bH = a("wind_charge", bwm.a.<csl>a(csl::new, bxf.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwm<coq> bI = a("witch", bwm.a.a(coq::new, bxf.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bwm<cmq> bJ = a("wither", bwm.a.a(cmq::new, bxf.a).c().a(dmc.cl).a(0.9F, 3.5F).a(10));
   public static final bwm<cor> bK = a("wither_skeleton", bwm.a.a(cor::new, bxf.a).c().a(dmc.cl).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bwm<csh> bL = a("wither_skull", bwm.a.<csh>a(csh::new, bxf.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwm<cka> bM = a("wolf", bwm.a.a(cka::new, bxf.b).a(0.6F, 0.85F).b(0.68F).a(new fei(0.0, 0.81875, -0.0625)).a(10));
   public static final bwm<cos> bN = a("zoglin", bwm.a.a(cos::new, bxf.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwm<cot> bO = a("zombie", bwm.a.<cot>a(cot::new, bxf.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwm<cln> bP = a("zombie_horse", bwm.a.a(cln::new, bxf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwm<cou> bQ = a("zombie_villager", bwm.a.a(cou::new, bxf.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bwm<cov> bR = a("zombified_piglin", bwm.a.a(cov::new, bxf.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bwm<cqy> bS = a("player", bwm.a.<cqy>a(bxf.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cqy.bH).a(32).b(2));
   public static final bwm<cro> bT = a("fishing_bobber", bwm.a.<cro>a(cro::new, bxf.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bwm<?>> bZ = Set.of(X, B, bm);
   private final bwm.b<T> ca;
   private final bxf cb;
   private final ImmutableSet<dma> cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final int ch;
   private final int ci;
   private final String cj;
   @Nullable
   private wy ck;
   private final Optional<alf<eze>> cl;
   private final bwg cm;
   private final float cn;
   private final cuh co;

   private static <T extends bwd> bwm<T> a(alf<bwm<?>> $$0, bwm.a<T> $$1) {
      return jr.a(mf.f, $$0, $$1.a($$0));
   }

   private static alf<bwm<?>> b(String $$0) {
      return alf.a(mg.B, alg.b($$0));
   }

   private static <T extends bwd> bwm<T> a(String $$0, bwm.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alg a(bwm<?> $$0) {
      return mf.f.b($$0);
   }

   public static Optional<bwm<?>> a(String $$0) {
      return mf.f.b(alg.c($$0));
   }

   public bwm(
      bwm.b<T> $$0,
      bxf $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dma> $$6,
      bwg $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alf<eze>> $$12,
      cuh $$13
   ) {
      this.ca = $$0;
      this.cb = $$1;
      this.cg = $$5;
      this.cd = $$2;
      this.ce = $$3;
      this.cf = $$4;
      this.cc = $$6;
      this.cm = $$7;
      this.cn = $$8;
      this.ch = $$9;
      this.ci = $$10;
      this.cj = $$11;
      this.cl = $$12;
      this.co = $$13;
   }

   @Nullable
   public T a(arq $$0, @Nullable cyy $$1, @Nullable bxc $$2, iu $$3, bwl $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwd> Consumer<T> a(div $$0, cyy $$1, @Nullable bxc $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwd> Consumer<T> a(Consumer<T> $$0, div $$1, cyy $$2, @Nullable bxc $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwd> Consumer<T> a(Consumer<T> $$0, cyy $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwd> Consumer<T> b(Consumer<T> $$0, div $$1, cyy $$2, @Nullable bxc $$3) {
      dbg $$4 = $$2.a(kj.Y, dbg.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arq $$0, iu $$1, bwl $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arq $$0, @Nullable Consumer<T> $$1, iu $$2, bwl $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bxe $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(arq $$0, @Nullable Consumer<T> $$1, iu $$2, bwl $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cR());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azm.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bxe $$9) {
            $$9.aX = $$9.dL();
            $$9.aV = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(diy $$0, iu $$1, boolean $$2, fed $$3) {
      fed $$4 = new fed($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ffc> $$5 = $$0.d(null, $$4);
      return 1.0 + fez.a(ja.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(div $$0, @Nullable bxc $$1, @Nullable bwd $$2, dbg $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bwm<?> $$5 = $$3.a($$4.ba(), mg.B);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 instanceof cqy $$6 && $$4.ag().f($$6.gh())) {
               $$3.a($$2);
            }
         }
      }
   }

   public boolean b() {
      return this.cd;
   }

   public boolean c() {
      return this.ce;
   }

   public boolean d() {
      return this.cf;
   }

   public boolean e() {
      return this.cg;
   }

   public bxf f() {
      return this.cb;
   }

   public String g() {
      return this.cj;
   }

   public wy h() {
      if (this.ck == null) {
         this.ck = wy.c(this.g());
      }

      return this.ck;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<alf<eze>> j() {
      return this.cl;
   }

   public float l() {
      return this.cm.a();
   }

   public float m() {
      return this.cm.b();
   }

   @Override
   public cuh k() {
      return this.co;
   }

   @Nullable
   public T a(div $$0, bwl $$1) {
      return !this.a($$0.K()) ? null : this.ca.create(this, $$0);
   }

   public static Optional<bwd> a(tz $$0, div $$1, bwl $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fed a(double $$0, double $$1, double $$2) {
      float $$3 = this.cn * this.l() / 2.0F;
      float $$4 = this.cn * this.m();
      return new fed($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dzz $$0) {
      if (this.cc.contains($$0.b())) {
         return false;
      } else {
         return !this.cf && ewt.a($$0) ? true : $$0.a(dmc.cl) || $$0.a(dmc.oL) || $$0.a(dmc.ee) || $$0.a(dmc.ru);
      }
   }

   public bwg n() {
      return this.cm;
   }

   public static Optional<bwm<?>> a(tz $$0) {
      return mf.f.b(alg.a($$0.l("id")));
   }

   @Nullable
   public static bwd a(tz $$0, div $$1, bwl $$2, Function<bwd, bwd> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            uf $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bwd $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bwd)$$4;
      }).orElse(null);
   }

   public static Stream<bwd> a(final List<? extends uw> $$0, final div $$1, final bwl $$2) {
      final Spliterator<? extends uw> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bwd>() {
         @Override
         public boolean tryAdvance(Consumer<? super bwd> $$0x) {
            return $$3.tryAdvance($$3xx -> bwm.a((tz)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Nullable
         @Override
         public Spliterator<bwd> trySplit() {
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

   private static Optional<bwd> b(tz $$0, div $$1, bwl $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bV.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.ch;
   }

   public int p() {
      return this.ci;
   }

   public boolean q() {
      return this != bS && this != ay && this != bJ && this != k && this != as && this != af && this != av && this != aK && this != R && this != T;
   }

   public boolean a(axr<bwm<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ji<bwm<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bwd $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bwd> a() {
      return bwd.class;
   }

   @Deprecated
   public je.c<bwm<?>> r() {
      return this.bW;
   }

   private static bwm.b<ctm> a(Supplier<cyu> $$0) {
      return ($$1, $$2) -> new ctm($$1, $$2, $$0);
   }

   private static bwm.b<ctn> b(Supplier<cyu> $$0) {
      return ($$1, $$2) -> new ctn($$1, $$2, $$0);
   }

   private static bwm.b<cub> c(Supplier<cyu> $$0) {
      return ($$1, $$2) -> new cub($$1, $$2, $$0);
   }

   private static bwm.b<cto> d(Supplier<cyu> $$0) {
      return ($$1, $$2) -> new cto($$1, $$2, $$0);
   }

   public boolean s() {
      return bZ.contains(this);
   }

   public static class a<T extends bwd> {
      private final bwm.b<T> a;
      private final bxf b;
      private ImmutableSet<dma> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bwg j = bwg.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwf.a l = bwf.a();
      private cuh m = cuj.g;
      private aky<bwm<?>, Optional<alf<eze>>> n = $$0x -> Optional.of(alf.a(mg.bp, $$0x.a().f("entities/")));
      private final aky<bwm<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bwm.b<T> $$0, bxf $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bxf.b || $$1 == bxf.h;
      }

      public static <T extends bwd> bwm.a<T> a(bwm.b<T> $$0, bxf $$1) {
         return new bwm.a<>($$0, $$1);
      }

      public static <T extends bwd> bwm.a<T> a(bxf $$0) {
         return new bwm.a<>(($$0x, $$1) -> null, $$0);
      }

      public bwm.a<T> a(float $$0, float $$1) {
         this.j = bwg.b($$0, $$1);
         return this;
      }

      public bwm.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bwm.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bwm.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bwe.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bwm.a<T> a(fei... $$0) {
         for (fei $$1 : $$0) {
            this.l = this.l.a(bwe.a, $$1);
         }

         return this;
      }

      public bwm.a<T> a(fei $$0) {
         return this.a(bwe.b, $$0);
      }

      public bwm.a<T> c(float $$0) {
         return this.a(bwe.b, 0.0F, -$$0, 0.0F);
      }

      public bwm.a<T> d(float $$0) {
         return this.a(bwe.c, 0.0F, $$0, 0.0F);
      }

      public bwm.a<T> a(bwe $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bwm.a<T> a(bwe $$0, fei $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bwm.a<T> a() {
         this.e = false;
         return this;
      }

      public bwm.a<T> b() {
         this.d = false;
         return this;
      }

      public bwm.a<T> c() {
         this.f = true;
         return this;
      }

      public bwm.a<T> a(dma... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bwm.a<T> d() {
         this.g = true;
         return this;
      }

      public bwm.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bwm.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bwm.a<T> a(cuf... $$0) {
         this.m = cuj.e.a($$0);
         return this;
      }

      public bwm.a<T> e() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public bwm<T> a(alf<bwm<?>> $$0) {
         if (this.d) {
            af.a(biw.C, $$0.a().toString());
         }

         return new bwm<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bwd> {
      @Nullable
      T create(bwm<T> var1, div var2);
   }
}
