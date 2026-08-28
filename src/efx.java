import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efx<FC extends eib> {
   public static final efx<eii> e = a("no_op", new egr(eii.a));
   public static final efx<eix> f = a("tree", new ehj(eix.a));
   public static final efx<eio> g = a("flower", new egv(eio.a));
   public static final efx<eio> h = a("no_bonemeal_flower", new egv(eio.a));
   public static final efx<eio> i = a("random_patch", new egv(eio.a));
   public static final efx<eht> j = a("block_pile", new eff(eht.a));
   public static final efx<eiw> k = a("spring_feature", new ehi(eiw.a));
   public static final efx<eii> l = a("chorus_plant", new efi(eii.a));
   public static final efx<eip> m = a("replace_single_block", new egy(eip.a));
   public static final efx<eii> n = a("void_start_platform", new eho(eii.a));
   public static final efx<eii> o = a("desert_well", new efp(eii.a));
   public static final efx<egc> p = a("fossil", new egb(egc.a));
   public static final efx<eid> q = a("huge_red_mushroom", new egi(eid.a));
   public static final efx<eid> r = a("huge_brown_mushroom", new egf(eid.a));
   public static final efx<eii> s = a("ice_spike", new egj(eii.a));
   public static final efx<eii> t = a("glowstone_blob", new ege(eii.a));
   public static final efx<eii> u = a("freeze_top_layer", new ehg(eii.a));
   public static final efx<eii> v = a("vines", new ehn(eii.a));
   public static final efx<ehs> w = a("block_column", new efe(ehs.a));
   public static final efx<eja> x = a("vegetation_patch", new ehm(eja.a));
   public static final efx<eja> y = a("waterlogged_vegetation_patch", new ehp(eja.a));
   public static final efx<eir> z = a("root_system", new egz(eir.a));
   public static final efx<eig> A = a("multiface_growth", new egp(eig.a));
   public static final efx<eiz> B = a("underwater_magma", new ehl(eiz.a));
   public static final efx<eii> C = a("monster_room", new ego(eii.a));
   public static final efx<eii> D = a("blue_ice", new efg(eii.a));
   public static final efx<ehu> E = a("iceberg", new egk(ehu.a));
   public static final efx<ehu> F = a("forest_rock", new efd(ehu.a));
   public static final efx<ehy> G = a("disk", new efq(ehy.a));
   public static final efx<egm.a> H = a("lake", new egm(egm.a.a));
   public static final efx<eij> I = a("ore", new egs(eij.a));
   public static final efx<eii> J = a("end_platform", new efv(eii.a));
   public static final efx<eiv> K = a("end_spike", new ehh(eiv.a));
   public static final efx<eii> L = a("end_island", new efu(eii.a));
   public static final efx<eia> M = a("end_gateway", new eft(eia.a));
   public static final ehd N = a("seagrass", new ehd(eil.k));
   public static final efx<eii> O = a("kelp", new egl(eii.a));
   public static final efx<eii> P = a("coral_tree", new efn(eii.a));
   public static final efx<eii> Q = a("coral_mushroom", new efm(eii.a));
   public static final efx<eii> R = a("coral_claw", new efk(eii.a));
   public static final efx<ehw> S = a("sea_pickle", new ehc(ehw.a));
   public static final efx<eit> T = a("simple_block", new ehe(eit.a));
   public static final efx<eil> U = a("bamboo", new efa(eil.k));
   public static final efx<egg> V = a("huge_fungus", new egh(egg.a));
   public static final efx<eih> W = a("nether_forest_vegetation", new egq(eih.c));
   public static final efx<eii> X = a("weeping_vines", new ehq(eii.a));
   public static final efx<eiy> Y = a("twisting_vines", new ehk(eiy.a));
   public static final efx<ehv> Z = a("basalt_columns", new efb(ehv.a));
   public static final efx<ehx> aa = a("delta_feature", new efo(ehx.a));
   public static final efx<eiq> ab = a("netherrack_replace_blobs", new egx(eiq.a));
   public static final efx<eif> ac = a("fill_layer", new ega(eif.a));
   public static final efh ad = a("bonus_chest", new efh(eii.a));
   public static final efx<eii> ae = a("basalt_pillar", new efc(eii.a));
   public static final efx<eij> af = a("scattered_ore", new eha(eij.a));
   public static final efx<ein> ag = a("random_selector", new egw(ein.a));
   public static final efx<eiu> ah = a("simple_random_selector", new ehf(eiu.a));
   public static final efx<eim> ai = a("random_boolean_selector", new egu(eim.a));
   public static final efx<eic> aj = a("geode", new egd(eic.b));
   public static final efx<ehz> ak = a("dripstone_cluster", new efr(ehz.a));
   public static final efx<eie> al = a("large_dripstone", new egn(eie.a));
   public static final efx<eik> am = a("pointed_dripstone", new egt(eik.a));
   public static final efx<eis> an = a("sculk_patch", new ehb(eis.a));
   private final MapCodec<efj<FC, efx<FC>>> a;

   private static <C extends eib, F extends efx<C>> F a(String $$0, F $$1) {
      return ke.a(mb.O, $$0, $$1);
   }

   public efx(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new efj<>(this, $$0x), efj::c);
   }

   public MapCodec<efj<FC, efx<FC>>> a() {
      return this.a;
   }

   protected void a(dgp $$0, ji $$1, dww $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dww> a(axf<djl> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhf $$0, ji $$1, dww $$2, Predicate<dww> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(efz<FC> var1);

   public boolean a(FC $$0, dhf $$1, dys $$2, azh $$3, ji $$4) {
      return $$1.f_($$4) ? this.a(new efz<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dww $$0) {
      return $$0.a(awp.bg);
   }

   public static boolean b(dww $$0) {
      return $$0.a(awp.ah);
   }

   public static boolean a(dgn $$0, ji $$1) {
      return $$0.a($$1, efx::b);
   }

   public static boolean a(Function<ji, dww> $$0, ji $$1, Predicate<dww> $$2) {
      ji.a $$3 = new ji.a();

      for (jn $$4 : jn.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ji, dww> $$0, ji $$1) {
      return a($$0, $$1, dwv.a::l);
   }

   protected void a(dhf $$0, ji $$1) {
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
