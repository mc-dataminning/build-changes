import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dtz<FC extends dwd> {
   public static final dtz<dwk> e = a("no_op", new dut(dwk.a));
   public static final dtz<dwz> f = a("tree", new dvl(dwz.a));
   public static final dtz<dwq> g = a("flower", new dux(dwq.a));
   public static final dtz<dwq> h = a("no_bonemeal_flower", new dux(dwq.a));
   public static final dtz<dwq> i = a("random_patch", new dux(dwq.a));
   public static final dtz<dvv> j = a("block_pile", new dti(dvv.a));
   public static final dtz<dwy> k = a("spring_feature", new dvk(dwy.a));
   public static final dtz<dwk> l = a("chorus_plant", new dtl(dwk.a));
   public static final dtz<dwr> m = a("replace_single_block", new dva(dwr.a));
   public static final dtz<dwk> n = a("void_start_platform", new dvq(dwk.a));
   public static final dtz<dwk> o = a("desert_well", new dts(dwk.a));
   public static final dtz<due> p = a("fossil", new dud(due.a));
   public static final dtz<dwf> q = a("huge_red_mushroom", new duk(dwf.a));
   public static final dtz<dwf> r = a("huge_brown_mushroom", new duh(dwf.a));
   public static final dtz<dwk> s = a("ice_spike", new dul(dwk.a));
   public static final dtz<dwk> t = a("glowstone_blob", new dug(dwk.a));
   public static final dtz<dwk> u = a("freeze_top_layer", new dvi(dwk.a));
   public static final dtz<dwk> v = a("vines", new dvp(dwk.a));
   public static final dtz<dvu> w = a("block_column", new dth(dvu.a));
   public static final dtz<dxc> x = a("vegetation_patch", new dvo(dxc.a));
   public static final dtz<dxc> y = a("waterlogged_vegetation_patch", new dvr(dxc.a));
   public static final dtz<dwt> z = a("root_system", new dvb(dwt.a));
   public static final dtz<dwi> A = a("multiface_growth", new dur(dwi.a));
   public static final dtz<dxb> B = a("underwater_magma", new dvn(dxb.a));
   public static final dtz<dwk> C = a("monster_room", new duq(dwk.a));
   public static final dtz<dwk> D = a("blue_ice", new dtj(dwk.a));
   public static final dtz<dvw> E = a("iceberg", new dum(dvw.a));
   public static final dtz<dvw> F = a("forest_rock", new dtg(dvw.a));
   public static final dtz<dwa> G = a("disk", new dtt(dwa.a));
   public static final dtz<duo.a> H = a("lake", new duo(duo.a.a));
   public static final dtz<dwl> I = a("ore", new duu(dwl.a));
   public static final dtz<dwx> J = a("end_spike", new dvj(dwx.a));
   public static final dtz<dwk> K = a("end_island", new dtx(dwk.a));
   public static final dtz<dwc> L = a("end_gateway", new dtw(dwc.a));
   public static final dvf M = a("seagrass", new dvf(dwn.k));
   public static final dtz<dwk> N = a("kelp", new dun(dwk.a));
   public static final dtz<dwk> O = a("coral_tree", new dtq(dwk.a));
   public static final dtz<dwk> P = a("coral_mushroom", new dtp(dwk.a));
   public static final dtz<dwk> Q = a("coral_claw", new dtn(dwk.a));
   public static final dtz<dvy> R = a("sea_pickle", new dve(dvy.a));
   public static final dtz<dwv> S = a("simple_block", new dvg(dwv.a));
   public static final dtz<dwn> T = a("bamboo", new dtd(dwn.k));
   public static final dtz<dui> U = a("huge_fungus", new duj(dui.a));
   public static final dtz<dwj> V = a("nether_forest_vegetation", new dus(dwj.c));
   public static final dtz<dwk> W = a("weeping_vines", new dvs(dwk.a));
   public static final dtz<dxa> X = a("twisting_vines", new dvm(dxa.a));
   public static final dtz<dvx> Y = a("basalt_columns", new dte(dvx.a));
   public static final dtz<dvz> Z = a("delta_feature", new dtr(dvz.a));
   public static final dtz<dws> aa = a("netherrack_replace_blobs", new duz(dws.a));
   public static final dtz<dwh> ab = a("fill_layer", new duc(dwh.a));
   public static final dtk ac = a("bonus_chest", new dtk(dwk.a));
   public static final dtz<dwk> ad = a("basalt_pillar", new dtf(dwk.a));
   public static final dtz<dwl> ae = a("scattered_ore", new dvc(dwl.a));
   public static final dtz<dwp> af = a("random_selector", new duy(dwp.a));
   public static final dtz<dww> ag = a("simple_random_selector", new dvh(dww.a));
   public static final dtz<dwo> ah = a("random_boolean_selector", new duw(dwo.a));
   public static final dtz<dwe> ai = a("geode", new duf(dwe.b));
   public static final dtz<dwb> aj = a("dripstone_cluster", new dtu(dwb.a));
   public static final dtz<dwg> ak = a("large_dripstone", new dup(dwg.a));
   public static final dtz<dwm> al = a("pointed_dripstone", new duv(dwm.a));
   public static final dtz<dwu> am = a("sculk_patch", new dvd(dwu.a));
   private final Codec<dtm<FC, dtz<FC>>> a;

   private static <C extends dwd, F extends dtz<C>> F a(String $$0, F $$1) {
      return iv.a(kf.Q, $$0, $$1);
   }

   public dtz(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dtm<>(this, $$0x), dtm::c).codec();
   }

   public Codec<dtm<FC, dtz<FC>>> a() {
      return this.a;
   }

   protected void a(cvz $$0, hz $$1, dlj $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dlj> a(aup<cys> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cwm $$0, hz $$1, dlj $$2, Predicate<dlj> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dub<FC> var1);

   public boolean a(FC $$0, cwm $$1, dng $$2, awp $$3, hz $$4) {
      return $$1.f_($$4) ? this.a(new dub<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dlj $$0) {
      return $$0.a(aua.bd);
   }

   public static boolean b(dlj $$0) {
      return $$0.a(aua.af);
   }

   public static boolean a(cvx $$0, hz $$1) {
      return $$0.a($$1, dtz::b);
   }

   public static boolean a(Function<hz, dlj> $$0, hz $$1, Predicate<dlj> $$2) {
      hz.a $$3 = new hz.a();

      for (ie $$4 : ie.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hz, dlj> $$0, hz $$1) {
      return a($$0, $$1, dli.a::i);
   }

   protected void a(cwm $$0, hz $$1) {
      hz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ie.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
