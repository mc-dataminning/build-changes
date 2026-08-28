import java.util.Optional;

public class dey {
   public static final akt<dex> a = a("sentry");
   public static final akt<dex> b = a("dune");
   public static final akt<dex> c = a("coast");
   public static final akt<dex> d = a("wild");
   public static final akt<dex> e = a("ward");
   public static final akt<dex> f = a("eye");
   public static final akt<dex> g = a("vex");
   public static final akt<dex> h = a("tide");
   public static final akt<dex> i = a("snout");
   public static final akt<dex> j = a("rib");
   public static final akt<dex> k = a("spire");
   public static final akt<dex> l = a("wayfinder");
   public static final akt<dex> m = a("shaper");
   public static final akt<dex> n = a("silence");
   public static final akt<dex> o = a("raiser");
   public static final akt<dex> p = a("host");
   public static final akt<dex> q = a("flow");
   public static final akt<dex> r = a("bolt");

   public static void a(qe<dex> $$0) {
      a($$0, cwr.yx, a);
      a($$0, cwr.yy, b);
      a($$0, cwr.yz, c);
      a($$0, cwr.yA, d);
      a($$0, cwr.yB, e);
      a($$0, cwr.yC, f);
      a($$0, cwr.yD, g);
      a($$0, cwr.yE, h);
      a($$0, cwr.yF, i);
      a($$0, cwr.yG, j);
      a($$0, cwr.yH, k);
      a($$0, cwr.yI, l);
      a($$0, cwr.yJ, m);
      a($$0, cwr.yK, n);
      a($$0, cwr.yL, o);
      a($$0, cwr.yM, p);
      a($$0, cwr.yN, q);
      a($$0, cwr.yO, r);
   }

   public static Optional<jr.c<dex>> a(jt.a $$0, cwn $$1) {
      return $$0.d(mc.ba).c().filter($$1x -> $$1.a(((dex)$$1x.a()).b())).findFirst();
   }

   public static void a(qe<dex> $$0, cwj $$1, akt<dex> $$2) {
      dex $$3 = new dex($$2.a(), mb.g.e($$1), wo.c(af.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akt<dex> a(String $$0) {
      return akt.a(mc.ba, aku.b($$0));
   }
}
