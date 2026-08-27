import java.util.Optional;

public class crv {
   public static final ajb<cru> a = a("sentry");
   public static final ajb<cru> b = a("dune");
   public static final ajb<cru> c = a("coast");
   public static final ajb<cru> d = a("wild");
   public static final ajb<cru> e = a("ward");
   public static final ajb<cru> f = a("eye");
   public static final ajb<cru> g = a("vex");
   public static final ajb<cru> h = a("tide");
   public static final ajb<cru> i = a("snout");
   public static final ajb<cru> j = a("rib");
   public static final ajb<cru> k = a("spire");
   public static final ajb<cru> l = a("wayfinder");
   public static final ajb<cru> m = a("shaper");
   public static final ajb<cru> n = a("silence");
   public static final ajb<cru> o = a("raiser");
   public static final ajb<cru> p = a("host");

   public static void a(pj<cru> $$0) {
      a($$0, cpt.xn, a);
      a($$0, cpt.xo, b);
      a($$0, cpt.xp, c);
      a($$0, cpt.xq, d);
      a($$0, cpt.xr, e);
      a($$0, cpt.xs, f);
      a($$0, cpt.xt, g);
      a($$0, cpt.xu, h);
      a($$0, cpt.xv, i);
      a($$0, cpt.xw, j);
      a($$0, cpt.xx, k);
      a($$0, cpt.xy, l);
      a($$0, cpt.xz, m);
      a($$0, cpt.xA, n);
      a($$0, cpt.xB, o);
      a($$0, cpt.xC, p);
   }

   public static Optional<il.c<cru>> a(iy $$0, cpq $$1) {
      return $$0.d(ki.aK).h().filter($$1x -> $$1.a(((cru)$$1x.a()).b())).findFirst();
   }

   private static void a(pj<cru> $$0, cpl $$1, ajb<cru> $$2) {
      cru $$3 = new cru($$2.a(), kh.h.e($$1), vs.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ajb<cru> a(String $$0) {
      return ajb.a(ki.aK, new ajc($$0));
   }
}
