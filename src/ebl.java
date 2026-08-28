import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ebl<FC extends edp> {
   public static final ebl<edw> e = a("no_op", new ecf(edw.a));
   public static final ebl<eel> f = a("tree", new ecx(eel.a));
   public static final ebl<eec> g = a("flower", new ecj(eec.a));
   public static final ebl<eec> h = a("no_bonemeal_flower", new ecj(eec.a));
   public static final ebl<eec> i = a("random_patch", new ecj(eec.a));
   public static final ebl<edh> j = a("block_pile", new eau(edh.a));
   public static final ebl<eek> k = a("spring_feature", new ecw(eek.a));
   public static final ebl<edw> l = a("chorus_plant", new eax(edw.a));
   public static final ebl<eed> m = a("replace_single_block", new ecm(eed.a));
   public static final ebl<edw> n = a("void_start_platform", new edc(edw.a));
   public static final ebl<edw> o = a("desert_well", new ebe(edw.a));
   public static final ebl<ebq> p = a("fossil", new ebp(ebq.a));
   public static final ebl<edr> q = a("huge_red_mushroom", new ebw(edr.a));
   public static final ebl<edr> r = a("huge_brown_mushroom", new ebt(edr.a));
   public static final ebl<edw> s = a("ice_spike", new ebx(edw.a));
   public static final ebl<edw> t = a("glowstone_blob", new ebs(edw.a));
   public static final ebl<edw> u = a("freeze_top_layer", new ecu(edw.a));
   public static final ebl<edw> v = a("vines", new edb(edw.a));
   public static final ebl<edg> w = a("block_column", new eat(edg.a));
   public static final ebl<eeo> x = a("vegetation_patch", new eda(eeo.a));
   public static final ebl<eeo> y = a("waterlogged_vegetation_patch", new edd(eeo.a));
   public static final ebl<eef> z = a("root_system", new ecn(eef.a));
   public static final ebl<edu> A = a("multiface_growth", new ecd(edu.a));
   public static final ebl<een> B = a("underwater_magma", new ecz(een.a));
   public static final ebl<edw> C = a("monster_room", new ecc(edw.a));
   public static final ebl<edw> D = a("blue_ice", new eav(edw.a));
   public static final ebl<edi> E = a("iceberg", new eby(edi.a));
   public static final ebl<edi> F = a("forest_rock", new eas(edi.a));
   public static final ebl<edm> G = a("disk", new ebf(edm.a));
   public static final ebl<eca.a> H = a("lake", new eca(eca.a.a));
   public static final ebl<edx> I = a("ore", new ecg(edx.a));
   public static final ebl<eej> J = a("end_spike", new ecv(eej.a));
   public static final ebl<edw> K = a("end_island", new ebj(edw.a));
   public static final ebl<edo> L = a("end_gateway", new ebi(edo.a));
   public static final ecr M = a("seagrass", new ecr(edz.k));
   public static final ebl<edw> N = a("kelp", new ebz(edw.a));
   public static final ebl<edw> O = a("coral_tree", new ebc(edw.a));
   public static final ebl<edw> P = a("coral_mushroom", new ebb(edw.a));
   public static final ebl<edw> Q = a("coral_claw", new eaz(edw.a));
   public static final ebl<edk> R = a("sea_pickle", new ecq(edk.a));
   public static final ebl<eeh> S = a("simple_block", new ecs(eeh.a));
   public static final ebl<edz> T = a("bamboo", new eap(edz.k));
   public static final ebl<ebu> U = a("huge_fungus", new ebv(ebu.a));
   public static final ebl<edv> V = a("nether_forest_vegetation", new ece(edv.c));
   public static final ebl<edw> W = a("weeping_vines", new ede(edw.a));
   public static final ebl<eem> X = a("twisting_vines", new ecy(eem.a));
   public static final ebl<edj> Y = a("basalt_columns", new eaq(edj.a));
   public static final ebl<edl> Z = a("delta_feature", new ebd(edl.a));
   public static final ebl<eee> aa = a("netherrack_replace_blobs", new ecl(eee.a));
   public static final ebl<edt> ab = a("fill_layer", new ebo(edt.a));
   public static final eaw ac = a("bonus_chest", new eaw(edw.a));
   public static final ebl<edw> ad = a("basalt_pillar", new ear(edw.a));
   public static final ebl<edx> ae = a("scattered_ore", new eco(edx.a));
   public static final ebl<eeb> af = a("random_selector", new eck(eeb.a));
   public static final ebl<eei> ag = a("simple_random_selector", new ect(eei.a));
   public static final ebl<eea> ah = a("random_boolean_selector", new eci(eea.a));
   public static final ebl<edq> ai = a("geode", new ebr(edq.b));
   public static final ebl<edn> aj = a("dripstone_cluster", new ebg(edn.a));
   public static final ebl<eds> ak = a("large_dripstone", new ecb(eds.a));
   public static final ebl<edy> al = a("pointed_dripstone", new ech(edy.a));
   public static final ebl<eeg> am = a("sculk_patch", new ecp(eeg.a));
   private final MapCodec<eay<FC, ebl<FC>>> a;

   private static <C extends edp, F extends ebl<C>> F a(String $$0, F $$1) {
      return jw.a(lq.O, $$0, $$1);
   }

   public ebl(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eay<>(this, $$0x), eay::c);
   }

   public MapCodec<eay<FC, ebl<FC>>> a() {
      return this.a;
   }

   protected void a(dco $$0, ja $$1, dsl $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsl> a(awm<dfi> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(ddc $$0, ja $$1, dsl $$2, Predicate<dsl> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ebn<FC> var1);

   public boolean a(FC $$0, ddc $$1, dui $$2, ayo $$3, ja $$4) {
      return $$1.f_($$4) ? this.a(new ebn<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsl $$0) {
      return $$0.a(avw.be);
   }

   public static boolean b(dsl $$0) {
      return $$0.a(avw.af);
   }

   public static boolean a(dcm $$0, ja $$1) {
      return $$0.a($$1, ebl::b);
   }

   public static boolean a(Function<ja, dsl> $$0, ja $$1, Predicate<dsl> $$2) {
      ja.a $$3 = new ja.a();

      for (jf $$4 : jf.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ja, dsl> $$0, ja $$1) {
      return a($$0, $$1, dsk.a::i);
   }

   protected void a(ddc $$0, ja $$1) {
      ja.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jf.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
