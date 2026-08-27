import java.util.Map;
import java.util.Optional;

public class clj {
   public static final aev<cli> a = a("quartz");
   public static final aev<cli> b = a("iron");
   public static final aev<cli> c = a("netherite");
   public static final aev<cli> d = a("redstone");
   public static final aev<cli> e = a("copper");
   public static final aev<cli> f = a("gold");
   public static final aev<cli> g = a("emerald");
   public static final aev<cli> h = a("diamond");
   public static final aev<cli> i = a("lapis");
   public static final aev<cli> j = a("amethyst");

   public static void a(nr<cli> $$0) {
      a($$0, a, cji.nN, uh.a.a(14931140), 0.1F);
      a($$0, b, cji.nQ, uh.a.a(15527148), 0.2F, Map.of(cgr.c, "iron_darker"));
      a($$0, c, cji.nV, uh.a.a(6445145), 0.3F, Map.of(cgr.g, "netherite_darker"));
      a($$0, d, cji.ll, uh.a.a(9901575), 0.4F);
      a($$0, e, cji.nS, uh.a.a(11823181), 0.5F);
      a($$0, f, cji.nU, uh.a.a(14594349), 0.6F, Map.of(cgr.d, "gold_darker"));
      a($$0, g, cji.nL, uh.a.a(1155126), 0.7F);
      a($$0, h, cji.nK, uh.a.a(7269586), 0.8F, Map.of(cgr.e, "diamond_darker"));
      a($$0, i, cji.nM, uh.a.a(4288151), 0.9F);
      a($$0, j, cji.nO, uh.a.a(10116294), 1.0F);
   }

   public static Optional<he.c<cli>> a(hr $$0, cjf $$1) {
      return $$0.d(jc.aD).h().filter($$1x -> $$1.a(((cli)$$1x.a()).b())).findFirst();
   }

   private static void a(nr<cli> $$0, aev<cli> $$1, cja $$2, uh $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nr<cli> $$0, aev<cli> $$1, cja $$2, uh $$3, float $$4, Map<cgr, String> $$5) {
      cli $$6 = cli.a($$1.a().a(), $$2, $$4, tl.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aev<cli> a(String $$0) {
      return aev.a(jc.aD, new aew($$0));
   }
}
