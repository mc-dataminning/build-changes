import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eaz<FC extends edd> {
   public static final eaz<edk> e = a("no_op", new ebt(edk.a));
   public static final eaz<edz> f = a("tree", new ecl(edz.a));
   public static final eaz<edq> g = a("flower", new ebx(edq.a));
   public static final eaz<edq> h = a("no_bonemeal_flower", new ebx(edq.a));
   public static final eaz<edq> i = a("random_patch", new ebx(edq.a));
   public static final eaz<ecv> j = a("block_pile", new eai(ecv.a));
   public static final eaz<edy> k = a("spring_feature", new eck(edy.a));
   public static final eaz<edk> l = a("chorus_plant", new eal(edk.a));
   public static final eaz<edr> m = a("replace_single_block", new eca(edr.a));
   public static final eaz<edk> n = a("void_start_platform", new ecq(edk.a));
   public static final eaz<edk> o = a("desert_well", new eas(edk.a));
   public static final eaz<ebe> p = a("fossil", new ebd(ebe.a));
   public static final eaz<edf> q = a("huge_red_mushroom", new ebk(edf.a));
   public static final eaz<edf> r = a("huge_brown_mushroom", new ebh(edf.a));
   public static final eaz<edk> s = a("ice_spike", new ebl(edk.a));
   public static final eaz<edk> t = a("glowstone_blob", new ebg(edk.a));
   public static final eaz<edk> u = a("freeze_top_layer", new eci(edk.a));
   public static final eaz<edk> v = a("vines", new ecp(edk.a));
   public static final eaz<ecu> w = a("block_column", new eah(ecu.a));
   public static final eaz<eec> x = a("vegetation_patch", new eco(eec.a));
   public static final eaz<eec> y = a("waterlogged_vegetation_patch", new ecr(eec.a));
   public static final eaz<edt> z = a("root_system", new ecb(edt.a));
   public static final eaz<edi> A = a("multiface_growth", new ebr(edi.a));
   public static final eaz<eeb> B = a("underwater_magma", new ecn(eeb.a));
   public static final eaz<edk> C = a("monster_room", new ebq(edk.a));
   public static final eaz<edk> D = a("blue_ice", new eaj(edk.a));
   public static final eaz<ecw> E = a("iceberg", new ebm(ecw.a));
   public static final eaz<ecw> F = a("forest_rock", new eag(ecw.a));
   public static final eaz<eda> G = a("disk", new eat(eda.a));
   public static final eaz<ebo.a> H = a("lake", new ebo(ebo.a.a));
   public static final eaz<edl> I = a("ore", new ebu(edl.a));
   public static final eaz<edx> J = a("end_spike", new ecj(edx.a));
   public static final eaz<edk> K = a("end_island", new eax(edk.a));
   public static final eaz<edc> L = a("end_gateway", new eaw(edc.a));
   public static final ecf M = a("seagrass", new ecf(edn.k));
   public static final eaz<edk> N = a("kelp", new ebn(edk.a));
   public static final eaz<edk> O = a("coral_tree", new eaq(edk.a));
   public static final eaz<edk> P = a("coral_mushroom", new eap(edk.a));
   public static final eaz<edk> Q = a("coral_claw", new ean(edk.a));
   public static final eaz<ecy> R = a("sea_pickle", new ece(ecy.a));
   public static final eaz<edv> S = a("simple_block", new ecg(edv.a));
   public static final eaz<edn> T = a("bamboo", new ead(edn.k));
   public static final eaz<ebi> U = a("huge_fungus", new ebj(ebi.a));
   public static final eaz<edj> V = a("nether_forest_vegetation", new ebs(edj.c));
   public static final eaz<edk> W = a("weeping_vines", new ecs(edk.a));
   public static final eaz<eea> X = a("twisting_vines", new ecm(eea.a));
   public static final eaz<ecx> Y = a("basalt_columns", new eae(ecx.a));
   public static final eaz<ecz> Z = a("delta_feature", new ear(ecz.a));
   public static final eaz<eds> aa = a("netherrack_replace_blobs", new ebz(eds.a));
   public static final eaz<edh> ab = a("fill_layer", new ebc(edh.a));
   public static final eak ac = a("bonus_chest", new eak(edk.a));
   public static final eaz<edk> ad = a("basalt_pillar", new eaf(edk.a));
   public static final eaz<edl> ae = a("scattered_ore", new ecc(edl.a));
   public static final eaz<edp> af = a("random_selector", new eby(edp.a));
   public static final eaz<edw> ag = a("simple_random_selector", new ech(edw.a));
   public static final eaz<edo> ah = a("random_boolean_selector", new ebw(edo.a));
   public static final eaz<ede> ai = a("geode", new ebf(ede.b));
   public static final eaz<edb> aj = a("dripstone_cluster", new eau(edb.a));
   public static final eaz<edg> ak = a("large_dripstone", new ebp(edg.a));
   public static final eaz<edm> al = a("pointed_dripstone", new ebv(edm.a));
   public static final eaz<edu> am = a("sculk_patch", new ecd(edu.a));
   private final MapCodec<eam<FC, eaz<FC>>> a;

   private static <C extends edd, F extends eaz<C>> F a(String $$0, F $$1) {
      return jv.a(lp.Q, $$0, $$1);
   }

   public eaz(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eam<>(this, $$0x), eam::c);
   }

   public MapCodec<eam<FC, eaz<FC>>> a() {
      return this.a;
   }

   protected void a(dch $$0, iz $$1, dsd $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsd> a(axf<dfa> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dcu $$0, iz $$1, dsd $$2, Predicate<dsd> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ebb<FC> var1);

   public boolean a(FC $$0, dcu $$1, dua $$2, azh $$3, iz $$4) {
      return $$1.f_($$4) ? this.a(new ebb<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsd $$0) {
      return $$0.a(awp.be);
   }

   public static boolean b(dsd $$0) {
      return $$0.a(awp.af);
   }

   public static boolean a(dcf $$0, iz $$1) {
      return $$0.a($$1, eaz::b);
   }

   public static boolean a(Function<iz, dsd> $$0, iz $$1, Predicate<dsd> $$2) {
      iz.a $$3 = new iz.a();

      for (je $$4 : je.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iz, dsd> $$0, iz $$1) {
      return a($$0, $$1, dsc.a::i);
   }

   protected void a(dcu $$0, iz $$1) {
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
