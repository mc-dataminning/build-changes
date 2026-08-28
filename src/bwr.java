import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bwr<T extends bwi> implements cut, eff<bwi, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jf.c<bwr<?>> bW = mg.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bwr<cub> a = a("acacia_boat", bwr.a.a(a(() -> czr.oM), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> b = a("acacia_chest_boat", bwr.a.a(b(() -> czr.oN), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cki> c = a("allay", bwr.a.a(cki::new, bxm.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bwr<bwa> d = a("area_effect_cloud", bwr.a.<bwa>a(bwa::new, bxm.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<ckl> e = a("armadillo", bwr.a.a(ckl::new, bxm.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bwr<cng> f = a("armor_stand", bwr.a.<cng>a(cng::new, bxm.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bwr<crx> g = a("arrow", bwr.a.<crx>a(crx::new, bxm.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwr<cko> h = a("axolotl", bwr.a.a(cko::new, bxm.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bwr<cud> i = a("bamboo_chest_raft", bwr.a.a(d(() -> czr.oX), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuq> j = a("bamboo_raft", bwr.a.a(c(() -> czr.oW), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cis> k = a("bat", bwr.a.a(cis::new, bxm.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bwr<cja> l = a("bee", bwr.a.a(cja::new, bxm.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bwr<cub> m = a("birch_boat", bwr.a.a(a(() -> czr.oI), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> n = a("birch_chest_boat", bwr.a.a(b(() -> czr.oJ), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cnw> o = a("blaze", bwr.a.a(cnw::new, bxm.a).c().a(0.6F, 1.8F).a(8));
   public static final bwr<bwf.b> p = a("block_display", bwr.a.a(bwf.b::new, bxm.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwr<cnx> q = a("bogged", bwr.a.a(cnx::new, bxm.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwr<cpk> r = a("breeze", bwr.a.a(cpk::new, bxm.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bwr<csz> s = a("breeze_wind_charge", bwr.a.<csz>a(csz::new, bxm.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwr<ckt> t = a("camel", bwr.a.a(ckt::new, bxm.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bwr<cjc> u = a("cat", bwr.a.a(cjc::new, bxm.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bwr<cny> v = a("cave_spider", bwr.a.a(cny::new, bxm.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bwr<cub> w = a("cherry_boat", bwr.a.a(a(() -> czr.oO), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> x = a("cherry_chest_boat", bwr.a.a(b(() -> czr.oP), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cui> y = a("chest_minecart", bwr.a.a(cui::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cjf> z = a("chicken", bwr.a.a(cjf::new, bxm.b).a(0.4F, 0.7F).b(0.644F).a(new ffc(0.0, 0.7, -0.1)).a(10));
   public static final bwr<cji> A = a("cod", bwr.a.a(cji::new, bxm.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bwr<cuj> B = a("command_block_minecart", bwr.a.a(cuj::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cjj> C = a("cow", bwr.a.a(cjj::new, bxm.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwr<cps> D = a("creaking", bwr.a.a(cps::new, bxm.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bwr<cnz> E = a("creeper", bwr.a.a(cnz::new, bxm.a).a(0.6F, 1.7F).a(8));
   public static final bwr<cub> F = a("dark_oak_boat", bwr.a.a(a(() -> czr.oQ), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> G = a("dark_oak_chest_boat", bwr.a.a(b(() -> czr.oR), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cjm> H = a("dolphin", bwr.a.a(cjm::new, bxm.f).a(0.9F, 0.6F).b(0.3F));
   public static final bwr<clj> I = a("donkey", bwr.a.a(clj::new, bxm.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bwr<cry> J = a("dragon_fireball", bwr.a.<cry>a(cry::new, bxm.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwr<cob> K = a("drowned", bwr.a.a(cob::new, bxm.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<csq> L = a("egg", bwr.a.<csq>a(csq::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<coc> M = a("elder_guardian", bwr.a.a(coc::new, bxm.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bwr<cod> N = a("enderman", bwr.a.a(cod::new, bxm.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bwr<coe> O = a("endermite", bwr.a.a(coe::new, bxm.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwr<cmk> P = a("ender_dragon", bwr.a.a(cmk::new, bxm.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bwr<csr> Q = a("ender_pearl", bwr.a.<csr>a(csr::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cmj> R = a("end_crystal", bwr.a.<cmj>a(cmj::new, bxm.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwr<cog> S = a("evoker", bwr.a.a(cog::new, bxm.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<crz> T = a("evoker_fangs", bwr.a.<crz>a(crz::new, bxm.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bwr<css> U = a("experience_bottle", bwr.a.<css>a(css::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<bww> V = a("experience_orb", bwr.a.<bww>a(bww::new, bxm.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bwr<csa> W = a("eye_of_ender", bwr.a.<csa>a(csa::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bwr<cnq> X = a("falling_block", bwr.a.<cnq>a(cnq::new, bxm.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bwr<csf> Y = a("fireball", bwr.a.<csf>a(csf::new, bxm.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwr<csc> Z = a("firework_rocket", bwr.a.<csc>a(csc::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cjo> aa = a("fox", bwr.a.a(cjo::new, bxm.b).a(0.6F, 0.7F).b(0.4F).a(new ffc(0.0, 0.6375, -0.25)).a(8).a(dmt.oO));
   public static final bwr<ckw> ab = a("frog", bwr.a.a(ckw::new, bxm.b).a(0.5F, 0.5F).a(new ffc(0.0, 0.375, -0.25)).a(10));
   public static final bwr<cuk> ac = a("furnace_minecart", bwr.a.a(cuk::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<coh> ad = a("ghast", bwr.a.a(coh::new, bxm.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bwr<coi> ae = a("giant", bwr.a.a(coi::new, bxm.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bwr<cni> af = a("glow_item_frame", bwr.a.<cni>a(cni::new, bxm.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<bwy> ag = a("glow_squid", bwr.a.a(bwy::new, bxm.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bwr<cle> ah = a("goat", bwr.a.a(cle::new, bxm.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bwr<coj> ai = a("guardian", bwr.a.a(coj::new, bxm.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bwr<cpv> aj = a("hoglin", bwr.a.a(cpv::new, bxm.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwr<cul> ak = a("hopper_minecart", bwr.a.a(cul::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<clk> al = a("horse", bwr.a.a(clk::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bwr<cok> am = a("husk", bwr.a.a(cok::new, bxm.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bwr<col> an = a("illusioner", bwr.a.a(col::new, bxm.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<bxd> ao = a("interaction", bwr.a.a(bxd::new, bxm.h).e().a(0.0F, 0.0F).a(10));
   public static final bwr<cjp> ap = a("iron_golem", bwr.a.a(cjp::new, bxm.h).a(1.4F, 2.7F).a(10));
   public static final bwr<cnr> aq = a("item", bwr.a.<cnr>a(cnr::new, bxm.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bwr<bwf.g> ar = a("item_display", bwr.a.a(bwf.g::new, bxm.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwr<cnk> as = a("item_frame", bwr.a.<cnk>a(cnk::new, bxm.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<cub> at = a("jungle_boat", bwr.a.a(a(() -> czr.oK), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> au = a("jungle_chest_boat", bwr.a.a(b(() -> czr.oL), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cnl> av = a("leash_knot", bwr.a.<cnl>a(cnl::new, bxm.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<bxi> aw = a("lightning_bolt", bwr.a.a(bxi::new, bxm.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwr<cll> ax = a("llama", bwr.a.a(cll::new, bxm.b).a(0.9F, 1.87F).b(1.7765F).a(new ffc(0.0, 1.37, -0.3)).a(10));
   public static final bwr<csg> ay = a("llama_spit", bwr.a.<csg>a(csg::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<com> az = a("magma_cube", bwr.a.a(com::new, bxm.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bwr<cub> aA = a("mangrove_boat", bwr.a.a(a(() -> czr.oU), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> aB = a("mangrove_chest_boat", bwr.a.a(b(() -> czr.oV), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<bxk> aC = a("marker", bwr.a.a(bxk::new, bxm.h).e().a(0.0F, 0.0F).a(0));
   public static final bwr<cug> aD = a("minecart", bwr.a.a(cug::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cjq> aE = a("mooshroom", bwr.a.a(cjq::new, bxm.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwr<cln> aF = a("mule", bwr.a.a(cln::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bwr<cub> aG = a("oak_boat", bwr.a.a(a(() -> czr.oE), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> aH = a("oak_chest_boat", bwr.a.a(b(() -> czr.oF), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cjr> aI = a("ocelot", bwr.a.a(cjr::new, bxm.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bwr<bxp> aJ = a("ominous_item_spawner", bwr.a.a(bxp::new, bxm.h).e().a(0.25F, 0.25F).a(8));
   public static final bwr<cnm> aK = a("painting", bwr.a.<cnm>a(cnm::new, bxm.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<cub> aL = a("pale_oak_boat", bwr.a.a(a(() -> czr.oS), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> aM = a("pale_oak_chest_boat", bwr.a.a(b(() -> czr.oT), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cjs> aN = a("panda", bwr.a.a(cjs::new, bxm.b).a(1.3F, 1.25F).a(10));
   public static final bwr<cjt> aO = a("parrot", bwr.a.a(cjt::new, bxm.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bwr<coq> aP = a("phantom", bwr.a.a(coq::new, bxm.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bwr<cju> aQ = a("pig", bwr.a.a(cju::new, bxm.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bwr<cqb> aR = a("piglin", bwr.a.a(cqb::new, bxm.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<cqe> aS = a("piglin_brute", bwr.a.a(cqe::new, bxm.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<cor> aT = a("pillager", bwr.a.a(cor::new, bxm.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<cjx> aU = a("polar_bear", bwr.a.a(cjx::new, bxm.b).a(dmt.rx).a(1.4F, 1.4F).a(10));
   public static final bwr<csu> aV = a("splash_potion", bwr.a.<csu>a(csu::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cst> aW = a("lingering_potion", bwr.a.<cst>a(cst::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cjy> aX = a("pufferfish", bwr.a.a(cjy::new, bxm.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bwr<cjz> aY = a("rabbit", bwr.a.a(cjz::new, bxm.b).a(0.4F, 0.5F).a(8));
   public static final bwr<cot> aZ = a("ravager", bwr.a.a(cot::new, bxm.a).a(1.95F, 2.2F).a(new ffc(0.0, 2.2625, -0.0625)).a(10));
   public static final bwr<cka> ba = a("salmon", bwr.a.a(cka::new, bxm.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bwr<clv> bb = a("sheep", bwr.a.a(clv::new, bxm.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bwr<cou> bc = a("shulker", bwr.a.a(cou::new, bxm.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bwr<csk> bd = a("shulker_bullet", bwr.a.<csk>a(csk::new, bxm.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bwr<cov> be = a("silverfish", bwr.a.a(cov::new, bxm.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwr<cow> bf = a("skeleton", bwr.a.a(cow::new, bxm.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwr<clo> bg = a("skeleton_horse", bwr.a.a(clo::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwr<cox> bh = a("slime", bwr.a.a(cox::new, bxm.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bwr<csl> bi = a("small_fireball", bwr.a.<csl>a(csl::new, bxm.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwr<cly> bj = a("sniffer", bwr.a.a(cly::new, bxm.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bwr<csm> bk = a("snowball", bwr.a.<csm>a(csm::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<ckc> bl = a("snow_golem", bwr.a.a(ckc::new, bxm.h).a(dmt.rx).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bwr<cum> bm = a("spawner_minecart", bwr.a.a(cum::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<csn> bn = a("spectral_arrow", bwr.a.<csn>a(csn::new, bxm.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwr<coz> bo = a("spider", bwr.a.a(coz::new, bxm.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bwr<cub> bp = a("spruce_boat", bwr.a.a(a(() -> czr.oG), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuc> bq = a("spruce_chest_boat", bwr.a.a(b(() -> czr.oH), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ckd> br = a("squid", bwr.a.a(ckd::new, bxm.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bwr<cpa> bs = a("stray", bwr.a.a(cpa::new, bxm.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dmt.rx).a(8));
   public static final bwr<cpb> bt = a("strider", bwr.a.a(cpb::new, bxm.b).c().a(0.9F, 1.7F).a(10));
   public static final bwr<clb> bu = a("tadpole", bwr.a.a(clb::new, bxm.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bwr<bwf.k> bv = a("text_display", bwr.a.a(bwf.k::new, bxm.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwr<cns> bw = a("tnt", bwr.a.<cns>a(cns::new, bxm.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bwr<cun> bx = a("tnt_minecart", bwr.a.a(cun::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<clq> by = a("trader_llama", bwr.a.a(clq::new, bxm.b).a(0.9F, 1.87F).b(1.7765F).a(new ffc(0.0, 1.37, -0.3)).a(10));
   public static final bwr<csv> bz = a("trident", bwr.a.<csv>a(csv::new, bxm.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwr<ckf> bA = a("tropical_fish", bwr.a.a(ckf::new, bxm.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bwr<ckg> bB = a("turtle", bwr.a.a(ckg::new, bxm.b).a(1.2F, 0.4F).a(new ffc(0.0, 0.55625, -0.25)).a(10));
   public static final bwr<cpc> bC = a("vex", bwr.a.a(cpc::new, bxm.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bwr<cqy> bD = a("villager", bwr.a.<cqy>a(cqy::new, bxm.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwr<cpd> bE = a("vindicator", bwr.a.a(cpd::new, bxm.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<cre> bF = a("wandering_trader", bwr.a.a(cre::new, bxm.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwr<cqp> bG = a("warden", bwr.a.a(cqp::new, bxm.a).a(0.9F, 2.9F).a(3.15F).a(bwj.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bwr<cta> bH = a("wind_charge", bwr.a.<cta>a(cta::new, bxm.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwr<cpe> bI = a("witch", bwr.a.a(cpe::new, bxm.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bwr<cne> bJ = a("wither", bwr.a.a(cne::new, bxm.a).c().a(dmt.cn).a(0.9F, 3.5F).a(10));
   public static final bwr<cpf> bK = a("wither_skeleton", bwr.a.a(cpf::new, bxm.a).c().a(dmt.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bwr<csw> bL = a("wither_skull", bwr.a.<csw>a(csw::new, bxm.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwr<cmb> bM = a("wolf", bwr.a.a(cmb::new, bxm.b).a(0.6F, 0.85F).b(0.68F).a(new ffc(0.0, 0.81875, -0.0625)).a(10));
   public static final bwr<cpg> bN = a("zoglin", bwr.a.a(cpg::new, bxm.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwr<cph> bO = a("zombie", bwr.a.<cph>a(cph::new, bxm.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<cls> bP = a("zombie_horse", bwr.a.a(cls::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwr<cpi> bQ = a("zombie_villager", bwr.a.a(cpi::new, bxm.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bwr<cpj> bR = a("zombified_piglin", bwr.a.a(cpj::new, bxm.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bwr<crm> bS = a("player", bwr.a.<crm>a(bxm.h).b().a().a(0.6F, 1.8F).b(1.62F).a(crm.bI).a(32).b(2));
   public static final bwr<csd> bT = a("fishing_bobber", bwr.a.<csd>a(csd::new, bxm.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bwr<?>> bZ = Set.of(X, B, bm);
   private final bwr.b<T> ca;
   private final bxm cb;
   private final ImmutableSet<dmr> cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final int ch;
   private final int ci;
   private final String cj;
   @Nullable
   private wy ck;
   private final Optional<alf<ezy>> cl;
   private final bwl cm;
   private final float cn;
   private final cuw co;

   private static <T extends bwi> bwr<T> a(alf<bwr<?>> $$0, bwr.a<T> $$1) {
      return js.a(mg.f, $$0, $$1.a($$0));
   }

   private static alf<bwr<?>> b(String $$0) {
      return alf.a(mh.B, alg.b($$0));
   }

   private static <T extends bwi> bwr<T> a(String $$0, bwr.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alg a(bwr<?> $$0) {
      return mg.f.b($$0);
   }

   public static Optional<bwr<?>> a(String $$0) {
      return mg.f.b(alg.c($$0));
   }

   public bwr(
      bwr.b<T> $$0,
      bxm $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dmr> $$6,
      bwl $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alf<ezy>> $$12,
      cuw $$13
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
   public T a(arq $$0, @Nullable czn $$1, @Nullable bxj $$2, iv $$3, bwq $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwi> Consumer<T> a(djm $$0, czn $$1, @Nullable bxj $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwi> Consumer<T> a(Consumer<T> $$0, djm $$1, czn $$2, @Nullable bxj $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwi> Consumer<T> a(Consumer<T> $$0, czn $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwi> Consumer<T> b(Consumer<T> $$0, djm $$1, czn $$2, @Nullable bxj $$3) {
      dbv $$4 = $$2.a(kk.Y, dbv.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arq $$0, iv $$1, bwq $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arq $$0, @Nullable Consumer<T> $$1, iv $$2, bwq $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bxl $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(arq $$0, @Nullable Consumer<T> $$1, iv $$2, bwq $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cQ());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azm.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bxl $$9) {
            $$9.aX = $$9.dK();
            $$9.aV = $$9.dK();
            $$9.a($$0, $$0.d_($$9.du()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(djp $$0, iv $$1, boolean $$2, fex $$3) {
      fex $$4 = new fex($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ffw> $$5 = $$0.d(null, $$4);
      return 1.0 + fft.a(jb.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(djm $$0, @Nullable bxj $$1, @Nullable bwi $$2, dbv $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bwr<?> $$5 = $$3.a($$4.ba(), mh.B);
         if ($$2.an() == $$5) {
            if ($$0.C || !$$2.an().s() || $$1 instanceof crm $$6 && $$4.ag().f($$6.gh())) {
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

   public bxm f() {
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

   public Optional<alf<ezy>> j() {
      return this.cl;
   }

   public float l() {
      return this.cm.a();
   }

   public float m() {
      return this.cm.b();
   }

   @Override
   public cuw k() {
      return this.co;
   }

   @Nullable
   public T a(djm $$0, bwq $$1) {
      return !this.a($$0.K()) ? null : this.ca.create(this, $$0);
   }

   public static Optional<bwi> a(tz $$0, djm $$1, bwq $$2) {
      return ag.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.j("id")));
   }

   public fex a(double $$0, double $$1, double $$2) {
      float $$3 = this.cn * this.l() / 2.0F;
      float $$4 = this.cn * this.m();
      return new fex($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(eat $$0) {
      if (this.cc.contains($$0.b())) {
         return false;
      } else {
         return !this.cf && exn.a($$0) ? true : $$0.a(dmt.cn) || $$0.a(dmt.oO) || $$0.a(dmt.eg) || $$0.a(dmt.rx);
      }
   }

   public bwl n() {
      return this.cm;
   }

   public static Optional<bwr<?>> a(tz $$0) {
      return mg.f.b(alg.a($$0.j("id")));
   }

   @Nullable
   public static bwi a(tz $$0, djm $$1, bwq $$2, Function<bwi, bwi> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            uf $$5 = $$0.d("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bwi $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bwi)$$4;
      }).orElse(null);
   }

   public static Stream<bwi> a(List<? extends uw> $$0, djm $$1, bwq $$2) {
      return $$0.stream().mapMulti(($$2x, $$3) -> a((tz)$$2x, $$1, $$2, $$1xx -> {
            $$3.accept($$1xx);
            return $$1xx;
         }));
   }

   private static Optional<bwi> b(tz $$0, djm $$1, bwq $$2) {
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

   public boolean a(axr<bwr<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(jj<bwr<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bwi $$0) {
      return (T)($$0.an() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bwi> a() {
      return bwi.class;
   }

   @Deprecated
   public jf.c<bwr<?>> r() {
      return this.bW;
   }

   private static bwr.b<cub> a(Supplier<czj> $$0) {
      return ($$1, $$2) -> new cub($$1, $$2, $$0);
   }

   private static bwr.b<cuc> b(Supplier<czj> $$0) {
      return ($$1, $$2) -> new cuc($$1, $$2, $$0);
   }

   private static bwr.b<cuq> c(Supplier<czj> $$0) {
      return ($$1, $$2) -> new cuq($$1, $$2, $$0);
   }

   private static bwr.b<cud> d(Supplier<czj> $$0) {
      return ($$1, $$2) -> new cud($$1, $$2, $$0);
   }

   public boolean s() {
      return bZ.contains(this);
   }

   public static class a<T extends bwi> {
      private final bwr.b<T> a;
      private final bxm b;
      private ImmutableSet<dmr> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bwl j = bwl.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwk.a l = bwk.a();
      private cuw m = cuy.g;
      private aky<bwr<?>, Optional<alf<ezy>>> n = $$0x -> Optional.of(alf.a(mh.br, $$0x.a().f("entities/")));
      private final aky<bwr<?>, String> o = $$0x -> ag.a("entity", $$0x.a());

      private a(bwr.b<T> $$0, bxm $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bxm.b || $$1 == bxm.h;
      }

      public static <T extends bwi> bwr.a<T> a(bwr.b<T> $$0, bxm $$1) {
         return new bwr.a<>($$0, $$1);
      }

      public static <T extends bwi> bwr.a<T> a(bxm $$0) {
         return new bwr.a<>(($$0x, $$1) -> null, $$0);
      }

      public bwr.a<T> a(float $$0, float $$1) {
         this.j = bwl.b($$0, $$1);
         return this;
      }

      public bwr.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bwr.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bwr.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bwj.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bwr.a<T> a(ffc... $$0) {
         for (ffc $$1 : $$0) {
            this.l = this.l.a(bwj.a, $$1);
         }

         return this;
      }

      public bwr.a<T> a(ffc $$0) {
         return this.a(bwj.b, $$0);
      }

      public bwr.a<T> c(float $$0) {
         return this.a(bwj.b, 0.0F, -$$0, 0.0F);
      }

      public bwr.a<T> d(float $$0) {
         return this.a(bwj.c, 0.0F, $$0, 0.0F);
      }

      public bwr.a<T> a(bwj $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bwr.a<T> a(bwj $$0, ffc $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bwr.a<T> a() {
         this.e = false;
         return this;
      }

      public bwr.a<T> b() {
         this.d = false;
         return this;
      }

      public bwr.a<T> c() {
         this.f = true;
         return this;
      }

      public bwr.a<T> a(dmr... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bwr.a<T> d() {
         this.g = true;
         return this;
      }

      public bwr.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bwr.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bwr.a<T> a(cuu... $$0) {
         this.m = cuy.e.a($$0);
         return this;
      }

      public bwr.a<T> e() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public bwr<T> a(alf<bwr<?>> $$0) {
         if (this.d) {
            ag.a(biz.C, $$0.a().toString());
         }

         return new bwr<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bwi> {
      @Nullable
      T create(bwr<T> var1, djm var2);
   }
}
