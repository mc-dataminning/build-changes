import java.util.Map;
import java.util.Optional;

public class dfy {
   public static final aly<dfx> a = a("quartz");
   public static final aly<dfx> b = a("iron");
   public static final aly<dfx> c = a("netherite");
   public static final aly<dfx> d = a("redstone");
   public static final aly<dfx> e = a("copper");
   public static final aly<dfx> f = a("gold");
   public static final aly<dfx> g = a("emerald");
   public static final aly<dfx> h = a("diamond");
   public static final aly<dfx> i = a("lapis");
   public static final aly<dfx> j = a("amethyst");

   public static void a(rk<dfx> $$0) {
      a($$0, a, cxt.oY, ys.a.a(14931140), 0.1F);
      a($$0, b, cxt.pb, ys.a.a(15527148), 0.2F, Map.of(dft.c, "iron_darker"));
      a($$0, c, cxt.pg, ys.a.a(6445145), 0.3F, Map.of(dft.g, "netherite_darker"));
      a($$0, d, cxt.lV, ys.a.a(9901575), 0.4F);
      a($$0, e, cxt.pd, ys.a.a(11823181), 0.5F);
      a($$0, f, cxt.pf, ys.a.a(14594349), 0.6F, Map.of(dft.d, "gold_darker"));
      a($$0, g, cxt.oW, ys.a.a(1155126), 0.7F);
      a($$0, h, cxt.oV, ys.a.a(7269586), 0.8F, Map.of(dft.e, "diamond_darker"));
      a($$0, i, cxt.oX, ys.a.a(4288151), 0.9F);
      a($$0, j, cxt.oZ, ys.a.a(10116294), 1.0F);
   }

   public static Optional<jq.c<dfx>> a(js.a $$0, cxp $$1) {
      return $$0.d(mb.aZ).c().filter($$1x -> $$1.a(((dfx)$$1x.a()).b())).findFirst();
   }

   private static void a(rk<dfx> $$0, aly<dfx> $$1, cxl $$2, ys $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(rk<dfx> $$0, aly<dfx> $$1, cxl $$2, ys $$3, float $$4, Map<alz, String> $$5) {
      dfx $$6 = dfx.a($$1.a().a(), $$2, $$4, xv.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aly<dfx> a(String $$0) {
      return aly.a(mb.aZ, alz.b($$0));
   }
}
