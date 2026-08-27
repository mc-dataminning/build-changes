import java.util.Optional;

public class cle {
   public static final aeq<cld> a = a("sentry");
   public static final aeq<cld> b = a("dune");
   public static final aeq<cld> c = a("coast");
   public static final aeq<cld> d = a("wild");
   public static final aeq<cld> e = a("ward");
   public static final aeq<cld> f = a("eye");
   public static final aeq<cld> g = a("vex");
   public static final aeq<cld> h = a("tide");
   public static final aeq<cld> i = a("snout");
   public static final aeq<cld> j = a("rib");
   public static final aeq<cld> k = a("spire");
   public static final aeq<cld> l = a("wayfinder");
   public static final aeq<cld> m = a("shaper");
   public static final aeq<cld> n = a("silence");
   public static final aeq<cld> o = a("raiser");
   public static final aeq<cld> p = a("host");

   public static void a(nm<cld> $$0) {
      a($$0, cjb.wx, a);
      a($$0, cjb.wy, b);
      a($$0, cjb.wz, c);
      a($$0, cjb.wA, d);
      a($$0, cjb.wB, e);
      a($$0, cjb.wC, f);
      a($$0, cjb.wD, g);
      a($$0, cjb.wE, h);
      a($$0, cjb.wF, i);
      a($$0, cjb.wG, j);
      a($$0, cjb.wH, k);
      a($$0, cjb.wI, l);
      a($$0, cjb.wJ, m);
      a($$0, cjb.wK, n);
      a($$0, cjb.wL, o);
      a($$0, cjb.wM, p);
   }

   public static Optional<he.c<cld>> a(hs $$0, ciy $$1) {
      return $$0.d(jc.aE).h().filter($$1x -> $$1.a(((cld)$$1x.a()).b())).findFirst();
   }

   private static void a(nm<cld> $$0, cit $$1, aeq<cld> $$2) {
      cld $$3 = new cld($$2.a(), jb.i.d($$1), tf.c(ac.a("trim_pattern", $$2.a())));
      $$0.a($$2, $$3);
   }

   private static aeq<cld> a(String $$0) {
      return aeq.a(jc.aE, new aer($$0));
   }
}
