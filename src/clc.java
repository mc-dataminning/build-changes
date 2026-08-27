import java.util.Optional;

public class clc {
   public static final aeo<clb> a = a("sentry");
   public static final aeo<clb> b = a("dune");
   public static final aeo<clb> c = a("coast");
   public static final aeo<clb> d = a("wild");
   public static final aeo<clb> e = a("ward");
   public static final aeo<clb> f = a("eye");
   public static final aeo<clb> g = a("vex");
   public static final aeo<clb> h = a("tide");
   public static final aeo<clb> i = a("snout");
   public static final aeo<clb> j = a("rib");
   public static final aeo<clb> k = a("spire");
   public static final aeo<clb> l = a("wayfinder");
   public static final aeo<clb> m = a("shaper");
   public static final aeo<clb> n = a("silence");
   public static final aeo<clb> o = a("raiser");
   public static final aeo<clb> p = a("host");

   public static void a(nn<clb> $$0) {
      a($$0, ciz.wx, a);
      a($$0, ciz.wy, b);
      a($$0, ciz.wz, c);
      a($$0, ciz.wA, d);
      a($$0, ciz.wB, e);
      a($$0, ciz.wC, f);
      a($$0, ciz.wD, g);
      a($$0, ciz.wE, h);
      a($$0, ciz.wF, i);
      a($$0, ciz.wG, j);
      a($$0, ciz.wH, k);
      a($$0, ciz.wI, l);
      a($$0, ciz.wJ, m);
      a($$0, ciz.wK, n);
      a($$0, ciz.wL, o);
      a($$0, ciz.wM, p);
   }

   public static Optional<hf.c<clb>> a(ht $$0, ciw $$1) {
      return $$0.d(jd.aE).h().filter($$1x -> $$1.a(((clb)$$1x.a()).b())).findFirst();
   }

   private static void a(nn<clb> $$0, cir $$1, aeo<clb> $$2) {
      clb $$3 = new clb($$2.a(), jc.i.d($$1), te.c(ac.a("trim_pattern", $$2.a())));
      $$0.a($$2, $$3);
   }

   private static aeo<clb> a(String $$0) {
      return aeo.a(jd.aE, new aep($$0));
   }
}
