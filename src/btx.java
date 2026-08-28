import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class btx {
   private static final Map<bsm<?>, btx.a> a = Maps.newHashMap();

   private static <T extends btd> void a(bsm<T> $$0, btv $$1, dyf.a $$2, btx.b<T> $$3) {
      btx.a $$4 = a.put($$0, new btx.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lq.f.b($$0));
      }
   }

   public static btv a(bsm<?> $$0) {
      btx.a $$1 = a.get($$0);
      return $$1 == null ? btw.a : $$1.b;
   }

   public static boolean a(bsm<?> $$0, dci $$1, ja $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dyf.a b(@Nullable bsm<?> $$0) {
      btx.a $$1 = a.get($$0);
      return $$1 == null ? dyf.a.f : $$1.a;
   }

   public static <T extends bsg> boolean a(bsm<T> $$0, dcu $$1, btf $$2, ja $$3, ayo $$4) {
      btx.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsm.f, btw.b, dyf.a.f, cgd::a);
      a(bsm.u, btw.b, dyf.a.f, cft::c);
      a(bsm.y, btw.b, dyf.a.f, cft::c);
      a(bsm.B, btw.b, dyf.a.f, cje::a);
      a(bsm.Y, btw.b, dyf.a.f, cjm::b);
      a(bsm.aF, btw.b, dyf.a.f, cft::c);
      a(bsm.aI, btw.b, dyf.a.f, cft::c);
      a(bsm.aX, btw.b, dyf.a.f, cft::c);
      a(bsm.bg, btw.b, dyf.a.f, cfr::b);
      a(bsm.c, btw.d, dyf.a.f, cga::c);
      a(bsm.g, btw.d, dyf.a.f, cem::b);
      a(bsm.i, btw.d, dyf.a.f, cjq::c);
      a(bsm.l, btw.d, dyf.a.f, cjq::b);
      a(bsm.q, btw.d, dyf.a.f, cjq::b);
      a(bsm.t, btw.d, dyf.a.f, cer::b);
      a(bsm.w, btw.d, dyf.a.f, cer::b);
      a(bsm.x, btw.d, dyf.a.f, cjq::b);
      a(bsm.z, btw.d, dyf.a.f, cer::b);
      a(bsm.H, btw.d, dyf.a.f, cjq::b);
      a(bsm.I, btw.d, dyf.a.f, cjh::b);
      a(bsm.F, btw.d, dyf.a.f, btd::a);
      a(bsm.R, btw.d, dyf.a.f, cgl::c);
      a(bsm.T, btw.d, dyf.a.f, cjk::b);
      a(bsm.U, btw.d, dyf.a.f, cjq::b);
      a(bsm.W, btw.b, dyf.a.f, bst::a);
      a(bsm.X, btw.d, dyf.a.f, cgr::c);
      a(bsm.ab, btw.d, dyf.a.f, cer::b);
      a(bsm.ac, btw.d, dyf.a.f, cjn::a);
      a(bsm.af, btw.d, dyf.a.f, btd::a);
      a(bsm.an, btw.d, dyf.a.f, cer::b);
      a(bsm.ap, btw.d, dyf.a.f, cjp::b);
      a(bsm.as, btw.d, dyf.a.f, cfe::c);
      a(bsm.at, btw.d, dyf.a.f, cer::b);
      a(bsm.au, btw.d, dyf.a.e, cff::c);
      a(bsm.ax, btw.d, dyf.a.e, cfh::c);
      a(bsm.az, btw.d, dyf.a.f, cer::b);
      a(bsm.Z, btw.d, dyf.a.f, cku::c);
      a(bsm.aA, btw.d, dyf.a.f, cla::b);
      a(bsm.aC, btw.d, dyf.a.f, cjr::b);
      a(bsm.aD, btw.d, dyf.a.f, cfj::c);
      a(bsm.aG, btw.d, dyf.a.f, cfl::c);
      a(bsm.aJ, btw.d, dyf.a.f, cer::b);
      a(bsm.aM, btw.d, dyf.a.f, cjx::b);
      a(bsm.aN, btw.d, dyf.a.f, cjq::b);
      a(bsm.aO, btw.d, dyf.a.f, chb::c);
      a(bsm.aP, btw.d, dyf.a.f, cjz::c);
      a(bsm.aS, btw.d, dyf.a.f, btd::a);
      a(bsm.aW, btw.d, dyf.a.f, cjq::b);
      a(bsm.aY, btw.d, dyf.a.f, ckc::a);
      a(bsm.aZ, btw.c, dyf.a.f, ckd::c);
      a(bsm.bh, btw.d, dyf.a.f, cfs::c);
      a(bsm.bj, btw.d, dyf.a.f, btd::a);
      a(bsm.bo, btw.d, dyf.a.f, cjq::b);
      a(bsm.bp, btw.d, dyf.a.f, cjq::b);
      a(bsm.bq, btw.d, dyf.a.f, cjq::b);
      a(bsm.bs, btw.d, dyf.a.f, cfu::c);
      a(bsm.bu, btw.d, dyf.a.f, cjq::b);
      a(bsm.bv, btw.d, dyf.a.f, chf::c);
      a(bsm.bx, btw.d, dyf.a.f, ckl::b);
      a(bsm.bw, btw.d, dyf.a.f, cjq::b);
      a(bsm.p, btw.d, dyf.a.f, cer::b);
      a(bsm.D, btw.b, dyf.a.f, cjm::b);
      a(bsm.J, btw.a, dyf.a.f, cjq::b);
      a(bsm.Q, btw.a, dyf.a.f, cfb::c);
      a(bsm.ad, btw.a, dyf.a.f, cjq::b);
      a(bsm.aw, btw.a, dyf.a.f, cer::b);
      a(bsm.ay, btw.a, dyf.a.f, btd::a);
      a(bsm.aH, btw.d, dyf.a.f, cjq::b);
      a(bsm.aK, btw.a, dyf.a.f, btd::a);
      a(bsm.be, btw.a, dyf.a.f, cer::b);
      a(bsm.bi, btw.a, dyf.a.f, cjq::b);
      a(bsm.bk, btw.a, dyf.a.f, cjq::b);
      a(bsm.bl, btw.d, dyf.a.f, btd::a);
      a(bsm.bm, btw.a, dyf.a.f, btd::a);
   }

   static record a(dyf.a a, btv b, btx.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsg> {
      boolean test(bsm<T> var1, dcu var2, btf var3, ja var4, ayo var5);
   }
}
