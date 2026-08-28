import java.util.Optional;

public class cwz {
   public static final ale<cwy> a = a("sentry");
   public static final ale<cwy> b = a("dune");
   public static final ale<cwy> c = a("coast");
   public static final ale<cwy> d = a("wild");
   public static final ale<cwy> e = a("ward");
   public static final ale<cwy> f = a("eye");
   public static final ale<cwy> g = a("vex");
   public static final ale<cwy> h = a("tide");
   public static final ale<cwy> i = a("snout");
   public static final ale<cwy> j = a("rib");
   public static final ale<cwy> k = a("spire");
   public static final ale<cwy> l = a("wayfinder");
   public static final ale<cwy> m = a("shaper");
   public static final ale<cwy> n = a("silence");
   public static final ale<cwy> o = a("raiser");
   public static final ale<cwy> p = a("host");
   public static final ale<cwy> q = a("flow");
   public static final ale<cwy> r = a("bolt");

   public static void a(rc<cwy> $$0) {
      a($$0, cuu.xt, a);
      a($$0, cuu.xu, b);
      a($$0, cuu.xv, c);
      a($$0, cuu.xw, d);
      a($$0, cuu.xx, e);
      a($$0, cuu.xy, f);
      a($$0, cuu.xz, g);
      a($$0, cuu.xA, h);
      a($$0, cuu.xB, i);
      a($$0, cuu.xC, j);
      a($$0, cuu.xD, k);
      a($$0, cuu.xE, l);
      a($$0, cuu.xF, m);
      a($$0, cuu.xG, n);
      a($$0, cuu.xH, o);
      a($$0, cuu.xI, p);
   }

   public static Optional<ji.c<cwy>> a(jk.a $$0, cur $$1) {
      return $$0.b(lq.aP).b().filter($$1x -> $$1.a(((cwy)$$1x.a()).b())).findFirst();
   }

   public static void a(rc<cwy> $$0, cum $$1, ale<cwy> $$2) {
      cwy $$3 = new cwy($$2.a(), lp.h.e($$1), xp.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ale<cwy> a(String $$0) {
      return ale.a(lq.aP, new alf($$0));
   }
}
