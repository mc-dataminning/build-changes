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

public class brn<T extends brh> implements cnr, duo<brh, T> {
   private static final Logger bA = LogUtils.getLogger();
   private final iw.c<brn<?>> bB = ld.g.f(this);
   private static final float bC = 1.3964844F;
   private static final int bD = 10;
   public static final brn<cev> a = a("allay", brn.a.a(cev::new, bsd.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final brn<brd> b = a("area_effect_cloud", brn.a.<brd>a(brd::new, bsd.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final brn<cey> c = a("armadillo", brn.a.a(cey::new, bsd.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final brn<chh> d = a("armor_stand", brn.a.<chh>a(chh::new, bsd.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final brn<clp> e = a("arrow", brn.a.<clp>a(clp::new, bsd.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final brn<cfb> f = a("axolotl", brn.a.a(cfb::new, bsd.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final brn<cdk> g = a("bat", brn.a.a(cdk::new, bsd.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final brn<cdq> h = a("bee", brn.a.a(cdq::new, bsd.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final brn<chw> i = a("blaze", brn.a.a(chw::new, bsd.a).c().a(0.6F, 1.8F).a(8));
   public static final brn<brg.b> j = a("block_display", brn.a.a(brg.b::new, bsd.h).a(0.0F, 0.0F).a(10).b(1));
   public static final brn<cne> k = a("boat", brn.a.<cne>a(cne::new, bsd.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final brn<chx> l = a("bogged", brn.a.a(chx::new, bsd.a).a(0.6F, 1.99F).a(1.74F).a(8).a(cnw.c));
   public static final brn<cjj> m = a("breeze", brn.a.a(cjj::new, bsd.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cnw.c));
   public static final brn<cmq> n = a("breeze_wind_charge", brn.a.<cmq>a(cmq::new, bsd.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cnw.c));
   public static final brn<cfg> o = a("camel", brn.a.a(cfg::new, bsd.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final brn<cds> p = a("cat", brn.a.a(cds::new, bsd.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final brn<chy> q = a("cave_spider", brn.a.a(chy::new, bsd.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final brn<cnf> r = a("chest_boat", brn.a.<cnf>a(cnf::new, bsd.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final brn<cnj> s = a("chest_minecart", brn.a.<cnj>a(cnj::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cdu> t = a("chicken", brn.a.a(cdu::new, bsd.b).a(0.4F, 0.7F).a(0.644F).a(new etp(0.0, 0.7, -0.1)).a(10));
   public static final brn<cdv> u = a("cod", brn.a.a(cdv::new, bsd.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final brn<cnk> v = a("command_block_minecart", brn.a.<cnk>a(cnk::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cdw> w = a("cow", brn.a.a(cdw::new, bsd.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final brn<chz> x = a("creeper", brn.a.a(chz::new, bsd.a).a(0.6F, 1.7F).a(8));
   public static final brn<cdx> y = a("dolphin", brn.a.a(cdx::new, bsd.f).a(0.9F, 0.6F).a(0.3F));
   public static final brn<cfu> z = a("donkey", brn.a.a(cfu::new, bsd.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final brn<clq> A = a("dragon_fireball", brn.a.<clq>a(clq::new, bsd.h).a(1.0F, 1.0F).a(4).b(10));
   public static final brn<cib> B = a("drowned", brn.a.a(cib::new, bsd.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final brn<cmi> C = a("egg", brn.a.<cmi>a(cmi::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<cic> D = a("elder_guardian", brn.a.a(cic::new, bsd.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final brn<cgk> E = a("end_crystal", brn.a.<cgk>a(cgk::new, bsd.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final brn<cgl> F = a("ender_dragon", brn.a.a(cgl::new, bsd.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final brn<cmj> G = a("ender_pearl", brn.a.<cmj>a(cmj::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<cid> H = a("enderman", brn.a.a(cid::new, bsd.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final brn<cie> I = a("endermite", brn.a.a(cie::new, bsd.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final brn<cig> J = a("evoker", brn.a.a(cig::new, bsd.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final brn<clr> K = a("evoker_fangs", brn.a.<clr>a(clr::new, bsd.h).a(0.5F, 0.8F).a(6).b(2));
   public static final brn<cmk> L = a("experience_bottle", brn.a.<cmk>a(cmk::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<brq> M = a("experience_orb", brn.a.<brq>a(brq::new, bsd.h).a(0.5F, 0.5F).a(6).b(20));
   public static final brn<cls> N = a("eye_of_ender", brn.a.<cls>a(cls::new, bsd.h).a(0.25F, 0.25F).a(4).b(4));
   public static final brn<chq> O = a("falling_block", brn.a.<chq>a(chq::new, bsd.h).a(0.98F, 0.98F).a(10).b(20));
   public static final brn<clu> P = a("firework_rocket", brn.a.<clu>a(clu::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<cdz> Q = a("fox", brn.a.a(cdz::new, bsd.b).a(0.6F, 0.7F).a(0.4F).a(new etp(0.0, 0.6375, -0.25)).a(8).a(ddg.oi));
   public static final brn<cfj> R = a("frog", brn.a.a(cfj::new, bsd.b).a(0.5F, 0.5F).a(new etp(0.0, 0.375, -0.25)).a(10));
   public static final brn<cnl> S = a("furnace_minecart", brn.a.<cnl>a(cnl::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cih> T = a("ghast", brn.a.a(cih::new, bsd.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final brn<cii> U = a("giant", brn.a.a(cii::new, bsd.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final brn<chi> V = a("glow_item_frame", brn.a.<chi>a(chi::new, bsd.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final brn<brs> W = a("glow_squid", brn.a.a(brs::new, bsd.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final brn<cfp> X = a("goat", brn.a.a(cfp::new, bsd.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final brn<cij> Y = a("guardian", brn.a.a(cij::new, bsd.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final brn<cjr> Z = a("hoglin", brn.a.a(cjr::new, bsd.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final brn<cnm> aa = a("hopper_minecart", brn.a.<cnm>a(cnm::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cfv> ab = a("horse", brn.a.a(cfv::new, bsd.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final brn<cik> ac = a("husk", brn.a.a(cik::new, bsd.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final brn<cil> ad = a("illusioner", brn.a.a(cil::new, bsd.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final brn<brv> ae = a("interaction", brn.a.a(brv::new, bsd.h).a(0.0F, 0.0F).a(10));
   public static final brn<ceb> af = a("iron_golem", brn.a.a(ceb::new, bsd.h).a(1.4F, 2.7F).a(10));
   public static final brn<chr> ag = a("item", brn.a.<chr>a(chr::new, bsd.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final brn<brg.g> ah = a("item_display", brn.a.a(brg.g::new, bsd.h).a(0.0F, 0.0F).a(10).b(1));
   public static final brn<chk> ai = a("item_frame", brn.a.<chk>a(chk::new, bsd.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final brn<clx> aj = a("fireball", brn.a.<clx>a(clx::new, bsd.h).a(1.0F, 1.0F).a(4).b(10));
   public static final brn<chl> ak = a("leash_knot", brn.a.<chl>a(chl::new, bsd.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final brn<brz> al = a("lightning_bolt", brn.a.a(brz::new, bsd.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final brn<cfw> am = a("llama", brn.a.a(cfw::new, bsd.b).a(0.9F, 1.87F).a(1.7765F).a(new etp(0.0, 1.37, -0.3)).a(10));
   public static final brn<cly> an = a("llama_spit", brn.a.<cly>a(cly::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<cim> ao = a("magma_cube", brn.a.a(cim::new, bsd.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final brn<bsb> ap = a("marker", brn.a.a(bsb::new, bsd.h).a(0.0F, 0.0F).a(0));
   public static final brn<cni> aq = a("minecart", brn.a.<cni>a(cni::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cec> ar = a("mooshroom", brn.a.a(cec::new, bsd.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final brn<cfy> as = a("mule", brn.a.a(cfy::new, bsd.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final brn<ced> at = a("ocelot", brn.a.a(ced::new, bsd.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final brn<chm> au = a("painting", brn.a.<chm>a(chm::new, bsd.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final brn<cee> av = a("panda", brn.a.a(cee::new, bsd.b).a(1.3F, 1.25F).a(10));
   public static final brn<cef> aw = a("parrot", brn.a.a(cef::new, bsd.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final brn<cip> ax = a("phantom", brn.a.a(cip::new, bsd.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final brn<ceg> ay = a("pig", brn.a.a(ceg::new, bsd.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final brn<cjx> az = a("piglin", brn.a.a(cjx::new, bsd.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final brn<cka> aA = a("piglin_brute", brn.a.a(cka::new, bsd.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final brn<ciq> aB = a("pillager", brn.a.a(ciq::new, bsd.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final brn<ceh> aC = a("polar_bear", brn.a.a(ceh::new, bsd.b).a(ddg.qP).a(1.4F, 1.4F).a(10));
   public static final brn<cml> aD = a("potion", brn.a.<cml>a(cml::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<cei> aE = a("pufferfish", brn.a.a(cei::new, bsd.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final brn<cej> aF = a("rabbit", brn.a.a(cej::new, bsd.b).a(0.4F, 0.5F).a(8));
   public static final brn<cis> aG = a("ravager", brn.a.a(cis::new, bsd.a).a(1.95F, 2.2F).a(new etp(0.0, 2.2625, -0.0625)).a(10));
   public static final brn<cek> aH = a("salmon", brn.a.a(cek::new, bsd.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final brn<cel> aI = a("sheep", brn.a.a(cel::new, bsd.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final brn<cit> aJ = a("shulker", brn.a.a(cit::new, bsd.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final brn<cmc> aK = a("shulker_bullet", brn.a.<cmc>a(cmc::new, bsd.h).a(0.3125F, 0.3125F).a(8));
   public static final brn<ciu> aL = a("silverfish", brn.a.a(ciu::new, bsd.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final brn<civ> aM = a("skeleton", brn.a.a(civ::new, bsd.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final brn<cfz> aN = a("skeleton_horse", brn.a.a(cfz::new, bsd.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final brn<ciw> aO = a("slime", brn.a.a(ciw::new, bsd.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final brn<cmd> aP = a("small_fireball", brn.a.<cmd>a(cmd::new, bsd.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final brn<cgg> aQ = a("sniffer", brn.a.a(cgg::new, bsd.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final brn<cen> aR = a("snow_golem", brn.a.a(cen::new, bsd.h).a(ddg.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final brn<cme> aS = a("snowball", brn.a.<cme>a(cme::new, bsd.h).a(0.25F, 0.25F).a(4).b(10));
   public static final brn<cnn> aT = a("spawner_minecart", brn.a.<cnn>a(cnn::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cmf> aU = a("spectral_arrow", brn.a.<cmf>a(cmf::new, bsd.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final brn<ciy> aV = a("spider", brn.a.a(ciy::new, bsd.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final brn<ceo> aW = a("squid", brn.a.a(ceo::new, bsd.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final brn<ciz> aX = a("stray", brn.a.a(ciz::new, bsd.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(ddg.qP).a(8));
   public static final brn<cja> aY = a("strider", brn.a.a(cja::new, bsd.b).c().a(0.9F, 1.7F).a(10));
   public static final brn<cfm> aZ = a("tadpole", brn.a.a(cfm::new, bsd.b).a(cfm.c, cfm.d).a(cfm.d * 0.65F).a(10));
   public static final brn<brg.l> ba = a("text_display", brn.a.a(brg.l::new, bsd.h).a(0.0F, 0.0F).a(10).b(1));
   public static final brn<chs> bb = a("tnt", brn.a.<chs>a(chs::new, bsd.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final brn<cno> bc = a("tnt_minecart", brn.a.<cno>a(cno::new, bsd.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final brn<cgb> bd = a("trader_llama", brn.a.a(cgb::new, bsd.b).a(0.9F, 1.87F).a(1.7765F).a(new etp(0.0, 1.37, -0.3)).a(10));
   public static final brn<cmm> be = a("trident", brn.a.<cmm>a(cmm::new, bsd.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final brn<cep> bf = a("tropical_fish", brn.a.a(cep::new, bsd.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final brn<ceq> bg = a("turtle", brn.a.a(ceq::new, bsd.b).a(1.2F, 0.4F).a(new etp(0.0, 0.55625, -0.25)).a(10));
   public static final brn<cjb> bh = a("vex", brn.a.a(cjb::new, bsd.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final brn<cku> bi = a("villager", brn.a.<cku>a(cku::new, bsd.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final brn<cjc> bj = a("vindicator", brn.a.a(cjc::new, bsd.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final brn<cla> bk = a("wandering_trader", brn.a.a(cla::new, bsd.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final brn<ckl> bl = a("warden", brn.a.a(ckl::new, bsd.a).a(0.9F, 2.9F).a(3.15F).a(bri.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final brn<cmr> bm = a("wind_charge", brn.a.<cmr>a(cmr::new, bsd.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cnw.c));
   public static final brn<cjd> bn = a("witch", brn.a.a(cjd::new, bsd.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final brn<chf> bo = a("wither", brn.a.a(chf::new, bsd.a).c().a(ddg.cd).a(0.9F, 3.5F).a(10));
   public static final brn<cje> bp = a("wither_skeleton", brn.a.a(cje::new, bsd.a).c().a(ddg.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final brn<cmn> bq = a("wither_skull", brn.a.<cmn>a(cmn::new, bsd.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final brn<ces> br = a("wolf", brn.a.a(ces::new, bsd.b).a(0.6F, 0.85F).a(0.68F).a(new etp(0.0, 0.81875, -0.0625)).a(10));
   public static final brn<cjf> bs = a("zoglin", brn.a.a(cjf::new, bsd.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final brn<cjg> bt = a("zombie", brn.a.<cjg>a(cjg::new, bsd.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final brn<cgd> bu = a("zombie_horse", brn.a.a(cgd::new, bsd.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final brn<cjh> bv = a("zombie_villager", brn.a.a(cjh::new, bsd.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final brn<cji> bw = a("zombified_piglin", brn.a.a(cji::new, bsd.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final brn<clh> bx = a("player", brn.a.<clh>a(bsd.h).b().a().a(0.6F, 1.8F).a(1.62F).a(clh.bU).a(32).b(2));
   public static final brn<clv> by = a("fishing_bobber", brn.a.<clv>a(clv::new, bsd.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final brn.b<T> bE;
   private final bsd bF;
   private final ImmutableSet<dde> bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final int bL;
   private final int bM;
   @Nullable
   private String bN;
   @Nullable
   private wu bO;
   @Nullable
   private akg<eoq> bP;
   private final brk bQ;
   private final cnu bR;

   private static <T extends brh> brn<T> a(String $$0, brn.a<T> $$1) {
      return jj.a(ld.g, $$0, $$1.a($$0));
   }

   public static akh a(brn<?> $$0) {
      return ld.g.b($$0);
   }

   public static Optional<brn<?>> a(String $$0) {
      return ld.g.b(akh.a($$0));
   }

   public brn(brn.b<T> $$0, bsd $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dde> $$6, brk $$7, int $$8, int $$9, cnu $$10) {
      this.bE = $$0;
      this.bF = $$1;
      this.bK = $$5;
      this.bH = $$2;
      this.bI = $$3;
      this.bJ = $$4;
      this.bG = $$6;
      this.bQ = $$7;
      this.bL = $$8;
      this.bM = $$9;
      this.bR = $$10;
   }

   @Nullable
   public T a(aqh $$0, @Nullable csz $$1, @Nullable clh $$2, in $$3, bse $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends brh> Consumer<T> a(aqh $$0, csz $$1, @Nullable clh $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends brh> Consumer<T> a(Consumer<T> $$0, aqh $$1, csz $$2, @Nullable clh $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends brh> Consumer<T> a(Consumer<T> $$0, csz $$1) {
      wu $$2 = $$1.a(ka.f);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends brh> Consumer<T> b(Consumer<T> $$0, aqh $$1, csz $$2, @Nullable clh $$3) {
      cvm $$4 = $$2.a(ka.K, cvm.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqh $$0, in $$1, bse $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqh $$0, @Nullable Consumer<T> $$1, in $$2, bse $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqh $$0, @Nullable Consumer<T> $$1, in $$2, bse $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dad)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cI());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, axz.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bsc $$9) {
            $$9.bb = $$9.dD();
            $$9.aZ = $$9.dD();
            $$9.a($$0, $$0.d_($$9.dn()), $$3, null);
            $$9.P();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dag $$0, in $$1, boolean $$2, etk $$3) {
      etk $$4 = new etk($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eui> $$5 = $$0.d(null, $$4);
      return 1.0 + euf.a(is.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dad $$0, @Nullable clh $$1, @Nullable brh $$2, cvm $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cN() || $$1 != null && $$4.ah().f($$1.fZ())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bH;
   }

   public boolean c() {
      return this.bI;
   }

   public boolean d() {
      return this.bJ;
   }

   public boolean e() {
      return this.bK;
   }

   public bsd f() {
      return this.bF;
   }

   public String g() {
      if (this.bN == null) {
         this.bN = ac.a("entity", ld.g.b(this));
      }

      return this.bN;
   }

   public wu h() {
      if (this.bO == null) {
         this.bO = wu.c(this.g());
      }

      return this.bO;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public akg<eoq> j() {
      if (this.bP == null) {
         akh $$0 = ld.g.b(this);
         this.bP = akg.a(le.aU, $$0.d("entities/"));
      }

      return this.bP;
   }

   public float k() {
      return this.bQ.a();
   }

   public float l() {
      return this.bQ.b();
   }

   @Override
   public cnu m() {
      return this.bR;
   }

   @Nullable
   public T a(dad $$0) {
      return !this.a($$0.J()) ? null : this.bE.create(this, $$0);
   }

   public static Optional<brh> a(ua $$0, dad $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bA.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public etk a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new etk($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dqh $$0) {
      if (this.bG.contains($$0.b())) {
         return false;
      } else {
         return !this.bJ && emn.a($$0) ? true : $$0.a(ddg.cd) || $$0.a(ddg.oi) || $$0.a(ddg.dQ) || $$0.a(ddg.qP);
      }
   }

   public brk n() {
      return this.bQ;
   }

   public static Optional<brn<?>> a(ua $$0) {
      return ld.g.b(new akh($$0.l("id")));
   }

   @Nullable
   public static brh a(ua $$0, dad $$1, Function<brh, brh> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ug $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               brh $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (brh)$$3;
      }).orElse(null);
   }

   public static Stream<brh> a(final List<? extends ux> $$0, final dad $$1) {
      final Spliterator<? extends ux> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<brh>() {
         @Override
         public boolean tryAdvance(Consumer<? super brh> $$0x) {
            return $$2.tryAdvance($$2xx -> brn.a((ua)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<brh> trySplit() {
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

   private static Optional<brh> b(ua $$0, dad $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bA.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bL;
   }

   public int p() {
      return this.bM;
   }

   public boolean q() {
      return this != bx && this != an && this != bo && this != g && this != ai && this != V && this != ak && this != au && this != E && this != K;
   }

   public boolean a(awg<brn<?>> $$0) {
      return this.bB.a($$0);
   }

   public boolean a(ja<brn<?>> $$0) {
      return $$0.a(this.bB);
   }

   @Nullable
   public T a(brh $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends brh> a() {
      return brh.class;
   }

   @Deprecated
   public iw.c<brn<?>> r() {
      return this.bB;
   }

   public static class a<T extends brh> {
      private final brn.b<T> a;
      private final bsd b;
      private ImmutableSet<dde> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private brk j = brk.b(0.6F, 1.8F);
      private brj.a k = brj.a();
      private cnu l = cnw.g;

      private a(brn.b<T> $$0, bsd $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bsd.b || $$1 == bsd.h;
      }

      public static <T extends brh> brn.a<T> a(brn.b<T> $$0, bsd $$1) {
         return new brn.a<>($$0, $$1);
      }

      public static <T extends brh> brn.a<T> a(bsd $$0) {
         return new brn.a<>(($$0x, $$1) -> null, $$0);
      }

      public brn.a<T> a(float $$0, float $$1) {
         this.j = brk.b($$0, $$1);
         return this;
      }

      public brn.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public brn.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bri.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public brn.a<T> a(etp... $$0) {
         for (etp $$1 : $$0) {
            this.k = this.k.a(bri.a, $$1);
         }

         return this;
      }

      public brn.a<T> a(etp $$0) {
         return this.a(bri.b, $$0);
      }

      public brn.a<T> b(float $$0) {
         return this.a(bri.b, 0.0F, -$$0, 0.0F);
      }

      public brn.a<T> c(float $$0) {
         return this.a(bri.c, 0.0F, $$0, 0.0F);
      }

      public brn.a<T> a(bri $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public brn.a<T> a(bri $$0, etp $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public brn.a<T> a() {
         this.e = false;
         return this;
      }

      public brn.a<T> b() {
         this.d = false;
         return this;
      }

      public brn.a<T> c() {
         this.f = true;
         return this;
      }

      public brn.a<T> a(dde... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public brn.a<T> d() {
         this.g = true;
         return this;
      }

      public brn.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public brn.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public brn.a<T> a(cns... $$0) {
         this.l = cnw.e.a($$0);
         return this;
      }

      public brn<T> a(String $$0) {
         if (this.d) {
            ac.a(bfs.y, $$0);
         }

         return new brn<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends brh> {
      T create(brn<T> var1, dad var2);
   }
}
