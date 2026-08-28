import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eep<FC extends egt> {
   public static final eep<eha> e = a("no_op", new efj(eha.a));
   public static final eep<ehp> f = a("tree", new egb(ehp.a));
   public static final eep<ehg> g = a("flower", new efn(ehg.a));
   public static final eep<ehg> h = a("no_bonemeal_flower", new efn(ehg.a));
   public static final eep<ehg> i = a("random_patch", new efn(ehg.a));
   public static final eep<egl> j = a("block_pile", new edx(egl.a));
   public static final eep<eho> k = a("spring_feature", new ega(eho.a));
   public static final eep<eha> l = a("chorus_plant", new eea(eha.a));
   public static final eep<ehh> m = a("replace_single_block", new efq(ehh.a));
   public static final eep<eha> n = a("void_start_platform", new egg(eha.a));
   public static final eep<eha> o = a("desert_well", new eeh(eha.a));
   public static final eep<eeu> p = a("fossil", new eet(eeu.a));
   public static final eep<egv> q = a("huge_red_mushroom", new efa(egv.a));
   public static final eep<egv> r = a("huge_brown_mushroom", new eex(egv.a));
   public static final eep<eha> s = a("ice_spike", new efb(eha.a));
   public static final eep<eha> t = a("glowstone_blob", new eew(eha.a));
   public static final eep<eha> u = a("freeze_top_layer", new efy(eha.a));
   public static final eep<eha> v = a("vines", new egf(eha.a));
   public static final eep<egk> w = a("block_column", new edw(egk.a));
   public static final eep<ehs> x = a("vegetation_patch", new ege(ehs.a));
   public static final eep<ehs> y = a("waterlogged_vegetation_patch", new egh(ehs.a));
   public static final eep<ehj> z = a("root_system", new efr(ehj.a));
   public static final eep<egy> A = a("multiface_growth", new efh(egy.a));
   public static final eep<ehr> B = a("underwater_magma", new egd(ehr.a));
   public static final eep<eha> C = a("monster_room", new efg(eha.a));
   public static final eep<eha> D = a("blue_ice", new edy(eha.a));
   public static final eep<egm> E = a("iceberg", new efc(egm.a));
   public static final eep<egm> F = a("forest_rock", new edv(egm.a));
   public static final eep<egq> G = a("disk", new eei(egq.a));
   public static final eep<efe.a> H = a("lake", new efe(efe.a.a));
   public static final eep<ehb> I = a("ore", new efk(ehb.a));
   public static final eep<eha> J = a("end_platform", new een(eha.a));
   public static final eep<ehn> K = a("end_spike", new efz(ehn.a));
   public static final eep<eha> L = a("end_island", new eem(eha.a));
   public static final eep<egs> M = a("end_gateway", new eel(egs.a));
   public static final efv N = a("seagrass", new efv(ehd.k));
   public static final eep<eha> O = a("kelp", new efd(eha.a));
   public static final eep<eha> P = a("coral_tree", new eef(eha.a));
   public static final eep<eha> Q = a("coral_mushroom", new eee(eha.a));
   public static final eep<eha> R = a("coral_claw", new eec(eha.a));
   public static final eep<ego> S = a("sea_pickle", new efu(ego.a));
   public static final eep<ehl> T = a("simple_block", new efw(ehl.a));
   public static final eep<ehd> U = a("bamboo", new eds(ehd.k));
   public static final eep<eey> V = a("huge_fungus", new eez(eey.a));
   public static final eep<egz> W = a("nether_forest_vegetation", new efi(egz.c));
   public static final eep<eha> X = a("weeping_vines", new egi(eha.a));
   public static final eep<ehq> Y = a("twisting_vines", new egc(ehq.a));
   public static final eep<egn> Z = a("basalt_columns", new edt(egn.a));
   public static final eep<egp> aa = a("delta_feature", new eeg(egp.a));
   public static final eep<ehi> ab = a("netherrack_replace_blobs", new efp(ehi.a));
   public static final eep<egx> ac = a("fill_layer", new ees(egx.a));
   public static final edz ad = a("bonus_chest", new edz(eha.a));
   public static final eep<eha> ae = a("basalt_pillar", new edu(eha.a));
   public static final eep<ehb> af = a("scattered_ore", new efs(ehb.a));
   public static final eep<ehf> ag = a("random_selector", new efo(ehf.a));
   public static final eep<ehm> ah = a("simple_random_selector", new efx(ehm.a));
   public static final eep<ehe> ai = a("random_boolean_selector", new efm(ehe.a));
   public static final eep<egu> aj = a("geode", new eev(egu.b));
   public static final eep<egr> ak = a("dripstone_cluster", new eej(egr.a));
   public static final eep<egw> al = a("large_dripstone", new eff(egw.a));
   public static final eep<ehc> am = a("pointed_dripstone", new efl(ehc.a));
   public static final eep<ehk> an = a("sculk_patch", new eft(ehk.a));
   private final MapCodec<eeb<FC, eep<FC>>> a;

   private static <C extends egt, F extends eep<C>> F a(String $$0, F $$1) {
      return kd.a(lz.O, $$0, $$1);
   }

   public eep(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eeb<>(this, $$0x), eeb::c);
   }

   public MapCodec<eeb<FC, eep<FC>>> a() {
      return this.a;
   }

   protected void a(dfn $$0, jh $$1, dvo $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dvo> a(axt<dij> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dgd $$0, jh $$1, dvo $$2, Predicate<dvo> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eer<FC> var1);

   public boolean a(FC $$0, dgd $$1, dxk $$2, azv $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new eer<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dvo $$0) {
      return $$0.a(axd.bf);
   }

   public static boolean b(dvo $$0) {
      return $$0.a(axd.ag);
   }

   public static boolean a(dfl $$0, jh $$1) {
      return $$0.a($$1, eep::b);
   }

   public static boolean a(Function<jh, dvo> $$0, jh $$1, Predicate<dvo> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dvo> $$0, jh $$1) {
      return a($$0, $$1, dvn.a::l);
   }

   protected void a(dgd $$0, jh $$1) {
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
