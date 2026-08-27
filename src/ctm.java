import java.util.Map;
import java.util.Optional;

public class ctm {
   public static final ajs<ctl> a = a("quartz");
   public static final ajs<ctl> b = a("iron");
   public static final ajs<ctl> c = a("netherite");
   public static final ajs<ctl> d = a("redstone");
   public static final ajs<ctl> e = a("copper");
   public static final ajs<ctl> f = a("gold");
   public static final ajs<ctl> g = a("emerald");
   public static final ajs<ctl> h = a("diamond");
   public static final ajs<ctl> i = a("lapis");
   public static final ajs<ctl> j = a("amethyst");

   public static void a(px<ctl> $$0) {
      a($$0, a, crm.oA, xd.a.a(14931140), 0.1F);
      a($$0, b, crm.oD, xd.a.a(15527148), 0.2F, Map.of(cpa.c, "iron_darker"));
      a($$0, c, crm.oI, xd.a.a(6445145), 0.3F, Map.of(cpa.g, "netherite_darker"));
      a($$0, d, crm.lG, xd.a.a(9901575), 0.4F);
      a($$0, e, crm.oF, xd.a.a(11823181), 0.5F);
      a($$0, f, crm.oH, xd.a.a(14594349), 0.6F, Map.of(cpa.d, "gold_darker"));
      a($$0, g, crm.oy, xd.a.a(1155126), 0.7F);
      a($$0, h, crm.ox, xd.a.a(7269586), 0.8F, Map.of(cpa.e, "diamond_darker"));
      a($$0, i, crm.oz, xd.a.a(4288151), 0.9F);
      a($$0, j, crm.oB, xd.a.a(10116294), 1.0F);
   }

   public static Optional<il.c<ctl>> a(iz $$0, crj $$1) {
      return $$0.d(ks.aK).h().filter($$1x -> $$1.a(((ctl)$$1x.a()).b())).findFirst();
   }

   private static void a(px<ctl> $$0, ajs<ctl> $$1, cre $$2, xd $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(px<ctl> $$0, ajs<ctl> $$1, cre $$2, xd $$3, float $$4, Map<il<coz>, String> $$5) {
      ctl $$6 = ctl.a($$1.a().a(), $$2, $$4, wg.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ajs<ctl> a(String $$0) {
      return ajs.a(ks.aK, new ajt($$0));
   }
}
