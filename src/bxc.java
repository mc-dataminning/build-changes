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

public class bxc<T extends bwt> implements cve, efq<bwt, T> {
   private static final Logger bW = LogUtils.getLogger();
   private final jf.c<bxc<?>> bX = mg.f.f(this);
   public static final Codec<bxc<?>> a = mg.f.q();
   private static final float bY = 1.3964844F;
   private static final int bZ = 10;
   public static final bxc<cum> b = a("acacia_boat", bxc.a.a(a(() -> dac.oM), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> c = a("acacia_chest_boat", bxc.a.a(b(() -> dac.oN), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<ckt> d = a("allay", bxc.a.a(ckt::new, bxx.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bxc<bwl> e = a("area_effect_cloud", bxc.a.<bwl>a(bwl::new, bxx.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bxc<ckw> f = a("armadillo", bxc.a.a(ckw::new, bxx.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bxc<cnr> g = a("armor_stand", bxc.a.<cnr>a(cnr::new, bxx.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bxc<csi> h = a("arrow", bxc.a.<csi>a(csi::new, bxx.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxc<ckz> i = a("axolotl", bxc.a.a(ckz::new, bxx.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bxc<cuo> j = a("bamboo_chest_raft", bxc.a.a(d(() -> dac.oX), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cvb> k = a("bamboo_raft", bxc.a.a(c(() -> dac.oW), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cjd> l = a("bat", bxc.a.a(cjd::new, bxx.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bxc<cjl> m = a("bee", bxc.a.a(cjl::new, bxx.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bxc<cum> n = a("birch_boat", bxc.a.a(a(() -> dac.oI), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> o = a("birch_chest_boat", bxc.a.a(b(() -> dac.oJ), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<coh> p = a("blaze", bxc.a.a(coh::new, bxx.a).c().a(0.6F, 1.8F).a(8));
   public static final bxc<bwq.b> q = a("block_display", bxc.a.a(bwq.b::new, bxx.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxc<coi> r = a("bogged", bxc.a.a(coi::new, bxx.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bxc<cpv> s = a("breeze", bxc.a.a(cpv::new, bxx.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bxc<ctk> t = a("breeze_wind_charge", bxc.a.<ctk>a(ctk::new, bxx.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bxc<cle> u = a("camel", bxc.a.a(cle::new, bxx.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bxc<cjn> v = a("cat", bxc.a.a(cjn::new, bxx.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bxc<coj> w = a("cave_spider", bxc.a.a(coj::new, bxx.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bxc<cum> x = a("cherry_boat", bxc.a.a(a(() -> dac.oO), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> y = a("cherry_chest_boat", bxc.a.a(b(() -> dac.oP), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cut> z = a("chest_minecart", bxc.a.a(cut::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<cjq> A = a("chicken", bxc.a.a(cjq::new, bxx.b).a(0.4F, 0.7F).b(0.644F).a(new ffq(0.0, 0.7, -0.1)).a(10));
   public static final bxc<cjt> B = a("cod", bxc.a.a(cjt::new, bxx.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bxc<cuu> C = a("command_block_minecart", bxc.a.a(cuu::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<cju> D = a("cow", bxc.a.a(cju::new, bxx.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bxc<cqd> E = a("creaking", bxc.a.a(cqd::new, bxx.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bxc<cok> F = a("creeper", bxc.a.a(cok::new, bxx.a).a(0.6F, 1.7F).a(8));
   public static final bxc<cum> G = a("dark_oak_boat", bxc.a.a(a(() -> dac.oQ), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> H = a("dark_oak_chest_boat", bxc.a.a(b(() -> dac.oR), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cjx> I = a("dolphin", bxc.a.a(cjx::new, bxx.f).a(0.9F, 0.6F).b(0.3F));
   public static final bxc<clu> J = a("donkey", bxc.a.a(clu::new, bxx.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bxc<csj> K = a("dragon_fireball", bxc.a.<csj>a(csj::new, bxx.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bxc<com> L = a("drowned", bxc.a.a(com::new, bxx.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bxc<ctb> M = a("egg", bxc.a.<ctb>a(ctb::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<coo> N = a("elder_guardian", bxc.a.a(coo::new, bxx.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bxc<cop> O = a("enderman", bxc.a.a(cop::new, bxx.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bxc<coq> P = a("endermite", bxc.a.a(coq::new, bxx.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bxc<cmv> Q = a("ender_dragon", bxc.a.a(cmv::new, bxx.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bxc<ctc> R = a("ender_pearl", bxc.a.<ctc>a(ctc::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<cmu> S = a("end_crystal", bxc.a.<cmu>a(cmu::new, bxx.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bxc<cos> T = a("evoker", bxc.a.a(cos::new, bxx.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxc<csk> U = a("evoker_fangs", bxc.a.<csk>a(csk::new, bxx.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bxc<ctd> V = a("experience_bottle", bxc.a.<ctd>a(ctd::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<bxh> W = a("experience_orb", bxc.a.<bxh>a(bxh::new, bxx.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bxc<csl> X = a("eye_of_ender", bxc.a.<csl>a(csl::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bxc<cob> Y = a("falling_block", bxc.a.<cob>a(cob::new, bxx.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bxc<csq> Z = a("fireball", bxc.a.<csq>a(csq::new, bxx.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bxc<csn> aa = a("firework_rocket", bxc.a.<csn>a(csn::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<cjz> ab = a("fox", bxc.a.a(cjz::new, bxx.b).a(0.6F, 0.7F).b(0.4F).a(new ffq(0.0, 0.6375, -0.25)).a(8).a(dne.oO));
   public static final bxc<clh> ac = a("frog", bxc.a.a(clh::new, bxx.b).a(0.5F, 0.5F).a(new ffq(0.0, 0.375, -0.25)).a(10));
   public static final bxc<cuv> ad = a("furnace_minecart", bxc.a.a(cuv::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<cot> ae = a("ghast", bxc.a.a(cot::new, bxx.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bxc<cou> af = a("giant", bxc.a.a(cou::new, bxx.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bxc<cnt> ag = a("glow_item_frame", bxc.a.<cnt>a(cnt::new, bxx.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bxc<bxj> ah = a("glow_squid", bxc.a.a(bxj::new, bxx.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bxc<clp> ai = a("goat", bxc.a.a(clp::new, bxx.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bxc<cov> aj = a("guardian", bxc.a.a(cov::new, bxx.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bxc<cqg> ak = a("hoglin", bxc.a.a(cqg::new, bxx.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bxc<cuw> al = a("hopper_minecart", bxc.a.a(cuw::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<clv> am = a("horse", bxc.a.a(clv::new, bxx.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bxc<cow> an = a("husk", bxc.a.a(cow::new, bxx.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bxc<cox> ao = a("illusioner", bxc.a.a(cox::new, bxx.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxc<bxo> ap = a("interaction", bxc.a.a(bxo::new, bxx.h).e().a(0.0F, 0.0F).a(10));
   public static final bxc<cka> aq = a("iron_golem", bxc.a.a(cka::new, bxx.h).a(1.4F, 2.7F).a(10));
   public static final bxc<coc> ar = a("item", bxc.a.<coc>a(coc::new, bxx.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bxc<bwq.g> as = a("item_display", bxc.a.a(bwq.g::new, bxx.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxc<cnv> at = a("item_frame", bxc.a.<cnv>a(cnv::new, bxx.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bxc<cum> au = a("jungle_boat", bxc.a.a(a(() -> dac.oK), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> av = a("jungle_chest_boat", bxc.a.a(b(() -> dac.oL), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cnw> aw = a("leash_knot", bxc.a.<cnw>a(cnw::new, bxx.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bxc<bxt> ax = a("lightning_bolt", bxc.a.a(bxt::new, bxx.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bxc<clw> ay = a("llama", bxc.a.a(clw::new, bxx.b).a(0.9F, 1.87F).b(1.7765F).a(new ffq(0.0, 1.37, -0.3)).a(10));
   public static final bxc<csr> az = a("llama_spit", bxc.a.<csr>a(csr::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<coy> aA = a("magma_cube", bxc.a.a(coy::new, bxx.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bxc<cum> aB = a("mangrove_boat", bxc.a.a(a(() -> dac.oU), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> aC = a("mangrove_chest_boat", bxc.a.a(b(() -> dac.oV), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<bxv> aD = a("marker", bxc.a.a(bxv::new, bxx.h).e().a(0.0F, 0.0F).a(0));
   public static final bxc<cur> aE = a("minecart", bxc.a.a(cur::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<ckb> aF = a("mooshroom", bxc.a.a(ckb::new, bxx.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bxc<cly> aG = a("mule", bxc.a.a(cly::new, bxx.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bxc<cum> aH = a("oak_boat", bxc.a.a(a(() -> dac.oE), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> aI = a("oak_chest_boat", bxc.a.a(b(() -> dac.oF), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<ckc> aJ = a("ocelot", bxc.a.a(ckc::new, bxx.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bxc<bya> aK = a("ominous_item_spawner", bxc.a.a(bya::new, bxx.h).e().a(0.25F, 0.25F).a(8));
   public static final bxc<cnx> aL = a("painting", bxc.a.<cnx>a(cnx::new, bxx.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bxc<cum> aM = a("pale_oak_boat", bxc.a.a(a(() -> dac.oS), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> aN = a("pale_oak_chest_boat", bxc.a.a(b(() -> dac.oT), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<ckd> aO = a("panda", bxc.a.a(ckd::new, bxx.b).a(1.3F, 1.25F).a(10));
   public static final bxc<cke> aP = a("parrot", bxc.a.a(cke::new, bxx.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bxc<cpb> aQ = a("phantom", bxc.a.a(cpb::new, bxx.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bxc<ckf> aR = a("pig", bxc.a.a(ckf::new, bxx.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bxc<cqm> aS = a("piglin", bxc.a.a(cqm::new, bxx.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bxc<cqp> aT = a("piglin_brute", bxc.a.a(cqp::new, bxx.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bxc<cpc> aU = a("pillager", bxc.a.a(cpc::new, bxx.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxc<cki> aV = a("polar_bear", bxc.a.a(cki::new, bxx.b).a(dne.rx).a(1.4F, 1.4F).a(10));
   public static final bxc<ctf> aW = a("splash_potion", bxc.a.<ctf>a(ctf::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<cte> aX = a("lingering_potion", bxc.a.<cte>a(cte::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<ckj> aY = a("pufferfish", bxc.a.a(ckj::new, bxx.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bxc<ckk> aZ = a("rabbit", bxc.a.a(ckk::new, bxx.b).a(0.4F, 0.5F).a(8));
   public static final bxc<cpe> ba = a("ravager", bxc.a.a(cpe::new, bxx.a).a(1.95F, 2.2F).a(new ffq(0.0, 2.2625, -0.0625)).a(10));
   public static final bxc<ckl> bb = a("salmon", bxc.a.a(ckl::new, bxx.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bxc<cmg> bc = a("sheep", bxc.a.a(cmg::new, bxx.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bxc<cpf> bd = a("shulker", bxc.a.a(cpf::new, bxx.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bxc<csv> be = a("shulker_bullet", bxc.a.<csv>a(csv::new, bxx.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bxc<cpg> bf = a("silverfish", bxc.a.a(cpg::new, bxx.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bxc<cph> bg = a("skeleton", bxc.a.a(cph::new, bxx.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bxc<clz> bh = a("skeleton_horse", bxc.a.a(clz::new, bxx.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bxc<cpi> bi = a("slime", bxc.a.a(cpi::new, bxx.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bxc<csw> bj = a("small_fireball", bxc.a.<csw>a(csw::new, bxx.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bxc<cmj> bk = a("sniffer", bxc.a.a(cmj::new, bxx.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bxc<csx> bl = a("snowball", bxc.a.<csx>a(csx::new, bxx.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bxc<ckn> bm = a("snow_golem", bxc.a.a(ckn::new, bxx.h).a(dne.rx).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bxc<cux> bn = a("spawner_minecart", bxc.a.a(cux::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<csy> bo = a("spectral_arrow", bxc.a.<csy>a(csy::new, bxx.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxc<cpk> bp = a("spider", bxc.a.a(cpk::new, bxx.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bxc<cum> bq = a("spruce_boat", bxc.a.a(a(() -> dac.oG), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cun> br = a("spruce_chest_boat", bxc.a.a(b(() -> dac.oH), bxx.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bxc<cko> bs = a("squid", bxc.a.a(cko::new, bxx.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bxc<cpl> bt = a("stray", bxc.a.a(cpl::new, bxx.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dne.rx).a(8));
   public static final bxc<cpm> bu = a("strider", bxc.a.a(cpm::new, bxx.b).c().a(0.9F, 1.7F).a(10));
   public static final bxc<clm> bv = a("tadpole", bxc.a.a(clm::new, bxx.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bxc<bwq.k> bw = a("text_display", bxc.a.a(bwq.k::new, bxx.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bxc<cod> bx = a("tnt", bxc.a.<cod>a(cod::new, bxx.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bxc<cuy> by = a("tnt_minecart", bxc.a.a(cuy::new, bxx.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bxc<cmb> bz = a("trader_llama", bxc.a.a(cmb::new, bxx.b).a(0.9F, 1.87F).b(1.7765F).a(new ffq(0.0, 1.37, -0.3)).a(10));
   public static final bxc<ctg> bA = a("trident", bxc.a.<ctg>a(ctg::new, bxx.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bxc<ckq> bB = a("tropical_fish", bxc.a.a(ckq::new, bxx.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bxc<ckr> bC = a("turtle", bxc.a.a(ckr::new, bxx.b).a(1.2F, 0.4F).a(new ffq(0.0, 0.55625, -0.25)).a(10));
   public static final bxc<cpn> bD = a("vex", bxc.a.a(cpn::new, bxx.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bxc<crj> bE = a("villager", bxc.a.<crj>a(crj::new, bxx.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bxc<cpo> bF = a("vindicator", bxc.a.a(cpo::new, bxx.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bxc<crp> bG = a("wandering_trader", bxc.a.a(crp::new, bxx.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bxc<cra> bH = a("warden", bxc.a.a(cra::new, bxx.a).a(0.9F, 2.9F).a(3.15F).a(bwu.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bxc<ctl> bI = a("wind_charge", bxc.a.<ctl>a(ctl::new, bxx.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bxc<cpp> bJ = a("witch", bxc.a.a(cpp::new, bxx.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bxc<cnp> bK = a("wither", bxc.a.a(cnp::new, bxx.a).c().a(dne.cn).a(0.9F, 3.5F).a(10));
   public static final bxc<cpq> bL = a("wither_skeleton", bxc.a.a(cpq::new, bxx.a).c().a(dne.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bxc<cth> bM = a("wither_skull", bxc.a.<cth>a(cth::new, bxx.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bxc<cmm> bN = a("wolf", bxc.a.a(cmm::new, bxx.b).a(0.6F, 0.85F).b(0.68F).a(new ffq(0.0, 0.81875, -0.0625)).a(10));
   public static final bxc<cpr> bO = a("zoglin", bxc.a.a(cpr::new, bxx.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bxc<cps> bP = a("zombie", bxc.a.<cps>a(cps::new, bxx.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bxc<cmd> bQ = a("zombie_horse", bxc.a.a(cmd::new, bxx.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bxc<cpt> bR = a("zombie_villager", bxc.a.a(cpt::new, bxx.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bxc<cpu> bS = a("zombified_piglin", bxc.a.a(cpu::new, bxx.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bxc<crx> bT = a("player", bxc.a.<crx>a(bxx.h).b().a().a(0.6F, 1.8F).b(1.62F).a(crx.bI).a(32).b(2));
   public static final bxc<cso> bU = a("fishing_bobber", bxc.a.<cso>a(cso::new, bxx.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bxc<?>> ca = Set.of(Y, C, bn);
   private final bxc.b<T> cb;
   private final bxx cc;
   private final ImmutableSet<dnc> cd;
   private final boolean ce;
   private final boolean cf;
   private final boolean cg;
   private final boolean ch;
   private final int ci;
   private final int cj;
   private final String ck;
   @Nullable
   private xa cl;
   private final Optional<alh<fam>> cm;
   private final bww cn;
   private final float co;
   private final cvh cp;

   private static <T extends bwt> bxc<T> a(alh<bxc<?>> $$0, bxc.a<T> $$1) {
      return js.a(mg.f, $$0, $$1.a($$0));
   }

   private static alh<bxc<?>> b(String $$0) {
      return alh.a(mh.B, ali.b($$0));
   }

   private static <T extends bwt> bxc<T> a(String $$0, bxc.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static ali a(bxc<?> $$0) {
      return mg.f.b($$0);
   }

   public static Optional<bxc<?>> a(String $$0) {
      return mg.f.b(ali.c($$0));
   }

   public bxc(
      bxc.b<T> $$0,
      bxx $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dnc> $$6,
      bww $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alh<fam>> $$12,
      cvh $$13
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
   public T a(ars $$0, @Nullable czy $$1, @Nullable bxu $$2, iv $$3, bxb $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bwt> Consumer<T> a(djx $$0, czy $$1, @Nullable bxu $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bwt> Consumer<T> a(Consumer<T> $$0, djx $$1, czy $$2, @Nullable bxu $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bwt> Consumer<T> a(Consumer<T> $$0, czy $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bwt> Consumer<T> b(Consumer<T> $$0, djx $$1, czy $$2, @Nullable bxu $$3) {
      dcg $$4 = $$2.a(kk.Y, dcg.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ars $$0, iv $$1, bxb $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ars $$0, @Nullable Consumer<T> $$1, iv $$2, bxb $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof bxw $$7) {
            $$7.T();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(ars $$0, @Nullable Consumer<T> $$1, iv $$2, bxb $$3, boolean $$4, boolean $$5) {
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azo.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bxw $$9) {
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

   protected static double a(dka $$0, iv $$1, boolean $$2, ffl $$3) {
      ffl $$4 = new ffl($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fgk> $$5 = $$0.d(null, $$4);
      return 1.0 + fgh.a(jb.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(djx $$0, @Nullable bxu $$1, @Nullable bwt $$2, dcg $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 != null && $$2 != null) {
         bxc<?> $$5 = $$3.a($$4.ba(), mh.B);
         if ($$2.an() == $$5) {
            if ($$0.C || !$$2.an().s() || $$1 instanceof crx $$6 && $$4.ag().f($$6.gi())) {
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

   public bxx f() {
      return this.cc;
   }

   public String g() {
      return this.ck;
   }

   public xa h() {
      if (this.cl == null) {
         this.cl = xa.c(this.g());
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

   public Optional<alh<fam>> j() {
      return this.cm;
   }

   public float l() {
      return this.cn.a();
   }

   public float m() {
      return this.cn.b();
   }

   @Override
   public cvh k() {
      return this.cp;
   }

   @Nullable
   public T a(djx $$0, bxb $$1) {
      return !this.a($$0.K()) ? null : this.cb.create(this, $$0);
   }

   public static Optional<bwt> a(tz $$0, djx $$1, bxb $$2) {
      return ag.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.i($$0), () -> bW.warn("Skipping Entity with id {}", $$0.b("id", "[invalid]")));
   }

   public ffl a(double $$0, double $$1, double $$2) {
      float $$3 = this.co * this.l() / 2.0F;
      float $$4 = this.co * this.m();
      return new ffl($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(ebe $$0) {
      if (this.cd.contains($$0.b())) {
         return false;
      } else {
         return !this.cg && eyb.a($$0) ? true : $$0.a(dne.cn) || $$0.a(dne.oO) || $$0.a(dne.eg) || $$0.a(dne.rx);
      }
   }

   public bww n() {
      return this.cn;
   }

   public static Optional<bxc<?>> a(tz $$0) {
      return $$0.a("id", a);
   }

   @Nullable
   public static bwt a(tz $$0, djx $$1, bxb $$2, Function<bwt, bwt> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         uf $$5 = $$0.p("Passengers");

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            bwt $$7 = a($$5.b($$6), $$1, $$2, $$3);
            if ($$7 != null) {
               $$7.a($$4, true);
            }
         }

         return (bwt)$$4;
      }).orElse(null);
   }

   public static Stream<bwt> a(List<? extends uy> $$0, djx $$1, bxb $$2) {
      return $$0.stream().flatMap($$0x -> $$0x.s_().stream()).mapMulti(($$2x, $$3) -> a($$2x, $$1, $$2, $$1xx -> {
            $$3.accept($$1xx);
            return $$1xx;
         }));
   }

   private static Optional<bwt> b(tz $$0, djx $$1, bxb $$2) {
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

   public boolean a(axt<bxc<?>> $$0) {
      return this.bX.a($$0);
   }

   public boolean a(jj<bxc<?>> $$0) {
      return $$0.a(this.bX);
   }

   @Nullable
   public T a(bwt $$0) {
      return (T)($$0.an() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bwt> a() {
      return bwt.class;
   }

   @Deprecated
   public jf.c<bxc<?>> r() {
      return this.bX;
   }

   private static bxc.b<cum> a(Supplier<czu> $$0) {
      return ($$1, $$2) -> new cum($$1, $$2, $$0);
   }

   private static bxc.b<cun> b(Supplier<czu> $$0) {
      return ($$1, $$2) -> new cun($$1, $$2, $$0);
   }

   private static bxc.b<cvb> c(Supplier<czu> $$0) {
      return ($$1, $$2) -> new cvb($$1, $$2, $$0);
   }

   private static bxc.b<cuo> d(Supplier<czu> $$0) {
      return ($$1, $$2) -> new cuo($$1, $$2, $$0);
   }

   public boolean s() {
      return ca.contains(this);
   }

   public static class a<T extends bwt> {
      private final bxc.b<T> a;
      private final bxx b;
      private ImmutableSet<dnc> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bww j = bww.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bwv.a l = bwv.a();
      private cvh m = cvj.g;
      private ala<bxc<?>, Optional<alh<fam>>> n = $$0x -> Optional.of(alh.a(mh.br, $$0x.a().f("entities/")));
      private final ala<bxc<?>, String> o = $$0x -> ag.a("entity", $$0x.a());

      private a(bxc.b<T> $$0, bxx $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bxx.b || $$1 == bxx.h;
      }

      public static <T extends bwt> bxc.a<T> a(bxc.b<T> $$0, bxx $$1) {
         return new bxc.a<>($$0, $$1);
      }

      public static <T extends bwt> bxc.a<T> a(bxx $$0) {
         return new bxc.a<>(($$0x, $$1) -> null, $$0);
      }

      public bxc.a<T> a(float $$0, float $$1) {
         this.j = bww.b($$0, $$1);
         return this;
      }

      public bxc.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bxc.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bxc.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bwu.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bxc.a<T> a(ffq... $$0) {
         for (ffq $$1 : $$0) {
            this.l = this.l.a(bwu.a, $$1);
         }

         return this;
      }

      public bxc.a<T> a(ffq $$0) {
         return this.a(bwu.b, $$0);
      }

      public bxc.a<T> c(float $$0) {
         return this.a(bwu.b, 0.0F, -$$0, 0.0F);
      }

      public bxc.a<T> d(float $$0) {
         return this.a(bwu.c, 0.0F, $$0, 0.0F);
      }

      public bxc.a<T> a(bwu $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bxc.a<T> a(bwu $$0, ffq $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bxc.a<T> a() {
         this.e = false;
         return this;
      }

      public bxc.a<T> b() {
         this.d = false;
         return this;
      }

      public bxc.a<T> c() {
         this.f = true;
         return this;
      }

      public bxc.a<T> a(dnc... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bxc.a<T> d() {
         this.g = true;
         return this;
      }

      public bxc.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bxc.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bxc.a<T> a(cvf... $$0) {
         this.m = cvj.e.a($$0);
         return this;
      }

      public bxc.a<T> e() {
         this.n = ala.fixed(Optional.empty());
         return this;
      }

      public bxc<T> a(alh<bxc<?>> $$0) {
         if (this.d) {
            ag.a(bjb.C, $$0.a().toString());
         }

         return new bxc<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bwt> {
      @Nullable
      T create(bxc<T> var1, djx var2);
   }
}
