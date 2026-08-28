import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpk<T extends dpi> {
   private static final Logger S = LogUtils.getLogger();
   public static final dpk<dqe> a = a("furnace", dpk.b.a(dqe::new, dfc.cD));
   public static final dpk<dpp> b = a("chest", dpk.b.a(dpp::new, dfc.cv));
   public static final dpk<drb> c = a("trapped_chest", dpk.b.a(drb::new, dfc.gV));
   public static final dpk<dqd> d = a("ender_chest", dpk.b.a(dqd::new, dfc.fG));
   public static final dpk<dqj> e = a("jukebox", dpk.b.a(dqj::new, dfc.dT));
   public static final dpk<dqa> f = a("dispenser", dpk.b.a(dqa::new, dfc.aU));
   public static final dpk<dqb> g = a("dropper", dpk.b.a(dqb::new, dfc.hi));
   public static final dpk<dqs> h = a(
      "sign",
      dpk.b.a(
         dqs::new,
         dfc.cE,
         dfc.cF,
         dfc.cG,
         dfc.cH,
         dfc.cI,
         dfc.cJ,
         dfc.cK,
         dfc.cR,
         dfc.cS,
         dfc.cT,
         dfc.cU,
         dfc.cV,
         dfc.cW,
         dfc.cX,
         dfc.oW,
         dfc.oY,
         dfc.oX,
         dfc.oZ,
         dfc.cL,
         dfc.cY,
         dfc.cM,
         dfc.cZ
      )
   );
   public static final dpk<dqf> i = a(
      "hanging_sign",
      dpk.b.a(
         dqf::new,
         dfc.da,
         dfc.db,
         dfc.dc,
         dfc.dd,
         dfc.de,
         dfc.df,
         dfc.dg,
         dfc.dh,
         dfc.di,
         dfc.dj,
         dfc.dk,
         dfc.dl,
         dfc.dm,
         dfc.dn,
         dfc.do,
         dfc.dp,
         dfc.dq,
         dfc.dr,
         dfc.dt,
         dfc.du,
         dfc.ds,
         dfc.dv
      )
   );
   public static final dpk<dqw> j = a("mob_spawner", dpk.b.a(dqw::new, dfc.ct));
   public static final dpk<drz> k = a("piston", dpk.b.a(drz::new, dfc.bQ));
   public static final dpk<dpl> l = a("brewing_stand", dpk.b.a(dpl::new, dfc.fs));
   public static final dpk<dqc> m = a("enchanting_table", dpk.b.a(dqc::new, dfc.fr));
   public static final dpk<dqz> n = a("end_portal", dpk.b.a(dqz::new, dfc.fx));
   public static final dpk<dpd> o = a("beacon", dpk.b.a(dpd::new, dfc.fO));
   public static final dpk<dqu> p = a(
      "skull", dpk.b.a(dqu::new, dfc.gE, dfc.gF, dfc.gM, dfc.gN, dfc.gO, dfc.gP, dfc.gI, dfc.gJ, dfc.gG, dfc.gH, dfc.gK, dfc.gL, dfc.gQ, dfc.gR)
   );
   public static final dpk<dpx> q = a("daylight_detector", dpk.b.a(dpx::new, dfc.gZ));
   public static final dpk<dqh> r = a("hopper", dpk.b.a(dqh::new, dfc.hc));
   public static final dpk<dpt> s = a("comparator", dpk.b.a(dpt::new, dfc.gY));
   public static final dpk<dox> t = a(
      "banner",
      dpk.b.a(
         dox::new,
         dfc.iJ,
         dfc.iK,
         dfc.iL,
         dfc.iM,
         dfc.iN,
         dfc.iO,
         dfc.iP,
         dfc.iQ,
         dfc.iR,
         dfc.iS,
         dfc.iT,
         dfc.iU,
         dfc.iV,
         dfc.iW,
         dfc.iX,
         dfc.iY,
         dfc.iZ,
         dfc.ja,
         dfc.jb,
         dfc.jc,
         dfc.jd,
         dfc.je,
         dfc.jf,
         dfc.jg,
         dfc.jh,
         dfc.ji,
         dfc.jj,
         dfc.jk,
         dfc.jl,
         dfc.jm,
         dfc.jn,
         dfc.jo
      )
   );
   public static final dpk<dqx> u = a("structure_block", dpk.b.a(dqx::new, dfc.pa));
   public static final dpk<dqy> v = a("end_gateway", dpk.b.a(dqy::new, dfc.kF));
   public static final dpk<dps> w = a("command_block", dpk.b.a(dps::new, dfc.fN, dfc.kH, dfc.kG));
   public static final dpk<dqr> x = a(
      "shulker_box",
      dpk.b.a(dqr::new, dfc.kP, dfc.lf, dfc.lb, dfc.lc, dfc.kZ, dfc.kX, dfc.ld, dfc.kT, dfc.kY, dfc.kV, dfc.kS, dfc.kR, dfc.kW, dfc.la, dfc.le, dfc.kQ, dfc.kU)
   );
   public static final dpk<dpe> y = a(
      "bed", dpk.b.a(dpe::new, dfc.bn, dfc.bo, dfc.bk, dfc.bl, dfc.bi, dfc.bg, dfc.bm, dfc.bc, dfc.bh, dfc.be, dfc.bb, dfc.ba, dfc.bf, dfc.bj, dfc.aZ, dfc.bd)
   );
   public static final dpk<dpu> z = a("conduit", dpk.b.a(dpu::new, dfc.mX));
   public static final dpk<dpb> A = a("barrel", dpk.b.a(dpb::new, dfc.nU));
   public static final dpk<dqv> B = a("smoker", dpk.b.a(dqv::new, dfc.nV));
   public static final dpk<dph> C = a("blast_furnace", dpk.b.a(dph::new, dfc.nW));
   public static final dpk<dqk> D = a("lectern", dpk.b.a(dqk::new, dfc.oa));
   public static final dpk<dpg> E = a("bell", dpk.b.a(dpg::new, dfc.od));
   public static final dpk<dqi> F = a("jigsaw", dpk.b.a(dqi::new, dfc.pb));
   public static final dpk<dpo> G = a("campfire", dpk.b.a(dpo::new, dfc.og, dfc.oh));
   public static final dpk<dpf> H = a("beehive", dpk.b.a(dpf::new, dfc.pe, dfc.pf));
   public static final dpk<dqp> I = a("sculk_sensor", dpk.b.a(dqp::new, dfc.qQ));
   public static final dpk<dpn> J = a("calibrated_sculk_sensor", dpk.b.a(dpn::new, dfc.qR));
   public static final dpk<dqo> K = a("sculk_catalyst", dpk.b.a(dqo::new, dfc.qU));
   public static final dpk<dqq> L = a("sculk_shrieker", dpk.b.a(dqq::new, dfc.qV));
   public static final dpk<dpr> M = a("chiseled_bookshelf", dpk.b.a(dpr::new, dfc.cm));
   public static final dpk<dpm> N = a("brushable_block", dpk.b.a(dpm::new, dfc.J, dfc.M));
   public static final dpk<dpy> O = a("decorated_pot", dpk.b.a(dpy::new, dfc.tp));
   public static final dpk<dpw> P = a("crafter", dpk.b.a(dpw::new, dfc.tq));
   public static final dpk<drc> Q = a("trial_spawner", dpk.b.a(drc::new, dfc.tr));
   public static final dpk<drl> R = a("vault", dpk.b.a(drl::new, dfc.ts));
   private final dpk.a<? extends T> T;
   private final Set<dfa> U;
   private final Type<?> V;
   private final ji.c<dpk<?>> W = lp.k.f(this);

   @Nullable
   public static alf a(dpk<?> $$0) {
      return lp.k.b($$0);
   }

   private static <T extends dpi> dpk<T> a(String $$0, dpk.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgx.s, $$0);
      return jv.a(lp.k, $$0, $$1.a($$2));
   }

   public dpk(dpk.a<? extends T> $$0, Set<dfa> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(iz $$0, dsd $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dsd $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public ji.c<dpk<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dbf $$0, iz $$1) {
      dpi $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpi> {
      T create(iz var1, dsd var2);
   }

   public static final class b<T extends dpi> {
      private final dpk.a<? extends T> a;
      final Set<dfa> b;

      private b(dpk.a<? extends T> $$0, Set<dfa> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpi> dpk.b<T> a(dpk.a<? extends T> $$0, dfa... $$1) {
         return new dpk.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dpk<T> a(Type<?> $$0) {
         return new dpk<>(this.a, this.b, $$0);
      }
   }
}
