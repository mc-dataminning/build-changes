import java.util.Map;
import java.util.Optional;

public class cvd {
   public static final akg<cvc> a = a("quartz");
   public static final akg<cvc> b = a("iron");
   public static final akg<cvc> c = a("netherite");
   public static final akg<cvc> d = a("redstone");
   public static final akg<cvc> e = a("copper");
   public static final akg<cvc> f = a("gold");
   public static final akg<cvc> g = a("emerald");
   public static final akg<cvc> h = a("diamond");
   public static final akg<cvc> i = a("lapis");
   public static final akg<cvc> j = a("amethyst");

   public static void a(ql<cvc> $$0) {
      a($$0, a, ctc.oB, xr.a.a(14931140), 0.1F);
      a($$0, b, ctc.oE, xr.a.a(15527148), 0.2F, Map.of(cqq.c, "iron_darker"));
      a($$0, c, ctc.oJ, xr.a.a(6445145), 0.3F, Map.of(cqq.g, "netherite_darker"));
      a($$0, d, ctc.lH, xr.a.a(9901575), 0.4F);
      a($$0, e, ctc.oG, xr.a.a(11823181), 0.5F);
      a($$0, f, ctc.oI, xr.a.a(14594349), 0.6F, Map.of(cqq.d, "gold_darker"));
      a($$0, g, ctc.oz, xr.a.a(1155126), 0.7F);
      a($$0, h, ctc.oy, xr.a.a(7269586), 0.8F, Map.of(cqq.e, "diamond_darker"));
      a($$0, i, ctc.oA, xr.a.a(4288151), 0.9F);
      a($$0, j, ctc.oC, xr.a.a(10116294), 1.0F);
   }

   public static Optional<iw.c<cvc>> a(iy.a $$0, csz $$1) {
      return $$0.b(le.aO).b().filter($$1x -> $$1.a(((cvc)$$1x.a()).b())).findFirst();
   }

   private static void a(ql<cvc> $$0, akg<cvc> $$1, csu $$2, xr $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(ql<cvc> $$0, akg<cvc> $$1, csu $$2, xr $$3, float $$4, Map<iw<cqp>, String> $$5) {
      cvc $$6 = cvc.a($$1.a().a(), $$2, $$4, wu.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akg<cvc> a(String $$0) {
      return akg.a(le.aO, new akh($$0));
   }
}
