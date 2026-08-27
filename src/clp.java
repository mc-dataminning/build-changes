import java.util.Map;
import java.util.Optional;

public class clp {
   public static final aey<clo> a = a("quartz");
   public static final aey<clo> b = a("iron");
   public static final aey<clo> c = a("netherite");
   public static final aey<clo> d = a("redstone");
   public static final aey<clo> e = a("copper");
   public static final aey<clo> f = a("gold");
   public static final aey<clo> g = a("emerald");
   public static final aey<clo> h = a("diamond");
   public static final aey<clo> i = a("lapis");
   public static final aey<clo> j = a("amethyst");

   public static void a(nr<clo> $$0) {
      a($$0, a, cjo.nN, ui.a.a(14931140), 0.1F);
      a($$0, b, cjo.nQ, ui.a.a(15527148), 0.2F, Map.of(cgx.c, "iron_darker"));
      a($$0, c, cjo.nV, ui.a.a(6445145), 0.3F, Map.of(cgx.g, "netherite_darker"));
      a($$0, d, cjo.ll, ui.a.a(9901575), 0.4F);
      a($$0, e, cjo.nS, ui.a.a(11823181), 0.5F);
      a($$0, f, cjo.nU, ui.a.a(14594349), 0.6F, Map.of(cgx.d, "gold_darker"));
      a($$0, g, cjo.nL, ui.a.a(1155126), 0.7F);
      a($$0, h, cjo.nK, ui.a.a(7269586), 0.8F, Map.of(cgx.e, "diamond_darker"));
      a($$0, i, cjo.nM, ui.a.a(4288151), 0.9F);
      a($$0, j, cjo.nO, ui.a.a(10116294), 1.0F);
   }

   public static Optional<he.c<clo>> a(hr $$0, cjl $$1) {
      return $$0.d(jc.aE).h().filter($$1x -> $$1.a(((clo)$$1x.a()).b())).findFirst();
   }

   private static void a(nr<clo> $$0, aey<clo> $$1, cjg $$2, ui $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nr<clo> $$0, aey<clo> $$1, cjg $$2, ui $$3, float $$4, Map<cgx, String> $$5) {
      clo $$6 = clo.a($$1.a().a(), $$2, $$4, tl.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aey<clo> a(String $$0) {
      return aey.a(jc.aE, new aez($$0));
   }
}
