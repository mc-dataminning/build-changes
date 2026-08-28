import java.util.Map;
import java.util.Optional;

public class cwx {
   public static final akp<cww> a = a("quartz");
   public static final akp<cww> b = a("iron");
   public static final akp<cww> c = a("netherite");
   public static final akp<cww> d = a("redstone");
   public static final akp<cww> e = a("copper");
   public static final akp<cww> f = a("gold");
   public static final akp<cww> g = a("emerald");
   public static final akp<cww> h = a("diamond");
   public static final akp<cww> i = a("lapis");
   public static final akp<cww> j = a("amethyst");

   public static void a(qp<cww> $$0) {
      a($$0, a, cur.oC, xv.a.a(14931140), 0.1F);
      a($$0, b, cur.oF, xv.a.a(15527148), 0.2F, Map.of(csf.c, "iron_darker"));
      a($$0, c, cur.oK, xv.a.a(6445145), 0.3F, Map.of(csf.g, "netherite_darker"));
      a($$0, d, cur.lH, xv.a.a(9901575), 0.4F);
      a($$0, e, cur.oH, xv.a.a(11823181), 0.5F);
      a($$0, f, cur.oJ, xv.a.a(14594349), 0.6F, Map.of(csf.d, "gold_darker"));
      a($$0, g, cur.oA, xv.a.a(1155126), 0.7F);
      a($$0, h, cur.oz, xv.a.a(7269586), 0.8F, Map.of(csf.e, "diamond_darker"));
      a($$0, i, cur.oB, xv.a.a(4288151), 0.9F);
      a($$0, j, cur.oD, xv.a.a(10116294), 1.0F);
   }

   public static Optional<jm.c<cww>> a(jo.a $$0, cuo $$1) {
      return $$0.b(lu.aW).b().filter($$1x -> $$1.a(((cww)$$1x.a()).b())).findFirst();
   }

   private static void a(qp<cww> $$0, akp<cww> $$1, cuj $$2, xv $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qp<cww> $$0, akp<cww> $$1, cuj $$2, xv $$3, float $$4, Map<jm<cse>, String> $$5) {
      cww $$6 = cww.a($$1.a().a(), $$2, $$4, wy.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akp<cww> a(String $$0) {
      return akp.a(lu.aW, akq.b($$0));
   }
}
