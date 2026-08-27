import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dnm<FC extends dpq> {
   public static final dnm<dpx> e = a("no_op", new dog(dpx.a));
   public static final dnm<dqm> f = a("tree", new doy(dqm.a));
   public static final dnm<dqd> g = a("flower", new dok(dqd.a));
   public static final dnm<dqd> h = a("no_bonemeal_flower", new dok(dqd.a));
   public static final dnm<dqd> i = a("random_patch", new dok(dqd.a));
   public static final dnm<dpi> j = a("block_pile", new dmv(dpi.a));
   public static final dnm<dql> k = a("spring_feature", new dox(dql.a));
   public static final dnm<dpx> l = a("chorus_plant", new dmy(dpx.a));
   public static final dnm<dqe> m = a("replace_single_block", new don(dqe.a));
   public static final dnm<dpx> n = a("void_start_platform", new dpd(dpx.a));
   public static final dnm<dpx> o = a("desert_well", new dnf(dpx.a));
   public static final dnm<dnr> p = a("fossil", new dnq(dnr.a));
   public static final dnm<dps> q = a("huge_red_mushroom", new dnx(dps.a));
   public static final dnm<dps> r = a("huge_brown_mushroom", new dnu(dps.a));
   public static final dnm<dpx> s = a("ice_spike", new dny(dpx.a));
   public static final dnm<dpx> t = a("glowstone_blob", new dnt(dpx.a));
   public static final dnm<dpx> u = a("freeze_top_layer", new dov(dpx.a));
   public static final dnm<dpx> v = a("vines", new dpc(dpx.a));
   public static final dnm<dph> w = a("block_column", new dmu(dph.a));
   public static final dnm<dqp> x = a("vegetation_patch", new dpb(dqp.a));
   public static final dnm<dqp> y = a("waterlogged_vegetation_patch", new dpe(dqp.a));
   public static final dnm<dqg> z = a("root_system", new doo(dqg.a));
   public static final dnm<dpv> A = a("multiface_growth", new doe(dpv.a));
   public static final dnm<dqo> B = a("underwater_magma", new dpa(dqo.a));
   public static final dnm<dpx> C = a("monster_room", new dod(dpx.a));
   public static final dnm<dpx> D = a("blue_ice", new dmw(dpx.a));
   public static final dnm<dpj> E = a("iceberg", new dnz(dpj.a));
   public static final dnm<dpj> F = a("forest_rock", new dmt(dpj.a));
   public static final dnm<dpn> G = a("disk", new dng(dpn.a));
   public static final dnm<dob.a> H = a("lake", new dob(dob.a.a));
   public static final dnm<dpy> I = a("ore", new doh(dpy.a));
   public static final dnm<dqk> J = a("end_spike", new dow(dqk.a));
   public static final dnm<dpx> K = a("end_island", new dnk(dpx.a));
   public static final dnm<dpp> L = a("end_gateway", new dnj(dpp.a));
   public static final dos M = a("seagrass", new dos(dqa.k));
   public static final dnm<dpx> N = a("kelp", new doa(dpx.a));
   public static final dnm<dpx> O = a("coral_tree", new dnd(dpx.a));
   public static final dnm<dpx> P = a("coral_mushroom", new dnc(dpx.a));
   public static final dnm<dpx> Q = a("coral_claw", new dna(dpx.a));
   public static final dnm<dpl> R = a("sea_pickle", new dor(dpl.a));
   public static final dnm<dqi> S = a("simple_block", new dot(dqi.a));
   public static final dnm<dqa> T = a("bamboo", new dmq(dqa.k));
   public static final dnm<dnv> U = a("huge_fungus", new dnw(dnv.a));
   public static final dnm<dpw> V = a("nether_forest_vegetation", new dof(dpw.c));
   public static final dnm<dpx> W = a("weeping_vines", new dpf(dpx.a));
   public static final dnm<dqn> X = a("twisting_vines", new doz(dqn.a));
   public static final dnm<dpk> Y = a("basalt_columns", new dmr(dpk.a));
   public static final dnm<dpm> Z = a("delta_feature", new dne(dpm.a));
   public static final dnm<dqf> aa = a("netherrack_replace_blobs", new dom(dqf.a));
   public static final dnm<dpu> ab = a("fill_layer", new dnp(dpu.a));
   public static final dmx ac = a("bonus_chest", new dmx(dpx.a));
   public static final dnm<dpx> ad = a("basalt_pillar", new dms(dpx.a));
   public static final dnm<dpy> ae = a("scattered_ore", new dop(dpy.a));
   public static final dnm<dqc> af = a("random_selector", new dol(dqc.a));
   public static final dnm<dqj> ag = a("simple_random_selector", new dou(dqj.a));
   public static final dnm<dqb> ah = a("random_boolean_selector", new doj(dqb.a));
   public static final dnm<dpr> ai = a("geode", new dns(dpr.b));
   public static final dnm<dpo> aj = a("dripstone_cluster", new dnh(dpo.a));
   public static final dnm<dpt> ak = a("large_dripstone", new doc(dpt.a));
   public static final dnm<dpz> al = a("pointed_dripstone", new doi(dpz.a));
   public static final dnm<dqh> am = a("sculk_patch", new doq(dqh.a));
   private final Codec<dmz<FC, dnm<FC>>> a;

   private static <C extends dpq, F extends dnm<C>> F a(String $$0, F $$1) {
      return hr.a(jb.R, $$0, $$1);
   }

   public dnm(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dmz<>(this, $$0x), dmz::c).codec();
   }

   public Codec<dmz<FC, dnm<FC>>> a() {
      return this.a;
   }

   protected void a(cpt $$0, gu $$1, dez $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dez> a(aqa<csl> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqf $$0, gu $$1, dez $$2, Predicate<dez> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dno<FC> var1);

   public boolean a(FC $$0, cqf $$1, dgw $$2, aru $$3, gu $$4) {
      return $$1.f_($$4) ? this.a(new dno<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dez $$0) {
      return $$0.a(apl.bd);
   }

   public static boolean b(dez $$0) {
      return $$0.a(apl.af);
   }

   public static boolean a(cpr $$0, gu $$1) {
      return $$0.a($$1, dnm::b);
   }

   public static boolean a(Function<gu, dez> $$0, gu $$1, Predicate<dez> $$2) {
      gu.a $$3 = new gu.a();

      for (ha $$4 : ha.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gu, dez> $$0, gu $$1) {
      return a($$0, $$1, dey.a::i);
   }

   protected void a(cqf $$0, gu $$1) {
      gu.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ha.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
