import java.util.Map;
import java.util.Optional;

public class cwv {
   public static final ale<cwu> a = a("quartz");
   public static final ale<cwu> b = a("iron");
   public static final ale<cwu> c = a("netherite");
   public static final ale<cwu> d = a("redstone");
   public static final ale<cwu> e = a("copper");
   public static final ale<cwu> f = a("gold");
   public static final ale<cwu> g = a("emerald");
   public static final ale<cwu> h = a("diamond");
   public static final ale<cwu> i = a("lapis");
   public static final ale<cwu> j = a("amethyst");

   public static void a(rc<cwu> $$0) {
      a($$0, a, cus.oB, ym.a.a(14931140), 0.1F);
      a($$0, b, cus.oE, ym.a.a(15527148), 0.2F, Map.of(csg.c, "iron_darker"));
      a($$0, c, cus.oJ, ym.a.a(6445145), 0.3F, Map.of(csg.g, "netherite_darker"));
      a($$0, d, cus.lH, ym.a.a(9901575), 0.4F);
      a($$0, e, cus.oG, ym.a.a(11823181), 0.5F);
      a($$0, f, cus.oI, ym.a.a(14594349), 0.6F, Map.of(csg.d, "gold_darker"));
      a($$0, g, cus.oz, ym.a.a(1155126), 0.7F);
      a($$0, h, cus.oy, ym.a.a(7269586), 0.8F, Map.of(csg.e, "diamond_darker"));
      a($$0, i, cus.oA, ym.a.a(4288151), 0.9F);
      a($$0, j, cus.oC, ym.a.a(10116294), 1.0F);
   }

   public static Optional<ji.c<cwu>> a(jk.a $$0, cup $$1) {
      return $$0.b(lq.aO).b().filter($$1x -> $$1.a(((cwu)$$1x.a()).b())).findFirst();
   }

   private static void a(rc<cwu> $$0, ale<cwu> $$1, cuk $$2, ym $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rc<cwu> $$0, ale<cwu> $$1, cuk $$2, ym $$3, float $$4, Map<ji<csf>, String> $$5) {
      cwu $$6 = cwu.a($$1.a().a(), $$2, $$4, xp.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ale<cwu> a(String $$0) {
      return ale.a(lq.aO, new alf($$0));
   }
}
