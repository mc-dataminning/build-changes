import java.util.Map;
import java.util.Optional;

public class cwt {
   public static final ald<cws> a = a("quartz");
   public static final ald<cws> b = a("iron");
   public static final ald<cws> c = a("netherite");
   public static final ald<cws> d = a("redstone");
   public static final ald<cws> e = a("copper");
   public static final ald<cws> f = a("gold");
   public static final ald<cws> g = a("emerald");
   public static final ald<cws> h = a("diamond");
   public static final ald<cws> i = a("lapis");
   public static final ald<cws> j = a("amethyst");

   public static void a(rc<cws> $$0) {
      a($$0, a, cuq.oB, yl.a.a(14931140), 0.1F);
      a($$0, b, cuq.oE, yl.a.a(15527148), 0.2F, Map.of(cse.c, "iron_darker"));
      a($$0, c, cuq.oJ, yl.a.a(6445145), 0.3F, Map.of(cse.g, "netherite_darker"));
      a($$0, d, cuq.lH, yl.a.a(9901575), 0.4F);
      a($$0, e, cuq.oG, yl.a.a(11823181), 0.5F);
      a($$0, f, cuq.oI, yl.a.a(14594349), 0.6F, Map.of(cse.d, "gold_darker"));
      a($$0, g, cuq.oz, yl.a.a(1155126), 0.7F);
      a($$0, h, cuq.oy, yl.a.a(7269586), 0.8F, Map.of(cse.e, "diamond_darker"));
      a($$0, i, cuq.oA, yl.a.a(4288151), 0.9F);
      a($$0, j, cuq.oC, yl.a.a(10116294), 1.0F);
   }

   public static Optional<ji.c<cws>> a(jk.a $$0, cun $$1) {
      return $$0.b(lq.aO).b().filter($$1x -> $$1.a(((cws)$$1x.a()).b())).findFirst();
   }

   private static void a(rc<cws> $$0, ald<cws> $$1, cui $$2, yl $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rc<cws> $$0, ald<cws> $$1, cui $$2, yl $$3, float $$4, Map<ji<csd>, String> $$5) {
      cws $$6 = cws.a($$1.a().a(), $$2, $$4, xo.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ald<cws> a(String $$0) {
      return ald.a(lq.aO, new ale($$0));
   }
}
