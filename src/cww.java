import java.util.Map;
import java.util.Optional;

public class cww {
   public static final aks<cwv> a = a("quartz");
   public static final aks<cwv> b = a("iron");
   public static final aks<cwv> c = a("netherite");
   public static final aks<cwv> d = a("redstone");
   public static final aks<cwv> e = a("copper");
   public static final aks<cwv> f = a("gold");
   public static final aks<cwv> g = a("emerald");
   public static final aks<cwv> h = a("diamond");
   public static final aks<cwv> i = a("lapis");
   public static final aks<cwv> j = a("amethyst");
   public static final aks<cwv> k = a("amber");

   public static void a(qq<cwv> $$0) {
      a($$0, a, cuk.pU, yb.a.a(14931140), 0.01F);
      a($$0, b, cuk.pX, yb.a.a(15527148), 0.02F, Map.of(crv.c, "iron_darker"));
      a($$0, c, cuk.qc, yb.a.a(6445145), 0.03F, Map.of(crv.g, "netherite_darker"));
      a($$0, d, cuk.mW, yb.a.a(9901575), 0.04F);
      a($$0, e, cuk.pZ, yb.a.a(11823181), 0.05F);
      a($$0, f, cuk.qb, yb.a.a(14594349), 0.06F, Map.of(crv.d, "gold_darker"));
      a($$0, g, cuk.pP, yb.a.a(1155126), 0.07F);
      a($$0, h, cuk.pO, yb.a.a(7269586), 0.08F, Map.of(crv.e, "diamond_darker"));
      a($$0, i, cuk.pQ, yb.a.a(4288151), 0.09F);
      a($$0, j, cuk.pV, yb.a.a(10116294), 0.1F);
      a($$0, k, cuk.pR, yb.a.a(15042820), 1.0F);
   }

   public static Optional<ja.c<cwv>> a(jc.a $$0, cuh $$1) {
      return $$0.b(li.aO).b().filter($$1x -> $$1.a(((cwv)$$1x.a()).b())).findFirst();
   }

   private static void a(qq<cwv> $$0, aks<cwv> $$1, cuc $$2, yb $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qq<cwv> $$0, aks<cwv> $$1, cuc $$2, yb $$3, float $$4, Map<ja<cru>, String> $$5) {
      cwv $$6 = cwv.a($$1.a().a(), $$2, $$4, xe.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aks<cwv> a(String $$0) {
      return aks.a(li.aO, new akt($$0));
   }
}
