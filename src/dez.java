import java.util.Map;
import java.util.Optional;

public class dez {
   public static final aku<dey> a = a("quartz");
   public static final aku<dey> b = a("iron");
   public static final aku<dey> c = a("netherite");
   public static final aku<dey> d = a("redstone");
   public static final aku<dey> e = a("copper");
   public static final aku<dey> f = a("gold");
   public static final aku<dey> g = a("emerald");
   public static final aku<dey> h = a("diamond");
   public static final aku<dey> i = a("lapis");
   public static final aku<dey> j = a("amethyst");
   public static final aku<dey> k = a("resin");

   public static void a(qe<dey> $$0) {
      a($$0, a, cwu.ph, xm.a.a(14931140));
      a($$0, b, cwu.pk, xm.a.a(15527148), Map.of(deu.d, "iron_darker"));
      a($$0, c, cwu.pp, xm.a.a(6445145), Map.of(deu.h, "netherite_darker"));
      a($$0, d, cwu.me, xm.a.a(9901575));
      a($$0, e, cwu.pm, xm.a.a(11823181));
      a($$0, f, cwu.po, xm.a.a(14594349), Map.of(deu.e, "gold_darker"));
      a($$0, g, cwu.pf, xm.a.a(1155126));
      a($$0, h, cwu.pe, xm.a.a(7269586), Map.of(deu.f, "diamond_darker"));
      a($$0, i, cwu.pg, xm.a.a(4288151));
      a($$0, j, cwu.pi, xm.a.a(10116294));
      a($$0, k, cwu.vx, xm.a.a(16545810));
   }

   public static Optional<jr.c<dey>> a(jt.a $$0, cwq $$1) {
      return $$0.d(mc.aZ).c().filter($$1x -> $$1.a(((dey)$$1x.a()).b())).findFirst();
   }

   private static void a(qe<dey> $$0, aku<dey> $$1, cwm $$2, xm $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qe<dey> $$0, aku<dey> $$1, cwm $$2, xm $$3, Map<aku<det>, String> $$4) {
      dey $$5 = dey.a($$1.a().a(), $$2, wp.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static aku<dey> a(String $$0) {
      return aku.a(mc.aZ, akv.b($$0));
   }
}
