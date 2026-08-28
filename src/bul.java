import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bul {
   private static final Map<bta<?>, bul.a> a = Maps.newHashMap();

   private static <T extends btr> void a(bta<T> $$0, buj $$1, dxu.a $$2, bul.b<T> $$3) {
      bul.a $$4 = a.put($$0, new bul.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lp.g.b($$0));
      }
   }

   public static buj a(bta<?> $$0) {
      bul.a $$1 = a.get($$0);
      return $$1 == null ? buk.a : $$1.b;
   }

   public static boolean a(bta<?> $$0, dcb $$1, iz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxu.a b(@Nullable bta<?> $$0) {
      bul.a $$1 = a.get($$0);
      return $$1 == null ? dxu.a.f : $$1.a;
   }

   public static <T extends bsu> boolean a(bta<T> $$0, dcn $$1, btt $$2, iz $$3, azh $$4) {
      bul.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bta.f, buk.b, dxu.a.f, cgr::a);
      a(bta.u, buk.b, dxu.a.f, cgh::c);
      a(bta.y, buk.b, dxu.a.f, cgh::c);
      a(bta.B, buk.b, dxu.a.f, cjr::a);
      a(bta.Y, buk.b, dxu.a.f, cjz::b);
      a(bta.aF, buk.b, dxu.a.f, cgh::c);
      a(bta.aI, buk.b, dxu.a.f, cgh::c);
      a(bta.aX, buk.b, dxu.a.f, cgh::c);
      a(bta.bg, buk.b, dxu.a.f, cgf::b);
      a(bta.c, buk.d, dxu.a.f, cgo::c);
      a(bta.g, buk.d, dxu.a.f, cfa::b);
      a(bta.i, buk.d, dxu.a.f, ckd::c);
      a(bta.l, buk.d, dxu.a.f, ckd::b);
      a(bta.q, buk.d, dxu.a.f, ckd::b);
      a(bta.t, buk.d, dxu.a.f, cff::b);
      a(bta.w, buk.d, dxu.a.f, cff::b);
      a(bta.x, buk.d, dxu.a.f, ckd::b);
      a(bta.z, buk.d, dxu.a.f, cff::b);
      a(bta.H, buk.d, dxu.a.f, ckd::b);
      a(bta.I, buk.d, dxu.a.f, cju::b);
      a(bta.F, buk.d, dxu.a.f, btr::a);
      a(bta.R, buk.d, dxu.a.f, cgz::c);
      a(bta.T, buk.d, dxu.a.f, cjx::b);
      a(bta.U, buk.d, dxu.a.f, ckd::b);
      a(bta.W, buk.b, dxu.a.f, bth::a);
      a(bta.X, buk.d, dxu.a.f, chf::c);
      a(bta.ab, buk.d, dxu.a.f, cff::b);
      a(bta.ac, buk.d, dxu.a.f, cka::a);
      a(bta.af, buk.d, dxu.a.f, btr::a);
      a(bta.an, buk.d, dxu.a.f, cff::b);
      a(bta.ap, buk.d, dxu.a.f, ckc::b);
      a(bta.as, buk.d, dxu.a.f, cfs::c);
      a(bta.at, buk.d, dxu.a.f, cff::b);
      a(bta.au, buk.d, dxu.a.e, cft::c);
      a(bta.ax, buk.d, dxu.a.e, cfv::c);
      a(bta.az, buk.d, dxu.a.f, cff::b);
      a(bta.Z, buk.d, dxu.a.f, clh::c);
      a(bta.aA, buk.d, dxu.a.f, cln::b);
      a(bta.aC, buk.d, dxu.a.f, cke::b);
      a(bta.aD, buk.d, dxu.a.f, cfx::c);
      a(bta.aG, buk.d, dxu.a.f, cfz::c);
      a(bta.aJ, buk.d, dxu.a.f, cff::b);
      a(bta.aM, buk.d, dxu.a.f, ckk::b);
      a(bta.aN, buk.d, dxu.a.f, ckd::b);
      a(bta.aO, buk.d, dxu.a.f, chp::c);
      a(bta.aP, buk.d, dxu.a.f, ckm::c);
      a(bta.aS, buk.d, dxu.a.f, btr::a);
      a(bta.aW, buk.d, dxu.a.f, ckd::b);
      a(bta.aY, buk.d, dxu.a.f, ckp::a);
      a(bta.aZ, buk.c, dxu.a.f, ckq::c);
      a(bta.bh, buk.d, dxu.a.f, cgg::c);
      a(bta.bj, buk.d, dxu.a.f, btr::a);
      a(bta.bo, buk.d, dxu.a.f, ckd::b);
      a(bta.bp, buk.d, dxu.a.f, ckd::b);
      a(bta.bq, buk.d, dxu.a.f, ckd::b);
      a(bta.bs, buk.d, dxu.a.f, cgi::c);
      a(bta.bu, buk.d, dxu.a.f, ckd::b);
      a(bta.bv, buk.d, dxu.a.f, cht::c);
      a(bta.bx, buk.d, dxu.a.f, cky::b);
      a(bta.bw, buk.d, dxu.a.f, ckd::b);
      a(bta.p, buk.d, dxu.a.f, cff::b);
      a(bta.D, buk.b, dxu.a.f, cjz::b);
      a(bta.J, buk.a, dxu.a.f, ckd::b);
      a(bta.Q, buk.a, dxu.a.f, cfp::c);
      a(bta.ad, buk.a, dxu.a.f, ckd::b);
      a(bta.aw, buk.a, dxu.a.f, cff::b);
      a(bta.ay, buk.a, dxu.a.f, btr::a);
      a(bta.aH, buk.d, dxu.a.f, ckd::b);
      a(bta.aK, buk.a, dxu.a.f, btr::a);
      a(bta.be, buk.a, dxu.a.f, cff::b);
      a(bta.bi, buk.a, dxu.a.f, ckd::b);
      a(bta.bk, buk.a, dxu.a.f, ckd::b);
      a(bta.bl, buk.d, dxu.a.f, btr::a);
      a(bta.bm, buk.a, dxu.a.f, btr::a);
   }

   static record a(dxu.a a, buj b, bul.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsu> {
      boolean test(bta<T> var1, dcn var2, btt var3, iz var4, azh var5);
   }
}
