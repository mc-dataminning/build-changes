import java.util.Map;
import java.util.Optional;

public class clj {
   public static final aew<cli> a = a("quartz");
   public static final aew<cli> b = a("iron");
   public static final aew<cli> c = a("netherite");
   public static final aew<cli> d = a("redstone");
   public static final aew<cli> e = a("copper");
   public static final aew<cli> f = a("gold");
   public static final aew<cli> g = a("emerald");
   public static final aew<cli> h = a("diamond");
   public static final aew<cli> i = a("lapis");
   public static final aew<cli> j = a("amethyst");

   public static void a(nt<cli> $$0) {
      a($$0, a, cji.nN, ui.a.a(14931140), 0.1F);
      a($$0, b, cji.nQ, ui.a.a(15527148), 0.2F, Map.of(cgr.c, "iron_darker"));
      a($$0, c, cji.nV, ui.a.a(6445145), 0.3F, Map.of(cgr.g, "netherite_darker"));
      a($$0, d, cji.ll, ui.a.a(9901575), 0.4F);
      a($$0, e, cji.nS, ui.a.a(11823181), 0.5F);
      a($$0, f, cji.nU, ui.a.a(14594349), 0.6F, Map.of(cgr.d, "gold_darker"));
      a($$0, g, cji.nL, ui.a.a(1155126), 0.7F);
      a($$0, h, cji.nK, ui.a.a(7269586), 0.8F, Map.of(cgr.e, "diamond_darker"));
      a($$0, i, cji.nM, ui.a.a(4288151), 0.9F);
      a($$0, j, cji.nO, ui.a.a(10116294), 1.0F);
   }

   public static Optional<hg.c<cli>> a(hu $$0, cjf $$1) {
      return $$0.d(je.aD).h().filter($$1x -> $$1.a(((cli)$$1x.a()).b())).findFirst();
   }

   private static void a(nt<cli> $$0, aew<cli> $$1, cja $$2, ui $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nt<cli> $$0, aew<cli> $$1, cja $$2, ui $$3, float $$4, Map<cgr, String> $$5) {
      cli $$6 = cli.a($$1.a().a(), $$2, $$4, tm.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aew<cli> a(String $$0) {
      return aew.a(je.aD, new aex($$0));
   }
}
