import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpi<T extends dpg> {
   private static final Logger S = LogUtils.getLogger();
   public static final dpi<dqc> a = a("furnace", dpi.b.a(dqc::new, dfa.cD));
   public static final dpi<dpn> b = a("chest", dpi.b.a(dpn::new, dfa.cv));
   public static final dpi<dqz> c = a("trapped_chest", dpi.b.a(dqz::new, dfa.gV));
   public static final dpi<dqb> d = a("ender_chest", dpi.b.a(dqb::new, dfa.fG));
   public static final dpi<dqh> e = a("jukebox", dpi.b.a(dqh::new, dfa.dT));
   public static final dpi<dpy> f = a("dispenser", dpi.b.a(dpy::new, dfa.aU));
   public static final dpi<dpz> g = a("dropper", dpi.b.a(dpz::new, dfa.hi));
   public static final dpi<dqq> h = a(
      "sign",
      dpi.b.a(
         dqq::new,
         dfa.cE,
         dfa.cF,
         dfa.cG,
         dfa.cH,
         dfa.cI,
         dfa.cJ,
         dfa.cK,
         dfa.cR,
         dfa.cS,
         dfa.cT,
         dfa.cU,
         dfa.cV,
         dfa.cW,
         dfa.cX,
         dfa.oW,
         dfa.oY,
         dfa.oX,
         dfa.oZ,
         dfa.cL,
         dfa.cY,
         dfa.cM,
         dfa.cZ
      )
   );
   public static final dpi<dqd> i = a(
      "hanging_sign",
      dpi.b.a(
         dqd::new,
         dfa.da,
         dfa.db,
         dfa.dc,
         dfa.dd,
         dfa.de,
         dfa.df,
         dfa.dg,
         dfa.dh,
         dfa.di,
         dfa.dj,
         dfa.dk,
         dfa.dl,
         dfa.dm,
         dfa.dn,
         dfa.do,
         dfa.dp,
         dfa.dq,
         dfa.dr,
         dfa.dt,
         dfa.du,
         dfa.ds,
         dfa.dv
      )
   );
   public static final dpi<dqu> j = a("mob_spawner", dpi.b.a(dqu::new, dfa.ct));
   public static final dpi<drx> k = a("piston", dpi.b.a(drx::new, dfa.bQ));
   public static final dpi<dpj> l = a("brewing_stand", dpi.b.a(dpj::new, dfa.fs));
   public static final dpi<dqa> m = a("enchanting_table", dpi.b.a(dqa::new, dfa.fr));
   public static final dpi<dqx> n = a("end_portal", dpi.b.a(dqx::new, dfa.fx));
   public static final dpi<dpb> o = a("beacon", dpi.b.a(dpb::new, dfa.fO));
   public static final dpi<dqs> p = a(
      "skull", dpi.b.a(dqs::new, dfa.gE, dfa.gF, dfa.gM, dfa.gN, dfa.gO, dfa.gP, dfa.gI, dfa.gJ, dfa.gG, dfa.gH, dfa.gK, dfa.gL, dfa.gQ, dfa.gR)
   );
   public static final dpi<dpv> q = a("daylight_detector", dpi.b.a(dpv::new, dfa.gZ));
   public static final dpi<dqf> r = a("hopper", dpi.b.a(dqf::new, dfa.hc));
   public static final dpi<dpr> s = a("comparator", dpi.b.a(dpr::new, dfa.gY));
   public static final dpi<dov> t = a(
      "banner",
      dpi.b.a(
         dov::new,
         dfa.iJ,
         dfa.iK,
         dfa.iL,
         dfa.iM,
         dfa.iN,
         dfa.iO,
         dfa.iP,
         dfa.iQ,
         dfa.iR,
         dfa.iS,
         dfa.iT,
         dfa.iU,
         dfa.iV,
         dfa.iW,
         dfa.iX,
         dfa.iY,
         dfa.iZ,
         dfa.ja,
         dfa.jb,
         dfa.jc,
         dfa.jd,
         dfa.je,
         dfa.jf,
         dfa.jg,
         dfa.jh,
         dfa.ji,
         dfa.jj,
         dfa.jk,
         dfa.jl,
         dfa.jm,
         dfa.jn,
         dfa.jo
      )
   );
   public static final dpi<dqv> u = a("structure_block", dpi.b.a(dqv::new, dfa.pa));
   public static final dpi<dqw> v = a("end_gateway", dpi.b.a(dqw::new, dfa.kF));
   public static final dpi<dpq> w = a("command_block", dpi.b.a(dpq::new, dfa.fN, dfa.kH, dfa.kG));
   public static final dpi<dqp> x = a(
      "shulker_box",
      dpi.b.a(dqp::new, dfa.kP, dfa.lf, dfa.lb, dfa.lc, dfa.kZ, dfa.kX, dfa.ld, dfa.kT, dfa.kY, dfa.kV, dfa.kS, dfa.kR, dfa.kW, dfa.la, dfa.le, dfa.kQ, dfa.kU)
   );
   public static final dpi<dpc> y = a(
      "bed", dpi.b.a(dpc::new, dfa.bn, dfa.bo, dfa.bk, dfa.bl, dfa.bi, dfa.bg, dfa.bm, dfa.bc, dfa.bh, dfa.be, dfa.bb, dfa.ba, dfa.bf, dfa.bj, dfa.aZ, dfa.bd)
   );
   public static final dpi<dps> z = a("conduit", dpi.b.a(dps::new, dfa.mX));
   public static final dpi<doz> A = a("barrel", dpi.b.a(doz::new, dfa.nU));
   public static final dpi<dqt> B = a("smoker", dpi.b.a(dqt::new, dfa.nV));
   public static final dpi<dpf> C = a("blast_furnace", dpi.b.a(dpf::new, dfa.nW));
   public static final dpi<dqi> D = a("lectern", dpi.b.a(dqi::new, dfa.oa));
   public static final dpi<dpe> E = a("bell", dpi.b.a(dpe::new, dfa.od));
   public static final dpi<dqg> F = a("jigsaw", dpi.b.a(dqg::new, dfa.pb));
   public static final dpi<dpm> G = a("campfire", dpi.b.a(dpm::new, dfa.og, dfa.oh));
   public static final dpi<dpd> H = a("beehive", dpi.b.a(dpd::new, dfa.pe, dfa.pf));
   public static final dpi<dqn> I = a("sculk_sensor", dpi.b.a(dqn::new, dfa.qQ));
   public static final dpi<dpl> J = a("calibrated_sculk_sensor", dpi.b.a(dpl::new, dfa.qR));
   public static final dpi<dqm> K = a("sculk_catalyst", dpi.b.a(dqm::new, dfa.qU));
   public static final dpi<dqo> L = a("sculk_shrieker", dpi.b.a(dqo::new, dfa.qV));
   public static final dpi<dpp> M = a("chiseled_bookshelf", dpi.b.a(dpp::new, dfa.cm));
   public static final dpi<dpk> N = a("brushable_block", dpi.b.a(dpk::new, dfa.J, dfa.M));
   public static final dpi<dpw> O = a("decorated_pot", dpi.b.a(dpw::new, dfa.tp));
   public static final dpi<dpu> P = a("crafter", dpi.b.a(dpu::new, dfa.tq));
   public static final dpi<dra> Q = a("trial_spawner", dpi.b.a(dra::new, dfa.tr));
   public static final dpi<drj> R = a("vault", dpi.b.a(drj::new, dfa.ts));
   private final dpi.a<? extends T> T;
   private final Set<dey> U;
   private final Type<?> V;
   private final ji.c<dpi<?>> W = lp.k.f(this);

   @Nullable
   public static ale a(dpi<?> $$0) {
      return lp.k.b($$0);
   }

   private static <T extends dpg> dpi<T> a(String $$0, dpi.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgw.s, $$0);
      return jv.a(lp.k, $$0, $$1.a($$2));
   }

   public dpi(dpi.a<? extends T> $$0, Set<dey> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(iz $$0, dsb $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dsb $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public ji.c<dpi<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dbd $$0, iz $$1) {
      dpg $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpg> {
      T create(iz var1, dsb var2);
   }

   public static final class b<T extends dpg> {
      private final dpi.a<? extends T> a;
      final Set<dey> b;

      private b(dpi.a<? extends T> $$0, Set<dey> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpg> dpi.b<T> a(dpi.a<? extends T> $$0, dey... $$1) {
         return new dpi.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dpi<T> a(Type<?> $$0) {
         return new dpi<>(this.a, this.b, $$0);
      }
   }
}
