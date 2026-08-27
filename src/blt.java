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

public class blt<T extends blp> implements chi, dmy<blp, T> {
   private static final Logger by = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ih.c<blt<?>> bz = kd.g.f(this);
   private static final float bA = 1.3964844F;
   private static final int bB = 10;
   public static final blt<byw> b = a("allay", blt.a.a(byw::new, bmi.b).a(0.35F, 0.6F).a(8).b(2));
   public static final blt<blm> c = a("area_effect_cloud", blt.a.<blm>a(blm::new, bmi.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blt<cbe> d = a("armor_stand", blt.a.<cbe>a(cbe::new, bmi.h).a(0.5F, 1.975F).a(10));
   public static final blt<cfj> e = a("arrow", blt.a.<cfj>a(cfj::new, bmi.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blt<byz> f = a("axolotl", blt.a.a(byz::new, bmi.d).a(0.75F, 0.42F).a(10));
   public static final blt<bxn> g = a("bat", blt.a.a(bxn::new, bmi.c).a(0.5F, 0.9F).a(5));
   public static final blt<bxt> h = a("bee", blt.a.a(bxt::new, bmi.b).a(0.7F, 0.6F).a(8));
   public static final blt<cbt> i = a("blaze", blt.a.a(cbt::new, bmi.a).c().a(0.6F, 1.8F).a(8));
   public static final blt<blo.b> j = a("block_display", blt.a.a(blo.b::new, bmi.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blt<cgv> k = a("boat", blt.a.<cgv>a(cgv::new, bmi.h).a(1.375F, 0.5625F).a(10));
   public static final blt<cdf> l = a("breeze", blt.a.a(cdf::new, bmi.a).a(0.6F, 1.7F).a(10).a(chn.c));
   public static final blt<bze> m = a("camel", blt.a.a(bze::new, bmi.b).a(1.7F, 2.375F).a(10));
   public static final blt<bxv> n = a("cat", blt.a.a(bxv::new, bmi.b).a(0.6F, 0.7F).a(8));
   public static final blt<cbu> o = a("cave_spider", blt.a.a(cbu::new, bmi.a).a(0.7F, 0.5F).a(8));
   public static final blt<cgw> p = a("chest_boat", blt.a.<cgw>a(cgw::new, bmi.h).a(1.375F, 0.5625F).a(10));
   public static final blt<cha> q = a("chest_minecart", blt.a.<cha>a(cha::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<bxx> r = a("chicken", blt.a.a(bxx::new, bmi.b).a(0.4F, 0.7F).a(10));
   public static final blt<bxy> s = a("cod", blt.a.a(bxy::new, bmi.g).a(0.5F, 0.3F).a(4));
   public static final blt<chb> t = a("command_block_minecart", blt.a.<chb>a(chb::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<bxz> u = a("cow", blt.a.a(bxz::new, bmi.b).a(0.9F, 1.4F).a(10));
   public static final blt<cbv> v = a("creeper", blt.a.a(cbv::new, bmi.a).a(0.6F, 1.7F).a(8));
   public static final blt<bya> w = a("dolphin", blt.a.a(bya::new, bmi.f).a(0.9F, 0.6F));
   public static final blt<bzs> x = a("donkey", blt.a.a(bzs::new, bmi.b).a(1.3964844F, 1.5F).a(10));
   public static final blt<cfk> y = a("dragon_fireball", blt.a.<cfk>a(cfk::new, bmi.h).a(1.0F, 1.0F).a(4).b(10));
   public static final blt<cbx> z = a("drowned", blt.a.a(cbx::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cgb> A = a("egg", blt.a.<cgb>a(cgb::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<cby> B = a("elder_guardian", blt.a.a(cby::new, bmi.a).a(1.9975F, 1.9975F).a(10));
   public static final blt<cah> C = a("end_crystal", blt.a.<cah>a(cah::new, bmi.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final blt<cai> D = a("ender_dragon", blt.a.a(cai::new, bmi.a).c().a(16.0F, 8.0F).a(10));
   public static final blt<cgc> E = a("ender_pearl", blt.a.<cgc>a(cgc::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<cbz> F = a("enderman", blt.a.a(cbz::new, bmi.a).a(0.6F, 2.9F).a(8));
   public static final blt<cca> G = a("endermite", blt.a.a(cca::new, bmi.a).a(0.4F, 0.3F).a(8));
   public static final blt<ccc> H = a("evoker", blt.a.a(ccc::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cfl> I = a("evoker_fangs", blt.a.<cfl>a(cfl::new, bmi.h).a(0.5F, 0.8F).a(6).b(2));
   public static final blt<cgd> J = a("experience_bottle", blt.a.<cgd>a(cgd::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<blv> K = a("experience_orb", blt.a.<blv>a(blv::new, bmi.h).a(0.5F, 0.5F).a(6).b(20));
   public static final blt<cfm> L = a("eye_of_ender", blt.a.<cfm>a(cfm::new, bmi.h).a(0.25F, 0.25F).a(4).b(4));
   public static final blt<cbn> M = a("falling_block", blt.a.<cbn>a(cbn::new, bmi.h).a(0.98F, 0.98F).a(10).b(20));
   public static final blt<cfo> N = a("firework_rocket", blt.a.<cfo>a(cfo::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<byc> O = a("fox", blt.a.a(byc::new, bmi.b).a(0.6F, 0.7F).a(8).a(cwl.oi));
   public static final blt<bzh> P = a("frog", blt.a.a(bzh::new, bmi.b).a(0.5F, 0.5F).a(10));
   public static final blt<chc> Q = a("furnace_minecart", blt.a.<chc>a(chc::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<ccd> R = a("ghast", blt.a.a(ccd::new, bmi.a).c().a(4.0F, 4.0F).a(10));
   public static final blt<cce> S = a("giant", blt.a.a(cce::new, bmi.a).a(3.6F, 12.0F).a(10));
   public static final blt<cbf> T = a("glow_item_frame", blt.a.<cbf>a(cbf::new, bmi.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blt<blx> U = a("glow_squid", blt.a.a(blx::new, bmi.e).a(0.8F, 0.8F).a(10));
   public static final blt<bzn> V = a("goat", blt.a.a(bzn::new, bmi.b).a(0.9F, 1.3F).a(10));
   public static final blt<ccf> W = a("guardian", blt.a.a(ccf::new, bmi.a).a(0.85F, 0.85F).a(8));
   public static final blt<cdl> X = a("hoglin", blt.a.a(cdl::new, bmi.a).a(1.3964844F, 1.4F).a(8));
   public static final blt<chd> Y = a("hopper_minecart", blt.a.<chd>a(chd::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<bzt> Z = a("horse", blt.a.a(bzt::new, bmi.b).a(1.3964844F, 1.6F).a(10));
   public static final blt<ccg> aa = a("husk", blt.a.a(ccg::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cch> ab = a("illusioner", blt.a.a(cch::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<bma> ac = a("interaction", blt.a.a(bma::new, bmi.h).a(0.0F, 0.0F).a(10));
   public static final blt<bye> ad = a("iron_golem", blt.a.a(bye::new, bmi.h).a(1.4F, 2.7F).a(10));
   public static final blt<cbo> ae = a("item", blt.a.<cbo>a(cbo::new, bmi.h).a(0.25F, 0.25F).a(6).b(20));
   public static final blt<blo.g> af = a("item_display", blt.a.a(blo.g::new, bmi.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blt<cbh> ag = a("item_frame", blt.a.<cbh>a(cbh::new, bmi.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blt<cfr> ah = a("fireball", blt.a.<cfr>a(cfr::new, bmi.h).a(1.0F, 1.0F).a(4).b(10));
   public static final blt<cbi> ai = a("leash_knot", blt.a.<cbi>a(cbi::new, bmi.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blt<bme> aj = a("lightning_bolt", blt.a.a(bme::new, bmi.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final blt<bzu> ak = a("llama", blt.a.a(bzu::new, bmi.b).a(0.9F, 1.87F).a(10));
   public static final blt<cfs> al = a("llama_spit", blt.a.<cfs>a(cfs::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<cci> am = a("magma_cube", blt.a.a(cci::new, bmi.a).c().a(2.04F, 2.04F).a(8));
   public static final blt<bmg> an = a("marker", blt.a.a(bmg::new, bmi.h).a(0.0F, 0.0F).a(0));
   public static final blt<cgz> ao = a("minecart", blt.a.<cgz>a(cgz::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<byf> ap = a("mooshroom", blt.a.a(byf::new, bmi.b).a(0.9F, 1.4F).a(10));
   public static final blt<bzw> aq = a("mule", blt.a.a(bzw::new, bmi.b).a(1.3964844F, 1.6F).a(8));
   public static final blt<byg> ar = a("ocelot", blt.a.a(byg::new, bmi.b).a(0.6F, 0.7F).a(10));
   public static final blt<cbj> as = a("painting", blt.a.<cbj>a(cbj::new, bmi.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blt<byh> at = a("panda", blt.a.a(byh::new, bmi.b).a(1.3F, 1.25F).a(10));
   public static final blt<byi> au = a("parrot", blt.a.a(byi::new, bmi.b).a(0.5F, 0.9F).a(8));
   public static final blt<ccl> av = a("phantom", blt.a.a(ccl::new, bmi.a).a(0.9F, 0.5F).a(8));
   public static final blt<byj> aw = a("pig", blt.a.a(byj::new, bmi.b).a(0.9F, 0.9F).a(10));
   public static final blt<cdr> ax = a("piglin", blt.a.a(cdr::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cdu> ay = a("piglin_brute", blt.a.a(cdu::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<ccm> az = a("pillager", blt.a.a(ccm::new, bmi.a).d().a(0.6F, 1.95F).a(8));
   public static final blt<byk> aA = a("polar_bear", blt.a.a(byk::new, bmi.b).a(cwl.qP).a(1.4F, 1.4F).a(10));
   public static final blt<cge> aB = a("potion", blt.a.<cge>a(cge::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<byl> aC = a("pufferfish", blt.a.a(byl::new, bmi.g).a(0.7F, 0.7F).a(4));
   public static final blt<bym> aD = a("rabbit", blt.a.a(bym::new, bmi.b).a(0.4F, 0.5F).a(8));
   public static final blt<cco> aE = a("ravager", blt.a.a(cco::new, bmi.a).a(1.95F, 2.2F).a(10));
   public static final blt<byn> aF = a("salmon", blt.a.a(byn::new, bmi.g).a(0.7F, 0.4F).a(4));
   public static final blt<byo> aG = a("sheep", blt.a.a(byo::new, bmi.b).a(0.9F, 1.3F).a(10));
   public static final blt<ccp> aH = a("shulker", blt.a.a(ccp::new, bmi.a).c().d().a(1.0F, 1.0F).a(10));
   public static final blt<cfv> aI = a("shulker_bullet", blt.a.<cfv>a(cfv::new, bmi.h).a(0.3125F, 0.3125F).a(8));
   public static final blt<ccq> aJ = a("silverfish", blt.a.a(ccq::new, bmi.a).a(0.4F, 0.3F).a(8));
   public static final blt<ccr> aK = a("skeleton", blt.a.a(ccr::new, bmi.a).a(0.6F, 1.99F).a(8));
   public static final blt<bzx> aL = a("skeleton_horse", blt.a.a(bzx::new, bmi.b).a(1.3964844F, 1.6F).a(10));
   public static final blt<ccs> aM = a("slime", blt.a.a(ccs::new, bmi.a).a(2.04F, 2.04F).a(10));
   public static final blt<cfw> aN = a("small_fireball", blt.a.<cfw>a(cfw::new, bmi.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blt<cae> aO = a("sniffer", blt.a.a(cae::new, bmi.b).a(1.9F, 1.75F).a(10));
   public static final blt<byq> aP = a("snow_golem", blt.a.a(byq::new, bmi.h).a(cwl.qP).a(0.7F, 1.9F).a(8));
   public static final blt<cfx> aQ = a("snowball", blt.a.<cfx>a(cfx::new, bmi.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blt<che> aR = a("spawner_minecart", blt.a.<che>a(che::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<cfy> aS = a("spectral_arrow", blt.a.<cfy>a(cfy::new, bmi.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blt<ccu> aT = a("spider", blt.a.a(ccu::new, bmi.a).a(1.4F, 0.9F).a(8));
   public static final blt<byr> aU = a("squid", blt.a.a(byr::new, bmi.f).a(0.8F, 0.8F).a(8));
   public static final blt<ccv> aV = a("stray", blt.a.a(ccv::new, bmi.a).a(0.6F, 1.99F).a(cwl.qP).a(8));
   public static final blt<ccw> aW = a("strider", blt.a.a(ccw::new, bmi.b).c().a(0.9F, 1.7F).a(10));
   public static final blt<bzk> aX = a("tadpole", blt.a.a(bzk::new, bmi.b).a(bzk.c, bzk.d).a(10));
   public static final blt<blo.l> aY = a("text_display", blt.a.a(blo.l::new, bmi.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blt<cbp> aZ = a("tnt", blt.a.<cbp>a(cbp::new, bmi.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final blt<chf> ba = a("tnt_minecart", blt.a.<chf>a(chf::new, bmi.h).a(0.98F, 0.7F).a(8));
   public static final blt<bzz> bb = a("trader_llama", blt.a.a(bzz::new, bmi.b).a(0.9F, 1.87F).a(10));
   public static final blt<cgf> bc = a("trident", blt.a.<cgf>a(cgf::new, bmi.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blt<bys> bd = a("tropical_fish", blt.a.a(bys::new, bmi.g).a(0.5F, 0.4F).a(4));
   public static final blt<byt> be = a("turtle", blt.a.a(byt::new, bmi.b).a(1.2F, 0.4F).a(10));
   public static final blt<ccx> bf = a("vex", blt.a.a(ccx::new, bmi.a).c().a(0.4F, 0.8F).a(8));
   public static final blt<ceo> bg = a("villager", blt.a.<ceo>a(ceo::new, bmi.h).a(0.6F, 1.95F).a(10));
   public static final blt<ccy> bh = a("vindicator", blt.a.a(ccy::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<ceu> bi = a("wandering_trader", blt.a.a(ceu::new, bmi.b).a(0.6F, 1.95F).a(10));
   public static final blt<cef> bj = a("warden", blt.a.a(cef::new, bmi.a).a(0.9F, 2.9F).a(16).c());
   public static final blt<cgg> bk = a("wind_charge", blt.a.<cgg>a(cgg::new, bmi.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blt<ccz> bl = a("witch", blt.a.a(ccz::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cbc> bm = a("wither", blt.a.a(cbc::new, bmi.a).c().a(cwl.cd).a(0.9F, 3.5F).a(10));
   public static final blt<cda> bn = a("wither_skeleton", blt.a.a(cda::new, bmi.a).c().a(cwl.cd).a(0.7F, 2.4F).a(8));
   public static final blt<cgh> bo = a("wither_skull", blt.a.<cgh>a(cgh::new, bmi.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blt<byv> bp = a("wolf", blt.a.a(byv::new, bmi.b).a(0.6F, 0.85F).a(10));
   public static final blt<cdb> bq = a("zoglin", blt.a.a(cdb::new, bmi.a).c().a(1.3964844F, 1.4F).a(8));
   public static final blt<cdc> br = a("zombie", blt.a.<cdc>a(cdc::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cab> bs = a("zombie_horse", blt.a.a(cab::new, bmi.b).a(1.3964844F, 1.6F).a(10));
   public static final blt<cdd> bt = a("zombie_villager", blt.a.a(cdd::new, bmi.a).a(0.6F, 1.95F).a(8));
   public static final blt<cde> bu = a("zombified_piglin", blt.a.a(cde::new, bmi.a).c().a(0.6F, 1.95F).a(8));
   public static final blt<cfb> bv = a("player", blt.a.<cfb>a(bmi.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final blt<cfp> bw = a("fishing_bobber", blt.a.<cfp>a(cfp::new, bmi.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final blt.b<T> bC;
   private final bmi bD;
   private final ImmutableSet<cwj> bE;
   private final boolean bF;
   private final boolean bG;
   private final boolean bH;
   private final boolean bI;
   private final int bJ;
   private final int bK;
   @Nullable
   private String bL;
   @Nullable
   private vd bM;
   @Nullable
   private ahd bN;
   private final blq bO;
   private final chl bP;

   private static <T extends blp> blt<T> a(String $$0, blt.a<T> $$1) {
      return it.a(kd.g, $$0, $$1.a($$0));
   }

   public static ahd a(blt<?> $$0) {
      return kd.g.b($$0);
   }

   public static Optional<blt<?>> a(String $$0) {
      return kd.g.b(ahd.a($$0));
   }

   public blt(blt.b<T> $$0, bmi $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cwj> $$6, blq $$7, int $$8, int $$9, chl $$10) {
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
   public T a(amz $$0, @Nullable cmr $$1, @Nullable cfb $$2, hx $$3, bmj $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      sl $$7;
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

   public static <T extends blp> Consumer<T> a(amz $$0, cmr $$1, @Nullable cfb $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends blp> Consumer<T> a(Consumer<T> $$0, amz $$1, cmr $$2, @Nullable cfb $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends blp> Consumer<T> a(Consumer<T> $$0, cmr $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends blp> Consumer<T> b(Consumer<T> $$0, amz $$1, cmr $$2, @Nullable cfb $$3) {
      sl $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(amz $$0, hx $$1, bmj $$2) {
      return this.a($$0, (sl)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(amz $$0, @Nullable sl $$1, @Nullable Consumer<T> $$2, hx $$3, bmj $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(amz $$0, @Nullable sl $$1, @Nullable Consumer<T> $$2, hx $$3, bmj $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cti)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, aui.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bmh $$10) {
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

   protected static double a(ctl $$0, hx $$1, boolean $$2, elh $$3) {
      elh $$4 = new elh($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<emf> $$5 = $$0.d(null, $$4);
      return 1.0 + emc.a(ic.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cti $$0, @Nullable cfb $$1, @Nullable blp $$2, @Nullable sl $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.o();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ae().f($$1.fR())) {
               sl $$5 = $$2.f(new sl());
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

   public bmi f() {
      return this.bD;
   }

   public String g() {
      if (this.bL == null) {
         this.bL = ac.a("entity", kd.g.b(this));
      }

      return this.bL;
   }

   public vd h() {
      if (this.bM == null) {
         this.bM = vd.c(this.g());
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

   public ahd j() {
      if (this.bN == null) {
         ahd $$0 = kd.g.b(this);
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
   public chl m() {
      return this.bP;
   }

   @Nullable
   public T a(cti $$0) {
      return !this.a($$0.I()) ? null : this.bC.create(this, $$0);
   }

   public static Optional<blp> a(sl $$0, cti $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> by.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public elh a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new elh($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dja $$0) {
      if (this.bE.contains($$0.b())) {
         return false;
      } else {
         return !this.bH && efe.a($$0) ? true : $$0.a(cwl.cd) || $$0.a(cwl.oi) || $$0.a(cwl.dQ) || $$0.a(cwl.qP);
      }
   }

   public blq n() {
      return this.bO;
   }

   public static Optional<blt<?>> a(sl $$0) {
      return kd.g.b(new ahd($$0.l("id")));
   }

   @Nullable
   public static blp a(sl $$0, cti $$1, Function<blp, blp> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            sr $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               blp $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (blp)$$3;
      }).orElse(null);
   }

   public static Stream<blp> a(final List<? extends ti> $$0, final cti $$1) {
      final Spliterator<? extends ti> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<blp>() {
         @Override
         public boolean tryAdvance(Consumer<? super blp> $$0x) {
            return $$2.tryAdvance($$2xx -> blt.a((sl)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<blp> trySplit() {
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

   private static Optional<blp> b(sl $$0, cti $$1) {
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

   public boolean a(asq<blt<?>> $$0) {
      return this.bz.a($$0);
   }

   public boolean a(il<blt<?>> $$0) {
      return $$0.a(this.bz);
   }

   @Nullable
   public T a(blp $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends blp> a() {
      return blp.class;
   }

   @Deprecated
   public ih.c<blt<?>> r() {
      return this.bz;
   }

   public static class a<T extends blp> {
      private final blt.b<T> a;
      private final bmi b;
      private ImmutableSet<cwj> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private blq j = blq.b(0.6F, 1.8F);
      private chl k = chn.g;

      private a(blt.b<T> $$0, bmi $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bmi.b || $$1 == bmi.h;
      }

      public static <T extends blp> blt.a<T> a(blt.b<T> $$0, bmi $$1) {
         return new blt.a<>($$0, $$1);
      }

      public static <T extends blp> blt.a<T> a(bmi $$0) {
         return new blt.a<>(($$0x, $$1) -> null, $$0);
      }

      public blt.a<T> a(float $$0, float $$1) {
         this.j = blq.b($$0, $$1);
         return this;
      }

      public blt.a<T> a() {
         this.e = false;
         return this;
      }

      public blt.a<T> b() {
         this.d = false;
         return this;
      }

      public blt.a<T> c() {
         this.f = true;
         return this;
      }

      public blt.a<T> a(cwj... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public blt.a<T> d() {
         this.g = true;
         return this;
      }

      public blt.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public blt.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public blt.a<T> a(chj... $$0) {
         this.k = chn.e.a($$0);
         return this;
      }

      public blt<T> a(String $$0) {
         if (this.d) {
            ac.a(bbq.w, $$0);
         }

         return new blt<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends blp> {
      T create(blt<T> var1, cti var2);
   }
}
