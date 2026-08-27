import java.util.Map;
import java.util.Optional;

public class cns {
   public static final agl<cnr> a = a("quartz");
   public static final agl<cnr> b = a("iron");
   public static final agl<cnr> c = a("netherite");
   public static final agl<cnr> d = a("redstone");
   public static final agl<cnr> e = a("copper");
   public static final agl<cnr> f = a("gold");
   public static final agl<cnr> g = a("emerald");
   public static final agl<cnr> h = a("diamond");
   public static final agl<cnr> i = a("lapis");
   public static final agl<cnr> j = a("amethyst");

   public static void a(oz<cnr> $$0) {
      a($$0, a, clr.oy, vs.a.a(14931140), 0.1F);
      a($$0, b, clr.oB, vs.a.a(15527148), 0.2F, Map.of(cja.c, "iron_darker"));
      a($$0, c, clr.oG, vs.a.a(6445145), 0.3F, Map.of(cja.g, "netherite_darker"));
      a($$0, d, clr.lG, vs.a.a(9901575), 0.4F);
      a($$0, e, clr.oD, vs.a.a(11823181), 0.5F);
      a($$0, f, clr.oF, vs.a.a(14594349), 0.6F, Map.of(cja.d, "gold_darker"));
      a($$0, g, clr.ow, vs.a.a(1155126), 0.7F);
      a($$0, h, clr.ov, vs.a.a(7269586), 0.8F, Map.of(cja.e, "diamond_darker"));
      a($$0, i, clr.ox, vs.a.a(4288151), 0.9F);
      a($$0, j, clr.oz, vs.a.a(10116294), 1.0F);
   }

   public static Optional<ig.c<cnr>> a(it $$0, clo $$1) {
      return $$0.d(kd.aF).h().filter($$1x -> $$1.a(((cnr)$$1x.a()).b())).findFirst();
   }

   private static void a(oz<cnr> $$0, agl<cnr> $$1, clj $$2, vs $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(oz<cnr> $$0, agl<cnr> $$1, clj $$2, vs $$3, float $$4, Map<cja, String> $$5) {
      cnr $$6 = cnr.a($$1.a().a(), $$2, $$4, uv.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static agl<cnr> a(String $$0) {
      return agl.a(kd.aF, new agm($$0));
   }
}
