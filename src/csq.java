import java.util.Optional;

public class csq {
   public static final ajg<csp> a = a("sentry");
   public static final ajg<csp> b = a("dune");
   public static final ajg<csp> c = a("coast");
   public static final ajg<csp> d = a("wild");
   public static final ajg<csp> e = a("ward");
   public static final ajg<csp> f = a("eye");
   public static final ajg<csp> g = a("vex");
   public static final ajg<csp> h = a("tide");
   public static final ajg<csp> i = a("snout");
   public static final ajg<csp> j = a("rib");
   public static final ajg<csp> k = a("spire");
   public static final ajg<csp> l = a("wayfinder");
   public static final ajg<csp> m = a("shaper");
   public static final ajg<csp> n = a("silence");
   public static final ajg<csp> o = a("raiser");
   public static final ajg<csp> p = a("host");

   public static void a(pl<csp> $$0) {
      a($$0, cqn.xo, a);
      a($$0, cqn.xp, b);
      a($$0, cqn.xq, c);
      a($$0, cqn.xr, d);
      a($$0, cqn.xs, e);
      a($$0, cqn.xt, f);
      a($$0, cqn.xu, g);
      a($$0, cqn.xv, h);
      a($$0, cqn.xw, i);
      a($$0, cqn.xx, j);
      a($$0, cqn.xy, k);
      a($$0, cqn.xz, l);
      a($$0, cqn.xA, m);
      a($$0, cqn.xB, n);
      a($$0, cqn.xC, o);
      a($$0, cqn.xD, p);
   }

   public static Optional<il.c<csp>> a(iz $$0, cqk $$1) {
      return $$0.d(kj.aK).h().filter($$1x -> $$1.a(((csp)$$1x.a()).b())).findFirst();
   }

   private static void a(pl<csp> $$0, cqf $$1, ajg<csp> $$2) {
      csp $$3 = new csp($$2.a(), ki.h.e($$1), vu.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ajg<csp> a(String $$0) {
      return ajg.a(kj.aK, new ajh($$0));
   }
}
