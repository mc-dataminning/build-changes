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

public class bvi<T extends bva> implements csk, ecb<bva, T> {
   private static final Logger bU = LogUtils.getLogger();
   private final jr.c<bvi<?>> bV = mb.f.f(this);
   private static final float bW = 1.3964844F;
   private static final int bX = 10;
   public static final bvi<crs> a = a("acacia_boat", bvi.a.a(a(() -> cxl.oH), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> b = a("acacia_chest_boat", bvi.a.a(b(() -> cxl.oI), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<ciy> c = a("allay", bvi.a.a(ciy::new, bwb.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bvi<bus> d = a("area_effect_cloud", bvi.a.<bus>a(bus::new, bwb.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<cjb> e = a("armadillo", bvi.a.a(cjb::new, bwb.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bvi<cll> f = a("armor_stand", bvi.a.<cll>a(cll::new, bwb.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bvi<cqa> g = a("arrow", bvi.a.<cqa>a(cqa::new, bwb.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvi<cje> h = a("axolotl", bvi.a.a(cje::new, bwb.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bvi<cru> i = a("bamboo_chest_raft", bvi.a.a(d(() -> cxl.oS), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<csh> j = a("bamboo_raft", bvi.a.a(c(() -> cxl.oR), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<chj> k = a("bat", bvi.a.a(chj::new, bwb.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bvi<chq> l = a("bee", bvi.a.a(chq::new, bwb.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bvi<crs> m = a("birch_boat", bvi.a.a(a(() -> cxl.oD), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> n = a("birch_chest_boat", bvi.a.a(b(() -> cxl.oE), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cmb> o = a("blaze", bvi.a.a(cmb::new, bwb.a).c().a(0.6F, 1.8F).a(8));
   public static final bvi<bux.b> p = a("block_display", bvi.a.a(bux.b::new, bwb.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvi<cmc> q = a("bogged", bvi.a.a(cmc::new, bwb.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvi<cno> r = a("breeze", bvi.a.a(cno::new, bwb.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bvi<crb> s = a("breeze_wind_charge", bvi.a.<crb>a(crb::new, bwb.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvi<cjj> t = a("camel", bvi.a.a(cjj::new, bwb.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bvi<chs> u = a("cat", bvi.a.a(chs::new, bwb.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bvi<cmd> v = a("cave_spider", bvi.a.a(cmd::new, bwb.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bvi<crs> w = a("cherry_boat", bvi.a.a(a(() -> cxl.oJ), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> x = a("cherry_chest_boat", bvi.a.a(b(() -> cxl.oK), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crz> y = a("chest_minecart", bvi.a.a(crz::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<chu> z = a("chicken", bvi.a.a(chu::new, bwb.b).a(0.4F, 0.7F).b(0.644F).a(new fbx(0.0, 0.7, -0.1)).a(10));
   public static final bvi<chv> A = a("cod", bvi.a.a(chv::new, bwb.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bvi<csa> B = a("command_block_minecart", bvi.a.a(csa::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<chw> C = a("cow", bvi.a.a(chw::new, bwb.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvi<cnw> D = a("creaking", bvi.a.a(cnw::new, bwb.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bvi<cme> E = a("creeper", bvi.a.a(cme::new, bwb.a).a(0.6F, 1.7F).a(8));
   public static final bvi<crs> F = a("dark_oak_boat", bvi.a.a(a(() -> cxl.oL), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> G = a("dark_oak_chest_boat", bvi.a.a(b(() -> cxl.oM), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<chx> H = a("dolphin", bvi.a.a(chx::new, bwb.f).a(0.9F, 0.6F).b(0.3F));
   public static final bvi<cjx> I = a("donkey", bvi.a.a(cjx::new, bwb.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bvi<cqb> J = a("dragon_fireball", bvi.a.<cqb>a(cqb::new, bwb.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvi<cmg> K = a("drowned", bvi.a.a(cmg::new, bwb.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<cqt> L = a("egg", bvi.a.<cqt>a(cqt::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cmh> M = a("elder_guardian", bvi.a.a(cmh::new, bwb.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bvi<cmi> N = a("enderman", bvi.a.a(cmi::new, bwb.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bvi<cmj> O = a("endermite", bvi.a.a(cmj::new, bwb.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvi<ckp> P = a("ender_dragon", bvi.a.a(ckp::new, bwb.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bvi<cqu> Q = a("ender_pearl", bvi.a.<cqu>a(cqu::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cko> R = a("end_crystal", bvi.a.<cko>a(cko::new, bwb.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvi<cml> S = a("evoker", bvi.a.a(cml::new, bwb.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<cqc> T = a("evoker_fangs", bvi.a.<cqc>a(cqc::new, bwb.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bvi<cqv> U = a("experience_bottle", bvi.a.<cqv>a(cqv::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<bvn> V = a("experience_orb", bvi.a.<bvn>a(bvn::new, bwb.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bvi<cqd> W = a("eye_of_ender", bvi.a.<cqd>a(cqd::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bvi<clv> X = a("falling_block", bvi.a.<clv>a(clv::new, bwb.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bvi<cqi> Y = a("fireball", bvi.a.<cqi>a(cqi::new, bwb.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvi<cqf> Z = a("firework_rocket", bvi.a.<cqf>a(cqf::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<chz> aa = a("fox", bvi.a.a(chz::new, bwb.b).a(0.6F, 0.7F).b(0.4F).a(new fbx(0.0, 0.6375, -0.25)).a(8).a(dkg.oK));
   public static final bvi<cjm> ab = a("frog", bvi.a.a(cjm::new, bwb.b).a(0.5F, 0.5F).a(new fbx(0.0, 0.375, -0.25)).a(10));
   public static final bvi<csb> ac = a("furnace_minecart", bvi.a.a(csb::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cmm> ad = a("ghast", bvi.a.a(cmm::new, bwb.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bvi<cmn> ae = a("giant", bvi.a.a(cmn::new, bwb.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bvi<cln> af = a("glow_item_frame", bvi.a.<cln>a(cln::new, bwb.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<bvp> ag = a("glow_squid", bvi.a.a(bvp::new, bwb.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bvi<cjs> ah = a("goat", bvi.a.a(cjs::new, bwb.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bvi<cmo> ai = a("guardian", bvi.a.a(cmo::new, bwb.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bvi<cnz> aj = a("hoglin", bvi.a.a(cnz::new, bwb.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvi<csc> ak = a("hopper_minecart", bvi.a.a(csc::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cjy> al = a("horse", bvi.a.a(cjy::new, bwb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bvi<cmp> am = a("husk", bvi.a.a(cmp::new, bwb.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bvi<cmq> an = a("illusioner", bvi.a.a(cmq::new, bwb.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<bvs> ao = a("interaction", bvi.a.a(bvs::new, bwb.h).e().a(0.0F, 0.0F).a(10));
   public static final bvi<cib> ap = a("iron_golem", bvi.a.a(cib::new, bwb.h).a(1.4F, 2.7F).a(10));
   public static final bvi<clw> aq = a("item", bvi.a.<clw>a(clw::new, bwb.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bvi<bux.g> ar = a("item_display", bvi.a.a(bux.g::new, bwb.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvi<clp> as = a("item_frame", bvi.a.<clp>a(clp::new, bwb.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<crs> at = a("jungle_boat", bvi.a.a(a(() -> cxl.oF), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> au = a("jungle_chest_boat", bvi.a.a(b(() -> cxl.oG), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<clq> av = a("leash_knot", bvi.a.<clq>a(clq::new, bwb.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<bvx> aw = a("lightning_bolt", bvi.a.a(bvx::new, bwb.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvi<cjz> ax = a("llama", bvi.a.a(cjz::new, bwb.b).a(0.9F, 1.87F).b(1.7765F).a(new fbx(0.0, 1.37, -0.3)).a(10));
   public static final bvi<cqj> ay = a("llama_spit", bvi.a.<cqj>a(cqj::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cmr> az = a("magma_cube", bvi.a.a(cmr::new, bwb.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bvi<crs> aA = a("mangrove_boat", bvi.a.a(a(() -> cxl.oP), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> aB = a("mangrove_chest_boat", bvi.a.a(b(() -> cxl.oQ), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<bvz> aC = a("marker", bvi.a.a(bvz::new, bwb.h).e().a(0.0F, 0.0F).a(0));
   public static final bvi<crx> aD = a("minecart", bvi.a.a(crx::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cic> aE = a("mooshroom", bvi.a.a(cic::new, bwb.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvi<ckb> aF = a("mule", bvi.a.a(ckb::new, bwb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bvi<crs> aG = a("oak_boat", bvi.a.a(a(() -> cxl.oz), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> aH = a("oak_chest_boat", bvi.a.a(b(() -> cxl.oA), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cid> aI = a("ocelot", bvi.a.a(cid::new, bwb.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bvi<bwe> aJ = a("ominous_item_spawner", bvi.a.a(bwe::new, bwb.h).e().a(0.25F, 0.25F).a(8));
   public static final bvi<clr> aK = a("painting", bvi.a.<clr>a(clr::new, bwb.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvi<crs> aL = a("pale_oak_boat", bvi.a.a(a(() -> cxl.oN), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> aM = a("pale_oak_chest_boat", bvi.a.a(b(() -> cxl.oO), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<cie> aN = a("panda", bvi.a.a(cie::new, bwb.b).a(1.3F, 1.25F).a(10));
   public static final bvi<cif> aO = a("parrot", bvi.a.a(cif::new, bwb.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bvi<cmu> aP = a("phantom", bvi.a.a(cmu::new, bwb.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bvi<cig> aQ = a("pig", bvi.a.a(cig::new, bwb.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bvi<cof> aR = a("piglin", bvi.a.a(cof::new, bwb.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<coi> aS = a("piglin_brute", bvi.a.a(coi::new, bwb.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<cmv> aT = a("pillager", bvi.a.a(cmv::new, bwb.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<cij> aU = a("polar_bear", bvi.a.a(cij::new, bwb.b).a(dkg.rr).a(1.4F, 1.4F).a(10));
   public static final bvi<cqw> aV = a("potion", bvi.a.<cqw>a(cqw::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cik> aW = a("pufferfish", bvi.a.a(cik::new, bwb.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bvi<cil> aX = a("rabbit", bvi.a.a(cil::new, bwb.b).a(0.4F, 0.5F).a(8));
   public static final bvi<cmx> aY = a("ravager", bvi.a.a(cmx::new, bwb.a).a(1.95F, 2.2F).a(new fbx(0.0, 2.2625, -0.0625)).a(10));
   public static final bvi<cim> aZ = a("salmon", bvi.a.a(cim::new, bwb.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bvi<cin> ba = a("sheep", bvi.a.a(cin::new, bwb.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bvi<cmy> bb = a("shulker", bvi.a.a(cmy::new, bwb.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bvi<cqn> bc = a("shulker_bullet", bvi.a.<cqn>a(cqn::new, bwb.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bvi<cmz> bd = a("silverfish", bvi.a.a(cmz::new, bwb.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvi<cna> be = a("skeleton", bvi.a.a(cna::new, bwb.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvi<ckc> bf = a("skeleton_horse", bvi.a.a(ckc::new, bwb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvi<cnb> bg = a("slime", bvi.a.a(cnb::new, bwb.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bvi<cqo> bh = a("small_fireball", bvi.a.<cqo>a(cqo::new, bwb.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvi<ckj> bi = a("sniffer", bvi.a.a(ckj::new, bwb.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bvi<cqp> bj = a("snowball", bvi.a.<cqp>a(cqp::new, bwb.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvi<cip> bk = a("snow_golem", bvi.a.a(cip::new, bwb.h).a(dkg.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bvi<csd> bl = a("spawner_minecart", bvi.a.a(csd::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cqq> bm = a("spectral_arrow", bvi.a.<cqq>a(cqq::new, bwb.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvi<cnd> bn = a("spider", bvi.a.a(cnd::new, bwb.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bvi<crs> bo = a("spruce_boat", bvi.a.a(a(() -> cxl.oB), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<crt> bp = a("spruce_chest_boat", bvi.a.a(b(() -> cxl.oC), bwb.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvi<ciq> bq = a("squid", bvi.a.a(ciq::new, bwb.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bvi<cne> br = a("stray", bvi.a.a(cne::new, bwb.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dkg.rr).a(8));
   public static final bvi<cnf> bs = a("strider", bvi.a.a(cnf::new, bwb.b).c().a(0.9F, 1.7F).a(10));
   public static final bvi<cjp> bt = a("tadpole", bvi.a.a(cjp::new, bwb.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bvi<bux.k> bu = a("text_display", bvi.a.a(bux.k::new, bwb.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvi<clx> bv = a("tnt", bvi.a.<clx>a(clx::new, bwb.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bvi<cse> bw = a("tnt_minecart", bvi.a.a(cse::new, bwb.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvi<cke> bx = a("trader_llama", bvi.a.a(cke::new, bwb.b).a(0.9F, 1.87F).b(1.7765F).a(new fbx(0.0, 1.37, -0.3)).a(10));
   public static final bvi<cqx> by = a("trident", bvi.a.<cqx>a(cqx::new, bwb.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvi<cis> bz = a("tropical_fish", bvi.a.a(cis::new, bwb.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bvi<cit> bA = a("turtle", bvi.a.a(cit::new, bwb.b).a(1.2F, 0.4F).a(new fbx(0.0, 0.55625, -0.25)).a(10));
   public static final bvi<cng> bB = a("vex", bvi.a.a(cng::new, bwb.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bvi<cpd> bC = a("villager", bvi.a.<cpd>a(cpd::new, bwb.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvi<cnh> bD = a("vindicator", bvi.a.a(cnh::new, bwb.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvi<cpj> bE = a("wandering_trader", bvi.a.a(cpj::new, bwb.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvi<cou> bF = a("warden", bvi.a.a(cou::new, bwb.a).a(0.9F, 2.9F).a(3.15F).a(bvb.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bvi<crc> bG = a("wind_charge", bvi.a.<crc>a(crc::new, bwb.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvi<cni> bH = a("witch", bvi.a.a(cni::new, bwb.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bvi<clj> bI = a("wither", bvi.a.a(clj::new, bwb.a).c().a(dkg.ck).a(0.9F, 3.5F).a(10));
   public static final bvi<cnj> bJ = a("wither_skeleton", bvi.a.a(cnj::new, bwb.a).c().a(dkg.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bvi<cqy> bK = a("wither_skull", bvi.a.<cqy>a(cqy::new, bwb.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvi<civ> bL = a("wolf", bvi.a.a(civ::new, bwb.b).a(0.6F, 0.85F).b(0.68F).a(new fbx(0.0, 0.81875, -0.0625)).a(10));
   public static final bvi<cnk> bM = a("zoglin", bvi.a.a(cnk::new, bwb.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvi<cnl> bN = a("zombie", bvi.a.<cnl>a(cnl::new, bwb.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvi<ckg> bO = a("zombie_horse", bvi.a.a(ckg::new, bwb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvi<cnm> bP = a("zombie_villager", bvi.a.a(cnm::new, bwb.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bvi<cnn> bQ = a("zombified_piglin", bvi.a.a(cnn::new, bwb.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bvi<cpr> bR = a("player", bvi.a.<cpr>a(bwb.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cpr.bH).a(32).b(2));
   public static final bvi<cqg> bS = a("fishing_bobber", bvi.a.<cqg>a(cqg::new, bwb.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bvi<?>> bY = Set.of(X, B, bl);
   private final bvi.b<T> bZ;
   private final bwb ca;
   private final ImmutableSet<dke> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private wp cj;
   private final Optional<akt<ewt>> ck;
   private final bvd cl;
   private final float cm;
   private final csn cn;

   private static <T extends bva> bvi<T> a(akt<bvi<?>> $$0, bvi.a<T> $$1) {
      return ke.a(mb.f, $$0, $$1.a($$0));
   }

   private static akt<bvi<?>> b(String $$0) {
      return akt.a(mc.z, aku.b($$0));
   }

   private static <T extends bva> bvi<T> a(String $$0, bvi.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static aku a(bvi<?> $$0) {
      return mb.f.b($$0);
   }

   public static Optional<bvi<?>> a(String $$0) {
      return mb.f.b(aku.c($$0));
   }

   public bvi(
      bvi.b<T> $$0,
      bwb $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dke> $$6,
      bvd $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<akt<ewt>> $$12,
      csn $$13
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
   public T a(ard $$0, @Nullable cxh $$1, @Nullable bvy $$2, ji $$3, bvh $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bva> Consumer<T> a(dgz $$0, cxh $$1, @Nullable bvy $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bva> Consumer<T> a(Consumer<T> $$0, dgz $$1, cxh $$2, @Nullable bvy $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bva> Consumer<T> a(Consumer<T> $$0, cxh $$1) {
      wp $$2 = $$1.a(kv.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bva> Consumer<T> b(Consumer<T> $$0, dgz $$1, cxh $$2, @Nullable bvy $$3) {
      czo $$4 = $$2.a(kv.Y, czo.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ard $$0, ji $$1, bvh $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ard $$0, @Nullable Consumer<T> $$1, ji $$2, bvh $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bwa $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(ard $$0, @Nullable Consumer<T> $$1, ji $$2, bvh $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayz.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bwa $$9) {
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

   protected static double a(dhc $$0, ji $$1, boolean $$2, fbs $$3) {
      fbs $$4 = new fbs($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fcr> $$5 = $$0.d(null, $$4);
      return 1.0 + fco.a(jn.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgz $$0, @Nullable bvy $$1, @Nullable bva $$2, czo $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bvi<?> $$5 = $$3.a($$4.ba(), mc.z);
         if ($$2.aq() == $$5) {
            if ($$0.C || !$$2.aq().s() || $$1 instanceof cpr $$6 && $$4.ag().f($$6.gk())) {
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

   public bwb f() {
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

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<akt<ewt>> j() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public csn k() {
      return this.cn;
   }

   @Nullable
   public T a(dgz $$0, bvh $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bva> a(tq $$0, dgz $$1, bvh $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bU.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fbs a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fbs($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dxq $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && euj.a($$0) ? true : $$0.a(dkg.ck) || $$0.a(dkg.oK) || $$0.a(dkg.ed) || $$0.a(dkg.rr);
      }
   }

   public bvd n() {
      return this.cl;
   }

   public static Optional<bvi<?>> a(tq $$0) {
      return mb.f.b(aku.a($$0.l("id")));
   }

   @Nullable
   public static bva a(tq $$0, dgz $$1, bvh $$2, Function<bva, bva> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            tw $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bva $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bva)$$4;
      }).orElse(null);
   }

   public static Stream<bva> a(final List<? extends un> $$0, final dgz $$1, final bvh $$2) {
      final Spliterator<? extends un> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bva>() {
         @Override
         public boolean tryAdvance(Consumer<? super bva> $$0x) {
            return $$3.tryAdvance($$3xx -> bvi.a((tq)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Nullable
         @Override
         public Spliterator<bva> trySplit() {
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

   private static Optional<bva> b(tq $$0, dgz $$1, bvh $$2) {
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

   public boolean a(axf<bvi<?>> $$0) {
      return this.bV.a($$0);
   }

   public boolean a(jv<bvi<?>> $$0) {
      return $$0.a(this.bV);
   }

   @Nullable
   public T a(bva $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bva> a() {
      return bva.class;
   }

   @Deprecated
   public jr.c<bvi<?>> r() {
      return this.bV;
   }

   private static bvi.b<crs> a(Supplier<cxd> $$0) {
      return ($$1, $$2) -> new crs($$1, $$2, $$0);
   }

   private static bvi.b<crt> b(Supplier<cxd> $$0) {
      return ($$1, $$2) -> new crt($$1, $$2, $$0);
   }

   private static bvi.b<csh> c(Supplier<cxd> $$0) {
      return ($$1, $$2) -> new csh($$1, $$2, $$0);
   }

   private static bvi.b<cru> d(Supplier<cxd> $$0) {
      return ($$1, $$2) -> new cru($$1, $$2, $$0);
   }

   public boolean s() {
      return bY.contains(this);
   }

   public static class a<T extends bva> {
      private final bvi.b<T> a;
      private final bwb b;
      private ImmutableSet<dke> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bvd j = bvd.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bvc.a l = bvc.a();
      private csn m = csp.g;
      private akm<bvi<?>, Optional<akt<ewt>>> n = $$0x -> Optional.of(akt.a(mc.bi, $$0x.a().f("entities/")));
      private final akm<bvi<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bvi.b<T> $$0, bwb $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bwb.b || $$1 == bwb.h;
      }

      public static <T extends bva> bvi.a<T> a(bvi.b<T> $$0, bwb $$1) {
         return new bvi.a<>($$0, $$1);
      }

      public static <T extends bva> bvi.a<T> a(bwb $$0) {
         return new bvi.a<>(($$0x, $$1) -> null, $$0);
      }

      public bvi.a<T> a(float $$0, float $$1) {
         this.j = bvd.b($$0, $$1);
         return this;
      }

      public bvi.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bvi.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bvi.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bvb.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bvi.a<T> a(fbx... $$0) {
         for (fbx $$1 : $$0) {
            this.l = this.l.a(bvb.a, $$1);
         }

         return this;
      }

      public bvi.a<T> a(fbx $$0) {
         return this.a(bvb.b, $$0);
      }

      public bvi.a<T> c(float $$0) {
         return this.a(bvb.b, 0.0F, -$$0, 0.0F);
      }

      public bvi.a<T> d(float $$0) {
         return this.a(bvb.c, 0.0F, $$0, 0.0F);
      }

      public bvi.a<T> a(bvb $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bvi.a<T> a(bvb $$0, fbx $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bvi.a<T> a() {
         this.e = false;
         return this;
      }

      public bvi.a<T> b() {
         this.d = false;
         return this;
      }

      public bvi.a<T> c() {
         this.f = true;
         return this;
      }

      public bvi.a<T> a(dke... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bvi.a<T> d() {
         this.g = true;
         return this;
      }

      public bvi.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bvi.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bvi.a<T> a(csl... $$0) {
         this.m = csp.e.a($$0);
         return this;
      }

      public bvi.a<T> e() {
         this.n = akm.fixed(Optional.empty());
         return this;
      }

      public bvi<T> a(akt<bvi<?>> $$0) {
         if (this.d) {
            af.a(bic.B, $$0.a().toString());
         }

         return new bvi<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bva> {
      @Nullable
      T create(bvi<T> var1, dgz var2);
   }
}
