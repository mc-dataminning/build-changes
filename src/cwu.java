import java.util.Map;
import java.util.Optional;

public class cwu {
   public static final ald<cwt> a = a("quartz");
   public static final ald<cwt> b = a("iron");
   public static final ald<cwt> c = a("netherite");
   public static final ald<cwt> d = a("redstone");
   public static final ald<cwt> e = a("copper");
   public static final ald<cwt> f = a("gold");
   public static final ald<cwt> g = a("emerald");
   public static final ald<cwt> h = a("diamond");
   public static final ald<cwt> i = a("lapis");
   public static final ald<cwt> j = a("amethyst");

   public static void a(rc<cwt> $$0) {
      a($$0, a, cur.oB, yl.a.a(14931140), 0.1F);
      a($$0, b, cur.oE, yl.a.a(15527148), 0.2F, Map.of(csf.c, "iron_darker"));
      a($$0, c, cur.oJ, yl.a.a(6445145), 0.3F, Map.of(csf.g, "netherite_darker"));
      a($$0, d, cur.lH, yl.a.a(9901575), 0.4F);
      a($$0, e, cur.oG, yl.a.a(11823181), 0.5F);
      a($$0, f, cur.oI, yl.a.a(14594349), 0.6F, Map.of(csf.d, "gold_darker"));
      a($$0, g, cur.oz, yl.a.a(1155126), 0.7F);
      a($$0, h, cur.oy, yl.a.a(7269586), 0.8F, Map.of(csf.e, "diamond_darker"));
      a($$0, i, cur.oA, yl.a.a(4288151), 0.9F);
      a($$0, j, cur.oC, yl.a.a(10116294), 1.0F);
   }

   public static Optional<ji.c<cwt>> a(jk.a $$0, cuo $$1) {
      return $$0.b(lq.aO).b().filter($$1x -> $$1.a(((cwt)$$1x.a()).b())).findFirst();
   }

   private static void a(rc<cwt> $$0, ald<cwt> $$1, cuj $$2, yl $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rc<cwt> $$0, ald<cwt> $$1, cuj $$2, yl $$3, float $$4, Map<ji<cse>, String> $$5) {
      cwt $$6 = cwt.a($$1.a().a(), $$2, $$4, xo.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ald<cwt> a(String $$0) {
      return ald.a(lq.aO, new ale($$0));
   }
}
