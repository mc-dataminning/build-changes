import java.util.Optional;

public class ctx {
   public static final aju<ctw> a = a("sentry");
   public static final aju<ctw> b = a("dune");
   public static final aju<ctw> c = a("coast");
   public static final aju<ctw> d = a("wild");
   public static final aju<ctw> e = a("ward");
   public static final aju<ctw> f = a("eye");
   public static final aju<ctw> g = a("vex");
   public static final aju<ctw> h = a("tide");
   public static final aju<ctw> i = a("snout");
   public static final aju<ctw> j = a("rib");
   public static final aju<ctw> k = a("spire");
   public static final aju<ctw> l = a("wayfinder");
   public static final aju<ctw> m = a("shaper");
   public static final aju<ctw> n = a("silence");
   public static final aju<ctw> o = a("raiser");
   public static final aju<ctw> p = a("host");

   public static void a(pz<ctw> $$0) {
      a($$0, crv.xp, a);
      a($$0, crv.xq, b);
      a($$0, crv.xr, c);
      a($$0, crv.xs, d);
      a($$0, crv.xt, e);
      a($$0, crv.xu, f);
      a($$0, crv.xv, g);
      a($$0, crv.xw, h);
      a($$0, crv.xx, i);
      a($$0, crv.xy, j);
      a($$0, crv.xz, k);
      a($$0, crv.xA, l);
      a($$0, crv.xB, m);
      a($$0, crv.xC, n);
      a($$0, crv.xD, o);
      a($$0, crv.xE, p);
   }

   public static Optional<in.c<ctw>> a(jb $$0, crs $$1) {
      return $$0.d(ku.aM).h().filter($$1x -> $$1.a(((ctw)$$1x.a()).b())).findFirst();
   }

   private static void a(pz<ctw> $$0, crn $$1, aju<ctw> $$2) {
      ctw $$3 = new ctw($$2.a(), kt.h.e($$1), wi.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aju<ctw> a(String $$0) {
      return aju.a(ku.aM, new ajv($$0));
   }
}
