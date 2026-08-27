import java.util.Map;
import java.util.Optional;

public class cpc {
   public static final ahf<cpb> a = a("quartz");
   public static final ahf<cpb> b = a("iron");
   public static final ahf<cpb> c = a("netherite");
   public static final ahf<cpb> d = a("redstone");
   public static final ahf<cpb> e = a("copper");
   public static final ahf<cpb> f = a("gold");
   public static final ahf<cpb> g = a("emerald");
   public static final ahf<cpb> h = a("diamond");
   public static final ahf<cpb> i = a("lapis");
   public static final ahf<cpb> j = a("amethyst");

   public static void a(pe<cpb> $$0) {
      a($$0, a, cna.oy, wc.a.a(14931140), 0.1F);
      a($$0, b, cna.oB, wc.a.a(15527148), 0.2F, Map.of(ckj.c, "iron_darker"));
      a($$0, c, cna.oG, wc.a.a(6445145), 0.3F, Map.of(ckj.g, "netherite_darker"));
      a($$0, d, cna.lG, wc.a.a(9901575), 0.4F);
      a($$0, e, cna.oD, wc.a.a(11823181), 0.5F);
      a($$0, f, cna.oF, wc.a.a(14594349), 0.6F, Map.of(ckj.d, "gold_darker"));
      a($$0, g, cna.ow, wc.a.a(1155126), 0.7F);
      a($$0, h, cna.ov, wc.a.a(7269586), 0.8F, Map.of(ckj.e, "diamond_darker"));
      a($$0, i, cna.ox, wc.a.a(4288151), 0.9F);
      a($$0, j, cna.oz, wc.a.a(10116294), 1.0F);
   }

   public static Optional<ih.c<cpb>> a(iu $$0, cmx $$1) {
      return $$0.d(ke.aI).h().filter($$1x -> $$1.a(((cpb)$$1x.a()).b())).findFirst();
   }

   private static void a(pe<cpb> $$0, ahf<cpb> $$1, cms $$2, wc $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pe<cpb> $$0, ahf<cpb> $$1, cms $$2, wc $$3, float $$4, Map<ckj, String> $$5) {
      cpb $$6 = cpb.a($$1.a().a(), $$2, $$4, vf.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ahf<cpb> a(String $$0) {
      return ahf.a(ke.aI, new ahg($$0));
   }
}
