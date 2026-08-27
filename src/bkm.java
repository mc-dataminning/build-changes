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

public class bkm<T extends bki> implements cfs, dku<bki, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ib.c<bkm<?>> bx = jy.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bkm<bxn> b = a("allay", bkm.a.a(bxn::new, blb.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bkm<bkf> c = a("area_effect_cloud", bkm.a.<bkf>a(bkf::new, blb.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkm<bzv> d = a("armor_stand", bkm.a.<bzv>a(bzv::new, blb.h).a(0.5F, 1.975F).a(10));
   public static final bkm<cdu> e = a("arrow", bkm.a.<cdu>a(cdu::new, blb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bkm<bxq> f = a("axolotl", bkm.a.a(bxq::new, blb.d).a(0.75F, 0.42F).a(10));
   public static final bkm<bwe> g = a("bat", bkm.a.a(bwe::new, blb.c).a(0.5F, 0.9F).a(5));
   public static final bkm<bwk> h = a("bee", bkm.a.a(bwk::new, blb.b).a(0.7F, 0.6F).a(8));
   public static final bkm<cak> i = a("blaze", bkm.a.a(cak::new, blb.a).c().a(0.6F, 1.8F).a(8));
   public static final bkm<bkh.b> j = a("block_display", bkm.a.a(bkh.b::new, blb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bkm<cff> k = a("boat", bkm.a.<cff>a(cff::new, blb.h).a(1.375F, 0.5625F).a(10));
   public static final bkm<bxv> l = a("camel", bkm.a.a(bxv::new, blb.b).a(1.7F, 2.375F).a(10));
   public static final bkm<bwm> m = a("cat", bkm.a.a(bwm::new, blb.b).a(0.6F, 0.7F).a(8));
   public static final bkm<cal> n = a("cave_spider", bkm.a.a(cal::new, blb.a).a(0.7F, 0.5F).a(8));
   public static final bkm<cfg> o = a("chest_boat", bkm.a.<cfg>a(cfg::new, blb.h).a(1.375F, 0.5625F).a(10));
   public static final bkm<cfk> p = a("chest_minecart", bkm.a.<cfk>a(cfk::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<bwo> q = a("chicken", bkm.a.a(bwo::new, blb.b).a(0.4F, 0.7F).a(10));
   public static final bkm<bwp> r = a("cod", bkm.a.a(bwp::new, blb.g).a(0.5F, 0.3F).a(4));
   public static final bkm<cfl> s = a("command_block_minecart", bkm.a.<cfl>a(cfl::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<bwq> t = a("cow", bkm.a.a(bwq::new, blb.b).a(0.9F, 1.4F).a(10));
   public static final bkm<cam> u = a("creeper", bkm.a.a(cam::new, blb.a).a(0.6F, 1.7F).a(8));
   public static final bkm<bwr> v = a("dolphin", bkm.a.a(bwr::new, blb.f).a(0.9F, 0.6F));
   public static final bkm<byj> w = a("donkey", bkm.a.a(byj::new, blb.b).a(1.3964844F, 1.5F).a(10));
   public static final bkm<cdv> x = a("dragon_fireball", bkm.a.<cdv>a(cdv::new, blb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bkm<cao> y = a("drowned", bkm.a.a(cao::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<cem> z = a("egg", bkm.a.<cem>a(cem::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<cap> A = a("elder_guardian", bkm.a.a(cap::new, blb.a).a(1.9975F, 1.9975F).a(10));
   public static final bkm<byy> B = a("end_crystal", bkm.a.<byy>a(byy::new, blb.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bkm<byz> C = a("ender_dragon", bkm.a.a(byz::new, blb.a).c().a(16.0F, 8.0F).a(10));
   public static final bkm<cen> D = a("ender_pearl", bkm.a.<cen>a(cen::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<caq> E = a("enderman", bkm.a.a(caq::new, blb.a).a(0.6F, 2.9F).a(8));
   public static final bkm<car> F = a("endermite", bkm.a.a(car::new, blb.a).a(0.4F, 0.3F).a(8));
   public static final bkm<cat> G = a("evoker", bkm.a.a(cat::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<cdw> H = a("evoker_fangs", bkm.a.<cdw>a(cdw::new, blb.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bkm<ceo> I = a("experience_bottle", bkm.a.<ceo>a(ceo::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<bko> J = a("experience_orb", bkm.a.<bko>a(bko::new, blb.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bkm<cdx> K = a("eye_of_ender", bkm.a.<cdx>a(cdx::new, blb.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bkm<cae> L = a("falling_block", bkm.a.<cae>a(cae::new, blb.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bkm<cdz> M = a("firework_rocket", bkm.a.<cdz>a(cdz::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<bwt> N = a("fox", bkm.a.a(bwt::new, blb.b).a(0.6F, 0.7F).a(8).a(cuv.oi));
   public static final bkm<bxy> O = a("frog", bkm.a.a(bxy::new, blb.b).a(0.5F, 0.5F).a(10));
   public static final bkm<cfm> P = a("furnace_minecart", bkm.a.<cfm>a(cfm::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<cau> Q = a("ghast", bkm.a.a(cau::new, blb.a).c().a(4.0F, 4.0F).a(10));
   public static final bkm<cav> R = a("giant", bkm.a.a(cav::new, blb.a).a(3.6F, 12.0F).a(10));
   public static final bkm<bzw> S = a("glow_item_frame", bkm.a.<bzw>a(bzw::new, blb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkm<bkq> T = a("glow_squid", bkm.a.a(bkq::new, blb.e).a(0.8F, 0.8F).a(10));
   public static final bkm<bye> U = a("goat", bkm.a.a(bye::new, blb.b).a(0.9F, 1.3F).a(10));
   public static final bkm<caw> V = a("guardian", bkm.a.a(caw::new, blb.a).a(0.85F, 0.85F).a(8));
   public static final bkm<cbw> W = a("hoglin", bkm.a.a(cbw::new, blb.a).a(1.3964844F, 1.4F).a(8));
   public static final bkm<cfn> X = a("hopper_minecart", bkm.a.<cfn>a(cfn::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<byk> Y = a("horse", bkm.a.a(byk::new, blb.b).a(1.3964844F, 1.6F).a(10));
   public static final bkm<cax> Z = a("husk", bkm.a.a(cax::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<cay> aa = a("illusioner", bkm.a.a(cay::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<bkt> ab = a("interaction", bkm.a.a(bkt::new, blb.h).a(0.0F, 0.0F).a(10));
   public static final bkm<bwv> ac = a("iron_golem", bkm.a.a(bwv::new, blb.h).a(1.4F, 2.7F).a(10));
   public static final bkm<caf> ad = a("item", bkm.a.<caf>a(caf::new, blb.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bkm<bkh.g> ae = a("item_display", bkm.a.a(bkh.g::new, blb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bkm<bzy> af = a("item_frame", bkm.a.<bzy>a(bzy::new, blb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkm<cec> ag = a("fireball", bkm.a.<cec>a(cec::new, blb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bkm<bzz> ah = a("leash_knot", bkm.a.<bzz>a(bzz::new, blb.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkm<bkx> ai = a("lightning_bolt", bkm.a.a(bkx::new, blb.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bkm<byl> aj = a("llama", bkm.a.a(byl::new, blb.b).a(0.9F, 1.87F).a(10));
   public static final bkm<ced> ak = a("llama_spit", bkm.a.<ced>a(ced::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<caz> al = a("magma_cube", bkm.a.a(caz::new, blb.a).c().a(2.04F, 2.04F).a(8));
   public static final bkm<bkz> am = a("marker", bkm.a.a(bkz::new, blb.h).a(0.0F, 0.0F).a(0));
   public static final bkm<cfj> an = a("minecart", bkm.a.<cfj>a(cfj::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<bww> ao = a("mooshroom", bkm.a.a(bww::new, blb.b).a(0.9F, 1.4F).a(10));
   public static final bkm<byn> ap = a("mule", bkm.a.a(byn::new, blb.b).a(1.3964844F, 1.6F).a(8));
   public static final bkm<bwx> aq = a("ocelot", bkm.a.a(bwx::new, blb.b).a(0.6F, 0.7F).a(10));
   public static final bkm<caa> ar = a("painting", bkm.a.<caa>a(caa::new, blb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkm<bwy> as = a("panda", bkm.a.a(bwy::new, blb.b).a(1.3F, 1.25F).a(10));
   public static final bkm<bwz> at = a("parrot", bkm.a.a(bwz::new, blb.b).a(0.5F, 0.9F).a(8));
   public static final bkm<cbc> au = a("phantom", bkm.a.a(cbc::new, blb.a).a(0.9F, 0.5F).a(8));
   public static final bkm<bxa> av = a("pig", bkm.a.a(bxa::new, blb.b).a(0.9F, 0.9F).a(10));
   public static final bkm<ccc> aw = a("piglin", bkm.a.a(ccc::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<ccf> ax = a("piglin_brute", bkm.a.a(ccf::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<cbd> ay = a("pillager", bkm.a.a(cbd::new, blb.a).d().a(0.6F, 1.95F).a(8));
   public static final bkm<bxb> az = a("polar_bear", bkm.a.a(bxb::new, blb.b).a(cuv.qC).a(1.4F, 1.4F).a(10));
   public static final bkm<cep> aA = a("potion", bkm.a.<cep>a(cep::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<bxc> aB = a("pufferfish", bkm.a.a(bxc::new, blb.g).a(0.7F, 0.7F).a(4));
   public static final bkm<bxd> aC = a("rabbit", bkm.a.a(bxd::new, blb.b).a(0.4F, 0.5F).a(8));
   public static final bkm<cbf> aD = a("ravager", bkm.a.a(cbf::new, blb.a).a(1.95F, 2.2F).a(10));
   public static final bkm<bxe> aE = a("salmon", bkm.a.a(bxe::new, blb.g).a(0.7F, 0.4F).a(4));
   public static final bkm<bxf> aF = a("sheep", bkm.a.a(bxf::new, blb.b).a(0.9F, 1.3F).a(10));
   public static final bkm<cbg> aG = a("shulker", bkm.a.a(cbg::new, blb.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bkm<ceg> aH = a("shulker_bullet", bkm.a.<ceg>a(ceg::new, blb.h).a(0.3125F, 0.3125F).a(8));
   public static final bkm<cbh> aI = a("silverfish", bkm.a.a(cbh::new, blb.a).a(0.4F, 0.3F).a(8));
   public static final bkm<cbi> aJ = a("skeleton", bkm.a.a(cbi::new, blb.a).a(0.6F, 1.99F).a(8));
   public static final bkm<byo> aK = a("skeleton_horse", bkm.a.a(byo::new, blb.b).a(1.3964844F, 1.6F).a(10));
   public static final bkm<cbj> aL = a("slime", bkm.a.a(cbj::new, blb.a).a(2.04F, 2.04F).a(10));
   public static final bkm<ceh> aM = a("small_fireball", bkm.a.<ceh>a(ceh::new, blb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bkm<byv> aN = a("sniffer", bkm.a.a(byv::new, blb.b).a(1.9F, 1.75F).a(10));
   public static final bkm<bxh> aO = a("snow_golem", bkm.a.a(bxh::new, blb.h).a(cuv.qC).a(0.7F, 1.9F).a(8));
   public static final bkm<cei> aP = a("snowball", bkm.a.<cei>a(cei::new, blb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkm<cfo> aQ = a("spawner_minecart", bkm.a.<cfo>a(cfo::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<cej> aR = a("spectral_arrow", bkm.a.<cej>a(cej::new, blb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bkm<cbl> aS = a("spider", bkm.a.a(cbl::new, blb.a).a(1.4F, 0.9F).a(8));
   public static final bkm<bxi> aT = a("squid", bkm.a.a(bxi::new, blb.f).a(0.8F, 0.8F).a(8));
   public static final bkm<cbm> aU = a("stray", bkm.a.a(cbm::new, blb.a).a(0.6F, 1.99F).a(cuv.qC).a(8));
   public static final bkm<cbn> aV = a("strider", bkm.a.a(cbn::new, blb.b).c().a(0.9F, 1.7F).a(10));
   public static final bkm<byb> aW = a("tadpole", bkm.a.a(byb::new, blb.b).a(byb.c, byb.d).a(10));
   public static final bkm<bkh.l> aX = a("text_display", bkm.a.a(bkh.l::new, blb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bkm<cag> aY = a("tnt", bkm.a.<cag>a(cag::new, blb.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bkm<cfp> aZ = a("tnt_minecart", bkm.a.<cfp>a(cfp::new, blb.h).a(0.98F, 0.7F).a(8));
   public static final bkm<byq> ba = a("trader_llama", bkm.a.a(byq::new, blb.b).a(0.9F, 1.87F).a(10));
   public static final bkm<ceq> bb = a("trident", bkm.a.<ceq>a(ceq::new, blb.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bkm<bxj> bc = a("tropical_fish", bkm.a.a(bxj::new, blb.g).a(0.5F, 0.4F).a(4));
   public static final bkm<bxk> bd = a("turtle", bkm.a.a(bxk::new, blb.b).a(1.2F, 0.4F).a(10));
   public static final bkm<cbo> be = a("vex", bkm.a.a(cbo::new, blb.a).c().a(0.4F, 0.8F).a(8));
   public static final bkm<ccz> bf = a("villager", bkm.a.<ccz>a(ccz::new, blb.h).a(0.6F, 1.95F).a(10));
   public static final bkm<cbp> bg = a("vindicator", bkm.a.a(cbp::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<cdf> bh = a("wandering_trader", bkm.a.a(cdf::new, blb.b).a(0.6F, 1.95F).a(10));
   public static final bkm<ccq> bi = a("warden", bkm.a.a(ccq::new, blb.a).a(0.9F, 2.9F).a(16).c());
   public static final bkm<cbq> bj = a("witch", bkm.a.a(cbq::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<bzt> bk = a("wither", bkm.a.a(bzt::new, blb.a).c().a(cuv.cd).a(0.9F, 3.5F).a(10));
   public static final bkm<cbr> bl = a("wither_skeleton", bkm.a.a(cbr::new, blb.a).c().a(cuv.cd).a(0.7F, 2.4F).a(8));
   public static final bkm<cer> bm = a("wither_skull", bkm.a.<cer>a(cer::new, blb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bkm<bxm> bn = a("wolf", bkm.a.a(bxm::new, blb.b).a(0.6F, 0.85F).a(10));
   public static final bkm<cbs> bo = a("zoglin", bkm.a.a(cbs::new, blb.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bkm<cbt> bp = a("zombie", bkm.a.<cbt>a(cbt::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<bys> bq = a("zombie_horse", bkm.a.a(bys::new, blb.b).a(1.3964844F, 1.6F).a(10));
   public static final bkm<cbu> br = a("zombie_villager", bkm.a.a(cbu::new, blb.a).a(0.6F, 1.95F).a(8));
   public static final bkm<cbv> bs = a("zombified_piglin", bkm.a.a(cbv::new, blb.a).c().a(0.6F, 1.95F).a(8));
   public static final bkm<cdm> bt = a("player", bkm.a.<cdm>a(blb.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bkm<cea> bu = a("fishing_bobber", bkm.a.<cea>a(cea::new, blb.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bkm.b<T> bA;
   private final blb bB;
   private final ImmutableSet<cut> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private ur bK;
   @Nullable
   private agg bL;
   private final bkj bM;
   private final cfv bN;

   private static <T extends bki> bkm<T> a(String $$0, bkm.a<T> $$1) {
      return io.a(jy.h, $$0, $$1.a($$0));
   }

   public static agg a(bkm<?> $$0) {
      return jy.h.b($$0);
   }

   public static Optional<bkm<?>> a(String $$0) {
      return jy.h.b(agg.a($$0));
   }

   public bkm(bkm.b<T> $$0, blb $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cut> $$6, bkj $$7, int $$8, int $$9, cfv $$10) {
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
   public T a(ama $$0, @Nullable clb $$1, @Nullable cdm $$2, ht $$3, blc $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      rz $$7;
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

   public static <T extends bki> Consumer<T> a(ama $$0, clb $$1, @Nullable cdm $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bki> Consumer<T> a(Consumer<T> $$0, ama $$1, clb $$2, @Nullable cdm $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bki> Consumer<T> a(Consumer<T> $$0, clb $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bki> Consumer<T> b(Consumer<T> $$0, ama $$1, clb $$2, @Nullable cdm $$3) {
      rz $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ama $$0, ht $$1, blc $$2) {
      return this.a($$0, (rz)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ama $$0, @Nullable rz $$1, @Nullable Consumer<T> $$2, ht $$3, blc $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(ama $$0, @Nullable rz $$1, @Nullable Consumer<T> $$2, ht $$3, blc $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((crs)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, ati.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bla $$10) {
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

   protected static double a(crv $$0, ht $$1, boolean $$2, ejd $$3) {
      ejd $$4 = new ejd($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ekb> $$5 = $$0.d(null, $$4);
      return 1.0 + ejy.a(hx.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(crs $$0, @Nullable cdm $$1, @Nullable bki $$2, @Nullable rz $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cM() || $$1 != null && $$4.ac().f($$1.fR())) {
               rz $$5 = $$2.f(new rz());
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

   public blb f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jy.h.b(this));
      }

      return this.bJ;
   }

   public ur h() {
      if (this.bK == null) {
         this.bK = ur.c(this.g());
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

   public agg j() {
      if (this.bL == null) {
         agg $$0 = jy.h.b(this);
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
   public cfv m() {
      return this.bN;
   }

   @Nullable
   public T a(crs $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bki> a(rz $$0, crs $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ejd a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ejd($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dgw $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && eda.a($$0) ? true : $$0.a(cuv.cd) || $$0.a(cuv.oi) || $$0.a(cuv.dQ) || $$0.a(cuv.qC);
      }
   }

   public bkj n() {
      return this.bM;
   }

   public static Optional<bkm<?>> a(rz $$0) {
      return jy.h.b(new agg($$0.l("id")));
   }

   @Nullable
   public static bki a(rz $$0, crs $$1, Function<bki, bki> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            sf $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bki $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bki)$$3;
      }).orElse(null);
   }

   public static Stream<bki> a(final List<? extends sw> $$0, final crs $$1) {
      final Spliterator<? extends sw> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bki>() {
         @Override
         public boolean tryAdvance(Consumer<? super bki> $$0x) {
            return $$2.tryAdvance($$2xx -> bkm.a((rz)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bki> trySplit() {
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

   private static Optional<bki> b(rz $$0, crs $$1) {
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

   public boolean a(arr<bkm<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(ig<bkm<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bki $$0) {
      return (T)($$0.ag() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bki> a() {
      return bki.class;
   }

   @Deprecated
   public ib.c<bkm<?>> r() {
      return this.bx;
   }

   public static class a<T extends bki> {
      private final bkm.b<T> a;
      private final blb b;
      private ImmutableSet<cut> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bkj j = bkj.b(0.6F, 1.8F);
      private cfv k = cfx.g;

      private a(bkm.b<T> $$0, blb $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == blb.b || $$1 == blb.h;
      }

      public static <T extends bki> bkm.a<T> a(bkm.b<T> $$0, blb $$1) {
         return new bkm.a<>($$0, $$1);
      }

      public static <T extends bki> bkm.a<T> a(blb $$0) {
         return new bkm.a<>(($$0x, $$1) -> null, $$0);
      }

      public bkm.a<T> a(float $$0, float $$1) {
         this.j = bkj.b($$0, $$1);
         return this;
      }

      public bkm.a<T> a() {
         this.e = false;
         return this;
      }

      public bkm.a<T> b() {
         this.d = false;
         return this;
      }

      public bkm.a<T> c() {
         this.f = true;
         return this;
      }

      public bkm.a<T> a(cut... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bkm.a<T> d() {
         this.g = true;
         return this;
      }

      public bkm.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bkm.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bkm.a<T> a(cft... $$0) {
         this.k = cfx.e.a($$0);
         return this;
      }

      public bkm<T> a(String $$0) {
         if (this.d) {
            ac.a(ban.w, $$0);
         }

         return new bkm<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bki> {
      T create(bkm<T> var1, crs var2);
   }
}
