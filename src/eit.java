import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eit<FC extends ekx> {
   public static final eit<ele> e = a("no_op", new ejn(ele.a));
   public static final eit<elt> f = a("tree", new ekf(elt.a));
   public static final eit<elk> g = a("flower", new ejr(elk.a));
   public static final eit<elk> h = a("no_bonemeal_flower", new ejr(elk.a));
   public static final eit<elk> i = a("random_patch", new ejr(elk.a));
   public static final eit<ekp> j = a("block_pile", new eib(ekp.a));
   public static final eit<els> k = a("spring_feature", new eke(els.a));
   public static final eit<ele> l = a("chorus_plant", new eie(ele.a));
   public static final eit<ell> m = a("replace_single_block", new eju(ell.a));
   public static final eit<ele> n = a("void_start_platform", new ekk(ele.a));
   public static final eit<ele> o = a("desert_well", new eil(ele.a));
   public static final eit<eiy> p = a("fossil", new eix(eiy.a));
   public static final eit<ekz> q = a("huge_red_mushroom", new eje(ekz.a));
   public static final eit<ekz> r = a("huge_brown_mushroom", new ejb(ekz.a));
   public static final eit<ele> s = a("ice_spike", new ejf(ele.a));
   public static final eit<ele> t = a("glowstone_blob", new eja(ele.a));
   public static final eit<ele> u = a("freeze_top_layer", new ekc(ele.a));
   public static final eit<ele> v = a("vines", new ekj(ele.a));
   public static final eit<eko> w = a("block_column", new eia(eko.a));
   public static final eit<elw> x = a("vegetation_patch", new eki(elw.a));
   public static final eit<elw> y = a("waterlogged_vegetation_patch", new ekl(elw.a));
   public static final eit<eln> z = a("root_system", new ejv(eln.a));
   public static final eit<elc> A = a("multiface_growth", new ejl(elc.a));
   public static final eit<elv> B = a("underwater_magma", new ekh(elv.a));
   public static final eit<ele> C = a("monster_room", new ejk(ele.a));
   public static final eit<ele> D = a("blue_ice", new eic(ele.a));
   public static final eit<ekq> E = a("iceberg", new ejg(ekq.a));
   public static final eit<ekq> F = a("forest_rock", new ehz(ekq.a));
   public static final eit<eku> G = a("disk", new eim(eku.a));
   public static final eit<eji.a> H = a("lake", new eji(eji.a.a));
   public static final eit<elf> I = a("ore", new ejo(elf.a));
   public static final eit<ele> J = a("end_platform", new eir(ele.a));
   public static final eit<elr> K = a("end_spike", new ekd(elr.a));
   public static final eit<ele> L = a("end_island", new eiq(ele.a));
   public static final eit<ekw> M = a("end_gateway", new eip(ekw.a));
   public static final ejz N = a("seagrass", new ejz(elh.k));
   public static final eit<ele> O = a("kelp", new ejh(ele.a));
   public static final eit<ele> P = a("coral_tree", new eij(ele.a));
   public static final eit<ele> Q = a("coral_mushroom", new eii(ele.a));
   public static final eit<ele> R = a("coral_claw", new eig(ele.a));
   public static final eit<eks> S = a("sea_pickle", new ejy(eks.a));
   public static final eit<elp> T = a("simple_block", new eka(elp.a));
   public static final eit<elh> U = a("bamboo", new ehw(elh.k));
   public static final eit<ejc> V = a("huge_fungus", new ejd(ejc.a));
   public static final eit<eld> W = a("nether_forest_vegetation", new ejm(eld.c));
   public static final eit<ele> X = a("weeping_vines", new ekm(ele.a));
   public static final eit<elu> Y = a("twisting_vines", new ekg(elu.a));
   public static final eit<ekr> Z = a("basalt_columns", new ehx(ekr.a));
   public static final eit<ekt> aa = a("delta_feature", new eik(ekt.a));
   public static final eit<elm> ab = a("netherrack_replace_blobs", new ejt(elm.a));
   public static final eit<elb> ac = a("fill_layer", new eiw(elb.a));
   public static final eid ad = a("bonus_chest", new eid(ele.a));
   public static final eit<ele> ae = a("basalt_pillar", new ehy(ele.a));
   public static final eit<elf> af = a("scattered_ore", new ejw(elf.a));
   public static final eit<elj> ag = a("random_selector", new ejs(elj.a));
   public static final eit<elq> ah = a("simple_random_selector", new ekb(elq.a));
   public static final eit<eli> ai = a("random_boolean_selector", new ejq(eli.a));
   public static final eit<eky> aj = a("geode", new eiz(eky.b));
   public static final eit<ekv> ak = a("dripstone_cluster", new ein(ekv.a));
   public static final eit<ela> al = a("large_dripstone", new ejj(ela.a));
   public static final eit<elg> am = a("pointed_dripstone", new ejp(elg.a));
   public static final eit<elo> an = a("sculk_patch", new ejx(elo.a));
   private final MapCodec<eif<FC, eit<FC>>> a;

   private static <C extends ekx, F extends eit<C>> F a(String $$0, F $$1) {
      return jr.a(mf.O, $$0, $$1);
   }

   public eit(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new eif<>(this, $$0x), eif::c);
   }

   public MapCodec<eif<FC, eit<FC>>> a() {
      return this.a;
   }

   protected void a(dix $$0, iu $$1, dzo $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dzo> a(axp<dlu> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(djo $$0, iu $$1, dzo $$2, Predicate<dzo> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eiv<FC> var1);

   public boolean a(FC $$0, djo $$1, ebm $$2, azt $$3, iu $$4) {
      return $$1.f_($$4) ? this.a(new eiv<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dzo $$0) {
      return $$0.a(axa.bg);
   }

   public static boolean b(dzo $$0) {
      return $$0.a(axa.ah);
   }

   public static boolean a(div $$0, iu $$1) {
      return $$0.a($$1, eit::b);
   }

   public static boolean a(Function<iu, dzo> $$0, iu $$1, Predicate<dzo> $$2) {
      iu.a $$3 = new iu.a();

      for (ja $$4 : ja.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iu, dzo> $$0, iu $$1) {
      return a($$0, $$1, dzn.a::l);
   }

   protected void a(djo $$0, iu $$1) {
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
