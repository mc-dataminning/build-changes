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

public class biu<T extends biq> implements cdz, djh<biq, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final hg.c<biu<?>> bx = jd.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final biu<bvv> b = a("allay", biu.a.a(bvv::new, bjj.b).a(0.35F, 0.6F).a(8).b(2));
   public static final biu<bin> c = a("area_effect_cloud", biu.a.<bin>a(bin::new, bjj.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biu<byd> d = a("armor_stand", biu.a.<byd>a(byd::new, bjj.h).a(0.5F, 1.975F).a(10));
   public static final biu<ccc> e = a("arrow", biu.a.<ccc>a(ccc::new, bjj.h).a(0.5F, 0.5F).a(4).b(20));
   public static final biu<bvy> f = a("axolotl", biu.a.a(bvy::new, bjj.d).a(0.75F, 0.42F).a(10));
   public static final biu<bum> g = a("bat", biu.a.a(bum::new, bjj.c).a(0.5F, 0.9F).a(5));
   public static final biu<bus> h = a("bee", biu.a.a(bus::new, bjj.b).a(0.7F, 0.6F).a(8));
   public static final biu<bys> i = a("blaze", biu.a.a(bys::new, bjj.a).c().a(0.6F, 1.8F).a(8));
   public static final biu<bip.b> j = a("block_display", biu.a.a(bip.b::new, bjj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final biu<cdn> k = a("boat", biu.a.<cdn>a(cdn::new, bjj.h).a(1.375F, 0.5625F).a(10));
   public static final biu<bwd> l = a("camel", biu.a.a(bwd::new, bjj.b).a(1.7F, 2.375F).a(10));
   public static final biu<buu> m = a("cat", biu.a.a(buu::new, bjj.b).a(0.6F, 0.7F).a(8));
   public static final biu<byt> n = a("cave_spider", biu.a.a(byt::new, bjj.a).a(0.7F, 0.5F).a(8));
   public static final biu<cdo> o = a("chest_boat", biu.a.<cdo>a(cdo::new, bjj.h).a(1.375F, 0.5625F).a(10));
   public static final biu<cds> p = a("chest_minecart", biu.a.<cds>a(cds::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<buw> q = a("chicken", biu.a.a(buw::new, bjj.b).a(0.4F, 0.7F).a(10));
   public static final biu<bux> r = a("cod", biu.a.a(bux::new, bjj.g).a(0.5F, 0.3F).a(4));
   public static final biu<cdt> s = a("command_block_minecart", biu.a.<cdt>a(cdt::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<buy> t = a("cow", biu.a.a(buy::new, bjj.b).a(0.9F, 1.4F).a(10));
   public static final biu<byu> u = a("creeper", biu.a.a(byu::new, bjj.a).a(0.6F, 1.7F).a(8));
   public static final biu<buz> v = a("dolphin", biu.a.a(buz::new, bjj.f).a(0.9F, 0.6F));
   public static final biu<bwr> w = a("donkey", biu.a.a(bwr::new, bjj.b).a(1.3964844F, 1.5F).a(10));
   public static final biu<ccd> x = a("dragon_fireball", biu.a.<ccd>a(ccd::new, bjj.h).a(1.0F, 1.0F).a(4).b(10));
   public static final biu<byw> y = a("drowned", biu.a.a(byw::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<ccu> z = a("egg", biu.a.<ccu>a(ccu::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<byx> A = a("elder_guardian", biu.a.a(byx::new, bjj.a).a(1.9975F, 1.9975F).a(10));
   public static final biu<bxg> B = a("end_crystal", biu.a.<bxg>a(bxg::new, bjj.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final biu<bxh> C = a("ender_dragon", biu.a.a(bxh::new, bjj.a).c().a(16.0F, 8.0F).a(10));
   public static final biu<ccv> D = a("ender_pearl", biu.a.<ccv>a(ccv::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<byy> E = a("enderman", biu.a.a(byy::new, bjj.a).a(0.6F, 2.9F).a(8));
   public static final biu<byz> F = a("endermite", biu.a.a(byz::new, bjj.a).a(0.4F, 0.3F).a(8));
   public static final biu<bzb> G = a("evoker", biu.a.a(bzb::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<cce> H = a("evoker_fangs", biu.a.<cce>a(cce::new, bjj.h).a(0.5F, 0.8F).a(6).b(2));
   public static final biu<ccw> I = a("experience_bottle", biu.a.<ccw>a(ccw::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<biw> J = a("experience_orb", biu.a.<biw>a(biw::new, bjj.h).a(0.5F, 0.5F).a(6).b(20));
   public static final biu<ccf> K = a("eye_of_ender", biu.a.<ccf>a(ccf::new, bjj.h).a(0.25F, 0.25F).a(4).b(4));
   public static final biu<bym> L = a("falling_block", biu.a.<bym>a(bym::new, bjj.h).a(0.98F, 0.98F).a(10).b(20));
   public static final biu<cch> M = a("firework_rocket", biu.a.<cch>a(cch::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<bvb> N = a("fox", biu.a.a(bvb::new, bjj.b).a(0.6F, 0.7F).a(8).a(csw.oi));
   public static final biu<bwg> O = a("frog", biu.a.a(bwg::new, bjj.b).a(0.5F, 0.5F).a(10));
   public static final biu<cdu> P = a("furnace_minecart", biu.a.<cdu>a(cdu::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<bzc> Q = a("ghast", biu.a.a(bzc::new, bjj.a).c().a(4.0F, 4.0F).a(10));
   public static final biu<bzd> R = a("giant", biu.a.a(bzd::new, bjj.a).a(3.6F, 12.0F).a(10));
   public static final biu<bye> S = a("glow_item_frame", biu.a.<bye>a(bye::new, bjj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biu<biy> T = a("glow_squid", biu.a.a(biy::new, bjj.e).a(0.8F, 0.8F).a(10));
   public static final biu<bwm> U = a("goat", biu.a.a(bwm::new, bjj.b).a(0.9F, 1.3F).a(10));
   public static final biu<bze> V = a("guardian", biu.a.a(bze::new, bjj.a).a(0.85F, 0.85F).a(8));
   public static final biu<cae> W = a("hoglin", biu.a.a(cae::new, bjj.a).a(1.3964844F, 1.4F).a(8));
   public static final biu<cdv> X = a("hopper_minecart", biu.a.<cdv>a(cdv::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<bws> Y = a("horse", biu.a.a(bws::new, bjj.b).a(1.3964844F, 1.6F).a(10));
   public static final biu<bzf> Z = a("husk", biu.a.a(bzf::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<bzg> aa = a("illusioner", biu.a.a(bzg::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<bjb> ab = a("interaction", biu.a.a(bjb::new, bjj.h).a(0.0F, 0.0F).a(10));
   public static final biu<bvd> ac = a("iron_golem", biu.a.a(bvd::new, bjj.h).a(1.4F, 2.7F).a(10));
   public static final biu<byn> ad = a("item", biu.a.<byn>a(byn::new, bjj.h).a(0.25F, 0.25F).a(6).b(20));
   public static final biu<bip.g> ae = a("item_display", biu.a.a(bip.g::new, bjj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final biu<byg> af = a("item_frame", biu.a.<byg>a(byg::new, bjj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biu<cck> ag = a("fireball", biu.a.<cck>a(cck::new, bjj.h).a(1.0F, 1.0F).a(4).b(10));
   public static final biu<byh> ah = a("leash_knot", biu.a.<byh>a(byh::new, bjj.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biu<bjf> ai = a("lightning_bolt", biu.a.a(bjf::new, bjj.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final biu<bwt> aj = a("llama", biu.a.a(bwt::new, bjj.b).a(0.9F, 1.87F).a(10));
   public static final biu<ccl> ak = a("llama_spit", biu.a.<ccl>a(ccl::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<bzh> al = a("magma_cube", biu.a.a(bzh::new, bjj.a).c().a(2.04F, 2.04F).a(8));
   public static final biu<bjh> am = a("marker", biu.a.a(bjh::new, bjj.h).a(0.0F, 0.0F).a(0));
   public static final biu<cdr> an = a("minecart", biu.a.<cdr>a(cdr::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<bve> ao = a("mooshroom", biu.a.a(bve::new, bjj.b).a(0.9F, 1.4F).a(10));
   public static final biu<bwv> ap = a("mule", biu.a.a(bwv::new, bjj.b).a(1.3964844F, 1.6F).a(8));
   public static final biu<bvf> aq = a("ocelot", biu.a.a(bvf::new, bjj.b).a(0.6F, 0.7F).a(10));
   public static final biu<byi> ar = a("painting", biu.a.<byi>a(byi::new, bjj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biu<bvg> as = a("panda", biu.a.a(bvg::new, bjj.b).a(1.3F, 1.25F).a(10));
   public static final biu<bvh> at = a("parrot", biu.a.a(bvh::new, bjj.b).a(0.5F, 0.9F).a(8));
   public static final biu<bzk> au = a("phantom", biu.a.a(bzk::new, bjj.a).a(0.9F, 0.5F).a(8));
   public static final biu<bvi> av = a("pig", biu.a.a(bvi::new, bjj.b).a(0.9F, 0.9F).a(10));
   public static final biu<cak> aw = a("piglin", biu.a.a(cak::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<can> ax = a("piglin_brute", biu.a.a(can::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<bzl> ay = a("pillager", biu.a.a(bzl::new, bjj.a).d().a(0.6F, 1.95F).a(8));
   public static final biu<bvj> az = a("polar_bear", biu.a.a(bvj::new, bjj.b).a(csw.qC).a(1.4F, 1.4F).a(10));
   public static final biu<ccx> aA = a("potion", biu.a.<ccx>a(ccx::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<bvk> aB = a("pufferfish", biu.a.a(bvk::new, bjj.g).a(0.7F, 0.7F).a(4));
   public static final biu<bvl> aC = a("rabbit", biu.a.a(bvl::new, bjj.b).a(0.4F, 0.5F).a(8));
   public static final biu<bzn> aD = a("ravager", biu.a.a(bzn::new, bjj.a).a(1.95F, 2.2F).a(10));
   public static final biu<bvm> aE = a("salmon", biu.a.a(bvm::new, bjj.g).a(0.7F, 0.4F).a(4));
   public static final biu<bvn> aF = a("sheep", biu.a.a(bvn::new, bjj.b).a(0.9F, 1.3F).a(10));
   public static final biu<bzo> aG = a("shulker", biu.a.a(bzo::new, bjj.a).c().d().a(1.0F, 1.0F).a(10));
   public static final biu<cco> aH = a("shulker_bullet", biu.a.<cco>a(cco::new, bjj.h).a(0.3125F, 0.3125F).a(8));
   public static final biu<bzp> aI = a("silverfish", biu.a.a(bzp::new, bjj.a).a(0.4F, 0.3F).a(8));
   public static final biu<bzq> aJ = a("skeleton", biu.a.a(bzq::new, bjj.a).a(0.6F, 1.99F).a(8));
   public static final biu<bww> aK = a("skeleton_horse", biu.a.a(bww::new, bjj.b).a(1.3964844F, 1.6F).a(10));
   public static final biu<bzr> aL = a("slime", biu.a.a(bzr::new, bjj.a).a(2.04F, 2.04F).a(10));
   public static final biu<ccp> aM = a("small_fireball", biu.a.<ccp>a(ccp::new, bjj.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final biu<bxd> aN = a("sniffer", biu.a.a(bxd::new, bjj.b).a(1.9F, 1.75F).a(10));
   public static final biu<bvp> aO = a("snow_golem", biu.a.a(bvp::new, bjj.h).a(csw.qC).a(0.7F, 1.9F).a(8));
   public static final biu<ccq> aP = a("snowball", biu.a.<ccq>a(ccq::new, bjj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biu<cdw> aQ = a("spawner_minecart", biu.a.<cdw>a(cdw::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<ccr> aR = a("spectral_arrow", biu.a.<ccr>a(ccr::new, bjj.h).a(0.5F, 0.5F).a(4).b(20));
   public static final biu<bzt> aS = a("spider", biu.a.a(bzt::new, bjj.a).a(1.4F, 0.9F).a(8));
   public static final biu<bvq> aT = a("squid", biu.a.a(bvq::new, bjj.f).a(0.8F, 0.8F).a(8));
   public static final biu<bzu> aU = a("stray", biu.a.a(bzu::new, bjj.a).a(0.6F, 1.99F).a(csw.qC).a(8));
   public static final biu<bzv> aV = a("strider", biu.a.a(bzv::new, bjj.b).c().a(0.9F, 1.7F).a(10));
   public static final biu<bwj> aW = a("tadpole", biu.a.a(bwj::new, bjj.b).a(bwj.c, bwj.d).a(10));
   public static final biu<bip.l> aX = a("text_display", biu.a.a(bip.l::new, bjj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final biu<byo> aY = a("tnt", biu.a.<byo>a(byo::new, bjj.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final biu<cdx> aZ = a("tnt_minecart", biu.a.<cdx>a(cdx::new, bjj.h).a(0.98F, 0.7F).a(8));
   public static final biu<bwy> ba = a("trader_llama", biu.a.a(bwy::new, bjj.b).a(0.9F, 1.87F).a(10));
   public static final biu<ccy> bb = a("trident", biu.a.<ccy>a(ccy::new, bjj.h).a(0.5F, 0.5F).a(4).b(20));
   public static final biu<bvr> bc = a("tropical_fish", biu.a.a(bvr::new, bjj.g).a(0.5F, 0.4F).a(4));
   public static final biu<bvs> bd = a("turtle", biu.a.a(bvs::new, bjj.b).a(1.2F, 0.4F).a(10));
   public static final biu<bzw> be = a("vex", biu.a.a(bzw::new, bjj.a).c().a(0.4F, 0.8F).a(8));
   public static final biu<cbh> bf = a("villager", biu.a.<cbh>a(cbh::new, bjj.h).a(0.6F, 1.95F).a(10));
   public static final biu<bzx> bg = a("vindicator", biu.a.a(bzx::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<cbn> bh = a("wandering_trader", biu.a.a(cbn::new, bjj.b).a(0.6F, 1.95F).a(10));
   public static final biu<cay> bi = a("warden", biu.a.a(cay::new, bjj.a).a(0.9F, 2.9F).a(16).c());
   public static final biu<bzy> bj = a("witch", biu.a.a(bzy::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<byb> bk = a("wither", biu.a.a(byb::new, bjj.a).c().a(csw.cd).a(0.9F, 3.5F).a(10));
   public static final biu<bzz> bl = a("wither_skeleton", biu.a.a(bzz::new, bjj.a).c().a(csw.cd).a(0.7F, 2.4F).a(8));
   public static final biu<ccz> bm = a("wither_skull", biu.a.<ccz>a(ccz::new, bjj.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final biu<bvu> bn = a("wolf", biu.a.a(bvu::new, bjj.b).a(0.6F, 0.85F).a(10));
   public static final biu<caa> bo = a("zoglin", biu.a.a(caa::new, bjj.a).c().a(1.3964844F, 1.4F).a(8));
   public static final biu<cab> bp = a("zombie", biu.a.<cab>a(cab::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<bxa> bq = a("zombie_horse", biu.a.a(bxa::new, bjj.b).a(1.3964844F, 1.6F).a(10));
   public static final biu<cac> br = a("zombie_villager", biu.a.a(cac::new, bjj.a).a(0.6F, 1.95F).a(8));
   public static final biu<cad> bs = a("zombified_piglin", biu.a.a(cad::new, bjj.a).c().a(0.6F, 1.95F).a(8));
   public static final biu<cbu> bt = a("player", biu.a.<cbu>a(bjj.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final biu<cci> bu = a("fishing_bobber", biu.a.<cci>a(cci::new, bjj.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final biu.b<T> bA;
   private final bjj bB;
   private final ImmutableSet<csv> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private tl bK;
   @Nullable
   private aex bL;
   private final bir bM;
   private final cec bN;

   private static <T extends biq> biu<T> a(String $$0, biu.a<T> $$1) {
      return ht.a(jd.h, $$0, $$1.a($$0));
   }

   public static aex a(biu<?> $$0) {
      return jd.h.b($$0);
   }

   public static Optional<biu<?>> a(String $$0) {
      return jd.h.b(aex.a($$0));
   }

   public biu(biu.b<T> $$0, bjj $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<csv> $$6, bir $$7, int $$8, int $$9, cec $$10) {
      this.bA = $$0;
      this.bB = $$1;
      this.bG = $$5;
      this.bD = $$2;
      this.bE = $$3;
      this.bF = $$4;
      this.bC = $$6;
      this.bM = $$7;
      this.bH = $$8;
      this.bI = $$9;
      this.bN = $$10;
   }

   @Nullable
   public T a(akr $$0, @Nullable cjf $$1, @Nullable cbu $$2, gw $$3, bjk $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qx $$7;
      if ($$1 != null) {
         $$7 = $$1.v();
         $$8 = a($$0, $$1, $$2);
      } else {
         $$8 = $$0x -> {
         };
         $$7 = null;
      }

      return this.a($$0, $$7, $$8, $$3, $$4, $$5, $$6);
   }

   public static <T extends biq> Consumer<T> a(akr $$0, cjf $$1, @Nullable cbu $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends biq> Consumer<T> a(Consumer<T> $$0, akr $$1, cjf $$2, @Nullable cbu $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends biq> Consumer<T> a(Consumer<T> $$0, cjf $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends biq> Consumer<T> b(Consumer<T> $$0, akr $$1, cjf $$2, @Nullable cbu $$3) {
      qx $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(akr $$0, gw $$1, bjk $$2) {
      return this.a($$0, (qx)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(akr $$0, @Nullable qx $$1, @Nullable Consumer<T> $$2, gw $$3, bjk $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(akr $$0, @Nullable qx $$1, @Nullable Consumer<T> $$2, gw $$3, bjk $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cpv)$$0);
      if ($$7 == null) {
         return null;
      } else {
         double $$8;
         if ($$5) {
            $$7.e((double)$$3.u() + 0.5, (double)($$3.v() + 1), (double)$$3.w() + 0.5);
            $$8 = a($$0, $$3, $$6, $$7.cH());
         } else {
            $$8 = 0.0;
         }

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, arx.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bji $$10) {
            $$10.aW = $$10.dB();
            $$10.aU = $$10.dB();
            $$10.a($$0, $$0.d_($$10.dl()), $$4, null, $$1);
            $$10.P();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(cpy $$0, gw $$1, boolean $$2, ehi $$3) {
      ehi $$4 = new ehi($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eig> $$5 = $$0.d(null, $$4);
      return 1.0 + eid.a(hc.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cpv $$0, @Nullable cbu $$1, @Nullable biq $$2, @Nullable qx $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cN() || $$1 != null && $$4.ac().f($$1.fQ())) {
               qx $$5 = $$2.f(new qx());
               UUID $$6 = $$2.cw();
               $$5.a($$3.p("EntityTag"));
               $$2.a_($$6);
               $$2.g($$5);
            }
         }
      }
   }

   public boolean b() {
      return this.bD;
   }

   public boolean c() {
      return this.bE;
   }

   public boolean d() {
      return this.bF;
   }

   public boolean e() {
      return this.bG;
   }

   public bjj f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jd.h.b(this));
      }

      return this.bJ;
   }

   public tl h() {
      if (this.bK == null) {
         this.bK = tl.c(this.g());
      }

      return this.bK;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public aex j() {
      if (this.bL == null) {
         aex $$0 = jd.h.b(this);
         this.bL = $$0.d("entities/");
      }

      return this.bL;
   }

   public float k() {
      return this.bM.a;
   }

   public float l() {
      return this.bM.b;
   }

   @Override
   public cec m() {
      return this.bN;
   }

   @Nullable
   public T a(cpv $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<biq> a(qx $$0, cpv $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ehi a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ehi($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dfj $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && ebg.a($$0) ? true : $$0.a(csw.cd) || $$0.a(csw.oi) || $$0.a(csw.dQ) || $$0.a(csw.qC);
      }
   }

   public bir n() {
      return this.bM;
   }

   public static Optional<biu<?>> a(qx $$0) {
      return jd.h.b(new aex($$0.l("id")));
   }

   @Nullable
   public static biq a(qx $$0, cpv $$1, Function<biq, biq> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            rd $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               biq $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (biq)$$3;
      }).orElse(null);
   }

   public static Stream<biq> a(final List<? extends rq> $$0, final cpv $$1) {
      final Spliterator<? extends rq> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<biq>() {
         @Override
         public boolean tryAdvance(Consumer<? super biq> $$0x) {
            return $$2.tryAdvance($$2xx -> biu.a((qx)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<biq> trySplit() {
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

   private static Optional<biq> b(qx $$0, cpv $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bw.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bH;
   }

   public int p() {
      return this.bI;
   }

   public boolean q() {
      return this != bt && this != ak && this != bk && this != g && this != af && this != S && this != ah && this != ar && this != B && this != H;
   }

   public boolean a(aqi<biu<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(hk<biu<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(biq $$0) {
      return (T)($$0.ah() == this ? $$0 : null);
   }

   @Override
   public Class<? extends biq> a() {
      return biq.class;
   }

   @Deprecated
   public hg.c<biu<?>> r() {
      return this.bx;
   }

   public static class a<T extends biq> {
      private final biu.b<T> a;
      private final bjj b;
      private ImmutableSet<csv> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bir j = bir.b(0.6F, 1.8F);
      private cec k = cee.f;

      private a(biu.b<T> $$0, bjj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bjj.b || $$1 == bjj.h;
      }

      public static <T extends biq> biu.a<T> a(biu.b<T> $$0, bjj $$1) {
         return new biu.a<>($$0, $$1);
      }

      public static <T extends biq> biu.a<T> a(bjj $$0) {
         return new biu.a<>(($$0x, $$1) -> null, $$0);
      }

      public biu.a<T> a(float $$0, float $$1) {
         this.j = bir.b($$0, $$1);
         return this;
      }

      public biu.a<T> a() {
         this.e = false;
         return this;
      }

      public biu.a<T> b() {
         this.d = false;
         return this;
      }

      public biu.a<T> c() {
         this.f = true;
         return this;
      }

      public biu.a<T> a(csv... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public biu.a<T> d() {
         this.g = true;
         return this;
      }

      public biu.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public biu.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public biu.a<T> a(cea... $$0) {
         this.k = cee.d.a($$0);
         return this;
      }

      public biu<T> a(String $$0) {
         if (this.d) {
            ac.a(ayx.w, $$0);
         }

         return new biu<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends biq> {
      T create(biu<T> var1, cpv var2);
   }
}
