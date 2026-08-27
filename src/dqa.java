import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dqa<FC extends dse> {
   public static final dqa<dsl> e = a("no_op", new dqu(dsl.a));
   public static final dqa<dta> f = a("tree", new drm(dta.a));
   public static final dqa<dsr> g = a("flower", new dqy(dsr.a));
   public static final dqa<dsr> h = a("no_bonemeal_flower", new dqy(dsr.a));
   public static final dqa<dsr> i = a("random_patch", new dqy(dsr.a));
   public static final dqa<drw> j = a("block_pile", new dpj(drw.a));
   public static final dqa<dsz> k = a("spring_feature", new drl(dsz.a));
   public static final dqa<dsl> l = a("chorus_plant", new dpm(dsl.a));
   public static final dqa<dss> m = a("replace_single_block", new drb(dss.a));
   public static final dqa<dsl> n = a("void_start_platform", new drr(dsl.a));
   public static final dqa<dsl> o = a("desert_well", new dpt(dsl.a));
   public static final dqa<dqf> p = a("fossil", new dqe(dqf.a));
   public static final dqa<dsg> q = a("huge_red_mushroom", new dql(dsg.a));
   public static final dqa<dsg> r = a("huge_brown_mushroom", new dqi(dsg.a));
   public static final dqa<dsl> s = a("ice_spike", new dqm(dsl.a));
   public static final dqa<dsl> t = a("glowstone_blob", new dqh(dsl.a));
   public static final dqa<dsl> u = a("freeze_top_layer", new drj(dsl.a));
   public static final dqa<dsl> v = a("vines", new drq(dsl.a));
   public static final dqa<drv> w = a("block_column", new dpi(drv.a));
   public static final dqa<dtd> x = a("vegetation_patch", new drp(dtd.a));
   public static final dqa<dtd> y = a("waterlogged_vegetation_patch", new drs(dtd.a));
   public static final dqa<dsu> z = a("root_system", new drc(dsu.a));
   public static final dqa<dsj> A = a("multiface_growth", new dqs(dsj.a));
   public static final dqa<dtc> B = a("underwater_magma", new dro(dtc.a));
   public static final dqa<dsl> C = a("monster_room", new dqr(dsl.a));
   public static final dqa<dsl> D = a("blue_ice", new dpk(dsl.a));
   public static final dqa<drx> E = a("iceberg", new dqn(drx.a));
   public static final dqa<drx> F = a("forest_rock", new dph(drx.a));
   public static final dqa<dsb> G = a("disk", new dpu(dsb.a));
   public static final dqa<dqp.a> H = a("lake", new dqp(dqp.a.a));
   public static final dqa<dsm> I = a("ore", new dqv(dsm.a));
   public static final dqa<dsy> J = a("end_spike", new drk(dsy.a));
   public static final dqa<dsl> K = a("end_island", new dpy(dsl.a));
   public static final dqa<dsd> L = a("end_gateway", new dpx(dsd.a));
   public static final drg M = a("seagrass", new drg(dso.k));
   public static final dqa<dsl> N = a("kelp", new dqo(dsl.a));
   public static final dqa<dsl> O = a("coral_tree", new dpr(dsl.a));
   public static final dqa<dsl> P = a("coral_mushroom", new dpq(dsl.a));
   public static final dqa<dsl> Q = a("coral_claw", new dpo(dsl.a));
   public static final dqa<drz> R = a("sea_pickle", new drf(drz.a));
   public static final dqa<dsw> S = a("simple_block", new drh(dsw.a));
   public static final dqa<dso> T = a("bamboo", new dpe(dso.k));
   public static final dqa<dqj> U = a("huge_fungus", new dqk(dqj.a));
   public static final dqa<dsk> V = a("nether_forest_vegetation", new dqt(dsk.c));
   public static final dqa<dsl> W = a("weeping_vines", new drt(dsl.a));
   public static final dqa<dtb> X = a("twisting_vines", new drn(dtb.a));
   public static final dqa<dry> Y = a("basalt_columns", new dpf(dry.a));
   public static final dqa<dsa> Z = a("delta_feature", new dps(dsa.a));
   public static final dqa<dst> aa = a("netherrack_replace_blobs", new dra(dst.a));
   public static final dqa<dsi> ab = a("fill_layer", new dqd(dsi.a));
   public static final dpl ac = a("bonus_chest", new dpl(dsl.a));
   public static final dqa<dsl> ad = a("basalt_pillar", new dpg(dsl.a));
   public static final dqa<dsm> ae = a("scattered_ore", new drd(dsm.a));
   public static final dqa<dsq> af = a("random_selector", new dqz(dsq.a));
   public static final dqa<dsx> ag = a("simple_random_selector", new dri(dsx.a));
   public static final dqa<dsp> ah = a("random_boolean_selector", new dqx(dsp.a));
   public static final dqa<dsf> ai = a("geode", new dqg(dsf.b));
   public static final dqa<dsc> aj = a("dripstone_cluster", new dpv(dsc.a));
   public static final dqa<dsh> ak = a("large_dripstone", new dqq(dsh.a));
   public static final dqa<dsn> al = a("pointed_dripstone", new dqw(dsn.a));
   public static final dqa<dsv> am = a("sculk_patch", new dre(dsv.a));
   private final Codec<dpn<FC, dqa<FC>>> a;

   private static <C extends dse, F extends dqa<C>> F a(String $$0, F $$1) {
      return is.a(kc.R, $$0, $$1);
   }

   public dqa(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dpn<>(this, $$0x), dpn::c).codec();
   }

   public Codec<dpn<FC, dqa<FC>>> a() {
      return this.a;
   }

   protected void a(csn $$0, hx $$1, dhn $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dhn> a(arz<cvf> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(csz $$0, hx $$1, dhn $$2, Predicate<dhn> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dqc<FC> var1);

   public boolean a(FC $$0, csz $$1, djk $$2, atw $$3, hx $$4) {
      return $$1.f_($$4) ? this.a(new dqc<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dhn $$0) {
      return $$0.a(ark.bd);
   }

   public static boolean b(dhn $$0) {
      return $$0.a(ark.af);
   }

   public static boolean a(csl $$0, hx $$1) {
      return $$0.a($$1, dqa::b);
   }

   public static boolean a(Function<hx, dhn> $$0, hx $$1, Predicate<dhn> $$2) {
      hx.a $$3 = new hx.a();

      for (ib $$4 : ib.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hx, dhn> $$0, hx $$1) {
      return a($$0, $$1, dhm.a::i);
   }

   protected void a(csz $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ib.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
