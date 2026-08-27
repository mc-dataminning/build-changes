import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dnr<FC extends dpv> {
   public static final dnr<dqc> e = a("no_op", new dol(dqc.a));
   public static final dnr<dqr> f = a("tree", new dpd(dqr.a));
   public static final dnr<dqi> g = a("flower", new dop(dqi.a));
   public static final dnr<dqi> h = a("no_bonemeal_flower", new dop(dqi.a));
   public static final dnr<dqi> i = a("random_patch", new dop(dqi.a));
   public static final dnr<dpn> j = a("block_pile", new dna(dpn.a));
   public static final dnr<dqq> k = a("spring_feature", new dpc(dqq.a));
   public static final dnr<dqc> l = a("chorus_plant", new dnd(dqc.a));
   public static final dnr<dqj> m = a("replace_single_block", new dos(dqj.a));
   public static final dnr<dqc> n = a("void_start_platform", new dpi(dqc.a));
   public static final dnr<dqc> o = a("desert_well", new dnk(dqc.a));
   public static final dnr<dnw> p = a("fossil", new dnv(dnw.a));
   public static final dnr<dpx> q = a("huge_red_mushroom", new doc(dpx.a));
   public static final dnr<dpx> r = a("huge_brown_mushroom", new dnz(dpx.a));
   public static final dnr<dqc> s = a("ice_spike", new dod(dqc.a));
   public static final dnr<dqc> t = a("glowstone_blob", new dny(dqc.a));
   public static final dnr<dqc> u = a("freeze_top_layer", new dpa(dqc.a));
   public static final dnr<dqc> v = a("vines", new dph(dqc.a));
   public static final dnr<dpm> w = a("block_column", new dmz(dpm.a));
   public static final dnr<dqu> x = a("vegetation_patch", new dpg(dqu.a));
   public static final dnr<dqu> y = a("waterlogged_vegetation_patch", new dpj(dqu.a));
   public static final dnr<dql> z = a("root_system", new dot(dql.a));
   public static final dnr<dqa> A = a("multiface_growth", new doj(dqa.a));
   public static final dnr<dqt> B = a("underwater_magma", new dpf(dqt.a));
   public static final dnr<dqc> C = a("monster_room", new doi(dqc.a));
   public static final dnr<dqc> D = a("blue_ice", new dnb(dqc.a));
   public static final dnr<dpo> E = a("iceberg", new doe(dpo.a));
   public static final dnr<dpo> F = a("forest_rock", new dmy(dpo.a));
   public static final dnr<dps> G = a("disk", new dnl(dps.a));
   public static final dnr<dog.a> H = a("lake", new dog(dog.a.a));
   public static final dnr<dqd> I = a("ore", new dom(dqd.a));
   public static final dnr<dqp> J = a("end_spike", new dpb(dqp.a));
   public static final dnr<dqc> K = a("end_island", new dnp(dqc.a));
   public static final dnr<dpu> L = a("end_gateway", new dno(dpu.a));
   public static final dox M = a("seagrass", new dox(dqf.k));
   public static final dnr<dqc> N = a("kelp", new dof(dqc.a));
   public static final dnr<dqc> O = a("coral_tree", new dni(dqc.a));
   public static final dnr<dqc> P = a("coral_mushroom", new dnh(dqc.a));
   public static final dnr<dqc> Q = a("coral_claw", new dnf(dqc.a));
   public static final dnr<dpq> R = a("sea_pickle", new dow(dpq.a));
   public static final dnr<dqn> S = a("simple_block", new doy(dqn.a));
   public static final dnr<dqf> T = a("bamboo", new dmv(dqf.k));
   public static final dnr<doa> U = a("huge_fungus", new dob(doa.a));
   public static final dnr<dqb> V = a("nether_forest_vegetation", new dok(dqb.c));
   public static final dnr<dqc> W = a("weeping_vines", new dpk(dqc.a));
   public static final dnr<dqs> X = a("twisting_vines", new dpe(dqs.a));
   public static final dnr<dpp> Y = a("basalt_columns", new dmw(dpp.a));
   public static final dnr<dpr> Z = a("delta_feature", new dnj(dpr.a));
   public static final dnr<dqk> aa = a("netherrack_replace_blobs", new dor(dqk.a));
   public static final dnr<dpz> ab = a("fill_layer", new dnu(dpz.a));
   public static final dnc ac = a("bonus_chest", new dnc(dqc.a));
   public static final dnr<dqc> ad = a("basalt_pillar", new dmx(dqc.a));
   public static final dnr<dqd> ae = a("scattered_ore", new dou(dqd.a));
   public static final dnr<dqh> af = a("random_selector", new doq(dqh.a));
   public static final dnr<dqo> ag = a("simple_random_selector", new doz(dqo.a));
   public static final dnr<dqg> ah = a("random_boolean_selector", new doo(dqg.a));
   public static final dnr<dpw> ai = a("geode", new dnx(dpw.b));
   public static final dnr<dpt> aj = a("dripstone_cluster", new dnm(dpt.a));
   public static final dnr<dpy> ak = a("large_dripstone", new doh(dpy.a));
   public static final dnr<dqe> al = a("pointed_dripstone", new don(dqe.a));
   public static final dnr<dqm> am = a("sculk_patch", new dov(dqm.a));
   private final Codec<dne<FC, dnr<FC>>> a;

   private static <C extends dpv, F extends dnr<C>> F a(String $$0, F $$1) {
      return ht.a(jd.R, $$0, $$1);
   }

   public dnr(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dne<>(this, $$0x), dne::c).codec();
   }

   public Codec<dne<FC, dnr<FC>>> a() {
      return this.a;
   }

   protected void a(cpy $$0, gw $$1, dfe $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dfe> a(aqd<csq> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqk $$0, gw $$1, dfe $$2, Predicate<dfe> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dnt<FC> var1);

   public boolean a(FC $$0, cqk $$1, dhb $$2, arx $$3, gw $$4) {
      return $$1.f_($$4) ? this.a(new dnt<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dfe $$0) {
      return $$0.a(apo.bd);
   }

   public static boolean b(dfe $$0) {
      return $$0.a(apo.af);
   }

   public static boolean a(cpw $$0, gw $$1) {
      return $$0.a($$1, dnr::b);
   }

   public static boolean a(Function<gw, dfe> $$0, gw $$1, Predicate<dfe> $$2) {
      gw.a $$3 = new gw.a();

      for (hc $$4 : hc.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gw, dfe> $$0, gw $$1) {
      return a($$0, $$1, dfd.a::i);
   }

   protected void a(cqk $$0, gw $$1) {
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
