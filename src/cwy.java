import java.util.Optional;

public class cwy {
   public static final ale<cwx> a = a("sentry");
   public static final ale<cwx> b = a("dune");
   public static final ale<cwx> c = a("coast");
   public static final ale<cwx> d = a("wild");
   public static final ale<cwx> e = a("ward");
   public static final ale<cwx> f = a("eye");
   public static final ale<cwx> g = a("vex");
   public static final ale<cwx> h = a("tide");
   public static final ale<cwx> i = a("snout");
   public static final ale<cwx> j = a("rib");
   public static final ale<cwx> k = a("spire");
   public static final ale<cwx> l = a("wayfinder");
   public static final ale<cwx> m = a("shaper");
   public static final ale<cwx> n = a("silence");
   public static final ale<cwx> o = a("raiser");
   public static final ale<cwx> p = a("host");
   public static final ale<cwx> q = a("flow");
   public static final ale<cwx> r = a("bolt");

   public static void a(rc<cwx> $$0) {
      a($$0, cut.xt, a);
      a($$0, cut.xu, b);
      a($$0, cut.xv, c);
      a($$0, cut.xw, d);
      a($$0, cut.xx, e);
      a($$0, cut.xy, f);
      a($$0, cut.xz, g);
      a($$0, cut.xA, h);
      a($$0, cut.xB, i);
      a($$0, cut.xC, j);
      a($$0, cut.xD, k);
      a($$0, cut.xE, l);
      a($$0, cut.xF, m);
      a($$0, cut.xG, n);
      a($$0, cut.xH, o);
      a($$0, cut.xI, p);
   }

   public static Optional<ji.c<cwx>> a(jk.a $$0, cuq $$1) {
      return $$0.b(lq.aP).b().filter($$1x -> $$1.a(((cwx)$$1x.a()).b())).findFirst();
   }

   public static void a(rc<cwx> $$0, cul $$1, ale<cwx> $$2) {
      cwx $$3 = new cwx($$2.a(), lp.h.e($$1), xp.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ale<cwx> a(String $$0) {
      return ale.a(lq.aP, new alf($$0));
   }
}
