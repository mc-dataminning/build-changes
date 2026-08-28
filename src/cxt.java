import java.util.Map;
import java.util.Optional;

public class cxt {
   public static final alb<cxs> a = a("quartz");
   public static final alb<cxs> b = a("iron");
   public static final alb<cxs> c = a("netherite");
   public static final alb<cxs> d = a("redstone");
   public static final alb<cxs> e = a("copper");
   public static final alb<cxs> f = a("gold");
   public static final alb<cxs> g = a("emerald");
   public static final alb<cxs> h = a("diamond");
   public static final alb<cxs> i = a("lapis");
   public static final alb<cxs> j = a("amethyst");

   public static void a(qt<cxs> $$0) {
      a($$0, a, cvt.oD, ya.a.a(14931140), 0.1F);
      a($$0, b, cvt.oG, ya.a.a(15527148), 0.2F, Map.of(ctk.j, "iron_darker"));
      a($$0, c, cvt.oL, ya.a.a(6445145), 0.3F, Map.of(ctk.n, "netherite_darker"));
      a($$0, d, cvt.lH, ya.a.a(9901575), 0.4F);
      a($$0, e, cvt.oI, ya.a.a(11823181), 0.5F);
      a($$0, f, cvt.oK, ya.a.a(14594349), 0.6F, Map.of(ctk.k, "gold_darker"));
      a($$0, g, cvt.oB, ya.a.a(1155126), 0.7F);
      a($$0, h, cvt.oA, ya.a.a(7269586), 0.8F, Map.of(ctk.l, "diamond_darker"));
      a($$0, i, cvt.oC, ya.a.a(4288151), 0.9F);
      a($$0, j, cvt.oE, ya.a.a(10116294), 1.0F);
   }

   public static Optional<jn.c<cxs>> a(jp.a $$0, cvp $$1) {
      return $$0.b(lv.aX).b().filter($$1x -> $$1.a(((cxs)$$1x.a()).b())).findFirst();
   }

   private static void a(qt<cxs> $$0, alb<cxs> $$1, cvk $$2, ya $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qt<cxs> $$0, alb<cxs> $$1, cvk $$2, ya $$3, float $$4, Map<jn<ctj>, String> $$5) {
      cxs $$6 = cxs.a($$1.a().a(), $$2, $$4, xd.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static alb<cxs> a(String $$0) {
      return alb.a(lv.aX, alc.b($$0));
   }
}
