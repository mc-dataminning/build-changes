import java.util.Map;
import java.util.Optional;

public class crc {
   public static final aix<crb> a = a("quartz");
   public static final aix<crb> b = a("iron");
   public static final aix<crb> c = a("netherite");
   public static final aix<crb> d = a("redstone");
   public static final aix<crb> e = a("copper");
   public static final aix<crb> f = a("gold");
   public static final aix<crb> g = a("emerald");
   public static final aix<crb> h = a("diamond");
   public static final aix<crb> i = a("lapis");
   public static final aix<crb> j = a("amethyst");

   public static void a(ph<crb> $$0) {
      a($$0, a, cpc.oA, wn.a.a(14931140), 0.1F);
      a($$0, b, cpc.oD, wn.a.a(15527148), 0.2F, Map.of(cml.c, "iron_darker"));
      a($$0, c, cpc.oI, wn.a.a(6445145), 0.3F, Map.of(cml.g, "netherite_darker"));
      a($$0, d, cpc.lG, wn.a.a(9901575), 0.4F);
      a($$0, e, cpc.oF, wn.a.a(11823181), 0.5F);
      a($$0, f, cpc.oH, wn.a.a(14594349), 0.6F, Map.of(cml.d, "gold_darker"));
      a($$0, g, cpc.oy, wn.a.a(1155126), 0.7F);
      a($$0, h, cpc.ox, wn.a.a(7269586), 0.8F, Map.of(cml.e, "diamond_darker"));
      a($$0, i, cpc.oz, wn.a.a(4288151), 0.9F);
      a($$0, j, cpc.oB, wn.a.a(10116294), 1.0F);
   }

   public static Optional<ij.c<crb>> a(iw $$0, coz $$1) {
      return $$0.d(kg.aI).h().filter($$1x -> $$1.a(((crb)$$1x.a()).b())).findFirst();
   }

   private static void a(ph<crb> $$0, aix<crb> $$1, cou $$2, wn $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(ph<crb> $$0, aix<crb> $$1, cou $$2, wn $$3, float $$4, Map<cml, String> $$5) {
      crb $$6 = crb.a($$1.a().a(), $$2, $$4, vq.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aix<crb> a(String $$0) {
      return aix.a(kg.aI, new aiy($$0));
   }
}
