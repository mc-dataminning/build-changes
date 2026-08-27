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

public class bim<T extends bii> implements cds, diy<bii, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final he.c<bim<?>> bx = jb.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bim<bvo> b = a("allay", bim.a.a(bvo::new, bjb.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bim<bif> c = a("area_effect_cloud", bim.a.<bif>a(bif::new, bjb.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<bxw> d = a("armor_stand", bim.a.<bxw>a(bxw::new, bjb.h).a(0.5F, 1.975F).a(10));
   public static final bim<cbv> e = a("arrow", bim.a.<cbv>a(cbv::new, bjb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bim<bvr> f = a("axolotl", bim.a.a(bvr::new, bjb.d).a(0.75F, 0.42F).a(10));
   public static final bim<buf> g = a("bat", bim.a.a(buf::new, bjb.c).a(0.5F, 0.9F).a(5));
   public static final bim<bul> h = a("bee", bim.a.a(bul::new, bjb.b).a(0.7F, 0.6F).a(8));
   public static final bim<byl> i = a("blaze", bim.a.a(byl::new, bjb.a).c().a(0.6F, 1.8F).a(8));
   public static final bim<bih.b> j = a("block_display", bim.a.a(bih.b::new, bjb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bim<cdg> k = a("boat", bim.a.<cdg>a(cdg::new, bjb.h).a(1.375F, 0.5625F).a(10));
   public static final bim<bvw> l = a("camel", bim.a.a(bvw::new, bjb.b).a(1.7F, 2.375F).a(10));
   public static final bim<bun> m = a("cat", bim.a.a(bun::new, bjb.b).a(0.6F, 0.7F).a(8));
   public static final bim<bym> n = a("cave_spider", bim.a.a(bym::new, bjb.a).a(0.7F, 0.5F).a(8));
   public static final bim<cdh> o = a("chest_boat", bim.a.<cdh>a(cdh::new, bjb.h).a(1.375F, 0.5625F).a(10));
   public static final bim<cdl> p = a("chest_minecart", bim.a.<cdl>a(cdl::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bup> q = a("chicken", bim.a.a(bup::new, bjb.b).a(0.4F, 0.7F).a(10));
   public static final bim<buq> r = a("cod", bim.a.a(buq::new, bjb.g).a(0.5F, 0.3F).a(4));
   public static final bim<cdm> s = a("command_block_minecart", bim.a.<cdm>a(cdm::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bur> t = a("cow", bim.a.a(bur::new, bjb.b).a(0.9F, 1.4F).a(10));
   public static final bim<byn> u = a("creeper", bim.a.a(byn::new, bjb.a).a(0.6F, 1.7F).a(8));
   public static final bim<bus> v = a("dolphin", bim.a.a(bus::new, bjb.f).a(0.9F, 0.6F));
   public static final bim<bwk> w = a("donkey", bim.a.a(bwk::new, bjb.b).a(1.3964844F, 1.5F).a(10));
   public static final bim<cbw> x = a("dragon_fireball", bim.a.<cbw>a(cbw::new, bjb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bim<byp> y = a("drowned", bim.a.a(byp::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<ccn> z = a("egg", bim.a.<ccn>a(ccn::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<byq> A = a("elder_guardian", bim.a.a(byq::new, bjb.a).a(1.9975F, 1.9975F).a(10));
   public static final bim<bwz> B = a("end_crystal", bim.a.<bwz>a(bwz::new, bjb.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bim<bxa> C = a("ender_dragon", bim.a.a(bxa::new, bjb.a).c().a(16.0F, 8.0F).a(10));
   public static final bim<cco> D = a("ender_pearl", bim.a.<cco>a(cco::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<byr> E = a("enderman", bim.a.a(byr::new, bjb.a).a(0.6F, 2.9F).a(8));
   public static final bim<bys> F = a("endermite", bim.a.a(bys::new, bjb.a).a(0.4F, 0.3F).a(8));
   public static final bim<byu> G = a("evoker", bim.a.a(byu::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<cbx> H = a("evoker_fangs", bim.a.<cbx>a(cbx::new, bjb.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bim<ccp> I = a("experience_bottle", bim.a.<ccp>a(ccp::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<bio> J = a("experience_orb", bim.a.<bio>a(bio::new, bjb.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bim<cby> K = a("eye_of_ender", bim.a.<cby>a(cby::new, bjb.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bim<byf> L = a("falling_block", bim.a.<byf>a(byf::new, bjb.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bim<cca> M = a("firework_rocket", bim.a.<cca>a(cca::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<buu> N = a("fox", bim.a.a(buu::new, bjb.b).a(0.6F, 0.7F).a(8).a(csn.oi));
   public static final bim<bvz> O = a("frog", bim.a.a(bvz::new, bjb.b).a(0.5F, 0.5F).a(10));
   public static final bim<cdn> P = a("furnace_minecart", bim.a.<cdn>a(cdn::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<byv> Q = a("ghast", bim.a.a(byv::new, bjb.a).c().a(4.0F, 4.0F).a(10));
   public static final bim<byw> R = a("giant", bim.a.a(byw::new, bjb.a).a(3.6F, 12.0F).a(10));
   public static final bim<bxx> S = a("glow_item_frame", bim.a.<bxx>a(bxx::new, bjb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<biq> T = a("glow_squid", bim.a.a(biq::new, bjb.e).a(0.8F, 0.8F).a(10));
   public static final bim<bwf> U = a("goat", bim.a.a(bwf::new, bjb.b).a(0.9F, 1.3F).a(10));
   public static final bim<byx> V = a("guardian", bim.a.a(byx::new, bjb.a).a(0.85F, 0.85F).a(8));
   public static final bim<bzx> W = a("hoglin", bim.a.a(bzx::new, bjb.a).a(1.3964844F, 1.4F).a(8));
   public static final bim<cdo> X = a("hopper_minecart", bim.a.<cdo>a(cdo::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bwl> Y = a("horse", bim.a.a(bwl::new, bjb.b).a(1.3964844F, 1.6F).a(10));
   public static final bim<byy> Z = a("husk", bim.a.a(byy::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<byz> aa = a("illusioner", bim.a.a(byz::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bit> ab = a("interaction", bim.a.a(bit::new, bjb.h).a(0.0F, 0.0F).a(10));
   public static final bim<buw> ac = a("iron_golem", bim.a.a(buw::new, bjb.h).a(1.4F, 2.7F).a(10));
   public static final bim<byg> ad = a("item", bim.a.<byg>a(byg::new, bjb.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bim<bih.g> ae = a("item_display", bim.a.a(bih.g::new, bjb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bim<bxz> af = a("item_frame", bim.a.<bxz>a(bxz::new, bjb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<ccd> ag = a("fireball", bim.a.<ccd>a(ccd::new, bjb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bim<bya> ah = a("leash_knot", bim.a.<bya>a(bya::new, bjb.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<bix> ai = a("lightning_bolt", bim.a.a(bix::new, bjb.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bim<bwm> aj = a("llama", bim.a.a(bwm::new, bjb.b).a(0.9F, 1.87F).a(10));
   public static final bim<cce> ak = a("llama_spit", bim.a.<cce>a(cce::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<bza> al = a("magma_cube", bim.a.a(bza::new, bjb.a).c().a(2.04F, 2.04F).a(8));
   public static final bim<biz> am = a("marker", bim.a.a(biz::new, bjb.h).a(0.0F, 0.0F).a(0));
   public static final bim<cdk> an = a("minecart", bim.a.<cdk>a(cdk::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bux> ao = a("mooshroom", bim.a.a(bux::new, bjb.b).a(0.9F, 1.4F).a(10));
   public static final bim<bwo> ap = a("mule", bim.a.a(bwo::new, bjb.b).a(1.3964844F, 1.6F).a(8));
   public static final bim<buy> aq = a("ocelot", bim.a.a(buy::new, bjb.b).a(0.6F, 0.7F).a(10));
   public static final bim<byb> ar = a("painting", bim.a.<byb>a(byb::new, bjb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bim<buz> as = a("panda", bim.a.a(buz::new, bjb.b).a(1.3F, 1.25F).a(10));
   public static final bim<bva> at = a("parrot", bim.a.a(bva::new, bjb.b).a(0.5F, 0.9F).a(8));
   public static final bim<bzd> au = a("phantom", bim.a.a(bzd::new, bjb.a).a(0.9F, 0.5F).a(8));
   public static final bim<bvb> av = a("pig", bim.a.a(bvb::new, bjb.b).a(0.9F, 0.9F).a(10));
   public static final bim<cad> aw = a("piglin", bim.a.a(cad::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<cag> ax = a("piglin_brute", bim.a.a(cag::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bze> ay = a("pillager", bim.a.a(bze::new, bjb.a).d().a(0.6F, 1.95F).a(8));
   public static final bim<bvc> az = a("polar_bear", bim.a.a(bvc::new, bjb.b).a(csn.qC).a(1.4F, 1.4F).a(10));
   public static final bim<ccq> aA = a("potion", bim.a.<ccq>a(ccq::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<bvd> aB = a("pufferfish", bim.a.a(bvd::new, bjb.g).a(0.7F, 0.7F).a(4));
   public static final bim<bve> aC = a("rabbit", bim.a.a(bve::new, bjb.b).a(0.4F, 0.5F).a(8));
   public static final bim<bzg> aD = a("ravager", bim.a.a(bzg::new, bjb.a).a(1.95F, 2.2F).a(10));
   public static final bim<bvf> aE = a("salmon", bim.a.a(bvf::new, bjb.g).a(0.7F, 0.4F).a(4));
   public static final bim<bvg> aF = a("sheep", bim.a.a(bvg::new, bjb.b).a(0.9F, 1.3F).a(10));
   public static final bim<bzh> aG = a("shulker", bim.a.a(bzh::new, bjb.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bim<cch> aH = a("shulker_bullet", bim.a.<cch>a(cch::new, bjb.h).a(0.3125F, 0.3125F).a(8));
   public static final bim<bzi> aI = a("silverfish", bim.a.a(bzi::new, bjb.a).a(0.4F, 0.3F).a(8));
   public static final bim<bzj> aJ = a("skeleton", bim.a.a(bzj::new, bjb.a).a(0.6F, 1.99F).a(8));
   public static final bim<bwp> aK = a("skeleton_horse", bim.a.a(bwp::new, bjb.b).a(1.3964844F, 1.6F).a(10));
   public static final bim<bzk> aL = a("slime", bim.a.a(bzk::new, bjb.a).a(2.04F, 2.04F).a(10));
   public static final bim<cci> aM = a("small_fireball", bim.a.<cci>a(cci::new, bjb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bim<bww> aN = a("sniffer", bim.a.a(bww::new, bjb.b).a(1.9F, 1.75F).a(10));
   public static final bim<bvi> aO = a("snow_golem", bim.a.a(bvi::new, bjb.h).a(csn.qC).a(0.7F, 1.9F).a(8));
   public static final bim<ccj> aP = a("snowball", bim.a.<ccj>a(ccj::new, bjb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bim<cdp> aQ = a("spawner_minecart", bim.a.<cdp>a(cdp::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<cck> aR = a("spectral_arrow", bim.a.<cck>a(cck::new, bjb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bim<bzm> aS = a("spider", bim.a.a(bzm::new, bjb.a).a(1.4F, 0.9F).a(8));
   public static final bim<bvj> aT = a("squid", bim.a.a(bvj::new, bjb.f).a(0.8F, 0.8F).a(8));
   public static final bim<bzn> aU = a("stray", bim.a.a(bzn::new, bjb.a).a(0.6F, 1.99F).a(csn.qC).a(8));
   public static final bim<bzo> aV = a("strider", bim.a.a(bzo::new, bjb.b).c().a(0.9F, 1.7F).a(10));
   public static final bim<bwc> aW = a("tadpole", bim.a.a(bwc::new, bjb.b).a(bwc.c, bwc.d).a(10));
   public static final bim<bih.l> aX = a("text_display", bim.a.a(bih.l::new, bjb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bim<byh> aY = a("tnt", bim.a.<byh>a(byh::new, bjb.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bim<cdq> aZ = a("tnt_minecart", bim.a.<cdq>a(cdq::new, bjb.h).a(0.98F, 0.7F).a(8));
   public static final bim<bwr> ba = a("trader_llama", bim.a.a(bwr::new, bjb.b).a(0.9F, 1.87F).a(10));
   public static final bim<ccr> bb = a("trident", bim.a.<ccr>a(ccr::new, bjb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bim<bvk> bc = a("tropical_fish", bim.a.a(bvk::new, bjb.g).a(0.5F, 0.4F).a(4));
   public static final bim<bvl> bd = a("turtle", bim.a.a(bvl::new, bjb.b).a(1.2F, 0.4F).a(10));
   public static final bim<bzp> be = a("vex", bim.a.a(bzp::new, bjb.a).c().a(0.4F, 0.8F).a(8));
   public static final bim<cba> bf = a("villager", bim.a.<cba>a(cba::new, bjb.h).a(0.6F, 1.95F).a(10));
   public static final bim<bzq> bg = a("vindicator", bim.a.a(bzq::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<cbg> bh = a("wandering_trader", bim.a.a(cbg::new, bjb.b).a(0.6F, 1.95F).a(10));
   public static final bim<car> bi = a("warden", bim.a.a(car::new, bjb.a).a(0.9F, 2.9F).a(16).c());
   public static final bim<bzr> bj = a("witch", bim.a.a(bzr::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bxu> bk = a("wither", bim.a.a(bxu::new, bjb.a).c().a(csn.cd).a(0.9F, 3.5F).a(10));
   public static final bim<bzs> bl = a("wither_skeleton", bim.a.a(bzs::new, bjb.a).c().a(csn.cd).a(0.7F, 2.4F).a(8));
   public static final bim<ccs> bm = a("wither_skull", bim.a.<ccs>a(ccs::new, bjb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bim<bvn> bn = a("wolf", bim.a.a(bvn::new, bjb.b).a(0.6F, 0.85F).a(10));
   public static final bim<bzt> bo = a("zoglin", bim.a.a(bzt::new, bjb.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bim<bzu> bp = a("zombie", bim.a.<bzu>a(bzu::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bwt> bq = a("zombie_horse", bim.a.a(bwt::new, bjb.b).a(1.3964844F, 1.6F).a(10));
   public static final bim<bzv> br = a("zombie_villager", bim.a.a(bzv::new, bjb.a).a(0.6F, 1.95F).a(8));
   public static final bim<bzw> bs = a("zombified_piglin", bim.a.a(bzw::new, bjb.a).c().a(0.6F, 1.95F).a(8));
   public static final bim<cbn> bt = a("player", bim.a.<cbn>a(bjb.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bim<ccb> bu = a("fishing_bobber", bim.a.<ccb>a(ccb::new, bjb.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bim.b<T> bA;
   private final bjb bB;
   private final ImmutableSet<csm> bC;
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
   private final cdv bN;

   private static <T extends bii> bim<T> a(String $$0, bim.a<T> $$1) {
      return hr.a(jb.h, $$0, $$1.a($$0));
   }

   public static aer a(bim<?> $$0) {
      return jb.h.b($$0);
   }

   public static Optional<bim<?>> a(String $$0) {
      return jb.h.b(aer.a($$0));
   }

   public bim(bim.b<T> $$0, bjb $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<csm> $$6, bij $$7, int $$8, int $$9, cdv $$10) {
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
   public T a(akk $$0, @Nullable ciy $$1, @Nullable cbn $$2, gu $$3, bjc $$4, boolean $$5, boolean $$6) {
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

   public static <T extends bii> Consumer<T> a(akk $$0, ciy $$1, @Nullable cbn $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bii> Consumer<T> a(Consumer<T> $$0, akk $$1, ciy $$2, @Nullable cbn $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bii> Consumer<T> a(Consumer<T> $$0, ciy $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bii> Consumer<T> b(Consumer<T> $$0, akk $$1, ciy $$2, @Nullable cbn $$3) {
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
      T $$7 = this.a((cpm)$$0);
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

   protected static double a(cpp $$0, gu $$1, boolean $$2, egz $$3) {
      egz $$4 = new egz($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ehx> $$5 = $$0.d(null, $$4);
      return 1.0 + ehu.a(ha.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cpm $$0, @Nullable cbn $$1, @Nullable bii $$2, @Nullable qr $$3) {
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
   public cdv m() {
      return this.bN;
   }

   @Nullable
   public T a(cpm $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bii> a(qr $$0, cpm $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public egz a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new egz($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dfa $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && eax.a($$0) ? true : $$0.a(csn.cd) || $$0.a(csn.oi) || $$0.a(csn.dQ) || $$0.a(csn.qC);
      }
   }

   public bij n() {
      return this.bM;
   }

   public static Optional<bim<?>> a(qr $$0) {
      return jb.h.b(new aer($$0.l("id")));
   }

   @Nullable
   public static bii a(qr $$0, cpm $$1, Function<bii, bii> $$2) {
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

   public static Stream<bii> a(final List<? extends rk> $$0, final cpm $$1) {
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

   private static Optional<bii> b(qr $$0, cpm $$1) {
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
      private ImmutableSet<csm> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bij j = bij.b(0.6F, 1.8F);
      private cdv k = cdx.f;

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

      public bim.a<T> a(csm... $$0) {
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

      public bim.a<T> a(cdt... $$0) {
         this.k = cdx.d.a($$0);
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
      T create(bim<T> var1, cpm var2);
   }
}
