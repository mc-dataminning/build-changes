import java.util.Optional;

public class diy {
   public static final alq<dix> a = a("quartz");
   public static final alq<dix> b = a("iron");
   public static final alq<dix> c = a("netherite");
   public static final alq<dix> d = a("redstone");
   public static final alq<dix> e = a("copper");
   public static final alq<dix> f = a("gold");
   public static final alq<dix> g = a("emerald");
   public static final alq<dix> h = a("diamond");
   public static final alq<dix> i = a("lapis");
   public static final alq<dix> j = a("amethyst");
   public static final alq<dix> k = a("resin");

   public static void a(qi<dix> $$0) {
      a($$0, a, yd.a.a(14931140), diw.d);
      a($$0, b, yd.a.a(15527148), diw.e);
      a($$0, c, yd.a.a(6445145), diw.f);
      a($$0, d, yd.a.a(9901575), diw.g);
      a($$0, e, yd.a.a(11823181), diw.h);
      a($$0, f, yd.a.a(14594349), diw.i);
      a($$0, g, yd.a.a(1155126), diw.j);
      a($$0, h, yd.a.a(7269586), diw.k);
      a($$0, i, yd.a.a(4288151), diw.l);
      a($$0, j, yd.a.a(10116294), diw.m);
      a($$0, k, yd.a.a(16545810), diw.n);
   }

   public static Optional<jg<dix>> a(ji.a $$0, dak $$1) {
      ddj $$2 = $$1.a(kl.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qi<dix> $$0, alq<dix> $$1, yd $$2, diw $$3) {
      xg $$4 = xg.c(ag.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dix($$3, $$4));
   }

   private static alq<dix> a(String $$0) {
      return alq.a(mi.bk, alr.b($$0));
   }
}
