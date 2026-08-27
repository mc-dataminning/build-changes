import java.util.Map;
import java.util.Optional;

public class crg {
   public static final aix<crf> a = a("quartz");
   public static final aix<crf> b = a("iron");
   public static final aix<crf> c = a("netherite");
   public static final aix<crf> d = a("redstone");
   public static final aix<crf> e = a("copper");
   public static final aix<crf> f = a("gold");
   public static final aix<crf> g = a("emerald");
   public static final aix<crf> h = a("diamond");
   public static final aix<crf> i = a("lapis");
   public static final aix<crf> j = a("amethyst");

   public static void a(ph<crf> $$0) {
      a($$0, a, cpg.oA, wn.a.a(14931140), 0.1F);
      a($$0, b, cpg.oD, wn.a.a(15527148), 0.2F, Map.of(cmp.c, "iron_darker"));
      a($$0, c, cpg.oI, wn.a.a(6445145), 0.3F, Map.of(cmp.g, "netherite_darker"));
      a($$0, d, cpg.lG, wn.a.a(9901575), 0.4F);
      a($$0, e, cpg.oF, wn.a.a(11823181), 0.5F);
      a($$0, f, cpg.oH, wn.a.a(14594349), 0.6F, Map.of(cmp.d, "gold_darker"));
      a($$0, g, cpg.oy, wn.a.a(1155126), 0.7F);
      a($$0, h, cpg.ox, wn.a.a(7269586), 0.8F, Map.of(cmp.e, "diamond_darker"));
      a($$0, i, cpg.oz, wn.a.a(4288151), 0.9F);
      a($$0, j, cpg.oB, wn.a.a(10116294), 1.0F);
   }

   public static Optional<ij.c<crf>> a(iw $$0, cpd $$1) {
      return $$0.d(kg.aI).h().filter($$1x -> $$1.a(((crf)$$1x.a()).b())).findFirst();
   }

   private static void a(ph<crf> $$0, aix<crf> $$1, coy $$2, wn $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(ph<crf> $$0, aix<crf> $$1, coy $$2, wn $$3, float $$4, Map<cmp, String> $$5) {
      crf $$6 = crf.a($$1.a().a(), $$2, $$4, vq.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aix<crf> a(String $$0) {
      return aix.a(kg.aI, new aiy($$0));
   }
}
