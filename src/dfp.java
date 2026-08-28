import java.util.Map;
import java.util.Optional;

public class dfp {
   public static final alo<dfo> a = a("quartz");
   public static final alo<dfo> b = a("iron");
   public static final alo<dfo> c = a("netherite");
   public static final alo<dfo> d = a("redstone");
   public static final alo<dfo> e = a("copper");
   public static final alo<dfo> f = a("gold");
   public static final alo<dfo> g = a("emerald");
   public static final alo<dfo> h = a("diamond");
   public static final alo<dfo> i = a("lapis");
   public static final alo<dfo> j = a("amethyst");
   public static final alo<dfo> k = a("resin");

   public static void a(ra<dfo> $$0) {
      a($$0, a, cxk.ph, yh.a.a(14931140), 0.01F);
      a($$0, b, cxk.pk, yh.a.a(15527148), 0.02F, Map.of(dfk.c, "iron_darker"));
      a($$0, c, cxk.pp, yh.a.a(6445145), 0.03F, Map.of(dfk.g, "netherite_darker"));
      a($$0, d, cxk.me, yh.a.a(9901575), 0.04F);
      a($$0, e, cxk.pm, yh.a.a(11823181), 0.05F);
      a($$0, f, cxk.po, yh.a.a(14594349), 0.06F, Map.of(dfk.d, "gold_darker"));
      a($$0, g, cxk.pf, yh.a.a(1155126), 0.07F);
      a($$0, h, cxk.pe, yh.a.a(7269586), 0.08F, Map.of(dfk.e, "diamond_darker"));
      a($$0, i, cxk.pg, yh.a.a(4288151), 0.09F);
      a($$0, j, cxk.pi, yh.a.a(10116294), 0.1F);
      a($$0, k, cxk.gm, yh.a.a(16545810), 0.11F);
   }

   public static Optional<jq.c<dfo>> a(js.a $$0, cxg $$1) {
      return $$0.d(mb.aZ).c().filter($$1x -> $$1.a(((dfo)$$1x.a()).b())).findFirst();
   }

   private static void a(ra<dfo> $$0, alo<dfo> $$1, cxc $$2, yh $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(ra<dfo> $$0, alo<dfo> $$1, cxc $$2, yh $$3, float $$4, Map<alp, String> $$5) {
      dfo $$6 = dfo.a($$1.a().a(), $$2, $$4, xk.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static alo<dfo> a(String $$0) {
      return alo.a(mb.aZ, alp.b($$0));
   }
}
