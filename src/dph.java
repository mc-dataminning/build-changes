import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dph<T extends dpf> {
   private static final Logger S = LogUtils.getLogger();
   public static final dph<dqb> a = a("furnace", dph.b.a(dqb::new, dez.cD));
   public static final dph<dpm> b = a("chest", dph.b.a(dpm::new, dez.cv));
   public static final dph<dqy> c = a("trapped_chest", dph.b.a(dqy::new, dez.gV));
   public static final dph<dqa> d = a("ender_chest", dph.b.a(dqa::new, dez.fG));
   public static final dph<dqg> e = a("jukebox", dph.b.a(dqg::new, dez.dT));
   public static final dph<dpx> f = a("dispenser", dph.b.a(dpx::new, dez.aU));
   public static final dph<dpy> g = a("dropper", dph.b.a(dpy::new, dez.hi));
   public static final dph<dqp> h = a(
      "sign",
      dph.b.a(
         dqp::new,
         dez.cE,
         dez.cF,
         dez.cG,
         dez.cH,
         dez.cI,
         dez.cJ,
         dez.cK,
         dez.cR,
         dez.cS,
         dez.cT,
         dez.cU,
         dez.cV,
         dez.cW,
         dez.cX,
         dez.oW,
         dez.oY,
         dez.oX,
         dez.oZ,
         dez.cL,
         dez.cY,
         dez.cM,
         dez.cZ
      )
   );
   public static final dph<dqc> i = a(
      "hanging_sign",
      dph.b.a(
         dqc::new,
         dez.da,
         dez.db,
         dez.dc,
         dez.dd,
         dez.de,
         dez.df,
         dez.dg,
         dez.dh,
         dez.di,
         dez.dj,
         dez.dk,
         dez.dl,
         dez.dm,
         dez.dn,
         dez.do,
         dez.dp,
         dez.dq,
         dez.dr,
         dez.dt,
         dez.du,
         dez.ds,
         dez.dv
      )
   );
   public static final dph<dqt> j = a("mob_spawner", dph.b.a(dqt::new, dez.ct));
   public static final dph<drw> k = a("piston", dph.b.a(drw::new, dez.bQ));
   public static final dph<dpi> l = a("brewing_stand", dph.b.a(dpi::new, dez.fs));
   public static final dph<dpz> m = a("enchanting_table", dph.b.a(dpz::new, dez.fr));
   public static final dph<dqw> n = a("end_portal", dph.b.a(dqw::new, dez.fx));
   public static final dph<dpa> o = a("beacon", dph.b.a(dpa::new, dez.fO));
   public static final dph<dqr> p = a(
      "skull", dph.b.a(dqr::new, dez.gE, dez.gF, dez.gM, dez.gN, dez.gO, dez.gP, dez.gI, dez.gJ, dez.gG, dez.gH, dez.gK, dez.gL, dez.gQ, dez.gR)
   );
   public static final dph<dpu> q = a("daylight_detector", dph.b.a(dpu::new, dez.gZ));
   public static final dph<dqe> r = a("hopper", dph.b.a(dqe::new, dez.hc));
   public static final dph<dpq> s = a("comparator", dph.b.a(dpq::new, dez.gY));
   public static final dph<dou> t = a(
      "banner",
      dph.b.a(
         dou::new,
         dez.iJ,
         dez.iK,
         dez.iL,
         dez.iM,
         dez.iN,
         dez.iO,
         dez.iP,
         dez.iQ,
         dez.iR,
         dez.iS,
         dez.iT,
         dez.iU,
         dez.iV,
         dez.iW,
         dez.iX,
         dez.iY,
         dez.iZ,
         dez.ja,
         dez.jb,
         dez.jc,
         dez.jd,
         dez.je,
         dez.jf,
         dez.jg,
         dez.jh,
         dez.ji,
         dez.jj,
         dez.jk,
         dez.jl,
         dez.jm,
         dez.jn,
         dez.jo
      )
   );
   public static final dph<dqu> u = a("structure_block", dph.b.a(dqu::new, dez.pa));
   public static final dph<dqv> v = a("end_gateway", dph.b.a(dqv::new, dez.kF));
   public static final dph<dpp> w = a("command_block", dph.b.a(dpp::new, dez.fN, dez.kH, dez.kG));
   public static final dph<dqo> x = a(
      "shulker_box",
      dph.b.a(dqo::new, dez.kP, dez.lf, dez.lb, dez.lc, dez.kZ, dez.kX, dez.ld, dez.kT, dez.kY, dez.kV, dez.kS, dez.kR, dez.kW, dez.la, dez.le, dez.kQ, dez.kU)
   );
   public static final dph<dpb> y = a(
      "bed", dph.b.a(dpb::new, dez.bn, dez.bo, dez.bk, dez.bl, dez.bi, dez.bg, dez.bm, dez.bc, dez.bh, dez.be, dez.bb, dez.ba, dez.bf, dez.bj, dez.aZ, dez.bd)
   );
   public static final dph<dpr> z = a("conduit", dph.b.a(dpr::new, dez.mX));
   public static final dph<doy> A = a("barrel", dph.b.a(doy::new, dez.nU));
   public static final dph<dqs> B = a("smoker", dph.b.a(dqs::new, dez.nV));
   public static final dph<dpe> C = a("blast_furnace", dph.b.a(dpe::new, dez.nW));
   public static final dph<dqh> D = a("lectern", dph.b.a(dqh::new, dez.oa));
   public static final dph<dpd> E = a("bell", dph.b.a(dpd::new, dez.od));
   public static final dph<dqf> F = a("jigsaw", dph.b.a(dqf::new, dez.pb));
   public static final dph<dpl> G = a("campfire", dph.b.a(dpl::new, dez.og, dez.oh));
   public static final dph<dpc> H = a("beehive", dph.b.a(dpc::new, dez.pe, dez.pf));
   public static final dph<dqm> I = a("sculk_sensor", dph.b.a(dqm::new, dez.qQ));
   public static final dph<dpk> J = a("calibrated_sculk_sensor", dph.b.a(dpk::new, dez.qR));
   public static final dph<dql> K = a("sculk_catalyst", dph.b.a(dql::new, dez.qU));
   public static final dph<dqn> L = a("sculk_shrieker", dph.b.a(dqn::new, dez.qV));
   public static final dph<dpo> M = a("chiseled_bookshelf", dph.b.a(dpo::new, dez.cm));
   public static final dph<dpj> N = a("brushable_block", dph.b.a(dpj::new, dez.J, dez.M));
   public static final dph<dpv> O = a("decorated_pot", dph.b.a(dpv::new, dez.tp));
   public static final dph<dpt> P = a("crafter", dph.b.a(dpt::new, dez.tq));
   public static final dph<dqz> Q = a("trial_spawner", dph.b.a(dqz::new, dez.tr));
   public static final dph<dri> R = a("vault", dph.b.a(dri::new, dez.ts));
   private final dph.a<? extends T> T;
   private final Set<dex> U;
   private final Type<?> V;
   private final ji.c<dph<?>> W = lp.k.f(this);

   @Nullable
   public static ale a(dph<?> $$0) {
      return lp.k.b($$0);
   }

   private static <T extends dpf> dph<T> a(String $$0, dph.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgv.s, $$0);
      return jv.a(lp.k, $$0, $$1.a($$2));
   }

   public dph(dph.a<? extends T> $$0, Set<dex> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(iz $$0, dsa $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dsa $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public ji.c<dph<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dbc $$0, iz $$1) {
      dpf $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpf> {
      T create(iz var1, dsa var2);
   }

   public static final class b<T extends dpf> {
      private final dph.a<? extends T> a;
      final Set<dex> b;

      private b(dph.a<? extends T> $$0, Set<dex> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpf> dph.b<T> a(dph.a<? extends T> $$0, dex... $$1) {
         return new dph.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dph<T> a(Type<?> $$0) {
         return new dph<>(this.a, this.b, $$0);
      }
   }
}
