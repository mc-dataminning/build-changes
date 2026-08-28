import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class btu {
   private static final Map<bsj<?>, btu.a> a = Maps.newHashMap();

   private static <T extends bta> void a(bsj<T> $$0, bts $$1, dxz.a $$2, btu.b<T> $$3) {
      btu.a $$4 = a.put($$0, new btu.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lq.f.b($$0));
      }
   }

   public static bts a(bsj<?> $$0) {
      btu.a $$1 = a.get($$0);
      return $$1 == null ? btt.a : $$1.b;
   }

   public static boolean a(bsj<?> $$0, dcg $$1, ja $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxz.a b(@Nullable bsj<?> $$0) {
      btu.a $$1 = a.get($$0);
      return $$1 == null ? dxz.a.f : $$1.a;
   }

   public static <T extends bsd> boolean a(bsj<T> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      btu.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsj.f, btt.b, dxz.a.f, cga::a);
      a(bsj.u, btt.b, dxz.a.f, cfq::c);
      a(bsj.y, btt.b, dxz.a.f, cfq::c);
      a(bsj.B, btt.b, dxz.a.f, cjb::a);
      a(bsj.Y, btt.b, dxz.a.f, cjj::b);
      a(bsj.aF, btt.b, dxz.a.f, cfq::c);
      a(bsj.aI, btt.b, dxz.a.f, cfq::c);
      a(bsj.aX, btt.b, dxz.a.f, cfq::c);
      a(bsj.bg, btt.b, dxz.a.f, cfo::b);
      a(bsj.c, btt.d, dxz.a.f, cfx::c);
      a(bsj.g, btt.d, dxz.a.f, cej::b);
      a(bsj.i, btt.d, dxz.a.f, cjn::c);
      a(bsj.l, btt.d, dxz.a.f, cjn::b);
      a(bsj.q, btt.d, dxz.a.f, cjn::b);
      a(bsj.t, btt.d, dxz.a.f, ceo::b);
      a(bsj.w, btt.d, dxz.a.f, ceo::b);
      a(bsj.x, btt.d, dxz.a.f, cjn::b);
      a(bsj.z, btt.d, dxz.a.f, ceo::b);
      a(bsj.H, btt.d, dxz.a.f, cjn::b);
      a(bsj.I, btt.d, dxz.a.f, cje::b);
      a(bsj.F, btt.d, dxz.a.f, bta::a);
      a(bsj.R, btt.d, dxz.a.f, cgi::c);
      a(bsj.T, btt.d, dxz.a.f, cjh::b);
      a(bsj.U, btt.d, dxz.a.f, cjn::b);
      a(bsj.W, btt.b, dxz.a.f, bsq::a);
      a(bsj.X, btt.d, dxz.a.f, cgo::c);
      a(bsj.ab, btt.d, dxz.a.f, ceo::b);
      a(bsj.ac, btt.d, dxz.a.f, cjk::a);
      a(bsj.af, btt.d, dxz.a.f, bta::a);
      a(bsj.an, btt.d, dxz.a.f, ceo::b);
      a(bsj.ap, btt.d, dxz.a.f, cjm::b);
      a(bsj.as, btt.d, dxz.a.f, cfb::c);
      a(bsj.at, btt.d, dxz.a.f, ceo::b);
      a(bsj.au, btt.d, dxz.a.e, cfc::c);
      a(bsj.ax, btt.d, dxz.a.e, cfe::c);
      a(bsj.az, btt.d, dxz.a.f, ceo::b);
      a(bsj.Z, btt.d, dxz.a.f, ckr::c);
      a(bsj.aA, btt.d, dxz.a.f, ckx::b);
      a(bsj.aC, btt.d, dxz.a.f, cjo::b);
      a(bsj.aD, btt.d, dxz.a.f, cfg::c);
      a(bsj.aG, btt.d, dxz.a.f, cfi::c);
      a(bsj.aJ, btt.d, dxz.a.f, ceo::b);
      a(bsj.aM, btt.d, dxz.a.f, cju::b);
      a(bsj.aN, btt.d, dxz.a.f, cjn::b);
      a(bsj.aO, btt.d, dxz.a.f, cgy::c);
      a(bsj.aP, btt.d, dxz.a.f, cjw::c);
      a(bsj.aS, btt.d, dxz.a.f, bta::a);
      a(bsj.aW, btt.d, dxz.a.f, cjn::b);
      a(bsj.aY, btt.d, dxz.a.f, cjz::a);
      a(bsj.aZ, btt.c, dxz.a.f, cka::c);
      a(bsj.bh, btt.d, dxz.a.f, cfp::c);
      a(bsj.bj, btt.d, dxz.a.f, bta::a);
      a(bsj.bo, btt.d, dxz.a.f, cjn::b);
      a(bsj.bp, btt.d, dxz.a.f, cjn::b);
      a(bsj.bq, btt.d, dxz.a.f, cjn::b);
      a(bsj.bs, btt.d, dxz.a.f, cfr::c);
      a(bsj.bu, btt.d, dxz.a.f, cjn::b);
      a(bsj.bv, btt.d, dxz.a.f, chc::c);
      a(bsj.bx, btt.d, dxz.a.f, cki::b);
      a(bsj.bw, btt.d, dxz.a.f, cjn::b);
      a(bsj.p, btt.d, dxz.a.f, ceo::b);
      a(bsj.D, btt.b, dxz.a.f, cjj::b);
      a(bsj.J, btt.a, dxz.a.f, cjn::b);
      a(bsj.Q, btt.a, dxz.a.f, cey::c);
      a(bsj.ad, btt.a, dxz.a.f, cjn::b);
      a(bsj.aw, btt.a, dxz.a.f, ceo::b);
      a(bsj.ay, btt.a, dxz.a.f, bta::a);
      a(bsj.aH, btt.d, dxz.a.f, cjn::b);
      a(bsj.aK, btt.a, dxz.a.f, bta::a);
      a(bsj.be, btt.a, dxz.a.f, ceo::b);
      a(bsj.bi, btt.a, dxz.a.f, cjn::b);
      a(bsj.bk, btt.a, dxz.a.f, cjn::b);
      a(bsj.bl, btt.d, dxz.a.f, bta::a);
      a(bsj.bm, btt.a, dxz.a.f, bta::a);
   }

   static record a(dxz.a a, bts b, btu.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsd> {
      boolean test(bsj<T> var1, dcs var2, btc var3, ja var4, aym var5);
   }
}
