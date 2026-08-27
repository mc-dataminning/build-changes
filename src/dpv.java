import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dpv<FC extends drz> {
   public static final dpv<dsg> e = a("no_op", new dqp(dsg.a));
   public static final dpv<dsv> f = a("tree", new drh(dsv.a));
   public static final dpv<dsm> g = a("flower", new dqt(dsm.a));
   public static final dpv<dsm> h = a("no_bonemeal_flower", new dqt(dsm.a));
   public static final dpv<dsm> i = a("random_patch", new dqt(dsm.a));
   public static final dpv<drr> j = a("block_pile", new dpe(drr.a));
   public static final dpv<dsu> k = a("spring_feature", new drg(dsu.a));
   public static final dpv<dsg> l = a("chorus_plant", new dph(dsg.a));
   public static final dpv<dsn> m = a("replace_single_block", new dqw(dsn.a));
   public static final dpv<dsg> n = a("void_start_platform", new drm(dsg.a));
   public static final dpv<dsg> o = a("desert_well", new dpo(dsg.a));
   public static final dpv<dqa> p = a("fossil", new dpz(dqa.a));
   public static final dpv<dsb> q = a("huge_red_mushroom", new dqg(dsb.a));
   public static final dpv<dsb> r = a("huge_brown_mushroom", new dqd(dsb.a));
   public static final dpv<dsg> s = a("ice_spike", new dqh(dsg.a));
   public static final dpv<dsg> t = a("glowstone_blob", new dqc(dsg.a));
   public static final dpv<dsg> u = a("freeze_top_layer", new dre(dsg.a));
   public static final dpv<dsg> v = a("vines", new drl(dsg.a));
   public static final dpv<drq> w = a("block_column", new dpd(drq.a));
   public static final dpv<dsy> x = a("vegetation_patch", new drk(dsy.a));
   public static final dpv<dsy> y = a("waterlogged_vegetation_patch", new drn(dsy.a));
   public static final dpv<dsp> z = a("root_system", new dqx(dsp.a));
   public static final dpv<dse> A = a("multiface_growth", new dqn(dse.a));
   public static final dpv<dsx> B = a("underwater_magma", new drj(dsx.a));
   public static final dpv<dsg> C = a("monster_room", new dqm(dsg.a));
   public static final dpv<dsg> D = a("blue_ice", new dpf(dsg.a));
   public static final dpv<drs> E = a("iceberg", new dqi(drs.a));
   public static final dpv<drs> F = a("forest_rock", new dpc(drs.a));
   public static final dpv<drw> G = a("disk", new dpp(drw.a));
   public static final dpv<dqk.a> H = a("lake", new dqk(dqk.a.a));
   public static final dpv<dsh> I = a("ore", new dqq(dsh.a));
   public static final dpv<dst> J = a("end_spike", new drf(dst.a));
   public static final dpv<dsg> K = a("end_island", new dpt(dsg.a));
   public static final dpv<dry> L = a("end_gateway", new dps(dry.a));
   public static final drb M = a("seagrass", new drb(dsj.k));
   public static final dpv<dsg> N = a("kelp", new dqj(dsg.a));
   public static final dpv<dsg> O = a("coral_tree", new dpm(dsg.a));
   public static final dpv<dsg> P = a("coral_mushroom", new dpl(dsg.a));
   public static final dpv<dsg> Q = a("coral_claw", new dpj(dsg.a));
   public static final dpv<dru> R = a("sea_pickle", new dra(dru.a));
   public static final dpv<dsr> S = a("simple_block", new drc(dsr.a));
   public static final dpv<dsj> T = a("bamboo", new doz(dsj.k));
   public static final dpv<dqe> U = a("huge_fungus", new dqf(dqe.a));
   public static final dpv<dsf> V = a("nether_forest_vegetation", new dqo(dsf.c));
   public static final dpv<dsg> W = a("weeping_vines", new dro(dsg.a));
   public static final dpv<dsw> X = a("twisting_vines", new dri(dsw.a));
   public static final dpv<drt> Y = a("basalt_columns", new dpa(drt.a));
   public static final dpv<drv> Z = a("delta_feature", new dpn(drv.a));
   public static final dpv<dso> aa = a("netherrack_replace_blobs", new dqv(dso.a));
   public static final dpv<dsd> ab = a("fill_layer", new dpy(dsd.a));
   public static final dpg ac = a("bonus_chest", new dpg(dsg.a));
   public static final dpv<dsg> ad = a("basalt_pillar", new dpb(dsg.a));
   public static final dpv<dsh> ae = a("scattered_ore", new dqy(dsh.a));
   public static final dpv<dsl> af = a("random_selector", new dqu(dsl.a));
   public static final dpv<dss> ag = a("simple_random_selector", new drd(dss.a));
   public static final dpv<dsk> ah = a("random_boolean_selector", new dqs(dsk.a));
   public static final dpv<dsa> ai = a("geode", new dqb(dsa.b));
   public static final dpv<drx> aj = a("dripstone_cluster", new dpq(drx.a));
   public static final dpv<dsc> ak = a("large_dripstone", new dql(dsc.a));
   public static final dpv<dsi> al = a("pointed_dripstone", new dqr(dsi.a));
   public static final dpv<dsq> am = a("sculk_patch", new dqz(dsq.a));
   private final Codec<dpi<FC, dpv<FC>>> a;

   private static <C extends drz, F extends dpv<C>> F a(String $$0, F $$1) {
      return io.a(jy.R, $$0, $$1);
   }

   public dpv(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dpi<>(this, $$0x), dpi::c).codec();
   }

   public Codec<dpi<FC, dpv<FC>>> a() {
      return this.a;
   }

   protected void a(csi $$0, ht $$1, dhi $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dhi> a(arv<cva> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(csu $$0, ht $$1, dhi $$2, Predicate<dhi> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dpx<FC> var1);

   public boolean a(FC $$0, csu $$1, djf $$2, ats $$3, ht $$4) {
      return $$1.f_($$4) ? this.a(new dpx<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dhi $$0) {
      return $$0.a(arg.bd);
   }

   public static boolean b(dhi $$0) {
      return $$0.a(arg.af);
   }

   public static boolean a(csg $$0, ht $$1) {
      return $$0.a($$1, dpv::b);
   }

   public static boolean a(Function<ht, dhi> $$0, ht $$1, Predicate<dhi> $$2) {
      ht.a $$3 = new ht.a();

      for (hx $$4 : hx.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ht, dhi> $$0, ht $$1) {
      return a($$0, $$1, dhh.a::i);
   }

   protected void a(csu $$0, ht $$1) {
      ht.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(hx.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
