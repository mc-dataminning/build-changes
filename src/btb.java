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

public class btb<T extends bsv> implements cpj, dwk<bsv, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ji.c<btb<?>> bC = lp.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final btb<cgm> a = a("allay", btb.a.a(cgm::new, btt.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final btb<bsr> b = a("area_effect_cloud", btb.a.<bsr>a(bsr::new, btt.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btb<cgp> c = a("armadillo", btb.a.a(cgp::new, btt.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final btb<ciy> d = a("armor_stand", btb.a.<ciy>a(ciy::new, btt.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final btb<cng> e = a("arrow", btb.a.<cng>a(cng::new, btt.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btb<cgs> f = a("axolotl", btb.a.a(cgs::new, btt.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final btb<cfb> g = a("bat", btb.a.a(cfb::new, btt.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final btb<cfh> h = a("bee", btb.a.a(cfh::new, btt.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final btb<cjn> i = a("blaze", btb.a.a(cjn::new, btt.a).c().a(0.6F, 1.8F).a(8));
   public static final btb<bsu.b> j = a("block_display", btb.a.a(bsu.b::new, btt.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btb<cow> k = a("boat", btb.a.<cow>a(cow::new, btt.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btb<cjo> l = a("bogged", btb.a.a(cjo::new, btt.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(cpo.c));
   public static final btb<cla> m = a("breeze", btb.a.a(cla::new, btt.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(cpo.c));
   public static final btb<coh> n = a("breeze_wind_charge", btb.a.<coh>a(coh::new, btt.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpo.c));
   public static final btb<cgx> o = a("camel", btb.a.a(cgx::new, btt.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final btb<cfj> p = a("cat", btb.a.a(cfj::new, btt.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final btb<cjp> q = a("cave_spider", btb.a.a(cjp::new, btt.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final btb<cox> r = a("chest_boat", btb.a.<cox>a(cox::new, btt.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btb<cpb> s = a("chest_minecart", btb.a.<cpb>a(cpb::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<cfl> t = a("chicken", btb.a.a(cfl::new, btt.b).a(0.4F, 0.7F).b(0.644F).a(new evs(0.0, 0.7, -0.1)).a(10));
   public static final btb<cfm> u = a("cod", btb.a.a(cfm::new, btt.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final btb<cpc> v = a("command_block_minecart", btb.a.<cpc>a(cpc::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<cfn> w = a("cow", btb.a.a(cfn::new, btt.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btb<cjq> x = a("creeper", btb.a.a(cjq::new, btt.a).a(0.6F, 1.7F).a(8));
   public static final btb<cfo> y = a("dolphin", btb.a.a(cfo::new, btt.f).a(0.9F, 0.6F).b(0.3F));
   public static final btb<chl> z = a("donkey", btb.a.a(chl::new, btt.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final btb<cnh> A = a("dragon_fireball", btb.a.<cnh>a(cnh::new, btt.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btb<cjs> B = a("drowned", btb.a.a(cjs::new, btt.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btb<cnz> C = a("egg", btb.a.<cnz>a(cnz::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<cjt> D = a("elder_guardian", btb.a.a(cjt::new, btt.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final btb<cib> E = a("end_crystal", btb.a.<cib>a(cib::new, btt.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final btb<cic> F = a("ender_dragon", btb.a.a(cic::new, btt.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final btb<coa> G = a("ender_pearl", btb.a.<coa>a(coa::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<cju> H = a("enderman", btb.a.a(cju::new, btt.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final btb<cjv> I = a("endermite", btb.a.a(cjv::new, btt.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btb<cjx> J = a("evoker", btb.a.a(cjx::new, btt.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btb<cni> K = a("evoker_fangs", btb.a.<cni>a(cni::new, btt.h).a(0.5F, 0.8F).a(6).b(2));
   public static final btb<cob> L = a("experience_bottle", btb.a.<cob>a(cob::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<btg> M = a("experience_orb", btb.a.<btg>a(btg::new, btt.h).a(0.5F, 0.5F).a(6).b(20));
   public static final btb<cnj> N = a("eye_of_ender", btb.a.<cnj>a(cnj::new, btt.h).a(0.25F, 0.25F).a(4).b(4));
   public static final btb<cjh> O = a("falling_block", btb.a.<cjh>a(cjh::new, btt.h).a(0.98F, 0.98F).a(10).b(20));
   public static final btb<cnl> P = a("firework_rocket", btb.a.<cnl>a(cnl::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<cfq> Q = a("fox", btb.a.a(cfq::new, btt.b).a(0.6F, 0.7F).b(0.4F).a(new evs(0.0, 0.6375, -0.25)).a(8).a(dfc.oi));
   public static final btb<cha> R = a("frog", btb.a.a(cha::new, btt.b).a(0.5F, 0.5F).a(new evs(0.0, 0.375, -0.25)).a(10));
   public static final btb<cpd> S = a("furnace_minecart", btb.a.<cpd>a(cpd::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<cjy> T = a("ghast", btb.a.a(cjy::new, btt.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final btb<cjz> U = a("giant", btb.a.a(cjz::new, btt.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final btb<ciz> V = a("glow_item_frame", btb.a.<ciz>a(ciz::new, btt.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btb<bti> W = a("glow_squid", btb.a.a(bti::new, btt.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final btb<chg> X = a("goat", btb.a.a(chg::new, btt.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final btb<cka> Y = a("guardian", btb.a.a(cka::new, btt.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final btb<cli> Z = a("hoglin", btb.a.a(cli::new, btt.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btb<cpe> aa = a("hopper_minecart", btb.a.<cpe>a(cpe::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<chm> ab = a("horse", btb.a.a(chm::new, btt.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final btb<ckb> ac = a("husk", btb.a.a(ckb::new, btt.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final btb<ckc> ad = a("illusioner", btb.a.a(ckc::new, btt.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btb<btl> ae = a("interaction", btb.a.a(btl::new, btt.h).a(0.0F, 0.0F).a(10));
   public static final btb<cfs> af = a("iron_golem", btb.a.a(cfs::new, btt.h).a(1.4F, 2.7F).a(10));
   public static final btb<cji> ag = a("item", btb.a.<cji>a(cji::new, btt.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final btb<bsu.g> ah = a("item_display", btb.a.a(bsu.g::new, btt.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btb<cjb> ai = a("item_frame", btb.a.<cjb>a(cjb::new, btt.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btb<btx> aj = a("ominous_item_spawner", btb.a.a(btx::new, btt.h).a(0.25F, 0.25F).a(8).a(cpo.c));
   public static final btb<cno> ak = a("fireball", btb.a.<cno>a(cno::new, btt.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btb<cjc> al = a("leash_knot", btb.a.<cjc>a(cjc::new, btt.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final btb<btp> am = a("lightning_bolt", btb.a.a(btp::new, btt.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final btb<chn> an = a("llama", btb.a.a(chn::new, btt.b).a(0.9F, 1.87F).b(1.7765F).a(new evs(0.0, 1.37, -0.3)).a(10));
   public static final btb<cnp> ao = a("llama_spit", btb.a.<cnp>a(cnp::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<ckd> ap = a("magma_cube", btb.a.a(ckd::new, btt.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final btb<btr> aq = a("marker", btb.a.a(btr::new, btt.h).a(0.0F, 0.0F).a(0));
   public static final btb<cpa> ar = a("minecart", btb.a.<cpa>a(cpa::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<cft> as = a("mooshroom", btb.a.a(cft::new, btt.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btb<chp> at = a("mule", btb.a.a(chp::new, btt.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final btb<cfu> au = a("ocelot", btb.a.a(cfu::new, btt.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final btb<cjd> av = a("painting", btb.a.<cjd>a(cjd::new, btt.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btb<cfv> aw = a("panda", btb.a.a(cfv::new, btt.b).a(1.3F, 1.25F).a(10));
   public static final btb<cfw> ax = a("parrot", btb.a.a(cfw::new, btt.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final btb<ckg> ay = a("phantom", btb.a.a(ckg::new, btt.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final btb<cfx> az = a("pig", btb.a.a(cfx::new, btt.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final btb<clo> aA = a("piglin", btb.a.a(clo::new, btt.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btb<clr> aB = a("piglin_brute", btb.a.a(clr::new, btt.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btb<ckh> aC = a("pillager", btb.a.a(ckh::new, btt.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btb<cfy> aD = a("polar_bear", btb.a.a(cfy::new, btt.b).a(dfc.qP).a(1.4F, 1.4F).a(10));
   public static final btb<coc> aE = a("potion", btb.a.<coc>a(coc::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<cfz> aF = a("pufferfish", btb.a.a(cfz::new, btt.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final btb<cga> aG = a("rabbit", btb.a.a(cga::new, btt.b).a(0.4F, 0.5F).a(8));
   public static final btb<ckj> aH = a("ravager", btb.a.a(ckj::new, btt.a).a(1.95F, 2.2F).a(new evs(0.0, 2.2625, -0.0625)).a(10));
   public static final btb<cgb> aI = a("salmon", btb.a.a(cgb::new, btt.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final btb<cgc> aJ = a("sheep", btb.a.a(cgc::new, btt.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final btb<ckk> aK = a("shulker", btb.a.a(ckk::new, btt.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final btb<cnt> aL = a("shulker_bullet", btb.a.<cnt>a(cnt::new, btt.h).a(0.3125F, 0.3125F).a(8));
   public static final btb<ckl> aM = a("silverfish", btb.a.a(ckl::new, btt.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btb<ckm> aN = a("skeleton", btb.a.a(ckm::new, btt.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final btb<chq> aO = a("skeleton_horse", btb.a.a(chq::new, btt.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btb<ckn> aP = a("slime", btb.a.a(ckn::new, btt.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final btb<cnu> aQ = a("small_fireball", btb.a.<cnu>a(cnu::new, btt.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btb<chx> aR = a("sniffer", btb.a.a(chx::new, btt.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final btb<cge> aS = a("snow_golem", btb.a.a(cge::new, btt.h).a(dfc.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final btb<cnv> aT = a("snowball", btb.a.<cnv>a(cnv::new, btt.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btb<cpf> aU = a("spawner_minecart", btb.a.<cpf>a(cpf::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<cnw> aV = a("spectral_arrow", btb.a.<cnw>a(cnw::new, btt.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btb<ckp> aW = a("spider", btb.a.a(ckp::new, btt.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final btb<cgf> aX = a("squid", btb.a.a(cgf::new, btt.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final btb<ckq> aY = a("stray", btb.a.a(ckq::new, btt.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfc.qP).a(8));
   public static final btb<ckr> aZ = a("strider", btb.a.a(ckr::new, btt.b).c().a(0.9F, 1.7F).a(10));
   public static final btb<chd> ba = a("tadpole", btb.a.a(chd::new, btt.b).a(chd.c, chd.d).b(chd.d * 0.65F).a(10));
   public static final btb<bsu.l> bb = a("text_display", btb.a.a(bsu.l::new, btt.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btb<cjj> bc = a("tnt", btb.a.<cjj>a(cjj::new, btt.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final btb<cpg> bd = a("tnt_minecart", btb.a.<cpg>a(cpg::new, btt.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btb<chs> be = a("trader_llama", btb.a.a(chs::new, btt.b).a(0.9F, 1.87F).b(1.7765F).a(new evs(0.0, 1.37, -0.3)).a(10));
   public static final btb<cod> bf = a("trident", btb.a.<cod>a(cod::new, btt.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btb<cgg> bg = a("tropical_fish", btb.a.a(cgg::new, btt.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final btb<cgh> bh = a("turtle", btb.a.a(cgh::new, btt.b).a(1.2F, 0.4F).a(new evs(0.0, 0.55625, -0.25)).a(10));
   public static final btb<cks> bi = a("vex", btb.a.a(cks::new, btt.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final btb<cml> bj = a("villager", btb.a.<cml>a(cml::new, btt.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btb<ckt> bk = a("vindicator", btb.a.a(ckt::new, btt.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btb<cmr> bl = a("wandering_trader", btb.a.a(cmr::new, btt.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btb<cmc> bm = a("warden", btb.a.a(cmc::new, btt.a).a(0.9F, 2.9F).a(3.15F).a(bsw.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final btb<coi> bn = a("wind_charge", btb.a.<coi>a(coi::new, btt.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpo.c));
   public static final btb<cku> bo = a("witch", btb.a.a(cku::new, btt.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final btb<ciw> bp = a("wither", btb.a.a(ciw::new, btt.a).c().a(dfc.cd).a(0.9F, 3.5F).a(10));
   public static final btb<ckv> bq = a("wither_skeleton", btb.a.a(ckv::new, btt.a).c().a(dfc.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final btb<coe> br = a("wither_skull", btb.a.<coe>a(coe::new, btt.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btb<cgj> bs = a("wolf", btb.a.a(cgj::new, btt.b).a(0.6F, 0.85F).b(0.68F).a(new evs(0.0, 0.81875, -0.0625)).a(10));
   public static final btb<ckw> bt = a("zoglin", btb.a.a(ckw::new, btt.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btb<ckx> bu = a("zombie", btb.a.<ckx>a(ckx::new, btt.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btb<chu> bv = a("zombie_horse", btb.a.a(chu::new, btt.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btb<cky> bw = a("zombie_villager", btb.a.a(cky::new, btt.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final btb<ckz> bx = a("zombified_piglin", btb.a.a(ckz::new, btt.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final btb<cmy> by = a("player", btb.a.<cmy>a(btt.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmy.bT).a(32).b(2));
   public static final btb<cnm> bz = a("fishing_bobber", btb.a.<cnm>a(cnm::new, btt.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final btb.b<T> bF;
   private final btt bG;
   private final ImmutableSet<dfa> bH;
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
   private ale<eqo> bQ;
   private final bsy bR;
   private final float bS;
   private final cpm bT;

   private static <T extends bsv> btb<T> a(String $$0, btb.a<T> $$1) {
      return jv.a(lp.g, $$0, $$1.a($$0));
   }

   public static alf a(btb<?> $$0) {
      return lp.g.b($$0);
   }

   public static Optional<btb<?>> a(String $$0) {
      return lp.g.b(alf.a($$0));
   }

   public btb(btb.b<T> $$0, btt $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfa> $$6, bsy $$7, float $$8, int $$9, int $$10, cpm $$11) {
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
   public T a(arf $$0, @Nullable cuq $$1, @Nullable cmy $$2, iz $$3, btu $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsv> Consumer<T> a(arf $$0, cuq $$1, @Nullable cmy $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsv> Consumer<T> a(Consumer<T> $$0, arf $$1, cuq $$2, @Nullable cmy $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsv> Consumer<T> a(Consumer<T> $$0, cuq $$1) {
      xp $$2 = $$1.a(km.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsv> Consumer<T> b(Consumer<T> $$0, arf $$1, cuq $$2, @Nullable cmy $$3) {
      cxf $$4 = $$2.a(km.M, cxf.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arf $$0, iz $$1, btu $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arf $$0, @Nullable Consumer<T> $$1, iz $$2, btu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arf $$0, @Nullable Consumer<T> $$1, iz $$2, btu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dbz)$$0);
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
         if ($$6 instanceof bts $$9) {
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

   protected static double a(dcc $$0, iz $$1, boolean $$2, evn $$3) {
      evn $$4 = new evn($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewl> $$5 = $$0.d(null, $$4);
      return 1.0 + ewi.a(je.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dbz $$0, @Nullable cmy $$1, @Nullable bsv $$2, cxf $$3) {
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

   public btt f() {
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

   public ale<eqo> k() {
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
   public cpm i() {
      return this.bT;
   }

   @Nullable
   public T a(dbz $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsv> a(us $$0, dbz $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evn a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evn($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsd $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eoj.a($$0) ? true : $$0.a(dfc.cd) || $$0.a(dfc.oi) || $$0.a(dfc.dQ) || $$0.a(dfc.qP);
      }
   }

   public bsy n() {
      return this.bR;
   }

   public static Optional<btb<?>> a(us $$0) {
      return lp.g.b(new alf($$0.l("id")));
   }

   @Nullable
   public static bsv a(us $$0, dbz $$1, Function<bsv, bsv> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uy $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsv $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsv)$$3;
      }).orElse(null);
   }

   public static Stream<bsv> a(final List<? extends vp> $$0, final dbz $$1) {
      final Spliterator<? extends vp> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsv>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsv> $$0x) {
            return $$2.tryAdvance($$2xx -> btb.a((us)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsv> trySplit() {
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

   private static Optional<bsv> b(us $$0, dbz $$1) {
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

   public boolean a(axf<btb<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jm<btb<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsv $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsv> a() {
      return bsv.class;
   }

   @Deprecated
   public ji.c<btb<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsv> {
      private final btb.b<T> a;
      private final btt b;
      private ImmutableSet<dfa> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsy j = bsy.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsx.a l = bsx.a();
      private cpm m = cpo.g;

      private a(btb.b<T> $$0, btt $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btt.b || $$1 == btt.h;
      }

      public static <T extends bsv> btb.a<T> a(btb.b<T> $$0, btt $$1) {
         return new btb.a<>($$0, $$1);
      }

      public static <T extends bsv> btb.a<T> a(btt $$0) {
         return new btb.a<>(($$0x, $$1) -> null, $$0);
      }

      public btb.a<T> a(float $$0, float $$1) {
         this.j = bsy.b($$0, $$1);
         return this;
      }

      public btb.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public btb.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public btb.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsw.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public btb.a<T> a(evs... $$0) {
         for (evs $$1 : $$0) {
            this.l = this.l.a(bsw.a, $$1);
         }

         return this;
      }

      public btb.a<T> a(evs $$0) {
         return this.a(bsw.b, $$0);
      }

      public btb.a<T> c(float $$0) {
         return this.a(bsw.b, 0.0F, -$$0, 0.0F);
      }

      public btb.a<T> d(float $$0) {
         return this.a(bsw.c, 0.0F, $$0, 0.0F);
      }

      public btb.a<T> a(bsw $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public btb.a<T> a(bsw $$0, evs $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public btb.a<T> a() {
         this.e = false;
         return this;
      }

      public btb.a<T> b() {
         this.d = false;
         return this;
      }

      public btb.a<T> c() {
         this.f = true;
         return this;
      }

      public btb.a<T> a(dfa... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public btb.a<T> d() {
         this.g = true;
         return this;
      }

      public btb.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public btb.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public btb.a<T> a(cpk... $$0) {
         this.m = cpo.e.a($$0);
         return this;
      }

      public btb<T> a(String $$0) {
         if (this.d) {
            ac.a(bgx.A, $$0);
         }

         return new btb<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsv> {
      T create(btb<T> var1, dbz var2);
   }
}
