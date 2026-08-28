import java.util.Optional;

public class cww {
   public static final ald<cwv> a = a("sentry");
   public static final ald<cwv> b = a("dune");
   public static final ald<cwv> c = a("coast");
   public static final ald<cwv> d = a("wild");
   public static final ald<cwv> e = a("ward");
   public static final ald<cwv> f = a("eye");
   public static final ald<cwv> g = a("vex");
   public static final ald<cwv> h = a("tide");
   public static final ald<cwv> i = a("snout");
   public static final ald<cwv> j = a("rib");
   public static final ald<cwv> k = a("spire");
   public static final ald<cwv> l = a("wayfinder");
   public static final ald<cwv> m = a("shaper");
   public static final ald<cwv> n = a("silence");
   public static final ald<cwv> o = a("raiser");
   public static final ald<cwv> p = a("host");
   public static final ald<cwv> q = a("flow");
   public static final ald<cwv> r = a("bolt");

   public static void a(rc<cwv> $$0) {
      a($$0, cur.xt, a);
      a($$0, cur.xu, b);
      a($$0, cur.xv, c);
      a($$0, cur.xw, d);
      a($$0, cur.xx, e);
      a($$0, cur.xy, f);
      a($$0, cur.xz, g);
      a($$0, cur.xA, h);
      a($$0, cur.xB, i);
      a($$0, cur.xC, j);
      a($$0, cur.xD, k);
      a($$0, cur.xE, l);
      a($$0, cur.xF, m);
      a($$0, cur.xG, n);
      a($$0, cur.xH, o);
      a($$0, cur.xI, p);
   }

   public static Optional<ji.c<cwv>> a(jk.a $$0, cuo $$1) {
      return $$0.b(lq.aP).b().filter($$1x -> $$1.a(((cwv)$$1x.a()).b())).findFirst();
   }

   public static void a(rc<cwv> $$0, cuj $$1, ald<cwv> $$2) {
      cwv $$3 = new cwv($$2.a(), lp.h.e($$1), xo.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ald<cwv> a(String $$0) {
      return ald.a(lq.aP, new ale($$0));
   }
}
