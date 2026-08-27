import java.util.Map;
import java.util.Optional;

public class col {
   public static final ags<cok> a = a("quartz");
   public static final ags<cok> b = a("iron");
   public static final ags<cok> c = a("netherite");
   public static final ags<cok> d = a("redstone");
   public static final ags<cok> e = a("copper");
   public static final ags<cok> f = a("gold");
   public static final ags<cok> g = a("emerald");
   public static final ags<cok> h = a("diamond");
   public static final ags<cok> i = a("lapis");
   public static final ags<cok> j = a("amethyst");

   public static void a(pa<cok> $$0) {
      a($$0, a, cmk.oy, vy.a.a(14931140), 0.1F);
      a($$0, b, cmk.oB, vy.a.a(15527148), 0.2F, Map.of(cjt.c, "iron_darker"));
      a($$0, c, cmk.oG, vy.a.a(6445145), 0.3F, Map.of(cjt.g, "netherite_darker"));
      a($$0, d, cmk.lG, vy.a.a(9901575), 0.4F);
      a($$0, e, cmk.oD, vy.a.a(11823181), 0.5F);
      a($$0, f, cmk.oF, vy.a.a(14594349), 0.6F, Map.of(cjt.d, "gold_darker"));
      a($$0, g, cmk.ow, vy.a.a(1155126), 0.7F);
      a($$0, h, cmk.ov, vy.a.a(7269586), 0.8F, Map.of(cjt.e, "diamond_darker"));
      a($$0, i, cmk.ox, vy.a.a(4288151), 0.9F);
      a($$0, j, cmk.oz, vy.a.a(10116294), 1.0F);
   }

   public static Optional<ie.c<cok>> a(is $$0, cmh $$1) {
      return $$0.d(kc.aH).h().filter($$1x -> $$1.a(((cok)$$1x.a()).b())).findFirst();
   }

   private static void a(pa<cok> $$0, ags<cok> $$1, cmc $$2, vy $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pa<cok> $$0, ags<cok> $$1, cmc $$2, vy $$3, float $$4, Map<cjt, String> $$5) {
      cok $$6 = cok.a($$1.a().a(), $$2, $$4, vb.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ags<cok> a(String $$0) {
      return ags.a(kc.aH, new agt($$0));
   }
}
