import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dpj<FC extends drn> {
   public static final dpj<dru> e = a("no_op", new dqd(dru.a));
   public static final dpj<dsj> f = a("tree", new dqv(dsj.a));
   public static final dpj<dsa> g = a("flower", new dqh(dsa.a));
   public static final dpj<dsa> h = a("no_bonemeal_flower", new dqh(dsa.a));
   public static final dpj<dsa> i = a("random_patch", new dqh(dsa.a));
   public static final dpj<drf> j = a("block_pile", new dos(drf.a));
   public static final dpj<dsi> k = a("spring_feature", new dqu(dsi.a));
   public static final dpj<dru> l = a("chorus_plant", new dov(dru.a));
   public static final dpj<dsb> m = a("replace_single_block", new dqk(dsb.a));
   public static final dpj<dru> n = a("void_start_platform", new dra(dru.a));
   public static final dpj<dru> o = a("desert_well", new dpc(dru.a));
   public static final dpj<dpo> p = a("fossil", new dpn(dpo.a));
   public static final dpj<drp> q = a("huge_red_mushroom", new dpu(drp.a));
   public static final dpj<drp> r = a("huge_brown_mushroom", new dpr(drp.a));
   public static final dpj<dru> s = a("ice_spike", new dpv(dru.a));
   public static final dpj<dru> t = a("glowstone_blob", new dpq(dru.a));
   public static final dpj<dru> u = a("freeze_top_layer", new dqs(dru.a));
   public static final dpj<dru> v = a("vines", new dqz(dru.a));
   public static final dpj<dre> w = a("block_column", new dor(dre.a));
   public static final dpj<dsm> x = a("vegetation_patch", new dqy(dsm.a));
   public static final dpj<dsm> y = a("waterlogged_vegetation_patch", new drb(dsm.a));
   public static final dpj<dsd> z = a("root_system", new dql(dsd.a));
   public static final dpj<drs> A = a("multiface_growth", new dqb(drs.a));
   public static final dpj<dsl> B = a("underwater_magma", new dqx(dsl.a));
   public static final dpj<dru> C = a("monster_room", new dqa(dru.a));
   public static final dpj<dru> D = a("blue_ice", new dot(dru.a));
   public static final dpj<drg> E = a("iceberg", new dpw(drg.a));
   public static final dpj<drg> F = a("forest_rock", new doq(drg.a));
   public static final dpj<drk> G = a("disk", new dpd(drk.a));
   public static final dpj<dpy.a> H = a("lake", new dpy(dpy.a.a));
   public static final dpj<drv> I = a("ore", new dqe(drv.a));
   public static final dpj<dsh> J = a("end_spike", new dqt(dsh.a));
   public static final dpj<dru> K = a("end_island", new dph(dru.a));
   public static final dpj<drm> L = a("end_gateway", new dpg(drm.a));
   public static final dqp M = a("seagrass", new dqp(drx.k));
   public static final dpj<dru> N = a("kelp", new dpx(dru.a));
   public static final dpj<dru> O = a("coral_tree", new dpa(dru.a));
   public static final dpj<dru> P = a("coral_mushroom", new doz(dru.a));
   public static final dpj<dru> Q = a("coral_claw", new dox(dru.a));
   public static final dpj<dri> R = a("sea_pickle", new dqo(dri.a));
   public static final dpj<dsf> S = a("simple_block", new dqq(dsf.a));
   public static final dpj<drx> T = a("bamboo", new don(drx.k));
   public static final dpj<dps> U = a("huge_fungus", new dpt(dps.a));
   public static final dpj<drt> V = a("nether_forest_vegetation", new dqc(drt.c));
   public static final dpj<dru> W = a("weeping_vines", new drc(dru.a));
   public static final dpj<dsk> X = a("twisting_vines", new dqw(dsk.a));
   public static final dpj<drh> Y = a("basalt_columns", new doo(drh.a));
   public static final dpj<drj> Z = a("delta_feature", new dpb(drj.a));
   public static final dpj<dsc> aa = a("netherrack_replace_blobs", new dqj(dsc.a));
   public static final dpj<drr> ab = a("fill_layer", new dpm(drr.a));
   public static final dou ac = a("bonus_chest", new dou(dru.a));
   public static final dpj<dru> ad = a("basalt_pillar", new dop(dru.a));
   public static final dpj<drv> ae = a("scattered_ore", new dqm(drv.a));
   public static final dpj<drz> af = a("random_selector", new dqi(drz.a));
   public static final dpj<dsg> ag = a("simple_random_selector", new dqr(dsg.a));
   public static final dpj<dry> ah = a("random_boolean_selector", new dqg(dry.a));
   public static final dpj<dro> ai = a("geode", new dpp(dro.b));
   public static final dpj<drl> aj = a("dripstone_cluster", new dpe(drl.a));
   public static final dpj<drq> ak = a("large_dripstone", new dpz(drq.a));
   public static final dpj<drw> al = a("pointed_dripstone", new dqf(drw.a));
   public static final dpj<dse> am = a("sculk_patch", new dqn(dse.a));
   private final Codec<dow<FC, dpj<FC>>> a;

   private static <C extends drn, F extends dpj<C>> F a(String $$0, F $$1) {
      return io.a(jy.R, $$0, $$1);
   }

   public dpj(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dow<>(this, $$0x), dow::c).codec();
   }

   public Codec<dow<FC, dpj<FC>>> a() {
      return this.a;
   }

   protected void a(csa $$0, ht $$1, dgw $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dgw> a(arr<cut> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(csm $$0, ht $$1, dgw $$2, Predicate<dgw> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dpl<FC> var1);

   public boolean a(FC $$0, csm $$1, dit $$2, ato $$3, ht $$4) {
      return $$1.f_($$4) ? this.a(new dpl<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dgw $$0) {
      return $$0.a(arc.bd);
   }

   public static boolean b(dgw $$0) {
      return $$0.a(arc.af);
   }

   public static boolean a(cry $$0, ht $$1) {
      return $$0.a($$1, dpj::b);
   }

   public static boolean a(Function<ht, dgw> $$0, ht $$1, Predicate<dgw> $$2) {
      ht.a $$3 = new ht.a();

      for (hx $$4 : hx.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ht, dgw> $$0, ht $$1) {
      return a($$0, $$1, dgv.a::i);
   }

   protected void a(csm $$0, ht $$1) {
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
