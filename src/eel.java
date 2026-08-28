import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eel<FC extends egp> {
   public static final eel<egw> e = a("no_op", new eff(egw.a));
   public static final eel<ehl> f = a("tree", new efx(ehl.a));
   public static final eel<ehc> g = a("flower", new efj(ehc.a));
   public static final eel<ehc> h = a("no_bonemeal_flower", new efj(ehc.a));
   public static final eel<ehc> i = a("random_patch", new efj(ehc.a));
   public static final eel<egh> j = a("block_pile", new edt(egh.a));
   public static final eel<ehk> k = a("spring_feature", new efw(ehk.a));
   public static final eel<egw> l = a("chorus_plant", new edw(egw.a));
   public static final eel<ehd> m = a("replace_single_block", new efm(ehd.a));
   public static final eel<egw> n = a("void_start_platform", new egc(egw.a));
   public static final eel<egw> o = a("desert_well", new eed(egw.a));
   public static final eel<eeq> p = a("fossil", new eep(eeq.a));
   public static final eel<egr> q = a("huge_red_mushroom", new eew(egr.a));
   public static final eel<egr> r = a("huge_brown_mushroom", new eet(egr.a));
   public static final eel<egw> s = a("ice_spike", new eex(egw.a));
   public static final eel<egw> t = a("glowstone_blob", new ees(egw.a));
   public static final eel<egw> u = a("freeze_top_layer", new efu(egw.a));
   public static final eel<egw> v = a("vines", new egb(egw.a));
   public static final eel<egg> w = a("block_column", new eds(egg.a));
   public static final eel<eho> x = a("vegetation_patch", new ega(eho.a));
   public static final eel<eho> y = a("waterlogged_vegetation_patch", new egd(eho.a));
   public static final eel<ehf> z = a("root_system", new efn(ehf.a));
   public static final eel<egu> A = a("multiface_growth", new efd(egu.a));
   public static final eel<ehn> B = a("underwater_magma", new efz(ehn.a));
   public static final eel<egw> C = a("monster_room", new efc(egw.a));
   public static final eel<egw> D = a("blue_ice", new edu(egw.a));
   public static final eel<egi> E = a("iceberg", new eey(egi.a));
   public static final eel<egi> F = a("forest_rock", new edr(egi.a));
   public static final eel<egm> G = a("disk", new eee(egm.a));
   public static final eel<efa.a> H = a("lake", new efa(efa.a.a));
   public static final eel<egx> I = a("ore", new efg(egx.a));
   public static final eel<egw> J = a("end_platform", new eej(egw.a));
   public static final eel<ehj> K = a("end_spike", new efv(ehj.a));
   public static final eel<egw> L = a("end_island", new eei(egw.a));
   public static final eel<ego> M = a("end_gateway", new eeh(ego.a));
   public static final efr N = a("seagrass", new efr(egz.k));
   public static final eel<egw> O = a("kelp", new eez(egw.a));
   public static final eel<egw> P = a("coral_tree", new eeb(egw.a));
   public static final eel<egw> Q = a("coral_mushroom", new eea(egw.a));
   public static final eel<egw> R = a("coral_claw", new edy(egw.a));
   public static final eel<egk> S = a("sea_pickle", new efq(egk.a));
   public static final eel<ehh> T = a("simple_block", new efs(ehh.a));
   public static final eel<egz> U = a("bamboo", new edo(egz.k));
   public static final eel<eeu> V = a("huge_fungus", new eev(eeu.a));
   public static final eel<egv> W = a("nether_forest_vegetation", new efe(egv.c));
   public static final eel<egw> X = a("weeping_vines", new ege(egw.a));
   public static final eel<ehm> Y = a("twisting_vines", new efy(ehm.a));
   public static final eel<egj> Z = a("basalt_columns", new edp(egj.a));
   public static final eel<egl> aa = a("delta_feature", new eec(egl.a));
   public static final eel<ehe> ab = a("netherrack_replace_blobs", new efl(ehe.a));
   public static final eel<egt> ac = a("fill_layer", new eeo(egt.a));
   public static final edv ad = a("bonus_chest", new edv(egw.a));
   public static final eel<egw> ae = a("basalt_pillar", new edq(egw.a));
   public static final eel<egx> af = a("scattered_ore", new efo(egx.a));
   public static final eel<ehb> ag = a("random_selector", new efk(ehb.a));
   public static final eel<ehi> ah = a("simple_random_selector", new eft(ehi.a));
   public static final eel<eha> ai = a("random_boolean_selector", new efi(eha.a));
   public static final eel<egq> aj = a("geode", new eer(egq.b));
   public static final eel<egn> ak = a("dripstone_cluster", new eef(egn.a));
   public static final eel<egs> al = a("large_dripstone", new efb(egs.a));
   public static final eel<egy> am = a("pointed_dripstone", new efh(egy.a));
   public static final eel<ehg> an = a("sculk_patch", new efp(ehg.a));
   private final MapCodec<edx<FC, eel<FC>>> a;

   private static <C extends egp, F extends eel<C>> F a(String $$0, F $$1) {
      return kd.a(ly.O, $$0, $$1);
   }

   public eel(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new edx<>(this, $$0x), edx::c);
   }

   public MapCodec<edx<FC, eel<FC>>> a() {
      return this.a;
   }

   protected void a(dfj $$0, jh $$1, dvj $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dvj> a(axq<die> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dfy $$0, jh $$1, dvj $$2, Predicate<dvj> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(een<FC> var1);

   public boolean a(FC $$0, dfy $$1, dxg $$2, azs $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new een<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dvj $$0) {
      return $$0.a(axa.bf);
   }

   public static boolean b(dvj $$0) {
      return $$0.a(axa.ag);
   }

   public static boolean a(dfh $$0, jh $$1) {
      return $$0.a($$1, eel::b);
   }

   public static boolean a(Function<jh, dvj> $$0, jh $$1, Predicate<dvj> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dvj> $$0, jh $$1) {
      return a($$0, $$1, dvi.a::l);
   }

   protected void a(dfy $$0, jh $$1) {
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
