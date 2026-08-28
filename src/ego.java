import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ego<FC extends eis> {
   public static final ego<eiz> e = a("no_op", new ehi(eiz.a));
   public static final ego<ejo> f = a("tree", new eia(ejo.a));
   public static final ego<ejf> g = a("flower", new ehm(ejf.a));
   public static final ego<ejf> h = a("no_bonemeal_flower", new ehm(ejf.a));
   public static final ego<ejf> i = a("random_patch", new ehm(ejf.a));
   public static final ego<eik> j = a("block_pile", new efw(eik.a));
   public static final ego<ejn> k = a("spring_feature", new ehz(ejn.a));
   public static final ego<eiz> l = a("chorus_plant", new efz(eiz.a));
   public static final ego<ejg> m = a("replace_single_block", new ehp(ejg.a));
   public static final ego<eiz> n = a("void_start_platform", new eif(eiz.a));
   public static final ego<eiz> o = a("desert_well", new egg(eiz.a));
   public static final ego<egt> p = a("fossil", new egs(egt.a));
   public static final ego<eiu> q = a("huge_red_mushroom", new egz(eiu.a));
   public static final ego<eiu> r = a("huge_brown_mushroom", new egw(eiu.a));
   public static final ego<eiz> s = a("ice_spike", new eha(eiz.a));
   public static final ego<eiz> t = a("glowstone_blob", new egv(eiz.a));
   public static final ego<eiz> u = a("freeze_top_layer", new ehx(eiz.a));
   public static final ego<eiz> v = a("vines", new eie(eiz.a));
   public static final ego<eij> w = a("block_column", new efv(eij.a));
   public static final ego<ejr> x = a("vegetation_patch", new eid(ejr.a));
   public static final ego<ejr> y = a("waterlogged_vegetation_patch", new eig(ejr.a));
   public static final ego<eji> z = a("root_system", new ehq(eji.a));
   public static final ego<eix> A = a("multiface_growth", new ehg(eix.a));
   public static final ego<ejq> B = a("underwater_magma", new eic(ejq.a));
   public static final ego<eiz> C = a("monster_room", new ehf(eiz.a));
   public static final ego<eiz> D = a("blue_ice", new efx(eiz.a));
   public static final ego<eil> E = a("iceberg", new ehb(eil.a));
   public static final ego<eil> F = a("forest_rock", new efu(eil.a));
   public static final ego<eip> G = a("disk", new egh(eip.a));
   public static final ego<ehd.a> H = a("lake", new ehd(ehd.a.a));
   public static final ego<eja> I = a("ore", new ehj(eja.a));
   public static final ego<eiz> J = a("end_platform", new egm(eiz.a));
   public static final ego<ejm> K = a("end_spike", new ehy(ejm.a));
   public static final ego<eiz> L = a("end_island", new egl(eiz.a));
   public static final ego<eir> M = a("end_gateway", new egk(eir.a));
   public static final ehu N = a("seagrass", new ehu(ejc.k));
   public static final ego<eiz> O = a("kelp", new ehc(eiz.a));
   public static final ego<eiz> P = a("coral_tree", new ege(eiz.a));
   public static final ego<eiz> Q = a("coral_mushroom", new egd(eiz.a));
   public static final ego<eiz> R = a("coral_claw", new egb(eiz.a));
   public static final ego<ein> S = a("sea_pickle", new eht(ein.a));
   public static final ego<ejk> T = a("simple_block", new ehv(ejk.a));
   public static final ego<ejc> U = a("bamboo", new efr(ejc.k));
   public static final ego<egx> V = a("huge_fungus", new egy(egx.a));
   public static final ego<eiy> W = a("nether_forest_vegetation", new ehh(eiy.c));
   public static final ego<eiz> X = a("weeping_vines", new eih(eiz.a));
   public static final ego<ejp> Y = a("twisting_vines", new eib(ejp.a));
   public static final ego<eim> Z = a("basalt_columns", new efs(eim.a));
   public static final ego<eio> aa = a("delta_feature", new egf(eio.a));
   public static final ego<ejh> ab = a("netherrack_replace_blobs", new eho(ejh.a));
   public static final ego<eiw> ac = a("fill_layer", new egr(eiw.a));
   public static final efy ad = a("bonus_chest", new efy(eiz.a));
   public static final ego<eiz> ae = a("basalt_pillar", new eft(eiz.a));
   public static final ego<eja> af = a("scattered_ore", new ehr(eja.a));
   public static final ego<eje> ag = a("random_selector", new ehn(eje.a));
   public static final ego<ejl> ah = a("simple_random_selector", new ehw(ejl.a));
   public static final ego<ejd> ai = a("random_boolean_selector", new ehl(ejd.a));
   public static final ego<eit> aj = a("geode", new egu(eit.b));
   public static final ego<eiq> ak = a("dripstone_cluster", new egi(eiq.a));
   public static final ego<eiv> al = a("large_dripstone", new ehe(eiv.a));
   public static final ego<ejb> am = a("pointed_dripstone", new ehk(ejb.a));
   public static final ego<ejj> an = a("sculk_patch", new ehs(ejj.a));
   private final MapCodec<ega<FC, ego<FC>>> a;

   private static <C extends eis, F extends ego<C>> F a(String $$0, F $$1) {
      return kd.a(ma.O, $$0, $$1);
   }

   public ego(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ega<>(this, $$0x), ega::c);
   }

   public MapCodec<ega<FC, ego<FC>>> a() {
      return this.a;
   }

   protected void a(dhi $$0, jh $$1, dxn $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dxn> a(ayk<dke> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhy $$0, jh $$1, dxn $$2, Predicate<dxn> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(egq<FC> var1);

   public boolean a(FC $$0, dhy $$1, dzj $$2, bam $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new egq<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dxn $$0) {
      return $$0.a(axu.bg);
   }

   public static boolean b(dxn $$0) {
      return $$0.a(axu.ah);
   }

   public static boolean a(dhg $$0, jh $$1) {
      return $$0.a($$1, ego::b);
   }

   public static boolean a(Function<jh, dxn> $$0, jh $$1, Predicate<dxn> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dxn> $$0, jh $$1) {
      return a($$0, $$1, dxm.a::l);
   }

   protected void a(dhy $$0, jh $$1) {
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
