import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dru<FC extends dty> {
   public static final dru<duf> e = a("no_op", new dso(duf.a));
   public static final dru<duu> f = a("tree", new dtg(duu.a));
   public static final dru<dul> g = a("flower", new dss(dul.a));
   public static final dru<dul> h = a("no_bonemeal_flower", new dss(dul.a));
   public static final dru<dul> i = a("random_patch", new dss(dul.a));
   public static final dru<dtq> j = a("block_pile", new drd(dtq.a));
   public static final dru<dut> k = a("spring_feature", new dtf(dut.a));
   public static final dru<duf> l = a("chorus_plant", new drg(duf.a));
   public static final dru<dum> m = a("replace_single_block", new dsv(dum.a));
   public static final dru<duf> n = a("void_start_platform", new dtl(duf.a));
   public static final dru<duf> o = a("desert_well", new drn(duf.a));
   public static final dru<drz> p = a("fossil", new dry(drz.a));
   public static final dru<dua> q = a("huge_red_mushroom", new dsf(dua.a));
   public static final dru<dua> r = a("huge_brown_mushroom", new dsc(dua.a));
   public static final dru<duf> s = a("ice_spike", new dsg(duf.a));
   public static final dru<duf> t = a("glowstone_blob", new dsb(duf.a));
   public static final dru<duf> u = a("freeze_top_layer", new dtd(duf.a));
   public static final dru<duf> v = a("vines", new dtk(duf.a));
   public static final dru<dtp> w = a("block_column", new drc(dtp.a));
   public static final dru<dux> x = a("vegetation_patch", new dtj(dux.a));
   public static final dru<dux> y = a("waterlogged_vegetation_patch", new dtm(dux.a));
   public static final dru<duo> z = a("root_system", new dsw(duo.a));
   public static final dru<dud> A = a("multiface_growth", new dsm(dud.a));
   public static final dru<duw> B = a("underwater_magma", new dti(duw.a));
   public static final dru<duf> C = a("monster_room", new dsl(duf.a));
   public static final dru<duf> D = a("blue_ice", new dre(duf.a));
   public static final dru<dtr> E = a("iceberg", new dsh(dtr.a));
   public static final dru<dtr> F = a("forest_rock", new drb(dtr.a));
   public static final dru<dtv> G = a("disk", new dro(dtv.a));
   public static final dru<dsj.a> H = a("lake", new dsj(dsj.a.a));
   public static final dru<dug> I = a("ore", new dsp(dug.a));
   public static final dru<dus> J = a("end_spike", new dte(dus.a));
   public static final dru<duf> K = a("end_island", new drs(duf.a));
   public static final dru<dtx> L = a("end_gateway", new drr(dtx.a));
   public static final dta M = a("seagrass", new dta(dui.k));
   public static final dru<duf> N = a("kelp", new dsi(duf.a));
   public static final dru<duf> O = a("coral_tree", new drl(duf.a));
   public static final dru<duf> P = a("coral_mushroom", new drk(duf.a));
   public static final dru<duf> Q = a("coral_claw", new dri(duf.a));
   public static final dru<dtt> R = a("sea_pickle", new dsz(dtt.a));
   public static final dru<duq> S = a("simple_block", new dtb(duq.a));
   public static final dru<dui> T = a("bamboo", new dqy(dui.k));
   public static final dru<dsd> U = a("huge_fungus", new dse(dsd.a));
   public static final dru<due> V = a("nether_forest_vegetation", new dsn(due.c));
   public static final dru<duf> W = a("weeping_vines", new dtn(duf.a));
   public static final dru<duv> X = a("twisting_vines", new dth(duv.a));
   public static final dru<dts> Y = a("basalt_columns", new dqz(dts.a));
   public static final dru<dtu> Z = a("delta_feature", new drm(dtu.a));
   public static final dru<dun> aa = a("netherrack_replace_blobs", new dsu(dun.a));
   public static final dru<duc> ab = a("fill_layer", new drx(duc.a));
   public static final drf ac = a("bonus_chest", new drf(duf.a));
   public static final dru<duf> ad = a("basalt_pillar", new dra(duf.a));
   public static final dru<dug> ae = a("scattered_ore", new dsx(dug.a));
   public static final dru<duk> af = a("random_selector", new dst(duk.a));
   public static final dru<dur> ag = a("simple_random_selector", new dtc(dur.a));
   public static final dru<duj> ah = a("random_boolean_selector", new dsr(duj.a));
   public static final dru<dtz> ai = a("geode", new dsa(dtz.b));
   public static final dru<dtw> aj = a("dripstone_cluster", new drp(dtw.a));
   public static final dru<dub> ak = a("large_dripstone", new dsk(dub.a));
   public static final dru<duh> al = a("pointed_dripstone", new dsq(duh.a));
   public static final dru<dup> am = a("sculk_patch", new dsy(dup.a));
   private final Codec<drh<FC, dru<FC>>> a;

   private static <C extends dty, F extends dru<C>> F a(String $$0, F $$1) {
      return it.a(kd.Q, $$0, $$1);
   }

   public dru(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new drh<>(this, $$0x), drh::c).codec();
   }

   public Codec<drh<FC, dru<FC>>> a() {
      return this.a;
   }

   protected void a(ctx $$0, hx $$1, djh $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<djh> a(asw<cwq> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cuk $$0, hx $$1, djh $$2, Predicate<djh> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(drw<FC> var1);

   public boolean a(FC $$0, cuk $$1, dle $$2, auv $$3, hx $$4) {
      return $$1.f_($$4) ? this.a(new drw<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(djh $$0) {
      return $$0.a(ash.bd);
   }

   public static boolean b(djh $$0) {
      return $$0.a(ash.af);
   }

   public static boolean a(ctv $$0, hx $$1) {
      return $$0.a($$1, dru::b);
   }

   public static boolean a(Function<hx, djh> $$0, hx $$1, Predicate<djh> $$2) {
      hx.a $$3 = new hx.a();

      for (ic $$4 : ic.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hx, djh> $$0, hx $$1) {
      return a($$0, $$1, djg.a::i);
   }

   protected void a(cuk $$0, hx $$1) {
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
