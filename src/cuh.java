import java.util.Map;
import java.util.Optional;

public class cuh {
   public static final ake<cug> a = a("quartz");
   public static final ake<cug> b = a("iron");
   public static final ake<cug> c = a("netherite");
   public static final ake<cug> d = a("redstone");
   public static final ake<cug> e = a("copper");
   public static final ake<cug> f = a("gold");
   public static final ake<cug> g = a("emerald");
   public static final ake<cug> h = a("diamond");
   public static final ake<cug> i = a("lapis");
   public static final ake<cug> j = a("amethyst");

   public static void a(qj<cug> $$0) {
      a($$0, a, csg.oB, xp.a.a(14931140), 0.1F);
      a($$0, b, csg.oE, xp.a.a(15527148), 0.2F, Map.of(cpu.c, "iron_darker"));
      a($$0, c, csg.oJ, xp.a.a(6445145), 0.3F, Map.of(cpu.g, "netherite_darker"));
      a($$0, d, csg.lH, xp.a.a(9901575), 0.4F);
      a($$0, e, csg.oG, xp.a.a(11823181), 0.5F);
      a($$0, f, csg.oI, xp.a.a(14594349), 0.6F, Map.of(cpu.d, "gold_darker"));
      a($$0, g, csg.oz, xp.a.a(1155126), 0.7F);
      a($$0, h, csg.oy, xp.a.a(7269586), 0.8F, Map.of(cpu.e, "diamond_darker"));
      a($$0, i, csg.oA, xp.a.a(4288151), 0.9F);
      a($$0, j, csg.oC, xp.a.a(10116294), 1.0F);
   }

   public static Optional<iv.c<cug>> a(jj $$0, csd $$1) {
      return $$0.d(ld.aN).h().filter($$1x -> $$1.a(((cug)$$1x.a()).b())).findFirst();
   }

   private static void a(qj<cug> $$0, ake<cug> $$1, cry $$2, xp $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qj<cug> $$0, ake<cug> $$1, cry $$2, xp $$3, float $$4, Map<iv<cpt>, String> $$5) {
      cug $$6 = cug.a($$1.a().a(), $$2, $$4, ws.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ake<cug> a(String $$0) {
      return ake.a(ld.aN, new akf($$0));
   }
}
