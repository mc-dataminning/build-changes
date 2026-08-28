import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bvw {
   private static final Map<bul<?>, bvw.a> a = Maps.newHashMap();

   private static <T extends bvc> void a(bul<T> $$0, bvu $$1, ebf.a $$2, bvw.b<T> $$3) {
      bvw.a $$4 = a.put($$0, new bvw.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ly.f.b($$0));
      }
   }

   public static bvu a(bul<?> $$0) {
      bvw.a $$1 = a.get($$0);
      return $$1 == null ? bvv.a : $$1.b;
   }

   public static boolean a(bul<?> $$0, dfe $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ebf.a b(@Nullable bul<?> $$0) {
      bvw.a $$1 = a.get($$0);
      return $$1 == null ? ebf.a.f : $$1.a;
   }

   public static <T extends bue> boolean a(bul<T> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      bvw.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bul.f, bvv.b, ebf.a.f, cid::a);
      a(bul.u, bvv.b, ebf.a.f, cht::c);
      a(bul.y, bvv.b, ebf.a.f, cgq::b);
      a(bul.B, bvv.b, ebf.a.f, clf::a);
      a(bul.Y, bvv.b, ebf.a.f, cln::b);
      a(bul.aF, bvv.b, ebf.a.f, cht::c);
      a(bul.aI, bvv.b, ebf.a.f, cht::c);
      a(bul.aX, bvv.b, ebf.a.f, cgq::b);
      a(bul.bg, bvv.b, ebf.a.f, chr::b);
      a(bul.c, bvv.d, ebf.a.f, cia::c);
      a(bul.g, bvv.d, ebf.a.f, cgl::b);
      a(bul.i, bvv.d, ebf.a.f, clr::c);
      a(bul.l, bvv.d, ebf.a.f, clr::b);
      a(bul.m, bvv.d, ebf.a.f, clr::c);
      a(bul.q, bvv.d, ebf.a.f, clr::b);
      a(bul.t, bvv.d, ebf.a.f, cgr::b);
      a(bul.w, bvv.d, ebf.a.f, cgr::b);
      a(bul.x, bvv.d, ebf.a.f, clr::b);
      a(bul.z, bvv.d, ebf.a.f, cgr::b);
      a(bul.H, bvv.d, ebf.a.f, clr::b);
      a(bul.I, bvv.d, ebf.a.f, cli::b);
      a(bul.F, bvv.d, ebf.a.f, bvc::a);
      a(bul.R, bvv.d, ebf.a.f, cil::c);
      a(bul.T, bvv.d, ebf.a.f, cll::b);
      a(bul.U, bvv.d, ebf.a.f, clr::b);
      a(bul.W, bvv.b, ebf.a.f, bus::a);
      a(bul.X, bvv.d, ebf.a.f, cir::c);
      a(bul.ab, bvv.d, ebf.a.f, cgr::b);
      a(bul.ac, bvv.d, ebf.a.f, clo::a);
      a(bul.af, bvv.d, ebf.a.f, bvc::a);
      a(bul.an, bvv.d, ebf.a.f, cgr::b);
      a(bul.ap, bvv.d, ebf.a.f, clq::b);
      a(bul.as, bvv.d, ebf.a.f, che::c);
      a(bul.at, bvv.d, ebf.a.f, cgr::b);
      a(bul.au, bvv.d, ebf.a.e, chf::c);
      a(bul.ax, bvv.d, ebf.a.e, chh::c);
      a(bul.az, bvv.d, ebf.a.f, cgr::b);
      a(bul.Z, bvv.d, ebf.a.f, cmv::c);
      a(bul.aA, bvv.d, ebf.a.f, cnb::b);
      a(bul.aC, bvv.d, ebf.a.f, cls::b);
      a(bul.aD, bvv.d, ebf.a.f, chj::c);
      a(bul.aG, bvv.d, ebf.a.f, chl::c);
      a(bul.aJ, bvv.d, ebf.a.f, cgr::b);
      a(bul.aM, bvv.d, ebf.a.f, cly::b);
      a(bul.aN, bvv.d, ebf.a.f, clr::b);
      a(bul.aO, bvv.d, ebf.a.f, cjb::c);
      a(bul.aP, bvv.d, ebf.a.f, cma::c);
      a(bul.aS, bvv.d, ebf.a.f, bvc::a);
      a(bul.aW, bvv.d, ebf.a.f, clr::b);
      a(bul.aY, bvv.d, ebf.a.f, cmd::a);
      a(bul.aZ, bvv.c, ebf.a.f, cme::c);
      a(bul.bh, bvv.d, ebf.a.f, chs::c);
      a(bul.bj, bvv.d, ebf.a.f, bvc::a);
      a(bul.bo, bvv.d, ebf.a.f, clr::b);
      a(bul.bp, bvv.d, ebf.a.f, clr::b);
      a(bul.bq, bvv.d, ebf.a.f, clr::b);
      a(bul.bs, bvv.d, ebf.a.f, chu::c);
      a(bul.bt, bvv.d, ebf.a.f, clr::c);
      a(bul.bu, bvv.d, ebf.a.f, clr::b);
      a(bul.bv, bvv.d, ebf.a.f, cjf::c);
      a(bul.bx, bvv.d, ebf.a.f, cmm::b);
      a(bul.bw, bvv.d, ebf.a.f, clr::b);
      a(bul.p, bvv.d, ebf.a.f, cgr::b);
      a(bul.D, bvv.b, ebf.a.f, cln::b);
      a(bul.J, bvv.a, ebf.a.f, clr::b);
      a(bul.Q, bvv.a, ebf.a.f, chb::c);
      a(bul.ad, bvv.a, ebf.a.f, clr::b);
      a(bul.aw, bvv.a, ebf.a.f, cgr::b);
      a(bul.ay, bvv.a, ebf.a.f, bvc::a);
      a(bul.aH, bvv.d, ebf.a.f, clr::b);
      a(bul.aK, bvv.a, ebf.a.f, bvc::a);
      a(bul.be, bvv.a, ebf.a.f, cgr::b);
      a(bul.bi, bvv.a, ebf.a.f, clr::b);
      a(bul.bk, bvv.a, ebf.a.f, clr::b);
      a(bul.bl, bvv.d, ebf.a.f, bvc::a);
      a(bul.bm, bvv.a, ebf.a.f, clr::b);
   }

   static record a(ebf.a a, bvu b, bvw.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bue> {
      boolean test(bul<T> var1, dfr var2, buk var3, jh var4, azs var5);
   }
}
