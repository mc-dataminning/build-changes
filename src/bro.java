import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bro {
   private static final Map<bqg<?>, bro.a> a = Maps.newHashMap();

   private static <T extends bqv> void a(bqg<T> $$0, brm $$1, dva.a $$2, bro.b<T> $$3) {
      bro.a $$4 = a.put($$0, new bro.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kt.g.b($$0));
      }
   }

   public static brm a(bqg<?> $$0) {
      bro.a $$1 = a.get($$0);
      return $$1 == null ? brn.a : $$1.b;
   }

   public static boolean a(bqg<?> $$0, czj $$1, id $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dva.a b(@Nullable bqg<?> $$0) {
      bro.a $$1 = a.get($$0);
      return $$1 == null ? dva.a.f : $$1.a;
   }

   public static <T extends bqa> boolean a(bqg<T> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      bro.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bqg.f, brn.b, dva.a.f, cdu::a);
      a(bqg.u, brn.b, dva.a.f, cdk::c);
      a(bqg.y, brn.b, dva.a.f, cdk::c);
      a(bqg.B, brn.b, dva.a.f, cgu::a);
      a(bqg.Y, brn.b, dva.a.f, chc::b);
      a(bqg.aE, brn.b, dva.a.f, cdk::c);
      a(bqg.aH, brn.b, dva.a.f, cdk::c);
      a(bqg.aW, brn.b, dva.a.f, cdk::c);
      a(bqg.bf, brn.b, dva.a.f, cdi::b);
      a(bqg.c, brn.d, dva.a.f, cdr::c);
      a(bqg.g, brn.d, dva.a.f, ccd::b);
      a(bqg.i, brn.d, dva.a.f, chg::c);
      a(bqg.l, brn.d, dva.a.f, chg::b);
      a(bqg.q, brn.d, dva.a.f, chg::b);
      a(bqg.t, brn.d, dva.a.f, cci::b);
      a(bqg.w, brn.d, dva.a.f, cci::b);
      a(bqg.x, brn.d, dva.a.f, chg::b);
      a(bqg.z, brn.d, dva.a.f, cci::b);
      a(bqg.H, brn.d, dva.a.f, chg::b);
      a(bqg.I, brn.d, dva.a.f, cgx::b);
      a(bqg.F, brn.d, dva.a.f, bqv::a);
      a(bqg.R, brn.d, dva.a.f, cec::c);
      a(bqg.T, brn.d, dva.a.f, cha::b);
      a(bqg.U, brn.d, dva.a.f, chg::b);
      a(bqg.W, brn.b, dva.a.f, bql::a);
      a(bqg.X, brn.d, dva.a.f, cei::c);
      a(bqg.ab, brn.d, dva.a.f, cci::b);
      a(bqg.ac, brn.d, dva.a.f, chd::a);
      a(bqg.af, brn.d, dva.a.f, bqv::a);
      a(bqg.am, brn.d, dva.a.f, cci::b);
      a(bqg.ao, brn.d, dva.a.f, chf::b);
      a(bqg.ar, brn.d, dva.a.f, ccv::c);
      a(bqg.as, brn.d, dva.a.f, cci::b);
      a(bqg.at, brn.d, dva.a.e, ccw::c);
      a(bqg.aw, brn.d, dva.a.e, ccy::c);
      a(bqg.ay, brn.d, dva.a.f, cci::b);
      a(bqg.Z, brn.d, dva.a.f, cik::c);
      a(bqg.az, brn.d, dva.a.f, ciq::b);
      a(bqg.aB, brn.d, dva.a.f, chh::b);
      a(bqg.aC, brn.d, dva.a.f, cda::c);
      a(bqg.aF, brn.d, dva.a.f, cdc::c);
      a(bqg.aI, brn.d, dva.a.f, cci::b);
      a(bqg.aL, brn.d, dva.a.f, chn::b);
      a(bqg.aM, brn.d, dva.a.f, chg::b);
      a(bqg.aN, brn.d, dva.a.f, ces::c);
      a(bqg.aO, brn.d, dva.a.f, chp::c);
      a(bqg.aR, brn.d, dva.a.f, bqv::a);
      a(bqg.aV, brn.d, dva.a.f, chg::b);
      a(bqg.aX, brn.d, dva.a.f, chs::a);
      a(bqg.aY, brn.c, dva.a.f, cht::c);
      a(bqg.bg, brn.d, dva.a.f, cdj::c);
      a(bqg.bi, brn.d, dva.a.f, bqv::a);
      a(bqg.bn, brn.d, dva.a.f, chg::b);
      a(bqg.bo, brn.d, dva.a.f, chg::b);
      a(bqg.bp, brn.d, dva.a.f, chg::b);
      a(bqg.br, brn.d, dva.a.f, cdl::c);
      a(bqg.bt, brn.d, dva.a.f, chg::b);
      a(bqg.bu, brn.d, dva.a.f, cew::c);
      a(bqg.bw, brn.d, dva.a.f, cib::b);
      a(bqg.bv, brn.d, dva.a.f, chg::b);
      a(bqg.p, brn.d, dva.a.f, cci::b);
      a(bqg.D, brn.b, dva.a.f, chc::b);
      a(bqg.J, brn.a, dva.a.f, chg::b);
      a(bqg.Q, brn.a, dva.a.f, ccs::c);
      a(bqg.ad, brn.a, dva.a.f, chg::b);
      a(bqg.av, brn.a, dva.a.f, cci::b);
      a(bqg.ax, brn.a, dva.a.f, bqv::a);
      a(bqg.aG, brn.d, dva.a.f, chg::b);
      a(bqg.aJ, brn.a, dva.a.f, bqv::a);
      a(bqg.bd, brn.a, dva.a.f, cci::b);
      a(bqg.bh, brn.a, dva.a.f, chg::b);
      a(bqg.bj, brn.a, dva.a.f, chg::b);
      a(bqg.bk, brn.d, dva.a.f, bqv::a);
      a(bqg.bl, brn.a, dva.a.f, bqv::a);
   }

   static record a(dva.a a, brm b, bro.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bqa> {
      boolean test(bqg<T> var1, czv var2, bqx var3, id var4, axt var5);
   }
}
