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

public class bfn<T extends bfj> implements cat, dfz<bfj, T> {
   private static final Logger bw = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final he.c<bfn<?>> bx = jb.h.f(this);
   private static final float by = 1.3964844F;
   private static final int bz = 10;
   public static final bfn<bsp> b = a("allay", bfn.a.a(bsp::new, bgc.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bfn<bfg> c = a("area_effect_cloud", bfn.a.<bfg>a(bfg::new, bgc.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bfn<bux> d = a("armor_stand", bfn.a.<bux>a(bux::new, bgc.h).a(0.5F, 1.975F).a(10));
   public static final bfn<byw> e = a("arrow", bfn.a.<byw>a(byw::new, bgc.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bfn<bss> f = a("axolotl", bfn.a.a(bss::new, bgc.d).a(0.75F, 0.42F).a(10));
   public static final bfn<brg> g = a("bat", bfn.a.a(brg::new, bgc.c).a(0.5F, 0.9F).a(5));
   public static final bfn<brm> h = a("bee", bfn.a.a(brm::new, bgc.b).a(0.7F, 0.6F).a(8));
   public static final bfn<bvm> i = a("blaze", bfn.a.a(bvm::new, bgc.a).c().a(0.6F, 1.8F).a(8));
   public static final bfn<bfi.b> j = a("block_display", bfn.a.a(bfi.b::new, bgc.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bfn<cah> k = a("boat", bfn.a.<cah>a(cah::new, bgc.h).a(1.375F, 0.5625F).a(10));
   public static final bfn<bsx> l = a("camel", bfn.a.a(bsx::new, bgc.b).a(1.7F, 2.375F).a(10));
   public static final bfn<bro> m = a("cat", bfn.a.a(bro::new, bgc.b).a(0.6F, 0.7F).a(8));
   public static final bfn<bvn> n = a("cave_spider", bfn.a.a(bvn::new, bgc.a).a(0.7F, 0.5F).a(8));
   public static final bfn<cai> o = a("chest_boat", bfn.a.<cai>a(cai::new, bgc.h).a(1.375F, 0.5625F).a(10));
   public static final bfn<cam> p = a("chest_minecart", bfn.a.<cam>a(cam::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<brq> q = a("chicken", bfn.a.a(brq::new, bgc.b).a(0.4F, 0.7F).a(10));
   public static final bfn<brr> r = a("cod", bfn.a.a(brr::new, bgc.g).a(0.5F, 0.3F).a(4));
   public static final bfn<can> s = a("command_block_minecart", bfn.a.<can>a(can::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<brs> t = a("cow", bfn.a.a(brs::new, bgc.b).a(0.9F, 1.4F).a(10));
   public static final bfn<bvo> u = a("creeper", bfn.a.a(bvo::new, bgc.a).a(0.6F, 1.7F).a(8));
   public static final bfn<brt> v = a("dolphin", bfn.a.a(brt::new, bgc.f).a(0.9F, 0.6F));
   public static final bfn<btl> w = a("donkey", bfn.a.a(btl::new, bgc.b).a(1.3964844F, 1.5F).a(10));
   public static final bfn<byx> x = a("dragon_fireball", bfn.a.<byx>a(byx::new, bgc.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bfn<bvq> y = a("drowned", bfn.a.a(bvq::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<bzo> z = a("egg", bfn.a.<bzo>a(bzo::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<bvr> A = a("elder_guardian", bfn.a.a(bvr::new, bgc.a).a(1.9975F, 1.9975F).a(10));
   public static final bfn<bua> B = a("end_crystal", bfn.a.<bua>a(bua::new, bgc.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bfn<bub> C = a("ender_dragon", bfn.a.a(bub::new, bgc.a).c().a(16.0F, 8.0F).a(10));
   public static final bfn<bzp> D = a("ender_pearl", bfn.a.<bzp>a(bzp::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<bvs> E = a("enderman", bfn.a.a(bvs::new, bgc.a).a(0.6F, 2.9F).a(8));
   public static final bfn<bvt> F = a("endermite", bfn.a.a(bvt::new, bgc.a).a(0.4F, 0.3F).a(8));
   public static final bfn<bvv> G = a("evoker", bfn.a.a(bvv::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<byy> H = a("evoker_fangs", bfn.a.<byy>a(byy::new, bgc.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bfn<bzq> I = a("experience_bottle", bfn.a.<bzq>a(bzq::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<bfp> J = a("experience_orb", bfn.a.<bfp>a(bfp::new, bgc.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bfn<byz> K = a("eye_of_ender", bfn.a.<byz>a(byz::new, bgc.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bfn<bvg> L = a("falling_block", bfn.a.<bvg>a(bvg::new, bgc.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bfn<bzb> M = a("firework_rocket", bfn.a.<bzb>a(bzb::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<brv> N = a("fox", bfn.a.a(brv::new, bgc.b).a(0.6F, 0.7F).a(8).a(cpo.oi));
   public static final bfn<bta> O = a("frog", bfn.a.a(bta::new, bgc.b).a(0.5F, 0.5F).a(10));
   public static final bfn<cao> P = a("furnace_minecart", bfn.a.<cao>a(cao::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<bvw> Q = a("ghast", bfn.a.a(bvw::new, bgc.a).c().a(4.0F, 4.0F).a(10));
   public static final bfn<bvx> R = a("giant", bfn.a.a(bvx::new, bgc.a).a(3.6F, 12.0F).a(10));
   public static final bfn<buy> S = a("glow_item_frame", bfn.a.<buy>a(buy::new, bgc.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bfn<bfr> T = a("glow_squid", bfn.a.a(bfr::new, bgc.e).a(0.8F, 0.8F).a(10));
   public static final bfn<btg> U = a("goat", bfn.a.a(btg::new, bgc.b).a(0.9F, 1.3F).a(10));
   public static final bfn<bvy> V = a("guardian", bfn.a.a(bvy::new, bgc.a).a(0.85F, 0.85F).a(8));
   public static final bfn<bwy> W = a("hoglin", bfn.a.a(bwy::new, bgc.a).a(1.3964844F, 1.4F).a(8));
   public static final bfn<cap> X = a("hopper_minecart", bfn.a.<cap>a(cap::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<btm> Y = a("horse", bfn.a.a(btm::new, bgc.b).a(1.3964844F, 1.6F).a(10));
   public static final bfn<bvz> Z = a("husk", bfn.a.a(bvz::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<bwa> aa = a("illusioner", bfn.a.a(bwa::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<bfu> ab = a("interaction", bfn.a.a(bfu::new, bgc.h).a(0.0F, 0.0F).a(10));
   public static final bfn<brx> ac = a("iron_golem", bfn.a.a(brx::new, bgc.h).a(1.4F, 2.7F).a(10));
   public static final bfn<bvh> ad = a("item", bfn.a.<bvh>a(bvh::new, bgc.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bfn<bfi.g> ae = a("item_display", bfn.a.a(bfi.g::new, bgc.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bfn<bva> af = a("item_frame", bfn.a.<bva>a(bva::new, bgc.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bfn<bze> ag = a("fireball", bfn.a.<bze>a(bze::new, bgc.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bfn<bvb> ah = a("leash_knot", bfn.a.<bvb>a(bvb::new, bgc.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bfn<bfy> ai = a("lightning_bolt", bfn.a.a(bfy::new, bgc.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bfn<btn> aj = a("llama", bfn.a.a(btn::new, bgc.b).a(0.9F, 1.87F).a(10));
   public static final bfn<bzf> ak = a("llama_spit", bfn.a.<bzf>a(bzf::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<bwb> al = a("magma_cube", bfn.a.a(bwb::new, bgc.a).c().a(2.04F, 2.04F).a(8));
   public static final bfn<bga> am = a("marker", bfn.a.a(bga::new, bgc.h).a(0.0F, 0.0F).a(0));
   public static final bfn<cal> an = a("minecart", bfn.a.<cal>a(cal::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<bry> ao = a("mooshroom", bfn.a.a(bry::new, bgc.b).a(0.9F, 1.4F).a(10));
   public static final bfn<btp> ap = a("mule", bfn.a.a(btp::new, bgc.b).a(1.3964844F, 1.6F).a(8));
   public static final bfn<brz> aq = a("ocelot", bfn.a.a(brz::new, bgc.b).a(0.6F, 0.7F).a(10));
   public static final bfn<bvc> ar = a("painting", bfn.a.<bvc>a(bvc::new, bgc.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bfn<bsa> as = a("panda", bfn.a.a(bsa::new, bgc.b).a(1.3F, 1.25F).a(10));
   public static final bfn<bsb> at = a("parrot", bfn.a.a(bsb::new, bgc.b).a(0.5F, 0.9F).a(8));
   public static final bfn<bwe> au = a("phantom", bfn.a.a(bwe::new, bgc.a).a(0.9F, 0.5F).a(8));
   public static final bfn<bsc> av = a("pig", bfn.a.a(bsc::new, bgc.b).a(0.9F, 0.9F).a(10));
   public static final bfn<bxe> aw = a("piglin", bfn.a.a(bxe::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<bxh> ax = a("piglin_brute", bfn.a.a(bxh::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<bwf> ay = a("pillager", bfn.a.a(bwf::new, bgc.a).d().a(0.6F, 1.95F).a(8));
   public static final bfn<bsd> az = a("polar_bear", bfn.a.a(bsd::new, bgc.b).a(cpo.qC).a(1.4F, 1.4F).a(10));
   public static final bfn<bzr> aA = a("potion", bfn.a.<bzr>a(bzr::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<bse> aB = a("pufferfish", bfn.a.a(bse::new, bgc.g).a(0.7F, 0.7F).a(4));
   public static final bfn<bsf> aC = a("rabbit", bfn.a.a(bsf::new, bgc.b).a(0.4F, 0.5F).a(8));
   public static final bfn<bwh> aD = a("ravager", bfn.a.a(bwh::new, bgc.a).a(1.95F, 2.2F).a(10));
   public static final bfn<bsg> aE = a("salmon", bfn.a.a(bsg::new, bgc.g).a(0.7F, 0.4F).a(4));
   public static final bfn<bsh> aF = a("sheep", bfn.a.a(bsh::new, bgc.b).a(0.9F, 1.3F).a(10));
   public static final bfn<bwi> aG = a("shulker", bfn.a.a(bwi::new, bgc.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bfn<bzi> aH = a("shulker_bullet", bfn.a.<bzi>a(bzi::new, bgc.h).a(0.3125F, 0.3125F).a(8));
   public static final bfn<bwj> aI = a("silverfish", bfn.a.a(bwj::new, bgc.a).a(0.4F, 0.3F).a(8));
   public static final bfn<bwk> aJ = a("skeleton", bfn.a.a(bwk::new, bgc.a).a(0.6F, 1.99F).a(8));
   public static final bfn<btq> aK = a("skeleton_horse", bfn.a.a(btq::new, bgc.b).a(1.3964844F, 1.6F).a(10));
   public static final bfn<bwl> aL = a("slime", bfn.a.a(bwl::new, bgc.a).a(2.04F, 2.04F).a(10));
   public static final bfn<bzj> aM = a("small_fireball", bfn.a.<bzj>a(bzj::new, bgc.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bfn<btx> aN = a("sniffer", bfn.a.a(btx::new, bgc.b).a(1.9F, 1.75F).a(10));
   public static final bfn<bsj> aO = a("snow_golem", bfn.a.a(bsj::new, bgc.h).a(cpo.qC).a(0.7F, 1.9F).a(8));
   public static final bfn<bzk> aP = a("snowball", bfn.a.<bzk>a(bzk::new, bgc.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bfn<caq> aQ = a("spawner_minecart", bfn.a.<caq>a(caq::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<bzl> aR = a("spectral_arrow", bfn.a.<bzl>a(bzl::new, bgc.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bfn<bwn> aS = a("spider", bfn.a.a(bwn::new, bgc.a).a(1.4F, 0.9F).a(8));
   public static final bfn<bsk> aT = a("squid", bfn.a.a(bsk::new, bgc.f).a(0.8F, 0.8F).a(8));
   public static final bfn<bwo> aU = a("stray", bfn.a.a(bwo::new, bgc.a).a(0.6F, 1.99F).a(cpo.qC).a(8));
   public static final bfn<bwp> aV = a("strider", bfn.a.a(bwp::new, bgc.b).c().a(0.9F, 1.7F).a(10));
   public static final bfn<btd> aW = a("tadpole", bfn.a.a(btd::new, bgc.b).a(btd.c, btd.d).a(10));
   public static final bfn<bfi.k> aX = a("text_display", bfn.a.a(bfi.k::new, bgc.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bfn<bvi> aY = a("tnt", bfn.a.<bvi>a(bvi::new, bgc.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bfn<car> aZ = a("tnt_minecart", bfn.a.<car>a(car::new, bgc.h).a(0.98F, 0.7F).a(8));
   public static final bfn<bts> ba = a("trader_llama", bfn.a.a(bts::new, bgc.b).a(0.9F, 1.87F).a(10));
   public static final bfn<bzs> bb = a("trident", bfn.a.<bzs>a(bzs::new, bgc.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bfn<bsl> bc = a("tropical_fish", bfn.a.a(bsl::new, bgc.g).a(0.5F, 0.4F).a(4));
   public static final bfn<bsm> bd = a("turtle", bfn.a.a(bsm::new, bgc.b).a(1.2F, 0.4F).a(10));
   public static final bfn<bwq> be = a("vex", bfn.a.a(bwq::new, bgc.a).c().a(0.4F, 0.8F).a(8));
   public static final bfn<byb> bf = a("villager", bfn.a.<byb>a(byb::new, bgc.h).a(0.6F, 1.95F).a(10));
   public static final bfn<bwr> bg = a("vindicator", bfn.a.a(bwr::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<byh> bh = a("wandering_trader", bfn.a.a(byh::new, bgc.b).a(0.6F, 1.95F).a(10));
   public static final bfn<bxs> bi = a("warden", bfn.a.a(bxs::new, bgc.a).a(0.9F, 2.9F).a(16).c());
   public static final bfn<bws> bj = a("witch", bfn.a.a(bws::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<buv> bk = a("wither", bfn.a.a(buv::new, bgc.a).c().a(cpo.cd).a(0.9F, 3.5F).a(10));
   public static final bfn<bwt> bl = a("wither_skeleton", bfn.a.a(bwt::new, bgc.a).c().a(cpo.cd).a(0.7F, 2.4F).a(8));
   public static final bfn<bzt> bm = a("wither_skull", bfn.a.<bzt>a(bzt::new, bgc.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bfn<bso> bn = a("wolf", bfn.a.a(bso::new, bgc.b).a(0.6F, 0.85F).a(10));
   public static final bfn<bwu> bo = a("zoglin", bfn.a.a(bwu::new, bgc.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bfn<bwv> bp = a("zombie", bfn.a.<bwv>a(bwv::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<btu> bq = a("zombie_horse", bfn.a.a(btu::new, bgc.b).a(1.3964844F, 1.6F).a(10));
   public static final bfn<bww> br = a("zombie_villager", bfn.a.a(bww::new, bgc.a).a(0.6F, 1.95F).a(8));
   public static final bfn<bwx> bs = a("zombified_piglin", bfn.a.a(bwx::new, bgc.a).c().a(0.6F, 1.95F).a(8));
   public static final bfn<byo> bt = a("player", bfn.a.<byo>a(bgc.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bfn<bzc> bu = a("fishing_bobber", bfn.a.<bzc>a(bzc::new, bgc.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bfn.b<T> bA;
   private final bgc bB;
   private final ImmutableSet<cpn> bC;
   private final boolean bD;
   private final boolean bE;
   private final boolean bF;
   private final boolean bG;
   private final int bH;
   private final int bI;
   @Nullable
   private String bJ;
   @Nullable
   private sw bK;
   @Nullable
   private acq bL;
   private final bfk bM;
   private final caw bN;

   private static <T extends bfj> bfn<T> a(String $$0, bfn.a<T> $$1) {
      return hr.a(jb.h, $$0, $$1.a($$0));
   }

   public static acq a(bfn<?> $$0) {
      return jb.h.b($$0);
   }

   public static Optional<bfn<?>> a(String $$0) {
      return jb.h.b(acq.a($$0));
   }

   public bfn(bfn.b<T> $$0, bgc $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cpn> $$6, bfk $$7, int $$8, int $$9, caw $$10) {
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
   public T a(aif $$0, @Nullable cfz $$1, @Nullable byo $$2, gu $$3, bgd $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$8;
      qr $$7;
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

   public static <T extends bfj> Consumer<T> a(aif $$0, cfz $$1, @Nullable byo $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bfj> Consumer<T> a(Consumer<T> $$0, aif $$1, cfz $$2, @Nullable byo $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bfj> Consumer<T> a(Consumer<T> $$0, cfz $$1) {
      return $$1.A() ? $$0.andThen($$1x -> $$1x.b($$1.y())) : $$0;
   }

   public static <T extends bfj> Consumer<T> b(Consumer<T> $$0, aif $$1, cfz $$2, @Nullable byo $$3) {
      qr $$4 = $$2.v();
      return $$4 != null ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aif $$0, gu $$1, bgd $$2) {
      return this.a($$0, (qr)null, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aif $$0, @Nullable qr $$1, @Nullable Consumer<T> $$2, gu $$3, bgd $$4, boolean $$5, boolean $$6) {
      T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         $$0.a_($$7);
      }

      return $$7;
   }

   @Nullable
   public T b(aif $$0, @Nullable qr $$1, @Nullable Consumer<T> $$2, gu $$3, bgd $$4, boolean $$5, boolean $$6) {
      T $$7 = this.a((cmm)$$0);
      if ($$7 == null) {
         return null;
      } else {
         double $$8;
         if ($$5) {
            $$7.e((double)$$3.u() + 0.5, (double)($$3.v() + 1), (double)$$3.w() + 0.5);
            $$8 = a($$0, $$3, $$6, $$7.cE());
         } else {
            $$8 = 0.0;
         }

         $$7.b((double)$$3.u() + 0.5, (double)$$3.v() + $$8, (double)$$3.w() + 0.5, apa.g($$0.z.i() * 360.0F), 0.0F);
         if ($$7 instanceof bgb $$10) {
            $$10.aX = $$10.dy();
            $$10.aV = $$10.dy();
            $$10.a($$0, $$0.d_($$10.di()), $$4, null, $$1);
            $$10.N();
         }

         if ($$2 != null) {
            $$2.accept($$7);
         }

         return $$7;
      }
   }

   protected static double a(cmp $$0, gu $$1, boolean $$2, eed $$3) {
      eed $$4 = new eed($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<efb> $$5 = $$0.c(null, $$4);
      return 1.0 + eey.a(ha.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cmm $$0, @Nullable byo $$1, @Nullable bfj $$2, @Nullable qr $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.B || !$$2.cK() || $$1 != null && $$4.ac().f($$1.fM())) {
               qr $$5 = $$2.f(new qr());
               UUID $$6 = $$2.ct();
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

   public bgc f() {
      return this.bB;
   }

   public String g() {
      if (this.bJ == null) {
         this.bJ = ac.a("entity", jb.h.b(this));
      }

      return this.bJ;
   }

   public sw h() {
      if (this.bK == null) {
         this.bK = sw.c(this.g());
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

   public acq j() {
      if (this.bL == null) {
         acq $$0 = jb.h.b(this);
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
   public caw m() {
      return this.bN;
   }

   @Nullable
   public T a(cmm $$0) {
      return !this.a($$0.G()) ? null : this.bA.create(this, $$0);
   }

   public static Optional<bfj> a(qr $$0, cmm $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bw.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public eed a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new eed($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(dcb $$0) {
      if (this.bC.contains($$0.b())) {
         return false;
      } else {
         return !this.bF && dxy.a($$0) ? true : $$0.a(cpo.cd) || $$0.a(cpo.oi) || $$0.a(cpo.dQ) || $$0.a(cpo.qC);
      }
   }

   public bfk n() {
      return this.bM;
   }

   public static Optional<bfn<?>> a(qr $$0) {
      return jb.h.b(new acq($$0.l("id")));
   }

   @Nullable
   public static bfj a(qr $$0, cmm $$1, Function<bfj, bfj> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            qx $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bfj $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bfj)$$3;
      }).orElse(null);
   }

   public static Stream<bfj> a(final List<? extends rk> $$0, final cmm $$1) {
      final Spliterator<? extends rk> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bfj>() {
         @Override
         public boolean tryAdvance(Consumer<? super bfj> $$0x) {
            return $$2.tryAdvance($$2xx -> bfn.a((qr)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bfj> trySplit() {
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

   private static Optional<bfj> b(qr $$0, cmm $$1) {
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

   public boolean a(anl<bfn<?>> $$0) {
      return this.bx.a($$0);
   }

   @Nullable
   public T a(bfj $$0) {
      return (T)($$0.ae() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bfj> a() {
      return bfj.class;
   }

   @Deprecated
   public he.c<bfn<?>> r() {
      return this.bx;
   }

   public static class a<T extends bfj> {
      private final bfn.b<T> a;
      private final bgc b;
      private ImmutableSet<cpn> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bfk j = bfk.b(0.6F, 1.8F);
      private caw k = cay.e;

      private a(bfn.b<T> $$0, bgc $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bgc.b || $$1 == bgc.h;
      }

      public static <T extends bfj> bfn.a<T> a(bfn.b<T> $$0, bgc $$1) {
         return new bfn.a<>($$0, $$1);
      }

      public static <T extends bfj> bfn.a<T> a(bgc $$0) {
         return new bfn.a<>(($$0x, $$1) -> null, $$0);
      }

      public bfn.a<T> a(float $$0, float $$1) {
         this.j = bfk.b($$0, $$1);
         return this;
      }

      public bfn.a<T> a() {
         this.e = false;
         return this;
      }

      public bfn.a<T> b() {
         this.d = false;
         return this;
      }

      public bfn.a<T> c() {
         this.f = true;
         return this;
      }

      public bfn.a<T> a(cpn... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bfn.a<T> d() {
         this.g = true;
         return this;
      }

      public bfn.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bfn.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bfn.a<T> a(cau... $$0) {
         this.k = cay.c.a($$0);
         return this;
      }

      public bfn<T> a(String $$0) {
         if (this.d) {
            ac.a(avw.p, $$0);
         }

         return new bfn<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
      }
   }

   public interface b<T extends bfj> {
      T create(bfn<T> var1, cmm var2);
   }
}
