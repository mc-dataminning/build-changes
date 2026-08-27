import java.util.Optional;

public class cpe {
   public static final ahf<cpd> a = a("sentry");
   public static final ahf<cpd> b = a("dune");
   public static final ahf<cpd> c = a("coast");
   public static final ahf<cpd> d = a("wild");
   public static final ahf<cpd> e = a("ward");
   public static final ahf<cpd> f = a("eye");
   public static final ahf<cpd> g = a("vex");
   public static final ahf<cpd> h = a("tide");
   public static final ahf<cpd> i = a("snout");
   public static final ahf<cpd> j = a("rib");
   public static final ahf<cpd> k = a("spire");
   public static final ahf<cpd> l = a("wayfinder");
   public static final ahf<cpd> m = a("shaper");
   public static final ahf<cpd> n = a("silence");
   public static final ahf<cpd> o = a("raiser");
   public static final ahf<cpd> p = a("host");

   public static void a(pe<cpd> $$0) {
      a($$0, cna.xk, a);
      a($$0, cna.xl, b);
      a($$0, cna.xm, c);
      a($$0, cna.xn, d);
      a($$0, cna.xo, e);
      a($$0, cna.xp, f);
      a($$0, cna.xq, g);
      a($$0, cna.xr, h);
      a($$0, cna.xs, i);
      a($$0, cna.xt, j);
      a($$0, cna.xu, k);
      a($$0, cna.xv, l);
      a($$0, cna.xw, m);
      a($$0, cna.xx, n);
      a($$0, cna.xy, o);
      a($$0, cna.xz, p);
   }

   public static Optional<ih.c<cpd>> a(iu $$0, cmx $$1) {
      return $$0.d(ke.aJ).h().filter($$1x -> $$1.a(((cpd)$$1x.a()).b())).findFirst();
   }

   private static void a(pe<cpd> $$0, cms $$1, ahf<cpd> $$2) {
      cpd $$3 = new cpd($$2.a(), kd.h.d($$1), vf.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ahf<cpd> a(String $$0) {
      return ahf.a(ke.aJ, new ahg($$0));
   }
}
