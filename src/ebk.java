import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ebk<FC extends edo> {
   public static final ebk<edv> e = a("no_op", new ece(edv.a));
   public static final ebk<eek> f = a("tree", new ecw(eek.a));
   public static final ebk<eeb> g = a("flower", new eci(eeb.a));
   public static final ebk<eeb> h = a("no_bonemeal_flower", new eci(eeb.a));
   public static final ebk<eeb> i = a("random_patch", new eci(eeb.a));
   public static final ebk<edg> j = a("block_pile", new eat(edg.a));
   public static final ebk<eej> k = a("spring_feature", new ecv(eej.a));
   public static final ebk<edv> l = a("chorus_plant", new eaw(edv.a));
   public static final ebk<eec> m = a("replace_single_block", new ecl(eec.a));
   public static final ebk<edv> n = a("void_start_platform", new edb(edv.a));
   public static final ebk<edv> o = a("desert_well", new ebd(edv.a));
   public static final ebk<ebp> p = a("fossil", new ebo(ebp.a));
   public static final ebk<edq> q = a("huge_red_mushroom", new ebv(edq.a));
   public static final ebk<edq> r = a("huge_brown_mushroom", new ebs(edq.a));
   public static final ebk<edv> s = a("ice_spike", new ebw(edv.a));
   public static final ebk<edv> t = a("glowstone_blob", new ebr(edv.a));
   public static final ebk<edv> u = a("freeze_top_layer", new ect(edv.a));
   public static final ebk<edv> v = a("vines", new eda(edv.a));
   public static final ebk<edf> w = a("block_column", new eas(edf.a));
   public static final ebk<een> x = a("vegetation_patch", new ecz(een.a));
   public static final ebk<een> y = a("waterlogged_vegetation_patch", new edc(een.a));
   public static final ebk<eee> z = a("root_system", new ecm(eee.a));
   public static final ebk<edt> A = a("multiface_growth", new ecc(edt.a));
   public static final ebk<eem> B = a("underwater_magma", new ecy(eem.a));
   public static final ebk<edv> C = a("monster_room", new ecb(edv.a));
   public static final ebk<edv> D = a("blue_ice", new eau(edv.a));
   public static final ebk<edh> E = a("iceberg", new ebx(edh.a));
   public static final ebk<edh> F = a("forest_rock", new ear(edh.a));
   public static final ebk<edl> G = a("disk", new ebe(edl.a));
   public static final ebk<ebz.a> H = a("lake", new ebz(ebz.a.a));
   public static final ebk<edw> I = a("ore", new ecf(edw.a));
   public static final ebk<eei> J = a("end_spike", new ecu(eei.a));
   public static final ebk<edv> K = a("end_island", new ebi(edv.a));
   public static final ebk<edn> L = a("end_gateway", new ebh(edn.a));
   public static final ecq M = a("seagrass", new ecq(edy.k));
   public static final ebk<edv> N = a("kelp", new eby(edv.a));
   public static final ebk<edv> O = a("coral_tree", new ebb(edv.a));
   public static final ebk<edv> P = a("coral_mushroom", new eba(edv.a));
   public static final ebk<edv> Q = a("coral_claw", new eay(edv.a));
   public static final ebk<edj> R = a("sea_pickle", new ecp(edj.a));
   public static final ebk<eeg> S = a("simple_block", new ecr(eeg.a));
   public static final ebk<edy> T = a("bamboo", new eao(edy.k));
   public static final ebk<ebt> U = a("huge_fungus", new ebu(ebt.a));
   public static final ebk<edu> V = a("nether_forest_vegetation", new ecd(edu.c));
   public static final ebk<edv> W = a("weeping_vines", new edd(edv.a));
   public static final ebk<eel> X = a("twisting_vines", new ecx(eel.a));
   public static final ebk<edi> Y = a("basalt_columns", new eap(edi.a));
   public static final ebk<edk> Z = a("delta_feature", new ebc(edk.a));
   public static final ebk<eed> aa = a("netherrack_replace_blobs", new eck(eed.a));
   public static final ebk<eds> ab = a("fill_layer", new ebn(eds.a));
   public static final eav ac = a("bonus_chest", new eav(edv.a));
   public static final ebk<edv> ad = a("basalt_pillar", new eaq(edv.a));
   public static final ebk<edw> ae = a("scattered_ore", new ecn(edw.a));
   public static final ebk<eea> af = a("random_selector", new ecj(eea.a));
   public static final ebk<eeh> ag = a("simple_random_selector", new ecs(eeh.a));
   public static final ebk<edz> ah = a("random_boolean_selector", new ech(edz.a));
   public static final ebk<edp> ai = a("geode", new ebq(edp.b));
   public static final ebk<edm> aj = a("dripstone_cluster", new ebf(edm.a));
   public static final ebk<edr> ak = a("large_dripstone", new eca(edr.a));
   public static final ebk<edx> al = a("pointed_dripstone", new ecg(edx.a));
   public static final ebk<eef> am = a("sculk_patch", new eco(eef.a));
   private final MapCodec<eax<FC, ebk<FC>>> a;

   private static <C extends edo, F extends ebk<C>> F a(String $$0, F $$1) {
      return jw.a(lq.O, $$0, $$1);
   }

   public ebk(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eax<>(this, $$0x), eax::c);
   }

   public MapCodec<eax<FC, ebk<FC>>> a() {
      return this.a;
   }

   protected void a(dcn $$0, ja $$1, dsk $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dsk> a(awm<dfh> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(ddb $$0, ja $$1, dsk $$2, Predicate<dsk> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ebm<FC> var1);

   public boolean a(FC $$0, ddb $$1, duh $$2, ayo $$3, ja $$4) {
      return $$1.f_($$4) ? this.a(new ebm<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dsk $$0) {
      return $$0.a(avw.be);
   }

   public static boolean b(dsk $$0) {
      return $$0.a(avw.af);
   }

   public static boolean a(dcl $$0, ja $$1) {
      return $$0.a($$1, ebk::b);
   }

   public static boolean a(Function<ja, dsk> $$0, ja $$1, Predicate<dsk> $$2) {
      ja.a $$3 = new ja.a();

      for (jf $$4 : jf.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ja, dsk> $$0, ja $$1) {
      return a($$0, $$1, dsj.a::i);
   }

   protected void a(ddb $$0, ja $$1) {
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
