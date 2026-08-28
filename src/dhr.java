import java.util.Optional;

public class dhr {
   public static final alf<dhq> a = a("quartz");
   public static final alf<dhq> b = a("iron");
   public static final alf<dhq> c = a("netherite");
   public static final alf<dhq> d = a("redstone");
   public static final alf<dhq> e = a("copper");
   public static final alf<dhq> f = a("gold");
   public static final alf<dhq> g = a("emerald");
   public static final alf<dhq> h = a("diamond");
   public static final alf<dhq> i = a("lapis");
   public static final alf<dhq> j = a("amethyst");
   public static final alf<dhq> k = a("resin");

   public static void a(qh<dhq> $$0) {
      a($$0, a, xv.a.a(14931140), dhp.d);
      a($$0, b, xv.a.a(15527148), dhp.e);
      a($$0, c, xv.a.a(6445145), dhp.f);
      a($$0, d, xv.a.a(9901575), dhp.g);
      a($$0, e, xv.a.a(11823181), dhp.h);
      a($$0, f, xv.a.a(14594349), dhp.i);
      a($$0, g, xv.a.a(1155126), dhp.j);
      a($$0, h, xv.a.a(7269586), dhp.k);
      a($$0, i, xv.a.a(4288151), dhp.l);
      a($$0, j, xv.a.a(10116294), dhp.m);
      a($$0, k, xv.a.a(16545810), dhp.n);
   }

   public static Optional<je<dhq>> a(jg.a $$0, czd $$1) {
      dcc $$2 = $$1.a(kj.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qh<dhq> $$0, alf<dhq> $$1, xv $$2, dhp $$3) {
      wy $$4 = wy.c(af.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dhq($$3, $$4));
   }

   private static alf<dhq> a(String $$0) {
      return alf.a(mg.bk, alg.b($$0));
   }
}
