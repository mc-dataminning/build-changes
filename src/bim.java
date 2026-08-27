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

public class bim<T extends bii> implements cdr, dix<bii, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final he.c<bim<?>> bx = jb.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bim<bvn> b = a("allay", bim.a.a(bvn::new, bjb.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bim<bif> c = a("area_effect_cloud", bim.a.<bif>a(bif::new, bjb.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<bxv> d = a("armor_stand", bim.a.<bxv>a(bxv::new, bjb.h).a(0.5F, 1.975F).a(10));
   public static final bim<cbu> e = a("arrow", bim.a.<cbu>a(cbu::new, bjb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bim<bvq> f = a("axolotl", bim.a.a(bvq::new, bjb.d).a(0.75F, 0.42F).a(10));
   public static final bim<bue> g = a("bat", bim.a.a(bue::new, bjb.c).a(0.5F, 0.9F).a(5));
   public static final bim<buk> h = a("bee", bim.a.a(buk::new, bjb.b).a(0.7F, 0.6F).a(8));
   public static final bim<byk> i = a("blaze", bim.a.a(byk::new, bjb.a).c().a(0.6F, 1.8F).a(8));
   public static final bim<bih.b> j = a("block_display", bim.a.a(bih.b::new, bjb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bim<cdf> k = a("boat", bim.a.<cdf>a(cdf::new, bjb.h).a(1.375F, 0.5625F).a(10));
   public static final bim<bvv> l = a("camel", bim.a.a(bvv::new, bjb.b).a(1.7F, 2.375F).a(10));
   public static final bim<bum> m = a("cat", bim.a.a(bum::new, bjb.b).a(0.6F, 0.7F).a(8));
   public static final bim<byl> n = a("cave_spider", bim.a.a(byl::new, bjb.a).a(0.7F, 0.5F).a(8));
   public static final bim<cdg> o = a("chest_boat", bim.a.<cdg>a(cdg::new, bjb.h).a(1.375F, 0.5625F).a(10));
   public static final bim<cdk> p = a("chest_minecart", bim.a.<cdk>a(cdk::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<buo> q = a("chicken", bim.a.a(buo::new, bjb.b).a(0.4F, 0.7F).a(10));
   public static final bim<bup> r = a("cod", bim.a.a(bup::new, bjb.g).a(0.5F, 0.3F).a(4));
   public static final bim<cdl> s = a("command_block_minecart", bim.a.<cdl>a(cdl::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<buq> t = a("cow", bim.a.a(buq::new, bjb.b).a(0.9F, 1.4F).a(10));
   public static final bim<bym> u = a("creeper", bim.a.a(bym::new, bjb.a).a(0.6F, 1.7F).a(8));
   public static final bim<bur> v = a("dolphin", bim.a.a(bur::new, bjb.f).a(0.9F, 0.6F));
   public static final bim<bwj> w = a("donkey", bim.a.a(bwj::new, bjb.b).a(1.3964844F, 1.5F).a(10));
   public static final bim<cbv> x = a("dragon_fireball", bim.a.<cbv>a(cbv::new, bjb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bim<byo> y = a("drowned", bim.a.a(byo::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<ccm> z = a("egg", bim.a.<ccm>a(ccm::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<byp> A = a("elder_guardian", bim.a.a(byp::new, bjb.a).a(1.9975F, 1.9975F).a(10));
   public static final bim<bwy> B = a("end_crystal", bim.a.<bwy>a(bwy::new, bjb.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bim<bwz> C = a("ender_dragon", bim.a.a(bwz::new, bjb.a).c().a(16.0F, 8.0F).a(10));
   public static final bim<ccn> D = a("ender_pearl", bim.a.<ccn>a(ccn::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<byq> E = a("enderman", bim.a.a(byq::new, bjb.a).a(0.6F, 2.9F).a(8));
   public static final bim<byr> F = a("endermite", bim.a.a(byr::new, bjb.a).a(0.4F, 0.3F).a(8));
   public static final bim<byt> G = a("evoker", bim.a.a(byt::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<cbw> H = a("evoker_fangs", bim.a.<cbw>a(cbw::new, bjb.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bim<cco> I = a("experience_bottle", bim.a.<cco>a(cco::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<bio> J = a("experience_orb", bim.a.<bio>a(bio::new, bjb.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bim<cbx> K = a("eye_of_ender", bim.a.<cbx>a(cbx::new, bjb.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bim<bye> L = a("falling_block", bim.a.<bye>a(bye::new, bjb.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bim<cbz> M = a("firework_rocket", bim.a.<cbz>a(cbz::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<but> N = a("fox", bim.a.a(but::new, bjb.b).a(0.6F, 0.7F).a(8).a(csm.oi));
   public static final bim<bvy> O = a("frog", bim.a.a(bvy::new, bjb.b).a(0.5F, 0.5F).a(10));
   public static final bim<cdm> P = a("furnace_minecart", bim.a.<cdm>a(cdm::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<byu> Q = a("ghast", bim.a.a(byu::new, bjb.a).c().a(4.0F, 4.0F).a(10));
   public static final bim<byv> R = a("giant", bim.a.a(byv::new, bjb.a).a(3.6F, 12.0F).a(10));
   public static final bim<bxw> S = a("glow_item_frame", bim.a.<bxw>a(bxw::new, bjb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<biq> T = a("glow_squid", bim.a.a(biq::new, bjb.e).a(0.8F, 0.8F).a(10));
   public static final bim<bwe> U = a("goat", bim.a.a(bwe::new, bjb.b).a(0.9F, 1.3F).a(10));
   public static final bim<byw> V = a("guardian", bim.a.a(byw::new, bjb.a).a(0.85F, 0.85F).a(8));
   public static final bim<bzw> W = a("hoglin", bim.a.a(bzw::new, bjb.a).a(1.3964844F, 1.4F).a(8));
   public static final bim<cdn> X = a("hopper_minecart", bim.a.<cdn>a(cdn::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bwk> Y = a("horse", bim.a.a(bwk::new, bjb.b).a(1.3964844F, 1.6F).a(10));
   public static final bim<byx> Z = a("husk", bim.a.a(byx::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<byy> aa = a("illusioner", bim.a.a(byy::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bit> ab = a("interaction", bim.a.a(bit::new, bjb.h).a(0.0F, 0.0F).a(10));
   public static final bim<buv> ac = a("iron_golem", bim.a.a(buv::new, bjb.h).a(1.4F, 2.7F).a(10));
   public static final bim<byf> ad = a("item", bim.a.<byf>a(byf::new, bjb.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bim<bih.g> ae = a("item_display", bim.a.a(bih.g::new, bjb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bim<bxy> af = a("item_frame", bim.a.<bxy>a(bxy::new, bjb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<ccc> ag = a("fireball", bim.a.<ccc>a(ccc::new, bjb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bim<bxz> ah = a("leash_knot", bim.a.<bxz>a(bxz::new, bjb.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<bix> ai = a("lightning_bolt", bim.a.a(bix::new, bjb.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bim<bwl> aj = a("llama", bim.a.a(bwl::new, bjb.b).a(0.9F, 1.87F).a(10));
   public static final bim<ccd> ak = a("llama_spit", bim.a.<ccd>a(ccd::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<byz> al = a("magma_cube", bim.a.a(byz::new, bjb.a).c().a(2.04F, 2.04F).a(8));
   public static final bim<biz> am = a("marker", bim.a.a(biz::new, bjb.h).a(0.0F, 0.0F).a(0));
   public static final bim<cdj> an = a("minecart", bim.a.<cdj>a(cdj::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<buw> ao = a("mooshroom", bim.a.a(buw::new, bjb.b).a(0.9F, 1.4F).a(10));
   public static final bim<bwn> ap = a("mule", bim.a.a(bwn::new, bjb.b).a(1.3964844F, 1.6F).a(8));
   public static final bim<bux> aq = a("ocelot", bim.a.a(bux::new, bjb.b).a(0.6F, 0.7F).a(10));
   public static final bim<bya> ar = a("painting", bim.a.<bya>a(bya::new, bjb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<buy> as = a("panda", bim.a.a(buy::new, bjb.b).a(1.3F, 1.25F).a(10));
   public static final bim<buz> at = a("parrot", bim.a.a(buz::new, bjb.b).a(0.5F, 0.9F).a(8));
   public static final bim<bzc> au = a("phantom", bim.a.a(bzc::new, bjb.a).a(0.9F, 0.5F).a(8));
   public static final bim<bva> av = a("pig", bim.a.a(bva::new, bjb.b).a(0.9F, 0.9F).a(10));
   public static final bim<cac> aw = a("piglin", bim.a.a(cac::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<caf> ax = a("piglin_brute", bim.a.a(caf::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bzd> ay = a("pillager", bim.a.a(bzd::new, bjb.a).d().a(0.6F, 1.95F).a(8));
   public static final bim<bvb> az = a("polar_bear", bim.a.a(bvb::new, bjb.b).a(csm.qC).a(1.4F, 1.4F).a(10));
   public static final bim<ccp> aA = a("potion", bim.a.<ccp>a(ccp::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<bvc> aB = a("pufferfish", bim.a.a(bvc::new, bjb.g).a(0.7F, 0.7F).a(4));
   public static final bim<bvd> aC = a("rabbit", bim.a.a(bvd::new, bjb.b).a(0.4F, 0.5F).a(8));
   public static final bim<bzf> aD = a("ravager", bim.a.a(bzf::new, bjb.a).a(1.95F, 2.2F).a(10));
   public static final bim<bve> aE = a("salmon", bim.a.a(bve::new, bjb.g).a(0.7F, 0.4F).a(4));
   public static final bim<bvf> aF = a("sheep", bim.a.a(bvf::new, bjb.b).a(0.9F, 1.3F).a(10));
   public static final bim<bzg> aG = a("shulker", bim.a.a(bzg::new, bjb.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bim<ccg> aH = a("shulker_bullet", bim.a.<ccg>a(ccg::new, bjb.h).a(0.3125F, 0.3125F).a(8));
   public static final bim<bzh> aI = a("silverfish", bim.a.a(bzh::new, bjb.a).a(0.4F, 0.3F).a(8));
   public static final bim<bzi> aJ = a("skeleton", bim.a.a(bzi::new, bjb.a).a(0.6F, 1.99F).a(8));
   public static final bim<bwo> aK = a("skeleton_horse", bim.a.a(bwo::new, bjb.b).a(1.3964844F, 1.6F).a(10));
   public static final bim<bzj> aL = a("slime", bim.a.a(bzj::new, bjb.a).a(2.04F, 2.04F).a(10));
   public static final bim<cch> aM = a("small_fireball", bim.a.<cch>a(cch::new, bjb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bim<bwv> aN = a("sniffer", bim.a.a(bwv::new, bjb.b).a(1.9F, 1.75F).a(10));
   public static final bim<bvh> aO = a("snow_golem", bim.a.a(bvh::new, bjb.h).a(csm.qC).a(0.7F, 1.9F).a(8));
   public static final bim<cci> aP = a("snowball", bim.a.<cci>a(cci::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<cdo> aQ = a("spawner_minecart", bim.a.<cdo>a(cdo::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<ccj> aR = a("spectral_arrow", bim.a.<ccj>a(ccj::new, bjb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bim<bzl> aS = a("spider", bim.a.a(bzl::new, bjb.a).a(1.4F, 0.9F).a(8));
   public static final bim<bvi> aT = a("squid", bim.a.a(bvi::new, bjb.f).a(0.8F, 0.8F).a(8));
   public static final bim<bzm> aU = a("stray", bim.a.a(bzm::new, bjb.a).a(0.6F, 1.99F).a(csm.qC).a(8));
   public static final bim<bzn> aV = a("strider", bim.a.a(bzn::new, bjb.b).c().a(0.9F, 1.7F).a(10));
   public static final bim<bwb> aW = a("tadpole", bim.a.a(bwb::new, bjb.b).a(bwb.c, bwb.d).a(10));
   public static final bim<bih.l> aX = a("text_display", bim.a.a(bih.l::new, bjb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bim<byg> aY = a("tnt", bim.a.<byg>a(byg::new, bjb.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bim<cdp> aZ = a("tnt_minecart", bim.a.<cdp>a(cdp::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bwq> ba = a("trader_llama", bim.a.a(bwq::new, bjb.b).a(0.9F, 1.87F).a(10));
   public static final bim<ccq> bb = a("trident", bim.a.<ccq>a(ccq::new, bjb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bim<bvj> bc = a("tropical_fish", bim.a.a(bvj::new, bjb.g).a(0.5F, 0.4F).a(4));
   public static final bim<bvk> bd = a("turtle", bim.a.a(bvk::new, bjb.b).a(1.2F, 0.4F).a(10));
   public static final bim<bzo> be = a("vex", bim.a.a(bzo::new, bjb.a).c().a(0.4F, 0.8F).a(8));
   public static final bim<caz> bf = a("villager", bim.a.<caz>a(caz::new, bjb.h).a(0.6F, 1.95F).a(10));
   public static final bim<bzp> bg = a("vindicator", bim.a.a(bzp::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<cbf> bh = a("wandering_trader", bim.a.a(cbf::new, bjb.b).a(0.6F, 1.95F).a(10));
   public static final bim<caq> bi = a("warden", bim.a.a(caq::new, bjb.a).a(0.9F, 2.9F).a(16).c());
   public static final bim<bzq> bj = a("witch", bim.a.a(bzq::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bxt> bk = a("wither", bim.a.a(bxt::new, bjb.a).c().a(csm.cd).a(0.9F, 3.5F).a(10));
   public static final bim<bzr> bl = a("wither_skeleton", bim.a.a(bzr::new, bjb.a).c().a(csm.cd).a(0.7F, 2.4F).a(8));
   public static final bim<ccr> bm = a("wither_skull", bim.a.<ccr>a(ccr::new, bjb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bim<bvm> bn = a("wolf", bim.a.a(bvm::new, bjb.b).a(0.6F, 0.85F).a(10));
   public static final bim<bzs> bo = a("zoglin", bim.a.a(bzs::new, bjb.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bim<bzt> bp = a("zombie", bim.a.<bzt>a(bzt::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bws> bq = a("zombie_horse", bim.a.a(bws::new, bjb.b).a(1.3964844F, 1.6F).a(10));
   public static final bim<bzu> br = a("zombie_villager", bim.a.a(bzu::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bzv> bs = a("zombified_piglin", bim.a.a(bzv::new, bjb.a).c().a(0.6F, 1.95F).a(8));
   public static final bim<cbm> bt = a("player", bim.a.<cbm>a(bjb.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bim<cca> bu = a("fishing_bobber", bim.a.<cca>a(cca::new, bjb.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bim.b<T> bA;
   private final bjb bB;
   private final ImmutableSet<csl> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private tf bK;
   @Nullable
   private aer bL;
   private final bij bM;
   private final cdu bN;

   private static <T extends bii> bim<T> a(String $$0, bim.a<T> $$1) {
      return hr.a(jb.h, $$0, $$1.a($$0));
   }

   public static aer a(bim<?> $$0) {
      return jb.h.b($$0);
   }

   public static Optional<bim<?>> a(String $$0) {
      return jb.h.b(aer.a($$0));
   }

   public bim(bim.b<T> $$0, bjb $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<csl> $$6, bij $$7, int $$8, int $$9, cdu $$10) {
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
   public T a(akk $$0, @Nullable cix $$1, @Nullable cbm $$2, gu $$3, bjc $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qr $$7;
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

   public static <T extends bii> Consumer<T> a(akk $$0, cix $$1, @Nullable cbm $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bii> Consumer<T> a(Consumer<T> $$0, akk $$1, cix $$2, @Nullable cbm $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bii> Consumer<T> a(Consumer<T> $$0, cix $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bii> Consumer<T> b(Consumer<T> $$0, akk $$1, cix $$2, @Nullable cbm $$3) {
      qr $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(akk $$0, gu $$1, bjc $$2) {
      return this.a($$0, (qr)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(akk $$0, @Nullable qr $$1, @Nullable Consumer<T> $$2, gu $$3, bjc $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(akk $$0, @Nullable qr $$1, @Nullable Consumer<T> $$2, gu $$3, bjc $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cpl)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, arp.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bja $$10) {
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

   protected static double a(cpo $$0, gu $$1, boolean $$2, egy $$3) {
      egy $$4 = new egy($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ehw> $$5 = $$0.d(null, $$4);
      return 1.0 + eht.a(ha.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cpl $$0, @Nullable cbm $$1, @Nullable bii $$2, @Nullable qr $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().g($$1.fP())) {
               qr $$5 = $$2.f(new qr());
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

   public bjb f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jb.h.b(this));
      }

      return this.bJ;
   }

   public tf h() {
      if (this.bK == null) {
         this.bK = tf.c(this.g());
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

   public aer j() {
      if (this.bL == null) {
         aer $$0 = jb.h.b(this);
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
   public cdu m() {
      return this.bN;
   }

   @Nullable
   public T a(cpl $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bii> a(qr $$0, cpl $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public egy a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new egy($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dez $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && eaw.a($$0) ? true : $$0.a(csm.cd) || $$0.a(csm.oi) || $$0.a(csm.dQ) || $$0.a(csm.qC);
      }
   }

   public bij n() {
      return this.bM;
   }

   public static Optional<bim<?>> a(qr $$0) {
      return jb.h.b(new aer($$0.l("id")));
   }

   @Nullable
   public static bii a(qr $$0, cpl $$1, Function<bii, bii> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            qx $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bii $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bii)$$3;
      }).orElse(null);
   }

   public static Stream<bii> a(final List<? extends rk> $$0, final cpl $$1) {
      final Spliterator<? extends rk> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bii>() {
         @Override
         public boolean tryAdvance(Consumer<? super bii> $$0x) {
            return $$2.tryAdvance($$2xx -> bim.a((qr)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bii> trySplit() {
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

   private static Optional<bii> b(qr $$0, cpl $$1) {
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

   public boolean a(aqa<bim<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(hi<bim<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bii $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bii> a() {
      return bii.class;
   }

   @Deprecated
   public he.c<bim<?>> r() {
      return this.bx;
   }

   public static class a<T extends bii> {
      private final bim.b<T> a;
      private final bjb b;
      private ImmutableSet<csl> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bij j = bij.b(0.6F, 1.8F);
      private cdu k = cdw.f;

      private a(bim.b<T> $$0, bjb $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bjb.b || $$1 == bjb.h;
      }

      public static <T extends bii> bim.a<T> a(bim.b<T> $$0, bjb $$1) {
         return new bim.a<>($$0, $$1);
      }

      public static <T extends bii> bim.a<T> a(bjb $$0) {
         return new bim.a<>(($$0x, $$1) -> null, $$0);
      }

      public bim.a<T> a(float $$0, float $$1) {
         this.j = bij.b($$0, $$1);
         return this;
      }

      public bim.a<T> a() {
         this.e = false;
         return this;
      }

      public bim.a<T> b() {
         this.d = false;
         return this;
      }

      public bim.a<T> c() {
         this.f = true;
         return this;
      }

      public bim.a<T> a(csl... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bim.a<T> d() {
         this.g = true;
         return this;
      }

      public bim.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bim.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bim.a<T> a(cds... $$0) {
         this.k = cdw.d.a($$0);
         return this;
      }

      public bim<T> a(String $$0) {
         if (this.d) {
            ac.a(ayp.w, $$0);
         }

         return new bim<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bii> {
      T create(bim<T> var1, cpl var2);
   }
}
