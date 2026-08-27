import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bni {
   private static final Map<bmc<?>, bni.a> a = Maps.newHashMap();

   private static <T extends bmq> void a(bmc<T> $$0, bni.c $$1, doy.a $$2, bni.b<T> $$3) {
      bni.a $$4 = a.put($$0, new bni.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kd.g.b($$0));
      }
   }

   public static bni.c a(bmc<?> $$0) {
      bni.a $$1 = a.get($$0);
      return $$1 == null ? bni.c.c : $$1.b;
   }

   public static doy.a b(@Nullable bmc<?> $$0) {
      bni.a $$1 = a.get($$0);
      return $$1 == null ? doy.a.f : $$1.a;
   }

   public static <T extends blw> boolean a(bmc<T> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      bni.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bmc.g, bni.c.b, doy.a.f, bzm::a);
      a(bmc.t, bni.c.b, doy.a.f, bze::c);
      a(bmc.x, bni.c.b, doy.a.f, bze::c);
      a(bmc.A, bni.c.b, doy.a.f, cck::a);
      a(bmc.X, bni.c.b, doy.a.f, ccs::b);
      a(bmc.aD, bni.c.b, doy.a.f, bze::c);
      a(bmc.aG, bni.c.b, doy.a.f, bze::c);
      a(bmc.aV, bni.c.b, doy.a.f, bze::c);
      a(bmc.be, bni.c.b, doy.a.f, bzc::b);
      a(bmc.d, bni.c.a, doy.a.f, byc::b);
      a(bmc.h, bni.c.a, doy.a.f, bxx::b);
      a(bmc.j, bni.c.a, doy.a.f, ccw::c);
      a(bmc.p, bni.c.a, doy.a.f, ccw::b);
      a(bmc.s, bni.c.a, doy.a.f, byc::b);
      a(bmc.v, bni.c.a, doy.a.f, byc::b);
      a(bmc.w, bni.c.a, doy.a.f, ccw::b);
      a(bmc.y, bni.c.a, doy.a.f, byc::b);
      a(bmc.G, bni.c.a, doy.a.f, ccw::b);
      a(bmc.H, bni.c.a, doy.a.f, ccn::b);
      a(bmc.E, bni.c.a, doy.a.f, bmq::a);
      a(bmc.Q, bni.c.a, doy.a.f, bzu::c);
      a(bmc.S, bni.c.a, doy.a.f, ccq::b);
      a(bmc.T, bni.c.a, doy.a.f, ccw::b);
      a(bmc.V, bni.c.b, doy.a.f, bmg::a);
      a(bmc.W, bni.c.a, doy.a.f, caa::c);
      a(bmc.aa, bni.c.a, doy.a.f, byc::b);
      a(bmc.ab, bni.c.a, doy.a.f, cct::a);
      a(bmc.ae, bni.c.a, doy.a.f, bmq::a);
      a(bmc.al, bni.c.a, doy.a.f, byc::b);
      a(bmc.an, bni.c.a, doy.a.f, ccv::b);
      a(bmc.aq, bni.c.a, doy.a.f, byp::c);
      a(bmc.ar, bni.c.a, doy.a.f, byc::b);
      a(bmc.as, bni.c.a, doy.a.e, byq::c);
      a(bmc.av, bni.c.a, doy.a.e, bys::c);
      a(bmc.ax, bni.c.a, doy.a.f, byc::b);
      a(bmc.Y, bni.c.a, doy.a.f, cea::c);
      a(bmc.ay, bni.c.a, doy.a.f, ceg::b);
      a(bmc.aA, bni.c.a, doy.a.f, ccx::b);
      a(bmc.aB, bni.c.a, doy.a.f, byu::c);
      a(bmc.aE, bni.c.a, doy.a.f, byw::c);
      a(bmc.aH, bni.c.a, doy.a.f, byc::b);
      a(bmc.aK, bni.c.a, doy.a.f, cdd::b);
      a(bmc.aL, bni.c.a, doy.a.f, ccw::b);
      a(bmc.aM, bni.c.a, doy.a.f, cak::c);
      a(bmc.aN, bni.c.a, doy.a.f, cdf::c);
      a(bmc.aQ, bni.c.a, doy.a.f, bmq::a);
      a(bmc.aU, bni.c.a, doy.a.f, ccw::b);
      a(bmc.aW, bni.c.a, doy.a.f, cdi::a);
      a(bmc.aX, bni.c.d, doy.a.f, cdj::c);
      a(bmc.bf, bni.c.a, doy.a.f, bzd::c);
      a(bmc.bh, bni.c.a, doy.a.f, bmq::a);
      a(bmc.bm, bni.c.a, doy.a.f, ccw::b);
      a(bmc.bn, bni.c.a, doy.a.f, ccw::b);
      a(bmc.bo, bni.c.a, doy.a.f, ccw::b);
      a(bmc.bq, bni.c.a, doy.a.f, bzf::c);
      a(bmc.bs, bni.c.a, doy.a.f, ccw::b);
      a(bmc.bt, bni.c.a, doy.a.f, cao::c);
      a(bmc.bv, bni.c.a, doy.a.f, cdr::b);
      a(bmc.bu, bni.c.a, doy.a.f, ccw::b);
      a(bmc.o, bni.c.a, doy.a.f, byc::b);
      a(bmc.C, bni.c.b, doy.a.f, ccs::b);
      a(bmc.I, bni.c.c, doy.a.f, ccw::b);
      a(bmc.P, bni.c.c, doy.a.f, bym::c);
      a(bmc.ac, bni.c.c, doy.a.f, ccw::b);
      a(bmc.au, bni.c.c, doy.a.f, byc::b);
      a(bmc.aw, bni.c.c, doy.a.f, bmq::a);
      a(bmc.aF, bni.c.c, doy.a.f, ccw::b);
      a(bmc.aI, bni.c.c, doy.a.f, bmq::a);
      a(bmc.bc, bni.c.c, doy.a.f, byc::b);
      a(bmc.bg, bni.c.c, doy.a.f, ccw::b);
      a(bmc.bi, bni.c.c, doy.a.f, ccw::b);
      a(bmc.bj, bni.c.c, doy.a.f, bmq::a);
      a(bmc.bk, bni.c.c, doy.a.f, bmq::a);
   }

   static class a {
      final doy.a a;
      final bni.c b;
      final bni.b<?> c;

      public a(doy.a $$0, bni.c $$1, bni.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends blw> {
      boolean test(bmc<T> var1, cum var2, bms var3, hx var4, auw var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
