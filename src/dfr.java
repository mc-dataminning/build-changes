import java.util.Optional;

public class dfr {
   public static final alo<dfq> a = a("sentry");
   public static final alo<dfq> b = a("dune");
   public static final alo<dfq> c = a("coast");
   public static final alo<dfq> d = a("wild");
   public static final alo<dfq> e = a("ward");
   public static final alo<dfq> f = a("eye");
   public static final alo<dfq> g = a("vex");
   public static final alo<dfq> h = a("tide");
   public static final alo<dfq> i = a("snout");
   public static final alo<dfq> j = a("rib");
   public static final alo<dfq> k = a("spire");
   public static final alo<dfq> l = a("wayfinder");
   public static final alo<dfq> m = a("shaper");
   public static final alo<dfq> n = a("silence");
   public static final alo<dfq> o = a("raiser");
   public static final alo<dfq> p = a("host");
   public static final alo<dfq> q = a("flow");
   public static final alo<dfq> r = a("bolt");

   public static void a(ra<dfq> $$0) {
      a($$0, cxk.yx, a);
      a($$0, cxk.yy, b);
      a($$0, cxk.yz, c);
      a($$0, cxk.yA, d);
      a($$0, cxk.yB, e);
      a($$0, cxk.yC, f);
      a($$0, cxk.yD, g);
      a($$0, cxk.yE, h);
      a($$0, cxk.yF, i);
      a($$0, cxk.yG, j);
      a($$0, cxk.yH, k);
      a($$0, cxk.yI, l);
      a($$0, cxk.yJ, m);
      a($$0, cxk.yK, n);
      a($$0, cxk.yL, o);
      a($$0, cxk.yM, p);
      a($$0, cxk.yN, q);
      a($$0, cxk.yO, r);
   }

   public static Optional<jq.c<dfq>> a(js.a $$0, cxg $$1) {
      return $$0.d(mb.ba).c().filter($$1x -> $$1.a(((dfq)$$1x.a()).b())).findFirst();
   }

   public static void a(ra<dfq> $$0, cxc $$1, alo<dfq> $$2) {
      dfq $$3 = new dfq($$2.a(), ma.g.e($$1), xk.c(ae.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static alo<dfq> a(String $$0) {
      return alo.a(mb.ba, alp.b($$0));
   }
}
