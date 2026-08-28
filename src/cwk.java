import java.util.Optional;

public class cwk {
   public static final akj<cwj> a = a("sentry");
   public static final akj<cwj> b = a("dune");
   public static final akj<cwj> c = a("coast");
   public static final akj<cwj> d = a("wild");
   public static final akj<cwj> e = a("ward");
   public static final akj<cwj> f = a("eye");
   public static final akj<cwj> g = a("vex");
   public static final akj<cwj> h = a("tide");
   public static final akj<cwj> i = a("snout");
   public static final akj<cwj> j = a("rib");
   public static final akj<cwj> k = a("spire");
   public static final akj<cwj> l = a("wayfinder");
   public static final akj<cwj> m = a("shaper");
   public static final akj<cwj> n = a("silence");
   public static final akj<cwj> o = a("raiser");
   public static final akj<cwj> p = a("host");
   public static final akj<cwj> q = a("flow");
   public static final akj<cwj> r = a("bolt");

   public static void a(qm<cwj> $$0) {
      a($$0, cuf.xw, a);
      a($$0, cuf.xx, b);
      a($$0, cuf.xy, c);
      a($$0, cuf.xz, d);
      a($$0, cuf.xA, e);
      a($$0, cuf.xB, f);
      a($$0, cuf.xC, g);
      a($$0, cuf.xD, h);
      a($$0, cuf.xE, i);
      a($$0, cuf.xF, j);
      a($$0, cuf.xG, k);
      a($$0, cuf.xH, l);
      a($$0, cuf.xI, m);
      a($$0, cuf.xJ, n);
      a($$0, cuf.xK, o);
      a($$0, cuf.xL, p);
      a($$0, cuf.xM, q);
      a($$0, cuf.xN, r);
   }

   public static Optional<jj.c<cwj>> a(jl.a $$0, cuc $$1) {
      return $$0.b(lr.aW).b().filter($$1x -> $$1.a(((cwj)$$1x.a()).b())).findFirst();
   }

   public static void a(qm<cwj> $$0, ctx $$1, akj<cwj> $$2) {
      cwj $$3 = new cwj($$2.a(), lq.g.e($$1), wu.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akj<cwj> a(String $$0) {
      return akj.a(lr.aW, new akk($$0));
   }
}
