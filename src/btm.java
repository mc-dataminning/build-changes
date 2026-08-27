import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class btm {
   private static final Map<bsc<?>, btm.a> a = Maps.newHashMap();

   private static <T extends bss> void a(bsc<T> $$0, btk $$1, dwv.a $$2, btm.b<T> $$3) {
      btm.a $$4 = a.put($$0, new btm.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + le.g.b($$0));
      }
   }

   public static btk a(bsc<?> $$0) {
      btm.a $$1 = a.get($$0);
      return $$1 == null ? btl.a : $$1.b;
   }

   public static boolean a(bsc<?> $$0, dbc $$1, io $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dwv.a b(@Nullable bsc<?> $$0) {
      btm.a $$1 = a.get($$0);
      return $$1 == null ? dwv.a.f : $$1.a;
   }

   public static <T extends brw> boolean a(bsc<T> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      btm.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsc.f, btl.b, dwv.a.f, cfs::a);
      a(bsc.u, btl.b, dwv.a.f, cfi::c);
      a(bsc.y, btl.b, dwv.a.f, cfi::c);
      a(bsc.B, btl.b, dwv.a.f, cis::a);
      a(bsc.Y, btl.b, dwv.a.f, cja::b);
      a(bsc.aF, btl.b, dwv.a.f, cfi::c);
      a(bsc.aI, btl.b, dwv.a.f, cfi::c);
      a(bsc.aX, btl.b, dwv.a.f, cfi::c);
      a(bsc.bg, btl.b, dwv.a.f, cfg::b);
      a(bsc.c, btl.d, dwv.a.f, cfp::c);
      a(bsc.g, btl.d, dwv.a.f, ceb::b);
      a(bsc.i, btl.d, dwv.a.f, cje::c);
      a(bsc.l, btl.d, dwv.a.f, cje::b);
      a(bsc.q, btl.d, dwv.a.f, cje::b);
      a(bsc.t, btl.d, dwv.a.f, ceg::b);
      a(bsc.w, btl.d, dwv.a.f, ceg::b);
      a(bsc.x, btl.d, dwv.a.f, cje::b);
      a(bsc.z, btl.d, dwv.a.f, ceg::b);
      a(bsc.H, btl.d, dwv.a.f, cje::b);
      a(bsc.I, btl.d, dwv.a.f, civ::b);
      a(bsc.F, btl.d, dwv.a.f, bss::a);
      a(bsc.R, btl.d, dwv.a.f, cga::c);
      a(bsc.T, btl.d, dwv.a.f, ciy::b);
      a(bsc.U, btl.d, dwv.a.f, cje::b);
      a(bsc.W, btl.b, dwv.a.f, bsi::a);
      a(bsc.X, btl.d, dwv.a.f, cgg::c);
      a(bsc.ab, btl.d, dwv.a.f, ceg::b);
      a(bsc.ac, btl.d, dwv.a.f, cjb::a);
      a(bsc.af, btl.d, dwv.a.f, bss::a);
      a(bsc.an, btl.d, dwv.a.f, ceg::b);
      a(bsc.ap, btl.d, dwv.a.f, cjd::b);
      a(bsc.as, btl.d, dwv.a.f, cet::c);
      a(bsc.at, btl.d, dwv.a.f, ceg::b);
      a(bsc.au, btl.d, dwv.a.e, ceu::c);
      a(bsc.ax, btl.d, dwv.a.e, cew::c);
      a(bsc.az, btl.d, dwv.a.f, ceg::b);
      a(bsc.Z, btl.d, dwv.a.f, cki::c);
      a(bsc.aA, btl.d, dwv.a.f, cko::b);
      a(bsc.aC, btl.d, dwv.a.f, cjf::b);
      a(bsc.aD, btl.d, dwv.a.f, cey::c);
      a(bsc.aG, btl.d, dwv.a.f, cfa::c);
      a(bsc.aJ, btl.d, dwv.a.f, ceg::b);
      a(bsc.aM, btl.d, dwv.a.f, cjl::b);
      a(bsc.aN, btl.d, dwv.a.f, cje::b);
      a(bsc.aO, btl.d, dwv.a.f, cgq::c);
      a(bsc.aP, btl.d, dwv.a.f, cjn::c);
      a(bsc.aS, btl.d, dwv.a.f, bss::a);
      a(bsc.aW, btl.d, dwv.a.f, cje::b);
      a(bsc.aY, btl.d, dwv.a.f, cjq::a);
      a(bsc.aZ, btl.c, dwv.a.f, cjr::c);
      a(bsc.bh, btl.d, dwv.a.f, cfh::c);
      a(bsc.bj, btl.d, dwv.a.f, bss::a);
      a(bsc.bo, btl.d, dwv.a.f, cje::b);
      a(bsc.bp, btl.d, dwv.a.f, cje::b);
      a(bsc.bq, btl.d, dwv.a.f, cje::b);
      a(bsc.bs, btl.d, dwv.a.f, cfj::c);
      a(bsc.bu, btl.d, dwv.a.f, cje::b);
      a(bsc.bv, btl.d, dwv.a.f, cgu::c);
      a(bsc.bx, btl.d, dwv.a.f, cjz::b);
      a(bsc.bw, btl.d, dwv.a.f, cje::b);
      a(bsc.p, btl.d, dwv.a.f, ceg::b);
      a(bsc.D, btl.b, dwv.a.f, cja::b);
      a(bsc.J, btl.a, dwv.a.f, cje::b);
      a(bsc.Q, btl.a, dwv.a.f, ceq::c);
      a(bsc.ad, btl.a, dwv.a.f, cje::b);
      a(bsc.aw, btl.a, dwv.a.f, ceg::b);
      a(bsc.ay, btl.a, dwv.a.f, bss::a);
      a(bsc.aH, btl.d, dwv.a.f, cje::b);
      a(bsc.aK, btl.a, dwv.a.f, bss::a);
      a(bsc.be, btl.a, dwv.a.f, ceg::b);
      a(bsc.bi, btl.a, dwv.a.f, cje::b);
      a(bsc.bk, btl.a, dwv.a.f, cje::b);
      a(bsc.bl, btl.d, dwv.a.f, bss::a);
      a(bsc.bm, btl.a, dwv.a.f, bss::a);
   }

   static record a(dwv.a a, btk b, btm.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends brw> {
      boolean test(bsc<T> var1, dbo var2, bsu var3, io var4, aym var5);
   }
}
