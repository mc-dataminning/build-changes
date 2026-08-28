import java.util.Map;
import java.util.Optional;

public class dex {
   public static final aku<dew> a = a("quartz");
   public static final aku<dew> b = a("iron");
   public static final aku<dew> c = a("netherite");
   public static final aku<dew> d = a("redstone");
   public static final aku<dew> e = a("copper");
   public static final aku<dew> f = a("gold");
   public static final aku<dew> g = a("emerald");
   public static final aku<dew> h = a("diamond");
   public static final aku<dew> i = a("lapis");
   public static final aku<dew> j = a("amethyst");
   public static final aku<dew> k = a("resin");

   public static void a(qe<dew> $$0) {
      a($$0, a, cws.ph, xm.a.a(14931140));
      a($$0, b, cws.pk, xm.a.a(15527148), Map.of(des.d, "iron_darker"));
      a($$0, c, cws.pp, xm.a.a(6445145), Map.of(des.h, "netherite_darker"));
      a($$0, d, cws.me, xm.a.a(9901575));
      a($$0, e, cws.pm, xm.a.a(11823181));
      a($$0, f, cws.po, xm.a.a(14594349), Map.of(des.e, "gold_darker"));
      a($$0, g, cws.pf, xm.a.a(1155126));
      a($$0, h, cws.pe, xm.a.a(7269586), Map.of(des.f, "diamond_darker"));
      a($$0, i, cws.pg, xm.a.a(4288151));
      a($$0, j, cws.pi, xm.a.a(10116294));
      a($$0, k, cws.vx, xm.a.a(16545810));
   }

   public static Optional<jr.c<dew>> a(jt.a $$0, cwo $$1) {
      return $$0.d(mc.aZ).c().filter($$1x -> $$1.a(((dew)$$1x.a()).b())).findFirst();
   }

   private static void a(qe<dew> $$0, aku<dew> $$1, cwk $$2, xm $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qe<dew> $$0, aku<dew> $$1, cwk $$2, xm $$3, Map<aku<der>, String> $$4) {
      dew $$5 = dew.a($$1.a().a(), $$2, wp.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static aku<dew> a(String $$0) {
      return aku.a(mc.aZ, akv.b($$0));
   }
}
