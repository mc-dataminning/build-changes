import java.util.Optional;

public class cnu {
   public static final agl<cnt> a = a("sentry");
   public static final agl<cnt> b = a("dune");
   public static final agl<cnt> c = a("coast");
   public static final agl<cnt> d = a("wild");
   public static final agl<cnt> e = a("ward");
   public static final agl<cnt> f = a("eye");
   public static final agl<cnt> g = a("vex");
   public static final agl<cnt> h = a("tide");
   public static final agl<cnt> i = a("snout");
   public static final agl<cnt> j = a("rib");
   public static final agl<cnt> k = a("spire");
   public static final agl<cnt> l = a("wayfinder");
   public static final agl<cnt> m = a("shaper");
   public static final agl<cnt> n = a("silence");
   public static final agl<cnt> o = a("raiser");
   public static final agl<cnt> p = a("host");

   public static void a(oz<cnt> $$0) {
      a($$0, clr.xj, a);
      a($$0, clr.xk, b);
      a($$0, clr.xl, c);
      a($$0, clr.xm, d);
      a($$0, clr.xn, e);
      a($$0, clr.xo, f);
      a($$0, clr.xp, g);
      a($$0, clr.xq, h);
      a($$0, clr.xr, i);
      a($$0, clr.xs, j);
      a($$0, clr.xt, k);
      a($$0, clr.xu, l);
      a($$0, clr.xv, m);
      a($$0, clr.xw, n);
      a($$0, clr.xx, o);
      a($$0, clr.xy, p);
   }

   public static Optional<ig.c<cnt>> a(it $$0, clo $$1) {
      return $$0.d(kd.aG).h().filter($$1x -> $$1.a(((cnt)$$1x.a()).b())).findFirst();
   }

   private static void a(oz<cnt> $$0, clj $$1, agl<cnt> $$2) {
      cnt $$3 = new cnt($$2.a(), kc.i.d($$1), uv.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static agl<cnt> a(String $$0) {
      return agl.a(kd.aG, new agm($$0));
   }
}
