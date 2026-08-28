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

public class bvr<T extends bvk> implements csq, ecf<bvk, T> {
   private static final Logger bV = LogUtils.getLogger();
   private final jq.c<bvr<?>> bW = ma.f.f(this);
   private static final float bX = 1.3964844F;
   private static final int bY = 10;
   public static final bvr<cry> a = a("acacia_boat", bvr.a.a(a(() -> cxt.ow), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> b = a("acacia_chest_boat", bvr.a.a(b(() -> cxt.ox), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<cjd> c = a("allay", bvr.a.a(cjd::new, bwj.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bvr<bvd> d = a("area_effect_cloud", bvr.a.<bvd>a(bvd::new, bwj.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvr<cjg> e = a("armadillo", bvr.a.a(cjg::new, bwj.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bvr<clq> f = a("armor_stand", bvr.a.<clq>a(clq::new, bwj.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bvr<cqg> g = a("arrow", bvr.a.<cqg>a(cqg::new, bwj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvr<cjj> h = a("axolotl", bvr.a.a(cjj::new, bwj.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bvr<csa> i = a("bamboo_chest_raft", bvr.a.a(d(() -> cxt.oH), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<csn> j = a("bamboo_raft", bvr.a.a(c(() -> cxt.oG), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<chr> k = a("bat", bvr.a.a(chr::new, bwj.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bvr<chy> l = a("bee", bvr.a.a(chy::new, bwj.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bvr<cry> m = a("birch_boat", bvr.a.a(a(() -> cxt.os), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> n = a("birch_chest_boat", bvr.a.a(b(() -> cxt.ot), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<cmg> o = a("blaze", bvr.a.a(cmg::new, bwj.a).c().a(0.6F, 1.8F).a(8));
   public static final bvr<bvi.b> p = a("block_display", bvr.a.a(bvi.b::new, bwj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvr<cmh> q = a("bogged", bvr.a.a(cmh::new, bwj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvr<cnt> r = a("breeze", bvr.a.a(cnt::new, bwj.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bvr<crh> s = a("breeze_wind_charge", bvr.a.<crh>a(crh::new, bwj.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvr<cjo> t = a("camel", bvr.a.a(cjo::new, bwj.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bvr<cia> u = a("cat", bvr.a.a(cia::new, bwj.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bvr<cmi> v = a("cave_spider", bvr.a.a(cmi::new, bwj.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bvr<cry> w = a("cherry_boat", bvr.a.a(a(() -> cxt.oy), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> x = a("cherry_chest_boat", bvr.a.a(b(() -> cxt.oz), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<csf> y = a("chest_minecart", bvr.a.a(csf::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<cic> z = a("chicken", bvr.a.a(cic::new, bwj.b).a(0.4F, 0.7F).b(0.644F).a(new fby(0.0, 0.7, -0.1)).a(10));
   public static final bvr<cid> A = a("cod", bvr.a.a(cid::new, bwj.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bvr<csg> B = a("command_block_minecart", bvr.a.a(csg::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<cie> C = a("cow", bvr.a.a(cie::new, bwj.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvr<cob> D = a("creaking", bvr.a.a(cob::new, bwj.a).c().a(0.9F, 2.7F).b(2.3F).a(8).a(csv.b));
   public static final bvr<cod> E = a("creaking_transient", bvr.a.a(cod::new, bwj.a).b().a().c().a(0.9F, 2.7F).b(2.3F).a(8).a(csv.b));
   public static final bvr<cmj> F = a("creeper", bvr.a.a(cmj::new, bwj.a).a(0.6F, 1.7F).a(8));
   public static final bvr<cry> G = a("dark_oak_boat", bvr.a.a(a(() -> cxt.oA), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> H = a("dark_oak_chest_boat", bvr.a.a(b(() -> cxt.oB), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<cif> I = a("dolphin", bvr.a.a(cif::new, bwj.f).a(0.9F, 0.6F).b(0.3F));
   public static final bvr<ckc> J = a("donkey", bvr.a.a(ckc::new, bwj.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bvr<cqh> K = a("dragon_fireball", bvr.a.<cqh>a(cqh::new, bwj.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvr<cml> L = a("drowned", bvr.a.a(cml::new, bwj.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvr<cqz> M = a("egg", bvr.a.<cqz>a(cqz::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<cmm> N = a("elder_guardian", bvr.a.a(cmm::new, bwj.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bvr<cmn> O = a("enderman", bvr.a.a(cmn::new, bwj.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bvr<cmo> P = a("endermite", bvr.a.a(cmo::new, bwj.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvr<cku> Q = a("ender_dragon", bvr.a.a(cku::new, bwj.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bvr<cra> R = a("ender_pearl", bvr.a.<cra>a(cra::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<ckt> S = a("end_crystal", bvr.a.<ckt>a(ckt::new, bwj.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvr<cmq> T = a("evoker", bvr.a.a(cmq::new, bwj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvr<cqi> U = a("evoker_fangs", bvr.a.<cqi>a(cqi::new, bwj.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bvr<crb> V = a("experience_bottle", bvr.a.<crb>a(crb::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<bvw> W = a("experience_orb", bvr.a.<bvw>a(bvw::new, bwj.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bvr<cqj> X = a("eye_of_ender", bvr.a.<cqj>a(cqj::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bvr<cma> Y = a("falling_block", bvr.a.<cma>a(cma::new, bwj.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bvr<cqo> Z = a("fireball", bvr.a.<cqo>a(cqo::new, bwj.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bvr<cql> aa = a("firework_rocket", bvr.a.<cql>a(cql::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<cih> ab = a("fox", bvr.a.a(cih::new, bwj.b).a(0.6F, 0.7F).b(0.4F).a(new fby(0.0, 0.6375, -0.25)).a(8).a(dko.oD));
   public static final bvr<cjr> ac = a("frog", bvr.a.a(cjr::new, bwj.b).a(0.5F, 0.5F).a(new fby(0.0, 0.375, -0.25)).a(10));
   public static final bvr<csh> ad = a("furnace_minecart", bvr.a.a(csh::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<cmr> ae = a("ghast", bvr.a.a(cmr::new, bwj.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bvr<cms> af = a("giant", bvr.a.a(cms::new, bwj.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bvr<cls> ag = a("glow_item_frame", bvr.a.<cls>a(cls::new, bwj.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvr<bvy> ah = a("glow_squid", bvr.a.a(bvy::new, bwj.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bvr<cjx> ai = a("goat", bvr.a.a(cjx::new, bwj.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bvr<cmt> aj = a("guardian", bvr.a.a(cmt::new, bwj.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bvr<cof> ak = a("hoglin", bvr.a.a(cof::new, bwj.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvr<csi> al = a("hopper_minecart", bvr.a.a(csi::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<ckd> am = a("horse", bvr.a.a(ckd::new, bwj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bvr<cmu> an = a("husk", bvr.a.a(cmu::new, bwj.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bvr<cmv> ao = a("illusioner", bvr.a.a(cmv::new, bwj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvr<bwb> ap = a("interaction", bvr.a.a(bwb::new, bwj.h).e().a(0.0F, 0.0F).a(10));
   public static final bvr<cij> aq = a("iron_golem", bvr.a.a(cij::new, bwj.h).a(1.4F, 2.7F).a(10));
   public static final bvr<cmb> ar = a("item", bvr.a.<cmb>a(cmb::new, bwj.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bvr<bvi.g> as = a("item_display", bvr.a.a(bvi.g::new, bwj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvr<clu> at = a("item_frame", bvr.a.<clu>a(clu::new, bwj.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bvr<cry> au = a("jungle_boat", bvr.a.a(a(() -> cxt.ou), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> av = a("jungle_chest_boat", bvr.a.a(b(() -> cxt.ov), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<clv> aw = a("leash_knot", bvr.a.<clv>a(clv::new, bwj.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bvr<bwf> ax = a("lightning_bolt", bvr.a.a(bwf::new, bwj.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bvr<cke> ay = a("llama", bvr.a.a(cke::new, bwj.b).a(0.9F, 1.87F).b(1.7765F).a(new fby(0.0, 1.37, -0.3)).a(10));
   public static final bvr<cqp> az = a("llama_spit", bvr.a.<cqp>a(cqp::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<cmw> aA = a("magma_cube", bvr.a.a(cmw::new, bwj.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bvr<cry> aB = a("mangrove_boat", bvr.a.a(a(() -> cxt.oE), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> aC = a("mangrove_chest_boat", bvr.a.a(b(() -> cxt.oF), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<bwh> aD = a("marker", bvr.a.a(bwh::new, bwj.h).e().a(0.0F, 0.0F).a(0));
   public static final bvr<csd> aE = a("minecart", bvr.a.a(csd::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<cik> aF = a("mooshroom", bvr.a.a(cik::new, bwj.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bvr<ckg> aG = a("mule", bvr.a.a(ckg::new, bwj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bvr<cry> aH = a("oak_boat", bvr.a.a(a(() -> cxt.oo), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> aI = a("oak_chest_boat", bvr.a.a(b(() -> cxt.op), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<cil> aJ = a("ocelot", bvr.a.a(cil::new, bwj.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bvr<bwm> aK = a("ominous_item_spawner", bvr.a.a(bwm::new, bwj.h).e().a(0.25F, 0.25F).a(8));
   public static final bvr<clw> aL = a("painting", bvr.a.<clw>a(clw::new, bwj.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bvr<cry> aM = a("pale_oak_boat", bvr.a.a(a(() -> cxt.oC), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10).a(csv.b));
   public static final bvr<crz> aN = a("pale_oak_chest_boat", bvr.a.a(b(() -> cxt.oD), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10).a(csv.b));
   public static final bvr<cim> aO = a("panda", bvr.a.a(cim::new, bwj.b).a(1.3F, 1.25F).a(10));
   public static final bvr<cin> aP = a("parrot", bvr.a.a(cin::new, bwj.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bvr<cmz> aQ = a("phantom", bvr.a.a(cmz::new, bwj.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bvr<cio> aR = a("pig", bvr.a.a(cio::new, bwj.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bvr<col> aS = a("piglin", bvr.a.a(col::new, bwj.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvr<cop> aT = a("piglin_brute", bvr.a.a(cop::new, bwj.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bvr<cna> aU = a("pillager", bvr.a.a(cna::new, bwj.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvr<cip> aV = a("polar_bear", bvr.a.a(cip::new, bwj.b).a(dko.rk).a(1.4F, 1.4F).a(10));
   public static final bvr<crc> aW = a("potion", bvr.a.<crc>a(crc::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<ciq> aX = a("pufferfish", bvr.a.a(ciq::new, bwj.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bvr<cir> aY = a("rabbit", bvr.a.a(cir::new, bwj.b).a(0.4F, 0.5F).a(8));
   public static final bvr<cnc> aZ = a("ravager", bvr.a.a(cnc::new, bwj.a).a(1.95F, 2.2F).a(new fby(0.0, 2.2625, -0.0625)).a(10));
   public static final bvr<cis> ba = a("salmon", bvr.a.a(cis::new, bwj.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bvr<cit> bb = a("sheep", bvr.a.a(cit::new, bwj.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bvr<cnd> bc = a("shulker", bvr.a.a(cnd::new, bwj.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bvr<cqt> bd = a("shulker_bullet", bvr.a.<cqt>a(cqt::new, bwj.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bvr<cne> be = a("silverfish", bvr.a.a(cne::new, bwj.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bvr<cnf> bf = a("skeleton", bvr.a.a(cnf::new, bwj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bvr<ckh> bg = a("skeleton_horse", bvr.a.a(ckh::new, bwj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvr<cng> bh = a("slime", bvr.a.a(cng::new, bwj.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bvr<cqu> bi = a("small_fireball", bvr.a.<cqu>a(cqu::new, bwj.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvr<cko> bj = a("sniffer", bvr.a.a(cko::new, bwj.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bvr<cqv> bk = a("snowball", bvr.a.<cqv>a(cqv::new, bwj.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bvr<civ> bl = a("snow_golem", bvr.a.a(civ::new, bwj.h).a(dko.rk).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bvr<csj> bm = a("spawner_minecart", bvr.a.a(csj::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<cqw> bn = a("spectral_arrow", bvr.a.<cqw>a(cqw::new, bwj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvr<cni> bo = a("spider", bvr.a.a(cni::new, bwj.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bvr<cry> bp = a("spruce_boat", bvr.a.a(a(() -> cxt.oq), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<crz> bq = a("spruce_chest_boat", bvr.a.a(b(() -> cxt.or), bwj.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bvr<ciw> br = a("squid", bvr.a.a(ciw::new, bwj.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bvr<cnj> bs = a("stray", bvr.a.a(cnj::new, bwj.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dko.rk).a(8));
   public static final bvr<cnk> bt = a("strider", bvr.a.a(cnk::new, bwj.b).c().a(0.9F, 1.7F).a(10));
   public static final bvr<cju> bu = a("tadpole", bvr.a.a(cju::new, bwj.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bvr<bvi.l> bv = a("text_display", bvr.a.a(bvi.l::new, bwj.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bvr<cmc> bw = a("tnt", bvr.a.<cmc>a(cmc::new, bwj.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bvr<csk> bx = a("tnt_minecart", bvr.a.a(csk::new, bwj.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bvr<ckj> by = a("trader_llama", bvr.a.a(ckj::new, bwj.b).a(0.9F, 1.87F).b(1.7765F).a(new fby(0.0, 1.37, -0.3)).a(10));
   public static final bvr<crd> bz = a("trident", bvr.a.<crd>a(crd::new, bwj.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bvr<cix> bA = a("tropical_fish", bvr.a.a(cix::new, bwj.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bvr<ciy> bB = a("turtle", bvr.a.a(ciy::new, bwj.b).a(1.2F, 0.4F).a(new fby(0.0, 0.55625, -0.25)).a(10));
   public static final bvr<cnl> bC = a("vex", bvr.a.a(cnl::new, bwj.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bvr<cpj> bD = a("villager", bvr.a.<cpj>a(cpj::new, bwj.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvr<cnm> bE = a("vindicator", bvr.a.a(cnm::new, bwj.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bvr<cpp> bF = a("wandering_trader", bvr.a.a(cpp::new, bwj.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bvr<cpa> bG = a("warden", bvr.a.a(cpa::new, bwj.a).a(0.9F, 2.9F).a(3.15F).a(bvl.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bvr<cri> bH = a("wind_charge", bvr.a.<cri>a(cri::new, bwj.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bvr<cnn> bI = a("witch", bvr.a.a(cnn::new, bwj.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bvr<clo> bJ = a("wither", bvr.a.a(clo::new, bwj.a).c().a(dko.ck).a(0.9F, 3.5F).a(10));
   public static final bvr<cno> bK = a("wither_skeleton", bvr.a.a(cno::new, bwj.a).c().a(dko.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bvr<cre> bL = a("wither_skull", bvr.a.<cre>a(cre::new, bwj.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bvr<cja> bM = a("wolf", bvr.a.a(cja::new, bwj.b).a(0.6F, 0.85F).b(0.68F).a(new fby(0.0, 0.81875, -0.0625)).a(10));
   public static final bvr<cnp> bN = a("zoglin", bvr.a.a(cnp::new, bwj.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bvr<cnq> bO = a("zombie", bvr.a.<cnq>a(cnq::new, bwj.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bvr<ckl> bP = a("zombie_horse", bvr.a.a(ckl::new, bwj.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bvr<cnr> bQ = a("zombie_villager", bvr.a.a(cnr::new, bwj.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bvr<cns> bR = a("zombified_piglin", bvr.a.a(cns::new, bwj.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bvr<cpx> bS = a("player", bvr.a.<cpx>a(bwj.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cpx.bV).a(32).b(2));
   public static final bvr<cqm> bT = a("fishing_bobber", bvr.a.<cqm>a(cqm::new, bwj.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bvr.b<T> bZ;
   private final bwj ca;
   private final ImmutableSet<dkm> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private xv cj;
   private final Optional<aly<ewu>> ck;
   private final bvn cl;
   private final float cm;
   private final cst cn;

   private static <T extends bvk> bvr<T> a(aly<bvr<?>> $$0, bvr.a<T> $$1) {
      return kd.a(ma.f, $$0, $$1.a($$0));
   }

   private static aly<bvr<?>> b(String $$0) {
      return aly.a(mb.z, alz.b($$0));
   }

   private static <T extends bvk> bvr<T> a(String $$0, bvr.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static alz a(bvr<?> $$0) {
      return ma.f.b($$0);
   }

   public static Optional<bvr<?>> a(String $$0) {
      return ma.f.b(alz.c($$0));
   }

   public bvr(
      bvr.b<T> $$0,
      bwj $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dkm> $$6,
      bvn $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<aly<ewu>> $$12,
      cst $$13
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
   public T a(ash $$0, @Nullable cxp $$1, @Nullable cpx $$2, jh $$3, bvq $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bvk> Consumer<T> a(dhi $$0, cxp $$1, @Nullable cpx $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bvk> Consumer<T> a(Consumer<T> $$0, dhi $$1, cxp $$2, @Nullable cpx $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bvk> Consumer<T> a(Consumer<T> $$0, cxp $$1) {
      xv $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bvk> Consumer<T> b(Consumer<T> $$0, dhi $$1, cxp $$2, @Nullable cpx $$3) {
      czy $$4 = $$2.a(ku.W, czy.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ash $$0, jh $$1, bvq $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ash $$0, @Nullable Consumer<T> $$1, jh $$2, bvq $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(ash $$0, @Nullable Consumer<T> $$1, jh $$2, bvq $$3, boolean $$4, boolean $$5) {
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
         if ($$6 instanceof bwi $$9) {
            $$9.aZ = $$9.dM();
            $$9.aX = $$9.dM();
            $$9.a($$0, $$0.d_($$9.dw()), $$3, null);
            $$9.R();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dhl $$0, jh $$1, boolean $$2, fbt $$3) {
      fbt $$4 = new fbt($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fcs> $$5 = $$0.d(null, $$4);
      return 1.0 + fcp.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dhi $$0, @Nullable cpx $$1, @Nullable bvk $$2, czy $$3) {
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

   public bwj f() {
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

   public Optional<aly<ewu>> k() {
      return this.ck;
   }

   public float l() {
      return this.cl.a();
   }

   public float m() {
      return this.cl.b();
   }

   @Override
   public cst i() {
      return this.cn;
   }

   @Nullable
   public T a(dhi $$0, bvq $$1) {
      return !this.a($$0.J()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bvk> a(ux $$0, dhi $$1, bvq $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bV.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public fbt a(double $$0, double $$1, double $$2) {
      float $$3 = this.cm * this.l() / 2.0F;
      float $$4 = this.cm * this.m();
      return new fbt($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dxv $$0) {
      if (this.cb.contains($$0.b())) {
         return false;
      } else {
         return !this.ce && euk.a($$0) ? true : $$0.a(dko.ck) || $$0.a(dko.oD) || $$0.a(dko.ed) || $$0.a(dko.rk);
      }
   }

   public bvn n() {
      return this.cl;
   }

   public static Optional<bvr<?>> a(ux $$0) {
      return ma.f.b(alz.a($$0.l("id")));
   }

   @Nullable
   public static bvk a(ux $$0, dhi $$1, bvq $$2, Function<bvk, bvk> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            vd $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bvk $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bvk)$$4;
      }).orElse(null);
   }

   public static Stream<bvk> a(final List<? extends vu> $$0, final dhi $$1, final bvq $$2) {
      final Spliterator<? extends vu> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bvk>() {
         @Override
         public boolean tryAdvance(Consumer<? super bvk> $$0x) {
            return $$3.tryAdvance($$3xx -> bvr.a((ux)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bvk> trySplit() {
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

   private static Optional<bvk> b(ux $$0, dhi $$1, bvq $$2) {
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

   public boolean a(ayk<bvr<?>> $$0) {
      return this.bW.a($$0);
   }

   public boolean a(ju<bvr<?>> $$0) {
      return $$0.a(this.bW);
   }

   @Nullable
   public T a(bvk $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bvk> a() {
      return bvk.class;
   }

   @Deprecated
   public jq.c<bvr<?>> r() {
      return this.bW;
   }

   private static bvr.b<cry> a(Supplier<cxl> $$0) {
      return ($$1, $$2) -> new cry($$1, $$2, $$0);
   }

   private static bvr.b<crz> b(Supplier<cxl> $$0) {
      return ($$1, $$2) -> new crz($$1, $$2, $$0);
   }

   private static bvr.b<csn> c(Supplier<cxl> $$0) {
      return ($$1, $$2) -> new csn($$1, $$2, $$0);
   }

   private static bvr.b<csa> d(Supplier<cxl> $$0) {
      return ($$1, $$2) -> new csa($$1, $$2, $$0);
   }

   public static class a<T extends bvk> {
      private final bvr.b<T> a;
      private final bwj b;
      private ImmutableSet<dkm> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bvn j = bvn.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bvm.a l = bvm.a();
      private cst m = csv.h;
      private alr<bvr<?>, Optional<aly<ewu>>> n = $$0x -> Optional.of(aly.a(mb.bg, $$0x.a().f("entities/")));
      private alr<bvr<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bvr.b<T> $$0, bwj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bwj.b || $$1 == bwj.h;
      }

      public static <T extends bvk> bvr.a<T> a(bvr.b<T> $$0, bwj $$1) {
         return new bvr.a<>($$0, $$1);
      }

      public static <T extends bvk> bvr.a<T> a(bwj $$0) {
         return new bvr.a<>(($$0x, $$1) -> null, $$0);
      }

      public bvr.a<T> a(float $$0, float $$1) {
         this.j = bvn.b($$0, $$1);
         return this;
      }

      public bvr.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bvr.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bvr.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bvl.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bvr.a<T> a(fby... $$0) {
         for (fby $$1 : $$0) {
            this.l = this.l.a(bvl.a, $$1);
         }

         return this;
      }

      public bvr.a<T> a(fby $$0) {
         return this.a(bvl.b, $$0);
      }

      public bvr.a<T> c(float $$0) {
         return this.a(bvl.b, 0.0F, -$$0, 0.0F);
      }

      public bvr.a<T> d(float $$0) {
         return this.a(bvl.c, 0.0F, $$0, 0.0F);
      }

      public bvr.a<T> a(bvl $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bvr.a<T> a(bvl $$0, fby $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bvr.a<T> a() {
         this.e = false;
         return this;
      }

      public bvr.a<T> b() {
         this.d = false;
         return this;
      }

      public bvr.a<T> c() {
         this.f = true;
         return this;
      }

      public bvr.a<T> a(dkm... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bvr.a<T> d() {
         this.g = true;
         return this;
      }

      public bvr.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bvr.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bvr.a<T> a(csr... $$0) {
         this.m = csv.f.a($$0);
         return this;
      }

      public bvr.a<T> e() {
         this.n = alr.fixed(Optional.empty());
         return this;
      }

      public bvr<T> a(aly<bvr<?>> $$0) {
         if (this.d) {
            ae.a(bix.A, $$0.a().toString());
         }

         return new bvr<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bvk> {
      T create(bvr<T> var1, dhi var2);
   }
}
