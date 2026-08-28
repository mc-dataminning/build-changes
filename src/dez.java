import java.util.Optional;

public class dez {
   public static final aku<dey> a = a("sentry");
   public static final aku<dey> b = a("dune");
   public static final aku<dey> c = a("coast");
   public static final aku<dey> d = a("wild");
   public static final aku<dey> e = a("ward");
   public static final aku<dey> f = a("eye");
   public static final aku<dey> g = a("vex");
   public static final aku<dey> h = a("tide");
   public static final aku<dey> i = a("snout");
   public static final aku<dey> j = a("rib");
   public static final aku<dey> k = a("spire");
   public static final aku<dey> l = a("wayfinder");
   public static final aku<dey> m = a("shaper");
   public static final aku<dey> n = a("silence");
   public static final aku<dey> o = a("raiser");
   public static final aku<dey> p = a("host");
   public static final aku<dey> q = a("flow");
   public static final aku<dey> r = a("bolt");

   public static void a(qe<dey> $$0) {
      a($$0, cws.yx, a);
      a($$0, cws.yy, b);
      a($$0, cws.yz, c);
      a($$0, cws.yA, d);
      a($$0, cws.yB, e);
      a($$0, cws.yC, f);
      a($$0, cws.yD, g);
      a($$0, cws.yE, h);
      a($$0, cws.yF, i);
      a($$0, cws.yG, j);
      a($$0, cws.yH, k);
      a($$0, cws.yI, l);
      a($$0, cws.yJ, m);
      a($$0, cws.yK, n);
      a($$0, cws.yL, o);
      a($$0, cws.yM, p);
      a($$0, cws.yN, q);
      a($$0, cws.yO, r);
   }

   public static Optional<jr.c<dey>> a(jt.a $$0, cwo $$1) {
      return $$0.d(mc.ba).c().filter($$1x -> $$1.a(((dey)$$1x.a()).b())).findFirst();
   }

   public static void a(qe<dey> $$0, cwk $$1, aku<dey> $$2) {
      dey $$3 = new dey($$2.a(), mb.g.e($$1), wp.c(af.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aku<dey> a(String $$0) {
      return aku.a(mc.ba, akv.b($$0));
   }
}
