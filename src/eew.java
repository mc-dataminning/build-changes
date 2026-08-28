import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eew<FC extends eha> {
   public static final eew<ehh> e = a("no_op", new efq(ehh.a));
   public static final eew<ehw> f = a("tree", new egi(ehw.a));
   public static final eew<ehn> g = a("flower", new efu(ehn.a));
   public static final eew<ehn> h = a("no_bonemeal_flower", new efu(ehn.a));
   public static final eew<ehn> i = a("random_patch", new efu(ehn.a));
   public static final eew<egs> j = a("block_pile", new eee(egs.a));
   public static final eew<ehv> k = a("spring_feature", new egh(ehv.a));
   public static final eew<ehh> l = a("chorus_plant", new eeh(ehh.a));
   public static final eew<eho> m = a("replace_single_block", new efx(eho.a));
   public static final eew<ehh> n = a("void_start_platform", new egn(ehh.a));
   public static final eew<ehh> o = a("desert_well", new eeo(ehh.a));
   public static final eew<efb> p = a("fossil", new efa(efb.a));
   public static final eew<ehc> q = a("huge_red_mushroom", new efh(ehc.a));
   public static final eew<ehc> r = a("huge_brown_mushroom", new efe(ehc.a));
   public static final eew<ehh> s = a("ice_spike", new efi(ehh.a));
   public static final eew<ehh> t = a("glowstone_blob", new efd(ehh.a));
   public static final eew<ehh> u = a("freeze_top_layer", new egf(ehh.a));
   public static final eew<ehh> v = a("vines", new egm(ehh.a));
   public static final eew<egr> w = a("block_column", new eed(egr.a));
   public static final eew<ehz> x = a("vegetation_patch", new egl(ehz.a));
   public static final eew<ehz> y = a("waterlogged_vegetation_patch", new ego(ehz.a));
   public static final eew<ehq> z = a("root_system", new efy(ehq.a));
   public static final eew<ehf> A = a("multiface_growth", new efo(ehf.a));
   public static final eew<ehy> B = a("underwater_magma", new egk(ehy.a));
   public static final eew<ehh> C = a("monster_room", new efn(ehh.a));
   public static final eew<ehh> D = a("blue_ice", new eef(ehh.a));
   public static final eew<egt> E = a("iceberg", new efj(egt.a));
   public static final eew<egt> F = a("forest_rock", new eec(egt.a));
   public static final eew<egx> G = a("disk", new eep(egx.a));
   public static final eew<efl.a> H = a("lake", new efl(efl.a.a));
   public static final eew<ehi> I = a("ore", new efr(ehi.a));
   public static final eew<ehh> J = a("end_platform", new eeu(ehh.a));
   public static final eew<ehu> K = a("end_spike", new egg(ehu.a));
   public static final eew<ehh> L = a("end_island", new eet(ehh.a));
   public static final eew<egz> M = a("end_gateway", new ees(egz.a));
   public static final egc N = a("seagrass", new egc(ehk.k));
   public static final eew<ehh> O = a("kelp", new efk(ehh.a));
   public static final eew<ehh> P = a("coral_tree", new eem(ehh.a));
   public static final eew<ehh> Q = a("coral_mushroom", new eel(ehh.a));
   public static final eew<ehh> R = a("coral_claw", new eej(ehh.a));
   public static final eew<egv> S = a("sea_pickle", new egb(egv.a));
   public static final eew<ehs> T = a("simple_block", new egd(ehs.a));
   public static final eew<ehk> U = a("bamboo", new edz(ehk.k));
   public static final eew<eff> V = a("huge_fungus", new efg(eff.a));
   public static final eew<ehg> W = a("nether_forest_vegetation", new efp(ehg.c));
   public static final eew<ehh> X = a("weeping_vines", new egp(ehh.a));
   public static final eew<ehx> Y = a("twisting_vines", new egj(ehx.a));
   public static final eew<egu> Z = a("basalt_columns", new eea(egu.a));
   public static final eew<egw> aa = a("delta_feature", new een(egw.a));
   public static final eew<ehp> ab = a("netherrack_replace_blobs", new efw(ehp.a));
   public static final eew<ehe> ac = a("fill_layer", new eez(ehe.a));
   public static final eeg ad = a("bonus_chest", new eeg(ehh.a));
   public static final eew<ehh> ae = a("basalt_pillar", new eeb(ehh.a));
   public static final eew<ehi> af = a("scattered_ore", new efz(ehi.a));
   public static final eew<ehm> ag = a("random_selector", new efv(ehm.a));
   public static final eew<eht> ah = a("simple_random_selector", new ege(eht.a));
   public static final eew<ehl> ai = a("random_boolean_selector", new eft(ehl.a));
   public static final eew<ehb> aj = a("geode", new efc(ehb.b));
   public static final eew<egy> ak = a("dripstone_cluster", new eeq(egy.a));
   public static final eew<ehd> al = a("large_dripstone", new efm(ehd.a));
   public static final eew<ehj> am = a("pointed_dripstone", new efs(ehj.a));
   public static final eew<ehr> an = a("sculk_patch", new ega(ehr.a));
   private final MapCodec<eei<FC, eew<FC>>> a;

   private static <C extends eha, F extends eew<C>> F a(String $$0, F $$1) {
      return kd.a(lz.O, $$0, $$1);
   }

   public eew(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eei<>(this, $$0x), eei::c);
   }

   public MapCodec<eei<FC, eew<FC>>> a() {
      return this.a;
   }

   protected void a(dfu $$0, jh $$1, dvv $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dvv> a(axs<diq> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dgk $$0, jh $$1, dvv $$2, Predicate<dvv> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eey<FC> var1);

   public boolean a(FC $$0, dgk $$1, dxr $$2, azu $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new eey<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dvv $$0) {
      return $$0.a(axc.bf);
   }

   public static boolean b(dvv $$0) {
      return $$0.a(axc.ag);
   }

   public static boolean a(dfs $$0, jh $$1) {
      return $$0.a($$1, eew::b);
   }

   public static boolean a(Function<jh, dvv> $$0, jh $$1, Predicate<dvv> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dvv> $$0, jh $$1) {
      return a($$0, $$1, dvu.a::l);
   }

   protected void a(dgk $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jm.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
