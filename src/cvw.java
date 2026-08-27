import java.util.Map;
import java.util.Optional;

public class cvw {
   public static final akm<cvv> a = a("quartz");
   public static final akm<cvv> b = a("iron");
   public static final akm<cvv> c = a("netherite");
   public static final akm<cvv> d = a("redstone");
   public static final akm<cvv> e = a("copper");
   public static final akm<cvv> f = a("gold");
   public static final akm<cvv> g = a("emerald");
   public static final akm<cvv> h = a("diamond");
   public static final akm<cvv> i = a("lapis");
   public static final akm<cvv> j = a("amethyst");

   public static void a(qo<cvv> $$0) {
      a($$0, a, ctt.oB, xu.a.a(14931140), 0.1F);
      a($$0, b, ctt.oE, xu.a.a(15527148), 0.2F, Map.of(crh.c, "iron_darker"));
      a($$0, c, ctt.oJ, xu.a.a(6445145), 0.3F, Map.of(crh.g, "netherite_darker"));
      a($$0, d, ctt.lH, xu.a.a(9901575), 0.4F);
      a($$0, e, ctt.oG, xu.a.a(11823181), 0.5F);
      a($$0, f, ctt.oI, xu.a.a(14594349), 0.6F, Map.of(crh.d, "gold_darker"));
      a($$0, g, ctt.oz, xu.a.a(1155126), 0.7F);
      a($$0, h, ctt.oy, xu.a.a(7269586), 0.8F, Map.of(crh.e, "diamond_darker"));
      a($$0, i, ctt.oA, xu.a.a(4288151), 0.9F);
      a($$0, j, ctt.oC, xu.a.a(10116294), 1.0F);
   }

   public static Optional<ix.c<cvv>> a(iz.a $$0, ctq $$1) {
      return $$0.b(lf.aO).b().filter($$1x -> $$1.a(((cvv)$$1x.a()).b())).findFirst();
   }

   private static void a(qo<cvv> $$0, akm<cvv> $$1, ctl $$2, xu $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qo<cvv> $$0, akm<cvv> $$1, ctl $$2, xu $$3, float $$4, Map<ix<crg>, String> $$5) {
      cvv $$6 = cvv.a($$1.a().a(), $$2, $$4, wx.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akm<cvv> a(String $$0) {
      return akm.a(lf.aO, new akn($$0));
   }
}
