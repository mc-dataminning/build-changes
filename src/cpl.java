import java.util.Map;
import java.util.Optional;

public class cpl {
   public static final ahg<cpk> a = a("quartz");
   public static final ahg<cpk> b = a("iron");
   public static final ahg<cpk> c = a("netherite");
   public static final ahg<cpk> d = a("redstone");
   public static final ahg<cpk> e = a("copper");
   public static final ahg<cpk> f = a("gold");
   public static final ahg<cpk> g = a("emerald");
   public static final ahg<cpk> h = a("diamond");
   public static final ahg<cpk> i = a("lapis");
   public static final ahg<cpk> j = a("amethyst");

   public static void a(pf<cpk> $$0) {
      a($$0, a, cnj.oA, wd.a.a(14931140), 0.1F);
      a($$0, b, cnj.oD, wd.a.a(15527148), 0.2F, Map.of(ckt.c, "iron_darker"));
      a($$0, c, cnj.oI, wd.a.a(6445145), 0.3F, Map.of(ckt.g, "netherite_darker"));
      a($$0, d, cnj.lG, wd.a.a(9901575), 0.4F);
      a($$0, e, cnj.oF, wd.a.a(11823181), 0.5F);
      a($$0, f, cnj.oH, wd.a.a(14594349), 0.6F, Map.of(ckt.d, "gold_darker"));
      a($$0, g, cnj.oy, wd.a.a(1155126), 0.7F);
      a($$0, h, cnj.ox, wd.a.a(7269586), 0.8F, Map.of(ckt.e, "diamond_darker"));
      a($$0, i, cnj.oz, wd.a.a(4288151), 0.9F);
      a($$0, j, cnj.oB, wd.a.a(10116294), 1.0F);
   }

   public static Optional<ih.c<cpk>> a(iu $$0, cng $$1) {
      return $$0.d(ke.aI).h().filter($$1x -> $$1.a(((cpk)$$1x.a()).b())).findFirst();
   }

   private static void a(pf<cpk> $$0, ahg<cpk> $$1, cnb $$2, wd $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pf<cpk> $$0, ahg<cpk> $$1, cnb $$2, wd $$3, float $$4, Map<ckt, String> $$5) {
      cpk $$6 = cpk.a($$1.a().a(), $$2, $$4, vg.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ahg<cpk> a(String $$0) {
      return ahg.a(ke.aI, new ahh($$0));
   }
}
