import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dzz<FC extends ecd> {
   public static final dzz<eck> e = a("no_op", new eat(eck.a));
   public static final dzz<ecz> f = a("tree", new ebl(ecz.a));
   public static final dzz<ecq> g = a("flower", new eax(ecq.a));
   public static final dzz<ecq> h = a("no_bonemeal_flower", new eax(ecq.a));
   public static final dzz<ecq> i = a("random_patch", new eax(ecq.a));
   public static final dzz<ebv> j = a("block_pile", new dzi(ebv.a));
   public static final dzz<ecy> k = a("spring_feature", new ebk(ecy.a));
   public static final dzz<eck> l = a("chorus_plant", new dzl(eck.a));
   public static final dzz<ecr> m = a("replace_single_block", new eba(ecr.a));
   public static final dzz<eck> n = a("void_start_platform", new ebq(eck.a));
   public static final dzz<eck> o = a("desert_well", new dzs(eck.a));
   public static final dzz<eae> p = a("fossil", new ead(eae.a));
   public static final dzz<ecf> q = a("huge_red_mushroom", new eak(ecf.a));
   public static final dzz<ecf> r = a("huge_brown_mushroom", new eah(ecf.a));
   public static final dzz<eck> s = a("ice_spike", new eal(eck.a));
   public static final dzz<eck> t = a("glowstone_blob", new eag(eck.a));
   public static final dzz<eck> u = a("freeze_top_layer", new ebi(eck.a));
   public static final dzz<eck> v = a("vines", new ebp(eck.a));
   public static final dzz<ebu> w = a("block_column", new dzh(ebu.a));
   public static final dzz<edc> x = a("vegetation_patch", new ebo(edc.a));
   public static final dzz<edc> y = a("waterlogged_vegetation_patch", new ebr(edc.a));
   public static final dzz<ect> z = a("root_system", new ebb(ect.a));
   public static final dzz<eci> A = a("multiface_growth", new ear(eci.a));
   public static final dzz<edb> B = a("underwater_magma", new ebn(edb.a));
   public static final dzz<eck> C = a("monster_room", new eaq(eck.a));
   public static final dzz<eck> D = a("blue_ice", new dzj(eck.a));
   public static final dzz<ebw> E = a("iceberg", new eam(ebw.a));
   public static final dzz<ebw> F = a("forest_rock", new dzg(ebw.a));
   public static final dzz<eca> G = a("disk", new dzt(eca.a));
   public static final dzz<eao.a> H = a("lake", new eao(eao.a.a));
   public static final dzz<ecl> I = a("ore", new eau(ecl.a));
   public static final dzz<ecx> J = a("end_spike", new ebj(ecx.a));
   public static final dzz<eck> K = a("end_island", new dzx(eck.a));
   public static final dzz<ecc> L = a("end_gateway", new dzw(ecc.a));
   public static final ebf M = a("seagrass", new ebf(ecn.k));
   public static final dzz<eck> N = a("kelp", new ean(eck.a));
   public static final dzz<eck> O = a("coral_tree", new dzq(eck.a));
   public static final dzz<eck> P = a("coral_mushroom", new dzp(eck.a));
   public static final dzz<eck> Q = a("coral_claw", new dzn(eck.a));
   public static final dzz<eby> R = a("sea_pickle", new ebe(eby.a));
   public static final dzz<ecv> S = a("simple_block", new ebg(ecv.a));
   public static final dzz<ecn> T = a("bamboo", new dzd(ecn.k));
   public static final dzz<eai> U = a("huge_fungus", new eaj(eai.a));
   public static final dzz<ecj> V = a("nether_forest_vegetation", new eas(ecj.c));
   public static final dzz<eck> W = a("weeping_vines", new ebs(eck.a));
   public static final dzz<eda> X = a("twisting_vines", new ebm(eda.a));
   public static final dzz<ebx> Y = a("basalt_columns", new dze(ebx.a));
   public static final dzz<ebz> Z = a("delta_feature", new dzr(ebz.a));
   public static final dzz<ecs> aa = a("netherrack_replace_blobs", new eaz(ecs.a));
   public static final dzz<ech> ab = a("fill_layer", new eac(ech.a));
   public static final dzk ac = a("bonus_chest", new dzk(eck.a));
   public static final dzz<eck> ad = a("basalt_pillar", new dzf(eck.a));
   public static final dzz<ecl> ae = a("scattered_ore", new ebc(ecl.a));
   public static final dzz<ecp> af = a("random_selector", new eay(ecp.a));
   public static final dzz<ecw> ag = a("simple_random_selector", new ebh(ecw.a));
   public static final dzz<eco> ah = a("random_boolean_selector", new eaw(eco.a));
   public static final dzz<ece> ai = a("geode", new eaf(ece.b));
   public static final dzz<ecb> aj = a("dripstone_cluster", new dzu(ecb.a));
   public static final dzz<ecg> ak = a("large_dripstone", new eap(ecg.a));
   public static final dzz<ecm> al = a("pointed_dripstone", new eav(ecm.a));
   public static final dzz<ecu> am = a("sculk_patch", new ebd(ecu.a));
   private final MapCodec<dzm<FC, dzz<FC>>> a;

   private static <C extends ecd, F extends dzz<C>> F a(String $$0, F $$1) {
      return jk.a(le.Q, $$0, $$1);
   }

   public dzz(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dzm<>(this, $$0x), dzm::c);
   }

   public MapCodec<dzm<FC, dzz<FC>>> a() {
      return this.a;
   }

   protected void a(dbh $$0, io $$1, drd $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<drd> a(awm<dea> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dbu $$0, io $$1, drd $$2, Predicate<drd> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eab<FC> var1);

   public boolean a(FC $$0, dbu $$1, dta $$2, aym $$3, io $$4) {
      return $$1.f_($$4) ? this.a(new eab<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(drd $$0) {
      return $$0.a(avx.be);
   }

   public static boolean b(drd $$0) {
      return $$0.a(avx.af);
   }

   public static boolean a(dbf $$0, io $$1) {
      return $$0.a($$1, dzz::b);
   }

   public static boolean a(Function<io, drd> $$0, io $$1, Predicate<drd> $$2) {
      io.a $$3 = new io.a();

      for (it $$4 : it.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<io, drd> $$0, io $$1) {
      return a($$0, $$1, drc.a::i);
   }

   protected void a(dbu $$0, io $$1) {
      io.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(it.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
