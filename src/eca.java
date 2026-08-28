import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eca<FC extends eee> {
   public static final eca<eel> e = a("no_op", new ecu(eel.a));
   public static final eca<efa> f = a("tree", new edm(efa.a));
   public static final eca<eer> g = a("flower", new ecy(eer.a));
   public static final eca<eer> h = a("no_bonemeal_flower", new ecy(eer.a));
   public static final eca<eer> i = a("random_patch", new ecy(eer.a));
   public static final eca<edw> j = a("block_pile", new ebj(edw.a));
   public static final eca<eez> k = a("spring_feature", new edl(eez.a));
   public static final eca<eel> l = a("chorus_plant", new ebm(eel.a));
   public static final eca<ees> m = a("replace_single_block", new edb(ees.a));
   public static final eca<eel> n = a("void_start_platform", new edr(eel.a));
   public static final eca<eel> o = a("desert_well", new ebt(eel.a));
   public static final eca<ecf> p = a("fossil", new ece(ecf.a));
   public static final eca<eeg> q = a("huge_red_mushroom", new ecl(eeg.a));
   public static final eca<eeg> r = a("huge_brown_mushroom", new eci(eeg.a));
   public static final eca<eel> s = a("ice_spike", new ecm(eel.a));
   public static final eca<eel> t = a("glowstone_blob", new ech(eel.a));
   public static final eca<eel> u = a("freeze_top_layer", new edj(eel.a));
   public static final eca<eel> v = a("vines", new edq(eel.a));
   public static final eca<edv> w = a("block_column", new ebi(edv.a));
   public static final eca<efd> x = a("vegetation_patch", new edp(efd.a));
   public static final eca<efd> y = a("waterlogged_vegetation_patch", new eds(efd.a));
   public static final eca<eeu> z = a("root_system", new edc(eeu.a));
   public static final eca<eej> A = a("multiface_growth", new ecs(eej.a));
   public static final eca<efc> B = a("underwater_magma", new edo(efc.a));
   public static final eca<eel> C = a("monster_room", new ecr(eel.a));
   public static final eca<eel> D = a("blue_ice", new ebk(eel.a));
   public static final eca<edx> E = a("iceberg", new ecn(edx.a));
   public static final eca<edx> F = a("forest_rock", new ebh(edx.a));
   public static final eca<eeb> G = a("disk", new ebu(eeb.a));
   public static final eca<ecp.a> H = a("lake", new ecp(ecp.a.a));
   public static final eca<eem> I = a("ore", new ecv(eem.a));
   public static final eca<eey> J = a("end_spike", new edk(eey.a));
   public static final eca<eel> K = a("end_island", new eby(eel.a));
   public static final eca<eed> L = a("end_gateway", new ebx(eed.a));
   public static final edg M = a("seagrass", new edg(eeo.k));
   public static final eca<eel> N = a("kelp", new eco(eel.a));
   public static final eca<eel> O = a("coral_tree", new ebr(eel.a));
   public static final eca<eel> P = a("coral_mushroom", new ebq(eel.a));
   public static final eca<eel> Q = a("coral_claw", new ebo(eel.a));
   public static final eca<edz> R = a("sea_pickle", new edf(edz.a));
   public static final eca<eew> S = a("simple_block", new edh(eew.a));
   public static final eca<eeo> T = a("bamboo", new ebe(eeo.k));
   public static final eca<ecj> U = a("huge_fungus", new eck(ecj.a));
   public static final eca<eek> V = a("nether_forest_vegetation", new ect(eek.c));
   public static final eca<eel> W = a("weeping_vines", new edt(eel.a));
   public static final eca<efb> X = a("twisting_vines", new edn(efb.a));
   public static final eca<edy> Y = a("basalt_columns", new ebf(edy.a));
   public static final eca<eea> Z = a("delta_feature", new ebs(eea.a));
   public static final eca<eet> aa = a("netherrack_replace_blobs", new eda(eet.a));
   public static final eca<eei> ab = a("fill_layer", new ecd(eei.a));
   public static final ebl ac = a("bonus_chest", new ebl(eel.a));
   public static final eca<eel> ad = a("basalt_pillar", new ebg(eel.a));
   public static final eca<eem> ae = a("scattered_ore", new edd(eem.a));
   public static final eca<eeq> af = a("random_selector", new ecz(eeq.a));
   public static final eca<eex> ag = a("simple_random_selector", new edi(eex.a));
   public static final eca<eep> ah = a("random_boolean_selector", new ecx(eep.a));
   public static final eca<eef> ai = a("geode", new ecg(eef.b));
   public static final eca<eec> aj = a("dripstone_cluster", new ebv(eec.a));
   public static final eca<eeh> ak = a("large_dripstone", new ecq(eeh.a));
   public static final eca<een> al = a("pointed_dripstone", new ecw(een.a));
   public static final eca<eev> am = a("sculk_patch", new ede(eev.a));
   private final MapCodec<ebn<FC, eca<FC>>> a;

   private static <C extends eee, F extends eca<C>> F a(String $$0, F $$1) {
      return jz.a(lt.O, $$0, $$1);
   }

   public eca(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ebn<>(this, $$0x), ebn::c);
   }

   public MapCodec<ebn<FC, eca<FC>>> a() {
      return this.a;
   }

   protected void a(ddc $$0, jd $$1, dta $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dta> a(awt<dfw> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(ddq $$0, jd $$1, dta $$2, Predicate<dta> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ecc<FC> var1);

   public boolean a(FC $$0, ddq $$1, dux $$2, ayv $$3, jd $$4) {
      return $$1.f_($$4) ? this.a(new ecc<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dta $$0) {
      return $$0.a(awd.be);
   }

   public static boolean b(dta $$0) {
      return $$0.a(awd.af);
   }

   public static boolean a(dda $$0, jd $$1) {
      return $$0.a($$1, eca::b);
   }

   public static boolean a(Function<jd, dta> $$0, jd $$1, Predicate<dta> $$2) {
      jd.a $$3 = new jd.a();

      for (ji $$4 : ji.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jd, dta> $$0, jd $$1) {
      return a($$0, $$1, dsz.a::i);
   }

   protected void a(ddq $$0, jd $$1) {
      jd.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ji.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
