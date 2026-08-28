import java.util.Map;
import java.util.Optional;

public class cxw {
   public static final ald<cxv> a = a("quartz");
   public static final ald<cxv> b = a("iron");
   public static final ald<cxv> c = a("netherite");
   public static final ald<cxv> d = a("redstone");
   public static final ald<cxv> e = a("copper");
   public static final ald<cxv> f = a("gold");
   public static final ald<cxv> g = a("emerald");
   public static final ald<cxv> h = a("diamond");
   public static final ald<cxv> i = a("lapis");
   public static final ald<cxv> j = a("amethyst");

   public static void a(qu<cxv> $$0) {
      a($$0, a, cvw.oD, yb.a.a(14931140), 0.1F);
      a($$0, b, cvw.oG, yb.a.a(15527148), 0.2F, Map.of(ctn.j, "iron_darker"));
      a($$0, c, cvw.oL, yb.a.a(6445145), 0.3F, Map.of(ctn.n, "netherite_darker"));
      a($$0, d, cvw.lH, yb.a.a(9901575), 0.4F);
      a($$0, e, cvw.oI, yb.a.a(11823181), 0.5F);
      a($$0, f, cvw.oK, yb.a.a(14594349), 0.6F, Map.of(ctn.k, "gold_darker"));
      a($$0, g, cvw.oB, yb.a.a(1155126), 0.7F);
      a($$0, h, cvw.oA, yb.a.a(7269586), 0.8F, Map.of(ctn.l, "diamond_darker"));
      a($$0, i, cvw.oC, yb.a.a(4288151), 0.9F);
      a($$0, j, cvw.oE, yb.a.a(10116294), 1.0F);
   }

   public static Optional<jo.c<cxv>> a(jq.a $$0, cvs $$1) {
      return $$0.d(lw.aY).c().filter($$1x -> $$1.a(((cxv)$$1x.a()).b())).findFirst();
   }

   private static void a(qu<cxv> $$0, ald<cxv> $$1, cvn $$2, yb $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qu<cxv> $$0, ald<cxv> $$1, cvn $$2, yb $$3, float $$4, Map<jo<ctm>, String> $$5) {
      cxv $$6 = cxv.a($$1.a().a(), $$2, $$4, xe.c(ad.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ald<cxv> a(String $$0) {
      return ald.a(lw.aY, ale.b($$0));
   }
}
