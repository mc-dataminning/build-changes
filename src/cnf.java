import java.util.Map;
import java.util.Optional;

public class cnf {
   public static final agf<cne> a = a("quartz");
   public static final agf<cne> b = a("iron");
   public static final agf<cne> c = a("netherite");
   public static final agf<cne> d = a("redstone");
   public static final agf<cne> e = a("copper");
   public static final agf<cne> f = a("gold");
   public static final agf<cne> g = a("emerald");
   public static final agf<cne> h = a("diamond");
   public static final agf<cne> i = a("lapis");
   public static final agf<cne> j = a("amethyst");

   public static void a(ou<cne> $$0) {
      a($$0, a, cle.nN, vo.a.a(14931140), 0.1F);
      a($$0, b, cle.nQ, vo.a.a(15527148), 0.2F, Map.of(cin.c, "iron_darker"));
      a($$0, c, cle.nV, vo.a.a(6445145), 0.3F, Map.of(cin.g, "netherite_darker"));
      a($$0, d, cle.ll, vo.a.a(9901575), 0.4F);
      a($$0, e, cle.nS, vo.a.a(11823181), 0.5F);
      a($$0, f, cle.nU, vo.a.a(14594349), 0.6F, Map.of(cin.d, "gold_darker"));
      a($$0, g, cle.nL, vo.a.a(1155126), 0.7F);
      a($$0, h, cle.nK, vo.a.a(7269586), 0.8F, Map.of(cin.e, "diamond_darker"));
      a($$0, i, cle.nM, vo.a.a(4288151), 0.9F);
      a($$0, j, cle.nO, vo.a.a(10116294), 1.0F);
   }

   public static Optional<ib.c<cne>> a(ip $$0, clb $$1) {
      return $$0.d(jz.aF).h().filter($$1x -> $$1.a(((cne)$$1x.a()).b())).findFirst();
   }

   private static void a(ou<cne> $$0, agf<cne> $$1, ckw $$2, vo $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(ou<cne> $$0, agf<cne> $$1, ckw $$2, vo $$3, float $$4, Map<cin, String> $$5) {
      cne $$6 = cne.a($$1.a().a(), $$2, $$4, ur.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static agf<cne> a(String $$0) {
      return agf.a(jz.aF, new agg($$0));
   }
}
