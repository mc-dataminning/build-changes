import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eat<FC extends ecx> {
   public static final eat<ede> e = a("no_op", new ebn(ede.a));
   public static final eat<edt> f = a("tree", new ecf(edt.a));
   public static final eat<edk> g = a("flower", new ebr(edk.a));
   public static final eat<edk> h = a("no_bonemeal_flower", new ebr(edk.a));
   public static final eat<edk> i = a("random_patch", new ebr(edk.a));
   public static final eat<ecp> j = a("block_pile", new eac(ecp.a));
   public static final eat<eds> k = a("spring_feature", new ece(eds.a));
   public static final eat<ede> l = a("chorus_plant", new eaf(ede.a));
   public static final eat<edl> m = a("replace_single_block", new ebu(edl.a));
   public static final eat<ede> n = a("void_start_platform", new eck(ede.a));
   public static final eat<ede> o = a("desert_well", new eam(ede.a));
   public static final eat<eay> p = a("fossil", new eax(eay.a));
   public static final eat<ecz> q = a("huge_red_mushroom", new ebe(ecz.a));
   public static final eat<ecz> r = a("huge_brown_mushroom", new ebb(ecz.a));
   public static final eat<ede> s = a("ice_spike", new ebf(ede.a));
   public static final eat<ede> t = a("glowstone_blob", new eba(ede.a));
   public static final eat<ede> u = a("freeze_top_layer", new ecc(ede.a));
   public static final eat<ede> v = a("vines", new ecj(ede.a));
   public static final eat<eco> w = a("block_column", new eab(eco.a));
   public static final eat<edw> x = a("vegetation_patch", new eci(edw.a));
   public static final eat<edw> y = a("waterlogged_vegetation_patch", new ecl(edw.a));
   public static final eat<edn> z = a("root_system", new ebv(edn.a));
   public static final eat<edc> A = a("multiface_growth", new ebl(edc.a));
   public static final eat<edv> B = a("underwater_magma", new ech(edv.a));
   public static final eat<ede> C = a("monster_room", new ebk(ede.a));
   public static final eat<ede> D = a("blue_ice", new ead(ede.a));
   public static final eat<ecq> E = a("iceberg", new ebg(ecq.a));
   public static final eat<ecq> F = a("forest_rock", new eaa(ecq.a));
   public static final eat<ecu> G = a("disk", new ean(ecu.a));
   public static final eat<ebi.a> H = a("lake", new ebi(ebi.a.a));
   public static final eat<edf> I = a("ore", new ebo(edf.a));
   public static final eat<edr> J = a("end_spike", new ecd(edr.a));
   public static final eat<ede> K = a("end_island", new ear(ede.a));
   public static final eat<ecw> L = a("end_gateway", new eaq(ecw.a));
   public static final ebz M = a("seagrass", new ebz(edh.k));
   public static final eat<ede> N = a("kelp", new ebh(ede.a));
   public static final eat<ede> O = a("coral_tree", new eak(ede.a));
   public static final eat<ede> P = a("coral_mushroom", new eaj(ede.a));
   public static final eat<ede> Q = a("coral_claw", new eah(ede.a));
   public static final eat<ecs> R = a("sea_pickle", new eby(ecs.a));
   public static final eat<edp> S = a("simple_block", new eca(edp.a));
   public static final eat<edh> T = a("bamboo", new dzx(edh.k));
   public static final eat<ebc> U = a("huge_fungus", new ebd(ebc.a));
   public static final eat<edd> V = a("nether_forest_vegetation", new ebm(edd.c));
   public static final eat<ede> W = a("weeping_vines", new ecm(ede.a));
   public static final eat<edu> X = a("twisting_vines", new ecg(edu.a));
   public static final eat<ecr> Y = a("basalt_columns", new dzy(ecr.a));
   public static final eat<ect> Z = a("delta_feature", new eal(ect.a));
   public static final eat<edm> aa = a("netherrack_replace_blobs", new ebt(edm.a));
   public static final eat<edb> ab = a("fill_layer", new eaw(edb.a));
   public static final eae ac = a("bonus_chest", new eae(ede.a));
   public static final eat<ede> ad = a("basalt_pillar", new dzz(ede.a));
   public static final eat<edf> ae = a("scattered_ore", new ebw(edf.a));
   public static final eat<edj> af = a("random_selector", new ebs(edj.a));
   public static final eat<edq> ag = a("simple_random_selector", new ecb(edq.a));
   public static final eat<edi> ah = a("random_boolean_selector", new ebq(edi.a));
   public static final eat<ecy> ai = a("geode", new eaz(ecy.b));
   public static final eat<ecv> aj = a("dripstone_cluster", new eao(ecv.a));
   public static final eat<eda> ak = a("large_dripstone", new ebj(eda.a));
   public static final eat<edg> al = a("pointed_dripstone", new ebp(edg.a));
   public static final eat<edo> am = a("sculk_patch", new ebx(edo.a));
   private final MapCodec<eag<FC, eat<FC>>> a;

   private static <C extends ecx, F extends eat<C>> F a(String $$0, F $$1) {
      return jv.a(lp.Q, $$0, $$1);
   }

   public eat(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eag<>(this, $$0x), eag::c);
   }

   public MapCodec<eag<FC, eat<FC>>> a() {
      return this.a;
   }

   protected void a(dcb $$0, iz $$1, drx $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<drx> a(axb<deu> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dco $$0, iz $$1, drx $$2, Predicate<drx> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eav<FC> var1);

   public boolean a(FC $$0, dco $$1, dtu $$2, azc $$3, iz $$4) {
      return $$1.f_($$4) ? this.a(new eav<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(drx $$0) {
      return $$0.a(awl.be);
   }

   public static boolean b(drx $$0) {
      return $$0.a(awl.af);
   }

   public static boolean a(dbz $$0, iz $$1) {
      return $$0.a($$1, eat::b);
   }

   public static boolean a(Function<iz, drx> $$0, iz $$1, Predicate<drx> $$2) {
      iz.a $$3 = new iz.a();

      for (je $$4 : je.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iz, drx> $$0, iz $$1) {
      return a($$0, $$1, drw.a::i);
   }

   protected void a(dco $$0, iz $$1) {
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
