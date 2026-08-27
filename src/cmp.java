import java.util.Optional;

public class cmp {
   public static final afv<cmo> a = a("sentry");
   public static final afv<cmo> b = a("dune");
   public static final afv<cmo> c = a("coast");
   public static final afv<cmo> d = a("wild");
   public static final afv<cmo> e = a("ward");
   public static final afv<cmo> f = a("eye");
   public static final afv<cmo> g = a("vex");
   public static final afv<cmo> h = a("tide");
   public static final afv<cmo> i = a("snout");
   public static final afv<cmo> j = a("rib");
   public static final afv<cmo> k = a("spire");
   public static final afv<cmo> l = a("wayfinder");
   public static final afv<cmo> m = a("shaper");
   public static final afv<cmo> n = a("silence");
   public static final afv<cmo> o = a("raiser");
   public static final afv<cmo> p = a("host");

   public static void a(oo<cmo> $$0) {
      a($$0, ckm.wx, a);
      a($$0, ckm.wy, b);
      a($$0, ckm.wz, c);
      a($$0, ckm.wA, d);
      a($$0, ckm.wB, e);
      a($$0, ckm.wC, f);
      a($$0, ckm.wD, g);
      a($$0, ckm.wE, h);
      a($$0, ckm.wF, i);
      a($$0, ckm.wG, j);
      a($$0, ckm.wH, k);
      a($$0, ckm.wI, l);
      a($$0, ckm.wJ, m);
      a($$0, ckm.wK, n);
      a($$0, ckm.wL, o);
      a($$0, ckm.wM, p);
   }

   public static Optional<ib.c<cmo>> a(ip $$0, ckj $$1) {
      return $$0.d(jz.aF).h().filter($$1x -> $$1.a(((cmo)$$1x.a()).b())).findFirst();
   }

   private static void a(oo<cmo> $$0, cke $$1, afv<cmo> $$2) {
      cmo $$3 = new cmo($$2.a(), jy.i.d($$1), ui.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static afv<cmo> a(String $$0) {
      return afv.a(jz.aF, new afw($$0));
   }
}
