import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bvr {
   private static final Map<bug<?>, bvr.a> a = Maps.newHashMap();

   private static <T extends bux> void a(bug<T> $$0, bvp $$1, eaz.a $$2, bvr.b<T> $$3) {
      bvr.a $$4 = a.put($$0, new bvr.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lx.f.b($$0));
      }
   }

   public static bvp a(bug<?> $$0) {
      bvr.a $$1 = a.get($$0);
      return $$1 == null ? bvq.a : $$1.b;
   }

   public static boolean a(bug<?> $$0, dey $$1, jg $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static eaz.a b(@Nullable bug<?> $$0) {
      bvr.a $$1 = a.get($$0);
      return $$1 == null ? eaz.a.f : $$1.a;
   }

   public static <T extends btz> boolean a(bug<T> $$0, dfl $$1, buf $$2, jg $$3, azr $$4) {
      bvr.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bug.f, bvq.b, eaz.a.f, chy::a);
      a(bug.u, bvq.b, eaz.a.f, cho::c);
      a(bug.y, bvq.b, eaz.a.f, cgl::b);
      a(bug.B, bvq.b, eaz.a.f, cla::a);
      a(bug.Y, bvq.b, eaz.a.f, cli::b);
      a(bug.aF, bvq.b, eaz.a.f, cho::c);
      a(bug.aI, bvq.b, eaz.a.f, cho::c);
      a(bug.aX, bvq.b, eaz.a.f, cgl::b);
      a(bug.bg, bvq.b, eaz.a.f, chm::b);
      a(bug.c, bvq.d, eaz.a.f, chv::c);
      a(bug.g, bvq.d, eaz.a.f, cgg::b);
      a(bug.i, bvq.d, eaz.a.f, clm::c);
      a(bug.l, bvq.d, eaz.a.f, clm::b);
      a(bug.m, bvq.d, eaz.a.f, clm::c);
      a(bug.q, bvq.d, eaz.a.f, clm::b);
      a(bug.t, bvq.d, eaz.a.f, cgm::b);
      a(bug.w, bvq.d, eaz.a.f, cgm::b);
      a(bug.x, bvq.d, eaz.a.f, clm::b);
      a(bug.z, bvq.d, eaz.a.f, cgm::b);
      a(bug.H, bvq.d, eaz.a.f, clm::b);
      a(bug.I, bvq.d, eaz.a.f, cld::b);
      a(bug.F, bvq.d, eaz.a.f, bux::a);
      a(bug.R, bvq.d, eaz.a.f, cig::c);
      a(bug.T, bvq.d, eaz.a.f, clg::b);
      a(bug.U, bvq.d, eaz.a.f, clm::b);
      a(bug.W, bvq.b, eaz.a.f, bun::a);
      a(bug.X, bvq.d, eaz.a.f, cim::c);
      a(bug.ab, bvq.d, eaz.a.f, cgm::b);
      a(bug.ac, bvq.d, eaz.a.f, clj::a);
      a(bug.af, bvq.d, eaz.a.f, bux::a);
      a(bug.an, bvq.d, eaz.a.f, cgm::b);
      a(bug.ap, bvq.d, eaz.a.f, cll::b);
      a(bug.as, bvq.d, eaz.a.f, cgz::c);
      a(bug.at, bvq.d, eaz.a.f, cgm::b);
      a(bug.au, bvq.d, eaz.a.e, cha::c);
      a(bug.ax, bvq.d, eaz.a.e, chc::c);
      a(bug.az, bvq.d, eaz.a.f, cgm::b);
      a(bug.Z, bvq.d, eaz.a.f, cmq::c);
      a(bug.aA, bvq.d, eaz.a.f, cmw::b);
      a(bug.aC, bvq.d, eaz.a.f, cln::b);
      a(bug.aD, bvq.d, eaz.a.f, che::c);
      a(bug.aG, bvq.d, eaz.a.f, chg::c);
      a(bug.aJ, bvq.d, eaz.a.f, cgm::b);
      a(bug.aM, bvq.d, eaz.a.f, clt::b);
      a(bug.aN, bvq.d, eaz.a.f, clm::b);
      a(bug.aO, bvq.d, eaz.a.f, ciw::c);
      a(bug.aP, bvq.d, eaz.a.f, clv::c);
      a(bug.aS, bvq.d, eaz.a.f, bux::a);
      a(bug.aW, bvq.d, eaz.a.f, clm::b);
      a(bug.aY, bvq.d, eaz.a.f, cly::a);
      a(bug.aZ, bvq.c, eaz.a.f, clz::c);
      a(bug.bh, bvq.d, eaz.a.f, chn::c);
      a(bug.bj, bvq.d, eaz.a.f, bux::a);
      a(bug.bo, bvq.d, eaz.a.f, clm::b);
      a(bug.bp, bvq.d, eaz.a.f, clm::b);
      a(bug.bq, bvq.d, eaz.a.f, clm::b);
      a(bug.bs, bvq.d, eaz.a.f, chp::c);
      a(bug.bt, bvq.d, eaz.a.f, clm::c);
      a(bug.bu, bvq.d, eaz.a.f, clm::b);
      a(bug.bv, bvq.d, eaz.a.f, cja::c);
      a(bug.bx, bvq.d, eaz.a.f, cmh::b);
      a(bug.bw, bvq.d, eaz.a.f, clm::b);
      a(bug.p, bvq.d, eaz.a.f, cgm::b);
      a(bug.D, bvq.b, eaz.a.f, cli::b);
      a(bug.J, bvq.a, eaz.a.f, clm::b);
      a(bug.Q, bvq.a, eaz.a.f, cgw::c);
      a(bug.ad, bvq.a, eaz.a.f, clm::b);
      a(bug.aw, bvq.a, eaz.a.f, cgm::b);
      a(bug.ay, bvq.a, eaz.a.f, bux::a);
      a(bug.aH, bvq.d, eaz.a.f, clm::b);
      a(bug.aK, bvq.a, eaz.a.f, bux::a);
      a(bug.be, bvq.a, eaz.a.f, cgm::b);
      a(bug.bi, bvq.a, eaz.a.f, clm::b);
      a(bug.bk, bvq.a, eaz.a.f, clm::b);
      a(bug.bl, bvq.d, eaz.a.f, bux::a);
      a(bug.bm, bvq.a, eaz.a.f, clm::b);
   }

   static record a(eaz.a a, bvp b, bvr.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends btz> {
      boolean test(bug<T> var1, dfl var2, buf var3, jg var4, azr var5);
   }
}
