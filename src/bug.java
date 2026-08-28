import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bug {
   private static final Map<bsv<?>, bug.a> a = Maps.newHashMap();

   private static <T extends btm> void a(bsv<T> $$0, bue $$1, dxp.a $$2, bug.b<T> $$3) {
      bug.a $$4 = a.put($$0, new bug.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lp.g.b($$0));
      }
   }

   public static bue a(bsv<?> $$0) {
      bug.a $$1 = a.get($$0);
      return $$1 == null ? buf.a : $$1.b;
   }

   public static boolean a(bsv<?> $$0, dbw $$1, iz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxp.a b(@Nullable bsv<?> $$0) {
      bug.a $$1 = a.get($$0);
      return $$1 == null ? dxp.a.f : $$1.a;
   }

   public static <T extends bsp> boolean a(bsv<T> $$0, dci $$1, bto $$2, iz $$3, azc $$4) {
      bug.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsv.f, buf.b, dxp.a.f, cgm::a);
      a(bsv.u, buf.b, dxp.a.f, cgc::c);
      a(bsv.y, buf.b, dxp.a.f, cgc::c);
      a(bsv.B, buf.b, dxp.a.f, cjm::a);
      a(bsv.Y, buf.b, dxp.a.f, cju::b);
      a(bsv.aF, buf.b, dxp.a.f, cgc::c);
      a(bsv.aI, buf.b, dxp.a.f, cgc::c);
      a(bsv.aX, buf.b, dxp.a.f, cgc::c);
      a(bsv.bg, buf.b, dxp.a.f, cga::b);
      a(bsv.c, buf.d, dxp.a.f, cgj::c);
      a(bsv.g, buf.d, dxp.a.f, cev::b);
      a(bsv.i, buf.d, dxp.a.f, cjy::c);
      a(bsv.l, buf.d, dxp.a.f, cjy::b);
      a(bsv.q, buf.d, dxp.a.f, cjy::b);
      a(bsv.t, buf.d, dxp.a.f, cfa::b);
      a(bsv.w, buf.d, dxp.a.f, cfa::b);
      a(bsv.x, buf.d, dxp.a.f, cjy::b);
      a(bsv.z, buf.d, dxp.a.f, cfa::b);
      a(bsv.H, buf.d, dxp.a.f, cjy::b);
      a(bsv.I, buf.d, dxp.a.f, cjp::b);
      a(bsv.F, buf.d, dxp.a.f, btm::a);
      a(bsv.R, buf.d, dxp.a.f, cgu::c);
      a(bsv.T, buf.d, dxp.a.f, cjs::b);
      a(bsv.U, buf.d, dxp.a.f, cjy::b);
      a(bsv.W, buf.b, dxp.a.f, btc::a);
      a(bsv.X, buf.d, dxp.a.f, cha::c);
      a(bsv.ab, buf.d, dxp.a.f, cfa::b);
      a(bsv.ac, buf.d, dxp.a.f, cjv::a);
      a(bsv.af, buf.d, dxp.a.f, btm::a);
      a(bsv.an, buf.d, dxp.a.f, cfa::b);
      a(bsv.ap, buf.d, dxp.a.f, cjx::b);
      a(bsv.as, buf.d, dxp.a.f, cfn::c);
      a(bsv.at, buf.d, dxp.a.f, cfa::b);
      a(bsv.au, buf.d, dxp.a.e, cfo::c);
      a(bsv.ax, buf.d, dxp.a.e, cfq::c);
      a(bsv.az, buf.d, dxp.a.f, cfa::b);
      a(bsv.Z, buf.d, dxp.a.f, clc::c);
      a(bsv.aA, buf.d, dxp.a.f, cli::b);
      a(bsv.aC, buf.d, dxp.a.f, cjz::b);
      a(bsv.aD, buf.d, dxp.a.f, cfs::c);
      a(bsv.aG, buf.d, dxp.a.f, cfu::c);
      a(bsv.aJ, buf.d, dxp.a.f, cfa::b);
      a(bsv.aM, buf.d, dxp.a.f, ckf::b);
      a(bsv.aN, buf.d, dxp.a.f, cjy::b);
      a(bsv.aO, buf.d, dxp.a.f, chk::c);
      a(bsv.aP, buf.d, dxp.a.f, ckh::c);
      a(bsv.aS, buf.d, dxp.a.f, btm::a);
      a(bsv.aW, buf.d, dxp.a.f, cjy::b);
      a(bsv.aY, buf.d, dxp.a.f, ckk::a);
      a(bsv.aZ, buf.c, dxp.a.f, ckl::c);
      a(bsv.bh, buf.d, dxp.a.f, cgb::c);
      a(bsv.bj, buf.d, dxp.a.f, btm::a);
      a(bsv.bo, buf.d, dxp.a.f, cjy::b);
      a(bsv.bp, buf.d, dxp.a.f, cjy::b);
      a(bsv.bq, buf.d, dxp.a.f, cjy::b);
      a(bsv.bs, buf.d, dxp.a.f, cgd::c);
      a(bsv.bu, buf.d, dxp.a.f, cjy::b);
      a(bsv.bv, buf.d, dxp.a.f, cho::c);
      a(bsv.bx, buf.d, dxp.a.f, ckt::b);
      a(bsv.bw, buf.d, dxp.a.f, cjy::b);
      a(bsv.p, buf.d, dxp.a.f, cfa::b);
      a(bsv.D, buf.b, dxp.a.f, cju::b);
      a(bsv.J, buf.a, dxp.a.f, cjy::b);
      a(bsv.Q, buf.a, dxp.a.f, cfk::c);
      a(bsv.ad, buf.a, dxp.a.f, cjy::b);
      a(bsv.aw, buf.a, dxp.a.f, cfa::b);
      a(bsv.ay, buf.a, dxp.a.f, btm::a);
      a(bsv.aH, buf.d, dxp.a.f, cjy::b);
      a(bsv.aK, buf.a, dxp.a.f, btm::a);
      a(bsv.be, buf.a, dxp.a.f, cfa::b);
      a(bsv.bi, buf.a, dxp.a.f, cjy::b);
      a(bsv.bk, buf.a, dxp.a.f, cjy::b);
      a(bsv.bl, buf.d, dxp.a.f, btm::a);
      a(bsv.bm, buf.a, dxp.a.f, btm::a);
   }

   static record a(dxp.a a, bue b, bug.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsp> {
      boolean test(bsv<T> var1, dci var2, bto var3, iz var4, azc var5);
   }
}
