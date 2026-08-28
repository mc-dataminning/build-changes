import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejm<FC extends elq> {
   public static final ejm<elx> e = a("no_op", new ekg(elx.a));
   public static final ejm<emm> f = a("tree", new eky(emm.a));
   public static final ejm<emd> g = a("flower", new ekk(emd.a));
   public static final ejm<emd> h = a("no_bonemeal_flower", new ekk(emd.a));
   public static final ejm<emd> i = a("random_patch", new ekk(emd.a));
   public static final ejm<eli> j = a("block_pile", new eiu(eli.a));
   public static final ejm<eml> k = a("spring_feature", new ekx(eml.a));
   public static final ejm<elx> l = a("chorus_plant", new eix(elx.a));
   public static final ejm<eme> m = a("replace_single_block", new ekn(eme.a));
   public static final ejm<elx> n = a("void_start_platform", new eld(elx.a));
   public static final ejm<elx> o = a("desert_well", new eje(elx.a));
   public static final ejm<ejr> p = a("fossil", new ejq(ejr.a));
   public static final ejm<els> q = a("huge_red_mushroom", new ejx(els.a));
   public static final ejm<els> r = a("huge_brown_mushroom", new eju(els.a));
   public static final ejm<elx> s = a("ice_spike", new ejy(elx.a));
   public static final ejm<elx> t = a("glowstone_blob", new ejt(elx.a));
   public static final ejm<elx> u = a("freeze_top_layer", new ekv(elx.a));
   public static final ejm<elx> v = a("vines", new elc(elx.a));
   public static final ejm<elh> w = a("block_column", new eit(elh.a));
   public static final ejm<emp> x = a("vegetation_patch", new elb(emp.a));
   public static final ejm<emp> y = a("waterlogged_vegetation_patch", new ele(emp.a));
   public static final ejm<emg> z = a("root_system", new eko(emg.a));
   public static final ejm<elv> A = a("multiface_growth", new eke(elv.a));
   public static final ejm<emo> B = a("underwater_magma", new ela(emo.a));
   public static final ejm<elx> C = a("monster_room", new ekd(elx.a));
   public static final ejm<elx> D = a("blue_ice", new eiv(elx.a));
   public static final ejm<elj> E = a("iceberg", new ejz(elj.a));
   public static final ejm<elj> F = a("forest_rock", new eis(elj.a));
   public static final ejm<eln> G = a("disk", new ejf(eln.a));
   public static final ejm<ekb.a> H = a("lake", new ekb(ekb.a.a));
   public static final ejm<ely> I = a("ore", new ekh(ely.a));
   public static final ejm<elx> J = a("end_platform", new ejk(elx.a));
   public static final ejm<emk> K = a("end_spike", new ekw(emk.a));
   public static final ejm<elx> L = a("end_island", new ejj(elx.a));
   public static final ejm<elp> M = a("end_gateway", new eji(elp.a));
   public static final eks N = a("seagrass", new eks(ema.k));
   public static final ejm<elx> O = a("kelp", new eka(elx.a));
   public static final ejm<elx> P = a("coral_tree", new ejc(elx.a));
   public static final ejm<elx> Q = a("coral_mushroom", new ejb(elx.a));
   public static final ejm<elx> R = a("coral_claw", new eiz(elx.a));
   public static final ejm<ell> S = a("sea_pickle", new ekr(ell.a));
   public static final ejm<emi> T = a("simple_block", new ekt(emi.a));
   public static final ejm<ema> U = a("bamboo", new eip(ema.k));
   public static final ejm<ejv> V = a("huge_fungus", new ejw(ejv.a));
   public static final ejm<elw> W = a("nether_forest_vegetation", new ekf(elw.c));
   public static final ejm<elx> X = a("weeping_vines", new elf(elx.a));
   public static final ejm<emn> Y = a("twisting_vines", new ekz(emn.a));
   public static final ejm<elk> Z = a("basalt_columns", new eiq(elk.a));
   public static final ejm<elm> aa = a("delta_feature", new ejd(elm.a));
   public static final ejm<emf> ab = a("netherrack_replace_blobs", new ekm(emf.a));
   public static final ejm<elu> ac = a("fill_layer", new ejp(elu.a));
   public static final eiw ad = a("bonus_chest", new eiw(elx.a));
   public static final ejm<elx> ae = a("basalt_pillar", new eir(elx.a));
   public static final ejm<ely> af = a("scattered_ore", new ekp(ely.a));
   public static final ejm<emc> ag = a("random_selector", new ekl(emc.a));
   public static final ejm<emj> ah = a("simple_random_selector", new eku(emj.a));
   public static final ejm<emb> ai = a("random_boolean_selector", new ekj(emb.a));
   public static final ejm<elr> aj = a("geode", new ejs(elr.b));
   public static final ejm<elo> ak = a("dripstone_cluster", new ejg(elo.a));
   public static final ejm<elt> al = a("large_dripstone", new ekc(elt.a));
   public static final ejm<elz> am = a("pointed_dripstone", new eki(elz.a));
   public static final ejm<emh> an = a("sculk_patch", new ekq(emh.a));
   private final MapCodec<eiy<FC, ejm<FC>>> a;

   private static <C extends elq, F extends ejm<C>> F a(String $$0, F $$1) {
      return jr.a(mf.O, $$0, $$1);
   }

   public ejm(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eiy<>(this, $$0x), eiy::c);
   }

   public MapCodec<eiy<FC, ejm<FC>>> a() {
      return this.a;
   }

   protected void a(dji $$0, iu $$1, eah $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<eah> a(axr<dmf> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(djz $$0, iu $$1, eah $$2, Predicate<eah> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ejo<FC> var1);

   public boolean a(FC $$0, djz $$1, ecf $$2, azv $$3, iu $$4) {
      return $$1.f_($$4) ? this.a(new ejo<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(eah $$0) {
      return $$0.a(axc.bh);
   }

   public static boolean b(eah $$0) {
      return $$0.a(axc.ah);
   }

   public static boolean a(djg $$0, iu $$1) {
      return $$0.a($$1, ejm::b);
   }

   public static boolean a(Function<iu, eah> $$0, iu $$1, Predicate<eah> $$2) {
      iu.a $$3 = new iu.a();

      for (ja $$4 : ja.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iu, eah> $$0, iu $$1) {
      return a($$0, $$1, eag.a::l);
   }

   protected void a(djz $$0, iu $$1) {
      iu.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ja.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.z($$2).e($$2);
      }
   }
}
