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

public class bta<T extends bsu> implements cpi, dwj<bsu, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ji.c<bta<?>> bC = lp.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bta<cgl> a = a("allay", bta.a.a(cgl::new, bts.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bta<bsq> b = a("area_effect_cloud", bta.a.<bsq>a(bsq::new, bts.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bta<cgo> c = a("armadillo", bta.a.a(cgo::new, bts.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bta<cix> d = a("armor_stand", bta.a.<cix>a(cix::new, bts.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bta<cnf> e = a("arrow", bta.a.<cnf>a(cnf::new, bts.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bta<cgr> f = a("axolotl", bta.a.a(cgr::new, bts.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bta<cfa> g = a("bat", bta.a.a(cfa::new, bts.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bta<cfg> h = a("bee", bta.a.a(cfg::new, bts.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bta<cjm> i = a("blaze", bta.a.a(cjm::new, bts.a).c().a(0.6F, 1.8F).a(8));
   public static final bta<bst.b> j = a("block_display", bta.a.a(bst.b::new, bts.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bta<cov> k = a("boat", bta.a.<cov>a(cov::new, bts.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bta<cjn> l = a("bogged", bta.a.a(cjn::new, bts.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(cpn.c));
   public static final bta<ckz> m = a("breeze", bta.a.a(ckz::new, bts.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(cpn.c));
   public static final bta<cog> n = a("breeze_wind_charge", bta.a.<cog>a(cog::new, bts.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpn.c));
   public static final bta<cgw> o = a("camel", bta.a.a(cgw::new, bts.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bta<cfi> p = a("cat", bta.a.a(cfi::new, bts.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bta<cjo> q = a("cave_spider", bta.a.a(cjo::new, bts.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bta<cow> r = a("chest_boat", bta.a.<cow>a(cow::new, bts.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bta<cpa> s = a("chest_minecart", bta.a.<cpa>a(cpa::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<cfk> t = a("chicken", bta.a.a(cfk::new, bts.b).a(0.4F, 0.7F).b(0.644F).a(new evr(0.0, 0.7, -0.1)).a(10));
   public static final bta<cfl> u = a("cod", bta.a.a(cfl::new, bts.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bta<cpb> v = a("command_block_minecart", bta.a.<cpb>a(cpb::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<cfm> w = a("cow", bta.a.a(cfm::new, bts.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bta<cjp> x = a("creeper", bta.a.a(cjp::new, bts.a).a(0.6F, 1.7F).a(8));
   public static final bta<cfn> y = a("dolphin", bta.a.a(cfn::new, bts.f).a(0.9F, 0.6F).b(0.3F));
   public static final bta<chk> z = a("donkey", bta.a.a(chk::new, bts.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bta<cng> A = a("dragon_fireball", bta.a.<cng>a(cng::new, bts.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bta<cjr> B = a("drowned", bta.a.a(cjr::new, bts.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bta<cny> C = a("egg", bta.a.<cny>a(cny::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<cjs> D = a("elder_guardian", bta.a.a(cjs::new, bts.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bta<cia> E = a("end_crystal", bta.a.<cia>a(cia::new, bts.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bta<cib> F = a("ender_dragon", bta.a.a(cib::new, bts.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bta<cnz> G = a("ender_pearl", bta.a.<cnz>a(cnz::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<cjt> H = a("enderman", bta.a.a(cjt::new, bts.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bta<cju> I = a("endermite", bta.a.a(cju::new, bts.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bta<cjw> J = a("evoker", bta.a.a(cjw::new, bts.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bta<cnh> K = a("evoker_fangs", bta.a.<cnh>a(cnh::new, bts.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bta<coa> L = a("experience_bottle", bta.a.<coa>a(coa::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<btf> M = a("experience_orb", bta.a.<btf>a(btf::new, bts.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bta<cni> N = a("eye_of_ender", bta.a.<cni>a(cni::new, bts.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bta<cjg> O = a("falling_block", bta.a.<cjg>a(cjg::new, bts.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bta<cnk> P = a("firework_rocket", bta.a.<cnk>a(cnk::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<cfp> Q = a("fox", bta.a.a(cfp::new, bts.b).a(0.6F, 0.7F).b(0.4F).a(new evr(0.0, 0.6375, -0.25)).a(8).a(dfb.oi));
   public static final bta<cgz> R = a("frog", bta.a.a(cgz::new, bts.b).a(0.5F, 0.5F).a(new evr(0.0, 0.375, -0.25)).a(10));
   public static final bta<cpc> S = a("furnace_minecart", bta.a.<cpc>a(cpc::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<cjx> T = a("ghast", bta.a.a(cjx::new, bts.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bta<cjy> U = a("giant", bta.a.a(cjy::new, bts.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bta<ciy> V = a("glow_item_frame", bta.a.<ciy>a(ciy::new, bts.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bta<bth> W = a("glow_squid", bta.a.a(bth::new, bts.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bta<chf> X = a("goat", bta.a.a(chf::new, bts.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bta<cjz> Y = a("guardian", bta.a.a(cjz::new, bts.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bta<clh> Z = a("hoglin", bta.a.a(clh::new, bts.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bta<cpd> aa = a("hopper_minecart", bta.a.<cpd>a(cpd::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<chl> ab = a("horse", bta.a.a(chl::new, bts.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bta<cka> ac = a("husk", bta.a.a(cka::new, bts.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bta<ckb> ad = a("illusioner", bta.a.a(ckb::new, bts.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bta<btk> ae = a("interaction", bta.a.a(btk::new, bts.h).a(0.0F, 0.0F).a(10));
   public static final bta<cfr> af = a("iron_golem", bta.a.a(cfr::new, bts.h).a(1.4F, 2.7F).a(10));
   public static final bta<cjh> ag = a("item", bta.a.<cjh>a(cjh::new, bts.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bta<bst.g> ah = a("item_display", bta.a.a(bst.g::new, bts.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bta<cja> ai = a("item_frame", bta.a.<cja>a(cja::new, bts.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bta<btw> aj = a("ominous_item_spawner", bta.a.a(btw::new, bts.h).a(0.25F, 0.25F).a(8).a(cpn.c));
   public static final bta<cnn> ak = a("fireball", bta.a.<cnn>a(cnn::new, bts.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bta<cjb> al = a("leash_knot", bta.a.<cjb>a(cjb::new, bts.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bta<bto> am = a("lightning_bolt", bta.a.a(bto::new, bts.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bta<chm> an = a("llama", bta.a.a(chm::new, bts.b).a(0.9F, 1.87F).b(1.7765F).a(new evr(0.0, 1.37, -0.3)).a(10));
   public static final bta<cno> ao = a("llama_spit", bta.a.<cno>a(cno::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<ckc> ap = a("magma_cube", bta.a.a(ckc::new, bts.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bta<btq> aq = a("marker", bta.a.a(btq::new, bts.h).a(0.0F, 0.0F).a(0));
   public static final bta<coz> ar = a("minecart", bta.a.<coz>a(coz::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<cfs> as = a("mooshroom", bta.a.a(cfs::new, bts.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bta<cho> at = a("mule", bta.a.a(cho::new, bts.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bta<cft> au = a("ocelot", bta.a.a(cft::new, bts.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bta<cjc> av = a("painting", bta.a.<cjc>a(cjc::new, bts.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bta<cfu> aw = a("panda", bta.a.a(cfu::new, bts.b).a(1.3F, 1.25F).a(10));
   public static final bta<cfv> ax = a("parrot", bta.a.a(cfv::new, bts.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bta<ckf> ay = a("phantom", bta.a.a(ckf::new, bts.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bta<cfw> az = a("pig", bta.a.a(cfw::new, bts.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bta<cln> aA = a("piglin", bta.a.a(cln::new, bts.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bta<clq> aB = a("piglin_brute", bta.a.a(clq::new, bts.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bta<ckg> aC = a("pillager", bta.a.a(ckg::new, bts.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bta<cfx> aD = a("polar_bear", bta.a.a(cfx::new, bts.b).a(dfb.qP).a(1.4F, 1.4F).a(10));
   public static final bta<cob> aE = a("potion", bta.a.<cob>a(cob::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<cfy> aF = a("pufferfish", bta.a.a(cfy::new, bts.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bta<cfz> aG = a("rabbit", bta.a.a(cfz::new, bts.b).a(0.4F, 0.5F).a(8));
   public static final bta<cki> aH = a("ravager", bta.a.a(cki::new, bts.a).a(1.95F, 2.2F).a(new evr(0.0, 2.2625, -0.0625)).a(10));
   public static final bta<cga> aI = a("salmon", bta.a.a(cga::new, bts.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bta<cgb> aJ = a("sheep", bta.a.a(cgb::new, bts.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bta<ckj> aK = a("shulker", bta.a.a(ckj::new, bts.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bta<cns> aL = a("shulker_bullet", bta.a.<cns>a(cns::new, bts.h).a(0.3125F, 0.3125F).a(8));
   public static final bta<ckk> aM = a("silverfish", bta.a.a(ckk::new, bts.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bta<ckl> aN = a("skeleton", bta.a.a(ckl::new, bts.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bta<chp> aO = a("skeleton_horse", bta.a.a(chp::new, bts.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bta<ckm> aP = a("slime", bta.a.a(ckm::new, bts.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bta<cnt> aQ = a("small_fireball", bta.a.<cnt>a(cnt::new, bts.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bta<chw> aR = a("sniffer", bta.a.a(chw::new, bts.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bta<cgd> aS = a("snow_golem", bta.a.a(cgd::new, bts.h).a(dfb.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bta<cnu> aT = a("snowball", bta.a.<cnu>a(cnu::new, bts.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bta<cpe> aU = a("spawner_minecart", bta.a.<cpe>a(cpe::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<cnv> aV = a("spectral_arrow", bta.a.<cnv>a(cnv::new, bts.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bta<cko> aW = a("spider", bta.a.a(cko::new, bts.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bta<cge> aX = a("squid", bta.a.a(cge::new, bts.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bta<ckp> aY = a("stray", bta.a.a(ckp::new, bts.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfb.qP).a(8));
   public static final bta<ckq> aZ = a("strider", bta.a.a(ckq::new, bts.b).c().a(0.9F, 1.7F).a(10));
   public static final bta<chc> ba = a("tadpole", bta.a.a(chc::new, bts.b).a(chc.c, chc.d).b(chc.d * 0.65F).a(10));
   public static final bta<bst.l> bb = a("text_display", bta.a.a(bst.l::new, bts.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bta<cji> bc = a("tnt", bta.a.<cji>a(cji::new, bts.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bta<cpf> bd = a("tnt_minecart", bta.a.<cpf>a(cpf::new, bts.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bta<chr> be = a("trader_llama", bta.a.a(chr::new, bts.b).a(0.9F, 1.87F).b(1.7765F).a(new evr(0.0, 1.37, -0.3)).a(10));
   public static final bta<coc> bf = a("trident", bta.a.<coc>a(coc::new, bts.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bta<cgf> bg = a("tropical_fish", bta.a.a(cgf::new, bts.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bta<cgg> bh = a("turtle", bta.a.a(cgg::new, bts.b).a(1.2F, 0.4F).a(new evr(0.0, 0.55625, -0.25)).a(10));
   public static final bta<ckr> bi = a("vex", bta.a.a(ckr::new, bts.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bta<cmk> bj = a("villager", bta.a.<cmk>a(cmk::new, bts.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bta<cks> bk = a("vindicator", bta.a.a(cks::new, bts.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bta<cmq> bl = a("wandering_trader", bta.a.a(cmq::new, bts.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bta<cmb> bm = a("warden", bta.a.a(cmb::new, bts.a).a(0.9F, 2.9F).a(3.15F).a(bsv.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bta<coh> bn = a("wind_charge", bta.a.<coh>a(coh::new, bts.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpn.c));
   public static final bta<ckt> bo = a("witch", bta.a.a(ckt::new, bts.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bta<civ> bp = a("wither", bta.a.a(civ::new, bts.a).c().a(dfb.cd).a(0.9F, 3.5F).a(10));
   public static final bta<cku> bq = a("wither_skeleton", bta.a.a(cku::new, bts.a).c().a(dfb.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bta<cod> br = a("wither_skull", bta.a.<cod>a(cod::new, bts.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bta<cgi> bs = a("wolf", bta.a.a(cgi::new, bts.b).a(0.6F, 0.85F).b(0.68F).a(new evr(0.0, 0.81875, -0.0625)).a(10));
   public static final bta<ckv> bt = a("zoglin", bta.a.a(ckv::new, bts.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bta<ckw> bu = a("zombie", bta.a.<ckw>a(ckw::new, bts.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bta<cht> bv = a("zombie_horse", bta.a.a(cht::new, bts.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bta<ckx> bw = a("zombie_villager", bta.a.a(ckx::new, bts.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bta<cky> bx = a("zombified_piglin", bta.a.a(cky::new, bts.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bta<cmx> by = a("player", bta.a.<cmx>a(bts.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmx.bT).a(32).b(2));
   public static final bta<cnl> bz = a("fishing_bobber", bta.a.<cnl>a(cnl::new, bts.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bta.b<T> bF;
   private final bts bG;
   private final ImmutableSet<dez> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private xp bP;
   @Nullable
   private ale<eqn> bQ;
   private final bsx bR;
   private final float bS;
   private final cpl bT;

   private static <T extends bsu> bta<T> a(String $$0, bta.a<T> $$1) {
      return jv.a(lp.g, $$0, $$1.a($$0));
   }

   public static alf a(bta<?> $$0) {
      return lp.g.b($$0);
   }

   public static Optional<bta<?>> a(String $$0) {
      return lp.g.b(alf.a($$0));
   }

   public bta(bta.b<T> $$0, bts $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dez> $$6, bsx $$7, float $$8, int $$9, int $$10, cpl $$11) {
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
   public T a(arf $$0, @Nullable cup $$1, @Nullable cmx $$2, iz $$3, btt $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsu> Consumer<T> a(arf $$0, cup $$1, @Nullable cmx $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsu> Consumer<T> a(Consumer<T> $$0, arf $$1, cup $$2, @Nullable cmx $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsu> Consumer<T> a(Consumer<T> $$0, cup $$1) {
      xp $$2 = $$1.a(km.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsu> Consumer<T> b(Consumer<T> $$0, arf $$1, cup $$2, @Nullable cmx $$3) {
      cxe $$4 = $$2.a(km.M, cxe.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arf $$0, iz $$1, btt $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arf $$0, @Nullable Consumer<T> $$1, iz $$2, btt $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arf $$0, @Nullable Consumer<T> $$1, iz $$2, btt $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dby)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cK());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayz.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btr $$9) {
            $$9.ba = $$9.dF();
            $$9.aY = $$9.dF();
            $$9.a($$0, $$0.d_($$9.dp()), $$3, null);
            $$9.Q();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dcb $$0, iz $$1, boolean $$2, evm $$3) {
      evm $$4 = new evm($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewk> $$5 = $$0.d(null, $$4);
      return 1.0 + ewh.a(je.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dby $$0, @Nullable cmx $$1, @Nullable bsu $$2, cxe $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cP() || $$1 != null && $$4.ah().f($$1.gb())) {
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

   public bts f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lp.g.b(this));
      }

      return this.bO;
   }

   public xp h() {
      if (this.bP == null) {
         this.bP = xp.c(this.g());
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

   public ale<eqn> k() {
      if (this.bQ == null) {
         alf $$0 = lp.g.b(this);
         this.bQ = ale.a(lq.aU, $$0.d("entities/"));
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
   public cpl i() {
      return this.bT;
   }

   @Nullable
   public T a(dby $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsu> a(us $$0, dby $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evm a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evm($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsc $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eoi.a($$0) ? true : $$0.a(dfb.cd) || $$0.a(dfb.oi) || $$0.a(dfb.dQ) || $$0.a(dfb.qP);
      }
   }

   public bsx n() {
      return this.bR;
   }

   public static Optional<bta<?>> a(us $$0) {
      return lp.g.b(new alf($$0.l("id")));
   }

   @Nullable
   public static bsu a(us $$0, dby $$1, Function<bsu, bsu> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uy $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsu $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsu)$$3;
      }).orElse(null);
   }

   public static Stream<bsu> a(final List<? extends vp> $$0, final dby $$1) {
      final Spliterator<? extends vp> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsu>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsu> $$0x) {
            return $$2.tryAdvance($$2xx -> bta.a((us)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsu> trySplit() {
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

   private static Optional<bsu> b(us $$0, dby $$1) {
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

   public boolean a(axf<bta<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jm<bta<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsu $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsu> a() {
      return bsu.class;
   }

   @Deprecated
   public ji.c<bta<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsu> {
      private final bta.b<T> a;
      private final bts b;
      private ImmutableSet<dez> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsx j = bsx.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsw.a l = bsw.a();
      private cpl m = cpn.g;

      private a(bta.b<T> $$0, bts $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bts.b || $$1 == bts.h;
      }

      public static <T extends bsu> bta.a<T> a(bta.b<T> $$0, bts $$1) {
         return new bta.a<>($$0, $$1);
      }

      public static <T extends bsu> bta.a<T> a(bts $$0) {
         return new bta.a<>(($$0x, $$1) -> null, $$0);
      }

      public bta.a<T> a(float $$0, float $$1) {
         this.j = bsx.b($$0, $$1);
         return this;
      }

      public bta.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bta.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bta.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsv.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bta.a<T> a(evr... $$0) {
         for (evr $$1 : $$0) {
            this.l = this.l.a(bsv.a, $$1);
         }

         return this;
      }

      public bta.a<T> a(evr $$0) {
         return this.a(bsv.b, $$0);
      }

      public bta.a<T> c(float $$0) {
         return this.a(bsv.b, 0.0F, -$$0, 0.0F);
      }

      public bta.a<T> d(float $$0) {
         return this.a(bsv.c, 0.0F, $$0, 0.0F);
      }

      public bta.a<T> a(bsv $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bta.a<T> a(bsv $$0, evr $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bta.a<T> a() {
         this.e = false;
         return this;
      }

      public bta.a<T> b() {
         this.d = false;
         return this;
      }

      public bta.a<T> c() {
         this.f = true;
         return this;
      }

      public bta.a<T> a(dez... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bta.a<T> d() {
         this.g = true;
         return this;
      }

      public bta.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bta.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bta.a<T> a(cpj... $$0) {
         this.m = cpn.e.a($$0);
         return this;
      }

      public bta<T> a(String $$0) {
         if (this.d) {
            ac.a(bgx.A, $$0);
         }

         return new bta<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsu> {
      T create(bta<T> var1, dby var2);
   }
}
