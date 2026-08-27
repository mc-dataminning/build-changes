import java.util.Optional;

public class css {
   public static final ajg<csr> a = a("sentry");
   public static final ajg<csr> b = a("dune");
   public static final ajg<csr> c = a("coast");
   public static final ajg<csr> d = a("wild");
   public static final ajg<csr> e = a("ward");
   public static final ajg<csr> f = a("eye");
   public static final ajg<csr> g = a("vex");
   public static final ajg<csr> h = a("tide");
   public static final ajg<csr> i = a("snout");
   public static final ajg<csr> j = a("rib");
   public static final ajg<csr> k = a("spire");
   public static final ajg<csr> l = a("wayfinder");
   public static final ajg<csr> m = a("shaper");
   public static final ajg<csr> n = a("silence");
   public static final ajg<csr> o = a("raiser");
   public static final ajg<csr> p = a("host");

   public static void a(pl<csr> $$0) {
      a($$0, cqp.xp, a);
      a($$0, cqp.xq, b);
      a($$0, cqp.xr, c);
      a($$0, cqp.xs, d);
      a($$0, cqp.xt, e);
      a($$0, cqp.xu, f);
      a($$0, cqp.xv, g);
      a($$0, cqp.xw, h);
      a($$0, cqp.xx, i);
      a($$0, cqp.xy, j);
      a($$0, cqp.xz, k);
      a($$0, cqp.xA, l);
      a($$0, cqp.xB, m);
      a($$0, cqp.xC, n);
      a($$0, cqp.xD, o);
      a($$0, cqp.xE, p);
   }

   public static Optional<il.c<csr>> a(iz $$0, cqm $$1) {
      return $$0.d(kj.aK).h().filter($$1x -> $$1.a(((csr)$$1x.a()).b())).findFirst();
   }

   private static void a(pl<csr> $$0, cqh $$1, ajg<csr> $$2) {
      csr $$3 = new csr($$2.a(), ki.h.e($$1), vu.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ajg<csr> a(String $$0) {
      return ajg.a(kj.aK, new ajh($$0));
   }
}
