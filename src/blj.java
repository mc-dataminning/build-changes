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

public class blj<T extends blf> implements cgy, dmn<blf, T> {
   private static final Logger by = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ie.c<blj<?>> bz = kb.g.f(this);
   private static final float bA = 1.3964844F;
   private static final int bB = 10;
   public static final blj<bym> b = a("allay", blj.a.a(bym::new, bly.b).a(0.35F, 0.6F).a(8).b(2));
   public static final blj<blc> c = a("area_effect_cloud", blj.a.<blc>a(blc::new, bly.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blj<cau> d = a("armor_stand", blj.a.<cau>a(cau::new, bly.h).a(0.5F, 1.975F).a(10));
   public static final blj<cez> e = a("arrow", blj.a.<cez>a(cez::new, bly.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blj<byp> f = a("axolotl", blj.a.a(byp::new, bly.d).a(0.75F, 0.42F).a(10));
   public static final blj<bxd> g = a("bat", blj.a.a(bxd::new, bly.c).a(0.5F, 0.9F).a(5));
   public static final blj<bxj> h = a("bee", blj.a.a(bxj::new, bly.b).a(0.7F, 0.6F).a(8));
   public static final blj<cbj> i = a("blaze", blj.a.a(cbj::new, bly.a).c().a(0.6F, 1.8F).a(8));
   public static final blj<ble.b> j = a("block_display", blj.a.a(ble.b::new, bly.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blj<cgl> k = a("boat", blj.a.<cgl>a(cgl::new, bly.h).a(1.375F, 0.5625F).a(10));
   public static final blj<ccv> l = a("breeze", blj.a.a(ccv::new, bly.a).a(0.6F, 1.7F).a(10).a(chd.c));
   public static final blj<byu> m = a("camel", blj.a.a(byu::new, bly.b).a(1.7F, 2.375F).a(10));
   public static final blj<bxl> n = a("cat", blj.a.a(bxl::new, bly.b).a(0.6F, 0.7F).a(8));
   public static final blj<cbk> o = a("cave_spider", blj.a.a(cbk::new, bly.a).a(0.7F, 0.5F).a(8));
   public static final blj<cgm> p = a("chest_boat", blj.a.<cgm>a(cgm::new, bly.h).a(1.375F, 0.5625F).a(10));
   public static final blj<cgq> q = a("chest_minecart", blj.a.<cgq>a(cgq::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<bxn> r = a("chicken", blj.a.a(bxn::new, bly.b).a(0.4F, 0.7F).a(10));
   public static final blj<bxo> s = a("cod", blj.a.a(bxo::new, bly.g).a(0.5F, 0.3F).a(4));
   public static final blj<cgr> t = a("command_block_minecart", blj.a.<cgr>a(cgr::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<bxp> u = a("cow", blj.a.a(bxp::new, bly.b).a(0.9F, 1.4F).a(10));
   public static final blj<cbl> v = a("creeper", blj.a.a(cbl::new, bly.a).a(0.6F, 1.7F).a(8));
   public static final blj<bxq> w = a("dolphin", blj.a.a(bxq::new, bly.f).a(0.9F, 0.6F));
   public static final blj<bzi> x = a("donkey", blj.a.a(bzi::new, bly.b).a(1.3964844F, 1.5F).a(10));
   public static final blj<cfa> y = a("dragon_fireball", blj.a.<cfa>a(cfa::new, bly.h).a(1.0F, 1.0F).a(4).b(10));
   public static final blj<cbn> z = a("drowned", blj.a.a(cbn::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<cfr> A = a("egg", blj.a.<cfr>a(cfr::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<cbo> B = a("elder_guardian", blj.a.a(cbo::new, bly.a).a(1.9975F, 1.9975F).a(10));
   public static final blj<bzx> C = a("end_crystal", blj.a.<bzx>a(bzx::new, bly.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final blj<bzy> D = a("ender_dragon", blj.a.a(bzy::new, bly.a).c().a(16.0F, 8.0F).a(10));
   public static final blj<cfs> E = a("ender_pearl", blj.a.<cfs>a(cfs::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<cbp> F = a("enderman", blj.a.a(cbp::new, bly.a).a(0.6F, 2.9F).a(8));
   public static final blj<cbq> G = a("endermite", blj.a.a(cbq::new, bly.a).a(0.4F, 0.3F).a(8));
   public static final blj<cbs> H = a("evoker", blj.a.a(cbs::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<cfb> I = a("evoker_fangs", blj.a.<cfb>a(cfb::new, bly.h).a(0.5F, 0.8F).a(6).b(2));
   public static final blj<cft> J = a("experience_bottle", blj.a.<cft>a(cft::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<bll> K = a("experience_orb", blj.a.<bll>a(bll::new, bly.h).a(0.5F, 0.5F).a(6).b(20));
   public static final blj<cfc> L = a("eye_of_ender", blj.a.<cfc>a(cfc::new, bly.h).a(0.25F, 0.25F).a(4).b(4));
   public static final blj<cbd> M = a("falling_block", blj.a.<cbd>a(cbd::new, bly.h).a(0.98F, 0.98F).a(10).b(20));
   public static final blj<cfe> N = a("firework_rocket", blj.a.<cfe>a(cfe::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<bxs> O = a("fox", blj.a.a(bxs::new, bly.b).a(0.6F, 0.7F).a(8).a(cwb.oi));
   public static final blj<byx> P = a("frog", blj.a.a(byx::new, bly.b).a(0.5F, 0.5F).a(10));
   public static final blj<cgs> Q = a("furnace_minecart", blj.a.<cgs>a(cgs::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<cbt> R = a("ghast", blj.a.a(cbt::new, bly.a).c().a(4.0F, 4.0F).a(10));
   public static final blj<cbu> S = a("giant", blj.a.a(cbu::new, bly.a).a(3.6F, 12.0F).a(10));
   public static final blj<cav> T = a("glow_item_frame", blj.a.<cav>a(cav::new, bly.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blj<bln> U = a("glow_squid", blj.a.a(bln::new, bly.e).a(0.8F, 0.8F).a(10));
   public static final blj<bzd> V = a("goat", blj.a.a(bzd::new, bly.b).a(0.9F, 1.3F).a(10));
   public static final blj<cbv> W = a("guardian", blj.a.a(cbv::new, bly.a).a(0.85F, 0.85F).a(8));
   public static final blj<cdb> X = a("hoglin", blj.a.a(cdb::new, bly.a).a(1.3964844F, 1.4F).a(8));
   public static final blj<cgt> Y = a("hopper_minecart", blj.a.<cgt>a(cgt::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<bzj> Z = a("horse", blj.a.a(bzj::new, bly.b).a(1.3964844F, 1.6F).a(10));
   public static final blj<cbw> aa = a("husk", blj.a.a(cbw::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<cbx> ab = a("illusioner", blj.a.a(cbx::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<blq> ac = a("interaction", blj.a.a(blq::new, bly.h).a(0.0F, 0.0F).a(10));
   public static final blj<bxu> ad = a("iron_golem", blj.a.a(bxu::new, bly.h).a(1.4F, 2.7F).a(10));
   public static final blj<cbe> ae = a("item", blj.a.<cbe>a(cbe::new, bly.h).a(0.25F, 0.25F).a(6).b(20));
   public static final blj<ble.g> af = a("item_display", blj.a.a(ble.g::new, bly.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blj<cax> ag = a("item_frame", blj.a.<cax>a(cax::new, bly.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blj<cfh> ah = a("fireball", blj.a.<cfh>a(cfh::new, bly.h).a(1.0F, 1.0F).a(4).b(10));
   public static final blj<cay> ai = a("leash_knot", blj.a.<cay>a(cay::new, bly.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blj<blu> aj = a("lightning_bolt", blj.a.a(blu::new, bly.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final blj<bzk> ak = a("llama", blj.a.a(bzk::new, bly.b).a(0.9F, 1.87F).a(10));
   public static final blj<cfi> al = a("llama_spit", blj.a.<cfi>a(cfi::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<cby> am = a("magma_cube", blj.a.a(cby::new, bly.a).c().a(2.04F, 2.04F).a(8));
   public static final blj<blw> an = a("marker", blj.a.a(blw::new, bly.h).a(0.0F, 0.0F).a(0));
   public static final blj<cgp> ao = a("minecart", blj.a.<cgp>a(cgp::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<bxv> ap = a("mooshroom", blj.a.a(bxv::new, bly.b).a(0.9F, 1.4F).a(10));
   public static final blj<bzm> aq = a("mule", blj.a.a(bzm::new, bly.b).a(1.3964844F, 1.6F).a(8));
   public static final blj<bxw> ar = a("ocelot", blj.a.a(bxw::new, bly.b).a(0.6F, 0.7F).a(10));
   public static final blj<caz> as = a("painting", blj.a.<caz>a(caz::new, bly.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final blj<bxx> at = a("panda", blj.a.a(bxx::new, bly.b).a(1.3F, 1.25F).a(10));
   public static final blj<bxy> au = a("parrot", blj.a.a(bxy::new, bly.b).a(0.5F, 0.9F).a(8));
   public static final blj<ccb> av = a("phantom", blj.a.a(ccb::new, bly.a).a(0.9F, 0.5F).a(8));
   public static final blj<bxz> aw = a("pig", blj.a.a(bxz::new, bly.b).a(0.9F, 0.9F).a(10));
   public static final blj<cdh> ax = a("piglin", blj.a.a(cdh::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<cdk> ay = a("piglin_brute", blj.a.a(cdk::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<ccc> az = a("pillager", blj.a.a(ccc::new, bly.a).d().a(0.6F, 1.95F).a(8));
   public static final blj<bya> aA = a("polar_bear", blj.a.a(bya::new, bly.b).a(cwb.qP).a(1.4F, 1.4F).a(10));
   public static final blj<cfu> aB = a("potion", blj.a.<cfu>a(cfu::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<byb> aC = a("pufferfish", blj.a.a(byb::new, bly.g).a(0.7F, 0.7F).a(4));
   public static final blj<byc> aD = a("rabbit", blj.a.a(byc::new, bly.b).a(0.4F, 0.5F).a(8));
   public static final blj<cce> aE = a("ravager", blj.a.a(cce::new, bly.a).a(1.95F, 2.2F).a(10));
   public static final blj<byd> aF = a("salmon", blj.a.a(byd::new, bly.g).a(0.7F, 0.4F).a(4));
   public static final blj<bye> aG = a("sheep", blj.a.a(bye::new, bly.b).a(0.9F, 1.3F).a(10));
   public static final blj<ccf> aH = a("shulker", blj.a.a(ccf::new, bly.a).c().d().a(1.0F, 1.0F).a(10));
   public static final blj<cfl> aI = a("shulker_bullet", blj.a.<cfl>a(cfl::new, bly.h).a(0.3125F, 0.3125F).a(8));
   public static final blj<ccg> aJ = a("silverfish", blj.a.a(ccg::new, bly.a).a(0.4F, 0.3F).a(8));
   public static final blj<cch> aK = a("skeleton", blj.a.a(cch::new, bly.a).a(0.6F, 1.99F).a(8));
   public static final blj<bzn> aL = a("skeleton_horse", blj.a.a(bzn::new, bly.b).a(1.3964844F, 1.6F).a(10));
   public static final blj<cci> aM = a("slime", blj.a.a(cci::new, bly.a).a(2.04F, 2.04F).a(10));
   public static final blj<cfm> aN = a("small_fireball", blj.a.<cfm>a(cfm::new, bly.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blj<bzu> aO = a("sniffer", blj.a.a(bzu::new, bly.b).a(1.9F, 1.75F).a(10));
   public static final blj<byg> aP = a("snow_golem", blj.a.a(byg::new, bly.h).a(cwb.qP).a(0.7F, 1.9F).a(8));
   public static final blj<cfn> aQ = a("snowball", blj.a.<cfn>a(cfn::new, bly.h).a(0.25F, 0.25F).a(4).b(10));
   public static final blj<cgu> aR = a("spawner_minecart", blj.a.<cgu>a(cgu::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<cfo> aS = a("spectral_arrow", blj.a.<cfo>a(cfo::new, bly.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blj<cck> aT = a("spider", blj.a.a(cck::new, bly.a).a(1.4F, 0.9F).a(8));
   public static final blj<byh> aU = a("squid", blj.a.a(byh::new, bly.f).a(0.8F, 0.8F).a(8));
   public static final blj<ccl> aV = a("stray", blj.a.a(ccl::new, bly.a).a(0.6F, 1.99F).a(cwb.qP).a(8));
   public static final blj<ccm> aW = a("strider", blj.a.a(ccm::new, bly.b).c().a(0.9F, 1.7F).a(10));
   public static final blj<bza> aX = a("tadpole", blj.a.a(bza::new, bly.b).a(bza.c, bza.d).a(10));
   public static final blj<ble.l> aY = a("text_display", blj.a.a(ble.l::new, bly.h).a(0.0F, 0.0F).a(10).b(1));
   public static final blj<cbf> aZ = a("tnt", blj.a.<cbf>a(cbf::new, bly.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final blj<cgv> ba = a("tnt_minecart", blj.a.<cgv>a(cgv::new, bly.h).a(0.98F, 0.7F).a(8));
   public static final blj<bzp> bb = a("trader_llama", blj.a.a(bzp::new, bly.b).a(0.9F, 1.87F).a(10));
   public static final blj<cfv> bc = a("trident", blj.a.<cfv>a(cfv::new, bly.h).a(0.5F, 0.5F).a(4).b(20));
   public static final blj<byi> bd = a("tropical_fish", blj.a.a(byi::new, bly.g).a(0.5F, 0.4F).a(4));
   public static final blj<byj> be = a("turtle", blj.a.a(byj::new, bly.b).a(1.2F, 0.4F).a(10));
   public static final blj<ccn> bf = a("vex", blj.a.a(ccn::new, bly.a).c().a(0.4F, 0.8F).a(8));
   public static final blj<cee> bg = a("villager", blj.a.<cee>a(cee::new, bly.h).a(0.6F, 1.95F).a(10));
   public static final blj<cco> bh = a("vindicator", blj.a.a(cco::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<cek> bi = a("wandering_trader", blj.a.a(cek::new, bly.b).a(0.6F, 1.95F).a(10));
   public static final blj<cdv> bj = a("warden", blj.a.a(cdv::new, bly.a).a(0.9F, 2.9F).a(16).c());
   public static final blj<cfw> bk = a("wind_charge", blj.a.<cfw>a(cfw::new, bly.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blj<ccp> bl = a("witch", blj.a.a(ccp::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<cas> bm = a("wither", blj.a.a(cas::new, bly.a).c().a(cwb.cd).a(0.9F, 3.5F).a(10));
   public static final blj<ccq> bn = a("wither_skeleton", blj.a.a(ccq::new, bly.a).c().a(cwb.cd).a(0.7F, 2.4F).a(8));
   public static final blj<cfx> bo = a("wither_skull", blj.a.<cfx>a(cfx::new, bly.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final blj<byl> bp = a("wolf", blj.a.a(byl::new, bly.b).a(0.6F, 0.85F).a(10));
   public static final blj<ccr> bq = a("zoglin", blj.a.a(ccr::new, bly.a).c().a(1.3964844F, 1.4F).a(8));
   public static final blj<ccs> br = a("zombie", blj.a.<ccs>a(ccs::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<bzr> bs = a("zombie_horse", blj.a.a(bzr::new, bly.b).a(1.3964844F, 1.6F).a(10));
   public static final blj<cct> bt = a("zombie_villager", blj.a.a(cct::new, bly.a).a(0.6F, 1.95F).a(8));
   public static final blj<ccu> bu = a("zombified_piglin", blj.a.a(ccu::new, bly.a).c().a(0.6F, 1.95F).a(8));
   public static final blj<cer> bv = a("player", blj.a.<cer>a(bly.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final blj<cff> bw = a("fishing_bobber", blj.a.<cff>a(cff::new, bly.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final blj.b<T> bC;
   private final bly bD;
   private final ImmutableSet<cvz> bE;
   private final boolean bF;
   private final boolean bG;
   private final boolean bH;
   private final boolean bI;
   private final int bJ;
   private final int bK;
   @Nullable
   private String bL;
   @Nullable
   private vb bM;
   @Nullable
   private agt bN;
   private final blg bO;
   private final chb bP;

   private static <T extends blf> blj<T> a(String $$0, blj.a<T> $$1) {
      return ir.a(kb.g, $$0, $$1.a($$0));
   }

   public static agt a(blj<?> $$0) {
      return kb.g.b($$0);
   }

   public static Optional<blj<?>> a(String $$0) {
      return kb.g.b(agt.a($$0));
   }

   public blj(blj.b<T> $$0, bly $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cvz> $$6, blg $$7, int $$8, int $$9, chb $$10) {
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
   public T a(amp $$0, @Nullable cmh $$1, @Nullable cer $$2, hv $$3, blz $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      sj $$7;
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

   public static <T extends blf> Consumer<T> a(amp $$0, cmh $$1, @Nullable cer $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends blf> Consumer<T> a(Consumer<T> $$0, amp $$1, cmh $$2, @Nullable cer $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends blf> Consumer<T> a(Consumer<T> $$0, cmh $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends blf> Consumer<T> b(Consumer<T> $$0, amp $$1, cmh $$2, @Nullable cer $$3) {
      sj $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(amp $$0, hv $$1, blz $$2) {
      return this.a($$0, (sj)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(amp $$0, @Nullable sj $$1, @Nullable Consumer<T> $$2, hv $$3, blz $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(amp $$0, @Nullable sj $$1, @Nullable Consumer<T> $$2, hv $$3, blz $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((csy)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, aty.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof blx $$10) {
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

   protected static double a(ctb $$0, hv $$1, boolean $$2, ekw $$3) {
      ekw $$4 = new ekw($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<elu> $$5 = $$0.d(null, $$4);
      return 1.0 + elr.a(ia.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(csy $$0, @Nullable cer $$1, @Nullable blf $$2, @Nullable sj $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ae().f($$1.fR())) {
               sj $$5 = $$2.f(new sj());
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

   public bly f() {
      return this.bD;
   }

   public String g() {
      if (this.bL == null) {
         this.bL = ac.a("entity", kb.g.b(this));
      }

      return this.bL;
   }

   public vb h() {
      if (this.bM == null) {
         this.bM = vb.c(this.g());
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

   public agt j() {
      if (this.bN == null) {
         agt $$0 = kb.g.b(this);
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
   public chb m() {
      return this.bP;
   }

   @Nullable
   public T a(csy $$0) {
      return !this.a($$0.H()) ? null : this.bC.create(this, $$0);
   }

   public static Optional<blf> a(sj $$0, csy $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> by.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ekw a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ekw($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dip $$0) {
      if (this.bE.contains($$0.b())) {
         return false;
      } else {
         return !this.bH && eet.a($$0) ? true : $$0.a(cwb.cd) || $$0.a(cwb.oi) || $$0.a(cwb.dQ) || $$0.a(cwb.qP);
      }
   }

   public blg n() {
      return this.bO;
   }

   public static Optional<blj<?>> a(sj $$0) {
      return kb.g.b(new agt($$0.l("id")));
   }

   @Nullable
   public static blf a(sj $$0, csy $$1, Function<blf, blf> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            sp $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               blf $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (blf)$$3;
      }).orElse(null);
   }

   public static Stream<blf> a(final List<? extends tg> $$0, final csy $$1) {
      final Spliterator<? extends tg> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<blf>() {
         @Override
         public boolean tryAdvance(Consumer<? super blf> $$0x) {
            return $$2.tryAdvance($$2xx -> blj.a((sj)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<blf> trySplit() {
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

   private static Optional<blf> b(sj $$0, csy $$1) {
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

   public boolean a(asg<blj<?>> $$0) {
      return this.bz.a($$0);
   }

   public boolean a(ij<blj<?>> $$0) {
      return $$0.a(this.bz);
   }

   @Nullable
   public T a(blf $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends blf> a() {
      return blf.class;
   }

   @Deprecated
   public ie.c<blj<?>> r() {
      return this.bz;
   }

   public static class a<T extends blf> {
      private final blj.b<T> a;
      private final bly b;
      private ImmutableSet<cvz> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private blg j = blg.b(0.6F, 1.8F);
      private chb k = chd.g;

      private a(blj.b<T> $$0, bly $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bly.b || $$1 == bly.h;
      }

      public static <T extends blf> blj.a<T> a(blj.b<T> $$0, bly $$1) {
         return new blj.a<>($$0, $$1);
      }

      public static <T extends blf> blj.a<T> a(bly $$0) {
         return new blj.a<>(($$0x, $$1) -> null, $$0);
      }

      public blj.a<T> a(float $$0, float $$1) {
         this.j = blg.b($$0, $$1);
         return this;
      }

      public blj.a<T> a() {
         this.e = false;
         return this;
      }

      public blj.a<T> b() {
         this.d = false;
         return this;
      }

      public blj.a<T> c() {
         this.f = true;
         return this;
      }

      public blj.a<T> a(cvz... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public blj.a<T> d() {
         this.g = true;
         return this;
      }

      public blj.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public blj.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public blj.a<T> a(cgz... $$0) {
         this.k = chd.e.a($$0);
         return this;
      }

      public blj<T> a(String $$0) {
         if (this.d) {
            ac.a(bbg.w, $$0);
         }

         return new blj<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends blf> {
      T create(blj<T> var1, csy var2);
   }
}
