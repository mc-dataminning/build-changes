import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dny<FC extends dqc> {
   public static final dny<dqj> e = a("no_op", new dos(dqj.a));
   public static final dny<dqy> f = a("tree", new dpk(dqy.a));
   public static final dny<dqp> g = a("flower", new dow(dqp.a));
   public static final dny<dqp> h = a("no_bonemeal_flower", new dow(dqp.a));
   public static final dny<dqp> i = a("random_patch", new dow(dqp.a));
   public static final dny<dpu> j = a("block_pile", new dnh(dpu.a));
   public static final dny<dqx> k = a("spring_feature", new dpj(dqx.a));
   public static final dny<dqj> l = a("chorus_plant", new dnk(dqj.a));
   public static final dny<dqq> m = a("replace_single_block", new doz(dqq.a));
   public static final dny<dqj> n = a("void_start_platform", new dpp(dqj.a));
   public static final dny<dqj> o = a("desert_well", new dnr(dqj.a));
   public static final dny<dod> p = a("fossil", new doc(dod.a));
   public static final dny<dqe> q = a("huge_red_mushroom", new doj(dqe.a));
   public static final dny<dqe> r = a("huge_brown_mushroom", new dog(dqe.a));
   public static final dny<dqj> s = a("ice_spike", new dok(dqj.a));
   public static final dny<dqj> t = a("glowstone_blob", new dof(dqj.a));
   public static final dny<dqj> u = a("freeze_top_layer", new dph(dqj.a));
   public static final dny<dqj> v = a("vines", new dpo(dqj.a));
   public static final dny<dpt> w = a("block_column", new dng(dpt.a));
   public static final dny<drb> x = a("vegetation_patch", new dpn(drb.a));
   public static final dny<drb> y = a("waterlogged_vegetation_patch", new dpq(drb.a));
   public static final dny<dqs> z = a("root_system", new dpa(dqs.a));
   public static final dny<dqh> A = a("multiface_growth", new doq(dqh.a));
   public static final dny<dra> B = a("underwater_magma", new dpm(dra.a));
   public static final dny<dqj> C = a("monster_room", new dop(dqj.a));
   public static final dny<dqj> D = a("blue_ice", new dni(dqj.a));
   public static final dny<dpv> E = a("iceberg", new dol(dpv.a));
   public static final dny<dpv> F = a("forest_rock", new dnf(dpv.a));
   public static final dny<dpz> G = a("disk", new dns(dpz.a));
   public static final dny<don.a> H = a("lake", new don(don.a.a));
   public static final dny<dqk> I = a("ore", new dot(dqk.a));
   public static final dny<dqw> J = a("end_spike", new dpi(dqw.a));
   public static final dny<dqj> K = a("end_island", new dnw(dqj.a));
   public static final dny<dqb> L = a("end_gateway", new dnv(dqb.a));
   public static final dpe M = a("seagrass", new dpe(dqm.k));
   public static final dny<dqj> N = a("kelp", new dom(dqj.a));
   public static final dny<dqj> O = a("coral_tree", new dnp(dqj.a));
   public static final dny<dqj> P = a("coral_mushroom", new dno(dqj.a));
   public static final dny<dqj> Q = a("coral_claw", new dnm(dqj.a));
   public static final dny<dpx> R = a("sea_pickle", new dpd(dpx.a));
   public static final dny<dqu> S = a("simple_block", new dpf(dqu.a));
   public static final dny<dqm> T = a("bamboo", new dnc(dqm.k));
   public static final dny<doh> U = a("huge_fungus", new doi(doh.a));
   public static final dny<dqi> V = a("nether_forest_vegetation", new dor(dqi.c));
   public static final dny<dqj> W = a("weeping_vines", new dpr(dqj.a));
   public static final dny<dqz> X = a("twisting_vines", new dpl(dqz.a));
   public static final dny<dpw> Y = a("basalt_columns", new dnd(dpw.a));
   public static final dny<dpy> Z = a("delta_feature", new dnq(dpy.a));
   public static final dny<dqr> aa = a("netherrack_replace_blobs", new doy(dqr.a));
   public static final dny<dqg> ab = a("fill_layer", new dob(dqg.a));
   public static final dnj ac = a("bonus_chest", new dnj(dqj.a));
   public static final dny<dqj> ad = a("basalt_pillar", new dne(dqj.a));
   public static final dny<dqk> ae = a("scattered_ore", new dpb(dqk.a));
   public static final dny<dqo> af = a("random_selector", new dox(dqo.a));
   public static final dny<dqv> ag = a("simple_random_selector", new dpg(dqv.a));
   public static final dny<dqn> ah = a("random_boolean_selector", new dov(dqn.a));
   public static final dny<dqd> ai = a("geode", new doe(dqd.b));
   public static final dny<dqa> aj = a("dripstone_cluster", new dnt(dqa.a));
   public static final dny<dqf> ak = a("large_dripstone", new doo(dqf.a));
   public static final dny<dql> al = a("pointed_dripstone", new dou(dql.a));
   public static final dny<dqt> am = a("sculk_patch", new dpc(dqt.a));
   private final Codec<dnl<FC, dny<FC>>> a;

   private static <C extends dqc, F extends dny<C>> F a(String $$0, F $$1) {
      return ht.a(jd.R, $$0, $$1);
   }

   public dny(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dnl<>(this, $$0x), dnl::c).codec();
   }

   public Codec<dnl<FC, dny<FC>>> a() {
      return this.a;
   }

   protected void a(cqf $$0, gw $$1, dfl $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dfl> a(aqj<csx> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqr $$0, gw $$1, dfl $$2, Predicate<dfl> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(doa<FC> var1);

   public boolean a(FC $$0, cqr $$1, dhi $$2, ase $$3, gw $$4) {
      return $$1.f_($$4) ? this.a(new doa<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dfl $$0) {
      return $$0.a(apu.bd);
   }

   public static boolean b(dfl $$0) {
      return $$0.a(apu.af);
   }

   public static boolean a(cqd $$0, gw $$1) {
      return $$0.a($$1, dny::b);
   }

   public static boolean a(Function<gw, dfl> $$0, gw $$1, Predicate<dfl> $$2) {
      gw.a $$3 = new gw.a();

      for (hc $$4 : hc.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gw, dfl> $$0, gw $$1) {
      return a($$0, $$1, dfk.a::i);
   }

   protected void a(cqr $$0, gw $$1) {
      gw.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(hc.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
