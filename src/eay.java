import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eay<FC extends edc> {
   public static final eay<edj> e = a("no_op", new ebs(edj.a));
   public static final eay<edy> f = a("tree", new eck(edy.a));
   public static final eay<edp> g = a("flower", new ebw(edp.a));
   public static final eay<edp> h = a("no_bonemeal_flower", new ebw(edp.a));
   public static final eay<edp> i = a("random_patch", new ebw(edp.a));
   public static final eay<ecu> j = a("block_pile", new eah(ecu.a));
   public static final eay<edx> k = a("spring_feature", new ecj(edx.a));
   public static final eay<edj> l = a("chorus_plant", new eak(edj.a));
   public static final eay<edq> m = a("replace_single_block", new ebz(edq.a));
   public static final eay<edj> n = a("void_start_platform", new ecp(edj.a));
   public static final eay<edj> o = a("desert_well", new ear(edj.a));
   public static final eay<ebd> p = a("fossil", new ebc(ebd.a));
   public static final eay<ede> q = a("huge_red_mushroom", new ebj(ede.a));
   public static final eay<ede> r = a("huge_brown_mushroom", new ebg(ede.a));
   public static final eay<edj> s = a("ice_spike", new ebk(edj.a));
   public static final eay<edj> t = a("glowstone_blob", new ebf(edj.a));
   public static final eay<edj> u = a("freeze_top_layer", new ech(edj.a));
   public static final eay<edj> v = a("vines", new eco(edj.a));
   public static final eay<ect> w = a("block_column", new eag(ect.a));
   public static final eay<eeb> x = a("vegetation_patch", new ecn(eeb.a));
   public static final eay<eeb> y = a("waterlogged_vegetation_patch", new ecq(eeb.a));
   public static final eay<eds> z = a("root_system", new eca(eds.a));
   public static final eay<edh> A = a("multiface_growth", new ebq(edh.a));
   public static final eay<eea> B = a("underwater_magma", new ecm(eea.a));
   public static final eay<edj> C = a("monster_room", new ebp(edj.a));
   public static final eay<edj> D = a("blue_ice", new eai(edj.a));
   public static final eay<ecv> E = a("iceberg", new ebl(ecv.a));
   public static final eay<ecv> F = a("forest_rock", new eaf(ecv.a));
   public static final eay<ecz> G = a("disk", new eas(ecz.a));
   public static final eay<ebn.a> H = a("lake", new ebn(ebn.a.a));
   public static final eay<edk> I = a("ore", new ebt(edk.a));
   public static final eay<edw> J = a("end_spike", new eci(edw.a));
   public static final eay<edj> K = a("end_island", new eaw(edj.a));
   public static final eay<edb> L = a("end_gateway", new eav(edb.a));
   public static final ece M = a("seagrass", new ece(edm.k));
   public static final eay<edj> N = a("kelp", new ebm(edj.a));
   public static final eay<edj> O = a("coral_tree", new eap(edj.a));
   public static final eay<edj> P = a("coral_mushroom", new eao(edj.a));
   public static final eay<edj> Q = a("coral_claw", new eam(edj.a));
   public static final eay<ecx> R = a("sea_pickle", new ecd(ecx.a));
   public static final eay<edu> S = a("simple_block", new ecf(edu.a));
   public static final eay<edm> T = a("bamboo", new eac(edm.k));
   public static final eay<ebh> U = a("huge_fungus", new ebi(ebh.a));
   public static final eay<edi> V = a("nether_forest_vegetation", new ebr(edi.c));
   public static final eay<edj> W = a("weeping_vines", new ecr(edj.a));
   public static final eay<edz> X = a("twisting_vines", new ecl(edz.a));
   public static final eay<ecw> Y = a("basalt_columns", new ead(ecw.a));
   public static final eay<ecy> Z = a("delta_feature", new eaq(ecy.a));
   public static final eay<edr> aa = a("netherrack_replace_blobs", new eby(edr.a));
   public static final eay<edg> ab = a("fill_layer", new ebb(edg.a));
   public static final eaj ac = a("bonus_chest", new eaj(edj.a));
   public static final eay<edj> ad = a("basalt_pillar", new eae(edj.a));
   public static final eay<edk> ae = a("scattered_ore", new ecb(edk.a));
   public static final eay<edo> af = a("random_selector", new ebx(edo.a));
   public static final eay<edv> ag = a("simple_random_selector", new ecg(edv.a));
   public static final eay<edn> ah = a("random_boolean_selector", new ebv(edn.a));
   public static final eay<edd> ai = a("geode", new ebe(edd.b));
   public static final eay<eda> aj = a("dripstone_cluster", new eat(eda.a));
   public static final eay<edf> ak = a("large_dripstone", new ebo(edf.a));
   public static final eay<edl> al = a("pointed_dripstone", new ebu(edl.a));
   public static final eay<edt> am = a("sculk_patch", new ecc(edt.a));
   private final MapCodec<eal<FC, eay<FC>>> a;

   private static <C extends edc, F extends eay<C>> F a(String $$0, F $$1) {
      return jv.a(lp.Q, $$0, $$1);
   }

   public eay(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eal<>(this, $$0x), eal::c);
   }

   public MapCodec<eal<FC, eay<FC>>> a() {
      return this.a;
   }

   protected void a(dcg $$0, iz $$1, dsc $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsc> a(axf<dez> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dct $$0, iz $$1, dsc $$2, Predicate<dsc> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eba<FC> var1);

   public boolean a(FC $$0, dct $$1, dtz $$2, azh $$3, iz $$4) {
      return $$1.f_($$4) ? this.a(new eba<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsc $$0) {
      return $$0.a(awp.be);
   }

   public static boolean b(dsc $$0) {
      return $$0.a(awp.af);
   }

   public static boolean a(dce $$0, iz $$1) {
      return $$0.a($$1, eay::b);
   }

   public static boolean a(Function<iz, dsc> $$0, iz $$1, Predicate<dsc> $$2) {
      iz.a $$3 = new iz.a();

      for (je $$4 : je.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iz, dsc> $$0, iz $$1) {
      return a($$0, $$1, dsb.a::i);
   }

   protected void a(dct $$0, iz $$1) {
      iz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(je.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
