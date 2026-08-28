import java.util.Optional;

public class dio {
   public static final alj<din> a = a("quartz");
   public static final alj<din> b = a("iron");
   public static final alj<din> c = a("netherite");
   public static final alj<din> d = a("redstone");
   public static final alj<din> e = a("copper");
   public static final alj<din> f = a("gold");
   public static final alj<din> g = a("emerald");
   public static final alj<din> h = a("diamond");
   public static final alj<din> i = a("lapis");
   public static final alj<din> j = a("amethyst");
   public static final alj<din> k = a("resin");

   public static void a(qi<din> $$0) {
      a($$0, a, xz.a.a(14931140), dim.d);
      a($$0, b, xz.a.a(15527148), dim.e);
      a($$0, c, xz.a.a(6445145), dim.f);
      a($$0, d, xz.a.a(9901575), dim.g);
      a($$0, e, xz.a.a(11823181), dim.h);
      a($$0, f, xz.a.a(14594349), dim.i);
      a($$0, g, xz.a.a(1155126), dim.j);
      a($$0, h, xz.a.a(7269586), dim.k);
      a($$0, i, xz.a.a(4288151), dim.l);
      a($$0, j, xz.a.a(10116294), dim.m);
      a($$0, k, xz.a.a(16545810), dim.n);
   }

   public static Optional<jg<din>> a(ji.a $$0, daa $$1) {
      dcz $$2 = $$1.a(kl.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qi<din> $$0, alj<din> $$1, xz $$2, dim $$3) {
      xc $$4 = xc.c(ag.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new din($$3, $$4));
   }

   private static alj<din> a(String $$0) {
      return alj.a(mi.bk, alk.b($$0));
   }
}
