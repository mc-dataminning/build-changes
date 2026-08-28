import java.util.Map;
import java.util.Optional;

public class cwz {
   public static final akq<cwy> a = a("quartz");
   public static final akq<cwy> b = a("iron");
   public static final akq<cwy> c = a("netherite");
   public static final akq<cwy> d = a("redstone");
   public static final akq<cwy> e = a("copper");
   public static final akq<cwy> f = a("gold");
   public static final akq<cwy> g = a("emerald");
   public static final akq<cwy> h = a("diamond");
   public static final akq<cwy> i = a("lapis");
   public static final akq<cwy> j = a("amethyst");

   public static void a(qq<cwy> $$0) {
      a($$0, a, cut.oC, xw.a.a(14931140), 0.1F);
      a($$0, b, cut.oF, xw.a.a(15527148), 0.2F, Map.of(csh.c, "iron_darker"));
      a($$0, c, cut.oK, xw.a.a(6445145), 0.3F, Map.of(csh.g, "netherite_darker"));
      a($$0, d, cut.lH, xw.a.a(9901575), 0.4F);
      a($$0, e, cut.oH, xw.a.a(11823181), 0.5F);
      a($$0, f, cut.oJ, xw.a.a(14594349), 0.6F, Map.of(csh.d, "gold_darker"));
      a($$0, g, cut.oA, xw.a.a(1155126), 0.7F);
      a($$0, h, cut.oz, xw.a.a(7269586), 0.8F, Map.of(csh.e, "diamond_darker"));
      a($$0, i, cut.oB, xw.a.a(4288151), 0.9F);
      a($$0, j, cut.oD, xw.a.a(10116294), 1.0F);
   }

   public static Optional<jm.c<cwy>> a(jo.a $$0, cuq $$1) {
      return $$0.b(lu.aW).b().filter($$1x -> $$1.a(((cwy)$$1x.a()).b())).findFirst();
   }

   private static void a(qq<cwy> $$0, akq<cwy> $$1, cul $$2, xw $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qq<cwy> $$0, akq<cwy> $$1, cul $$2, xw $$3, float $$4, Map<jm<csg>, String> $$5) {
      cwy $$6 = cwy.a($$1.a().a(), $$2, $$4, wz.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akq<cwy> a(String $$0) {
      return akq.a(lu.aW, akr.b($$0));
   }
}
