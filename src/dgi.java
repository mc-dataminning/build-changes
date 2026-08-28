import java.util.Optional;

public class dgi {
   public static final alc<dgh> a = a("sentry");
   public static final alc<dgh> b = a("dune");
   public static final alc<dgh> c = a("coast");
   public static final alc<dgh> d = a("wild");
   public static final alc<dgh> e = a("ward");
   public static final alc<dgh> f = a("eye");
   public static final alc<dgh> g = a("vex");
   public static final alc<dgh> h = a("tide");
   public static final alc<dgh> i = a("snout");
   public static final alc<dgh> j = a("rib");
   public static final alc<dgh> k = a("spire");
   public static final alc<dgh> l = a("wayfinder");
   public static final alc<dgh> m = a("shaper");
   public static final alc<dgh> n = a("silence");
   public static final alc<dgh> o = a("raiser");
   public static final alc<dgh> p = a("host");
   public static final alc<dgh> q = a("flow");
   public static final alc<dgh> r = a("bolt");

   public static void a(qg<dgh> $$0) {
      a($$0, cyc.yB, a);
      a($$0, cyc.yC, b);
      a($$0, cyc.yD, c);
      a($$0, cyc.yE, d);
      a($$0, cyc.yF, e);
      a($$0, cyc.yG, f);
      a($$0, cyc.yH, g);
      a($$0, cyc.yI, h);
      a($$0, cyc.yJ, i);
      a($$0, cyc.yK, j);
      a($$0, cyc.yL, k);
      a($$0, cyc.yM, l);
      a($$0, cyc.yN, m);
      a($$0, cyc.yO, n);
      a($$0, cyc.yP, o);
      a($$0, cyc.yQ, p);
      a($$0, cyc.yR, q);
      a($$0, cyc.yS, r);
   }

   public static Optional<js.c<dgh>> a(ju.a $$0, cxy $$1) {
      return $$0.e(me.bh).c().filter($$1x -> $$1.a(((dgh)$$1x.a()).b())).findFirst();
   }

   public static void a(qg<dgh> $$0, cxu $$1, alc<dgh> $$2) {
      dgh $$3 = new dgh($$2.a(), md.g.e($$1), wv.c(af.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static alc<dgh> a(String $$0) {
      return alc.a(me.bh, ald.b($$0));
   }
}
