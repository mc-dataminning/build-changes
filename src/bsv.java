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

public class bsv<T extends bsp> implements cpd, dwe<bsp, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ji.c<bsv<?>> bC = lp.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsv<cgg> a = a("allay", bsv.a.a(cgg::new, btn.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsv<bsl> b = a("area_effect_cloud", bsv.a.<bsl>a(bsl::new, btn.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsv<cgj> c = a("armadillo", bsv.a.a(cgj::new, btn.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsv<cis> d = a("armor_stand", bsv.a.<cis>a(cis::new, btn.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsv<cna> e = a("arrow", bsv.a.<cna>a(cna::new, btn.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsv<cgm> f = a("axolotl", bsv.a.a(cgm::new, btn.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsv<cev> g = a("bat", bsv.a.a(cev::new, btn.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsv<cfb> h = a("bee", bsv.a.a(cfb::new, btn.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsv<cjh> i = a("blaze", bsv.a.a(cjh::new, btn.a).c().a(0.6F, 1.8F).a(8));
   public static final bsv<bso.b> j = a("block_display", bsv.a.a(bso.b::new, btn.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsv<coq> k = a("boat", bsv.a.<coq>a(coq::new, btn.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsv<cji> l = a("bogged", bsv.a.a(cji::new, btn.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(cpi.c));
   public static final bsv<cku> m = a("breeze", bsv.a.a(cku::new, btn.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(cpi.c));
   public static final bsv<cob> n = a("breeze_wind_charge", bsv.a.<cob>a(cob::new, btn.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpi.c));
   public static final bsv<cgr> o = a("camel", bsv.a.a(cgr::new, btn.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsv<cfd> p = a("cat", bsv.a.a(cfd::new, btn.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsv<cjj> q = a("cave_spider", bsv.a.a(cjj::new, btn.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsv<cor> r = a("chest_boat", bsv.a.<cor>a(cor::new, btn.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsv<cov> s = a("chest_minecart", bsv.a.<cov>a(cov::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<cff> t = a("chicken", bsv.a.a(cff::new, btn.b).a(0.4F, 0.7F).b(0.644F).a(new evm(0.0, 0.7, -0.1)).a(10));
   public static final bsv<cfg> u = a("cod", bsv.a.a(cfg::new, btn.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsv<cow> v = a("command_block_minecart", bsv.a.<cow>a(cow::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<cfh> w = a("cow", bsv.a.a(cfh::new, btn.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsv<cjk> x = a("creeper", bsv.a.a(cjk::new, btn.a).a(0.6F, 1.7F).a(8));
   public static final bsv<cfi> y = a("dolphin", bsv.a.a(cfi::new, btn.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsv<chf> z = a("donkey", bsv.a.a(chf::new, btn.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsv<cnb> A = a("dragon_fireball", bsv.a.<cnb>a(cnb::new, btn.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsv<cjm> B = a("drowned", bsv.a.a(cjm::new, btn.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsv<cnt> C = a("egg", bsv.a.<cnt>a(cnt::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<cjn> D = a("elder_guardian", bsv.a.a(cjn::new, btn.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsv<chv> E = a("end_crystal", bsv.a.<chv>a(chv::new, btn.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsv<chw> F = a("ender_dragon", bsv.a.a(chw::new, btn.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsv<cnu> G = a("ender_pearl", bsv.a.<cnu>a(cnu::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<cjo> H = a("enderman", bsv.a.a(cjo::new, btn.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsv<cjp> I = a("endermite", bsv.a.a(cjp::new, btn.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsv<cjr> J = a("evoker", bsv.a.a(cjr::new, btn.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsv<cnc> K = a("evoker_fangs", bsv.a.<cnc>a(cnc::new, btn.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsv<cnv> L = a("experience_bottle", bsv.a.<cnv>a(cnv::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<bta> M = a("experience_orb", bsv.a.<bta>a(bta::new, btn.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsv<cnd> N = a("eye_of_ender", bsv.a.<cnd>a(cnd::new, btn.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsv<cjb> O = a("falling_block", bsv.a.<cjb>a(cjb::new, btn.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsv<cnf> P = a("firework_rocket", bsv.a.<cnf>a(cnf::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<cfk> Q = a("fox", bsv.a.a(cfk::new, btn.b).a(0.6F, 0.7F).b(0.4F).a(new evm(0.0, 0.6375, -0.25)).a(8).a(dew.oi));
   public static final bsv<cgu> R = a("frog", bsv.a.a(cgu::new, btn.b).a(0.5F, 0.5F).a(new evm(0.0, 0.375, -0.25)).a(10));
   public static final bsv<cox> S = a("furnace_minecart", bsv.a.<cox>a(cox::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<cjs> T = a("ghast", bsv.a.a(cjs::new, btn.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsv<cjt> U = a("giant", bsv.a.a(cjt::new, btn.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsv<cit> V = a("glow_item_frame", bsv.a.<cit>a(cit::new, btn.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsv<btc> W = a("glow_squid", bsv.a.a(btc::new, btn.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsv<cha> X = a("goat", bsv.a.a(cha::new, btn.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsv<cju> Y = a("guardian", bsv.a.a(cju::new, btn.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsv<clc> Z = a("hoglin", bsv.a.a(clc::new, btn.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsv<coy> aa = a("hopper_minecart", bsv.a.<coy>a(coy::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<chg> ab = a("horse", bsv.a.a(chg::new, btn.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsv<cjv> ac = a("husk", bsv.a.a(cjv::new, btn.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsv<cjw> ad = a("illusioner", bsv.a.a(cjw::new, btn.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsv<btf> ae = a("interaction", bsv.a.a(btf::new, btn.h).a(0.0F, 0.0F).a(10));
   public static final bsv<cfm> af = a("iron_golem", bsv.a.a(cfm::new, btn.h).a(1.4F, 2.7F).a(10));
   public static final bsv<cjc> ag = a("item", bsv.a.<cjc>a(cjc::new, btn.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsv<bso.g> ah = a("item_display", bsv.a.a(bso.g::new, btn.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsv<civ> ai = a("item_frame", bsv.a.<civ>a(civ::new, btn.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsv<btr> aj = a("ominous_item_spawner", bsv.a.a(btr::new, btn.h).a(0.25F, 0.25F).a(8).a(cpi.c));
   public static final bsv<cni> ak = a("fireball", bsv.a.<cni>a(cni::new, btn.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsv<ciw> al = a("leash_knot", bsv.a.<ciw>a(ciw::new, btn.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsv<btj> am = a("lightning_bolt", bsv.a.a(btj::new, btn.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsv<chh> an = a("llama", bsv.a.a(chh::new, btn.b).a(0.9F, 1.87F).b(1.7765F).a(new evm(0.0, 1.37, -0.3)).a(10));
   public static final bsv<cnj> ao = a("llama_spit", bsv.a.<cnj>a(cnj::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<cjx> ap = a("magma_cube", bsv.a.a(cjx::new, btn.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsv<btl> aq = a("marker", bsv.a.a(btl::new, btn.h).a(0.0F, 0.0F).a(0));
   public static final bsv<cou> ar = a("minecart", bsv.a.<cou>a(cou::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<cfn> as = a("mooshroom", bsv.a.a(cfn::new, btn.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsv<chj> at = a("mule", bsv.a.a(chj::new, btn.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsv<cfo> au = a("ocelot", bsv.a.a(cfo::new, btn.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsv<cix> av = a("painting", bsv.a.<cix>a(cix::new, btn.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsv<cfp> aw = a("panda", bsv.a.a(cfp::new, btn.b).a(1.3F, 1.25F).a(10));
   public static final bsv<cfq> ax = a("parrot", bsv.a.a(cfq::new, btn.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsv<cka> ay = a("phantom", bsv.a.a(cka::new, btn.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsv<cfr> az = a("pig", bsv.a.a(cfr::new, btn.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsv<cli> aA = a("piglin", bsv.a.a(cli::new, btn.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsv<cll> aB = a("piglin_brute", bsv.a.a(cll::new, btn.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsv<ckb> aC = a("pillager", bsv.a.a(ckb::new, btn.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsv<cfs> aD = a("polar_bear", bsv.a.a(cfs::new, btn.b).a(dew.qP).a(1.4F, 1.4F).a(10));
   public static final bsv<cnw> aE = a("potion", bsv.a.<cnw>a(cnw::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<cft> aF = a("pufferfish", bsv.a.a(cft::new, btn.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsv<cfu> aG = a("rabbit", bsv.a.a(cfu::new, btn.b).a(0.4F, 0.5F).a(8));
   public static final bsv<ckd> aH = a("ravager", bsv.a.a(ckd::new, btn.a).a(1.95F, 2.2F).a(new evm(0.0, 2.2625, -0.0625)).a(10));
   public static final bsv<cfv> aI = a("salmon", bsv.a.a(cfv::new, btn.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsv<cfw> aJ = a("sheep", bsv.a.a(cfw::new, btn.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsv<cke> aK = a("shulker", bsv.a.a(cke::new, btn.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsv<cnn> aL = a("shulker_bullet", bsv.a.<cnn>a(cnn::new, btn.h).a(0.3125F, 0.3125F).a(8));
   public static final bsv<ckf> aM = a("silverfish", bsv.a.a(ckf::new, btn.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsv<ckg> aN = a("skeleton", bsv.a.a(ckg::new, btn.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsv<chk> aO = a("skeleton_horse", bsv.a.a(chk::new, btn.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsv<ckh> aP = a("slime", bsv.a.a(ckh::new, btn.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsv<cno> aQ = a("small_fireball", bsv.a.<cno>a(cno::new, btn.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsv<chr> aR = a("sniffer", bsv.a.a(chr::new, btn.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsv<cfy> aS = a("snow_golem", bsv.a.a(cfy::new, btn.h).a(dew.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsv<cnp> aT = a("snowball", bsv.a.<cnp>a(cnp::new, btn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsv<coz> aU = a("spawner_minecart", bsv.a.<coz>a(coz::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<cnq> aV = a("spectral_arrow", bsv.a.<cnq>a(cnq::new, btn.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsv<ckj> aW = a("spider", bsv.a.a(ckj::new, btn.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsv<cfz> aX = a("squid", bsv.a.a(cfz::new, btn.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsv<ckk> aY = a("stray", bsv.a.a(ckk::new, btn.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dew.qP).a(8));
   public static final bsv<ckl> aZ = a("strider", bsv.a.a(ckl::new, btn.b).c().a(0.9F, 1.7F).a(10));
   public static final bsv<cgx> ba = a("tadpole", bsv.a.a(cgx::new, btn.b).a(cgx.c, cgx.d).b(cgx.d * 0.65F).a(10));
   public static final bsv<bso.l> bb = a("text_display", bsv.a.a(bso.l::new, btn.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsv<cjd> bc = a("tnt", bsv.a.<cjd>a(cjd::new, btn.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsv<cpa> bd = a("tnt_minecart", bsv.a.<cpa>a(cpa::new, btn.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsv<chm> be = a("trader_llama", bsv.a.a(chm::new, btn.b).a(0.9F, 1.87F).b(1.7765F).a(new evm(0.0, 1.37, -0.3)).a(10));
   public static final bsv<cnx> bf = a("trident", bsv.a.<cnx>a(cnx::new, btn.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsv<cga> bg = a("tropical_fish", bsv.a.a(cga::new, btn.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsv<cgb> bh = a("turtle", bsv.a.a(cgb::new, btn.b).a(1.2F, 0.4F).a(new evm(0.0, 0.55625, -0.25)).a(10));
   public static final bsv<ckm> bi = a("vex", bsv.a.a(ckm::new, btn.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsv<cmf> bj = a("villager", bsv.a.<cmf>a(cmf::new, btn.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsv<ckn> bk = a("vindicator", bsv.a.a(ckn::new, btn.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsv<cml> bl = a("wandering_trader", bsv.a.a(cml::new, btn.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsv<clw> bm = a("warden", bsv.a.a(clw::new, btn.a).a(0.9F, 2.9F).a(3.15F).a(bsq.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsv<coc> bn = a("wind_charge", bsv.a.<coc>a(coc::new, btn.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpi.c));
   public static final bsv<cko> bo = a("witch", bsv.a.a(cko::new, btn.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsv<ciq> bp = a("wither", bsv.a.a(ciq::new, btn.a).c().a(dew.cd).a(0.9F, 3.5F).a(10));
   public static final bsv<ckp> bq = a("wither_skeleton", bsv.a.a(ckp::new, btn.a).c().a(dew.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsv<cny> br = a("wither_skull", bsv.a.<cny>a(cny::new, btn.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsv<cgd> bs = a("wolf", bsv.a.a(cgd::new, btn.b).a(0.6F, 0.85F).b(0.68F).a(new evm(0.0, 0.81875, -0.0625)).a(10));
   public static final bsv<ckq> bt = a("zoglin", bsv.a.a(ckq::new, btn.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsv<ckr> bu = a("zombie", bsv.a.<ckr>a(ckr::new, btn.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsv<cho> bv = a("zombie_horse", bsv.a.a(cho::new, btn.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsv<cks> bw = a("zombie_villager", bsv.a.a(cks::new, btn.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsv<ckt> bx = a("zombified_piglin", bsv.a.a(ckt::new, btn.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsv<cms> by = a("player", bsv.a.<cms>a(btn.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cms.bT).a(32).b(2));
   public static final bsv<cng> bz = a("fishing_bobber", bsv.a.<cng>a(cng::new, btn.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsv.b<T> bF;
   private final btn bG;
   private final ImmutableSet<deu> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private xl bP;
   @Nullable
   private ala<eqi> bQ;
   private final bss bR;
   private final float bS;
   private final cpg bT;

   private static <T extends bsp> bsv<T> a(String $$0, bsv.a<T> $$1) {
      return jv.a(lp.g, $$0, $$1.a($$0));
   }

   public static alb a(bsv<?> $$0) {
      return lp.g.b($$0);
   }

   public static Optional<bsv<?>> a(String $$0) {
      return lp.g.b(alb.a($$0));
   }

   public bsv(bsv.b<T> $$0, btn $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<deu> $$6, bss $$7, float $$8, int $$9, int $$10, cpg $$11) {
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
   public T a(arb $$0, @Nullable cuk $$1, @Nullable cms $$2, iz $$3, bto $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsp> Consumer<T> a(arb $$0, cuk $$1, @Nullable cms $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsp> Consumer<T> a(Consumer<T> $$0, arb $$1, cuk $$2, @Nullable cms $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsp> Consumer<T> a(Consumer<T> $$0, cuk $$1) {
      xl $$2 = $$1.a(km.f);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsp> Consumer<T> b(Consumer<T> $$0, arb $$1, cuk $$2, @Nullable cms $$3) {
      cwz $$4 = $$2.a(km.L, cwz.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arb $$0, iz $$1, bto $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arb $$0, @Nullable Consumer<T> $$1, iz $$2, bto $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arb $$0, @Nullable Consumer<T> $$1, iz $$2, bto $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dbt)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayu.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btm $$9) {
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

   protected static double a(dbw $$0, iz $$1, boolean $$2, evh $$3) {
      evh $$4 = new evh($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewf> $$5 = $$0.d(null, $$4);
      return 1.0 + ewc.a(je.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dbt $$0, @Nullable cms $$1, @Nullable bsp $$2, cwz $$3) {
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

   public btn f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lp.g.b(this));
      }

      return this.bO;
   }

   public xl h() {
      if (this.bP == null) {
         this.bP = xl.c(this.g());
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

   public ala<eqi> k() {
      if (this.bQ == null) {
         alb $$0 = lp.g.b(this);
         this.bQ = ala.a(lq.aU, $$0.d("entities/"));
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
   public cpg i() {
      return this.bT;
   }

   @Nullable
   public T a(dbt $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsp> a(ur $$0, dbt $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evh a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evh($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(drx $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eod.a($$0) ? true : $$0.a(dew.cd) || $$0.a(dew.oi) || $$0.a(dew.dQ) || $$0.a(dew.qP);
      }
   }

   public bss n() {
      return this.bR;
   }

   public static Optional<bsv<?>> a(ur $$0) {
      return lp.g.b(new alb($$0.l("id")));
   }

   @Nullable
   public static bsp a(ur $$0, dbt $$1, Function<bsp, bsp> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ux $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsp $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsp)$$3;
      }).orElse(null);
   }

   public static Stream<bsp> a(final List<? extends vo> $$0, final dbt $$1) {
      final Spliterator<? extends vo> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsp>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsp> $$0x) {
            return $$2.tryAdvance($$2xx -> bsv.a((ur)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsp> trySplit() {
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

   private static Optional<bsp> b(ur $$0, dbt $$1) {
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

   public boolean a(axb<bsv<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jm<bsv<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsp $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsp> a() {
      return bsp.class;
   }

   @Deprecated
   public ji.c<bsv<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsp> {
      private final bsv.b<T> a;
      private final btn b;
      private ImmutableSet<deu> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bss j = bss.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsr.a l = bsr.a();
      private cpg m = cpi.g;

      private a(bsv.b<T> $$0, btn $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btn.b || $$1 == btn.h;
      }

      public static <T extends bsp> bsv.a<T> a(bsv.b<T> $$0, btn $$1) {
         return new bsv.a<>($$0, $$1);
      }

      public static <T extends bsp> bsv.a<T> a(btn $$0) {
         return new bsv.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsv.a<T> a(float $$0, float $$1) {
         this.j = bss.b($$0, $$1);
         return this;
      }

      public bsv.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsv.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsv.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsq.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsv.a<T> a(evm... $$0) {
         for (evm $$1 : $$0) {
            this.l = this.l.a(bsq.a, $$1);
         }

         return this;
      }

      public bsv.a<T> a(evm $$0) {
         return this.a(bsq.b, $$0);
      }

      public bsv.a<T> c(float $$0) {
         return this.a(bsq.b, 0.0F, -$$0, 0.0F);
      }

      public bsv.a<T> d(float $$0) {
         return this.a(bsq.c, 0.0F, $$0, 0.0F);
      }

      public bsv.a<T> a(bsq $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsv.a<T> a(bsq $$0, evm $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsv.a<T> a() {
         this.e = false;
         return this;
      }

      public bsv.a<T> b() {
         this.d = false;
         return this;
      }

      public bsv.a<T> c() {
         this.f = true;
         return this;
      }

      public bsv.a<T> a(deu... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsv.a<T> d() {
         this.g = true;
         return this;
      }

      public bsv.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsv.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsv.a<T> a(cpe... $$0) {
         this.m = cpi.e.a($$0);
         return this;
      }

      public bsv<T> a(String $$0) {
         if (this.d) {
            ac.a(bgs.A, $$0);
         }

         return new bsv<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsp> {
      T create(bsv<T> var1, dbt var2);
   }
}
