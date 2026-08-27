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

public class bsc<T extends brw> implements coi, dvk<brw, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ix.c<bsc<?>> bC = le.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsc<cfm> a = a("allay", bsc.a.a(cfm::new, bst.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsc<brs> b = a("area_effect_cloud", bsc.a.<brs>a(brs::new, bst.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsc<cfp> c = a("armadillo", bsc.a.a(cfp::new, bst.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsc<chy> d = a("armor_stand", bsc.a.<chy>a(chy::new, bst.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsc<cmg> e = a("arrow", bsc.a.<cmg>a(cmg::new, bst.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsc<cfs> f = a("axolotl", bsc.a.a(cfs::new, bst.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsc<ceb> g = a("bat", bsc.a.a(ceb::new, bst.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsc<ceh> h = a("bee", bsc.a.a(ceh::new, bst.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsc<cin> i = a("blaze", bsc.a.a(cin::new, bst.a).c().a(0.6F, 1.8F).a(8));
   public static final bsc<brv.b> j = a("block_display", bsc.a.a(brv.b::new, bst.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsc<cnv> k = a("boat", bsc.a.<cnv>a(cnv::new, bst.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsc<cio> l = a("bogged", bsc.a.a(cio::new, bst.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(coo.c));
   public static final bsc<cka> m = a("breeze", bsc.a.a(cka::new, bst.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(coo.c));
   public static final bsc<cnh> n = a("breeze_wind_charge", bsc.a.<cnh>a(cnh::new, bst.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(coo.c));
   public static final bsc<cfx> o = a("camel", bsc.a.a(cfx::new, bst.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsc<cej> p = a("cat", bsc.a.a(cej::new, bst.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsc<cip> q = a("cave_spider", bsc.a.a(cip::new, bst.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsc<cnw> r = a("chest_boat", bsc.a.<cnw>a(cnw::new, bst.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsc<coa> s = a("chest_minecart", bsc.a.<coa>a(coa::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<cel> t = a("chicken", bsc.a.a(cel::new, bst.b).a(0.4F, 0.7F).b(0.644F).a(new eum(0.0, 0.7, -0.1)).a(10));
   public static final bsc<cem> u = a("cod", bsc.a.a(cem::new, bst.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsc<cob> v = a("command_block_minecart", bsc.a.<cob>a(cob::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<cen> w = a("cow", bsc.a.a(cen::new, bst.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsc<ciq> x = a("creeper", bsc.a.a(ciq::new, bst.a).a(0.6F, 1.7F).a(8));
   public static final bsc<ceo> y = a("dolphin", bsc.a.a(ceo::new, bst.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsc<cgl> z = a("donkey", bsc.a.a(cgl::new, bst.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsc<cmh> A = a("dragon_fireball", bsc.a.<cmh>a(cmh::new, bst.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsc<cis> B = a("drowned", bsc.a.a(cis::new, bst.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsc<cmz> C = a("egg", bsc.a.<cmz>a(cmz::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<cit> D = a("elder_guardian", bsc.a.a(cit::new, bst.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsc<chb> E = a("end_crystal", bsc.a.<chb>a(chb::new, bst.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsc<chc> F = a("ender_dragon", bsc.a.a(chc::new, bst.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsc<cna> G = a("ender_pearl", bsc.a.<cna>a(cna::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<ciu> H = a("enderman", bsc.a.a(ciu::new, bst.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsc<civ> I = a("endermite", bsc.a.a(civ::new, bst.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsc<cix> J = a("evoker", bsc.a.a(cix::new, bst.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsc<cmi> K = a("evoker_fangs", bsc.a.<cmi>a(cmi::new, bst.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsc<cnb> L = a("experience_bottle", bsc.a.<cnb>a(cnb::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<bsg> M = a("experience_orb", bsc.a.<bsg>a(bsg::new, bst.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsc<cmj> N = a("eye_of_ender", bsc.a.<cmj>a(cmj::new, bst.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsc<cih> O = a("falling_block", bsc.a.<cih>a(cih::new, bst.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsc<cml> P = a("firework_rocket", bsc.a.<cml>a(cml::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<ceq> Q = a("fox", bsc.a.a(ceq::new, bst.b).a(0.6F, 0.7F).b(0.4F).a(new eum(0.0, 0.6375, -0.25)).a(8).a(dec.oi));
   public static final bsc<cga> R = a("frog", bsc.a.a(cga::new, bst.b).a(0.5F, 0.5F).a(new eum(0.0, 0.375, -0.25)).a(10));
   public static final bsc<coc> S = a("furnace_minecart", bsc.a.<coc>a(coc::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<ciy> T = a("ghast", bsc.a.a(ciy::new, bst.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsc<ciz> U = a("giant", bsc.a.a(ciz::new, bst.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsc<chz> V = a("glow_item_frame", bsc.a.<chz>a(chz::new, bst.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsc<bsi> W = a("glow_squid", bsc.a.a(bsi::new, bst.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsc<cgg> X = a("goat", bsc.a.a(cgg::new, bst.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsc<cja> Y = a("guardian", bsc.a.a(cja::new, bst.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsc<cki> Z = a("hoglin", bsc.a.a(cki::new, bst.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsc<cod> aa = a("hopper_minecart", bsc.a.<cod>a(cod::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<cgm> ab = a("horse", bsc.a.a(cgm::new, bst.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsc<cjb> ac = a("husk", bsc.a.a(cjb::new, bst.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsc<cjc> ad = a("illusioner", bsc.a.a(cjc::new, bst.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsc<bsl> ae = a("interaction", bsc.a.a(bsl::new, bst.h).a(0.0F, 0.0F).a(10));
   public static final bsc<ces> af = a("iron_golem", bsc.a.a(ces::new, bst.h).a(1.4F, 2.7F).a(10));
   public static final bsc<cii> ag = a("item", bsc.a.<cii>a(cii::new, bst.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsc<brv.g> ah = a("item_display", bsc.a.a(brv.g::new, bst.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsc<cib> ai = a("item_frame", bsc.a.<cib>a(cib::new, bst.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsc<bsx> aj = a("ominous_item_spawner", bsc.a.a(bsx::new, bst.h).a(0.25F, 0.25F).a(8).a(coo.c));
   public static final bsc<cmo> ak = a("fireball", bsc.a.<cmo>a(cmo::new, bst.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsc<cic> al = a("leash_knot", bsc.a.<cic>a(cic::new, bst.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsc<bsp> am = a("lightning_bolt", bsc.a.a(bsp::new, bst.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsc<cgn> an = a("llama", bsc.a.a(cgn::new, bst.b).a(0.9F, 1.87F).b(1.7765F).a(new eum(0.0, 1.37, -0.3)).a(10));
   public static final bsc<cmp> ao = a("llama_spit", bsc.a.<cmp>a(cmp::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<cjd> ap = a("magma_cube", bsc.a.a(cjd::new, bst.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsc<bsr> aq = a("marker", bsc.a.a(bsr::new, bst.h).a(0.0F, 0.0F).a(0));
   public static final bsc<cnz> ar = a("minecart", bsc.a.<cnz>a(cnz::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<cet> as = a("mooshroom", bsc.a.a(cet::new, bst.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsc<cgp> at = a("mule", bsc.a.a(cgp::new, bst.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsc<ceu> au = a("ocelot", bsc.a.a(ceu::new, bst.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsc<cid> av = a("painting", bsc.a.<cid>a(cid::new, bst.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsc<cev> aw = a("panda", bsc.a.a(cev::new, bst.b).a(1.3F, 1.25F).a(10));
   public static final bsc<cew> ax = a("parrot", bsc.a.a(cew::new, bst.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsc<cjg> ay = a("phantom", bsc.a.a(cjg::new, bst.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsc<cex> az = a("pig", bsc.a.a(cex::new, bst.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsc<cko> aA = a("piglin", bsc.a.a(cko::new, bst.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsc<ckr> aB = a("piglin_brute", bsc.a.a(ckr::new, bst.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsc<cjh> aC = a("pillager", bsc.a.a(cjh::new, bst.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsc<cey> aD = a("polar_bear", bsc.a.a(cey::new, bst.b).a(dec.qP).a(1.4F, 1.4F).a(10));
   public static final bsc<cnc> aE = a("potion", bsc.a.<cnc>a(cnc::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<cez> aF = a("pufferfish", bsc.a.a(cez::new, bst.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsc<cfa> aG = a("rabbit", bsc.a.a(cfa::new, bst.b).a(0.4F, 0.5F).a(8));
   public static final bsc<cjj> aH = a("ravager", bsc.a.a(cjj::new, bst.a).a(1.95F, 2.2F).a(new eum(0.0, 2.2625, -0.0625)).a(10));
   public static final bsc<cfb> aI = a("salmon", bsc.a.a(cfb::new, bst.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsc<cfc> aJ = a("sheep", bsc.a.a(cfc::new, bst.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsc<cjk> aK = a("shulker", bsc.a.a(cjk::new, bst.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsc<cmt> aL = a("shulker_bullet", bsc.a.<cmt>a(cmt::new, bst.h).a(0.3125F, 0.3125F).a(8));
   public static final bsc<cjl> aM = a("silverfish", bsc.a.a(cjl::new, bst.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsc<cjm> aN = a("skeleton", bsc.a.a(cjm::new, bst.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsc<cgq> aO = a("skeleton_horse", bsc.a.a(cgq::new, bst.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsc<cjn> aP = a("slime", bsc.a.a(cjn::new, bst.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsc<cmu> aQ = a("small_fireball", bsc.a.<cmu>a(cmu::new, bst.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsc<cgx> aR = a("sniffer", bsc.a.a(cgx::new, bst.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsc<cfe> aS = a("snow_golem", bsc.a.a(cfe::new, bst.h).a(dec.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsc<cmv> aT = a("snowball", bsc.a.<cmv>a(cmv::new, bst.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsc<coe> aU = a("spawner_minecart", bsc.a.<coe>a(coe::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<cmw> aV = a("spectral_arrow", bsc.a.<cmw>a(cmw::new, bst.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsc<cjp> aW = a("spider", bsc.a.a(cjp::new, bst.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsc<cff> aX = a("squid", bsc.a.a(cff::new, bst.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsc<cjq> aY = a("stray", bsc.a.a(cjq::new, bst.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dec.qP).a(8));
   public static final bsc<cjr> aZ = a("strider", bsc.a.a(cjr::new, bst.b).c().a(0.9F, 1.7F).a(10));
   public static final bsc<cgd> ba = a("tadpole", bsc.a.a(cgd::new, bst.b).a(cgd.c, cgd.d).b(cgd.d * 0.65F).a(10));
   public static final bsc<brv.l> bb = a("text_display", bsc.a.a(brv.l::new, bst.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsc<cij> bc = a("tnt", bsc.a.<cij>a(cij::new, bst.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsc<cof> bd = a("tnt_minecart", bsc.a.<cof>a(cof::new, bst.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsc<cgs> be = a("trader_llama", bsc.a.a(cgs::new, bst.b).a(0.9F, 1.87F).b(1.7765F).a(new eum(0.0, 1.37, -0.3)).a(10));
   public static final bsc<cnd> bf = a("trident", bsc.a.<cnd>a(cnd::new, bst.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsc<cfg> bg = a("tropical_fish", bsc.a.a(cfg::new, bst.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsc<cfh> bh = a("turtle", bsc.a.a(cfh::new, bst.b).a(1.2F, 0.4F).a(new eum(0.0, 0.55625, -0.25)).a(10));
   public static final bsc<cjs> bi = a("vex", bsc.a.a(cjs::new, bst.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsc<cll> bj = a("villager", bsc.a.<cll>a(cll::new, bst.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsc<cjt> bk = a("vindicator", bsc.a.a(cjt::new, bst.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsc<clr> bl = a("wandering_trader", bsc.a.a(clr::new, bst.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsc<clc> bm = a("warden", bsc.a.a(clc::new, bst.a).a(0.9F, 2.9F).a(3.15F).a(brx.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsc<cni> bn = a("wind_charge", bsc.a.<cni>a(cni::new, bst.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(coo.c));
   public static final bsc<cju> bo = a("witch", bsc.a.a(cju::new, bst.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsc<chw> bp = a("wither", bsc.a.a(chw::new, bst.a).c().a(dec.cd).a(0.9F, 3.5F).a(10));
   public static final bsc<cjv> bq = a("wither_skeleton", bsc.a.a(cjv::new, bst.a).c().a(dec.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsc<cne> br = a("wither_skull", bsc.a.<cne>a(cne::new, bst.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsc<cfj> bs = a("wolf", bsc.a.a(cfj::new, bst.b).a(0.6F, 0.85F).b(0.68F).a(new eum(0.0, 0.81875, -0.0625)).a(10));
   public static final bsc<cjw> bt = a("zoglin", bsc.a.a(cjw::new, bst.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsc<cjx> bu = a("zombie", bsc.a.<cjx>a(cjx::new, bst.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsc<cgu> bv = a("zombie_horse", bsc.a.a(cgu::new, bst.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsc<cjy> bw = a("zombie_villager", bsc.a.a(cjy::new, bst.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsc<cjz> bx = a("zombified_piglin", bsc.a.a(cjz::new, bst.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsc<cly> by = a("player", bsc.a.<cly>a(bst.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cly.bT).a(32).b(2));
   public static final bsc<cmm> bz = a("fishing_bobber", bsc.a.<cmm>a(cmm::new, bst.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsc.b<T> bF;
   private final bst bG;
   private final ImmutableSet<dea> bH;
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
   private akm<epm> bQ;
   private final brz bR;
   private final float bS;
   private final col bT;

   private static <T extends brw> bsc<T> a(String $$0, bsc.a<T> $$1) {
      return jk.a(le.g, $$0, $$1.a($$0));
   }

   public static akn a(bsc<?> $$0) {
      return le.g.b($$0);
   }

   public static Optional<bsc<?>> a(String $$0) {
      return le.g.b(akn.a($$0));
   }

   public bsc(bsc.b<T> $$0, bst $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dea> $$6, brz $$7, float $$8, int $$9, int $$10, col $$11) {
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
   public T a(aqn $$0, @Nullable ctq $$1, @Nullable cly $$2, io $$3, bsu $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends brw> Consumer<T> a(aqn $$0, ctq $$1, @Nullable cly $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends brw> Consumer<T> a(Consumer<T> $$0, aqn $$1, ctq $$2, @Nullable cly $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends brw> Consumer<T> a(Consumer<T> $$0, ctq $$1) {
      wx $$2 = $$1.a(kb.f);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends brw> Consumer<T> b(Consumer<T> $$0, aqn $$1, ctq $$2, @Nullable cly $$3) {
      cwf $$4 = $$2.a(kb.L, cwf.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqn $$0, io $$1, bsu $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqn $$0, @Nullable Consumer<T> $$1, io $$2, bsu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqn $$0, @Nullable Consumer<T> $$1, io $$2, bsu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((daz)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayf.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bss $$9) {
            $$9.ba = $$9.dF();
            $$9.aY = $$9.dF();
            $$9.a($$0, $$0.d_($$9.dp()), $$3, null);
            $$9.P();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dbc $$0, io $$1, boolean $$2, euh $$3) {
      euh $$4 = new euh($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<evf> $$5 = $$0.d(null, $$4);
      return 1.0 + evc.a(it.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(daz $$0, @Nullable cly $$1, @Nullable brw $$2, cwf $$3) {
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

   public bst f() {
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

   public akm<epm> k() {
      if (this.bQ == null) {
         akn $$0 = le.g.b(this);
         this.bQ = akm.a(lf.aU, $$0.d("entities/"));
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
   public col i() {
      return this.bT;
   }

   @Nullable
   public T a(daz $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<brw> a(ud $$0, daz $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public euh a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new euh($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(drd $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && enj.a($$0) ? true : $$0.a(dec.cd) || $$0.a(dec.oi) || $$0.a(dec.dQ) || $$0.a(dec.qP);
      }
   }

   public brz n() {
      return this.bR;
   }

   public static Optional<bsc<?>> a(ud $$0) {
      return le.g.b(new akn($$0.l("id")));
   }

   @Nullable
   public static brw a(ud $$0, daz $$1, Function<brw, brw> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uj $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               brw $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (brw)$$3;
      }).orElse(null);
   }

   public static Stream<brw> a(final List<? extends va> $$0, final daz $$1) {
      final Spliterator<? extends va> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<brw>() {
         @Override
         public boolean tryAdvance(Consumer<? super brw> $$0x) {
            return $$2.tryAdvance($$2xx -> bsc.a((ud)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<brw> trySplit() {
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

   private static Optional<brw> b(ud $$0, daz $$1) {
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

   public boolean a(awm<bsc<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jb<bsc<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(brw $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends brw> a() {
      return brw.class;
   }

   @Deprecated
   public ix.c<bsc<?>> r() {
      return this.bC;
   }

   public static class a<T extends brw> {
      private final bsc.b<T> a;
      private final bst b;
      private ImmutableSet<dea> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private brz j = brz.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bry.a l = bry.a();
      private col m = coo.g;

      private a(bsc.b<T> $$0, bst $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bst.b || $$1 == bst.h;
      }

      public static <T extends brw> bsc.a<T> a(bsc.b<T> $$0, bst $$1) {
         return new bsc.a<>($$0, $$1);
      }

      public static <T extends brw> bsc.a<T> a(bst $$0) {
         return new bsc.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsc.a<T> a(float $$0, float $$1) {
         this.j = brz.b($$0, $$1);
         return this;
      }

      public bsc.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsc.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsc.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(brx.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsc.a<T> a(eum... $$0) {
         for (eum $$1 : $$0) {
            this.l = this.l.a(brx.a, $$1);
         }

         return this;
      }

      public bsc.a<T> a(eum $$0) {
         return this.a(brx.b, $$0);
      }

      public bsc.a<T> c(float $$0) {
         return this.a(brx.b, 0.0F, -$$0, 0.0F);
      }

      public bsc.a<T> d(float $$0) {
         return this.a(brx.c, 0.0F, $$0, 0.0F);
      }

      public bsc.a<T> a(brx $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsc.a<T> a(brx $$0, eum $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsc.a<T> a() {
         this.e = false;
         return this;
      }

      public bsc.a<T> b() {
         this.d = false;
         return this;
      }

      public bsc.a<T> c() {
         this.f = true;
         return this;
      }

      public bsc.a<T> a(dea... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsc.a<T> d() {
         this.g = true;
         return this;
      }

      public bsc.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsc.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsc.a<T> a(coj... $$0) {
         this.m = coo.e.a($$0);
         return this;
      }

      public bsc<T> a(String $$0) {
         if (this.d) {
            ac.a(bga.y, $$0);
         }

         return new bsc<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends brw> {
      T create(bsc<T> var1, daz var2);
   }
}
