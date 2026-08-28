import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class buk {
   private static final Map<bsx<?>, buk.a> a = Maps.newHashMap();

   private static <T extends btp> void a(bsx<T> $$0, bui $$1, dyy.a $$2, buk.b<T> $$3) {
      buk.a $$4 = a.put($$0, new buk.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lt.f.b($$0));
      }
   }

   public static bui a(bsx<?> $$0) {
      buk.a $$1 = a.get($$0);
      return $$1 == null ? buj.a : $$1.b;
   }

   public static boolean a(bsx<?> $$0, dcz $$1, jd $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dyy.a b(@Nullable bsx<?> $$0) {
      buk.a $$1 = a.get($$0);
      return $$1 == null ? dyy.a.f : $$1.a;
   }

   public static <T extends bsr> boolean a(bsx<T> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      buk.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsx.f, buj.b, dyy.a.f, cgq::a);
      a(bsx.u, buj.b, dyy.a.f, cgg::c);
      a(bsx.y, buj.b, dyy.a.f, cgg::c);
      a(bsx.B, buj.b, dyy.a.f, cjr::a);
      a(bsx.Y, buj.b, dyy.a.f, cjz::b);
      a(bsx.aF, buj.b, dyy.a.f, cgg::c);
      a(bsx.aI, buj.b, dyy.a.f, cgg::c);
      a(bsx.aX, buj.b, dyy.a.f, cgg::c);
      a(bsx.bg, buj.b, dyy.a.f, cge::b);
      a(bsx.c, buj.d, dyy.a.f, cgn::c);
      a(bsx.g, buj.d, dyy.a.f, cez::b);
      a(bsx.i, buj.d, dyy.a.f, ckd::c);
      a(bsx.l, buj.d, dyy.a.f, ckd::b);
      a(bsx.q, buj.d, dyy.a.f, ckd::b);
      a(bsx.t, buj.d, dyy.a.f, cfe::b);
      a(bsx.w, buj.d, dyy.a.f, cfe::b);
      a(bsx.x, buj.d, dyy.a.f, ckd::b);
      a(bsx.z, buj.d, dyy.a.f, cfe::b);
      a(bsx.H, buj.d, dyy.a.f, ckd::b);
      a(bsx.I, buj.d, dyy.a.f, cju::b);
      a(bsx.F, buj.d, dyy.a.f, btp::a);
      a(bsx.R, buj.d, dyy.a.f, cgy::c);
      a(bsx.T, buj.d, dyy.a.f, cjx::b);
      a(bsx.U, buj.d, dyy.a.f, ckd::b);
      a(bsx.W, buj.b, dyy.a.f, bte::a);
      a(bsx.X, buj.d, dyy.a.f, che::c);
      a(bsx.ab, buj.d, dyy.a.f, cfe::b);
      a(bsx.ac, buj.d, dyy.a.f, cka::a);
      a(bsx.af, buj.d, dyy.a.f, btp::a);
      a(bsx.an, buj.d, dyy.a.f, cfe::b);
      a(bsx.ap, buj.d, dyy.a.f, ckc::b);
      a(bsx.as, buj.d, dyy.a.f, cfr::c);
      a(bsx.at, buj.d, dyy.a.f, cfe::b);
      a(bsx.au, buj.d, dyy.a.e, cfs::c);
      a(bsx.ax, buj.d, dyy.a.e, cfu::c);
      a(bsx.az, buj.d, dyy.a.f, cfe::b);
      a(bsx.Z, buj.d, dyy.a.f, clh::c);
      a(bsx.aA, buj.d, dyy.a.f, cln::b);
      a(bsx.aC, buj.d, dyy.a.f, cke::b);
      a(bsx.aD, buj.d, dyy.a.f, cfw::c);
      a(bsx.aG, buj.d, dyy.a.f, cfy::c);
      a(bsx.aJ, buj.d, dyy.a.f, cfe::b);
      a(bsx.aM, buj.d, dyy.a.f, ckk::b);
      a(bsx.aN, buj.d, dyy.a.f, ckd::b);
      a(bsx.aO, buj.d, dyy.a.f, cho::c);
      a(bsx.aP, buj.d, dyy.a.f, ckm::c);
      a(bsx.aS, buj.d, dyy.a.f, btp::a);
      a(bsx.aW, buj.d, dyy.a.f, ckd::b);
      a(bsx.aY, buj.d, dyy.a.f, ckp::a);
      a(bsx.aZ, buj.c, dyy.a.f, ckq::c);
      a(bsx.bh, buj.d, dyy.a.f, cgf::c);
      a(bsx.bj, buj.d, dyy.a.f, btp::a);
      a(bsx.bo, buj.d, dyy.a.f, ckd::b);
      a(bsx.bp, buj.d, dyy.a.f, ckd::b);
      a(bsx.bq, buj.d, dyy.a.f, ckd::b);
      a(bsx.bs, buj.d, dyy.a.f, cgh::c);
      a(bsx.bu, buj.d, dyy.a.f, ckd::b);
      a(bsx.bv, buj.d, dyy.a.f, chs::c);
      a(bsx.bx, buj.d, dyy.a.f, cky::b);
      a(bsx.bw, buj.d, dyy.a.f, ckd::b);
      a(bsx.p, buj.d, dyy.a.f, cfe::b);
      a(bsx.D, buj.b, dyy.a.f, cjz::b);
      a(bsx.J, buj.a, dyy.a.f, ckd::b);
      a(bsx.Q, buj.a, dyy.a.f, cfo::c);
      a(bsx.ad, buj.a, dyy.a.f, ckd::b);
      a(bsx.aw, buj.a, dyy.a.f, cfe::b);
      a(bsx.ay, buj.a, dyy.a.f, btp::a);
      a(bsx.aH, buj.d, dyy.a.f, ckd::b);
      a(bsx.aK, buj.a, dyy.a.f, btp::a);
      a(bsx.be, buj.a, dyy.a.f, cfe::b);
      a(bsx.bi, buj.a, dyy.a.f, ckd::b);
      a(bsx.bk, buj.a, dyy.a.f, ckd::b);
      a(bsx.bl, buj.d, dyy.a.f, btp::a);
      a(bsx.bm, buj.a, dyy.a.f, btp::a);
   }

   static record a(dyy.a a, bui b, buk.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsr> {
      boolean test(bsx<T> var1, ddl var2, btr var3, jd var4, ayw var5);
   }
}
