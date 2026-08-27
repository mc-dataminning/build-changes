import java.util.Optional;

public class cpn {
   public static final ahg<cpm> a = a("sentry");
   public static final ahg<cpm> b = a("dune");
   public static final ahg<cpm> c = a("coast");
   public static final ahg<cpm> d = a("wild");
   public static final ahg<cpm> e = a("ward");
   public static final ahg<cpm> f = a("eye");
   public static final ahg<cpm> g = a("vex");
   public static final ahg<cpm> h = a("tide");
   public static final ahg<cpm> i = a("snout");
   public static final ahg<cpm> j = a("rib");
   public static final ahg<cpm> k = a("spire");
   public static final ahg<cpm> l = a("wayfinder");
   public static final ahg<cpm> m = a("shaper");
   public static final ahg<cpm> n = a("silence");
   public static final ahg<cpm> o = a("raiser");
   public static final ahg<cpm> p = a("host");

   public static void a(pf<cpm> $$0) {
      a($$0, cnj.xn, a);
      a($$0, cnj.xo, b);
      a($$0, cnj.xp, c);
      a($$0, cnj.xq, d);
      a($$0, cnj.xr, e);
      a($$0, cnj.xs, f);
      a($$0, cnj.xt, g);
      a($$0, cnj.xu, h);
      a($$0, cnj.xv, i);
      a($$0, cnj.xw, j);
      a($$0, cnj.xx, k);
      a($$0, cnj.xy, l);
      a($$0, cnj.xz, m);
      a($$0, cnj.xA, n);
      a($$0, cnj.xB, o);
      a($$0, cnj.xC, p);
   }

   public static Optional<ih.c<cpm>> a(iu $$0, cng $$1) {
      return $$0.d(ke.aJ).h().filter($$1x -> $$1.a(((cpm)$$1x.a()).b())).findFirst();
   }

   private static void a(pf<cpm> $$0, cnb $$1, ahg<cpm> $$2) {
      cpm $$3 = new cpm($$2.a(), kd.h.d($$1), vg.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ahg<cpm> a(String $$0) {
      return ahg.a(ke.aJ, new ahh($$0));
   }
}
