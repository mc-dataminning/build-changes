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

public class bsa<T extends bru> implements cog, dvi<bru, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ix.c<bsa<?>> bC = le.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsa<cfk> a = a("allay", bsa.a.a(cfk::new, bsr.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsa<brq> b = a("area_effect_cloud", bsa.a.<brq>a(brq::new, bsr.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsa<cfn> c = a("armadillo", bsa.a.a(cfn::new, bsr.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsa<chw> d = a("armor_stand", bsa.a.<chw>a(chw::new, bsr.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsa<cme> e = a("arrow", bsa.a.<cme>a(cme::new, bsr.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsa<cfq> f = a("axolotl", bsa.a.a(cfq::new, bsr.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsa<cdz> g = a("bat", bsa.a.a(cdz::new, bsr.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsa<cef> h = a("bee", bsa.a.a(cef::new, bsr.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsa<cil> i = a("blaze", bsa.a.a(cil::new, bsr.a).c().a(0.6F, 1.8F).a(8));
   public static final bsa<brt.b> j = a("block_display", bsa.a.a(brt.b::new, bsr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsa<cnt> k = a("boat", bsa.a.<cnt>a(cnt::new, bsr.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsa<cim> l = a("bogged", bsa.a.a(cim::new, bsr.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(col.c));
   public static final bsa<cjy> m = a("breeze", bsa.a.a(cjy::new, bsr.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(col.c));
   public static final bsa<cnf> n = a("breeze_wind_charge", bsa.a.<cnf>a(cnf::new, bsr.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(col.c));
   public static final bsa<cfv> o = a("camel", bsa.a.a(cfv::new, bsr.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsa<ceh> p = a("cat", bsa.a.a(ceh::new, bsr.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsa<cin> q = a("cave_spider", bsa.a.a(cin::new, bsr.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsa<cnu> r = a("chest_boat", bsa.a.<cnu>a(cnu::new, bsr.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsa<cny> s = a("chest_minecart", bsa.a.<cny>a(cny::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<cej> t = a("chicken", bsa.a.a(cej::new, bsr.b).a(0.4F, 0.7F).b(0.644F).a(new euk(0.0, 0.7, -0.1)).a(10));
   public static final bsa<cek> u = a("cod", bsa.a.a(cek::new, bsr.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsa<cnz> v = a("command_block_minecart", bsa.a.<cnz>a(cnz::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<cel> w = a("cow", bsa.a.a(cel::new, bsr.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsa<cio> x = a("creeper", bsa.a.a(cio::new, bsr.a).a(0.6F, 1.7F).a(8));
   public static final bsa<cem> y = a("dolphin", bsa.a.a(cem::new, bsr.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsa<cgj> z = a("donkey", bsa.a.a(cgj::new, bsr.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsa<cmf> A = a("dragon_fireball", bsa.a.<cmf>a(cmf::new, bsr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsa<ciq> B = a("drowned", bsa.a.a(ciq::new, bsr.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsa<cmx> C = a("egg", bsa.a.<cmx>a(cmx::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<cir> D = a("elder_guardian", bsa.a.a(cir::new, bsr.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsa<cgz> E = a("end_crystal", bsa.a.<cgz>a(cgz::new, bsr.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsa<cha> F = a("ender_dragon", bsa.a.a(cha::new, bsr.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsa<cmy> G = a("ender_pearl", bsa.a.<cmy>a(cmy::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<cis> H = a("enderman", bsa.a.a(cis::new, bsr.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsa<cit> I = a("endermite", bsa.a.a(cit::new, bsr.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsa<civ> J = a("evoker", bsa.a.a(civ::new, bsr.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsa<cmg> K = a("evoker_fangs", bsa.a.<cmg>a(cmg::new, bsr.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsa<cmz> L = a("experience_bottle", bsa.a.<cmz>a(cmz::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<bse> M = a("experience_orb", bsa.a.<bse>a(bse::new, bsr.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsa<cmh> N = a("eye_of_ender", bsa.a.<cmh>a(cmh::new, bsr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsa<cif> O = a("falling_block", bsa.a.<cif>a(cif::new, bsr.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsa<cmj> P = a("firework_rocket", bsa.a.<cmj>a(cmj::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<ceo> Q = a("fox", bsa.a.a(ceo::new, bsr.b).a(0.6F, 0.7F).b(0.4F).a(new euk(0.0, 0.6375, -0.25)).a(8).a(dea.oi));
   public static final bsa<cfy> R = a("frog", bsa.a.a(cfy::new, bsr.b).a(0.5F, 0.5F).a(new euk(0.0, 0.375, -0.25)).a(10));
   public static final bsa<coa> S = a("furnace_minecart", bsa.a.<coa>a(coa::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<ciw> T = a("ghast", bsa.a.a(ciw::new, bsr.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsa<cix> U = a("giant", bsa.a.a(cix::new, bsr.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsa<chx> V = a("glow_item_frame", bsa.a.<chx>a(chx::new, bsr.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsa<bsg> W = a("glow_squid", bsa.a.a(bsg::new, bsr.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsa<cge> X = a("goat", bsa.a.a(cge::new, bsr.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsa<ciy> Y = a("guardian", bsa.a.a(ciy::new, bsr.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsa<ckg> Z = a("hoglin", bsa.a.a(ckg::new, bsr.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsa<cob> aa = a("hopper_minecart", bsa.a.<cob>a(cob::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<cgk> ab = a("horse", bsa.a.a(cgk::new, bsr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsa<ciz> ac = a("husk", bsa.a.a(ciz::new, bsr.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsa<cja> ad = a("illusioner", bsa.a.a(cja::new, bsr.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsa<bsj> ae = a("interaction", bsa.a.a(bsj::new, bsr.h).a(0.0F, 0.0F).a(10));
   public static final bsa<ceq> af = a("iron_golem", bsa.a.a(ceq::new, bsr.h).a(1.4F, 2.7F).a(10));
   public static final bsa<cig> ag = a("item", bsa.a.<cig>a(cig::new, bsr.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsa<brt.g> ah = a("item_display", bsa.a.a(brt.g::new, bsr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsa<chz> ai = a("item_frame", bsa.a.<chz>a(chz::new, bsr.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsa<bsv> aj = a("ominous_item_spawner", bsa.a.a(bsv::new, bsr.h).a(0.25F, 0.25F).a(8).a(col.c));
   public static final bsa<cmm> ak = a("fireball", bsa.a.<cmm>a(cmm::new, bsr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsa<cia> al = a("leash_knot", bsa.a.<cia>a(cia::new, bsr.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsa<bsn> am = a("lightning_bolt", bsa.a.a(bsn::new, bsr.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsa<cgl> an = a("llama", bsa.a.a(cgl::new, bsr.b).a(0.9F, 1.87F).b(1.7765F).a(new euk(0.0, 1.37, -0.3)).a(10));
   public static final bsa<cmn> ao = a("llama_spit", bsa.a.<cmn>a(cmn::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<cjb> ap = a("magma_cube", bsa.a.a(cjb::new, bsr.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsa<bsp> aq = a("marker", bsa.a.a(bsp::new, bsr.h).a(0.0F, 0.0F).a(0));
   public static final bsa<cnx> ar = a("minecart", bsa.a.<cnx>a(cnx::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<cer> as = a("mooshroom", bsa.a.a(cer::new, bsr.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsa<cgn> at = a("mule", bsa.a.a(cgn::new, bsr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsa<ces> au = a("ocelot", bsa.a.a(ces::new, bsr.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsa<cib> av = a("painting", bsa.a.<cib>a(cib::new, bsr.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsa<cet> aw = a("panda", bsa.a.a(cet::new, bsr.b).a(1.3F, 1.25F).a(10));
   public static final bsa<ceu> ax = a("parrot", bsa.a.a(ceu::new, bsr.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsa<cje> ay = a("phantom", bsa.a.a(cje::new, bsr.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsa<cev> az = a("pig", bsa.a.a(cev::new, bsr.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsa<ckm> aA = a("piglin", bsa.a.a(ckm::new, bsr.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsa<ckp> aB = a("piglin_brute", bsa.a.a(ckp::new, bsr.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsa<cjf> aC = a("pillager", bsa.a.a(cjf::new, bsr.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsa<cew> aD = a("polar_bear", bsa.a.a(cew::new, bsr.b).a(dea.qP).a(1.4F, 1.4F).a(10));
   public static final bsa<cna> aE = a("potion", bsa.a.<cna>a(cna::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<cex> aF = a("pufferfish", bsa.a.a(cex::new, bsr.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsa<cey> aG = a("rabbit", bsa.a.a(cey::new, bsr.b).a(0.4F, 0.5F).a(8));
   public static final bsa<cjh> aH = a("ravager", bsa.a.a(cjh::new, bsr.a).a(1.95F, 2.2F).a(new euk(0.0, 2.2625, -0.0625)).a(10));
   public static final bsa<cez> aI = a("salmon", bsa.a.a(cez::new, bsr.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsa<cfa> aJ = a("sheep", bsa.a.a(cfa::new, bsr.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsa<cji> aK = a("shulker", bsa.a.a(cji::new, bsr.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsa<cmr> aL = a("shulker_bullet", bsa.a.<cmr>a(cmr::new, bsr.h).a(0.3125F, 0.3125F).a(8));
   public static final bsa<cjj> aM = a("silverfish", bsa.a.a(cjj::new, bsr.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsa<cjk> aN = a("skeleton", bsa.a.a(cjk::new, bsr.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsa<cgo> aO = a("skeleton_horse", bsa.a.a(cgo::new, bsr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsa<cjl> aP = a("slime", bsa.a.a(cjl::new, bsr.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsa<cms> aQ = a("small_fireball", bsa.a.<cms>a(cms::new, bsr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsa<cgv> aR = a("sniffer", bsa.a.a(cgv::new, bsr.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsa<cfc> aS = a("snow_golem", bsa.a.a(cfc::new, bsr.h).a(dea.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsa<cmt> aT = a("snowball", bsa.a.<cmt>a(cmt::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsa<coc> aU = a("spawner_minecart", bsa.a.<coc>a(coc::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<cmu> aV = a("spectral_arrow", bsa.a.<cmu>a(cmu::new, bsr.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsa<cjn> aW = a("spider", bsa.a.a(cjn::new, bsr.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsa<cfd> aX = a("squid", bsa.a.a(cfd::new, bsr.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsa<cjo> aY = a("stray", bsa.a.a(cjo::new, bsr.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dea.qP).a(8));
   public static final bsa<cjp> aZ = a("strider", bsa.a.a(cjp::new, bsr.b).c().a(0.9F, 1.7F).a(10));
   public static final bsa<cgb> ba = a("tadpole", bsa.a.a(cgb::new, bsr.b).a(cgb.c, cgb.d).b(cgb.d * 0.65F).a(10));
   public static final bsa<brt.l> bb = a("text_display", bsa.a.a(brt.l::new, bsr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsa<cih> bc = a("tnt", bsa.a.<cih>a(cih::new, bsr.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsa<cod> bd = a("tnt_minecart", bsa.a.<cod>a(cod::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsa<cgq> be = a("trader_llama", bsa.a.a(cgq::new, bsr.b).a(0.9F, 1.87F).b(1.7765F).a(new euk(0.0, 1.37, -0.3)).a(10));
   public static final bsa<cnb> bf = a("trident", bsa.a.<cnb>a(cnb::new, bsr.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsa<cfe> bg = a("tropical_fish", bsa.a.a(cfe::new, bsr.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsa<cff> bh = a("turtle", bsa.a.a(cff::new, bsr.b).a(1.2F, 0.4F).a(new euk(0.0, 0.55625, -0.25)).a(10));
   public static final bsa<cjq> bi = a("vex", bsa.a.a(cjq::new, bsr.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsa<clj> bj = a("villager", bsa.a.<clj>a(clj::new, bsr.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsa<cjr> bk = a("vindicator", bsa.a.a(cjr::new, bsr.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsa<clp> bl = a("wandering_trader", bsa.a.a(clp::new, bsr.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsa<cla> bm = a("warden", bsa.a.a(cla::new, bsr.a).a(0.9F, 2.9F).a(3.15F).a(brv.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsa<cng> bn = a("wind_charge", bsa.a.<cng>a(cng::new, bsr.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(col.c));
   public static final bsa<cjs> bo = a("witch", bsa.a.a(cjs::new, bsr.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsa<chu> bp = a("wither", bsa.a.a(chu::new, bsr.a).c().a(dea.cd).a(0.9F, 3.5F).a(10));
   public static final bsa<cjt> bq = a("wither_skeleton", bsa.a.a(cjt::new, bsr.a).c().a(dea.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsa<cnc> br = a("wither_skull", bsa.a.<cnc>a(cnc::new, bsr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsa<cfh> bs = a("wolf", bsa.a.a(cfh::new, bsr.b).a(0.6F, 0.85F).b(0.68F).a(new euk(0.0, 0.81875, -0.0625)).a(10));
   public static final bsa<cju> bt = a("zoglin", bsa.a.a(cju::new, bsr.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsa<cjv> bu = a("zombie", bsa.a.<cjv>a(cjv::new, bsr.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsa<cgs> bv = a("zombie_horse", bsa.a.a(cgs::new, bsr.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsa<cjw> bw = a("zombie_villager", bsa.a.a(cjw::new, bsr.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsa<cjx> bx = a("zombified_piglin", bsa.a.a(cjx::new, bsr.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsa<clw> by = a("player", bsa.a.<clw>a(bsr.h).b().a().a(0.6F, 1.8F).b(1.62F).a(clw.bU).a(32).b(2));
   public static final bsa<cmk> bz = a("fishing_bobber", bsa.a.<cmk>a(cmk::new, bsr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsa.b<T> bF;
   private final bsr bG;
   private final ImmutableSet<ddy> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private wx bP;
   @Nullable
   private akl<epk> bQ;
   private final brx bR;
   private final float bS;
   private final coj bT;

   private static <T extends bru> bsa<T> a(String $$0, bsa.a<T> $$1) {
      return jk.a(le.g, $$0, $$1.a($$0));
   }

   public static akm a(bsa<?> $$0) {
      return le.g.b($$0);
   }

   public static Optional<bsa<?>> a(String $$0) {
      return le.g.b(akm.a($$0));
   }

   public bsa(bsa.b<T> $$0, bsr $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<ddy> $$6, brx $$7, float $$8, int $$9, int $$10, coj $$11) {
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
   public T a(aqm $$0, @Nullable cto $$1, @Nullable clw $$2, io $$3, bss $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bru> Consumer<T> a(aqm $$0, cto $$1, @Nullable clw $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bru> Consumer<T> a(Consumer<T> $$0, aqm $$1, cto $$2, @Nullable clw $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bru> Consumer<T> a(Consumer<T> $$0, cto $$1) {
      wx $$2 = $$1.a(kb.f);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bru> Consumer<T> b(Consumer<T> $$0, aqm $$1, cto $$2, @Nullable clw $$3) {
      cwd $$4 = $$2.a(kb.L, cwd.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqm $$0, io $$1, bss $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqm $$0, @Nullable Consumer<T> $$1, io $$2, bss $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqm $$0, @Nullable Consumer<T> $$1, io $$2, bss $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dax)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayd.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bsq $$9) {
            $$9.bb = $$9.dF();
            $$9.aZ = $$9.dF();
            $$9.a($$0, $$0.d_($$9.dp()), $$3, null);
            $$9.P();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dba $$0, io $$1, boolean $$2, euf $$3) {
      euf $$4 = new euf($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<evd> $$5 = $$0.d(null, $$4);
      return 1.0 + eva.a(it.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dax $$0, @Nullable clw $$1, @Nullable bru $$2, cwd $$3) {
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

   public bsr f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", le.g.b(this));
      }

      return this.bO;
   }

   public wx h() {
      if (this.bP == null) {
         this.bP = wx.c(this.g());
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

   public akl<epk> k() {
      if (this.bQ == null) {
         akm $$0 = le.g.b(this);
         this.bQ = akl.a(lf.aU, $$0.d("entities/"));
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
   public coj i() {
      return this.bT;
   }

   @Nullable
   public T a(dax $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bru> a(ud $$0, dax $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public euf a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new euf($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(drb $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && enh.a($$0) ? true : $$0.a(dea.cd) || $$0.a(dea.oi) || $$0.a(dea.dQ) || $$0.a(dea.qP);
      }
   }

   public brx n() {
      return this.bR;
   }

   public static Optional<bsa<?>> a(ud $$0) {
      return le.g.b(new akm($$0.l("id")));
   }

   @Nullable
   public static bru a(ud $$0, dax $$1, Function<bru, bru> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uj $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bru $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bru)$$3;
      }).orElse(null);
   }

   public static Stream<bru> a(final List<? extends va> $$0, final dax $$1) {
      final Spliterator<? extends va> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bru>() {
         @Override
         public boolean tryAdvance(Consumer<? super bru> $$0x) {
            return $$2.tryAdvance($$2xx -> bsa.a((ud)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bru> trySplit() {
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

   private static Optional<bru> b(ud $$0, dax $$1) {
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

   public boolean a(awl<bsa<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jb<bsa<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bru $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bru> a() {
      return bru.class;
   }

   @Deprecated
   public ix.c<bsa<?>> r() {
      return this.bC;
   }

   public static class a<T extends bru> {
      private final bsa.b<T> a;
      private final bsr b;
      private ImmutableSet<ddy> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private brx j = brx.b(0.6F, 1.8F);
      private float k = 1.0F;
      private brw.a l = brw.a();
      private coj m = col.g;

      private a(bsa.b<T> $$0, bsr $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bsr.b || $$1 == bsr.h;
      }

      public static <T extends bru> bsa.a<T> a(bsa.b<T> $$0, bsr $$1) {
         return new bsa.a<>($$0, $$1);
      }

      public static <T extends bru> bsa.a<T> a(bsr $$0) {
         return new bsa.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsa.a<T> a(float $$0, float $$1) {
         this.j = brx.b($$0, $$1);
         return this;
      }

      public bsa.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsa.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsa.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(brv.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsa.a<T> a(euk... $$0) {
         for (euk $$1 : $$0) {
            this.l = this.l.a(brv.a, $$1);
         }

         return this;
      }

      public bsa.a<T> a(euk $$0) {
         return this.a(brv.b, $$0);
      }

      public bsa.a<T> c(float $$0) {
         return this.a(brv.b, 0.0F, -$$0, 0.0F);
      }

      public bsa.a<T> d(float $$0) {
         return this.a(brv.c, 0.0F, $$0, 0.0F);
      }

      public bsa.a<T> a(brv $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsa.a<T> a(brv $$0, euk $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsa.a<T> a() {
         this.e = false;
         return this;
      }

      public bsa.a<T> b() {
         this.d = false;
         return this;
      }

      public bsa.a<T> c() {
         this.f = true;
         return this;
      }

      public bsa.a<T> a(ddy... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsa.a<T> d() {
         this.g = true;
         return this;
      }

      public bsa.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsa.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsa.a<T> a(coh... $$0) {
         this.m = col.e.a($$0);
         return this;
      }

      public bsa<T> a(String $$0) {
         if (this.d) {
            ac.a(bfy.y, $$0);
         }

         return new bsa<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bru> {
      T create(bsa<T> var1, dax var2);
   }
}
