import java.util.Map;
import java.util.Optional;

public class clc {
   public static final aeq<clb> a = a("quartz");
   public static final aeq<clb> b = a("iron");
   public static final aeq<clb> c = a("netherite");
   public static final aeq<clb> d = a("redstone");
   public static final aeq<clb> e = a("copper");
   public static final aeq<clb> f = a("gold");
   public static final aeq<clb> g = a("emerald");
   public static final aeq<clb> h = a("diamond");
   public static final aeq<clb> i = a("lapis");
   public static final aeq<clb> j = a("amethyst");

   public static void a(nm<clb> $$0) {
      a($$0, a, cjb.nN, ub.a.a(14931140), 0.1F);
      a($$0, b, cjb.nQ, ub.a.a(15527148), 0.2F, Map.of(cgk.c, "iron_darker"));
      a($$0, c, cjb.nV, ub.a.a(6445145), 0.3F, Map.of(cgk.g, "netherite_darker"));
      a($$0, d, cjb.ll, ub.a.a(9901575), 0.4F);
      a($$0, e, cjb.nS, ub.a.a(11823181), 0.5F);
      a($$0, f, cjb.nU, ub.a.a(14594349), 0.6F, Map.of(cgk.d, "gold_darker"));
      a($$0, g, cjb.nL, ub.a.a(1155126), 0.7F);
      a($$0, h, cjb.nK, ub.a.a(7269586), 0.8F, Map.of(cgk.e, "diamond_darker"));
      a($$0, i, cjb.nM, ub.a.a(4288151), 0.9F);
      a($$0, j, cjb.nO, ub.a.a(10116294), 1.0F);
   }

   public static Optional<he.c<clb>> a(hs $$0, ciy $$1) {
      return $$0.d(jc.aD).h().filter($$1x -> $$1.a(((clb)$$1x.a()).b())).findFirst();
   }

   private static void a(nm<clb> $$0, aeq<clb> $$1, cit $$2, ub $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nm<clb> $$0, aeq<clb> $$1, cit $$2, ub $$3, float $$4, Map<cgk, String> $$5) {
      clb $$6 = clb.a($$1.a().a(), $$2, $$4, tf.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aeq<clb> a(String $$0) {
      return aeq.a(jc.aD, new aer($$0));
   }
}
