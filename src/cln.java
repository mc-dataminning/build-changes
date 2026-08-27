import java.util.Optional;

public class cln {
   public static final aex<clm> a = a("sentry");
   public static final aex<clm> b = a("dune");
   public static final aex<clm> c = a("coast");
   public static final aex<clm> d = a("wild");
   public static final aex<clm> e = a("ward");
   public static final aex<clm> f = a("eye");
   public static final aex<clm> g = a("vex");
   public static final aex<clm> h = a("tide");
   public static final aex<clm> i = a("snout");
   public static final aex<clm> j = a("rib");
   public static final aex<clm> k = a("spire");
   public static final aex<clm> l = a("wayfinder");
   public static final aex<clm> m = a("shaper");
   public static final aex<clm> n = a("silence");
   public static final aex<clm> o = a("raiser");
   public static final aex<clm> p = a("host");

   public static void a(nt<clm> $$0) {
      a($$0, cjk.wx, a);
      a($$0, cjk.wy, b);
      a($$0, cjk.wz, c);
      a($$0, cjk.wA, d);
      a($$0, cjk.wB, e);
      a($$0, cjk.wC, f);
      a($$0, cjk.wD, g);
      a($$0, cjk.wE, h);
      a($$0, cjk.wF, i);
      a($$0, cjk.wG, j);
      a($$0, cjk.wH, k);
      a($$0, cjk.wI, l);
      a($$0, cjk.wJ, m);
      a($$0, cjk.wK, n);
      a($$0, cjk.wL, o);
      a($$0, cjk.wM, p);
   }

   public static Optional<hg.c<clm>> a(hu $$0, cjh $$1) {
      return $$0.d(je.aE).h().filter($$1x -> $$1.a(((clm)$$1x.a()).b())).findFirst();
   }

   private static void a(nt<clm> $$0, cjc $$1, aex<clm> $$2) {
      clm $$3 = new clm($$2.a(), jd.i.d($$1), tn.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aex<clm> a(String $$0) {
      return aex.a(je.aE, new aey($$0));
   }
}
