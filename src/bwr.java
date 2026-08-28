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

public class bwr<T extends bwi> implements cuq, efa<bwi, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jf.c<bwr<?>> bW = mg.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bwr<cty> a = a("acacia_boat", bwr.a.a(a(() -> czo.oM), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> b = a("acacia_chest_boat", bwr.a.a(b(() -> czo.oN), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ckl> c = a("allay", bwr.a.a(ckl::new, bxm.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bwr<bwa> d = a("area_effect_cloud", bwr.a.<bwa>a(bwa::new, bxm.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<cko> e = a("armadillo", bwr.a.a(cko::new, bxm.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bwr<cnd> f = a("armor_stand", bwr.a.<cnd>a(cnd::new, bxm.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bwr<cru> g = a("arrow", bwr.a.<cru>a(cru::new, bxm.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwr<ckr> h = a("axolotl", bwr.a.a(ckr::new, bxm.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bwr<cua> i = a("bamboo_chest_raft", bwr.a.a(d(() -> czo.oX), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cun> j = a("bamboo_raft", bwr.a.a(c(() -> czo.oW), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cis> k = a("bat", bwr.a.a(cis::new, bxm.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bwr<cja> l = a("bee", bwr.a.a(cja::new, bxm.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bwr<cty> m = a("birch_boat", bwr.a.a(a(() -> czo.oI), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> n = a("birch_chest_boat", bwr.a.a(b(() -> czo.oJ), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cnt> o = a("blaze", bwr.a.a(cnt::new, bxm.a).c().a(0.6F, 1.8F).a(8));
   public static final bwr<bwf.b> p = a("block_display", bwr.a.a(bwf.b::new, bxm.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwr<cnu> q = a("bogged", bwr.a.a(cnu::new, bxm.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwr<cph> r = a("breeze", bwr.a.a(cph::new, bxm.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bwr<csw> s = a("breeze_wind_charge", bwr.a.<csw>a(csw::new, bxm.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwr<ckw> t = a("camel", bwr.a.a(ckw::new, bxm.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bwr<cjc> u = a("cat", bwr.a.a(cjc::new, bxm.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bwr<cnv> v = a("cave_spider", bwr.a.a(cnv::new, bxm.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bwr<cty> w = a("cherry_boat", bwr.a.a(a(() -> czo.oO), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> x = a("cherry_chest_boat", bwr.a.a(b(() -> czo.oP), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cuf> y = a("chest_minecart", bwr.a.a(cuf::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cjf> z = a("chicken", bwr.a.a(cjf::new, bxm.b).a(0.4F, 0.7F).b(0.644F).a(new fex(0.0, 0.7, -0.1)).a(10));
   public static final bwr<cji> A = a("cod", bwr.a.a(cji::new, bxm.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bwr<cug> B = a("command_block_minecart", bwr.a.a(cug::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cjj> C = a("cow", bwr.a.a(cjj::new, bxm.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwr<cpp> D = a("creaking", bwr.a.a(cpp::new, bxm.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bwr<cnw> E = a("creeper", bwr.a.a(cnw::new, bxm.a).a(0.6F, 1.7F).a(8));
   public static final bwr<cty> F = a("dark_oak_boat", bwr.a.a(a(() -> czo.oQ), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> G = a("dark_oak_chest_boat", bwr.a.a(b(() -> czo.oR), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cjm> H = a("dolphin", bwr.a.a(cjm::new, bxm.f).a(0.9F, 0.6F).b(0.3F));
   public static final bwr<clm> I = a("donkey", bwr.a.a(clm::new, bxm.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bwr<crv> J = a("dragon_fireball", bwr.a.<crv>a(crv::new, bxm.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwr<cny> K = a("drowned", bwr.a.a(cny::new, bxm.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<csn> L = a("egg", bwr.a.<csn>a(csn::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cnz> M = a("elder_guardian", bwr.a.a(cnz::new, bxm.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bwr<coa> N = a("enderman", bwr.a.a(coa::new, bxm.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bwr<cob> O = a("endermite", bwr.a.a(cob::new, bxm.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwr<cmh> P = a("ender_dragon", bwr.a.a(cmh::new, bxm.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bwr<cso> Q = a("ender_pearl", bwr.a.<cso>a(cso::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cmg> R = a("end_crystal", bwr.a.<cmg>a(cmg::new, bxm.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwr<cod> S = a("evoker", bwr.a.a(cod::new, bxm.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<crw> T = a("evoker_fangs", bwr.a.<crw>a(crw::new, bxm.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bwr<csp> U = a("experience_bottle", bwr.a.<csp>a(csp::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<bww> V = a("experience_orb", bwr.a.<bww>a(bww::new, bxm.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bwr<crx> W = a("eye_of_ender", bwr.a.<crx>a(crx::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bwr<cnn> X = a("falling_block", bwr.a.<cnn>a(cnn::new, bxm.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bwr<csc> Y = a("fireball", bwr.a.<csc>a(csc::new, bxm.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwr<crz> Z = a("firework_rocket", bwr.a.<crz>a(crz::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cjo> aa = a("fox", bwr.a.a(cjo::new, bxm.b).a(0.6F, 0.7F).b(0.4F).a(new fex(0.0, 0.6375, -0.25)).a(8).a(dmo.oO));
   public static final bwr<ckz> ab = a("frog", bwr.a.a(ckz::new, bxm.b).a(0.5F, 0.5F).a(new fex(0.0, 0.375, -0.25)).a(10));
   public static final bwr<cuh> ac = a("furnace_minecart", bwr.a.a(cuh::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<coe> ad = a("ghast", bwr.a.a(coe::new, bxm.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bwr<cof> ae = a("giant", bwr.a.a(cof::new, bxm.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bwr<cnf> af = a("glow_item_frame", bwr.a.<cnf>a(cnf::new, bxm.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<bwy> ag = a("glow_squid", bwr.a.a(bwy::new, bxm.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bwr<clh> ah = a("goat", bwr.a.a(clh::new, bxm.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bwr<cog> ai = a("guardian", bwr.a.a(cog::new, bxm.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bwr<cps> aj = a("hoglin", bwr.a.a(cps::new, bxm.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwr<cui> ak = a("hopper_minecart", bwr.a.a(cui::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cln> al = a("horse", bwr.a.a(cln::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bwr<coh> am = a("husk", bwr.a.a(coh::new, bxm.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bwr<coi> an = a("illusioner", bwr.a.a(coi::new, bxm.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<bxd> ao = a("interaction", bwr.a.a(bxd::new, bxm.h).e().a(0.0F, 0.0F).a(10));
   public static final bwr<cjp> ap = a("iron_golem", bwr.a.a(cjp::new, bxm.h).a(1.4F, 2.7F).a(10));
   public static final bwr<cno> aq = a("item", bwr.a.<cno>a(cno::new, bxm.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bwr<bwf.g> ar = a("item_display", bwr.a.a(bwf.g::new, bxm.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwr<cnh> as = a("item_frame", bwr.a.<cnh>a(cnh::new, bxm.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<cty> at = a("jungle_boat", bwr.a.a(a(() -> czo.oK), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> au = a("jungle_chest_boat", bwr.a.a(b(() -> czo.oL), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cni> av = a("leash_knot", bwr.a.<cni>a(cni::new, bxm.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<bxi> aw = a("lightning_bolt", bwr.a.a(bxi::new, bxm.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwr<clo> ax = a("llama", bwr.a.a(clo::new, bxm.b).a(0.9F, 1.87F).b(1.7765F).a(new fex(0.0, 1.37, -0.3)).a(10));
   public static final bwr<csd> ay = a("llama_spit", bwr.a.<csd>a(csd::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<coj> az = a("magma_cube", bwr.a.a(coj::new, bxm.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bwr<cty> aA = a("mangrove_boat", bwr.a.a(a(() -> czo.oU), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> aB = a("mangrove_chest_boat", bwr.a.a(b(() -> czo.oV), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<bxk> aC = a("marker", bwr.a.a(bxk::new, bxm.h).e().a(0.0F, 0.0F).a(0));
   public static final bwr<cud> aD = a("minecart", bwr.a.a(cud::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<cjq> aE = a("mooshroom", bwr.a.a(cjq::new, bxm.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwr<clq> aF = a("mule", bwr.a.a(clq::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bwr<cty> aG = a("oak_boat", bwr.a.a(a(() -> czo.oE), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> aH = a("oak_chest_boat", bwr.a.a(b(() -> czo.oF), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cjr> aI = a("ocelot", bwr.a.a(cjr::new, bxm.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bwr<bxp> aJ = a("ominous_item_spawner", bwr.a.a(bxp::new, bxm.h).e().a(0.25F, 0.25F).a(8));
   public static final bwr<cnj> aK = a("painting", bwr.a.<cnj>a(cnj::new, bxm.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwr<cty> aL = a("pale_oak_boat", bwr.a.a(a(() -> czo.oS), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> aM = a("pale_oak_chest_boat", bwr.a.a(b(() -> czo.oT), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<cjs> aN = a("panda", bwr.a.a(cjs::new, bxm.b).a(1.3F, 1.25F).a(10));
   public static final bwr<cjt> aO = a("parrot", bwr.a.a(cjt::new, bxm.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bwr<com> aP = a("phantom", bwr.a.a(com::new, bxm.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bwr<cju> aQ = a("pig", bwr.a.a(cju::new, bxm.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bwr<cpy> aR = a("piglin", bwr.a.a(cpy::new, bxm.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<cqb> aS = a("piglin_brute", bwr.a.a(cqb::new, bxm.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<coo> aT = a("pillager", bwr.a.a(coo::new, bxm.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<cjx> aU = a("polar_bear", bwr.a.a(cjx::new, bxm.b).a(dmo.rx).a(1.4F, 1.4F).a(10));
   public static final bwr<csr> aV = a("splash_potion", bwr.a.<csr>a(csr::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<csq> aW = a("lingering_potion", bwr.a.<csq>a(csq::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<cjy> aX = a("pufferfish", bwr.a.a(cjy::new, bxm.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bwr<cjz> aY = a("rabbit", bwr.a.a(cjz::new, bxm.b).a(0.4F, 0.5F).a(8));
   public static final bwr<coq> aZ = a("ravager", bwr.a.a(coq::new, bxm.a).a(1.95F, 2.2F).a(new fex(0.0, 2.2625, -0.0625)).a(10));
   public static final bwr<cka> ba = a("salmon", bwr.a.a(cka::new, bxm.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bwr<cly> bb = a("sheep", bwr.a.a(cly::new, bxm.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bwr<cor> bc = a("shulker", bwr.a.a(cor::new, bxm.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bwr<csh> bd = a("shulker_bullet", bwr.a.<csh>a(csh::new, bxm.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bwr<cos> be = a("silverfish", bwr.a.a(cos::new, bxm.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwr<cot> bf = a("skeleton", bwr.a.a(cot::new, bxm.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwr<clr> bg = a("skeleton_horse", bwr.a.a(clr::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwr<cou> bh = a("slime", bwr.a.a(cou::new, bxm.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bwr<csi> bi = a("small_fireball", bwr.a.<csi>a(csi::new, bxm.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwr<cmb> bj = a("sniffer", bwr.a.a(cmb::new, bxm.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bwr<csj> bk = a("snowball", bwr.a.<csj>a(csj::new, bxm.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwr<ckc> bl = a("snow_golem", bwr.a.a(ckc::new, bxm.h).a(dmo.rx).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bwr<cuj> bm = a("spawner_minecart", bwr.a.a(cuj::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<csk> bn = a("spectral_arrow", bwr.a.<csk>a(csk::new, bxm.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwr<cow> bo = a("spider", bwr.a.a(cow::new, bxm.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bwr<cty> bp = a("spruce_boat", bwr.a.a(a(() -> czo.oG), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ctz> bq = a("spruce_chest_boat", bwr.a.a(b(() -> czo.oH), bxm.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwr<ckd> br = a("squid", bwr.a.a(ckd::new, bxm.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bwr<cox> bs = a("stray", bwr.a.a(cox::new, bxm.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dmo.rx).a(8));
   public static final bwr<coy> bt = a("strider", bwr.a.a(coy::new, bxm.b).c().a(0.9F, 1.7F).a(10));
   public static final bwr<cle> bu = a("tadpole", bwr.a.a(cle::new, bxm.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bwr<bwf.k> bv = a("text_display", bwr.a.a(bwf.k::new, bxm.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwr<cnp> bw = a("tnt", bwr.a.<cnp>a(cnp::new, bxm.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bwr<cuk> bx = a("tnt_minecart", bwr.a.a(cuk::new, bxm.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwr<clt> by = a("trader_llama", bwr.a.a(clt::new, bxm.b).a(0.9F, 1.87F).b(1.7765F).a(new fex(0.0, 1.37, -0.3)).a(10));
   public static final bwr<css> bz = a("trident", bwr.a.<css>a(css::new, bxm.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwr<ckf> bA = a("tropical_fish", bwr.a.a(ckf::new, bxm.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bwr<ckg> bB = a("turtle", bwr.a.a(ckg::new, bxm.b).a(1.2F, 0.4F).a(new fex(0.0, 0.55625, -0.25)).a(10));
   public static final bwr<coz> bC = a("vex", bwr.a.a(coz::new, bxm.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bwr<cqv> bD = a("villager", bwr.a.<cqv>a(cqv::new, bxm.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwr<cpa> bE = a("vindicator", bwr.a.a(cpa::new, bxm.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwr<crb> bF = a("wandering_trader", bwr.a.a(crb::new, bxm.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwr<cqm> bG = a("warden", bwr.a.a(cqm::new, bxm.a).a(0.9F, 2.9F).a(3.15F).a(bwj.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bwr<csx> bH = a("wind_charge", bwr.a.<csx>a(csx::new, bxm.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwr<cpb> bI = a("witch", bwr.a.a(cpb::new, bxm.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bwr<cnb> bJ = a("wither", bwr.a.a(cnb::new, bxm.a).c().a(dmo.cn).a(0.9F, 3.5F).a(10));
   public static final bwr<cpc> bK = a("wither_skeleton", bwr.a.a(cpc::new, bxm.a).c().a(dmo.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bwr<cst> bL = a("wither_skull", bwr.a.<cst>a(cst::new, bxm.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwr<cki> bM = a("wolf", bwr.a.a(cki::new, bxm.b).a(0.6F, 0.85F).b(0.68F).a(new fex(0.0, 0.81875, -0.0625)).a(10));
   public static final bwr<cpd> bN = a("zoglin", bwr.a.a(cpd::new, bxm.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwr<cpe> bO = a("zombie", bwr.a.<cpe>a(cpe::new, bxm.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwr<clv> bP = a("zombie_horse", bwr.a.a(clv::new, bxm.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwr<cpf> bQ = a("zombie_villager", bwr.a.a(cpf::new, bxm.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bwr<cpg> bR = a("zombified_piglin", bwr.a.a(cpg::new, bxm.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bwr<crj> bS = a("player", bwr.a.<crj>a(bxm.h).b().a().a(0.6F, 1.8F).b(1.62F).a(crj.bI).a(32).b(2));
   public static final bwr<csa> bT = a("fishing_bobber", bwr.a.<csa>a(csa::new, bxm.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bwr<?>> bZ = Set.of(X, B, bm);
   private final bwr.b<T> ca;
   private final bxm cb;
   private final ImmutableSet<dmm> cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final int ch;
   private final int ci;
   private final String cj;
   @Nullable
   private wy ck;
   private final Optional<alf<ezt>> cl;
   private final bwl cm;
   private final float cn;
   private final cut co;

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
      ImmutableSet<dmm> $$6,
      bwl $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alf<ezt>> $$12,
      cut $$13
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
   public T a(arq $$0, @Nullable czk $$1, @Nullable bxj $$2, iv $$3, bwq $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwi> Consumer<T> a(djh $$0, czk $$1, @Nullable bxj $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwi> Consumer<T> a(Consumer<T> $$0, djh $$1, czk $$2, @Nullable bxj $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwi> Consumer<T> a(Consumer<T> $$0, czk $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwi> Consumer<T> b(Consumer<T> $$0, djh $$1, czk $$2, @Nullable bxj $$3) {
      dbs $$4 = $$2.a(kk.Y, dbs.a);
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

   protected static double a(djk $$0, iv $$1, boolean $$2, fes $$3) {
      fes $$4 = new fes($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ffr> $$5 = $$0.d(null, $$4);
      return 1.0 + ffo.a(jb.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(djh $$0, @Nullable bxj $$1, @Nullable bwi $$2, dbs $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bwr<?> $$5 = $$3.a($$4.ba(), mh.B);
         if ($$2.an() == $$5) {
            if ($$0.C || !$$2.an().s() || $$1 instanceof crj $$6 && $$4.ag().f($$6.gh())) {
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

   public Optional<alf<ezt>> j() {
      return this.cl;
   }

   public float l() {
      return this.cm.a();
   }

   public float m() {
      return this.cm.b();
   }

   @Override
   public cut k() {
      return this.co;
   }

   @Nullable
   public T a(djh $$0, bwq $$1) {
      return !this.a($$0.K()) ? null : this.ca.create(this, $$0);
   }

   public static Optional<bwi> a(tz $$0, djh $$1, bwq $$2) {
      return ag.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.j("id")));
   }

   public fes a(double $$0, double $$1, double $$2) {
      float $$3 = this.cn * this.l() / 2.0F;
      float $$4 = this.cn * this.m();
      return new fes($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(eao $$0) {
      if (this.cc.contains($$0.b())) {
         return false;
      } else {
         return !this.cf && exi.a($$0) ? true : $$0.a(dmo.cn) || $$0.a(dmo.oO) || $$0.a(dmo.eg) || $$0.a(dmo.rx);
      }
   }

   public bwl n() {
      return this.cm;
   }

   public static Optional<bwr<?>> a(tz $$0) {
      return mg.f.b(alg.a($$0.j("id")));
   }

   @Nullable
   public static bwi a(tz $$0, djh $$1, bwq $$2, Function<bwi, bwi> $$3) {
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

   public static Stream<bwi> a(List<? extends uw> $$0, djh $$1, bwq $$2) {
      return $$0.stream().mapMulti(($$2x, $$3) -> a((tz)$$2x, $$1, $$2, $$1xx -> {
            $$3.accept($$1xx);
            return $$1xx;
         }));
   }

   private static Optional<bwi> b(tz $$0, djh $$1, bwq $$2) {
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

   private static bwr.b<cty> a(Supplier<czg> $$0) {
      return ($$1, $$2) -> new cty($$1, $$2, $$0);
   }

   private static bwr.b<ctz> b(Supplier<czg> $$0) {
      return ($$1, $$2) -> new ctz($$1, $$2, $$0);
   }

   private static bwr.b<cun> c(Supplier<czg> $$0) {
      return ($$1, $$2) -> new cun($$1, $$2, $$0);
   }

   private static bwr.b<cua> d(Supplier<czg> $$0) {
      return ($$1, $$2) -> new cua($$1, $$2, $$0);
   }

   public boolean s() {
      return bZ.contains(this);
   }

   public static class a<T extends bwi> {
      private final bwr.b<T> a;
      private final bxm b;
      private ImmutableSet<dmm> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bwl j = bwl.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwk.a l = bwk.a();
      private cut m = cuv.g;
      private aky<bwr<?>, Optional<alf<ezt>>> n = $$0x -> Optional.of(alf.a(mh.bq, $$0x.a().f("entities/")));
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

      public bwr.a<T> a(fex... $$0) {
         for (fex $$1 : $$0) {
            this.l = this.l.a(bwj.a, $$1);
         }

         return this;
      }

      public bwr.a<T> a(fex $$0) {
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

      public bwr.a<T> a(bwj $$0, fex $$1) {
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

      public bwr.a<T> a(dmm... $$0) {
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

      public bwr.a<T> a(cur... $$0) {
         this.m = cuv.e.a($$0);
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
      T create(bwr<T> var1, djh var2);
   }
}
