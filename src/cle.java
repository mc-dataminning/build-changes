import java.util.Map;
import java.util.Optional;

public class cle {
   public static final aet<cld> a = a("quartz");
   public static final aet<cld> b = a("iron");
   public static final aet<cld> c = a("netherite");
   public static final aet<cld> d = a("redstone");
   public static final aet<cld> e = a("copper");
   public static final aet<cld> f = a("gold");
   public static final aet<cld> g = a("emerald");
   public static final aet<cld> h = a("diamond");
   public static final aet<cld> i = a("lapis");
   public static final aet<cld> j = a("amethyst");

   public static void a(np<cld> $$0) {
      a($$0, a, cjd.nN, ue.a.a(14931140), 0.1F);
      a($$0, b, cjd.nQ, ue.a.a(15527148), 0.2F, Map.of(cgm.c, "iron_darker"));
      a($$0, c, cjd.nV, ue.a.a(6445145), 0.3F, Map.of(cgm.g, "netherite_darker"));
      a($$0, d, cjd.ll, ue.a.a(9901575), 0.4F);
      a($$0, e, cjd.nS, ue.a.a(11823181), 0.5F);
      a($$0, f, cjd.nU, ue.a.a(14594349), 0.6F, Map.of(cgm.d, "gold_darker"));
      a($$0, g, cjd.nL, ue.a.a(1155126), 0.7F);
      a($$0, h, cjd.nK, ue.a.a(7269586), 0.8F, Map.of(cgm.e, "diamond_darker"));
      a($$0, i, cjd.nM, ue.a.a(4288151), 0.9F);
      a($$0, j, cjd.nO, ue.a.a(10116294), 1.0F);
   }

   public static Optional<hg.c<cld>> a(hu $$0, cja $$1) {
      return $$0.d(je.aD).h().filter($$1x -> $$1.a(((cld)$$1x.a()).b())).findFirst();
   }

   private static void a(np<cld> $$0, aet<cld> $$1, civ $$2, ue $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(np<cld> $$0, aet<cld> $$1, civ $$2, ue $$3, float $$4, Map<cgm, String> $$5) {
      cld $$6 = cld.a($$1.a().a(), $$2, $$4, ti.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static aet<cld> a(String $$0) {
      return aet.a(je.aD, new aeu($$0));
   }
}
