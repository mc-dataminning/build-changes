import java.util.Optional;

public class cxv {
   public static final alb<cxu> a = a("sentry");
   public static final alb<cxu> b = a("dune");
   public static final alb<cxu> c = a("coast");
   public static final alb<cxu> d = a("wild");
   public static final alb<cxu> e = a("ward");
   public static final alb<cxu> f = a("eye");
   public static final alb<cxu> g = a("vex");
   public static final alb<cxu> h = a("tide");
   public static final alb<cxu> i = a("snout");
   public static final alb<cxu> j = a("rib");
   public static final alb<cxu> k = a("spire");
   public static final alb<cxu> l = a("wayfinder");
   public static final alb<cxu> m = a("shaper");
   public static final alb<cxu> n = a("silence");
   public static final alb<cxu> o = a("raiser");
   public static final alb<cxu> p = a("host");
   public static final alb<cxu> q = a("flow");
   public static final alb<cxu> r = a("bolt");

   public static void a(qt<cxu> $$0) {
      a($$0, cvt.xz, a);
      a($$0, cvt.xA, b);
      a($$0, cvt.xB, c);
      a($$0, cvt.xC, d);
      a($$0, cvt.xD, e);
      a($$0, cvt.xE, f);
      a($$0, cvt.xF, g);
      a($$0, cvt.xG, h);
      a($$0, cvt.xH, i);
      a($$0, cvt.xI, j);
      a($$0, cvt.xJ, k);
      a($$0, cvt.xK, l);
      a($$0, cvt.xL, m);
      a($$0, cvt.xM, n);
      a($$0, cvt.xN, o);
      a($$0, cvt.xO, p);
      a($$0, cvt.xP, q);
      a($$0, cvt.xQ, r);
   }

   public static Optional<jn.c<cxu>> a(jp.a $$0, cvp $$1) {
      return $$0.b(lv.aY).b().filter($$1x -> $$1.a(((cxu)$$1x.a()).b())).findFirst();
   }

   public static void a(qt<cxu> $$0, cvk $$1, alb<cxu> $$2) {
      cxu $$3 = new cxu($$2.a(), lu.g.e($$1), xd.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static alb<cxu> a(String $$0) {
      return alb.a(lv.aY, alc.b($$0));
   }
}
