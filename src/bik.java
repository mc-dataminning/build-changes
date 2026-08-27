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

public class bik<T extends big> implements cdq, diw<big, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final hf.c<bik<?>> bx = jc.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bik<bvm> b = a("allay", bik.a.a(bvm::new, biz.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bik<bid> c = a("area_effect_cloud", bik.a.<bid>a(bid::new, biz.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bik<bxu> d = a("armor_stand", bik.a.<bxu>a(bxu::new, biz.h).a(0.5F, 1.975F).a(10));
   public static final bik<cbt> e = a("arrow", bik.a.<cbt>a(cbt::new, biz.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bik<bvp> f = a("axolotl", bik.a.a(bvp::new, biz.d).a(0.75F, 0.42F).a(10));
   public static final bik<bud> g = a("bat", bik.a.a(bud::new, biz.c).a(0.5F, 0.9F).a(5));
   public static final bik<buj> h = a("bee", bik.a.a(buj::new, biz.b).a(0.7F, 0.6F).a(8));
   public static final bik<byj> i = a("blaze", bik.a.a(byj::new, biz.a).c().a(0.6F, 1.8F).a(8));
   public static final bik<bif.b> j = a("block_display", bik.a.a(bif.b::new, biz.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bik<cde> k = a("boat", bik.a.<cde>a(cde::new, biz.h).a(1.375F, 0.5625F).a(10));
   public static final bik<bvu> l = a("camel", bik.a.a(bvu::new, biz.b).a(1.7F, 2.375F).a(10));
   public static final bik<bul> m = a("cat", bik.a.a(bul::new, biz.b).a(0.6F, 0.7F).a(8));
   public static final bik<byk> n = a("cave_spider", bik.a.a(byk::new, biz.a).a(0.7F, 0.5F).a(8));
   public static final bik<cdf> o = a("chest_boat", bik.a.<cdf>a(cdf::new, biz.h).a(1.375F, 0.5625F).a(10));
   public static final bik<cdj> p = a("chest_minecart", bik.a.<cdj>a(cdj::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<bun> q = a("chicken", bik.a.a(bun::new, biz.b).a(0.4F, 0.7F).a(10));
   public static final bik<buo> r = a("cod", bik.a.a(buo::new, biz.g).a(0.5F, 0.3F).a(4));
   public static final bik<cdk> s = a("command_block_minecart", bik.a.<cdk>a(cdk::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<bup> t = a("cow", bik.a.a(bup::new, biz.b).a(0.9F, 1.4F).a(10));
   public static final bik<byl> u = a("creeper", bik.a.a(byl::new, biz.a).a(0.6F, 1.7F).a(8));
   public static final bik<buq> v = a("dolphin", bik.a.a(buq::new, biz.f).a(0.9F, 0.6F));
   public static final bik<bwi> w = a("donkey", bik.a.a(bwi::new, biz.b).a(1.3964844F, 1.5F).a(10));
   public static final bik<cbu> x = a("dragon_fireball", bik.a.<cbu>a(cbu::new, biz.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bik<byn> y = a("drowned", bik.a.a(byn::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<ccl> z = a("egg", bik.a.<ccl>a(ccl::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<byo> A = a("elder_guardian", bik.a.a(byo::new, biz.a).a(1.9975F, 1.9975F).a(10));
   public static final bik<bwx> B = a("end_crystal", bik.a.<bwx>a(bwx::new, biz.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bik<bwy> C = a("ender_dragon", bik.a.a(bwy::new, biz.a).c().a(16.0F, 8.0F).a(10));
   public static final bik<ccm> D = a("ender_pearl", bik.a.<ccm>a(ccm::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<byp> E = a("enderman", bik.a.a(byp::new, biz.a).a(0.6F, 2.9F).a(8));
   public static final bik<byq> F = a("endermite", bik.a.a(byq::new, biz.a).a(0.4F, 0.3F).a(8));
   public static final bik<bys> G = a("evoker", bik.a.a(bys::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<cbv> H = a("evoker_fangs", bik.a.<cbv>a(cbv::new, biz.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bik<ccn> I = a("experience_bottle", bik.a.<ccn>a(ccn::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<bim> J = a("experience_orb", bik.a.<bim>a(bim::new, biz.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bik<cbw> K = a("eye_of_ender", bik.a.<cbw>a(cbw::new, biz.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bik<byd> L = a("falling_block", bik.a.<byd>a(byd::new, biz.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bik<cby> M = a("firework_rocket", bik.a.<cby>a(cby::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<bus> N = a("fox", bik.a.a(bus::new, biz.b).a(0.6F, 0.7F).a(8).a(csl.oi));
   public static final bik<bvx> O = a("frog", bik.a.a(bvx::new, biz.b).a(0.5F, 0.5F).a(10));
   public static final bik<cdl> P = a("furnace_minecart", bik.a.<cdl>a(cdl::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<byt> Q = a("ghast", bik.a.a(byt::new, biz.a).c().a(4.0F, 4.0F).a(10));
   public static final bik<byu> R = a("giant", bik.a.a(byu::new, biz.a).a(3.6F, 12.0F).a(10));
   public static final bik<bxv> S = a("glow_item_frame", bik.a.<bxv>a(bxv::new, biz.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bik<bio> T = a("glow_squid", bik.a.a(bio::new, biz.e).a(0.8F, 0.8F).a(10));
   public static final bik<bwd> U = a("goat", bik.a.a(bwd::new, biz.b).a(0.9F, 1.3F).a(10));
   public static final bik<byv> V = a("guardian", bik.a.a(byv::new, biz.a).a(0.85F, 0.85F).a(8));
   public static final bik<bzv> W = a("hoglin", bik.a.a(bzv::new, biz.a).a(1.3964844F, 1.4F).a(8));
   public static final bik<cdm> X = a("hopper_minecart", bik.a.<cdm>a(cdm::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<bwj> Y = a("horse", bik.a.a(bwj::new, biz.b).a(1.3964844F, 1.6F).a(10));
   public static final bik<byw> Z = a("husk", bik.a.a(byw::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<byx> aa = a("illusioner", bik.a.a(byx::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<bir> ab = a("interaction", bik.a.a(bir::new, biz.h).a(0.0F, 0.0F).a(10));
   public static final bik<buu> ac = a("iron_golem", bik.a.a(buu::new, biz.h).a(1.4F, 2.7F).a(10));
   public static final bik<bye> ad = a("item", bik.a.<bye>a(bye::new, biz.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bik<bif.g> ae = a("item_display", bik.a.a(bif.g::new, biz.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bik<bxx> af = a("item_frame", bik.a.<bxx>a(bxx::new, biz.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bik<ccb> ag = a("fireball", bik.a.<ccb>a(ccb::new, biz.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bik<bxy> ah = a("leash_knot", bik.a.<bxy>a(bxy::new, biz.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bik<biv> ai = a("lightning_bolt", bik.a.a(biv::new, biz.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bik<bwk> aj = a("llama", bik.a.a(bwk::new, biz.b).a(0.9F, 1.87F).a(10));
   public static final bik<ccc> ak = a("llama_spit", bik.a.<ccc>a(ccc::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<byy> al = a("magma_cube", bik.a.a(byy::new, biz.a).c().a(2.04F, 2.04F).a(8));
   public static final bik<bix> am = a("marker", bik.a.a(bix::new, biz.h).a(0.0F, 0.0F).a(0));
   public static final bik<cdi> an = a("minecart", bik.a.<cdi>a(cdi::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<buv> ao = a("mooshroom", bik.a.a(buv::new, biz.b).a(0.9F, 1.4F).a(10));
   public static final bik<bwm> ap = a("mule", bik.a.a(bwm::new, biz.b).a(1.3964844F, 1.6F).a(8));
   public static final bik<buw> aq = a("ocelot", bik.a.a(buw::new, biz.b).a(0.6F, 0.7F).a(10));
   public static final bik<bxz> ar = a("painting", bik.a.<bxz>a(bxz::new, biz.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bik<bux> as = a("panda", bik.a.a(bux::new, biz.b).a(1.3F, 1.25F).a(10));
   public static final bik<buy> at = a("parrot", bik.a.a(buy::new, biz.b).a(0.5F, 0.9F).a(8));
   public static final bik<bzb> au = a("phantom", bik.a.a(bzb::new, biz.a).a(0.9F, 0.5F).a(8));
   public static final bik<buz> av = a("pig", bik.a.a(buz::new, biz.b).a(0.9F, 0.9F).a(10));
   public static final bik<cab> aw = a("piglin", bik.a.a(cab::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<cae> ax = a("piglin_brute", bik.a.a(cae::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<bzc> ay = a("pillager", bik.a.a(bzc::new, biz.a).d().a(0.6F, 1.95F).a(8));
   public static final bik<bva> az = a("polar_bear", bik.a.a(bva::new, biz.b).a(csl.qC).a(1.4F, 1.4F).a(10));
   public static final bik<cco> aA = a("potion", bik.a.<cco>a(cco::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<bvb> aB = a("pufferfish", bik.a.a(bvb::new, biz.g).a(0.7F, 0.7F).a(4));
   public static final bik<bvc> aC = a("rabbit", bik.a.a(bvc::new, biz.b).a(0.4F, 0.5F).a(8));
   public static final bik<bze> aD = a("ravager", bik.a.a(bze::new, biz.a).a(1.95F, 2.2F).a(10));
   public static final bik<bvd> aE = a("salmon", bik.a.a(bvd::new, biz.g).a(0.7F, 0.4F).a(4));
   public static final bik<bve> aF = a("sheep", bik.a.a(bve::new, biz.b).a(0.9F, 1.3F).a(10));
   public static final bik<bzf> aG = a("shulker", bik.a.a(bzf::new, biz.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bik<ccf> aH = a("shulker_bullet", bik.a.<ccf>a(ccf::new, biz.h).a(0.3125F, 0.3125F).a(8));
   public static final bik<bzg> aI = a("silverfish", bik.a.a(bzg::new, biz.a).a(0.4F, 0.3F).a(8));
   public static final bik<bzh> aJ = a("skeleton", bik.a.a(bzh::new, biz.a).a(0.6F, 1.99F).a(8));
   public static final bik<bwn> aK = a("skeleton_horse", bik.a.a(bwn::new, biz.b).a(1.3964844F, 1.6F).a(10));
   public static final bik<bzi> aL = a("slime", bik.a.a(bzi::new, biz.a).a(2.04F, 2.04F).a(10));
   public static final bik<ccg> aM = a("small_fireball", bik.a.<ccg>a(ccg::new, biz.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bik<bwu> aN = a("sniffer", bik.a.a(bwu::new, biz.b).a(1.9F, 1.75F).a(10));
   public static final bik<bvg> aO = a("snow_golem", bik.a.a(bvg::new, biz.h).a(csl.qC).a(0.7F, 1.9F).a(8));
   public static final bik<cch> aP = a("snowball", bik.a.<cch>a(cch::new, biz.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bik<cdn> aQ = a("spawner_minecart", bik.a.<cdn>a(cdn::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<cci> aR = a("spectral_arrow", bik.a.<cci>a(cci::new, biz.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bik<bzk> aS = a("spider", bik.a.a(bzk::new, biz.a).a(1.4F, 0.9F).a(8));
   public static final bik<bvh> aT = a("squid", bik.a.a(bvh::new, biz.f).a(0.8F, 0.8F).a(8));
   public static final bik<bzl> aU = a("stray", bik.a.a(bzl::new, biz.a).a(0.6F, 1.99F).a(csl.qC).a(8));
   public static final bik<bzm> aV = a("strider", bik.a.a(bzm::new, biz.b).c().a(0.9F, 1.7F).a(10));
   public static final bik<bwa> aW = a("tadpole", bik.a.a(bwa::new, biz.b).a(bwa.c, bwa.d).a(10));
   public static final bik<bif.l> aX = a("text_display", bik.a.a(bif.l::new, biz.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bik<byf> aY = a("tnt", bik.a.<byf>a(byf::new, biz.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bik<cdo> aZ = a("tnt_minecart", bik.a.<cdo>a(cdo::new, biz.h).a(0.98F, 0.7F).a(8));
   public static final bik<bwp> ba = a("trader_llama", bik.a.a(bwp::new, biz.b).a(0.9F, 1.87F).a(10));
   public static final bik<ccp> bb = a("trident", bik.a.<ccp>a(ccp::new, biz.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bik<bvi> bc = a("tropical_fish", bik.a.a(bvi::new, biz.g).a(0.5F, 0.4F).a(4));
   public static final bik<bvj> bd = a("turtle", bik.a.a(bvj::new, biz.b).a(1.2F, 0.4F).a(10));
   public static final bik<bzn> be = a("vex", bik.a.a(bzn::new, biz.a).c().a(0.4F, 0.8F).a(8));
   public static final bik<cay> bf = a("villager", bik.a.<cay>a(cay::new, biz.h).a(0.6F, 1.95F).a(10));
   public static final bik<bzo> bg = a("vindicator", bik.a.a(bzo::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<cbe> bh = a("wandering_trader", bik.a.a(cbe::new, biz.b).a(0.6F, 1.95F).a(10));
   public static final bik<cap> bi = a("warden", bik.a.a(cap::new, biz.a).a(0.9F, 2.9F).a(16).c());
   public static final bik<bzp> bj = a("witch", bik.a.a(bzp::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<bxs> bk = a("wither", bik.a.a(bxs::new, biz.a).c().a(csl.cd).a(0.9F, 3.5F).a(10));
   public static final bik<bzq> bl = a("wither_skeleton", bik.a.a(bzq::new, biz.a).c().a(csl.cd).a(0.7F, 2.4F).a(8));
   public static final bik<ccq> bm = a("wither_skull", bik.a.<ccq>a(ccq::new, biz.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bik<bvl> bn = a("wolf", bik.a.a(bvl::new, biz.b).a(0.6F, 0.85F).a(10));
   public static final bik<bzr> bo = a("zoglin", bik.a.a(bzr::new, biz.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bik<bzs> bp = a("zombie", bik.a.<bzs>a(bzs::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<bwr> bq = a("zombie_horse", bik.a.a(bwr::new, biz.b).a(1.3964844F, 1.6F).a(10));
   public static final bik<bzt> br = a("zombie_villager", bik.a.a(bzt::new, biz.a).a(0.6F, 1.95F).a(8));
   public static final bik<bzu> bs = a("zombified_piglin", bik.a.a(bzu::new, biz.a).c().a(0.6F, 1.95F).a(8));
   public static final bik<cbl> bt = a("player", bik.a.<cbl>a(biz.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bik<cbz> bu = a("fishing_bobber", bik.a.<cbz>a(cbz::new, biz.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bik.b<T> bA;
   private final biz bB;
   private final ImmutableSet<csk> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private te bK;
   @Nullable
   private aep bL;
   private final bih bM;
   private final cdt bN;

   private static <T extends big> bik<T> a(String $$0, bik.a<T> $$1) {
      return hs.a(jc.h, $$0, $$1.a($$0));
   }

   public static aep a(bik<?> $$0) {
      return jc.h.b($$0);
   }

   public static Optional<bik<?>> a(String $$0) {
      return jc.h.b(aep.a($$0));
   }

   public bik(bik.b<T> $$0, biz $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<csk> $$6, bih $$7, int $$8, int $$9, cdt $$10) {
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
   public T a(aki $$0, @Nullable ciw $$1, @Nullable cbl $$2, gv $$3, bja $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qs $$7;
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

   public static <T extends big> Consumer<T> a(aki $$0, ciw $$1, @Nullable cbl $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends big> Consumer<T> a(Consumer<T> $$0, aki $$1, ciw $$2, @Nullable cbl $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends big> Consumer<T> a(Consumer<T> $$0, ciw $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends big> Consumer<T> b(Consumer<T> $$0, aki $$1, ciw $$2, @Nullable cbl $$3) {
      qs $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aki $$0, gv $$1, bja $$2) {
      return this.a($$0, (qs)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aki $$0, @Nullable qs $$1, @Nullable Consumer<T> $$2, gv $$3, bja $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(aki $$0, @Nullable qs $$1, @Nullable Consumer<T> $$2, gv $$3, bja $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cpk)$$0);
      if ($$7 == null) {
         return null;
      } else {
         double $$8;
         if ($$5) {
            $$7.e((double)$$3.u() + 0.5, (double)($$3.v() + 1), (double)$$3.w() + 0.5);
            $$8 = a($$0, $$3, $$6, $$7.cG());
         } else {
            $$8 = 0.0;
         }

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, aro.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof biy $$10) {
            $$10.aW = $$10.dA();
            $$10.aU = $$10.dA();
            $$10.a($$0, $$0.d_($$10.dk()), $$4, null, $$1);
            $$10.M();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(cpn $$0, gv $$1, boolean $$2, eha $$3) {
      eha $$4 = new eha($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ehy> $$5 = $$0.d(null, $$4);
      return 1.0 + ehv.a(hb.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cpk $$0, @Nullable cbl $$1, @Nullable big $$2, @Nullable qs $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().g($$1.fP())) {
               qs $$5 = $$2.f(new qs());
               UUID $$6 = $$2.cv();
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

   public biz f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jc.h.b(this));
      }

      return this.bJ;
   }

   public te h() {
      if (this.bK == null) {
         this.bK = te.c(this.g());
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

   public aep j() {
      if (this.bL == null) {
         aep $$0 = jc.h.b(this);
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
   public cdt m() {
      return this.bN;
   }

   @Nullable
   public T a(cpk $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<big> a(qs $$0, cpk $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eha a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eha($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dey $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && eav.a($$0) ? true : $$0.a(csl.cd) || $$0.a(csl.oi) || $$0.a(csl.dQ) || $$0.a(csl.qC);
      }
   }

   public bih n() {
      return this.bM;
   }

   public static Optional<bik<?>> a(qs $$0) {
      return jc.h.b(new aep($$0.l("id")));
   }

   @Nullable
   public static big a(qs $$0, cpk $$1, Function<big, big> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            qy $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               big $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (big)$$3;
      }).orElse(null);
   }

   public static Stream<big> a(final List<? extends rl> $$0, final cpk $$1) {
      final Spliterator<? extends rl> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<big>() {
         @Override
         public boolean tryAdvance(Consumer<? super big> $$0x) {
            return $$2.tryAdvance($$2xx -> bik.a((qs)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<big> trySplit() {
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

   private static Optional<big> b(qs $$0, cpk $$1) {
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

   public boolean a(apy<bik<?>> $$0) {
      return this.bx.a($$0);
   }

   @Nullable
   public T a(big $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends big> a() {
      return big.class;
   }

   @Deprecated
   public hf.c<bik<?>> r() {
      return this.bx;
   }

   public static class a<T extends big> {
      private final bik.b<T> a;
      private final biz b;
      private ImmutableSet<csk> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bih j = bih.b(0.6F, 1.8F);
      private cdt k = cdv.f;

      private a(bik.b<T> $$0, biz $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == biz.b || $$1 == biz.h;
      }

      public static <T extends big> bik.a<T> a(bik.b<T> $$0, biz $$1) {
         return new bik.a<>($$0, $$1);
      }

      public static <T extends big> bik.a<T> a(biz $$0) {
         return new bik.a<>(($$0x, $$1) -> null, $$0);
      }

      public bik.a<T> a(float $$0, float $$1) {
         this.j = bih.b($$0, $$1);
         return this;
      }

      public bik.a<T> a() {
         this.e = false;
         return this;
      }

      public bik.a<T> b() {
         this.d = false;
         return this;
      }

      public bik.a<T> c() {
         this.f = true;
         return this;
      }

      public bik.a<T> a(csk... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bik.a<T> d() {
         this.g = true;
         return this;
      }

      public bik.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bik.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bik.a<T> a(cdr... $$0) {
         this.k = cdv.d.a($$0);
         return this;
      }

      public bik<T> a(String $$0) {
         if (this.d) {
            ac.a(aym.w, $$0);
         }

         return new bik<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends big> {
      T create(bik<T> var1, cpk var2);
   }
}
