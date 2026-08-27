import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class doo<FC extends dqs> {
   public static final doo<dqz> e = a("no_op", new dpi(dqz.a));
   public static final doo<dro> f = a("tree", new dqa(dro.a));
   public static final doo<drf> g = a("flower", new dpm(drf.a));
   public static final doo<drf> h = a("no_bonemeal_flower", new dpm(drf.a));
   public static final doo<drf> i = a("random_patch", new dpm(drf.a));
   public static final doo<dqk> j = a("block_pile", new dnx(dqk.a));
   public static final doo<drn> k = a("spring_feature", new dpz(drn.a));
   public static final doo<dqz> l = a("chorus_plant", new doa(dqz.a));
   public static final doo<drg> m = a("replace_single_block", new dpp(drg.a));
   public static final doo<dqz> n = a("void_start_platform", new dqf(dqz.a));
   public static final doo<dqz> o = a("desert_well", new doh(dqz.a));
   public static final doo<dot> p = a("fossil", new dos(dot.a));
   public static final doo<dqu> q = a("huge_red_mushroom", new doz(dqu.a));
   public static final doo<dqu> r = a("huge_brown_mushroom", new dow(dqu.a));
   public static final doo<dqz> s = a("ice_spike", new dpa(dqz.a));
   public static final doo<dqz> t = a("glowstone_blob", new dov(dqz.a));
   public static final doo<dqz> u = a("freeze_top_layer", new dpx(dqz.a));
   public static final doo<dqz> v = a("vines", new dqe(dqz.a));
   public static final doo<dqj> w = a("block_column", new dnw(dqj.a));
   public static final doo<drr> x = a("vegetation_patch", new dqd(drr.a));
   public static final doo<drr> y = a("waterlogged_vegetation_patch", new dqg(drr.a));
   public static final doo<dri> z = a("root_system", new dpq(dri.a));
   public static final doo<dqx> A = a("multiface_growth", new dpg(dqx.a));
   public static final doo<drq> B = a("underwater_magma", new dqc(drq.a));
   public static final doo<dqz> C = a("monster_room", new dpf(dqz.a));
   public static final doo<dqz> D = a("blue_ice", new dny(dqz.a));
   public static final doo<dql> E = a("iceberg", new dpb(dql.a));
   public static final doo<dql> F = a("forest_rock", new dnv(dql.a));
   public static final doo<dqp> G = a("disk", new doi(dqp.a));
   public static final doo<dpd.a> H = a("lake", new dpd(dpd.a.a));
   public static final doo<dra> I = a("ore", new dpj(dra.a));
   public static final doo<drm> J = a("end_spike", new dpy(drm.a));
   public static final doo<dqz> K = a("end_island", new dom(dqz.a));
   public static final doo<dqr> L = a("end_gateway", new dol(dqr.a));
   public static final dpu M = a("seagrass", new dpu(drc.k));
   public static final doo<dqz> N = a("kelp", new dpc(dqz.a));
   public static final doo<dqz> O = a("coral_tree", new dof(dqz.a));
   public static final doo<dqz> P = a("coral_mushroom", new doe(dqz.a));
   public static final doo<dqz> Q = a("coral_claw", new doc(dqz.a));
   public static final doo<dqn> R = a("sea_pickle", new dpt(dqn.a));
   public static final doo<drk> S = a("simple_block", new dpv(drk.a));
   public static final doo<drc> T = a("bamboo", new dns(drc.k));
   public static final doo<dox> U = a("huge_fungus", new doy(dox.a));
   public static final doo<dqy> V = a("nether_forest_vegetation", new dph(dqy.c));
   public static final doo<dqz> W = a("weeping_vines", new dqh(dqz.a));
   public static final doo<drp> X = a("twisting_vines", new dqb(drp.a));
   public static final doo<dqm> Y = a("basalt_columns", new dnt(dqm.a));
   public static final doo<dqo> Z = a("delta_feature", new dog(dqo.a));
   public static final doo<drh> aa = a("netherrack_replace_blobs", new dpo(drh.a));
   public static final doo<dqw> ab = a("fill_layer", new dor(dqw.a));
   public static final dnz ac = a("bonus_chest", new dnz(dqz.a));
   public static final doo<dqz> ad = a("basalt_pillar", new dnu(dqz.a));
   public static final doo<dra> ae = a("scattered_ore", new dpr(dra.a));
   public static final doo<dre> af = a("random_selector", new dpn(dre.a));
   public static final doo<drl> ag = a("simple_random_selector", new dpw(drl.a));
   public static final doo<drd> ah = a("random_boolean_selector", new dpl(drd.a));
   public static final doo<dqt> ai = a("geode", new dou(dqt.b));
   public static final doo<dqq> aj = a("dripstone_cluster", new doj(dqq.a));
   public static final doo<dqv> ak = a("large_dripstone", new dpe(dqv.a));
   public static final doo<drb> al = a("pointed_dripstone", new dpk(drb.a));
   public static final doo<drj> am = a("sculk_patch", new dps(drj.a));
   private final Codec<dob<FC, doo<FC>>> a;

   private static <C extends dqs, F extends doo<C>> F a(String $$0, F $$1) {
      return io.a(jy.R, $$0, $$1);
   }

   public doo(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dob<>(this, $$0x), dob::c).codec();
   }

   public Codec<dob<FC, doo<FC>>> a() {
      return this.a;
   }

   protected void a(crh $$0, ht $$1, dgb $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dgb> a(arh<cua> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(crt $$0, ht $$1, dgb $$2, Predicate<dgb> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(doq<FC> var1);

   public boolean a(FC $$0, crt $$1, dhy $$2, ate $$3, ht $$4) {
      return $$1.f_($$4) ? this.a(new doq<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dgb $$0) {
      return $$0.a(aqs.bd);
   }

   public static boolean b(dgb $$0) {
      return $$0.a(aqs.af);
   }

   public static boolean a(crf $$0, ht $$1) {
      return $$0.a($$1, doo::b);
   }

   public static boolean a(Function<ht, dgb> $$0, ht $$1, Predicate<dgb> $$2) {
      ht.a $$3 = new ht.a();

      for (hx $$4 : hx.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ht, dgb> $$0, ht $$1) {
      return a($$0, $$1, dga.a::i);
   }

   protected void a(crt $$0, ht $$1) {
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
