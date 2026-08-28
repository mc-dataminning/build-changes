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

public class bwo<T extends bwf> implements cuj, eet<bwf, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final je.c<bwo<?>> bW = mf.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bwo<ctr> a = a("acacia_boat", bwo.a.a(a(() -> czh.oM), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> b = a("acacia_chest_boat", bwo.a.a(b(() -> czh.oN), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<ckh> c = a("allay", bwo.a.a(ckh::new, bxh.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bwo<bvx> d = a("area_effect_cloud", bwo.a.<bvx>a(bvx::new, bxh.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwo<ckk> e = a("armadillo", bwo.a.a(ckk::new, bxh.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bwo<cmw> f = a("armor_stand", bwo.a.<cmw>a(cmw::new, bxh.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bwo<crn> g = a("arrow", bwo.a.<crn>a(crn::new, bxh.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwo<ckn> h = a("axolotl", bwo.a.a(ckn::new, bxh.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bwo<ctt> i = a("bamboo_chest_raft", bwo.a.a(d(() -> czh.oX), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cug> j = a("bamboo_raft", bwo.a.a(c(() -> czh.oW), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cin> k = a("bat", bwo.a.a(cin::new, bxh.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bwo<civ> l = a("bee", bwo.a.a(civ::new, bxh.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bwo<ctr> m = a("birch_boat", bwo.a.a(a(() -> czh.oI), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> n = a("birch_chest_boat", bwo.a.a(b(() -> czh.oJ), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cnm> o = a("blaze", bwo.a.a(cnm::new, bxh.a).c().a(0.6F, 1.8F).a(8));
   public static final bwo<bwc.b> p = a("block_display", bwo.a.a(bwc.b::new, bxh.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwo<cnn> q = a("bogged", bwo.a.a(cnn::new, bxh.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwo<cpa> r = a("breeze", bwo.a.a(cpa::new, bxh.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bwo<csp> s = a("breeze_wind_charge", bwo.a.<csp>a(csp::new, bxh.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwo<cks> t = a("camel", bwo.a.a(cks::new, bxh.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bwo<cix> u = a("cat", bwo.a.a(cix::new, bxh.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bwo<cno> v = a("cave_spider", bwo.a.a(cno::new, bxh.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bwo<ctr> w = a("cherry_boat", bwo.a.a(a(() -> czh.oO), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> x = a("cherry_chest_boat", bwo.a.a(b(() -> czh.oP), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cty> y = a("chest_minecart", bwo.a.a(cty::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<cja> z = a("chicken", bwo.a.a(cja::new, bxh.b).a(0.4F, 0.7F).b(0.644F).a(new feq(0.0, 0.7, -0.1)).a(10));
   public static final bwo<cjd> A = a("cod", bwo.a.a(cjd::new, bxh.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bwo<ctz> B = a("command_block_minecart", bwo.a.a(ctz::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<cje> C = a("cow", bwo.a.a(cje::new, bxh.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwo<cpi> D = a("creaking", bwo.a.a(cpi::new, bxh.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bwo<cnp> E = a("creeper", bwo.a.a(cnp::new, bxh.a).a(0.6F, 1.7F).a(8));
   public static final bwo<ctr> F = a("dark_oak_boat", bwo.a.a(a(() -> czh.oQ), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> G = a("dark_oak_chest_boat", bwo.a.a(b(() -> czh.oR), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cjh> H = a("dolphin", bwo.a.a(cjh::new, bxh.f).a(0.9F, 0.6F).b(0.3F));
   public static final bwo<cli> I = a("donkey", bwo.a.a(cli::new, bxh.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bwo<cro> J = a("dragon_fireball", bwo.a.<cro>a(cro::new, bxh.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwo<cnr> K = a("drowned", bwo.a.a(cnr::new, bxh.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwo<csg> L = a("egg", bwo.a.<csg>a(csg::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<cns> M = a("elder_guardian", bwo.a.a(cns::new, bxh.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bwo<cnt> N = a("enderman", bwo.a.a(cnt::new, bxh.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bwo<cnu> O = a("endermite", bwo.a.a(cnu::new, bxh.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwo<cma> P = a("ender_dragon", bwo.a.a(cma::new, bxh.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bwo<csh> Q = a("ender_pearl", bwo.a.<csh>a(csh::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<clz> R = a("end_crystal", bwo.a.<clz>a(clz::new, bxh.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwo<cnw> S = a("evoker", bwo.a.a(cnw::new, bxh.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwo<crp> T = a("evoker_fangs", bwo.a.<crp>a(crp::new, bxh.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bwo<csi> U = a("experience_bottle", bwo.a.<csi>a(csi::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<bwt> V = a("experience_orb", bwo.a.<bwt>a(bwt::new, bxh.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bwo<crq> W = a("eye_of_ender", bwo.a.<crq>a(crq::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bwo<cng> X = a("falling_block", bwo.a.<cng>a(cng::new, bxh.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bwo<crv> Y = a("fireball", bwo.a.<crv>a(crv::new, bxh.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwo<crs> Z = a("firework_rocket", bwo.a.<crs>a(crs::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<cjj> aa = a("fox", bwo.a.a(cjj::new, bxh.b).a(0.6F, 0.7F).b(0.4F).a(new feq(0.0, 0.6375, -0.25)).a(8).a(dmh.oO));
   public static final bwo<ckv> ab = a("frog", bwo.a.a(ckv::new, bxh.b).a(0.5F, 0.5F).a(new feq(0.0, 0.375, -0.25)).a(10));
   public static final bwo<cua> ac = a("furnace_minecart", bwo.a.a(cua::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<cnx> ad = a("ghast", bwo.a.a(cnx::new, bxh.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bwo<cny> ae = a("giant", bwo.a.a(cny::new, bxh.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bwo<cmy> af = a("glow_item_frame", bwo.a.<cmy>a(cmy::new, bxh.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwo<bwv> ag = a("glow_squid", bwo.a.a(bwv::new, bxh.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bwo<cld> ah = a("goat", bwo.a.a(cld::new, bxh.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bwo<cnz> ai = a("guardian", bwo.a.a(cnz::new, bxh.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bwo<cpl> aj = a("hoglin", bwo.a.a(cpl::new, bxh.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwo<cub> ak = a("hopper_minecart", bwo.a.a(cub::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<clj> al = a("horse", bwo.a.a(clj::new, bxh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bwo<coa> am = a("husk", bwo.a.a(coa::new, bxh.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bwo<cob> an = a("illusioner", bwo.a.a(cob::new, bxh.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwo<bwy> ao = a("interaction", bwo.a.a(bwy::new, bxh.h).e().a(0.0F, 0.0F).a(10));
   public static final bwo<cjk> ap = a("iron_golem", bwo.a.a(cjk::new, bxh.h).a(1.4F, 2.7F).a(10));
   public static final bwo<cnh> aq = a("item", bwo.a.<cnh>a(cnh::new, bxh.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bwo<bwc.g> ar = a("item_display", bwo.a.a(bwc.g::new, bxh.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwo<cna> as = a("item_frame", bwo.a.<cna>a(cna::new, bxh.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwo<ctr> at = a("jungle_boat", bwo.a.a(a(() -> czh.oK), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> au = a("jungle_chest_boat", bwo.a.a(b(() -> czh.oL), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cnb> av = a("leash_knot", bwo.a.<cnb>a(cnb::new, bxh.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bwo<bxd> aw = a("lightning_bolt", bwo.a.a(bxd::new, bxh.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwo<clk> ax = a("llama", bwo.a.a(clk::new, bxh.b).a(0.9F, 1.87F).b(1.7765F).a(new feq(0.0, 1.37, -0.3)).a(10));
   public static final bwo<crw> ay = a("llama_spit", bwo.a.<crw>a(crw::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<coc> az = a("magma_cube", bwo.a.a(coc::new, bxh.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bwo<ctr> aA = a("mangrove_boat", bwo.a.a(a(() -> czh.oU), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> aB = a("mangrove_chest_boat", bwo.a.a(b(() -> czh.oV), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<bxf> aC = a("marker", bwo.a.a(bxf::new, bxh.h).e().a(0.0F, 0.0F).a(0));
   public static final bwo<ctw> aD = a("minecart", bwo.a.a(ctw::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<cjl> aE = a("mooshroom", bwo.a.a(cjl::new, bxh.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwo<clm> aF = a("mule", bwo.a.a(clm::new, bxh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bwo<ctr> aG = a("oak_boat", bwo.a.a(a(() -> czh.oE), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> aH = a("oak_chest_boat", bwo.a.a(b(() -> czh.oF), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cjm> aI = a("ocelot", bwo.a.a(cjm::new, bxh.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bwo<bxk> aJ = a("ominous_item_spawner", bwo.a.a(bxk::new, bxh.h).e().a(0.25F, 0.25F).a(8));
   public static final bwo<cnc> aK = a("painting", bwo.a.<cnc>a(cnc::new, bxh.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwo<ctr> aL = a("pale_oak_boat", bwo.a.a(a(() -> czh.oS), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> aM = a("pale_oak_chest_boat", bwo.a.a(b(() -> czh.oT), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cjn> aN = a("panda", bwo.a.a(cjn::new, bxh.b).a(1.3F, 1.25F).a(10));
   public static final bwo<cjo> aO = a("parrot", bwo.a.a(cjo::new, bxh.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bwo<cof> aP = a("phantom", bwo.a.a(cof::new, bxh.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bwo<cjp> aQ = a("pig", bwo.a.a(cjp::new, bxh.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bwo<cpr> aR = a("piglin", bwo.a.a(cpr::new, bxh.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwo<cpu> aS = a("piglin_brute", bwo.a.a(cpu::new, bxh.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwo<cog> aT = a("pillager", bwo.a.a(cog::new, bxh.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwo<cjs> aU = a("polar_bear", bwo.a.a(cjs::new, bxh.b).a(dmh.rx).a(1.4F, 1.4F).a(10));
   public static final bwo<csk> aV = a("splash_potion", bwo.a.<csk>a(csk::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<csj> aW = a("lingering_potion", bwo.a.<csj>a(csj::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<cjt> aX = a("pufferfish", bwo.a.a(cjt::new, bxh.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bwo<cju> aY = a("rabbit", bwo.a.a(cju::new, bxh.b).a(0.4F, 0.5F).a(8));
   public static final bwo<coi> aZ = a("ravager", bwo.a.a(coi::new, bxh.a).a(1.95F, 2.2F).a(new feq(0.0, 2.2625, -0.0625)).a(10));
   public static final bwo<cjv> ba = a("salmon", bwo.a.a(cjv::new, bxh.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bwo<cjw> bb = a("sheep", bwo.a.a(cjw::new, bxh.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bwo<coj> bc = a("shulker", bwo.a.a(coj::new, bxh.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bwo<csa> bd = a("shulker_bullet", bwo.a.<csa>a(csa::new, bxh.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bwo<cok> be = a("silverfish", bwo.a.a(cok::new, bxh.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwo<col> bf = a("skeleton", bwo.a.a(col::new, bxh.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwo<cln> bg = a("skeleton_horse", bwo.a.a(cln::new, bxh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwo<com> bh = a("slime", bwo.a.a(com::new, bxh.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bwo<csb> bi = a("small_fireball", bwo.a.<csb>a(csb::new, bxh.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwo<clu> bj = a("sniffer", bwo.a.a(clu::new, bxh.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bwo<csc> bk = a("snowball", bwo.a.<csc>a(csc::new, bxh.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwo<cjy> bl = a("snow_golem", bwo.a.a(cjy::new, bxh.h).a(dmh.rx).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bwo<cuc> bm = a("spawner_minecart", bwo.a.a(cuc::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<csd> bn = a("spectral_arrow", bwo.a.<csd>a(csd::new, bxh.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwo<cop> bo = a("spider", bwo.a.a(cop::new, bxh.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bwo<ctr> bp = a("spruce_boat", bwo.a.a(a(() -> czh.oG), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cts> bq = a("spruce_chest_boat", bwo.a.a(b(() -> czh.oH), bxh.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwo<cjz> br = a("squid", bwo.a.a(cjz::new, bxh.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bwo<coq> bs = a("stray", bwo.a.a(coq::new, bxh.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dmh.rx).a(8));
   public static final bwo<cor> bt = a("strider", bwo.a.a(cor::new, bxh.b).c().a(0.9F, 1.7F).a(10));
   public static final bwo<cla> bu = a("tadpole", bwo.a.a(cla::new, bxh.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bwo<bwc.k> bv = a("text_display", bwo.a.a(bwc.k::new, bxh.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwo<cni> bw = a("tnt", bwo.a.<cni>a(cni::new, bxh.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bwo<cud> bx = a("tnt_minecart", bwo.a.a(cud::new, bxh.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwo<clp> by = a("trader_llama", bwo.a.a(clp::new, bxh.b).a(0.9F, 1.87F).b(1.7765F).a(new feq(0.0, 1.37, -0.3)).a(10));
   public static final bwo<csl> bz = a("trident", bwo.a.<csl>a(csl::new, bxh.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwo<ckb> bA = a("tropical_fish", bwo.a.a(ckb::new, bxh.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bwo<ckc> bB = a("turtle", bwo.a.a(ckc::new, bxh.b).a(1.2F, 0.4F).a(new feq(0.0, 0.55625, -0.25)).a(10));
   public static final bwo<cos> bC = a("vex", bwo.a.a(cos::new, bxh.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bwo<cqo> bD = a("villager", bwo.a.<cqo>a(cqo::new, bxh.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwo<cot> bE = a("vindicator", bwo.a.a(cot::new, bxh.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwo<cqu> bF = a("wandering_trader", bwo.a.a(cqu::new, bxh.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwo<cqf> bG = a("warden", bwo.a.a(cqf::new, bxh.a).a(0.9F, 2.9F).a(3.15F).a(bwg.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bwo<csq> bH = a("wind_charge", bwo.a.<csq>a(csq::new, bxh.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwo<cou> bI = a("witch", bwo.a.a(cou::new, bxh.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bwo<cmu> bJ = a("wither", bwo.a.a(cmu::new, bxh.a).c().a(dmh.cn).a(0.9F, 3.5F).a(10));
   public static final bwo<cov> bK = a("wither_skeleton", bwo.a.a(cov::new, bxh.a).c().a(dmh.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bwo<csm> bL = a("wither_skull", bwo.a.<csm>a(csm::new, bxh.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwo<cke> bM = a("wolf", bwo.a.a(cke::new, bxh.b).a(0.6F, 0.85F).b(0.68F).a(new feq(0.0, 0.81875, -0.0625)).a(10));
   public static final bwo<cow> bN = a("zoglin", bwo.a.a(cow::new, bxh.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwo<cox> bO = a("zombie", bwo.a.<cox>a(cox::new, bxh.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwo<clr> bP = a("zombie_horse", bwo.a.a(clr::new, bxh.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwo<coy> bQ = a("zombie_villager", bwo.a.a(coy::new, bxh.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bwo<coz> bR = a("zombified_piglin", bwo.a.a(coz::new, bxh.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bwo<crc> bS = a("player", bwo.a.<crc>a(bxh.h).b().a().a(0.6F, 1.8F).b(1.62F).a(crc.bI).a(32).b(2));
   public static final bwo<crt> bT = a("fishing_bobber", bwo.a.<crt>a(crt::new, bxh.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bwo<?>> bZ = Set.of(X, B, bm);
   private final bwo.b<T> ca;
   private final bxh cb;
   private final ImmutableSet<dmf> cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final int ch;
   private final int ci;
   private final String cj;
   @Nullable
   private wy ck;
   private final Optional<alf<ezm>> cl;
   private final bwi cm;
   private final float cn;
   private final cum co;

   private static <T extends bwf> bwo<T> a(alf<bwo<?>> $$0, bwo.a<T> $$1) {
      return jr.a(mf.f, $$0, $$1.a($$0));
   }

   private static alf<bwo<?>> b(String $$0) {
      return alf.a(mg.B, alg.b($$0));
   }

   private static <T extends bwf> bwo<T> a(String $$0, bwo.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alg a(bwo<?> $$0) {
      return mf.f.b($$0);
   }

   public static Optional<bwo<?>> a(String $$0) {
      return mf.f.b(alg.c($$0));
   }

   public bwo(
      bwo.b<T> $$0,
      bxh $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dmf> $$6,
      bwi $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alf<ezm>> $$12,
      cum $$13
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
   public T a(arq $$0, @Nullable czd $$1, @Nullable bxe $$2, iu $$3, bwn $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwf> Consumer<T> a(dja $$0, czd $$1, @Nullable bxe $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwf> Consumer<T> a(Consumer<T> $$0, dja $$1, czd $$2, @Nullable bxe $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwf> Consumer<T> a(Consumer<T> $$0, czd $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwf> Consumer<T> b(Consumer<T> $$0, dja $$1, czd $$2, @Nullable bxe $$3) {
      dbl $$4 = $$2.a(kj.Y, dbl.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arq $$0, iu $$1, bwn $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arq $$0, @Nullable Consumer<T> $$1, iu $$2, bwn $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bxg $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(arq $$0, @Nullable Consumer<T> $$1, iu $$2, bwn $$3, boolean $$4, boolean $$5) {
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
         if ($$6 instanceof bxg $$9) {
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

   protected static double a(djd $$0, iu $$1, boolean $$2, fel $$3) {
      fel $$4 = new fel($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ffk> $$5 = $$0.d(null, $$4);
      return 1.0 + ffh.a(ja.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dja $$0, @Nullable bxe $$1, @Nullable bwf $$2, dbl $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bwo<?> $$5 = $$3.a($$4.ba(), mg.B);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 instanceof crc $$6 && $$4.ag().f($$6.gi())) {
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

   public bxh f() {
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

   public Optional<alf<ezm>> j() {
      return this.cl;
   }

   public float l() {
      return this.cm.a();
   }

   public float m() {
      return this.cm.b();
   }

   @Override
   public cum k() {
      return this.co;
   }

   @Nullable
   public T a(dja $$0, bwn $$1) {
      return !this.a($$0.K()) ? null : this.ca.create(this, $$0);
   }

   public static Optional<bwf> a(tz $$0, dja $$1, bwn $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fel a(double $$0, double $$1, double $$2) {
      float $$3 = this.cn * this.l() / 2.0F;
      float $$4 = this.cn * this.m();
      return new fel($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(eah $$0) {
      if (this.cc.contains($$0.b())) {
         return false;
      } else {
         return !this.cf && exb.a($$0) ? true : $$0.a(dmh.cn) || $$0.a(dmh.oO) || $$0.a(dmh.eg) || $$0.a(dmh.rx);
      }
   }

   public bwi n() {
      return this.cm;
   }

   public static Optional<bwo<?>> a(tz $$0) {
      return mf.f.b(alg.a($$0.l("id")));
   }

   @Nullable
   public static bwf a(tz $$0, dja $$1, bwn $$2, Function<bwf, bwf> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            uf $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bwf $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bwf)$$4;
      }).orElse(null);
   }

   public static Stream<bwf> a(final List<? extends uw> $$0, final dja $$1, final bwn $$2) {
      final Spliterator<? extends uw> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bwf>() {
         @Override
         public boolean tryAdvance(Consumer<? super bwf> $$0x) {
            return $$3.tryAdvance($$3xx -> bwo.a((tz)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Nullable
         @Override
         public Spliterator<bwf> trySplit() {
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

   private static Optional<bwf> b(tz $$0, dja $$1, bwn $$2) {
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

   public boolean a(axr<bwo<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ji<bwo<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bwf $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bwf> a() {
      return bwf.class;
   }

   @Deprecated
   public je.c<bwo<?>> r() {
      return this.bW;
   }

   private static bwo.b<ctr> a(Supplier<cyz> $$0) {
      return ($$1, $$2) -> new ctr($$1, $$2, $$0);
   }

   private static bwo.b<cts> b(Supplier<cyz> $$0) {
      return ($$1, $$2) -> new cts($$1, $$2, $$0);
   }

   private static bwo.b<cug> c(Supplier<cyz> $$0) {
      return ($$1, $$2) -> new cug($$1, $$2, $$0);
   }

   private static bwo.b<ctt> d(Supplier<cyz> $$0) {
      return ($$1, $$2) -> new ctt($$1, $$2, $$0);
   }

   public boolean s() {
      return bZ.contains(this);
   }

   public static class a<T extends bwf> {
      private final bwo.b<T> a;
      private final bxh b;
      private ImmutableSet<dmf> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bwi j = bwi.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwh.a l = bwh.a();
      private cum m = cuo.g;
      private aky<bwo<?>, Optional<alf<ezm>>> n = $$0x -> Optional.of(alf.a(mg.bq, $$0x.a().f("entities/")));
      private final aky<bwo<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bwo.b<T> $$0, bxh $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bxh.b || $$1 == bxh.h;
      }

      public static <T extends bwf> bwo.a<T> a(bwo.b<T> $$0, bxh $$1) {
         return new bwo.a<>($$0, $$1);
      }

      public static <T extends bwf> bwo.a<T> a(bxh $$0) {
         return new bwo.a<>(($$0x, $$1) -> null, $$0);
      }

      public bwo.a<T> a(float $$0, float $$1) {
         this.j = bwi.b($$0, $$1);
         return this;
      }

      public bwo.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bwo.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bwo.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bwg.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bwo.a<T> a(feq... $$0) {
         for (feq $$1 : $$0) {
            this.l = this.l.a(bwg.a, $$1);
         }

         return this;
      }

      public bwo.a<T> a(feq $$0) {
         return this.a(bwg.b, $$0);
      }

      public bwo.a<T> c(float $$0) {
         return this.a(bwg.b, 0.0F, -$$0, 0.0F);
      }

      public bwo.a<T> d(float $$0) {
         return this.a(bwg.c, 0.0F, $$0, 0.0F);
      }

      public bwo.a<T> a(bwg $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bwo.a<T> a(bwg $$0, feq $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bwo.a<T> a() {
         this.e = false;
         return this;
      }

      public bwo.a<T> b() {
         this.d = false;
         return this;
      }

      public bwo.a<T> c() {
         this.f = true;
         return this;
      }

      public bwo.a<T> a(dmf... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bwo.a<T> d() {
         this.g = true;
         return this;
      }

      public bwo.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bwo.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bwo.a<T> a(cuk... $$0) {
         this.m = cuo.e.a($$0);
         return this;
      }

      public bwo.a<T> e() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public bwo<T> a(alf<bwo<?>> $$0) {
         if (this.d) {
            af.a(bix.C, $$0.a().toString());
         }

         return new bwo<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bwf> {
      @Nullable
      T create(bwo<T> var1, dja var2);
   }
}
