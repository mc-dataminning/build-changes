import java.util.Optional;

public class dhy {
   public static final alf<dhx> a = a("quartz");
   public static final alf<dhx> b = a("iron");
   public static final alf<dhx> c = a("netherite");
   public static final alf<dhx> d = a("redstone");
   public static final alf<dhx> e = a("copper");
   public static final alf<dhx> f = a("gold");
   public static final alf<dhx> g = a("emerald");
   public static final alf<dhx> h = a("diamond");
   public static final alf<dhx> i = a("lapis");
   public static final alf<dhx> j = a("amethyst");
   public static final alf<dhx> k = a("resin");

   public static void a(qh<dhx> $$0) {
      a($$0, a, xv.a.a(14931140), dhw.d);
      a($$0, b, xv.a.a(15527148), dhw.e);
      a($$0, c, xv.a.a(6445145), dhw.f);
      a($$0, d, xv.a.a(9901575), dhw.g);
      a($$0, e, xv.a.a(11823181), dhw.h);
      a($$0, f, xv.a.a(14594349), dhw.i);
      a($$0, g, xv.a.a(1155126), dhw.j);
      a($$0, h, xv.a.a(7269586), dhw.k);
      a($$0, i, xv.a.a(4288151), dhw.l);
      a($$0, j, xv.a.a(10116294), dhw.m);
      a($$0, k, xv.a.a(16545810), dhw.n);
   }

   public static Optional<jf<dhx>> a(jh.a $$0, czk $$1) {
      dcj $$2 = $$1.a(kk.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qh<dhx> $$0, alf<dhx> $$1, xv $$2, dhw $$3) {
      wy $$4 = wy.c(ag.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dhx($$3, $$4));
   }

   private static alf<dhx> a(String $$0) {
      return alf.a(mh.bk, alg.b($$0));
   }
}
