import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class egv<FC extends eiz> {
   public static final egv<ejg> e = a("no_op", new ehp(ejg.a));
   public static final egv<ejv> f = a("tree", new eih(ejv.a));
   public static final egv<ejm> g = a("flower", new eht(ejm.a));
   public static final egv<ejm> h = a("no_bonemeal_flower", new eht(ejm.a));
   public static final egv<ejm> i = a("random_patch", new eht(ejm.a));
   public static final egv<eir> j = a("block_pile", new egd(eir.a));
   public static final egv<eju> k = a("spring_feature", new eig(eju.a));
   public static final egv<ejg> l = a("chorus_plant", new egg(ejg.a));
   public static final egv<ejn> m = a("replace_single_block", new ehw(ejn.a));
   public static final egv<ejg> n = a("void_start_platform", new eim(ejg.a));
   public static final egv<ejg> o = a("desert_well", new egn(ejg.a));
   public static final egv<eha> p = a("fossil", new egz(eha.a));
   public static final egv<ejb> q = a("huge_red_mushroom", new ehg(ejb.a));
   public static final egv<ejb> r = a("huge_brown_mushroom", new ehd(ejb.a));
   public static final egv<ejg> s = a("ice_spike", new ehh(ejg.a));
   public static final egv<ejg> t = a("glowstone_blob", new ehc(ejg.a));
   public static final egv<ejg> u = a("freeze_top_layer", new eie(ejg.a));
   public static final egv<ejg> v = a("vines", new eil(ejg.a));
   public static final egv<eiq> w = a("block_column", new egc(eiq.a));
   public static final egv<ejy> x = a("vegetation_patch", new eik(ejy.a));
   public static final egv<ejy> y = a("waterlogged_vegetation_patch", new ein(ejy.a));
   public static final egv<ejp> z = a("root_system", new ehx(ejp.a));
   public static final egv<eje> A = a("multiface_growth", new ehn(eje.a));
   public static final egv<ejx> B = a("underwater_magma", new eij(ejx.a));
   public static final egv<ejg> C = a("monster_room", new ehm(ejg.a));
   public static final egv<ejg> D = a("blue_ice", new ege(ejg.a));
   public static final egv<eis> E = a("iceberg", new ehi(eis.a));
   public static final egv<eis> F = a("forest_rock", new egb(eis.a));
   public static final egv<eiw> G = a("disk", new ego(eiw.a));
   public static final egv<ehk.a> H = a("lake", new ehk(ehk.a.a));
   public static final egv<ejh> I = a("ore", new ehq(ejh.a));
   public static final egv<ejg> J = a("end_platform", new egt(ejg.a));
   public static final egv<ejt> K = a("end_spike", new eif(ejt.a));
   public static final egv<ejg> L = a("end_island", new egs(ejg.a));
   public static final egv<eiy> M = a("end_gateway", new egr(eiy.a));
   public static final eib N = a("seagrass", new eib(ejj.k));
   public static final egv<ejg> O = a("kelp", new ehj(ejg.a));
   public static final egv<ejg> P = a("coral_tree", new egl(ejg.a));
   public static final egv<ejg> Q = a("coral_mushroom", new egk(ejg.a));
   public static final egv<ejg> R = a("coral_claw", new egi(ejg.a));
   public static final egv<eiu> S = a("sea_pickle", new eia(eiu.a));
   public static final egv<ejr> T = a("simple_block", new eic(ejr.a));
   public static final egv<ejj> U = a("bamboo", new efy(ejj.k));
   public static final egv<ehe> V = a("huge_fungus", new ehf(ehe.a));
   public static final egv<ejf> W = a("nether_forest_vegetation", new eho(ejf.c));
   public static final egv<ejg> X = a("weeping_vines", new eio(ejg.a));
   public static final egv<ejw> Y = a("twisting_vines", new eii(ejw.a));
   public static final egv<eit> Z = a("basalt_columns", new efz(eit.a));
   public static final egv<eiv> aa = a("delta_feature", new egm(eiv.a));
   public static final egv<ejo> ab = a("netherrack_replace_blobs", new ehv(ejo.a));
   public static final egv<ejd> ac = a("fill_layer", new egy(ejd.a));
   public static final egf ad = a("bonus_chest", new egf(ejg.a));
   public static final egv<ejg> ae = a("basalt_pillar", new ega(ejg.a));
   public static final egv<ejh> af = a("scattered_ore", new ehy(ejh.a));
   public static final egv<ejl> ag = a("random_selector", new ehu(ejl.a));
   public static final egv<ejs> ah = a("simple_random_selector", new eid(ejs.a));
   public static final egv<ejk> ai = a("random_boolean_selector", new ehs(ejk.a));
   public static final egv<eja> aj = a("geode", new ehb(eja.b));
   public static final egv<eix> ak = a("dripstone_cluster", new egp(eix.a));
   public static final egv<ejc> al = a("large_dripstone", new ehl(ejc.a));
   public static final egv<eji> am = a("pointed_dripstone", new ehr(eji.a));
   public static final egv<ejq> an = a("sculk_patch", new ehz(ejq.a));
   private final MapCodec<egh<FC, egv<FC>>> a;

   private static <C extends eiz, F extends egv<C>> F a(String $$0, F $$1) {
      return kd.a(ma.O, $$0, $$1);
   }

   public egv(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new egh<>(this, $$0x), egh::c);
   }

   public MapCodec<egh<FC, egv<FC>>> a() {
      return this.a;
   }

   protected void a(dhp $$0, jh $$1, dxu $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dxu> a(ayk<dkl> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dif $$0, jh $$1, dxu $$2, Predicate<dxu> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(egx<FC> var1);

   public boolean a(FC $$0, dif $$1, dzq $$2, bam $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new egx<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dxu $$0) {
      return $$0.a(axu.bg);
   }

   public static boolean b(dxu $$0) {
      return $$0.a(axu.ah);
   }

   public static boolean a(dhn $$0, jh $$1) {
      return $$0.a($$1, egv::b);
   }

   public static boolean a(Function<jh, dxu> $$0, jh $$1, Predicate<dxu> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dxu> $$0, jh $$1) {
      return a($$0, $$1, dxt.a::l);
   }

   protected void a(dif $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jm.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
