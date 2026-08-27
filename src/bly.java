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

public class bly<T extends blu> implements cho, dne<blu, T> {
   private static final Logger by = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ih.c<bly<?>> bz = kd.g.f(this);
   private static final float bA = 1.3964844F;
   private static final int bB = 10;
   public static final bly<bzb> b = a("allay", bly.a.a(bzb::new, bmn.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bly<blr> c = a("area_effect_cloud", bly.a.<blr>a(blr::new, bmn.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bly<cbj> d = a("armor_stand", bly.a.<cbj>a(cbj::new, bmn.h).a(0.5F, 1.975F).a(10));
   public static final bly<cfp> e = a("arrow", bly.a.<cfp>a(cfp::new, bmn.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bly<bze> f = a("axolotl", bly.a.a(bze::new, bmn.d).a(0.75F, 0.42F).a(10));
   public static final bly<bxs> g = a("bat", bly.a.a(bxs::new, bmn.c).a(0.5F, 0.9F).a(5));
   public static final bly<bxy> h = a("bee", bly.a.a(bxy::new, bmn.b).a(0.7F, 0.6F).a(8));
   public static final bly<cby> i = a("blaze", bly.a.a(cby::new, bmn.a).c().a(0.6F, 1.8F).a(8));
   public static final bly<blt.b> j = a("block_display", bly.a.a(blt.b::new, bmn.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bly<chb> k = a("boat", bly.a.<chb>a(chb::new, bmn.h).a(1.375F, 0.5625F).a(10));
   public static final bly<cdk> l = a("breeze", bly.a.a(cdk::new, bmn.a).a(0.6F, 1.7F).a(10).a(cht.c));
   public static final bly<bzj> m = a("camel", bly.a.a(bzj::new, bmn.b).a(1.7F, 2.375F).a(10));
   public static final bly<bya> n = a("cat", bly.a.a(bya::new, bmn.b).a(0.6F, 0.7F).a(8));
   public static final bly<cbz> o = a("cave_spider", bly.a.a(cbz::new, bmn.a).a(0.7F, 0.5F).a(8));
   public static final bly<chc> p = a("chest_boat", bly.a.<chc>a(chc::new, bmn.h).a(1.375F, 0.5625F).a(10));
   public static final bly<chg> q = a("chest_minecart", bly.a.<chg>a(chg::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<byc> r = a("chicken", bly.a.a(byc::new, bmn.b).a(0.4F, 0.7F).a(10));
   public static final bly<byd> s = a("cod", bly.a.a(byd::new, bmn.g).a(0.5F, 0.3F).a(4));
   public static final bly<chh> t = a("command_block_minecart", bly.a.<chh>a(chh::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<bye> u = a("cow", bly.a.a(bye::new, bmn.b).a(0.9F, 1.4F).a(10));
   public static final bly<cca> v = a("creeper", bly.a.a(cca::new, bmn.a).a(0.6F, 1.7F).a(8));
   public static final bly<byf> w = a("dolphin", bly.a.a(byf::new, bmn.f).a(0.9F, 0.6F));
   public static final bly<bzx> x = a("donkey", bly.a.a(bzx::new, bmn.b).a(1.3964844F, 1.5F).a(10));
   public static final bly<cfq> y = a("dragon_fireball", bly.a.<cfq>a(cfq::new, bmn.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bly<ccc> z = a("drowned", bly.a.a(ccc::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cgh> A = a("egg", bly.a.<cgh>a(cgh::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<ccd> B = a("elder_guardian", bly.a.a(ccd::new, bmn.a).a(1.9975F, 1.9975F).a(10));
   public static final bly<cam> C = a("end_crystal", bly.a.<cam>a(cam::new, bmn.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bly<can> D = a("ender_dragon", bly.a.a(can::new, bmn.a).c().a(16.0F, 8.0F).a(10));
   public static final bly<cgi> E = a("ender_pearl", bly.a.<cgi>a(cgi::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<cce> F = a("enderman", bly.a.a(cce::new, bmn.a).a(0.6F, 2.9F).a(8));
   public static final bly<ccf> G = a("endermite", bly.a.a(ccf::new, bmn.a).a(0.4F, 0.3F).a(8));
   public static final bly<cch> H = a("evoker", bly.a.a(cch::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cfr> I = a("evoker_fangs", bly.a.<cfr>a(cfr::new, bmn.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bly<cgj> J = a("experience_bottle", bly.a.<cgj>a(cgj::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<bma> K = a("experience_orb", bly.a.<bma>a(bma::new, bmn.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bly<cfs> L = a("eye_of_ender", bly.a.<cfs>a(cfs::new, bmn.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bly<cbs> M = a("falling_block", bly.a.<cbs>a(cbs::new, bmn.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bly<cfu> N = a("firework_rocket", bly.a.<cfu>a(cfu::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<byh> O = a("fox", bly.a.a(byh::new, bmn.b).a(0.6F, 0.7F).a(8).a(cwr.oi));
   public static final bly<bzm> P = a("frog", bly.a.a(bzm::new, bmn.b).a(0.5F, 0.5F).a(10));
   public static final bly<chi> Q = a("furnace_minecart", bly.a.<chi>a(chi::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<cci> R = a("ghast", bly.a.a(cci::new, bmn.a).c().a(4.0F, 4.0F).a(10));
   public static final bly<ccj> S = a("giant", bly.a.a(ccj::new, bmn.a).a(3.6F, 12.0F).a(10));
   public static final bly<cbk> T = a("glow_item_frame", bly.a.<cbk>a(cbk::new, bmn.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bly<bmc> U = a("glow_squid", bly.a.a(bmc::new, bmn.e).a(0.8F, 0.8F).a(10));
   public static final bly<bzs> V = a("goat", bly.a.a(bzs::new, bmn.b).a(0.9F, 1.3F).a(10));
   public static final bly<cck> W = a("guardian", bly.a.a(cck::new, bmn.a).a(0.85F, 0.85F).a(8));
   public static final bly<cdr> X = a("hoglin", bly.a.a(cdr::new, bmn.a).a(1.3964844F, 1.4F).a(8));
   public static final bly<chj> Y = a("hopper_minecart", bly.a.<chj>a(chj::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<bzy> Z = a("horse", bly.a.a(bzy::new, bmn.b).a(1.3964844F, 1.6F).a(10));
   public static final bly<ccl> aa = a("husk", bly.a.a(ccl::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<ccm> ab = a("illusioner", bly.a.a(ccm::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<bmf> ac = a("interaction", bly.a.a(bmf::new, bmn.h).a(0.0F, 0.0F).a(10));
   public static final bly<byj> ad = a("iron_golem", bly.a.a(byj::new, bmn.h).a(1.4F, 2.7F).a(10));
   public static final bly<cbt> ae = a("item", bly.a.<cbt>a(cbt::new, bmn.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bly<blt.g> af = a("item_display", bly.a.a(blt.g::new, bmn.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bly<cbm> ag = a("item_frame", bly.a.<cbm>a(cbm::new, bmn.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bly<cfx> ah = a("fireball", bly.a.<cfx>a(cfx::new, bmn.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bly<cbn> ai = a("leash_knot", bly.a.<cbn>a(cbn::new, bmn.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bly<bmj> aj = a("lightning_bolt", bly.a.a(bmj::new, bmn.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bly<bzz> ak = a("llama", bly.a.a(bzz::new, bmn.b).a(0.9F, 1.87F).a(10));
   public static final bly<cfy> al = a("llama_spit", bly.a.<cfy>a(cfy::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<ccn> am = a("magma_cube", bly.a.a(ccn::new, bmn.a).c().a(2.04F, 2.04F).a(8));
   public static final bly<bml> an = a("marker", bly.a.a(bml::new, bmn.h).a(0.0F, 0.0F).a(0));
   public static final bly<chf> ao = a("minecart", bly.a.<chf>a(chf::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<byk> ap = a("mooshroom", bly.a.a(byk::new, bmn.b).a(0.9F, 1.4F).a(10));
   public static final bly<cab> aq = a("mule", bly.a.a(cab::new, bmn.b).a(1.3964844F, 1.6F).a(8));
   public static final bly<byl> ar = a("ocelot", bly.a.a(byl::new, bmn.b).a(0.6F, 0.7F).a(10));
   public static final bly<cbo> as = a("painting", bly.a.<cbo>a(cbo::new, bmn.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bly<bym> at = a("panda", bly.a.a(bym::new, bmn.b).a(1.3F, 1.25F).a(10));
   public static final bly<byn> au = a("parrot", bly.a.a(byn::new, bmn.b).a(0.5F, 0.9F).a(8));
   public static final bly<ccq> av = a("phantom", bly.a.a(ccq::new, bmn.a).a(0.9F, 0.5F).a(8));
   public static final bly<byo> aw = a("pig", bly.a.a(byo::new, bmn.b).a(0.9F, 0.9F).a(10));
   public static final bly<cdx> ax = a("piglin", bly.a.a(cdx::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cea> ay = a("piglin_brute", bly.a.a(cea::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<ccr> az = a("pillager", bly.a.a(ccr::new, bmn.a).d().a(0.6F, 1.95F).a(8));
   public static final bly<byp> aA = a("polar_bear", bly.a.a(byp::new, bmn.b).a(cwr.qP).a(1.4F, 1.4F).a(10));
   public static final bly<cgk> aB = a("potion", bly.a.<cgk>a(cgk::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<byq> aC = a("pufferfish", bly.a.a(byq::new, bmn.g).a(0.7F, 0.7F).a(4));
   public static final bly<byr> aD = a("rabbit", bly.a.a(byr::new, bmn.b).a(0.4F, 0.5F).a(8));
   public static final bly<cct> aE = a("ravager", bly.a.a(cct::new, bmn.a).a(1.95F, 2.2F).a(10));
   public static final bly<bys> aF = a("salmon", bly.a.a(bys::new, bmn.g).a(0.7F, 0.4F).a(4));
   public static final bly<byt> aG = a("sheep", bly.a.a(byt::new, bmn.b).a(0.9F, 1.3F).a(10));
   public static final bly<ccu> aH = a("shulker", bly.a.a(ccu::new, bmn.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bly<cgb> aI = a("shulker_bullet", bly.a.<cgb>a(cgb::new, bmn.h).a(0.3125F, 0.3125F).a(8));
   public static final bly<ccv> aJ = a("silverfish", bly.a.a(ccv::new, bmn.a).a(0.4F, 0.3F).a(8));
   public static final bly<ccw> aK = a("skeleton", bly.a.a(ccw::new, bmn.a).a(0.6F, 1.99F).a(8));
   public static final bly<cac> aL = a("skeleton_horse", bly.a.a(cac::new, bmn.b).a(1.3964844F, 1.6F).a(10));
   public static final bly<ccx> aM = a("slime", bly.a.a(ccx::new, bmn.a).a(2.04F, 2.04F).a(10));
   public static final bly<cgc> aN = a("small_fireball", bly.a.<cgc>a(cgc::new, bmn.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bly<caj> aO = a("sniffer", bly.a.a(caj::new, bmn.b).a(1.9F, 1.75F).a(10));
   public static final bly<byv> aP = a("snow_golem", bly.a.a(byv::new, bmn.h).a(cwr.qP).a(0.7F, 1.9F).a(8));
   public static final bly<cgd> aQ = a("snowball", bly.a.<cgd>a(cgd::new, bmn.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bly<chk> aR = a("spawner_minecart", bly.a.<chk>a(chk::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<cge> aS = a("spectral_arrow", bly.a.<cge>a(cge::new, bmn.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bly<ccz> aT = a("spider", bly.a.a(ccz::new, bmn.a).a(1.4F, 0.9F).a(8));
   public static final bly<byw> aU = a("squid", bly.a.a(byw::new, bmn.f).a(0.8F, 0.8F).a(8));
   public static final bly<cda> aV = a("stray", bly.a.a(cda::new, bmn.a).a(0.6F, 1.99F).a(cwr.qP).a(8));
   public static final bly<cdb> aW = a("strider", bly.a.a(cdb::new, bmn.b).c().a(0.9F, 1.7F).a(10));
   public static final bly<bzp> aX = a("tadpole", bly.a.a(bzp::new, bmn.b).a(bzp.c, bzp.d).a(10));
   public static final bly<blt.l> aY = a("text_display", bly.a.a(blt.l::new, bmn.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bly<cbu> aZ = a("tnt", bly.a.<cbu>a(cbu::new, bmn.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bly<chl> ba = a("tnt_minecart", bly.a.<chl>a(chl::new, bmn.h).a(0.98F, 0.7F).a(8));
   public static final bly<cae> bb = a("trader_llama", bly.a.a(cae::new, bmn.b).a(0.9F, 1.87F).a(10));
   public static final bly<cgl> bc = a("trident", bly.a.<cgl>a(cgl::new, bmn.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bly<byx> bd = a("tropical_fish", bly.a.a(byx::new, bmn.g).a(0.5F, 0.4F).a(4));
   public static final bly<byy> be = a("turtle", bly.a.a(byy::new, bmn.b).a(1.2F, 0.4F).a(10));
   public static final bly<cdc> bf = a("vex", bly.a.a(cdc::new, bmn.a).c().a(0.4F, 0.8F).a(8));
   public static final bly<ceu> bg = a("villager", bly.a.<ceu>a(ceu::new, bmn.h).a(0.6F, 1.95F).a(10));
   public static final bly<cdd> bh = a("vindicator", bly.a.a(cdd::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cfa> bi = a("wandering_trader", bly.a.a(cfa::new, bmn.b).a(0.6F, 1.95F).a(10));
   public static final bly<cel> bj = a("warden", bly.a.a(cel::new, bmn.a).a(0.9F, 2.9F).a(16).c());
   public static final bly<cgm> bk = a("wind_charge", bly.a.<cgm>a(cgm::new, bmn.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bly<cde> bl = a("witch", bly.a.a(cde::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cbh> bm = a("wither", bly.a.a(cbh::new, bmn.a).c().a(cwr.cd).a(0.9F, 3.5F).a(10));
   public static final bly<cdf> bn = a("wither_skeleton", bly.a.a(cdf::new, bmn.a).c().a(cwr.cd).a(0.7F, 2.4F).a(8));
   public static final bly<cgn> bo = a("wither_skull", bly.a.<cgn>a(cgn::new, bmn.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bly<bza> bp = a("wolf", bly.a.a(bza::new, bmn.b).a(0.6F, 0.85F).a(10));
   public static final bly<cdg> bq = a("zoglin", bly.a.a(cdg::new, bmn.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bly<cdh> br = a("zombie", bly.a.<cdh>a(cdh::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cag> bs = a("zombie_horse", bly.a.a(cag::new, bmn.b).a(1.3964844F, 1.6F).a(10));
   public static final bly<cdi> bt = a("zombie_villager", bly.a.a(cdi::new, bmn.a).a(0.6F, 1.95F).a(8));
   public static final bly<cdj> bu = a("zombified_piglin", bly.a.a(cdj::new, bmn.a).c().a(0.6F, 1.95F).a(8));
   public static final bly<cfh> bv = a("player", bly.a.<cfh>a(bmn.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bly<cfv> bw = a("fishing_bobber", bly.a.<cfv>a(cfv::new, bmn.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bly.b<T> bC;
   private final bmn bD;
   private final ImmutableSet<cwp> bE;
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
   private final blv bO;
   private final chr bP;

   private static <T extends blu> bly<T> a(String $$0, bly.a<T> $$1) {
      return it.a(kd.g, $$0, $$1.a($$0));
   }

   public static ahg a(bly<?> $$0) {
      return kd.g.b($$0);
   }

   public static Optional<bly<?>> a(String $$0) {
      return kd.g.b(ahg.a($$0));
   }

   public bly(bly.b<T> $$0, bmn $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cwp> $$6, blv $$7, int $$8, int $$9, chr $$10) {
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
   public T a(and $$0, @Nullable cmx $$1, @Nullable cfh $$2, hx $$3, bmo $$4, boolean $$5, boolean $$6) {
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

   public static <T extends blu> Consumer<T> a(and $$0, cmx $$1, @Nullable cfh $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends blu> Consumer<T> a(Consumer<T> $$0, and $$1, cmx $$2, @Nullable cfh $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends blu> Consumer<T> a(Consumer<T> $$0, cmx $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends blu> Consumer<T> b(Consumer<T> $$0, and $$1, cmx $$2, @Nullable cfh $$3) {
      sn $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(and $$0, hx $$1, bmo $$2) {
      return this.a($$0, (sn)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(and $$0, @Nullable sn $$1, @Nullable Consumer<T> $$2, hx $$3, bmo $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(and $$0, @Nullable sn $$1, @Nullable Consumer<T> $$2, hx $$3, bmo $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cto)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, aun.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bmm $$10) {
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

   protected static double a(ctr $$0, hx $$1, boolean $$2, eln $$3) {
      eln $$4 = new eln($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eml> $$5 = $$0.d(null, $$4);
      return 1.0 + emi.a(ic.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cto $$0, @Nullable cfh $$1, @Nullable blu $$2, @Nullable sn $$3) {
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

   public bmn f() {
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
   public chr m() {
      return this.bP;
   }

   @Nullable
   public T a(cto $$0) {
      return !this.a($$0.I()) ? null : this.bC.create(this, $$0);
   }

   public static Optional<blu> a(sn $$0, cto $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> by.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eln a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eln($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(djg $$0) {
      if (this.bE.contains($$0.b())) {
         return false;
      } else {
         return !this.bH && efk.a($$0) ? true : $$0.a(cwr.cd) || $$0.a(cwr.oi) || $$0.a(cwr.dQ) || $$0.a(cwr.qP);
      }
   }

   public blv n() {
      return this.bO;
   }

   public static Optional<bly<?>> a(sn $$0) {
      return kd.g.b(new ahg($$0.l("id")));
   }

   @Nullable
   public static blu a(sn $$0, cto $$1, Function<blu, blu> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            st $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               blu $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (blu)$$3;
      }).orElse(null);
   }

   public static Stream<blu> a(final List<? extends tk> $$0, final cto $$1) {
      final Spliterator<? extends tk> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<blu>() {
         @Override
         public boolean tryAdvance(Consumer<? super blu> $$0x) {
            return $$2.tryAdvance($$2xx -> bly.a((sn)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<blu> trySplit() {
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

   private static Optional<blu> b(sn $$0, cto $$1) {
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

   public boolean a(asv<bly<?>> $$0) {
      return this.bz.a($$0);
   }

   public boolean a(il<bly<?>> $$0) {
      return $$0.a(this.bz);
   }

   @Nullable
   public T a(blu $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends blu> a() {
      return blu.class;
   }

   @Deprecated
   public ih.c<bly<?>> r() {
      return this.bz;
   }

   public static class a<T extends blu> {
      private final bly.b<T> a;
      private final bmn b;
      private ImmutableSet<cwp> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private blv j = blv.b(0.6F, 1.8F);
      private chr k = cht.g;

      private a(bly.b<T> $$0, bmn $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bmn.b || $$1 == bmn.h;
      }

      public static <T extends blu> bly.a<T> a(bly.b<T> $$0, bmn $$1) {
         return new bly.a<>($$0, $$1);
      }

      public static <T extends blu> bly.a<T> a(bmn $$0) {
         return new bly.a<>(($$0x, $$1) -> null, $$0);
      }

      public bly.a<T> a(float $$0, float $$1) {
         this.j = blv.b($$0, $$1);
         return this;
      }

      public bly.a<T> a() {
         this.e = false;
         return this;
      }

      public bly.a<T> b() {
         this.d = false;
         return this;
      }

      public bly.a<T> c() {
         this.f = true;
         return this;
      }

      public bly.a<T> a(cwp... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bly.a<T> d() {
         this.g = true;
         return this;
      }

      public bly.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bly.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bly.a<T> a(chp... $$0) {
         this.k = cht.e.a($$0);
         return this;
      }

      public bly<T> a(String $$0) {
         if (this.d) {
            ac.a(bbv.w, $$0);
         }

         return new bly<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends blu> {
      T create(bly<T> var1, cto var2);
   }
}
