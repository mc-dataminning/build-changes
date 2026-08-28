import java.util.Optional;

public class dhg {
   public static final ald<dhf> a = a("quartz");
   public static final ald<dhf> b = a("iron");
   public static final ald<dhf> c = a("netherite");
   public static final ald<dhf> d = a("redstone");
   public static final ald<dhf> e = a("copper");
   public static final ald<dhf> f = a("gold");
   public static final ald<dhf> g = a("emerald");
   public static final ald<dhf> h = a("diamond");
   public static final ald<dhf> i = a("lapis");
   public static final ald<dhf> j = a("amethyst");
   public static final ald<dhf> k = a("resin");

   public static void a(qh<dhf> $$0) {
      a($$0, a, xt.a.a(14931140), dhe.d);
      a($$0, b, xt.a.a(15527148), dhe.e);
      a($$0, c, xt.a.a(6445145), dhe.f);
      a($$0, d, xt.a.a(9901575), dhe.g);
      a($$0, e, xt.a.a(11823181), dhe.h);
      a($$0, f, xt.a.a(14594349), dhe.i);
      a($$0, g, xt.a.a(1155126), dhe.j);
      a($$0, h, xt.a.a(7269586), dhe.k);
      a($$0, i, xt.a.a(4288151), dhe.l);
      a($$0, j, xt.a.a(10116294), dhe.m);
      a($$0, k, xt.a.a(16545810), dhe.n);
   }

   public static Optional<je<dhf>> a(jg.a $$0, cys $$1) {
      dbr $$2 = $$1.a(kj.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qh<dhf> $$0, ald<dhf> $$1, xt $$2, dhe $$3) {
      ww $$4 = ww.c(af.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dhf($$3, $$4));
   }

   private static ald<dhf> a(String $$0) {
      return ald.a(mg.bi, ale.b($$0));
   }
}
