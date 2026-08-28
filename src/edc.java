import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class edc<FC extends efg> {
   public static final edc<efn> e = a("no_op", new edw(efn.a));
   public static final edc<egc> f = a("tree", new eeo(egc.a));
   public static final edc<eft> g = a("flower", new eea(eft.a));
   public static final edc<eft> h = a("no_bonemeal_flower", new eea(eft.a));
   public static final edc<eft> i = a("random_patch", new eea(eft.a));
   public static final edc<eey> j = a("block_pile", new eck(eey.a));
   public static final edc<egb> k = a("spring_feature", new een(egb.a));
   public static final edc<efn> l = a("chorus_plant", new ecn(efn.a));
   public static final edc<efu> m = a("replace_single_block", new eed(efu.a));
   public static final edc<efn> n = a("void_start_platform", new eet(efn.a));
   public static final edc<efn> o = a("desert_well", new ecu(efn.a));
   public static final edc<edh> p = a("fossil", new edg(edh.a));
   public static final edc<efi> q = a("huge_red_mushroom", new edn(efi.a));
   public static final edc<efi> r = a("huge_brown_mushroom", new edk(efi.a));
   public static final edc<efn> s = a("ice_spike", new edo(efn.a));
   public static final edc<efn> t = a("glowstone_blob", new edj(efn.a));
   public static final edc<efn> u = a("freeze_top_layer", new eel(efn.a));
   public static final edc<efn> v = a("vines", new ees(efn.a));
   public static final edc<eex> w = a("block_column", new ecj(eex.a));
   public static final edc<egf> x = a("vegetation_patch", new eer(egf.a));
   public static final edc<egf> y = a("waterlogged_vegetation_patch", new eeu(egf.a));
   public static final edc<efw> z = a("root_system", new eee(efw.a));
   public static final edc<efl> A = a("multiface_growth", new edu(efl.a));
   public static final edc<ege> B = a("underwater_magma", new eeq(ege.a));
   public static final edc<efn> C = a("monster_room", new edt(efn.a));
   public static final edc<efn> D = a("blue_ice", new ecl(efn.a));
   public static final edc<eez> E = a("iceberg", new edp(eez.a));
   public static final edc<eez> F = a("forest_rock", new eci(eez.a));
   public static final edc<efd> G = a("disk", new ecv(efd.a));
   public static final edc<edr.a> H = a("lake", new edr(edr.a.a));
   public static final edc<efo> I = a("ore", new edx(efo.a));
   public static final edc<efn> J = a("end_platform", new eda(efn.a));
   public static final edc<ega> K = a("end_spike", new eem(ega.a));
   public static final edc<efn> L = a("end_island", new ecz(efn.a));
   public static final edc<eff> M = a("end_gateway", new ecy(eff.a));
   public static final eei N = a("seagrass", new eei(efq.k));
   public static final edc<efn> O = a("kelp", new edq(efn.a));
   public static final edc<efn> P = a("coral_tree", new ecs(efn.a));
   public static final edc<efn> Q = a("coral_mushroom", new ecr(efn.a));
   public static final edc<efn> R = a("coral_claw", new ecp(efn.a));
   public static final edc<efb> S = a("sea_pickle", new eeh(efb.a));
   public static final edc<efy> T = a("simple_block", new eej(efy.a));
   public static final edc<efq> U = a("bamboo", new ecf(efq.k));
   public static final edc<edl> V = a("huge_fungus", new edm(edl.a));
   public static final edc<efm> W = a("nether_forest_vegetation", new edv(efm.c));
   public static final edc<efn> X = a("weeping_vines", new eev(efn.a));
   public static final edc<egd> Y = a("twisting_vines", new eep(egd.a));
   public static final edc<efa> Z = a("basalt_columns", new ecg(efa.a));
   public static final edc<efc> aa = a("delta_feature", new ect(efc.a));
   public static final edc<efv> ab = a("netherrack_replace_blobs", new eec(efv.a));
   public static final edc<efk> ac = a("fill_layer", new edf(efk.a));
   public static final ecm ad = a("bonus_chest", new ecm(efn.a));
   public static final edc<efn> ae = a("basalt_pillar", new ech(efn.a));
   public static final edc<efo> af = a("scattered_ore", new eef(efo.a));
   public static final edc<efs> ag = a("random_selector", new eeb(efs.a));
   public static final edc<efz> ah = a("simple_random_selector", new eek(efz.a));
   public static final edc<efr> ai = a("random_boolean_selector", new edz(efr.a));
   public static final edc<efh> aj = a("geode", new edi(efh.b));
   public static final edc<efe> ak = a("dripstone_cluster", new ecw(efe.a));
   public static final edc<efj> al = a("large_dripstone", new eds(efj.a));
   public static final edc<efp> am = a("pointed_dripstone", new edy(efp.a));
   public static final edc<efx> an = a("sculk_patch", new eeg(efx.a));
   private final MapCodec<eco<FC, edc<FC>>> a;

   private static <C extends efg, F extends edc<C>> F a(String $$0, F $$1) {
      return ka.a(lu.O, $$0, $$1);
   }

   public edc(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eco<>(this, $$0x), eco::c);
   }

   public MapCodec<eco<FC, edc<FC>>> a() {
      return this.a;
   }

   protected void a(dea $$0, je $$1, dua $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dua> a(axi<dgv> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dep $$0, je $$1, dua $$2, Predicate<dua> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ede<FC> var1);

   public boolean a(FC $$0, dep $$1, dvx $$2, azk $$3, je $$4) {
      return $$1.f_($$4) ? this.a(new ede<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dua $$0) {
      return $$0.a(aws.bf);
   }

   public static boolean b(dua $$0) {
      return $$0.a(aws.ag);
   }

   public static boolean a(ddy $$0, je $$1) {
      return $$0.a($$1, edc::b);
   }

   public static boolean a(Function<je, dua> $$0, je $$1, Predicate<dua> $$2) {
      je.a $$3 = new je.a();

      for (jj $$4 : jj.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<je, dua> $$0, je $$1) {
      return a($$0, $$1, dtz.a::l);
   }

   protected void a(dep $$0, je $$1) {
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
