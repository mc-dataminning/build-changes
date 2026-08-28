import java.util.Optional;

public class dfz {
   public static final aly<dfy> a = a("sentry");
   public static final aly<dfy> b = a("dune");
   public static final aly<dfy> c = a("coast");
   public static final aly<dfy> d = a("wild");
   public static final aly<dfy> e = a("ward");
   public static final aly<dfy> f = a("eye");
   public static final aly<dfy> g = a("vex");
   public static final aly<dfy> h = a("tide");
   public static final aly<dfy> i = a("snout");
   public static final aly<dfy> j = a("rib");
   public static final aly<dfy> k = a("spire");
   public static final aly<dfy> l = a("wayfinder");
   public static final aly<dfy> m = a("shaper");
   public static final aly<dfy> n = a("silence");
   public static final aly<dfy> o = a("raiser");
   public static final aly<dfy> p = a("host");
   public static final aly<dfy> q = a("flow");
   public static final aly<dfy> r = a("bolt");

   public static void a(rk<dfy> $$0) {
      a($$0, cxs.yn, a);
      a($$0, cxs.yo, b);
      a($$0, cxs.yp, c);
      a($$0, cxs.yq, d);
      a($$0, cxs.yr, e);
      a($$0, cxs.ys, f);
      a($$0, cxs.yt, g);
      a($$0, cxs.yu, h);
      a($$0, cxs.yv, i);
      a($$0, cxs.yw, j);
      a($$0, cxs.yx, k);
      a($$0, cxs.yy, l);
      a($$0, cxs.yz, m);
      a($$0, cxs.yA, n);
      a($$0, cxs.yB, o);
      a($$0, cxs.yC, p);
      a($$0, cxs.yD, q);
      a($$0, cxs.yE, r);
   }

   public static Optional<jq.c<dfy>> a(js.a $$0, cxo $$1) {
      return $$0.d(mb.ba).c().filter($$1x -> $$1.a(((dfy)$$1x.a()).b())).findFirst();
   }

   public static void a(rk<dfy> $$0, cxk $$1, aly<dfy> $$2) {
      dfy $$3 = new dfy($$2.a(), ma.g.e($$1), xv.c(ae.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aly<dfy> a(String $$0) {
      return aly.a(mb.ba, alz.b($$0));
   }
}
