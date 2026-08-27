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

public class bku<T extends bkq> implements cga, dlg<bkq, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ib.c<bku<?>> bx = jy.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bku<bxv> b = a("allay", bku.a.a(bxv::new, blj.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bku<bkn> c = a("area_effect_cloud", bku.a.<bkn>a(bkn::new, blj.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bku<cad> d = a("armor_stand", bku.a.<cad>a(cad::new, blj.h).a(0.5F, 1.975F).a(10));
   public static final bku<cec> e = a("arrow", bku.a.<cec>a(cec::new, blj.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bku<bxy> f = a("axolotl", bku.a.a(bxy::new, blj.d).a(0.75F, 0.42F).a(10));
   public static final bku<bwm> g = a("bat", bku.a.a(bwm::new, blj.c).a(0.5F, 0.9F).a(5));
   public static final bku<bws> h = a("bee", bku.a.a(bws::new, blj.b).a(0.7F, 0.6F).a(8));
   public static final bku<cas> i = a("blaze", bku.a.a(cas::new, blj.a).c().a(0.6F, 1.8F).a(8));
   public static final bku<bkp.b> j = a("block_display", bku.a.a(bkp.b::new, blj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bku<cfn> k = a("boat", bku.a.<cfn>a(cfn::new, blj.h).a(1.375F, 0.5625F).a(10));
   public static final bku<byd> l = a("camel", bku.a.a(byd::new, blj.b).a(1.7F, 2.375F).a(10));
   public static final bku<bwu> m = a("cat", bku.a.a(bwu::new, blj.b).a(0.6F, 0.7F).a(8));
   public static final bku<cat> n = a("cave_spider", bku.a.a(cat::new, blj.a).a(0.7F, 0.5F).a(8));
   public static final bku<cfo> o = a("chest_boat", bku.a.<cfo>a(cfo::new, blj.h).a(1.375F, 0.5625F).a(10));
   public static final bku<cfs> p = a("chest_minecart", bku.a.<cfs>a(cfs::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<bww> q = a("chicken", bku.a.a(bww::new, blj.b).a(0.4F, 0.7F).a(10));
   public static final bku<bwx> r = a("cod", bku.a.a(bwx::new, blj.g).a(0.5F, 0.3F).a(4));
   public static final bku<cft> s = a("command_block_minecart", bku.a.<cft>a(cft::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<bwy> t = a("cow", bku.a.a(bwy::new, blj.b).a(0.9F, 1.4F).a(10));
   public static final bku<cau> u = a("creeper", bku.a.a(cau::new, blj.a).a(0.6F, 1.7F).a(8));
   public static final bku<bwz> v = a("dolphin", bku.a.a(bwz::new, blj.f).a(0.9F, 0.6F));
   public static final bku<byr> w = a("donkey", bku.a.a(byr::new, blj.b).a(1.3964844F, 1.5F).a(10));
   public static final bku<ced> x = a("dragon_fireball", bku.a.<ced>a(ced::new, blj.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bku<caw> y = a("drowned", bku.a.a(caw::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<ceu> z = a("egg", bku.a.<ceu>a(ceu::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<cax> A = a("elder_guardian", bku.a.a(cax::new, blj.a).a(1.9975F, 1.9975F).a(10));
   public static final bku<bzg> B = a("end_crystal", bku.a.<bzg>a(bzg::new, blj.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bku<bzh> C = a("ender_dragon", bku.a.a(bzh::new, blj.a).c().a(16.0F, 8.0F).a(10));
   public static final bku<cev> D = a("ender_pearl", bku.a.<cev>a(cev::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<cay> E = a("enderman", bku.a.a(cay::new, blj.a).a(0.6F, 2.9F).a(8));
   public static final bku<caz> F = a("endermite", bku.a.a(caz::new, blj.a).a(0.4F, 0.3F).a(8));
   public static final bku<cbb> G = a("evoker", bku.a.a(cbb::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<cee> H = a("evoker_fangs", bku.a.<cee>a(cee::new, blj.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bku<cew> I = a("experience_bottle", bku.a.<cew>a(cew::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<bkw> J = a("experience_orb", bku.a.<bkw>a(bkw::new, blj.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bku<cef> K = a("eye_of_ender", bku.a.<cef>a(cef::new, blj.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bku<cam> L = a("falling_block", bku.a.<cam>a(cam::new, blj.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bku<ceh> M = a("firework_rocket", bku.a.<ceh>a(ceh::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<bxb> N = a("fox", bku.a.a(bxb::new, blj.b).a(0.6F, 0.7F).a(8).a(cvc.oi));
   public static final bku<byg> O = a("frog", bku.a.a(byg::new, blj.b).a(0.5F, 0.5F).a(10));
   public static final bku<cfu> P = a("furnace_minecart", bku.a.<cfu>a(cfu::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<cbc> Q = a("ghast", bku.a.a(cbc::new, blj.a).c().a(4.0F, 4.0F).a(10));
   public static final bku<cbd> R = a("giant", bku.a.a(cbd::new, blj.a).a(3.6F, 12.0F).a(10));
   public static final bku<cae> S = a("glow_item_frame", bku.a.<cae>a(cae::new, blj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bku<bky> T = a("glow_squid", bku.a.a(bky::new, blj.e).a(0.8F, 0.8F).a(10));
   public static final bku<bym> U = a("goat", bku.a.a(bym::new, blj.b).a(0.9F, 1.3F).a(10));
   public static final bku<cbe> V = a("guardian", bku.a.a(cbe::new, blj.a).a(0.85F, 0.85F).a(8));
   public static final bku<cce> W = a("hoglin", bku.a.a(cce::new, blj.a).a(1.3964844F, 1.4F).a(8));
   public static final bku<cfv> X = a("hopper_minecart", bku.a.<cfv>a(cfv::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<bys> Y = a("horse", bku.a.a(bys::new, blj.b).a(1.3964844F, 1.6F).a(10));
   public static final bku<cbf> Z = a("husk", bku.a.a(cbf::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<cbg> aa = a("illusioner", bku.a.a(cbg::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<blb> ab = a("interaction", bku.a.a(blb::new, blj.h).a(0.0F, 0.0F).a(10));
   public static final bku<bxd> ac = a("iron_golem", bku.a.a(bxd::new, blj.h).a(1.4F, 2.7F).a(10));
   public static final bku<can> ad = a("item", bku.a.<can>a(can::new, blj.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bku<bkp.g> ae = a("item_display", bku.a.a(bkp.g::new, blj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bku<cag> af = a("item_frame", bku.a.<cag>a(cag::new, blj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bku<cek> ag = a("fireball", bku.a.<cek>a(cek::new, blj.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bku<cah> ah = a("leash_knot", bku.a.<cah>a(cah::new, blj.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bku<blf> ai = a("lightning_bolt", bku.a.a(blf::new, blj.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bku<byt> aj = a("llama", bku.a.a(byt::new, blj.b).a(0.9F, 1.87F).a(10));
   public static final bku<cel> ak = a("llama_spit", bku.a.<cel>a(cel::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<cbh> al = a("magma_cube", bku.a.a(cbh::new, blj.a).c().a(2.04F, 2.04F).a(8));
   public static final bku<blh> am = a("marker", bku.a.a(blh::new, blj.h).a(0.0F, 0.0F).a(0));
   public static final bku<cfr> an = a("minecart", bku.a.<cfr>a(cfr::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<bxe> ao = a("mooshroom", bku.a.a(bxe::new, blj.b).a(0.9F, 1.4F).a(10));
   public static final bku<byv> ap = a("mule", bku.a.a(byv::new, blj.b).a(1.3964844F, 1.6F).a(8));
   public static final bku<bxf> aq = a("ocelot", bku.a.a(bxf::new, blj.b).a(0.6F, 0.7F).a(10));
   public static final bku<cai> ar = a("painting", bku.a.<cai>a(cai::new, blj.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bku<bxg> as = a("panda", bku.a.a(bxg::new, blj.b).a(1.3F, 1.25F).a(10));
   public static final bku<bxh> at = a("parrot", bku.a.a(bxh::new, blj.b).a(0.5F, 0.9F).a(8));
   public static final bku<cbk> au = a("phantom", bku.a.a(cbk::new, blj.a).a(0.9F, 0.5F).a(8));
   public static final bku<bxi> av = a("pig", bku.a.a(bxi::new, blj.b).a(0.9F, 0.9F).a(10));
   public static final bku<cck> aw = a("piglin", bku.a.a(cck::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<ccn> ax = a("piglin_brute", bku.a.a(ccn::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<cbl> ay = a("pillager", bku.a.a(cbl::new, blj.a).d().a(0.6F, 1.95F).a(8));
   public static final bku<bxj> az = a("polar_bear", bku.a.a(bxj::new, blj.b).a(cvc.qP).a(1.4F, 1.4F).a(10));
   public static final bku<cex> aA = a("potion", bku.a.<cex>a(cex::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<bxk> aB = a("pufferfish", bku.a.a(bxk::new, blj.g).a(0.7F, 0.7F).a(4));
   public static final bku<bxl> aC = a("rabbit", bku.a.a(bxl::new, blj.b).a(0.4F, 0.5F).a(8));
   public static final bku<cbn> aD = a("ravager", bku.a.a(cbn::new, blj.a).a(1.95F, 2.2F).a(10));
   public static final bku<bxm> aE = a("salmon", bku.a.a(bxm::new, blj.g).a(0.7F, 0.4F).a(4));
   public static final bku<bxn> aF = a("sheep", bku.a.a(bxn::new, blj.b).a(0.9F, 1.3F).a(10));
   public static final bku<cbo> aG = a("shulker", bku.a.a(cbo::new, blj.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bku<ceo> aH = a("shulker_bullet", bku.a.<ceo>a(ceo::new, blj.h).a(0.3125F, 0.3125F).a(8));
   public static final bku<cbp> aI = a("silverfish", bku.a.a(cbp::new, blj.a).a(0.4F, 0.3F).a(8));
   public static final bku<cbq> aJ = a("skeleton", bku.a.a(cbq::new, blj.a).a(0.6F, 1.99F).a(8));
   public static final bku<byw> aK = a("skeleton_horse", bku.a.a(byw::new, blj.b).a(1.3964844F, 1.6F).a(10));
   public static final bku<cbr> aL = a("slime", bku.a.a(cbr::new, blj.a).a(2.04F, 2.04F).a(10));
   public static final bku<cep> aM = a("small_fireball", bku.a.<cep>a(cep::new, blj.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bku<bzd> aN = a("sniffer", bku.a.a(bzd::new, blj.b).a(1.9F, 1.75F).a(10));
   public static final bku<bxp> aO = a("snow_golem", bku.a.a(bxp::new, blj.h).a(cvc.qP).a(0.7F, 1.9F).a(8));
   public static final bku<ceq> aP = a("snowball", bku.a.<ceq>a(ceq::new, blj.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bku<cfw> aQ = a("spawner_minecart", bku.a.<cfw>a(cfw::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<cer> aR = a("spectral_arrow", bku.a.<cer>a(cer::new, blj.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bku<cbt> aS = a("spider", bku.a.a(cbt::new, blj.a).a(1.4F, 0.9F).a(8));
   public static final bku<bxq> aT = a("squid", bku.a.a(bxq::new, blj.f).a(0.8F, 0.8F).a(8));
   public static final bku<cbu> aU = a("stray", bku.a.a(cbu::new, blj.a).a(0.6F, 1.99F).a(cvc.qP).a(8));
   public static final bku<cbv> aV = a("strider", bku.a.a(cbv::new, blj.b).c().a(0.9F, 1.7F).a(10));
   public static final bku<byj> aW = a("tadpole", bku.a.a(byj::new, blj.b).a(byj.c, byj.d).a(10));
   public static final bku<bkp.l> aX = a("text_display", bku.a.a(bkp.l::new, blj.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bku<cao> aY = a("tnt", bku.a.<cao>a(cao::new, blj.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bku<cfx> aZ = a("tnt_minecart", bku.a.<cfx>a(cfx::new, blj.h).a(0.98F, 0.7F).a(8));
   public static final bku<byy> ba = a("trader_llama", bku.a.a(byy::new, blj.b).a(0.9F, 1.87F).a(10));
   public static final bku<cey> bb = a("trident", bku.a.<cey>a(cey::new, blj.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bku<bxr> bc = a("tropical_fish", bku.a.a(bxr::new, blj.g).a(0.5F, 0.4F).a(4));
   public static final bku<bxs> bd = a("turtle", bku.a.a(bxs::new, blj.b).a(1.2F, 0.4F).a(10));
   public static final bku<cbw> be = a("vex", bku.a.a(cbw::new, blj.a).c().a(0.4F, 0.8F).a(8));
   public static final bku<cdh> bf = a("villager", bku.a.<cdh>a(cdh::new, blj.h).a(0.6F, 1.95F).a(10));
   public static final bku<cbx> bg = a("vindicator", bku.a.a(cbx::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<cdn> bh = a("wandering_trader", bku.a.a(cdn::new, blj.b).a(0.6F, 1.95F).a(10));
   public static final bku<ccy> bi = a("warden", bku.a.a(ccy::new, blj.a).a(0.9F, 2.9F).a(16).c());
   public static final bku<cby> bj = a("witch", bku.a.a(cby::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<cab> bk = a("wither", bku.a.a(cab::new, blj.a).c().a(cvc.cd).a(0.9F, 3.5F).a(10));
   public static final bku<cbz> bl = a("wither_skeleton", bku.a.a(cbz::new, blj.a).c().a(cvc.cd).a(0.7F, 2.4F).a(8));
   public static final bku<cez> bm = a("wither_skull", bku.a.<cez>a(cez::new, blj.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bku<bxu> bn = a("wolf", bku.a.a(bxu::new, blj.b).a(0.6F, 0.85F).a(10));
   public static final bku<cca> bo = a("zoglin", bku.a.a(cca::new, blj.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bku<ccb> bp = a("zombie", bku.a.<ccb>a(ccb::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<bza> bq = a("zombie_horse", bku.a.a(bza::new, blj.b).a(1.3964844F, 1.6F).a(10));
   public static final bku<ccc> br = a("zombie_villager", bku.a.a(ccc::new, blj.a).a(0.6F, 1.95F).a(8));
   public static final bku<ccd> bs = a("zombified_piglin", bku.a.a(ccd::new, blj.a).c().a(0.6F, 1.95F).a(8));
   public static final bku<cdu> bt = a("player", bku.a.<cdu>a(blj.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bku<cei> bu = a("fishing_bobber", bku.a.<cei>a(cei::new, blj.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bku.b<T> bA;
   private final blj bB;
   private final ImmutableSet<cva> bC;
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
   private agi bL;
   private final bkr bM;
   private final cgd bN;

   private static <T extends bkq> bku<T> a(String $$0, bku.a<T> $$1) {
      return io.a(jy.h, $$0, $$1.a($$0));
   }

   public static agi a(bku<?> $$0) {
      return jy.h.b($$0);
   }

   public static Optional<bku<?>> a(String $$0) {
      return jy.h.b(agi.a($$0));
   }

   public bku(bku.b<T> $$0, blj $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cva> $$6, bkr $$7, int $$8, int $$9, cgd $$10) {
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
   public T a(ame $$0, @Nullable clj $$1, @Nullable cdu $$2, ht $$3, blk $$4, boolean $$5, boolean $$6) {
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

   public static <T extends bkq> Consumer<T> a(ame $$0, clj $$1, @Nullable cdu $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bkq> Consumer<T> a(Consumer<T> $$0, ame $$1, clj $$2, @Nullable cdu $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bkq> Consumer<T> a(Consumer<T> $$0, clj $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bkq> Consumer<T> b(Consumer<T> $$0, ame $$1, clj $$2, @Nullable cdu $$3) {
      rz $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ame $$0, ht $$1, blk $$2) {
      return this.a($$0, (rz)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ame $$0, @Nullable rz $$1, @Nullable Consumer<T> $$2, ht $$3, blk $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(ame $$0, @Nullable rz $$1, @Nullable Consumer<T> $$2, ht $$3, blk $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((csa)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, atm.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bli $$10) {
            $$10.aW = $$10.dD();
            $$10.aU = $$10.dD();
            $$10.a($$0, $$0.d_($$10.dn()), $$4, null, $$1);
            $$10.R();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(csd $$0, ht $$1, boolean $$2, ejp $$3) {
      ejp $$4 = new ejp($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ekn> $$5 = $$0.d(null, $$4);
      return 1.0 + ekk.a(hx.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(csa $$0, @Nullable cdu $$1, @Nullable bkq $$2, @Nullable rz $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cN() || $$1 != null && $$4.ae().f($$1.fS())) {
               rz $$5 = $$2.f(new rz());
               UUID $$6 = $$2.cw();
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

   public blj f() {
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

   public agi j() {
      if (this.bL == null) {
         agi $$0 = jy.h.b(this);
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
   public cgd m() {
      return this.bN;
   }

   @Nullable
   public T a(csa $$0) {
      return !this.a($$0.H()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bkq> a(rz $$0, csa $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ejp a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new ejp($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dhi $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && edm.a($$0) ? true : $$0.a(cvc.cd) || $$0.a(cvc.oi) || $$0.a(cvc.dQ) || $$0.a(cvc.qP);
      }
   }

   public bkr n() {
      return this.bM;
   }

   public static Optional<bku<?>> a(rz $$0) {
      return jy.h.b(new agi($$0.l("id")));
   }

   @Nullable
   public static bkq a(rz $$0, csa $$1, Function<bkq, bkq> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            sf $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bkq $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bkq)$$3;
      }).orElse(null);
   }

   public static Stream<bkq> a(final List<? extends sw> $$0, final csa $$1) {
      final Spliterator<? extends sw> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bkq>() {
         @Override
         public boolean tryAdvance(Consumer<? super bkq> $$0x) {
            return $$2.tryAdvance($$2xx -> bku.a((rz)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bkq> trySplit() {
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

   private static Optional<bkq> b(rz $$0, csa $$1) {
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

   public boolean a(arv<bku<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(ig<bku<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bkq $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bkq> a() {
      return bkq.class;
   }

   @Deprecated
   public ib.c<bku<?>> r() {
      return this.bx;
   }

   public static class a<T extends bkq> {
      private final bku.b<T> a;
      private final blj b;
      private ImmutableSet<cva> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bkr j = bkr.b(0.6F, 1.8F);
      private cgd k = cgf.g;

      private a(bku.b<T> $$0, blj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == blj.b || $$1 == blj.h;
      }

      public static <T extends bkq> bku.a<T> a(bku.b<T> $$0, blj $$1) {
         return new bku.a<>($$0, $$1);
      }

      public static <T extends bkq> bku.a<T> a(blj $$0) {
         return new bku.a<>(($$0x, $$1) -> null, $$0);
      }

      public bku.a<T> a(float $$0, float $$1) {
         this.j = bkr.b($$0, $$1);
         return this;
      }

      public bku.a<T> a() {
         this.e = false;
         return this;
      }

      public bku.a<T> b() {
         this.d = false;
         return this;
      }

      public bku.a<T> c() {
         this.f = true;
         return this;
      }

      public bku.a<T> a(cva... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bku.a<T> d() {
         this.g = true;
         return this;
      }

      public bku.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bku.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bku.a<T> a(cgb... $$0) {
         this.k = cgf.e.a($$0);
         return this;
      }

      public bku<T> a(String $$0) {
         if (this.d) {
            ac.a(bat.w, $$0);
         }

         return new bku<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bkq> {
      T create(bku<T> var1, csa var2);
   }
}
