import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class edq<FC extends efu> {
   public static final edq<egb> e = a("no_op", new eek(egb.a));
   public static final edq<egq> f = a("tree", new efc(egq.a));
   public static final edq<egh> g = a("flower", new eeo(egh.a));
   public static final edq<egh> h = a("no_bonemeal_flower", new eeo(egh.a));
   public static final edq<egh> i = a("random_patch", new eeo(egh.a));
   public static final edq<efm> j = a("block_pile", new ecy(efm.a));
   public static final edq<egp> k = a("spring_feature", new efb(egp.a));
   public static final edq<egb> l = a("chorus_plant", new edb(egb.a));
   public static final edq<egi> m = a("replace_single_block", new eer(egi.a));
   public static final edq<egb> n = a("void_start_platform", new efh(egb.a));
   public static final edq<egb> o = a("desert_well", new edi(egb.a));
   public static final edq<edv> p = a("fossil", new edu(edv.a));
   public static final edq<efw> q = a("huge_red_mushroom", new eeb(efw.a));
   public static final edq<efw> r = a("huge_brown_mushroom", new edy(efw.a));
   public static final edq<egb> s = a("ice_spike", new eec(egb.a));
   public static final edq<egb> t = a("glowstone_blob", new edx(egb.a));
   public static final edq<egb> u = a("freeze_top_layer", new eez(egb.a));
   public static final edq<egb> v = a("vines", new efg(egb.a));
   public static final edq<efl> w = a("block_column", new ecx(efl.a));
   public static final edq<egt> x = a("vegetation_patch", new eff(egt.a));
   public static final edq<egt> y = a("waterlogged_vegetation_patch", new efi(egt.a));
   public static final edq<egk> z = a("root_system", new ees(egk.a));
   public static final edq<efz> A = a("multiface_growth", new eei(efz.a));
   public static final edq<egs> B = a("underwater_magma", new efe(egs.a));
   public static final edq<egb> C = a("monster_room", new eeh(egb.a));
   public static final edq<egb> D = a("blue_ice", new ecz(egb.a));
   public static final edq<efn> E = a("iceberg", new eed(efn.a));
   public static final edq<efn> F = a("forest_rock", new ecw(efn.a));
   public static final edq<efr> G = a("disk", new edj(efr.a));
   public static final edq<eef.a> H = a("lake", new eef(eef.a.a));
   public static final edq<egc> I = a("ore", new eel(egc.a));
   public static final edq<egb> J = a("end_platform", new edo(egb.a));
   public static final edq<ego> K = a("end_spike", new efa(ego.a));
   public static final edq<egb> L = a("end_island", new edn(egb.a));
   public static final edq<eft> M = a("end_gateway", new edm(eft.a));
   public static final eew N = a("seagrass", new eew(ege.k));
   public static final edq<egb> O = a("kelp", new eee(egb.a));
   public static final edq<egb> P = a("coral_tree", new edg(egb.a));
   public static final edq<egb> Q = a("coral_mushroom", new edf(egb.a));
   public static final edq<egb> R = a("coral_claw", new edd(egb.a));
   public static final edq<efp> S = a("sea_pickle", new eev(efp.a));
   public static final edq<egm> T = a("simple_block", new eex(egm.a));
   public static final edq<ege> U = a("bamboo", new ect(ege.k));
   public static final edq<edz> V = a("huge_fungus", new eea(edz.a));
   public static final edq<ega> W = a("nether_forest_vegetation", new eej(ega.c));
   public static final edq<egb> X = a("weeping_vines", new efj(egb.a));
   public static final edq<egr> Y = a("twisting_vines", new efd(egr.a));
   public static final edq<efo> Z = a("basalt_columns", new ecu(efo.a));
   public static final edq<efq> aa = a("delta_feature", new edh(efq.a));
   public static final edq<egj> ab = a("netherrack_replace_blobs", new eeq(egj.a));
   public static final edq<efy> ac = a("fill_layer", new edt(efy.a));
   public static final eda ad = a("bonus_chest", new eda(egb.a));
   public static final edq<egb> ae = a("basalt_pillar", new ecv(egb.a));
   public static final edq<egc> af = a("scattered_ore", new eet(egc.a));
   public static final edq<egg> ag = a("random_selector", new eep(egg.a));
   public static final edq<egn> ah = a("simple_random_selector", new eey(egn.a));
   public static final edq<egf> ai = a("random_boolean_selector", new een(egf.a));
   public static final edq<efv> aj = a("geode", new edw(efv.b));
   public static final edq<efs> ak = a("dripstone_cluster", new edk(efs.a));
   public static final edq<efx> al = a("large_dripstone", new eeg(efx.a));
   public static final edq<egd> am = a("pointed_dripstone", new eem(egd.a));
   public static final edq<egl> an = a("sculk_patch", new eeu(egl.a));
   private final MapCodec<edc<FC, edq<FC>>> a;

   private static <C extends efu, F extends edq<C>> F a(String $$0, F $$1) {
      return ka.a(lu.O, $$0, $$1);
   }

   public edq(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new edc<>(this, $$0x), edc::c);
   }

   public MapCodec<edc<FC, edq<FC>>> a() {
      return this.a;
   }

   protected void a(deo $$0, je $$1, duo $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<duo> a(axj<dhj> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dfd $$0, je $$1, duo $$2, Predicate<duo> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eds<FC> var1);

   public boolean a(FC $$0, dfd $$1, dwl $$2, azl $$3, je $$4) {
      return $$1.f_($$4) ? this.a(new eds<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(duo $$0) {
      return $$0.a(awt.bf);
   }

   public static boolean b(duo $$0) {
      return $$0.a(awt.ag);
   }

   public static boolean a(dem $$0, je $$1) {
      return $$0.a($$1, edq::b);
   }

   public static boolean a(Function<je, duo> $$0, je $$1, Predicate<duo> $$2) {
      je.a $$3 = new je.a();

      for (jj $$4 : jj.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<je, duo> $$0, je $$1) {
      return a($$0, $$1, dun.a::l);
   }

   protected void a(dfd $$0, je $$1) {
      je.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jj.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
