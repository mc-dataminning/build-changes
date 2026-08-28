import java.util.Optional;

public class dhm {
   public static final alf<dhl> a = a("quartz");
   public static final alf<dhl> b = a("iron");
   public static final alf<dhl> c = a("netherite");
   public static final alf<dhl> d = a("redstone");
   public static final alf<dhl> e = a("copper");
   public static final alf<dhl> f = a("gold");
   public static final alf<dhl> g = a("emerald");
   public static final alf<dhl> h = a("diamond");
   public static final alf<dhl> i = a("lapis");
   public static final alf<dhl> j = a("amethyst");
   public static final alf<dhl> k = a("resin");

   public static void a(qh<dhl> $$0) {
      a($$0, a, xv.a.a(14931140), dhk.d);
      a($$0, b, xv.a.a(15527148), dhk.e);
      a($$0, c, xv.a.a(6445145), dhk.f);
      a($$0, d, xv.a.a(9901575), dhk.g);
      a($$0, e, xv.a.a(11823181), dhk.h);
      a($$0, f, xv.a.a(14594349), dhk.i);
      a($$0, g, xv.a.a(1155126), dhk.j);
      a($$0, h, xv.a.a(7269586), dhk.k);
      a($$0, i, xv.a.a(4288151), dhk.l);
      a($$0, j, xv.a.a(10116294), dhk.m);
      a($$0, k, xv.a.a(16545810), dhk.n);
   }

   public static Optional<je<dhl>> a(jg.a $$0, cyy $$1) {
      dbx $$2 = $$1.a(kj.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qh<dhl> $$0, alf<dhl> $$1, xv $$2, dhk $$3) {
      wy $$4 = wy.c(af.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dhl($$3, $$4));
   }

   private static alf<dhl> a(String $$0) {
      return alf.a(mg.bj, alg.b($$0));
   }
}
