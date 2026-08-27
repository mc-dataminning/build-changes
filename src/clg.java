import java.util.Optional;

public class clg {
   public static final aet<clf> a = a("sentry");
   public static final aet<clf> b = a("dune");
   public static final aet<clf> c = a("coast");
   public static final aet<clf> d = a("wild");
   public static final aet<clf> e = a("ward");
   public static final aet<clf> f = a("eye");
   public static final aet<clf> g = a("vex");
   public static final aet<clf> h = a("tide");
   public static final aet<clf> i = a("snout");
   public static final aet<clf> j = a("rib");
   public static final aet<clf> k = a("spire");
   public static final aet<clf> l = a("wayfinder");
   public static final aet<clf> m = a("shaper");
   public static final aet<clf> n = a("silence");
   public static final aet<clf> o = a("raiser");
   public static final aet<clf> p = a("host");

   public static void a(np<clf> $$0) {
      a($$0, cjd.wx, a);
      a($$0, cjd.wy, b);
      a($$0, cjd.wz, c);
      a($$0, cjd.wA, d);
      a($$0, cjd.wB, e);
      a($$0, cjd.wC, f);
      a($$0, cjd.wD, g);
      a($$0, cjd.wE, h);
      a($$0, cjd.wF, i);
      a($$0, cjd.wG, j);
      a($$0, cjd.wH, k);
      a($$0, cjd.wI, l);
      a($$0, cjd.wJ, m);
      a($$0, cjd.wK, n);
      a($$0, cjd.wL, o);
      a($$0, cjd.wM, p);
   }

   public static Optional<hg.c<clf>> a(hu $$0, cja $$1) {
      return $$0.d(je.aE).h().filter($$1x -> $$1.a(((clf)$$1x.a()).b())).findFirst();
   }

   private static void a(np<clf> $$0, civ $$1, aet<clf> $$2) {
      clf $$3 = new clf($$2.a(), jd.i.d($$1), ti.c(ac.a("trim_pattern", $$2.a())), false);
      $$0.a($$2, $$3);
   }

   private static aet<clf> a(String $$0) {
      return aet.a(je.aE, new aeu($$0));
   }
}
