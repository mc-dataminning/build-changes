import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eba<FC extends ede> {
   public static final eba<edl> e = a("no_op", new ebu(edl.a));
   public static final eba<eea> f = a("tree", new ecm(eea.a));
   public static final eba<edr> g = a("flower", new eby(edr.a));
   public static final eba<edr> h = a("no_bonemeal_flower", new eby(edr.a));
   public static final eba<edr> i = a("random_patch", new eby(edr.a));
   public static final eba<ecw> j = a("block_pile", new eaj(ecw.a));
   public static final eba<edz> k = a("spring_feature", new ecl(edz.a));
   public static final eba<edl> l = a("chorus_plant", new eam(edl.a));
   public static final eba<eds> m = a("replace_single_block", new ecb(eds.a));
   public static final eba<edl> n = a("void_start_platform", new ecr(edl.a));
   public static final eba<edl> o = a("desert_well", new eat(edl.a));
   public static final eba<ebf> p = a("fossil", new ebe(ebf.a));
   public static final eba<edg> q = a("huge_red_mushroom", new ebl(edg.a));
   public static final eba<edg> r = a("huge_brown_mushroom", new ebi(edg.a));
   public static final eba<edl> s = a("ice_spike", new ebm(edl.a));
   public static final eba<edl> t = a("glowstone_blob", new ebh(edl.a));
   public static final eba<edl> u = a("freeze_top_layer", new ecj(edl.a));
   public static final eba<edl> v = a("vines", new ecq(edl.a));
   public static final eba<ecv> w = a("block_column", new eai(ecv.a));
   public static final eba<eed> x = a("vegetation_patch", new ecp(eed.a));
   public static final eba<eed> y = a("waterlogged_vegetation_patch", new ecs(eed.a));
   public static final eba<edu> z = a("root_system", new ecc(edu.a));
   public static final eba<edj> A = a("multiface_growth", new ebs(edj.a));
   public static final eba<eec> B = a("underwater_magma", new eco(eec.a));
   public static final eba<edl> C = a("monster_room", new ebr(edl.a));
   public static final eba<edl> D = a("blue_ice", new eak(edl.a));
   public static final eba<ecx> E = a("iceberg", new ebn(ecx.a));
   public static final eba<ecx> F = a("forest_rock", new eah(ecx.a));
   public static final eba<edb> G = a("disk", new eau(edb.a));
   public static final eba<ebp.a> H = a("lake", new ebp(ebp.a.a));
   public static final eba<edm> I = a("ore", new ebv(edm.a));
   public static final eba<edy> J = a("end_spike", new eck(edy.a));
   public static final eba<edl> K = a("end_island", new eay(edl.a));
   public static final eba<edd> L = a("end_gateway", new eax(edd.a));
   public static final ecg M = a("seagrass", new ecg(edo.k));
   public static final eba<edl> N = a("kelp", new ebo(edl.a));
   public static final eba<edl> O = a("coral_tree", new ear(edl.a));
   public static final eba<edl> P = a("coral_mushroom", new eaq(edl.a));
   public static final eba<edl> Q = a("coral_claw", new eao(edl.a));
   public static final eba<ecz> R = a("sea_pickle", new ecf(ecz.a));
   public static final eba<edw> S = a("simple_block", new ech(edw.a));
   public static final eba<edo> T = a("bamboo", new eae(edo.k));
   public static final eba<ebj> U = a("huge_fungus", new ebk(ebj.a));
   public static final eba<edk> V = a("nether_forest_vegetation", new ebt(edk.c));
   public static final eba<edl> W = a("weeping_vines", new ect(edl.a));
   public static final eba<eeb> X = a("twisting_vines", new ecn(eeb.a));
   public static final eba<ecy> Y = a("basalt_columns", new eaf(ecy.a));
   public static final eba<eda> Z = a("delta_feature", new eas(eda.a));
   public static final eba<edt> aa = a("netherrack_replace_blobs", new eca(edt.a));
   public static final eba<edi> ab = a("fill_layer", new ebd(edi.a));
   public static final eal ac = a("bonus_chest", new eal(edl.a));
   public static final eba<edl> ad = a("basalt_pillar", new eag(edl.a));
   public static final eba<edm> ae = a("scattered_ore", new ecd(edm.a));
   public static final eba<edq> af = a("random_selector", new ebz(edq.a));
   public static final eba<edx> ag = a("simple_random_selector", new eci(edx.a));
   public static final eba<edp> ah = a("random_boolean_selector", new ebx(edp.a));
   public static final eba<edf> ai = a("geode", new ebg(edf.b));
   public static final eba<edc> aj = a("dripstone_cluster", new eav(edc.a));
   public static final eba<edh> ak = a("large_dripstone", new ebq(edh.a));
   public static final eba<edn> al = a("pointed_dripstone", new ebw(edn.a));
   public static final eba<edv> am = a("sculk_patch", new ece(edv.a));
   private final MapCodec<ean<FC, eba<FC>>> a;

   private static <C extends ede, F extends eba<C>> F a(String $$0, F $$1) {
      return jv.a(lp.Q, $$0, $$1);
   }

   public eba(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ean<>(this, $$0x), ean::c);
   }

   public MapCodec<ean<FC, eba<FC>>> a() {
      return this.a;
   }

   protected void a(dci $$0, iz $$1, dse $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dse> a(axf<dfb> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dcv $$0, iz $$1, dse $$2, Predicate<dse> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ebc<FC> var1);

   public boolean a(FC $$0, dcv $$1, dub $$2, azh $$3, iz $$4) {
      return $$1.f_($$4) ? this.a(new ebc<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dse $$0) {
      return $$0.a(awp.be);
   }

   public static boolean b(dse $$0) {
      return $$0.a(awp.af);
   }

   public static boolean a(dcg $$0, iz $$1) {
      return $$0.a($$1, eba::b);
   }

   public static boolean a(Function<iz, dse> $$0, iz $$1, Predicate<dse> $$2) {
      iz.a $$3 = new iz.a();

      for (je $$4 : je.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iz, dse> $$0, iz $$1) {
      return a($$0, $$1, dsd.a::i);
   }

   protected void a(dcv $$0, iz $$1) {
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
