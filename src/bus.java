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

public class bus<T extends bul> implements crq, ebh<bul, T> {
   private static final Logger bU = LogUtils.getLogger();
   private final jr.c<bus<?>> bV = mb.f.f(this);
   private static final float bW = 1.3964844F;
   private static final int bX = 10;
   public static final bus<cqy> a = a("acacia_boat", bus.a.a(a(() -> cwt.oF), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> b = a("acacia_chest_boat", bus.a.a(b(() -> cwt.oG), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cie> c = a("allay", bus.a.a(cie::new, bvk.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bus<bue> d = a("area_effect_cloud", bus.a.<bue>a(bue::new, bvk.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bus<cih> e = a("armadillo", bus.a.a(cih::new, bvk.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bus<ckr> f = a("armor_stand", bus.a.<ckr>a(ckr::new, bvk.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bus<cpg> g = a("arrow", bus.a.<cpg>a(cpg::new, bvk.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bus<cik> h = a("axolotl", bus.a.a(cik::new, bvk.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bus<cra> i = a("bamboo_chest_raft", bus.a.a(d(() -> cwt.oQ), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<crn> j = a("bamboo_raft", bus.a.a(c(() -> cwt.oP), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cgs> k = a("bat", bus.a.a(cgs::new, bvk.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bus<cgz> l = a("bee", bus.a.a(cgz::new, bvk.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bus<cqy> m = a("birch_boat", bus.a.a(a(() -> cwt.oB), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> n = a("birch_chest_boat", bus.a.a(b(() -> cwt.oC), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<clh> o = a("blaze", bus.a.a(clh::new, bvk.a).c().a(0.6F, 1.8F).a(8));
   public static final bus<buj.b> p = a("block_display", bus.a.a(buj.b::new, bvk.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bus<cli> q = a("bogged", bus.a.a(cli::new, bvk.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bus<cmu> r = a("breeze", bus.a.a(cmu::new, bvk.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bus<cqh> s = a("breeze_wind_charge", bus.a.<cqh>a(cqh::new, bvk.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bus<cip> t = a("camel", bus.a.a(cip::new, bvk.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bus<chb> u = a("cat", bus.a.a(chb::new, bvk.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bus<clj> v = a("cave_spider", bus.a.a(clj::new, bvk.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bus<cqy> w = a("cherry_boat", bus.a.a(a(() -> cwt.oH), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> x = a("cherry_chest_boat", bus.a.a(b(() -> cwt.oI), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<crf> y = a("chest_minecart", bus.a.a(crf::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<chd> z = a("chicken", bus.a.a(chd::new, bvk.b).a(0.4F, 0.7F).b(0.644F).a(new fba(0.0, 0.7, -0.1)).a(10));
   public static final bus<che> A = a("cod", bus.a.a(che::new, bvk.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bus<crg> B = a("command_block_minecart", bus.a.a(crg::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<chf> C = a("cow", bus.a.a(chf::new, bvk.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bus<cnc> D = a("creaking", bus.a.a(cnc::new, bvk.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bus<clk> E = a("creeper", bus.a.a(clk::new, bvk.a).a(0.6F, 1.7F).a(8));
   public static final bus<cqy> F = a("dark_oak_boat", bus.a.a(a(() -> cwt.oJ), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> G = a("dark_oak_chest_boat", bus.a.a(b(() -> cwt.oK), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chg> H = a("dolphin", bus.a.a(chg::new, bvk.f).a(0.9F, 0.6F).b(0.3F));
   public static final bus<cjd> I = a("donkey", bus.a.a(cjd::new, bvk.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bus<cph> J = a("dragon_fireball", bus.a.<cph>a(cph::new, bvk.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bus<clm> K = a("drowned", bus.a.a(clm::new, bvk.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cpz> L = a("egg", bus.a.<cpz>a(cpz::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<cln> M = a("elder_guardian", bus.a.a(cln::new, bvk.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bus<clo> N = a("enderman", bus.a.a(clo::new, bvk.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bus<clp> O = a("endermite", bus.a.a(clp::new, bvk.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bus<cjv> P = a("ender_dragon", bus.a.a(cjv::new, bvk.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bus<cqa> Q = a("ender_pearl", bus.a.<cqa>a(cqa::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<cju> R = a("end_crystal", bus.a.<cju>a(cju::new, bvk.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bus<clr> S = a("evoker", bus.a.a(clr::new, bvk.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<cpi> T = a("evoker_fangs", bus.a.<cpi>a(cpi::new, bvk.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bus<cqb> U = a("experience_bottle", bus.a.<cqb>a(cqb::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<bux> V = a("experience_orb", bus.a.<bux>a(bux::new, bvk.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bus<cpj> W = a("eye_of_ender", bus.a.<cpj>a(cpj::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bus<clb> X = a("falling_block", bus.a.<clb>a(clb::new, bvk.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bus<cpo> Y = a("fireball", bus.a.<cpo>a(cpo::new, bvk.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bus<cpl> Z = a("firework_rocket", bus.a.<cpl>a(cpl::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<chi> aa = a("fox", bus.a.a(chi::new, bvk.b).a(0.6F, 0.7F).b(0.4F).a(new fba(0.0, 0.6375, -0.25)).a(8).a(djo.oK));
   public static final bus<cis> ab = a("frog", bus.a.a(cis::new, bvk.b).a(0.5F, 0.5F).a(new fba(0.0, 0.375, -0.25)).a(10));
   public static final bus<crh> ac = a("furnace_minecart", bus.a.a(crh::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cls> ad = a("ghast", bus.a.a(cls::new, bvk.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bus<clt> ae = a("giant", bus.a.a(clt::new, bvk.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bus<ckt> af = a("glow_item_frame", bus.a.<ckt>a(ckt::new, bvk.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bus<buz> ag = a("glow_squid", bus.a.a(buz::new, bvk.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bus<ciy> ah = a("goat", bus.a.a(ciy::new, bvk.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bus<clu> ai = a("guardian", bus.a.a(clu::new, bvk.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bus<cnf> aj = a("hoglin", bus.a.a(cnf::new, bvk.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bus<cri> ak = a("hopper_minecart", bus.a.a(cri::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cje> al = a("horse", bus.a.a(cje::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bus<clv> am = a("husk", bus.a.a(clv::new, bvk.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bus<clw> an = a("illusioner", bus.a.a(clw::new, bvk.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<bvc> ao = a("interaction", bus.a.a(bvc::new, bvk.h).e().a(0.0F, 0.0F).a(10));
   public static final bus<chk> ap = a("iron_golem", bus.a.a(chk::new, bvk.h).a(1.4F, 2.7F).a(10));
   public static final bus<clc> aq = a("item", bus.a.<clc>a(clc::new, bvk.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bus<buj.g> ar = a("item_display", bus.a.a(buj.g::new, bvk.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bus<ckv> as = a("item_frame", bus.a.<ckv>a(ckv::new, bvk.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bus<cqy> at = a("jungle_boat", bus.a.a(a(() -> cwt.oD), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> au = a("jungle_chest_boat", bus.a.a(b(() -> cwt.oE), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<ckw> av = a("leash_knot", bus.a.<ckw>a(ckw::new, bvk.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bus<bvg> aw = a("lightning_bolt", bus.a.a(bvg::new, bvk.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bus<cjf> ax = a("llama", bus.a.a(cjf::new, bvk.b).a(0.9F, 1.87F).b(1.7765F).a(new fba(0.0, 1.37, -0.3)).a(10));
   public static final bus<cpp> ay = a("llama_spit", bus.a.<cpp>a(cpp::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<clx> az = a("magma_cube", bus.a.a(clx::new, bvk.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bus<cqy> aA = a("mangrove_boat", bus.a.a(a(() -> cwt.oN), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> aB = a("mangrove_chest_boat", bus.a.a(b(() -> cwt.oO), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<bvi> aC = a("marker", bus.a.a(bvi::new, bvk.h).e().a(0.0F, 0.0F).a(0));
   public static final bus<crd> aD = a("minecart", bus.a.a(crd::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<chl> aE = a("mooshroom", bus.a.a(chl::new, bvk.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bus<cjh> aF = a("mule", bus.a.a(cjh::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bus<cqy> aG = a("oak_boat", bus.a.a(a(() -> cwt.ox), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> aH = a("oak_chest_boat", bus.a.a(b(() -> cwt.oy), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chm> aI = a("ocelot", bus.a.a(chm::new, bvk.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bus<bvn> aJ = a("ominous_item_spawner", bus.a.a(bvn::new, bvk.h).e().a(0.25F, 0.25F).a(8));
   public static final bus<ckx> aK = a("painting", bus.a.<ckx>a(ckx::new, bvk.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bus<cqy> aL = a("pale_oak_boat", bus.a.a(a(() -> cwt.oL), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> aM = a("pale_oak_chest_boat", bus.a.a(b(() -> cwt.oM), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chn> aN = a("panda", bus.a.a(chn::new, bvk.b).a(1.3F, 1.25F).a(10));
   public static final bus<cho> aO = a("parrot", bus.a.a(cho::new, bvk.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bus<cma> aP = a("phantom", bus.a.a(cma::new, bvk.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bus<chp> aQ = a("pig", bus.a.a(chp::new, bvk.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bus<cnl> aR = a("piglin", bus.a.a(cnl::new, bvk.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cno> aS = a("piglin_brute", bus.a.a(cno::new, bvk.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cmb> aT = a("pillager", bus.a.a(cmb::new, bvk.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<chq> aU = a("polar_bear", bus.a.a(chq::new, bvk.b).a(djo.rr).a(1.4F, 1.4F).a(10));
   public static final bus<cqc> aV = a("potion", bus.a.<cqc>a(cqc::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<chr> aW = a("pufferfish", bus.a.a(chr::new, bvk.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bus<chs> aX = a("rabbit", bus.a.a(chs::new, bvk.b).a(0.4F, 0.5F).a(8));
   public static final bus<cmd> aY = a("ravager", bus.a.a(cmd::new, bvk.a).a(1.95F, 2.2F).a(new fba(0.0, 2.2625, -0.0625)).a(10));
   public static final bus<cht> aZ = a("salmon", bus.a.a(cht::new, bvk.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bus<chu> ba = a("sheep", bus.a.a(chu::new, bvk.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bus<cme> bb = a("shulker", bus.a.a(cme::new, bvk.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bus<cpt> bc = a("shulker_bullet", bus.a.<cpt>a(cpt::new, bvk.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bus<cmf> bd = a("silverfish", bus.a.a(cmf::new, bvk.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bus<cmg> be = a("skeleton", bus.a.a(cmg::new, bvk.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bus<cji> bf = a("skeleton_horse", bus.a.a(cji::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bus<cmh> bg = a("slime", bus.a.a(cmh::new, bvk.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bus<cpu> bh = a("small_fireball", bus.a.<cpu>a(cpu::new, bvk.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bus<cjp> bi = a("sniffer", bus.a.a(cjp::new, bvk.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bus<cpv> bj = a("snowball", bus.a.<cpv>a(cpv::new, bvk.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bus<chw> bk = a("snow_golem", bus.a.a(chw::new, bvk.h).a(djo.rr).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bus<crj> bl = a("spawner_minecart", bus.a.a(crj::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cpw> bm = a("spectral_arrow", bus.a.<cpw>a(cpw::new, bvk.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bus<cmj> bn = a("spider", bus.a.a(cmj::new, bvk.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bus<cqy> bo = a("spruce_boat", bus.a.a(a(() -> cwt.oz), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<cqz> bp = a("spruce_chest_boat", bus.a.a(b(() -> cwt.oA), bvk.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bus<chx> bq = a("squid", bus.a.a(chx::new, bvk.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bus<cmk> br = a("stray", bus.a.a(cmk::new, bvk.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(djo.rr).a(8));
   public static final bus<cml> bs = a("strider", bus.a.a(cml::new, bvk.b).c().a(0.9F, 1.7F).a(10));
   public static final bus<civ> bt = a("tadpole", bus.a.a(civ::new, bvk.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bus<buj.l> bu = a("text_display", bus.a.a(buj.l::new, bvk.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bus<cld> bv = a("tnt", bus.a.<cld>a(cld::new, bvk.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bus<crk> bw = a("tnt_minecart", bus.a.a(crk::new, bvk.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bus<cjk> bx = a("trader_llama", bus.a.a(cjk::new, bvk.b).a(0.9F, 1.87F).b(1.7765F).a(new fba(0.0, 1.37, -0.3)).a(10));
   public static final bus<cqd> by = a("trident", bus.a.<cqd>a(cqd::new, bvk.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bus<chy> bz = a("tropical_fish", bus.a.a(chy::new, bvk.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bus<chz> bA = a("turtle", bus.a.a(chz::new, bvk.b).a(1.2F, 0.4F).a(new fba(0.0, 0.55625, -0.25)).a(10));
   public static final bus<cmm> bB = a("vex", bus.a.a(cmm::new, bvk.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bus<coi> bC = a("villager", bus.a.<coi>a(coi::new, bvk.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bus<cmn> bD = a("vindicator", bus.a.a(cmn::new, bvk.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bus<cop> bE = a("wandering_trader", bus.a.a(cop::new, bvk.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bus<cnz> bF = a("warden", bus.a.a(cnz::new, bvk.a).a(0.9F, 2.9F).a(3.15F).a(bum.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bus<cqi> bG = a("wind_charge", bus.a.<cqi>a(cqi::new, bvk.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bus<cmo> bH = a("witch", bus.a.a(cmo::new, bvk.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bus<ckp> bI = a("wither", bus.a.a(ckp::new, bvk.a).c().a(djo.ck).a(0.9F, 3.5F).a(10));
   public static final bus<cmp> bJ = a("wither_skeleton", bus.a.a(cmp::new, bvk.a).c().a(djo.ck).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bus<cqe> bK = a("wither_skull", bus.a.<cqe>a(cqe::new, bvk.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bus<cib> bL = a("wolf", bus.a.a(cib::new, bvk.b).a(0.6F, 0.85F).b(0.68F).a(new fba(0.0, 0.81875, -0.0625)).a(10));
   public static final bus<cmq> bM = a("zoglin", bus.a.a(cmq::new, bvk.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bus<cmr> bN = a("zombie", bus.a.<cmr>a(cmr::new, bvk.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bus<cjm> bO = a("zombie_horse", bus.a.a(cjm::new, bvk.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bus<cms> bP = a("zombie_villager", bus.a.a(cms::new, bvk.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bus<cmt> bQ = a("zombified_piglin", bus.a.a(cmt::new, bvk.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bus<cox> bR = a("player", bus.a.<cox>a(bvk.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cox.bU).a(32).b(2));
   public static final bus<cpm> bS = a("fishing_bobber", bus.a.<cpm>a(cpm::new, bvk.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bus<?>> bY = Set.of(X, B, bl);
   private final bus.b<T> bZ;
   private final bvk ca;
   private final ImmutableSet<djm> cb;
   private final boolean cc;
   private final boolean cd;
   private final boolean ce;
   private final boolean cf;
   private final int cg;
   private final int ch;
   private final String ci;
   @Nullable
   private wp cj;
   private final Optional<aku<evw>> ck;
   private final buo cl;
   private final float cm;
   private final crt cn;

   private static <T extends bul> bus<T> a(aku<bus<?>> $$0, bus.a<T> $$1) {
      return ke.a(mb.f, $$0, $$1.a($$0));
   }

   private static aku<bus<?>> b(String $$0) {
      return aku.a(mc.z, akv.b($$0));
   }

   private static <T extends bul> bus<T> a(String $$0, bus.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static akv a(bus<?> $$0) {
      return mb.f.b($$0);
   }

   public static Optional<bus<?>> a(String $$0) {
      return mb.f.b(akv.c($$0));
   }

   public bus(
      bus.b<T> $$0,
      bvk $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<djm> $$6,
      buo $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<aku<evw>> $$12,
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
   public T a(ard $$0, @Nullable cwp $$1, @Nullable cox $$2, ji $$3, bur $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bul> Consumer<T> a(dgi $$0, cwp $$1, @Nullable cox $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bul> Consumer<T> a(Consumer<T> $$0, dgi $$1, cwp $$2, @Nullable cox $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bul> Consumer<T> a(Consumer<T> $$0, cwp $$1) {
      wp $$2 = $$1.a(kv.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bul> Consumer<T> b(Consumer<T> $$0, dgi $$1, cwp $$2, @Nullable cox $$3) {
      cyy $$4 = $$2.a(kv.W, cyy.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ard $$0, ji $$1, bur $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ard $$0, @Nullable Consumer<T> $$1, ji $$2, bur $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bvj $$7) {
            $$7.U();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(ard $$0, @Nullable Consumer<T> $$1, ji $$2, bur $$3, boolean $$4, boolean $$5) {
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
         if ($$6 instanceof bvj $$9) {
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

   protected static double a(dgl $$0, ji $$1, boolean $$2, fav $$3) {
      fav $$4 = new fav($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fbu> $$5 = $$0.d(null, $$4);
      return 1.0 + fbr.a(jn.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dgi $$0, @Nullable cox $$1, @Nullable bul $$2, cyy $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bus<?> $$5 = $$3.a($$4.ba(), mc.z);
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

   public bvk f() {
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

   public Optional<aku<evw>> k() {
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
   public T a(dgi $$0, bur $$1) {
      return !this.a($$0.K()) ? null : this.bZ.create(this, $$0);
   }

   public static Optional<bul> a(tq $$0, dgi $$1, bur $$2) {
      return af.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bU.warn("Skipping Entity with id {}", $$0.l("id")));
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

   public buo n() {
      return this.cl;
   }

   public static Optional<bus<?>> a(tq $$0) {
      return mb.f.b(akv.a($$0.l("id")));
   }

   @Nullable
   public static bul a(tq $$0, dgi $$1, bur $$2, Function<bul, bul> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            tw $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bul $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bul)$$4;
      }).orElse(null);
   }

   public static Stream<bul> a(final List<? extends un> $$0, final dgi $$1, final bur $$2) {
      final Spliterator<? extends un> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bul>() {
         @Override
         public boolean tryAdvance(Consumer<? super bul> $$0x) {
            return $$3.tryAdvance($$3xx -> bus.a((tq)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bul> trySplit() {
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

   private static Optional<bul> b(tq $$0, dgi $$1, bur $$2) {
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

   public boolean a(axf<bus<?>> $$0) {
      return this.bV.a($$0);
   }

   public boolean a(jv<bus<?>> $$0) {
      return $$0.a(this.bV);
   }

   @Nullable
   public T a(bul $$0) {
      return (T)($$0.aq() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bul> a() {
      return bul.class;
   }

   @Deprecated
   public jr.c<bus<?>> r() {
      return this.bV;
   }

   private static bus.b<cqy> a(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new cqy($$1, $$2, $$0);
   }

   private static bus.b<cqz> b(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new cqz($$1, $$2, $$0);
   }

   private static bus.b<crn> c(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new crn($$1, $$2, $$0);
   }

   private static bus.b<cra> d(Supplier<cwl> $$0) {
      return ($$1, $$2) -> new cra($$1, $$2, $$0);
   }

   public boolean s() {
      return bY.contains(this);
   }

   public static class a<T extends bul> {
      private final bus.b<T> a;
      private final bvk b;
      private ImmutableSet<djm> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private buo j = buo.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bun.a l = bun.a();
      private crt m = crv.g;
      private akn<bus<?>, Optional<aku<evw>>> n = $$0x -> Optional.of(aku.a(mc.bg, $$0x.a().f("entities/")));
      private akn<bus<?>, String> o = $$0x -> af.a("entity", $$0x.a());

      private a(bus.b<T> $$0, bvk $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvk.b || $$1 == bvk.h;
      }

      public static <T extends bul> bus.a<T> a(bus.b<T> $$0, bvk $$1) {
         return new bus.a<>($$0, $$1);
      }

      public static <T extends bul> bus.a<T> a(bvk $$0) {
         return new bus.a<>(($$0x, $$1) -> null, $$0);
      }

      public bus.a<T> a(float $$0, float $$1) {
         this.j = buo.b($$0, $$1);
         return this;
      }

      public bus.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bus.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bus.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bum.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bus.a<T> a(fba... $$0) {
         for (fba $$1 : $$0) {
            this.l = this.l.a(bum.a, $$1);
         }

         return this;
      }

      public bus.a<T> a(fba $$0) {
         return this.a(bum.b, $$0);
      }

      public bus.a<T> c(float $$0) {
         return this.a(bum.b, 0.0F, -$$0, 0.0F);
      }

      public bus.a<T> d(float $$0) {
         return this.a(bum.c, 0.0F, $$0, 0.0F);
      }

      public bus.a<T> a(bum $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bus.a<T> a(bum $$0, fba $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bus.a<T> a() {
         this.e = false;
         return this;
      }

      public bus.a<T> b() {
         this.d = false;
         return this;
      }

      public bus.a<T> c() {
         this.f = true;
         return this;
      }

      public bus.a<T> a(djm... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bus.a<T> d() {
         this.g = true;
         return this;
      }

      public bus.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bus.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bus.a<T> a(crr... $$0) {
         this.m = crv.e.a($$0);
         return this;
      }

      public bus.a<T> e() {
         this.n = akn.fixed(Optional.empty());
         return this;
      }

      public bus<T> a(aku<bus<?>> $$0) {
         if (this.d) {
            af.a(bhx.A, $$0.a().toString());
         }

         return new bus<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bul> {
      T create(bus<T> var1, dgi var2);
   }
}
