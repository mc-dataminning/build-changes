import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejt<FC extends elx> {
   public static final ejt<eme> e = a("no_op", new ekn(eme.a));
   public static final ejt<emt> f = a("tree", new elf(emt.a));
   public static final ejt<emk> g = a("flower", new ekr(emk.a));
   public static final ejt<emk> h = a("no_bonemeal_flower", new ekr(emk.a));
   public static final ejt<emk> i = a("random_patch", new ekr(emk.a));
   public static final ejt<elp> j = a("block_pile", new ejb(elp.a));
   public static final ejt<ems> k = a("spring_feature", new ele(ems.a));
   public static final ejt<eme> l = a("chorus_plant", new eje(eme.a));
   public static final ejt<eml> m = a("replace_single_block", new eku(eml.a));
   public static final ejt<eme> n = a("void_start_platform", new elk(eme.a));
   public static final ejt<eme> o = a("desert_well", new ejl(eme.a));
   public static final ejt<ejy> p = a("fossil", new ejx(ejy.a));
   public static final ejt<elz> q = a("huge_red_mushroom", new eke(elz.a));
   public static final ejt<elz> r = a("huge_brown_mushroom", new ekb(elz.a));
   public static final ejt<eme> s = a("ice_spike", new ekf(eme.a));
   public static final ejt<eme> t = a("glowstone_blob", new eka(eme.a));
   public static final ejt<eme> u = a("freeze_top_layer", new elc(eme.a));
   public static final ejt<eme> v = a("vines", new elj(eme.a));
   public static final ejt<elo> w = a("block_column", new eja(elo.a));
   public static final ejt<emw> x = a("vegetation_patch", new eli(emw.a));
   public static final ejt<emw> y = a("waterlogged_vegetation_patch", new ell(emw.a));
   public static final ejt<emn> z = a("root_system", new ekv(emn.a));
   public static final ejt<emc> A = a("multiface_growth", new ekl(emc.a));
   public static final ejt<emv> B = a("underwater_magma", new elh(emv.a));
   public static final ejt<eme> C = a("monster_room", new ekk(eme.a));
   public static final ejt<eme> D = a("blue_ice", new ejc(eme.a));
   public static final ejt<elq> E = a("iceberg", new ekg(elq.a));
   public static final ejt<elq> F = a("forest_rock", new eiz(elq.a));
   public static final ejt<elu> G = a("disk", new ejm(elu.a));
   public static final ejt<eki.a> H = a("lake", new eki(eki.a.a));
   public static final ejt<emf> I = a("ore", new eko(emf.a));
   public static final ejt<eme> J = a("end_platform", new ejr(eme.a));
   public static final ejt<emr> K = a("end_spike", new eld(emr.a));
   public static final ejt<eme> L = a("end_island", new ejq(eme.a));
   public static final ejt<elw> M = a("end_gateway", new ejp(elw.a));
   public static final ekz N = a("seagrass", new ekz(emh.k));
   public static final ejt<eme> O = a("kelp", new ekh(eme.a));
   public static final ejt<eme> P = a("coral_tree", new ejj(eme.a));
   public static final ejt<eme> Q = a("coral_mushroom", new eji(eme.a));
   public static final ejt<eme> R = a("coral_claw", new ejg(eme.a));
   public static final ejt<els> S = a("sea_pickle", new eky(els.a));
   public static final ejt<emp> T = a("simple_block", new ela(emp.a));
   public static final ejt<emh> U = a("bamboo", new eiw(emh.k));
   public static final ejt<ekc> V = a("huge_fungus", new ekd(ekc.a));
   public static final ejt<emd> W = a("nether_forest_vegetation", new ekm(emd.c));
   public static final ejt<eme> X = a("weeping_vines", new elm(eme.a));
   public static final ejt<emu> Y = a("twisting_vines", new elg(emu.a));
   public static final ejt<elr> Z = a("basalt_columns", new eix(elr.a));
   public static final ejt<elt> aa = a("delta_feature", new ejk(elt.a));
   public static final ejt<emm> ab = a("netherrack_replace_blobs", new ekt(emm.a));
   public static final ejt<emb> ac = a("fill_layer", new ejw(emb.a));
   public static final ejd ad = a("bonus_chest", new ejd(eme.a));
   public static final ejt<eme> ae = a("basalt_pillar", new eiy(eme.a));
   public static final ejt<emf> af = a("scattered_ore", new ekw(emf.a));
   public static final ejt<emj> ag = a("random_selector", new eks(emj.a));
   public static final ejt<emq> ah = a("simple_random_selector", new elb(emq.a));
   public static final ejt<emi> ai = a("random_boolean_selector", new ekq(emi.a));
   public static final ejt<ely> aj = a("geode", new ejz(ely.b));
   public static final ejt<elv> ak = a("dripstone_cluster", new ejn(elv.a));
   public static final ejt<ema> al = a("large_dripstone", new ekj(ema.a));
   public static final ejt<emg> am = a("pointed_dripstone", new ekp(emg.a));
   public static final ejt<emo> an = a("sculk_patch", new ekx(emo.a));
   private final MapCodec<ejf<FC, ejt<FC>>> a;

   private static <C extends elx, F extends ejt<C>> F a(String $$0, F $$1) {
      return js.a(mg.O, $$0, $$1);
   }

   public ejt(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ejf<>(this, $$0x), ejf::c);
   }

   public MapCodec<ejf<FC, ejt<FC>>> a() {
      return this.a;
   }

   protected void a(djp $$0, iv $$1, eao $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<eao> a(axr<dmm> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dkg $$0, iv $$1, eao $$2, Predicate<eao> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ejv<FC> var1);

   public boolean a(FC $$0, dkg $$1, ecm $$2, azv $$3, iv $$4) {
      return $$1.f_($$4) ? this.a(new ejv<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(eao $$0) {
      return $$0.a(axc.bh);
   }

   public static boolean b(eao $$0) {
      return $$0.a(axc.ah);
   }

   public static boolean a(djn $$0, iv $$1) {
      return $$0.a($$1, ejt::b);
   }

   public static boolean a(Function<iv, eao> $$0, iv $$1, Predicate<eao> $$2) {
      iv.a $$3 = new iv.a();

      for (jb $$4 : jb.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iv, eao> $$0, iv $$1) {
      return a($$0, $$1, ean.a::l);
   }

   protected void a(dkg $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jb.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.z($$2).e($$2);
      }
   }
}
