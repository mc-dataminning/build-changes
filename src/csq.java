import java.util.Map;
import java.util.Optional;

public class csq {
   public static final ajg<csp> a = a("quartz");
   public static final ajg<csp> b = a("iron");
   public static final ajg<csp> c = a("netherite");
   public static final ajg<csp> d = a("redstone");
   public static final ajg<csp> e = a("copper");
   public static final ajg<csp> f = a("gold");
   public static final ajg<csp> g = a("emerald");
   public static final ajg<csp> h = a("diamond");
   public static final ajg<csp> i = a("lapis");
   public static final ajg<csp> j = a("amethyst");

   public static void a(pl<csp> $$0) {
      a($$0, a, cqp.oA, wr.a.a(14931140), 0.1F);
      a($$0, b, cqp.oD, wr.a.a(15527148), 0.2F, Map.of(coa.c, "iron_darker"));
      a($$0, c, cqp.oI, wr.a.a(6445145), 0.3F, Map.of(coa.g, "netherite_darker"));
      a($$0, d, cqp.lG, wr.a.a(9901575), 0.4F);
      a($$0, e, cqp.oF, wr.a.a(11823181), 0.5F);
      a($$0, f, cqp.oH, wr.a.a(14594349), 0.6F, Map.of(coa.d, "gold_darker"));
      a($$0, g, cqp.oy, wr.a.a(1155126), 0.7F);
      a($$0, h, cqp.ox, wr.a.a(7269586), 0.8F, Map.of(coa.e, "diamond_darker"));
      a($$0, i, cqp.oz, wr.a.a(4288151), 0.9F);
      a($$0, j, cqp.oB, wr.a.a(10116294), 1.0F);
   }

   public static Optional<il.c<csp>> a(iz $$0, cqm $$1) {
      return $$0.d(kj.aJ).h().filter($$1x -> $$1.a(((csp)$$1x.a()).b())).findFirst();
   }

   private static void a(pl<csp> $$0, ajg<csp> $$1, cqh $$2, wr $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pl<csp> $$0, ajg<csp> $$1, cqh $$2, wr $$3, float $$4, Map<il<cnz>, String> $$5) {
      csp $$6 = csp.a($$1.a().a(), $$2, $$4, vu.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ajg<csp> a(String $$0) {
      return ajg.a(kj.aJ, new ajh($$0));
   }
}
