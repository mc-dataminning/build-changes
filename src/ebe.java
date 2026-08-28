import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ebe<FC extends edi> {
   public static final ebe<edp> e = a("no_op", new eby(edp.a));
   public static final ebe<eee> f = a("tree", new ecq(eee.a));
   public static final ebe<edv> g = a("flower", new ecc(edv.a));
   public static final ebe<edv> h = a("no_bonemeal_flower", new ecc(edv.a));
   public static final ebe<edv> i = a("random_patch", new ecc(edv.a));
   public static final ebe<eda> j = a("block_pile", new ean(eda.a));
   public static final ebe<eed> k = a("spring_feature", new ecp(eed.a));
   public static final ebe<edp> l = a("chorus_plant", new eaq(edp.a));
   public static final ebe<edw> m = a("replace_single_block", new ecf(edw.a));
   public static final ebe<edp> n = a("void_start_platform", new ecv(edp.a));
   public static final ebe<edp> o = a("desert_well", new eax(edp.a));
   public static final ebe<ebj> p = a("fossil", new ebi(ebj.a));
   public static final ebe<edk> q = a("huge_red_mushroom", new ebp(edk.a));
   public static final ebe<edk> r = a("huge_brown_mushroom", new ebm(edk.a));
   public static final ebe<edp> s = a("ice_spike", new ebq(edp.a));
   public static final ebe<edp> t = a("glowstone_blob", new ebl(edp.a));
   public static final ebe<edp> u = a("freeze_top_layer", new ecn(edp.a));
   public static final ebe<edp> v = a("vines", new ecu(edp.a));
   public static final ebe<ecz> w = a("block_column", new eam(ecz.a));
   public static final ebe<eeh> x = a("vegetation_patch", new ect(eeh.a));
   public static final ebe<eeh> y = a("waterlogged_vegetation_patch", new ecw(eeh.a));
   public static final ebe<edy> z = a("root_system", new ecg(edy.a));
   public static final ebe<edn> A = a("multiface_growth", new ebw(edn.a));
   public static final ebe<eeg> B = a("underwater_magma", new ecs(eeg.a));
   public static final ebe<edp> C = a("monster_room", new ebv(edp.a));
   public static final ebe<edp> D = a("blue_ice", new eao(edp.a));
   public static final ebe<edb> E = a("iceberg", new ebr(edb.a));
   public static final ebe<edb> F = a("forest_rock", new eal(edb.a));
   public static final ebe<edf> G = a("disk", new eay(edf.a));
   public static final ebe<ebt.a> H = a("lake", new ebt(ebt.a.a));
   public static final ebe<edq> I = a("ore", new ebz(edq.a));
   public static final ebe<eec> J = a("end_spike", new eco(eec.a));
   public static final ebe<edp> K = a("end_island", new ebc(edp.a));
   public static final ebe<edh> L = a("end_gateway", new ebb(edh.a));
   public static final eck M = a("seagrass", new eck(eds.k));
   public static final ebe<edp> N = a("kelp", new ebs(edp.a));
   public static final ebe<edp> O = a("coral_tree", new eav(edp.a));
   public static final ebe<edp> P = a("coral_mushroom", new eau(edp.a));
   public static final ebe<edp> Q = a("coral_claw", new eas(edp.a));
   public static final ebe<edd> R = a("sea_pickle", new ecj(edd.a));
   public static final ebe<eea> S = a("simple_block", new ecl(eea.a));
   public static final ebe<eds> T = a("bamboo", new eai(eds.k));
   public static final ebe<ebn> U = a("huge_fungus", new ebo(ebn.a));
   public static final ebe<edo> V = a("nether_forest_vegetation", new ebx(edo.c));
   public static final ebe<edp> W = a("weeping_vines", new ecx(edp.a));
   public static final ebe<eef> X = a("twisting_vines", new ecr(eef.a));
   public static final ebe<edc> Y = a("basalt_columns", new eaj(edc.a));
   public static final ebe<ede> Z = a("delta_feature", new eaw(ede.a));
   public static final ebe<edx> aa = a("netherrack_replace_blobs", new ece(edx.a));
   public static final ebe<edm> ab = a("fill_layer", new ebh(edm.a));
   public static final eap ac = a("bonus_chest", new eap(edp.a));
   public static final ebe<edp> ad = a("basalt_pillar", new eak(edp.a));
   public static final ebe<edq> ae = a("scattered_ore", new ech(edq.a));
   public static final ebe<edu> af = a("random_selector", new ecd(edu.a));
   public static final ebe<eeb> ag = a("simple_random_selector", new ecm(eeb.a));
   public static final ebe<edt> ah = a("random_boolean_selector", new ecb(edt.a));
   public static final ebe<edj> ai = a("geode", new ebk(edj.b));
   public static final ebe<edg> aj = a("dripstone_cluster", new eaz(edg.a));
   public static final ebe<edl> ak = a("large_dripstone", new ebu(edl.a));
   public static final ebe<edr> al = a("pointed_dripstone", new eca(edr.a));
   public static final ebe<edz> am = a("sculk_patch", new eci(edz.a));
   private final MapCodec<ear<FC, ebe<FC>>> a;

   private static <C extends edi, F extends ebe<C>> F a(String $$0, F $$1) {
      return jw.a(lq.O, $$0, $$1);
   }

   public ebe(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ear<>(this, $$0x), ear::c);
   }

   public MapCodec<ear<FC, ebe<FC>>> a() {
      return this.a;
   }

   protected void a(dcl $$0, ja $$1, dsh $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsh> a(awk<dff> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dcz $$0, ja $$1, dsh $$2, Predicate<dsh> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ebg<FC> var1);

   public boolean a(FC $$0, dcz $$1, due $$2, aym $$3, ja $$4) {
      return $$1.f_($$4) ? this.a(new ebg<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsh $$0) {
      return $$0.a(avu.be);
   }

   public static boolean b(dsh $$0) {
      return $$0.a(avu.af);
   }

   public static boolean a(dcj $$0, ja $$1) {
      return $$0.a($$1, ebe::b);
   }

   public static boolean a(Function<ja, dsh> $$0, ja $$1, Predicate<dsh> $$2) {
      ja.a $$3 = new ja.a();

      for (jf $$4 : jf.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ja, dsh> $$0, ja $$1) {
      return a($$0, $$1, dsg.a::i);
   }

   protected void a(dcz $$0, ja $$1) {
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
