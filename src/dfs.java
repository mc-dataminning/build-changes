import java.util.Optional;

public class dfs {
   public static final akt<dfr> a = a("sentry");
   public static final akt<dfr> b = a("dune");
   public static final akt<dfr> c = a("coast");
   public static final akt<dfr> d = a("wild");
   public static final akt<dfr> e = a("ward");
   public static final akt<dfr> f = a("eye");
   public static final akt<dfr> g = a("vex");
   public static final akt<dfr> h = a("tide");
   public static final akt<dfr> i = a("snout");
   public static final akt<dfr> j = a("rib");
   public static final akt<dfr> k = a("spire");
   public static final akt<dfr> l = a("wayfinder");
   public static final akt<dfr> m = a("shaper");
   public static final akt<dfr> n = a("silence");
   public static final akt<dfr> o = a("raiser");
   public static final akt<dfr> p = a("host");
   public static final akt<dfr> q = a("flow");
   public static final akt<dfr> r = a("bolt");

   public static void a(qe<dfr> $$0) {
      a($$0, cxl.yz, a);
      a($$0, cxl.yA, b);
      a($$0, cxl.yB, c);
      a($$0, cxl.yC, d);
      a($$0, cxl.yD, e);
      a($$0, cxl.yE, f);
      a($$0, cxl.yF, g);
      a($$0, cxl.yG, h);
      a($$0, cxl.yH, i);
      a($$0, cxl.yI, j);
      a($$0, cxl.yJ, k);
      a($$0, cxl.yK, l);
      a($$0, cxl.yL, m);
      a($$0, cxl.yM, n);
      a($$0, cxl.yN, o);
      a($$0, cxl.yO, p);
      a($$0, cxl.yP, q);
      a($$0, cxl.yQ, r);
   }

   public static Optional<jr.c<dfr>> a(jt.a $$0, cxh $$1) {
      return $$0.d(mc.bc).c().filter($$1x -> $$1.a(((dfr)$$1x.a()).b())).findFirst();
   }

   public static void a(qe<dfr> $$0, cxd $$1, akt<dfr> $$2) {
      dfr $$3 = new dfr($$2.a(), mb.g.e($$1), wp.c(af.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akt<dfr> a(String $$0) {
      return akt.a(mc.bc, aku.b($$0));
   }
}
