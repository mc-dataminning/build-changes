import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
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

public class bxe<T extends bwv> implements cvg, efs<bwv, T> {
   private static final Logger bW = LogUtils.getLogger();
   private final jg.c<bxe<?>> bX = mh.f.f(this);
   public static final Codec<bxe<?>> a = mh.f.q();
   private static final float bY = 1.3964844F;
   private static final int bZ = 10;
   public static final bxe<cuo> b = a("acacia_boat", bxe.a.a(a(() -> dae.oM), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> c = a("acacia_chest_boat", bxe.a.a(b(() -> dae.oN), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<ckv> d = a("allay", bxe.a.a(ckv::new, bxz.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bxe<bwn> e = a("area_effect_cloud", bxe.a.<bwn>a(bwn::new, bxz.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bxe<cky> f = a("armadillo", bxe.a.a(cky::new, bxz.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bxe<cnt> g = a("armor_stand", bxe.a.<cnt>a(cnt::new, bxz.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bxe<csk> h = a("arrow", bxe.a.<csk>a(csk::new, bxz.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxe<clb> i = a("axolotl", bxe.a.a(clb::new, bxz.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bxe<cuq> j = a("bamboo_chest_raft", bxe.a.a(d(() -> dae.oX), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cvd> k = a("bamboo_raft", bxe.a.a(c(() -> dae.oW), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cjf> l = a("bat", bxe.a.a(cjf::new, bxz.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bxe<cjn> m = a("bee", bxe.a.a(cjn::new, bxz.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bxe<cuo> n = a("birch_boat", bxe.a.a(a(() -> dae.oI), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> o = a("birch_chest_boat", bxe.a.a(b(() -> dae.oJ), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<coj> p = a("blaze", bxe.a.a(coj::new, bxz.a).c().a(0.6F, 1.8F).a(8));
   public static final bxe<bws.b> q = a("block_display", bxe.a.a(bws.b::new, bxz.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxe<cok> r = a("bogged", bxe.a.a(cok::new, bxz.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bxe<cpx> s = a("breeze", bxe.a.a(cpx::new, bxz.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bxe<ctm> t = a("breeze_wind_charge", bxe.a.<ctm>a(ctm::new, bxz.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bxe<clg> u = a("camel", bxe.a.a(clg::new, bxz.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bxe<cjp> v = a("cat", bxe.a.a(cjp::new, bxz.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bxe<col> w = a("cave_spider", bxe.a.a(col::new, bxz.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bxe<cuo> x = a("cherry_boat", bxe.a.a(a(() -> dae.oO), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> y = a("cherry_chest_boat", bxe.a.a(b(() -> dae.oP), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cuv> z = a("chest_minecart", bxe.a.a(cuv::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<cjs> A = a("chicken", bxe.a.a(cjs::new, bxz.b).a(0.4F, 0.7F).b(0.644F).a(new ffs(0.0, 0.7, -0.1)).a(10));
   public static final bxe<cjv> B = a("cod", bxe.a.a(cjv::new, bxz.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bxe<cuw> C = a("command_block_minecart", bxe.a.a(cuw::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<cjw> D = a("cow", bxe.a.a(cjw::new, bxz.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bxe<cqf> E = a("creaking", bxe.a.a(cqf::new, bxz.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bxe<com> F = a("creeper", bxe.a.a(com::new, bxz.a).a(0.6F, 1.7F).a(8));
   public static final bxe<cuo> G = a("dark_oak_boat", bxe.a.a(a(() -> dae.oQ), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> H = a("dark_oak_chest_boat", bxe.a.a(b(() -> dae.oR), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cjz> I = a("dolphin", bxe.a.a(cjz::new, bxz.f).a(0.9F, 0.6F).b(0.3F));
   public static final bxe<clw> J = a("donkey", bxe.a.a(clw::new, bxz.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bxe<csl> K = a("dragon_fireball", bxe.a.<csl>a(csl::new, bxz.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bxe<cop> L = a("drowned", bxe.a.a(cop::new, bxz.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bxe<ctd> M = a("egg", bxe.a.<ctd>a(ctd::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<coq> N = a("elder_guardian", bxe.a.a(coq::new, bxz.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bxe<cor> O = a("enderman", bxe.a.a(cor::new, bxz.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bxe<cos> P = a("endermite", bxe.a.a(cos::new, bxz.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bxe<cmx> Q = a("ender_dragon", bxe.a.a(cmx::new, bxz.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bxe<cte> R = a("ender_pearl", bxe.a.<cte>a(cte::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<cmw> S = a("end_crystal", bxe.a.<cmw>a(cmw::new, bxz.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bxe<cou> T = a("evoker", bxe.a.a(cou::new, bxz.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxe<csm> U = a("evoker_fangs", bxe.a.<csm>a(csm::new, bxz.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bxe<ctf> V = a("experience_bottle", bxe.a.<ctf>a(ctf::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<bxj> W = a("experience_orb", bxe.a.<bxj>a(bxj::new, bxz.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bxe<csn> X = a("eye_of_ender", bxe.a.<csn>a(csn::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bxe<cod> Y = a("falling_block", bxe.a.<cod>a(cod::new, bxz.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bxe<css> Z = a("fireball", bxe.a.<css>a(css::new, bxz.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bxe<csp> aa = a("firework_rocket", bxe.a.<csp>a(csp::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<ckb> ab = a("fox", bxe.a.a(ckb::new, bxz.b).a(0.6F, 0.7F).b(0.4F).a(new ffs(0.0, 0.6375, -0.25)).a(8).a(dng.oO));
   public static final bxe<clj> ac = a("frog", bxe.a.a(clj::new, bxz.b).a(0.5F, 0.5F).a(new ffs(0.0, 0.375, -0.25)).a(10));
   public static final bxe<cux> ad = a("furnace_minecart", bxe.a.a(cux::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<cov> ae = a("ghast", bxe.a.a(cov::new, bxz.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bxe<cow> af = a("giant", bxe.a.a(cow::new, bxz.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bxe<cnv> ag = a("glow_item_frame", bxe.a.<cnv>a(cnv::new, bxz.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bxe<bxl> ah = a("glow_squid", bxe.a.a(bxl::new, bxz.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bxe<clr> ai = a("goat", bxe.a.a(clr::new, bxz.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bxe<cox> aj = a("guardian", bxe.a.a(cox::new, bxz.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bxe<cqi> ak = a("hoglin", bxe.a.a(cqi::new, bxz.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bxe<cuy> al = a("hopper_minecart", bxe.a.a(cuy::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<clx> am = a("horse", bxe.a.a(clx::new, bxz.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bxe<coy> an = a("husk", bxe.a.a(coy::new, bxz.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bxe<coz> ao = a("illusioner", bxe.a.a(coz::new, bxz.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxe<bxq> ap = a("interaction", bxe.a.a(bxq::new, bxz.h).e().a(0.0F, 0.0F).a(10));
   public static final bxe<ckc> aq = a("iron_golem", bxe.a.a(ckc::new, bxz.h).a(1.4F, 2.7F).a(10));
   public static final bxe<coe> ar = a("item", bxe.a.<coe>a(coe::new, bxz.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bxe<bws.g> as = a("item_display", bxe.a.a(bws.g::new, bxz.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxe<cnx> at = a("item_frame", bxe.a.<cnx>a(cnx::new, bxz.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bxe<cuo> au = a("jungle_boat", bxe.a.a(a(() -> dae.oK), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> av = a("jungle_chest_boat", bxe.a.a(b(() -> dae.oL), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cny> aw = a("leash_knot", bxe.a.<cny>a(cny::new, bxz.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bxe<bxv> ax = a("lightning_bolt", bxe.a.a(bxv::new, bxz.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bxe<cly> ay = a("llama", bxe.a.a(cly::new, bxz.b).a(0.9F, 1.87F).b(1.7765F).a(new ffs(0.0, 1.37, -0.3)).a(10));
   public static final bxe<cst> az = a("llama_spit", bxe.a.<cst>a(cst::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<cpa> aA = a("magma_cube", bxe.a.a(cpa::new, bxz.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bxe<cuo> aB = a("mangrove_boat", bxe.a.a(a(() -> dae.oU), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> aC = a("mangrove_chest_boat", bxe.a.a(b(() -> dae.oV), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<bxx> aD = a("marker", bxe.a.a(bxx::new, bxz.h).e().a(0.0F, 0.0F).a(0));
   public static final bxe<cut> aE = a("minecart", bxe.a.a(cut::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<ckd> aF = a("mooshroom", bxe.a.a(ckd::new, bxz.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bxe<cma> aG = a("mule", bxe.a.a(cma::new, bxz.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bxe<cuo> aH = a("oak_boat", bxe.a.a(a(() -> dae.oE), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> aI = a("oak_chest_boat", bxe.a.a(b(() -> dae.oF), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cke> aJ = a("ocelot", bxe.a.a(cke::new, bxz.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bxe<byc> aK = a("ominous_item_spawner", bxe.a.a(byc::new, bxz.h).e().a(0.25F, 0.25F).a(8));
   public static final bxe<cnz> aL = a("painting", bxe.a.<cnz>a(cnz::new, bxz.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bxe<cuo> aM = a("pale_oak_boat", bxe.a.a(a(() -> dae.oS), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> aN = a("pale_oak_chest_boat", bxe.a.a(b(() -> dae.oT), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<ckf> aO = a("panda", bxe.a.a(ckf::new, bxz.b).a(1.3F, 1.25F).a(10));
   public static final bxe<ckg> aP = a("parrot", bxe.a.a(ckg::new, bxz.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bxe<cpd> aQ = a("phantom", bxe.a.a(cpd::new, bxz.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bxe<ckh> aR = a("pig", bxe.a.a(ckh::new, bxz.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bxe<cqo> aS = a("piglin", bxe.a.a(cqo::new, bxz.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bxe<cqr> aT = a("piglin_brute", bxe.a.a(cqr::new, bxz.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bxe<cpe> aU = a("pillager", bxe.a.a(cpe::new, bxz.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxe<ckk> aV = a("polar_bear", bxe.a.a(ckk::new, bxz.b).a(dng.rx).a(1.4F, 1.4F).a(10));
   public static final bxe<cth> aW = a("splash_potion", bxe.a.<cth>a(cth::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<ctg> aX = a("lingering_potion", bxe.a.<ctg>a(ctg::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<ckl> aY = a("pufferfish", bxe.a.a(ckl::new, bxz.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bxe<ckm> aZ = a("rabbit", bxe.a.a(ckm::new, bxz.b).a(0.4F, 0.5F).a(8));
   public static final bxe<cpg> ba = a("ravager", bxe.a.a(cpg::new, bxz.a).a(1.95F, 2.2F).a(new ffs(0.0, 2.2625, -0.0625)).a(10));
   public static final bxe<ckn> bb = a("salmon", bxe.a.a(ckn::new, bxz.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bxe<cmi> bc = a("sheep", bxe.a.a(cmi::new, bxz.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bxe<cph> bd = a("shulker", bxe.a.a(cph::new, bxz.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bxe<csx> be = a("shulker_bullet", bxe.a.<csx>a(csx::new, bxz.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bxe<cpi> bf = a("silverfish", bxe.a.a(cpi::new, bxz.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bxe<cpj> bg = a("skeleton", bxe.a.a(cpj::new, bxz.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bxe<cmb> bh = a("skeleton_horse", bxe.a.a(cmb::new, bxz.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bxe<cpk> bi = a("slime", bxe.a.a(cpk::new, bxz.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bxe<csy> bj = a("small_fireball", bxe.a.<csy>a(csy::new, bxz.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bxe<cml> bk = a("sniffer", bxe.a.a(cml::new, bxz.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bxe<csz> bl = a("snowball", bxe.a.<csz>a(csz::new, bxz.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxe<ckp> bm = a("snow_golem", bxe.a.a(ckp::new, bxz.h).a(dng.rx).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bxe<cuz> bn = a("spawner_minecart", bxe.a.a(cuz::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<cta> bo = a("spectral_arrow", bxe.a.<cta>a(cta::new, bxz.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxe<cpm> bp = a("spider", bxe.a.a(cpm::new, bxz.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bxe<cuo> bq = a("spruce_boat", bxe.a.a(a(() -> dae.oG), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<cup> br = a("spruce_chest_boat", bxe.a.a(b(() -> dae.oH), bxz.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxe<ckq> bs = a("squid", bxe.a.a(ckq::new, bxz.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bxe<cpn> bt = a("stray", bxe.a.a(cpn::new, bxz.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dng.rx).a(8));
   public static final bxe<cpo> bu = a("strider", bxe.a.a(cpo::new, bxz.b).c().a(0.9F, 1.7F).a(10));
   public static final bxe<clo> bv = a("tadpole", bxe.a.a(clo::new, bxz.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bxe<bws.k> bw = a("text_display", bxe.a.a(bws.k::new, bxz.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxe<cof> bx = a("tnt", bxe.a.<cof>a(cof::new, bxz.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bxe<cva> by = a("tnt_minecart", bxe.a.a(cva::new, bxz.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxe<cmd> bz = a("trader_llama", bxe.a.a(cmd::new, bxz.b).a(0.9F, 1.87F).b(1.7765F).a(new ffs(0.0, 1.37, -0.3)).a(10));
   public static final bxe<cti> bA = a("trident", bxe.a.<cti>a(cti::new, bxz.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxe<cks> bB = a("tropical_fish", bxe.a.a(cks::new, bxz.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bxe<ckt> bC = a("turtle", bxe.a.a(ckt::new, bxz.b).a(1.2F, 0.4F).a(new ffs(0.0, 0.55625, -0.25)).a(10));
   public static final bxe<cpp> bD = a("vex", bxe.a.a(cpp::new, bxz.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bxe<crl> bE = a("villager", bxe.a.<crl>a(crl::new, bxz.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bxe<cpq> bF = a("vindicator", bxe.a.a(cpq::new, bxz.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxe<crr> bG = a("wandering_trader", bxe.a.a(crr::new, bxz.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bxe<crc> bH = a("warden", bxe.a.a(crc::new, bxz.a).a(0.9F, 2.9F).a(3.15F).a(bww.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bxe<ctn> bI = a("wind_charge", bxe.a.<ctn>a(ctn::new, bxz.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bxe<cpr> bJ = a("witch", bxe.a.a(cpr::new, bxz.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bxe<cnr> bK = a("wither", bxe.a.a(cnr::new, bxz.a).c().a(dng.cn).a(0.9F, 3.5F).a(10));
   public static final bxe<cps> bL = a("wither_skeleton", bxe.a.a(cps::new, bxz.a).c().a(dng.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bxe<ctj> bM = a("wither_skull", bxe.a.<ctj>a(ctj::new, bxz.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bxe<cmo> bN = a("wolf", bxe.a.a(cmo::new, bxz.b).a(0.6F, 0.85F).b(0.68F).a(new ffs(0.0, 0.81875, -0.0625)).a(10));
   public static final bxe<cpt> bO = a("zoglin", bxe.a.a(cpt::new, bxz.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bxe<cpu> bP = a("zombie", bxe.a.<cpu>a(cpu::new, bxz.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bxe<cmf> bQ = a("zombie_horse", bxe.a.a(cmf::new, bxz.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bxe<cpv> bR = a("zombie_villager", bxe.a.a(cpv::new, bxz.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bxe<cpw> bS = a("zombified_piglin", bxe.a.a(cpw::new, bxz.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bxe<crz> bT = a("player", bxe.a.<crz>a(bxz.h).b().a().a(0.6F, 1.8F).b(1.62F).a(crz.bI).a(32).b(2));
   public static final bxe<csq> bU = a("fishing_bobber", bxe.a.<csq>a(csq::new, bxz.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bxe<?>> ca = Set.of(Y, C, bn);
   private final bxe.b<T> cb;
   private final bxz cc;
   private final ImmutableSet<dne> cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final boolean ch;
   private final int ci;
   private final int cj;
   private final String ck;
   @Nullable
   private xc cl;
   private final Optional<alj<fao>> cm;
   private final bwy cn;
   private final float co;
   private final cvj cp;

   private static <T extends bwv> bxe<T> a(alj<bxe<?>> $$0, bxe.a<T> $$1) {
      return jt.a(mh.f, $$0, $$1.a($$0));
   }

   private static alj<bxe<?>> b(String $$0) {
      return alj.a(mi.B, alk.b($$0));
   }

   private static <T extends bwv> bxe<T> a(String $$0, bxe.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alk a(bxe<?> $$0) {
      return mh.f.b($$0);
   }

   public static Optional<bxe<?>> a(String $$0) {
      return mh.f.b(alk.c($$0));
   }

   public bxe(
      bxe.b<T> $$0,
      bxz $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dne> $$6,
      bwy $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alj<fao>> $$12,
      cvj $$13
   ) {
      this.cb = $$0;
      this.cc = $$1;
      this.ch = $$5;
      this.ce = $$2;
      this.cf = $$3;
      this.cg = $$4;
      this.cd = $$6;
      this.cn = $$7;
      this.co = $$8;
      this.ci = $$9;
      this.cj = $$10;
      this.ck = $$11;
      this.cm = $$12;
      this.cp = $$13;
   }

   @Nullable
   public T a(aru $$0, @Nullable daa $$1, @Nullable bxw $$2, iw $$3, bxd $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwv> Consumer<T> a(djz $$0, daa $$1, @Nullable bxw $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwv> Consumer<T> a(Consumer<T> $$0, djz $$1, daa $$2, @Nullable bxw $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwv> Consumer<T> a(Consumer<T> $$0, daa $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwv> Consumer<T> b(Consumer<T> $$0, djz $$1, daa $$2, @Nullable bxw $$3) {
      dci $$4 = $$2.a(kl.Y, dci.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aru $$0, iw $$1, bxd $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aru $$0, @Nullable Consumer<T> $$1, iw $$2, bxd $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bxy $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(aru $$0, @Nullable Consumer<T> $$1, iw $$2, bxd $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azq.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bxy $$9) {
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

   protected static double a(dkc $$0, iw $$1, boolean $$2, ffn $$3) {
      ffn $$4 = new ffn($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fgm> $$5 = $$0.d(null, $$4);
      return 1.0 + fgj.a(jc.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(djz $$0, @Nullable bxw $$1, @Nullable bwv $$2, dci $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bxe<?> $$5 = $$3.a($$4.ba(), mi.B);
         if ($$2.an() == $$5) {
            if ($$0.C || !$$2.an().s() || $$1 instanceof crz $$6 && $$4.ag().f($$6.gi())) {
               $$3.a($$2);
            }
         }
      }
   }

   public boolean b() {
      return this.ce;
   }

   public boolean c() {
      return this.cf;
   }

   public boolean d() {
      return this.cg;
   }

   public boolean e() {
      return this.ch;
   }

   public bxz f() {
      return this.cc;
   }

   public String g() {
      return this.ck;
   }

   public xc h() {
      if (this.cl == null) {
         this.cl = xc.c(this.g());
      }

      return this.cl;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<alj<fao>> j() {
      return this.cm;
   }

   public float l() {
      return this.cn.a();
   }

   public float m() {
      return this.cn.b();
   }

   @Override
   public cvj k() {
      return this.cp;
   }

   @Nullable
   public T a(djz $$0, bxd $$1) {
      return !this.a($$0.K()) ? null : this.cb.create(this, $$0);
   }

   public static Optional<bwv> a(ua $$0, djz $$1, bxd $$2) {
      return ag.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.i($$0), () -> bW.warn("Skipping Entity with id {}", $$0.b("id", "[invalid]")));
   }

   public ffn a(double $$0, double $$1, double $$2) {
      float $$3 = this.co * this.l() / 2.0F;
      float $$4 = this.co * this.m();
      return new ffn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(ebg $$0) {
      if (this.cd.contains($$0.b())) {
         return false;
      } else {
         return !this.cg && eyd.a($$0) ? true : $$0.a(dng.cn) || $$0.a(dng.oO) || $$0.a(dng.eg) || $$0.a(dng.rx);
      }
   }

   public bwy n() {
      return this.cn;
   }

   public static Optional<bxe<?>> a(ua $$0) {
      return $$0.a("id", a);
   }

   @Nullable
   public static bwv a(ua $$0, djz $$1, bxd $$2, Function<bwv, bwv> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         ug $$5 = $$0.p("Passengers");

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            bwv $$7 = a($$5.b($$6), $$1, $$2, $$3);
            if ($$7 != null) {
               $$7.a($$4, true);
            }
         }

         return (bwv)$$4;
      }).orElse(null);
   }

   public static Stream<bwv> a(List<? extends va> $$0, djz $$1, bxd $$2) {
      return $$0.stream().flatMap($$0x -> $$0x.s_().stream()).mapMulti(($$2x, $$3) -> a($$2x, $$1, $$2, $$1xx -> {
            $$3.accept($$1xx);
            return $$1xx;
         }));
   }

   private static Optional<bwv> b(ua $$0, djz $$1, bxd $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bW.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.ci;
   }

   public int p() {
      return this.cj;
   }

   public boolean q() {
      return this != bT && this != az && this != bK && this != l && this != at && this != ag && this != aw && this != aL && this != S && this != U;
   }

   public boolean a(axv<bxe<?>> $$0) {
      return this.bX.a($$0);
   }

   public boolean a(jk<bxe<?>> $$0) {
      return $$0.a(this.bX);
   }

   @Nullable
   public T a(bwv $$0) {
      return (T)($$0.an() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bwv> a() {
      return bwv.class;
   }

   @Deprecated
   public jg.c<bxe<?>> r() {
      return this.bX;
   }

   private static bxe.b<cuo> a(Supplier<czw> $$0) {
      return ($$1, $$2) -> new cuo($$1, $$2, $$0);
   }

   private static bxe.b<cup> b(Supplier<czw> $$0) {
      return ($$1, $$2) -> new cup($$1, $$2, $$0);
   }

   private static bxe.b<cvd> c(Supplier<czw> $$0) {
      return ($$1, $$2) -> new cvd($$1, $$2, $$0);
   }

   private static bxe.b<cuq> d(Supplier<czw> $$0) {
      return ($$1, $$2) -> new cuq($$1, $$2, $$0);
   }

   public boolean s() {
      return ca.contains(this);
   }

   public static class a<T extends bwv> {
      private final bxe.b<T> a;
      private final bxz b;
      private ImmutableSet<dne> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bwy j = bwy.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwx.a l = bwx.a();
      private cvj m = cvl.g;
      private alc<bxe<?>, Optional<alj<fao>>> n = $$0x -> Optional.of(alj.a(mi.br, $$0x.a().f("entities/")));
      private final alc<bxe<?>, String> o = $$0x -> ag.a("entity", $$0x.a());

      private a(bxe.b<T> $$0, bxz $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bxz.b || $$1 == bxz.h;
      }

      public static <T extends bwv> bxe.a<T> a(bxe.b<T> $$0, bxz $$1) {
         return new bxe.a<>($$0, $$1);
      }

      public static <T extends bwv> bxe.a<T> a(bxz $$0) {
         return new bxe.a<>(($$0x, $$1) -> null, $$0);
      }

      public bxe.a<T> a(float $$0, float $$1) {
         this.j = bwy.b($$0, $$1);
         return this;
      }

      public bxe.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bxe.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bxe.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bww.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bxe.a<T> a(ffs... $$0) {
         for (ffs $$1 : $$0) {
            this.l = this.l.a(bww.a, $$1);
         }

         return this;
      }

      public bxe.a<T> a(ffs $$0) {
         return this.a(bww.b, $$0);
      }

      public bxe.a<T> c(float $$0) {
         return this.a(bww.b, 0.0F, -$$0, 0.0F);
      }

      public bxe.a<T> d(float $$0) {
         return this.a(bww.c, 0.0F, $$0, 0.0F);
      }

      public bxe.a<T> a(bww $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bxe.a<T> a(bww $$0, ffs $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bxe.a<T> a() {
         this.e = false;
         return this;
      }

      public bxe.a<T> b() {
         this.d = false;
         return this;
      }

      public bxe.a<T> c() {
         this.f = true;
         return this;
      }

      public bxe.a<T> a(dne... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bxe.a<T> d() {
         this.g = true;
         return this;
      }

      public bxe.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bxe.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bxe.a<T> a(cvh... $$0) {
         this.m = cvl.e.a($$0);
         return this;
      }

      public bxe.a<T> e() {
         this.n = alc.fixed(Optional.empty());
         return this;
      }

      public bxe<T> a(alj<bxe<?>> $$0) {
         if (this.d) {
            ag.a(bjd.C, $$0.a().toString());
         }

         return new bxe<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bwv> {
      @Nullable
      T create(bxe<T> var1, djz var2);
   }
}
