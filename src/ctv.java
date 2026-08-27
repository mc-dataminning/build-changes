import java.util.Map;
import java.util.Optional;

public class ctv {
   public static final aju<ctu> a = a("quartz");
   public static final aju<ctu> b = a("iron");
   public static final aju<ctu> c = a("netherite");
   public static final aju<ctu> d = a("redstone");
   public static final aju<ctu> e = a("copper");
   public static final aju<ctu> f = a("gold");
   public static final aju<ctu> g = a("emerald");
   public static final aju<ctu> h = a("diamond");
   public static final aju<ctu> i = a("lapis");
   public static final aju<ctu> j = a("amethyst");

   public static void a(pz<ctu> $$0) {
      a($$0, a, crv.oA, xf.a.a(14931140), 0.1F);
      a($$0, b, crv.oD, xf.a.a(15527148), 0.2F, Map.of(cpj.c, "iron_darker"));
      a($$0, c, crv.oI, xf.a.a(6445145), 0.3F, Map.of(cpj.g, "netherite_darker"));
      a($$0, d, crv.lG, xf.a.a(9901575), 0.4F);
      a($$0, e, crv.oF, xf.a.a(11823181), 0.5F);
      a($$0, f, crv.oH, xf.a.a(14594349), 0.6F, Map.of(cpj.d, "gold_darker"));
      a($$0, g, crv.oy, xf.a.a(1155126), 0.7F);
      a($$0, h, crv.ox, xf.a.a(7269586), 0.8F, Map.of(cpj.e, "diamond_darker"));
      a($$0, i, crv.oz, xf.a.a(4288151), 0.9F);
      a($$0, j, crv.oB, xf.a.a(10116294), 1.0F);
   }

   public static Optional<in.c<ctu>> a(jb $$0, crs $$1) {
      return $$0.d(ku.aL).h().filter($$1x -> $$1.a(((ctu)$$1x.a()).b())).findFirst();
   }

   private static void a(pz<ctu> $$0, aju<ctu> $$1, crn $$2, xf $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pz<ctu> $$0, aju<ctu> $$1, crn $$2, xf $$3, float $$4, Map<in<cpi>, String> $$5) {
      ctu $$6 = ctu.a($$1.a().a(), $$2, $$4, wi.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aju<ctu> a(String $$0) {
      return aju.a(ku.aL, new ajv($$0));
   }
}
