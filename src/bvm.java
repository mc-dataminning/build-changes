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

public class bvm<T extends bvf> implements csl, ebx<bvf, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jq.c<bvm<?>> bW = ma.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bvm<crt> a = a("acacia_boat", bvm.a.a(a(() -> cxo.ow), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> b = a("acacia_chest_boat", bvm.a.a(b(() -> cxo.ox), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<ciy> c = a("allay", bvm.a.a(ciy::new, bwe.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bvm<buy> d = a("area_effect_cloud", bvm.a.<buy>a(buy::new, bwe.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvm<cjb> e = a("armadillo", bvm.a.a(cjb::new, bwe.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bvm<cll> f = a("armor_stand", bvm.a.<cll>a(cll::new, bwe.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bvm<cqb> g = a("arrow", bvm.a.<cqb>a(cqb::new, bwe.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvm<cje> h = a("axolotl", bvm.a.a(cje::new, bwe.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bvm<crv> i = a("bamboo_chest_raft", bvm.a.a(d(() -> cxo.oH), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<csi> j = a("bamboo_raft", bvm.a.a(c(() -> cxo.oG), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<chm> k = a("bat", bvm.a.a(chm::new, bwe.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bvm<cht> l = a("bee", bvm.a.a(cht::new, bwe.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bvm<crt> m = a("birch_boat", bvm.a.a(a(() -> cxo.os), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> n = a("birch_chest_boat", bvm.a.a(b(() -> cxo.ot), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cmb> o = a("blaze", bvm.a.a(cmb::new, bwe.a).c().a(0.6F, 1.8F).a(8));
   public static final bvm<bvd.b> p = a("block_display", bvm.a.a(bvd.b::new, bwe.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvm<cmc> q = a("bogged", bvm.a.a(cmc::new, bwe.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvm<cno> r = a("breeze", bvm.a.a(cno::new, bwe.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bvm<crc> s = a("breeze_wind_charge", bvm.a.<crc>a(crc::new, bwe.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvm<cjj> t = a("camel", bvm.a.a(cjj::new, bwe.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bvm<chv> u = a("cat", bvm.a.a(chv::new, bwe.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bvm<cmd> v = a("cave_spider", bvm.a.a(cmd::new, bwe.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bvm<crt> w = a("cherry_boat", bvm.a.a(a(() -> cxo.oy), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> x = a("cherry_chest_boat", bvm.a.a(b(() -> cxo.oz), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<csa> y = a("chest_minecart", bvm.a.a(csa::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<chx> z = a("chicken", bvm.a.a(chx::new, bwe.b).a(0.4F, 0.7F).b(0.644F).a(new fbs(0.0, 0.7, -0.1)).a(10));
   public static final bvm<chy> A = a("cod", bvm.a.a(chy::new, bwe.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bvm<csb> B = a("command_block_minecart", bvm.a.a(csb::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<chz> C = a("cow", bvm.a.a(chz::new, bwe.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvm<cnw> D = a("creaking", bvm.a.a(cnw::new, bwe.a).c().a(0.9F, 2.7F).b(2.3F).a(8).a(csq.b));
   public static final bvm<cny> E = a("creaking_transient", bvm.a.a(cny::new, bwe.a).b().a().c().a(0.9F, 2.7F).b(2.3F).a(8).a(csq.b));
   public static final bvm<cme> F = a("creeper", bvm.a.a(cme::new, bwe.a).a(0.6F, 1.7F).a(8));
   public static final bvm<crt> G = a("dark_oak_boat", bvm.a.a(a(() -> cxo.oA), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> H = a("dark_oak_chest_boat", bvm.a.a(b(() -> cxo.oB), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cia> I = a("dolphin", bvm.a.a(cia::new, bwe.f).a(0.9F, 0.6F).b(0.3F));
   public static final bvm<cjx> J = a("donkey", bvm.a.a(cjx::new, bwe.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bvm<cqc> K = a("dragon_fireball", bvm.a.<cqc>a(cqc::new, bwe.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvm<cmg> L = a("drowned", bvm.a.a(cmg::new, bwe.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvm<cqu> M = a("egg", bvm.a.<cqu>a(cqu::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<cmh> N = a("elder_guardian", bvm.a.a(cmh::new, bwe.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bvm<cmi> O = a("enderman", bvm.a.a(cmi::new, bwe.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bvm<cmj> P = a("endermite", bvm.a.a(cmj::new, bwe.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvm<ckp> Q = a("ender_dragon", bvm.a.a(ckp::new, bwe.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bvm<cqv> R = a("ender_pearl", bvm.a.<cqv>a(cqv::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<cko> S = a("end_crystal", bvm.a.<cko>a(cko::new, bwe.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvm<cml> T = a("evoker", bvm.a.a(cml::new, bwe.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvm<cqd> U = a("evoker_fangs", bvm.a.<cqd>a(cqd::new, bwe.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bvm<cqw> V = a("experience_bottle", bvm.a.<cqw>a(cqw::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<bvr> W = a("experience_orb", bvm.a.<bvr>a(bvr::new, bwe.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bvm<cqe> X = a("eye_of_ender", bvm.a.<cqe>a(cqe::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bvm<clv> Y = a("falling_block", bvm.a.<clv>a(clv::new, bwe.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bvm<cqj> Z = a("fireball", bvm.a.<cqj>a(cqj::new, bwe.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvm<cqg> aa = a("firework_rocket", bvm.a.<cqg>a(cqg::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<cic> ab = a("fox", bvm.a.a(cic::new, bwe.b).a(0.6F, 0.7F).b(0.4F).a(new fbs(0.0, 0.6375, -0.25)).a(8).a(dkg.oD));
   public static final bvm<cjm> ac = a("frog", bvm.a.a(cjm::new, bwe.b).a(0.5F, 0.5F).a(new fbs(0.0, 0.375, -0.25)).a(10));
   public static final bvm<csc> ad = a("furnace_minecart", bvm.a.a(csc::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<cmm> ae = a("ghast", bvm.a.a(cmm::new, bwe.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bvm<cmn> af = a("giant", bvm.a.a(cmn::new, bwe.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bvm<cln> ag = a("glow_item_frame", bvm.a.<cln>a(cln::new, bwe.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvm<bvt> ah = a("glow_squid", bvm.a.a(bvt::new, bwe.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bvm<cjs> ai = a("goat", bvm.a.a(cjs::new, bwe.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bvm<cmo> aj = a("guardian", bvm.a.a(cmo::new, bwe.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bvm<coa> ak = a("hoglin", bvm.a.a(coa::new, bwe.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvm<csd> al = a("hopper_minecart", bvm.a.a(csd::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<cjy> am = a("horse", bvm.a.a(cjy::new, bwe.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bvm<cmp> an = a("husk", bvm.a.a(cmp::new, bwe.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bvm<cmq> ao = a("illusioner", bvm.a.a(cmq::new, bwe.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvm<bvw> ap = a("interaction", bvm.a.a(bvw::new, bwe.h).e().a(0.0F, 0.0F).a(10));
   public static final bvm<cie> aq = a("iron_golem", bvm.a.a(cie::new, bwe.h).a(1.4F, 2.7F).a(10));
   public static final bvm<clw> ar = a("item", bvm.a.<clw>a(clw::new, bwe.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bvm<bvd.g> as = a("item_display", bvm.a.a(bvd.g::new, bwe.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvm<clp> at = a("item_frame", bvm.a.<clp>a(clp::new, bwe.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvm<crt> au = a("jungle_boat", bvm.a.a(a(() -> cxo.ou), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> av = a("jungle_chest_boat", bvm.a.a(b(() -> cxo.ov), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<clq> aw = a("leash_knot", bvm.a.<clq>a(clq::new, bwe.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bvm<bwa> ax = a("lightning_bolt", bvm.a.a(bwa::new, bwe.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvm<cjz> ay = a("llama", bvm.a.a(cjz::new, bwe.b).a(0.9F, 1.87F).b(1.7765F).a(new fbs(0.0, 1.37, -0.3)).a(10));
   public static final bvm<cqk> az = a("llama_spit", bvm.a.<cqk>a(cqk::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<cmr> aA = a("magma_cube", bvm.a.a(cmr::new, bwe.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bvm<crt> aB = a("mangrove_boat", bvm.a.a(a(() -> cxo.oE), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> aC = a("mangrove_chest_boat", bvm.a.a(b(() -> cxo.oF), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<bwc> aD = a("marker", bvm.a.a(bwc::new, bwe.h).e().a(0.0F, 0.0F).a(0));
   public static final bvm<cry> aE = a("minecart", bvm.a.a(cry::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<cif> aF = a("mooshroom", bvm.a.a(cif::new, bwe.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvm<ckb> aG = a("mule", bvm.a.a(ckb::new, bwe.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bvm<crt> aH = a("oak_boat", bvm.a.a(a(() -> cxo.oo), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> aI = a("oak_chest_boat", bvm.a.a(b(() -> cxo.op), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cig> aJ = a("ocelot", bvm.a.a(cig::new, bwe.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bvm<bwh> aK = a("ominous_item_spawner", bvm.a.a(bwh::new, bwe.h).e().a(0.25F, 0.25F).a(8));
   public static final bvm<clr> aL = a("painting", bvm.a.<clr>a(clr::new, bwe.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvm<crt> aM = a("pale_oak_boat", bvm.a.a(a(() -> cxo.oC), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10).a(csq.b));
   public static final bvm<cru> aN = a("pale_oak_chest_boat", bvm.a.a(b(() -> cxo.oD), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10).a(csq.b));
   public static final bvm<cih> aO = a("panda", bvm.a.a(cih::new, bwe.b).a(1.3F, 1.25F).a(10));
   public static final bvm<cii> aP = a("parrot", bvm.a.a(cii::new, bwe.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bvm<cmu> aQ = a("phantom", bvm.a.a(cmu::new, bwe.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bvm<cij> aR = a("pig", bvm.a.a(cij::new, bwe.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bvm<cog> aS = a("piglin", bvm.a.a(cog::new, bwe.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvm<coj> aT = a("piglin_brute", bvm.a.a(coj::new, bwe.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvm<cmv> aU = a("pillager", bvm.a.a(cmv::new, bwe.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvm<cik> aV = a("polar_bear", bvm.a.a(cik::new, bwe.b).a(dkg.rk).a(1.4F, 1.4F).a(10));
   public static final bvm<cqx> aW = a("potion", bvm.a.<cqx>a(cqx::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<cil> aX = a("pufferfish", bvm.a.a(cil::new, bwe.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bvm<cim> aY = a("rabbit", bvm.a.a(cim::new, bwe.b).a(0.4F, 0.5F).a(8));
   public static final bvm<cmx> aZ = a("ravager", bvm.a.a(cmx::new, bwe.a).a(1.95F, 2.2F).a(new fbs(0.0, 2.2625, -0.0625)).a(10));
   public static final bvm<cin> ba = a("salmon", bvm.a.a(cin::new, bwe.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bvm<cio> bb = a("sheep", bvm.a.a(cio::new, bwe.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bvm<cmy> bc = a("shulker", bvm.a.a(cmy::new, bwe.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bvm<cqo> bd = a("shulker_bullet", bvm.a.<cqo>a(cqo::new, bwe.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bvm<cmz> be = a("silverfish", bvm.a.a(cmz::new, bwe.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvm<cna> bf = a("skeleton", bvm.a.a(cna::new, bwe.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvm<ckc> bg = a("skeleton_horse", bvm.a.a(ckc::new, bwe.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvm<cnb> bh = a("slime", bvm.a.a(cnb::new, bwe.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bvm<cqp> bi = a("small_fireball", bvm.a.<cqp>a(cqp::new, bwe.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvm<ckj> bj = a("sniffer", bvm.a.a(ckj::new, bwe.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bvm<cqq> bk = a("snowball", bvm.a.<cqq>a(cqq::new, bwe.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvm<ciq> bl = a("snow_golem", bvm.a.a(ciq::new, bwe.h).a(dkg.rk).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bvm<cse> bm = a("spawner_minecart", bvm.a.a(cse::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<cqr> bn = a("spectral_arrow", bvm.a.<cqr>a(cqr::new, bwe.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvm<cnd> bo = a("spider", bvm.a.a(cnd::new, bwe.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bvm<crt> bp = a("spruce_boat", bvm.a.a(a(() -> cxo.oq), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cru> bq = a("spruce_chest_boat", bvm.a.a(b(() -> cxo.or), bwe.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvm<cir> br = a("squid", bvm.a.a(cir::new, bwe.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bvm<cne> bs = a("stray", bvm.a.a(cne::new, bwe.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dkg.rk).a(8));
   public static final bvm<cnf> bt = a("strider", bvm.a.a(cnf::new, bwe.b).c().a(0.9F, 1.7F).a(10));
   public static final bvm<cjp> bu = a("tadpole", bvm.a.a(cjp::new, bwe.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bvm<bvd.l> bv = a("text_display", bvm.a.a(bvd.l::new, bwe.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvm<clx> bw = a("tnt", bvm.a.<clx>a(clx::new, bwe.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bvm<csf> bx = a("tnt_minecart", bvm.a.a(csf::new, bwe.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvm<cke> by = a("trader_llama", bvm.a.a(cke::new, bwe.b).a(0.9F, 1.87F).b(1.7765F).a(new fbs(0.0, 1.37, -0.3)).a(10));
   public static final bvm<cqy> bz = a("trident", bvm.a.<cqy>a(cqy::new, bwe.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvm<cis> bA = a("tropical_fish", bvm.a.a(cis::new, bwe.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bvm<cit> bB = a("turtle", bvm.a.a(cit::new, bwe.b).a(1.2F, 0.4F).a(new fbs(0.0, 0.55625, -0.25)).a(10));
   public static final bvm<cng> bC = a("vex", bvm.a.a(cng::new, bwe.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bvm<cpe> bD = a("villager", bvm.a.<cpe>a(cpe::new, bwe.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvm<cnh> bE = a("vindicator", bvm.a.a(cnh::new, bwe.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvm<cpk> bF = a("wandering_trader", bvm.a.a(cpk::new, bwe.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvm<cov> bG = a("warden", bvm.a.a(cov::new, bwe.a).a(0.9F, 2.9F).a(3.15F).a(bvg.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bvm<crd> bH = a("wind_charge", bvm.a.<crd>a(crd::new, bwe.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvm<cni> bI = a("witch", bvm.a.a(cni::new, bwe.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bvm<clj> bJ = a("wither", bvm.a.a(clj::new, bwe.a).c().a(dkg.ck).a(0.9F, 3.5F).a(10));
   public static final bvm<cnj> bK = a("wither_skeleton", bvm.a.a(cnj::new, bwe.a).c().a(dkg.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bvm<cqz> bL = a("wither_skull", bvm.a.<cqz>a(cqz::new, bwe.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvm<civ> bM = a("wolf", bvm.a.a(civ::new, bwe.b).a(0.6F, 0.85F).b(0.68F).a(new fbs(0.0, 0.81875, -0.0625)).a(10));
   public static final bvm<cnk> bN = a("zoglin", bvm.a.a(cnk::new, bwe.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvm<cnl> bO = a("zombie", bvm.a.<cnl>a(cnl::new, bwe.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvm<ckg> bP = a("zombie_horse", bvm.a.a(ckg::new, bwe.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvm<cnm> bQ = a("zombie_villager", bvm.a.a(cnm::new, bwe.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bvm<cnn> bR = a("zombified_piglin", bvm.a.a(cnn::new, bwe.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bvm<cps> bS = a("player", bvm.a.<cps>a(bwe.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cps.bV).a(32).b(2));
   public static final bvm<cqh> bT = a("fishing_bobber", bvm.a.<cqh>a(cqh::new, bwe.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bvm.b<T> bZ;
   private final bwe ca;
   private final ImmutableSet<dke> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private xv cj;
   private final Optional<aly<ewm>> ck;
   private final bvi cl;
   private final float cm;
   private final cso cn;

   private static <T extends bvf> bvm<T> a(aly<bvm<?>> $$0, bvm.a<T> $$1) {
      return kd.a(ma.f, $$0, $$1.a($$0));
   }

   private static aly<bvm<?>> b(String $$0) {
      return aly.a(mb.z, alz.b($$0));
   }

   private static <T extends bvf> bvm<T> a(String $$0, bvm.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alz a(bvm<?> $$0) {
      return ma.f.b($$0);
   }

   public static Optional<bvm<?>> a(String $$0) {
      return ma.f.b(alz.c($$0));
   }

   public bvm(
      bvm.b<T> $$0,
      bwe $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dke> $$6,
      bvi $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<aly<ewm>> $$12,
      cso $$13
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
   public T a(ash $$0, @Nullable cxk $$1, @Nullable cps $$2, jh $$3, bvl $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bvf> Consumer<T> a(dha $$0, cxk $$1, @Nullable cps $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bvf> Consumer<T> a(Consumer<T> $$0, dha $$1, cxk $$2, @Nullable cps $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bvf> Consumer<T> a(Consumer<T> $$0, cxk $$1) {
      xv $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bvf> Consumer<T> b(Consumer<T> $$0, dha $$1, cxk $$2, @Nullable cps $$3) {
      czt $$4 = $$2.a(ku.W, czt.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ash $$0, jh $$1, bvl $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ash $$0, @Nullable Consumer<T> $$1, jh $$2, bvl $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(ash $$0, @Nullable Consumer<T> $$1, jh $$2, bvl $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, bae.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bwd $$9) {
            $$9.aZ = $$9.dL();
            $$9.aX = $$9.dL();
            $$9.a($$0, $$0.d_($$9.dv()), $$3, null);
            $$9.R();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dhd $$0, jh $$1, boolean $$2, fbn $$3) {
      fbn $$4 = new fbn($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fcm> $$5 = $$0.d(null, $$4);
      return 1.0 + fcj.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dha $$0, @Nullable cps $$1, @Nullable bvf $$2, czt $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cW() || $$1 != null && $$4.ag().f($$1.gf())) {
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

   public bwe f() {
      return this.ca;
   }

   public String g() {
      return this.ci;
   }

   public xv h() {
      if (this.cj == null) {
         this.cj = xv.c(this.g());
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

   public Optional<aly<ewm>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public cso i() {
      return this.cn;
   }

   @Nullable
   public T a(dha $$0, bvl $$1) {
      return !this.a($$0.J()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bvf> a(ux $$0, dha $$1, bvl $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fbn a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fbn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dxn $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && euc.a($$0) ? true : $$0.a(dkg.ck) || $$0.a(dkg.oD) || $$0.a(dkg.ed) || $$0.a(dkg.rk);
      }
   }

   public bvi n() {
      return this.cl;
   }

   public static Optional<bvm<?>> a(ux $$0) {
      return ma.f.b(alz.a($$0.l("id")));
   }

   @Nullable
   public static bvf a(ux $$0, dha $$1, bvl $$2, Function<bvf, bvf> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            vd $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bvf $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bvf)$$4;
      }).orElse(null);
   }

   public static Stream<bvf> a(final List<? extends vu> $$0, final dha $$1, final bvl $$2) {
      final Spliterator<? extends vu> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bvf>() {
         @Override
         public boolean tryAdvance(Consumer<? super bvf> $$0x) {
            return $$3.tryAdvance($$3xx -> bvm.a((ux)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bvf> trySplit() {
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

   private static Optional<bvf> b(ux $$0, dha $$1, bvl $$2) {
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

   public boolean a(ayk<bvm<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ju<bvm<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bvf $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bvf> a() {
      return bvf.class;
   }

   @Deprecated
   public jq.c<bvm<?>> r() {
      return this.bW;
   }

   private static bvm.b<crt> a(Supplier<cxg> $$0) {
      return ($$1, $$2) -> new crt($$1, $$2, $$0);
   }

   private static bvm.b<cru> b(Supplier<cxg> $$0) {
      return ($$1, $$2) -> new cru($$1, $$2, $$0);
   }

   private static bvm.b<csi> c(Supplier<cxg> $$0) {
      return ($$1, $$2) -> new csi($$1, $$2, $$0);
   }

   private static bvm.b<crv> d(Supplier<cxg> $$0) {
      return ($$1, $$2) -> new crv($$1, $$2, $$0);
   }

   public static class a<T extends bvf> {
      private final bvm.b<T> a;
      private final bwe b;
      private ImmutableSet<dke> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bvi j = bvi.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bvh.a l = bvh.a();
      private cso m = csq.h;
      private alr<bvm<?>, Optional<aly<ewm>>> n = $$0x -> Optional.of(aly.a(mb.bf, $$0x.a().f("entities/")));
      private alr<bvm<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bvm.b<T> $$0, bwe $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bwe.b || $$1 == bwe.h;
      }

      public static <T extends bvf> bvm.a<T> a(bvm.b<T> $$0, bwe $$1) {
         return new bvm.a<>($$0, $$1);
      }

      public static <T extends bvf> bvm.a<T> a(bwe $$0) {
         return new bvm.a<>(($$0x, $$1) -> null, $$0);
      }

      public bvm.a<T> a(float $$0, float $$1) {
         this.j = bvi.b($$0, $$1);
         return this;
      }

      public bvm.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bvm.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bvm.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bvg.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bvm.a<T> a(fbs... $$0) {
         for (fbs $$1 : $$0) {
            this.l = this.l.a(bvg.a, $$1);
         }

         return this;
      }

      public bvm.a<T> a(fbs $$0) {
         return this.a(bvg.b, $$0);
      }

      public bvm.a<T> c(float $$0) {
         return this.a(bvg.b, 0.0F, -$$0, 0.0F);
      }

      public bvm.a<T> d(float $$0) {
         return this.a(bvg.c, 0.0F, $$0, 0.0F);
      }

      public bvm.a<T> a(bvg $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bvm.a<T> a(bvg $$0, fbs $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bvm.a<T> a() {
         this.e = false;
         return this;
      }

      public bvm.a<T> b() {
         this.d = false;
         return this;
      }

      public bvm.a<T> c() {
         this.f = true;
         return this;
      }

      public bvm.a<T> a(dke... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bvm.a<T> d() {
         this.g = true;
         return this;
      }

      public bvm.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bvm.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bvm.a<T> a(csm... $$0) {
         this.m = csq.f.a($$0);
         return this;
      }

      public bvm.a<T> e() {
         this.n = alr.fixed(Optional.empty());
         return this;
      }

      public bvm<T> a(aly<bvm<?>> $$0) {
         if (this.d) {
            ae.a(bis.A, $$0.a().toString());
         }

         return new bvm<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bvf> {
      T create(bvm<T> var1, dha var2);
   }
}
