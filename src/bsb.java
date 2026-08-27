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

public class bsb<T extends brv> implements col, dxj<brv, T> {
   private static final Logger bJ = LogUtils.getLogger();
   private final ja.c<bsb<?>> bK = lh.g.f(this);
   private static final float bL = 1.3964844F;
   private static final int bM = 10;
   public static final bsb<cfk> a = a("allay", bsb.a.a(cfk::new, bsr.b).a(0.35F, 0.6F).a(0.36F).b(0.04F).a(8).b(2));
   public static final bsb<brr> b = a("area_effect_cloud", bsb.a.<brr>a(brr::new, bsr.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsb<cfn> c = a("armadillo", bsb.a.a(cfn::new, bsr.b).a(0.7F, 0.65F).a(0.26F).a(10));
   public static final bsb<chw> d = a("armor_stand", bsb.a.<chw>a(chw::new, bsr.h).a(0.5F, 1.975F).a(1.7775F).a(10));
   public static final bsb<cmg> e = a("arrow", bsb.a.<cmg>a(cmg::new, bsr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bsb<cng> f = a("vine_projectile", bsb.a.a(cng::new, bsr.h).a(0.1F, 0.1F).a(0.13F).a(4).b(20));
   public static final bsb<cfq> g = a("axolotl", bsb.a.a(cfq::new, bsr.d).a(0.75F, 0.42F).a(0.2751F).a(10));
   public static final bsb<cdy> h = a("bat", bsb.a.a(cdy::new, bsr.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bsb<cdz> i = a("batato", bsb.a.a(cdz::new, bsr.c).a(0.5F, 0.9F).a(0.45F).a(5));
   public static final bsb<cef> j = a("bee", bsb.a.a(cef::new, bsr.b).a(0.7F, 0.6F).a(0.3F).a(8));
   public static final bsb<cil> k = a("blaze", bsb.a.a(cil::new, bsr.a).c().a(0.6F, 1.8F).a(8));
   public static final bsb<bru.b> l = a("block_display", bsb.a.a(bru.b::new, bsr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsb<cny> m = a("boat", bsb.a.<cny>a(cny::new, bsr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bsb<cim> n = a("bogged", bsb.a.a(cim::new, bsr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8).a(cor.c));
   public static final bsb<cka> o = a("breeze", bsb.a.a(cka::new, bsr.a).a(0.6F, 1.77F).a(1.3452F).a(10).a(cor.c));
   public static final bsb<cnk> p = a("breeze_wind_charge", bsb.a.<cnk>a(cnk::new, bsr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cor.c));
   public static final bsb<cfv> q = a("camel", bsb.a.a(cfv::new, bsr.b).a(1.7F, 2.375F).a(2.275F).a(10));
   public static final bsb<ceh> r = a("cat", bsb.a.a(ceh::new, bsr.b).a(0.6F, 0.7F).a(0.35F).a(0.5125F).a(8));
   public static final bsb<cin> s = a("cave_spider", bsb.a.a(cin::new, bsr.a).a(0.7F, 0.5F).a(0.45F).a(8));
   public static final bsb<cnz> t = a("chest_boat", bsb.a.<cnz>a(cnz::new, bsr.h).a(1.375F, 0.5625F).a(0.5625F).a(10));
   public static final bsb<cod> u = a("chest_minecart", bsb.a.<cod>a(cod::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<cej> v = a("chicken", bsb.a.a(cej::new, bsr.b).a(0.4F, 0.7F).a(0.644F).a(new ewu(0.0, 0.7, -0.1)).a(10));
   public static final bsb<cek> w = a("cod", bsb.a.a(cek::new, bsr.g).a(0.5F, 0.3F).a(0.195F).a(4));
   public static final bsb<coe> x = a("command_block_minecart", bsb.a.<coe>a(coe::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<cel> y = a("cow", bsb.a.a(cel::new, bsr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bsb<cio> z = a("creeper", bsb.a.a(cio::new, bsr.a).a(0.6F, 1.7F).a(8));
   public static final bsb<cem> A = a("dolphin", bsb.a.a(cem::new, bsr.f).a(0.9F, 0.6F).a(0.3F));
   public static final bsb<cgj> B = a("donkey", bsb.a.a(cgj::new, bsr.b).a(1.3964844F, 1.5F).a(1.425F).a(1.1125F).a(10));
   public static final bsb<cmh> C = a("dragon_fireball", bsb.a.<cmh>a(cmh::new, bsr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsb<ciq> D = a("drowned", bsb.a.a(ciq::new, bsr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bsb<cnb> E = a("egg", bsb.a.<cnb>a(cnb::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<cir> F = a("elder_guardian", bsb.a.<cir>a(cir::b, bsr.a).a(1.9975F, 1.9975F).a(0.99875F).a(2.350625F).a(10));
   public static final bsb<cgz> G = a("end_crystal", bsb.a.<cgz>a(cgz::new, bsr.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsb<cha> H = a("ender_dragon", bsb.a.a(cha::new, bsr.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsb<cnc> I = a("ender_pearl", bsb.a.<cnc>a(cnc::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<cis> J = a("enderman", bsb.a.a(cis::new, bsr.a).a(0.6F, 2.9F).a(2.55F).a(2.80625F).a(8));
   public static final bsb<cit> K = a("endermite", bsb.a.a(cit::new, bsr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bsb<civ> L = a("evoker", bsb.a.a(civ::new, bsr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bsb<cmi> M = a("evoker_fangs", bsb.a.<cmi>a(cmi::new, bsr.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsb<cnd> N = a("experience_bottle", bsb.a.<cnd>a(cnd::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<bse> O = a("experience_orb", bsb.a.<bse>a(bse::new, bsr.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsb<cmj> P = a("eye_of_ender", bsb.a.<cmj>a(cmj::new, bsr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsb<cif> Q = a("falling_block", bsb.a.<cif>a(cif::new, bsr.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsb<cmm> R = a("firework_rocket", bsb.a.<cmm>a(cmm::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<ceo> S = a("fox", bsb.a.a(ceo::new, bsr.b).a(0.6F, 0.7F).a(0.4F).a(new ewu(0.0, 0.6375, -0.25)).a(8).a(dfe.pi));
   public static final bsb<cfy> T = a("frog", bsb.a.a(cfy::new, bsr.b).a(0.5F, 0.5F).a(new ewu(0.0, 0.375, -0.25)).a(10));
   public static final bsb<cof> U = a("furnace_minecart", bsb.a.<cof>a(cof::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<ciw> V = a("ghast", bsb.a.a(ciw::new, bsr.a).c().a(4.0F, 4.0F).a(2.6F).a(4.0625F).b(0.5F).a(10));
   public static final bsb<cix> W = a("giant", bsb.a.a(cix::new, bsr.a).a(3.6F, 12.0F).a(10.44F).b(-3.75F).a(10));
   public static final bsb<chx> X = a("glow_item_frame", bsb.a.<chx>a(chx::new, bsr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsb<bsg> Y = a("glow_squid", bsb.a.a(bsg::new, bsr.e).a(0.8F, 0.8F).a(0.4F).a(10));
   public static final bsb<cge> Z = a("goat", bsb.a.a(cge::new, bsr.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsb<ciy> aa = a("guardian", bsb.a.a(ciy::c, bsr.a).a(0.85F, 0.85F).a(0.425F).a(0.975F).a(8));
   public static final bsb<cki> ab = a("hoglin", bsb.a.a(cki::new, bsr.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsb<cog> ac = a("hopper_minecart", bsb.a.<cog>a(cog::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<cgk> ad = a("horse", bsb.a.a(cgk::new, bsr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.44375F).a(10));
   public static final bsb<ciz> ae = a("husk", bsb.a.a(ciz::new, bsr.a).a(0.6F, 1.95F).a(1.74F).a(2.075F).b(-0.7F).a(8));
   public static final bsb<cja> af = a("illusioner", bsb.a.a(cja::new, bsr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bsb<bsj> ag = a("interaction", bsb.a.a(bsj::new, bsr.h).a(0.0F, 0.0F).a(10));
   public static final bsb<ceq> ah = a("iron_golem", bsb.a.a(ceq::new, bsr.h).a(1.4F, 2.7F).a(10));
   public static final bsb<cig> ai = a("item", bsb.a.<cig>a(cig::new, bsr.h).a(0.25F, 0.25F).a(0.2125F).a(6).b(20));
   public static final bsb<bru.g> aj = a("item_display", bsb.a.a(bru.g::new, bsr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsb<chz> ak = a("item_frame", bsb.a.<chz>a(chz::new, bsr.h).a(0.5F, 0.5F).a(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsb<cmp> al = a("fireball", bsb.a.<cmp>a(cmp::new, bsr.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsb<cia> am = a("leash_knot", bsb.a.<cia>a(cia::new, bsr.h).b().a(0.375F, 0.5F).a(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsb<bsn> an = a("lightning_bolt", bsb.a.a(bsn::new, bsr.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsb<cgl> ao = a("llama", bsb.a.a(cgl::new, bsr.b).a(0.9F, 1.87F).a(1.7765F).a(new ewu(0.0, 1.37, -0.3)).a(10));
   public static final bsb<cmr> ap = a("llama_spit", bsb.a.<cmr>a(cmr::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<cjb> aq = a("magma_cube", bsb.a.a(cjb::new, bsr.a).c().a(0.52F, 0.52F).a(0.325F).a(8));
   public static final bsb<bsp> ar = a("marker", bsb.a.a(bsp::new, bsr.h).a(0.0F, 0.0F).a(0));
   public static final bsb<coc> as = a("minecart", bsb.a.<coc>a(coc::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<cer> at = a("mooshroom", bsb.a.a(cer::new, bsr.b).a(0.9F, 1.4F).a(1.3F).a(1.36875F).a(10));
   public static final bsb<cgn> au = a("mule", bsb.a.a(cgn::new, bsr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.2125F).a(8));
   public static final bsb<ces> av = a("ocelot", bsb.a.a(ces::new, bsr.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsb<cib> aw = a("painting", bsb.a.<cib>a(cib::new, bsr.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsb<cet> ax = a("panda", bsb.a.a(cet::new, bsr.b).a(1.3F, 1.25F).a(10));
   public static final bsb<ceu> ay = a("parrot", bsb.a.a(ceu::new, bsr.b).a(0.5F, 0.9F).a(0.54F).a(0.4625F).a(8));
   public static final bsb<cjf> az = a("phantom", bsb.a.a(cjf::new, bsr.a).a(0.9F, 0.5F).a(0.175F).a(0.3375F).b(-0.125F).a(8));
   public static final bsb<cev> aA = a("pig", bsb.a.a(cev::new, bsr.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsb<cko> aB = a("piglin", bsb.a.a(cko::new, bsr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bsb<ckr> aC = a("piglin_brute", bsb.a.a(ckr::new, bsr.a).a(0.6F, 1.95F).a(1.79F).a(2.0125F).b(-0.7F).a(8));
   public static final bsb<cjg> aD = a("pillager", bsb.a.a(cjg::new, bsr.a).d().a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bsb<cir> aE = a("plaguewhale", bsb.a.a(cir::a, bsr.a).a(1.9975F, 0.99875F).a(0.499375F).a(1.1753125F).a(10));
   public static final bsb<cew> aF = a("polar_bear", bsb.a.a(cew::new, bsr.b).a(dfe.sa).a(1.4F, 1.4F).a(10));
   public static final bsb<cne> aG = a("potion", bsb.a.<cne>a(cne::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<cex> aH = a("pufferfish", bsb.a.a(cex::new, bsr.g).a(0.7F, 0.7F).a(0.455F).a(4));
   public static final bsb<cey> aI = a("rabbit", bsb.a.a(cey::new, bsr.b).a(0.4F, 0.5F).a(8));
   public static final bsb<cjj> aJ = a("ravager", bsb.a.a(cjj::new, bsr.a).a(1.95F, 2.2F).a(new ewu(0.0, 2.2625, -0.0625)).a(10));
   public static final bsb<cez> aK = a("salmon", bsb.a.a(cez::new, bsr.g).a(0.7F, 0.4F).a(0.26F).a(4));
   public static final bsb<cfa> aL = a("sheep", bsb.a.a(cfa::new, bsr.b).a(0.9F, 1.3F).a(1.235F).a(1.2375F).a(10));
   public static final bsb<cjk> aM = a("shulker", bsb.a.a(cjk::new, bsr.a).c().d().a(1.0F, 1.0F).a(0.5F).a(10));
   public static final bsb<cmv> aN = a("shulker_bullet", bsb.a.<cmv>a(cmv::new, bsr.h).a(0.3125F, 0.3125F).a(8));
   public static final bsb<cjl> aO = a("silverfish", bsb.a.a(cjl::new, bsr.a).a(0.4F, 0.3F).a(0.13F).a(0.2375F).a(8));
   public static final bsb<cjm> aP = a("skeleton", bsb.a.a(cjm::new, bsr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(8));
   public static final bsb<cgo> aQ = a("skeleton_horse", bsb.a.a(cgo::new, bsr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bsb<cjn> aR = a("slime", bsb.a.a(cjn::new, bsr.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bsb<cjc> aS = a("mega_spud", bsb.a.a(cjc::new, bsr.a).a(0.52F, 0.52F).a(0.325F).a(10));
   public static final bsb<cmw> aT = a("small_fireball", bsb.a.<cmw>a(cmw::new, bsr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsb<cgv> aU = a("sniffer", bsb.a.a(cgv::new, bsr.b).a(1.9F, 1.75F).a(1.05F).a(2.09375F).c(2.05F).a(10));
   public static final bsb<cfc> aV = a("snow_golem", bsb.a.a(cfc::new, bsr.h).a(dfe.sa).a(0.7F, 1.9F).a(1.7F).a(8));
   public static final bsb<cmx> aW = a("snowball", bsb.a.<cmx>a(cmx::new, bsr.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsb<coh> aX = a("spawner_minecart", bsb.a.<coh>a(coh::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<cmy> aY = a("spectral_arrow", bsb.a.<cmy>a(cmy::new, bsr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bsb<cjp> aZ = a("spider", bsb.a.a(cjp::new, bsr.a).a(1.4F, 0.9F).a(0.65F).a(0.765F).a(8));
   public static final bsb<cfd> ba = a("squid", bsb.a.a(cfd::new, bsr.f).a(0.8F, 0.8F).a(0.4F).a(8));
   public static final bsb<cjq> bb = a("stray", bsb.a.a(cjq::new, bsr.a).a(0.6F, 1.99F).a(1.74F).b(-0.7F).a(dfe.sa).a(8));
   public static final bsb<cjr> bc = a("strider", bsb.a.a(cjr::new, bsr.b).c().a(0.9F, 1.7F).a(10));
   public static final bsb<cgb> bd = a("tadpole", bsb.a.a(cgb::new, bsr.b).a(cgb.c, cgb.d).a(cgb.d * 0.65F).a(10));
   public static final bsb<bru.l> be = a("text_display", bsb.a.a(bru.l::new, bsr.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsb<cih> bf = a("tnt", bsb.a.<cih>a(cih::new, bsr.h).c().a(0.98F, 0.98F).a(0.15F).a(10).b(10));
   public static final bsb<coi> bg = a("tnt_minecart", bsb.a.<coi>a(coi::new, bsr.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsb<ciy> bh = a("toxifin", bsb.a.<ciy>a(ciy::d, bsr.a).a(0.85F, 0.425F).a(0.2125F).a(0.4875F).a(8));
   public static final bsb<cgq> bi = a("trader_llama", bsb.a.a(cgq::new, bsr.b).a(0.9F, 1.87F).a(1.7765F).a(new ewu(0.0, 1.37, -0.3)).a(10));
   public static final bsb<cnf> bj = a("trident", bsb.a.<cnf>a(cnf::new, bsr.h).a(0.5F, 0.5F).a(0.13F).a(4).b(20));
   public static final bsb<cfe> bk = a("tropical_fish", bsb.a.a(cfe::new, bsr.g).a(0.5F, 0.4F).a(0.26F).a(4));
   public static final bsb<cff> bl = a("turtle", bsb.a.a(cff::new, bsr.b).a(1.2F, 0.4F).a(new ewu(0.0, 0.55625, -0.25)).a(10));
   public static final bsb<cjs> bm = a("vex", bsb.a.a(cjs::new, bsr.a).c().a(0.4F, 0.8F).a(0.51875F).a(0.7375F).b(0.04F).a(8));
   public static final bsb<cll> bn = a("villager", bsb.a.<cll>a(cll::new, bsr.h).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bsb<cjt> bo = a("vindicator", bsb.a.a(cjt::new, bsr.a).a(0.6F, 1.95F).a(2.0F).b(-0.6F).a(8));
   public static final bsb<clr> bp = a("wandering_trader", bsb.a.a(clr::new, bsr.b).a(0.6F, 1.95F).a(1.62F).a(10));
   public static final bsb<clc> bq = a("warden", bsb.a.a(clc::new, bsr.a).a(0.9F, 2.9F).a(3.15F).a(brw.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsb<cnl> br = a("wind_charge", bsb.a.<cnl>a(cnl::new, bsr.h).a(0.3125F, 0.3125F).a(0.0F).a(4).b(10).a(cor.c));
   public static final bsb<cju> bs = a("witch", bsb.a.a(cju::new, bsr.a).a(0.6F, 1.95F).a(1.62F).a(2.2625F).a(8));
   public static final bsb<chu> bt = a("wither", bsb.a.a(chu::new, bsr.a).c().a(dfe.cN).a(0.9F, 3.5F).a(10));
   public static final bsb<cjv> bu = a("wither_skeleton", bsb.a.a(cjv::new, bsr.a).c().a(dfe.cN).a(0.7F, 2.4F).a(2.1F).b(-0.875F).a(8));
   public static final bsb<cnh> bv = a("wither_skull", bsb.a.<cnh>a(cnh::new, bsr.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsb<cfh> bw = a("wolf", bsb.a.a(cfh::new, bsr.b).a(0.6F, 0.85F).a(0.68F).a(new ewu(0.0, 0.81875, -0.0625)).a(10));
   public static final bsb<cjw> bx = a("zoglin", bsb.a.a(cjw::new, bsr.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsb<cjx> by = a("zombie", bsb.a.<cjx>a(cjx::new, bsr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bsb<cjh> bz = a("poisonous_potato_zombie", bsb.a.a(cjh::new, bsr.a).a(0.6F, 1.95F).a(1.74F).a(2.0125F).b(-0.7F).a(8));
   public static final bsb<cgs> bA = a("zombie_horse", bsb.a.a(cgs::new, bsr.b).a(1.3964844F, 1.6F).a(1.52F).a(1.31875F).a(10));
   public static final bsb<cjy> bB = a("zombie_villager", bsb.a.a(cjy::new, bsr.a).a(0.6F, 1.95F).a(2.125F).b(-0.7F).a(1.74F).a(8));
   public static final bsb<cjz> bC = a("zombified_piglin", bsb.a.a(cjz::new, bsr.a).c().a(0.6F, 1.95F).a(1.79F).a(2.0F).b(-0.7F).a(8));
   public static final bsb<cmk> bD = a("eye_of_potato", bsb.a.<cmk>a(cmk::new, bsr.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsb<cly> bE = a("player", bsb.a.<cly>a(bsr.h).b().a().a(0.6F, 1.8F).a(1.62F).a(cly.ce).a(32).b(2));
   public static final bsb<cmn> bF = a("fishing_bobber", bsb.a.<cmn>a(cmn::new, bsr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   public static final bsb<cmq> bG = a("lashing_potato_hook", bsb.a.<cmq>a(cmq::new, bsr.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   public static final bsb<coz> bH = a("grid_carrier", bsb.a.a(coz::new, bsr.h).a().a(0.0F, 0.0F).a(10).b(2));
   private final bsb.b<T> bN;
   private final bsr bO;
   private final ImmutableSet<dfc> bP;
   private final boolean bQ;
   private final boolean bR;
   private final boolean bS;
   private final boolean bT;
   private final int bU;
   private final int bV;
   @Nullable
   private String bW;
   @Nullable
   private xe bX;
   @Nullable
   private aks<eru> bY;
   private final bry bZ;
   private final cop ca;

   private static <T extends brv> bsb<T> a(String $$0, bsb.a<T> $$1) {
      return jn.a(lh.g, $$0, $$1.a($$0));
   }

   public static akt a(bsb<?> $$0) {
      return lh.g.b($$0);
   }

   public static Optional<bsb<?>> a(String $$0) {
      return lh.g.b(akt.a($$0));
   }

   public bsb(bsb.b<T> $$0, bsr $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfc> $$6, bry $$7, int $$8, int $$9, cop $$10) {
      this.bN = $$0;
      this.bO = $$1;
      this.bT = $$5;
      this.bQ = $$2;
      this.bR = $$3;
      this.bS = $$4;
      this.bP = $$6;
      this.bZ = $$7;
      this.bU = $$8;
      this.bV = $$9;
      this.ca = $$10;
   }

   @Nullable
   public T a(aqt $$0, @Nullable cuh $$1, @Nullable cly $$2, ir $$3, bss $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends brv> Consumer<T> a(aqt $$0, cuh $$1, @Nullable cly $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends brv> Consumer<T> a(Consumer<T> $$0, aqt $$1, cuh $$2, @Nullable cly $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends brv> Consumer<T> a(Consumer<T> $$0, cuh $$1) {
      xe $$2 = $$1.a(ke.f);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends brv> Consumer<T> b(Consumer<T> $$0, aqt $$1, cuh $$2, @Nullable cly $$3) {
      cxf $$4 = $$2.a(ke.K, cxf.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqt $$0, ir $$1, bss $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqt $$0, @Nullable Consumer<T> $$1, ir $$2, bss $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqt $$0, @Nullable Consumer<T> $$1, ir $$2, bss $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dca)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cP());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, aym.g($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bsq $$9) {
            $$9.bl = $$9.dK();
            $$9.bj = $$9.dK();
            $$9.a($$0, $$0.d_($$9.du()), $$3, null);
            $$9.P();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dcd $$0, ir $$1, boolean $$2, ewp $$3) {
      ewp $$4 = new ewp($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<exn> $$5 = $$0.d(null, $$4);
      return 1.0 + exk.a(iw.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dca $$0, @Nullable cly $$1, @Nullable brv $$2, cxf $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cU() || $$1 != null && $$4.ah().f($$1.gk())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bQ;
   }

   public boolean c() {
      return this.bR;
   }

   public boolean d() {
      return this.bS;
   }

   public boolean e() {
      return this.bT;
   }

   public bsr f() {
      return this.bO;
   }

   public String g() {
      if (this.bW == null) {
         this.bW = ad.a("entity", lh.g.b(this));
      }

      return this.bW;
   }

   public xe h() {
      if (this.bX == null) {
         this.bX = xe.c(this.g());
      }

      return this.bX;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public aks<eru> j() {
      if (this.bY == null) {
         akt $$0 = lh.g.b(this);
         this.bY = aks.a(li.aU, $$0.d("entities/"));
      }

      return this.bY;
   }

   public float k() {
      return this.bZ.a();
   }

   public float l() {
      return this.bZ.b();
   }

   @Override
   public cop m() {
      return this.ca;
   }

   @Nullable
   public T a(dca $$0) {
      return !this.a($$0.K()) ? null : this.bN.create(this, $$0);
   }

   public static Optional<brv> a(uk $$0, dca $$1) {
      return ad.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bJ.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ewp a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ewp($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dtc $$0) {
      if (this.bP.contains($$0.b())) {
         return false;
      } else {
         return !this.bS && epr.a($$0) ? true : $$0.a(dfe.cN) || $$0.a(dfe.pi) || $$0.a(dfe.eE) || $$0.a(dfe.sa);
      }
   }

   public bry n() {
      return this.bZ;
   }

   public static Optional<bsb<?>> a(uk $$0) {
      return lh.g.b(new akt($$0.l("id")));
   }

   @Nullable
   public static brv a(uk $$0, dca $$1, Function<brv, brv> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uq $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               brv $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (brv)$$3;
      }).orElse(null);
   }

   public static Stream<brv> a(final List<? extends vh> $$0, final dca $$1) {
      final Spliterator<? extends vh> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<brv>() {
         @Override
         public boolean tryAdvance(Consumer<? super brv> $$0x) {
            return $$2.tryAdvance($$2xx -> bsb.a((uk)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<brv> trySplit() {
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

   private static Optional<brv> b(uk $$0, dca $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bJ.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bU;
   }

   public int p() {
      return this.bV;
   }

   public boolean q() {
      return this != bE && this != ap && this != bt && this != h && this != ak && this != X && this != am && this != aw && this != G && this != M;
   }

   public boolean a(awt<bsb<?>> $$0) {
      return this.bK.a($$0);
   }

   public boolean a(je<bsb<?>> $$0) {
      return $$0.a(this.bK);
   }

   @Nullable
   public T a(brv $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends brv> a() {
      return brv.class;
   }

   @Deprecated
   public ja.c<bsb<?>> r() {
      return this.bK;
   }

   public static class a<T extends brv> {
      private final bsb.b<T> a;
      private final bsr b;
      private ImmutableSet<dfc> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bry j = bry.b(0.6F, 1.8F);
      private brx.a k = brx.a();
      private cop l = cor.g;

      private a(bsb.b<T> $$0, bsr $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bsr.b || $$1 == bsr.h;
      }

      public static <T extends brv> bsb.a<T> a(bsb.b<T> $$0, bsr $$1) {
         return new bsb.a<>($$0, $$1);
      }

      public static <T extends brv> bsb.a<T> a(bsr $$0) {
         return new bsb.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsb.a<T> a(float $$0, float $$1) {
         this.j = bry.b($$0, $$1);
         return this;
      }

      public bsb.a<T> a(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsb.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.k = this.k.a(brw.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsb.a<T> a(ewu... $$0) {
         for (ewu $$1 : $$0) {
            this.k = this.k.a(brw.a, $$1);
         }

         return this;
      }

      public bsb.a<T> a(ewu $$0) {
         return this.a(brw.b, $$0);
      }

      public bsb.a<T> b(float $$0) {
         return this.a(brw.b, 0.0F, -$$0, 0.0F);
      }

      public bsb.a<T> c(float $$0) {
         return this.a(brw.c, 0.0F, $$0, 0.0F);
      }

      public bsb.a<T> a(brw $$0, float $$1, float $$2, float $$3) {
         this.k = this.k.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsb.a<T> a(brw $$0, ewu $$1) {
         this.k = this.k.a($$0, $$1);
         return this;
      }

      public bsb.a<T> a() {
         this.e = false;
         return this;
      }

      public bsb.a<T> b() {
         this.d = false;
         return this;
      }

      public bsb.a<T> c() {
         this.f = true;
         return this;
      }

      public bsb.a<T> a(dfc... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsb.a<T> d() {
         this.g = true;
         return this;
      }

      public bsb.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsb.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsb.a<T> a(com... $$0) {
         this.l = cor.e.a($$0);
         return this;
      }

      public bsb<T> a(String $$0) {
         if (this.d) {
            ad.a(bgf.y, $$0);
         }

         return new bsb<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.k), this.h, this.i, this.l);
      }
   }

   public interface b<T extends brv> {
      T create(bsb<T> var1, dca var2);
   }
}
