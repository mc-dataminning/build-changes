import java.util.Optional;

public class coy {
   public static final ahc<cox> a = a("sentry");
   public static final ahc<cox> b = a("dune");
   public static final ahc<cox> c = a("coast");
   public static final ahc<cox> d = a("wild");
   public static final ahc<cox> e = a("ward");
   public static final ahc<cox> f = a("eye");
   public static final ahc<cox> g = a("vex");
   public static final ahc<cox> h = a("tide");
   public static final ahc<cox> i = a("snout");
   public static final ahc<cox> j = a("rib");
   public static final ahc<cox> k = a("spire");
   public static final ahc<cox> l = a("wayfinder");
   public static final ahc<cox> m = a("shaper");
   public static final ahc<cox> n = a("silence");
   public static final ahc<cox> o = a("raiser");
   public static final ahc<cox> p = a("host");

   public static void a(pc<cox> $$0) {
      a($$0, cmu.xk, a);
      a($$0, cmu.xl, b);
      a($$0, cmu.xm, c);
      a($$0, cmu.xn, d);
      a($$0, cmu.xo, e);
      a($$0, cmu.xp, f);
      a($$0, cmu.xq, g);
      a($$0, cmu.xr, h);
      a($$0, cmu.xs, i);
      a($$0, cmu.xt, j);
      a($$0, cmu.xu, k);
      a($$0, cmu.xv, l);
      a($$0, cmu.xw, m);
      a($$0, cmu.xx, n);
      a($$0, cmu.xy, o);
      a($$0, cmu.xz, p);
   }

   public static Optional<ih.c<cox>> a(iu $$0, cmr $$1) {
      return $$0.d(ke.aJ).h().filter($$1x -> $$1.a(((cox)$$1x.a()).b())).findFirst();
   }

   private static void a(pc<cox> $$0, cmm $$1, ahc<cox> $$2) {
      cox $$3 = new cox($$2.a(), kd.h.d($$1), vd.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ahc<cox> a(String $$0) {
      return ahc.a(ke.aJ, new ahd($$0));
   }
}
