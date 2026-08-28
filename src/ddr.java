import java.util.Map;
import java.util.Optional;

public class ddr {
   public static final alh<ddq> a = a("quartz");
   public static final alh<ddq> b = a("iron");
   public static final alh<ddq> c = a("netherite");
   public static final alh<ddq> d = a("redstone");
   public static final alh<ddq> e = a("copper");
   public static final alh<ddq> f = a("gold");
   public static final alh<ddq> g = a("emerald");
   public static final alh<ddq> h = a("diamond");
   public static final alh<ddq> i = a("lapis");
   public static final alh<ddq> j = a("amethyst");

   public static void a(qy<ddq> $$0) {
      a($$0, a, cwf.oD, yf.a.a(14931140), 0.1F);
      a($$0, b, cwf.oG, yf.a.a(15527148), 0.2F, Map.of(ddm.c, "iron_darker"));
      a($$0, c, cwf.oL, yf.a.a(6445145), 0.3F, Map.of(ddm.g, "netherite_darker"));
      a($$0, d, cwf.lH, yf.a.a(9901575), 0.4F);
      a($$0, e, cwf.oI, yf.a.a(11823181), 0.5F);
      a($$0, f, cwf.oK, yf.a.a(14594349), 0.6F, Map.of(ddm.d, "gold_darker"));
      a($$0, g, cwf.oB, yf.a.a(1155126), 0.7F);
      a($$0, h, cwf.oA, yf.a.a(7269586), 0.8F, Map.of(ddm.e, "diamond_darker"));
      a($$0, i, cwf.oC, yf.a.a(4288151), 0.9F);
      a($$0, j, cwf.oE, yf.a.a(10116294), 1.0F);
   }

   public static Optional<jq.c<ddq>> a(js.a $$0, cwb $$1) {
      return $$0.d(lz.aX).c().filter($$1x -> $$1.a(((ddq)$$1x.a()).b())).findFirst();
   }

   private static void a(qy<ddq> $$0, alh<ddq> $$1, cvx $$2, yf $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qy<ddq> $$0, alh<ddq> $$1, cvx $$2, yf $$3, float $$4, Map<ali, String> $$5) {
      ddq $$6 = ddq.a($$1.a().a(), $$2, $$4, xi.c(ae.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static alh<ddq> a(String $$0) {
      return alh.a(lz.aX, ali.b($$0));
   }
}
