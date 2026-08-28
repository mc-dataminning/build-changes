import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bui {
   private static final Map<bsw<?>, bui.a> a = Maps.newHashMap();

   private static <T extends btn> void a(bsw<T> $$0, bug $$1, dyv.a $$2, bui.b<T> $$3) {
      bui.a $$4 = a.put($$0, new bui.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lt.f.b($$0));
      }
   }

   public static bug a(bsw<?> $$0) {
      bui.a $$1 = a.get($$0);
      return $$1 == null ? buh.a : $$1.b;
   }

   public static boolean a(bsw<?> $$0, dcx $$1, jd $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dyv.a b(@Nullable bsw<?> $$0) {
      bui.a $$1 = a.get($$0);
      return $$1 == null ? dyv.a.f : $$1.a;
   }

   public static <T extends bsq> boolean a(bsw<T> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      bui.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsw.f, buh.b, dyv.a.f, cgo::a);
      a(bsw.u, buh.b, dyv.a.f, cge::c);
      a(bsw.y, buh.b, dyv.a.f, cge::c);
      a(bsw.B, buh.b, dyv.a.f, cjp::a);
      a(bsw.Y, buh.b, dyv.a.f, cjx::b);
      a(bsw.aF, buh.b, dyv.a.f, cge::c);
      a(bsw.aI, buh.b, dyv.a.f, cge::c);
      a(bsw.aX, buh.b, dyv.a.f, cge::c);
      a(bsw.bg, buh.b, dyv.a.f, cgc::b);
      a(bsw.c, buh.d, dyv.a.f, cgl::c);
      a(bsw.g, buh.d, dyv.a.f, cex::b);
      a(bsw.i, buh.d, dyv.a.f, ckb::c);
      a(bsw.l, buh.d, dyv.a.f, ckb::b);
      a(bsw.q, buh.d, dyv.a.f, ckb::b);
      a(bsw.t, buh.d, dyv.a.f, cfc::b);
      a(bsw.w, buh.d, dyv.a.f, cfc::b);
      a(bsw.x, buh.d, dyv.a.f, ckb::b);
      a(bsw.z, buh.d, dyv.a.f, cfc::b);
      a(bsw.H, buh.d, dyv.a.f, ckb::b);
      a(bsw.I, buh.d, dyv.a.f, cjs::b);
      a(bsw.F, buh.d, dyv.a.f, btn::a);
      a(bsw.R, buh.d, dyv.a.f, cgw::c);
      a(bsw.T, buh.d, dyv.a.f, cjv::b);
      a(bsw.U, buh.d, dyv.a.f, ckb::b);
      a(bsw.W, buh.b, dyv.a.f, btd::a);
      a(bsw.X, buh.d, dyv.a.f, chc::c);
      a(bsw.ab, buh.d, dyv.a.f, cfc::b);
      a(bsw.ac, buh.d, dyv.a.f, cjy::a);
      a(bsw.af, buh.d, dyv.a.f, btn::a);
      a(bsw.an, buh.d, dyv.a.f, cfc::b);
      a(bsw.ap, buh.d, dyv.a.f, cka::b);
      a(bsw.as, buh.d, dyv.a.f, cfp::c);
      a(bsw.at, buh.d, dyv.a.f, cfc::b);
      a(bsw.au, buh.d, dyv.a.e, cfq::c);
      a(bsw.ax, buh.d, dyv.a.e, cfs::c);
      a(bsw.az, buh.d, dyv.a.f, cfc::b);
      a(bsw.Z, buh.d, dyv.a.f, clf::c);
      a(bsw.aA, buh.d, dyv.a.f, cll::b);
      a(bsw.aC, buh.d, dyv.a.f, ckc::b);
      a(bsw.aD, buh.d, dyv.a.f, cfu::c);
      a(bsw.aG, buh.d, dyv.a.f, cfw::c);
      a(bsw.aJ, buh.d, dyv.a.f, cfc::b);
      a(bsw.aM, buh.d, dyv.a.f, cki::b);
      a(bsw.aN, buh.d, dyv.a.f, ckb::b);
      a(bsw.aO, buh.d, dyv.a.f, chm::c);
      a(bsw.aP, buh.d, dyv.a.f, ckk::c);
      a(bsw.aS, buh.d, dyv.a.f, btn::a);
      a(bsw.aW, buh.d, dyv.a.f, ckb::b);
      a(bsw.aY, buh.d, dyv.a.f, ckn::a);
      a(bsw.aZ, buh.c, dyv.a.f, cko::c);
      a(bsw.bh, buh.d, dyv.a.f, cgd::c);
      a(bsw.bj, buh.d, dyv.a.f, btn::a);
      a(bsw.bo, buh.d, dyv.a.f, ckb::b);
      a(bsw.bp, buh.d, dyv.a.f, ckb::b);
      a(bsw.bq, buh.d, dyv.a.f, ckb::b);
      a(bsw.bs, buh.d, dyv.a.f, cgf::c);
      a(bsw.bu, buh.d, dyv.a.f, ckb::b);
      a(bsw.bv, buh.d, dyv.a.f, chq::c);
      a(bsw.bx, buh.d, dyv.a.f, ckw::b);
      a(bsw.bw, buh.d, dyv.a.f, ckb::b);
      a(bsw.p, buh.d, dyv.a.f, cfc::b);
      a(bsw.D, buh.b, dyv.a.f, cjx::b);
      a(bsw.J, buh.a, dyv.a.f, ckb::b);
      a(bsw.Q, buh.a, dyv.a.f, cfm::c);
      a(bsw.ad, buh.a, dyv.a.f, ckb::b);
      a(bsw.aw, buh.a, dyv.a.f, cfc::b);
      a(bsw.ay, buh.a, dyv.a.f, btn::a);
      a(bsw.aH, buh.d, dyv.a.f, ckb::b);
      a(bsw.aK, buh.a, dyv.a.f, btn::a);
      a(bsw.be, buh.a, dyv.a.f, cfc::b);
      a(bsw.bi, buh.a, dyv.a.f, ckb::b);
      a(bsw.bk, buh.a, dyv.a.f, ckb::b);
      a(bsw.bl, buh.d, dyv.a.f, btn::a);
      a(bsw.bm, buh.a, dyv.a.f, btn::a);
   }

   static record a(dyv.a a, bug b, bui.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsq> {
      boolean test(bsw<T> var1, ddj var2, btp var3, jd var4, ayv var5);
   }
}
