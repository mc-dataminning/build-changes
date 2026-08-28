import java.util.Map;
import java.util.Optional;

public class dey {
   public static final akt<dex> a = a("quartz");
   public static final akt<dex> b = a("iron");
   public static final akt<dex> c = a("netherite");
   public static final akt<dex> d = a("redstone");
   public static final akt<dex> e = a("copper");
   public static final akt<dex> f = a("gold");
   public static final akt<dex> g = a("emerald");
   public static final akt<dex> h = a("diamond");
   public static final akt<dex> i = a("lapis");
   public static final akt<dex> j = a("amethyst");
   public static final akt<dex> k = a("resin");

   public static void a(qe<dex> $$0) {
      a($$0, a, cwt.ph, xl.a.a(14931140));
      a($$0, b, cwt.pk, xl.a.a(15527148), Map.of(det.d, "iron_darker"));
      a($$0, c, cwt.pp, xl.a.a(6445145), Map.of(det.h, "netherite_darker"));
      a($$0, d, cwt.me, xl.a.a(9901575));
      a($$0, e, cwt.pm, xl.a.a(11823181));
      a($$0, f, cwt.po, xl.a.a(14594349), Map.of(det.e, "gold_darker"));
      a($$0, g, cwt.pf, xl.a.a(1155126));
      a($$0, h, cwt.pe, xl.a.a(7269586), Map.of(det.f, "diamond_darker"));
      a($$0, i, cwt.pg, xl.a.a(4288151));
      a($$0, j, cwt.pi, xl.a.a(10116294));
      a($$0, k, cwt.vx, xl.a.a(16545810));
   }

   public static Optional<jr.c<dex>> a(jt.a $$0, cwp $$1) {
      return $$0.d(mc.aZ).c().filter($$1x -> $$1.a(((dex)$$1x.a()).b())).findFirst();
   }

   private static void a(qe<dex> $$0, akt<dex> $$1, cwl $$2, xl $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qe<dex> $$0, akt<dex> $$1, cwl $$2, xl $$3, Map<akt<des>, String> $$4) {
      dex $$5 = dex.a($$1.a().a(), $$2, wo.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static akt<dex> a(String $$0) {
      return akt.a(mc.aZ, aku.b($$0));
   }
}
