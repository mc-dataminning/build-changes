import java.util.Optional;

public class cvw {
   public static final akl<cvv> a = a("sentry");
   public static final akl<cvv> b = a("dune");
   public static final akl<cvv> c = a("coast");
   public static final akl<cvv> d = a("wild");
   public static final akl<cvv> e = a("ward");
   public static final akl<cvv> f = a("eye");
   public static final akl<cvv> g = a("vex");
   public static final akl<cvv> h = a("tide");
   public static final akl<cvv> i = a("snout");
   public static final akl<cvv> j = a("rib");
   public static final akl<cvv> k = a("spire");
   public static final akl<cvv> l = a("wayfinder");
   public static final akl<cvv> m = a("shaper");
   public static final akl<cvv> n = a("silence");
   public static final akl<cvv> o = a("raiser");
   public static final akl<cvv> p = a("host");
   public static final akl<cvv> q = a("flow");
   public static final akl<cvv> r = a("bolt");

   public static void a(qo<cvv> $$0) {
      a($$0, ctr.xt, a);
      a($$0, ctr.xu, b);
      a($$0, ctr.xv, c);
      a($$0, ctr.xw, d);
      a($$0, ctr.xx, e);
      a($$0, ctr.xy, f);
      a($$0, ctr.xz, g);
      a($$0, ctr.xA, h);
      a($$0, ctr.xB, i);
      a($$0, ctr.xC, j);
      a($$0, ctr.xD, k);
      a($$0, ctr.xE, l);
      a($$0, ctr.xF, m);
      a($$0, ctr.xG, n);
      a($$0, ctr.xH, o);
      a($$0, ctr.xI, p);
   }

   public static Optional<ix.c<cvv>> a(iz.a $$0, cto $$1) {
      return $$0.b(lf.aP).b().filter($$1x -> $$1.a(((cvv)$$1x.a()).b())).findFirst();
   }

   public static void a(qo<cvv> $$0, ctj $$1, akl<cvv> $$2) {
      cvv $$3 = new cvv($$2.a(), le.h.e($$1), wx.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akl<cvv> a(String $$0) {
      return akl.a(lf.aP, new akm($$0));
   }
}
