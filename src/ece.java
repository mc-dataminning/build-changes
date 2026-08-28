import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ece<FC extends eei> {
   public static final ece<eep> e = a("no_op", new ecy(eep.a));
   public static final ece<efe> f = a("tree", new edq(efe.a));
   public static final ece<eev> g = a("flower", new edc(eev.a));
   public static final ece<eev> h = a("no_bonemeal_flower", new edc(eev.a));
   public static final ece<eev> i = a("random_patch", new edc(eev.a));
   public static final ece<eea> j = a("block_pile", new ebm(eea.a));
   public static final ece<efd> k = a("spring_feature", new edp(efd.a));
   public static final ece<eep> l = a("chorus_plant", new ebp(eep.a));
   public static final ece<eew> m = a("replace_single_block", new edf(eew.a));
   public static final ece<eep> n = a("void_start_platform", new edv(eep.a));
   public static final ece<eep> o = a("desert_well", new ebw(eep.a));
   public static final ece<ecj> p = a("fossil", new eci(ecj.a));
   public static final ece<eek> q = a("huge_red_mushroom", new ecp(eek.a));
   public static final ece<eek> r = a("huge_brown_mushroom", new ecm(eek.a));
   public static final ece<eep> s = a("ice_spike", new ecq(eep.a));
   public static final ece<eep> t = a("glowstone_blob", new ecl(eep.a));
   public static final ece<eep> u = a("freeze_top_layer", new edn(eep.a));
   public static final ece<eep> v = a("vines", new edu(eep.a));
   public static final ece<edz> w = a("block_column", new ebl(edz.a));
   public static final ece<efh> x = a("vegetation_patch", new edt(efh.a));
   public static final ece<efh> y = a("waterlogged_vegetation_patch", new edw(efh.a));
   public static final ece<eey> z = a("root_system", new edg(eey.a));
   public static final ece<een> A = a("multiface_growth", new ecw(een.a));
   public static final ece<efg> B = a("underwater_magma", new eds(efg.a));
   public static final ece<eep> C = a("monster_room", new ecv(eep.a));
   public static final ece<eep> D = a("blue_ice", new ebn(eep.a));
   public static final ece<eeb> E = a("iceberg", new ecr(eeb.a));
   public static final ece<eeb> F = a("forest_rock", new ebk(eeb.a));
   public static final ece<eef> G = a("disk", new ebx(eef.a));
   public static final ece<ect.a> H = a("lake", new ect(ect.a.a));
   public static final ece<eeq> I = a("ore", new ecz(eeq.a));
   public static final ece<eep> J = a("end_platform", new ecc(eep.a));
   public static final ece<efc> K = a("end_spike", new edo(efc.a));
   public static final ece<eep> L = a("end_island", new ecb(eep.a));
   public static final ece<eeh> M = a("end_gateway", new eca(eeh.a));
   public static final edk N = a("seagrass", new edk(ees.k));
   public static final ece<eep> O = a("kelp", new ecs(eep.a));
   public static final ece<eep> P = a("coral_tree", new ebu(eep.a));
   public static final ece<eep> Q = a("coral_mushroom", new ebt(eep.a));
   public static final ece<eep> R = a("coral_claw", new ebr(eep.a));
   public static final ece<eed> S = a("sea_pickle", new edj(eed.a));
   public static final ece<efa> T = a("simple_block", new edl(efa.a));
   public static final ece<ees> U = a("bamboo", new ebh(ees.k));
   public static final ece<ecn> V = a("huge_fungus", new eco(ecn.a));
   public static final ece<eeo> W = a("nether_forest_vegetation", new ecx(eeo.c));
   public static final ece<eep> X = a("weeping_vines", new edx(eep.a));
   public static final ece<eff> Y = a("twisting_vines", new edr(eff.a));
   public static final ece<eec> Z = a("basalt_columns", new ebi(eec.a));
   public static final ece<eee> aa = a("delta_feature", new ebv(eee.a));
   public static final ece<eex> ab = a("netherrack_replace_blobs", new ede(eex.a));
   public static final ece<eem> ac = a("fill_layer", new ech(eem.a));
   public static final ebo ad = a("bonus_chest", new ebo(eep.a));
   public static final ece<eep> ae = a("basalt_pillar", new ebj(eep.a));
   public static final ece<eeq> af = a("scattered_ore", new edh(eeq.a));
   public static final ece<eeu> ag = a("random_selector", new edd(eeu.a));
   public static final ece<efb> ah = a("simple_random_selector", new edm(efb.a));
   public static final ece<eet> ai = a("random_boolean_selector", new edb(eet.a));
   public static final ece<eej> aj = a("geode", new eck(eej.b));
   public static final ece<eeg> ak = a("dripstone_cluster", new eby(eeg.a));
   public static final ece<eel> al = a("large_dripstone", new ecu(eel.a));
   public static final ece<eer> am = a("pointed_dripstone", new eda(eer.a));
   public static final ece<eez> an = a("sculk_patch", new edi(eez.a));
   private final MapCodec<ebq<FC, ece<FC>>> a;

   private static <C extends eei, F extends ece<C>> F a(String $$0, F $$1) {
      return jz.a(lt.O, $$0, $$1);
   }

   public ece(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ebq<>(this, $$0x), ebq::c);
   }

   public MapCodec<ebq<FC, ece<FC>>> a() {
      return this.a;
   }

   protected void a(dde $$0, jd $$1, dtc $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dtc> a(awu<dfy> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dds $$0, jd $$1, dtc $$2, Predicate<dtc> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ecg<FC> var1);

   public boolean a(FC $$0, dds $$1, duz $$2, ayw $$3, jd $$4) {
      return $$1.f_($$4) ? this.a(new ecg<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dtc $$0) {
      return $$0.a(awe.bf);
   }

   public static boolean b(dtc $$0) {
      return $$0.a(awe.ag);
   }

   public static boolean a(ddc $$0, jd $$1) {
      return $$0.a($$1, ece::b);
   }

   public static boolean a(Function<jd, dtc> $$0, jd $$1, Predicate<dtc> $$2) {
      jd.a $$3 = new jd.a();

      for (ji $$4 : ji.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jd, dtc> $$0, jd $$1) {
      return a($$0, $$1, dtb.a::i);
   }

   protected void a(dds $$0, jd $$1) {
      jd.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ji.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
