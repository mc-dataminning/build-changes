import java.util.Optional;

public class cld {
   public static final aeq<clc> a = a("sentry");
   public static final aeq<clc> b = a("dune");
   public static final aeq<clc> c = a("coast");
   public static final aeq<clc> d = a("wild");
   public static final aeq<clc> e = a("ward");
   public static final aeq<clc> f = a("eye");
   public static final aeq<clc> g = a("vex");
   public static final aeq<clc> h = a("tide");
   public static final aeq<clc> i = a("snout");
   public static final aeq<clc> j = a("rib");
   public static final aeq<clc> k = a("spire");
   public static final aeq<clc> l = a("wayfinder");
   public static final aeq<clc> m = a("shaper");
   public static final aeq<clc> n = a("silence");
   public static final aeq<clc> o = a("raiser");
   public static final aeq<clc> p = a("host");

   public static void a(nm<clc> $$0) {
      a($$0, cja.wx, a);
      a($$0, cja.wy, b);
      a($$0, cja.wz, c);
      a($$0, cja.wA, d);
      a($$0, cja.wB, e);
      a($$0, cja.wC, f);
      a($$0, cja.wD, g);
      a($$0, cja.wE, h);
      a($$0, cja.wF, i);
      a($$0, cja.wG, j);
      a($$0, cja.wH, k);
      a($$0, cja.wI, l);
      a($$0, cja.wJ, m);
      a($$0, cja.wK, n);
      a($$0, cja.wL, o);
      a($$0, cja.wM, p);
   }

   public static Optional<he.c<clc>> a(hs $$0, cix $$1) {
      return $$0.d(jc.aE).h().filter($$1x -> $$1.a(((clc)$$1x.a()).b())).findFirst();
   }

   private static void a(nm<clc> $$0, cis $$1, aeq<clc> $$2) {
      clc $$3 = new clc($$2.a(), jb.i.d($$1), tf.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aeq<clc> a(String $$0) {
      return aeq.a(jc.aE, new aer($$0));
   }
}
