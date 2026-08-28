import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqh<T extends dqf> {
   private static final Logger S = LogUtils.getLogger();
   public static final dqh<drc> a = a("furnace", dqh.b.a(drc::new, dfy.cD));
   public static final dqh<dqm> b = a("chest", dqh.b.a(dqm::new, dfy.cv));
   public static final dqh<drz> c = a("trapped_chest", dqh.b.a(drz::new, dfy.gV));
   public static final dqh<drb> d = a("ender_chest", dqh.b.a(drb::new, dfy.fG));
   public static final dqh<drh> e = a("jukebox", dqh.b.a(drh::new, dfy.dT));
   public static final dqh<dqy> f = a("dispenser", dqh.b.a(dqy::new, dfy.aU));
   public static final dqh<dqz> g = a("dropper", dqh.b.a(dqz::new, dfy.hi));
   public static final dqh<drq> h = a(
      "sign",
      dqh.b.a(
         drq::new,
         dfy.cE,
         dfy.cF,
         dfy.cG,
         dfy.cH,
         dfy.cI,
         dfy.cJ,
         dfy.cK,
         dfy.cR,
         dfy.cS,
         dfy.cT,
         dfy.cU,
         dfy.cV,
         dfy.cW,
         dfy.cX,
         dfy.oW,
         dfy.oY,
         dfy.oX,
         dfy.oZ,
         dfy.cL,
         dfy.cY,
         dfy.cM,
         dfy.cZ
      )
   );
   public static final dqh<drd> i = a(
      "hanging_sign",
      dqh.b.a(
         drd::new,
         dfy.da,
         dfy.db,
         dfy.dc,
         dfy.dd,
         dfy.de,
         dfy.df,
         dfy.dg,
         dfy.dh,
         dfy.di,
         dfy.dj,
         dfy.dk,
         dfy.dl,
         dfy.dm,
         dfy.dn,
         dfy.do,
         dfy.dp,
         dfy.dq,
         dfy.dr,
         dfy.dt,
         dfy.du,
         dfy.ds,
         dfy.dv
      )
   );
   public static final dqh<dru> j = a("mob_spawner", dqh.b.a(dru::new, dfy.ct));
   public static final dqh<dsw> k = a("piston", dqh.b.a(dsw::new, dfy.bQ));
   public static final dqh<dqi> l = a("brewing_stand", dqh.b.a(dqi::new, dfy.fs));
   public static final dqh<dra> m = a("enchanting_table", dqh.b.a(dra::new, dfy.fr));
   public static final dqh<drx> n = a("end_portal", dqh.b.a(drx::new, dfy.fx));
   public static final dqh<dqa> o = a("beacon", dqh.b.a(dqa::new, dfy.fO));
   public static final dqh<drs> p = a(
      "skull", dqh.b.a(drs::new, dfy.gE, dfy.gF, dfy.gM, dfy.gN, dfy.gO, dfy.gP, dfy.gI, dfy.gJ, dfy.gG, dfy.gH, dfy.gK, dfy.gL, dfy.gQ, dfy.gR)
   );
   public static final dqh<dqu> q = a("daylight_detector", dqh.b.a(dqu::new, dfy.gZ));
   public static final dqh<drf> r = a("hopper", dqh.b.a(drf::new, dfy.hc));
   public static final dqh<dqq> s = a("comparator", dqh.b.a(dqq::new, dfy.gY));
   public static final dqh<dpu> t = a(
      "banner",
      dqh.b.a(
         dpu::new,
         dfy.iJ,
         dfy.iK,
         dfy.iL,
         dfy.iM,
         dfy.iN,
         dfy.iO,
         dfy.iP,
         dfy.iQ,
         dfy.iR,
         dfy.iS,
         dfy.iT,
         dfy.iU,
         dfy.iV,
         dfy.iW,
         dfy.iX,
         dfy.iY,
         dfy.iZ,
         dfy.ja,
         dfy.jb,
         dfy.jc,
         dfy.jd,
         dfy.je,
         dfy.jf,
         dfy.jg,
         dfy.jh,
         dfy.ji,
         dfy.jj,
         dfy.jk,
         dfy.jl,
         dfy.jm,
         dfy.jn,
         dfy.jo
      )
   );
   public static final dqh<drv> u = a("structure_block", dqh.b.a(drv::new, dfy.pa));
   public static final dqh<drw> v = a("end_gateway", dqh.b.a(drw::new, dfy.kF));
   public static final dqh<dqp> w = a("command_block", dqh.b.a(dqp::new, dfy.fN, dfy.kH, dfy.kG));
   public static final dqh<drp> x = a(
      "shulker_box",
      dqh.b.a(drp::new, dfy.kP, dfy.lf, dfy.lb, dfy.lc, dfy.kZ, dfy.kX, dfy.ld, dfy.kT, dfy.kY, dfy.kV, dfy.kS, dfy.kR, dfy.kW, dfy.la, dfy.le, dfy.kQ, dfy.kU)
   );
   public static final dqh<dqb> y = a(
      "bed", dqh.b.a(dqb::new, dfy.bn, dfy.bo, dfy.bk, dfy.bl, dfy.bi, dfy.bg, dfy.bm, dfy.bc, dfy.bh, dfy.be, dfy.bb, dfy.ba, dfy.bf, dfy.bj, dfy.aZ, dfy.bd)
   );
   public static final dqh<dqr> z = a("conduit", dqh.b.a(dqr::new, dfy.mX));
   public static final dqh<dpy> A = a("barrel", dqh.b.a(dpy::new, dfy.nU));
   public static final dqh<drt> B = a("smoker", dqh.b.a(drt::new, dfy.nV));
   public static final dqh<dqe> C = a("blast_furnace", dqh.b.a(dqe::new, dfy.nW));
   public static final dqh<dri> D = a("lectern", dqh.b.a(dri::new, dfy.oa));
   public static final dqh<dqd> E = a("bell", dqh.b.a(dqd::new, dfy.od));
   public static final dqh<drg> F = a("jigsaw", dqh.b.a(drg::new, dfy.pb));
   public static final dqh<dql> G = a("campfire", dqh.b.a(dql::new, dfy.og, dfy.oh));
   public static final dqh<dqc> H = a("beehive", dqh.b.a(dqc::new, dfy.pe, dfy.pf));
   public static final dqh<drn> I = a("sculk_sensor", dqh.b.a(drn::new, dfy.qQ));
   public static final dqh<dqk> J = a("calibrated_sculk_sensor", dqh.b.a(dqk::new, dfy.qR));
   public static final dqh<drm> K = a("sculk_catalyst", dqh.b.a(drm::new, dfy.qU));
   public static final dqh<dro> L = a("sculk_shrieker", dqh.b.a(dro::new, dfy.qV));
   public static final dqh<dqo> M = a("chiseled_bookshelf", dqh.b.a(dqo::new, dfy.cm));
   public static final dqh<dqj> N = a("brushable_block", dqh.b.a(dqj::new, dfy.J, dfy.M));
   public static final dqh<dqv> O = a("decorated_pot", dqh.b.a(dqv::new, dfy.tp));
   public static final dqh<dqt> P = a("crafter", dqh.b.a(dqt::new, dfy.tq));
   public static final dqh<dsa> Q = a("trial_spawner", dqh.b.a(dsa::new, dfy.tr));
   public static final dqh<dsi> R = a("vault", dqh.b.a(dsi::new, dfy.ts));
   private final dqh.a<? extends T> T;
   private final Set<dfw> U;
   private final Type<?> V;
   private final jm.c<dqh<?>> W = lt.j.f(this);

   @Nullable
   public static akq a(dqh<?> $$0) {
      return lt.j.b($$0);
   }

   private static <T extends dqf> dqh<T> a(String $$0, dqh.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ad.a(bgq.s, $$0);
      return jz.a(lt.j, $$0, $$1.a($$2));
   }

   public dqh(dqh.a<? extends T> $$0, Set<dfw> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(jd $$0, dta $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dta $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public jm.c<dqh<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dca $$0, jd $$1) {
      dqf $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dqf> {
      T create(jd var1, dta var2);
   }

   public static final class b<T extends dqf> {
      private final dqh.a<? extends T> a;
      final Set<dfw> b;

      private b(dqh.a<? extends T> $$0, Set<dfw> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dqf> dqh.b<T> a(dqh.a<? extends T> $$0, dfw... $$1) {
         return new dqh.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dqh<T> a(Type<?> $$0) {
         return new dqh<>(this.a, this.b, $$0);
      }
   }
}
