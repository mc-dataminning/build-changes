import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bsn<T extends bsh> implements cow, dwv<bsh, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jj.c<bsn<?>> bC = lq.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsn<cfy> a = a("allay", bsn.a.a(cfy::new, btf.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsn<bsd> b = a("area_effect_cloud", bsn.a.<bsd>a(bsd::new, btf.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsn<cgb> c = a("armadillo", bsn.a.a(cgb::new, btf.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsn<cik> d = a("armor_stand", bsn.a.<cik>a(cik::new, btf.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsn<cmt> e = a("arrow", bsn.a.<cmt>a(cmt::new, btf.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsn<cge> f = a("axolotl", bsn.a.a(cge::new, btf.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsn<cen> g = a("bat", bsn.a.a(cen::new, btf.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsn<cet> h = a("bee", bsn.a.a(cet::new, btf.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsn<cja> i = a("blaze", bsn.a.a(cja::new, btf.a).c().a(0.6F, 1.8F).a(8));
   public static final bsn<bsg.b> j = a("block_display", bsn.a.a(bsg.b::new, btf.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsn<coi> k = a("boat", bsn.a.<coi>a(coi::new, btf.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsn<cjb> l = a("bogged", bsn.a.a(cjb::new, btf.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsn<ckn> m = a("breeze", bsn.a.a(ckn::new, btf.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bsn<cnu> n = a("breeze_wind_charge", bsn.a.<cnu>a(cnu::new, btf.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsn<cgj> o = a("camel", bsn.a.a(cgj::new, btf.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsn<cev> p = a("cat", bsn.a.a(cev::new, btf.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsn<cjc> q = a("cave_spider", bsn.a.a(cjc::new, btf.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsn<coj> r = a("chest_boat", bsn.a.<coj>a(coj::new, btf.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsn<coo> s = a("chest_minecart", bsn.a.<coo>a(coo::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<cex> t = a("chicken", bsn.a.a(cex::new, btf.b).a(0.4F, 0.7F).b(0.644F).a(new ewh(0.0, 0.7, -0.1)).a(10));
   public static final bsn<cey> u = a("cod", bsn.a.a(cey::new, btf.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsn<cop> v = a("command_block_minecart", bsn.a.<cop>a(cop::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<cez> w = a("cow", bsn.a.a(cez::new, btf.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsn<cjd> x = a("creeper", bsn.a.a(cjd::new, btf.a).a(0.6F, 1.7F).a(8));
   public static final bsn<cfa> y = a("dolphin", bsn.a.a(cfa::new, btf.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsn<cgx> z = a("donkey", bsn.a.a(cgx::new, btf.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsn<cmu> A = a("dragon_fireball", bsn.a.<cmu>a(cmu::new, btf.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsn<cjf> B = a("drowned", bsn.a.a(cjf::new, btf.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsn<cnm> C = a("egg", bsn.a.<cnm>a(cnm::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<cjg> D = a("elder_guardian", bsn.a.a(cjg::new, btf.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsn<chn> E = a("end_crystal", bsn.a.<chn>a(chn::new, btf.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsn<cho> F = a("ender_dragon", bsn.a.a(cho::new, btf.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsn<cnn> G = a("ender_pearl", bsn.a.<cnn>a(cnn::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<cjh> H = a("enderman", bsn.a.a(cjh::new, btf.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsn<cji> I = a("endermite", bsn.a.a(cji::new, btf.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsn<cjk> J = a("evoker", bsn.a.a(cjk::new, btf.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsn<cmv> K = a("evoker_fangs", bsn.a.<cmv>a(cmv::new, btf.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsn<cno> L = a("experience_bottle", bsn.a.<cno>a(cno::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<bss> M = a("experience_orb", bsn.a.<bss>a(bss::new, btf.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsn<cmw> N = a("eye_of_ender", bsn.a.<cmw>a(cmw::new, btf.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsn<ciu> O = a("falling_block", bsn.a.<ciu>a(ciu::new, btf.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsn<cmy> P = a("firework_rocket", bsn.a.<cmy>a(cmy::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<cfc> Q = a("fox", bsn.a.a(cfc::new, btf.b).a(0.6F, 0.7F).b(0.4F).a(new ewh(0.0, 0.6375, -0.25)).a(8).a(dfk.oi));
   public static final bsn<cgm> R = a("frog", bsn.a.a(cgm::new, btf.b).a(0.5F, 0.5F).a(new ewh(0.0, 0.375, -0.25)).a(10));
   public static final bsn<coq> S = a("furnace_minecart", bsn.a.<coq>a(coq::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<cjl> T = a("ghast", bsn.a.a(cjl::new, btf.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsn<cjm> U = a("giant", bsn.a.a(cjm::new, btf.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsn<cim> V = a("glow_item_frame", bsn.a.<cim>a(cim::new, btf.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsn<bsu> W = a("glow_squid", bsn.a.a(bsu::new, btf.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsn<cgs> X = a("goat", bsn.a.a(cgs::new, btf.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsn<cjn> Y = a("guardian", bsn.a.a(cjn::new, btf.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsn<ckv> Z = a("hoglin", bsn.a.a(ckv::new, btf.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsn<cor> aa = a("hopper_minecart", bsn.a.<cor>a(cor::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<cgy> ab = a("horse", bsn.a.a(cgy::new, btf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsn<cjo> ac = a("husk", bsn.a.a(cjo::new, btf.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsn<cjp> ad = a("illusioner", bsn.a.a(cjp::new, btf.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsn<bsx> ae = a("interaction", bsn.a.a(bsx::new, btf.h).a(0.0F, 0.0F).a(10));
   public static final bsn<cfe> af = a("iron_golem", bsn.a.a(cfe::new, btf.h).a(1.4F, 2.7F).a(10));
   public static final bsn<civ> ag = a("item", bsn.a.<civ>a(civ::new, btf.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsn<bsg.g> ah = a("item_display", bsn.a.a(bsg.g::new, btf.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsn<cio> ai = a("item_frame", bsn.a.<cio>a(cio::new, btf.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsn<btj> aj = a("ominous_item_spawner", bsn.a.a(btj::new, btf.h).a(0.25F, 0.25F).a(8));
   public static final bsn<cnb> ak = a("fireball", bsn.a.<cnb>a(cnb::new, btf.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsn<cip> al = a("leash_knot", bsn.a.<cip>a(cip::new, btf.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsn<btb> am = a("lightning_bolt", bsn.a.a(btb::new, btf.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsn<cgz> an = a("llama", bsn.a.a(cgz::new, btf.b).a(0.9F, 1.87F).b(1.7765F).a(new ewh(0.0, 1.37, -0.3)).a(10));
   public static final bsn<cnc> ao = a("llama_spit", bsn.a.<cnc>a(cnc::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<cjq> ap = a("magma_cube", bsn.a.a(cjq::new, btf.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsn<btd> aq = a("marker", bsn.a.a(btd::new, btf.h).a(0.0F, 0.0F).a(0));
   public static final bsn<com> ar = a("minecart", bsn.a.<com>a(com::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<cff> as = a("mooshroom", bsn.a.a(cff::new, btf.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsn<chb> at = a("mule", bsn.a.a(chb::new, btf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsn<cfg> au = a("ocelot", bsn.a.a(cfg::new, btf.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsn<ciq> av = a("painting", bsn.a.<ciq>a(ciq::new, btf.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsn<cfh> aw = a("panda", bsn.a.a(cfh::new, btf.b).a(1.3F, 1.25F).a(10));
   public static final bsn<cfi> ax = a("parrot", bsn.a.a(cfi::new, btf.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsn<cjt> ay = a("phantom", bsn.a.a(cjt::new, btf.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsn<cfj> az = a("pig", bsn.a.a(cfj::new, btf.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsn<clb> aA = a("piglin", bsn.a.a(clb::new, btf.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsn<cle> aB = a("piglin_brute", bsn.a.a(cle::new, btf.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsn<cju> aC = a("pillager", bsn.a.a(cju::new, btf.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsn<cfk> aD = a("polar_bear", bsn.a.a(cfk::new, btf.b).a(dfk.qP).a(1.4F, 1.4F).a(10));
   public static final bsn<cnp> aE = a("potion", bsn.a.<cnp>a(cnp::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<cfl> aF = a("pufferfish", bsn.a.a(cfl::new, btf.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsn<cfm> aG = a("rabbit", bsn.a.a(cfm::new, btf.b).a(0.4F, 0.5F).a(8));
   public static final bsn<cjw> aH = a("ravager", bsn.a.a(cjw::new, btf.a).a(1.95F, 2.2F).a(new ewh(0.0, 2.2625, -0.0625)).a(10));
   public static final bsn<cfn> aI = a("salmon", bsn.a.a(cfn::new, btf.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsn<cfo> aJ = a("sheep", bsn.a.a(cfo::new, btf.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsn<cjx> aK = a("shulker", bsn.a.a(cjx::new, btf.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsn<cng> aL = a("shulker_bullet", bsn.a.<cng>a(cng::new, btf.h).a(0.3125F, 0.3125F).a(8));
   public static final bsn<cjy> aM = a("silverfish", bsn.a.a(cjy::new, btf.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsn<cjz> aN = a("skeleton", bsn.a.a(cjz::new, btf.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsn<chc> aO = a("skeleton_horse", bsn.a.a(chc::new, btf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsn<cka> aP = a("slime", bsn.a.a(cka::new, btf.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsn<cnh> aQ = a("small_fireball", bsn.a.<cnh>a(cnh::new, btf.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsn<chj> aR = a("sniffer", bsn.a.a(chj::new, btf.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsn<cfq> aS = a("snow_golem", bsn.a.a(cfq::new, btf.h).a(dfk.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsn<cni> aT = a("snowball", bsn.a.<cni>a(cni::new, btf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsn<cos> aU = a("spawner_minecart", bsn.a.<cos>a(cos::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<cnj> aV = a("spectral_arrow", bsn.a.<cnj>a(cnj::new, btf.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsn<ckc> aW = a("spider", bsn.a.a(ckc::new, btf.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsn<cfr> aX = a("squid", bsn.a.a(cfr::new, btf.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsn<ckd> aY = a("stray", bsn.a.a(ckd::new, btf.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfk.qP).a(8));
   public static final bsn<cke> aZ = a("strider", bsn.a.a(cke::new, btf.b).c().a(0.9F, 1.7F).a(10));
   public static final bsn<cgp> ba = a("tadpole", bsn.a.a(cgp::new, btf.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bsn<bsg.l> bb = a("text_display", bsn.a.a(bsg.l::new, btf.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsn<ciw> bc = a("tnt", bsn.a.<ciw>a(ciw::new, btf.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsn<cot> bd = a("tnt_minecart", bsn.a.<cot>a(cot::new, btf.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsn<che> be = a("trader_llama", bsn.a.a(che::new, btf.b).a(0.9F, 1.87F).b(1.7765F).a(new ewh(0.0, 1.37, -0.3)).a(10));
   public static final bsn<cnq> bf = a("trident", bsn.a.<cnq>a(cnq::new, btf.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsn<cfs> bg = a("tropical_fish", bsn.a.a(cfs::new, btf.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsn<cft> bh = a("turtle", bsn.a.a(cft::new, btf.b).a(1.2F, 0.4F).a(new ewh(0.0, 0.55625, -0.25)).a(10));
   public static final bsn<ckf> bi = a("vex", bsn.a.a(ckf::new, btf.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsn<cly> bj = a("villager", bsn.a.<cly>a(cly::new, btf.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsn<ckg> bk = a("vindicator", bsn.a.a(ckg::new, btf.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsn<cme> bl = a("wandering_trader", bsn.a.a(cme::new, btf.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsn<clp> bm = a("warden", bsn.a.a(clp::new, btf.a).a(0.9F, 2.9F).a(3.15F).a(bsi.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsn<cnv> bn = a("wind_charge", bsn.a.<cnv>a(cnv::new, btf.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsn<ckh> bo = a("witch", bsn.a.a(ckh::new, btf.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsn<cii> bp = a("wither", bsn.a.a(cii::new, btf.a).c().a(dfk.cd).a(0.9F, 3.5F).a(10));
   public static final bsn<cki> bq = a("wither_skeleton", bsn.a.a(cki::new, btf.a).c().a(dfk.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsn<cnr> br = a("wither_skull", bsn.a.<cnr>a(cnr::new, btf.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsn<cfv> bs = a("wolf", bsn.a.a(cfv::new, btf.b).a(0.6F, 0.85F).b(0.68F).a(new ewh(0.0, 0.81875, -0.0625)).a(10));
   public static final bsn<ckj> bt = a("zoglin", bsn.a.a(ckj::new, btf.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsn<ckk> bu = a("zombie", bsn.a.<ckk>a(ckk::new, btf.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsn<chg> bv = a("zombie_horse", bsn.a.a(chg::new, btf.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsn<ckl> bw = a("zombie_villager", bsn.a.a(ckl::new, btf.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsn<ckm> bx = a("zombified_piglin", bsn.a.a(ckm::new, btf.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsn<cml> by = a("player", bsn.a.<cml>a(btf.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cml.bW).a(32).b(2));
   public static final bsn<cmz> bz = a("fishing_bobber", bsn.a.<cmz>a(cmz::new, btf.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsn.b<T> bF;
   private final btf bG;
   private final ImmutableSet<dfi> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private wu bP;
   @Nullable
   private akj<erb> bQ;
   private final bsk bR;
   private final float bS;
   private final coz bT;

   private static <T extends bsh> bsn<T> a(String $$0, bsn.a<T> $$1) {
      return jw.a(lq.f, $$0, $$1.a($$0));
   }

   public static akk a(bsn<?> $$0) {
      return lq.f.b($$0);
   }

   public static Optional<bsn<?>> a(String $$0) {
      return lq.f.b(akk.a($$0));
   }

   public bsn(bsn.b<T> $$0, btf $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfi> $$6, bsk $$7, float $$8, int $$9, int $$10, coz $$11) {
      this.bF = $$0;
      this.bG = $$1;
      this.bL = $$5;
      this.bI = $$2;
      this.bJ = $$3;
      this.bK = $$4;
      this.bH = $$6;
      this.bR = $$7;
      this.bS = $$8;
      this.bM = $$9;
      this.bN = $$10;
      this.bT = $$11;
   }

   @Nullable
   public T a(aqm $$0, @Nullable cud $$1, @Nullable cml $$2, ja $$3, btg $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsh> Consumer<T> a(aqm $$0, cud $$1, @Nullable cml $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsh> Consumer<T> a(Consumer<T> $$0, aqm $$1, cud $$2, @Nullable cml $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsh> Consumer<T> a(Consumer<T> $$0, cud $$1) {
      wu $$2 = $$1.a(kn.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsh> Consumer<T> b(Consumer<T> $$0, aqm $$1, cud $$2, @Nullable cml $$3) {
      cwr $$4 = $$2.a(kn.M, cwr.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqm $$0, ja $$1, btg $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqm $$0, @Nullable Consumer<T> $$1, ja $$2, btg $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqm $$0, @Nullable Consumer<T> $$1, ja $$2, btg $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dcg)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cM());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayg.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bte $$9) {
            $$9.bb = $$9.dH();
            $$9.aZ = $$9.dH();
            $$9.a($$0, $$0.d_($$9.dr()), $$3, null);
            $$9.Q();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dcj $$0, ja $$1, boolean $$2, ewc $$3) {
      ewc $$4 = new ewc($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<exa> $$5 = $$0.d(null, $$4);
      return 1.0 + ewx.a(jf.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dcg $$0, @Nullable cml $$1, @Nullable bsh $$2, cwr $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cR() || $$1 != null && $$4.ai().f($$1.fZ())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bI;
   }

   public boolean c() {
      return this.bJ;
   }

   public boolean d() {
      return this.bK;
   }

   public boolean e() {
      return this.bL;
   }

   public btf f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lq.f.b(this));
      }

      return this.bO;
   }

   public wu h() {
      if (this.bP == null) {
         this.bP = wu.c(this.g());
      }

      return this.bP;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public akj<erb> k() {
      if (this.bQ == null) {
         akk $$0 = lq.f.b(this);
         this.bQ = akj.a(lr.bb, $$0.d("entities/"));
      }

      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public coz i() {
      return this.bT;
   }

   @Nullable
   public T a(dcg $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsh> a(tx $$0, dcg $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ewc a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ewc($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsl $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eow.a($$0) ? true : $$0.a(dfk.cd) || $$0.a(dfk.oi) || $$0.a(dfk.dQ) || $$0.a(dfk.qP);
      }
   }

   public bsk n() {
      return this.bR;
   }

   public static Optional<bsn<?>> a(tx $$0) {
      return lq.f.b(new akk($$0.l("id")));
   }

   @Nullable
   public static bsh a(tx $$0, dcg $$1, Function<bsh, bsh> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ud $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsh $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsh)$$3;
      }).orElse(null);
   }

   public static Stream<bsh> a(final List<? extends uu> $$0, final dcg $$1) {
      final Spliterator<? extends uu> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsh>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsh> $$0x) {
            return $$2.tryAdvance($$2xx -> bsn.a((tx)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsh> trySplit() {
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

   private static Optional<bsh> b(tx $$0, dcg $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bB.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bM;
   }

   public int p() {
      return this.bN;
   }

   public boolean q() {
      return this != by && this != ao && this != bp && this != g && this != ai && this != V && this != al && this != av && this != E && this != K;
   }

   public boolean a(awm<bsn<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jn<bsn<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsh $$0) {
      return (T)($$0.am() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsh> a() {
      return bsh.class;
   }

   @Deprecated
   public jj.c<bsn<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsh> {
      private final bsn.b<T> a;
      private final btf b;
      private ImmutableSet<dfi> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsk j = bsk.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsj.a l = bsj.a();
      private coz m = cpb.f;

      private a(bsn.b<T> $$0, btf $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btf.b || $$1 == btf.h;
      }

      public static <T extends bsh> bsn.a<T> a(bsn.b<T> $$0, btf $$1) {
         return new bsn.a<>($$0, $$1);
      }

      public static <T extends bsh> bsn.a<T> a(btf $$0) {
         return new bsn.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsn.a<T> a(float $$0, float $$1) {
         this.j = bsk.b($$0, $$1);
         return this;
      }

      public bsn.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsn.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsn.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsi.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsn.a<T> a(ewh... $$0) {
         for (ewh $$1 : $$0) {
            this.l = this.l.a(bsi.a, $$1);
         }

         return this;
      }

      public bsn.a<T> a(ewh $$0) {
         return this.a(bsi.b, $$0);
      }

      public bsn.a<T> c(float $$0) {
         return this.a(bsi.b, 0.0F, -$$0, 0.0F);
      }

      public bsn.a<T> d(float $$0) {
         return this.a(bsi.c, 0.0F, $$0, 0.0F);
      }

      public bsn.a<T> a(bsi $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsn.a<T> a(bsi $$0, ewh $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsn.a<T> a() {
         this.e = false;
         return this;
      }

      public bsn.a<T> b() {
         this.d = false;
         return this;
      }

      public bsn.a<T> c() {
         this.f = true;
         return this;
      }

      public bsn.a<T> a(dfi... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsn.a<T> d() {
         this.g = true;
         return this;
      }

      public bsn.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsn.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsn.a<T> a(cox... $$0) {
         this.m = cpb.d.a($$0);
         return this;
      }

      public bsn<T> a(String $$0) {
         if (this.d) {
            ac.a(bgh.A, $$0);
         }

         return new bsn<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsh> {
      T create(bsn<T> var1, dcg var2);
   }
}
