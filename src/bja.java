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

public class bja<T extends biw> implements cef, djb<biw, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final he.c<bja<?>> bx = jb.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bja<bwb> b = a("allay", bja.a.a(bwb::new, bjp.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bja<bit> c = a("area_effect_cloud", bja.a.<bit>a(bit::new, bjp.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bja<byj> d = a("armor_stand", bja.a.<byj>a(byj::new, bjp.h).a(0.5F, 1.975F).a(10));
   public static final bja<cci> e = a("arrow", bja.a.<cci>a(cci::new, bjp.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bja<bwe> f = a("axolotl", bja.a.a(bwe::new, bjp.d).a(0.75F, 0.42F).a(10));
   public static final bja<bus> g = a("bat", bja.a.a(bus::new, bjp.c).a(0.5F, 0.9F).a(5));
   public static final bja<buy> h = a("bee", bja.a.a(buy::new, bjp.b).a(0.7F, 0.6F).a(8));
   public static final bja<byy> i = a("blaze", bja.a.a(byy::new, bjp.a).c().a(0.6F, 1.8F).a(8));
   public static final bja<biv.b> j = a("block_display", bja.a.a(biv.b::new, bjp.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bja<cdt> k = a("boat", bja.a.<cdt>a(cdt::new, bjp.h).a(1.375F, 0.5625F).a(10));
   public static final bja<bwj> l = a("camel", bja.a.a(bwj::new, bjp.b).a(1.7F, 2.375F).a(10));
   public static final bja<bva> m = a("cat", bja.a.a(bva::new, bjp.b).a(0.6F, 0.7F).a(8));
   public static final bja<byz> n = a("cave_spider", bja.a.a(byz::new, bjp.a).a(0.7F, 0.5F).a(8));
   public static final bja<cdu> o = a("chest_boat", bja.a.<cdu>a(cdu::new, bjp.h).a(1.375F, 0.5625F).a(10));
   public static final bja<cdy> p = a("chest_minecart", bja.a.<cdy>a(cdy::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<bvc> q = a("chicken", bja.a.a(bvc::new, bjp.b).a(0.4F, 0.7F).a(10));
   public static final bja<bvd> r = a("cod", bja.a.a(bvd::new, bjp.g).a(0.5F, 0.3F).a(4));
   public static final bja<cdz> s = a("command_block_minecart", bja.a.<cdz>a(cdz::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<bve> t = a("cow", bja.a.a(bve::new, bjp.b).a(0.9F, 1.4F).a(10));
   public static final bja<bza> u = a("creeper", bja.a.a(bza::new, bjp.a).a(0.6F, 1.7F).a(8));
   public static final bja<bvf> v = a("dolphin", bja.a.a(bvf::new, bjp.f).a(0.9F, 0.6F));
   public static final bja<bwx> w = a("donkey", bja.a.a(bwx::new, bjp.b).a(1.3964844F, 1.5F).a(10));
   public static final bja<ccj> x = a("dragon_fireball", bja.a.<ccj>a(ccj::new, bjp.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bja<bzc> y = a("drowned", bja.a.a(bzc::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<cda> z = a("egg", bja.a.<cda>a(cda::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<bzd> A = a("elder_guardian", bja.a.a(bzd::new, bjp.a).a(1.9975F, 1.9975F).a(10));
   public static final bja<bxm> B = a("end_crystal", bja.a.<bxm>a(bxm::new, bjp.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bja<bxn> C = a("ender_dragon", bja.a.a(bxn::new, bjp.a).c().a(16.0F, 8.0F).a(10));
   public static final bja<cdb> D = a("ender_pearl", bja.a.<cdb>a(cdb::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<bze> E = a("enderman", bja.a.a(bze::new, bjp.a).a(0.6F, 2.9F).a(8));
   public static final bja<bzf> F = a("endermite", bja.a.a(bzf::new, bjp.a).a(0.4F, 0.3F).a(8));
   public static final bja<bzh> G = a("evoker", bja.a.a(bzh::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<cck> H = a("evoker_fangs", bja.a.<cck>a(cck::new, bjp.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bja<cdc> I = a("experience_bottle", bja.a.<cdc>a(cdc::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<bjc> J = a("experience_orb", bja.a.<bjc>a(bjc::new, bjp.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bja<ccl> K = a("eye_of_ender", bja.a.<ccl>a(ccl::new, bjp.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bja<bys> L = a("falling_block", bja.a.<bys>a(bys::new, bjp.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bja<ccn> M = a("firework_rocket", bja.a.<ccn>a(ccn::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<bvh> N = a("fox", bja.a.a(bvh::new, bjp.b).a(0.6F, 0.7F).a(8).a(cte.oi));
   public static final bja<bwm> O = a("frog", bja.a.a(bwm::new, bjp.b).a(0.5F, 0.5F).a(10));
   public static final bja<cea> P = a("furnace_minecart", bja.a.<cea>a(cea::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<bzi> Q = a("ghast", bja.a.a(bzi::new, bjp.a).c().a(4.0F, 4.0F).a(10));
   public static final bja<bzj> R = a("giant", bja.a.a(bzj::new, bjp.a).a(3.6F, 12.0F).a(10));
   public static final bja<byk> S = a("glow_item_frame", bja.a.<byk>a(byk::new, bjp.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bja<bje> T = a("glow_squid", bja.a.a(bje::new, bjp.e).a(0.8F, 0.8F).a(10));
   public static final bja<bws> U = a("goat", bja.a.a(bws::new, bjp.b).a(0.9F, 1.3F).a(10));
   public static final bja<bzk> V = a("guardian", bja.a.a(bzk::new, bjp.a).a(0.85F, 0.85F).a(8));
   public static final bja<cak> W = a("hoglin", bja.a.a(cak::new, bjp.a).a(1.3964844F, 1.4F).a(8));
   public static final bja<ceb> X = a("hopper_minecart", bja.a.<ceb>a(ceb::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<bwy> Y = a("horse", bja.a.a(bwy::new, bjp.b).a(1.3964844F, 1.6F).a(10));
   public static final bja<bzl> Z = a("husk", bja.a.a(bzl::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<bzm> aa = a("illusioner", bja.a.a(bzm::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<bjh> ab = a("interaction", bja.a.a(bjh::new, bjp.h).a(0.0F, 0.0F).a(10));
   public static final bja<bvj> ac = a("iron_golem", bja.a.a(bvj::new, bjp.h).a(1.4F, 2.7F).a(10));
   public static final bja<byt> ad = a("item", bja.a.<byt>a(byt::new, bjp.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bja<biv.g> ae = a("item_display", bja.a.a(biv.g::new, bjp.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bja<bym> af = a("item_frame", bja.a.<bym>a(bym::new, bjp.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bja<ccq> ag = a("fireball", bja.a.<ccq>a(ccq::new, bjp.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bja<byn> ah = a("leash_knot", bja.a.<byn>a(byn::new, bjp.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bja<bjl> ai = a("lightning_bolt", bja.a.a(bjl::new, bjp.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bja<bwz> aj = a("llama", bja.a.a(bwz::new, bjp.b).a(0.9F, 1.87F).a(10));
   public static final bja<ccr> ak = a("llama_spit", bja.a.<ccr>a(ccr::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<bzn> al = a("magma_cube", bja.a.a(bzn::new, bjp.a).c().a(2.04F, 2.04F).a(8));
   public static final bja<bjn> am = a("marker", bja.a.a(bjn::new, bjp.h).a(0.0F, 0.0F).a(0));
   public static final bja<cdx> an = a("minecart", bja.a.<cdx>a(cdx::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<bvk> ao = a("mooshroom", bja.a.a(bvk::new, bjp.b).a(0.9F, 1.4F).a(10));
   public static final bja<bxb> ap = a("mule", bja.a.a(bxb::new, bjp.b).a(1.3964844F, 1.6F).a(8));
   public static final bja<bvl> aq = a("ocelot", bja.a.a(bvl::new, bjp.b).a(0.6F, 0.7F).a(10));
   public static final bja<byo> ar = a("painting", bja.a.<byo>a(byo::new, bjp.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bja<bvm> as = a("panda", bja.a.a(bvm::new, bjp.b).a(1.3F, 1.25F).a(10));
   public static final bja<bvn> at = a("parrot", bja.a.a(bvn::new, bjp.b).a(0.5F, 0.9F).a(8));
   public static final bja<bzq> au = a("phantom", bja.a.a(bzq::new, bjp.a).a(0.9F, 0.5F).a(8));
   public static final bja<bvo> av = a("pig", bja.a.a(bvo::new, bjp.b).a(0.9F, 0.9F).a(10));
   public static final bja<caq> aw = a("piglin", bja.a.a(caq::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<cat> ax = a("piglin_brute", bja.a.a(cat::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<bzr> ay = a("pillager", bja.a.a(bzr::new, bjp.a).d().a(0.6F, 1.95F).a(8));
   public static final bja<bvp> az = a("polar_bear", bja.a.a(bvp::new, bjp.b).a(cte.qC).a(1.4F, 1.4F).a(10));
   public static final bja<cdd> aA = a("potion", bja.a.<cdd>a(cdd::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<bvq> aB = a("pufferfish", bja.a.a(bvq::new, bjp.g).a(0.7F, 0.7F).a(4));
   public static final bja<bvr> aC = a("rabbit", bja.a.a(bvr::new, bjp.b).a(0.4F, 0.5F).a(8));
   public static final bja<bzt> aD = a("ravager", bja.a.a(bzt::new, bjp.a).a(1.95F, 2.2F).a(10));
   public static final bja<bvs> aE = a("salmon", bja.a.a(bvs::new, bjp.g).a(0.7F, 0.4F).a(4));
   public static final bja<bvt> aF = a("sheep", bja.a.a(bvt::new, bjp.b).a(0.9F, 1.3F).a(10));
   public static final bja<bzu> aG = a("shulker", bja.a.a(bzu::new, bjp.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bja<ccu> aH = a("shulker_bullet", bja.a.<ccu>a(ccu::new, bjp.h).a(0.3125F, 0.3125F).a(8));
   public static final bja<bzv> aI = a("silverfish", bja.a.a(bzv::new, bjp.a).a(0.4F, 0.3F).a(8));
   public static final bja<bzw> aJ = a("skeleton", bja.a.a(bzw::new, bjp.a).a(0.6F, 1.99F).a(8));
   public static final bja<bxc> aK = a("skeleton_horse", bja.a.a(bxc::new, bjp.b).a(1.3964844F, 1.6F).a(10));
   public static final bja<bzx> aL = a("slime", bja.a.a(bzx::new, bjp.a).a(2.04F, 2.04F).a(10));
   public static final bja<ccv> aM = a("small_fireball", bja.a.<ccv>a(ccv::new, bjp.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bja<bxj> aN = a("sniffer", bja.a.a(bxj::new, bjp.b).a(1.9F, 1.75F).a(10));
   public static final bja<bvv> aO = a("snow_golem", bja.a.a(bvv::new, bjp.h).a(cte.qC).a(0.7F, 1.9F).a(8));
   public static final bja<ccw> aP = a("snowball", bja.a.<ccw>a(ccw::new, bjp.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bja<cec> aQ = a("spawner_minecart", bja.a.<cec>a(cec::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<ccx> aR = a("spectral_arrow", bja.a.<ccx>a(ccx::new, bjp.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bja<bzz> aS = a("spider", bja.a.a(bzz::new, bjp.a).a(1.4F, 0.9F).a(8));
   public static final bja<bvw> aT = a("squid", bja.a.a(bvw::new, bjp.f).a(0.8F, 0.8F).a(8));
   public static final bja<caa> aU = a("stray", bja.a.a(caa::new, bjp.a).a(0.6F, 1.99F).a(cte.qC).a(8));
   public static final bja<cab> aV = a("strider", bja.a.a(cab::new, bjp.b).c().a(0.9F, 1.7F).a(10));
   public static final bja<bwp> aW = a("tadpole", bja.a.a(bwp::new, bjp.b).a(bwp.c, bwp.d).a(10));
   public static final bja<biv.l> aX = a("text_display", bja.a.a(biv.l::new, bjp.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bja<byu> aY = a("tnt", bja.a.<byu>a(byu::new, bjp.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bja<ced> aZ = a("tnt_minecart", bja.a.<ced>a(ced::new, bjp.h).a(0.98F, 0.7F).a(8));
   public static final bja<bxe> ba = a("trader_llama", bja.a.a(bxe::new, bjp.b).a(0.9F, 1.87F).a(10));
   public static final bja<cde> bb = a("trident", bja.a.<cde>a(cde::new, bjp.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bja<bvx> bc = a("tropical_fish", bja.a.a(bvx::new, bjp.g).a(0.5F, 0.4F).a(4));
   public static final bja<bvy> bd = a("turtle", bja.a.a(bvy::new, bjp.b).a(1.2F, 0.4F).a(10));
   public static final bja<cac> be = a("vex", bja.a.a(cac::new, bjp.a).c().a(0.4F, 0.8F).a(8));
   public static final bja<cbn> bf = a("villager", bja.a.<cbn>a(cbn::new, bjp.h).a(0.6F, 1.95F).a(10));
   public static final bja<cad> bg = a("vindicator", bja.a.a(cad::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<cbt> bh = a("wandering_trader", bja.a.a(cbt::new, bjp.b).a(0.6F, 1.95F).a(10));
   public static final bja<cbe> bi = a("warden", bja.a.a(cbe::new, bjp.a).a(0.9F, 2.9F).a(16).c());
   public static final bja<cae> bj = a("witch", bja.a.a(cae::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<byh> bk = a("wither", bja.a.a(byh::new, bjp.a).c().a(cte.cd).a(0.9F, 3.5F).a(10));
   public static final bja<caf> bl = a("wither_skeleton", bja.a.a(caf::new, bjp.a).c().a(cte.cd).a(0.7F, 2.4F).a(8));
   public static final bja<cdf> bm = a("wither_skull", bja.a.<cdf>a(cdf::new, bjp.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bja<bwa> bn = a("wolf", bja.a.a(bwa::new, bjp.b).a(0.6F, 0.85F).a(10));
   public static final bja<cag> bo = a("zoglin", bja.a.a(cag::new, bjp.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bja<cah> bp = a("zombie", bja.a.<cah>a(cah::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<bxg> bq = a("zombie_horse", bja.a.a(bxg::new, bjp.b).a(1.3964844F, 1.6F).a(10));
   public static final bja<cai> br = a("zombie_villager", bja.a.a(cai::new, bjp.a).a(0.6F, 1.95F).a(8));
   public static final bja<caj> bs = a("zombified_piglin", bja.a.a(caj::new, bjp.a).c().a(0.6F, 1.95F).a(8));
   public static final bja<cca> bt = a("player", bja.a.<cca>a(bjp.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bja<cco> bu = a("fishing_bobber", bja.a.<cco>a(cco::new, bjp.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bja.b<T> bA;
   private final bjp bB;
   private final ImmutableSet<ctc> bC;
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
   private aez bL;
   private final bix bM;
   private final cei bN;

   private static <T extends biw> bja<T> a(String $$0, bja.a<T> $$1) {
      return hq.a(jb.h, $$0, $$1.a($$0));
   }

   public static aez a(bja<?> $$0) {
      return jb.h.b($$0);
   }

   public static Optional<bja<?>> a(String $$0) {
      return jb.h.b(aez.a($$0));
   }

   public bja(bja.b<T> $$0, bjp $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<ctc> $$6, bix $$7, int $$8, int $$9, cei $$10) {
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
   public T a(akt $$0, @Nullable cjl $$1, @Nullable cca $$2, gw $$3, bjq $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qw $$7;
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

   public static <T extends biw> Consumer<T> a(akt $$0, cjl $$1, @Nullable cca $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends biw> Consumer<T> a(Consumer<T> $$0, akt $$1, cjl $$2, @Nullable cca $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends biw> Consumer<T> a(Consumer<T> $$0, cjl $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends biw> Consumer<T> b(Consumer<T> $$0, akt $$1, cjl $$2, @Nullable cca $$3) {
      qw $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(akt $$0, gw $$1, bjq $$2) {
      return this.a($$0, (qw)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(akt $$0, @Nullable qw $$1, @Nullable Consumer<T> $$2, gw $$3, bjq $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(akt $$0, @Nullable qw $$1, @Nullable Consumer<T> $$2, gw $$3, bjq $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cqb)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, asb.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bjo $$10) {
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

   protected static double a(cqe $$0, gw $$1, boolean $$2, ehc $$3) {
      ehc $$4 = new ehc($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eia> $$5 = $$0.d(null, $$4);
      return 1.0 + ehx.a(ha.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cqb $$0, @Nullable cca $$1, @Nullable biw $$2, @Nullable qw $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().f($$1.fR())) {
               qw $$5 = $$2.f(new qw());
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

   public bjp f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jb.h.b(this));
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

   public aez j() {
      if (this.bL == null) {
         aez $$0 = jb.h.b(this);
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
   public cei m() {
      return this.bN;
   }

   @Nullable
   public T a(cqb $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<biw> a(qw $$0, cqb $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ehc a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ehc($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dfd $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && eba.a($$0) ? true : $$0.a(cte.cd) || $$0.a(cte.oi) || $$0.a(cte.dQ) || $$0.a(cte.qC);
      }
   }

   public bix n() {
      return this.bM;
   }

   public static Optional<bja<?>> a(qw $$0) {
      return jb.h.b(new aez($$0.l("id")));
   }

   @Nullable
   public static biw a(qw $$0, cqb $$1, Function<biw, biw> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            rc $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               biw $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (biw)$$3;
      }).orElse(null);
   }

   public static Stream<biw> a(final List<? extends rq> $$0, final cqb $$1) {
      final Spliterator<? extends rq> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<biw>() {
         @Override
         public boolean tryAdvance(Consumer<? super biw> $$0x) {
            return $$2.tryAdvance($$2xx -> bja.a((qw)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<biw> trySplit() {
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

   private static Optional<biw> b(qw $$0, cqb $$1) {
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

   public boolean a(aqk<bja<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(hi<bja<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(biw $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends biw> a() {
      return biw.class;
   }

   @Deprecated
   public he.c<bja<?>> r() {
      return this.bx;
   }

   public static class a<T extends biw> {
      private final bja.b<T> a;
      private final bjp b;
      private ImmutableSet<ctc> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bix j = bix.b(0.6F, 1.8F);
      private cei k = cek.f;

      private a(bja.b<T> $$0, bjp $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bjp.b || $$1 == bjp.h;
      }

      public static <T extends biw> bja.a<T> a(bja.b<T> $$0, bjp $$1) {
         return new bja.a<>($$0, $$1);
      }

      public static <T extends biw> bja.a<T> a(bjp $$0) {
         return new bja.a<>(($$0x, $$1) -> null, $$0);
      }

      public bja.a<T> a(float $$0, float $$1) {
         this.j = bix.b($$0, $$1);
         return this;
      }

      public bja.a<T> a() {
         this.e = false;
         return this;
      }

      public bja.a<T> b() {
         this.d = false;
         return this;
      }

      public bja.a<T> c() {
         this.f = true;
         return this;
      }

      public bja.a<T> a(ctc... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bja.a<T> d() {
         this.g = true;
         return this;
      }

      public bja.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bja.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bja.a<T> a(ceg... $$0) {
         this.k = cek.d.a($$0);
         return this;
      }

      public bja<T> a(String $$0) {
         if (this.d) {
            ac.a(azd.w, $$0);
         }

         return new bja<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends biw> {
      T create(bja<T> var1, cqb var2);
   }
}
