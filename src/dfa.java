import java.util.Optional;

public class dfa {
   public static final aku<dez> a = a("sentry");
   public static final aku<dez> b = a("dune");
   public static final aku<dez> c = a("coast");
   public static final aku<dez> d = a("wild");
   public static final aku<dez> e = a("ward");
   public static final aku<dez> f = a("eye");
   public static final aku<dez> g = a("vex");
   public static final aku<dez> h = a("tide");
   public static final aku<dez> i = a("snout");
   public static final aku<dez> j = a("rib");
   public static final aku<dez> k = a("spire");
   public static final aku<dez> l = a("wayfinder");
   public static final aku<dez> m = a("shaper");
   public static final aku<dez> n = a("silence");
   public static final aku<dez> o = a("raiser");
   public static final aku<dez> p = a("host");
   public static final aku<dez> q = a("flow");
   public static final aku<dez> r = a("bolt");

   public static void a(qe<dez> $$0) {
      a($$0, cwt.yx, a);
      a($$0, cwt.yy, b);
      a($$0, cwt.yz, c);
      a($$0, cwt.yA, d);
      a($$0, cwt.yB, e);
      a($$0, cwt.yC, f);
      a($$0, cwt.yD, g);
      a($$0, cwt.yE, h);
      a($$0, cwt.yF, i);
      a($$0, cwt.yG, j);
      a($$0, cwt.yH, k);
      a($$0, cwt.yI, l);
      a($$0, cwt.yJ, m);
      a($$0, cwt.yK, n);
      a($$0, cwt.yL, o);
      a($$0, cwt.yM, p);
      a($$0, cwt.yN, q);
      a($$0, cwt.yO, r);
   }

   public static Optional<jr.c<dez>> a(jt.a $$0, cwp $$1) {
      return $$0.d(mc.ba).c().filter($$1x -> $$1.a(((dez)$$1x.a()).b())).findFirst();
   }

   public static void a(qe<dez> $$0, cwl $$1, aku<dez> $$2) {
      dez $$3 = new dez($$2.a(), mb.g.e($$1), wp.c(af.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aku<dez> a(String $$0) {
      return aku.a(mc.ba, akv.b($$0));
   }
}
