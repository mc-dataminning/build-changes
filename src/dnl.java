import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dnl<FC extends dpp> {
   public static final dnl<dpw> e = a("no_op", new dof(dpw.a));
   public static final dnl<dql> f = a("tree", new dox(dql.a));
   public static final dnl<dqc> g = a("flower", new doj(dqc.a));
   public static final dnl<dqc> h = a("no_bonemeal_flower", new doj(dqc.a));
   public static final dnl<dqc> i = a("random_patch", new doj(dqc.a));
   public static final dnl<dph> j = a("block_pile", new dmu(dph.a));
   public static final dnl<dqk> k = a("spring_feature", new dow(dqk.a));
   public static final dnl<dpw> l = a("chorus_plant", new dmx(dpw.a));
   public static final dnl<dqd> m = a("replace_single_block", new dom(dqd.a));
   public static final dnl<dpw> n = a("void_start_platform", new dpc(dpw.a));
   public static final dnl<dpw> o = a("desert_well", new dne(dpw.a));
   public static final dnl<dnq> p = a("fossil", new dnp(dnq.a));
   public static final dnl<dpr> q = a("huge_red_mushroom", new dnw(dpr.a));
   public static final dnl<dpr> r = a("huge_brown_mushroom", new dnt(dpr.a));
   public static final dnl<dpw> s = a("ice_spike", new dnx(dpw.a));
   public static final dnl<dpw> t = a("glowstone_blob", new dns(dpw.a));
   public static final dnl<dpw> u = a("freeze_top_layer", new dou(dpw.a));
   public static final dnl<dpw> v = a("vines", new dpb(dpw.a));
   public static final dnl<dpg> w = a("block_column", new dmt(dpg.a));
   public static final dnl<dqo> x = a("vegetation_patch", new dpa(dqo.a));
   public static final dnl<dqo> y = a("waterlogged_vegetation_patch", new dpd(dqo.a));
   public static final dnl<dqf> z = a("root_system", new don(dqf.a));
   public static final dnl<dpu> A = a("multiface_growth", new dod(dpu.a));
   public static final dnl<dqn> B = a("underwater_magma", new doz(dqn.a));
   public static final dnl<dpw> C = a("monster_room", new doc(dpw.a));
   public static final dnl<dpw> D = a("blue_ice", new dmv(dpw.a));
   public static final dnl<dpi> E = a("iceberg", new dny(dpi.a));
   public static final dnl<dpi> F = a("forest_rock", new dms(dpi.a));
   public static final dnl<dpm> G = a("disk", new dnf(dpm.a));
   public static final dnl<doa.a> H = a("lake", new doa(doa.a.a));
   public static final dnl<dpx> I = a("ore", new dog(dpx.a));
   public static final dnl<dqj> J = a("end_spike", new dov(dqj.a));
   public static final dnl<dpw> K = a("end_island", new dnj(dpw.a));
   public static final dnl<dpo> L = a("end_gateway", new dni(dpo.a));
   public static final dor M = a("seagrass", new dor(dpz.k));
   public static final dnl<dpw> N = a("kelp", new dnz(dpw.a));
   public static final dnl<dpw> O = a("coral_tree", new dnc(dpw.a));
   public static final dnl<dpw> P = a("coral_mushroom", new dnb(dpw.a));
   public static final dnl<dpw> Q = a("coral_claw", new dmz(dpw.a));
   public static final dnl<dpk> R = a("sea_pickle", new doq(dpk.a));
   public static final dnl<dqh> S = a("simple_block", new dos(dqh.a));
   public static final dnl<dpz> T = a("bamboo", new dmp(dpz.k));
   public static final dnl<dnu> U = a("huge_fungus", new dnv(dnu.a));
   public static final dnl<dpv> V = a("nether_forest_vegetation", new doe(dpv.c));
   public static final dnl<dpw> W = a("weeping_vines", new dpe(dpw.a));
   public static final dnl<dqm> X = a("twisting_vines", new doy(dqm.a));
   public static final dnl<dpj> Y = a("basalt_columns", new dmq(dpj.a));
   public static final dnl<dpl> Z = a("delta_feature", new dnd(dpl.a));
   public static final dnl<dqe> aa = a("netherrack_replace_blobs", new dol(dqe.a));
   public static final dnl<dpt> ab = a("fill_layer", new dno(dpt.a));
   public static final dmw ac = a("bonus_chest", new dmw(dpw.a));
   public static final dnl<dpw> ad = a("basalt_pillar", new dmr(dpw.a));
   public static final dnl<dpx> ae = a("scattered_ore", new doo(dpx.a));
   public static final dnl<dqb> af = a("random_selector", new dok(dqb.a));
   public static final dnl<dqi> ag = a("simple_random_selector", new dot(dqi.a));
   public static final dnl<dqa> ah = a("random_boolean_selector", new doi(dqa.a));
   public static final dnl<dpq> ai = a("geode", new dnr(dpq.b));
   public static final dnl<dpn> aj = a("dripstone_cluster", new dng(dpn.a));
   public static final dnl<dps> ak = a("large_dripstone", new dob(dps.a));
   public static final dnl<dpy> al = a("pointed_dripstone", new doh(dpy.a));
   public static final dnl<dqg> am = a("sculk_patch", new dop(dqg.a));
   private final Codec<dmy<FC, dnl<FC>>> a;

   private static <C extends dpp, F extends dnl<C>> F a(String $$0, F $$1) {
      return hs.a(jc.R, $$0, $$1);
   }

   public dnl(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dmy<>(this, $$0x), dmy::c).codec();
   }

   public Codec<dmy<FC, dnl<FC>>> a() {
      return this.a;
   }

   protected void a(cps $$0, gv $$1, dey $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dey> a(apy<csk> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqe $$0, gv $$1, dey $$2, Predicate<dey> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dnn<FC> var1);

   public boolean a(FC $$0, cqe $$1, dgv $$2, art $$3, gv $$4) {
      return $$1.f_($$4) ? this.a(new dnn<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dey $$0) {
      return $$0.a(apj.bd);
   }

   public static boolean b(dey $$0) {
      return $$0.a(apj.af);
   }

   public static boolean a(cpq $$0, gv $$1) {
      return $$0.a($$1, dnl::b);
   }

   public static boolean a(Function<gv, dey> $$0, gv $$1, Predicate<dey> $$2) {
      gv.a $$3 = new gv.a();

      for (hb $$4 : hb.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gv, dey> $$0, gv $$1) {
      return a($$0, $$1, dex.a::i);
   }

   protected void a(cqe $$0, gv $$1) {
      gv.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(hb.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
