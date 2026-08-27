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

public class bip<T extends bil> implements cdu, djc<bil, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final hg.c<bip<?>> bx = jd.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bip<bvq> b = a("allay", bip.a.a(bvq::new, bje.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bip<bii> c = a("area_effect_cloud", bip.a.<bii>a(bii::new, bje.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bip<bxy> d = a("armor_stand", bip.a.<bxy>a(bxy::new, bje.h).a(0.5F, 1.975F).a(10));
   public static final bip<cbx> e = a("arrow", bip.a.<cbx>a(cbx::new, bje.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bip<bvt> f = a("axolotl", bip.a.a(bvt::new, bje.d).a(0.75F, 0.42F).a(10));
   public static final bip<buh> g = a("bat", bip.a.a(buh::new, bje.c).a(0.5F, 0.9F).a(5));
   public static final bip<bun> h = a("bee", bip.a.a(bun::new, bje.b).a(0.7F, 0.6F).a(8));
   public static final bip<byn> i = a("blaze", bip.a.a(byn::new, bje.a).c().a(0.6F, 1.8F).a(8));
   public static final bip<bik.b> j = a("block_display", bip.a.a(bik.b::new, bje.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bip<cdi> k = a("boat", bip.a.<cdi>a(cdi::new, bje.h).a(1.375F, 0.5625F).a(10));
   public static final bip<bvy> l = a("camel", bip.a.a(bvy::new, bje.b).a(1.7F, 2.375F).a(10));
   public static final bip<bup> m = a("cat", bip.a.a(bup::new, bje.b).a(0.6F, 0.7F).a(8));
   public static final bip<byo> n = a("cave_spider", bip.a.a(byo::new, bje.a).a(0.7F, 0.5F).a(8));
   public static final bip<cdj> o = a("chest_boat", bip.a.<cdj>a(cdj::new, bje.h).a(1.375F, 0.5625F).a(10));
   public static final bip<cdn> p = a("chest_minecart", bip.a.<cdn>a(cdn::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<bur> q = a("chicken", bip.a.a(bur::new, bje.b).a(0.4F, 0.7F).a(10));
   public static final bip<bus> r = a("cod", bip.a.a(bus::new, bje.g).a(0.5F, 0.3F).a(4));
   public static final bip<cdo> s = a("command_block_minecart", bip.a.<cdo>a(cdo::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<but> t = a("cow", bip.a.a(but::new, bje.b).a(0.9F, 1.4F).a(10));
   public static final bip<byp> u = a("creeper", bip.a.a(byp::new, bje.a).a(0.6F, 1.7F).a(8));
   public static final bip<buu> v = a("dolphin", bip.a.a(buu::new, bje.f).a(0.9F, 0.6F));
   public static final bip<bwm> w = a("donkey", bip.a.a(bwm::new, bje.b).a(1.3964844F, 1.5F).a(10));
   public static final bip<cby> x = a("dragon_fireball", bip.a.<cby>a(cby::new, bje.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bip<byr> y = a("drowned", bip.a.a(byr::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<ccp> z = a("egg", bip.a.<ccp>a(ccp::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<bys> A = a("elder_guardian", bip.a.a(bys::new, bje.a).a(1.9975F, 1.9975F).a(10));
   public static final bip<bxb> B = a("end_crystal", bip.a.<bxb>a(bxb::new, bje.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bip<bxc> C = a("ender_dragon", bip.a.a(bxc::new, bje.a).c().a(16.0F, 8.0F).a(10));
   public static final bip<ccq> D = a("ender_pearl", bip.a.<ccq>a(ccq::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<byt> E = a("enderman", bip.a.a(byt::new, bje.a).a(0.6F, 2.9F).a(8));
   public static final bip<byu> F = a("endermite", bip.a.a(byu::new, bje.a).a(0.4F, 0.3F).a(8));
   public static final bip<byw> G = a("evoker", bip.a.a(byw::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<cbz> H = a("evoker_fangs", bip.a.<cbz>a(cbz::new, bje.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bip<ccr> I = a("experience_bottle", bip.a.<ccr>a(ccr::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<bir> J = a("experience_orb", bip.a.<bir>a(bir::new, bje.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bip<cca> K = a("eye_of_ender", bip.a.<cca>a(cca::new, bje.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bip<byh> L = a("falling_block", bip.a.<byh>a(byh::new, bje.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bip<ccc> M = a("firework_rocket", bip.a.<ccc>a(ccc::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<buw> N = a("fox", bip.a.a(buw::new, bje.b).a(0.6F, 0.7F).a(8).a(csr.oi));
   public static final bip<bwb> O = a("frog", bip.a.a(bwb::new, bje.b).a(0.5F, 0.5F).a(10));
   public static final bip<cdp> P = a("furnace_minecart", bip.a.<cdp>a(cdp::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<byx> Q = a("ghast", bip.a.a(byx::new, bje.a).c().a(4.0F, 4.0F).a(10));
   public static final bip<byy> R = a("giant", bip.a.a(byy::new, bje.a).a(3.6F, 12.0F).a(10));
   public static final bip<bxz> S = a("glow_item_frame", bip.a.<bxz>a(bxz::new, bje.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bip<bit> T = a("glow_squid", bip.a.a(bit::new, bje.e).a(0.8F, 0.8F).a(10));
   public static final bip<bwh> U = a("goat", bip.a.a(bwh::new, bje.b).a(0.9F, 1.3F).a(10));
   public static final bip<byz> V = a("guardian", bip.a.a(byz::new, bje.a).a(0.85F, 0.85F).a(8));
   public static final bip<bzz> W = a("hoglin", bip.a.a(bzz::new, bje.a).a(1.3964844F, 1.4F).a(8));
   public static final bip<cdq> X = a("hopper_minecart", bip.a.<cdq>a(cdq::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<bwn> Y = a("horse", bip.a.a(bwn::new, bje.b).a(1.3964844F, 1.6F).a(10));
   public static final bip<bza> Z = a("husk", bip.a.a(bza::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<bzb> aa = a("illusioner", bip.a.a(bzb::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<biw> ab = a("interaction", bip.a.a(biw::new, bje.h).a(0.0F, 0.0F).a(10));
   public static final bip<buy> ac = a("iron_golem", bip.a.a(buy::new, bje.h).a(1.4F, 2.7F).a(10));
   public static final bip<byi> ad = a("item", bip.a.<byi>a(byi::new, bje.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bip<bik.g> ae = a("item_display", bip.a.a(bik.g::new, bje.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bip<byb> af = a("item_frame", bip.a.<byb>a(byb::new, bje.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bip<ccf> ag = a("fireball", bip.a.<ccf>a(ccf::new, bje.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bip<byc> ah = a("leash_knot", bip.a.<byc>a(byc::new, bje.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bip<bja> ai = a("lightning_bolt", bip.a.a(bja::new, bje.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bip<bwo> aj = a("llama", bip.a.a(bwo::new, bje.b).a(0.9F, 1.87F).a(10));
   public static final bip<ccg> ak = a("llama_spit", bip.a.<ccg>a(ccg::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<bzc> al = a("magma_cube", bip.a.a(bzc::new, bje.a).c().a(2.04F, 2.04F).a(8));
   public static final bip<bjc> am = a("marker", bip.a.a(bjc::new, bje.h).a(0.0F, 0.0F).a(0));
   public static final bip<cdm> an = a("minecart", bip.a.<cdm>a(cdm::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<buz> ao = a("mooshroom", bip.a.a(buz::new, bje.b).a(0.9F, 1.4F).a(10));
   public static final bip<bwq> ap = a("mule", bip.a.a(bwq::new, bje.b).a(1.3964844F, 1.6F).a(8));
   public static final bip<bva> aq = a("ocelot", bip.a.a(bva::new, bje.b).a(0.6F, 0.7F).a(10));
   public static final bip<byd> ar = a("painting", bip.a.<byd>a(byd::new, bje.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bip<bvb> as = a("panda", bip.a.a(bvb::new, bje.b).a(1.3F, 1.25F).a(10));
   public static final bip<bvc> at = a("parrot", bip.a.a(bvc::new, bje.b).a(0.5F, 0.9F).a(8));
   public static final bip<bzf> au = a("phantom", bip.a.a(bzf::new, bje.a).a(0.9F, 0.5F).a(8));
   public static final bip<bvd> av = a("pig", bip.a.a(bvd::new, bje.b).a(0.9F, 0.9F).a(10));
   public static final bip<caf> aw = a("piglin", bip.a.a(caf::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<cai> ax = a("piglin_brute", bip.a.a(cai::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<bzg> ay = a("pillager", bip.a.a(bzg::new, bje.a).d().a(0.6F, 1.95F).a(8));
   public static final bip<bve> az = a("polar_bear", bip.a.a(bve::new, bje.b).a(csr.qC).a(1.4F, 1.4F).a(10));
   public static final bip<ccs> aA = a("potion", bip.a.<ccs>a(ccs::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<bvf> aB = a("pufferfish", bip.a.a(bvf::new, bje.g).a(0.7F, 0.7F).a(4));
   public static final bip<bvg> aC = a("rabbit", bip.a.a(bvg::new, bje.b).a(0.4F, 0.5F).a(8));
   public static final bip<bzi> aD = a("ravager", bip.a.a(bzi::new, bje.a).a(1.95F, 2.2F).a(10));
   public static final bip<bvh> aE = a("salmon", bip.a.a(bvh::new, bje.g).a(0.7F, 0.4F).a(4));
   public static final bip<bvi> aF = a("sheep", bip.a.a(bvi::new, bje.b).a(0.9F, 1.3F).a(10));
   public static final bip<bzj> aG = a("shulker", bip.a.a(bzj::new, bje.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bip<ccj> aH = a("shulker_bullet", bip.a.<ccj>a(ccj::new, bje.h).a(0.3125F, 0.3125F).a(8));
   public static final bip<bzk> aI = a("silverfish", bip.a.a(bzk::new, bje.a).a(0.4F, 0.3F).a(8));
   public static final bip<bzl> aJ = a("skeleton", bip.a.a(bzl::new, bje.a).a(0.6F, 1.99F).a(8));
   public static final bip<bwr> aK = a("skeleton_horse", bip.a.a(bwr::new, bje.b).a(1.3964844F, 1.6F).a(10));
   public static final bip<bzm> aL = a("slime", bip.a.a(bzm::new, bje.a).a(2.04F, 2.04F).a(10));
   public static final bip<cck> aM = a("small_fireball", bip.a.<cck>a(cck::new, bje.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bip<bwy> aN = a("sniffer", bip.a.a(bwy::new, bje.b).a(1.9F, 1.75F).a(10));
   public static final bip<bvk> aO = a("snow_golem", bip.a.a(bvk::new, bje.h).a(csr.qC).a(0.7F, 1.9F).a(8));
   public static final bip<ccl> aP = a("snowball", bip.a.<ccl>a(ccl::new, bje.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bip<cdr> aQ = a("spawner_minecart", bip.a.<cdr>a(cdr::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<ccm> aR = a("spectral_arrow", bip.a.<ccm>a(ccm::new, bje.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bip<bzo> aS = a("spider", bip.a.a(bzo::new, bje.a).a(1.4F, 0.9F).a(8));
   public static final bip<bvl> aT = a("squid", bip.a.a(bvl::new, bje.f).a(0.8F, 0.8F).a(8));
   public static final bip<bzp> aU = a("stray", bip.a.a(bzp::new, bje.a).a(0.6F, 1.99F).a(csr.qC).a(8));
   public static final bip<bzq> aV = a("strider", bip.a.a(bzq::new, bje.b).c().a(0.9F, 1.7F).a(10));
   public static final bip<bwe> aW = a("tadpole", bip.a.a(bwe::new, bje.b).a(bwe.c, bwe.d).a(10));
   public static final bip<bik.l> aX = a("text_display", bip.a.a(bik.l::new, bje.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bip<byj> aY = a("tnt", bip.a.<byj>a(byj::new, bje.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bip<cds> aZ = a("tnt_minecart", bip.a.<cds>a(cds::new, bje.h).a(0.98F, 0.7F).a(8));
   public static final bip<bwt> ba = a("trader_llama", bip.a.a(bwt::new, bje.b).a(0.9F, 1.87F).a(10));
   public static final bip<cct> bb = a("trident", bip.a.<cct>a(cct::new, bje.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bip<bvm> bc = a("tropical_fish", bip.a.a(bvm::new, bje.g).a(0.5F, 0.4F).a(4));
   public static final bip<bvn> bd = a("turtle", bip.a.a(bvn::new, bje.b).a(1.2F, 0.4F).a(10));
   public static final bip<bzr> be = a("vex", bip.a.a(bzr::new, bje.a).c().a(0.4F, 0.8F).a(8));
   public static final bip<cbc> bf = a("villager", bip.a.<cbc>a(cbc::new, bje.h).a(0.6F, 1.95F).a(10));
   public static final bip<bzs> bg = a("vindicator", bip.a.a(bzs::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<cbi> bh = a("wandering_trader", bip.a.a(cbi::new, bje.b).a(0.6F, 1.95F).a(10));
   public static final bip<cat> bi = a("warden", bip.a.a(cat::new, bje.a).a(0.9F, 2.9F).a(16).c());
   public static final bip<bzt> bj = a("witch", bip.a.a(bzt::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<bxw> bk = a("wither", bip.a.a(bxw::new, bje.a).c().a(csr.cd).a(0.9F, 3.5F).a(10));
   public static final bip<bzu> bl = a("wither_skeleton", bip.a.a(bzu::new, bje.a).c().a(csr.cd).a(0.7F, 2.4F).a(8));
   public static final bip<ccu> bm = a("wither_skull", bip.a.<ccu>a(ccu::new, bje.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bip<bvp> bn = a("wolf", bip.a.a(bvp::new, bje.b).a(0.6F, 0.85F).a(10));
   public static final bip<bzv> bo = a("zoglin", bip.a.a(bzv::new, bje.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bip<bzw> bp = a("zombie", bip.a.<bzw>a(bzw::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<bwv> bq = a("zombie_horse", bip.a.a(bwv::new, bje.b).a(1.3964844F, 1.6F).a(10));
   public static final bip<bzx> br = a("zombie_villager", bip.a.a(bzx::new, bje.a).a(0.6F, 1.95F).a(8));
   public static final bip<bzy> bs = a("zombified_piglin", bip.a.a(bzy::new, bje.a).c().a(0.6F, 1.95F).a(8));
   public static final bip<cbp> bt = a("player", bip.a.<cbp>a(bje.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bip<ccd> bu = a("fishing_bobber", bip.a.<ccd>a(ccd::new, bje.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bip.b<T> bA;
   private final bje bB;
   private final ImmutableSet<csq> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private ti bK;
   @Nullable
   private aeu bL;
   private final bim bM;
   private final cdx bN;

   private static <T extends bil> bip<T> a(String $$0, bip.a<T> $$1) {
      return ht.a(jd.h, $$0, $$1.a($$0));
   }

   public static aeu a(bip<?> $$0) {
      return jd.h.b($$0);
   }

   public static Optional<bip<?>> a(String $$0) {
      return jd.h.b(aeu.a($$0));
   }

   public bip(bip.b<T> $$0, bje $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<csq> $$6, bim $$7, int $$8, int $$9, cdx $$10) {
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
   public T a(akn $$0, @Nullable cja $$1, @Nullable cbp $$2, gw $$3, bjf $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qu $$7;
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

   public static <T extends bil> Consumer<T> a(akn $$0, cja $$1, @Nullable cbp $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bil> Consumer<T> a(Consumer<T> $$0, akn $$1, cja $$2, @Nullable cbp $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bil> Consumer<T> a(Consumer<T> $$0, cja $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bil> Consumer<T> b(Consumer<T> $$0, akn $$1, cja $$2, @Nullable cbp $$3) {
      qu $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(akn $$0, gw $$1, bjf $$2) {
      return this.a($$0, (qu)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(akn $$0, @Nullable qu $$1, @Nullable Consumer<T> $$2, gw $$3, bjf $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(akn $$0, @Nullable qu $$1, @Nullable Consumer<T> $$2, gw $$3, bjf $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cpq)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, ars.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bjd $$10) {
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

   protected static double a(cpt $$0, gw $$1, boolean $$2, ehd $$3) {
      ehd $$4 = new ehd($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eib> $$5 = $$0.d(null, $$4);
      return 1.0 + ehy.a(hc.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cpq $$0, @Nullable cbp $$1, @Nullable bil $$2, @Nullable qu $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().g($$1.fP())) {
               qu $$5 = $$2.f(new qu());
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

   public bje f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jd.h.b(this));
      }

      return this.bJ;
   }

   public ti h() {
      if (this.bK == null) {
         this.bK = ti.c(this.g());
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

   public aeu j() {
      if (this.bL == null) {
         aeu $$0 = jd.h.b(this);
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
   public cdx m() {
      return this.bN;
   }

   @Nullable
   public T a(cpq $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bil> a(qu $$0, cpq $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ehd a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ehd($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dfe $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && ebb.a($$0) ? true : $$0.a(csr.cd) || $$0.a(csr.oi) || $$0.a(csr.dQ) || $$0.a(csr.qC);
      }
   }

   public bim n() {
      return this.bM;
   }

   public static Optional<bip<?>> a(qu $$0) {
      return jd.h.b(new aeu($$0.l("id")));
   }

   @Nullable
   public static bil a(qu $$0, cpq $$1, Function<bil, bil> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ra $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bil $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bil)$$3;
      }).orElse(null);
   }

   public static Stream<bil> a(final List<? extends rn> $$0, final cpq $$1) {
      final Spliterator<? extends rn> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bil>() {
         @Override
         public boolean tryAdvance(Consumer<? super bil> $$0x) {
            return $$2.tryAdvance($$2xx -> bip.a((qu)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bil> trySplit() {
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

   private static Optional<bil> b(qu $$0, cpq $$1) {
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

   public boolean a(aqd<bip<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(hk<bip<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bil $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bil> a() {
      return bil.class;
   }

   @Deprecated
   public hg.c<bip<?>> r() {
      return this.bx;
   }

   public static class a<T extends bil> {
      private final bip.b<T> a;
      private final bje b;
      private ImmutableSet<csq> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bim j = bim.b(0.6F, 1.8F);
      private cdx k = cdz.f;

      private a(bip.b<T> $$0, bje $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bje.b || $$1 == bje.h;
      }

      public static <T extends bil> bip.a<T> a(bip.b<T> $$0, bje $$1) {
         return new bip.a<>($$0, $$1);
      }

      public static <T extends bil> bip.a<T> a(bje $$0) {
         return new bip.a<>(($$0x, $$1) -> null, $$0);
      }

      public bip.a<T> a(float $$0, float $$1) {
         this.j = bim.b($$0, $$1);
         return this;
      }

      public bip.a<T> a() {
         this.e = false;
         return this;
      }

      public bip.a<T> b() {
         this.d = false;
         return this;
      }

      public bip.a<T> c() {
         this.f = true;
         return this;
      }

      public bip.a<T> a(csq... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bip.a<T> d() {
         this.g = true;
         return this;
      }

      public bip.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bip.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bip.a<T> a(cdv... $$0) {
         this.k = cdz.d.a($$0);
         return this;
      }

      public bip<T> a(String $$0) {
         if (this.d) {
            ac.a(ays.w, $$0);
         }

         return new bip<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bil> {
      T create(bip<T> var1, cpq var2);
   }
}
