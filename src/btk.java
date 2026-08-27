import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class btk {
   private static final Map<bsa<?>, btk.a> a = Maps.newHashMap();

   private static <T extends bsq> void a(bsa<T> $$0, bti $$1, dwt.a $$2, btk.b<T> $$3) {
      btk.a $$4 = a.put($$0, new btk.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + le.g.b($$0));
      }
   }

   public static bti a(bsa<?> $$0) {
      btk.a $$1 = a.get($$0);
      return $$1 == null ? btj.a : $$1.b;
   }

   public static boolean a(bsa<?> $$0, dba $$1, io $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dwt.a b(@Nullable bsa<?> $$0) {
      btk.a $$1 = a.get($$0);
      return $$1 == null ? dwt.a.f : $$1.a;
   }

   public static <T extends bru> boolean a(bsa<T> $$0, dbm $$1, bss $$2, io $$3, ayk $$4) {
      btk.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsa.f, btj.b, dwt.a.f, cfq::a);
      a(bsa.u, btj.b, dwt.a.f, cfg::c);
      a(bsa.y, btj.b, dwt.a.f, cfg::c);
      a(bsa.B, btj.b, dwt.a.f, ciq::a);
      a(bsa.Y, btj.b, dwt.a.f, ciy::b);
      a(bsa.aF, btj.b, dwt.a.f, cfg::c);
      a(bsa.aI, btj.b, dwt.a.f, cfg::c);
      a(bsa.aX, btj.b, dwt.a.f, cfg::c);
      a(bsa.bg, btj.b, dwt.a.f, cfe::b);
      a(bsa.c, btj.d, dwt.a.f, cfn::c);
      a(bsa.g, btj.d, dwt.a.f, cdz::b);
      a(bsa.i, btj.d, dwt.a.f, cjc::c);
      a(bsa.l, btj.d, dwt.a.f, cjc::b);
      a(bsa.q, btj.d, dwt.a.f, cjc::b);
      a(bsa.t, btj.d, dwt.a.f, cee::b);
      a(bsa.w, btj.d, dwt.a.f, cee::b);
      a(bsa.x, btj.d, dwt.a.f, cjc::b);
      a(bsa.z, btj.d, dwt.a.f, cee::b);
      a(bsa.H, btj.d, dwt.a.f, cjc::b);
      a(bsa.I, btj.d, dwt.a.f, cit::b);
      a(bsa.F, btj.d, dwt.a.f, bsq::a);
      a(bsa.R, btj.d, dwt.a.f, cfy::c);
      a(bsa.T, btj.d, dwt.a.f, ciw::b);
      a(bsa.U, btj.d, dwt.a.f, cjc::b);
      a(bsa.W, btj.b, dwt.a.f, bsg::a);
      a(bsa.X, btj.d, dwt.a.f, cge::c);
      a(bsa.ab, btj.d, dwt.a.f, cee::b);
      a(bsa.ac, btj.d, dwt.a.f, ciz::a);
      a(bsa.af, btj.d, dwt.a.f, bsq::a);
      a(bsa.an, btj.d, dwt.a.f, cee::b);
      a(bsa.ap, btj.d, dwt.a.f, cjb::b);
      a(bsa.as, btj.d, dwt.a.f, cer::c);
      a(bsa.at, btj.d, dwt.a.f, cee::b);
      a(bsa.au, btj.d, dwt.a.e, ces::c);
      a(bsa.ax, btj.d, dwt.a.e, ceu::c);
      a(bsa.az, btj.d, dwt.a.f, cee::b);
      a(bsa.Z, btj.d, dwt.a.f, ckg::c);
      a(bsa.aA, btj.d, dwt.a.f, ckm::b);
      a(bsa.aC, btj.d, dwt.a.f, cjd::b);
      a(bsa.aD, btj.d, dwt.a.f, cew::c);
      a(bsa.aG, btj.d, dwt.a.f, cey::c);
      a(bsa.aJ, btj.d, dwt.a.f, cee::b);
      a(bsa.aM, btj.d, dwt.a.f, cjj::b);
      a(bsa.aN, btj.d, dwt.a.f, cjc::b);
      a(bsa.aO, btj.d, dwt.a.f, cgo::c);
      a(bsa.aP, btj.d, dwt.a.f, cjl::c);
      a(bsa.aS, btj.d, dwt.a.f, bsq::a);
      a(bsa.aW, btj.d, dwt.a.f, cjc::b);
      a(bsa.aY, btj.d, dwt.a.f, cjo::a);
      a(bsa.aZ, btj.c, dwt.a.f, cjp::c);
      a(bsa.bh, btj.d, dwt.a.f, cff::c);
      a(bsa.bj, btj.d, dwt.a.f, bsq::a);
      a(bsa.bo, btj.d, dwt.a.f, cjc::b);
      a(bsa.bp, btj.d, dwt.a.f, cjc::b);
      a(bsa.bq, btj.d, dwt.a.f, cjc::b);
      a(bsa.bs, btj.d, dwt.a.f, cfh::c);
      a(bsa.bu, btj.d, dwt.a.f, cjc::b);
      a(bsa.bv, btj.d, dwt.a.f, cgs::c);
      a(bsa.bx, btj.d, dwt.a.f, cjx::b);
      a(bsa.bw, btj.d, dwt.a.f, cjc::b);
      a(bsa.p, btj.d, dwt.a.f, cee::b);
      a(bsa.D, btj.b, dwt.a.f, ciy::b);
      a(bsa.J, btj.a, dwt.a.f, cjc::b);
      a(bsa.Q, btj.a, dwt.a.f, ceo::c);
      a(bsa.ad, btj.a, dwt.a.f, cjc::b);
      a(bsa.aw, btj.a, dwt.a.f, cee::b);
      a(bsa.ay, btj.a, dwt.a.f, bsq::a);
      a(bsa.aH, btj.d, dwt.a.f, cjc::b);
      a(bsa.aK, btj.a, dwt.a.f, bsq::a);
      a(bsa.be, btj.a, dwt.a.f, cee::b);
      a(bsa.bi, btj.a, dwt.a.f, cjc::b);
      a(bsa.bk, btj.a, dwt.a.f, cjc::b);
      a(bsa.bl, btj.d, dwt.a.f, bsq::a);
      a(bsa.bm, btj.a, dwt.a.f, bsq::a);
   }

   static record a(dwt.a a, bti b, btk.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bru> {
      boolean test(bsa<T> var1, dbm var2, bss var3, io var4, ayk var5);
   }
}
