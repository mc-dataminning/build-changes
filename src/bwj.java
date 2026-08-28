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

public class bwj<T extends bwa> implements cty, eea<bwa, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final je.c<bwj<?>> bW = mf.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bwj<ctg> a = a("acacia_boat", bwj.a.a(a(() -> cyw.oH), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> b = a("acacia_chest_boat", bwj.a.a(b(() -> cyw.oI), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cjx> c = a("allay", bwj.a.a(cjx::new, bxc.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bwj<bvs> d = a("area_effect_cloud", bwj.a.<bvs>a(bvs::new, bxc.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwj<cka> e = a("armadillo", bwj.a.a(cka::new, bxc.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bwj<cmm> f = a("armor_stand", bwj.a.<cmm>a(cmm::new, bxc.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bwj<crc> g = a("arrow", bwj.a.<crc>a(crc::new, bxc.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwj<ckd> h = a("axolotl", bwj.a.a(ckd::new, bxc.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bwj<cti> i = a("bamboo_chest_raft", bwj.a.a(d(() -> cyw.oS), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<ctv> j = a("bamboo_raft", bwj.a.a(c(() -> cyw.oR), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cii> k = a("bat", bwj.a.a(cii::new, bxc.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bwj<cip> l = a("bee", bwj.a.a(cip::new, bxc.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bwj<ctg> m = a("birch_boat", bwj.a.a(a(() -> cyw.oD), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> n = a("birch_chest_boat", bwj.a.a(b(() -> cyw.oE), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cnc> o = a("blaze", bwj.a.a(cnc::new, bxc.a).c().a(0.6F, 1.8F).a(8));
   public static final bwj<bvx.b> p = a("block_display", bwj.a.a(bvx.b::new, bxc.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwj<cnd> q = a("bogged", bwj.a.a(cnd::new, bxc.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwj<coq> r = a("breeze", bwj.a.a(coq::new, bxc.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bwj<cse> s = a("breeze_wind_charge", bwj.a.<cse>a(cse::new, bxc.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwj<cki> t = a("camel", bwj.a.a(cki::new, bxc.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bwj<cir> u = a("cat", bwj.a.a(cir::new, bxc.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bwj<cne> v = a("cave_spider", bwj.a.a(cne::new, bxc.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bwj<ctg> w = a("cherry_boat", bwj.a.a(a(() -> cyw.oJ), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> x = a("cherry_chest_boat", bwj.a.a(b(() -> cyw.oK), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<ctn> y = a("chest_minecart", bwj.a.a(ctn::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<ciu> z = a("chicken", bwj.a.a(ciu::new, bxc.b).a(0.4F, 0.7F).b(0.644F).a(new fdw(0.0, 0.7, -0.1)).a(10));
   public static final bwj<civ> A = a("cod", bwj.a.a(civ::new, bxc.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bwj<cto> B = a("command_block_minecart", bwj.a.a(cto::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<ciw> C = a("cow", bwj.a.a(ciw::new, bxc.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwj<coy> D = a("creaking", bwj.a.a(coy::new, bxc.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bwj<cnf> E = a("creeper", bwj.a.a(cnf::new, bxc.a).a(0.6F, 1.7F).a(8));
   public static final bwj<ctg> F = a("dark_oak_boat", bwj.a.a(a(() -> cyw.oL), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> G = a("dark_oak_chest_boat", bwj.a.a(b(() -> cyw.oM), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cix> H = a("dolphin", bwj.a.a(cix::new, bxc.f).a(0.9F, 0.6F).b(0.3F));
   public static final bwj<cky> I = a("donkey", bwj.a.a(cky::new, bxc.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bwj<crd> J = a("dragon_fireball", bwj.a.<crd>a(crd::new, bxc.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwj<cnh> K = a("drowned", bwj.a.a(cnh::new, bxc.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwj<crv> L = a("egg", bwj.a.<crv>a(crv::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<cni> M = a("elder_guardian", bwj.a.a(cni::new, bxc.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bwj<cnj> N = a("enderman", bwj.a.a(cnj::new, bxc.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bwj<cnk> O = a("endermite", bwj.a.a(cnk::new, bxc.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwj<clq> P = a("ender_dragon", bwj.a.a(clq::new, bxc.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bwj<crw> Q = a("ender_pearl", bwj.a.<crw>a(crw::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<clp> R = a("end_crystal", bwj.a.<clp>a(clp::new, bxc.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwj<cnm> S = a("evoker", bwj.a.a(cnm::new, bxc.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwj<cre> T = a("evoker_fangs", bwj.a.<cre>a(cre::new, bxc.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bwj<crx> U = a("experience_bottle", bwj.a.<crx>a(crx::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<bwo> V = a("experience_orb", bwj.a.<bwo>a(bwo::new, bxc.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bwj<crf> W = a("eye_of_ender", bwj.a.<crf>a(crf::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bwj<cmw> X = a("falling_block", bwj.a.<cmw>a(cmw::new, bxc.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bwj<crk> Y = a("fireball", bwj.a.<crk>a(crk::new, bxc.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bwj<crh> Z = a("firework_rocket", bwj.a.<crh>a(crh::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<ciz> aa = a("fox", bwj.a.a(ciz::new, bxc.b).a(0.6F, 0.7F).b(0.4F).a(new fdw(0.0, 0.6375, -0.25)).a(8).a(dlw.oK));
   public static final bwj<ckl> ab = a("frog", bwj.a.a(ckl::new, bxc.b).a(0.5F, 0.5F).a(new fdw(0.0, 0.375, -0.25)).a(10));
   public static final bwj<ctp> ac = a("furnace_minecart", bwj.a.a(ctp::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<cnn> ad = a("ghast", bwj.a.a(cnn::new, bxc.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bwj<cno> ae = a("giant", bwj.a.a(cno::new, bxc.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bwj<cmo> af = a("glow_item_frame", bwj.a.<cmo>a(cmo::new, bxc.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwj<bwq> ag = a("glow_squid", bwj.a.a(bwq::new, bxc.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bwj<ckt> ah = a("goat", bwj.a.a(ckt::new, bxc.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bwj<cnp> ai = a("guardian", bwj.a.a(cnp::new, bxc.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bwj<cpb> aj = a("hoglin", bwj.a.a(cpb::new, bxc.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwj<ctq> ak = a("hopper_minecart", bwj.a.a(ctq::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<ckz> al = a("horse", bwj.a.a(ckz::new, bxc.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bwj<cnq> am = a("husk", bwj.a.a(cnq::new, bxc.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bwj<cnr> an = a("illusioner", bwj.a.a(cnr::new, bxc.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwj<bwt> ao = a("interaction", bwj.a.a(bwt::new, bxc.h).e().a(0.0F, 0.0F).a(10));
   public static final bwj<cja> ap = a("iron_golem", bwj.a.a(cja::new, bxc.h).a(1.4F, 2.7F).a(10));
   public static final bwj<cmx> aq = a("item", bwj.a.<cmx>a(cmx::new, bxc.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bwj<bvx.g> ar = a("item_display", bwj.a.a(bvx.g::new, bxc.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwj<cmq> as = a("item_frame", bwj.a.<cmq>a(cmq::new, bxc.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bwj<ctg> at = a("jungle_boat", bwj.a.a(a(() -> cyw.oF), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> au = a("jungle_chest_boat", bwj.a.a(b(() -> cyw.oG), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cmr> av = a("leash_knot", bwj.a.<cmr>a(cmr::new, bxc.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bwj<bwy> aw = a("lightning_bolt", bwj.a.a(bwy::new, bxc.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bwj<cla> ax = a("llama", bwj.a.a(cla::new, bxc.b).a(0.9F, 1.87F).b(1.7765F).a(new fdw(0.0, 1.37, -0.3)).a(10));
   public static final bwj<crl> ay = a("llama_spit", bwj.a.<crl>a(crl::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<cns> az = a("magma_cube", bwj.a.a(cns::new, bxc.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bwj<ctg> aA = a("mangrove_boat", bwj.a.a(a(() -> cyw.oP), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> aB = a("mangrove_chest_boat", bwj.a.a(b(() -> cyw.oQ), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<bxa> aC = a("marker", bwj.a.a(bxa::new, bxc.h).e().a(0.0F, 0.0F).a(0));
   public static final bwj<ctl> aD = a("minecart", bwj.a.a(ctl::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<cjb> aE = a("mooshroom", bwj.a.a(cjb::new, bxc.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bwj<clc> aF = a("mule", bwj.a.a(clc::new, bxc.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bwj<ctg> aG = a("oak_boat", bwj.a.a(a(() -> cyw.oz), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> aH = a("oak_chest_boat", bwj.a.a(b(() -> cyw.oA), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cjc> aI = a("ocelot", bwj.a.a(cjc::new, bxc.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bwj<bxf> aJ = a("ominous_item_spawner", bwj.a.a(bxf::new, bxc.h).e().a(0.25F, 0.25F).a(8));
   public static final bwj<cms> aK = a("painting", bwj.a.<cms>a(cms::new, bxc.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bwj<ctg> aL = a("pale_oak_boat", bwj.a.a(a(() -> cyw.oN), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> aM = a("pale_oak_chest_boat", bwj.a.a(b(() -> cyw.oO), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cjd> aN = a("panda", bwj.a.a(cjd::new, bxc.b).a(1.3F, 1.25F).a(10));
   public static final bwj<cje> aO = a("parrot", bwj.a.a(cje::new, bxc.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bwj<cnv> aP = a("phantom", bwj.a.a(cnv::new, bxc.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bwj<cjf> aQ = a("pig", bwj.a.a(cjf::new, bxc.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bwj<cph> aR = a("piglin", bwj.a.a(cph::new, bxc.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwj<cpk> aS = a("piglin_brute", bwj.a.a(cpk::new, bxc.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bwj<cnw> aT = a("pillager", bwj.a.a(cnw::new, bxc.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwj<cji> aU = a("polar_bear", bwj.a.a(cji::new, bxc.b).a(dlw.rt).a(1.4F, 1.4F).a(10));
   public static final bwj<crz> aV = a("splash_potion", bwj.a.<crz>a(crz::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<cry> aW = a("lingering_potion", bwj.a.<cry>a(cry::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<cjj> aX = a("pufferfish", bwj.a.a(cjj::new, bxc.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bwj<cjk> aY = a("rabbit", bwj.a.a(cjk::new, bxc.b).a(0.4F, 0.5F).a(8));
   public static final bwj<cny> aZ = a("ravager", bwj.a.a(cny::new, bxc.a).a(1.95F, 2.2F).a(new fdw(0.0, 2.2625, -0.0625)).a(10));
   public static final bwj<cjl> ba = a("salmon", bwj.a.a(cjl::new, bxc.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bwj<cjm> bb = a("sheep", bwj.a.a(cjm::new, bxc.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bwj<cnz> bc = a("shulker", bwj.a.a(cnz::new, bxc.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bwj<crp> bd = a("shulker_bullet", bwj.a.<crp>a(crp::new, bxc.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bwj<coa> be = a("silverfish", bwj.a.a(coa::new, bxc.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bwj<cob> bf = a("skeleton", bwj.a.a(cob::new, bxc.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bwj<cld> bg = a("skeleton_horse", bwj.a.a(cld::new, bxc.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwj<coc> bh = a("slime", bwj.a.a(coc::new, bxc.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bwj<crq> bi = a("small_fireball", bwj.a.<crq>a(crq::new, bxc.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwj<clk> bj = a("sniffer", bwj.a.a(clk::new, bxc.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bwj<crr> bk = a("snowball", bwj.a.<crr>a(crr::new, bxc.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bwj<cjo> bl = a("snow_golem", bwj.a.a(cjo::new, bxc.h).a(dlw.rt).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bwj<ctr> bm = a("spawner_minecart", bwj.a.a(ctr::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<crs> bn = a("spectral_arrow", bwj.a.<crs>a(crs::new, bxc.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwj<coe> bo = a("spider", bwj.a.a(coe::new, bxc.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bwj<ctg> bp = a("spruce_boat", bwj.a.a(a(() -> cyw.oB), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cth> bq = a("spruce_chest_boat", bwj.a.a(b(() -> cyw.oC), bxc.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bwj<cjp> br = a("squid", bwj.a.a(cjp::new, bxc.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bwj<cof> bs = a("stray", bwj.a.a(cof::new, bxc.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dlw.rt).a(8));
   public static final bwj<cog> bt = a("strider", bwj.a.a(cog::new, bxc.b).c().a(0.9F, 1.7F).a(10));
   public static final bwj<ckq> bu = a("tadpole", bwj.a.a(ckq::new, bxc.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bwj<bvx.k> bv = a("text_display", bwj.a.a(bvx.k::new, bxc.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bwj<cmy> bw = a("tnt", bwj.a.<cmy>a(cmy::new, bxc.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bwj<cts> bx = a("tnt_minecart", bwj.a.a(cts::new, bxc.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bwj<clf> by = a("trader_llama", bwj.a.a(clf::new, bxc.b).a(0.9F, 1.87F).b(1.7765F).a(new fdw(0.0, 1.37, -0.3)).a(10));
   public static final bwj<csa> bz = a("trident", bwj.a.<csa>a(csa::new, bxc.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bwj<cjr> bA = a("tropical_fish", bwj.a.a(cjr::new, bxc.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bwj<cjs> bB = a("turtle", bwj.a.a(cjs::new, bxc.b).a(1.2F, 0.4F).a(new fdw(0.0, 0.55625, -0.25)).a(10));
   public static final bwj<coh> bC = a("vex", bwj.a.a(coh::new, bxc.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bwj<cqe> bD = a("villager", bwj.a.<cqe>a(cqe::new, bxc.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwj<coi> bE = a("vindicator", bwj.a.a(coi::new, bxc.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bwj<cqk> bF = a("wandering_trader", bwj.a.a(cqk::new, bxc.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bwj<cpv> bG = a("warden", bwj.a.a(cpv::new, bxc.a).a(0.9F, 2.9F).a(3.15F).a(bwb.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bwj<csf> bH = a("wind_charge", bwj.a.<csf>a(csf::new, bxc.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bwj<coj> bI = a("witch", bwj.a.a(coj::new, bxc.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bwj<cmk> bJ = a("wither", bwj.a.a(cmk::new, bxc.a).c().a(dlw.ck).a(0.9F, 3.5F).a(10));
   public static final bwj<cok> bK = a("wither_skeleton", bwj.a.a(cok::new, bxc.a).c().a(dlw.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bwj<csb> bL = a("wither_skull", bwj.a.<csb>a(csb::new, bxc.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bwj<cju> bM = a("wolf", bwj.a.a(cju::new, bxc.b).a(0.6F, 0.85F).b(0.68F).a(new fdw(0.0, 0.81875, -0.0625)).a(10));
   public static final bwj<col> bN = a("zoglin", bwj.a.a(col::new, bxc.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bwj<com> bO = a("zombie", bwj.a.<com>a(com::new, bxc.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bwj<clh> bP = a("zombie_horse", bwj.a.a(clh::new, bxc.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bwj<coo> bQ = a("zombie_villager", bwj.a.a(coo::new, bxc.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bwj<cop> bR = a("zombified_piglin", bwj.a.a(cop::new, bxc.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bwj<cqs> bS = a("player", bwj.a.<cqs>a(bxc.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cqs.bH).a(32).b(2));
   public static final bwj<cri> bT = a("fishing_bobber", bwj.a.<cri>a(cri::new, bxc.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bwj<?>> bZ = Set.of(X, B, bm);
   private final bwj.b<T> ca;
   private final bxc cb;
   private final ImmutableSet<dlu> cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final int ch;
   private final int ci;
   private final String cj;
   @Nullable
   private ww ck;
   private final Optional<ald<eys>> cl;
   private final bwd cm;
   private final float cn;
   private final cub co;

   private static <T extends bwa> bwj<T> a(ald<bwj<?>> $$0, bwj.a<T> $$1) {
      return jr.a(mf.f, $$0, $$1.a($$0));
   }

   private static ald<bwj<?>> b(String $$0) {
      return ald.a(mg.B, ale.b($$0));
   }

   private static <T extends bwa> bwj<T> a(String $$0, bwj.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static ale a(bwj<?> $$0) {
      return mf.f.b($$0);
   }

   public static Optional<bwj<?>> a(String $$0) {
      return mf.f.b(ale.c($$0));
   }

   public bwj(
      bwj.b<T> $$0,
      bxc $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dlu> $$6,
      bwd $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<ald<eys>> $$12,
      cub $$13
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
   public T a(aro $$0, @Nullable cys $$1, @Nullable bwz $$2, iu $$3, bwi $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwa> Consumer<T> a(dip $$0, cys $$1, @Nullable bwz $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwa> Consumer<T> a(Consumer<T> $$0, dip $$1, cys $$2, @Nullable bwz $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwa> Consumer<T> a(Consumer<T> $$0, cys $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwa> Consumer<T> b(Consumer<T> $$0, dip $$1, cys $$2, @Nullable bwz $$3) {
      dba $$4 = $$2.a(kj.Y, dba.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aro $$0, iu $$1, bwi $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aro $$0, @Nullable Consumer<T> $$1, iu $$2, bwi $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bxb $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(aro $$0, @Nullable Consumer<T> $$1, iu $$2, bwi $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azk.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bxb $$9) {
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

   protected static double a(dis $$0, iu $$1, boolean $$2, fdr $$3) {
      fdr $$4 = new fdr($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<feq> $$5 = $$0.d(null, $$4);
      return 1.0 + fen.a(ja.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dip $$0, @Nullable bwz $$1, @Nullable bwa $$2, dba $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bwj<?> $$5 = $$3.a($$4.ba(), mg.B);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 instanceof cqs $$6 && $$4.ag().f($$6.gh())) {
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

   public bxc f() {
      return this.cb;
   }

   public String g() {
      return this.cj;
   }

   public ww h() {
      if (this.ck == null) {
         this.ck = ww.c(this.g());
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

   public Optional<ald<eys>> j() {
      return this.cl;
   }

   public float l() {
      return this.cm.a();
   }

   public float m() {
      return this.cm.b();
   }

   @Override
   public cub k() {
      return this.co;
   }

   @Nullable
   public T a(dip $$0, bwi $$1) {
      return !this.a($$0.K()) ? null : this.ca.create(this, $$0);
   }

   public static Optional<bwa> a(tx $$0, dip $$1, bwi $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fdr a(double $$0, double $$1, double $$2) {
      float $$3 = this.cn * this.l() / 2.0F;
      float $$4 = this.cn * this.m();
      return new fdr($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dzo $$0) {
      if (this.cc.contains($$0.b())) {
         return false;
      } else {
         return !this.cf && ewi.a($$0) ? true : $$0.a(dlw.ck) || $$0.a(dlw.oK) || $$0.a(dlw.ed) || $$0.a(dlw.rt);
      }
   }

   public bwd n() {
      return this.cm;
   }

   public static Optional<bwj<?>> a(tx $$0) {
      return mf.f.b(ale.a($$0.l("id")));
   }

   @Nullable
   public static bwa a(tx $$0, dip $$1, bwi $$2, Function<bwa, bwa> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            ud $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bwa $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bwa)$$4;
      }).orElse(null);
   }

   public static Stream<bwa> a(final List<? extends uu> $$0, final dip $$1, final bwi $$2) {
      final Spliterator<? extends uu> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bwa>() {
         @Override
         public boolean tryAdvance(Consumer<? super bwa> $$0x) {
            return $$3.tryAdvance($$3xx -> bwj.a((tx)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Nullable
         @Override
         public Spliterator<bwa> trySplit() {
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

   private static Optional<bwa> b(tx $$0, dip $$1, bwi $$2) {
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

   public boolean a(axp<bwj<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ji<bwj<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bwa $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bwa> a() {
      return bwa.class;
   }

   @Deprecated
   public je.c<bwj<?>> r() {
      return this.bW;
   }

   private static bwj.b<ctg> a(Supplier<cyo> $$0) {
      return ($$1, $$2) -> new ctg($$1, $$2, $$0);
   }

   private static bwj.b<cth> b(Supplier<cyo> $$0) {
      return ($$1, $$2) -> new cth($$1, $$2, $$0);
   }

   private static bwj.b<ctv> c(Supplier<cyo> $$0) {
      return ($$1, $$2) -> new ctv($$1, $$2, $$0);
   }

   private static bwj.b<cti> d(Supplier<cyo> $$0) {
      return ($$1, $$2) -> new cti($$1, $$2, $$0);
   }

   public boolean s() {
      return bZ.contains(this);
   }

   public static class a<T extends bwa> {
      private final bwj.b<T> a;
      private final bxc b;
      private ImmutableSet<dlu> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bwd j = bwd.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwc.a l = bwc.a();
      private cub m = cud.g;
      private akw<bwj<?>, Optional<ald<eys>>> n = $$0x -> Optional.of(ald.a(mg.bo, $$0x.a().f("entities/")));
      private final akw<bwj<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bwj.b<T> $$0, bxc $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bxc.b || $$1 == bxc.h;
      }

      public static <T extends bwa> bwj.a<T> a(bwj.b<T> $$0, bxc $$1) {
         return new bwj.a<>($$0, $$1);
      }

      public static <T extends bwa> bwj.a<T> a(bxc $$0) {
         return new bwj.a<>(($$0x, $$1) -> null, $$0);
      }

      public bwj.a<T> a(float $$0, float $$1) {
         this.j = bwd.b($$0, $$1);
         return this;
      }

      public bwj.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bwj.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bwj.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bwb.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bwj.a<T> a(fdw... $$0) {
         for (fdw $$1 : $$0) {
            this.l = this.l.a(bwb.a, $$1);
         }

         return this;
      }

      public bwj.a<T> a(fdw $$0) {
         return this.a(bwb.b, $$0);
      }

      public bwj.a<T> c(float $$0) {
         return this.a(bwb.b, 0.0F, -$$0, 0.0F);
      }

      public bwj.a<T> d(float $$0) {
         return this.a(bwb.c, 0.0F, $$0, 0.0F);
      }

      public bwj.a<T> a(bwb $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bwj.a<T> a(bwb $$0, fdw $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bwj.a<T> a() {
         this.e = false;
         return this;
      }

      public bwj.a<T> b() {
         this.d = false;
         return this;
      }

      public bwj.a<T> c() {
         this.f = true;
         return this;
      }

      public bwj.a<T> a(dlu... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bwj.a<T> d() {
         this.g = true;
         return this;
      }

      public bwj.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bwj.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bwj.a<T> a(ctz... $$0) {
         this.m = cud.e.a($$0);
         return this;
      }

      public bwj.a<T> e() {
         this.n = akw.fixed(Optional.empty());
         return this;
      }

      public bwj<T> a(ald<bwj<?>> $$0) {
         if (this.d) {
            af.a(bit.C, $$0.a().toString());
         }

         return new bwj<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bwa> {
      @Nullable
      T create(bwj<T> var1, dip var2);
   }
}
