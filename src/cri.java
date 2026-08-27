import java.util.Optional;

public class cri {
   public static final aix<crh> a = a("sentry");
   public static final aix<crh> b = a("dune");
   public static final aix<crh> c = a("coast");
   public static final aix<crh> d = a("wild");
   public static final aix<crh> e = a("ward");
   public static final aix<crh> f = a("eye");
   public static final aix<crh> g = a("vex");
   public static final aix<crh> h = a("tide");
   public static final aix<crh> i = a("snout");
   public static final aix<crh> j = a("rib");
   public static final aix<crh> k = a("spire");
   public static final aix<crh> l = a("wayfinder");
   public static final aix<crh> m = a("shaper");
   public static final aix<crh> n = a("silence");
   public static final aix<crh> o = a("raiser");
   public static final aix<crh> p = a("host");

   public static void a(ph<crh> $$0) {
      a($$0, cpg.xn, a);
      a($$0, cpg.xo, b);
      a($$0, cpg.xp, c);
      a($$0, cpg.xq, d);
      a($$0, cpg.xr, e);
      a($$0, cpg.xs, f);
      a($$0, cpg.xt, g);
      a($$0, cpg.xu, h);
      a($$0, cpg.xv, i);
      a($$0, cpg.xw, j);
      a($$0, cpg.xx, k);
      a($$0, cpg.xy, l);
      a($$0, cpg.xz, m);
      a($$0, cpg.xA, n);
      a($$0, cpg.xB, o);
      a($$0, cpg.xC, p);
   }

   public static Optional<ij.c<crh>> a(iw $$0, cpd $$1) {
      return $$0.d(kg.aJ).h().filter($$1x -> $$1.a(((crh)$$1x.a()).b())).findFirst();
   }

   private static void a(ph<crh> $$0, coy $$1, aix<crh> $$2) {
      crh $$3 = new crh($$2.a(), kf.h.e($$1), vq.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aix<crh> a(String $$0) {
      return aix.a(kg.aJ, new aiy($$0));
   }
}
