import java.util.Optional;

public class ddx {
   public static final alk<ddw> a = a("sentry");
   public static final alk<ddw> b = a("dune");
   public static final alk<ddw> c = a("coast");
   public static final alk<ddw> d = a("wild");
   public static final alk<ddw> e = a("ward");
   public static final alk<ddw> f = a("eye");
   public static final alk<ddw> g = a("vex");
   public static final alk<ddw> h = a("tide");
   public static final alk<ddw> i = a("snout");
   public static final alk<ddw> j = a("rib");
   public static final alk<ddw> k = a("spire");
   public static final alk<ddw> l = a("wayfinder");
   public static final alk<ddw> m = a("shaper");
   public static final alk<ddw> n = a("silence");
   public static final alk<ddw> o = a("raiser");
   public static final alk<ddw> p = a("host");
   public static final alk<ddw> q = a("flow");
   public static final alk<ddw> r = a("bolt");

   public static void a(rb<ddw> $$0) {
      a($$0, cwj.xP, a);
      a($$0, cwj.xQ, b);
      a($$0, cwj.xR, c);
      a($$0, cwj.xS, d);
      a($$0, cwj.xT, e);
      a($$0, cwj.xU, f);
      a($$0, cwj.xV, g);
      a($$0, cwj.xW, h);
      a($$0, cwj.xX, i);
      a($$0, cwj.xY, j);
      a($$0, cwj.xZ, k);
      a($$0, cwj.ya, l);
      a($$0, cwj.yb, m);
      a($$0, cwj.yc, n);
      a($$0, cwj.yd, o);
      a($$0, cwj.ye, p);
      a($$0, cwj.yf, q);
      a($$0, cwj.yg, r);
   }

   public static Optional<jq.c<ddw>> a(js.a $$0, cwf $$1) {
      return $$0.d(ma.aY).c().filter($$1x -> $$1.a(((ddw)$$1x.a()).b())).findFirst();
   }

   public static void a(rb<ddw> $$0, cwb $$1, alk<ddw> $$2) {
      ddw $$3 = new ddw($$2.a(), lz.g.e($$1), xl.c(ae.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static alk<ddw> a(String $$0) {
      return alk.a(ma.aY, all.b($$0));
   }
}
