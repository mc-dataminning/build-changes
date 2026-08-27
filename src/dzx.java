import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dzx<FC extends ecb> {
   public static final dzx<eci> e = a("no_op", new ear(eci.a));
   public static final dzx<ecx> f = a("tree", new ebj(ecx.a));
   public static final dzx<eco> g = a("flower", new eav(eco.a));
   public static final dzx<eco> h = a("no_bonemeal_flower", new eav(eco.a));
   public static final dzx<eco> i = a("random_patch", new eav(eco.a));
   public static final dzx<ebt> j = a("block_pile", new dzg(ebt.a));
   public static final dzx<ecw> k = a("spring_feature", new ebi(ecw.a));
   public static final dzx<eci> l = a("chorus_plant", new dzj(eci.a));
   public static final dzx<ecp> m = a("replace_single_block", new eay(ecp.a));
   public static final dzx<eci> n = a("void_start_platform", new ebo(eci.a));
   public static final dzx<eci> o = a("desert_well", new dzq(eci.a));
   public static final dzx<eac> p = a("fossil", new eab(eac.a));
   public static final dzx<ecd> q = a("huge_red_mushroom", new eai(ecd.a));
   public static final dzx<ecd> r = a("huge_brown_mushroom", new eaf(ecd.a));
   public static final dzx<eci> s = a("ice_spike", new eaj(eci.a));
   public static final dzx<eci> t = a("glowstone_blob", new eae(eci.a));
   public static final dzx<eci> u = a("freeze_top_layer", new ebg(eci.a));
   public static final dzx<eci> v = a("vines", new ebn(eci.a));
   public static final dzx<ebs> w = a("block_column", new dzf(ebs.a));
   public static final dzx<eda> x = a("vegetation_patch", new ebm(eda.a));
   public static final dzx<eda> y = a("waterlogged_vegetation_patch", new ebp(eda.a));
   public static final dzx<ecr> z = a("root_system", new eaz(ecr.a));
   public static final dzx<ecg> A = a("multiface_growth", new eap(ecg.a));
   public static final dzx<ecz> B = a("underwater_magma", new ebl(ecz.a));
   public static final dzx<eci> C = a("monster_room", new eao(eci.a));
   public static final dzx<eci> D = a("blue_ice", new dzh(eci.a));
   public static final dzx<ebu> E = a("iceberg", new eak(ebu.a));
   public static final dzx<ebu> F = a("forest_rock", new dze(ebu.a));
   public static final dzx<eby> G = a("disk", new dzr(eby.a));
   public static final dzx<eam.a> H = a("lake", new eam(eam.a.a));
   public static final dzx<ecj> I = a("ore", new eas(ecj.a));
   public static final dzx<ecv> J = a("end_spike", new ebh(ecv.a));
   public static final dzx<eci> K = a("end_island", new dzv(eci.a));
   public static final dzx<eca> L = a("end_gateway", new dzu(eca.a));
   public static final ebd M = a("seagrass", new ebd(ecl.k));
   public static final dzx<eci> N = a("kelp", new eal(eci.a));
   public static final dzx<eci> O = a("coral_tree", new dzo(eci.a));
   public static final dzx<eci> P = a("coral_mushroom", new dzn(eci.a));
   public static final dzx<eci> Q = a("coral_claw", new dzl(eci.a));
   public static final dzx<ebw> R = a("sea_pickle", new ebc(ebw.a));
   public static final dzx<ect> S = a("simple_block", new ebe(ect.a));
   public static final dzx<ecl> T = a("bamboo", new dzb(ecl.k));
   public static final dzx<eag> U = a("huge_fungus", new eah(eag.a));
   public static final dzx<ech> V = a("nether_forest_vegetation", new eaq(ech.c));
   public static final dzx<eci> W = a("weeping_vines", new ebq(eci.a));
   public static final dzx<ecy> X = a("twisting_vines", new ebk(ecy.a));
   public static final dzx<ebv> Y = a("basalt_columns", new dzc(ebv.a));
   public static final dzx<ebx> Z = a("delta_feature", new dzp(ebx.a));
   public static final dzx<ecq> aa = a("netherrack_replace_blobs", new eax(ecq.a));
   public static final dzx<ecf> ab = a("fill_layer", new eaa(ecf.a));
   public static final dzi ac = a("bonus_chest", new dzi(eci.a));
   public static final dzx<eci> ad = a("basalt_pillar", new dzd(eci.a));
   public static final dzx<ecj> ae = a("scattered_ore", new eba(ecj.a));
   public static final dzx<ecn> af = a("random_selector", new eaw(ecn.a));
   public static final dzx<ecu> ag = a("simple_random_selector", new ebf(ecu.a));
   public static final dzx<ecm> ah = a("random_boolean_selector", new eau(ecm.a));
   public static final dzx<ecc> ai = a("geode", new ead(ecc.b));
   public static final dzx<ebz> aj = a("dripstone_cluster", new dzs(ebz.a));
   public static final dzx<ece> ak = a("large_dripstone", new ean(ece.a));
   public static final dzx<eck> al = a("pointed_dripstone", new eat(eck.a));
   public static final dzx<ecs> am = a("sculk_patch", new ebb(ecs.a));
   private final MapCodec<dzk<FC, dzx<FC>>> a;

   private static <C extends ecb, F extends dzx<C>> F a(String $$0, F $$1) {
      return jk.a(le.Q, $$0, $$1);
   }

   public dzx(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dzk<>(this, $$0x), dzk::c);
   }

   public MapCodec<dzk<FC, dzx<FC>>> a() {
      return this.a;
   }

   protected void a(dbf $$0, io $$1, drb $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<drb> a(awl<ddy> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dbs $$0, io $$1, drb $$2, Predicate<drb> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dzz<FC> var1);

   public boolean a(FC $$0, dbs $$1, dsy $$2, ayk $$3, io $$4) {
      return $$1.f_($$4) ? this.a(new dzz<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(drb $$0) {
      return $$0.a(avw.be);
   }

   public static boolean b(drb $$0) {
      return $$0.a(avw.af);
   }

   public static boolean a(dbd $$0, io $$1) {
      return $$0.a($$1, dzx::b);
   }

   public static boolean a(Function<io, drb> $$0, io $$1, Predicate<drb> $$2) {
      io.a $$3 = new io.a();

      for (it $$4 : it.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<io, drb> $$0, io $$1) {
      return a($$0, $$1, dra.a::i);
   }

   protected void a(dbs $$0, io $$1) {
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
