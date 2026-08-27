import java.util.Map;
import java.util.Optional;

public class cmn {
   public static final afv<cmm> a = a("quartz");
   public static final afv<cmm> b = a("iron");
   public static final afv<cmm> c = a("netherite");
   public static final afv<cmm> d = a("redstone");
   public static final afv<cmm> e = a("copper");
   public static final afv<cmm> f = a("gold");
   public static final afv<cmm> g = a("emerald");
   public static final afv<cmm> h = a("diamond");
   public static final afv<cmm> i = a("lapis");
   public static final afv<cmm> j = a("amethyst");

   public static void a(oo<cmm> $$0) {
      a($$0, a, ckm.nN, vf.a.a(14931140), 0.1F);
      a($$0, b, ckm.nQ, vf.a.a(15527148), 0.2F, Map.of(chv.c, "iron_darker"));
      a($$0, c, ckm.nV, vf.a.a(6445145), 0.3F, Map.of(chv.g, "netherite_darker"));
      a($$0, d, ckm.ll, vf.a.a(9901575), 0.4F);
      a($$0, e, ckm.nS, vf.a.a(11823181), 0.5F);
      a($$0, f, ckm.nU, vf.a.a(14594349), 0.6F, Map.of(chv.d, "gold_darker"));
      a($$0, g, ckm.nL, vf.a.a(1155126), 0.7F);
      a($$0, h, ckm.nK, vf.a.a(7269586), 0.8F, Map.of(chv.e, "diamond_darker"));
      a($$0, i, ckm.nM, vf.a.a(4288151), 0.9F);
      a($$0, j, ckm.nO, vf.a.a(10116294), 1.0F);
   }

   public static Optional<ib.c<cmm>> a(ip $$0, ckj $$1) {
      return $$0.d(jz.aE).h().filter($$1x -> $$1.a(((cmm)$$1x.a()).b())).findFirst();
   }

   private static void a(oo<cmm> $$0, afv<cmm> $$1, cke $$2, vf $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(oo<cmm> $$0, afv<cmm> $$1, cke $$2, vf $$3, float $$4, Map<chv, String> $$5) {
      cmm $$6 = cmm.a($$1.a().a(), $$2, $$4, ui.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static afv<cmm> a(String $$0) {
      return afv.a(jz.aE, new afw($$0));
   }
}
