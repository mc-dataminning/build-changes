import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eax<FC extends edb> {
   public static final eax<edi> e = a("no_op", new ebr(edi.a));
   public static final eax<edx> f = a("tree", new ecj(edx.a));
   public static final eax<edo> g = a("flower", new ebv(edo.a));
   public static final eax<edo> h = a("no_bonemeal_flower", new ebv(edo.a));
   public static final eax<edo> i = a("random_patch", new ebv(edo.a));
   public static final eax<ect> j = a("block_pile", new eag(ect.a));
   public static final eax<edw> k = a("spring_feature", new eci(edw.a));
   public static final eax<edi> l = a("chorus_plant", new eaj(edi.a));
   public static final eax<edp> m = a("replace_single_block", new eby(edp.a));
   public static final eax<edi> n = a("void_start_platform", new eco(edi.a));
   public static final eax<edi> o = a("desert_well", new eaq(edi.a));
   public static final eax<ebc> p = a("fossil", new ebb(ebc.a));
   public static final eax<edd> q = a("huge_red_mushroom", new ebi(edd.a));
   public static final eax<edd> r = a("huge_brown_mushroom", new ebf(edd.a));
   public static final eax<edi> s = a("ice_spike", new ebj(edi.a));
   public static final eax<edi> t = a("glowstone_blob", new ebe(edi.a));
   public static final eax<edi> u = a("freeze_top_layer", new ecg(edi.a));
   public static final eax<edi> v = a("vines", new ecn(edi.a));
   public static final eax<ecs> w = a("block_column", new eaf(ecs.a));
   public static final eax<eea> x = a("vegetation_patch", new ecm(eea.a));
   public static final eax<eea> y = a("waterlogged_vegetation_patch", new ecp(eea.a));
   public static final eax<edr> z = a("root_system", new ebz(edr.a));
   public static final eax<edg> A = a("multiface_growth", new ebp(edg.a));
   public static final eax<edz> B = a("underwater_magma", new ecl(edz.a));
   public static final eax<edi> C = a("monster_room", new ebo(edi.a));
   public static final eax<edi> D = a("blue_ice", new eah(edi.a));
   public static final eax<ecu> E = a("iceberg", new ebk(ecu.a));
   public static final eax<ecu> F = a("forest_rock", new eae(ecu.a));
   public static final eax<ecy> G = a("disk", new ear(ecy.a));
   public static final eax<ebm.a> H = a("lake", new ebm(ebm.a.a));
   public static final eax<edj> I = a("ore", new ebs(edj.a));
   public static final eax<edv> J = a("end_spike", new ech(edv.a));
   public static final eax<edi> K = a("end_island", new eav(edi.a));
   public static final eax<eda> L = a("end_gateway", new eau(eda.a));
   public static final ecd M = a("seagrass", new ecd(edl.k));
   public static final eax<edi> N = a("kelp", new ebl(edi.a));
   public static final eax<edi> O = a("coral_tree", new eao(edi.a));
   public static final eax<edi> P = a("coral_mushroom", new ean(edi.a));
   public static final eax<edi> Q = a("coral_claw", new eal(edi.a));
   public static final eax<ecw> R = a("sea_pickle", new ecc(ecw.a));
   public static final eax<edt> S = a("simple_block", new ece(edt.a));
   public static final eax<edl> T = a("bamboo", new eab(edl.k));
   public static final eax<ebg> U = a("huge_fungus", new ebh(ebg.a));
   public static final eax<edh> V = a("nether_forest_vegetation", new ebq(edh.c));
   public static final eax<edi> W = a("weeping_vines", new ecq(edi.a));
   public static final eax<edy> X = a("twisting_vines", new eck(edy.a));
   public static final eax<ecv> Y = a("basalt_columns", new eac(ecv.a));
   public static final eax<ecx> Z = a("delta_feature", new eap(ecx.a));
   public static final eax<edq> aa = a("netherrack_replace_blobs", new ebx(edq.a));
   public static final eax<edf> ab = a("fill_layer", new eba(edf.a));
   public static final eai ac = a("bonus_chest", new eai(edi.a));
   public static final eax<edi> ad = a("basalt_pillar", new ead(edi.a));
   public static final eax<edj> ae = a("scattered_ore", new eca(edj.a));
   public static final eax<edn> af = a("random_selector", new ebw(edn.a));
   public static final eax<edu> ag = a("simple_random_selector", new ecf(edu.a));
   public static final eax<edm> ah = a("random_boolean_selector", new ebu(edm.a));
   public static final eax<edc> ai = a("geode", new ebd(edc.b));
   public static final eax<ecz> aj = a("dripstone_cluster", new eas(ecz.a));
   public static final eax<ede> ak = a("large_dripstone", new ebn(ede.a));
   public static final eax<edk> al = a("pointed_dripstone", new ebt(edk.a));
   public static final eax<eds> am = a("sculk_patch", new ecb(eds.a));
   private final MapCodec<eak<FC, eax<FC>>> a;

   private static <C extends edb, F extends eax<C>> F a(String $$0, F $$1) {
      return jv.a(lp.Q, $$0, $$1);
   }

   public eax(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eak<>(this, $$0x), eak::c);
   }

   public MapCodec<eak<FC, eax<FC>>> a() {
      return this.a;
   }

   protected void a(dcf $$0, iz $$1, dsb $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsb> a(axe<dey> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dcs $$0, iz $$1, dsb $$2, Predicate<dsb> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eaz<FC> var1);

   public boolean a(FC $$0, dcs $$1, dty $$2, azg $$3, iz $$4) {
      return $$1.f_($$4) ? this.a(new eaz<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsb $$0) {
      return $$0.a(awo.be);
   }

   public static boolean b(dsb $$0) {
      return $$0.a(awo.af);
   }

   public static boolean a(dcd $$0, iz $$1) {
      return $$0.a($$1, eax::b);
   }

   public static boolean a(Function<iz, dsb> $$0, iz $$1, Predicate<dsb> $$2) {
      iz.a $$3 = new iz.a();

      for (je $$4 : je.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iz, dsb> $$0, iz $$1) {
      return a($$0, $$1, dsa.a::i);
   }

   protected void a(dcs $$0, iz $$1) {
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
