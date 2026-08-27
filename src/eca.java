import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eca<FC extends eek> {
   public static final eca<eer> e = a("no_op", new ecv(eer.a));
   public static final eca<efg> f = a("tree", new edr(efg.a));
   public static final eca<eex> g = a("flower", new edd(eex.a));
   public static final eca<eex> h = a("no_bonemeal_flower", new edd(eex.a));
   public static final eca<eex> i = a("random_patch", new edd(eex.a));
   public static final eca<eec> j = a("block_pile", new ebh(eec.a));
   public static final eca<eff> k = a("spring_feature", new edq(eff.a));
   public static final eca<eer> l = a("chorus_plant", new ebk(eer.a));
   public static final eca<eer> m = a("twisted_potato", new eds(eer.a));
   public static final eca<eey> n = a("replace_single_block", new edg(eey.a));
   public static final eca<eer> o = a("void_start_platform", new edx(eer.a));
   public static final eca<eer> p = a("desert_well", new ebs(eer.a));
   public static final eca<eer> q = a("hash_well", new eci(eer.a));
   public static final eca<ecf> r = a("fossil", new ece(ecf.a));
   public static final eca<eem> s = a("huge_red_mushroom", new ecm(eem.a));
   public static final eca<eem> t = a("huge_brown_mushroom", new ecj(eem.a));
   public static final eca<eer> u = a("ice_spike", new ecn(eer.a));
   public static final eca<eer> v = a("glowstone_blob", new ech(eer.a));
   public static final eca<eer> w = a("freeze_top_layer", new edo(eer.a));
   public static final eca<eer> x = a("vines", new edw(eer.a));
   public static final eca<eeb> y = a("block_column", new ebg(eeb.a));
   public static final eca<efj> z = a("vegetation_patch", new edv(efj.a));
   public static final eca<efj> A = a("waterlogged_vegetation_patch", new edy(efj.a));
   public static final eca<efa> B = a("root_system", new edh(efa.a));
   public static final eca<eep> C = a("multiface_growth", new ect(eep.a));
   public static final eca<efi> D = a("underwater_magma", new edu(efi.a));
   public static final eca<eer> E = a("monster_room", new ecs(eer.a));
   public static final eca<eer> F = a("blue_ice", new ebi(eer.a));
   public static final eca<eed> G = a("iceberg", new eco(eed.a));
   public static final eca<eed> H = a("forest_rock", new ebf(eed.a));
   public static final eca<eed> I = a("cloud", new ebl(eed.a));
   public static final eca<eeh> J = a("disk", new ebt(eeh.a));
   public static final eca<ecq.a> K = a("lake", new ecq(ecq.a.a));
   public static final eca<ees> L = a("ore", new ecw(ees.a));
   public static final eca<efe> M = a("end_spike", new edp(efe.a));
   public static final eca<eer> N = a("end_island", new eby(eer.a));
   public static final eca<eej> O = a("end_gateway", new ebx(eej.a));
   public static final edl P = a("seagrass", new edl(eeu.k));
   public static final eca<eer> Q = a("kelp", new ecp(eer.a));
   public static final eca<eer> R = a("coral_tree", new ebq(eer.a));
   public static final eca<eer> S = a("coral_mushroom", new ebp(eer.a));
   public static final eca<eer> T = a("coral_claw", new ebn(eer.a));
   public static final eca<eef> U = a("sea_pickle", new edk(eef.a));
   public static final eca<efc> V = a("simple_block", new edm(efc.a));
   public static final eca<eeu> W = a("bamboo", new ebc(eeu.k));
   public static final eca<eck> X = a("huge_fungus", new ecl(eck.a));
   public static final eca<eeq> Y = a("nether_forest_vegetation", new ecu(eeq.c));
   public static final eca<eer> Z = a("weeping_vines", new edz(eer.a));
   public static final eca<efh> aa = a("twisting_vines", new edt(efh.a));
   public static final eca<efh> ab = a("potato_buds", new eda(efh.a));
   public static final eca<eer> ac = a("potato_field", new edb(eer.a));
   public static final eca<eer> ad = a("park_lane", new ecx(eer.a));
   public static final eca<eer> ae = a("park_lane_surface", new ecy(eer.a));
   public static final eca<eee> af = a("basalt_columns", new ebd(eee.a));
   public static final eca<eeg> ag = a("delta_feature", new ebr(eeg.a));
   public static final eca<eez> ah = a("netherrack_replace_blobs", new edf(eez.a));
   public static final eca<eeo> ai = a("fill_layer", new ecd(eeo.a));
   public static final ebj aj = a("bonus_chest", new ebj(eer.a));
   public static final eca<eer> ak = a("basalt_pillar", new ebe(eer.a));
   public static final eca<ees> al = a("scattered_ore", new edi(ees.a));
   public static final eca<eew> am = a("random_selector", new ede(eew.a));
   public static final eca<efd> an = a("simple_random_selector", new edn(efd.a));
   public static final eca<eev> ao = a("random_boolean_selector", new edc(eev.a));
   public static final eca<eel> ap = a("geode", new ecg(eel.b));
   public static final eca<eei> aq = a("dripstone_cluster", new ebu(eei.a));
   public static final eca<een> ar = a("large_dripstone", new ecr(een.a));
   public static final eca<eet> as = a("pointed_dripstone", new ecz(eet.a));
   public static final eca<efb> at = a("sculk_patch", new edj(efb.a));
   private final Codec<ebm<FC, eca<FC>>> a;

   private static <C extends eek, F extends eca<C>> F a(String $$0, F $$1) {
      return jn.a(lh.Q, $$0, $$1);
   }

   public eca(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ebm<>(this, $$0x), ebm::c).codec();
   }

   public Codec<ebm<FC, eca<FC>>> a() {
      return this.a;
   }

   protected void a(dci $$0, ir $$1, dtc $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dtc> a(awt<dfc> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dcv $$0, ir $$1, dtc $$2, Predicate<dtc> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ecc<FC> var1);

   public boolean a(FC $$0, dcv $$1, duz $$2, ayt $$3, ir $$4) {
      return $$1.f_($$4) ? this.a(new ecc<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dtc $$0) {
      return $$0.a(awe.bg);
   }

   public static boolean b(dtc $$0) {
      return $$0.a(awe.ag);
   }

   public static boolean a(dcg $$0, ir $$1) {
      return $$0.a($$1, eca::b);
   }

   public static boolean a(Function<ir, dtc> $$0, ir $$1, Predicate<dtc> $$2) {
      ir.a $$3 = new ir.a();

      for (iw $$4 : iw.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ir, dtc> $$0, ir $$1) {
      return a($$0, $$1, dtb.a::i);
   }

   protected void a(dcv $$0, ir $$1) {
      ir.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.d(iw.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
