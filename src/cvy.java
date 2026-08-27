import java.util.Optional;

public class cvy {
   public static final akm<cvx> a = a("sentry");
   public static final akm<cvx> b = a("dune");
   public static final akm<cvx> c = a("coast");
   public static final akm<cvx> d = a("wild");
   public static final akm<cvx> e = a("ward");
   public static final akm<cvx> f = a("eye");
   public static final akm<cvx> g = a("vex");
   public static final akm<cvx> h = a("tide");
   public static final akm<cvx> i = a("snout");
   public static final akm<cvx> j = a("rib");
   public static final akm<cvx> k = a("spire");
   public static final akm<cvx> l = a("wayfinder");
   public static final akm<cvx> m = a("shaper");
   public static final akm<cvx> n = a("silence");
   public static final akm<cvx> o = a("raiser");
   public static final akm<cvx> p = a("host");
   public static final akm<cvx> q = a("flow");
   public static final akm<cvx> r = a("bolt");

   public static void a(qo<cvx> $$0) {
      a($$0, ctt.xt, a);
      a($$0, ctt.xu, b);
      a($$0, ctt.xv, c);
      a($$0, ctt.xw, d);
      a($$0, ctt.xx, e);
      a($$0, ctt.xy, f);
      a($$0, ctt.xz, g);
      a($$0, ctt.xA, h);
      a($$0, ctt.xB, i);
      a($$0, ctt.xC, j);
      a($$0, ctt.xD, k);
      a($$0, ctt.xE, l);
      a($$0, ctt.xF, m);
      a($$0, ctt.xG, n);
      a($$0, ctt.xH, o);
      a($$0, ctt.xI, p);
   }

   public static Optional<ix.c<cvx>> a(iz.a $$0, ctq $$1) {
      return $$0.b(lf.aP).b().filter($$1x -> $$1.a(((cvx)$$1x.a()).b())).findFirst();
   }

   public static void a(qo<cvx> $$0, ctl $$1, akm<cvx> $$2) {
      cvx $$3 = new cvx($$2.a(), le.h.e($$1), wx.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akm<cvx> a(String $$0) {
      return akm.a(lf.aP, new akn($$0));
   }
}
