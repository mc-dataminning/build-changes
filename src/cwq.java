import java.util.Map;
import java.util.Optional;

public class cwq {
   public static final ala<cwp> a = a("quartz");
   public static final ala<cwp> b = a("iron");
   public static final ala<cwp> c = a("netherite");
   public static final ala<cwp> d = a("redstone");
   public static final ala<cwp> e = a("copper");
   public static final ala<cwp> f = a("gold");
   public static final ala<cwp> g = a("emerald");
   public static final ala<cwp> h = a("diamond");
   public static final ala<cwp> i = a("lapis");
   public static final ala<cwp> j = a("amethyst");

   public static void a(rc<cwp> $$0) {
      a($$0, a, cun.oB, yi.a.a(14931140), 0.1F);
      a($$0, b, cun.oE, yi.a.a(15527148), 0.2F, Map.of(csb.c, "iron_darker"));
      a($$0, c, cun.oJ, yi.a.a(6445145), 0.3F, Map.of(csb.g, "netherite_darker"));
      a($$0, d, cun.lH, yi.a.a(9901575), 0.4F);
      a($$0, e, cun.oG, yi.a.a(11823181), 0.5F);
      a($$0, f, cun.oI, yi.a.a(14594349), 0.6F, Map.of(csb.d, "gold_darker"));
      a($$0, g, cun.oz, yi.a.a(1155126), 0.7F);
      a($$0, h, cun.oy, yi.a.a(7269586), 0.8F, Map.of(csb.e, "diamond_darker"));
      a($$0, i, cun.oA, yi.a.a(4288151), 0.9F);
      a($$0, j, cun.oC, yi.a.a(10116294), 1.0F);
   }

   public static Optional<ji.c<cwp>> a(jk.a $$0, cuk $$1) {
      return $$0.b(lq.aO).b().filter($$1x -> $$1.a(((cwp)$$1x.a()).b())).findFirst();
   }

   private static void a(rc<cwp> $$0, ala<cwp> $$1, cuf $$2, yi $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rc<cwp> $$0, ala<cwp> $$1, cuf $$2, yi $$3, float $$4, Map<ji<csa>, String> $$5) {
      cwp $$6 = cwp.a($$1.a().a(), $$2, $$4, xl.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ala<cwp> a(String $$0) {
      return ala.a(lq.aO, new alb($$0));
   }
}
