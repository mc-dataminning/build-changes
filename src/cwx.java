import java.util.Optional;

public class cwx {
   public static final ale<cww> a = a("sentry");
   public static final ale<cww> b = a("dune");
   public static final ale<cww> c = a("coast");
   public static final ale<cww> d = a("wild");
   public static final ale<cww> e = a("ward");
   public static final ale<cww> f = a("eye");
   public static final ale<cww> g = a("vex");
   public static final ale<cww> h = a("tide");
   public static final ale<cww> i = a("snout");
   public static final ale<cww> j = a("rib");
   public static final ale<cww> k = a("spire");
   public static final ale<cww> l = a("wayfinder");
   public static final ale<cww> m = a("shaper");
   public static final ale<cww> n = a("silence");
   public static final ale<cww> o = a("raiser");
   public static final ale<cww> p = a("host");
   public static final ale<cww> q = a("flow");
   public static final ale<cww> r = a("bolt");

   public static void a(rc<cww> $$0) {
      a($$0, cus.xt, a);
      a($$0, cus.xu, b);
      a($$0, cus.xv, c);
      a($$0, cus.xw, d);
      a($$0, cus.xx, e);
      a($$0, cus.xy, f);
      a($$0, cus.xz, g);
      a($$0, cus.xA, h);
      a($$0, cus.xB, i);
      a($$0, cus.xC, j);
      a($$0, cus.xD, k);
      a($$0, cus.xE, l);
      a($$0, cus.xF, m);
      a($$0, cus.xG, n);
      a($$0, cus.xH, o);
      a($$0, cus.xI, p);
   }

   public static Optional<ji.c<cww>> a(jk.a $$0, cup $$1) {
      return $$0.b(lq.aP).b().filter($$1x -> $$1.a(((cww)$$1x.a()).b())).findFirst();
   }

   public static void a(rc<cww> $$0, cuk $$1, ale<cww> $$2) {
      cww $$3 = new cww($$2.a(), lp.h.e($$1), xp.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ale<cww> a(String $$0) {
      return ale.a(lq.aP, new alf($$0));
   }
}
