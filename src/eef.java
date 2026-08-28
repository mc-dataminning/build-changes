import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eef<FC extends egj> {
   public static final eef<egq> e = a("no_op", new eez(egq.a));
   public static final eef<ehf> f = a("tree", new efr(ehf.a));
   public static final eef<egw> g = a("flower", new efd(egw.a));
   public static final eef<egw> h = a("no_bonemeal_flower", new efd(egw.a));
   public static final eef<egw> i = a("random_patch", new efd(egw.a));
   public static final eef<egb> j = a("block_pile", new edn(egb.a));
   public static final eef<ehe> k = a("spring_feature", new efq(ehe.a));
   public static final eef<egq> l = a("chorus_plant", new edq(egq.a));
   public static final eef<egx> m = a("replace_single_block", new efg(egx.a));
   public static final eef<egq> n = a("void_start_platform", new efw(egq.a));
   public static final eef<egq> o = a("desert_well", new edx(egq.a));
   public static final eef<eek> p = a("fossil", new eej(eek.a));
   public static final eef<egl> q = a("huge_red_mushroom", new eeq(egl.a));
   public static final eef<egl> r = a("huge_brown_mushroom", new een(egl.a));
   public static final eef<egq> s = a("ice_spike", new eer(egq.a));
   public static final eef<egq> t = a("glowstone_blob", new eem(egq.a));
   public static final eef<egq> u = a("freeze_top_layer", new efo(egq.a));
   public static final eef<egq> v = a("vines", new efv(egq.a));
   public static final eef<ega> w = a("block_column", new edm(ega.a));
   public static final eef<ehi> x = a("vegetation_patch", new efu(ehi.a));
   public static final eef<ehi> y = a("waterlogged_vegetation_patch", new efx(ehi.a));
   public static final eef<egz> z = a("root_system", new efh(egz.a));
   public static final eef<ego> A = a("multiface_growth", new eex(ego.a));
   public static final eef<ehh> B = a("underwater_magma", new eft(ehh.a));
   public static final eef<egq> C = a("monster_room", new eew(egq.a));
   public static final eef<egq> D = a("blue_ice", new edo(egq.a));
   public static final eef<egc> E = a("iceberg", new ees(egc.a));
   public static final eef<egc> F = a("forest_rock", new edl(egc.a));
   public static final eef<egg> G = a("disk", new edy(egg.a));
   public static final eef<eeu.a> H = a("lake", new eeu(eeu.a.a));
   public static final eef<egr> I = a("ore", new efa(egr.a));
   public static final eef<egq> J = a("end_platform", new eed(egq.a));
   public static final eef<ehd> K = a("end_spike", new efp(ehd.a));
   public static final eef<egq> L = a("end_island", new eec(egq.a));
   public static final eef<egi> M = a("end_gateway", new eeb(egi.a));
   public static final efl N = a("seagrass", new efl(egt.k));
   public static final eef<egq> O = a("kelp", new eet(egq.a));
   public static final eef<egq> P = a("coral_tree", new edv(egq.a));
   public static final eef<egq> Q = a("coral_mushroom", new edu(egq.a));
   public static final eef<egq> R = a("coral_claw", new eds(egq.a));
   public static final eef<ege> S = a("sea_pickle", new efk(ege.a));
   public static final eef<ehb> T = a("simple_block", new efm(ehb.a));
   public static final eef<egt> U = a("bamboo", new edi(egt.k));
   public static final eef<eeo> V = a("huge_fungus", new eep(eeo.a));
   public static final eef<egp> W = a("nether_forest_vegetation", new eey(egp.c));
   public static final eef<egq> X = a("weeping_vines", new efy(egq.a));
   public static final eef<ehg> Y = a("twisting_vines", new efs(ehg.a));
   public static final eef<egd> Z = a("basalt_columns", new edj(egd.a));
   public static final eef<egf> aa = a("delta_feature", new edw(egf.a));
   public static final eef<egy> ab = a("netherrack_replace_blobs", new eff(egy.a));
   public static final eef<egn> ac = a("fill_layer", new eei(egn.a));
   public static final edp ad = a("bonus_chest", new edp(egq.a));
   public static final eef<egq> ae = a("basalt_pillar", new edk(egq.a));
   public static final eef<egr> af = a("scattered_ore", new efi(egr.a));
   public static final eef<egv> ag = a("random_selector", new efe(egv.a));
   public static final eef<ehc> ah = a("simple_random_selector", new efn(ehc.a));
   public static final eef<egu> ai = a("random_boolean_selector", new efc(egu.a));
   public static final eef<egk> aj = a("geode", new eel(egk.b));
   public static final eef<egh> ak = a("dripstone_cluster", new edz(egh.a));
   public static final eef<egm> al = a("large_dripstone", new eev(egm.a));
   public static final eef<egs> am = a("pointed_dripstone", new efb(egs.a));
   public static final eef<eha> an = a("sculk_patch", new efj(eha.a));
   private final MapCodec<edr<FC, eef<FC>>> a;

   private static <C extends egj, F extends eef<C>> F a(String $$0, F $$1) {
      return kc.a(lx.O, $$0, $$1);
   }

   public eef(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new edr<>(this, $$0x), edr::c);
   }

   public MapCodec<edr<FC, eef<FC>>> a() {
      return this.a;
   }

   protected void a(dfd $$0, jg $$1, dvd $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dvd> a(axp<dhy> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dfs $$0, jg $$1, dvd $$2, Predicate<dvd> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eeh<FC> var1);

   public boolean a(FC $$0, dfs $$1, dxa $$2, azr $$3, jg $$4) {
      return $$1.f_($$4) ? this.a(new eeh<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dvd $$0) {
      return $$0.a(awz.bf);
   }

   public static boolean b(dvd $$0) {
      return $$0.a(awz.ag);
   }

   public static boolean a(dfb $$0, jg $$1) {
      return $$0.a($$1, eef::b);
   }

   public static boolean a(Function<jg, dvd> $$0, jg $$1, Predicate<dvd> $$2) {
      jg.a $$3 = new jg.a();

      for (jl $$4 : jl.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jg, dvd> $$0, jg $$1) {
      return a($$0, $$1, dvc.a::l);
   }

   protected void a(dfs $$0, jg $$1) {
      jg.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jl.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
