import java.util.Map;
import java.util.Optional;

public class cid {
   public static final acp<cic> a = a("quartz");
   public static final acp<cic> b = a("iron");
   public static final acp<cic> c = a("netherite");
   public static final acp<cic> d = a("redstone");
   public static final acp<cic> e = a("copper");
   public static final acp<cic> f = a("gold");
   public static final acp<cic> g = a("emerald");
   public static final acp<cic> h = a("diamond");
   public static final acp<cic> i = a("lapis");
   public static final acp<cic> j = a("amethyst");

   public static void a(nm<cic> $$0) {
      a($$0, a, cgc.nN, ts.a.a(14931140), 0.1F);
      a($$0, b, cgc.nQ, ts.a.a(15527148), 0.2F, Map.of(cdl.c, "iron_darker"));
      a($$0, c, cgc.nV, ts.a.a(6445145), 0.3F, Map.of(cdl.g, "netherite_darker"));
      a($$0, d, cgc.ll, ts.a.a(9901575), 0.4F);
      a($$0, e, cgc.nS, ts.a.a(11823181), 0.5F);
      a($$0, f, cgc.nU, ts.a.a(14594349), 0.6F, Map.of(cdl.d, "gold_darker"));
      a($$0, g, cgc.nL, ts.a.a(1155126), 0.7F);
      a($$0, h, cgc.nK, ts.a.a(7269586), 0.8F, Map.of(cdl.e, "diamond_darker"));
      a($$0, i, cgc.nM, ts.a.a(4288151), 0.9F);
      a($$0, j, cgc.nO, ts.a.a(10116294), 1.0F);
   }

   public static Optional<he.c<cic>> a(hs $$0, cfz $$1) {
      return $$0.d(jc.aD).h().filter($$1x -> $$1.a(((cic)$$1x.a()).b())).findFirst();
   }

   private static void a(nm<cic> $$0, acp<cic> $$1, cfu $$2, ts $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nm<cic> $$0, acp<cic> $$1, cfu $$2, ts $$3, float $$4, Map<cdl, String> $$5) {
      cic $$6 = cic.a($$1.a().a(), $$2, $$4, sw.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static acp<cic> a(String $$0) {
      return acp.a(jc.aD, new acq($$0));
   }
}
