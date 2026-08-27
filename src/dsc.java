import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dsc<FC extends dug> {
   public static final dsc<dun> e = a("no_op", new dsw(dun.a));
   public static final dsc<dvc> f = a("tree", new dto(dvc.a));
   public static final dsc<dut> g = a("flower", new dta(dut.a));
   public static final dsc<dut> h = a("no_bonemeal_flower", new dta(dut.a));
   public static final dsc<dut> i = a("random_patch", new dta(dut.a));
   public static final dsc<dty> j = a("block_pile", new drl(dty.a));
   public static final dsc<dvb> k = a("spring_feature", new dtn(dvb.a));
   public static final dsc<dun> l = a("chorus_plant", new dro(dun.a));
   public static final dsc<duu> m = a("replace_single_block", new dtd(duu.a));
   public static final dsc<dun> n = a("void_start_platform", new dtt(dun.a));
   public static final dsc<dun> o = a("desert_well", new drv(dun.a));
   public static final dsc<dsh> p = a("fossil", new dsg(dsh.a));
   public static final dsc<dui> q = a("huge_red_mushroom", new dsn(dui.a));
   public static final dsc<dui> r = a("huge_brown_mushroom", new dsk(dui.a));
   public static final dsc<dun> s = a("ice_spike", new dso(dun.a));
   public static final dsc<dun> t = a("glowstone_blob", new dsj(dun.a));
   public static final dsc<dun> u = a("freeze_top_layer", new dtl(dun.a));
   public static final dsc<dun> v = a("vines", new dts(dun.a));
   public static final dsc<dtx> w = a("block_column", new drk(dtx.a));
   public static final dsc<dvf> x = a("vegetation_patch", new dtr(dvf.a));
   public static final dsc<dvf> y = a("waterlogged_vegetation_patch", new dtu(dvf.a));
   public static final dsc<duw> z = a("root_system", new dte(duw.a));
   public static final dsc<dul> A = a("multiface_growth", new dsu(dul.a));
   public static final dsc<dve> B = a("underwater_magma", new dtq(dve.a));
   public static final dsc<dun> C = a("monster_room", new dst(dun.a));
   public static final dsc<dun> D = a("blue_ice", new drm(dun.a));
   public static final dsc<dtz> E = a("iceberg", new dsp(dtz.a));
   public static final dsc<dtz> F = a("forest_rock", new drj(dtz.a));
   public static final dsc<dud> G = a("disk", new drw(dud.a));
   public static final dsc<dsr.a> H = a("lake", new dsr(dsr.a.a));
   public static final dsc<duo> I = a("ore", new dsx(duo.a));
   public static final dsc<dva> J = a("end_spike", new dtm(dva.a));
   public static final dsc<dun> K = a("end_island", new dsa(dun.a));
   public static final dsc<duf> L = a("end_gateway", new drz(duf.a));
   public static final dti M = a("seagrass", new dti(duq.k));
   public static final dsc<dun> N = a("kelp", new dsq(dun.a));
   public static final dsc<dun> O = a("coral_tree", new drt(dun.a));
   public static final dsc<dun> P = a("coral_mushroom", new drs(dun.a));
   public static final dsc<dun> Q = a("coral_claw", new drq(dun.a));
   public static final dsc<dub> R = a("sea_pickle", new dth(dub.a));
   public static final dsc<duy> S = a("simple_block", new dtj(duy.a));
   public static final dsc<duq> T = a("bamboo", new drg(duq.k));
   public static final dsc<dsl> U = a("huge_fungus", new dsm(dsl.a));
   public static final dsc<dum> V = a("nether_forest_vegetation", new dsv(dum.c));
   public static final dsc<dun> W = a("weeping_vines", new dtv(dun.a));
   public static final dsc<dvd> X = a("twisting_vines", new dtp(dvd.a));
   public static final dsc<dua> Y = a("basalt_columns", new drh(dua.a));
   public static final dsc<duc> Z = a("delta_feature", new dru(duc.a));
   public static final dsc<duv> aa = a("netherrack_replace_blobs", new dtc(duv.a));
   public static final dsc<duk> ab = a("fill_layer", new dsf(duk.a));
   public static final drn ac = a("bonus_chest", new drn(dun.a));
   public static final dsc<dun> ad = a("basalt_pillar", new dri(dun.a));
   public static final dsc<duo> ae = a("scattered_ore", new dtf(duo.a));
   public static final dsc<dus> af = a("random_selector", new dtb(dus.a));
   public static final dsc<duz> ag = a("simple_random_selector", new dtk(duz.a));
   public static final dsc<dur> ah = a("random_boolean_selector", new dsz(dur.a));
   public static final dsc<duh> ai = a("geode", new dsi(duh.b));
   public static final dsc<due> aj = a("dripstone_cluster", new drx(due.a));
   public static final dsc<duj> ak = a("large_dripstone", new dss(duj.a));
   public static final dsc<dup> al = a("pointed_dripstone", new dsy(dup.a));
   public static final dsc<dux> am = a("sculk_patch", new dtg(dux.a));
   private final Codec<drp<FC, dsc<FC>>> a;

   private static <C extends dug, F extends dsc<C>> F a(String $$0, F $$1) {
      return it.a(kd.Q, $$0, $$1);
   }

   public dsc(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new drp<>(this, $$0x), drp::c).codec();
   }

   public Codec<drp<FC, dsc<FC>>> a() {
      return this.a;
   }

   protected void a(cuf $$0, hx $$1, djp $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<djp> a(asx<cwy> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cus $$0, hx $$1, djp $$2, Predicate<djp> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dse<FC> var1);

   public boolean a(FC $$0, cus $$1, dlm $$2, auw $$3, hx $$4) {
      return $$1.f_($$4) ? this.a(new dse<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(djp $$0) {
      return $$0.a(asi.bd);
   }

   public static boolean b(djp $$0) {
      return $$0.a(asi.af);
   }

   public static boolean a(cud $$0, hx $$1) {
      return $$0.a($$1, dsc::b);
   }

   public static boolean a(Function<hx, djp> $$0, hx $$1, Predicate<djp> $$2) {
      hx.a $$3 = new hx.a();

      for (ic $$4 : ic.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hx, djp> $$0, hx $$1) {
      return a($$0, $$1, djo.a::i);
   }

   protected void a(cus $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ic.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
