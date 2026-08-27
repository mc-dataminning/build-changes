import java.util.Map;
import java.util.Optional;

public class cpd {
   public static final ahf<cpc> a = a("quartz");
   public static final ahf<cpc> b = a("iron");
   public static final ahf<cpc> c = a("netherite");
   public static final ahf<cpc> d = a("redstone");
   public static final ahf<cpc> e = a("copper");
   public static final ahf<cpc> f = a("gold");
   public static final ahf<cpc> g = a("emerald");
   public static final ahf<cpc> h = a("diamond");
   public static final ahf<cpc> i = a("lapis");
   public static final ahf<cpc> j = a("amethyst");

   public static void a(pe<cpc> $$0) {
      a($$0, a, cnb.oy, wc.a.a(14931140), 0.1F);
      a($$0, b, cnb.oB, wc.a.a(15527148), 0.2F, Map.of(ckk.c, "iron_darker"));
      a($$0, c, cnb.oG, wc.a.a(6445145), 0.3F, Map.of(ckk.g, "netherite_darker"));
      a($$0, d, cnb.lG, wc.a.a(9901575), 0.4F);
      a($$0, e, cnb.oD, wc.a.a(11823181), 0.5F);
      a($$0, f, cnb.oF, wc.a.a(14594349), 0.6F, Map.of(ckk.d, "gold_darker"));
      a($$0, g, cnb.ow, wc.a.a(1155126), 0.7F);
      a($$0, h, cnb.ov, wc.a.a(7269586), 0.8F, Map.of(ckk.e, "diamond_darker"));
      a($$0, i, cnb.ox, wc.a.a(4288151), 0.9F);
      a($$0, j, cnb.oz, wc.a.a(10116294), 1.0F);
   }

   public static Optional<ih.c<cpc>> a(iu $$0, cmy $$1) {
      return $$0.d(ke.aI).h().filter($$1x -> $$1.a(((cpc)$$1x.a()).b())).findFirst();
   }

   private static void a(pe<cpc> $$0, ahf<cpc> $$1, cmt $$2, wc $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pe<cpc> $$0, ahf<cpc> $$1, cmt $$2, wc $$3, float $$4, Map<ckk, String> $$5) {
      cpc $$6 = cpc.a($$1.a().a(), $$2, $$4, vf.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ahf<cpc> a(String $$0) {
      return ahf.a(ke.aI, new ahg($$0));
   }
}
