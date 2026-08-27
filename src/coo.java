import java.util.Optional;

public class coo {
   public static final ags<com> a = a("sentry");
   public static final ags<com> b = a("dune");
   public static final ags<com> c = a("coast");
   public static final ags<com> d = a("wild");
   public static final ags<com> e = a("ward");
   public static final ags<com> f = a("eye");
   public static final ags<com> g = a("vex");
   public static final ags<com> h = a("tide");
   public static final ags<com> i = a("snout");
   public static final ags<com> j = a("rib");
   public static final ags<com> k = a("spire");
   public static final ags<com> l = a("wayfinder");
   public static final ags<com> m = a("shaper");
   public static final ags<com> n = a("silence");
   public static final ags<com> o = a("raiser");
   public static final ags<com> p = a("host");

   public static void a(pa<com> $$0) {
      a($$0, cmk.xk, a);
      a($$0, cmk.xl, b);
      a($$0, cmk.xm, c);
      a($$0, cmk.xn, d);
      a($$0, cmk.xo, e);
      a($$0, cmk.xp, f);
      a($$0, cmk.xq, g);
      a($$0, cmk.xr, h);
      a($$0, cmk.xs, i);
      a($$0, cmk.xt, j);
      a($$0, cmk.xu, k);
      a($$0, cmk.xv, l);
      a($$0, cmk.xw, m);
      a($$0, cmk.xx, n);
      a($$0, cmk.xy, o);
      a($$0, cmk.xz, p);
   }

   public static Optional<ie.c<com>> a(is $$0, cmh $$1) {
      return $$0.d(kc.aI).h().filter($$1x -> $$1.a(((com)$$1x.a()).b())).findFirst();
   }

   private static void a(pa<com> $$0, cmc $$1, ags<com> $$2) {
      com $$3 = new com($$2.a(), kb.h.d($$1), vb.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ags<com> a(String $$0) {
      return ags.a(kc.aI, new agt($$0));
   }
}
