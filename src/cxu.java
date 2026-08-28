import java.util.Optional;

public class cxu {
   public static final ala<cxt> a = a("sentry");
   public static final ala<cxt> b = a("dune");
   public static final ala<cxt> c = a("coast");
   public static final ala<cxt> d = a("wild");
   public static final ala<cxt> e = a("ward");
   public static final ala<cxt> f = a("eye");
   public static final ala<cxt> g = a("vex");
   public static final ala<cxt> h = a("tide");
   public static final ala<cxt> i = a("snout");
   public static final ala<cxt> j = a("rib");
   public static final ala<cxt> k = a("spire");
   public static final ala<cxt> l = a("wayfinder");
   public static final ala<cxt> m = a("shaper");
   public static final ala<cxt> n = a("silence");
   public static final ala<cxt> o = a("raiser");
   public static final ala<cxt> p = a("host");
   public static final ala<cxt> q = a("flow");
   public static final ala<cxt> r = a("bolt");

   public static void a(qt<cxt> $$0) {
      a($$0, cvo.xz, a);
      a($$0, cvo.xA, b);
      a($$0, cvo.xB, c);
      a($$0, cvo.xC, d);
      a($$0, cvo.xD, e);
      a($$0, cvo.xE, f);
      a($$0, cvo.xF, g);
      a($$0, cvo.xG, h);
      a($$0, cvo.xH, i);
      a($$0, cvo.xI, j);
      a($$0, cvo.xJ, k);
      a($$0, cvo.xK, l);
      a($$0, cvo.xL, m);
      a($$0, cvo.xM, n);
      a($$0, cvo.xN, o);
      a($$0, cvo.xO, p);
      a($$0, cvo.xP, q);
      a($$0, cvo.xQ, r);
   }

   public static Optional<jn.c<cxt>> a(jp.a $$0, cvl $$1) {
      return $$0.b(lv.aX).b().filter($$1x -> $$1.a(((cxt)$$1x.a()).b())).findFirst();
   }

   public static void a(qt<cxt> $$0, cvg $$1, ala<cxt> $$2) {
      cxt $$3 = new cxt($$2.a(), lu.g.e($$1), xd.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ala<cxt> a(String $$0) {
      return ala.a(lv.aX, alb.b($$0));
   }
}
