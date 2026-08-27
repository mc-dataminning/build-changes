import java.util.Optional;

public class cif {
   public static final acp<cie> a = a("sentry");
   public static final acp<cie> b = a("dune");
   public static final acp<cie> c = a("coast");
   public static final acp<cie> d = a("wild");
   public static final acp<cie> e = a("ward");
   public static final acp<cie> f = a("eye");
   public static final acp<cie> g = a("vex");
   public static final acp<cie> h = a("tide");
   public static final acp<cie> i = a("snout");
   public static final acp<cie> j = a("rib");
   public static final acp<cie> k = a("spire");
   public static final acp<cie> l = a("wayfinder");
   public static final acp<cie> m = a("shaper");
   public static final acp<cie> n = a("silence");
   public static final acp<cie> o = a("raiser");
   public static final acp<cie> p = a("host");

   public static void a(nm<cie> $$0) {
      a($$0, cgc.wx, a);
      a($$0, cgc.wy, b);
      a($$0, cgc.wz, c);
      a($$0, cgc.wA, d);
      a($$0, cgc.wB, e);
      a($$0, cgc.wC, f);
      a($$0, cgc.wD, g);
      a($$0, cgc.wE, h);
      a($$0, cgc.wF, i);
      a($$0, cgc.wG, j);
      a($$0, cgc.wH, k);
      a($$0, cgc.wI, l);
      a($$0, cgc.wJ, m);
      a($$0, cgc.wK, n);
      a($$0, cgc.wL, o);
      a($$0, cgc.wM, p);
   }

   public static Optional<he.c<cie>> a(hs $$0, cfz $$1) {
      return $$0.d(jc.aE).h().filter($$1x -> $$1.a(((cie)$$1x.a()).b())).findFirst();
   }

   private static void a(nm<cie> $$0, cfu $$1, acp<cie> $$2) {
      cie $$3 = new cie($$2.a(), jb.i.d($$1), sw.c(ac.a("trim_pattern", $$2.a())));
      $$0.a($$2, $$3);
   }

   private static acp<cie> a(String $$0) {
      return acp.a(jc.aE, new acq($$0));
   }
}
