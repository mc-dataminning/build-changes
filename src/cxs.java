import java.util.Map;
import java.util.Optional;

public class cxs {
   public static final ala<cxr> a = a("quartz");
   public static final ala<cxr> b = a("iron");
   public static final ala<cxr> c = a("netherite");
   public static final ala<cxr> d = a("redstone");
   public static final ala<cxr> e = a("copper");
   public static final ala<cxr> f = a("gold");
   public static final ala<cxr> g = a("emerald");
   public static final ala<cxr> h = a("diamond");
   public static final ala<cxr> i = a("lapis");
   public static final ala<cxr> j = a("amethyst");

   public static void a(qt<cxr> $$0) {
      a($$0, a, cvo.oD, ya.a.a(14931140), 0.1F);
      a($$0, b, cvo.oG, ya.a.a(15527148), 0.2F, Map.of(cte.c, "iron_darker"));
      a($$0, c, cvo.oL, ya.a.a(6445145), 0.3F, Map.of(cte.g, "netherite_darker"));
      a($$0, d, cvo.lH, ya.a.a(9901575), 0.4F);
      a($$0, e, cvo.oI, ya.a.a(11823181), 0.5F);
      a($$0, f, cvo.oK, ya.a.a(14594349), 0.6F, Map.of(cte.d, "gold_darker"));
      a($$0, g, cvo.oB, ya.a.a(1155126), 0.7F);
      a($$0, h, cvo.oA, ya.a.a(7269586), 0.8F, Map.of(cte.e, "diamond_darker"));
      a($$0, i, cvo.oC, ya.a.a(4288151), 0.9F);
      a($$0, j, cvo.oE, ya.a.a(10116294), 1.0F);
   }

   public static Optional<jn.c<cxr>> a(jp.a $$0, cvl $$1) {
      return $$0.b(lv.aW).b().filter($$1x -> $$1.a(((cxr)$$1x.a()).b())).findFirst();
   }

   private static void a(qt<cxr> $$0, ala<cxr> $$1, cvg $$2, ya $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qt<cxr> $$0, ala<cxr> $$1, cvg $$2, ya $$3, float $$4, Map<jn<ctd>, String> $$5) {
      cxr $$6 = cxr.a($$1.a().a(), $$2, $$4, xd.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ala<cxr> a(String $$0) {
      return ala.a(lv.aW, alb.b($$0));
   }
}
