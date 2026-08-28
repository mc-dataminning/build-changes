import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efw<FC extends eia> {
   public static final efw<eih> e = a("no_op", new egq(eih.a));
   public static final efw<eiw> f = a("tree", new ehi(eiw.a));
   public static final efw<ein> g = a("flower", new egu(ein.a));
   public static final efw<ein> h = a("no_bonemeal_flower", new egu(ein.a));
   public static final efw<ein> i = a("random_patch", new egu(ein.a));
   public static final efw<ehs> j = a("block_pile", new efe(ehs.a));
   public static final efw<eiv> k = a("spring_feature", new ehh(eiv.a));
   public static final efw<eih> l = a("chorus_plant", new efh(eih.a));
   public static final efw<eio> m = a("replace_single_block", new egx(eio.a));
   public static final efw<eih> n = a("void_start_platform", new ehn(eih.a));
   public static final efw<eih> o = a("desert_well", new efo(eih.a));
   public static final efw<egb> p = a("fossil", new ega(egb.a));
   public static final efw<eic> q = a("huge_red_mushroom", new egh(eic.a));
   public static final efw<eic> r = a("huge_brown_mushroom", new ege(eic.a));
   public static final efw<eih> s = a("ice_spike", new egi(eih.a));
   public static final efw<eih> t = a("glowstone_blob", new egd(eih.a));
   public static final efw<eih> u = a("freeze_top_layer", new ehf(eih.a));
   public static final efw<eih> v = a("vines", new ehm(eih.a));
   public static final efw<ehr> w = a("block_column", new efd(ehr.a));
   public static final efw<eiz> x = a("vegetation_patch", new ehl(eiz.a));
   public static final efw<eiz> y = a("waterlogged_vegetation_patch", new eho(eiz.a));
   public static final efw<eiq> z = a("root_system", new egy(eiq.a));
   public static final efw<eif> A = a("multiface_growth", new ego(eif.a));
   public static final efw<eiy> B = a("underwater_magma", new ehk(eiy.a));
   public static final efw<eih> C = a("monster_room", new egn(eih.a));
   public static final efw<eih> D = a("blue_ice", new eff(eih.a));
   public static final efw<eht> E = a("iceberg", new egj(eht.a));
   public static final efw<eht> F = a("forest_rock", new efc(eht.a));
   public static final efw<ehx> G = a("disk", new efp(ehx.a));
   public static final efw<egl.a> H = a("lake", new egl(egl.a.a));
   public static final efw<eii> I = a("ore", new egr(eii.a));
   public static final efw<eih> J = a("end_platform", new efu(eih.a));
   public static final efw<eiu> K = a("end_spike", new ehg(eiu.a));
   public static final efw<eih> L = a("end_island", new eft(eih.a));
   public static final efw<ehz> M = a("end_gateway", new efs(ehz.a));
   public static final ehc N = a("seagrass", new ehc(eik.k));
   public static final efw<eih> O = a("kelp", new egk(eih.a));
   public static final efw<eih> P = a("coral_tree", new efm(eih.a));
   public static final efw<eih> Q = a("coral_mushroom", new efl(eih.a));
   public static final efw<eih> R = a("coral_claw", new efj(eih.a));
   public static final efw<ehv> S = a("sea_pickle", new ehb(ehv.a));
   public static final efw<eis> T = a("simple_block", new ehd(eis.a));
   public static final efw<eik> U = a("bamboo", new eez(eik.k));
   public static final efw<egf> V = a("huge_fungus", new egg(egf.a));
   public static final efw<eig> W = a("nether_forest_vegetation", new egp(eig.c));
   public static final efw<eih> X = a("weeping_vines", new ehp(eih.a));
   public static final efw<eix> Y = a("twisting_vines", new ehj(eix.a));
   public static final efw<ehu> Z = a("basalt_columns", new efa(ehu.a));
   public static final efw<ehw> aa = a("delta_feature", new efn(ehw.a));
   public static final efw<eip> ab = a("netherrack_replace_blobs", new egw(eip.a));
   public static final efw<eie> ac = a("fill_layer", new efz(eie.a));
   public static final efg ad = a("bonus_chest", new efg(eih.a));
   public static final efw<eih> ae = a("basalt_pillar", new efb(eih.a));
   public static final efw<eii> af = a("scattered_ore", new egz(eii.a));
   public static final efw<eim> ag = a("random_selector", new egv(eim.a));
   public static final efw<eit> ah = a("simple_random_selector", new ehe(eit.a));
   public static final efw<eil> ai = a("random_boolean_selector", new egt(eil.a));
   public static final efw<eib> aj = a("geode", new egc(eib.b));
   public static final efw<ehy> ak = a("dripstone_cluster", new efq(ehy.a));
   public static final efw<eid> al = a("large_dripstone", new egm(eid.a));
   public static final efw<eij> am = a("pointed_dripstone", new egs(eij.a));
   public static final efw<eir> an = a("sculk_patch", new eha(eir.a));
   private final MapCodec<efi<FC, efw<FC>>> a;

   private static <C extends eia, F extends efw<C>> F a(String $$0, F $$1) {
      return ke.a(mb.O, $$0, $$1);
   }

   public efw(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new efi<>(this, $$0x), efi::c);
   }

   public MapCodec<efi<FC, efw<FC>>> a() {
      return this.a;
   }

   protected void a(dgo $$0, ji $$1, dwv $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dwv> a(axe<djk> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhe $$0, ji $$1, dwv $$2, Predicate<dwv> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(efy<FC> var1);

   public boolean a(FC $$0, dhe $$1, dyr $$2, azg $$3, ji $$4) {
      return $$1.f_($$4) ? this.a(new efy<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dwv $$0) {
      return $$0.a(awo.bg);
   }

   public static boolean b(dwv $$0) {
      return $$0.a(awo.ah);
   }

   public static boolean a(dgm $$0, ji $$1) {
      return $$0.a($$1, efw::b);
   }

   public static boolean a(Function<ji, dwv> $$0, ji $$1, Predicate<dwv> $$2) {
      ji.a $$3 = new ji.a();

      for (jn $$4 : jn.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ji, dwv> $$0, ji $$1) {
      return a($$0, $$1, dwu.a::l);
   }

   protected void a(dhe $$0, ji $$1) {
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
