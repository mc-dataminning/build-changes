import java.util.Optional;

public class cre {
   public static final aix<crd> a = a("sentry");
   public static final aix<crd> b = a("dune");
   public static final aix<crd> c = a("coast");
   public static final aix<crd> d = a("wild");
   public static final aix<crd> e = a("ward");
   public static final aix<crd> f = a("eye");
   public static final aix<crd> g = a("vex");
   public static final aix<crd> h = a("tide");
   public static final aix<crd> i = a("snout");
   public static final aix<crd> j = a("rib");
   public static final aix<crd> k = a("spire");
   public static final aix<crd> l = a("wayfinder");
   public static final aix<crd> m = a("shaper");
   public static final aix<crd> n = a("silence");
   public static final aix<crd> o = a("raiser");
   public static final aix<crd> p = a("host");

   public static void a(ph<crd> $$0) {
      a($$0, cpc.xn, a);
      a($$0, cpc.xo, b);
      a($$0, cpc.xp, c);
      a($$0, cpc.xq, d);
      a($$0, cpc.xr, e);
      a($$0, cpc.xs, f);
      a($$0, cpc.xt, g);
      a($$0, cpc.xu, h);
      a($$0, cpc.xv, i);
      a($$0, cpc.xw, j);
      a($$0, cpc.xx, k);
      a($$0, cpc.xy, l);
      a($$0, cpc.xz, m);
      a($$0, cpc.xA, n);
      a($$0, cpc.xB, o);
      a($$0, cpc.xC, p);
   }

   public static Optional<ij.c<crd>> a(iw $$0, coz $$1) {
      return $$0.d(kg.aJ).h().filter($$1x -> $$1.a(((crd)$$1x.a()).b())).findFirst();
   }

   private static void a(ph<crd> $$0, cou $$1, aix<crd> $$2) {
      crd $$3 = new crd($$2.a(), kf.h.e($$1), vq.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aix<crd> a(String $$0) {
      return aix.a(kg.aJ, new aiy($$0));
   }
}
