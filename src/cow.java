import java.util.Map;
import java.util.Optional;

public class cow {
   public static final ahc<cov> a = a("quartz");
   public static final ahc<cov> b = a("iron");
   public static final ahc<cov> c = a("netherite");
   public static final ahc<cov> d = a("redstone");
   public static final ahc<cov> e = a("copper");
   public static final ahc<cov> f = a("gold");
   public static final ahc<cov> g = a("emerald");
   public static final ahc<cov> h = a("diamond");
   public static final ahc<cov> i = a("lapis");
   public static final ahc<cov> j = a("amethyst");

   public static void a(pc<cov> $$0) {
      a($$0, a, cmu.oy, wa.a.a(14931140), 0.1F);
      a($$0, b, cmu.oB, wa.a.a(15527148), 0.2F, Map.of(ckd.c, "iron_darker"));
      a($$0, c, cmu.oG, wa.a.a(6445145), 0.3F, Map.of(ckd.g, "netherite_darker"));
      a($$0, d, cmu.lG, wa.a.a(9901575), 0.4F);
      a($$0, e, cmu.oD, wa.a.a(11823181), 0.5F);
      a($$0, f, cmu.oF, wa.a.a(14594349), 0.6F, Map.of(ckd.d, "gold_darker"));
      a($$0, g, cmu.ow, wa.a.a(1155126), 0.7F);
      a($$0, h, cmu.ov, wa.a.a(7269586), 0.8F, Map.of(ckd.e, "diamond_darker"));
      a($$0, i, cmu.ox, wa.a.a(4288151), 0.9F);
      a($$0, j, cmu.oz, wa.a.a(10116294), 1.0F);
   }

   public static Optional<ih.c<cov>> a(iu $$0, cmr $$1) {
      return $$0.d(ke.aI).h().filter($$1x -> $$1.a(((cov)$$1x.a()).b())).findFirst();
   }

   private static void a(pc<cov> $$0, ahc<cov> $$1, cmm $$2, wa $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pc<cov> $$0, ahc<cov> $$1, cmm $$2, wa $$3, float $$4, Map<ckd, String> $$5) {
      cov $$6 = cov.a($$1.a().a(), $$2, $$4, vd.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ahc<cov> a(String $$0) {
      return ahc.a(ke.aI, new ahd($$0));
   }
}
