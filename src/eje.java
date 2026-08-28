import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eje<FC extends eli> {
   public static final eje<elp> e = a("no_op", new ejy(elp.a));
   public static final eje<eme> f = a("tree", new ekq(eme.a));
   public static final eje<elv> g = a("flower", new ekc(elv.a));
   public static final eje<elv> h = a("no_bonemeal_flower", new ekc(elv.a));
   public static final eje<elv> i = a("random_patch", new ekc(elv.a));
   public static final eje<ela> j = a("block_pile", new eim(ela.a));
   public static final eje<emd> k = a("spring_feature", new ekp(emd.a));
   public static final eje<elp> l = a("chorus_plant", new eip(elp.a));
   public static final eje<elw> m = a("replace_single_block", new ekf(elw.a));
   public static final eje<elp> n = a("void_start_platform", new ekv(elp.a));
   public static final eje<elp> o = a("desert_well", new eiw(elp.a));
   public static final eje<ejj> p = a("fossil", new eji(ejj.a));
   public static final eje<elk> q = a("huge_red_mushroom", new ejp(elk.a));
   public static final eje<elk> r = a("huge_brown_mushroom", new ejm(elk.a));
   public static final eje<elp> s = a("ice_spike", new ejq(elp.a));
   public static final eje<elp> t = a("glowstone_blob", new ejl(elp.a));
   public static final eje<elp> u = a("freeze_top_layer", new ekn(elp.a));
   public static final eje<elp> v = a("vines", new eku(elp.a));
   public static final eje<ekz> w = a("block_column", new eil(ekz.a));
   public static final eje<emh> x = a("vegetation_patch", new ekt(emh.a));
   public static final eje<emh> y = a("waterlogged_vegetation_patch", new ekw(emh.a));
   public static final eje<ely> z = a("root_system", new ekg(ely.a));
   public static final eje<eln> A = a("multiface_growth", new ejw(eln.a));
   public static final eje<emg> B = a("underwater_magma", new eks(emg.a));
   public static final eje<elp> C = a("monster_room", new ejv(elp.a));
   public static final eje<elp> D = a("blue_ice", new ein(elp.a));
   public static final eje<elb> E = a("iceberg", new ejr(elb.a));
   public static final eje<elb> F = a("forest_rock", new eik(elb.a));
   public static final eje<elf> G = a("disk", new eix(elf.a));
   public static final eje<ejt.a> H = a("lake", new ejt(ejt.a.a));
   public static final eje<elq> I = a("ore", new ejz(elq.a));
   public static final eje<elp> J = a("end_platform", new ejc(elp.a));
   public static final eje<emc> K = a("end_spike", new eko(emc.a));
   public static final eje<elp> L = a("end_island", new ejb(elp.a));
   public static final eje<elh> M = a("end_gateway", new eja(elh.a));
   public static final ekk N = a("seagrass", new ekk(els.k));
   public static final eje<elp> O = a("kelp", new ejs(elp.a));
   public static final eje<elp> P = a("coral_tree", new eiu(elp.a));
   public static final eje<elp> Q = a("coral_mushroom", new eit(elp.a));
   public static final eje<elp> R = a("coral_claw", new eir(elp.a));
   public static final eje<eld> S = a("sea_pickle", new ekj(eld.a));
   public static final eje<ema> T = a("simple_block", new ekl(ema.a));
   public static final eje<els> U = a("bamboo", new eih(els.k));
   public static final eje<ejn> V = a("huge_fungus", new ejo(ejn.a));
   public static final eje<elo> W = a("nether_forest_vegetation", new ejx(elo.c));
   public static final eje<elp> X = a("weeping_vines", new ekx(elp.a));
   public static final eje<emf> Y = a("twisting_vines", new ekr(emf.a));
   public static final eje<elc> Z = a("basalt_columns", new eii(elc.a));
   public static final eje<ele> aa = a("delta_feature", new eiv(ele.a));
   public static final eje<elx> ab = a("netherrack_replace_blobs", new eke(elx.a));
   public static final eje<elm> ac = a("fill_layer", new ejh(elm.a));
   public static final eio ad = a("bonus_chest", new eio(elp.a));
   public static final eje<elp> ae = a("basalt_pillar", new eij(elp.a));
   public static final eje<elq> af = a("scattered_ore", new ekh(elq.a));
   public static final eje<elu> ag = a("random_selector", new ekd(elu.a));
   public static final eje<emb> ah = a("simple_random_selector", new ekm(emb.a));
   public static final eje<elt> ai = a("random_boolean_selector", new ekb(elt.a));
   public static final eje<elj> aj = a("geode", new ejk(elj.b));
   public static final eje<elg> ak = a("dripstone_cluster", new eiy(elg.a));
   public static final eje<ell> al = a("large_dripstone", new eju(ell.a));
   public static final eje<elr> am = a("pointed_dripstone", new eka(elr.a));
   public static final eje<elz> an = a("sculk_patch", new eki(elz.a));
   private final MapCodec<eiq<FC, eje<FC>>> a;

   private static <C extends eli, F extends eje<C>> F a(String $$0, F $$1) {
      return jr.a(mf.O, $$0, $$1);
   }

   public eje(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eiq<>(this, $$0x), eiq::c);
   }

   public MapCodec<eiq<FC, eje<FC>>> a() {
      return this.a;
   }

   protected void a(djd $$0, iu $$1, dzz $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dzz> a(axr<dma> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dju $$0, iu $$1, dzz $$2, Predicate<dzz> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ejg<FC> var1);

   public boolean a(FC $$0, dju $$1, ebx $$2, azv $$3, iu $$4) {
      return $$1.f_($$4) ? this.a(new ejg<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dzz $$0) {
      return $$0.a(axc.bg);
   }

   public static boolean b(dzz $$0) {
      return $$0.a(axc.ah);
   }

   public static boolean a(djb $$0, iu $$1) {
      return $$0.a($$1, eje::b);
   }

   public static boolean a(Function<iu, dzz> $$0, iu $$1, Predicate<dzz> $$2) {
      iu.a $$3 = new iu.a();

      for (ja $$4 : ja.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iu, dzz> $$0, iu $$1) {
      return a($$0, $$1, dzy.a::l);
   }

   protected void a(dju $$0, iu $$1) {
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
