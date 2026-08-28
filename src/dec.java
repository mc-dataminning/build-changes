import java.util.Map;
import java.util.Optional;

public class dec {
   public static final ali<deb> a = a("quartz");
   public static final ali<deb> b = a("iron");
   public static final ali<deb> c = a("netherite");
   public static final ali<deb> d = a("redstone");
   public static final ali<deb> e = a("copper");
   public static final ali<deb> f = a("gold");
   public static final ali<deb> g = a("emerald");
   public static final ali<deb> h = a("diamond");
   public static final ali<deb> i = a("lapis");
   public static final ali<deb> j = a("amethyst");

   public static void a(qz<deb> $$0) {
      a($$0, a, cwq.oD, yg.a.a(14931140), 0.1F);
      a($$0, b, cwq.oG, yg.a.a(15527148), 0.2F, Map.of(ddx.c, "iron_darker"));
      a($$0, c, cwq.oL, yg.a.a(6445145), 0.3F, Map.of(ddx.g, "netherite_darker"));
      a($$0, d, cwq.lH, yg.a.a(9901575), 0.4F);
      a($$0, e, cwq.oI, yg.a.a(11823181), 0.5F);
      a($$0, f, cwq.oK, yg.a.a(14594349), 0.6F, Map.of(ddx.d, "gold_darker"));
      a($$0, g, cwq.oB, yg.a.a(1155126), 0.7F);
      a($$0, h, cwq.oA, yg.a.a(7269586), 0.8F, Map.of(ddx.e, "diamond_darker"));
      a($$0, i, cwq.oC, yg.a.a(4288151), 0.9F);
      a($$0, j, cwq.oE, yg.a.a(10116294), 1.0F);
   }

   public static Optional<jq.c<deb>> a(js.a $$0, cwm $$1) {
      return $$0.d(ma.aX).c().filter($$1x -> $$1.a(((deb)$$1x.a()).b())).findFirst();
   }

   private static void a(qz<deb> $$0, ali<deb> $$1, cwi $$2, yg $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qz<deb> $$0, ali<deb> $$1, cwi $$2, yg $$3, float $$4, Map<alj, String> $$5) {
      deb $$6 = deb.a($$1.a().a(), $$2, $$4, xj.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ali<deb> a(String $$0) {
      return ali.a(ma.aX, alj.b($$0));
   }
}
