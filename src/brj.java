import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class brj {
   private static final Map<bqb<?>, brj.a> a = Maps.newHashMap();

   private static <T extends bqq> void a(bqb<T> $$0, brh $$1, dur.a $$2, brj.b<T> $$3) {
      brj.a $$4 = a.put($$0, new brj.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kr.g.b($$0));
      }
   }

   public static brh a(bqb<?> $$0) {
      brj.a $$1 = a.get($$0);
      return $$1 == null ? bri.a : $$1.b;
   }

   public static boolean a(bqb<?> $$0, cza $$1, ib $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dur.a b(@Nullable bqb<?> $$0) {
      brj.a $$1 = a.get($$0);
      return $$1 == null ? dur.a.f : $$1.a;
   }

   public static <T extends bpv> boolean a(bqb<T> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      brj.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bqb.f, bri.b, dur.a.f, cdn::a);
      a(bqb.u, bri.b, dur.a.f, cdf::c);
      a(bqb.y, bri.b, dur.a.f, cdf::c);
      a(bqb.B, bri.b, dur.a.f, cgn::a);
      a(bqb.Y, bri.b, dur.a.f, cgv::b);
      a(bqb.aE, bri.b, dur.a.f, cdf::c);
      a(bqb.aH, bri.b, dur.a.f, cdf::c);
      a(bqb.aW, bri.b, dur.a.f, cdf::c);
      a(bqb.bf, bri.b, dur.a.f, cdd::b);
      a(bqb.c, bri.d, dur.a.f, cdk::c);
      a(bqb.g, bri.d, dur.a.f, cby::b);
      a(bqb.i, bri.d, dur.a.f, cgz::c);
      a(bqb.l, bri.d, dur.a.f, cgz::b);
      a(bqb.q, bri.d, dur.a.f, cgz::b);
      a(bqb.t, bri.d, dur.a.f, ccd::b);
      a(bqb.w, bri.d, dur.a.f, ccd::b);
      a(bqb.x, bri.d, dur.a.f, cgz::b);
      a(bqb.z, bri.d, dur.a.f, ccd::b);
      a(bqb.H, bri.d, dur.a.f, cgz::b);
      a(bqb.I, bri.d, dur.a.f, cgq::b);
      a(bqb.F, bri.d, dur.a.f, bqq::a);
      a(bqb.R, bri.d, dur.a.f, cdv::c);
      a(bqb.T, bri.d, dur.a.f, cgt::b);
      a(bqb.U, bri.d, dur.a.f, cgz::b);
      a(bqb.W, bri.b, dur.a.f, bqg::a);
      a(bqb.X, bri.d, dur.a.f, ceb::c);
      a(bqb.ab, bri.d, dur.a.f, ccd::b);
      a(bqb.ac, bri.d, dur.a.f, cgw::a);
      a(bqb.af, bri.d, dur.a.f, bqq::a);
      a(bqb.am, bri.d, dur.a.f, ccd::b);
      a(bqb.ao, bri.d, dur.a.f, cgy::b);
      a(bqb.ar, bri.d, dur.a.f, ccq::c);
      a(bqb.as, bri.d, dur.a.f, ccd::b);
      a(bqb.at, bri.d, dur.a.e, ccr::c);
      a(bqb.aw, bri.d, dur.a.e, cct::c);
      a(bqb.ay, bri.d, dur.a.f, ccd::b);
      a(bqb.Z, bri.d, dur.a.f, cid::c);
      a(bqb.az, bri.d, dur.a.f, cij::b);
      a(bqb.aB, bri.d, dur.a.f, cha::b);
      a(bqb.aC, bri.d, dur.a.f, ccv::c);
      a(bqb.aF, bri.d, dur.a.f, ccx::c);
      a(bqb.aI, bri.d, dur.a.f, ccd::b);
      a(bqb.aL, bri.d, dur.a.f, chg::b);
      a(bqb.aM, bri.d, dur.a.f, cgz::b);
      a(bqb.aN, bri.d, dur.a.f, cel::c);
      a(bqb.aO, bri.d, dur.a.f, chi::c);
      a(bqb.aR, bri.d, dur.a.f, bqq::a);
      a(bqb.aV, bri.d, dur.a.f, cgz::b);
      a(bqb.aX, bri.d, dur.a.f, chl::a);
      a(bqb.aY, bri.c, dur.a.f, chm::c);
      a(bqb.bg, bri.d, dur.a.f, cde::c);
      a(bqb.bi, bri.d, dur.a.f, bqq::a);
      a(bqb.bn, bri.d, dur.a.f, cgz::b);
      a(bqb.bo, bri.d, dur.a.f, cgz::b);
      a(bqb.bp, bri.d, dur.a.f, cgz::b);
      a(bqb.br, bri.d, dur.a.f, cdg::c);
      a(bqb.bt, bri.d, dur.a.f, cgz::b);
      a(bqb.bu, bri.d, dur.a.f, cep::c);
      a(bqb.bw, bri.d, dur.a.f, chu::b);
      a(bqb.bv, bri.d, dur.a.f, cgz::b);
      a(bqb.p, bri.d, dur.a.f, ccd::b);
      a(bqb.D, bri.b, dur.a.f, cgv::b);
      a(bqb.J, bri.a, dur.a.f, cgz::b);
      a(bqb.Q, bri.a, dur.a.f, ccn::c);
      a(bqb.ad, bri.a, dur.a.f, cgz::b);
      a(bqb.av, bri.a, dur.a.f, ccd::b);
      a(bqb.ax, bri.a, dur.a.f, bqq::a);
      a(bqb.aG, bri.d, dur.a.f, cgz::b);
      a(bqb.aJ, bri.a, dur.a.f, bqq::a);
      a(bqb.bd, bri.a, dur.a.f, ccd::b);
      a(bqb.bh, bri.a, dur.a.f, cgz::b);
      a(bqb.bj, bri.a, dur.a.f, cgz::b);
      a(bqb.bk, bri.d, dur.a.f, bqq::a);
      a(bqb.bl, bri.a, dur.a.f, bqq::a);
   }

   static record a(dur.a a, brh b, brj.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bpv> {
      boolean test(bqb<T> var1, czm var2, bqs var3, ib var4, axr var5);
   }
}
