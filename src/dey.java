import java.util.Map;
import java.util.Optional;

public class dey {
   public static final aku<dex> a = a("quartz");
   public static final aku<dex> b = a("iron");
   public static final aku<dex> c = a("netherite");
   public static final aku<dex> d = a("redstone");
   public static final aku<dex> e = a("copper");
   public static final aku<dex> f = a("gold");
   public static final aku<dex> g = a("emerald");
   public static final aku<dex> h = a("diamond");
   public static final aku<dex> i = a("lapis");
   public static final aku<dex> j = a("amethyst");
   public static final aku<dex> k = a("resin");

   public static void a(qe<dex> $$0) {
      a($$0, a, cwt.ph, xm.a.a(14931140));
      a($$0, b, cwt.pk, xm.a.a(15527148), Map.of(det.d, "iron_darker"));
      a($$0, c, cwt.pp, xm.a.a(6445145), Map.of(det.h, "netherite_darker"));
      a($$0, d, cwt.me, xm.a.a(9901575));
      a($$0, e, cwt.pm, xm.a.a(11823181));
      a($$0, f, cwt.po, xm.a.a(14594349), Map.of(det.e, "gold_darker"));
      a($$0, g, cwt.pf, xm.a.a(1155126));
      a($$0, h, cwt.pe, xm.a.a(7269586), Map.of(det.f, "diamond_darker"));
      a($$0, i, cwt.pg, xm.a.a(4288151));
      a($$0, j, cwt.pi, xm.a.a(10116294));
      a($$0, k, cwt.vx, xm.a.a(16545810));
   }

   public static Optional<jr.c<dex>> a(jt.a $$0, cwp $$1) {
      return $$0.d(mc.aZ).c().filter($$1x -> $$1.a(((dex)$$1x.a()).b())).findFirst();
   }

   private static void a(qe<dex> $$0, aku<dex> $$1, cwl $$2, xm $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qe<dex> $$0, aku<dex> $$1, cwl $$2, xm $$3, Map<aku<des>, String> $$4) {
      dex $$5 = dex.a($$1.a().a(), $$2, wp.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static aku<dex> a(String $$0) {
      return aku.a(mc.aZ, akv.b($$0));
   }
}
