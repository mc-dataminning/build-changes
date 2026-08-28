import java.util.Optional;

public class dfb {
   public static final aku<dfa> a = a("sentry");
   public static final aku<dfa> b = a("dune");
   public static final aku<dfa> c = a("coast");
   public static final aku<dfa> d = a("wild");
   public static final aku<dfa> e = a("ward");
   public static final aku<dfa> f = a("eye");
   public static final aku<dfa> g = a("vex");
   public static final aku<dfa> h = a("tide");
   public static final aku<dfa> i = a("snout");
   public static final aku<dfa> j = a("rib");
   public static final aku<dfa> k = a("spire");
   public static final aku<dfa> l = a("wayfinder");
   public static final aku<dfa> m = a("shaper");
   public static final aku<dfa> n = a("silence");
   public static final aku<dfa> o = a("raiser");
   public static final aku<dfa> p = a("host");
   public static final aku<dfa> q = a("flow");
   public static final aku<dfa> r = a("bolt");

   public static void a(qe<dfa> $$0) {
      a($$0, cwu.yx, a);
      a($$0, cwu.yy, b);
      a($$0, cwu.yz, c);
      a($$0, cwu.yA, d);
      a($$0, cwu.yB, e);
      a($$0, cwu.yC, f);
      a($$0, cwu.yD, g);
      a($$0, cwu.yE, h);
      a($$0, cwu.yF, i);
      a($$0, cwu.yG, j);
      a($$0, cwu.yH, k);
      a($$0, cwu.yI, l);
      a($$0, cwu.yJ, m);
      a($$0, cwu.yK, n);
      a($$0, cwu.yL, o);
      a($$0, cwu.yM, p);
      a($$0, cwu.yN, q);
      a($$0, cwu.yO, r);
   }

   public static Optional<jr.c<dfa>> a(jt.a $$0, cwq $$1) {
      return $$0.d(mc.ba).c().filter($$1x -> $$1.a(((dfa)$$1x.a()).b())).findFirst();
   }

   public static void a(qe<dfa> $$0, cwm $$1, aku<dfa> $$2) {
      dfa $$3 = new dfa($$2.a(), mb.g.e($$1), wp.c(af.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aku<dfa> a(String $$0) {
      return aku.a(mc.ba, akv.b($$0));
   }
}
