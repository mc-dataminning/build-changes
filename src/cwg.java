import java.util.Map;
import java.util.Optional;

public class cwg {
   public static final akj<cwf> a = a("quartz");
   public static final akj<cwf> b = a("iron");
   public static final akj<cwf> c = a("netherite");
   public static final akj<cwf> d = a("redstone");
   public static final akj<cwf> e = a("copper");
   public static final akj<cwf> f = a("gold");
   public static final akj<cwf> g = a("emerald");
   public static final akj<cwf> h = a("diamond");
   public static final akj<cwf> i = a("lapis");
   public static final akj<cwf> j = a("amethyst");

   public static void a(qm<cwf> $$0) {
      a($$0, a, cud.oB, xr.a.a(14931140), 0.1F);
      a($$0, b, cud.oE, xr.a.a(15527148), 0.2F, Map.of(crr.c, "iron_darker"));
      a($$0, c, cud.oJ, xr.a.a(6445145), 0.3F, Map.of(crr.g, "netherite_darker"));
      a($$0, d, cud.lH, xr.a.a(9901575), 0.4F);
      a($$0, e, cud.oG, xr.a.a(11823181), 0.5F);
      a($$0, f, cud.oI, xr.a.a(14594349), 0.6F, Map.of(crr.d, "gold_darker"));
      a($$0, g, cud.oz, xr.a.a(1155126), 0.7F);
      a($$0, h, cud.oy, xr.a.a(7269586), 0.8F, Map.of(crr.e, "diamond_darker"));
      a($$0, i, cud.oA, xr.a.a(4288151), 0.9F);
      a($$0, j, cud.oC, xr.a.a(10116294), 1.0F);
   }

   public static Optional<jj.c<cwf>> a(jl.a $$0, cua $$1) {
      return $$0.b(lr.aV).b().filter($$1x -> $$1.a(((cwf)$$1x.a()).b())).findFirst();
   }

   private static void a(qm<cwf> $$0, akj<cwf> $$1, ctv $$2, xr $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qm<cwf> $$0, akj<cwf> $$1, ctv $$2, xr $$3, float $$4, Map<jj<crq>, String> $$5) {
      cwf $$6 = cwf.a($$1.a().a(), $$2, $$4, wu.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akj<cwf> a(String $$0) {
      return akj.a(lr.aV, new akk($$0));
   }
}
