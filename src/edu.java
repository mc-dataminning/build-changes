import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class edu<FC extends efy> {
   public static final edu<egf> e = a("no_op", new eeo(egf.a));
   public static final edu<egu> f = a("tree", new efg(egu.a));
   public static final edu<egl> g = a("flower", new ees(egl.a));
   public static final edu<egl> h = a("no_bonemeal_flower", new ees(egl.a));
   public static final edu<egl> i = a("random_patch", new ees(egl.a));
   public static final edu<efq> j = a("block_pile", new edc(efq.a));
   public static final edu<egt> k = a("spring_feature", new eff(egt.a));
   public static final edu<egf> l = a("chorus_plant", new edf(egf.a));
   public static final edu<egm> m = a("replace_single_block", new eev(egm.a));
   public static final edu<egf> n = a("void_start_platform", new efl(egf.a));
   public static final edu<egf> o = a("desert_well", new edm(egf.a));
   public static final edu<edz> p = a("fossil", new edy(edz.a));
   public static final edu<ega> q = a("huge_red_mushroom", new eef(ega.a));
   public static final edu<ega> r = a("huge_brown_mushroom", new eec(ega.a));
   public static final edu<egf> s = a("ice_spike", new eeg(egf.a));
   public static final edu<egf> t = a("glowstone_blob", new eeb(egf.a));
   public static final edu<egf> u = a("freeze_top_layer", new efd(egf.a));
   public static final edu<egf> v = a("vines", new efk(egf.a));
   public static final edu<efp> w = a("block_column", new edb(efp.a));
   public static final edu<egx> x = a("vegetation_patch", new efj(egx.a));
   public static final edu<egx> y = a("waterlogged_vegetation_patch", new efm(egx.a));
   public static final edu<ego> z = a("root_system", new eew(ego.a));
   public static final edu<egd> A = a("multiface_growth", new eem(egd.a));
   public static final edu<egw> B = a("underwater_magma", new efi(egw.a));
   public static final edu<egf> C = a("monster_room", new eel(egf.a));
   public static final edu<egf> D = a("blue_ice", new edd(egf.a));
   public static final edu<efr> E = a("iceberg", new eeh(efr.a));
   public static final edu<efr> F = a("forest_rock", new eda(efr.a));
   public static final edu<efv> G = a("disk", new edn(efv.a));
   public static final edu<eej.a> H = a("lake", new eej(eej.a.a));
   public static final edu<egg> I = a("ore", new eep(egg.a));
   public static final edu<egf> J = a("end_platform", new eds(egf.a));
   public static final edu<egs> K = a("end_spike", new efe(egs.a));
   public static final edu<egf> L = a("end_island", new edr(egf.a));
   public static final edu<efx> M = a("end_gateway", new edq(efx.a));
   public static final efa N = a("seagrass", new efa(egi.k));
   public static final edu<egf> O = a("kelp", new eei(egf.a));
   public static final edu<egf> P = a("coral_tree", new edk(egf.a));
   public static final edu<egf> Q = a("coral_mushroom", new edj(egf.a));
   public static final edu<egf> R = a("coral_claw", new edh(egf.a));
   public static final edu<eft> S = a("sea_pickle", new eez(eft.a));
   public static final edu<egq> T = a("simple_block", new efb(egq.a));
   public static final edu<egi> U = a("bamboo", new ecx(egi.k));
   public static final edu<eed> V = a("huge_fungus", new eee(eed.a));
   public static final edu<ege> W = a("nether_forest_vegetation", new een(ege.c));
   public static final edu<egf> X = a("weeping_vines", new efn(egf.a));
   public static final edu<egv> Y = a("twisting_vines", new efh(egv.a));
   public static final edu<efs> Z = a("basalt_columns", new ecy(efs.a));
   public static final edu<efu> aa = a("delta_feature", new edl(efu.a));
   public static final edu<egn> ab = a("netherrack_replace_blobs", new eeu(egn.a));
   public static final edu<egc> ac = a("fill_layer", new edx(egc.a));
   public static final ede ad = a("bonus_chest", new ede(egf.a));
   public static final edu<egf> ae = a("basalt_pillar", new ecz(egf.a));
   public static final edu<egg> af = a("scattered_ore", new eex(egg.a));
   public static final edu<egk> ag = a("random_selector", new eet(egk.a));
   public static final edu<egr> ah = a("simple_random_selector", new efc(egr.a));
   public static final edu<egj> ai = a("random_boolean_selector", new eer(egj.a));
   public static final edu<efz> aj = a("geode", new eea(efz.b));
   public static final edu<efw> ak = a("dripstone_cluster", new edo(efw.a));
   public static final edu<egb> al = a("large_dripstone", new eek(egb.a));
   public static final edu<egh> am = a("pointed_dripstone", new eeq(egh.a));
   public static final edu<egp> an = a("sculk_patch", new eey(egp.a));
   private final MapCodec<edg<FC, edu<FC>>> a;

   private static <C extends efy, F extends edu<C>> F a(String $$0, F $$1) {
      return kb.a(lv.O, $$0, $$1);
   }

   public edu(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new edg<>(this, $$0x), edg::c);
   }

   public MapCodec<edg<FC, edu<FC>>> a() {
      return this.a;
   }

   protected void a(der $$0, jf $$1, dus $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dus> a(axl<dhm> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dfg $$0, jf $$1, dus $$2, Predicate<dus> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(edw<FC> var1);

   public boolean a(FC $$0, dfg $$1, dwp $$2, azn $$3, jf $$4) {
      return $$1.f_($$4) ? this.a(new edw<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dus $$0) {
      return $$0.a(awv.bf);
   }

   public static boolean b(dus $$0) {
      return $$0.a(awv.ag);
   }

   public static boolean a(dep $$0, jf $$1) {
      return $$0.a($$1, edu::b);
   }

   public static boolean a(Function<jf, dus> $$0, jf $$1, Predicate<dus> $$2) {
      jf.a $$3 = new jf.a();

      for (jk $$4 : jk.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jf, dus> $$0, jf $$1) {
      return a($$0, $$1, dur.a::l);
   }

   protected void a(dfg $$0, jf $$1) {
      jf.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jk.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
