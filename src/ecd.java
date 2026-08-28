import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ecd<FC extends eeh> {
   public static final ecd<eeo> e = a("no_op", new ecx(eeo.a));
   public static final ecd<efd> f = a("tree", new edp(efd.a));
   public static final ecd<eeu> g = a("flower", new edb(eeu.a));
   public static final ecd<eeu> h = a("no_bonemeal_flower", new edb(eeu.a));
   public static final ecd<eeu> i = a("random_patch", new edb(eeu.a));
   public static final ecd<edz> j = a("block_pile", new ebm(edz.a));
   public static final ecd<efc> k = a("spring_feature", new edo(efc.a));
   public static final ecd<eeo> l = a("chorus_plant", new ebp(eeo.a));
   public static final ecd<eev> m = a("replace_single_block", new ede(eev.a));
   public static final ecd<eeo> n = a("void_start_platform", new edu(eeo.a));
   public static final ecd<eeo> o = a("desert_well", new ebw(eeo.a));
   public static final ecd<eci> p = a("fossil", new ech(eci.a));
   public static final ecd<eej> q = a("huge_red_mushroom", new eco(eej.a));
   public static final ecd<eej> r = a("huge_brown_mushroom", new ecl(eej.a));
   public static final ecd<eeo> s = a("ice_spike", new ecp(eeo.a));
   public static final ecd<eeo> t = a("glowstone_blob", new eck(eeo.a));
   public static final ecd<eeo> u = a("freeze_top_layer", new edm(eeo.a));
   public static final ecd<eeo> v = a("vines", new edt(eeo.a));
   public static final ecd<edy> w = a("block_column", new ebl(edy.a));
   public static final ecd<efg> x = a("vegetation_patch", new eds(efg.a));
   public static final ecd<efg> y = a("waterlogged_vegetation_patch", new edv(efg.a));
   public static final ecd<eex> z = a("root_system", new edf(eex.a));
   public static final ecd<eem> A = a("multiface_growth", new ecv(eem.a));
   public static final ecd<eff> B = a("underwater_magma", new edr(eff.a));
   public static final ecd<eeo> C = a("monster_room", new ecu(eeo.a));
   public static final ecd<eeo> D = a("blue_ice", new ebn(eeo.a));
   public static final ecd<eea> E = a("iceberg", new ecq(eea.a));
   public static final ecd<eea> F = a("forest_rock", new ebk(eea.a));
   public static final ecd<eee> G = a("disk", new ebx(eee.a));
   public static final ecd<ecs.a> H = a("lake", new ecs(ecs.a.a));
   public static final ecd<eep> I = a("ore", new ecy(eep.a));
   public static final ecd<efb> J = a("end_spike", new edn(efb.a));
   public static final ecd<eeo> K = a("end_island", new ecb(eeo.a));
   public static final ecd<eeg> L = a("end_gateway", new eca(eeg.a));
   public static final edj M = a("seagrass", new edj(eer.k));
   public static final ecd<eeo> N = a("kelp", new ecr(eeo.a));
   public static final ecd<eeo> O = a("coral_tree", new ebu(eeo.a));
   public static final ecd<eeo> P = a("coral_mushroom", new ebt(eeo.a));
   public static final ecd<eeo> Q = a("coral_claw", new ebr(eeo.a));
   public static final ecd<eec> R = a("sea_pickle", new edi(eec.a));
   public static final ecd<eez> S = a("simple_block", new edk(eez.a));
   public static final ecd<eer> T = a("bamboo", new ebh(eer.k));
   public static final ecd<ecm> U = a("huge_fungus", new ecn(ecm.a));
   public static final ecd<een> V = a("nether_forest_vegetation", new ecw(een.c));
   public static final ecd<eeo> W = a("weeping_vines", new edw(eeo.a));
   public static final ecd<efe> X = a("twisting_vines", new edq(efe.a));
   public static final ecd<eeb> Y = a("basalt_columns", new ebi(eeb.a));
   public static final ecd<eed> Z = a("delta_feature", new ebv(eed.a));
   public static final ecd<eew> aa = a("netherrack_replace_blobs", new edd(eew.a));
   public static final ecd<eel> ab = a("fill_layer", new ecg(eel.a));
   public static final ebo ac = a("bonus_chest", new ebo(eeo.a));
   public static final ecd<eeo> ad = a("basalt_pillar", new ebj(eeo.a));
   public static final ecd<eep> ae = a("scattered_ore", new edg(eep.a));
   public static final ecd<eet> af = a("random_selector", new edc(eet.a));
   public static final ecd<efa> ag = a("simple_random_selector", new edl(efa.a));
   public static final ecd<ees> ah = a("random_boolean_selector", new eda(ees.a));
   public static final ecd<eei> ai = a("geode", new ecj(eei.b));
   public static final ecd<eef> aj = a("dripstone_cluster", new eby(eef.a));
   public static final ecd<eek> ak = a("large_dripstone", new ect(eek.a));
   public static final ecd<eeq> al = a("pointed_dripstone", new ecz(eeq.a));
   public static final ecd<eey> am = a("sculk_patch", new edh(eey.a));
   private final MapCodec<ebq<FC, ecd<FC>>> a;

   private static <C extends eeh, F extends ecd<C>> F a(String $$0, F $$1) {
      return jz.a(lt.O, $$0, $$1);
   }

   public ecd(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ebq<>(this, $$0x), ebq::c);
   }

   public MapCodec<ebq<FC, ecd<FC>>> a() {
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

   public abstract boolean a(ecf<FC> var1);

   public boolean a(FC $$0, dds $$1, duz $$2, ayw $$3, jd $$4) {
      return $$1.f_($$4) ? this.a(new ecf<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dtc $$0) {
      return $$0.a(awe.be);
   }

   public static boolean b(dtc $$0) {
      return $$0.a(awe.af);
   }

   public static boolean a(ddc $$0, jd $$1) {
      return $$0.a($$1, ecd::b);
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
