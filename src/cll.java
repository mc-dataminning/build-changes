import java.util.Map;
import java.util.Optional;

public class cll {
   public static final aex<clk> a = a("quartz");
   public static final aex<clk> b = a("iron");
   public static final aex<clk> c = a("netherite");
   public static final aex<clk> d = a("redstone");
   public static final aex<clk> e = a("copper");
   public static final aex<clk> f = a("gold");
   public static final aex<clk> g = a("emerald");
   public static final aex<clk> h = a("diamond");
   public static final aex<clk> i = a("lapis");
   public static final aex<clk> j = a("amethyst");

   public static void a(nt<clk> $$0) {
      a($$0, a, cjk.nN, uj.a.a(14931140), 0.1F);
      a($$0, b, cjk.nQ, uj.a.a(15527148), 0.2F, Map.of(cgt.c, "iron_darker"));
      a($$0, c, cjk.nV, uj.a.a(6445145), 0.3F, Map.of(cgt.g, "netherite_darker"));
      a($$0, d, cjk.ll, uj.a.a(9901575), 0.4F);
      a($$0, e, cjk.nS, uj.a.a(11823181), 0.5F);
      a($$0, f, cjk.nU, uj.a.a(14594349), 0.6F, Map.of(cgt.d, "gold_darker"));
      a($$0, g, cjk.nL, uj.a.a(1155126), 0.7F);
      a($$0, h, cjk.nK, uj.a.a(7269586), 0.8F, Map.of(cgt.e, "diamond_darker"));
      a($$0, i, cjk.nM, uj.a.a(4288151), 0.9F);
      a($$0, j, cjk.nO, uj.a.a(10116294), 1.0F);
   }

   public static Optional<hg.c<clk>> a(hu $$0, cjh $$1) {
      return $$0.d(je.aD).h().filter($$1x -> $$1.a(((clk)$$1x.a()).b())).findFirst();
   }

   private static void a(nt<clk> $$0, aex<clk> $$1, cjc $$2, uj $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nt<clk> $$0, aex<clk> $$1, cjc $$2, uj $$3, float $$4, Map<cgt, String> $$5) {
      clk $$6 = clk.a($$1.a().a(), $$2, $$4, tn.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aex<clk> a(String $$0) {
      return aex.a(je.aD, new aey($$0));
   }
}
