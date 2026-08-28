import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class egu<FC extends eiy> {
   public static final egu<ejf> e = a("no_op", new eho(ejf.a));
   public static final egu<eju> f = a("tree", new eig(eju.a));
   public static final egu<ejl> g = a("flower", new ehs(ejl.a));
   public static final egu<ejl> h = a("no_bonemeal_flower", new ehs(ejl.a));
   public static final egu<ejl> i = a("random_patch", new ehs(ejl.a));
   public static final egu<eiq> j = a("block_pile", new egc(eiq.a));
   public static final egu<ejt> k = a("spring_feature", new eif(ejt.a));
   public static final egu<ejf> l = a("chorus_plant", new egf(ejf.a));
   public static final egu<ejm> m = a("replace_single_block", new ehv(ejm.a));
   public static final egu<ejf> n = a("void_start_platform", new eil(ejf.a));
   public static final egu<ejf> o = a("desert_well", new egm(ejf.a));
   public static final egu<egz> p = a("fossil", new egy(egz.a));
   public static final egu<eja> q = a("huge_red_mushroom", new ehf(eja.a));
   public static final egu<eja> r = a("huge_brown_mushroom", new ehc(eja.a));
   public static final egu<ejf> s = a("ice_spike", new ehg(ejf.a));
   public static final egu<ejf> t = a("glowstone_blob", new ehb(ejf.a));
   public static final egu<ejf> u = a("freeze_top_layer", new eid(ejf.a));
   public static final egu<ejf> v = a("vines", new eik(ejf.a));
   public static final egu<eip> w = a("block_column", new egb(eip.a));
   public static final egu<ejx> x = a("vegetation_patch", new eij(ejx.a));
   public static final egu<ejx> y = a("waterlogged_vegetation_patch", new eim(ejx.a));
   public static final egu<ejo> z = a("root_system", new ehw(ejo.a));
   public static final egu<ejd> A = a("multiface_growth", new ehm(ejd.a));
   public static final egu<ejw> B = a("underwater_magma", new eii(ejw.a));
   public static final egu<ejf> C = a("monster_room", new ehl(ejf.a));
   public static final egu<ejf> D = a("blue_ice", new egd(ejf.a));
   public static final egu<eir> E = a("iceberg", new ehh(eir.a));
   public static final egu<eir> F = a("forest_rock", new ega(eir.a));
   public static final egu<eiv> G = a("disk", new egn(eiv.a));
   public static final egu<ehj.a> H = a("lake", new ehj(ehj.a.a));
   public static final egu<ejg> I = a("ore", new ehp(ejg.a));
   public static final egu<ejf> J = a("end_platform", new egs(ejf.a));
   public static final egu<ejs> K = a("end_spike", new eie(ejs.a));
   public static final egu<ejf> L = a("end_island", new egr(ejf.a));
   public static final egu<eix> M = a("end_gateway", new egq(eix.a));
   public static final eia N = a("seagrass", new eia(eji.k));
   public static final egu<ejf> O = a("kelp", new ehi(ejf.a));
   public static final egu<ejf> P = a("coral_tree", new egk(ejf.a));
   public static final egu<ejf> Q = a("coral_mushroom", new egj(ejf.a));
   public static final egu<ejf> R = a("coral_claw", new egh(ejf.a));
   public static final egu<eit> S = a("sea_pickle", new ehz(eit.a));
   public static final egu<ejq> T = a("simple_block", new eib(ejq.a));
   public static final egu<eji> U = a("bamboo", new efx(eji.k));
   public static final egu<ehd> V = a("huge_fungus", new ehe(ehd.a));
   public static final egu<eje> W = a("nether_forest_vegetation", new ehn(eje.c));
   public static final egu<ejf> X = a("weeping_vines", new ein(ejf.a));
   public static final egu<ejv> Y = a("twisting_vines", new eih(ejv.a));
   public static final egu<eis> Z = a("basalt_columns", new efy(eis.a));
   public static final egu<eiu> aa = a("delta_feature", new egl(eiu.a));
   public static final egu<ejn> ab = a("netherrack_replace_blobs", new ehu(ejn.a));
   public static final egu<ejc> ac = a("fill_layer", new egx(ejc.a));
   public static final ege ad = a("bonus_chest", new ege(ejf.a));
   public static final egu<ejf> ae = a("basalt_pillar", new efz(ejf.a));
   public static final egu<ejg> af = a("scattered_ore", new ehx(ejg.a));
   public static final egu<ejk> ag = a("random_selector", new eht(ejk.a));
   public static final egu<ejr> ah = a("simple_random_selector", new eic(ejr.a));
   public static final egu<ejj> ai = a("random_boolean_selector", new ehr(ejj.a));
   public static final egu<eiz> aj = a("geode", new eha(eiz.b));
   public static final egu<eiw> ak = a("dripstone_cluster", new ego(eiw.a));
   public static final egu<ejb> al = a("large_dripstone", new ehk(ejb.a));
   public static final egu<ejh> am = a("pointed_dripstone", new ehq(ejh.a));
   public static final egu<ejp> an = a("sculk_patch", new ehy(ejp.a));
   private final MapCodec<egg<FC, egu<FC>>> a;

   private static <C extends eiy, F extends egu<C>> F a(String $$0, F $$1) {
      return ke.a(mb.O, $$0, $$1);
   }

   public egu(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new egg<>(this, $$0x), egg::c);
   }

   public MapCodec<egg<FC, egu<FC>>> a() {
      return this.a;
   }

   protected void a(dhh $$0, ji $$1, dxq $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dxq> a(axf<dke> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhy $$0, ji $$1, dxq $$2, Predicate<dxq> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(egw<FC> var1);

   public boolean a(FC $$0, dhy $$1, dzn $$2, azh $$3, ji $$4) {
      return $$1.f_($$4) ? this.a(new egw<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dxq $$0) {
      return $$0.a(awp.bg);
   }

   public static boolean b(dxq $$0) {
      return $$0.a(awp.ah);
   }

   public static boolean a(dhf $$0, ji $$1) {
      return $$0.a($$1, egu::b);
   }

   public static boolean a(Function<ji, dxq> $$0, ji $$1, Predicate<dxq> $$2) {
      ji.a $$3 = new ji.a();

      for (jn $$4 : jn.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ji, dxq> $$0, ji $$1) {
      return a($$0, $$1, dxp.a::l);
   }

   protected void a(dhy $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jn.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
