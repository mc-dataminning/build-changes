import java.util.Map;
import java.util.Optional;

public class cnn {
   public static final agh<cnm> a = a("quartz");
   public static final agh<cnm> b = a("iron");
   public static final agh<cnm> c = a("netherite");
   public static final agh<cnm> d = a("redstone");
   public static final agh<cnm> e = a("copper");
   public static final agh<cnm> f = a("gold");
   public static final agh<cnm> g = a("emerald");
   public static final agh<cnm> h = a("diamond");
   public static final agh<cnm> i = a("lapis");
   public static final agh<cnm> j = a("amethyst");

   public static void a(ov<cnm> $$0) {
      a($$0, a, clm.oy, vo.a.a(14931140), 0.1F);
      a($$0, b, clm.oB, vo.a.a(15527148), 0.2F, Map.of(civ.c, "iron_darker"));
      a($$0, c, clm.oG, vo.a.a(6445145), 0.3F, Map.of(civ.g, "netherite_darker"));
      a($$0, d, clm.lG, vo.a.a(9901575), 0.4F);
      a($$0, e, clm.oD, vo.a.a(11823181), 0.5F);
      a($$0, f, clm.oF, vo.a.a(14594349), 0.6F, Map.of(civ.d, "gold_darker"));
      a($$0, g, clm.ow, vo.a.a(1155126), 0.7F);
      a($$0, h, clm.ov, vo.a.a(7269586), 0.8F, Map.of(civ.e, "diamond_darker"));
      a($$0, i, clm.ox, vo.a.a(4288151), 0.9F);
      a($$0, j, clm.oz, vo.a.a(10116294), 1.0F);
   }

   public static Optional<ib.c<cnm>> a(ip $$0, clj $$1) {
      return $$0.d(jz.aF).h().filter($$1x -> $$1.a(((cnm)$$1x.a()).b())).findFirst();
   }

   private static void a(ov<cnm> $$0, agh<cnm> $$1, cle $$2, vo $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(ov<cnm> $$0, agh<cnm> $$1, cle $$2, vo $$3, float $$4, Map<civ, String> $$5) {
      cnm $$6 = cnm.a($$1.a().a(), $$2, $$4, ur.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static agh<cnm> a(String $$0) {
      return agh.a(jz.aF, new agi($$0));
   }
}
