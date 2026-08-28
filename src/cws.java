import java.util.Optional;

public class cws {
   public static final ala<cwr> a = a("sentry");
   public static final ala<cwr> b = a("dune");
   public static final ala<cwr> c = a("coast");
   public static final ala<cwr> d = a("wild");
   public static final ala<cwr> e = a("ward");
   public static final ala<cwr> f = a("eye");
   public static final ala<cwr> g = a("vex");
   public static final ala<cwr> h = a("tide");
   public static final ala<cwr> i = a("snout");
   public static final ala<cwr> j = a("rib");
   public static final ala<cwr> k = a("spire");
   public static final ala<cwr> l = a("wayfinder");
   public static final ala<cwr> m = a("shaper");
   public static final ala<cwr> n = a("silence");
   public static final ala<cwr> o = a("raiser");
   public static final ala<cwr> p = a("host");
   public static final ala<cwr> q = a("flow");
   public static final ala<cwr> r = a("bolt");

   public static void a(rc<cwr> $$0) {
      a($$0, cun.xt, a);
      a($$0, cun.xu, b);
      a($$0, cun.xv, c);
      a($$0, cun.xw, d);
      a($$0, cun.xx, e);
      a($$0, cun.xy, f);
      a($$0, cun.xz, g);
      a($$0, cun.xA, h);
      a($$0, cun.xB, i);
      a($$0, cun.xC, j);
      a($$0, cun.xD, k);
      a($$0, cun.xE, l);
      a($$0, cun.xF, m);
      a($$0, cun.xG, n);
      a($$0, cun.xH, o);
      a($$0, cun.xI, p);
   }

   public static Optional<ji.c<cwr>> a(jk.a $$0, cuk $$1) {
      return $$0.b(lq.aP).b().filter($$1x -> $$1.a(((cwr)$$1x.a()).b())).findFirst();
   }

   public static void a(rc<cwr> $$0, cuf $$1, ala<cwr> $$2) {
      cwr $$3 = new cwr($$2.a(), lp.h.e($$1), xl.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ala<cwr> a(String $$0) {
      return ala.a(lq.aP, new alb($$0));
   }
}
