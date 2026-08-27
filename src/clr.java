import java.util.Optional;

public class clr {
   public static final aey<clq> a = a("sentry");
   public static final aey<clq> b = a("dune");
   public static final aey<clq> c = a("coast");
   public static final aey<clq> d = a("wild");
   public static final aey<clq> e = a("ward");
   public static final aey<clq> f = a("eye");
   public static final aey<clq> g = a("vex");
   public static final aey<clq> h = a("tide");
   public static final aey<clq> i = a("snout");
   public static final aey<clq> j = a("rib");
   public static final aey<clq> k = a("spire");
   public static final aey<clq> l = a("wayfinder");
   public static final aey<clq> m = a("shaper");
   public static final aey<clq> n = a("silence");
   public static final aey<clq> o = a("raiser");
   public static final aey<clq> p = a("host");

   public static void a(nr<clq> $$0) {
      a($$0, cjo.wx, a);
      a($$0, cjo.wy, b);
      a($$0, cjo.wz, c);
      a($$0, cjo.wA, d);
      a($$0, cjo.wB, e);
      a($$0, cjo.wC, f);
      a($$0, cjo.wD, g);
      a($$0, cjo.wE, h);
      a($$0, cjo.wF, i);
      a($$0, cjo.wG, j);
      a($$0, cjo.wH, k);
      a($$0, cjo.wI, l);
      a($$0, cjo.wJ, m);
      a($$0, cjo.wK, n);
      a($$0, cjo.wL, o);
      a($$0, cjo.wM, p);
   }

   public static Optional<he.c<clq>> a(hr $$0, cjl $$1) {
      return $$0.d(jc.aF).h().filter($$1x -> $$1.a(((clq)$$1x.a()).b())).findFirst();
   }

   private static void a(nr<clq> $$0, cjg $$1, aey<clq> $$2) {
      clq $$3 = new clq($$2.a(), jb.i.d($$1), tl.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aey<clq> a(String $$0) {
      return aey.a(jc.aF, new aez($$0));
   }
}
