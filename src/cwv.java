import java.util.Optional;

public class cwv {
   public static final ald<cwu> a = a("sentry");
   public static final ald<cwu> b = a("dune");
   public static final ald<cwu> c = a("coast");
   public static final ald<cwu> d = a("wild");
   public static final ald<cwu> e = a("ward");
   public static final ald<cwu> f = a("eye");
   public static final ald<cwu> g = a("vex");
   public static final ald<cwu> h = a("tide");
   public static final ald<cwu> i = a("snout");
   public static final ald<cwu> j = a("rib");
   public static final ald<cwu> k = a("spire");
   public static final ald<cwu> l = a("wayfinder");
   public static final ald<cwu> m = a("shaper");
   public static final ald<cwu> n = a("silence");
   public static final ald<cwu> o = a("raiser");
   public static final ald<cwu> p = a("host");
   public static final ald<cwu> q = a("flow");
   public static final ald<cwu> r = a("bolt");

   public static void a(rc<cwu> $$0) {
      a($$0, cuq.xt, a);
      a($$0, cuq.xu, b);
      a($$0, cuq.xv, c);
      a($$0, cuq.xw, d);
      a($$0, cuq.xx, e);
      a($$0, cuq.xy, f);
      a($$0, cuq.xz, g);
      a($$0, cuq.xA, h);
      a($$0, cuq.xB, i);
      a($$0, cuq.xC, j);
      a($$0, cuq.xD, k);
      a($$0, cuq.xE, l);
      a($$0, cuq.xF, m);
      a($$0, cuq.xG, n);
      a($$0, cuq.xH, o);
      a($$0, cuq.xI, p);
   }

   public static Optional<ji.c<cwu>> a(jk.a $$0, cun $$1) {
      return $$0.b(lq.aP).b().filter($$1x -> $$1.a(((cwu)$$1x.a()).b())).findFirst();
   }

   public static void a(rc<cwu> $$0, cui $$1, ald<cwu> $$2) {
      cwu $$3 = new cwu($$2.a(), lp.h.e($$1), xo.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ald<cwu> a(String $$0) {
      return ald.a(lq.aP, new ale($$0));
   }
}
