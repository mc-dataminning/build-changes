import java.util.Map;
import java.util.Optional;

public class cwj {
   public static final akj<cwi> a = a("quartz");
   public static final akj<cwi> b = a("iron");
   public static final akj<cwi> c = a("netherite");
   public static final akj<cwi> d = a("redstone");
   public static final akj<cwi> e = a("copper");
   public static final akj<cwi> f = a("gold");
   public static final akj<cwi> g = a("emerald");
   public static final akj<cwi> h = a("diamond");
   public static final akj<cwi> i = a("lapis");
   public static final akj<cwi> j = a("amethyst");

   public static void a(qm<cwi> $$0) {
      a($$0, a, cug.oC, xr.a.a(14931140), 0.1F);
      a($$0, b, cug.oF, xr.a.a(15527148), 0.2F, Map.of(crv.c, "iron_darker"));
      a($$0, c, cug.oK, xr.a.a(6445145), 0.3F, Map.of(crv.g, "netherite_darker"));
      a($$0, d, cug.lH, xr.a.a(9901575), 0.4F);
      a($$0, e, cug.oH, xr.a.a(11823181), 0.5F);
      a($$0, f, cug.oJ, xr.a.a(14594349), 0.6F, Map.of(crv.d, "gold_darker"));
      a($$0, g, cug.oA, xr.a.a(1155126), 0.7F);
      a($$0, h, cug.oz, xr.a.a(7269586), 0.8F, Map.of(crv.e, "diamond_darker"));
      a($$0, i, cug.oB, xr.a.a(4288151), 0.9F);
      a($$0, j, cug.oD, xr.a.a(10116294), 1.0F);
   }

   public static Optional<jj.c<cwi>> a(jl.a $$0, cud $$1) {
      return $$0.b(lr.aV).b().filter($$1x -> $$1.a(((cwi)$$1x.a()).b())).findFirst();
   }

   private static void a(qm<cwi> $$0, akj<cwi> $$1, cty $$2, xr $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qm<cwi> $$0, akj<cwi> $$1, cty $$2, xr $$3, float $$4, Map<jj<cru>, String> $$5) {
      cwi $$6 = cwi.a($$1.a().a(), $$2, $$4, wu.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akj<cwi> a(String $$0) {
      return akj.a(lr.aV, new akk($$0));
   }
}
