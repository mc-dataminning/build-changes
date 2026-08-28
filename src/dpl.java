import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpl<T extends dpj> {
   private static final Logger S = LogUtils.getLogger();
   public static final dpl<dqf> a = a("furnace", dpl.b.a(dqf::new, dfd.cD));
   public static final dpl<dpq> b = a("chest", dpl.b.a(dpq::new, dfd.cv));
   public static final dpl<drc> c = a("trapped_chest", dpl.b.a(drc::new, dfd.gV));
   public static final dpl<dqe> d = a("ender_chest", dpl.b.a(dqe::new, dfd.fG));
   public static final dpl<dqk> e = a("jukebox", dpl.b.a(dqk::new, dfd.dT));
   public static final dpl<dqb> f = a("dispenser", dpl.b.a(dqb::new, dfd.aU));
   public static final dpl<dqc> g = a("dropper", dpl.b.a(dqc::new, dfd.hi));
   public static final dpl<dqt> h = a(
      "sign",
      dpl.b.a(
         dqt::new,
         dfd.cE,
         dfd.cF,
         dfd.cG,
         dfd.cH,
         dfd.cI,
         dfd.cJ,
         dfd.cK,
         dfd.cR,
         dfd.cS,
         dfd.cT,
         dfd.cU,
         dfd.cV,
         dfd.cW,
         dfd.cX,
         dfd.oW,
         dfd.oY,
         dfd.oX,
         dfd.oZ,
         dfd.cL,
         dfd.cY,
         dfd.cM,
         dfd.cZ
      )
   );
   public static final dpl<dqg> i = a(
      "hanging_sign",
      dpl.b.a(
         dqg::new,
         dfd.da,
         dfd.db,
         dfd.dc,
         dfd.dd,
         dfd.de,
         dfd.df,
         dfd.dg,
         dfd.dh,
         dfd.di,
         dfd.dj,
         dfd.dk,
         dfd.dl,
         dfd.dm,
         dfd.dn,
         dfd.do,
         dfd.dp,
         dfd.dq,
         dfd.dr,
         dfd.dt,
         dfd.du,
         dfd.ds,
         dfd.dv
      )
   );
   public static final dpl<dqx> j = a("mob_spawner", dpl.b.a(dqx::new, dfd.ct));
   public static final dpl<dsa> k = a("piston", dpl.b.a(dsa::new, dfd.bQ));
   public static final dpl<dpm> l = a("brewing_stand", dpl.b.a(dpm::new, dfd.fs));
   public static final dpl<dqd> m = a("enchanting_table", dpl.b.a(dqd::new, dfd.fr));
   public static final dpl<dra> n = a("end_portal", dpl.b.a(dra::new, dfd.fx));
   public static final dpl<dpe> o = a("beacon", dpl.b.a(dpe::new, dfd.fO));
   public static final dpl<dqv> p = a(
      "skull", dpl.b.a(dqv::new, dfd.gE, dfd.gF, dfd.gM, dfd.gN, dfd.gO, dfd.gP, dfd.gI, dfd.gJ, dfd.gG, dfd.gH, dfd.gK, dfd.gL, dfd.gQ, dfd.gR)
   );
   public static final dpl<dpy> q = a("daylight_detector", dpl.b.a(dpy::new, dfd.gZ));
   public static final dpl<dqi> r = a("hopper", dpl.b.a(dqi::new, dfd.hc));
   public static final dpl<dpu> s = a("comparator", dpl.b.a(dpu::new, dfd.gY));
   public static final dpl<doy> t = a(
      "banner",
      dpl.b.a(
         doy::new,
         dfd.iJ,
         dfd.iK,
         dfd.iL,
         dfd.iM,
         dfd.iN,
         dfd.iO,
         dfd.iP,
         dfd.iQ,
         dfd.iR,
         dfd.iS,
         dfd.iT,
         dfd.iU,
         dfd.iV,
         dfd.iW,
         dfd.iX,
         dfd.iY,
         dfd.iZ,
         dfd.ja,
         dfd.jb,
         dfd.jc,
         dfd.jd,
         dfd.je,
         dfd.jf,
         dfd.jg,
         dfd.jh,
         dfd.ji,
         dfd.jj,
         dfd.jk,
         dfd.jl,
         dfd.jm,
         dfd.jn,
         dfd.jo
      )
   );
   public static final dpl<dqy> u = a("structure_block", dpl.b.a(dqy::new, dfd.pa));
   public static final dpl<dqz> v = a("end_gateway", dpl.b.a(dqz::new, dfd.kF));
   public static final dpl<dpt> w = a("command_block", dpl.b.a(dpt::new, dfd.fN, dfd.kH, dfd.kG));
   public static final dpl<dqs> x = a(
      "shulker_box",
      dpl.b.a(dqs::new, dfd.kP, dfd.lf, dfd.lb, dfd.lc, dfd.kZ, dfd.kX, dfd.ld, dfd.kT, dfd.kY, dfd.kV, dfd.kS, dfd.kR, dfd.kW, dfd.la, dfd.le, dfd.kQ, dfd.kU)
   );
   public static final dpl<dpf> y = a(
      "bed", dpl.b.a(dpf::new, dfd.bn, dfd.bo, dfd.bk, dfd.bl, dfd.bi, dfd.bg, dfd.bm, dfd.bc, dfd.bh, dfd.be, dfd.bb, dfd.ba, dfd.bf, dfd.bj, dfd.aZ, dfd.bd)
   );
   public static final dpl<dpv> z = a("conduit", dpl.b.a(dpv::new, dfd.mX));
   public static final dpl<dpc> A = a("barrel", dpl.b.a(dpc::new, dfd.nU));
   public static final dpl<dqw> B = a("smoker", dpl.b.a(dqw::new, dfd.nV));
   public static final dpl<dpi> C = a("blast_furnace", dpl.b.a(dpi::new, dfd.nW));
   public static final dpl<dql> D = a("lectern", dpl.b.a(dql::new, dfd.oa));
   public static final dpl<dph> E = a("bell", dpl.b.a(dph::new, dfd.od));
   public static final dpl<dqj> F = a("jigsaw", dpl.b.a(dqj::new, dfd.pb));
   public static final dpl<dpp> G = a("campfire", dpl.b.a(dpp::new, dfd.og, dfd.oh));
   public static final dpl<dpg> H = a("beehive", dpl.b.a(dpg::new, dfd.pe, dfd.pf));
   public static final dpl<dqq> I = a("sculk_sensor", dpl.b.a(dqq::new, dfd.qQ));
   public static final dpl<dpo> J = a("calibrated_sculk_sensor", dpl.b.a(dpo::new, dfd.qR));
   public static final dpl<dqp> K = a("sculk_catalyst", dpl.b.a(dqp::new, dfd.qU));
   public static final dpl<dqr> L = a("sculk_shrieker", dpl.b.a(dqr::new, dfd.qV));
   public static final dpl<dps> M = a("chiseled_bookshelf", dpl.b.a(dps::new, dfd.cm));
   public static final dpl<dpn> N = a("brushable_block", dpl.b.a(dpn::new, dfd.J, dfd.M));
   public static final dpl<dpz> O = a("decorated_pot", dpl.b.a(dpz::new, dfd.tp));
   public static final dpl<dpx> P = a("crafter", dpl.b.a(dpx::new, dfd.tq));
   public static final dpl<drd> Q = a("trial_spawner", dpl.b.a(drd::new, dfd.tr));
   public static final dpl<drm> R = a("vault", dpl.b.a(drm::new, dfd.ts));
   private final dpl.a<? extends T> T;
   private final Set<dfb> U;
   private final Type<?> V;
   private final ji.c<dpl<?>> W = lp.k.f(this);

   @Nullable
   public static alf a(dpl<?> $$0) {
      return lp.k.b($$0);
   }

   private static <T extends dpj> dpl<T> a(String $$0, dpl.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgx.s, $$0);
      return jv.a(lp.k, $$0, $$1.a($$2));
   }

   public dpl(dpl.a<? extends T> $$0, Set<dfb> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(iz $$0, dse $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dse $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public ji.c<dpl<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dbg $$0, iz $$1) {
      dpj $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpj> {
      T create(iz var1, dse var2);
   }

   public static final class b<T extends dpj> {
      private final dpl.a<? extends T> a;
      final Set<dfb> b;

      private b(dpl.a<? extends T> $$0, Set<dfb> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpj> dpl.b<T> a(dpl.a<? extends T> $$0, dfb... $$1) {
         return new dpl.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dpl<T> a(Type<?> $$0) {
         return new dpl<>(this.a, this.b, $$0);
      }
   }
}
