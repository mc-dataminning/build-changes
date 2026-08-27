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

public class biw<T extends bis> implements ceb, djj<bis, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final hg.c<biw<?>> bx = jd.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final biw<bvx> b = a("allay", biw.a.a(bvx::new, bjl.b).a(0.35F, 0.6F).a(8).b(2));
   public static final biw<bip> c = a("area_effect_cloud", biw.a.<bip>a(bip::new, bjl.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biw<byf> d = a("armor_stand", biw.a.<byf>a(byf::new, bjl.h).a(0.5F, 1.975F).a(10));
   public static final biw<cce> e = a("arrow", biw.a.<cce>a(cce::new, bjl.h).a(0.5F, 0.5F).a(4).b(20));
   public static final biw<bwa> f = a("axolotl", biw.a.a(bwa::new, bjl.d).a(0.75F, 0.42F).a(10));
   public static final biw<buo> g = a("bat", biw.a.a(buo::new, bjl.c).a(0.5F, 0.9F).a(5));
   public static final biw<buu> h = a("bee", biw.a.a(buu::new, bjl.b).a(0.7F, 0.6F).a(8));
   public static final biw<byu> i = a("blaze", biw.a.a(byu::new, bjl.a).c().a(0.6F, 1.8F).a(8));
   public static final biw<bir.b> j = a("block_display", biw.a.a(bir.b::new, bjl.h).a(0.0F, 0.0F).a(10).b(1));
   public static final biw<cdp> k = a("boat", biw.a.<cdp>a(cdp::new, bjl.h).a(1.375F, 0.5625F).a(10));
   public static final biw<bwf> l = a("camel", biw.a.a(bwf::new, bjl.b).a(1.7F, 2.375F).a(10));
   public static final biw<buw> m = a("cat", biw.a.a(buw::new, bjl.b).a(0.6F, 0.7F).a(8));
   public static final biw<byv> n = a("cave_spider", biw.a.a(byv::new, bjl.a).a(0.7F, 0.5F).a(8));
   public static final biw<cdq> o = a("chest_boat", biw.a.<cdq>a(cdq::new, bjl.h).a(1.375F, 0.5625F).a(10));
   public static final biw<cdu> p = a("chest_minecart", biw.a.<cdu>a(cdu::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<buy> q = a("chicken", biw.a.a(buy::new, bjl.b).a(0.4F, 0.7F).a(10));
   public static final biw<buz> r = a("cod", biw.a.a(buz::new, bjl.g).a(0.5F, 0.3F).a(4));
   public static final biw<cdv> s = a("command_block_minecart", biw.a.<cdv>a(cdv::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<bva> t = a("cow", biw.a.a(bva::new, bjl.b).a(0.9F, 1.4F).a(10));
   public static final biw<byw> u = a("creeper", biw.a.a(byw::new, bjl.a).a(0.6F, 1.7F).a(8));
   public static final biw<bvb> v = a("dolphin", biw.a.a(bvb::new, bjl.f).a(0.9F, 0.6F));
   public static final biw<bwt> w = a("donkey", biw.a.a(bwt::new, bjl.b).a(1.3964844F, 1.5F).a(10));
   public static final biw<ccf> x = a("dragon_fireball", biw.a.<ccf>a(ccf::new, bjl.h).a(1.0F, 1.0F).a(4).b(10));
   public static final biw<byy> y = a("drowned", biw.a.a(byy::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<ccw> z = a("egg", biw.a.<ccw>a(ccw::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<byz> A = a("elder_guardian", biw.a.a(byz::new, bjl.a).a(1.9975F, 1.9975F).a(10));
   public static final biw<bxi> B = a("end_crystal", biw.a.<bxi>a(bxi::new, bjl.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final biw<bxj> C = a("ender_dragon", biw.a.a(bxj::new, bjl.a).c().a(16.0F, 8.0F).a(10));
   public static final biw<ccx> D = a("ender_pearl", biw.a.<ccx>a(ccx::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<bza> E = a("enderman", biw.a.a(bza::new, bjl.a).a(0.6F, 2.9F).a(8));
   public static final biw<bzb> F = a("endermite", biw.a.a(bzb::new, bjl.a).a(0.4F, 0.3F).a(8));
   public static final biw<bzd> G = a("evoker", biw.a.a(bzd::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<ccg> H = a("evoker_fangs", biw.a.<ccg>a(ccg::new, bjl.h).a(0.5F, 0.8F).a(6).b(2));
   public static final biw<ccy> I = a("experience_bottle", biw.a.<ccy>a(ccy::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<biy> J = a("experience_orb", biw.a.<biy>a(biy::new, bjl.h).a(0.5F, 0.5F).a(6).b(20));
   public static final biw<cch> K = a("eye_of_ender", biw.a.<cch>a(cch::new, bjl.h).a(0.25F, 0.25F).a(4).b(4));
   public static final biw<byo> L = a("falling_block", biw.a.<byo>a(byo::new, bjl.h).a(0.98F, 0.98F).a(10).b(20));
   public static final biw<ccj> M = a("firework_rocket", biw.a.<ccj>a(ccj::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<bvd> N = a("fox", biw.a.a(bvd::new, bjl.b).a(0.6F, 0.7F).a(8).a(csy.oi));
   public static final biw<bwi> O = a("frog", biw.a.a(bwi::new, bjl.b).a(0.5F, 0.5F).a(10));
   public static final biw<cdw> P = a("furnace_minecart", biw.a.<cdw>a(cdw::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<bze> Q = a("ghast", biw.a.a(bze::new, bjl.a).c().a(4.0F, 4.0F).a(10));
   public static final biw<bzf> R = a("giant", biw.a.a(bzf::new, bjl.a).a(3.6F, 12.0F).a(10));
   public static final biw<byg> S = a("glow_item_frame", biw.a.<byg>a(byg::new, bjl.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biw<bja> T = a("glow_squid", biw.a.a(bja::new, bjl.e).a(0.8F, 0.8F).a(10));
   public static final biw<bwo> U = a("goat", biw.a.a(bwo::new, bjl.b).a(0.9F, 1.3F).a(10));
   public static final biw<bzg> V = a("guardian", biw.a.a(bzg::new, bjl.a).a(0.85F, 0.85F).a(8));
   public static final biw<cag> W = a("hoglin", biw.a.a(cag::new, bjl.a).a(1.3964844F, 1.4F).a(8));
   public static final biw<cdx> X = a("hopper_minecart", biw.a.<cdx>a(cdx::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<bwu> Y = a("horse", biw.a.a(bwu::new, bjl.b).a(1.3964844F, 1.6F).a(10));
   public static final biw<bzh> Z = a("husk", biw.a.a(bzh::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<bzi> aa = a("illusioner", biw.a.a(bzi::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<bjd> ab = a("interaction", biw.a.a(bjd::new, bjl.h).a(0.0F, 0.0F).a(10));
   public static final biw<bvf> ac = a("iron_golem", biw.a.a(bvf::new, bjl.h).a(1.4F, 2.7F).a(10));
   public static final biw<byp> ad = a("item", biw.a.<byp>a(byp::new, bjl.h).a(0.25F, 0.25F).a(6).b(20));
   public static final biw<bir.g> ae = a("item_display", biw.a.a(bir.g::new, bjl.h).a(0.0F, 0.0F).a(10).b(1));
   public static final biw<byi> af = a("item_frame", biw.a.<byi>a(byi::new, bjl.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biw<ccm> ag = a("fireball", biw.a.<ccm>a(ccm::new, bjl.h).a(1.0F, 1.0F).a(4).b(10));
   public static final biw<byj> ah = a("leash_knot", biw.a.<byj>a(byj::new, bjl.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biw<bjh> ai = a("lightning_bolt", biw.a.a(bjh::new, bjl.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final biw<bwv> aj = a("llama", biw.a.a(bwv::new, bjl.b).a(0.9F, 1.87F).a(10));
   public static final biw<ccn> ak = a("llama_spit", biw.a.<ccn>a(ccn::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<bzj> al = a("magma_cube", biw.a.a(bzj::new, bjl.a).c().a(2.04F, 2.04F).a(8));
   public static final biw<bjj> am = a("marker", biw.a.a(bjj::new, bjl.h).a(0.0F, 0.0F).a(0));
   public static final biw<cdt> an = a("minecart", biw.a.<cdt>a(cdt::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<bvg> ao = a("mooshroom", biw.a.a(bvg::new, bjl.b).a(0.9F, 1.4F).a(10));
   public static final biw<bwx> ap = a("mule", biw.a.a(bwx::new, bjl.b).a(1.3964844F, 1.6F).a(8));
   public static final biw<bvh> aq = a("ocelot", biw.a.a(bvh::new, bjl.b).a(0.6F, 0.7F).a(10));
   public static final biw<byk> ar = a("painting", biw.a.<byk>a(byk::new, bjl.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final biw<bvi> as = a("panda", biw.a.a(bvi::new, bjl.b).a(1.3F, 1.25F).a(10));
   public static final biw<bvj> at = a("parrot", biw.a.a(bvj::new, bjl.b).a(0.5F, 0.9F).a(8));
   public static final biw<bzm> au = a("phantom", biw.a.a(bzm::new, bjl.a).a(0.9F, 0.5F).a(8));
   public static final biw<bvk> av = a("pig", biw.a.a(bvk::new, bjl.b).a(0.9F, 0.9F).a(10));
   public static final biw<cam> aw = a("piglin", biw.a.a(cam::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<cap> ax = a("piglin_brute", biw.a.a(cap::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<bzn> ay = a("pillager", biw.a.a(bzn::new, bjl.a).d().a(0.6F, 1.95F).a(8));
   public static final biw<bvl> az = a("polar_bear", biw.a.a(bvl::new, bjl.b).a(csy.qC).a(1.4F, 1.4F).a(10));
   public static final biw<ccz> aA = a("potion", biw.a.<ccz>a(ccz::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<bvm> aB = a("pufferfish", biw.a.a(bvm::new, bjl.g).a(0.7F, 0.7F).a(4));
   public static final biw<bvn> aC = a("rabbit", biw.a.a(bvn::new, bjl.b).a(0.4F, 0.5F).a(8));
   public static final biw<bzp> aD = a("ravager", biw.a.a(bzp::new, bjl.a).a(1.95F, 2.2F).a(10));
   public static final biw<bvo> aE = a("salmon", biw.a.a(bvo::new, bjl.g).a(0.7F, 0.4F).a(4));
   public static final biw<bvp> aF = a("sheep", biw.a.a(bvp::new, bjl.b).a(0.9F, 1.3F).a(10));
   public static final biw<bzq> aG = a("shulker", biw.a.a(bzq::new, bjl.a).c().d().a(1.0F, 1.0F).a(10));
   public static final biw<ccq> aH = a("shulker_bullet", biw.a.<ccq>a(ccq::new, bjl.h).a(0.3125F, 0.3125F).a(8));
   public static final biw<bzr> aI = a("silverfish", biw.a.a(bzr::new, bjl.a).a(0.4F, 0.3F).a(8));
   public static final biw<bzs> aJ = a("skeleton", biw.a.a(bzs::new, bjl.a).a(0.6F, 1.99F).a(8));
   public static final biw<bwy> aK = a("skeleton_horse", biw.a.a(bwy::new, bjl.b).a(1.3964844F, 1.6F).a(10));
   public static final biw<bzt> aL = a("slime", biw.a.a(bzt::new, bjl.a).a(2.04F, 2.04F).a(10));
   public static final biw<ccr> aM = a("small_fireball", biw.a.<ccr>a(ccr::new, bjl.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final biw<bxf> aN = a("sniffer", biw.a.a(bxf::new, bjl.b).a(1.9F, 1.75F).a(10));
   public static final biw<bvr> aO = a("snow_golem", biw.a.a(bvr::new, bjl.h).a(csy.qC).a(0.7F, 1.9F).a(8));
   public static final biw<ccs> aP = a("snowball", biw.a.<ccs>a(ccs::new, bjl.h).a(0.25F, 0.25F).a(4).b(10));
   public static final biw<cdy> aQ = a("spawner_minecart", biw.a.<cdy>a(cdy::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<cct> aR = a("spectral_arrow", biw.a.<cct>a(cct::new, bjl.h).a(0.5F, 0.5F).a(4).b(20));
   public static final biw<bzv> aS = a("spider", biw.a.a(bzv::new, bjl.a).a(1.4F, 0.9F).a(8));
   public static final biw<bvs> aT = a("squid", biw.a.a(bvs::new, bjl.f).a(0.8F, 0.8F).a(8));
   public static final biw<bzw> aU = a("stray", biw.a.a(bzw::new, bjl.a).a(0.6F, 1.99F).a(csy.qC).a(8));
   public static final biw<bzx> aV = a("strider", biw.a.a(bzx::new, bjl.b).c().a(0.9F, 1.7F).a(10));
   public static final biw<bwl> aW = a("tadpole", biw.a.a(bwl::new, bjl.b).a(bwl.c, bwl.d).a(10));
   public static final biw<bir.l> aX = a("text_display", biw.a.a(bir.l::new, bjl.h).a(0.0F, 0.0F).a(10).b(1));
   public static final biw<byq> aY = a("tnt", biw.a.<byq>a(byq::new, bjl.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final biw<cdz> aZ = a("tnt_minecart", biw.a.<cdz>a(cdz::new, bjl.h).a(0.98F, 0.7F).a(8));
   public static final biw<bxa> ba = a("trader_llama", biw.a.a(bxa::new, bjl.b).a(0.9F, 1.87F).a(10));
   public static final biw<cda> bb = a("trident", biw.a.<cda>a(cda::new, bjl.h).a(0.5F, 0.5F).a(4).b(20));
   public static final biw<bvt> bc = a("tropical_fish", biw.a.a(bvt::new, bjl.g).a(0.5F, 0.4F).a(4));
   public static final biw<bvu> bd = a("turtle", biw.a.a(bvu::new, bjl.b).a(1.2F, 0.4F).a(10));
   public static final biw<bzy> be = a("vex", biw.a.a(bzy::new, bjl.a).c().a(0.4F, 0.8F).a(8));
   public static final biw<cbj> bf = a("villager", biw.a.<cbj>a(cbj::new, bjl.h).a(0.6F, 1.95F).a(10));
   public static final biw<bzz> bg = a("vindicator", biw.a.a(bzz::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<cbp> bh = a("wandering_trader", biw.a.a(cbp::new, bjl.b).a(0.6F, 1.95F).a(10));
   public static final biw<cba> bi = a("warden", biw.a.a(cba::new, bjl.a).a(0.9F, 2.9F).a(16).c());
   public static final biw<caa> bj = a("witch", biw.a.a(caa::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<byd> bk = a("wither", biw.a.a(byd::new, bjl.a).c().a(csy.cd).a(0.9F, 3.5F).a(10));
   public static final biw<cab> bl = a("wither_skeleton", biw.a.a(cab::new, bjl.a).c().a(csy.cd).a(0.7F, 2.4F).a(8));
   public static final biw<cdb> bm = a("wither_skull", biw.a.<cdb>a(cdb::new, bjl.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final biw<bvw> bn = a("wolf", biw.a.a(bvw::new, bjl.b).a(0.6F, 0.85F).a(10));
   public static final biw<cac> bo = a("zoglin", biw.a.a(cac::new, bjl.a).c().a(1.3964844F, 1.4F).a(8));
   public static final biw<cad> bp = a("zombie", biw.a.<cad>a(cad::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<bxc> bq = a("zombie_horse", biw.a.a(bxc::new, bjl.b).a(1.3964844F, 1.6F).a(10));
   public static final biw<cae> br = a("zombie_villager", biw.a.a(cae::new, bjl.a).a(0.6F, 1.95F).a(8));
   public static final biw<caf> bs = a("zombified_piglin", biw.a.a(caf::new, bjl.a).c().a(0.6F, 1.95F).a(8));
   public static final biw<cbw> bt = a("player", biw.a.<cbw>a(bjl.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final biw<cck> bu = a("fishing_bobber", biw.a.<cck>a(cck::new, bjl.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final biw.b<T> bA;
   private final bjl bB;
   private final ImmutableSet<csx> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private tn bK;
   @Nullable
   private aey bL;
   private final bit bM;
   private final cee bN;

   private static <T extends bis> biw<T> a(String $$0, biw.a<T> $$1) {
      return ht.a(jd.h, $$0, $$1.a($$0));
   }

   public static aey a(biw<?> $$0) {
      return jd.h.b($$0);
   }

   public static Optional<biw<?>> a(String $$0) {
      return jd.h.b(aey.a($$0));
   }

   public biw(biw.b<T> $$0, bjl $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<csx> $$6, bit $$7, int $$8, int $$9, cee $$10) {
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
   public T a(aks $$0, @Nullable cjh $$1, @Nullable cbw $$2, gw $$3, bjm $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qy $$7;
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

   public static <T extends bis> Consumer<T> a(aks $$0, cjh $$1, @Nullable cbw $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bis> Consumer<T> a(Consumer<T> $$0, aks $$1, cjh $$2, @Nullable cbw $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bis> Consumer<T> a(Consumer<T> $$0, cjh $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bis> Consumer<T> b(Consumer<T> $$0, aks $$1, cjh $$2, @Nullable cbw $$3) {
      qy $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aks $$0, gw $$1, bjm $$2) {
      return this.a($$0, (qy)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aks $$0, @Nullable qy $$1, @Nullable Consumer<T> $$2, gw $$3, bjm $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(aks $$0, @Nullable qy $$1, @Nullable Consumer<T> $$2, gw $$3, bjm $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cpx)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, ary.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bjk $$10) {
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

   protected static double a(cqa $$0, gw $$1, boolean $$2, ehk $$3) {
      ehk $$4 = new ehk($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eii> $$5 = $$0.d(null, $$4);
      return 1.0 + eif.a(hc.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cpx $$0, @Nullable cbw $$1, @Nullable bis $$2, @Nullable qy $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().f($$1.fQ())) {
               qy $$5 = $$2.f(new qy());
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

   public bjl f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jd.h.b(this));
      }

      return this.bJ;
   }

   public tn h() {
      if (this.bK == null) {
         this.bK = tn.c(this.g());
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

   public aey j() {
      if (this.bL == null) {
         aey $$0 = jd.h.b(this);
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
   public cee m() {
      return this.bN;
   }

   @Nullable
   public T a(cpx $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bis> a(qy $$0, cpx $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ehk a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ehk($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dfl $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && ebi.a($$0) ? true : $$0.a(csy.cd) || $$0.a(csy.oi) || $$0.a(csy.dQ) || $$0.a(csy.qC);
      }
   }

   public bit n() {
      return this.bM;
   }

   public static Optional<biw<?>> a(qy $$0) {
      return jd.h.b(new aey($$0.l("id")));
   }

   @Nullable
   public static bis a(qy $$0, cpx $$1, Function<bis, bis> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            re $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bis $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bis)$$3;
      }).orElse(null);
   }

   public static Stream<bis> a(final List<? extends rs> $$0, final cpx $$1) {
      final Spliterator<? extends rs> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bis>() {
         @Override
         public boolean tryAdvance(Consumer<? super bis> $$0x) {
            return $$2.tryAdvance($$2xx -> biw.a((qy)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bis> trySplit() {
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

   private static Optional<bis> b(qy $$0, cpx $$1) {
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

   public boolean a(aqj<biw<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(hk<biw<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bis $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bis> a() {
      return bis.class;
   }

   @Deprecated
   public hg.c<biw<?>> r() {
      return this.bx;
   }

   public static class a<T extends bis> {
      private final biw.b<T> a;
      private final bjl b;
      private ImmutableSet<csx> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bit j = bit.b(0.6F, 1.8F);
      private cee k = ceg.f;

      private a(biw.b<T> $$0, bjl $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bjl.b || $$1 == bjl.h;
      }

      public static <T extends bis> biw.a<T> a(biw.b<T> $$0, bjl $$1) {
         return new biw.a<>($$0, $$1);
      }

      public static <T extends bis> biw.a<T> a(bjl $$0) {
         return new biw.a<>(($$0x, $$1) -> null, $$0);
      }

      public biw.a<T> a(float $$0, float $$1) {
         this.j = bit.b($$0, $$1);
         return this;
      }

      public biw.a<T> a() {
         this.e = false;
         return this;
      }

      public biw.a<T> b() {
         this.d = false;
         return this;
      }

      public biw.a<T> c() {
         this.f = true;
         return this;
      }

      public biw.a<T> a(csx... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public biw.a<T> d() {
         this.g = true;
         return this;
      }

      public biw.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public biw.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public biw.a<T> a(cec... $$0) {
         this.k = ceg.d.a($$0);
         return this;
      }

      public biw<T> a(String $$0) {
         if (this.d) {
            ac.a(ayz.w, $$0);
         }

         return new biw<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bis> {
      T create(biw<T> var1, cpx var2);
   }
}
