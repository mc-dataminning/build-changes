import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class buj {
   private static final Map<bsy<?>, buj.a> a = Maps.newHashMap();

   private static <T extends btp> void a(bsy<T> $$0, buh $$1, dxs.a $$2, buj.b<T> $$3) {
      buj.a $$4 = a.put($$0, new buj.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lp.g.b($$0));
      }
   }

   public static buh a(bsy<?> $$0) {
      buj.a $$1 = a.get($$0);
      return $$1 == null ? bui.a : $$1.b;
   }

   public static boolean a(bsy<?> $$0, dbz $$1, iz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxs.a b(@Nullable bsy<?> $$0) {
      buj.a $$1 = a.get($$0);
      return $$1 == null ? dxs.a.f : $$1.a;
   }

   public static <T extends bss> boolean a(bsy<T> $$0, dcl $$1, btr $$2, iz $$3, azf $$4) {
      buj.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsy.f, bui.b, dxs.a.f, cgp::a);
      a(bsy.u, bui.b, dxs.a.f, cgf::c);
      a(bsy.y, bui.b, dxs.a.f, cgf::c);
      a(bsy.B, bui.b, dxs.a.f, cjp::a);
      a(bsy.Y, bui.b, dxs.a.f, cjx::b);
      a(bsy.aF, bui.b, dxs.a.f, cgf::c);
      a(bsy.aI, bui.b, dxs.a.f, cgf::c);
      a(bsy.aX, bui.b, dxs.a.f, cgf::c);
      a(bsy.bg, bui.b, dxs.a.f, cgd::b);
      a(bsy.c, bui.d, dxs.a.f, cgm::c);
      a(bsy.g, bui.d, dxs.a.f, cey::b);
      a(bsy.i, bui.d, dxs.a.f, ckb::c);
      a(bsy.l, bui.d, dxs.a.f, ckb::b);
      a(bsy.q, bui.d, dxs.a.f, ckb::b);
      a(bsy.t, bui.d, dxs.a.f, cfd::b);
      a(bsy.w, bui.d, dxs.a.f, cfd::b);
      a(bsy.x, bui.d, dxs.a.f, ckb::b);
      a(bsy.z, bui.d, dxs.a.f, cfd::b);
      a(bsy.H, bui.d, dxs.a.f, ckb::b);
      a(bsy.I, bui.d, dxs.a.f, cjs::b);
      a(bsy.F, bui.d, dxs.a.f, btp::a);
      a(bsy.R, bui.d, dxs.a.f, cgx::c);
      a(bsy.T, bui.d, dxs.a.f, cjv::b);
      a(bsy.U, bui.d, dxs.a.f, ckb::b);
      a(bsy.W, bui.b, dxs.a.f, btf::a);
      a(bsy.X, bui.d, dxs.a.f, chd::c);
      a(bsy.ab, bui.d, dxs.a.f, cfd::b);
      a(bsy.ac, bui.d, dxs.a.f, cjy::a);
      a(bsy.af, bui.d, dxs.a.f, btp::a);
      a(bsy.an, bui.d, dxs.a.f, cfd::b);
      a(bsy.ap, bui.d, dxs.a.f, cka::b);
      a(bsy.as, bui.d, dxs.a.f, cfq::c);
      a(bsy.at, bui.d, dxs.a.f, cfd::b);
      a(bsy.au, bui.d, dxs.a.e, cfr::c);
      a(bsy.ax, bui.d, dxs.a.e, cft::c);
      a(bsy.az, bui.d, dxs.a.f, cfd::b);
      a(bsy.Z, bui.d, dxs.a.f, clf::c);
      a(bsy.aA, bui.d, dxs.a.f, cll::b);
      a(bsy.aC, bui.d, dxs.a.f, ckc::b);
      a(bsy.aD, bui.d, dxs.a.f, cfv::c);
      a(bsy.aG, bui.d, dxs.a.f, cfx::c);
      a(bsy.aJ, bui.d, dxs.a.f, cfd::b);
      a(bsy.aM, bui.d, dxs.a.f, cki::b);
      a(bsy.aN, bui.d, dxs.a.f, ckb::b);
      a(bsy.aO, bui.d, dxs.a.f, chn::c);
      a(bsy.aP, bui.d, dxs.a.f, ckk::c);
      a(bsy.aS, bui.d, dxs.a.f, btp::a);
      a(bsy.aW, bui.d, dxs.a.f, ckb::b);
      a(bsy.aY, bui.d, dxs.a.f, ckn::a);
      a(bsy.aZ, bui.c, dxs.a.f, cko::c);
      a(bsy.bh, bui.d, dxs.a.f, cge::c);
      a(bsy.bj, bui.d, dxs.a.f, btp::a);
      a(bsy.bo, bui.d, dxs.a.f, ckb::b);
      a(bsy.bp, bui.d, dxs.a.f, ckb::b);
      a(bsy.bq, bui.d, dxs.a.f, ckb::b);
      a(bsy.bs, bui.d, dxs.a.f, cgg::c);
      a(bsy.bu, bui.d, dxs.a.f, ckb::b);
      a(bsy.bv, bui.d, dxs.a.f, chr::c);
      a(bsy.bx, bui.d, dxs.a.f, ckw::b);
      a(bsy.bw, bui.d, dxs.a.f, ckb::b);
      a(bsy.p, bui.d, dxs.a.f, cfd::b);
      a(bsy.D, bui.b, dxs.a.f, cjx::b);
      a(bsy.J, bui.a, dxs.a.f, ckb::b);
      a(bsy.Q, bui.a, dxs.a.f, cfn::c);
      a(bsy.ad, bui.a, dxs.a.f, ckb::b);
      a(bsy.aw, bui.a, dxs.a.f, cfd::b);
      a(bsy.ay, bui.a, dxs.a.f, btp::a);
      a(bsy.aH, bui.d, dxs.a.f, ckb::b);
      a(bsy.aK, bui.a, dxs.a.f, btp::a);
      a(bsy.be, bui.a, dxs.a.f, cfd::b);
      a(bsy.bi, bui.a, dxs.a.f, ckb::b);
      a(bsy.bk, bui.a, dxs.a.f, ckb::b);
      a(bsy.bl, bui.d, dxs.a.f, btp::a);
      a(bsy.bm, bui.a, dxs.a.f, btp::a);
   }

   static record a(dxs.a a, buh b, buj.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bss> {
      boolean test(bsy<T> var1, dcl var2, btr var3, iz var4, azf var5);
   }
}
