import java.util.Optional;

public class cuj {
   public static final ake<cui> a = a("sentry");
   public static final ake<cui> b = a("dune");
   public static final ake<cui> c = a("coast");
   public static final ake<cui> d = a("wild");
   public static final ake<cui> e = a("ward");
   public static final ake<cui> f = a("eye");
   public static final ake<cui> g = a("vex");
   public static final ake<cui> h = a("tide");
   public static final ake<cui> i = a("snout");
   public static final ake<cui> j = a("rib");
   public static final ake<cui> k = a("spire");
   public static final ake<cui> l = a("wayfinder");
   public static final ake<cui> m = a("shaper");
   public static final ake<cui> n = a("silence");
   public static final ake<cui> o = a("raiser");
   public static final ake<cui> p = a("host");
   public static final ake<cui> q = a("flow");
   public static final ake<cui> r = a("bolt");

   public static void a(qj<cui> $$0) {
      a($$0, csg.xt, a);
      a($$0, csg.xu, b);
      a($$0, csg.xv, c);
      a($$0, csg.xw, d);
      a($$0, csg.xx, e);
      a($$0, csg.xy, f);
      a($$0, csg.xz, g);
      a($$0, csg.xA, h);
      a($$0, csg.xB, i);
      a($$0, csg.xC, j);
      a($$0, csg.xD, k);
      a($$0, csg.xE, l);
      a($$0, csg.xF, m);
      a($$0, csg.xG, n);
      a($$0, csg.xH, o);
      a($$0, csg.xI, p);
   }

   public static Optional<iv.c<cui>> a(jj $$0, csd $$1) {
      return $$0.d(ld.aO).h().filter($$1x -> $$1.a(((cui)$$1x.a()).b())).findFirst();
   }

   public static void a(qj<cui> $$0, cry $$1, ake<cui> $$2) {
      cui $$3 = new cui($$2.a(), lc.h.e($$1), ws.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ake<cui> a(String $$0) {
      return ake.a(ld.aO, new akf($$0));
   }
}
