import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bsv {
   private static final Map<brn<?>, bsv.a> a = Maps.newHashMap();

   private static <T extends bsc> void a(brn<T> $$0, bst $$1, dvz.a $$2, bsv.b<T> $$3) {
      bsv.a $$4 = a.put($$0, new bsv.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ld.g.b($$0));
      }
   }

   public static bst a(brn<?> $$0) {
      bsv.a $$1 = a.get($$0);
      return $$1 == null ? bsu.a : $$1.b;
   }

   public static boolean a(brn<?> $$0, dag $$1, in $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dvz.a b(@Nullable brn<?> $$0) {
      bsv.a $$1 = a.get($$0);
      return $$1 == null ? dvz.a.f : $$1.a;
   }

   public static <T extends brh> boolean a(brn<T> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      bsv.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(brn.f, bsu.b, dvz.a.f, cfb::a);
      a(brn.u, bsu.b, dvz.a.f, cer::c);
      a(brn.y, bsu.b, dvz.a.f, cer::c);
      a(brn.B, bsu.b, dvz.a.f, cib::a);
      a(brn.Y, bsu.b, dvz.a.f, cij::b);
      a(brn.aE, bsu.b, dvz.a.f, cer::c);
      a(brn.aH, bsu.b, dvz.a.f, cer::c);
      a(brn.aW, bsu.b, dvz.a.f, cer::c);
      a(brn.bf, bsu.b, dvz.a.f, cep::b);
      a(brn.c, bsu.d, dvz.a.f, cey::c);
      a(brn.g, bsu.d, dvz.a.f, cdk::b);
      a(brn.i, bsu.d, dvz.a.f, cin::c);
      a(brn.l, bsu.d, dvz.a.f, cin::b);
      a(brn.q, bsu.d, dvz.a.f, cin::b);
      a(brn.t, bsu.d, dvz.a.f, cdp::b);
      a(brn.w, bsu.d, dvz.a.f, cdp::b);
      a(brn.x, bsu.d, dvz.a.f, cin::b);
      a(brn.z, bsu.d, dvz.a.f, cdp::b);
      a(brn.H, bsu.d, dvz.a.f, cin::b);
      a(brn.I, bsu.d, dvz.a.f, cie::b);
      a(brn.F, bsu.d, dvz.a.f, bsc::a);
      a(brn.R, bsu.d, dvz.a.f, cfj::c);
      a(brn.T, bsu.d, dvz.a.f, cih::b);
      a(brn.U, bsu.d, dvz.a.f, cin::b);
      a(brn.W, bsu.b, dvz.a.f, brs::a);
      a(brn.X, bsu.d, dvz.a.f, cfp::c);
      a(brn.ab, bsu.d, dvz.a.f, cdp::b);
      a(brn.ac, bsu.d, dvz.a.f, cik::a);
      a(brn.af, bsu.d, dvz.a.f, bsc::a);
      a(brn.am, bsu.d, dvz.a.f, cdp::b);
      a(brn.ao, bsu.d, dvz.a.f, cim::b);
      a(brn.ar, bsu.d, dvz.a.f, cec::c);
      a(brn.as, bsu.d, dvz.a.f, cdp::b);
      a(brn.at, bsu.d, dvz.a.e, ced::c);
      a(brn.aw, bsu.d, dvz.a.e, cef::c);
      a(brn.ay, bsu.d, dvz.a.f, cdp::b);
      a(brn.Z, bsu.d, dvz.a.f, cjr::c);
      a(brn.az, bsu.d, dvz.a.f, cjx::b);
      a(brn.aB, bsu.d, dvz.a.f, cio::b);
      a(brn.aC, bsu.d, dvz.a.f, ceh::c);
      a(brn.aF, bsu.d, dvz.a.f, cej::c);
      a(brn.aI, bsu.d, dvz.a.f, cdp::b);
      a(brn.aL, bsu.d, dvz.a.f, ciu::b);
      a(brn.aM, bsu.d, dvz.a.f, cin::b);
      a(brn.aN, bsu.d, dvz.a.f, cfz::c);
      a(brn.aO, bsu.d, dvz.a.f, ciw::c);
      a(brn.aR, bsu.d, dvz.a.f, bsc::a);
      a(brn.aV, bsu.d, dvz.a.f, cin::b);
      a(brn.aX, bsu.d, dvz.a.f, ciz::a);
      a(brn.aY, bsu.c, dvz.a.f, cja::c);
      a(brn.bg, bsu.d, dvz.a.f, ceq::c);
      a(brn.bi, bsu.d, dvz.a.f, bsc::a);
      a(brn.bn, bsu.d, dvz.a.f, cin::b);
      a(brn.bo, bsu.d, dvz.a.f, cin::b);
      a(brn.bp, bsu.d, dvz.a.f, cin::b);
      a(brn.br, bsu.d, dvz.a.f, ces::c);
      a(brn.bt, bsu.d, dvz.a.f, cin::b);
      a(brn.bu, bsu.d, dvz.a.f, cgd::c);
      a(brn.bw, bsu.d, dvz.a.f, cji::b);
      a(brn.bv, bsu.d, dvz.a.f, cin::b);
      a(brn.p, bsu.d, dvz.a.f, cdp::b);
      a(brn.D, bsu.b, dvz.a.f, cij::b);
      a(brn.J, bsu.a, dvz.a.f, cin::b);
      a(brn.Q, bsu.a, dvz.a.f, cdz::c);
      a(brn.ad, bsu.a, dvz.a.f, cin::b);
      a(brn.av, bsu.a, dvz.a.f, cdp::b);
      a(brn.ax, bsu.a, dvz.a.f, bsc::a);
      a(brn.aG, bsu.d, dvz.a.f, cin::b);
      a(brn.aJ, bsu.a, dvz.a.f, bsc::a);
      a(brn.bd, bsu.a, dvz.a.f, cdp::b);
      a(brn.bh, bsu.a, dvz.a.f, cin::b);
      a(brn.bj, bsu.a, dvz.a.f, cin::b);
      a(brn.bk, bsu.d, dvz.a.f, bsc::a);
      a(brn.bl, bsu.a, dvz.a.f, bsc::a);
   }

   static record a(dvz.a a, bst b, bsv.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends brh> {
      boolean test(brn<T> var1, das var2, bse var3, in var4, ayg var5);
   }
}
