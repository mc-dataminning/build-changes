import java.util.Map;
import java.util.Optional;

public class ddv {
   public static final alk<ddu> a = a("quartz");
   public static final alk<ddu> b = a("iron");
   public static final alk<ddu> c = a("netherite");
   public static final alk<ddu> d = a("redstone");
   public static final alk<ddu> e = a("copper");
   public static final alk<ddu> f = a("gold");
   public static final alk<ddu> g = a("emerald");
   public static final alk<ddu> h = a("diamond");
   public static final alk<ddu> i = a("lapis");
   public static final alk<ddu> j = a("amethyst");

   public static void a(rb<ddu> $$0) {
      a($$0, a, cwj.oD, yi.a.a(14931140), 0.1F);
      a($$0, b, cwj.oG, yi.a.a(15527148), 0.2F, Map.of(ddq.c, "iron_darker"));
      a($$0, c, cwj.oL, yi.a.a(6445145), 0.3F, Map.of(ddq.g, "netherite_darker"));
      a($$0, d, cwj.lH, yi.a.a(9901575), 0.4F);
      a($$0, e, cwj.oI, yi.a.a(11823181), 0.5F);
      a($$0, f, cwj.oK, yi.a.a(14594349), 0.6F, Map.of(ddq.d, "gold_darker"));
      a($$0, g, cwj.oB, yi.a.a(1155126), 0.7F);
      a($$0, h, cwj.oA, yi.a.a(7269586), 0.8F, Map.of(ddq.e, "diamond_darker"));
      a($$0, i, cwj.oC, yi.a.a(4288151), 0.9F);
      a($$0, j, cwj.oE, yi.a.a(10116294), 1.0F);
   }

   public static Optional<jq.c<ddu>> a(js.a $$0, cwf $$1) {
      return $$0.d(ma.aX).c().filter($$1x -> $$1.a(((ddu)$$1x.a()).b())).findFirst();
   }

   private static void a(rb<ddu> $$0, alk<ddu> $$1, cwb $$2, yi $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rb<ddu> $$0, alk<ddu> $$1, cwb $$2, yi $$3, float $$4, Map<all, String> $$5) {
      ddu $$6 = ddu.a($$1.a().a(), $$2, $$4, xl.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static alk<ddu> a(String $$0) {
      return alk.a(ma.aX, all.b($$0));
   }
}
