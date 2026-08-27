import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class drc<FC extends dtg> {
   public static final drc<dtn> e = a("no_op", new drw(dtn.a));
   public static final drc<duc> f = a("tree", new dso(duc.a));
   public static final drc<dtt> g = a("flower", new dsa(dtt.a));
   public static final drc<dtt> h = a("no_bonemeal_flower", new dsa(dtt.a));
   public static final drc<dtt> i = a("random_patch", new dsa(dtt.a));
   public static final drc<dsy> j = a("block_pile", new dql(dsy.a));
   public static final drc<dub> k = a("spring_feature", new dsn(dub.a));
   public static final drc<dtn> l = a("chorus_plant", new dqo(dtn.a));
   public static final drc<dtu> m = a("replace_single_block", new dsd(dtu.a));
   public static final drc<dtn> n = a("void_start_platform", new dst(dtn.a));
   public static final drc<dtn> o = a("desert_well", new dqv(dtn.a));
   public static final drc<drh> p = a("fossil", new drg(drh.a));
   public static final drc<dti> q = a("huge_red_mushroom", new drn(dti.a));
   public static final drc<dti> r = a("huge_brown_mushroom", new drk(dti.a));
   public static final drc<dtn> s = a("ice_spike", new dro(dtn.a));
   public static final drc<dtn> t = a("glowstone_blob", new drj(dtn.a));
   public static final drc<dtn> u = a("freeze_top_layer", new dsl(dtn.a));
   public static final drc<dtn> v = a("vines", new dss(dtn.a));
   public static final drc<dsx> w = a("block_column", new dqk(dsx.a));
   public static final drc<duf> x = a("vegetation_patch", new dsr(duf.a));
   public static final drc<duf> y = a("waterlogged_vegetation_patch", new dsu(duf.a));
   public static final drc<dtw> z = a("root_system", new dse(dtw.a));
   public static final drc<dtl> A = a("multiface_growth", new dru(dtl.a));
   public static final drc<due> B = a("underwater_magma", new dsq(due.a));
   public static final drc<dtn> C = a("monster_room", new drt(dtn.a));
   public static final drc<dtn> D = a("blue_ice", new dqm(dtn.a));
   public static final drc<dsz> E = a("iceberg", new drp(dsz.a));
   public static final drc<dsz> F = a("forest_rock", new dqj(dsz.a));
   public static final drc<dtd> G = a("disk", new dqw(dtd.a));
   public static final drc<drr.a> H = a("lake", new drr(drr.a.a));
   public static final drc<dto> I = a("ore", new drx(dto.a));
   public static final drc<dua> J = a("end_spike", new dsm(dua.a));
   public static final drc<dtn> K = a("end_island", new dra(dtn.a));
   public static final drc<dtf> L = a("end_gateway", new dqz(dtf.a));
   public static final dsi M = a("seagrass", new dsi(dtq.k));
   public static final drc<dtn> N = a("kelp", new drq(dtn.a));
   public static final drc<dtn> O = a("coral_tree", new dqt(dtn.a));
   public static final drc<dtn> P = a("coral_mushroom", new dqs(dtn.a));
   public static final drc<dtn> Q = a("coral_claw", new dqq(dtn.a));
   public static final drc<dtb> R = a("sea_pickle", new dsh(dtb.a));
   public static final drc<dty> S = a("simple_block", new dsj(dty.a));
   public static final drc<dtq> T = a("bamboo", new dqg(dtq.k));
   public static final drc<drl> U = a("huge_fungus", new drm(drl.a));
   public static final drc<dtm> V = a("nether_forest_vegetation", new drv(dtm.c));
   public static final drc<dtn> W = a("weeping_vines", new dsv(dtn.a));
   public static final drc<dud> X = a("twisting_vines", new dsp(dud.a));
   public static final drc<dta> Y = a("basalt_columns", new dqh(dta.a));
   public static final drc<dtc> Z = a("delta_feature", new dqu(dtc.a));
   public static final drc<dtv> aa = a("netherrack_replace_blobs", new dsc(dtv.a));
   public static final drc<dtk> ab = a("fill_layer", new drf(dtk.a));
   public static final dqn ac = a("bonus_chest", new dqn(dtn.a));
   public static final drc<dtn> ad = a("basalt_pillar", new dqi(dtn.a));
   public static final drc<dto> ae = a("scattered_ore", new dsf(dto.a));
   public static final drc<dts> af = a("random_selector", new dsb(dts.a));
   public static final drc<dtz> ag = a("simple_random_selector", new dsk(dtz.a));
   public static final drc<dtr> ah = a("random_boolean_selector", new drz(dtr.a));
   public static final drc<dth> ai = a("geode", new dri(dth.b));
   public static final drc<dte> aj = a("dripstone_cluster", new dqx(dte.a));
   public static final drc<dtj> ak = a("large_dripstone", new drs(dtj.a));
   public static final drc<dtp> al = a("pointed_dripstone", new dry(dtp.a));
   public static final drc<dtx> am = a("sculk_patch", new dsg(dtx.a));
   private final Codec<dqp<FC, drc<FC>>> a;

   private static <C extends dtg, F extends drc<C>> F a(String $$0, F $$1) {
      return ir.a(kb.Q, $$0, $$1);
   }

   public drc(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dqp<>(this, $$0x), dqp::c).codec();
   }

   public Codec<dqp<FC, drc<FC>>> a() {
      return this.a;
   }

   protected void a(ctg $$0, hv $$1, dip $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dip> a(asg<cvz> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(ctt $$0, hv $$1, dip $$2, Predicate<dip> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dre<FC> var1);

   public boolean a(FC $$0, ctt $$1, dkm $$2, auf $$3, hv $$4) {
      return $$1.f_($$4) ? this.a(new dre<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dip $$0) {
      return $$0.a(arr.bd);
   }

   public static boolean b(dip $$0) {
      return $$0.a(arr.af);
   }

   public static boolean a(cte $$0, hv $$1) {
      return $$0.a($$1, drc::b);
   }

   public static boolean a(Function<hv, dip> $$0, hv $$1, Predicate<dip> $$2) {
      hv.a $$3 = new hv.a();

      for (ia $$4 : ia.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hv, dip> $$0, hv $$1) {
      return a($$0, $$1, dio.a::i);
   }

   protected void a(ctt $$0, hv $$1) {
      hv.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ia.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
