import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpr<T extends dpp> {
   private static final Logger S = LogUtils.getLogger();
   public static final dpr<dqm> a = a("furnace", dpr.b.a(dqm::new, dfj.cD));
   public static final dpr<dpw> b = a("chest", dpr.b.a(dpw::new, dfj.cv));
   public static final dpr<drj> c = a("trapped_chest", dpr.b.a(drj::new, dfj.gV));
   public static final dpr<dql> d = a("ender_chest", dpr.b.a(dql::new, dfj.fG));
   public static final dpr<dqr> e = a("jukebox", dpr.b.a(dqr::new, dfj.dT));
   public static final dpr<dqi> f = a("dispenser", dpr.b.a(dqi::new, dfj.aU));
   public static final dpr<dqj> g = a("dropper", dpr.b.a(dqj::new, dfj.hi));
   public static final dpr<dra> h = a(
      "sign",
      dpr.b.a(
         dra::new,
         dfj.cE,
         dfj.cF,
         dfj.cG,
         dfj.cH,
         dfj.cI,
         dfj.cJ,
         dfj.cK,
         dfj.cR,
         dfj.cS,
         dfj.cT,
         dfj.cU,
         dfj.cV,
         dfj.cW,
         dfj.cX,
         dfj.oW,
         dfj.oY,
         dfj.oX,
         dfj.oZ,
         dfj.cL,
         dfj.cY,
         dfj.cM,
         dfj.cZ
      )
   );
   public static final dpr<dqn> i = a(
      "hanging_sign",
      dpr.b.a(
         dqn::new,
         dfj.da,
         dfj.db,
         dfj.dc,
         dfj.dd,
         dfj.de,
         dfj.df,
         dfj.dg,
         dfj.dh,
         dfj.di,
         dfj.dj,
         dfj.dk,
         dfj.dl,
         dfj.dm,
         dfj.dn,
         dfj.do,
         dfj.dp,
         dfj.dq,
         dfj.dr,
         dfj.dt,
         dfj.du,
         dfj.ds,
         dfj.dv
      )
   );
   public static final dpr<dre> j = a("mob_spawner", dpr.b.a(dre::new, dfj.ct));
   public static final dpr<dsg> k = a("piston", dpr.b.a(dsg::new, dfj.bQ));
   public static final dpr<dps> l = a("brewing_stand", dpr.b.a(dps::new, dfj.fs));
   public static final dpr<dqk> m = a("enchanting_table", dpr.b.a(dqk::new, dfj.fr));
   public static final dpr<drh> n = a("end_portal", dpr.b.a(drh::new, dfj.fx));
   public static final dpr<dpk> o = a("beacon", dpr.b.a(dpk::new, dfj.fO));
   public static final dpr<drc> p = a(
      "skull", dpr.b.a(drc::new, dfj.gE, dfj.gF, dfj.gM, dfj.gN, dfj.gO, dfj.gP, dfj.gI, dfj.gJ, dfj.gG, dfj.gH, dfj.gK, dfj.gL, dfj.gQ, dfj.gR)
   );
   public static final dpr<dqe> q = a("daylight_detector", dpr.b.a(dqe::new, dfj.gZ));
   public static final dpr<dqp> r = a("hopper", dpr.b.a(dqp::new, dfj.hc));
   public static final dpr<dqa> s = a("comparator", dpr.b.a(dqa::new, dfj.gY));
   public static final dpr<dpe> t = a(
      "banner",
      dpr.b.a(
         dpe::new,
         dfj.iJ,
         dfj.iK,
         dfj.iL,
         dfj.iM,
         dfj.iN,
         dfj.iO,
         dfj.iP,
         dfj.iQ,
         dfj.iR,
         dfj.iS,
         dfj.iT,
         dfj.iU,
         dfj.iV,
         dfj.iW,
         dfj.iX,
         dfj.iY,
         dfj.iZ,
         dfj.ja,
         dfj.jb,
         dfj.jc,
         dfj.jd,
         dfj.je,
         dfj.jf,
         dfj.jg,
         dfj.jh,
         dfj.ji,
         dfj.jj,
         dfj.jk,
         dfj.jl,
         dfj.jm,
         dfj.jn,
         dfj.jo
      )
   );
   public static final dpr<drf> u = a("structure_block", dpr.b.a(drf::new, dfj.pa));
   public static final dpr<drg> v = a("end_gateway", dpr.b.a(drg::new, dfj.kF));
   public static final dpr<dpz> w = a("command_block", dpr.b.a(dpz::new, dfj.fN, dfj.kH, dfj.kG));
   public static final dpr<dqz> x = a(
      "shulker_box",
      dpr.b.a(dqz::new, dfj.kP, dfj.lf, dfj.lb, dfj.lc, dfj.kZ, dfj.kX, dfj.ld, dfj.kT, dfj.kY, dfj.kV, dfj.kS, dfj.kR, dfj.kW, dfj.la, dfj.le, dfj.kQ, dfj.kU)
   );
   public static final dpr<dpl> y = a(
      "bed", dpr.b.a(dpl::new, dfj.bn, dfj.bo, dfj.bk, dfj.bl, dfj.bi, dfj.bg, dfj.bm, dfj.bc, dfj.bh, dfj.be, dfj.bb, dfj.ba, dfj.bf, dfj.bj, dfj.aZ, dfj.bd)
   );
   public static final dpr<dqb> z = a("conduit", dpr.b.a(dqb::new, dfj.mX));
   public static final dpr<dpi> A = a("barrel", dpr.b.a(dpi::new, dfj.nU));
   public static final dpr<drd> B = a("smoker", dpr.b.a(drd::new, dfj.nV));
   public static final dpr<dpo> C = a("blast_furnace", dpr.b.a(dpo::new, dfj.nW));
   public static final dpr<dqs> D = a("lectern", dpr.b.a(dqs::new, dfj.oa));
   public static final dpr<dpn> E = a("bell", dpr.b.a(dpn::new, dfj.od));
   public static final dpr<dqq> F = a("jigsaw", dpr.b.a(dqq::new, dfj.pb));
   public static final dpr<dpv> G = a("campfire", dpr.b.a(dpv::new, dfj.og, dfj.oh));
   public static final dpr<dpm> H = a("beehive", dpr.b.a(dpm::new, dfj.pe, dfj.pf));
   public static final dpr<dqx> I = a("sculk_sensor", dpr.b.a(dqx::new, dfj.qQ));
   public static final dpr<dpu> J = a("calibrated_sculk_sensor", dpr.b.a(dpu::new, dfj.qR));
   public static final dpr<dqw> K = a("sculk_catalyst", dpr.b.a(dqw::new, dfj.qU));
   public static final dpr<dqy> L = a("sculk_shrieker", dpr.b.a(dqy::new, dfj.qV));
   public static final dpr<dpy> M = a("chiseled_bookshelf", dpr.b.a(dpy::new, dfj.cm));
   public static final dpr<dpt> N = a("brushable_block", dpr.b.a(dpt::new, dfj.J, dfj.M));
   public static final dpr<dqf> O = a("decorated_pot", dpr.b.a(dqf::new, dfj.tp));
   public static final dpr<dqd> P = a("crafter", dpr.b.a(dqd::new, dfj.tq));
   public static final dpr<drk> Q = a("trial_spawner", dpr.b.a(drk::new, dfj.tr));
   public static final dpr<drs> R = a("vault", dpr.b.a(drs::new, dfj.ts));
   private final dpr.a<? extends T> T;
   private final Set<dfh> U;
   private final Type<?> V;
   private final jj.c<dpr<?>> W = lq.j.f(this);

   @Nullable
   public static akk a(dpr<?> $$0) {
      return lq.j.b($$0);
   }

   private static <T extends dpp> dpr<T> a(String $$0, dpr.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgg.s, $$0);
      return jw.a(lq.j, $$0, $$1.a($$2));
   }

   public dpr(dpr.a<? extends T> $$0, Set<dfh> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(ja $$0, dsk $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dsk $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public jj.c<dpr<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dbl $$0, ja $$1) {
      dpp $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpp> {
      T create(ja var1, dsk var2);
   }

   public static final class b<T extends dpp> {
      private final dpr.a<? extends T> a;
      final Set<dfh> b;

      private b(dpr.a<? extends T> $$0, Set<dfh> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpp> dpr.b<T> a(dpr.a<? extends T> $$0, dfh... $$1) {
         return new dpr.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dpr<T> a(Type<?> $$0) {
         return new dpr<>(this.a, this.b, $$0);
      }
   }
}
