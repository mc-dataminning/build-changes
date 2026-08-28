import java.util.Map;
import java.util.Optional;

public class cww {
   public static final ale<cwv> a = a("quartz");
   public static final ale<cwv> b = a("iron");
   public static final ale<cwv> c = a("netherite");
   public static final ale<cwv> d = a("redstone");
   public static final ale<cwv> e = a("copper");
   public static final ale<cwv> f = a("gold");
   public static final ale<cwv> g = a("emerald");
   public static final ale<cwv> h = a("diamond");
   public static final ale<cwv> i = a("lapis");
   public static final ale<cwv> j = a("amethyst");

   public static void a(rc<cwv> $$0) {
      a($$0, a, cut.oB, ym.a.a(14931140), 0.1F);
      a($$0, b, cut.oE, ym.a.a(15527148), 0.2F, Map.of(csh.c, "iron_darker"));
      a($$0, c, cut.oJ, ym.a.a(6445145), 0.3F, Map.of(csh.g, "netherite_darker"));
      a($$0, d, cut.lH, ym.a.a(9901575), 0.4F);
      a($$0, e, cut.oG, ym.a.a(11823181), 0.5F);
      a($$0, f, cut.oI, ym.a.a(14594349), 0.6F, Map.of(csh.d, "gold_darker"));
      a($$0, g, cut.oz, ym.a.a(1155126), 0.7F);
      a($$0, h, cut.oy, ym.a.a(7269586), 0.8F, Map.of(csh.e, "diamond_darker"));
      a($$0, i, cut.oA, ym.a.a(4288151), 0.9F);
      a($$0, j, cut.oC, ym.a.a(10116294), 1.0F);
   }

   public static Optional<ji.c<cwv>> a(jk.a $$0, cuq $$1) {
      return $$0.b(lq.aO).b().filter($$1x -> $$1.a(((cwv)$$1x.a()).b())).findFirst();
   }

   private static void a(rc<cwv> $$0, ale<cwv> $$1, cul $$2, ym $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rc<cwv> $$0, ale<cwv> $$1, cul $$2, ym $$3, float $$4, Map<ji<csg>, String> $$5) {
      cwv $$6 = cwv.a($$1.a().a(), $$2, $$4, xp.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ale<cwv> a(String $$0) {
      return ale.a(lq.aO, new alf($$0));
   }
}
