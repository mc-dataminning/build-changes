import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dnq<FC extends dpu> {
   public static final dnq<dqb> e = a("no_op", new dok(dqb.a));
   public static final dnq<dqq> f = a("tree", new dpc(dqq.a));
   public static final dnq<dqh> g = a("flower", new doo(dqh.a));
   public static final dnq<dqh> h = a("no_bonemeal_flower", new doo(dqh.a));
   public static final dnq<dqh> i = a("random_patch", new doo(dqh.a));
   public static final dnq<dpm> j = a("block_pile", new dmz(dpm.a));
   public static final dnq<dqp> k = a("spring_feature", new dpb(dqp.a));
   public static final dnq<dqb> l = a("chorus_plant", new dnc(dqb.a));
   public static final dnq<dqi> m = a("replace_single_block", new dor(dqi.a));
   public static final dnq<dqb> n = a("void_start_platform", new dph(dqb.a));
   public static final dnq<dqb> o = a("desert_well", new dnj(dqb.a));
   public static final dnq<dnv> p = a("fossil", new dnu(dnv.a));
   public static final dnq<dpw> q = a("huge_red_mushroom", new dob(dpw.a));
   public static final dnq<dpw> r = a("huge_brown_mushroom", new dny(dpw.a));
   public static final dnq<dqb> s = a("ice_spike", new doc(dqb.a));
   public static final dnq<dqb> t = a("glowstone_blob", new dnx(dqb.a));
   public static final dnq<dqb> u = a("freeze_top_layer", new doz(dqb.a));
   public static final dnq<dqb> v = a("vines", new dpg(dqb.a));
   public static final dnq<dpl> w = a("block_column", new dmy(dpl.a));
   public static final dnq<dqt> x = a("vegetation_patch", new dpf(dqt.a));
   public static final dnq<dqt> y = a("waterlogged_vegetation_patch", new dpi(dqt.a));
   public static final dnq<dqk> z = a("root_system", new dos(dqk.a));
   public static final dnq<dpz> A = a("multiface_growth", new doi(dpz.a));
   public static final dnq<dqs> B = a("underwater_magma", new dpe(dqs.a));
   public static final dnq<dqb> C = a("monster_room", new doh(dqb.a));
   public static final dnq<dqb> D = a("blue_ice", new dna(dqb.a));
   public static final dnq<dpn> E = a("iceberg", new dod(dpn.a));
   public static final dnq<dpn> F = a("forest_rock", new dmx(dpn.a));
   public static final dnq<dpr> G = a("disk", new dnk(dpr.a));
   public static final dnq<dof.a> H = a("lake", new dof(dof.a.a));
   public static final dnq<dqc> I = a("ore", new dol(dqc.a));
   public static final dnq<dqo> J = a("end_spike", new dpa(dqo.a));
   public static final dnq<dqb> K = a("end_island", new dno(dqb.a));
   public static final dnq<dpt> L = a("end_gateway", new dnn(dpt.a));
   public static final dow M = a("seagrass", new dow(dqe.k));
   public static final dnq<dqb> N = a("kelp", new doe(dqb.a));
   public static final dnq<dqb> O = a("coral_tree", new dnh(dqb.a));
   public static final dnq<dqb> P = a("coral_mushroom", new dng(dqb.a));
   public static final dnq<dqb> Q = a("coral_claw", new dne(dqb.a));
   public static final dnq<dpp> R = a("sea_pickle", new dov(dpp.a));
   public static final dnq<dqm> S = a("simple_block", new dox(dqm.a));
   public static final dnq<dqe> T = a("bamboo", new dmu(dqe.k));
   public static final dnq<dnz> U = a("huge_fungus", new doa(dnz.a));
   public static final dnq<dqa> V = a("nether_forest_vegetation", new doj(dqa.c));
   public static final dnq<dqb> W = a("weeping_vines", new dpj(dqb.a));
   public static final dnq<dqr> X = a("twisting_vines", new dpd(dqr.a));
   public static final dnq<dpo> Y = a("basalt_columns", new dmv(dpo.a));
   public static final dnq<dpq> Z = a("delta_feature", new dni(dpq.a));
   public static final dnq<dqj> aa = a("netherrack_replace_blobs", new doq(dqj.a));
   public static final dnq<dpy> ab = a("fill_layer", new dnt(dpy.a));
   public static final dnb ac = a("bonus_chest", new dnb(dqb.a));
   public static final dnq<dqb> ad = a("basalt_pillar", new dmw(dqb.a));
   public static final dnq<dqc> ae = a("scattered_ore", new dot(dqc.a));
   public static final dnq<dqg> af = a("random_selector", new dop(dqg.a));
   public static final dnq<dqn> ag = a("simple_random_selector", new doy(dqn.a));
   public static final dnq<dqf> ah = a("random_boolean_selector", new don(dqf.a));
   public static final dnq<dpv> ai = a("geode", new dnw(dpv.b));
   public static final dnq<dps> aj = a("dripstone_cluster", new dnl(dps.a));
   public static final dnq<dpx> ak = a("large_dripstone", new dog(dpx.a));
   public static final dnq<dqd> al = a("pointed_dripstone", new dom(dqd.a));
   public static final dnq<dql> am = a("sculk_patch", new dou(dql.a));
   private final Codec<dnd<FC, dnq<FC>>> a;

   private static <C extends dpu, F extends dnq<C>> F a(String $$0, F $$1) {
      return hq.a(jb.R, $$0, $$1);
   }

   public dnq(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dnd<>(this, $$0x), dnd::c).codec();
   }

   public Codec<dnd<FC, dnq<FC>>> a() {
      return this.a;
   }

   protected void a(cqj $$0, gw $$1, dfd $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dfd> a(aqk<ctc> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqv $$0, gw $$1, dfd $$2, Predicate<dfd> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dns<FC> var1);

   public boolean a(FC $$0, cqv $$1, dha $$2, ash $$3, gw $$4) {
      return $$1.f_($$4) ? this.a(new dns<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dfd $$0) {
      return $$0.a(apv.bd);
   }

   public static boolean b(dfd $$0) {
      return $$0.a(apv.af);
   }

   public static boolean a(cqh $$0, gw $$1) {
      return $$0.a($$1, dnq::b);
   }

   public static boolean a(Function<gw, dfd> $$0, gw $$1, Predicate<dfd> $$2) {
      gw.a $$3 = new gw.a();

      for (ha $$4 : ha.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gw, dfd> $$0, gw $$1) {
      return a($$0, $$1, dfc.a::i);
   }

   protected void a(cqv $$0, gw $$1) {
      gw.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ha.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
