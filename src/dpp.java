import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpp<T extends dpn> {
   private static final Logger S = LogUtils.getLogger();
   public static final dpp<dqj> a = a("furnace", dpp.b.a(dqj::new, dfh.cD));
   public static final dpp<dpu> b = a("chest", dpp.b.a(dpu::new, dfh.cv));
   public static final dpp<drg> c = a("trapped_chest", dpp.b.a(drg::new, dfh.gV));
   public static final dpp<dqi> d = a("ender_chest", dpp.b.a(dqi::new, dfh.fG));
   public static final dpp<dqo> e = a("jukebox", dpp.b.a(dqo::new, dfh.dT));
   public static final dpp<dqf> f = a("dispenser", dpp.b.a(dqf::new, dfh.aU));
   public static final dpp<dqg> g = a("dropper", dpp.b.a(dqg::new, dfh.hi));
   public static final dpp<dqx> h = a(
      "sign",
      dpp.b.a(
         dqx::new,
         dfh.cE,
         dfh.cF,
         dfh.cG,
         dfh.cH,
         dfh.cI,
         dfh.cJ,
         dfh.cK,
         dfh.cR,
         dfh.cS,
         dfh.cT,
         dfh.cU,
         dfh.cV,
         dfh.cW,
         dfh.cX,
         dfh.oW,
         dfh.oY,
         dfh.oX,
         dfh.oZ,
         dfh.cL,
         dfh.cY,
         dfh.cM,
         dfh.cZ
      )
   );
   public static final dpp<dqk> i = a(
      "hanging_sign",
      dpp.b.a(
         dqk::new,
         dfh.da,
         dfh.db,
         dfh.dc,
         dfh.dd,
         dfh.de,
         dfh.df,
         dfh.dg,
         dfh.dh,
         dfh.di,
         dfh.dj,
         dfh.dk,
         dfh.dl,
         dfh.dm,
         dfh.dn,
         dfh.do,
         dfh.dp,
         dfh.dq,
         dfh.dr,
         dfh.dt,
         dfh.du,
         dfh.ds,
         dfh.dv
      )
   );
   public static final dpp<drb> j = a("mob_spawner", dpp.b.a(drb::new, dfh.ct));
   public static final dpp<dsd> k = a("piston", dpp.b.a(dsd::new, dfh.bQ));
   public static final dpp<dpq> l = a("brewing_stand", dpp.b.a(dpq::new, dfh.fs));
   public static final dpp<dqh> m = a("enchanting_table", dpp.b.a(dqh::new, dfh.fr));
   public static final dpp<dre> n = a("end_portal", dpp.b.a(dre::new, dfh.fx));
   public static final dpp<dpi> o = a("beacon", dpp.b.a(dpi::new, dfh.fO));
   public static final dpp<dqz> p = a(
      "skull", dpp.b.a(dqz::new, dfh.gE, dfh.gF, dfh.gM, dfh.gN, dfh.gO, dfh.gP, dfh.gI, dfh.gJ, dfh.gG, dfh.gH, dfh.gK, dfh.gL, dfh.gQ, dfh.gR)
   );
   public static final dpp<dqc> q = a("daylight_detector", dpp.b.a(dqc::new, dfh.gZ));
   public static final dpp<dqm> r = a("hopper", dpp.b.a(dqm::new, dfh.hc));
   public static final dpp<dpy> s = a("comparator", dpp.b.a(dpy::new, dfh.gY));
   public static final dpp<dpc> t = a(
      "banner",
      dpp.b.a(
         dpc::new,
         dfh.iJ,
         dfh.iK,
         dfh.iL,
         dfh.iM,
         dfh.iN,
         dfh.iO,
         dfh.iP,
         dfh.iQ,
         dfh.iR,
         dfh.iS,
         dfh.iT,
         dfh.iU,
         dfh.iV,
         dfh.iW,
         dfh.iX,
         dfh.iY,
         dfh.iZ,
         dfh.ja,
         dfh.jb,
         dfh.jc,
         dfh.jd,
         dfh.je,
         dfh.jf,
         dfh.jg,
         dfh.jh,
         dfh.ji,
         dfh.jj,
         dfh.jk,
         dfh.jl,
         dfh.jm,
         dfh.jn,
         dfh.jo
      )
   );
   public static final dpp<drc> u = a("structure_block", dpp.b.a(drc::new, dfh.pa));
   public static final dpp<drd> v = a("end_gateway", dpp.b.a(drd::new, dfh.kF));
   public static final dpp<dpx> w = a("command_block", dpp.b.a(dpx::new, dfh.fN, dfh.kH, dfh.kG));
   public static final dpp<dqw> x = a(
      "shulker_box",
      dpp.b.a(dqw::new, dfh.kP, dfh.lf, dfh.lb, dfh.lc, dfh.kZ, dfh.kX, dfh.ld, dfh.kT, dfh.kY, dfh.kV, dfh.kS, dfh.kR, dfh.kW, dfh.la, dfh.le, dfh.kQ, dfh.kU)
   );
   public static final dpp<dpj> y = a(
      "bed", dpp.b.a(dpj::new, dfh.bn, dfh.bo, dfh.bk, dfh.bl, dfh.bi, dfh.bg, dfh.bm, dfh.bc, dfh.bh, dfh.be, dfh.bb, dfh.ba, dfh.bf, dfh.bj, dfh.aZ, dfh.bd)
   );
   public static final dpp<dpz> z = a("conduit", dpp.b.a(dpz::new, dfh.mX));
   public static final dpp<dpg> A = a("barrel", dpp.b.a(dpg::new, dfh.nU));
   public static final dpp<dra> B = a("smoker", dpp.b.a(dra::new, dfh.nV));
   public static final dpp<dpm> C = a("blast_furnace", dpp.b.a(dpm::new, dfh.nW));
   public static final dpp<dqp> D = a("lectern", dpp.b.a(dqp::new, dfh.oa));
   public static final dpp<dpl> E = a("bell", dpp.b.a(dpl::new, dfh.od));
   public static final dpp<dqn> F = a("jigsaw", dpp.b.a(dqn::new, dfh.pb));
   public static final dpp<dpt> G = a("campfire", dpp.b.a(dpt::new, dfh.og, dfh.oh));
   public static final dpp<dpk> H = a("beehive", dpp.b.a(dpk::new, dfh.pe, dfh.pf));
   public static final dpp<dqu> I = a("sculk_sensor", dpp.b.a(dqu::new, dfh.qQ));
   public static final dpp<dps> J = a("calibrated_sculk_sensor", dpp.b.a(dps::new, dfh.qR));
   public static final dpp<dqt> K = a("sculk_catalyst", dpp.b.a(dqt::new, dfh.qU));
   public static final dpp<dqv> L = a("sculk_shrieker", dpp.b.a(dqv::new, dfh.qV));
   public static final dpp<dpw> M = a("chiseled_bookshelf", dpp.b.a(dpw::new, dfh.cm));
   public static final dpp<dpr> N = a("brushable_block", dpp.b.a(dpr::new, dfh.J, dfh.M));
   public static final dpp<dqd> O = a("decorated_pot", dpp.b.a(dqd::new, dfh.tp));
   public static final dpp<dqb> P = a("crafter", dpp.b.a(dqb::new, dfh.tq));
   public static final dpp<drh> Q = a("trial_spawner", dpp.b.a(drh::new, dfh.tr));
   public static final dpp<drp> R = a("vault", dpp.b.a(drp::new, dfh.ts));
   private final dpp.a<? extends T> T;
   private final Set<dff> U;
   private final Type<?> V;
   private final jj.c<dpp<?>> W = lq.j.f(this);

   @Nullable
   public static akk a(dpp<?> $$0) {
      return lq.j.b($$0);
   }

   private static <T extends dpn> dpp<T> a(String $$0, dpp.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bgd.s, $$0);
      return jw.a(lq.j, $$0, $$1.a($$2));
   }

   public dpp(dpp.a<? extends T> $$0, Set<dff> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(ja $$0, dsh $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dsh $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public jj.c<dpp<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dbj $$0, ja $$1) {
      dpn $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dpn> {
      T create(ja var1, dsh var2);
   }

   public static final class b<T extends dpn> {
      private final dpp.a<? extends T> a;
      final Set<dff> b;

      private b(dpp.a<? extends T> $$0, Set<dff> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dpn> dpp.b<T> a(dpp.a<? extends T> $$0, dff... $$1) {
         return new dpp.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dpp<T> a(Type<?> $$0) {
         return new dpp<>(this.a, this.b, $$0);
      }
   }
}
