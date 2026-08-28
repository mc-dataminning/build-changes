import java.util.Map;
import java.util.Optional;

public class dfq {
   public static final aly<dfp> a = a("quartz");
   public static final aly<dfp> b = a("iron");
   public static final aly<dfp> c = a("netherite");
   public static final aly<dfp> d = a("redstone");
   public static final aly<dfp> e = a("copper");
   public static final aly<dfp> f = a("gold");
   public static final aly<dfp> g = a("emerald");
   public static final aly<dfp> h = a("diamond");
   public static final aly<dfp> i = a("lapis");
   public static final aly<dfp> j = a("amethyst");

   public static void a(rk<dfp> $$0) {
      a($$0, a, cxo.oY, ys.a.a(14931140), 0.1F);
      a($$0, b, cxo.pb, ys.a.a(15527148), 0.2F, Map.of(dfl.c, "iron_darker"));
      a($$0, c, cxo.pg, ys.a.a(6445145), 0.3F, Map.of(dfl.g, "netherite_darker"));
      a($$0, d, cxo.lV, ys.a.a(9901575), 0.4F);
      a($$0, e, cxo.pd, ys.a.a(11823181), 0.5F);
      a($$0, f, cxo.pf, ys.a.a(14594349), 0.6F, Map.of(dfl.d, "gold_darker"));
      a($$0, g, cxo.oW, ys.a.a(1155126), 0.7F);
      a($$0, h, cxo.oV, ys.a.a(7269586), 0.8F, Map.of(dfl.e, "diamond_darker"));
      a($$0, i, cxo.oX, ys.a.a(4288151), 0.9F);
      a($$0, j, cxo.oZ, ys.a.a(10116294), 1.0F);
   }

   public static Optional<jq.c<dfp>> a(js.a $$0, cxk $$1) {
      return $$0.d(mb.aY).c().filter($$1x -> $$1.a(((dfp)$$1x.a()).b())).findFirst();
   }

   private static void a(rk<dfp> $$0, aly<dfp> $$1, cxg $$2, ys $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rk<dfp> $$0, aly<dfp> $$1, cxg $$2, ys $$3, float $$4, Map<alz, String> $$5) {
      dfp $$6 = dfp.a($$1.a().a(), $$2, $$4, xv.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aly<dfp> a(String $$0) {
      return aly.a(mb.aY, alz.b($$0));
   }
}
