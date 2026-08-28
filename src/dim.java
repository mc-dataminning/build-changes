import java.util.Optional;

public class dim {
   public static final alh<dil> a = a("quartz");
   public static final alh<dil> b = a("iron");
   public static final alh<dil> c = a("netherite");
   public static final alh<dil> d = a("redstone");
   public static final alh<dil> e = a("copper");
   public static final alh<dil> f = a("gold");
   public static final alh<dil> g = a("emerald");
   public static final alh<dil> h = a("diamond");
   public static final alh<dil> i = a("lapis");
   public static final alh<dil> j = a("amethyst");
   public static final alh<dil> k = a("resin");

   public static void a(qh<dil> $$0) {
      a($$0, a, xx.a.a(14931140), dik.d);
      a($$0, b, xx.a.a(15527148), dik.e);
      a($$0, c, xx.a.a(6445145), dik.f);
      a($$0, d, xx.a.a(9901575), dik.g);
      a($$0, e, xx.a.a(11823181), dik.h);
      a($$0, f, xx.a.a(14594349), dik.i);
      a($$0, g, xx.a.a(1155126), dik.j);
      a($$0, h, xx.a.a(7269586), dik.k);
      a($$0, i, xx.a.a(4288151), dik.l);
      a($$0, j, xx.a.a(10116294), dik.m);
      a($$0, k, xx.a.a(16545810), dik.n);
   }

   public static Optional<jf<dil>> a(jh.a $$0, czy $$1) {
      dcx $$2 = $$1.a(kk.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qh<dil> $$0, alh<dil> $$1, xx $$2, dik $$3) {
      xa $$4 = xa.c(ag.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dil($$3, $$4));
   }

   private static alh<dil> a(String $$0) {
      return alh.a(mh.bk, ali.b($$0));
   }
}
