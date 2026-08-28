import java.util.Map;
import java.util.Optional;

public class ddl {
   public static final alg<ddk> a = a("quartz");
   public static final alg<ddk> b = a("iron");
   public static final alg<ddk> c = a("netherite");
   public static final alg<ddk> d = a("redstone");
   public static final alg<ddk> e = a("copper");
   public static final alg<ddk> f = a("gold");
   public static final alg<ddk> g = a("emerald");
   public static final alg<ddk> h = a("diamond");
   public static final alg<ddk> i = a("lapis");
   public static final alg<ddk> j = a("amethyst");

   public static void a(qx<ddk> $$0) {
      a($$0, a, cwb.oD, ye.a.a(14931140), 0.1F);
      a($$0, b, cwb.oG, ye.a.a(15527148), 0.2F, Map.of(ddg.c, "iron_darker"));
      a($$0, c, cwb.oL, ye.a.a(6445145), 0.3F, Map.of(ddg.g, "netherite_darker"));
      a($$0, d, cwb.lH, ye.a.a(9901575), 0.4F);
      a($$0, e, cwb.oI, ye.a.a(11823181), 0.5F);
      a($$0, f, cwb.oK, ye.a.a(14594349), 0.6F, Map.of(ddg.d, "gold_darker"));
      a($$0, g, cwb.oB, ye.a.a(1155126), 0.7F);
      a($$0, h, cwb.oA, ye.a.a(7269586), 0.8F, Map.of(ddg.e, "diamond_darker"));
      a($$0, i, cwb.oC, ye.a.a(4288151), 0.9F);
      a($$0, j, cwb.oE, ye.a.a(10116294), 1.0F);
   }

   public static Optional<jp.c<ddk>> a(jr.a $$0, cvx $$1) {
      return $$0.d(ly.aX).c().filter($$1x -> $$1.a(((ddk)$$1x.a()).b())).findFirst();
   }

   private static void a(qx<ddk> $$0, alg<ddk> $$1, cvt $$2, ye $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qx<ddk> $$0, alg<ddk> $$1, cvt $$2, ye $$3, float $$4, Map<alh, String> $$5) {
      ddk $$6 = ddk.a($$1.a().a(), $$2, $$4, xh.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static alg<ddk> a(String $$0) {
      return alg.a(ly.aX, alh.b($$0));
   }
}
