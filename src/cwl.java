import java.util.Optional;

public class cwl {
   public static final akj<cwk> a = a("sentry");
   public static final akj<cwk> b = a("dune");
   public static final akj<cwk> c = a("coast");
   public static final akj<cwk> d = a("wild");
   public static final akj<cwk> e = a("ward");
   public static final akj<cwk> f = a("eye");
   public static final akj<cwk> g = a("vex");
   public static final akj<cwk> h = a("tide");
   public static final akj<cwk> i = a("snout");
   public static final akj<cwk> j = a("rib");
   public static final akj<cwk> k = a("spire");
   public static final akj<cwk> l = a("wayfinder");
   public static final akj<cwk> m = a("shaper");
   public static final akj<cwk> n = a("silence");
   public static final akj<cwk> o = a("raiser");
   public static final akj<cwk> p = a("host");
   public static final akj<cwk> q = a("flow");
   public static final akj<cwk> r = a("bolt");

   public static void a(qm<cwk> $$0) {
      a($$0, cug.xw, a);
      a($$0, cug.xx, b);
      a($$0, cug.xy, c);
      a($$0, cug.xz, d);
      a($$0, cug.xA, e);
      a($$0, cug.xB, f);
      a($$0, cug.xC, g);
      a($$0, cug.xD, h);
      a($$0, cug.xE, i);
      a($$0, cug.xF, j);
      a($$0, cug.xG, k);
      a($$0, cug.xH, l);
      a($$0, cug.xI, m);
      a($$0, cug.xJ, n);
      a($$0, cug.xK, o);
      a($$0, cug.xL, p);
      a($$0, cug.xM, q);
      a($$0, cug.xN, r);
   }

   public static Optional<jj.c<cwk>> a(jl.a $$0, cud $$1) {
      return $$0.b(lr.aW).b().filter($$1x -> $$1.a(((cwk)$$1x.a()).b())).findFirst();
   }

   public static void a(qm<cwk> $$0, cty $$1, akj<cwk> $$2) {
      cwk $$3 = new cwk($$2.a(), lq.g.e($$1), wu.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akj<cwk> a(String $$0) {
      return akj.a(lr.aW, new akk($$0));
   }
}
