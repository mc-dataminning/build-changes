import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class buk {
   private static final Map<bsz<?>, buk.a> a = Maps.newHashMap();

   private static <T extends btq> void a(bsz<T> $$0, bui $$1, dxt.a $$2, buk.b<T> $$3) {
      buk.a $$4 = a.put($$0, new buk.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lp.g.b($$0));
      }
   }

   public static bui a(bsz<?> $$0) {
      buk.a $$1 = a.get($$0);
      return $$1 == null ? buj.a : $$1.b;
   }

   public static boolean a(bsz<?> $$0, dca $$1, iz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxt.a b(@Nullable bsz<?> $$0) {
      buk.a $$1 = a.get($$0);
      return $$1 == null ? dxt.a.f : $$1.a;
   }

   public static <T extends bst> boolean a(bsz<T> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      buk.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsz.f, buj.b, dxt.a.f, cgq::a);
      a(bsz.u, buj.b, dxt.a.f, cgg::c);
      a(bsz.y, buj.b, dxt.a.f, cgg::c);
      a(bsz.B, buj.b, dxt.a.f, cjq::a);
      a(bsz.Y, buj.b, dxt.a.f, cjy::b);
      a(bsz.aF, buj.b, dxt.a.f, cgg::c);
      a(bsz.aI, buj.b, dxt.a.f, cgg::c);
      a(bsz.aX, buj.b, dxt.a.f, cgg::c);
      a(bsz.bg, buj.b, dxt.a.f, cge::b);
      a(bsz.c, buj.d, dxt.a.f, cgn::c);
      a(bsz.g, buj.d, dxt.a.f, cez::b);
      a(bsz.i, buj.d, dxt.a.f, ckc::c);
      a(bsz.l, buj.d, dxt.a.f, ckc::b);
      a(bsz.q, buj.d, dxt.a.f, ckc::b);
      a(bsz.t, buj.d, dxt.a.f, cfe::b);
      a(bsz.w, buj.d, dxt.a.f, cfe::b);
      a(bsz.x, buj.d, dxt.a.f, ckc::b);
      a(bsz.z, buj.d, dxt.a.f, cfe::b);
      a(bsz.H, buj.d, dxt.a.f, ckc::b);
      a(bsz.I, buj.d, dxt.a.f, cjt::b);
      a(bsz.F, buj.d, dxt.a.f, btq::a);
      a(bsz.R, buj.d, dxt.a.f, cgy::c);
      a(bsz.T, buj.d, dxt.a.f, cjw::b);
      a(bsz.U, buj.d, dxt.a.f, ckc::b);
      a(bsz.W, buj.b, dxt.a.f, btg::a);
      a(bsz.X, buj.d, dxt.a.f, che::c);
      a(bsz.ab, buj.d, dxt.a.f, cfe::b);
      a(bsz.ac, buj.d, dxt.a.f, cjz::a);
      a(bsz.af, buj.d, dxt.a.f, btq::a);
      a(bsz.an, buj.d, dxt.a.f, cfe::b);
      a(bsz.ap, buj.d, dxt.a.f, ckb::b);
      a(bsz.as, buj.d, dxt.a.f, cfr::c);
      a(bsz.at, buj.d, dxt.a.f, cfe::b);
      a(bsz.au, buj.d, dxt.a.e, cfs::c);
      a(bsz.ax, buj.d, dxt.a.e, cfu::c);
      a(bsz.az, buj.d, dxt.a.f, cfe::b);
      a(bsz.Z, buj.d, dxt.a.f, clg::c);
      a(bsz.aA, buj.d, dxt.a.f, clm::b);
      a(bsz.aC, buj.d, dxt.a.f, ckd::b);
      a(bsz.aD, buj.d, dxt.a.f, cfw::c);
      a(bsz.aG, buj.d, dxt.a.f, cfy::c);
      a(bsz.aJ, buj.d, dxt.a.f, cfe::b);
      a(bsz.aM, buj.d, dxt.a.f, ckj::b);
      a(bsz.aN, buj.d, dxt.a.f, ckc::b);
      a(bsz.aO, buj.d, dxt.a.f, cho::c);
      a(bsz.aP, buj.d, dxt.a.f, ckl::c);
      a(bsz.aS, buj.d, dxt.a.f, btq::a);
      a(bsz.aW, buj.d, dxt.a.f, ckc::b);
      a(bsz.aY, buj.d, dxt.a.f, cko::a);
      a(bsz.aZ, buj.c, dxt.a.f, ckp::c);
      a(bsz.bh, buj.d, dxt.a.f, cgf::c);
      a(bsz.bj, buj.d, dxt.a.f, btq::a);
      a(bsz.bo, buj.d, dxt.a.f, ckc::b);
      a(bsz.bp, buj.d, dxt.a.f, ckc::b);
      a(bsz.bq, buj.d, dxt.a.f, ckc::b);
      a(bsz.bs, buj.d, dxt.a.f, cgh::c);
      a(bsz.bu, buj.d, dxt.a.f, ckc::b);
      a(bsz.bv, buj.d, dxt.a.f, chs::c);
      a(bsz.bx, buj.d, dxt.a.f, ckx::b);
      a(bsz.bw, buj.d, dxt.a.f, ckc::b);
      a(bsz.p, buj.d, dxt.a.f, cfe::b);
      a(bsz.D, buj.b, dxt.a.f, cjy::b);
      a(bsz.J, buj.a, dxt.a.f, ckc::b);
      a(bsz.Q, buj.a, dxt.a.f, cfo::c);
      a(bsz.ad, buj.a, dxt.a.f, ckc::b);
      a(bsz.aw, buj.a, dxt.a.f, cfe::b);
      a(bsz.ay, buj.a, dxt.a.f, btq::a);
      a(bsz.aH, buj.d, dxt.a.f, ckc::b);
      a(bsz.aK, buj.a, dxt.a.f, btq::a);
      a(bsz.be, buj.a, dxt.a.f, cfe::b);
      a(bsz.bi, buj.a, dxt.a.f, ckc::b);
      a(bsz.bk, buj.a, dxt.a.f, ckc::b);
      a(bsz.bl, buj.d, dxt.a.f, btq::a);
      a(bsz.bm, buj.a, dxt.a.f, btq::a);
   }

   static record a(dxt.a a, bui b, buk.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bst> {
      boolean test(bsz<T> var1, dcm var2, bts var3, iz var4, azg var5);
   }
}
