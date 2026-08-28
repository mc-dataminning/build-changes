import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bur<T extends buk> implements crq, ebh<buk, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jr.c<bur<?>> bW = mb.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bur<cqy> a = a("acacia_boat", bur.a.a(a(() -> cwt.oF), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> b = a("acacia_chest_boat", bur.a.a(b(() -> cwt.oG), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cid> c = a("allay", bur.a.a(cid::new, bvj.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bur<bud> d = a("area_effect_cloud", bur.a.<bud>a(bud::new, bvj.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bur<cig> e = a("armadillo", bur.a.a(cig::new, bvj.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bur<ckq> f = a("armor_stand", bur.a.<ckq>a(ckq::new, bvj.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bur<cpg> g = a("arrow", bur.a.<cpg>a(cpg::new, bvj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bur<cij> h = a("axolotl", bur.a.a(cij::new, bvj.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bur<cra> i = a("bamboo_chest_raft", bur.a.a(d(() -> cwt.oQ), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<crn> j = a("bamboo_raft", bur.a.a(c(() -> cwt.oP), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cgr> k = a("bat", bur.a.a(cgr::new, bvj.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bur<cgy> l = a("bee", bur.a.a(cgy::new, bvj.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bur<cqy> m = a("birch_boat", bur.a.a(a(() -> cwt.oB), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> n = a("birch_chest_boat", bur.a.a(b(() -> cwt.oC), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<clg> o = a("blaze", bur.a.a(clg::new, bvj.a).c().a(0.6F, 1.8F).a(8));
   public static final bur<bui.b> p = a("block_display", bur.a.a(bui.b::new, bvj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bur<clh> q = a("bogged", bur.a.a(clh::new, bvj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bur<cmt> r = a("breeze", bur.a.a(cmt::new, bvj.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bur<cqh> s = a("breeze_wind_charge", bur.a.<cqh>a(cqh::new, bvj.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bur<cio> t = a("camel", bur.a.a(cio::new, bvj.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bur<cha> u = a("cat", bur.a.a(cha::new, bvj.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bur<cli> v = a("cave_spider", bur.a.a(cli::new, bvj.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bur<cqy> w = a("cherry_boat", bur.a.a(a(() -> cwt.oH), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> x = a("cherry_chest_boat", bur.a.a(b(() -> cwt.oI), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<crf> y = a("chest_minecart", bur.a.a(crf::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<chc> z = a("chicken", bur.a.a(chc::new, bvj.b).a(0.4F, 0.7F).b(0.644F).a(new fba(0.0, 0.7, -0.1)).a(10));
   public static final bur<chd> A = a("cod", bur.a.a(chd::new, bvj.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bur<crg> B = a("command_block_minecart", bur.a.a(crg::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<che> C = a("cow", bur.a.a(che::new, bvj.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bur<cnb> D = a("creaking", bur.a.a(cnb::new, bvj.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bur<cnd> E = a("creaking_transient", bur.a.a(cnd::new, bvj.a).b().a().c().a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bur<clj> F = a("creeper", bur.a.a(clj::new, bvj.a).a(0.6F, 1.7F).a(8));
   public static final bur<cqy> G = a("dark_oak_boat", bur.a.a(a(() -> cwt.oJ), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> H = a("dark_oak_chest_boat", bur.a.a(b(() -> cwt.oK), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chf> I = a("dolphin", bur.a.a(chf::new, bvj.f).a(0.9F, 0.6F).b(0.3F));
   public static final bur<cjc> J = a("donkey", bur.a.a(cjc::new, bvj.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bur<cph> K = a("dragon_fireball", bur.a.<cph>a(cph::new, bvj.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bur<cll> L = a("drowned", bur.a.a(cll::new, bvj.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cpz> M = a("egg", bur.a.<cpz>a(cpz::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<clm> N = a("elder_guardian", bur.a.a(clm::new, bvj.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bur<cln> O = a("enderman", bur.a.a(cln::new, bvj.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bur<clo> P = a("endermite", bur.a.a(clo::new, bvj.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bur<cju> Q = a("ender_dragon", bur.a.a(cju::new, bvj.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bur<cqa> R = a("ender_pearl", bur.a.<cqa>a(cqa::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<cjt> S = a("end_crystal", bur.a.<cjt>a(cjt::new, bvj.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bur<clq> T = a("evoker", bur.a.a(clq::new, bvj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<cpi> U = a("evoker_fangs", bur.a.<cpi>a(cpi::new, bvj.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bur<cqb> V = a("experience_bottle", bur.a.<cqb>a(cqb::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<buw> W = a("experience_orb", bur.a.<buw>a(buw::new, bvj.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bur<cpj> X = a("eye_of_ender", bur.a.<cpj>a(cpj::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bur<cla> Y = a("falling_block", bur.a.<cla>a(cla::new, bvj.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bur<cpo> Z = a("fireball", bur.a.<cpo>a(cpo::new, bvj.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bur<cpl> aa = a("firework_rocket", bur.a.<cpl>a(cpl::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<chh> ab = a("fox", bur.a.a(chh::new, bvj.b).a(0.6F, 0.7F).b(0.4F).a(new fba(0.0, 0.6375, -0.25)).a(8).a(djo.oK));
   public static final bur<cir> ac = a("frog", bur.a.a(cir::new, bvj.b).a(0.5F, 0.5F).a(new fba(0.0, 0.375, -0.25)).a(10));
   public static final bur<crh> ad = a("furnace_minecart", bur.a.a(crh::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<clr> ae = a("ghast", bur.a.a(clr::new, bvj.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bur<cls> af = a("giant", bur.a.a(cls::new, bvj.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bur<cks> ag = a("glow_item_frame", bur.a.<cks>a(cks::new, bvj.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bur<buy> ah = a("glow_squid", bur.a.a(buy::new, bvj.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bur<cix> ai = a("goat", bur.a.a(cix::new, bvj.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bur<clt> aj = a("guardian", bur.a.a(clt::new, bvj.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bur<cnf> ak = a("hoglin", bur.a.a(cnf::new, bvj.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bur<cri> al = a("hopper_minecart", bur.a.a(cri::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<cjd> am = a("horse", bur.a.a(cjd::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bur<clu> an = a("husk", bur.a.a(clu::new, bvj.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bur<clv> ao = a("illusioner", bur.a.a(clv::new, bvj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<bvb> ap = a("interaction", bur.a.a(bvb::new, bvj.h).e().a(0.0F, 0.0F).a(10));
   public static final bur<chj> aq = a("iron_golem", bur.a.a(chj::new, bvj.h).a(1.4F, 2.7F).a(10));
   public static final bur<clb> ar = a("item", bur.a.<clb>a(clb::new, bvj.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bur<bui.g> as = a("item_display", bur.a.a(bui.g::new, bvj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bur<cku> at = a("item_frame", bur.a.<cku>a(cku::new, bvj.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bur<cqy> au = a("jungle_boat", bur.a.a(a(() -> cwt.oD), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> av = a("jungle_chest_boat", bur.a.a(b(() -> cwt.oE), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<ckv> aw = a("leash_knot", bur.a.<ckv>a(ckv::new, bvj.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bur<bvf> ax = a("lightning_bolt", bur.a.a(bvf::new, bvj.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bur<cje> ay = a("llama", bur.a.a(cje::new, bvj.b).a(0.9F, 1.87F).b(1.7765F).a(new fba(0.0, 1.37, -0.3)).a(10));
   public static final bur<cpp> az = a("llama_spit", bur.a.<cpp>a(cpp::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<clw> aA = a("magma_cube", bur.a.a(clw::new, bvj.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bur<cqy> aB = a("mangrove_boat", bur.a.a(a(() -> cwt.oN), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> aC = a("mangrove_chest_boat", bur.a.a(b(() -> cwt.oO), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<bvh> aD = a("marker", bur.a.a(bvh::new, bvj.h).e().a(0.0F, 0.0F).a(0));
   public static final bur<crd> aE = a("minecart", bur.a.a(crd::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<chk> aF = a("mooshroom", bur.a.a(chk::new, bvj.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bur<cjg> aG = a("mule", bur.a.a(cjg::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bur<cqy> aH = a("oak_boat", bur.a.a(a(() -> cwt.ox), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> aI = a("oak_chest_boat", bur.a.a(b(() -> cwt.oy), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chl> aJ = a("ocelot", bur.a.a(chl::new, bvj.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bur<bvm> aK = a("ominous_item_spawner", bur.a.a(bvm::new, bvj.h).e().a(0.25F, 0.25F).a(8));
   public static final bur<ckw> aL = a("painting", bur.a.<ckw>a(ckw::new, bvj.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bur<cqy> aM = a("pale_oak_boat", bur.a.a(a(() -> cwt.oL), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> aN = a("pale_oak_chest_boat", bur.a.a(b(() -> cwt.oM), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chm> aO = a("panda", bur.a.a(chm::new, bvj.b).a(1.3F, 1.25F).a(10));
   public static final bur<chn> aP = a("parrot", bur.a.a(chn::new, bvj.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bur<clz> aQ = a("phantom", bur.a.a(clz::new, bvj.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bur<cho> aR = a("pig", bur.a.a(cho::new, bvj.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bur<cnl> aS = a("piglin", bur.a.a(cnl::new, bvj.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cno> aT = a("piglin_brute", bur.a.a(cno::new, bvj.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cma> aU = a("pillager", bur.a.a(cma::new, bvj.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<chp> aV = a("polar_bear", bur.a.a(chp::new, bvj.b).a(djo.rr).a(1.4F, 1.4F).a(10));
   public static final bur<cqc> aW = a("potion", bur.a.<cqc>a(cqc::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<chq> aX = a("pufferfish", bur.a.a(chq::new, bvj.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bur<chr> aY = a("rabbit", bur.a.a(chr::new, bvj.b).a(0.4F, 0.5F).a(8));
   public static final bur<cmc> aZ = a("ravager", bur.a.a(cmc::new, bvj.a).a(1.95F, 2.2F).a(new fba(0.0, 2.2625, -0.0625)).a(10));
   public static final bur<chs> ba = a("salmon", bur.a.a(chs::new, bvj.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bur<cht> bb = a("sheep", bur.a.a(cht::new, bvj.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bur<cmd> bc = a("shulker", bur.a.a(cmd::new, bvj.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bur<cpt> bd = a("shulker_bullet", bur.a.<cpt>a(cpt::new, bvj.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bur<cme> be = a("silverfish", bur.a.a(cme::new, bvj.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bur<cmf> bf = a("skeleton", bur.a.a(cmf::new, bvj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bur<cjh> bg = a("skeleton_horse", bur.a.a(cjh::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bur<cmg> bh = a("slime", bur.a.a(cmg::new, bvj.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bur<cpu> bi = a("small_fireball", bur.a.<cpu>a(cpu::new, bvj.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bur<cjo> bj = a("sniffer", bur.a.a(cjo::new, bvj.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bur<cpv> bk = a("snowball", bur.a.<cpv>a(cpv::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<chv> bl = a("snow_golem", bur.a.a(chv::new, bvj.h).a(djo.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bur<crj> bm = a("spawner_minecart", bur.a.a(crj::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<cpw> bn = a("spectral_arrow", bur.a.<cpw>a(cpw::new, bvj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bur<cmi> bo = a("spider", bur.a.a(cmi::new, bvj.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bur<cqy> bp = a("spruce_boat", bur.a.a(a(() -> cwt.oz), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqz> bq = a("spruce_chest_boat", bur.a.a(b(() -> cwt.oA), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chw> br = a("squid", bur.a.a(chw::new, bvj.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bur<cmj> bs = a("stray", bur.a.a(cmj::new, bvj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(djo.rr).a(8));
   public static final bur<cmk> bt = a("strider", bur.a.a(cmk::new, bvj.b).c().a(0.9F, 1.7F).a(10));
   public static final bur<ciu> bu = a("tadpole", bur.a.a(ciu::new, bvj.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bur<bui.l> bv = a("text_display", bur.a.a(bui.l::new, bvj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bur<clc> bw = a("tnt", bur.a.<clc>a(clc::new, bvj.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bur<crk> bx = a("tnt_minecart", bur.a.a(crk::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<cjj> by = a("trader_llama", bur.a.a(cjj::new, bvj.b).a(0.9F, 1.87F).b(1.7765F).a(new fba(0.0, 1.37, -0.3)).a(10));
   public static final bur<cqd> bz = a("trident", bur.a.<cqd>a(cqd::new, bvj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bur<chx> bA = a("tropical_fish", bur.a.a(chx::new, bvj.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bur<chy> bB = a("turtle", bur.a.a(chy::new, bvj.b).a(1.2F, 0.4F).a(new fba(0.0, 0.55625, -0.25)).a(10));
   public static final bur<cml> bC = a("vex", bur.a.a(cml::new, bvj.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bur<coi> bD = a("villager", bur.a.<coi>a(coi::new, bvj.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bur<cmm> bE = a("vindicator", bur.a.a(cmm::new, bvj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<cop> bF = a("wandering_trader", bur.a.a(cop::new, bvj.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bur<cnz> bG = a("warden", bur.a.a(cnz::new, bvj.a).a(0.9F, 2.9F).a(3.15F).a(bul.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bur<cqi> bH = a("wind_charge", bur.a.<cqi>a(cqi::new, bvj.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bur<cmn> bI = a("witch", bur.a.a(cmn::new, bvj.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bur<cko> bJ = a("wither", bur.a.a(cko::new, bvj.a).c().a(djo.ck).a(0.9F, 3.5F).a(10));
   public static final bur<cmo> bK = a("wither_skeleton", bur.a.a(cmo::new, bvj.a).c().a(djo.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bur<cqe> bL = a("wither_skull", bur.a.<cqe>a(cqe::new, bvj.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bur<cia> bM = a("wolf", bur.a.a(cia::new, bvj.b).a(0.6F, 0.85F).b(0.68F).a(new fba(0.0, 0.81875, -0.0625)).a(10));
   public static final bur<cmp> bN = a("zoglin", bur.a.a(cmp::new, bvj.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bur<cmq> bO = a("zombie", bur.a.<cmq>a(cmq::new, bvj.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cjl> bP = a("zombie_horse", bur.a.a(cjl::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bur<cmr> bQ = a("zombie_villager", bur.a.a(cmr::new, bvj.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bur<cms> bR = a("zombified_piglin", bur.a.a(cms::new, bvj.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bur<cox> bS = a("player", bur.a.<cox>a(bvj.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cox.bU).a(32).b(2));
   public static final bur<cpm> bT = a("fishing_bobber", bur.a.<cpm>a(cpm::new, bvj.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bur.b<T> bZ;
   private final bvj ca;
   private final ImmutableSet<djm> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private wo cj;
   private final Optional<akt<evw>> ck;
   private final bun cl;
   private final float cm;
   private final crt cn;

   private static <T extends buk> bur<T> a(akt<bur<?>> $$0, bur.a<T> $$1) {
      return ke.a(mb.f, $$0, $$1.a($$0));
   }

   private static akt<bur<?>> b(String $$0) {
      return akt.a(mc.z, aku.b($$0));
   }

   private static <T extends buk> bur<T> a(String $$0, bur.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static aku a(bur<?> $$0) {
      return mb.f.b($$0);
   }

   public static Optional<bur<?>> a(String $$0) {
      return mb.f.b(aku.c($$0));
   }

   public bur(
      bur.b<T> $$0,
      bvj $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<djm> $$6,
      bun $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<akt<evw>> $$12,
      crt $$13
   ) {
      this.bZ = $$0;
      this.ca = $$1;
      this.cf = $$5;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cb = $$6;
      this.cl = $$7;
      this.cm = $$8;
      this.cg = $$9;
      this.ch = $$10;
      this.ci = $$11;
      this.ck = $$12;
      this.cn = $$13;
   }

   @Nullable
   public T a(arc $$0, @Nullable cwp $$1, @Nullable cox $$2, ji $$3, buq $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends buk> Consumer<T> a(dgi $$0, cwp $$1, @Nullable cox $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends buk> Consumer<T> a(Consumer<T> $$0, dgi $$1, cwp $$2, @Nullable cox $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends buk> Consumer<T> a(Consumer<T> $$0, cwp $$1) {
      wo $$2 = $$1.a(kv.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends buk> Consumer<T> b(Consumer<T> $$0, dgi $$1, cwp $$2, @Nullable cox $$3) {
      cyy $$4 = $$2.a(kv.W, cyy.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arc $$0, ji $$1, buq $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arc $$0, @Nullable Consumer<T> $$1, ji $$2, buq $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bvi $$7) {
            $$7.R();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(arc $$0, @Nullable Consumer<T> $$1, ji $$2, buq $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayz.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvi $$9) {
            $$9.aZ = $$9.dM();
            $$9.aX = $$9.dM();
            $$9.a($$0, $$0.d_($$9.dw()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dgl $$0, ji $$1, boolean $$2, fav $$3) {
      fav $$4 = new fav($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fbu> $$5 = $$0.d(null, $$4);
      return 1.0 + fbr.a(jn.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgi $$0, @Nullable cox $$1, @Nullable buk $$2, cyy $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cW() || $$1 != null && $$4.ag().f($$1.gh())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.cc;
   }

   public boolean c() {
      return this.cd;
   }

   public boolean d() {
      return this.ce;
   }

   public boolean e() {
      return this.cf;
   }

   public bvj f() {
      return this.ca;
   }

   public String g() {
      return this.ci;
   }

   public wo h() {
      if (this.cj == null) {
         this.cj = wo.c(this.g());
      }

      return this.cj;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<akt<evw>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public crt i() {
      return this.cn;
   }

   @Nullable
   public T a(dgi $$0, buq $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<buk> a(tq $$0, dgi $$1, buq $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fav a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fav($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dwx $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && etm.a($$0) ? true : $$0.a(djo.ck) || $$0.a(djo.oK) || $$0.a(djo.ed) || $$0.a(djo.rr);
      }
   }

   public bun n() {
      return this.cl;
   }

   public static Optional<bur<?>> a(tq $$0) {
      return mb.f.b(aku.a($$0.l("id")));
   }

   @Nullable
   public static buk a(tq $$0, dgi $$1, buq $$2, Function<buk, buk> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            tw $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               buk $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (buk)$$4;
      }).orElse(null);
   }

   public static Stream<buk> a(final List<? extends un> $$0, final dgi $$1, final buq $$2) {
      final Spliterator<? extends un> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<buk>() {
         @Override
         public boolean tryAdvance(Consumer<? super buk> $$0x) {
            return $$3.tryAdvance($$3xx -> bur.a((tq)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<buk> trySplit() {
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

   private static Optional<buk> b(tq $$0, dgi $$1, buq $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bV.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.cg;
   }

   public int p() {
      return this.ch;
   }

   public boolean q() {
      return this != bS && this != az && this != bJ && this != k && this != at && this != ag && this != aw && this != aL && this != S && this != U;
   }

   public boolean a(axf<bur<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(jv<bur<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(buk $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends buk> a() {
      return buk.class;
   }

   @Deprecated
   public jr.c<bur<?>> r() {
      return this.bW;
   }

   private static bur.b<cqy> a(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new cqy($$1, $$2, $$0);
   }

   private static bur.b<cqz> b(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new cqz($$1, $$2, $$0);
   }

   private static bur.b<crn> c(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new crn($$1, $$2, $$0);
   }

   private static bur.b<cra> d(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new cra($$1, $$2, $$0);
   }

   public static class a<T extends buk> {
      private final bur.b<T> a;
      private final bvj b;
      private ImmutableSet<djm> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bun j = bun.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bum.a l = bum.a();
      private crt m = crv.g;
      private akm<bur<?>, Optional<akt<evw>>> n = $$0x -> Optional.of(akt.a(mc.bg, $$0x.a().f("entities/")));
      private akm<bur<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bur.b<T> $$0, bvj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvj.b || $$1 == bvj.h;
      }

      public static <T extends buk> bur.a<T> a(bur.b<T> $$0, bvj $$1) {
         return new bur.a<>($$0, $$1);
      }

      public static <T extends buk> bur.a<T> a(bvj $$0) {
         return new bur.a<>(($$0x, $$1) -> null, $$0);
      }

      public bur.a<T> a(float $$0, float $$1) {
         this.j = bun.b($$0, $$1);
         return this;
      }

      public bur.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bur.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bur.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bul.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bur.a<T> a(fba... $$0) {
         for (fba $$1 : $$0) {
            this.l = this.l.a(bul.a, $$1);
         }

         return this;
      }

      public bur.a<T> a(fba $$0) {
         return this.a(bul.b, $$0);
      }

      public bur.a<T> c(float $$0) {
         return this.a(bul.b, 0.0F, -$$0, 0.0F);
      }

      public bur.a<T> d(float $$0) {
         return this.a(bul.c, 0.0F, $$0, 0.0F);
      }

      public bur.a<T> a(bul $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bur.a<T> a(bul $$0, fba $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bur.a<T> a() {
         this.e = false;
         return this;
      }

      public bur.a<T> b() {
         this.d = false;
         return this;
      }

      public bur.a<T> c() {
         this.f = true;
         return this;
      }

      public bur.a<T> a(djm... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bur.a<T> d() {
         this.g = true;
         return this;
      }

      public bur.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bur.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bur.a<T> a(crr... $$0) {
         this.m = crv.e.a($$0);
         return this;
      }

      public bur.a<T> e() {
         this.n = akm.fixed(Optional.empty());
         return this;
      }

      public bur<T> a(akt<bur<?>> $$0) {
         if (this.d) {
            af.a(bhw.A, $$0.a().toString());
         }

         return new bur<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends buk> {
      T create(bur<T> var1, dgi var2);
   }
}
