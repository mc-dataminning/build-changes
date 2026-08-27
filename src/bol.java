import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bol<T extends bof> implements cki, dqf<bof, T> {
   private static final Logger bz = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final il.c<bol<?>> bA = kh.g.g(this);
   private static final float bB = 1.3964844F;
   private static final int bC = 10;
   public static final bol<cbq> b = a("allay", bol.a.a(cbq::new, bpa.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bol<boc> c = a("area_effect_cloud", bol.a.<boc>a(boc::new, bpa.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bol<cbt> d = a("armadillo", bol.a.a(cbt::new, bpa.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bol<ceb> e = a("armor_stand", bol.a.<ceb>a(ceb::new, bpa.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bol<cii> f = a("arrow", bol.a.<cii>a(cii::new, bpa.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bol<cbw> g = a("axolotl", bol.a.a(cbw::new, bpa.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bol<cah> h = a("bat", bol.a.a(cah::new, bpa.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bol<can> i = a("bee", bol.a.a(can::new, bpa.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bol<ceq> j = a("blaze", bol.a.a(ceq::new, bpa.a).c().a(0.6F, 1.8F).a(8));
   public static final bol<boe.b> k = a("block_display", bol.a.a(boe.b::new, bpa.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bol<cjv> l = a("boat", bol.a.<cjv>a(cjv::new, bpa.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bol<cgc> m = a("breeze", bol.a.a(cgc::new, bpa.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(ckn.c));
   public static final bol<ccb> n = a("camel", bol.a.a(ccb::new, bpa.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bol<cap> o = a("cat", bol.a.a(cap::new, bpa.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bol<cer> p = a("cave_spider", bol.a.a(cer::new, bpa.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bol<cjw> q = a("chest_boat", bol.a.<cjw>a(cjw::new, bpa.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bol<cka> r = a("chest_minecart", bol.a.<cka>a(cka::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<car> s = a("chicken", bol.a.a(car::new, bpa.b).a(0.4F, 0.7F).a(0.644F).a(new eov(0.0, 0.7, -0.1)).a(10));
   public static final bol<cas> t = a("cod", bol.a.a(cas::new, bpa.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bol<ckb> u = a("command_block_minecart", bol.a.<ckb>a(ckb::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<cat> v = a("cow", bol.a.a(cat::new, bpa.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bol<ces> w = a("creeper", bol.a.a(ces::new, bpa.a).a(0.6F, 1.7F).a(8));
   public static final bol<cau> x = a("dolphin", bol.a.a(cau::new, bpa.f).a(0.9F, 0.6F).a(0.3F));
   public static final bol<ccp> y = a("donkey", bol.a.a(ccp::new, bpa.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bol<cij> z = a("dragon_fireball", bol.a.<cij>a(cij::new, bpa.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bol<ceu> A = a("drowned", bol.a.a(ceu::new, bpa.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bol<cjb> B = a("egg", bol.a.<cjb>a(cjb::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<cev> C = a("elder_guardian", bol.a.a(cev::new, bpa.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bol<cde> D = a("end_crystal", bol.a.<cde>a(cde::new, bpa.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bol<cdf> E = a("ender_dragon", bol.a.a(cdf::new, bpa.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bol<cjc> F = a("ender_pearl", bol.a.<cjc>a(cjc::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<cew> G = a("enderman", bol.a.a(cew::new, bpa.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bol<cex> H = a("endermite", bol.a.a(cex::new, bpa.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bol<cez> I = a("evoker", bol.a.a(cez::new, bpa.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bol<cik> J = a("evoker_fangs", bol.a.<cik>a(cik::new, bpa.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bol<cjd> K = a("experience_bottle", bol.a.<cjd>a(cjd::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<bon> L = a("experience_orb", bol.a.<bon>a(bon::new, bpa.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bol<cil> M = a("eye_of_ender", bol.a.<cil>a(cil::new, bpa.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bol<cek> N = a("falling_block", bol.a.<cek>a(cek::new, bpa.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bol<cin> O = a("firework_rocket", bol.a.<cin>a(cin::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<caw> P = a("fox", bol.a.a(caw::new, bpa.b).a(0.6F, 0.7F).a(0.4F).a(new eov(0.0, 0.6375, -0.25)).a(8).a(czh.oi));
   public static final bol<cce> Q = a("frog", bol.a.a(cce::new, bpa.b).a(0.5F, 0.5F).a(new eov(0.0, 0.375, -0.25)).a(10));
   public static final bol<ckc> R = a("furnace_minecart", bol.a.<ckc>a(ckc::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<cfa> S = a("ghast", bol.a.a(cfa::new, bpa.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bol<cfb> T = a("giant", bol.a.a(cfb::new, bpa.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bol<cec> U = a("glow_item_frame", bol.a.<cec>a(cec::new, bpa.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bol<bop> V = a("glow_squid", bol.a.a(bop::new, bpa.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bol<cck> W = a("goat", bol.a.a(cck::new, bpa.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bol<cfc> X = a("guardian", bol.a.a(cfc::new, bpa.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bol<cgk> Y = a("hoglin", bol.a.a(cgk::new, bpa.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bol<ckd> Z = a("hopper_minecart", bol.a.<ckd>a(ckd::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<ccq> aa = a("horse", bol.a.a(ccq::new, bpa.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bol<cfd> ab = a("husk", bol.a.a(cfd::new, bpa.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bol<cfe> ac = a("illusioner", bol.a.a(cfe::new, bpa.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bol<bos> ad = a("interaction", bol.a.a(bos::new, bpa.h).a(0.0F, 0.0F).a(10));
   public static final bol<cay> ae = a("iron_golem", bol.a.a(cay::new, bpa.h).a(1.4F, 2.7F).a(10));
   public static final bol<cel> af = a("item", bol.a.<cel>a(cel::new, bpa.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bol<boe.g> ag = a("item_display", bol.a.a(boe.g::new, bpa.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bol<cee> ah = a("item_frame", bol.a.<cee>a(cee::new, bpa.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bol<ciq> ai = a("fireball", bol.a.<ciq>a(ciq::new, bpa.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bol<cef> aj = a("leash_knot", bol.a.<cef>a(cef::new, bpa.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bol<bow> ak = a("lightning_bolt", bol.a.a(bow::new, bpa.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bol<ccr> al = a("llama", bol.a.a(ccr::new, bpa.b).a(0.9F, 1.87F).a(1.7765F).a(new eov(0.0, 1.37, -0.3)).a(10));
   public static final bol<cir> am = a("llama_spit", bol.a.<cir>a(cir::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<cff> an = a("magma_cube", bol.a.a(cff::new, bpa.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bol<boy> ao = a("marker", bol.a.a(boy::new, bpa.h).a(0.0F, 0.0F).a(0));
   public static final bol<cjz> ap = a("minecart", bol.a.<cjz>a(cjz::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<caz> aq = a("mooshroom", bol.a.a(caz::new, bpa.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bol<cct> ar = a("mule", bol.a.a(cct::new, bpa.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bol<cba> as = a("ocelot", bol.a.a(cba::new, bpa.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bol<ceg> at = a("painting", bol.a.<ceg>a(ceg::new, bpa.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bol<cbb> au = a("panda", bol.a.a(cbb::new, bpa.b).a(1.3F, 1.25F).a(10));
   public static final bol<cbc> av = a("parrot", bol.a.a(cbc::new, bpa.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bol<cfi> aw = a("phantom", bol.a.a(cfi::new, bpa.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bol<cbd> ax = a("pig", bol.a.a(cbd::new, bpa.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bol<cgq> ay = a("piglin", bol.a.a(cgq::new, bpa.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bol<cgt> az = a("piglin_brute", bol.a.a(cgt::new, bpa.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bol<cfj> aA = a("pillager", bol.a.a(cfj::new, bpa.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bol<cbe> aB = a("polar_bear", bol.a.a(cbe::new, bpa.b).a(czh.qP).a(1.4F, 1.4F).a(10));
   public static final bol<cje> aC = a("potion", bol.a.<cje>a(cje::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<cbf> aD = a("pufferfish", bol.a.a(cbf::new, bpa.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bol<cbg> aE = a("rabbit", bol.a.a(cbg::new, bpa.b).a(0.4F, 0.5F).a(8));
   public static final bol<cfl> aF = a("ravager", bol.a.a(cfl::new, bpa.a).a(1.95F, 2.2F).a(new eov(0.0, 2.2625, -0.0625)).a(10));
   public static final bol<cbh> aG = a("salmon", bol.a.a(cbh::new, bpa.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bol<cbi> aH = a("sheep", bol.a.a(cbi::new, bpa.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bol<cfm> aI = a("shulker", bol.a.a(cfm::new, bpa.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bol<civ> aJ = a("shulker_bullet", bol.a.<civ>a(civ::new, bpa.h).a(0.3125F, 0.3125F).a(8));
   public static final bol<cfn> aK = a("silverfish", bol.a.a(cfn::new, bpa.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bol<cfo> aL = a("skeleton", bol.a.a(cfo::new, bpa.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bol<ccu> aM = a("skeleton_horse", bol.a.a(ccu::new, bpa.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bol<cfp> aN = a("slime", bol.a.a(cfp::new, bpa.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bol<ciw> aO = a("small_fireball", bol.a.<ciw>a(ciw::new, bpa.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bol<cdb> aP = a("sniffer", bol.a.a(cdb::new, bpa.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bol<cbk> aQ = a("snow_golem", bol.a.a(cbk::new, bpa.h).a(czh.qP).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bol<cix> aR = a("snowball", bol.a.<cix>a(cix::new, bpa.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bol<cke> aS = a("spawner_minecart", bol.a.<cke>a(cke::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<ciy> aT = a("spectral_arrow", bol.a.<ciy>a(ciy::new, bpa.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bol<cfr> aU = a("spider", bol.a.a(cfr::new, bpa.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bol<cbl> aV = a("squid", bol.a.a(cbl::new, bpa.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bol<cfs> aW = a("stray", bol.a.a(cfs::new, bpa.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(czh.qP).a(8));
   public static final bol<cft> aX = a("strider", bol.a.a(cft::new, bpa.b).c().a(0.9F, 1.7F).a(10));
   public static final bol<cch> aY = a("tadpole", bol.a.a(cch::new, bpa.b).a(cch.c, cch.d).a(cch.d * 0.65F).a(10));
   public static final bol<boe.l> aZ = a("text_display", bol.a.a(boe.l::new, bpa.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bol<cem> ba = a("tnt", bol.a.<cem>a(cem::new, bpa.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bol<ckf> bb = a("tnt_minecart", bol.a.<ckf>a(ckf::new, bpa.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bol<ccw> bc = a("trader_llama", bol.a.a(ccw::new, bpa.b).a(0.9F, 1.87F).a(1.7765F).a(new eov(0.0, 1.37, -0.3)).a(10));
   public static final bol<cjf> bd = a("trident", bol.a.<cjf>a(cjf::new, bpa.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bol<cbm> be = a("tropical_fish", bol.a.a(cbm::new, bpa.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bol<cbn> bf = a("turtle", bol.a.a(cbn::new, bpa.b).a(1.2F, 0.4F).a(new eov(0.0, 0.55625, -0.25)).a(10));
   public static final bol<cfu> bg = a("vex", bol.a.a(cfu::new, bpa.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bol<chn> bh = a("villager", bol.a.<chn>a(chn::new, bpa.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bol<cfv> bi = a("vindicator", bol.a.a(cfv::new, bpa.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bol<cht> bj = a("wandering_trader", bol.a.a(cht::new, bpa.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bol<che> bk = a("warden", bol.a.a(che::new, bpa.a).a(0.9F, 2.9F).a(3.15F).a(bog.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bol<cjg> bl = a("wind_charge", bol.a.<cjg>a(cjg::new, bpa.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(ckn.c));
   public static final bol<cfw> bm = a("witch", bol.a.a(cfw::new, bpa.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bol<cdz> bn = a("wither", bol.a.a(cdz::new, bpa.a).c().a(czh.cd).a(0.9F, 3.5F).a(10));
   public static final bol<cfx> bo = a("wither_skeleton", bol.a.a(cfx::new, bpa.a).c().a(czh.cd).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bol<cjh> bp = a("wither_skull", bol.a.<cjh>a(cjh::new, bpa.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bol<cbp> bq = a("wolf", bol.a.a(cbp::new, bpa.b).a(0.6F, 0.85F).a(0.68F).a(new eov(0.0, 0.81875, -0.0625)).a(10));
   public static final bol<cfy> br = a("zoglin", bol.a.a(cfy::new, bpa.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bol<cfz> bs = a("zombie", bol.a.<cfz>a(cfz::new, bpa.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bol<ccy> bt = a("zombie_horse", bol.a.a(ccy::new, bpa.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bol<cga> bu = a("zombie_villager", bol.a.a(cga::new, bpa.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bol<cgb> bv = a("zombified_piglin", bol.a.a(cgb::new, bpa.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bol<cia> bw = a("player", bol.a.<cia>a(bpa.h).b().a().a(0.6F, 1.8F).a(1.62F).a(cia.bP).a(32).b(2));
   public static final bol<cio> bx = a("fishing_bobber", bol.a.<cio>a(cio::new, bpa.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bol.b<T> bD;
   private final bpa bE;
   private final ImmutableSet<czf> bF;
   private final boolean bG;
   private final boolean bH;
   private final boolean bI;
   private final boolean bJ;
   private final int bK;
   private final int bL;
   @Nullable
   private String bM;
   @Nullable
   private vs bN;
   @Nullable
   private ajc bO;
   private final boi bP;
   private final ckl bQ;

   private static <T extends bof> bol<T> a(String $$0, bol.a<T> $$1) {
      return ix.a(kh.g, $$0, $$1.a($$0));
   }

   public static ajc a(bol<?> $$0) {
      return kh.g.b($$0);
   }

   public static Optional<bol<?>> a(String $$0) {
      return kh.g.b(ajc.a($$0));
   }

   public bol(bol.b<T> $$0, bpa $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<czf> $$6, boi $$7, int $$8, int $$9, ckl $$10) {
      this.bD = $$0;
      this.bE = $$1;
      this.bJ = $$5;
      this.bG = $$2;
      this.bH = $$3;
      this.bI = $$4;
      this.bF = $$6;
      this.bP = $$7;
      this.bK = $$8;
      this.bL = $$9;
      this.bQ = $$10;
   }

   @Nullable
   public T a(apa $$0, @Nullable cpq $$1, @Nullable cia $$2, ib $$3, bpb $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bof> Consumer<T> a(apa $$0, cpq $$1, @Nullable cia $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bof> Consumer<T> a(Consumer<T> $$0, apa $$1, cpq $$2, @Nullable cia $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bof> Consumer<T> a(Consumer<T> $$0, cpq $$1) {
      return $$1.B() ? $$0.andThen($$1x -> $$1x.b($$1.z())) : $$0;
   }

   public static <T extends bof> Consumer<T> b(Consumer<T> $$0, apa $$1, cpq $$2, @Nullable cia $$3) {
      sy $$4 = $$2.w();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(apa $$0, ib $$1, bpb $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(apa $$0, @Nullable Consumer<T> $$1, ib $$2, bpb $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(apa $$0, @Nullable Consumer<T> $$1, ib $$2, bpb $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((cwe)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cE());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, awm.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof boz $$9) {
            $$9.aX = $$9.dz();
            $$9.aV = $$9.dz();
            $$9.a($$0, $$0.d_($$9.dj()), $$3, null);
            $$9.R();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(cwh $$0, ib $$1, boolean $$2, eoq $$3) {
      eoq $$4 = new eoq($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<epo> $$5 = $$0.d(null, $$4);
      return 1.0 + epl.a(ih.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cwe $$0, @Nullable cia $$1, @Nullable bof $$2, @Nullable sy $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cJ() || $$1 != null && $$4.ah().f($$1.fU())) {
               sy $$5 = $$2.f(new sy());
               UUID $$6 = $$2.ct();
               $$5.a($$3.p("EntityTag"));
               $$2.a_($$6);
               $$2.g($$5);
            }
         }
      }
   }

   public boolean b() {
      return this.bG;
   }

   public boolean c() {
      return this.bH;
   }

   public boolean d() {
      return this.bI;
   }

   public boolean e() {
      return this.bJ;
   }

   public bpa f() {
      return this.bE;
   }

   public String g() {
      if (this.bM == null) {
         this.bM = ac.a("entity", kh.g.b(this));
      }

      return this.bM;
   }

   public vs h() {
      if (this.bN == null) {
         this.bN = vs.c(this.g());
      }

      return this.bN;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public ajc j() {
      if (this.bO == null) {
         ajc $$0 = kh.g.b(this);
         this.bO = $$0.d("entities/");
      }

      return this.bO;
   }

   public float k() {
      return this.bP.a();
   }

   public float l() {
      return this.bP.b();
   }

   @Override
   public ckl m() {
      return this.bQ;
   }

   @Nullable
   public T a(cwe $$0) {
      return !this.a($$0.I()) ? null : this.bD.create(this, $$0);
   }

   public static Optional<bof> a(sy $$0, cwe $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bz.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eoq a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eoq($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dme $$0) {
      if (this.bF.contains($$0.b())) {
         return false;
      } else {
         return !this.bI && eil.a($$0) ? true : $$0.a(czh.cd) || $$0.a(czh.oi) || $$0.a(czh.dQ) || $$0.a(czh.qP);
      }
   }

   public boi n() {
      return this.bP;
   }

   public static Optional<bol<?>> a(sy $$0) {
      return kh.g.b(new ajc($$0.l("id")));
   }

   @Nullable
   public static bof a(sy $$0, cwe $$1, Function<bof, bof> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            te $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bof $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bof)$$3;
      }).orElse(null);
   }

   public static Stream<bof> a(final List<? extends tv> $$0, final cwe $$1) {
      final Spliterator<? extends tv> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bof>() {
         @Override
         public boolean tryAdvance(Consumer<? super bof> $$0x) {
            return $$2.tryAdvance($$2xx -> bol.a((sy)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bof> trySplit() {
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

   private static Optional<bof> b(sy $$0, cwe $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bz.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bK;
   }

   public int p() {
      return this.bL;
   }

   public boolean q() {
      return this != bw && this != am && this != bn && this != h && this != ah && this != U && this != aj && this != at && this != D && this != J;
   }

   public boolean a(aut<bol<?>> $$0) {
      return this.bA.a($$0);
   }

   public boolean a(ip<bol<?>> $$0) {
      return $$0.a(this.bA);
   }

   @Nullable
   public T a(bof $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bof> a() {
      return bof.class;
   }

   @Deprecated
   public il.c<bol<?>> r() {
      return this.bA;
   }

   public static class a<T extends bof> {
      private final bol.b<T> a;
      private final bpa b;
      private ImmutableSet<czf> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private boi j = boi.b(0.6F, 1.8F);
      private boh.a k = boh.a();
      private ckl l = ckn.g;

      private a(bol.b<T> $$0, bpa $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bpa.b || $$1 == bpa.h;
      }

      public static <T extends bof> bol.a<T> a(bol.b<T> $$0, bpa $$1) {
         return new bol.a<>($$0, $$1);
      }

      public static <T extends bof> bol.a<T> a(bpa $$0) {
         return new bol.a<>(($$0x, $$1) -> null, $$0);
      }

      public bol.a<T> a(float $$0, float $$1) {
         this.j = boi.b($$0, $$1);
         return this;
      }

      public bol.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bol.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(bog.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bol.a<T> a(eov... $$0) {
         for (eov $$1 : $$0) {
            this.k = this.k.a(bog.a, $$1);
         }

         return this;
      }

      public bol.a<T> a(eov $$0) {
         return this.a(bog.b, $$0);
      }

      public bol.a<T> b(float $$0) {
         return this.a(bog.b, 0.0F, -$$0, 0.0F);
      }

      public bol.a<T> c(float $$0) {
         return this.a(bog.c, 0.0F, $$0, 0.0F);
      }

      public bol.a<T> a(bog $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bol.a<T> a(bog $$0, eov $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bol.a<T> a() {
         this.e = false;
         return this;
      }

      public bol.a<T> b() {
         this.d = false;
         return this;
      }

      public bol.a<T> c() {
         this.f = true;
         return this;
      }

      public bol.a<T> a(czf... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bol.a<T> d() {
         this.g = true;
         return this;
      }

      public bol.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bol.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bol.a<T> a(ckj... $$0) {
         this.l = ckn.e.a($$0);
         return this;
      }

      public bol<T> a(String $$0) {
         if (this.d) {
            ac.a(bdt.x, $$0);
         }

         return new bol<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends bof> {
      T create(bol<T> var1, cwe var2);
   }
}
