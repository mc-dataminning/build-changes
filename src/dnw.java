import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dnw<FC extends dqa> {
   public static final dnw<dqh> e = a("no_op", new doq(dqh.a));
   public static final dnw<dqw> f = a("tree", new dpi(dqw.a));
   public static final dnw<dqn> g = a("flower", new dou(dqn.a));
   public static final dnw<dqn> h = a("no_bonemeal_flower", new dou(dqn.a));
   public static final dnw<dqn> i = a("random_patch", new dou(dqn.a));
   public static final dnw<dps> j = a("block_pile", new dnf(dps.a));
   public static final dnw<dqv> k = a("spring_feature", new dph(dqv.a));
   public static final dnw<dqh> l = a("chorus_plant", new dni(dqh.a));
   public static final dnw<dqo> m = a("replace_single_block", new dox(dqo.a));
   public static final dnw<dqh> n = a("void_start_platform", new dpn(dqh.a));
   public static final dnw<dqh> o = a("desert_well", new dnp(dqh.a));
   public static final dnw<dob> p = a("fossil", new doa(dob.a));
   public static final dnw<dqc> q = a("huge_red_mushroom", new doh(dqc.a));
   public static final dnw<dqc> r = a("huge_brown_mushroom", new doe(dqc.a));
   public static final dnw<dqh> s = a("ice_spike", new doi(dqh.a));
   public static final dnw<dqh> t = a("glowstone_blob", new dod(dqh.a));
   public static final dnw<dqh> u = a("freeze_top_layer", new dpf(dqh.a));
   public static final dnw<dqh> v = a("vines", new dpm(dqh.a));
   public static final dnw<dpr> w = a("block_column", new dne(dpr.a));
   public static final dnw<dqz> x = a("vegetation_patch", new dpl(dqz.a));
   public static final dnw<dqz> y = a("waterlogged_vegetation_patch", new dpo(dqz.a));
   public static final dnw<dqq> z = a("root_system", new doy(dqq.a));
   public static final dnw<dqf> A = a("multiface_growth", new doo(dqf.a));
   public static final dnw<dqy> B = a("underwater_magma", new dpk(dqy.a));
   public static final dnw<dqh> C = a("monster_room", new don(dqh.a));
   public static final dnw<dqh> D = a("blue_ice", new dng(dqh.a));
   public static final dnw<dpt> E = a("iceberg", new doj(dpt.a));
   public static final dnw<dpt> F = a("forest_rock", new dnd(dpt.a));
   public static final dnw<dpx> G = a("disk", new dnq(dpx.a));
   public static final dnw<dol.a> H = a("lake", new dol(dol.a.a));
   public static final dnw<dqi> I = a("ore", new dor(dqi.a));
   public static final dnw<dqu> J = a("end_spike", new dpg(dqu.a));
   public static final dnw<dqh> K = a("end_island", new dnu(dqh.a));
   public static final dnw<dpz> L = a("end_gateway", new dnt(dpz.a));
   public static final dpc M = a("seagrass", new dpc(dqk.k));
   public static final dnw<dqh> N = a("kelp", new dok(dqh.a));
   public static final dnw<dqh> O = a("coral_tree", new dnn(dqh.a));
   public static final dnw<dqh> P = a("coral_mushroom", new dnm(dqh.a));
   public static final dnw<dqh> Q = a("coral_claw", new dnk(dqh.a));
   public static final dnw<dpv> R = a("sea_pickle", new dpb(dpv.a));
   public static final dnw<dqs> S = a("simple_block", new dpd(dqs.a));
   public static final dnw<dqk> T = a("bamboo", new dna(dqk.k));
   public static final dnw<dof> U = a("huge_fungus", new dog(dof.a));
   public static final dnw<dqg> V = a("nether_forest_vegetation", new dop(dqg.c));
   public static final dnw<dqh> W = a("weeping_vines", new dpp(dqh.a));
   public static final dnw<dqx> X = a("twisting_vines", new dpj(dqx.a));
   public static final dnw<dpu> Y = a("basalt_columns", new dnb(dpu.a));
   public static final dnw<dpw> Z = a("delta_feature", new dno(dpw.a));
   public static final dnw<dqp> aa = a("netherrack_replace_blobs", new dow(dqp.a));
   public static final dnw<dqe> ab = a("fill_layer", new dnz(dqe.a));
   public static final dnh ac = a("bonus_chest", new dnh(dqh.a));
   public static final dnw<dqh> ad = a("basalt_pillar", new dnc(dqh.a));
   public static final dnw<dqi> ae = a("scattered_ore", new doz(dqi.a));
   public static final dnw<dqm> af = a("random_selector", new dov(dqm.a));
   public static final dnw<dqt> ag = a("simple_random_selector", new dpe(dqt.a));
   public static final dnw<dql> ah = a("random_boolean_selector", new dot(dql.a));
   public static final dnw<dqb> ai = a("geode", new doc(dqb.b));
   public static final dnw<dpy> aj = a("dripstone_cluster", new dnr(dpy.a));
   public static final dnw<dqd> ak = a("large_dripstone", new dom(dqd.a));
   public static final dnw<dqj> al = a("pointed_dripstone", new dos(dqj.a));
   public static final dnw<dqr> am = a("sculk_patch", new dpa(dqr.a));
   private final Codec<dnj<FC, dnw<FC>>> a;

   private static <C extends dqa, F extends dnw<C>> F a(String $$0, F $$1) {
      return ht.a(jd.R, $$0, $$1);
   }

   public dnw(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dnj<>(this, $$0x), dnj::c).codec();
   }

   public Codec<dnj<FC, dnw<FC>>> a() {
      return this.a;
   }

   protected void a(cqd $$0, gw $$1, dfj $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dfj> a(aqi<csv> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqp $$0, gw $$1, dfj $$2, Predicate<dfj> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dny<FC> var1);

   public boolean a(FC $$0, cqp $$1, dhg $$2, asc $$3, gw $$4) {
      return $$1.f_($$4) ? this.a(new dny<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dfj $$0) {
      return $$0.a(apt.bd);
   }

   public static boolean b(dfj $$0) {
      return $$0.a(apt.af);
   }

   public static boolean a(cqb $$0, gw $$1) {
      return $$0.a($$1, dnw::b);
   }

   public static boolean a(Function<gw, dfj> $$0, gw $$1, Predicate<dfj> $$2) {
      gw.a $$3 = new gw.a();

      for (hc $$4 : hc.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gw, dfj> $$0, gw $$1) {
      return a($$0, $$1, dfi.a::i);
   }

   protected void a(cqp $$0, gw $$1) {
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
