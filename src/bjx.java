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

public class bjx<T extends bjt> implements cfd, djz<bjt, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ib.c<bjx<?>> bx = jy.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bjx<bwy> b = a("allay", bjx.a.a(bwy::new, bkm.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bjx<bjq> c = a("area_effect_cloud", bjx.a.<bjq>a(bjq::new, bkm.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bjx<bzg> d = a("armor_stand", bjx.a.<bzg>a(bzg::new, bkm.h).a(0.5F, 1.975F).a(10));
   public static final bjx<cdf> e = a("arrow", bjx.a.<cdf>a(cdf::new, bkm.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bjx<bxb> f = a("axolotl", bjx.a.a(bxb::new, bkm.d).a(0.75F, 0.42F).a(10));
   public static final bjx<bvp> g = a("bat", bjx.a.a(bvp::new, bkm.c).a(0.5F, 0.9F).a(5));
   public static final bjx<bvv> h = a("bee", bjx.a.a(bvv::new, bkm.b).a(0.7F, 0.6F).a(8));
   public static final bjx<bzv> i = a("blaze", bjx.a.a(bzv::new, bkm.a).c().a(0.6F, 1.8F).a(8));
   public static final bjx<bjs.b> j = a("block_display", bjx.a.a(bjs.b::new, bkm.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bjx<ceq> k = a("boat", bjx.a.<ceq>a(ceq::new, bkm.h).a(1.375F, 0.5625F).a(10));
   public static final bjx<bxg> l = a("camel", bjx.a.a(bxg::new, bkm.b).a(1.7F, 2.375F).a(10));
   public static final bjx<bvx> m = a("cat", bjx.a.a(bvx::new, bkm.b).a(0.6F, 0.7F).a(8));
   public static final bjx<bzw> n = a("cave_spider", bjx.a.a(bzw::new, bkm.a).a(0.7F, 0.5F).a(8));
   public static final bjx<cer> o = a("chest_boat", bjx.a.<cer>a(cer::new, bkm.h).a(1.375F, 0.5625F).a(10));
   public static final bjx<cev> p = a("chest_minecart", bjx.a.<cev>a(cev::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<bvz> q = a("chicken", bjx.a.a(bvz::new, bkm.b).a(0.4F, 0.7F).a(10));
   public static final bjx<bwa> r = a("cod", bjx.a.a(bwa::new, bkm.g).a(0.5F, 0.3F).a(4));
   public static final bjx<cew> s = a("command_block_minecart", bjx.a.<cew>a(cew::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<bwb> t = a("cow", bjx.a.a(bwb::new, bkm.b).a(0.9F, 1.4F).a(10));
   public static final bjx<bzx> u = a("creeper", bjx.a.a(bzx::new, bkm.a).a(0.6F, 1.7F).a(8));
   public static final bjx<bwc> v = a("dolphin", bjx.a.a(bwc::new, bkm.f).a(0.9F, 0.6F));
   public static final bjx<bxu> w = a("donkey", bjx.a.a(bxu::new, bkm.b).a(1.3964844F, 1.5F).a(10));
   public static final bjx<cdg> x = a("dragon_fireball", bjx.a.<cdg>a(cdg::new, bkm.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bjx<bzz> y = a("drowned", bjx.a.a(bzz::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<cdx> z = a("egg", bjx.a.<cdx>a(cdx::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<caa> A = a("elder_guardian", bjx.a.a(caa::new, bkm.a).a(1.9975F, 1.9975F).a(10));
   public static final bjx<byj> B = a("end_crystal", bjx.a.<byj>a(byj::new, bkm.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bjx<byk> C = a("ender_dragon", bjx.a.a(byk::new, bkm.a).c().a(16.0F, 8.0F).a(10));
   public static final bjx<cdy> D = a("ender_pearl", bjx.a.<cdy>a(cdy::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<cab> E = a("enderman", bjx.a.a(cab::new, bkm.a).a(0.6F, 2.9F).a(8));
   public static final bjx<cac> F = a("endermite", bjx.a.a(cac::new, bkm.a).a(0.4F, 0.3F).a(8));
   public static final bjx<cae> G = a("evoker", bjx.a.a(cae::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<cdh> H = a("evoker_fangs", bjx.a.<cdh>a(cdh::new, bkm.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bjx<cdz> I = a("experience_bottle", bjx.a.<cdz>a(cdz::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<bjz> J = a("experience_orb", bjx.a.<bjz>a(bjz::new, bkm.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bjx<cdi> K = a("eye_of_ender", bjx.a.<cdi>a(cdi::new, bkm.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bjx<bzp> L = a("falling_block", bjx.a.<bzp>a(bzp::new, bkm.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bjx<cdk> M = a("firework_rocket", bjx.a.<cdk>a(cdk::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<bwe> N = a("fox", bjx.a.a(bwe::new, bkm.b).a(0.6F, 0.7F).a(8).a(cuc.oi));
   public static final bjx<bxj> O = a("frog", bjx.a.a(bxj::new, bkm.b).a(0.5F, 0.5F).a(10));
   public static final bjx<cex> P = a("furnace_minecart", bjx.a.<cex>a(cex::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<caf> Q = a("ghast", bjx.a.a(caf::new, bkm.a).c().a(4.0F, 4.0F).a(10));
   public static final bjx<cag> R = a("giant", bjx.a.a(cag::new, bkm.a).a(3.6F, 12.0F).a(10));
   public static final bjx<bzh> S = a("glow_item_frame", bjx.a.<bzh>a(bzh::new, bkm.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bjx<bkb> T = a("glow_squid", bjx.a.a(bkb::new, bkm.e).a(0.8F, 0.8F).a(10));
   public static final bjx<bxp> U = a("goat", bjx.a.a(bxp::new, bkm.b).a(0.9F, 1.3F).a(10));
   public static final bjx<cah> V = a("guardian", bjx.a.a(cah::new, bkm.a).a(0.85F, 0.85F).a(8));
   public static final bjx<cbh> W = a("hoglin", bjx.a.a(cbh::new, bkm.a).a(1.3964844F, 1.4F).a(8));
   public static final bjx<cey> X = a("hopper_minecart", bjx.a.<cey>a(cey::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<bxv> Y = a("horse", bjx.a.a(bxv::new, bkm.b).a(1.3964844F, 1.6F).a(10));
   public static final bjx<cai> Z = a("husk", bjx.a.a(cai::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<caj> aa = a("illusioner", bjx.a.a(caj::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<bke> ab = a("interaction", bjx.a.a(bke::new, bkm.h).a(0.0F, 0.0F).a(10));
   public static final bjx<bwg> ac = a("iron_golem", bjx.a.a(bwg::new, bkm.h).a(1.4F, 2.7F).a(10));
   public static final bjx<bzq> ad = a("item", bjx.a.<bzq>a(bzq::new, bkm.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bjx<bjs.g> ae = a("item_display", bjx.a.a(bjs.g::new, bkm.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bjx<bzj> af = a("item_frame", bjx.a.<bzj>a(bzj::new, bkm.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bjx<cdn> ag = a("fireball", bjx.a.<cdn>a(cdn::new, bkm.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bjx<bzk> ah = a("leash_knot", bjx.a.<bzk>a(bzk::new, bkm.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bjx<bki> ai = a("lightning_bolt", bjx.a.a(bki::new, bkm.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bjx<bxw> aj = a("llama", bjx.a.a(bxw::new, bkm.b).a(0.9F, 1.87F).a(10));
   public static final bjx<cdo> ak = a("llama_spit", bjx.a.<cdo>a(cdo::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<cak> al = a("magma_cube", bjx.a.a(cak::new, bkm.a).c().a(2.04F, 2.04F).a(8));
   public static final bjx<bkk> am = a("marker", bjx.a.a(bkk::new, bkm.h).a(0.0F, 0.0F).a(0));
   public static final bjx<ceu> an = a("minecart", bjx.a.<ceu>a(ceu::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<bwh> ao = a("mooshroom", bjx.a.a(bwh::new, bkm.b).a(0.9F, 1.4F).a(10));
   public static final bjx<bxy> ap = a("mule", bjx.a.a(bxy::new, bkm.b).a(1.3964844F, 1.6F).a(8));
   public static final bjx<bwi> aq = a("ocelot", bjx.a.a(bwi::new, bkm.b).a(0.6F, 0.7F).a(10));
   public static final bjx<bzl> ar = a("painting", bjx.a.<bzl>a(bzl::new, bkm.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bjx<bwj> as = a("panda", bjx.a.a(bwj::new, bkm.b).a(1.3F, 1.25F).a(10));
   public static final bjx<bwk> at = a("parrot", bjx.a.a(bwk::new, bkm.b).a(0.5F, 0.9F).a(8));
   public static final bjx<can> au = a("phantom", bjx.a.a(can::new, bkm.a).a(0.9F, 0.5F).a(8));
   public static final bjx<bwl> av = a("pig", bjx.a.a(bwl::new, bkm.b).a(0.9F, 0.9F).a(10));
   public static final bjx<cbn> aw = a("piglin", bjx.a.a(cbn::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<cbq> ax = a("piglin_brute", bjx.a.a(cbq::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<cao> ay = a("pillager", bjx.a.a(cao::new, bkm.a).d().a(0.6F, 1.95F).a(8));
   public static final bjx<bwm> az = a("polar_bear", bjx.a.a(bwm::new, bkm.b).a(cuc.qC).a(1.4F, 1.4F).a(10));
   public static final bjx<cea> aA = a("potion", bjx.a.<cea>a(cea::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<bwn> aB = a("pufferfish", bjx.a.a(bwn::new, bkm.g).a(0.7F, 0.7F).a(4));
   public static final bjx<bwo> aC = a("rabbit", bjx.a.a(bwo::new, bkm.b).a(0.4F, 0.5F).a(8));
   public static final bjx<caq> aD = a("ravager", bjx.a.a(caq::new, bkm.a).a(1.95F, 2.2F).a(10));
   public static final bjx<bwp> aE = a("salmon", bjx.a.a(bwp::new, bkm.g).a(0.7F, 0.4F).a(4));
   public static final bjx<bwq> aF = a("sheep", bjx.a.a(bwq::new, bkm.b).a(0.9F, 1.3F).a(10));
   public static final bjx<car> aG = a("shulker", bjx.a.a(car::new, bkm.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bjx<cdr> aH = a("shulker_bullet", bjx.a.<cdr>a(cdr::new, bkm.h).a(0.3125F, 0.3125F).a(8));
   public static final bjx<cas> aI = a("silverfish", bjx.a.a(cas::new, bkm.a).a(0.4F, 0.3F).a(8));
   public static final bjx<cat> aJ = a("skeleton", bjx.a.a(cat::new, bkm.a).a(0.6F, 1.99F).a(8));
   public static final bjx<bxz> aK = a("skeleton_horse", bjx.a.a(bxz::new, bkm.b).a(1.3964844F, 1.6F).a(10));
   public static final bjx<cau> aL = a("slime", bjx.a.a(cau::new, bkm.a).a(2.04F, 2.04F).a(10));
   public static final bjx<cds> aM = a("small_fireball", bjx.a.<cds>a(cds::new, bkm.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bjx<byg> aN = a("sniffer", bjx.a.a(byg::new, bkm.b).a(1.9F, 1.75F).a(10));
   public static final bjx<bws> aO = a("snow_golem", bjx.a.a(bws::new, bkm.h).a(cuc.qC).a(0.7F, 1.9F).a(8));
   public static final bjx<cdt> aP = a("snowball", bjx.a.<cdt>a(cdt::new, bkm.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bjx<cez> aQ = a("spawner_minecart", bjx.a.<cez>a(cez::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<cdu> aR = a("spectral_arrow", bjx.a.<cdu>a(cdu::new, bkm.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bjx<caw> aS = a("spider", bjx.a.a(caw::new, bkm.a).a(1.4F, 0.9F).a(8));
   public static final bjx<bwt> aT = a("squid", bjx.a.a(bwt::new, bkm.f).a(0.8F, 0.8F).a(8));
   public static final bjx<cax> aU = a("stray", bjx.a.a(cax::new, bkm.a).a(0.6F, 1.99F).a(cuc.qC).a(8));
   public static final bjx<cay> aV = a("strider", bjx.a.a(cay::new, bkm.b).c().a(0.9F, 1.7F).a(10));
   public static final bjx<bxm> aW = a("tadpole", bjx.a.a(bxm::new, bkm.b).a(bxm.c, bxm.d).a(10));
   public static final bjx<bjs.l> aX = a("text_display", bjx.a.a(bjs.l::new, bkm.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bjx<bzr> aY = a("tnt", bjx.a.<bzr>a(bzr::new, bkm.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bjx<cfa> aZ = a("tnt_minecart", bjx.a.<cfa>a(cfa::new, bkm.h).a(0.98F, 0.7F).a(8));
   public static final bjx<byb> ba = a("trader_llama", bjx.a.a(byb::new, bkm.b).a(0.9F, 1.87F).a(10));
   public static final bjx<ceb> bb = a("trident", bjx.a.<ceb>a(ceb::new, bkm.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bjx<bwu> bc = a("tropical_fish", bjx.a.a(bwu::new, bkm.g).a(0.5F, 0.4F).a(4));
   public static final bjx<bwv> bd = a("turtle", bjx.a.a(bwv::new, bkm.b).a(1.2F, 0.4F).a(10));
   public static final bjx<caz> be = a("vex", bjx.a.a(caz::new, bkm.a).c().a(0.4F, 0.8F).a(8));
   public static final bjx<cck> bf = a("villager", bjx.a.<cck>a(cck::new, bkm.h).a(0.6F, 1.95F).a(10));
   public static final bjx<cba> bg = a("vindicator", bjx.a.a(cba::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<ccq> bh = a("wandering_trader", bjx.a.a(ccq::new, bkm.b).a(0.6F, 1.95F).a(10));
   public static final bjx<ccb> bi = a("warden", bjx.a.a(ccb::new, bkm.a).a(0.9F, 2.9F).a(16).c());
   public static final bjx<cbb> bj = a("witch", bjx.a.a(cbb::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<bze> bk = a("wither", bjx.a.a(bze::new, bkm.a).c().a(cuc.cd).a(0.9F, 3.5F).a(10));
   public static final bjx<cbc> bl = a("wither_skeleton", bjx.a.a(cbc::new, bkm.a).c().a(cuc.cd).a(0.7F, 2.4F).a(8));
   public static final bjx<cec> bm = a("wither_skull", bjx.a.<cec>a(cec::new, bkm.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bjx<bwx> bn = a("wolf", bjx.a.a(bwx::new, bkm.b).a(0.6F, 0.85F).a(10));
   public static final bjx<cbd> bo = a("zoglin", bjx.a.a(cbd::new, bkm.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bjx<cbe> bp = a("zombie", bjx.a.<cbe>a(cbe::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<byd> bq = a("zombie_horse", bjx.a.a(byd::new, bkm.b).a(1.3964844F, 1.6F).a(10));
   public static final bjx<cbf> br = a("zombie_villager", bjx.a.a(cbf::new, bkm.a).a(0.6F, 1.95F).a(8));
   public static final bjx<cbg> bs = a("zombified_piglin", bjx.a.a(cbg::new, bkm.a).c().a(0.6F, 1.95F).a(8));
   public static final bjx<ccx> bt = a("player", bjx.a.<ccx>a(bkm.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bjx<cdl> bu = a("fishing_bobber", bjx.a.<cdl>a(cdl::new, bkm.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bjx.b<T> bA;
   private final bkm bB;
   private final ImmutableSet<cua> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private ui bK;
   @Nullable
   private afw bL;
   private final bju bM;
   private final cfg bN;

   private static <T extends bjt> bjx<T> a(String $$0, bjx.a<T> $$1) {
      return io.a(jy.h, $$0, $$1.a($$0));
   }

   public static afw a(bjx<?> $$0) {
      return jy.h.b($$0);
   }

   public static Optional<bjx<?>> a(String $$0) {
      return jy.h.b(afw.a($$0));
   }

   public bjx(bjx.b<T> $$0, bkm $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cua> $$6, bju $$7, int $$8, int $$9, cfg $$10) {
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
   public T a(alq $$0, @Nullable ckj $$1, @Nullable ccx $$2, ht $$3, bkn $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      rt $$7;
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

   public static <T extends bjt> Consumer<T> a(alq $$0, ckj $$1, @Nullable ccx $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bjt> Consumer<T> a(Consumer<T> $$0, alq $$1, ckj $$2, @Nullable ccx $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bjt> Consumer<T> a(Consumer<T> $$0, ckj $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bjt> Consumer<T> b(Consumer<T> $$0, alq $$1, ckj $$2, @Nullable ccx $$3) {
      rt $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(alq $$0, ht $$1, bkn $$2) {
      return this.a($$0, (rt)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(alq $$0, @Nullable rt $$1, @Nullable Consumer<T> $$2, ht $$3, bkn $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(alq $$0, @Nullable rt $$1, @Nullable Consumer<T> $$2, ht $$3, bkn $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cqz)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, asy.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bkl $$10) {
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

   protected static double a(crc $$0, ht $$1, boolean $$2, eia $$3) {
      eia $$4 = new eia($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eiy> $$5 = $$0.d(null, $$4);
      return 1.0 + eiv.a(hx.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cqz $$0, @Nullable ccx $$1, @Nullable bjt $$2, @Nullable rt $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().f($$1.fR())) {
               rt $$5 = $$2.f(new rt());
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

   public bkm f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jy.h.b(this));
      }

      return this.bJ;
   }

   public ui h() {
      if (this.bK == null) {
         this.bK = ui.c(this.g());
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

   public afw j() {
      if (this.bL == null) {
         afw $$0 = jy.h.b(this);
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
   public cfg m() {
      return this.bN;
   }

   @Nullable
   public T a(cqz $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bjt> a(rt $$0, cqz $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eia a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eia($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dgb $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && eby.a($$0) ? true : $$0.a(cuc.cd) || $$0.a(cuc.oi) || $$0.a(cuc.dQ) || $$0.a(cuc.qC);
      }
   }

   public bju n() {
      return this.bM;
   }

   public static Optional<bjx<?>> a(rt $$0) {
      return jy.h.b(new afw($$0.l("id")));
   }

   @Nullable
   public static bjt a(rt $$0, cqz $$1, Function<bjt, bjt> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            rz $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bjt $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bjt)$$3;
      }).orElse(null);
   }

   public static Stream<bjt> a(final List<? extends sn> $$0, final cqz $$1) {
      final Spliterator<? extends sn> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bjt>() {
         @Override
         public boolean tryAdvance(Consumer<? super bjt> $$0x) {
            return $$2.tryAdvance($$2xx -> bjx.a((rt)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bjt> trySplit() {
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

   private static Optional<bjt> b(rt $$0, cqz $$1) {
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

   public boolean a(arh<bjx<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(ig<bjx<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bjt $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bjt> a() {
      return bjt.class;
   }

   @Deprecated
   public ib.c<bjx<?>> r() {
      return this.bx;
   }

   public static class a<T extends bjt> {
      private final bjx.b<T> a;
      private final bkm b;
      private ImmutableSet<cua> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bju j = bju.b(0.6F, 1.8F);
      private cfg k = cfi.f;

      private a(bjx.b<T> $$0, bkm $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bkm.b || $$1 == bkm.h;
      }

      public static <T extends bjt> bjx.a<T> a(bjx.b<T> $$0, bkm $$1) {
         return new bjx.a<>($$0, $$1);
      }

      public static <T extends bjt> bjx.a<T> a(bkm $$0) {
         return new bjx.a<>(($$0x, $$1) -> null, $$0);
      }

      public bjx.a<T> a(float $$0, float $$1) {
         this.j = bju.b($$0, $$1);
         return this;
      }

      public bjx.a<T> a() {
         this.e = false;
         return this;
      }

      public bjx.a<T> b() {
         this.d = false;
         return this;
      }

      public bjx.a<T> c() {
         this.f = true;
         return this;
      }

      public bjx.a<T> a(cua... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bjx.a<T> d() {
         this.g = true;
         return this;
      }

      public bjx.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bjx.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bjx.a<T> a(cfe... $$0) {
         this.k = cfi.d.a($$0);
         return this;
      }

      public bjx<T> a(String $$0) {
         if (this.d) {
            ac.a(baa.w, $$0);
         }

         return new bjx<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bjt> {
      T create(bjx<T> var1, cqz var2);
   }
}
