import java.util.Optional;

public class cwy {
   public static final aks<cwx> a = a("sentry");
   public static final aks<cwx> b = a("dune");
   public static final aks<cwx> c = a("coast");
   public static final aks<cwx> d = a("wild");
   public static final aks<cwx> e = a("ward");
   public static final aks<cwx> f = a("eye");
   public static final aks<cwx> g = a("vex");
   public static final aks<cwx> h = a("tide");
   public static final aks<cwx> i = a("snout");
   public static final aks<cwx> j = a("rib");
   public static final aks<cwx> k = a("spire");
   public static final aks<cwx> l = a("wayfinder");
   public static final aks<cwx> m = a("shaper");
   public static final aks<cwx> n = a("silence");
   public static final aks<cwx> o = a("raiser");
   public static final aks<cwx> p = a("host");
   public static final aks<cwx> q = a("flow");
   public static final aks<cwx> r = a("bolt");

   public static void a(qq<cwx> $$0) {
      a($$0, cuk.zg, a);
      a($$0, cuk.zh, b);
      a($$0, cuk.zi, c);
      a($$0, cuk.zj, d);
      a($$0, cuk.zk, e);
      a($$0, cuk.zl, f);
      a($$0, cuk.zm, g);
      a($$0, cuk.zn, h);
      a($$0, cuk.zo, i);
      a($$0, cuk.zp, j);
      a($$0, cuk.zq, k);
      a($$0, cuk.zr, l);
      a($$0, cuk.zs, m);
      a($$0, cuk.zt, n);
      a($$0, cuk.zu, o);
      a($$0, cuk.zv, p);
   }

   public static Optional<ja.c<cwx>> a(jc.a $$0, cuh $$1) {
      return $$0.b(li.aP).b().filter($$1x -> $$1.a(((cwx)$$1x.a()).b())).findFirst();
   }

   public static void a(qq<cwx> $$0, cuc $$1, aks<cwx> $$2) {
      cwx $$3 = new cwx($$2.a(), lh.h.e($$1), xe.c(ad.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aks<cwx> a(String $$0) {
      return aks.a(li.aP, new akt($$0));
   }
}
