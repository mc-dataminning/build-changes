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

public class blz<T extends blv> implements chp, dnf<blv, T> {
   private static final Logger by = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ih.c<blz<?>> bz = kd.g.f(this);
   private static final float bA = 1.3964844F;
   private static final int bB = 10;
   public static final blz<bzc> b = a("allay", blz.a.a(bzc::new, bmo.b).a(0.35F, 0.6F).a(8).b(2));
   public static final blz<bls> c = a("area_effect_cloud", blz.a.<bls>a(bls::new, bmo.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blz<cbk> d = a("armor_stand", blz.a.<cbk>a(cbk::new, bmo.h).a(0.5F, 1.975F).a(10));
   public static final blz<cfq> e = a("arrow", blz.a.<cfq>a(cfq::new, bmo.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blz<bzf> f = a("axolotl", blz.a.a(bzf::new, bmo.d).a(0.75F, 0.42F).a(10));
   public static final blz<bxt> g = a("bat", blz.a.a(bxt::new, bmo.c).a(0.5F, 0.9F).a(5));
   public static final blz<bxz> h = a("bee", blz.a.a(bxz::new, bmo.b).a(0.7F, 0.6F).a(8));
   public static final blz<cbz> i = a("blaze", blz.a.a(cbz::new, bmo.a).c().a(0.6F, 1.8F).a(8));
   public static final blz<blu.b> j = a("block_display", blz.a.a(blu.b::new, bmo.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blz<chc> k = a("boat", blz.a.<chc>a(chc::new, bmo.h).a(1.375F, 0.5625F).a(10));
   public static final blz<cdl> l = a("breeze", blz.a.a(cdl::new, bmo.a).a(0.6F, 1.7F).a(10).a(chu.c));
   public static final blz<bzk> m = a("camel", blz.a.a(bzk::new, bmo.b).a(1.7F, 2.375F).a(10));
   public static final blz<byb> n = a("cat", blz.a.a(byb::new, bmo.b).a(0.6F, 0.7F).a(8));
   public static final blz<cca> o = a("cave_spider", blz.a.a(cca::new, bmo.a).a(0.7F, 0.5F).a(8));
   public static final blz<chd> p = a("chest_boat", blz.a.<chd>a(chd::new, bmo.h).a(1.375F, 0.5625F).a(10));
   public static final blz<chh> q = a("chest_minecart", blz.a.<chh>a(chh::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<byd> r = a("chicken", blz.a.a(byd::new, bmo.b).a(0.4F, 0.7F).a(10));
   public static final blz<bye> s = a("cod", blz.a.a(bye::new, bmo.g).a(0.5F, 0.3F).a(4));
   public static final blz<chi> t = a("command_block_minecart", blz.a.<chi>a(chi::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<byf> u = a("cow", blz.a.a(byf::new, bmo.b).a(0.9F, 1.4F).a(10));
   public static final blz<ccb> v = a("creeper", blz.a.a(ccb::new, bmo.a).a(0.6F, 1.7F).a(8));
   public static final blz<byg> w = a("dolphin", blz.a.a(byg::new, bmo.f).a(0.9F, 0.6F));
   public static final blz<bzy> x = a("donkey", blz.a.a(bzy::new, bmo.b).a(1.3964844F, 1.5F).a(10));
   public static final blz<cfr> y = a("dragon_fireball", blz.a.<cfr>a(cfr::new, bmo.h).a(1.0F, 1.0F).a(4).b(10));
   public static final blz<ccd> z = a("drowned", blz.a.a(ccd::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<cgi> A = a("egg", blz.a.<cgi>a(cgi::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<cce> B = a("elder_guardian", blz.a.a(cce::new, bmo.a).a(1.9975F, 1.9975F).a(10));
   public static final blz<can> C = a("end_crystal", blz.a.<can>a(can::new, bmo.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final blz<cao> D = a("ender_dragon", blz.a.a(cao::new, bmo.a).c().a(16.0F, 8.0F).a(10));
   public static final blz<cgj> E = a("ender_pearl", blz.a.<cgj>a(cgj::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<ccf> F = a("enderman", blz.a.a(ccf::new, bmo.a).a(0.6F, 2.9F).a(8));
   public static final blz<ccg> G = a("endermite", blz.a.a(ccg::new, bmo.a).a(0.4F, 0.3F).a(8));
   public static final blz<cci> H = a("evoker", blz.a.a(cci::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<cfs> I = a("evoker_fangs", blz.a.<cfs>a(cfs::new, bmo.h).a(0.5F, 0.8F).a(6).b(2));
   public static final blz<cgk> J = a("experience_bottle", blz.a.<cgk>a(cgk::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<bmb> K = a("experience_orb", blz.a.<bmb>a(bmb::new, bmo.h).a(0.5F, 0.5F).a(6).b(20));
   public static final blz<cft> L = a("eye_of_ender", blz.a.<cft>a(cft::new, bmo.h).a(0.25F, 0.25F).a(4).b(4));
   public static final blz<cbt> M = a("falling_block", blz.a.<cbt>a(cbt::new, bmo.h).a(0.98F, 0.98F).a(10).b(20));
   public static final blz<cfv> N = a("firework_rocket", blz.a.<cfv>a(cfv::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<byi> O = a("fox", blz.a.a(byi::new, bmo.b).a(0.6F, 0.7F).a(8).a(cws.oi));
   public static final blz<bzn> P = a("frog", blz.a.a(bzn::new, bmo.b).a(0.5F, 0.5F).a(10));
   public static final blz<chj> Q = a("furnace_minecart", blz.a.<chj>a(chj::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<ccj> R = a("ghast", blz.a.a(ccj::new, bmo.a).c().a(4.0F, 4.0F).a(10));
   public static final blz<cck> S = a("giant", blz.a.a(cck::new, bmo.a).a(3.6F, 12.0F).a(10));
   public static final blz<cbl> T = a("glow_item_frame", blz.a.<cbl>a(cbl::new, bmo.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blz<bmd> U = a("glow_squid", blz.a.a(bmd::new, bmo.e).a(0.8F, 0.8F).a(10));
   public static final blz<bzt> V = a("goat", blz.a.a(bzt::new, bmo.b).a(0.9F, 1.3F).a(10));
   public static final blz<ccl> W = a("guardian", blz.a.a(ccl::new, bmo.a).a(0.85F, 0.85F).a(8));
   public static final blz<cds> X = a("hoglin", blz.a.a(cds::new, bmo.a).a(1.3964844F, 1.4F).a(8));
   public static final blz<chk> Y = a("hopper_minecart", blz.a.<chk>a(chk::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<bzz> Z = a("horse", blz.a.a(bzz::new, bmo.b).a(1.3964844F, 1.6F).a(10));
   public static final blz<ccm> aa = a("husk", blz.a.a(ccm::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<ccn> ab = a("illusioner", blz.a.a(ccn::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<bmg> ac = a("interaction", blz.a.a(bmg::new, bmo.h).a(0.0F, 0.0F).a(10));
   public static final blz<byk> ad = a("iron_golem", blz.a.a(byk::new, bmo.h).a(1.4F, 2.7F).a(10));
   public static final blz<cbu> ae = a("item", blz.a.<cbu>a(cbu::new, bmo.h).a(0.25F, 0.25F).a(6).b(20));
   public static final blz<blu.g> af = a("item_display", blz.a.a(blu.g::new, bmo.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blz<cbn> ag = a("item_frame", blz.a.<cbn>a(cbn::new, bmo.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blz<cfy> ah = a("fireball", blz.a.<cfy>a(cfy::new, bmo.h).a(1.0F, 1.0F).a(4).b(10));
   public static final blz<cbo> ai = a("leash_knot", blz.a.<cbo>a(cbo::new, bmo.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blz<bmk> aj = a("lightning_bolt", blz.a.a(bmk::new, bmo.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final blz<caa> ak = a("llama", blz.a.a(caa::new, bmo.b).a(0.9F, 1.87F).a(10));
   public static final blz<cfz> al = a("llama_spit", blz.a.<cfz>a(cfz::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<cco> am = a("magma_cube", blz.a.a(cco::new, bmo.a).c().a(2.04F, 2.04F).a(8));
   public static final blz<bmm> an = a("marker", blz.a.a(bmm::new, bmo.h).a(0.0F, 0.0F).a(0));
   public static final blz<chg> ao = a("minecart", blz.a.<chg>a(chg::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<byl> ap = a("mooshroom", blz.a.a(byl::new, bmo.b).a(0.9F, 1.4F).a(10));
   public static final blz<cac> aq = a("mule", blz.a.a(cac::new, bmo.b).a(1.3964844F, 1.6F).a(8));
   public static final blz<bym> ar = a("ocelot", blz.a.a(bym::new, bmo.b).a(0.6F, 0.7F).a(10));
   public static final blz<cbp> as = a("painting", blz.a.<cbp>a(cbp::new, bmo.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blz<byn> at = a("panda", blz.a.a(byn::new, bmo.b).a(1.3F, 1.25F).a(10));
   public static final blz<byo> au = a("parrot", blz.a.a(byo::new, bmo.b).a(0.5F, 0.9F).a(8));
   public static final blz<ccr> av = a("phantom", blz.a.a(ccr::new, bmo.a).a(0.9F, 0.5F).a(8));
   public static final blz<byp> aw = a("pig", blz.a.a(byp::new, bmo.b).a(0.9F, 0.9F).a(10));
   public static final blz<cdy> ax = a("piglin", blz.a.a(cdy::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<ceb> ay = a("piglin_brute", blz.a.a(ceb::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<ccs> az = a("pillager", blz.a.a(ccs::new, bmo.a).d().a(0.6F, 1.95F).a(8));
   public static final blz<byq> aA = a("polar_bear", blz.a.a(byq::new, bmo.b).a(cws.qP).a(1.4F, 1.4F).a(10));
   public static final blz<cgl> aB = a("potion", blz.a.<cgl>a(cgl::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<byr> aC = a("pufferfish", blz.a.a(byr::new, bmo.g).a(0.7F, 0.7F).a(4));
   public static final blz<bys> aD = a("rabbit", blz.a.a(bys::new, bmo.b).a(0.4F, 0.5F).a(8));
   public static final blz<ccu> aE = a("ravager", blz.a.a(ccu::new, bmo.a).a(1.95F, 2.2F).a(10));
   public static final blz<byt> aF = a("salmon", blz.a.a(byt::new, bmo.g).a(0.7F, 0.4F).a(4));
   public static final blz<byu> aG = a("sheep", blz.a.a(byu::new, bmo.b).a(0.9F, 1.3F).a(10));
   public static final blz<ccv> aH = a("shulker", blz.a.a(ccv::new, bmo.a).c().d().a(1.0F, 1.0F).a(10));
   public static final blz<cgc> aI = a("shulker_bullet", blz.a.<cgc>a(cgc::new, bmo.h).a(0.3125F, 0.3125F).a(8));
   public static final blz<ccw> aJ = a("silverfish", blz.a.a(ccw::new, bmo.a).a(0.4F, 0.3F).a(8));
   public static final blz<ccx> aK = a("skeleton", blz.a.a(ccx::new, bmo.a).a(0.6F, 1.99F).a(8));
   public static final blz<cad> aL = a("skeleton_horse", blz.a.a(cad::new, bmo.b).a(1.3964844F, 1.6F).a(10));
   public static final blz<ccy> aM = a("slime", blz.a.a(ccy::new, bmo.a).a(2.04F, 2.04F).a(10));
   public static final blz<cgd> aN = a("small_fireball", blz.a.<cgd>a(cgd::new, bmo.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blz<cak> aO = a("sniffer", blz.a.a(cak::new, bmo.b).a(1.9F, 1.75F).a(10));
   public static final blz<byw> aP = a("snow_golem", blz.a.a(byw::new, bmo.h).a(cws.qP).a(0.7F, 1.9F).a(8));
   public static final blz<cge> aQ = a("snowball", blz.a.<cge>a(cge::new, bmo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blz<chl> aR = a("spawner_minecart", blz.a.<chl>a(chl::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<cgf> aS = a("spectral_arrow", blz.a.<cgf>a(cgf::new, bmo.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blz<cda> aT = a("spider", blz.a.a(cda::new, bmo.a).a(1.4F, 0.9F).a(8));
   public static final blz<byx> aU = a("squid", blz.a.a(byx::new, bmo.f).a(0.8F, 0.8F).a(8));
   public static final blz<cdb> aV = a("stray", blz.a.a(cdb::new, bmo.a).a(0.6F, 1.99F).a(cws.qP).a(8));
   public static final blz<cdc> aW = a("strider", blz.a.a(cdc::new, bmo.b).c().a(0.9F, 1.7F).a(10));
   public static final blz<bzq> aX = a("tadpole", blz.a.a(bzq::new, bmo.b).a(bzq.c, bzq.d).a(10));
   public static final blz<blu.l> aY = a("text_display", blz.a.a(blu.l::new, bmo.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blz<cbv> aZ = a("tnt", blz.a.<cbv>a(cbv::new, bmo.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final blz<chm> ba = a("tnt_minecart", blz.a.<chm>a(chm::new, bmo.h).a(0.98F, 0.7F).a(8));
   public static final blz<caf> bb = a("trader_llama", blz.a.a(caf::new, bmo.b).a(0.9F, 1.87F).a(10));
   public static final blz<cgm> bc = a("trident", blz.a.<cgm>a(cgm::new, bmo.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blz<byy> bd = a("tropical_fish", blz.a.a(byy::new, bmo.g).a(0.5F, 0.4F).a(4));
   public static final blz<byz> be = a("turtle", blz.a.a(byz::new, bmo.b).a(1.2F, 0.4F).a(10));
   public static final blz<cdd> bf = a("vex", blz.a.a(cdd::new, bmo.a).c().a(0.4F, 0.8F).a(8));
   public static final blz<cev> bg = a("villager", blz.a.<cev>a(cev::new, bmo.h).a(0.6F, 1.95F).a(10));
   public static final blz<cde> bh = a("vindicator", blz.a.a(cde::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<cfb> bi = a("wandering_trader", blz.a.a(cfb::new, bmo.b).a(0.6F, 1.95F).a(10));
   public static final blz<cem> bj = a("warden", blz.a.a(cem::new, bmo.a).a(0.9F, 2.9F).a(16).c());
   public static final blz<cgn> bk = a("wind_charge", blz.a.<cgn>a(cgn::new, bmo.h).a(0.3125F, 0.3125F).a(4).b(10).a(chu.c));
   public static final blz<cdf> bl = a("witch", blz.a.a(cdf::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<cbi> bm = a("wither", blz.a.a(cbi::new, bmo.a).c().a(cws.cd).a(0.9F, 3.5F).a(10));
   public static final blz<cdg> bn = a("wither_skeleton", blz.a.a(cdg::new, bmo.a).c().a(cws.cd).a(0.7F, 2.4F).a(8));
   public static final blz<cgo> bo = a("wither_skull", blz.a.<cgo>a(cgo::new, bmo.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blz<bzb> bp = a("wolf", blz.a.a(bzb::new, bmo.b).a(0.6F, 0.85F).a(10));
   public static final blz<cdh> bq = a("zoglin", blz.a.a(cdh::new, bmo.a).c().a(1.3964844F, 1.4F).a(8));
   public static final blz<cdi> br = a("zombie", blz.a.<cdi>a(cdi::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<cah> bs = a("zombie_horse", blz.a.a(cah::new, bmo.b).a(1.3964844F, 1.6F).a(10));
   public static final blz<cdj> bt = a("zombie_villager", blz.a.a(cdj::new, bmo.a).a(0.6F, 1.95F).a(8));
   public static final blz<cdk> bu = a("zombified_piglin", blz.a.a(cdk::new, bmo.a).c().a(0.6F, 1.95F).a(8));
   public static final blz<cfi> bv = a("player", blz.a.<cfi>a(bmo.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final blz<cfw> bw = a("fishing_bobber", blz.a.<cfw>a(cfw::new, bmo.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final blz.b<T> bC;
   private final bmo bD;
   private final ImmutableSet<cwq> bE;
   private final boolean bF;
   private final boolean bG;
   private final boolean bH;
   private final boolean bI;
   private final int bJ;
   private final int bK;
   @Nullable
   private String bL;
   @Nullable
   private vf bM;
   @Nullable
   private ahg bN;
   private final blw bO;
   private final chs bP;

   private static <T extends blv> blz<T> a(String $$0, blz.a<T> $$1) {
      return it.a(kd.g, $$0, $$1.a($$0));
   }

   public static ahg a(blz<?> $$0) {
      return kd.g.b($$0);
   }

   public static Optional<blz<?>> a(String $$0) {
      return kd.g.b(ahg.a($$0));
   }

   public blz(blz.b<T> $$0, bmo $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cwq> $$6, blw $$7, int $$8, int $$9, chs $$10) {
      this.bC = $$0;
      this.bD = $$1;
      this.bI = $$5;
      this.bF = $$2;
      this.bG = $$3;
      this.bH = $$4;
      this.bE = $$6;
      this.bO = $$7;
      this.bJ = $$8;
      this.bK = $$9;
      this.bP = $$10;
   }

   @Nullable
   public T a(and $$0, @Nullable cmy $$1, @Nullable cfi $$2, hx $$3, bmp $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      sn $$7;
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

   public static <T extends blv> Consumer<T> a(and $$0, cmy $$1, @Nullable cfi $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends blv> Consumer<T> a(Consumer<T> $$0, and $$1, cmy $$2, @Nullable cfi $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends blv> Consumer<T> a(Consumer<T> $$0, cmy $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends blv> Consumer<T> b(Consumer<T> $$0, and $$1, cmy $$2, @Nullable cfi $$3) {
      sn $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(and $$0, hx $$1, bmp $$2) {
      return this.a($$0, (sn)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(and $$0, @Nullable sn $$1, @Nullable Consumer<T> $$2, hx $$3, bmp $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(and $$0, @Nullable sn $$1, @Nullable Consumer<T> $$2, hx $$3, bmp $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((ctp)$$0);
      if ($$7 == null) {
         return null;
      } else {
         double $$8;
         if ($$5) {
            $$7.a_((double)$$3.u() + 0.5, (double)($$3.v() + 1), (double)$$3.w() + 0.5);
            $$8 = a($$0, $$3, $$6, $$7.cH());
         } else {
            $$8 = 0.0;
         }

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, auo.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bmn $$10) {
            $$10.aW = $$10.dC();
            $$10.aU = $$10.dC();
            $$10.a($$0, $$0.d_($$10.dm()), $$4, null, $$1);
            $$10.R();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(cts $$0, hx $$1, boolean $$2, elo $$3) {
      elo $$4 = new elo($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<emm> $$5 = $$0.d(null, $$4);
      return 1.0 + emj.a(ic.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(ctp $$0, @Nullable cfi $$1, @Nullable blv $$2, @Nullable sn $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ae().f($$1.fR())) {
               sn $$5 = $$2.f(new sn());
               UUID $$6 = $$2.cw();
               $$5.a($$3.p("EntityTag"));
               $$2.a_($$6);
               $$2.g($$5);
            }
         }
      }
   }

   public boolean b() {
      return this.bF;
   }

   public boolean c() {
      return this.bG;
   }

   public boolean d() {
      return this.bH;
   }

   public boolean e() {
      return this.bI;
   }

   public bmo f() {
      return this.bD;
   }

   public String g() {
      if (this.bL == null) {
         this.bL = ac.a("entity", kd.g.b(this));
      }

      return this.bL;
   }

   public vf h() {
      if (this.bM == null) {
         this.bM = vf.c(this.g());
      }

      return this.bM;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public ahg j() {
      if (this.bN == null) {
         ahg $$0 = kd.g.b(this);
         this.bN = $$0.d("entities/");
      }

      return this.bN;
   }

   public float k() {
      return this.bO.a;
   }

   public float l() {
      return this.bO.b;
   }

   @Override
   public chs m() {
      return this.bP;
   }

   @Nullable
   public T a(ctp $$0) {
      return !this.a($$0.I()) ? null : this.bC.create(this, $$0);
   }

   public static Optional<blv> a(sn $$0, ctp $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> by.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public elo a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new elo($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(djh $$0) {
      if (this.bE.contains($$0.b())) {
         return false;
      } else {
         return !this.bH && efl.a($$0) ? true : $$0.a(cws.cd) || $$0.a(cws.oi) || $$0.a(cws.dQ) || $$0.a(cws.qP);
      }
   }

   public blw n() {
      return this.bO;
   }

   public static Optional<blz<?>> a(sn $$0) {
      return kd.g.b(new ahg($$0.l("id")));
   }

   @Nullable
   public static blv a(sn $$0, ctp $$1, Function<blv, blv> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            st $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               blv $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (blv)$$3;
      }).orElse(null);
   }

   public static Stream<blv> a(final List<? extends tk> $$0, final ctp $$1) {
      final Spliterator<? extends tk> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<blv>() {
         @Override
         public boolean tryAdvance(Consumer<? super blv> $$0x) {
            return $$2.tryAdvance($$2xx -> blz.a((sn)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<blv> trySplit() {
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

   private static Optional<blv> b(sn $$0, ctp $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         by.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bJ;
   }

   public int p() {
      return this.bK;
   }

   public boolean q() {
      return this != bv && this != al && this != bm && this != g && this != ag && this != T && this != ai && this != as && this != C && this != I;
   }

   public boolean a(asw<blz<?>> $$0) {
      return this.bz.a($$0);
   }

   public boolean a(il<blz<?>> $$0) {
      return $$0.a(this.bz);
   }

   @Nullable
   public T a(blv $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends blv> a() {
      return blv.class;
   }

   @Deprecated
   public ih.c<blz<?>> r() {
      return this.bz;
   }

   public static class a<T extends blv> {
      private final blz.b<T> a;
      private final bmo b;
      private ImmutableSet<cwq> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private blw j = blw.b(0.6F, 1.8F);
      private chs k = chu.g;

      private a(blz.b<T> $$0, bmo $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bmo.b || $$1 == bmo.h;
      }

      public static <T extends blv> blz.a<T> a(blz.b<T> $$0, bmo $$1) {
         return new blz.a<>($$0, $$1);
      }

      public static <T extends blv> blz.a<T> a(bmo $$0) {
         return new blz.a<>(($$0x, $$1) -> null, $$0);
      }

      public blz.a<T> a(float $$0, float $$1) {
         this.j = blw.b($$0, $$1);
         return this;
      }

      public blz.a<T> a() {
         this.e = false;
         return this;
      }

      public blz.a<T> b() {
         this.d = false;
         return this;
      }

      public blz.a<T> c() {
         this.f = true;
         return this;
      }

      public blz.a<T> a(cwq... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public blz.a<T> d() {
         this.g = true;
         return this;
      }

      public blz.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public blz.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public blz.a<T> a(chq... $$0) {
         this.k = chu.e.a($$0);
         return this;
      }

      public blz<T> a(String $$0) {
         if (this.d) {
            ac.a(bbw.w, $$0);
         }

         return new blz<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends blv> {
      T create(blz<T> var1, ctp var2);
   }
}
