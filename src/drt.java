import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class drt<FC extends dtx> {
   public static final drt<due> e = a("no_op", new dsn(due.a));
   public static final drt<dut> f = a("tree", new dtf(dut.a));
   public static final drt<duk> g = a("flower", new dsr(duk.a));
   public static final drt<duk> h = a("no_bonemeal_flower", new dsr(duk.a));
   public static final drt<duk> i = a("random_patch", new dsr(duk.a));
   public static final drt<dtp> j = a("block_pile", new drc(dtp.a));
   public static final drt<dus> k = a("spring_feature", new dte(dus.a));
   public static final drt<due> l = a("chorus_plant", new drf(due.a));
   public static final drt<dul> m = a("replace_single_block", new dsu(dul.a));
   public static final drt<due> n = a("void_start_platform", new dtk(due.a));
   public static final drt<due> o = a("desert_well", new drm(due.a));
   public static final drt<dry> p = a("fossil", new drx(dry.a));
   public static final drt<dtz> q = a("huge_red_mushroom", new dse(dtz.a));
   public static final drt<dtz> r = a("huge_brown_mushroom", new dsb(dtz.a));
   public static final drt<due> s = a("ice_spike", new dsf(due.a));
   public static final drt<due> t = a("glowstone_blob", new dsa(due.a));
   public static final drt<due> u = a("freeze_top_layer", new dtc(due.a));
   public static final drt<due> v = a("vines", new dtj(due.a));
   public static final drt<dto> w = a("block_column", new drb(dto.a));
   public static final drt<duw> x = a("vegetation_patch", new dti(duw.a));
   public static final drt<duw> y = a("waterlogged_vegetation_patch", new dtl(duw.a));
   public static final drt<dun> z = a("root_system", new dsv(dun.a));
   public static final drt<duc> A = a("multiface_growth", new dsl(duc.a));
   public static final drt<duv> B = a("underwater_magma", new dth(duv.a));
   public static final drt<due> C = a("monster_room", new dsk(due.a));
   public static final drt<due> D = a("blue_ice", new drd(due.a));
   public static final drt<dtq> E = a("iceberg", new dsg(dtq.a));
   public static final drt<dtq> F = a("forest_rock", new dra(dtq.a));
   public static final drt<dtu> G = a("disk", new drn(dtu.a));
   public static final drt<dsi.a> H = a("lake", new dsi(dsi.a.a));
   public static final drt<duf> I = a("ore", new dso(duf.a));
   public static final drt<dur> J = a("end_spike", new dtd(dur.a));
   public static final drt<due> K = a("end_island", new drr(due.a));
   public static final drt<dtw> L = a("end_gateway", new drq(dtw.a));
   public static final dsz M = a("seagrass", new dsz(duh.k));
   public static final drt<due> N = a("kelp", new dsh(due.a));
   public static final drt<due> O = a("coral_tree", new drk(due.a));
   public static final drt<due> P = a("coral_mushroom", new drj(due.a));
   public static final drt<due> Q = a("coral_claw", new drh(due.a));
   public static final drt<dts> R = a("sea_pickle", new dsy(dts.a));
   public static final drt<dup> S = a("simple_block", new dta(dup.a));
   public static final drt<duh> T = a("bamboo", new dqx(duh.k));
   public static final drt<dsc> U = a("huge_fungus", new dsd(dsc.a));
   public static final drt<dud> V = a("nether_forest_vegetation", new dsm(dud.c));
   public static final drt<due> W = a("weeping_vines", new dtm(due.a));
   public static final drt<duu> X = a("twisting_vines", new dtg(duu.a));
   public static final drt<dtr> Y = a("basalt_columns", new dqy(dtr.a));
   public static final drt<dtt> Z = a("delta_feature", new drl(dtt.a));
   public static final drt<dum> aa = a("netherrack_replace_blobs", new dst(dum.a));
   public static final drt<dub> ab = a("fill_layer", new drw(dub.a));
   public static final dre ac = a("bonus_chest", new dre(due.a));
   public static final drt<due> ad = a("basalt_pillar", new dqz(due.a));
   public static final drt<duf> ae = a("scattered_ore", new dsw(duf.a));
   public static final drt<duj> af = a("random_selector", new dss(duj.a));
   public static final drt<duq> ag = a("simple_random_selector", new dtb(duq.a));
   public static final drt<dui> ah = a("random_boolean_selector", new dsq(dui.a));
   public static final drt<dty> ai = a("geode", new drz(dty.b));
   public static final drt<dtv> aj = a("dripstone_cluster", new dro(dtv.a));
   public static final drt<dua> ak = a("large_dripstone", new dsj(dua.a));
   public static final drt<dug> al = a("pointed_dripstone", new dsp(dug.a));
   public static final drt<duo> am = a("sculk_patch", new dsx(duo.a));
   private final Codec<drg<FC, drt<FC>>> a;

   private static <C extends dtx, F extends drt<C>> F a(String $$0, F $$1) {
      return it.a(kd.Q, $$0, $$1);
   }

   public drt(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new drg<>(this, $$0x), drg::c).codec();
   }

   public Codec<drg<FC, drt<FC>>> a() {
      return this.a;
   }

   protected void a(ctw $$0, hx $$1, djg $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<djg> a(asv<cwp> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cuj $$0, hx $$1, djg $$2, Predicate<djg> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(drv<FC> var1);

   public boolean a(FC $$0, cuj $$1, dld $$2, auu $$3, hx $$4) {
      return $$1.f_($$4) ? this.a(new drv<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(djg $$0) {
      return $$0.a(asg.bd);
   }

   public static boolean b(djg $$0) {
      return $$0.a(asg.af);
   }

   public static boolean a(ctu $$0, hx $$1) {
      return $$0.a($$1, drt::b);
   }

   public static boolean a(Function<hx, djg> $$0, hx $$1, Predicate<djg> $$2) {
      hx.a $$3 = new hx.a();

      for (ic $$4 : ic.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hx, djg> $$0, hx $$1) {
      return a($$0, $$1, djf.a::i);
   }

   protected void a(cuj $$0, hx $$1) {
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
