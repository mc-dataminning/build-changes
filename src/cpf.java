import java.util.Optional;

public class cpf {
   public static final ahf<cpe> a = a("sentry");
   public static final ahf<cpe> b = a("dune");
   public static final ahf<cpe> c = a("coast");
   public static final ahf<cpe> d = a("wild");
   public static final ahf<cpe> e = a("ward");
   public static final ahf<cpe> f = a("eye");
   public static final ahf<cpe> g = a("vex");
   public static final ahf<cpe> h = a("tide");
   public static final ahf<cpe> i = a("snout");
   public static final ahf<cpe> j = a("rib");
   public static final ahf<cpe> k = a("spire");
   public static final ahf<cpe> l = a("wayfinder");
   public static final ahf<cpe> m = a("shaper");
   public static final ahf<cpe> n = a("silence");
   public static final ahf<cpe> o = a("raiser");
   public static final ahf<cpe> p = a("host");

   public static void a(pe<cpe> $$0) {
      a($$0, cnb.xk, a);
      a($$0, cnb.xl, b);
      a($$0, cnb.xm, c);
      a($$0, cnb.xn, d);
      a($$0, cnb.xo, e);
      a($$0, cnb.xp, f);
      a($$0, cnb.xq, g);
      a($$0, cnb.xr, h);
      a($$0, cnb.xs, i);
      a($$0, cnb.xt, j);
      a($$0, cnb.xu, k);
      a($$0, cnb.xv, l);
      a($$0, cnb.xw, m);
      a($$0, cnb.xx, n);
      a($$0, cnb.xy, o);
      a($$0, cnb.xz, p);
   }

   public static Optional<ih.c<cpe>> a(iu $$0, cmy $$1) {
      return $$0.d(ke.aJ).h().filter($$1x -> $$1.a(((cpe)$$1x.a()).b())).findFirst();
   }

   private static void a(pe<cpe> $$0, cmt $$1, ahf<cpe> $$2) {
      cpe $$3 = new cpe($$2.a(), kd.h.d($$1), vf.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ahf<cpe> a(String $$0) {
      return ahf.a(ke.aJ, new ahg($$0));
   }
}
