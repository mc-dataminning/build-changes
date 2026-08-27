import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dvs<FC extends dxw> {
   public static final dvs<dyd> e = a("no_op", new dwm(dyd.a));
   public static final dvs<dys> f = a("tree", new dxe(dys.a));
   public static final dvs<dyj> g = a("flower", new dwq(dyj.a));
   public static final dvs<dyj> h = a("no_bonemeal_flower", new dwq(dyj.a));
   public static final dvs<dyj> i = a("random_patch", new dwq(dyj.a));
   public static final dvs<dxo> j = a("block_pile", new dvb(dxo.a));
   public static final dvs<dyr> k = a("spring_feature", new dxd(dyr.a));
   public static final dvs<dyd> l = a("chorus_plant", new dve(dyd.a));
   public static final dvs<dyk> m = a("replace_single_block", new dwt(dyk.a));
   public static final dvs<dyd> n = a("void_start_platform", new dxj(dyd.a));
   public static final dvs<dyd> o = a("desert_well", new dvl(dyd.a));
   public static final dvs<dvx> p = a("fossil", new dvw(dvx.a));
   public static final dvs<dxy> q = a("huge_red_mushroom", new dwd(dxy.a));
   public static final dvs<dxy> r = a("huge_brown_mushroom", new dwa(dxy.a));
   public static final dvs<dyd> s = a("ice_spike", new dwe(dyd.a));
   public static final dvs<dyd> t = a("glowstone_blob", new dvz(dyd.a));
   public static final dvs<dyd> u = a("freeze_top_layer", new dxb(dyd.a));
   public static final dvs<dyd> v = a("vines", new dxi(dyd.a));
   public static final dvs<dxn> w = a("block_column", new dva(dxn.a));
   public static final dvs<dyv> x = a("vegetation_patch", new dxh(dyv.a));
   public static final dvs<dyv> y = a("waterlogged_vegetation_patch", new dxk(dyv.a));
   public static final dvs<dym> z = a("root_system", new dwu(dym.a));
   public static final dvs<dyb> A = a("multiface_growth", new dwk(dyb.a));
   public static final dvs<dyu> B = a("underwater_magma", new dxg(dyu.a));
   public static final dvs<dyd> C = a("monster_room", new dwj(dyd.a));
   public static final dvs<dyd> D = a("blue_ice", new dvc(dyd.a));
   public static final dvs<dxp> E = a("iceberg", new dwf(dxp.a));
   public static final dvs<dxp> F = a("forest_rock", new duz(dxp.a));
   public static final dvs<dxt> G = a("disk", new dvm(dxt.a));
   public static final dvs<dwh.a> H = a("lake", new dwh(dwh.a.a));
   public static final dvs<dye> I = a("ore", new dwn(dye.a));
   public static final dvs<dyq> J = a("end_spike", new dxc(dyq.a));
   public static final dvs<dyd> K = a("end_island", new dvq(dyd.a));
   public static final dvs<dxv> L = a("end_gateway", new dvp(dxv.a));
   public static final dwy M = a("seagrass", new dwy(dyg.k));
   public static final dvs<dyd> N = a("kelp", new dwg(dyd.a));
   public static final dvs<dyd> O = a("coral_tree", new dvj(dyd.a));
   public static final dvs<dyd> P = a("coral_mushroom", new dvi(dyd.a));
   public static final dvs<dyd> Q = a("coral_claw", new dvg(dyd.a));
   public static final dvs<dxr> R = a("sea_pickle", new dwx(dxr.a));
   public static final dvs<dyo> S = a("simple_block", new dwz(dyo.a));
   public static final dvs<dyg> T = a("bamboo", new duw(dyg.k));
   public static final dvs<dwb> U = a("huge_fungus", new dwc(dwb.a));
   public static final dvs<dyc> V = a("nether_forest_vegetation", new dwl(dyc.c));
   public static final dvs<dyd> W = a("weeping_vines", new dxl(dyd.a));
   public static final dvs<dyt> X = a("twisting_vines", new dxf(dyt.a));
   public static final dvs<dxq> Y = a("basalt_columns", new dux(dxq.a));
   public static final dvs<dxs> Z = a("delta_feature", new dvk(dxs.a));
   public static final dvs<dyl> aa = a("netherrack_replace_blobs", new dws(dyl.a));
   public static final dvs<dya> ab = a("fill_layer", new dvv(dya.a));
   public static final dvd ac = a("bonus_chest", new dvd(dyd.a));
   public static final dvs<dyd> ad = a("basalt_pillar", new duy(dyd.a));
   public static final dvs<dye> ae = a("scattered_ore", new dwv(dye.a));
   public static final dvs<dyi> af = a("random_selector", new dwr(dyi.a));
   public static final dvs<dyp> ag = a("simple_random_selector", new dxa(dyp.a));
   public static final dvs<dyh> ah = a("random_boolean_selector", new dwp(dyh.a));
   public static final dvs<dxx> ai = a("geode", new dvy(dxx.b));
   public static final dvs<dxu> aj = a("dripstone_cluster", new dvn(dxu.a));
   public static final dvs<dxz> ak = a("large_dripstone", new dwi(dxz.a));
   public static final dvs<dyf> al = a("pointed_dripstone", new dwo(dyf.a));
   public static final dvs<dyn> am = a("sculk_patch", new dww(dyn.a));
   private final Codec<dvf<FC, dvs<FC>>> a;

   private static <C extends dxw, F extends dvs<C>> F a(String $$0, F $$1) {
      return iy.a(ki.Q, $$0, $$1);
   }

   public dvs(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dvf<>(this, $$0x), dvf::c).codec();
   }

   public Codec<dvf<FC, dvs<FC>>> a() {
      return this.a;
   }

   protected void a(cxj $$0, ib $$1, dnb $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dnb> a(avd<dac> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cxw $$0, ib $$1, dnb $$2, Predicate<dnb> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dvu<FC> var1);

   public boolean a(FC $$0, cxw $$1, doy $$2, axd $$3, ib $$4) {
      return $$1.f_($$4) ? this.a(new dvu<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dnb $$0) {
      return $$0.a(aun.be);
   }

   public static boolean b(dnb $$0) {
      return $$0.a(aun.af);
   }

   public static boolean a(cxh $$0, ib $$1) {
      return $$0.a($$1, dvs::b);
   }

   public static boolean a(Function<ib, dnb> $$0, ib $$1, Predicate<dnb> $$2) {
      ib.a $$3 = new ib.a();

      for (ih $$4 : ih.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ib, dnb> $$0, ib $$1) {
      return a($$0, $$1, dna.a::i);
   }

   protected void a(cxw $$0, ib $$1) {
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
