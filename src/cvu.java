import java.util.Map;
import java.util.Optional;

public class cvu {
   public static final akl<cvt> a = a("quartz");
   public static final akl<cvt> b = a("iron");
   public static final akl<cvt> c = a("netherite");
   public static final akl<cvt> d = a("redstone");
   public static final akl<cvt> e = a("copper");
   public static final akl<cvt> f = a("gold");
   public static final akl<cvt> g = a("emerald");
   public static final akl<cvt> h = a("diamond");
   public static final akl<cvt> i = a("lapis");
   public static final akl<cvt> j = a("amethyst");

   public static void a(qo<cvt> $$0) {
      a($$0, a, ctr.oB, xu.a.a(14931140), 0.1F);
      a($$0, b, ctr.oE, xu.a.a(15527148), 0.2F, Map.of(crf.c, "iron_darker"));
      a($$0, c, ctr.oJ, xu.a.a(6445145), 0.3F, Map.of(crf.g, "netherite_darker"));
      a($$0, d, ctr.lH, xu.a.a(9901575), 0.4F);
      a($$0, e, ctr.oG, xu.a.a(11823181), 0.5F);
      a($$0, f, ctr.oI, xu.a.a(14594349), 0.6F, Map.of(crf.d, "gold_darker"));
      a($$0, g, ctr.oz, xu.a.a(1155126), 0.7F);
      a($$0, h, ctr.oy, xu.a.a(7269586), 0.8F, Map.of(crf.e, "diamond_darker"));
      a($$0, i, ctr.oA, xu.a.a(4288151), 0.9F);
      a($$0, j, ctr.oC, xu.a.a(10116294), 1.0F);
   }

   public static Optional<ix.c<cvt>> a(iz.a $$0, cto $$1) {
      return $$0.b(lf.aO).b().filter($$1x -> $$1.a(((cvt)$$1x.a()).b())).findFirst();
   }

   private static void a(qo<cvt> $$0, akl<cvt> $$1, ctj $$2, xu $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(qo<cvt> $$0, akl<cvt> $$1, ctj $$2, xu $$3, float $$4, Map<ix<cre>, String> $$5) {
      cvt $$6 = cvt.a($$1.a().a(), $$2, $$4, wx.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static akl<cvt> a(String $$0) {
      return akl.a(lf.aO, new akm($$0));
   }
}
