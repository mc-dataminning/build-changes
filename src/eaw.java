import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eaw<FC extends eda> {
   public static final eaw<edh> e = a("no_op", new ebq(edh.a));
   public static final eaw<edw> f = a("tree", new eci(edw.a));
   public static final eaw<edn> g = a("flower", new ebu(edn.a));
   public static final eaw<edn> h = a("no_bonemeal_flower", new ebu(edn.a));
   public static final eaw<edn> i = a("random_patch", new ebu(edn.a));
   public static final eaw<ecs> j = a("block_pile", new eaf(ecs.a));
   public static final eaw<edv> k = a("spring_feature", new ech(edv.a));
   public static final eaw<edh> l = a("chorus_plant", new eai(edh.a));
   public static final eaw<edo> m = a("replace_single_block", new ebx(edo.a));
   public static final eaw<edh> n = a("void_start_platform", new ecn(edh.a));
   public static final eaw<edh> o = a("desert_well", new eap(edh.a));
   public static final eaw<ebb> p = a("fossil", new eba(ebb.a));
   public static final eaw<edc> q = a("huge_red_mushroom", new ebh(edc.a));
   public static final eaw<edc> r = a("huge_brown_mushroom", new ebe(edc.a));
   public static final eaw<edh> s = a("ice_spike", new ebi(edh.a));
   public static final eaw<edh> t = a("glowstone_blob", new ebd(edh.a));
   public static final eaw<edh> u = a("freeze_top_layer", new ecf(edh.a));
   public static final eaw<edh> v = a("vines", new ecm(edh.a));
   public static final eaw<ecr> w = a("block_column", new eae(ecr.a));
   public static final eaw<edz> x = a("vegetation_patch", new ecl(edz.a));
   public static final eaw<edz> y = a("waterlogged_vegetation_patch", new eco(edz.a));
   public static final eaw<edq> z = a("root_system", new eby(edq.a));
   public static final eaw<edf> A = a("multiface_growth", new ebo(edf.a));
   public static final eaw<edy> B = a("underwater_magma", new eck(edy.a));
   public static final eaw<edh> C = a("monster_room", new ebn(edh.a));
   public static final eaw<edh> D = a("blue_ice", new eag(edh.a));
   public static final eaw<ect> E = a("iceberg", new ebj(ect.a));
   public static final eaw<ect> F = a("forest_rock", new ead(ect.a));
   public static final eaw<ecx> G = a("disk", new eaq(ecx.a));
   public static final eaw<ebl.a> H = a("lake", new ebl(ebl.a.a));
   public static final eaw<edi> I = a("ore", new ebr(edi.a));
   public static final eaw<edu> J = a("end_spike", new ecg(edu.a));
   public static final eaw<edh> K = a("end_island", new eau(edh.a));
   public static final eaw<ecz> L = a("end_gateway", new eat(ecz.a));
   public static final ecc M = a("seagrass", new ecc(edk.k));
   public static final eaw<edh> N = a("kelp", new ebk(edh.a));
   public static final eaw<edh> O = a("coral_tree", new ean(edh.a));
   public static final eaw<edh> P = a("coral_mushroom", new eam(edh.a));
   public static final eaw<edh> Q = a("coral_claw", new eak(edh.a));
   public static final eaw<ecv> R = a("sea_pickle", new ecb(ecv.a));
   public static final eaw<eds> S = a("simple_block", new ecd(eds.a));
   public static final eaw<edk> T = a("bamboo", new eaa(edk.k));
   public static final eaw<ebf> U = a("huge_fungus", new ebg(ebf.a));
   public static final eaw<edg> V = a("nether_forest_vegetation", new ebp(edg.c));
   public static final eaw<edh> W = a("weeping_vines", new ecp(edh.a));
   public static final eaw<edx> X = a("twisting_vines", new ecj(edx.a));
   public static final eaw<ecu> Y = a("basalt_columns", new eab(ecu.a));
   public static final eaw<ecw> Z = a("delta_feature", new eao(ecw.a));
   public static final eaw<edp> aa = a("netherrack_replace_blobs", new ebw(edp.a));
   public static final eaw<ede> ab = a("fill_layer", new eaz(ede.a));
   public static final eah ac = a("bonus_chest", new eah(edh.a));
   public static final eaw<edh> ad = a("basalt_pillar", new eac(edh.a));
   public static final eaw<edi> ae = a("scattered_ore", new ebz(edi.a));
   public static final eaw<edm> af = a("random_selector", new ebv(edm.a));
   public static final eaw<edt> ag = a("simple_random_selector", new ece(edt.a));
   public static final eaw<edl> ah = a("random_boolean_selector", new ebt(edl.a));
   public static final eaw<edb> ai = a("geode", new ebc(edb.b));
   public static final eaw<ecy> aj = a("dripstone_cluster", new ear(ecy.a));
   public static final eaw<edd> ak = a("large_dripstone", new ebm(edd.a));
   public static final eaw<edj> al = a("pointed_dripstone", new ebs(edj.a));
   public static final eaw<edr> am = a("sculk_patch", new eca(edr.a));
   private final MapCodec<eaj<FC, eaw<FC>>> a;

   private static <C extends eda, F extends eaw<C>> F a(String $$0, F $$1) {
      return jv.a(lp.Q, $$0, $$1);
   }

   public eaw(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eaj<>(this, $$0x), eaj::c);
   }

   public MapCodec<eaj<FC, eaw<FC>>> a() {
      return this.a;
   }

   protected void a(dce $$0, iz $$1, dsa $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsa> a(axe<dex> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dcr $$0, iz $$1, dsa $$2, Predicate<dsa> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eay<FC> var1);

   public boolean a(FC $$0, dcr $$1, dtx $$2, azf $$3, iz $$4) {
      return $$1.f_($$4) ? this.a(new eay<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsa $$0) {
      return $$0.a(awo.be);
   }

   public static boolean b(dsa $$0) {
      return $$0.a(awo.af);
   }

   public static boolean a(dcc $$0, iz $$1) {
      return $$0.a($$1, eaw::b);
   }

   public static boolean a(Function<iz, dsa> $$0, iz $$1, Predicate<dsa> $$2) {
      iz.a $$3 = new iz.a();

      for (je $$4 : je.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iz, dsa> $$0, iz $$1) {
      return a($$0, $$1, drz.a::i);
   }

   protected void a(dcr $$0, iz $$1) {
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
