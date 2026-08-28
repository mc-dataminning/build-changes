import java.util.Optional;

public class cwi {
   public static final akj<cwh> a = a("sentry");
   public static final akj<cwh> b = a("dune");
   public static final akj<cwh> c = a("coast");
   public static final akj<cwh> d = a("wild");
   public static final akj<cwh> e = a("ward");
   public static final akj<cwh> f = a("eye");
   public static final akj<cwh> g = a("vex");
   public static final akj<cwh> h = a("tide");
   public static final akj<cwh> i = a("snout");
   public static final akj<cwh> j = a("rib");
   public static final akj<cwh> k = a("spire");
   public static final akj<cwh> l = a("wayfinder");
   public static final akj<cwh> m = a("shaper");
   public static final akj<cwh> n = a("silence");
   public static final akj<cwh> o = a("raiser");
   public static final akj<cwh> p = a("host");
   public static final akj<cwh> q = a("flow");
   public static final akj<cwh> r = a("bolt");

   public static void a(qm<cwh> $$0) {
      a($$0, cud.xw, a);
      a($$0, cud.xx, b);
      a($$0, cud.xy, c);
      a($$0, cud.xz, d);
      a($$0, cud.xA, e);
      a($$0, cud.xB, f);
      a($$0, cud.xC, g);
      a($$0, cud.xD, h);
      a($$0, cud.xE, i);
      a($$0, cud.xF, j);
      a($$0, cud.xG, k);
      a($$0, cud.xH, l);
      a($$0, cud.xI, m);
      a($$0, cud.xJ, n);
      a($$0, cud.xK, o);
      a($$0, cud.xL, p);
      a($$0, cud.xM, q);
      a($$0, cud.xN, r);
   }

   public static Optional<jj.c<cwh>> a(jl.a $$0, cua $$1) {
      return $$0.b(lr.aW).b().filter($$1x -> $$1.a(((cwh)$$1x.a()).b())).findFirst();
   }

   public static void a(qm<cwh> $$0, ctv $$1, akj<cwh> $$2) {
      cwh $$3 = new cwh($$2.a(), lq.g.e($$1), wu.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akj<cwh> a(String $$0) {
      return akj.a(lr.aW, new akk($$0));
   }
}
