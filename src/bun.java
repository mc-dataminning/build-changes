import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bun {
   private static final Map<btc<?>, bun.a> a = Maps.newHashMap();

   private static <T extends btt> void a(btc<T> $$0, bul $$1, dxw.a $$2, bun.b<T> $$3) {
      bun.a $$4 = a.put($$0, new bun.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lp.g.b($$0));
      }
   }

   public static bul a(btc<?> $$0) {
      bun.a $$1 = a.get($$0);
      return $$1 == null ? bum.a : $$1.b;
   }

   public static boolean a(btc<?> $$0, dcd $$1, iz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxw.a b(@Nullable btc<?> $$0) {
      bun.a $$1 = a.get($$0);
      return $$1 == null ? dxw.a.f : $$1.a;
   }

   public static <T extends bsw> boolean a(btc<T> $$0, dcp $$1, btv $$2, iz $$3, azh $$4) {
      bun.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(btc.f, bum.b, dxw.a.f, cgt::a);
      a(btc.u, bum.b, dxw.a.f, cgj::c);
      a(btc.y, bum.b, dxw.a.f, cgj::c);
      a(btc.B, bum.b, dxw.a.f, cjt::a);
      a(btc.Y, bum.b, dxw.a.f, ckb::b);
      a(btc.aF, bum.b, dxw.a.f, cgj::c);
      a(btc.aI, bum.b, dxw.a.f, cgj::c);
      a(btc.aX, bum.b, dxw.a.f, cgj::c);
      a(btc.bg, bum.b, dxw.a.f, cgh::b);
      a(btc.c, bum.d, dxw.a.f, cgq::c);
      a(btc.g, bum.d, dxw.a.f, cfc::b);
      a(btc.i, bum.d, dxw.a.f, ckf::c);
      a(btc.l, bum.d, dxw.a.f, ckf::b);
      a(btc.q, bum.d, dxw.a.f, ckf::b);
      a(btc.t, bum.d, dxw.a.f, cfh::b);
      a(btc.w, bum.d, dxw.a.f, cfh::b);
      a(btc.x, bum.d, dxw.a.f, ckf::b);
      a(btc.z, bum.d, dxw.a.f, cfh::b);
      a(btc.H, bum.d, dxw.a.f, ckf::b);
      a(btc.I, bum.d, dxw.a.f, cjw::b);
      a(btc.F, bum.d, dxw.a.f, btt::a);
      a(btc.R, bum.d, dxw.a.f, chb::c);
      a(btc.T, bum.d, dxw.a.f, cjz::b);
      a(btc.U, bum.d, dxw.a.f, ckf::b);
      a(btc.W, bum.b, dxw.a.f, btj::a);
      a(btc.X, bum.d, dxw.a.f, chh::c);
      a(btc.ab, bum.d, dxw.a.f, cfh::b);
      a(btc.ac, bum.d, dxw.a.f, ckc::a);
      a(btc.af, bum.d, dxw.a.f, btt::a);
      a(btc.an, bum.d, dxw.a.f, cfh::b);
      a(btc.ap, bum.d, dxw.a.f, cke::b);
      a(btc.as, bum.d, dxw.a.f, cfu::c);
      a(btc.at, bum.d, dxw.a.f, cfh::b);
      a(btc.au, bum.d, dxw.a.e, cfv::c);
      a(btc.ax, bum.d, dxw.a.e, cfx::c);
      a(btc.az, bum.d, dxw.a.f, cfh::b);
      a(btc.Z, bum.d, dxw.a.f, clj::c);
      a(btc.aA, bum.d, dxw.a.f, clp::b);
      a(btc.aC, bum.d, dxw.a.f, ckg::b);
      a(btc.aD, bum.d, dxw.a.f, cfz::c);
      a(btc.aG, bum.d, dxw.a.f, cgb::c);
      a(btc.aJ, bum.d, dxw.a.f, cfh::b);
      a(btc.aM, bum.d, dxw.a.f, ckm::b);
      a(btc.aN, bum.d, dxw.a.f, ckf::b);
      a(btc.aO, bum.d, dxw.a.f, chr::c);
      a(btc.aP, bum.d, dxw.a.f, cko::c);
      a(btc.aS, bum.d, dxw.a.f, btt::a);
      a(btc.aW, bum.d, dxw.a.f, ckf::b);
      a(btc.aY, bum.d, dxw.a.f, ckr::a);
      a(btc.aZ, bum.c, dxw.a.f, cks::c);
      a(btc.bh, bum.d, dxw.a.f, cgi::c);
      a(btc.bj, bum.d, dxw.a.f, btt::a);
      a(btc.bo, bum.d, dxw.a.f, ckf::b);
      a(btc.bp, bum.d, dxw.a.f, ckf::b);
      a(btc.bq, bum.d, dxw.a.f, ckf::b);
      a(btc.bs, bum.d, dxw.a.f, cgk::c);
      a(btc.bu, bum.d, dxw.a.f, ckf::b);
      a(btc.bv, bum.d, dxw.a.f, chv::c);
      a(btc.bx, bum.d, dxw.a.f, cla::b);
      a(btc.bw, bum.d, dxw.a.f, ckf::b);
      a(btc.p, bum.d, dxw.a.f, cfh::b);
      a(btc.D, bum.b, dxw.a.f, ckb::b);
      a(btc.J, bum.a, dxw.a.f, ckf::b);
      a(btc.Q, bum.a, dxw.a.f, cfr::c);
      a(btc.ad, bum.a, dxw.a.f, ckf::b);
      a(btc.aw, bum.a, dxw.a.f, cfh::b);
      a(btc.ay, bum.a, dxw.a.f, btt::a);
      a(btc.aH, bum.d, dxw.a.f, ckf::b);
      a(btc.aK, bum.a, dxw.a.f, btt::a);
      a(btc.be, bum.a, dxw.a.f, cfh::b);
      a(btc.bi, bum.a, dxw.a.f, ckf::b);
      a(btc.bk, bum.a, dxw.a.f, ckf::b);
      a(btc.bl, bum.d, dxw.a.f, btt::a);
      a(btc.bm, bum.a, dxw.a.f, btt::a);
   }

   static record a(dxw.a a, bul b, bun.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsw> {
      boolean test(btc<T> var1, dcp var2, btv var3, iz var4, azh var5);
   }
}
