import java.util.Optional;

public class dfs {
   public static final aly<dfr> a = a("sentry");
   public static final aly<dfr> b = a("dune");
   public static final aly<dfr> c = a("coast");
   public static final aly<dfr> d = a("wild");
   public static final aly<dfr> e = a("ward");
   public static final aly<dfr> f = a("eye");
   public static final aly<dfr> g = a("vex");
   public static final aly<dfr> h = a("tide");
   public static final aly<dfr> i = a("snout");
   public static final aly<dfr> j = a("rib");
   public static final aly<dfr> k = a("spire");
   public static final aly<dfr> l = a("wayfinder");
   public static final aly<dfr> m = a("shaper");
   public static final aly<dfr> n = a("silence");
   public static final aly<dfr> o = a("raiser");
   public static final aly<dfr> p = a("host");
   public static final aly<dfr> q = a("flow");
   public static final aly<dfr> r = a("bolt");

   public static void a(rk<dfr> $$0) {
      a($$0, cxo.yn, a);
      a($$0, cxo.yo, b);
      a($$0, cxo.yp, c);
      a($$0, cxo.yq, d);
      a($$0, cxo.yr, e);
      a($$0, cxo.ys, f);
      a($$0, cxo.yt, g);
      a($$0, cxo.yu, h);
      a($$0, cxo.yv, i);
      a($$0, cxo.yw, j);
      a($$0, cxo.yx, k);
      a($$0, cxo.yy, l);
      a($$0, cxo.yz, m);
      a($$0, cxo.yA, n);
      a($$0, cxo.yB, o);
      a($$0, cxo.yC, p);
      a($$0, cxo.yD, q);
      a($$0, cxo.yE, r);
   }

   public static Optional<jq.c<dfr>> a(js.a $$0, cxk $$1) {
      return $$0.d(mb.aZ).c().filter($$1x -> $$1.a(((dfr)$$1x.a()).b())).findFirst();
   }

   public static void a(rk<dfr> $$0, cxg $$1, aly<dfr> $$2) {
      dfr $$3 = new dfr($$2.a(), ma.g.e($$1), xv.c(ae.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aly<dfr> a(String $$0) {
      return aly.a(mb.aZ, alz.b($$0));
   }
}
