import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bqk {
   private static final Map<bpd<?>, bqk.a> a = Maps.newHashMap();

   private static <T extends bpr> void a(bpd<T> $$0, bqi $$1, dso.a $$2, bqk.b<T> $$3) {
      bqk.a $$4 = a.put($$0, new bqk.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ki.g.b($$0));
      }
   }

   public static bqi a(bpd<?> $$0) {
      bqk.a $$1 = a.get($$0);
      return $$1 == null ? bqj.a : $$1.b;
   }

   public static boolean a(bpd<?> $$0, cxe $$1, ib $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dso.a b(@Nullable bpd<?> $$0) {
      bqk.a $$1 = a.get($$0);
      return $$1 == null ? dso.a.f : $$1.a;
   }

   public static <T extends box> boolean a(bpd<T> $$0, cxq $$1, bpt $$2, ib $$3, axd $$4) {
      bqk.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bpd.g, bqj.b, dso.a.f, cco::a);
      a(bpd.v, bqj.b, dso.a.f, ccg::c);
      a(bpd.z, bqj.b, dso.a.f, ccg::c);
      a(bpd.C, bqj.b, dso.a.f, cfo::a);
      a(bpd.Z, bqj.b, dso.a.f, cfw::b);
      a(bpd.aF, bqj.b, dso.a.f, ccg::c);
      a(bpd.aI, bqj.b, dso.a.f, ccg::c);
      a(bpd.aX, bqj.b, dso.a.f, ccg::c);
      a(bpd.bg, bqj.b, dso.a.f, cce::b);
      a(bpd.d, bqj.d, dso.a.f, ccl::c);
      a(bpd.h, bqj.d, dso.a.f, caz::b);
      a(bpd.j, bqj.d, dso.a.f, cga::c);
      a(bpd.m, bqj.d, dso.a.f, cga::b);
      a(bpd.r, bqj.d, dso.a.f, cga::b);
      a(bpd.u, bqj.d, dso.a.f, cbe::b);
      a(bpd.x, bqj.d, dso.a.f, cbe::b);
      a(bpd.y, bqj.d, dso.a.f, cga::b);
      a(bpd.A, bqj.d, dso.a.f, cbe::b);
      a(bpd.I, bqj.d, dso.a.f, cga::b);
      a(bpd.J, bqj.d, dso.a.f, cfr::b);
      a(bpd.G, bqj.d, dso.a.f, bpr::a);
      a(bpd.S, bqj.d, dso.a.f, ccw::c);
      a(bpd.U, bqj.d, dso.a.f, cfu::b);
      a(bpd.V, bqj.d, dso.a.f, cga::b);
      a(bpd.X, bqj.b, dso.a.f, bph::a);
      a(bpd.Y, bqj.d, dso.a.f, cdc::c);
      a(bpd.ac, bqj.d, dso.a.f, cbe::b);
      a(bpd.ad, bqj.d, dso.a.f, cfx::a);
      a(bpd.ag, bqj.d, dso.a.f, bpr::a);
      a(bpd.an, bqj.d, dso.a.f, cbe::b);
      a(bpd.ap, bqj.d, dso.a.f, cfz::b);
      a(bpd.as, bqj.d, dso.a.f, cbr::c);
      a(bpd.at, bqj.d, dso.a.f, cbe::b);
      a(bpd.au, bqj.d, dso.a.e, cbs::c);
      a(bpd.ax, bqj.d, dso.a.e, cbu::c);
      a(bpd.az, bqj.d, dso.a.f, cbe::b);
      a(bpd.aa, bqj.d, dso.a.f, che::c);
      a(bpd.aA, bqj.d, dso.a.f, chk::b);
      a(bpd.aC, bqj.d, dso.a.f, cgb::b);
      a(bpd.aD, bqj.d, dso.a.f, cbw::c);
      a(bpd.aG, bqj.d, dso.a.f, cby::c);
      a(bpd.aJ, bqj.d, dso.a.f, cbe::b);
      a(bpd.aM, bqj.d, dso.a.f, cgh::b);
      a(bpd.aN, bqj.d, dso.a.f, cga::b);
      a(bpd.aO, bqj.d, dso.a.f, cdm::c);
      a(bpd.aP, bqj.d, dso.a.f, cgj::c);
      a(bpd.aS, bqj.d, dso.a.f, bpr::a);
      a(bpd.aW, bqj.d, dso.a.f, cga::b);
      a(bpd.aY, bqj.d, dso.a.f, cgm::a);
      a(bpd.aZ, bqj.c, dso.a.f, cgn::c);
      a(bpd.bh, bqj.d, dso.a.f, ccf::c);
      a(bpd.bj, bqj.d, dso.a.f, bpr::a);
      a(bpd.bo, bqj.d, dso.a.f, cga::b);
      a(bpd.bp, bqj.d, dso.a.f, cga::b);
      a(bpd.bq, bqj.d, dso.a.f, cga::b);
      a(bpd.bs, bqj.d, dso.a.f, cch::c);
      a(bpd.bu, bqj.d, dso.a.f, cga::b);
      a(bpd.bv, bqj.d, dso.a.f, cdq::c);
      a(bpd.bx, bqj.d, dso.a.f, cgv::b);
      a(bpd.bw, bqj.d, dso.a.f, cga::b);
      a(bpd.q, bqj.d, dso.a.f, cbe::b);
      a(bpd.E, bqj.b, dso.a.f, cfw::b);
      a(bpd.K, bqj.a, dso.a.f, cga::b);
      a(bpd.R, bqj.a, dso.a.f, cbo::c);
      a(bpd.ae, bqj.a, dso.a.f, cga::b);
      a(bpd.aw, bqj.a, dso.a.f, cbe::b);
      a(bpd.ay, bqj.a, dso.a.f, bpr::a);
      a(bpd.aH, bqj.d, dso.a.f, cga::b);
      a(bpd.aK, bqj.a, dso.a.f, bpr::a);
      a(bpd.be, bqj.a, dso.a.f, cbe::b);
      a(bpd.bi, bqj.a, dso.a.f, cga::b);
      a(bpd.bk, bqj.a, dso.a.f, cga::b);
      a(bpd.bl, bqj.d, dso.a.f, bpr::a);
      a(bpd.bm, bqj.a, dso.a.f, bpr::a);
   }

   static record a(dso.a a, bqi b, bqk.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends box> {
      boolean test(bpd<T> var1, cxq var2, bpt var3, ib var4, axd var5);
   }
}
