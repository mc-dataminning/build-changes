import java.util.Optional;

public class cto {
   public static final ajs<ctn> a = a("sentry");
   public static final ajs<ctn> b = a("dune");
   public static final ajs<ctn> c = a("coast");
   public static final ajs<ctn> d = a("wild");
   public static final ajs<ctn> e = a("ward");
   public static final ajs<ctn> f = a("eye");
   public static final ajs<ctn> g = a("vex");
   public static final ajs<ctn> h = a("tide");
   public static final ajs<ctn> i = a("snout");
   public static final ajs<ctn> j = a("rib");
   public static final ajs<ctn> k = a("spire");
   public static final ajs<ctn> l = a("wayfinder");
   public static final ajs<ctn> m = a("shaper");
   public static final ajs<ctn> n = a("silence");
   public static final ajs<ctn> o = a("raiser");
   public static final ajs<ctn> p = a("host");

   public static void a(px<ctn> $$0) {
      a($$0, crm.xp, a);
      a($$0, crm.xq, b);
      a($$0, crm.xr, c);
      a($$0, crm.xs, d);
      a($$0, crm.xt, e);
      a($$0, crm.xu, f);
      a($$0, crm.xv, g);
      a($$0, crm.xw, h);
      a($$0, crm.xx, i);
      a($$0, crm.xy, j);
      a($$0, crm.xz, k);
      a($$0, crm.xA, l);
      a($$0, crm.xB, m);
      a($$0, crm.xC, n);
      a($$0, crm.xD, o);
      a($$0, crm.xE, p);
   }

   public static Optional<il.c<ctn>> a(iz $$0, crj $$1) {
      return $$0.d(ks.aL).h().filter($$1x -> $$1.a(((ctn)$$1x.a()).b())).findFirst();
   }

   private static void a(px<ctn> $$0, cre $$1, ajs<ctn> $$2) {
      ctn $$3 = new ctn($$2.a(), kr.h.e($$1), wg.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static ajs<ctn> a(String $$0) {
      return ajs.a(ks.aL, new ajt($$0));
   }
}
