import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efz<FC extends eid> {
   public static final efz<eik> e = a("no_op", new egt(eik.a));
   public static final efz<eiz> f = a("tree", new ehl(eiz.a));
   public static final efz<eiq> g = a("flower", new egx(eiq.a));
   public static final efz<eiq> h = a("no_bonemeal_flower", new egx(eiq.a));
   public static final efz<eiq> i = a("random_patch", new egx(eiq.a));
   public static final efz<ehv> j = a("block_pile", new efh(ehv.a));
   public static final efz<eiy> k = a("spring_feature", new ehk(eiy.a));
   public static final efz<eik> l = a("chorus_plant", new efk(eik.a));
   public static final efz<eir> m = a("replace_single_block", new eha(eir.a));
   public static final efz<eik> n = a("void_start_platform", new ehq(eik.a));
   public static final efz<eik> o = a("desert_well", new efr(eik.a));
   public static final efz<ege> p = a("fossil", new egd(ege.a));
   public static final efz<eif> q = a("huge_red_mushroom", new egk(eif.a));
   public static final efz<eif> r = a("huge_brown_mushroom", new egh(eif.a));
   public static final efz<eik> s = a("ice_spike", new egl(eik.a));
   public static final efz<eik> t = a("glowstone_blob", new egg(eik.a));
   public static final efz<eik> u = a("freeze_top_layer", new ehi(eik.a));
   public static final efz<eik> v = a("vines", new ehp(eik.a));
   public static final efz<ehu> w = a("block_column", new efg(ehu.a));
   public static final efz<ejc> x = a("vegetation_patch", new eho(ejc.a));
   public static final efz<ejc> y = a("waterlogged_vegetation_patch", new ehr(ejc.a));
   public static final efz<eit> z = a("root_system", new ehb(eit.a));
   public static final efz<eii> A = a("multiface_growth", new egr(eii.a));
   public static final efz<ejb> B = a("underwater_magma", new ehn(ejb.a));
   public static final efz<eik> C = a("monster_room", new egq(eik.a));
   public static final efz<eik> D = a("blue_ice", new efi(eik.a));
   public static final efz<ehw> E = a("iceberg", new egm(ehw.a));
   public static final efz<ehw> F = a("forest_rock", new eff(ehw.a));
   public static final efz<eia> G = a("disk", new efs(eia.a));
   public static final efz<ego.a> H = a("lake", new ego(ego.a.a));
   public static final efz<eil> I = a("ore", new egu(eil.a));
   public static final efz<eik> J = a("end_platform", new efx(eik.a));
   public static final efz<eix> K = a("end_spike", new ehj(eix.a));
   public static final efz<eik> L = a("end_island", new efw(eik.a));
   public static final efz<eic> M = a("end_gateway", new efv(eic.a));
   public static final ehf N = a("seagrass", new ehf(ein.k));
   public static final efz<eik> O = a("kelp", new egn(eik.a));
   public static final efz<eik> P = a("coral_tree", new efp(eik.a));
   public static final efz<eik> Q = a("coral_mushroom", new efo(eik.a));
   public static final efz<eik> R = a("coral_claw", new efm(eik.a));
   public static final efz<ehy> S = a("sea_pickle", new ehe(ehy.a));
   public static final efz<eiv> T = a("simple_block", new ehg(eiv.a));
   public static final efz<ein> U = a("bamboo", new efc(ein.k));
   public static final efz<egi> V = a("huge_fungus", new egj(egi.a));
   public static final efz<eij> W = a("nether_forest_vegetation", new egs(eij.c));
   public static final efz<eik> X = a("weeping_vines", new ehs(eik.a));
   public static final efz<eja> Y = a("twisting_vines", new ehm(eja.a));
   public static final efz<ehx> Z = a("basalt_columns", new efd(ehx.a));
   public static final efz<ehz> aa = a("delta_feature", new efq(ehz.a));
   public static final efz<eis> ab = a("netherrack_replace_blobs", new egz(eis.a));
   public static final efz<eih> ac = a("fill_layer", new egc(eih.a));
   public static final efj ad = a("bonus_chest", new efj(eik.a));
   public static final efz<eik> ae = a("basalt_pillar", new efe(eik.a));
   public static final efz<eil> af = a("scattered_ore", new ehc(eil.a));
   public static final efz<eip> ag = a("random_selector", new egy(eip.a));
   public static final efz<eiw> ah = a("simple_random_selector", new ehh(eiw.a));
   public static final efz<eio> ai = a("random_boolean_selector", new egw(eio.a));
   public static final efz<eie> aj = a("geode", new egf(eie.b));
   public static final efz<eib> ak = a("dripstone_cluster", new eft(eib.a));
   public static final efz<eig> al = a("large_dripstone", new egp(eig.a));
   public static final efz<eim> am = a("pointed_dripstone", new egv(eim.a));
   public static final efz<eiu> an = a("sculk_patch", new ehd(eiu.a));
   private final MapCodec<efl<FC, efz<FC>>> a;

   private static <C extends eid, F extends efz<C>> F a(String $$0, F $$1) {
      return ke.a(mb.O, $$0, $$1);
   }

   public efz(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new efl<>(this, $$0x), efl::c);
   }

   public MapCodec<efl<FC, efz<FC>>> a() {
      return this.a;
   }

   protected void a(dgr $$0, ji $$1, dwy $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dwy> a(axf<djn> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhh $$0, ji $$1, dwy $$2, Predicate<dwy> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(egb<FC> var1);

   public boolean a(FC $$0, dhh $$1, dyu $$2, azh $$3, ji $$4) {
      return $$1.f_($$4) ? this.a(new egb<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dwy $$0) {
      return $$0.a(awp.bg);
   }

   public static boolean b(dwy $$0) {
      return $$0.a(awp.ah);
   }

   public static boolean a(dgp $$0, ji $$1) {
      return $$0.a($$1, efz::b);
   }

   public static boolean a(Function<ji, dwy> $$0, ji $$1, Predicate<dwy> $$2) {
      ji.a $$3 = new ji.a();

      for (jn $$4 : jn.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ji, dwy> $$0, ji $$1) {
      return a($$0, $$1, dwx.a::l);
   }

   protected void a(dhh $$0, ji $$1) {
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
