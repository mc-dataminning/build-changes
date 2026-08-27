import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dzd<FC extends ebh> {
   public static final dzd<ebo> e = a("no_op", new dzx(ebo.a));
   public static final dzd<ecd> f = a("tree", new eap(ecd.a));
   public static final dzd<ebu> g = a("flower", new eab(ebu.a));
   public static final dzd<ebu> h = a("no_bonemeal_flower", new eab(ebu.a));
   public static final dzd<ebu> i = a("random_patch", new eab(ebu.a));
   public static final dzd<eaz> j = a("block_pile", new dym(eaz.a));
   public static final dzd<ecc> k = a("spring_feature", new eao(ecc.a));
   public static final dzd<ebo> l = a("chorus_plant", new dyp(ebo.a));
   public static final dzd<ebv> m = a("replace_single_block", new eae(ebv.a));
   public static final dzd<ebo> n = a("void_start_platform", new eau(ebo.a));
   public static final dzd<ebo> o = a("desert_well", new dyw(ebo.a));
   public static final dzd<dzi> p = a("fossil", new dzh(dzi.a));
   public static final dzd<ebj> q = a("huge_red_mushroom", new dzo(ebj.a));
   public static final dzd<ebj> r = a("huge_brown_mushroom", new dzl(ebj.a));
   public static final dzd<ebo> s = a("ice_spike", new dzp(ebo.a));
   public static final dzd<ebo> t = a("glowstone_blob", new dzk(ebo.a));
   public static final dzd<ebo> u = a("freeze_top_layer", new eam(ebo.a));
   public static final dzd<ebo> v = a("vines", new eat(ebo.a));
   public static final dzd<eay> w = a("block_column", new dyl(eay.a));
   public static final dzd<ecg> x = a("vegetation_patch", new eas(ecg.a));
   public static final dzd<ecg> y = a("waterlogged_vegetation_patch", new eav(ecg.a));
   public static final dzd<ebx> z = a("root_system", new eaf(ebx.a));
   public static final dzd<ebm> A = a("multiface_growth", new dzv(ebm.a));
   public static final dzd<ecf> B = a("underwater_magma", new ear(ecf.a));
   public static final dzd<ebo> C = a("monster_room", new dzu(ebo.a));
   public static final dzd<ebo> D = a("blue_ice", new dyn(ebo.a));
   public static final dzd<eba> E = a("iceberg", new dzq(eba.a));
   public static final dzd<eba> F = a("forest_rock", new dyk(eba.a));
   public static final dzd<ebe> G = a("disk", new dyx(ebe.a));
   public static final dzd<dzs.a> H = a("lake", new dzs(dzs.a.a));
   public static final dzd<ebp> I = a("ore", new dzy(ebp.a));
   public static final dzd<ecb> J = a("end_spike", new ean(ecb.a));
   public static final dzd<ebo> K = a("end_island", new dzb(ebo.a));
   public static final dzd<ebg> L = a("end_gateway", new dza(ebg.a));
   public static final eaj M = a("seagrass", new eaj(ebr.k));
   public static final dzd<ebo> N = a("kelp", new dzr(ebo.a));
   public static final dzd<ebo> O = a("coral_tree", new dyu(ebo.a));
   public static final dzd<ebo> P = a("coral_mushroom", new dyt(ebo.a));
   public static final dzd<ebo> Q = a("coral_claw", new dyr(ebo.a));
   public static final dzd<ebc> R = a("sea_pickle", new eai(ebc.a));
   public static final dzd<ebz> S = a("simple_block", new eak(ebz.a));
   public static final dzd<ebr> T = a("bamboo", new dyh(ebr.k));
   public static final dzd<dzm> U = a("huge_fungus", new dzn(dzm.a));
   public static final dzd<ebn> V = a("nether_forest_vegetation", new dzw(ebn.c));
   public static final dzd<ebo> W = a("weeping_vines", new eaw(ebo.a));
   public static final dzd<ece> X = a("twisting_vines", new eaq(ece.a));
   public static final dzd<ebb> Y = a("basalt_columns", new dyi(ebb.a));
   public static final dzd<ebd> Z = a("delta_feature", new dyv(ebd.a));
   public static final dzd<ebw> aa = a("netherrack_replace_blobs", new ead(ebw.a));
   public static final dzd<ebl> ab = a("fill_layer", new dzg(ebl.a));
   public static final dyo ac = a("bonus_chest", new dyo(ebo.a));
   public static final dzd<ebo> ad = a("basalt_pillar", new dyj(ebo.a));
   public static final dzd<ebp> ae = a("scattered_ore", new eag(ebp.a));
   public static final dzd<ebt> af = a("random_selector", new eac(ebt.a));
   public static final dzd<eca> ag = a("simple_random_selector", new eal(eca.a));
   public static final dzd<ebs> ah = a("random_boolean_selector", new eaa(ebs.a));
   public static final dzd<ebi> ai = a("geode", new dzj(ebi.b));
   public static final dzd<ebf> aj = a("dripstone_cluster", new dyy(ebf.a));
   public static final dzd<ebk> ak = a("large_dripstone", new dzt(ebk.a));
   public static final dzd<ebq> al = a("pointed_dripstone", new dzz(ebq.a));
   public static final dzd<eby> am = a("sculk_patch", new eah(eby.a));
   private final Codec<dyq<FC, dzd<FC>>> a;

   private static <C extends ebh, F extends dzd<C>> F a(String $$0, F $$1) {
      return jj.a(ld.Q, $$0, $$1);
   }

   public dzd(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dyq<>(this, $$0x), dyq::c).codec();
   }

   public Codec<dyq<FC, dzd<FC>>> a() {
      return this.a;
   }

   protected void a(dal $$0, in $$1, dqh $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dqh> a(awg<dde> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(day $$0, in $$1, dqh $$2, Predicate<dqh> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dzf<FC> var1);

   public boolean a(FC $$0, day $$1, dse $$2, ayg $$3, in $$4) {
      return $$1.f_($$4) ? this.a(new dzf<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dqh $$0) {
      return $$0.a(avr.be);
   }

   public static boolean b(dqh $$0) {
      return $$0.a(avr.af);
   }

   public static boolean a(daj $$0, in $$1) {
      return $$0.a($$1, dzd::b);
   }

   public static boolean a(Function<in, dqh> $$0, in $$1, Predicate<dqh> $$2) {
      in.a $$3 = new in.a();

      for (is $$4 : is.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<in, dqh> $$0, in $$1) {
      return a($$0, $$1, dqg.a::i);
   }

   protected void a(day $$0, in $$1) {
      in.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(is.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
