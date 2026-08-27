import java.util.Optional;

public class cll {
   public static final aev<clk> a = a("sentry");
   public static final aev<clk> b = a("dune");
   public static final aev<clk> c = a("coast");
   public static final aev<clk> d = a("wild");
   public static final aev<clk> e = a("ward");
   public static final aev<clk> f = a("eye");
   public static final aev<clk> g = a("vex");
   public static final aev<clk> h = a("tide");
   public static final aev<clk> i = a("snout");
   public static final aev<clk> j = a("rib");
   public static final aev<clk> k = a("spire");
   public static final aev<clk> l = a("wayfinder");
   public static final aev<clk> m = a("shaper");
   public static final aev<clk> n = a("silence");
   public static final aev<clk> o = a("raiser");
   public static final aev<clk> p = a("host");

   public static void a(nr<clk> $$0) {
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

   public static Optional<he.c<clk>> a(hr $$0, cjf $$1) {
      return $$0.d(jc.aE).h().filter($$1x -> $$1.a(((clk)$$1x.a()).b())).findFirst();
   }

   private static void a(nr<clk> $$0, cja $$1, aev<clk> $$2) {
      clk $$3 = new clk($$2.a(), jb.i.d($$1), tl.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aev<clk> a(String $$0) {
      return aev.a(jc.aE, new aew($$0));
   }
}
