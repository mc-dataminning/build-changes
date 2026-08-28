import java.util.Optional;

public class cxy {
   public static final ald<cxx> a = a("sentry");
   public static final ald<cxx> b = a("dune");
   public static final ald<cxx> c = a("coast");
   public static final ald<cxx> d = a("wild");
   public static final ald<cxx> e = a("ward");
   public static final ald<cxx> f = a("eye");
   public static final ald<cxx> g = a("vex");
   public static final ald<cxx> h = a("tide");
   public static final ald<cxx> i = a("snout");
   public static final ald<cxx> j = a("rib");
   public static final ald<cxx> k = a("spire");
   public static final ald<cxx> l = a("wayfinder");
   public static final ald<cxx> m = a("shaper");
   public static final ald<cxx> n = a("silence");
   public static final ald<cxx> o = a("raiser");
   public static final ald<cxx> p = a("host");
   public static final ald<cxx> q = a("flow");
   public static final ald<cxx> r = a("bolt");

   public static void a(qu<cxx> $$0) {
      a($$0, cvw.xz, a);
      a($$0, cvw.xA, b);
      a($$0, cvw.xB, c);
      a($$0, cvw.xC, d);
      a($$0, cvw.xD, e);
      a($$0, cvw.xE, f);
      a($$0, cvw.xF, g);
      a($$0, cvw.xG, h);
      a($$0, cvw.xH, i);
      a($$0, cvw.xI, j);
      a($$0, cvw.xJ, k);
      a($$0, cvw.xK, l);
      a($$0, cvw.xL, m);
      a($$0, cvw.xM, n);
      a($$0, cvw.xN, o);
      a($$0, cvw.xO, p);
      a($$0, cvw.xP, q);
      a($$0, cvw.xQ, r);
   }

   public static Optional<jo.c<cxx>> a(jq.a $$0, cvs $$1) {
      return $$0.d(lw.aZ).c().filter($$1x -> $$1.a(((cxx)$$1x.a()).b())).findFirst();
   }

   public static void a(qu<cxx> $$0, cvn $$1, ald<cxx> $$2) {
      cxx $$3 = new cxx($$2.a(), lv.g.e($$1), xe.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ald<cxx> a(String $$0) {
      return ald.a(lw.aZ, ale.b($$0));
   }
}
