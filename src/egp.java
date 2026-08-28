import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class egp<FC extends eit> {
   public static final egp<eja> e = a("no_op", new ehj(eja.a));
   public static final egp<ejp> f = a("tree", new eib(ejp.a));
   public static final egp<ejg> g = a("flower", new ehn(ejg.a));
   public static final egp<ejg> h = a("no_bonemeal_flower", new ehn(ejg.a));
   public static final egp<ejg> i = a("random_patch", new ehn(ejg.a));
   public static final egp<eil> j = a("block_pile", new efx(eil.a));
   public static final egp<ejo> k = a("spring_feature", new eia(ejo.a));
   public static final egp<eja> l = a("chorus_plant", new ega(eja.a));
   public static final egp<ejh> m = a("replace_single_block", new ehq(ejh.a));
   public static final egp<eja> n = a("void_start_platform", new eig(eja.a));
   public static final egp<eja> o = a("desert_well", new egh(eja.a));
   public static final egp<egu> p = a("fossil", new egt(egu.a));
   public static final egp<eiv> q = a("huge_red_mushroom", new eha(eiv.a));
   public static final egp<eiv> r = a("huge_brown_mushroom", new egx(eiv.a));
   public static final egp<eja> s = a("ice_spike", new ehb(eja.a));
   public static final egp<eja> t = a("glowstone_blob", new egw(eja.a));
   public static final egp<eja> u = a("freeze_top_layer", new ehy(eja.a));
   public static final egp<eja> v = a("vines", new eif(eja.a));
   public static final egp<eik> w = a("block_column", new efw(eik.a));
   public static final egp<ejs> x = a("vegetation_patch", new eie(ejs.a));
   public static final egp<ejs> y = a("waterlogged_vegetation_patch", new eih(ejs.a));
   public static final egp<ejj> z = a("root_system", new ehr(ejj.a));
   public static final egp<eiy> A = a("multiface_growth", new ehh(eiy.a));
   public static final egp<ejr> B = a("underwater_magma", new eid(ejr.a));
   public static final egp<eja> C = a("monster_room", new ehg(eja.a));
   public static final egp<eja> D = a("blue_ice", new efy(eja.a));
   public static final egp<eim> E = a("iceberg", new ehc(eim.a));
   public static final egp<eim> F = a("forest_rock", new efv(eim.a));
   public static final egp<eiq> G = a("disk", new egi(eiq.a));
   public static final egp<ehe.a> H = a("lake", new ehe(ehe.a.a));
   public static final egp<ejb> I = a("ore", new ehk(ejb.a));
   public static final egp<eja> J = a("end_platform", new egn(eja.a));
   public static final egp<ejn> K = a("end_spike", new ehz(ejn.a));
   public static final egp<eja> L = a("end_island", new egm(eja.a));
   public static final egp<eis> M = a("end_gateway", new egl(eis.a));
   public static final ehv N = a("seagrass", new ehv(ejd.k));
   public static final egp<eja> O = a("kelp", new ehd(eja.a));
   public static final egp<eja> P = a("coral_tree", new egf(eja.a));
   public static final egp<eja> Q = a("coral_mushroom", new ege(eja.a));
   public static final egp<eja> R = a("coral_claw", new egc(eja.a));
   public static final egp<eio> S = a("sea_pickle", new ehu(eio.a));
   public static final egp<ejl> T = a("simple_block", new ehw(ejl.a));
   public static final egp<ejd> U = a("bamboo", new efs(ejd.k));
   public static final egp<egy> V = a("huge_fungus", new egz(egy.a));
   public static final egp<eiz> W = a("nether_forest_vegetation", new ehi(eiz.c));
   public static final egp<eja> X = a("weeping_vines", new eii(eja.a));
   public static final egp<ejq> Y = a("twisting_vines", new eic(ejq.a));
   public static final egp<ein> Z = a("basalt_columns", new eft(ein.a));
   public static final egp<eip> aa = a("delta_feature", new egg(eip.a));
   public static final egp<eji> ab = a("netherrack_replace_blobs", new ehp(eji.a));
   public static final egp<eix> ac = a("fill_layer", new egs(eix.a));
   public static final efz ad = a("bonus_chest", new efz(eja.a));
   public static final egp<eja> ae = a("basalt_pillar", new efu(eja.a));
   public static final egp<ejb> af = a("scattered_ore", new ehs(ejb.a));
   public static final egp<ejf> ag = a("random_selector", new eho(ejf.a));
   public static final egp<ejm> ah = a("simple_random_selector", new ehx(ejm.a));
   public static final egp<eje> ai = a("random_boolean_selector", new ehm(eje.a));
   public static final egp<eiu> aj = a("geode", new egv(eiu.b));
   public static final egp<eir> ak = a("dripstone_cluster", new egj(eir.a));
   public static final egp<eiw> al = a("large_dripstone", new ehf(eiw.a));
   public static final egp<ejc> am = a("pointed_dripstone", new ehl(ejc.a));
   public static final egp<ejk> an = a("sculk_patch", new eht(ejk.a));
   private final MapCodec<egb<FC, egp<FC>>> a;

   private static <C extends eit, F extends egp<C>> F a(String $$0, F $$1) {
      return kd.a(ma.O, $$0, $$1);
   }

   public egp(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new egb<>(this, $$0x), egb::c);
   }

   public MapCodec<egb<FC, egp<FC>>> a() {
      return this.a;
   }

   protected void a(dhh $$0, jh $$1, dxo $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dxo> a(aya<dkd> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dhx $$0, jh $$1, dxo $$2, Predicate<dxo> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(egr<FC> var1);

   public boolean a(FC $$0, dhx $$1, dzk $$2, bac $$3, jh $$4) {
      return $$1.f_($$4) ? this.a(new egr<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dxo $$0) {
      return $$0.a(axk.bg);
   }

   public static boolean b(dxo $$0) {
      return $$0.a(axk.ah);
   }

   public static boolean a(dhf $$0, jh $$1) {
      return $$0.a($$1, egp::b);
   }

   public static boolean a(Function<jh, dxo> $$0, jh $$1, Predicate<dxo> $$2) {
      jh.a $$3 = new jh.a();

      for (jm $$4 : jm.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jh, dxo> $$0, jh $$1) {
      return a($$0, $$1, dxn.a::l);
   }

   protected void a(dhx $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jm.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
