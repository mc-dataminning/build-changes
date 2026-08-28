import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class egw<FC extends eja> {
   public static final egw<ejh> e = a("no_op", new ehq(ejh.a));
   public static final egw<ejw> f = a("tree", new eii(ejw.a));
   public static final egw<ejn> g = a("flower", new ehu(ejn.a));
   public static final egw<ejn> h = a("no_bonemeal_flower", new ehu(ejn.a));
   public static final egw<ejn> i = a("random_patch", new ehu(ejn.a));
   public static final egw<eis> j = a("block_pile", new ege(eis.a));
   public static final egw<ejv> k = a("spring_feature", new eih(ejv.a));
   public static final egw<ejh> l = a("chorus_plant", new egh(ejh.a));
   public static final egw<ejo> m = a("replace_single_block", new ehx(ejo.a));
   public static final egw<ejh> n = a("void_start_platform", new ein(ejh.a));
   public static final egw<ejh> o = a("desert_well", new ego(ejh.a));
   public static final egw<ehb> p = a("fossil", new eha(ehb.a));
   public static final egw<ejc> q = a("huge_red_mushroom", new ehh(ejc.a));
   public static final egw<ejc> r = a("huge_brown_mushroom", new ehe(ejc.a));
   public static final egw<ejh> s = a("ice_spike", new ehi(ejh.a));
   public static final egw<ejh> t = a("glowstone_blob", new ehd(ejh.a));
   public static final egw<ejh> u = a("freeze_top_layer", new eif(ejh.a));
   public static final egw<ejh> v = a("vines", new eim(ejh.a));
   public static final egw<eir> w = a("block_column", new egd(eir.a));
   public static final egw<ejz> x = a("vegetation_patch", new eil(ejz.a));
   public static final egw<ejz> y = a("waterlogged_vegetation_patch", new eio(ejz.a));
   public static final egw<ejq> z = a("root_system", new ehy(ejq.a));
   public static final egw<ejf> A = a("multiface_growth", new eho(ejf.a));
   public static final egw<ejy> B = a("underwater_magma", new eik(ejy.a));
   public static final egw<ejh> C = a("monster_room", new ehn(ejh.a));
   public static final egw<ejh> D = a("blue_ice", new egf(ejh.a));
   public static final egw<eit> E = a("iceberg", new ehj(eit.a));
   public static final egw<eit> F = a("forest_rock", new egc(eit.a));
   public static final egw<eix> G = a("disk", new egp(eix.a));
   public static final egw<ehl.a> H = a("lake", new ehl(ehl.a.a));
   public static final egw<eji> I = a("ore", new ehr(eji.a));
   public static final egw<ejh> J = a("end_platform", new egu(ejh.a));
   public static final egw<eju> K = a("end_spike", new eig(eju.a));
   public static final egw<ejh> L = a("end_island", new egt(ejh.a));
   public static final egw<eiz> M = a("end_gateway", new egs(eiz.a));
   public static final eic N = a("seagrass", new eic(ejk.k));
   public static final egw<ejh> O = a("kelp", new ehk(ejh.a));
   public static final egw<ejh> P = a("coral_tree", new egm(ejh.a));
   public static final egw<ejh> Q = a("coral_mushroom", new egl(ejh.a));
   public static final egw<ejh> R = a("coral_claw", new egj(ejh.a));
   public static final egw<eiv> S = a("sea_pickle", new eib(eiv.a));
   public static final egw<ejs> T = a("simple_block", new eid(ejs.a));
   public static final egw<ejk> U = a("bamboo", new efz(ejk.k));
   public static final egw<ehf> V = a("huge_fungus", new ehg(ehf.a));
   public static final egw<ejg> W = a("nether_forest_vegetation", new ehp(ejg.c));
   public static final egw<ejh> X = a("weeping_vines", new eip(ejh.a));
   public static final egw<ejx> Y = a("twisting_vines", new eij(ejx.a));
   public static final egw<eiu> Z = a("basalt_columns", new ega(eiu.a));
   public static final egw<eiw> aa = a("delta_feature", new egn(eiw.a));
   public static final egw<ejp> ab = a("netherrack_replace_blobs", new ehw(ejp.a));
   public static final egw<eje> ac = a("fill_layer", new egz(eje.a));
   public static final egg ad = a("bonus_chest", new egg(ejh.a));
   public static final egw<ejh> ae = a("basalt_pillar", new egb(ejh.a));
   public static final egw<eji> af = a("scattered_ore", new ehz(eji.a));
   public static final egw<ejm> ag = a("random_selector", new ehv(ejm.a));
   public static final egw<ejt> ah = a("simple_random_selector", new eie(ejt.a));
   public static final egw<ejl> ai = a("random_boolean_selector", new eht(ejl.a));
   public static final egw<ejb> aj = a("geode", new ehc(ejb.b));
   public static final egw<eiy> ak = a("dripstone_cluster", new egq(eiy.a));
   public static final egw<ejd> al = a("large_dripstone", new ehm(ejd.a));
   public static final egw<ejj> am = a("pointed_dripstone", new ehs(ejj.a));
   public static final egw<ejr> an = a("sculk_patch", new eia(ejr.a));
   private final MapCodec<egi<FC, egw<FC>>> a;

   private static <C extends eja, F extends egw<C>> F a(String $$0, F $$1) {
      return kd.a(ma.O, $$0, $$1);
   }

   public egw(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new egi<>(this, $$0x), egi::c);
   }

   public MapCodec<egi<FC, egw<FC>>> a() {
      return this.a;
   }

   protected void a(dhq $$0, jh $$1, dxv $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dxv> a(ayk<dkm> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dig $$0, jh $$1, dxv $$2, Predicate<dxv> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(egy<FC> var1);

   public boolean a(FC $$0, dig $$1, dzr $$2, bam $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new egy<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dxv $$0) {
      return $$0.a(axu.bg);
   }

   public static boolean b(dxv $$0) {
      return $$0.a(axu.ah);
   }

   public static boolean a(dho $$0, jh $$1) {
      return $$0.a($$1, egw::b);
   }

   public static boolean a(Function<jh, dxv> $$0, jh $$1, Predicate<dxv> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dxv> $$0, jh $$1) {
      return a($$0, $$1, dxu.a::l);
   }

   protected void a(dig $$0, jh $$1) {
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
