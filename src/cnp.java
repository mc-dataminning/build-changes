import java.util.Optional;

public class cnp {
   public static final agh<cno> a = a("sentry");
   public static final agh<cno> b = a("dune");
   public static final agh<cno> c = a("coast");
   public static final agh<cno> d = a("wild");
   public static final agh<cno> e = a("ward");
   public static final agh<cno> f = a("eye");
   public static final agh<cno> g = a("vex");
   public static final agh<cno> h = a("tide");
   public static final agh<cno> i = a("snout");
   public static final agh<cno> j = a("rib");
   public static final agh<cno> k = a("spire");
   public static final agh<cno> l = a("wayfinder");
   public static final agh<cno> m = a("shaper");
   public static final agh<cno> n = a("silence");
   public static final agh<cno> o = a("raiser");
   public static final agh<cno> p = a("host");

   public static void a(ov<cno> $$0) {
      a($$0, clm.xj, a);
      a($$0, clm.xk, b);
      a($$0, clm.xl, c);
      a($$0, clm.xm, d);
      a($$0, clm.xn, e);
      a($$0, clm.xo, f);
      a($$0, clm.xp, g);
      a($$0, clm.xq, h);
      a($$0, clm.xr, i);
      a($$0, clm.xs, j);
      a($$0, clm.xt, k);
      a($$0, clm.xu, l);
      a($$0, clm.xv, m);
      a($$0, clm.xw, n);
      a($$0, clm.xx, o);
      a($$0, clm.xy, p);
   }

   public static Optional<ib.c<cno>> a(ip $$0, clj $$1) {
      return $$0.d(jz.aG).h().filter($$1x -> $$1.a(((cno)$$1x.a()).b())).findFirst();
   }

   private static void a(ov<cno> $$0, cle $$1, agh<cno> $$2) {
      cno $$3 = new cno($$2.a(), jy.i.d($$1), ur.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static agh<cno> a(String $$0) {
      return agh.a(jz.aG, new agi($$0));
   }
}
