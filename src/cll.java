import java.util.Optional;

public class cll {
   public static final aew<clk> a = a("sentry");
   public static final aew<clk> b = a("dune");
   public static final aew<clk> c = a("coast");
   public static final aew<clk> d = a("wild");
   public static final aew<clk> e = a("ward");
   public static final aew<clk> f = a("eye");
   public static final aew<clk> g = a("vex");
   public static final aew<clk> h = a("tide");
   public static final aew<clk> i = a("snout");
   public static final aew<clk> j = a("rib");
   public static final aew<clk> k = a("spire");
   public static final aew<clk> l = a("wayfinder");
   public static final aew<clk> m = a("shaper");
   public static final aew<clk> n = a("silence");
   public static final aew<clk> o = a("raiser");
   public static final aew<clk> p = a("host");

   public static void a(nt<clk> $$0) {
      a($$0, cji.wx, a);
      a($$0, cji.wy, b);
      a($$0, cji.wz, c);
      a($$0, cji.wA, d);
      a($$0, cji.wB, e);
      a($$0, cji.wC, f);
      a($$0, cji.wD, g);
      a($$0, cji.wE, h);
      a($$0, cji.wF, i);
      a($$0, cji.wG, j);
      a($$0, cji.wH, k);
      a($$0, cji.wI, l);
      a($$0, cji.wJ, m);
      a($$0, cji.wK, n);
      a($$0, cji.wL, o);
      a($$0, cji.wM, p);
   }

   public static Optional<hg.c<clk>> a(hu $$0, cjf $$1) {
      return $$0.d(je.aE).h().filter($$1x -> $$1.a(((clk)$$1x.a()).b())).findFirst();
   }

   private static void a(nt<clk> $$0, cja $$1, aew<clk> $$2) {
      clk $$3 = new clk($$2.a(), jd.i.d($$1), tm.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aew<clk> a(String $$0) {
      return aew.a(je.aE, new aex($$0));
   }
}
