import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ehr<FC extends ejv> {
   public static final ehr<ekc> e = a("no_op", new eil(ekc.a));
   public static final ehr<ekr> f = a("tree", new ejd(ekr.a));
   public static final ehr<eki> g = a("flower", new eip(eki.a));
   public static final ehr<eki> h = a("no_bonemeal_flower", new eip(eki.a));
   public static final ehr<eki> i = a("random_patch", new eip(eki.a));
   public static final ehr<ejn> j = a("block_pile", new egz(ejn.a));
   public static final ehr<ekq> k = a("spring_feature", new ejc(ekq.a));
   public static final ehr<ekc> l = a("chorus_plant", new ehc(ekc.a));
   public static final ehr<ekj> m = a("replace_single_block", new eis(ekj.a));
   public static final ehr<ekc> n = a("void_start_platform", new eji(ekc.a));
   public static final ehr<ekc> o = a("desert_well", new ehj(ekc.a));
   public static final ehr<ehw> p = a("fossil", new ehv(ehw.a));
   public static final ehr<ejx> q = a("huge_red_mushroom", new eic(ejx.a));
   public static final ehr<ejx> r = a("huge_brown_mushroom", new ehz(ejx.a));
   public static final ehr<ekc> s = a("ice_spike", new eid(ekc.a));
   public static final ehr<ekc> t = a("glowstone_blob", new ehy(ekc.a));
   public static final ehr<ekc> u = a("freeze_top_layer", new eja(ekc.a));
   public static final ehr<ekc> v = a("vines", new ejh(ekc.a));
   public static final ehr<ejm> w = a("block_column", new egy(ejm.a));
   public static final ehr<eku> x = a("vegetation_patch", new ejg(eku.a));
   public static final ehr<eku> y = a("waterlogged_vegetation_patch", new ejj(eku.a));
   public static final ehr<ekl> z = a("root_system", new eit(ekl.a));
   public static final ehr<eka> A = a("multiface_growth", new eij(eka.a));
   public static final ehr<ekt> B = a("underwater_magma", new ejf(ekt.a));
   public static final ehr<ekc> C = a("monster_room", new eii(ekc.a));
   public static final ehr<ekc> D = a("blue_ice", new eha(ekc.a));
   public static final ehr<ejo> E = a("iceberg", new eie(ejo.a));
   public static final ehr<ejo> F = a("forest_rock", new egx(ejo.a));
   public static final ehr<ejs> G = a("disk", new ehk(ejs.a));
   public static final ehr<eig.a> H = a("lake", new eig(eig.a.a));
   public static final ehr<ekd> I = a("ore", new eim(ekd.a));
   public static final ehr<ekc> J = a("end_platform", new ehp(ekc.a));
   public static final ehr<ekp> K = a("end_spike", new ejb(ekp.a));
   public static final ehr<ekc> L = a("end_island", new eho(ekc.a));
   public static final ehr<eju> M = a("end_gateway", new ehn(eju.a));
   public static final eix N = a("seagrass", new eix(ekf.k));
   public static final ehr<ekc> O = a("kelp", new eif(ekc.a));
   public static final ehr<ekc> P = a("coral_tree", new ehh(ekc.a));
   public static final ehr<ekc> Q = a("coral_mushroom", new ehg(ekc.a));
   public static final ehr<ekc> R = a("coral_claw", new ehe(ekc.a));
   public static final ehr<ejq> S = a("sea_pickle", new eiw(ejq.a));
   public static final ehr<ekn> T = a("simple_block", new eiy(ekn.a));
   public static final ehr<ekf> U = a("bamboo", new egu(ekf.k));
   public static final ehr<eia> V = a("huge_fungus", new eib(eia.a));
   public static final ehr<ekb> W = a("nether_forest_vegetation", new eik(ekb.c));
   public static final ehr<ekc> X = a("weeping_vines", new ejk(ekc.a));
   public static final ehr<eks> Y = a("twisting_vines", new eje(eks.a));
   public static final ehr<ejp> Z = a("basalt_columns", new egv(ejp.a));
   public static final ehr<ejr> aa = a("delta_feature", new ehi(ejr.a));
   public static final ehr<ekk> ab = a("netherrack_replace_blobs", new eir(ekk.a));
   public static final ehr<ejz> ac = a("fill_layer", new ehu(ejz.a));
   public static final ehb ad = a("bonus_chest", new ehb(ekc.a));
   public static final ehr<ekc> ae = a("basalt_pillar", new egw(ekc.a));
   public static final ehr<ekd> af = a("scattered_ore", new eiu(ekd.a));
   public static final ehr<ekh> ag = a("random_selector", new eiq(ekh.a));
   public static final ehr<eko> ah = a("simple_random_selector", new eiz(eko.a));
   public static final ehr<ekg> ai = a("random_boolean_selector", new eio(ekg.a));
   public static final ehr<ejw> aj = a("geode", new ehx(ejw.b));
   public static final ehr<ejt> ak = a("dripstone_cluster", new ehl(ejt.a));
   public static final ehr<ejy> al = a("large_dripstone", new eih(ejy.a));
   public static final ehr<eke> am = a("pointed_dripstone", new ein(eke.a));
   public static final ehr<ekm> an = a("sculk_patch", new eiv(ekm.a));
   private final MapCodec<ehd<FC, ehr<FC>>> a;

   private static <C extends ejv, F extends ehr<C>> F a(String $$0, F $$1) {
      return kf.a(md.O, $$0, $$1);
   }

   public ehr(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ehd<>(this, $$0x), ehd::c);
   }

   public MapCodec<ehd<FC, ehr<FC>>> a() {
      return this.a;
   }

   protected void a(dhx $$0, jj $$1, dym $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dym> a(axp<dku> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dio $$0, jj $$1, dym $$2, Predicate<dym> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eht<FC> var1);

   public boolean a(FC $$0, dio $$1, eak $$2, azs $$3, jj $$4) {
      return $$1.f_($$4) ? this.a(new eht<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dym $$0) {
      return $$0.a(awz.bg);
   }

   public static boolean b(dym $$0) {
      return $$0.a(awz.ah);
   }

   public static boolean a(dhv $$0, jj $$1) {
      return $$0.a($$1, ehr::b);
   }

   public static boolean a(Function<jj, dym> $$0, jj $$1, Predicate<dym> $$2) {
      jj.a $$3 = new jj.a();

      for (jo $$4 : jo.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jj, dym> $$0, jj $$1) {
      return a($$0, $$1, dyl.a::l);
   }

   protected void a(dio $$0, jj $$1) {
      jj.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jo.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
