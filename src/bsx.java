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

public class bsx<T extends bsr> implements cpi, dxn<bsr, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jm.c<bsx<?>> bC = lt.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsx<cgk> a = a("allay", bsx.a.a(cgk::new, btq.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsx<bsn> b = a("area_effect_cloud", bsx.a.<bsn>a(bsn::new, btq.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsx<cgn> c = a("armadillo", bsx.a.a(cgn::new, btq.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsx<ciw> d = a("armor_stand", bsx.a.<ciw>a(ciw::new, btq.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsx<cnf> e = a("arrow", bsx.a.<cnf>a(cnf::new, btq.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsx<cgq> f = a("axolotl", bsx.a.a(cgq::new, btq.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsx<cez> g = a("bat", bsx.a.a(cez::new, btq.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsx<cff> h = a("bee", bsx.a.a(cff::new, btq.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsx<cjm> i = a("blaze", bsx.a.a(cjm::new, btq.a).c().a(0.6F, 1.8F).a(8));
   public static final bsx<bsq.b> j = a("block_display", bsx.a.a(bsq.b::new, btq.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsx<cov> k = a("boat", bsx.a.<cov>a(cov::new, btq.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsx<cjn> l = a("bogged", bsx.a.a(cjn::new, btq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsx<ckz> m = a("breeze", bsx.a.a(ckz::new, btq.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bsx<cog> n = a("breeze_wind_charge", bsx.a.<cog>a(cog::new, btq.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsx<cgv> o = a("camel", bsx.a.a(cgv::new, btq.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsx<cfh> p = a("cat", bsx.a.a(cfh::new, btq.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsx<cjo> q = a("cave_spider", bsx.a.a(cjo::new, btq.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsx<cow> r = a("chest_boat", bsx.a.<cow>a(cow::new, btq.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsx<cpa> s = a("chest_minecart", bsx.a.<cpa>a(cpa::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<cfj> t = a("chicken", bsx.a.a(cfj::new, btq.b).a(0.4F, 0.7F).b(0.644F).a(new exa(0.0, 0.7, -0.1)).a(10));
   public static final bsx<cfk> u = a("cod", bsx.a.a(cfk::new, btq.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsx<cpb> v = a("command_block_minecart", bsx.a.<cpb>a(cpb::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<cfl> w = a("cow", bsx.a.a(cfl::new, btq.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsx<cjp> x = a("creeper", bsx.a.a(cjp::new, btq.a).a(0.6F, 1.7F).a(8));
   public static final bsx<cfm> y = a("dolphin", bsx.a.a(cfm::new, btq.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsx<chj> z = a("donkey", bsx.a.a(chj::new, btq.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsx<cng> A = a("dragon_fireball", bsx.a.<cng>a(cng::new, btq.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsx<cjr> B = a("drowned", bsx.a.a(cjr::new, btq.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsx<cny> C = a("egg", bsx.a.<cny>a(cny::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<cjs> D = a("elder_guardian", bsx.a.a(cjs::new, btq.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsx<chz> E = a("end_crystal", bsx.a.<chz>a(chz::new, btq.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsx<cia> F = a("ender_dragon", bsx.a.a(cia::new, btq.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsx<cnz> G = a("ender_pearl", bsx.a.<cnz>a(cnz::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<cjt> H = a("enderman", bsx.a.a(cjt::new, btq.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsx<cju> I = a("endermite", bsx.a.a(cju::new, btq.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsx<cjw> J = a("evoker", bsx.a.a(cjw::new, btq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsx<cnh> K = a("evoker_fangs", bsx.a.<cnh>a(cnh::new, btq.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsx<coa> L = a("experience_bottle", bsx.a.<coa>a(coa::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<btc> M = a("experience_orb", bsx.a.<btc>a(btc::new, btq.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsx<cni> N = a("eye_of_ender", bsx.a.<cni>a(cni::new, btq.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsx<cjg> O = a("falling_block", bsx.a.<cjg>a(cjg::new, btq.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsx<cnk> P = a("firework_rocket", bsx.a.<cnk>a(cnk::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<cfo> Q = a("fox", bsx.a.a(cfo::new, btq.b).a(0.6F, 0.7F).b(0.4F).a(new exa(0.0, 0.6375, -0.25)).a(8).a(dga.oi));
   public static final bsx<cgy> R = a("frog", bsx.a.a(cgy::new, btq.b).a(0.5F, 0.5F).a(new exa(0.0, 0.375, -0.25)).a(10));
   public static final bsx<cpc> S = a("furnace_minecart", bsx.a.<cpc>a(cpc::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<cjx> T = a("ghast", bsx.a.a(cjx::new, btq.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsx<cjy> U = a("giant", bsx.a.a(cjy::new, btq.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsx<ciy> V = a("glow_item_frame", bsx.a.<ciy>a(ciy::new, btq.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsx<bte> W = a("glow_squid", bsx.a.a(bte::new, btq.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsx<che> X = a("goat", bsx.a.a(che::new, btq.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsx<cjz> Y = a("guardian", bsx.a.a(cjz::new, btq.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsx<clh> Z = a("hoglin", bsx.a.a(clh::new, btq.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsx<cpd> aa = a("hopper_minecart", bsx.a.<cpd>a(cpd::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<chk> ab = a("horse", bsx.a.a(chk::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsx<cka> ac = a("husk", bsx.a.a(cka::new, btq.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsx<ckb> ad = a("illusioner", bsx.a.a(ckb::new, btq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsx<bth> ae = a("interaction", bsx.a.a(bth::new, btq.h).a(0.0F, 0.0F).a(10));
   public static final bsx<cfq> af = a("iron_golem", bsx.a.a(cfq::new, btq.h).a(1.4F, 2.7F).a(10));
   public static final bsx<cjh> ag = a("item", bsx.a.<cjh>a(cjh::new, btq.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsx<bsq.g> ah = a("item_display", bsx.a.a(bsq.g::new, btq.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsx<cja> ai = a("item_frame", bsx.a.<cja>a(cja::new, btq.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsx<btu> aj = a("ominous_item_spawner", bsx.a.a(btu::new, btq.h).a(0.25F, 0.25F).a(8));
   public static final bsx<cnn> ak = a("fireball", bsx.a.<cnn>a(cnn::new, btq.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsx<cjb> al = a("leash_knot", bsx.a.<cjb>a(cjb::new, btq.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsx<btm> am = a("lightning_bolt", bsx.a.a(btm::new, btq.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsx<chl> an = a("llama", bsx.a.a(chl::new, btq.b).a(0.9F, 1.87F).b(1.7765F).a(new exa(0.0, 1.37, -0.3)).a(10));
   public static final bsx<cno> ao = a("llama_spit", bsx.a.<cno>a(cno::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<ckc> ap = a("magma_cube", bsx.a.a(ckc::new, btq.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsx<bto> aq = a("marker", bsx.a.a(bto::new, btq.h).a(0.0F, 0.0F).a(0));
   public static final bsx<coz> ar = a("minecart", bsx.a.<coz>a(coz::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<cfr> as = a("mooshroom", bsx.a.a(cfr::new, btq.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsx<chn> at = a("mule", bsx.a.a(chn::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsx<cfs> au = a("ocelot", bsx.a.a(cfs::new, btq.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsx<cjc> av = a("painting", bsx.a.<cjc>a(cjc::new, btq.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsx<cft> aw = a("panda", bsx.a.a(cft::new, btq.b).a(1.3F, 1.25F).a(10));
   public static final bsx<cfu> ax = a("parrot", bsx.a.a(cfu::new, btq.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsx<ckf> ay = a("phantom", bsx.a.a(ckf::new, btq.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsx<cfv> az = a("pig", bsx.a.a(cfv::new, btq.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsx<cln> aA = a("piglin", bsx.a.a(cln::new, btq.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsx<clq> aB = a("piglin_brute", bsx.a.a(clq::new, btq.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsx<ckg> aC = a("pillager", bsx.a.a(ckg::new, btq.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsx<cfw> aD = a("polar_bear", bsx.a.a(cfw::new, btq.b).a(dga.qP).a(1.4F, 1.4F).a(10));
   public static final bsx<cob> aE = a("potion", bsx.a.<cob>a(cob::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<cfx> aF = a("pufferfish", bsx.a.a(cfx::new, btq.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsx<cfy> aG = a("rabbit", bsx.a.a(cfy::new, btq.b).a(0.4F, 0.5F).a(8));
   public static final bsx<cki> aH = a("ravager", bsx.a.a(cki::new, btq.a).a(1.95F, 2.2F).a(new exa(0.0, 2.2625, -0.0625)).a(10));
   public static final bsx<cfz> aI = a("salmon", bsx.a.a(cfz::new, btq.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsx<cga> aJ = a("sheep", bsx.a.a(cga::new, btq.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsx<ckj> aK = a("shulker", bsx.a.a(ckj::new, btq.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsx<cns> aL = a("shulker_bullet", bsx.a.<cns>a(cns::new, btq.h).a(0.3125F, 0.3125F).a(8));
   public static final bsx<ckk> aM = a("silverfish", bsx.a.a(ckk::new, btq.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsx<ckl> aN = a("skeleton", bsx.a.a(ckl::new, btq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsx<cho> aO = a("skeleton_horse", bsx.a.a(cho::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsx<ckm> aP = a("slime", bsx.a.a(ckm::new, btq.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsx<cnt> aQ = a("small_fireball", bsx.a.<cnt>a(cnt::new, btq.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsx<chv> aR = a("sniffer", bsx.a.a(chv::new, btq.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsx<cgc> aS = a("snow_golem", bsx.a.a(cgc::new, btq.h).a(dga.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsx<cnu> aT = a("snowball", bsx.a.<cnu>a(cnu::new, btq.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsx<cpe> aU = a("spawner_minecart", bsx.a.<cpe>a(cpe::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<cnv> aV = a("spectral_arrow", bsx.a.<cnv>a(cnv::new, btq.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsx<cko> aW = a("spider", bsx.a.a(cko::new, btq.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsx<cgd> aX = a("squid", bsx.a.a(cgd::new, btq.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsx<ckp> aY = a("stray", bsx.a.a(ckp::new, btq.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dga.qP).a(8));
   public static final bsx<ckq> aZ = a("strider", bsx.a.a(ckq::new, btq.b).c().a(0.9F, 1.7F).a(10));
   public static final bsx<chb> ba = a("tadpole", bsx.a.a(chb::new, btq.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bsx<bsq.l> bb = a("text_display", bsx.a.a(bsq.l::new, btq.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsx<cji> bc = a("tnt", bsx.a.<cji>a(cji::new, btq.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsx<cpf> bd = a("tnt_minecart", bsx.a.<cpf>a(cpf::new, btq.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsx<chq> be = a("trader_llama", bsx.a.a(chq::new, btq.b).a(0.9F, 1.87F).b(1.7765F).a(new exa(0.0, 1.37, -0.3)).a(10));
   public static final bsx<coc> bf = a("trident", bsx.a.<coc>a(coc::new, btq.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsx<cge> bg = a("tropical_fish", bsx.a.a(cge::new, btq.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsx<cgf> bh = a("turtle", bsx.a.a(cgf::new, btq.b).a(1.2F, 0.4F).a(new exa(0.0, 0.55625, -0.25)).a(10));
   public static final bsx<ckr> bi = a("vex", bsx.a.a(ckr::new, btq.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsx<cmk> bj = a("villager", bsx.a.<cmk>a(cmk::new, btq.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsx<cks> bk = a("vindicator", bsx.a.a(cks::new, btq.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsx<cmq> bl = a("wandering_trader", bsx.a.a(cmq::new, btq.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsx<cmb> bm = a("warden", bsx.a.a(cmb::new, btq.a).a(0.9F, 2.9F).a(3.15F).a(bss.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsx<coh> bn = a("wind_charge", bsx.a.<coh>a(coh::new, btq.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsx<ckt> bo = a("witch", bsx.a.a(ckt::new, btq.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsx<ciu> bp = a("wither", bsx.a.a(ciu::new, btq.a).c().a(dga.cd).a(0.9F, 3.5F).a(10));
   public static final bsx<cku> bq = a("wither_skeleton", bsx.a.a(cku::new, btq.a).c().a(dga.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsx<cod> br = a("wither_skull", bsx.a.<cod>a(cod::new, btq.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsx<cgh> bs = a("wolf", bsx.a.a(cgh::new, btq.b).a(0.6F, 0.85F).b(0.68F).a(new exa(0.0, 0.81875, -0.0625)).a(10));
   public static final bsx<ckv> bt = a("zoglin", bsx.a.a(ckv::new, btq.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsx<ckw> bu = a("zombie", bsx.a.<ckw>a(ckw::new, btq.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsx<chs> bv = a("zombie_horse", bsx.a.a(chs::new, btq.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsx<ckx> bw = a("zombie_villager", bsx.a.a(ckx::new, btq.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsx<cky> bx = a("zombified_piglin", bsx.a.a(cky::new, btq.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsx<cmx> by = a("player", bsx.a.<cmx>a(btq.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmx.bV).a(32).b(2));
   public static final bsx<cnl> bz = a("fishing_bobber", bsx.a.<cnl>a(cnl::new, btq.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsx.b<T> bF;
   private final btq bG;
   private final ImmutableSet<dfy> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private wz bP;
   @Nullable
   private akq<eru> bQ;
   private final bsu bR;
   private final float bS;
   private final cpl bT;

   private static <T extends bsr> bsx<T> a(String $$0, bsx.a<T> $$1) {
      return jz.a(lt.f, $$0, $$1.a($$0));
   }

   public static akr a(bsx<?> $$0) {
      return lt.f.b($$0);
   }

   public static Optional<bsx<?>> a(String $$0) {
      return lt.f.b(akr.c($$0));
   }

   public bsx(bsx.b<T> $$0, btq $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfy> $$6, bsu $$7, float $$8, int $$9, int $$10, cpl $$11) {
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
   public T a(aqu $$0, @Nullable cuq $$1, @Nullable cmx $$2, jd $$3, btr $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsr> Consumer<T> a(aqu $$0, cuq $$1, @Nullable cmx $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsr> Consumer<T> a(Consumer<T> $$0, aqu $$1, cuq $$2, @Nullable cmx $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsr> Consumer<T> a(Consumer<T> $$0, cuq $$1) {
      wz $$2 = $$1.a(kq.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsr> Consumer<T> b(Consumer<T> $$0, aqu $$1, cuq $$2, @Nullable cmx $$3) {
      cxh $$4 = $$2.a(kq.M, cxh.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqu $$0, jd $$1, btr $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqu $$0, @Nullable Consumer<T> $$1, jd $$2, btr $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqu $$0, @Nullable Consumer<T> $$1, jd $$2, btr $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dcw)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cL());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayo.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btp $$9) {
            $$9.ba = $$9.dF();
            $$9.aY = $$9.dF();
            $$9.a($$0, $$0.d_($$9.dp()), $$3, null);
            $$9.S();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dcz $$0, jd $$1, boolean $$2, ewv $$3) {
      ewv $$4 = new ewv($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ext> $$5 = $$0.d(null, $$4);
      return 1.0 + exq.a(ji.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dcw $$0, @Nullable cmx $$1, @Nullable bsr $$2, cxh $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cQ() || $$1 != null && $$4.ah().f($$1.fY())) {
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

   public btq f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ad.a("entity", lt.f.b(this));
      }

      return this.bO;
   }

   public wz h() {
      if (this.bP == null) {
         this.bP = wz.c(this.g());
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

   public akq<eru> k() {
      if (this.bQ == null) {
         akr $$0 = lt.f.b(this);
         this.bQ = akq.a(lu.bc, $$0.f("entities/"));
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
   public T a(dcw $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsr> a(ub $$0, dcw $$1) {
      return ad.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ewv a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ewv($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dtc $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && epp.a($$0) ? true : $$0.a(dga.cd) || $$0.a(dga.oi) || $$0.a(dga.dQ) || $$0.a(dga.qP);
      }
   }

   public bsu n() {
      return this.bR;
   }

   public static Optional<bsx<?>> a(ub $$0) {
      return lt.f.b(akr.a($$0.l("id")));
   }

   @Nullable
   public static bsr a(ub $$0, dcw $$1, Function<bsr, bsr> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uh $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsr $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsr)$$3;
      }).orElse(null);
   }

   public static Stream<bsr> a(final List<? extends uy> $$0, final dcw $$1) {
      final Spliterator<? extends uy> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsr>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsr> $$0x) {
            return $$2.tryAdvance($$2xx -> bsx.a((ub)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsr> trySplit() {
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

   private static Optional<bsr> b(ub $$0, dcw $$1) {
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

   public boolean a(awu<bsx<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jq<bsx<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsr $$0) {
      return (T)($$0.am() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsr> a() {
      return bsr.class;
   }

   @Deprecated
   public jm.c<bsx<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsr> {
      private final bsx.b<T> a;
      private final btq b;
      private ImmutableSet<dfy> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsu j = bsu.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bst.a l = bst.a();
      private cpl m = cpn.f;

      private a(bsx.b<T> $$0, btq $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btq.b || $$1 == btq.h;
      }

      public static <T extends bsr> bsx.a<T> a(bsx.b<T> $$0, btq $$1) {
         return new bsx.a<>($$0, $$1);
      }

      public static <T extends bsr> bsx.a<T> a(btq $$0) {
         return new bsx.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsx.a<T> a(float $$0, float $$1) {
         this.j = bsu.b($$0, $$1);
         return this;
      }

      public bsx.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsx.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsx.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bss.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsx.a<T> a(exa... $$0) {
         for (exa $$1 : $$0) {
            this.l = this.l.a(bss.a, $$1);
         }

         return this;
      }

      public bsx.a<T> a(exa $$0) {
         return this.a(bss.b, $$0);
      }

      public bsx.a<T> c(float $$0) {
         return this.a(bss.b, 0.0F, -$$0, 0.0F);
      }

      public bsx.a<T> d(float $$0) {
         return this.a(bss.c, 0.0F, $$0, 0.0F);
      }

      public bsx.a<T> a(bss $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsx.a<T> a(bss $$0, exa $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsx.a<T> a() {
         this.e = false;
         return this;
      }

      public bsx.a<T> b() {
         this.d = false;
         return this;
      }

      public bsx.a<T> c() {
         this.f = true;
         return this;
      }

      public bsx.a<T> a(dfy... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsx.a<T> d() {
         this.g = true;
         return this;
      }

      public bsx.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsx.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsx.a<T> a(cpj... $$0) {
         this.m = cpn.d.a($$0);
         return this;
      }

      public bsx<T> a(String $$0) {
         if (this.d) {
            ad.a(bgr.A, $$0);
         }

         return new bsx<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsr> {
      T create(bsx<T> var1, dcw var2);
   }
}
