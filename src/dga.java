import java.util.Optional;

public class dga {
   public static final aly<dfz> a = a("sentry");
   public static final aly<dfz> b = a("dune");
   public static final aly<dfz> c = a("coast");
   public static final aly<dfz> d = a("wild");
   public static final aly<dfz> e = a("ward");
   public static final aly<dfz> f = a("eye");
   public static final aly<dfz> g = a("vex");
   public static final aly<dfz> h = a("tide");
   public static final aly<dfz> i = a("snout");
   public static final aly<dfz> j = a("rib");
   public static final aly<dfz> k = a("spire");
   public static final aly<dfz> l = a("wayfinder");
   public static final aly<dfz> m = a("shaper");
   public static final aly<dfz> n = a("silence");
   public static final aly<dfz> o = a("raiser");
   public static final aly<dfz> p = a("host");
   public static final aly<dfz> q = a("flow");
   public static final aly<dfz> r = a("bolt");

   public static void a(rk<dfz> $$0) {
      a($$0, cxt.yn, a);
      a($$0, cxt.yo, b);
      a($$0, cxt.yp, c);
      a($$0, cxt.yq, d);
      a($$0, cxt.yr, e);
      a($$0, cxt.ys, f);
      a($$0, cxt.yt, g);
      a($$0, cxt.yu, h);
      a($$0, cxt.yv, i);
      a($$0, cxt.yw, j);
      a($$0, cxt.yx, k);
      a($$0, cxt.yy, l);
      a($$0, cxt.yz, m);
      a($$0, cxt.yA, n);
      a($$0, cxt.yB, o);
      a($$0, cxt.yC, p);
      a($$0, cxt.yD, q);
      a($$0, cxt.yE, r);
   }

   public static Optional<jq.c<dfz>> a(js.a $$0, cxp $$1) {
      return $$0.d(mb.ba).c().filter($$1x -> $$1.a(((dfz)$$1x.a()).b())).findFirst();
   }

   public static void a(rk<dfz> $$0, cxl $$1, aly<dfz> $$2) {
      dfz $$3 = new dfz($$2.a(), ma.g.e($$1), xv.c(ae.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aly<dfz> a(String $$0) {
      return aly.a(mb.ba, alz.b($$0));
   }
}
