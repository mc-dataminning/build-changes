import java.util.Optional;

public class ddt {
   public static final alh<dds> a = a("sentry");
   public static final alh<dds> b = a("dune");
   public static final alh<dds> c = a("coast");
   public static final alh<dds> d = a("wild");
   public static final alh<dds> e = a("ward");
   public static final alh<dds> f = a("eye");
   public static final alh<dds> g = a("vex");
   public static final alh<dds> h = a("tide");
   public static final alh<dds> i = a("snout");
   public static final alh<dds> j = a("rib");
   public static final alh<dds> k = a("spire");
   public static final alh<dds> l = a("wayfinder");
   public static final alh<dds> m = a("shaper");
   public static final alh<dds> n = a("silence");
   public static final alh<dds> o = a("raiser");
   public static final alh<dds> p = a("host");
   public static final alh<dds> q = a("flow");
   public static final alh<dds> r = a("bolt");

   public static void a(qy<dds> $$0) {
      a($$0, cwf.xz, a);
      a($$0, cwf.xA, b);
      a($$0, cwf.xB, c);
      a($$0, cwf.xC, d);
      a($$0, cwf.xD, e);
      a($$0, cwf.xE, f);
      a($$0, cwf.xF, g);
      a($$0, cwf.xG, h);
      a($$0, cwf.xH, i);
      a($$0, cwf.xI, j);
      a($$0, cwf.xJ, k);
      a($$0, cwf.xK, l);
      a($$0, cwf.xL, m);
      a($$0, cwf.xM, n);
      a($$0, cwf.xN, o);
      a($$0, cwf.xO, p);
      a($$0, cwf.xP, q);
      a($$0, cwf.xQ, r);
   }

   public static Optional<jq.c<dds>> a(js.a $$0, cwb $$1) {
      return $$0.d(lz.aY).c().filter($$1x -> $$1.a(((dds)$$1x.a()).b())).findFirst();
   }

   public static void a(qy<dds> $$0, cvx $$1, alh<dds> $$2) {
      dds $$3 = new dds($$2.a(), ly.g.e($$1), xi.c(ae.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static alh<dds> a(String $$0) {
      return alh.a(lz.aY, ali.b($$0));
   }
}
