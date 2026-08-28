import java.util.Optional;

public class dib {
   public static final alf<dia> a = a("quartz");
   public static final alf<dia> b = a("iron");
   public static final alf<dia> c = a("netherite");
   public static final alf<dia> d = a("redstone");
   public static final alf<dia> e = a("copper");
   public static final alf<dia> f = a("gold");
   public static final alf<dia> g = a("emerald");
   public static final alf<dia> h = a("diamond");
   public static final alf<dia> i = a("lapis");
   public static final alf<dia> j = a("amethyst");
   public static final alf<dia> k = a("resin");

   public static void a(qh<dia> $$0) {
      a($$0, a, xv.a.a(14931140), dhz.d);
      a($$0, b, xv.a.a(15527148), dhz.e);
      a($$0, c, xv.a.a(6445145), dhz.f);
      a($$0, d, xv.a.a(9901575), dhz.g);
      a($$0, e, xv.a.a(11823181), dhz.h);
      a($$0, f, xv.a.a(14594349), dhz.i);
      a($$0, g, xv.a.a(1155126), dhz.j);
      a($$0, h, xv.a.a(7269586), dhz.k);
      a($$0, i, xv.a.a(4288151), dhz.l);
      a($$0, j, xv.a.a(10116294), dhz.m);
      a($$0, k, xv.a.a(16545810), dhz.n);
   }

   public static Optional<jf<dia>> a(jh.a $$0, czn $$1) {
      dcm $$2 = $$1.a(kk.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qh<dia> $$0, alf<dia> $$1, xv $$2, dhz $$3) {
      wy $$4 = wy.c(ag.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dia($$3, $$4));
   }

   private static alf<dia> a(String $$0) {
      return alf.a(mh.bk, alg.b($$0));
   }
}
