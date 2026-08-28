import java.util.Map;
import java.util.Optional;

public class cwi {
   public static final akj<cwh> a = a("quartz");
   public static final akj<cwh> b = a("iron");
   public static final akj<cwh> c = a("netherite");
   public static final akj<cwh> d = a("redstone");
   public static final akj<cwh> e = a("copper");
   public static final akj<cwh> f = a("gold");
   public static final akj<cwh> g = a("emerald");
   public static final akj<cwh> h = a("diamond");
   public static final akj<cwh> i = a("lapis");
   public static final akj<cwh> j = a("amethyst");

   public static void a(qm<cwh> $$0) {
      a($$0, a, cuf.oC, xr.a.a(14931140), 0.1F);
      a($$0, b, cuf.oF, xr.a.a(15527148), 0.2F, Map.of(cru.c, "iron_darker"));
      a($$0, c, cuf.oK, xr.a.a(6445145), 0.3F, Map.of(cru.g, "netherite_darker"));
      a($$0, d, cuf.lH, xr.a.a(9901575), 0.4F);
      a($$0, e, cuf.oH, xr.a.a(11823181), 0.5F);
      a($$0, f, cuf.oJ, xr.a.a(14594349), 0.6F, Map.of(cru.d, "gold_darker"));
      a($$0, g, cuf.oA, xr.a.a(1155126), 0.7F);
      a($$0, h, cuf.oz, xr.a.a(7269586), 0.8F, Map.of(cru.e, "diamond_darker"));
      a($$0, i, cuf.oB, xr.a.a(4288151), 0.9F);
      a($$0, j, cuf.oD, xr.a.a(10116294), 1.0F);
   }

   public static Optional<jj.c<cwh>> a(jl.a $$0, cuc $$1) {
      return $$0.b(lr.aV).b().filter($$1x -> $$1.a(((cwh)$$1x.a()).b())).findFirst();
   }

   private static void a(qm<cwh> $$0, akj<cwh> $$1, ctx $$2, xr $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qm<cwh> $$0, akj<cwh> $$1, ctx $$2, xr $$3, float $$4, Map<jj<crt>, String> $$5) {
      cwh $$6 = cwh.a($$1.a().a(), $$2, $$4, wu.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akj<cwh> a(String $$0) {
      return akj.a(lr.aV, new akk($$0));
   }
}
