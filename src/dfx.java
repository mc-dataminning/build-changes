import java.util.Map;
import java.util.Optional;

public class dfx {
   public static final aly<dfw> a = a("quartz");
   public static final aly<dfw> b = a("iron");
   public static final aly<dfw> c = a("netherite");
   public static final aly<dfw> d = a("redstone");
   public static final aly<dfw> e = a("copper");
   public static final aly<dfw> f = a("gold");
   public static final aly<dfw> g = a("emerald");
   public static final aly<dfw> h = a("diamond");
   public static final aly<dfw> i = a("lapis");
   public static final aly<dfw> j = a("amethyst");

   public static void a(rk<dfw> $$0) {
      a($$0, a, cxs.oY, ys.a.a(14931140), 0.1F);
      a($$0, b, cxs.pb, ys.a.a(15527148), 0.2F, Map.of(dfs.c, "iron_darker"));
      a($$0, c, cxs.pg, ys.a.a(6445145), 0.3F, Map.of(dfs.g, "netherite_darker"));
      a($$0, d, cxs.lV, ys.a.a(9901575), 0.4F);
      a($$0, e, cxs.pd, ys.a.a(11823181), 0.5F);
      a($$0, f, cxs.pf, ys.a.a(14594349), 0.6F, Map.of(dfs.d, "gold_darker"));
      a($$0, g, cxs.oW, ys.a.a(1155126), 0.7F);
      a($$0, h, cxs.oV, ys.a.a(7269586), 0.8F, Map.of(dfs.e, "diamond_darker"));
      a($$0, i, cxs.oX, ys.a.a(4288151), 0.9F);
      a($$0, j, cxs.oZ, ys.a.a(10116294), 1.0F);
   }

   public static Optional<jq.c<dfw>> a(js.a $$0, cxo $$1) {
      return $$0.d(mb.aZ).c().filter($$1x -> $$1.a(((dfw)$$1x.a()).b())).findFirst();
   }

   private static void a(rk<dfw> $$0, aly<dfw> $$1, cxk $$2, ys $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rk<dfw> $$0, aly<dfw> $$1, cxk $$2, ys $$3, float $$4, Map<alz, String> $$5) {
      dfw $$6 = dfw.a($$1.a().a(), $$2, $$4, xv.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aly<dfw> a(String $$0) {
      return aly.a(mb.aZ, alz.b($$0));
   }
}
