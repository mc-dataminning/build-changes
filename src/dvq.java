import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dvq<FC extends dxu> {
   public static final dvq<dyb> e = a("no_op", new dwk(dyb.a));
   public static final dvq<dyq> f = a("tree", new dxc(dyq.a));
   public static final dvq<dyh> g = a("flower", new dwo(dyh.a));
   public static final dvq<dyh> h = a("no_bonemeal_flower", new dwo(dyh.a));
   public static final dvq<dyh> i = a("random_patch", new dwo(dyh.a));
   public static final dvq<dxm> j = a("block_pile", new duz(dxm.a));
   public static final dvq<dyp> k = a("spring_feature", new dxb(dyp.a));
   public static final dvq<dyb> l = a("chorus_plant", new dvc(dyb.a));
   public static final dvq<dyi> m = a("replace_single_block", new dwr(dyi.a));
   public static final dvq<dyb> n = a("void_start_platform", new dxh(dyb.a));
   public static final dvq<dyb> o = a("desert_well", new dvj(dyb.a));
   public static final dvq<dvv> p = a("fossil", new dvu(dvv.a));
   public static final dvq<dxw> q = a("huge_red_mushroom", new dwb(dxw.a));
   public static final dvq<dxw> r = a("huge_brown_mushroom", new dvy(dxw.a));
   public static final dvq<dyb> s = a("ice_spike", new dwc(dyb.a));
   public static final dvq<dyb> t = a("glowstone_blob", new dvx(dyb.a));
   public static final dvq<dyb> u = a("freeze_top_layer", new dwz(dyb.a));
   public static final dvq<dyb> v = a("vines", new dxg(dyb.a));
   public static final dvq<dxl> w = a("block_column", new duy(dxl.a));
   public static final dvq<dyt> x = a("vegetation_patch", new dxf(dyt.a));
   public static final dvq<dyt> y = a("waterlogged_vegetation_patch", new dxi(dyt.a));
   public static final dvq<dyk> z = a("root_system", new dws(dyk.a));
   public static final dvq<dxz> A = a("multiface_growth", new dwi(dxz.a));
   public static final dvq<dys> B = a("underwater_magma", new dxe(dys.a));
   public static final dvq<dyb> C = a("monster_room", new dwh(dyb.a));
   public static final dvq<dyb> D = a("blue_ice", new dva(dyb.a));
   public static final dvq<dxn> E = a("iceberg", new dwd(dxn.a));
   public static final dvq<dxn> F = a("forest_rock", new dux(dxn.a));
   public static final dvq<dxr> G = a("disk", new dvk(dxr.a));
   public static final dvq<dwf.a> H = a("lake", new dwf(dwf.a.a));
   public static final dvq<dyc> I = a("ore", new dwl(dyc.a));
   public static final dvq<dyo> J = a("end_spike", new dxa(dyo.a));
   public static final dvq<dyb> K = a("end_island", new dvo(dyb.a));
   public static final dvq<dxt> L = a("end_gateway", new dvn(dxt.a));
   public static final dww M = a("seagrass", new dww(dye.k));
   public static final dvq<dyb> N = a("kelp", new dwe(dyb.a));
   public static final dvq<dyb> O = a("coral_tree", new dvh(dyb.a));
   public static final dvq<dyb> P = a("coral_mushroom", new dvg(dyb.a));
   public static final dvq<dyb> Q = a("coral_claw", new dve(dyb.a));
   public static final dvq<dxp> R = a("sea_pickle", new dwv(dxp.a));
   public static final dvq<dym> S = a("simple_block", new dwx(dym.a));
   public static final dvq<dye> T = a("bamboo", new duu(dye.k));
   public static final dvq<dvz> U = a("huge_fungus", new dwa(dvz.a));
   public static final dvq<dya> V = a("nether_forest_vegetation", new dwj(dya.c));
   public static final dvq<dyb> W = a("weeping_vines", new dxj(dyb.a));
   public static final dvq<dyr> X = a("twisting_vines", new dxd(dyr.a));
   public static final dvq<dxo> Y = a("basalt_columns", new duv(dxo.a));
   public static final dvq<dxq> Z = a("delta_feature", new dvi(dxq.a));
   public static final dvq<dyj> aa = a("netherrack_replace_blobs", new dwq(dyj.a));
   public static final dvq<dxy> ab = a("fill_layer", new dvt(dxy.a));
   public static final dvb ac = a("bonus_chest", new dvb(dyb.a));
   public static final dvq<dyb> ad = a("basalt_pillar", new duw(dyb.a));
   public static final dvq<dyc> ae = a("scattered_ore", new dwt(dyc.a));
   public static final dvq<dyg> af = a("random_selector", new dwp(dyg.a));
   public static final dvq<dyn> ag = a("simple_random_selector", new dwy(dyn.a));
   public static final dvq<dyf> ah = a("random_boolean_selector", new dwn(dyf.a));
   public static final dvq<dxv> ai = a("geode", new dvw(dxv.b));
   public static final dvq<dxs> aj = a("dripstone_cluster", new dvl(dxs.a));
   public static final dvq<dxx> ak = a("large_dripstone", new dwg(dxx.a));
   public static final dvq<dyd> al = a("pointed_dripstone", new dwm(dyd.a));
   public static final dvq<dyl> am = a("sculk_patch", new dwu(dyl.a));
   private final Codec<dvd<FC, dvq<FC>>> a;

   private static <C extends dxu, F extends dvq<C>> F a(String $$0, F $$1) {
      return iy.a(ki.Q, $$0, $$1);
   }

   public dvq(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dvd<>(this, $$0x), dvd::c).codec();
   }

   public Codec<dvd<FC, dvq<FC>>> a() {
      return this.a;
   }

   protected void a(cxh $$0, ib $$1, dmz $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dmz> a(avd<daa> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cxu $$0, ib $$1, dmz $$2, Predicate<dmz> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dvs<FC> var1);

   public boolean a(FC $$0, cxu $$1, dow $$2, axd $$3, ib $$4) {
      return $$1.f_($$4) ? this.a(new dvs<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dmz $$0) {
      return $$0.a(aun.be);
   }

   public static boolean b(dmz $$0) {
      return $$0.a(aun.af);
   }

   public static boolean a(cxf $$0, ib $$1) {
      return $$0.a($$1, dvq::b);
   }

   public static boolean a(Function<ib, dmz> $$0, ib $$1, Predicate<dmz> $$2) {
      ib.a $$3 = new ib.a();

      for (ih $$4 : ih.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ib, dmz> $$0, ib $$1) {
      return a($$0, $$1, dmy.a::i);
   }

   protected void a(cxu $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ih.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
