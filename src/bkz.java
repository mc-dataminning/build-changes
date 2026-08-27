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

public class bkz<T extends bkv> implements cgf, dll<bkv, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final ig.c<bkz<?>> bx = kc.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bkz<bya> b = a("allay", bkz.a.a(bya::new, blo.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bkz<bks> c = a("area_effect_cloud", bkz.a.<bks>a(bks::new, blo.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkz<cai> d = a("armor_stand", bkz.a.<cai>a(cai::new, blo.h).a(0.5F, 1.975F).a(10));
   public static final bkz<ceh> e = a("arrow", bkz.a.<ceh>a(ceh::new, blo.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bkz<byd> f = a("axolotl", bkz.a.a(byd::new, blo.d).a(0.75F, 0.42F).a(10));
   public static final bkz<bwr> g = a("bat", bkz.a.a(bwr::new, blo.c).a(0.5F, 0.9F).a(5));
   public static final bkz<bwx> h = a("bee", bkz.a.a(bwx::new, blo.b).a(0.7F, 0.6F).a(8));
   public static final bkz<cax> i = a("blaze", bkz.a.a(cax::new, blo.a).c().a(0.6F, 1.8F).a(8));
   public static final bkz<bku.b> j = a("block_display", bkz.a.a(bku.b::new, blo.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bkz<cfs> k = a("boat", bkz.a.<cfs>a(cfs::new, blo.h).a(1.375F, 0.5625F).a(10));
   public static final bkz<byi> l = a("camel", bkz.a.a(byi::new, blo.b).a(1.7F, 2.375F).a(10));
   public static final bkz<bwz> m = a("cat", bkz.a.a(bwz::new, blo.b).a(0.6F, 0.7F).a(8));
   public static final bkz<cay> n = a("cave_spider", bkz.a.a(cay::new, blo.a).a(0.7F, 0.5F).a(8));
   public static final bkz<cft> o = a("chest_boat", bkz.a.<cft>a(cft::new, blo.h).a(1.375F, 0.5625F).a(10));
   public static final bkz<cfx> p = a("chest_minecart", bkz.a.<cfx>a(cfx::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<bxb> q = a("chicken", bkz.a.a(bxb::new, blo.b).a(0.4F, 0.7F).a(10));
   public static final bkz<bxc> r = a("cod", bkz.a.a(bxc::new, blo.g).a(0.5F, 0.3F).a(4));
   public static final bkz<cfy> s = a("command_block_minecart", bkz.a.<cfy>a(cfy::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<bxd> t = a("cow", bkz.a.a(bxd::new, blo.b).a(0.9F, 1.4F).a(10));
   public static final bkz<caz> u = a("creeper", bkz.a.a(caz::new, blo.a).a(0.6F, 1.7F).a(8));
   public static final bkz<bxe> v = a("dolphin", bkz.a.a(bxe::new, blo.f).a(0.9F, 0.6F));
   public static final bkz<byw> w = a("donkey", bkz.a.a(byw::new, blo.b).a(1.3964844F, 1.5F).a(10));
   public static final bkz<cei> x = a("dragon_fireball", bkz.a.<cei>a(cei::new, blo.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bkz<cbb> y = a("drowned", bkz.a.a(cbb::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cez> z = a("egg", bkz.a.<cez>a(cez::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<cbc> A = a("elder_guardian", bkz.a.a(cbc::new, blo.a).a(1.9975F, 1.9975F).a(10));
   public static final bkz<bzl> B = a("end_crystal", bkz.a.<bzl>a(bzl::new, blo.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bkz<bzm> C = a("ender_dragon", bkz.a.a(bzm::new, blo.a).c().a(16.0F, 8.0F).a(10));
   public static final bkz<cfa> D = a("ender_pearl", bkz.a.<cfa>a(cfa::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<cbd> E = a("enderman", bkz.a.a(cbd::new, blo.a).a(0.6F, 2.9F).a(8));
   public static final bkz<cbe> F = a("endermite", bkz.a.a(cbe::new, blo.a).a(0.4F, 0.3F).a(8));
   public static final bkz<cbg> G = a("evoker", bkz.a.a(cbg::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cej> H = a("evoker_fangs", bkz.a.<cej>a(cej::new, blo.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bkz<cfb> I = a("experience_bottle", bkz.a.<cfb>a(cfb::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<blb> J = a("experience_orb", bkz.a.<blb>a(blb::new, blo.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bkz<cek> K = a("eye_of_ender", bkz.a.<cek>a(cek::new, blo.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bkz<car> L = a("falling_block", bkz.a.<car>a(car::new, blo.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bkz<cem> M = a("firework_rocket", bkz.a.<cem>a(cem::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<bxg> N = a("fox", bkz.a.a(bxg::new, blo.b).a(0.6F, 0.7F).a(8).a(cvh.oi));
   public static final bkz<byl> O = a("frog", bkz.a.a(byl::new, blo.b).a(0.5F, 0.5F).a(10));
   public static final bkz<cfz> P = a("furnace_minecart", bkz.a.<cfz>a(cfz::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<cbh> Q = a("ghast", bkz.a.a(cbh::new, blo.a).c().a(4.0F, 4.0F).a(10));
   public static final bkz<cbi> R = a("giant", bkz.a.a(cbi::new, blo.a).a(3.6F, 12.0F).a(10));
   public static final bkz<caj> S = a("glow_item_frame", bkz.a.<caj>a(caj::new, blo.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkz<bld> T = a("glow_squid", bkz.a.a(bld::new, blo.e).a(0.8F, 0.8F).a(10));
   public static final bkz<byr> U = a("goat", bkz.a.a(byr::new, blo.b).a(0.9F, 1.3F).a(10));
   public static final bkz<cbj> V = a("guardian", bkz.a.a(cbj::new, blo.a).a(0.85F, 0.85F).a(8));
   public static final bkz<ccj> W = a("hoglin", bkz.a.a(ccj::new, blo.a).a(1.3964844F, 1.4F).a(8));
   public static final bkz<cga> X = a("hopper_minecart", bkz.a.<cga>a(cga::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<byx> Y = a("horse", bkz.a.a(byx::new, blo.b).a(1.3964844F, 1.6F).a(10));
   public static final bkz<cbk> Z = a("husk", bkz.a.a(cbk::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cbl> aa = a("illusioner", bkz.a.a(cbl::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<blg> ab = a("interaction", bkz.a.a(blg::new, blo.h).a(0.0F, 0.0F).a(10));
   public static final bkz<bxi> ac = a("iron_golem", bkz.a.a(bxi::new, blo.h).a(1.4F, 2.7F).a(10));
   public static final bkz<cas> ad = a("item", bkz.a.<cas>a(cas::new, blo.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bkz<bku.g> ae = a("item_display", bkz.a.a(bku.g::new, blo.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bkz<cal> af = a("item_frame", bkz.a.<cal>a(cal::new, blo.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkz<cep> ag = a("fireball", bkz.a.<cep>a(cep::new, blo.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bkz<cam> ah = a("leash_knot", bkz.a.<cam>a(cam::new, blo.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkz<blk> ai = a("lightning_bolt", bkz.a.a(blk::new, blo.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bkz<byy> aj = a("llama", bkz.a.a(byy::new, blo.b).a(0.9F, 1.87F).a(10));
   public static final bkz<ceq> ak = a("llama_spit", bkz.a.<ceq>a(ceq::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<cbm> al = a("magma_cube", bkz.a.a(cbm::new, blo.a).c().a(2.04F, 2.04F).a(8));
   public static final bkz<blm> am = a("marker", bkz.a.a(blm::new, blo.h).a(0.0F, 0.0F).a(0));
   public static final bkz<cfw> an = a("minecart", bkz.a.<cfw>a(cfw::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<bxj> ao = a("mooshroom", bkz.a.a(bxj::new, blo.b).a(0.9F, 1.4F).a(10));
   public static final bkz<bza> ap = a("mule", bkz.a.a(bza::new, blo.b).a(1.3964844F, 1.6F).a(8));
   public static final bkz<bxk> aq = a("ocelot", bkz.a.a(bxk::new, blo.b).a(0.6F, 0.7F).a(10));
   public static final bkz<can> ar = a("painting", bkz.a.<can>a(can::new, blo.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bkz<bxl> as = a("panda", bkz.a.a(bxl::new, blo.b).a(1.3F, 1.25F).a(10));
   public static final bkz<bxm> at = a("parrot", bkz.a.a(bxm::new, blo.b).a(0.5F, 0.9F).a(8));
   public static final bkz<cbp> au = a("phantom", bkz.a.a(cbp::new, blo.a).a(0.9F, 0.5F).a(8));
   public static final bkz<bxn> av = a("pig", bkz.a.a(bxn::new, blo.b).a(0.9F, 0.9F).a(10));
   public static final bkz<ccp> aw = a("piglin", bkz.a.a(ccp::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<ccs> ax = a("piglin_brute", bkz.a.a(ccs::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cbq> ay = a("pillager", bkz.a.a(cbq::new, blo.a).d().a(0.6F, 1.95F).a(8));
   public static final bkz<bxo> az = a("polar_bear", bkz.a.a(bxo::new, blo.b).a(cvh.qP).a(1.4F, 1.4F).a(10));
   public static final bkz<cfc> aA = a("potion", bkz.a.<cfc>a(cfc::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<bxp> aB = a("pufferfish", bkz.a.a(bxp::new, blo.g).a(0.7F, 0.7F).a(4));
   public static final bkz<bxq> aC = a("rabbit", bkz.a.a(bxq::new, blo.b).a(0.4F, 0.5F).a(8));
   public static final bkz<cbs> aD = a("ravager", bkz.a.a(cbs::new, blo.a).a(1.95F, 2.2F).a(10));
   public static final bkz<bxr> aE = a("salmon", bkz.a.a(bxr::new, blo.g).a(0.7F, 0.4F).a(4));
   public static final bkz<bxs> aF = a("sheep", bkz.a.a(bxs::new, blo.b).a(0.9F, 1.3F).a(10));
   public static final bkz<cbt> aG = a("shulker", bkz.a.a(cbt::new, blo.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bkz<cet> aH = a("shulker_bullet", bkz.a.<cet>a(cet::new, blo.h).a(0.3125F, 0.3125F).a(8));
   public static final bkz<cbu> aI = a("silverfish", bkz.a.a(cbu::new, blo.a).a(0.4F, 0.3F).a(8));
   public static final bkz<cbv> aJ = a("skeleton", bkz.a.a(cbv::new, blo.a).a(0.6F, 1.99F).a(8));
   public static final bkz<bzb> aK = a("skeleton_horse", bkz.a.a(bzb::new, blo.b).a(1.3964844F, 1.6F).a(10));
   public static final bkz<cbw> aL = a("slime", bkz.a.a(cbw::new, blo.a).a(2.04F, 2.04F).a(10));
   public static final bkz<ceu> aM = a("small_fireball", bkz.a.<ceu>a(ceu::new, blo.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bkz<bzi> aN = a("sniffer", bkz.a.a(bzi::new, blo.b).a(1.9F, 1.75F).a(10));
   public static final bkz<bxu> aO = a("snow_golem", bkz.a.a(bxu::new, blo.h).a(cvh.qP).a(0.7F, 1.9F).a(8));
   public static final bkz<cev> aP = a("snowball", bkz.a.<cev>a(cev::new, blo.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bkz<cgb> aQ = a("spawner_minecart", bkz.a.<cgb>a(cgb::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<cew> aR = a("spectral_arrow", bkz.a.<cew>a(cew::new, blo.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bkz<cby> aS = a("spider", bkz.a.a(cby::new, blo.a).a(1.4F, 0.9F).a(8));
   public static final bkz<bxv> aT = a("squid", bkz.a.a(bxv::new, blo.f).a(0.8F, 0.8F).a(8));
   public static final bkz<cbz> aU = a("stray", bkz.a.a(cbz::new, blo.a).a(0.6F, 1.99F).a(cvh.qP).a(8));
   public static final bkz<cca> aV = a("strider", bkz.a.a(cca::new, blo.b).c().a(0.9F, 1.7F).a(10));
   public static final bkz<byo> aW = a("tadpole", bkz.a.a(byo::new, blo.b).a(byo.c, byo.d).a(10));
   public static final bkz<bku.l> aX = a("text_display", bkz.a.a(bku.l::new, blo.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bkz<cat> aY = a("tnt", bkz.a.<cat>a(cat::new, blo.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bkz<cgc> aZ = a("tnt_minecart", bkz.a.<cgc>a(cgc::new, blo.h).a(0.98F, 0.7F).a(8));
   public static final bkz<bzd> ba = a("trader_llama", bkz.a.a(bzd::new, blo.b).a(0.9F, 1.87F).a(10));
   public static final bkz<cfd> bb = a("trident", bkz.a.<cfd>a(cfd::new, blo.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bkz<bxw> bc = a("tropical_fish", bkz.a.a(bxw::new, blo.g).a(0.5F, 0.4F).a(4));
   public static final bkz<bxx> bd = a("turtle", bkz.a.a(bxx::new, blo.b).a(1.2F, 0.4F).a(10));
   public static final bkz<ccb> be = a("vex", bkz.a.a(ccb::new, blo.a).c().a(0.4F, 0.8F).a(8));
   public static final bkz<cdm> bf = a("villager", bkz.a.<cdm>a(cdm::new, blo.h).a(0.6F, 1.95F).a(10));
   public static final bkz<ccc> bg = a("vindicator", bkz.a.a(ccc::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cds> bh = a("wandering_trader", bkz.a.a(cds::new, blo.b).a(0.6F, 1.95F).a(10));
   public static final bkz<cdd> bi = a("warden", bkz.a.a(cdd::new, blo.a).a(0.9F, 2.9F).a(16).c());
   public static final bkz<ccd> bj = a("witch", bkz.a.a(ccd::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cag> bk = a("wither", bkz.a.a(cag::new, blo.a).c().a(cvh.cd).a(0.9F, 3.5F).a(10));
   public static final bkz<cce> bl = a("wither_skeleton", bkz.a.a(cce::new, blo.a).c().a(cvh.cd).a(0.7F, 2.4F).a(8));
   public static final bkz<cfe> bm = a("wither_skull", bkz.a.<cfe>a(cfe::new, blo.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bkz<bxz> bn = a("wolf", bkz.a.a(bxz::new, blo.b).a(0.6F, 0.85F).a(10));
   public static final bkz<ccf> bo = a("zoglin", bkz.a.a(ccf::new, blo.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bkz<ccg> bp = a("zombie", bkz.a.<ccg>a(ccg::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<bzf> bq = a("zombie_horse", bkz.a.a(bzf::new, blo.b).a(1.3964844F, 1.6F).a(10));
   public static final bkz<cch> br = a("zombie_villager", bkz.a.a(cch::new, blo.a).a(0.6F, 1.95F).a(8));
   public static final bkz<cci> bs = a("zombified_piglin", bkz.a.a(cci::new, blo.a).c().a(0.6F, 1.95F).a(8));
   public static final bkz<cdz> bt = a("player", bkz.a.<cdz>a(blo.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bkz<cen> bu = a("fishing_bobber", bkz.a.<cen>a(cen::new, blo.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bkz.b<T> bA;
   private final blo bB;
   private final ImmutableSet<cvf> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private uv bK;
   @Nullable
   private agm bL;
   private final bkw bM;
   private final cgi bN;

   private static <T extends bkv> bkz<T> a(String $$0, bkz.a<T> $$1) {
      return is.a(kc.h, $$0, $$1.a($$0));
   }

   public static agm a(bkz<?> $$0) {
      return kc.h.b($$0);
   }

   public static Optional<bkz<?>> a(String $$0) {
      return kc.h.b(agm.a($$0));
   }

   public bkz(bkz.b<T> $$0, blo $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cvf> $$6, bkw $$7, int $$8, int $$9, cgi $$10) {
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
   public T a(ami $$0, @Nullable clo $$1, @Nullable cdz $$2, hx $$3, blp $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      sd $$7;
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

   public static <T extends bkv> Consumer<T> a(ami $$0, clo $$1, @Nullable cdz $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bkv> Consumer<T> a(Consumer<T> $$0, ami $$1, clo $$2, @Nullable cdz $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bkv> Consumer<T> a(Consumer<T> $$0, clo $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bkv> Consumer<T> b(Consumer<T> $$0, ami $$1, clo $$2, @Nullable cdz $$3) {
      sd $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(ami $$0, hx $$1, blp $$2) {
      return this.a($$0, (sd)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(ami $$0, @Nullable sd $$1, @Nullable Consumer<T> $$2, hx $$3, blp $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(ami $$0, @Nullable sd $$1, @Nullable Consumer<T> $$2, hx $$3, blp $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((csf)$$0);
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

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, atq.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bln $$10) {
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

   protected static double a(csi $$0, hx $$1, boolean $$2, eju $$3) {
      eju $$4 = new eju($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<eks> $$5 = $$0.d(null, $$4);
      return 1.0 + ekp.a(ib.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(csf $$0, @Nullable cdz $$1, @Nullable bkv $$2, @Nullable sd $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cN() || $$1 != null && $$4.ae().f($$1.fS())) {
               sd $$5 = $$2.f(new sd());
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

   public blo f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", kc.h.b(this));
      }

      return this.bJ;
   }

   public uv h() {
      if (this.bK == null) {
         this.bK = uv.c(this.g());
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

   public agm j() {
      if (this.bL == null) {
         agm $$0 = kc.h.b(this);
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
   public cgi m() {
      return this.bN;
   }

   @Nullable
   public T a(csf $$0) {
      return !this.a($$0.H()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bkv> a(sd $$0, csf $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eju a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eju($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dhn $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && edr.a($$0) ? true : $$0.a(cvh.cd) || $$0.a(cvh.oi) || $$0.a(cvh.dQ) || $$0.a(cvh.qP);
      }
   }

   public bkw n() {
      return this.bM;
   }

   public static Optional<bkz<?>> a(sd $$0) {
      return kc.h.b(new agm($$0.l("id")));
   }

   @Nullable
   public static bkv a(sd $$0, csf $$1, Function<bkv, bkv> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            sj $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bkv $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bkv)$$3;
      }).orElse(null);
   }

   public static Stream<bkv> a(final List<? extends ta> $$0, final csf $$1) {
      final Spliterator<? extends ta> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bkv>() {
         @Override
         public boolean tryAdvance(Consumer<? super bkv> $$0x) {
            return $$2.tryAdvance($$2xx -> bkz.a((sd)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bkv> trySplit() {
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

   private static Optional<bkv> b(sd $$0, csf $$1) {
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

   public boolean a(arz<bkz<?>> $$0) {
      return this.bx.a($$0);
   }

   public boolean a(ik<bkz<?>> $$0) {
      return $$0.a(this.bx);
   }

   @Nullable
   public T a(bkv $$0) {
      return (T)($$0.ai() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bkv> a() {
      return bkv.class;
   }

   @Deprecated
   public ig.c<bkz<?>> r() {
      return this.bx;
   }

   public static class a<T extends bkv> {
      private final bkz.b<T> a;
      private final blo b;
      private ImmutableSet<cvf> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bkw j = bkw.b(0.6F, 1.8F);
      private cgi k = cgk.g;

      private a(bkz.b<T> $$0, blo $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == blo.b || $$1 == blo.h;
      }

      public static <T extends bkv> bkz.a<T> a(bkz.b<T> $$0, blo $$1) {
         return new bkz.a<>($$0, $$1);
      }

      public static <T extends bkv> bkz.a<T> a(blo $$0) {
         return new bkz.a<>(($$0x, $$1) -> null, $$0);
      }

      public bkz.a<T> a(float $$0, float $$1) {
         this.j = bkw.b($$0, $$1);
         return this;
      }

      public bkz.a<T> a() {
         this.e = false;
         return this;
      }

      public bkz.a<T> b() {
         this.d = false;
         return this;
      }

      public bkz.a<T> c() {
         this.f = true;
         return this;
      }

      public bkz.a<T> a(cvf... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bkz.a<T> d() {
         this.g = true;
         return this;
      }

      public bkz.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bkz.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bkz.a<T> a(cgg... $$0) {
         this.k = cgk.e.a($$0);
         return this;
      }

      public bkz<T> a(String $$0) {
         if (this.d) {
            ac.a(bax.w, $$0);
         }

         return new bkz<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bkv> {
      T create(bkz<T> var1, csf var2);
   }
}
