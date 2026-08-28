import java.util.Map;
import java.util.Optional;

public class cwx {
   public static final ale<cww> a = a("quartz");
   public static final ale<cww> b = a("iron");
   public static final ale<cww> c = a("netherite");
   public static final ale<cww> d = a("redstone");
   public static final ale<cww> e = a("copper");
   public static final ale<cww> f = a("gold");
   public static final ale<cww> g = a("emerald");
   public static final ale<cww> h = a("diamond");
   public static final ale<cww> i = a("lapis");
   public static final ale<cww> j = a("amethyst");

   public static void a(rc<cww> $$0) {
      a($$0, a, cuu.oB, ym.a.a(14931140), 0.1F);
      a($$0, b, cuu.oE, ym.a.a(15527148), 0.2F, Map.of(csi.c, "iron_darker"));
      a($$0, c, cuu.oJ, ym.a.a(6445145), 0.3F, Map.of(csi.g, "netherite_darker"));
      a($$0, d, cuu.lH, ym.a.a(9901575), 0.4F);
      a($$0, e, cuu.oG, ym.a.a(11823181), 0.5F);
      a($$0, f, cuu.oI, ym.a.a(14594349), 0.6F, Map.of(csi.d, "gold_darker"));
      a($$0, g, cuu.oz, ym.a.a(1155126), 0.7F);
      a($$0, h, cuu.oy, ym.a.a(7269586), 0.8F, Map.of(csi.e, "diamond_darker"));
      a($$0, i, cuu.oA, ym.a.a(4288151), 0.9F);
      a($$0, j, cuu.oC, ym.a.a(10116294), 1.0F);
   }

   public static Optional<ji.c<cww>> a(jk.a $$0, cur $$1) {
      return $$0.b(lq.aO).b().filter($$1x -> $$1.a(((cww)$$1x.a()).b())).findFirst();
   }

   private static void a(rc<cww> $$0, ale<cww> $$1, cum $$2, ym $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rc<cww> $$0, ale<cww> $$1, cum $$2, ym $$3, float $$4, Map<ji<csh>, String> $$5) {
      cww $$6 = cww.a($$1.a().a(), $$2, $$4, xp.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ale<cww> a(String $$0) {
      return ale.a(lq.aO, new alf($$0));
   }
}
