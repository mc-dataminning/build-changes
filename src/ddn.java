import java.util.Optional;

public class ddn {
   public static final alg<ddm> a = a("sentry");
   public static final alg<ddm> b = a("dune");
   public static final alg<ddm> c = a("coast");
   public static final alg<ddm> d = a("wild");
   public static final alg<ddm> e = a("ward");
   public static final alg<ddm> f = a("eye");
   public static final alg<ddm> g = a("vex");
   public static final alg<ddm> h = a("tide");
   public static final alg<ddm> i = a("snout");
   public static final alg<ddm> j = a("rib");
   public static final alg<ddm> k = a("spire");
   public static final alg<ddm> l = a("wayfinder");
   public static final alg<ddm> m = a("shaper");
   public static final alg<ddm> n = a("silence");
   public static final alg<ddm> o = a("raiser");
   public static final alg<ddm> p = a("host");
   public static final alg<ddm> q = a("flow");
   public static final alg<ddm> r = a("bolt");

   public static void a(qx<ddm> $$0) {
      a($$0, cwb.xz, a);
      a($$0, cwb.xA, b);
      a($$0, cwb.xB, c);
      a($$0, cwb.xC, d);
      a($$0, cwb.xD, e);
      a($$0, cwb.xE, f);
      a($$0, cwb.xF, g);
      a($$0, cwb.xG, h);
      a($$0, cwb.xH, i);
      a($$0, cwb.xI, j);
      a($$0, cwb.xJ, k);
      a($$0, cwb.xK, l);
      a($$0, cwb.xL, m);
      a($$0, cwb.xM, n);
      a($$0, cwb.xN, o);
      a($$0, cwb.xO, p);
      a($$0, cwb.xP, q);
      a($$0, cwb.xQ, r);
   }

   public static Optional<jp.c<ddm>> a(jr.a $$0, cvx $$1) {
      return $$0.d(ly.aY).c().filter($$1x -> $$1.a(((ddm)$$1x.a()).b())).findFirst();
   }

   public static void a(qx<ddm> $$0, cvt $$1, alg<ddm> $$2) {
      ddm $$3 = new ddm($$2.a(), lx.g.e($$1), xh.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static alg<ddm> a(String $$0) {
      return alg.a(ly.aY, alh.b($$0));
   }
}
