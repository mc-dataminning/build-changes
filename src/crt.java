import java.util.Map;
import java.util.Optional;

public class crt {
   public static final ajb<crs> a = a("quartz");
   public static final ajb<crs> b = a("iron");
   public static final ajb<crs> c = a("netherite");
   public static final ajb<crs> d = a("redstone");
   public static final ajb<crs> e = a("copper");
   public static final ajb<crs> f = a("gold");
   public static final ajb<crs> g = a("emerald");
   public static final ajb<crs> h = a("diamond");
   public static final ajb<crs> i = a("lapis");
   public static final ajb<crs> j = a("amethyst");

   public static void a(pj<crs> $$0) {
      a($$0, a, cpt.oA, wp.a.a(14931140), 0.1F);
      a($$0, b, cpt.oD, wp.a.a(15527148), 0.2F, Map.of(cne.c, "iron_darker"));
      a($$0, c, cpt.oI, wp.a.a(6445145), 0.3F, Map.of(cne.g, "netherite_darker"));
      a($$0, d, cpt.lG, wp.a.a(9901575), 0.4F);
      a($$0, e, cpt.oF, wp.a.a(11823181), 0.5F);
      a($$0, f, cpt.oH, wp.a.a(14594349), 0.6F, Map.of(cne.d, "gold_darker"));
      a($$0, g, cpt.oy, wp.a.a(1155126), 0.7F);
      a($$0, h, cpt.ox, wp.a.a(7269586), 0.8F, Map.of(cne.e, "diamond_darker"));
      a($$0, i, cpt.oz, wp.a.a(4288151), 0.9F);
      a($$0, j, cpt.oB, wp.a.a(10116294), 1.0F);
   }

   public static Optional<il.c<crs>> a(iy $$0, cpq $$1) {
      return $$0.d(ki.aJ).h().filter($$1x -> $$1.a(((crs)$$1x.a()).b())).findFirst();
   }

   private static void a(pj<crs> $$0, ajb<crs> $$1, cpl $$2, wp $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pj<crs> $$0, ajb<crs> $$1, cpl $$2, wp $$3, float $$4, Map<il<cnd>, String> $$5) {
      crs $$6 = crs.a($$1.a().a(), $$2, $$4, vs.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ajb<crs> a(String $$0) {
      return ajb.a(ki.aJ, new ajc($$0));
   }
}
