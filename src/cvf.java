import java.util.Optional;

public class cvf {
   public static final akg<cve> a = a("sentry");
   public static final akg<cve> b = a("dune");
   public static final akg<cve> c = a("coast");
   public static final akg<cve> d = a("wild");
   public static final akg<cve> e = a("ward");
   public static final akg<cve> f = a("eye");
   public static final akg<cve> g = a("vex");
   public static final akg<cve> h = a("tide");
   public static final akg<cve> i = a("snout");
   public static final akg<cve> j = a("rib");
   public static final akg<cve> k = a("spire");
   public static final akg<cve> l = a("wayfinder");
   public static final akg<cve> m = a("shaper");
   public static final akg<cve> n = a("silence");
   public static final akg<cve> o = a("raiser");
   public static final akg<cve> p = a("host");
   public static final akg<cve> q = a("flow");
   public static final akg<cve> r = a("bolt");

   public static void a(ql<cve> $$0) {
      a($$0, ctc.xt, a);
      a($$0, ctc.xu, b);
      a($$0, ctc.xv, c);
      a($$0, ctc.xw, d);
      a($$0, ctc.xx, e);
      a($$0, ctc.xy, f);
      a($$0, ctc.xz, g);
      a($$0, ctc.xA, h);
      a($$0, ctc.xB, i);
      a($$0, ctc.xC, j);
      a($$0, ctc.xD, k);
      a($$0, ctc.xE, l);
      a($$0, ctc.xF, m);
      a($$0, ctc.xG, n);
      a($$0, ctc.xH, o);
      a($$0, ctc.xI, p);
   }

   public static Optional<iw.c<cve>> a(iy.a $$0, csz $$1) {
      return $$0.b(le.aP).b().filter($$1x -> $$1.a(((cve)$$1x.a()).b())).findFirst();
   }

   public static void a(ql<cve> $$0, csu $$1, akg<cve> $$2) {
      cve $$3 = new cve($$2.a(), ld.h.e($$1), wu.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static akg<cve> a(String $$0) {
      return akg.a(le.aP, new akh($$0));
   }
}
