import java.util.Optional;

public class cnh {
   public static final agf<cng> a = a("sentry");
   public static final agf<cng> b = a("dune");
   public static final agf<cng> c = a("coast");
   public static final agf<cng> d = a("wild");
   public static final agf<cng> e = a("ward");
   public static final agf<cng> f = a("eye");
   public static final agf<cng> g = a("vex");
   public static final agf<cng> h = a("tide");
   public static final agf<cng> i = a("snout");
   public static final agf<cng> j = a("rib");
   public static final agf<cng> k = a("spire");
   public static final agf<cng> l = a("wayfinder");
   public static final agf<cng> m = a("shaper");
   public static final agf<cng> n = a("silence");
   public static final agf<cng> o = a("raiser");
   public static final agf<cng> p = a("host");

   public static void a(ou<cng> $$0) {
      a($$0, cle.wy, a);
      a($$0, cle.wz, b);
      a($$0, cle.wA, c);
      a($$0, cle.wB, d);
      a($$0, cle.wC, e);
      a($$0, cle.wD, f);
      a($$0, cle.wE, g);
      a($$0, cle.wF, h);
      a($$0, cle.wG, i);
      a($$0, cle.wH, j);
      a($$0, cle.wI, k);
      a($$0, cle.wJ, l);
      a($$0, cle.wK, m);
      a($$0, cle.wL, n);
      a($$0, cle.wM, o);
      a($$0, cle.wN, p);
   }

   public static Optional<ib.c<cng>> a(ip $$0, clb $$1) {
      return $$0.d(jz.aG).h().filter($$1x -> $$1.a(((cng)$$1x.a()).b())).findFirst();
   }

   private static void a(ou<cng> $$0, ckw $$1, agf<cng> $$2) {
      cng $$3 = new cng($$2.a(), jy.i.d($$1), ur.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static agf<cng> a(String $$0) {
      return agf.a(jz.aG, new agg($$0));
   }
}
