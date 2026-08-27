import java.util.Map;
import java.util.Optional;

public class cla {
   public static final aeo<ckz> a = a("quartz");
   public static final aeo<ckz> b = a("iron");
   public static final aeo<ckz> c = a("netherite");
   public static final aeo<ckz> d = a("redstone");
   public static final aeo<ckz> e = a("copper");
   public static final aeo<ckz> f = a("gold");
   public static final aeo<ckz> g = a("emerald");
   public static final aeo<ckz> h = a("diamond");
   public static final aeo<ckz> i = a("lapis");
   public static final aeo<ckz> j = a("amethyst");

   public static void a(nn<ckz> $$0) {
      a($$0, a, ciz.nN, ua.a.a(14931140), 0.1F);
      a($$0, b, ciz.nQ, ua.a.a(15527148), 0.2F, Map.of(cgi.c, "iron_darker"));
      a($$0, c, ciz.nV, ua.a.a(6445145), 0.3F, Map.of(cgi.g, "netherite_darker"));
      a($$0, d, ciz.ll, ua.a.a(9901575), 0.4F);
      a($$0, e, ciz.nS, ua.a.a(11823181), 0.5F);
      a($$0, f, ciz.nU, ua.a.a(14594349), 0.6F, Map.of(cgi.d, "gold_darker"));
      a($$0, g, ciz.nL, ua.a.a(1155126), 0.7F);
      a($$0, h, ciz.nK, ua.a.a(7269586), 0.8F, Map.of(cgi.e, "diamond_darker"));
      a($$0, i, ciz.nM, ua.a.a(4288151), 0.9F);
      a($$0, j, ciz.nO, ua.a.a(10116294), 1.0F);
   }

   public static Optional<hf.c<ckz>> a(ht $$0, ciw $$1) {
      return $$0.d(jd.aD).h().filter($$1x -> $$1.a(((ckz)$$1x.a()).b())).findFirst();
   }

   private static void a(nn<ckz> $$0, aeo<ckz> $$1, cir $$2, ua $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(nn<ckz> $$0, aeo<ckz> $$1, cir $$2, ua $$3, float $$4, Map<cgi, String> $$5) {
      ckz $$6 = ckz.a($$1.a().a(), $$2, $$4, te.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aeo<ckz> a(String $$0) {
      return aeo.a(jd.aD, new aep($$0));
   }
}
