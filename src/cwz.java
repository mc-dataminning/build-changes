import java.util.Optional;

public class cwz {
   public static final akp<cwy> a = a("sentry");
   public static final akp<cwy> b = a("dune");
   public static final akp<cwy> c = a("coast");
   public static final akp<cwy> d = a("wild");
   public static final akp<cwy> e = a("ward");
   public static final akp<cwy> f = a("eye");
   public static final akp<cwy> g = a("vex");
   public static final akp<cwy> h = a("tide");
   public static final akp<cwy> i = a("snout");
   public static final akp<cwy> j = a("rib");
   public static final akp<cwy> k = a("spire");
   public static final akp<cwy> l = a("wayfinder");
   public static final akp<cwy> m = a("shaper");
   public static final akp<cwy> n = a("silence");
   public static final akp<cwy> o = a("raiser");
   public static final akp<cwy> p = a("host");
   public static final akp<cwy> q = a("flow");
   public static final akp<cwy> r = a("bolt");

   public static void a(qp<cwy> $$0) {
      a($$0, cur.xw, a);
      a($$0, cur.xx, b);
      a($$0, cur.xy, c);
      a($$0, cur.xz, d);
      a($$0, cur.xA, e);
      a($$0, cur.xB, f);
      a($$0, cur.xC, g);
      a($$0, cur.xD, h);
      a($$0, cur.xE, i);
      a($$0, cur.xF, j);
      a($$0, cur.xG, k);
      a($$0, cur.xH, l);
      a($$0, cur.xI, m);
      a($$0, cur.xJ, n);
      a($$0, cur.xK, o);
      a($$0, cur.xL, p);
      a($$0, cur.xM, q);
      a($$0, cur.xN, r);
   }

   public static Optional<jm.c<cwy>> a(jo.a $$0, cuo $$1) {
      return $$0.b(lu.aX).b().filter($$1x -> $$1.a(((cwy)$$1x.a()).b())).findFirst();
   }

   public static void a(qp<cwy> $$0, cuj $$1, akp<cwy> $$2) {
      cwy $$3 = new cwy($$2.a(), lt.g.e($$1), wy.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akp<cwy> a(String $$0) {
      return akp.a(lu.aX, akq.b($$0));
   }
}
