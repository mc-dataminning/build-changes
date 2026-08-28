import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpe<T extends dpc> {
   private static final Logger S = LogUtils.getLogger();
   public static final dpe<dpy> a = a("furnace", dpe.b.a(dpy::new, dew.cD));
   public static final dpe<dpj> b = a("chest", dpe.b.a(dpj::new, dew.cv));
   public static final dpe<dqv> c = a("trapped_chest", dpe.b.a(dqv::new, dew.gV));
   public static final dpe<dpx> d = a("ender_chest", dpe.b.a(dpx::new, dew.fG));
   public static final dpe<dqd> e = a("jukebox", dpe.b.a(dqd::new, dew.dT));
   public static final dpe<dpu> f = a("dispenser", dpe.b.a(dpu::new, dew.aU));
   public static final dpe<dpv> g = a("dropper", dpe.b.a(dpv::new, dew.hi));
   public static final dpe<dqm> h = a(
      "sign",
      dpe.b.a(
         dqm::new,
         dew.cE,
         dew.cF,
         dew.cG,
         dew.cH,
         dew.cI,
         dew.cJ,
         dew.cK,
         dew.cR,
         dew.cS,
         dew.cT,
         dew.cU,
         dew.cV,
         dew.cW,
         dew.cX,
         dew.oW,
         dew.oY,
         dew.oX,
         dew.oZ,
         dew.cL,
         dew.cY,
         dew.cM,
         dew.cZ
      )
   );
   public static final dpe<dpz> i = a(
      "hanging_sign",
      dpe.b.a(
         dpz::new,
         dew.da,
         dew.db,
         dew.dc,
         dew.dd,
         dew.de,
         dew.df,
         dew.dg,
         dew.dh,
         dew.di,
         dew.dj,
         dew.dk,
         dew.dl,
         dew.dm,
         dew.dn,
         dew.do,
         dew.dp,
         dew.dq,
         dew.dr,
         dew.dt,
         dew.du,
         dew.ds,
         dew.dv
      )
   );
   public static final dpe<dqq> j = a("mob_spawner", dpe.b.a(dqq::new, dew.ct));
   public static final dpe<drt> k = a("piston", dpe.b.a(drt::new, dew.bQ));
   public static final dpe<dpf> l = a("brewing_stand", dpe.b.a(dpf::new, dew.fs));
   public static final dpe<dpw> m = a("enchanting_table", dpe.b.a(dpw::new, dew.fr));
   public static final dpe<dqt> n = a("end_portal", dpe.b.a(dqt::new, dew.fx));
   public static final dpe<dox> o = a("beacon", dpe.b.a(dox::new, dew.fO));
   public static final dpe<dqo> p = a(
      "skull", dpe.b.a(dqo::new, dew.gE, dew.gF, dew.gM, dew.gN, dew.gO, dew.gP, dew.gI, dew.gJ, dew.gG, dew.gH, dew.gK, dew.gL, dew.gQ, dew.gR)
   );
   public static final dpe<dpr> q = a("daylight_detector", dpe.b.a(dpr::new, dew.gZ));
   public static final dpe<dqb> r = a("hopper", dpe.b.a(dqb::new, dew.hc));
   public static final dpe<dpn> s = a("comparator", dpe.b.a(dpn::new, dew.gY));
   public static final dpe<dor> t = a(
      "banner",
      dpe.b.a(
         dor::new,
         dew.iJ,
         dew.iK,
         dew.iL,
         dew.iM,
         dew.iN,
         dew.iO,
         dew.iP,
         dew.iQ,
         dew.iR,
         dew.iS,
         dew.iT,
         dew.iU,
         dew.iV,
         dew.iW,
         dew.iX,
         dew.iY,
         dew.iZ,
         dew.ja,
         dew.jb,
         dew.jc,
         dew.jd,
         dew.je,
         dew.jf,
         dew.jg,
         dew.jh,
         dew.ji,
         dew.jj,
         dew.jk,
         dew.jl,
         dew.jm,
         dew.jn,
         dew.jo
      )
   );
   public static final dpe<dqr> u = a("structure_block", dpe.b.a(dqr::new, dew.pa));
   public static final dpe<dqs> v = a("end_gateway", dpe.b.a(dqs::new, dew.kF));
   public static final dpe<dpm> w = a("command_block", dpe.b.a(dpm::new, dew.fN, dew.kH, dew.kG));
   public static final dpe<dql> x = a(
      "shulker_box",
      dpe.b.a(dql::new, dew.kP, dew.lf, dew.lb, dew.lc, dew.kZ, dew.kX, dew.ld, dew.kT, dew.kY, dew.kV, dew.kS, dew.kR, dew.kW, dew.la, dew.le, dew.kQ, dew.kU)
   );
   public static final dpe<doy> y = a(
      "bed", dpe.b.a(doy::new, dew.bn, dew.bo, dew.bk, dew.bl, dew.bi, dew.bg, dew.bm, dew.bc, dew.bh, dew.be, dew.bb, dew.ba, dew.bf, dew.bj, dew.aZ, dew.bd)
   );
   public static final dpe<dpo> z = a("conduit", dpe.b.a(dpo::new, dew.mX));
   public static final dpe<dov> A = a("barrel", dpe.b.a(dov::new, dew.nU));
   public static final dpe<dqp> B = a("smoker", dpe.b.a(dqp::new, dew.nV));
   public static final dpe<dpb> C = a("blast_furnace", dpe.b.a(dpb::new, dew.nW));
   public static final dpe<dqe> D = a("lectern", dpe.b.a(dqe::new, dew.oa));
   public static final dpe<dpa> E = a("bell", dpe.b.a(dpa::new, dew.od));
   public static final dpe<dqc> F = a("jigsaw", dpe.b.a(dqc::new, dew.pb));
   public static final dpe<dpi> G = a("campfire", dpe.b.a(dpi::new, dew.og, dew.oh));
   public static final dpe<doz> H = a("beehive", dpe.b.a(doz::new, dew.pe, dew.pf));
   public static final dpe<dqj> I = a("sculk_sensor", dpe.b.a(dqj::new, dew.qQ));
   public static final dpe<dph> J = a("calibrated_sculk_sensor", dpe.b.a(dph::new, dew.qR));
   public static final dpe<dqi> K = a("sculk_catalyst", dpe.b.a(dqi::new, dew.qU));
   public static final dpe<dqk> L = a("sculk_shrieker", dpe.b.a(dqk::new, dew.qV));
   public static final dpe<dpl> M = a("chiseled_bookshelf", dpe.b.a(dpl::new, dew.cm));
   public static final dpe<dpg> N = a("brushable_block", dpe.b.a(dpg::new, dew.J, dew.M));
   public static final dpe<dps> O = a("decorated_pot", dpe.b.a(dps::new, dew.tp));
   public static final dpe<dpq> P = a("crafter", dpe.b.a(dpq::new, dew.tq));
   public static final dpe<dqw> Q = a("trial_spawner", dpe.b.a(dqw::new, dew.tr));
   public static final dpe<drf> R = a("vault", dpe.b.a(drf::new, dew.ts));
   private final dpe.a<? extends T> T;
   private final Set<deu> U;
   private final Type<?> V;
   private final ji.c<dpe<?>> W = lp.k.f(this);

   @Nullable
   public static alb a(dpe<?> $$0) {
      return lp.k.b($$0);
   }

   private static <T extends dpc> dpe<T> a(String $$0, dpe.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgs.s, $$0);
      return jv.a(lp.k, $$0, $$1.a($$2));
   }

   public dpe(dpe.a<? extends T> $$0, Set<deu> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(iz $$0, drx $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(drx $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public ji.c<dpe<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(daz $$0, iz $$1) {
      dpc $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpc> {
      T create(iz var1, drx var2);
   }

   public static final class b<T extends dpc> {
      private final dpe.a<? extends T> a;
      final Set<deu> b;

      private b(dpe.a<? extends T> $$0, Set<deu> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpc> dpe.b<T> a(dpe.a<? extends T> $$0, deu... $$1) {
         return new dpe.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dpe<T> a(Type<?> $$0) {
         return new dpe<>(this.a, this.b, $$0);
      }
   }
}
