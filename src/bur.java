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

public class bur<T extends buk> implements crp, ebg<buk, T> {
   private static final Logger bU = LogUtils.getLogger();
   private final jr.c<bur<?>> bV = mb.f.f(this);
   private static final float bW = 1.3964844F;
   private static final int bX = 10;
   public static final bur<cqx> a = a("acacia_boat", bur.a.a(a(() -> cws.oF), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> b = a("acacia_chest_boat", bur.a.a(b(() -> cws.oG), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cid> c = a("allay", bur.a.a(cid::new, bvj.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bur<bud> d = a("area_effect_cloud", bur.a.<bud>a(bud::new, bvj.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bur<cig> e = a("armadillo", bur.a.a(cig::new, bvj.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bur<ckq> f = a("armor_stand", bur.a.<ckq>a(ckq::new, bvj.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bur<cpf> g = a("arrow", bur.a.<cpf>a(cpf::new, bvj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bur<cij> h = a("axolotl", bur.a.a(cij::new, bvj.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bur<cqz> i = a("bamboo_chest_raft", bur.a.a(d(() -> cws.oQ), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<crm> j = a("bamboo_raft", bur.a.a(c(() -> cws.oP), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cgr> k = a("bat", bur.a.a(cgr::new, bvj.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bur<cgy> l = a("bee", bur.a.a(cgy::new, bvj.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bur<cqx> m = a("birch_boat", bur.a.a(a(() -> cws.oB), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> n = a("birch_chest_boat", bur.a.a(b(() -> cws.oC), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<clg> o = a("blaze", bur.a.a(clg::new, bvj.a).c().a(0.6F, 1.8F).a(8));
   public static final bur<bui.b> p = a("block_display", bur.a.a(bui.b::new, bvj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bur<clh> q = a("bogged", bur.a.a(clh::new, bvj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bur<cmt> r = a("breeze", bur.a.a(cmt::new, bvj.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bur<cqg> s = a("breeze_wind_charge", bur.a.<cqg>a(cqg::new, bvj.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bur<cio> t = a("camel", bur.a.a(cio::new, bvj.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bur<cha> u = a("cat", bur.a.a(cha::new, bvj.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bur<cli> v = a("cave_spider", bur.a.a(cli::new, bvj.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bur<cqx> w = a("cherry_boat", bur.a.a(a(() -> cws.oH), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> x = a("cherry_chest_boat", bur.a.a(b(() -> cws.oI), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cre> y = a("chest_minecart", bur.a.a(cre::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<chc> z = a("chicken", bur.a.a(chc::new, bvj.b).a(0.4F, 0.7F).b(0.644F).a(new faz(0.0, 0.7, -0.1)).a(10));
   public static final bur<chd> A = a("cod", bur.a.a(chd::new, bvj.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bur<crf> B = a("command_block_minecart", bur.a.a(crf::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<che> C = a("cow", bur.a.a(che::new, bvj.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bur<cnb> D = a("creaking", bur.a.a(cnb::new, bvj.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bur<clj> E = a("creeper", bur.a.a(clj::new, bvj.a).a(0.6F, 1.7F).a(8));
   public static final bur<cqx> F = a("dark_oak_boat", bur.a.a(a(() -> cws.oJ), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> G = a("dark_oak_chest_boat", bur.a.a(b(() -> cws.oK), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chf> H = a("dolphin", bur.a.a(chf::new, bvj.f).a(0.9F, 0.6F).b(0.3F));
   public static final bur<cjc> I = a("donkey", bur.a.a(cjc::new, bvj.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bur<cpg> J = a("dragon_fireball", bur.a.<cpg>a(cpg::new, bvj.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bur<cll> K = a("drowned", bur.a.a(cll::new, bvj.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cpy> L = a("egg", bur.a.<cpy>a(cpy::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<clm> M = a("elder_guardian", bur.a.a(clm::new, bvj.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bur<cln> N = a("enderman", bur.a.a(cln::new, bvj.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bur<clo> O = a("endermite", bur.a.a(clo::new, bvj.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bur<cju> P = a("ender_dragon", bur.a.a(cju::new, bvj.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bur<cpz> Q = a("ender_pearl", bur.a.<cpz>a(cpz::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<cjt> R = a("end_crystal", bur.a.<cjt>a(cjt::new, bvj.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bur<clq> S = a("evoker", bur.a.a(clq::new, bvj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<cph> T = a("evoker_fangs", bur.a.<cph>a(cph::new, bvj.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bur<cqa> U = a("experience_bottle", bur.a.<cqa>a(cqa::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<buw> V = a("experience_orb", bur.a.<buw>a(buw::new, bvj.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bur<cpi> W = a("eye_of_ender", bur.a.<cpi>a(cpi::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bur<cla> X = a("falling_block", bur.a.<cla>a(cla::new, bvj.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bur<cpn> Y = a("fireball", bur.a.<cpn>a(cpn::new, bvj.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bur<cpk> Z = a("firework_rocket", bur.a.<cpk>a(cpk::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<chh> aa = a("fox", bur.a.a(chh::new, bvj.b).a(0.6F, 0.7F).b(0.4F).a(new faz(0.0, 0.6375, -0.25)).a(8).a(djn.oK));
   public static final bur<cir> ab = a("frog", bur.a.a(cir::new, bvj.b).a(0.5F, 0.5F).a(new faz(0.0, 0.375, -0.25)).a(10));
   public static final bur<crg> ac = a("furnace_minecart", bur.a.a(crg::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<clr> ad = a("ghast", bur.a.a(clr::new, bvj.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bur<cls> ae = a("giant", bur.a.a(cls::new, bvj.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bur<cks> af = a("glow_item_frame", bur.a.<cks>a(cks::new, bvj.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bur<buy> ag = a("glow_squid", bur.a.a(buy::new, bvj.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bur<cix> ah = a("goat", bur.a.a(cix::new, bvj.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bur<clt> ai = a("guardian", bur.a.a(clt::new, bvj.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bur<cne> aj = a("hoglin", bur.a.a(cne::new, bvj.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bur<crh> ak = a("hopper_minecart", bur.a.a(crh::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<cjd> al = a("horse", bur.a.a(cjd::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bur<clu> am = a("husk", bur.a.a(clu::new, bvj.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bur<clv> an = a("illusioner", bur.a.a(clv::new, bvj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<bvb> ao = a("interaction", bur.a.a(bvb::new, bvj.h).e().a(0.0F, 0.0F).a(10));
   public static final bur<chj> ap = a("iron_golem", bur.a.a(chj::new, bvj.h).a(1.4F, 2.7F).a(10));
   public static final bur<clb> aq = a("item", bur.a.<clb>a(clb::new, bvj.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bur<bui.g> ar = a("item_display", bur.a.a(bui.g::new, bvj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bur<cku> as = a("item_frame", bur.a.<cku>a(cku::new, bvj.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bur<cqx> at = a("jungle_boat", bur.a.a(a(() -> cws.oD), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> au = a("jungle_chest_boat", bur.a.a(b(() -> cws.oE), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<ckv> av = a("leash_knot", bur.a.<ckv>a(ckv::new, bvj.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bur<bvf> aw = a("lightning_bolt", bur.a.a(bvf::new, bvj.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bur<cje> ax = a("llama", bur.a.a(cje::new, bvj.b).a(0.9F, 1.87F).b(1.7765F).a(new faz(0.0, 1.37, -0.3)).a(10));
   public static final bur<cpo> ay = a("llama_spit", bur.a.<cpo>a(cpo::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<clw> az = a("magma_cube", bur.a.a(clw::new, bvj.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bur<cqx> aA = a("mangrove_boat", bur.a.a(a(() -> cws.oN), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> aB = a("mangrove_chest_boat", bur.a.a(b(() -> cws.oO), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<bvh> aC = a("marker", bur.a.a(bvh::new, bvj.h).e().a(0.0F, 0.0F).a(0));
   public static final bur<crc> aD = a("minecart", bur.a.a(crc::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<chk> aE = a("mooshroom", bur.a.a(chk::new, bvj.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bur<cjg> aF = a("mule", bur.a.a(cjg::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bur<cqx> aG = a("oak_boat", bur.a.a(a(() -> cws.ox), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> aH = a("oak_chest_boat", bur.a.a(b(() -> cws.oy), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chl> aI = a("ocelot", bur.a.a(chl::new, bvj.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bur<bvm> aJ = a("ominous_item_spawner", bur.a.a(bvm::new, bvj.h).e().a(0.25F, 0.25F).a(8));
   public static final bur<ckw> aK = a("painting", bur.a.<ckw>a(ckw::new, bvj.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bur<cqx> aL = a("pale_oak_boat", bur.a.a(a(() -> cws.oL), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> aM = a("pale_oak_chest_boat", bur.a.a(b(() -> cws.oM), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chm> aN = a("panda", bur.a.a(chm::new, bvj.b).a(1.3F, 1.25F).a(10));
   public static final bur<chn> aO = a("parrot", bur.a.a(chn::new, bvj.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bur<clz> aP = a("phantom", bur.a.a(clz::new, bvj.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bur<cho> aQ = a("pig", bur.a.a(cho::new, bvj.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bur<cnk> aR = a("piglin", bur.a.a(cnk::new, bvj.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cnn> aS = a("piglin_brute", bur.a.a(cnn::new, bvj.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cma> aT = a("pillager", bur.a.a(cma::new, bvj.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<chp> aU = a("polar_bear", bur.a.a(chp::new, bvj.b).a(djn.rr).a(1.4F, 1.4F).a(10));
   public static final bur<cqb> aV = a("potion", bur.a.<cqb>a(cqb::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<chq> aW = a("pufferfish", bur.a.a(chq::new, bvj.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bur<chr> aX = a("rabbit", bur.a.a(chr::new, bvj.b).a(0.4F, 0.5F).a(8));
   public static final bur<cmc> aY = a("ravager", bur.a.a(cmc::new, bvj.a).a(1.95F, 2.2F).a(new faz(0.0, 2.2625, -0.0625)).a(10));
   public static final bur<chs> aZ = a("salmon", bur.a.a(chs::new, bvj.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bur<cht> ba = a("sheep", bur.a.a(cht::new, bvj.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bur<cmd> bb = a("shulker", bur.a.a(cmd::new, bvj.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bur<cps> bc = a("shulker_bullet", bur.a.<cps>a(cps::new, bvj.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bur<cme> bd = a("silverfish", bur.a.a(cme::new, bvj.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bur<cmf> be = a("skeleton", bur.a.a(cmf::new, bvj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bur<cjh> bf = a("skeleton_horse", bur.a.a(cjh::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bur<cmg> bg = a("slime", bur.a.a(cmg::new, bvj.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bur<cpt> bh = a("small_fireball", bur.a.<cpt>a(cpt::new, bvj.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bur<cjo> bi = a("sniffer", bur.a.a(cjo::new, bvj.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bur<cpu> bj = a("snowball", bur.a.<cpu>a(cpu::new, bvj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bur<chv> bk = a("snow_golem", bur.a.a(chv::new, bvj.h).a(djn.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bur<cri> bl = a("spawner_minecart", bur.a.a(cri::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<cpv> bm = a("spectral_arrow", bur.a.<cpv>a(cpv::new, bvj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bur<cmi> bn = a("spider", bur.a.a(cmi::new, bvj.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bur<cqx> bo = a("spruce_boat", bur.a.a(a(() -> cws.oz), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<cqy> bp = a("spruce_chest_boat", bur.a.a(b(() -> cws.oA), bvj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bur<chw> bq = a("squid", bur.a.a(chw::new, bvj.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bur<cmj> br = a("stray", bur.a.a(cmj::new, bvj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(djn.rr).a(8));
   public static final bur<cmk> bs = a("strider", bur.a.a(cmk::new, bvj.b).c().a(0.9F, 1.7F).a(10));
   public static final bur<ciu> bt = a("tadpole", bur.a.a(ciu::new, bvj.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bur<bui.l> bu = a("text_display", bur.a.a(bui.l::new, bvj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bur<clc> bv = a("tnt", bur.a.<clc>a(clc::new, bvj.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bur<crj> bw = a("tnt_minecart", bur.a.a(crj::new, bvj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bur<cjj> bx = a("trader_llama", bur.a.a(cjj::new, bvj.b).a(0.9F, 1.87F).b(1.7765F).a(new faz(0.0, 1.37, -0.3)).a(10));
   public static final bur<cqc> by = a("trident", bur.a.<cqc>a(cqc::new, bvj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bur<chx> bz = a("tropical_fish", bur.a.a(chx::new, bvj.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bur<chy> bA = a("turtle", bur.a.a(chy::new, bvj.b).a(1.2F, 0.4F).a(new faz(0.0, 0.55625, -0.25)).a(10));
   public static final bur<cml> bB = a("vex", bur.a.a(cml::new, bvj.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bur<coh> bC = a("villager", bur.a.<coh>a(coh::new, bvj.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bur<cmm> bD = a("vindicator", bur.a.a(cmm::new, bvj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bur<coo> bE = a("wandering_trader", bur.a.a(coo::new, bvj.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bur<cny> bF = a("warden", bur.a.a(cny::new, bvj.a).a(0.9F, 2.9F).a(3.15F).a(bul.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bur<cqh> bG = a("wind_charge", bur.a.<cqh>a(cqh::new, bvj.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bur<cmn> bH = a("witch", bur.a.a(cmn::new, bvj.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bur<cko> bI = a("wither", bur.a.a(cko::new, bvj.a).c().a(djn.ck).a(0.9F, 3.5F).a(10));
   public static final bur<cmo> bJ = a("wither_skeleton", bur.a.a(cmo::new, bvj.a).c().a(djn.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bur<cqd> bK = a("wither_skull", bur.a.<cqd>a(cqd::new, bvj.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bur<cia> bL = a("wolf", bur.a.a(cia::new, bvj.b).a(0.6F, 0.85F).b(0.68F).a(new faz(0.0, 0.81875, -0.0625)).a(10));
   public static final bur<cmp> bM = a("zoglin", bur.a.a(cmp::new, bvj.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bur<cmq> bN = a("zombie", bur.a.<cmq>a(cmq::new, bvj.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bur<cjl> bO = a("zombie_horse", bur.a.a(cjl::new, bvj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bur<cmr> bP = a("zombie_villager", bur.a.a(cmr::new, bvj.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bur<cms> bQ = a("zombified_piglin", bur.a.a(cms::new, bvj.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bur<cow> bR = a("player", bur.a.<cow>a(bvj.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cow.bU).a(32).b(2));
   public static final bur<cpl> bS = a("fishing_bobber", bur.a.<cpl>a(cpl::new, bvj.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bur<?>> bY = Set.of(X, B, bl);
   private final bur.b<T> bZ;
   private final bvj ca;
   private final ImmutableSet<djl> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private wp cj;
   private final Optional<aku<evv>> ck;
   private final bun cl;
   private final float cm;
   private final crs cn;

   private static <T extends buk> bur<T> a(aku<bur<?>> $$0, bur.a<T> $$1) {
      return ke.a(mb.f, $$0, $$1.a($$0));
   }

   private static aku<bur<?>> b(String $$0) {
      return aku.a(mc.z, akv.b($$0));
   }

   private static <T extends buk> bur<T> a(String $$0, bur.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static akv a(bur<?> $$0) {
      return mb.f.b($$0);
   }

   public static Optional<bur<?>> a(String $$0) {
      return mb.f.b(akv.c($$0));
   }

   public bur(
      bur.b<T> $$0,
      bvj $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<djl> $$6,
      bun $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<aku<evv>> $$12,
      crs $$13
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
   public T a(ard $$0, @Nullable cwo $$1, @Nullable cow $$2, ji $$3, buq $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends buk> Consumer<T> a(dgh $$0, cwo $$1, @Nullable cow $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends buk> Consumer<T> a(Consumer<T> $$0, dgh $$1, cwo $$2, @Nullable cow $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends buk> Consumer<T> a(Consumer<T> $$0, cwo $$1) {
      wp $$2 = $$1.a(kv.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends buk> Consumer<T> b(Consumer<T> $$0, dgh $$1, cwo $$2, @Nullable cow $$3) {
      cyx $$4 = $$2.a(kv.W, cyx.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ard $$0, ji $$1, buq $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ard $$0, @Nullable Consumer<T> $$1, ji $$2, buq $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bvi $$7) {
            $$7.U();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(ard $$0, @Nullable Consumer<T> $$1, ji $$2, buq $$3, boolean $$4, boolean $$5) {
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
            $$9.aZ = $$9.dL();
            $$9.aX = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dgk $$0, ji $$1, boolean $$2, fau $$3) {
      fau $$4 = new fau($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fbt> $$5 = $$0.d(null, $$4);
      return 1.0 + fbq.a(jn.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgh $$0, @Nullable cow $$1, @Nullable buk $$2, cyx $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bur<?> $$5 = $$3.a($$4.ba(), mc.z);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 != null && $$4.ag().f($$1.gh())) {
               $$3.a($$2);
            }
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

   public wp h() {
      if (this.cj == null) {
         this.cj = wp.c(this.g());
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

   public Optional<aku<evv>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public crs i() {
      return this.cn;
   }

   @Nullable
   public T a(dgh $$0, buq $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<buk> a(tq $$0, dgh $$1, buq $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bU.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fau a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fau($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dww $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && etl.a($$0) ? true : $$0.a(djn.ck) || $$0.a(djn.oK) || $$0.a(djn.ed) || $$0.a(djn.rr);
      }
   }

   public bun n() {
      return this.cl;
   }

   public static Optional<bur<?>> a(tq $$0) {
      return mb.f.b(akv.a($$0.l("id")));
   }

   @Nullable
   public static buk a(tq $$0, dgh $$1, buq $$2, Function<buk, buk> $$3) {
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

   public static Stream<buk> a(final List<? extends un> $$0, final dgh $$1, final buq $$2) {
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

   private static Optional<buk> b(tq $$0, dgh $$1, buq $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bU.warn("Exception loading entity: ", var4);
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
      return this != bR && this != ay && this != bI && this != k && this != as && this != af && this != av && this != aK && this != R && this != T;
   }

   public boolean a(axf<bur<?>> $$0) {
      return this.bV.a($$0);
   }

   public boolean a(jv<bur<?>> $$0) {
      return $$0.a(this.bV);
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
      return this.bV;
   }

   private static bur.b<cqx> a(Supplier<cwk> $$0) {
      return ($$1, $$2) -> new cqx($$1, $$2, $$0);
   }

   private static bur.b<cqy> b(Supplier<cwk> $$0) {
      return ($$1, $$2) -> new cqy($$1, $$2, $$0);
   }

   private static bur.b<crm> c(Supplier<cwk> $$0) {
      return ($$1, $$2) -> new crm($$1, $$2, $$0);
   }

   private static bur.b<cqz> d(Supplier<cwk> $$0) {
      return ($$1, $$2) -> new cqz($$1, $$2, $$0);
   }

   public boolean s() {
      return bY.contains(this);
   }

   public static class a<T extends buk> {
      private final bur.b<T> a;
      private final bvj b;
      private ImmutableSet<djl> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bun j = bun.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bum.a l = bum.a();
      private crs m = cru.g;
      private akn<bur<?>, Optional<aku<evv>>> n = $$0x -> Optional.of(aku.a(mc.bg, $$0x.a().f("entities/")));
      private akn<bur<?>, String> o = $$0x -> af.a("entity", $$0x.a());

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

      public bur.a<T> a(faz... $$0) {
         for (faz $$1 : $$0) {
            this.l = this.l.a(bul.a, $$1);
         }

         return this;
      }

      public bur.a<T> a(faz $$0) {
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

      public bur.a<T> a(bul $$0, faz $$1) {
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

      public bur.a<T> a(djl... $$0) {
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

      public bur.a<T> a(crq... $$0) {
         this.m = cru.e.a($$0);
         return this;
      }

      public bur.a<T> e() {
         this.n = akn.fixed(Optional.empty());
         return this;
      }

      public bur<T> a(aku<bur<?>> $$0) {
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
      T create(bur<T> var1, dgh var2);
   }
}
