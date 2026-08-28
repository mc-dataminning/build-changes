import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bty {
   private static final Map<bsn<?>, bty.a> a = Maps.newHashMap();

   private static <T extends bte> void a(bsn<T> $$0, btw $$1, dyg.a $$2, bty.b<T> $$3) {
      bty.a $$4 = a.put($$0, new bty.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lq.f.b($$0));
      }
   }

   public static btw a(bsn<?> $$0) {
      bty.a $$1 = a.get($$0);
      return $$1 == null ? btx.a : $$1.b;
   }

   public static boolean a(bsn<?> $$0, dcj $$1, ja $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dyg.a b(@Nullable bsn<?> $$0) {
      bty.a $$1 = a.get($$0);
      return $$1 == null ? dyg.a.f : $$1.a;
   }

   public static <T extends bsh> boolean a(bsn<T> $$0, dcv $$1, btg $$2, ja $$3, ayo $$4) {
      bty.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsn.f, btx.b, dyg.a.f, cge::a);
      a(bsn.u, btx.b, dyg.a.f, cfu::c);
      a(bsn.y, btx.b, dyg.a.f, cfu::c);
      a(bsn.B, btx.b, dyg.a.f, cjf::a);
      a(bsn.Y, btx.b, dyg.a.f, cjn::b);
      a(bsn.aF, btx.b, dyg.a.f, cfu::c);
      a(bsn.aI, btx.b, dyg.a.f, cfu::c);
      a(bsn.aX, btx.b, dyg.a.f, cfu::c);
      a(bsn.bg, btx.b, dyg.a.f, cfs::b);
      a(bsn.c, btx.d, dyg.a.f, cgb::c);
      a(bsn.g, btx.d, dyg.a.f, cen::b);
      a(bsn.i, btx.d, dyg.a.f, cjr::c);
      a(bsn.l, btx.d, dyg.a.f, cjr::b);
      a(bsn.q, btx.d, dyg.a.f, cjr::b);
      a(bsn.t, btx.d, dyg.a.f, ces::b);
      a(bsn.w, btx.d, dyg.a.f, ces::b);
      a(bsn.x, btx.d, dyg.a.f, cjr::b);
      a(bsn.z, btx.d, dyg.a.f, ces::b);
      a(bsn.H, btx.d, dyg.a.f, cjr::b);
      a(bsn.I, btx.d, dyg.a.f, cji::b);
      a(bsn.F, btx.d, dyg.a.f, bte::a);
      a(bsn.R, btx.d, dyg.a.f, cgm::c);
      a(bsn.T, btx.d, dyg.a.f, cjl::b);
      a(bsn.U, btx.d, dyg.a.f, cjr::b);
      a(bsn.W, btx.b, dyg.a.f, bsu::a);
      a(bsn.X, btx.d, dyg.a.f, cgs::c);
      a(bsn.ab, btx.d, dyg.a.f, ces::b);
      a(bsn.ac, btx.d, dyg.a.f, cjo::a);
      a(bsn.af, btx.d, dyg.a.f, bte::a);
      a(bsn.an, btx.d, dyg.a.f, ces::b);
      a(bsn.ap, btx.d, dyg.a.f, cjq::b);
      a(bsn.as, btx.d, dyg.a.f, cff::c);
      a(bsn.at, btx.d, dyg.a.f, ces::b);
      a(bsn.au, btx.d, dyg.a.e, cfg::c);
      a(bsn.ax, btx.d, dyg.a.e, cfi::c);
      a(bsn.az, btx.d, dyg.a.f, ces::b);
      a(bsn.Z, btx.d, dyg.a.f, ckv::c);
      a(bsn.aA, btx.d, dyg.a.f, clb::b);
      a(bsn.aC, btx.d, dyg.a.f, cjs::b);
      a(bsn.aD, btx.d, dyg.a.f, cfk::c);
      a(bsn.aG, btx.d, dyg.a.f, cfm::c);
      a(bsn.aJ, btx.d, dyg.a.f, ces::b);
      a(bsn.aM, btx.d, dyg.a.f, cjy::b);
      a(bsn.aN, btx.d, dyg.a.f, cjr::b);
      a(bsn.aO, btx.d, dyg.a.f, chc::c);
      a(bsn.aP, btx.d, dyg.a.f, cka::c);
      a(bsn.aS, btx.d, dyg.a.f, bte::a);
      a(bsn.aW, btx.d, dyg.a.f, cjr::b);
      a(bsn.aY, btx.d, dyg.a.f, ckd::a);
      a(bsn.aZ, btx.c, dyg.a.f, cke::c);
      a(bsn.bh, btx.d, dyg.a.f, cft::c);
      a(bsn.bj, btx.d, dyg.a.f, bte::a);
      a(bsn.bo, btx.d, dyg.a.f, cjr::b);
      a(bsn.bp, btx.d, dyg.a.f, cjr::b);
      a(bsn.bq, btx.d, dyg.a.f, cjr::b);
      a(bsn.bs, btx.d, dyg.a.f, cfv::c);
      a(bsn.bu, btx.d, dyg.a.f, cjr::b);
      a(bsn.bv, btx.d, dyg.a.f, chg::c);
      a(bsn.bx, btx.d, dyg.a.f, ckm::b);
      a(bsn.bw, btx.d, dyg.a.f, cjr::b);
      a(bsn.p, btx.d, dyg.a.f, ces::b);
      a(bsn.D, btx.b, dyg.a.f, cjn::b);
      a(bsn.J, btx.a, dyg.a.f, cjr::b);
      a(bsn.Q, btx.a, dyg.a.f, cfc::c);
      a(bsn.ad, btx.a, dyg.a.f, cjr::b);
      a(bsn.aw, btx.a, dyg.a.f, ces::b);
      a(bsn.ay, btx.a, dyg.a.f, bte::a);
      a(bsn.aH, btx.d, dyg.a.f, cjr::b);
      a(bsn.aK, btx.a, dyg.a.f, bte::a);
      a(bsn.be, btx.a, dyg.a.f, ces::b);
      a(bsn.bi, btx.a, dyg.a.f, cjr::b);
      a(bsn.bk, btx.a, dyg.a.f, cjr::b);
      a(bsn.bl, btx.d, dyg.a.f, bte::a);
      a(bsn.bm, btx.a, dyg.a.f, bte::a);
   }

   static record a(dyg.a a, btw b, bty.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsh> {
      boolean test(bsn<T> var1, dcv var2, btg var3, ja var4, ayo var5);
   }
}
