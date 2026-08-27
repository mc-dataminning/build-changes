import java.util.Map;
import java.util.Optional;

public class clb {
   public static final aeq<cla> a = a("quartz");
   public static final aeq<cla> b = a("iron");
   public static final aeq<cla> c = a("netherite");
   public static final aeq<cla> d = a("redstone");
   public static final aeq<cla> e = a("copper");
   public static final aeq<cla> f = a("gold");
   public static final aeq<cla> g = a("emerald");
   public static final aeq<cla> h = a("diamond");
   public static final aeq<cla> i = a("lapis");
   public static final aeq<cla> j = a("amethyst");

   public static void a(nm<cla> $$0) {
      a($$0, a, cja.nN, ub.a.a(14931140), 0.1F);
      a($$0, b, cja.nQ, ub.a.a(15527148), 0.2F, Map.of(cgj.c, "iron_darker"));
      a($$0, c, cja.nV, ub.a.a(6445145), 0.3F, Map.of(cgj.g, "netherite_darker"));
      a($$0, d, cja.ll, ub.a.a(9901575), 0.4F);
      a($$0, e, cja.nS, ub.a.a(11823181), 0.5F);
      a($$0, f, cja.nU, ub.a.a(14594349), 0.6F, Map.of(cgj.d, "gold_darker"));
      a($$0, g, cja.nL, ub.a.a(1155126), 0.7F);
      a($$0, h, cja.nK, ub.a.a(7269586), 0.8F, Map.of(cgj.e, "diamond_darker"));
      a($$0, i, cja.nM, ub.a.a(4288151), 0.9F);
      a($$0, j, cja.nO, ub.a.a(10116294), 1.0F);
   }

   public static Optional<he.c<cla>> a(hs $$0, cix $$1) {
      return $$0.d(jc.aD).h().filter($$1x -> $$1.a(((cla)$$1x.a()).b())).findFirst();
   }

   private static void a(nm<cla> $$0, aeq<cla> $$1, cis $$2, ub $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nm<cla> $$0, aeq<cla> $$1, cis $$2, ub $$3, float $$4, Map<cgj, String> $$5) {
      cla $$6 = cla.a($$1.a().a(), $$2, $$4, tf.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aeq<cla> a(String $$0) {
      return aeq.a(jc.aD, new aer($$0));
   }
}
