import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class drn<FC extends dtr> {
   public static final drn<dty> e = a("no_op", new dsh(dty.a));
   public static final drn<dun> f = a("tree", new dsz(dun.a));
   public static final drn<due> g = a("flower", new dsl(due.a));
   public static final drn<due> h = a("no_bonemeal_flower", new dsl(due.a));
   public static final drn<due> i = a("random_patch", new dsl(due.a));
   public static final drn<dtj> j = a("block_pile", new dqw(dtj.a));
   public static final drn<dum> k = a("spring_feature", new dsy(dum.a));
   public static final drn<dty> l = a("chorus_plant", new dqz(dty.a));
   public static final drn<duf> m = a("replace_single_block", new dso(duf.a));
   public static final drn<dty> n = a("void_start_platform", new dte(dty.a));
   public static final drn<dty> o = a("desert_well", new drg(dty.a));
   public static final drn<drs> p = a("fossil", new drr(drs.a));
   public static final drn<dtt> q = a("huge_red_mushroom", new dry(dtt.a));
   public static final drn<dtt> r = a("huge_brown_mushroom", new drv(dtt.a));
   public static final drn<dty> s = a("ice_spike", new drz(dty.a));
   public static final drn<dty> t = a("glowstone_blob", new dru(dty.a));
   public static final drn<dty> u = a("freeze_top_layer", new dsw(dty.a));
   public static final drn<dty> v = a("vines", new dtd(dty.a));
   public static final drn<dti> w = a("block_column", new dqv(dti.a));
   public static final drn<duq> x = a("vegetation_patch", new dtc(duq.a));
   public static final drn<duq> y = a("waterlogged_vegetation_patch", new dtf(duq.a));
   public static final drn<duh> z = a("root_system", new dsp(duh.a));
   public static final drn<dtw> A = a("multiface_growth", new dsf(dtw.a));
   public static final drn<dup> B = a("underwater_magma", new dtb(dup.a));
   public static final drn<dty> C = a("monster_room", new dse(dty.a));
   public static final drn<dty> D = a("blue_ice", new dqx(dty.a));
   public static final drn<dtk> E = a("iceberg", new dsa(dtk.a));
   public static final drn<dtk> F = a("forest_rock", new dqu(dtk.a));
   public static final drn<dto> G = a("disk", new drh(dto.a));
   public static final drn<dsc.a> H = a("lake", new dsc(dsc.a.a));
   public static final drn<dtz> I = a("ore", new dsi(dtz.a));
   public static final drn<dul> J = a("end_spike", new dsx(dul.a));
   public static final drn<dty> K = a("end_island", new drl(dty.a));
   public static final drn<dtq> L = a("end_gateway", new drk(dtq.a));
   public static final dst M = a("seagrass", new dst(dub.k));
   public static final drn<dty> N = a("kelp", new dsb(dty.a));
   public static final drn<dty> O = a("coral_tree", new dre(dty.a));
   public static final drn<dty> P = a("coral_mushroom", new drd(dty.a));
   public static final drn<dty> Q = a("coral_claw", new drb(dty.a));
   public static final drn<dtm> R = a("sea_pickle", new dss(dtm.a));
   public static final drn<duj> S = a("simple_block", new dsu(duj.a));
   public static final drn<dub> T = a("bamboo", new dqr(dub.k));
   public static final drn<drw> U = a("huge_fungus", new drx(drw.a));
   public static final drn<dtx> V = a("nether_forest_vegetation", new dsg(dtx.c));
   public static final drn<dty> W = a("weeping_vines", new dtg(dty.a));
   public static final drn<duo> X = a("twisting_vines", new dta(duo.a));
   public static final drn<dtl> Y = a("basalt_columns", new dqs(dtl.a));
   public static final drn<dtn> Z = a("delta_feature", new drf(dtn.a));
   public static final drn<dug> aa = a("netherrack_replace_blobs", new dsn(dug.a));
   public static final drn<dtv> ab = a("fill_layer", new drq(dtv.a));
   public static final dqy ac = a("bonus_chest", new dqy(dty.a));
   public static final drn<dty> ad = a("basalt_pillar", new dqt(dty.a));
   public static final drn<dtz> ae = a("scattered_ore", new dsq(dtz.a));
   public static final drn<dud> af = a("random_selector", new dsm(dud.a));
   public static final drn<duk> ag = a("simple_random_selector", new dsv(duk.a));
   public static final drn<duc> ah = a("random_boolean_selector", new dsk(duc.a));
   public static final drn<dts> ai = a("geode", new drt(dts.b));
   public static final drn<dtp> aj = a("dripstone_cluster", new dri(dtp.a));
   public static final drn<dtu> ak = a("large_dripstone", new dsd(dtu.a));
   public static final drn<dua> al = a("pointed_dripstone", new dsj(dua.a));
   public static final drn<dui> am = a("sculk_patch", new dsr(dui.a));
   private final Codec<dra<FC, drn<FC>>> a;

   private static <C extends dtr, F extends drn<C>> F a(String $$0, F $$1) {
      return it.a(kd.Q, $$0, $$1);
   }

   public drn(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dra<>(this, $$0x), dra::c).codec();
   }

   public Codec<dra<FC, drn<FC>>> a() {
      return this.a;
   }

   protected void a(ctq $$0, hx $$1, dja $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dja> a(asq<cwj> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cud $$0, hx $$1, dja $$2, Predicate<dja> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(drp<FC> var1);

   public boolean a(FC $$0, cud $$1, dkx $$2, aup $$3, hx $$4) {
      return $$1.f_($$4) ? this.a(new drp<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dja $$0) {
      return $$0.a(asb.bd);
   }

   public static boolean b(dja $$0) {
      return $$0.a(asb.af);
   }

   public static boolean a(cto $$0, hx $$1) {
      return $$0.a($$1, drn::b);
   }

   public static boolean a(Function<hx, dja> $$0, hx $$1, Predicate<dja> $$2) {
      hx.a $$3 = new hx.a();

      for (ic $$4 : ic.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hx, dja> $$0, hx $$1) {
      return a($$0, $$1, diz.a::i);
   }

   protected void a(cud $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ic.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
