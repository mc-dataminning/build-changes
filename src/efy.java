import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efy<FC extends eic> {
   public static final efy<eij> e = a("no_op", new egs(eij.a));
   public static final efy<eiy> f = a("tree", new ehk(eiy.a));
   public static final efy<eip> g = a("flower", new egw(eip.a));
   public static final efy<eip> h = a("no_bonemeal_flower", new egw(eip.a));
   public static final efy<eip> i = a("random_patch", new egw(eip.a));
   public static final efy<ehu> j = a("block_pile", new efg(ehu.a));
   public static final efy<eix> k = a("spring_feature", new ehj(eix.a));
   public static final efy<eij> l = a("chorus_plant", new efj(eij.a));
   public static final efy<eiq> m = a("replace_single_block", new egz(eiq.a));
   public static final efy<eij> n = a("void_start_platform", new ehp(eij.a));
   public static final efy<eij> o = a("desert_well", new efq(eij.a));
   public static final efy<egd> p = a("fossil", new egc(egd.a));
   public static final efy<eie> q = a("huge_red_mushroom", new egj(eie.a));
   public static final efy<eie> r = a("huge_brown_mushroom", new egg(eie.a));
   public static final efy<eij> s = a("ice_spike", new egk(eij.a));
   public static final efy<eij> t = a("glowstone_blob", new egf(eij.a));
   public static final efy<eij> u = a("freeze_top_layer", new ehh(eij.a));
   public static final efy<eij> v = a("vines", new eho(eij.a));
   public static final efy<eht> w = a("block_column", new eff(eht.a));
   public static final efy<ejb> x = a("vegetation_patch", new ehn(ejb.a));
   public static final efy<ejb> y = a("waterlogged_vegetation_patch", new ehq(ejb.a));
   public static final efy<eis> z = a("root_system", new eha(eis.a));
   public static final efy<eih> A = a("multiface_growth", new egq(eih.a));
   public static final efy<eja> B = a("underwater_magma", new ehm(eja.a));
   public static final efy<eij> C = a("monster_room", new egp(eij.a));
   public static final efy<eij> D = a("blue_ice", new efh(eij.a));
   public static final efy<ehv> E = a("iceberg", new egl(ehv.a));
   public static final efy<ehv> F = a("forest_rock", new efe(ehv.a));
   public static final efy<ehz> G = a("disk", new efr(ehz.a));
   public static final efy<egn.a> H = a("lake", new egn(egn.a.a));
   public static final efy<eik> I = a("ore", new egt(eik.a));
   public static final efy<eij> J = a("end_platform", new efw(eij.a));
   public static final efy<eiw> K = a("end_spike", new ehi(eiw.a));
   public static final efy<eij> L = a("end_island", new efv(eij.a));
   public static final efy<eib> M = a("end_gateway", new efu(eib.a));
   public static final ehe N = a("seagrass", new ehe(eim.k));
   public static final efy<eij> O = a("kelp", new egm(eij.a));
   public static final efy<eij> P = a("coral_tree", new efo(eij.a));
   public static final efy<eij> Q = a("coral_mushroom", new efn(eij.a));
   public static final efy<eij> R = a("coral_claw", new efl(eij.a));
   public static final efy<ehx> S = a("sea_pickle", new ehd(ehx.a));
   public static final efy<eiu> T = a("simple_block", new ehf(eiu.a));
   public static final efy<eim> U = a("bamboo", new efb(eim.k));
   public static final efy<egh> V = a("huge_fungus", new egi(egh.a));
   public static final efy<eii> W = a("nether_forest_vegetation", new egr(eii.c));
   public static final efy<eij> X = a("weeping_vines", new ehr(eij.a));
   public static final efy<eiz> Y = a("twisting_vines", new ehl(eiz.a));
   public static final efy<ehw> Z = a("basalt_columns", new efc(ehw.a));
   public static final efy<ehy> aa = a("delta_feature", new efp(ehy.a));
   public static final efy<eir> ab = a("netherrack_replace_blobs", new egy(eir.a));
   public static final efy<eig> ac = a("fill_layer", new egb(eig.a));
   public static final efi ad = a("bonus_chest", new efi(eij.a));
   public static final efy<eij> ae = a("basalt_pillar", new efd(eij.a));
   public static final efy<eik> af = a("scattered_ore", new ehb(eik.a));
   public static final efy<eio> ag = a("random_selector", new egx(eio.a));
   public static final efy<eiv> ah = a("simple_random_selector", new ehg(eiv.a));
   public static final efy<ein> ai = a("random_boolean_selector", new egv(ein.a));
   public static final efy<eid> aj = a("geode", new ege(eid.b));
   public static final efy<eia> ak = a("dripstone_cluster", new efs(eia.a));
   public static final efy<eif> al = a("large_dripstone", new ego(eif.a));
   public static final efy<eil> am = a("pointed_dripstone", new egu(eil.a));
   public static final efy<eit> an = a("sculk_patch", new ehc(eit.a));
   private final MapCodec<efk<FC, efy<FC>>> a;

   private static <C extends eic, F extends efy<C>> F a(String $$0, F $$1) {
      return ke.a(mb.O, $$0, $$1);
   }

   public efy(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new efk<>(this, $$0x), efk::c);
   }

   public MapCodec<efk<FC, efy<FC>>> a() {
      return this.a;
   }

   protected void a(dgq $$0, ji $$1, dwx $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dwx> a(axf<djm> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhg $$0, ji $$1, dwx $$2, Predicate<dwx> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ega<FC> var1);

   public boolean a(FC $$0, dhg $$1, dyt $$2, azh $$3, ji $$4) {
      return $$1.f_($$4) ? this.a(new ega<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dwx $$0) {
      return $$0.a(awp.bg);
   }

   public static boolean b(dwx $$0) {
      return $$0.a(awp.ah);
   }

   public static boolean a(dgo $$0, ji $$1) {
      return $$0.a($$1, efy::b);
   }

   public static boolean a(Function<ji, dwx> $$0, ji $$1, Predicate<dwx> $$2) {
      ji.a $$3 = new ji.a();

      for (jn $$4 : jn.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ji, dwx> $$0, ji $$1) {
      return a($$0, $$1, dww.a::l);
   }

   protected void a(dhg $$0, ji $$1) {
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
