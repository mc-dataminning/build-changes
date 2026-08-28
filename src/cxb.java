import java.util.Optional;

public class cxb {
   public static final akq<cxa> a = a("sentry");
   public static final akq<cxa> b = a("dune");
   public static final akq<cxa> c = a("coast");
   public static final akq<cxa> d = a("wild");
   public static final akq<cxa> e = a("ward");
   public static final akq<cxa> f = a("eye");
   public static final akq<cxa> g = a("vex");
   public static final akq<cxa> h = a("tide");
   public static final akq<cxa> i = a("snout");
   public static final akq<cxa> j = a("rib");
   public static final akq<cxa> k = a("spire");
   public static final akq<cxa> l = a("wayfinder");
   public static final akq<cxa> m = a("shaper");
   public static final akq<cxa> n = a("silence");
   public static final akq<cxa> o = a("raiser");
   public static final akq<cxa> p = a("host");
   public static final akq<cxa> q = a("flow");
   public static final akq<cxa> r = a("bolt");

   public static void a(qq<cxa> $$0) {
      a($$0, cut.xw, a);
      a($$0, cut.xx, b);
      a($$0, cut.xy, c);
      a($$0, cut.xz, d);
      a($$0, cut.xA, e);
      a($$0, cut.xB, f);
      a($$0, cut.xC, g);
      a($$0, cut.xD, h);
      a($$0, cut.xE, i);
      a($$0, cut.xF, j);
      a($$0, cut.xG, k);
      a($$0, cut.xH, l);
      a($$0, cut.xI, m);
      a($$0, cut.xJ, n);
      a($$0, cut.xK, o);
      a($$0, cut.xL, p);
      a($$0, cut.xM, q);
      a($$0, cut.xN, r);
   }

   public static Optional<jm.c<cxa>> a(jo.a $$0, cuq $$1) {
      return $$0.b(lu.aX).b().filter($$1x -> $$1.a(((cxa)$$1x.a()).b())).findFirst();
   }

   public static void a(qq<cxa> $$0, cul $$1, akq<cxa> $$2) {
      cxa $$3 = new cxa($$2.a(), lt.g.e($$1), wz.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akq<cxa> a(String $$0) {
      return akq.a(lu.aX, akr.b($$0));
   }
}
