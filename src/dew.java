import java.util.Map;
import java.util.Optional;

public class dew {
   public static final akt<dev> a = a("quartz");
   public static final akt<dev> b = a("iron");
   public static final akt<dev> c = a("netherite");
   public static final akt<dev> d = a("redstone");
   public static final akt<dev> e = a("copper");
   public static final akt<dev> f = a("gold");
   public static final akt<dev> g = a("emerald");
   public static final akt<dev> h = a("diamond");
   public static final akt<dev> i = a("lapis");
   public static final akt<dev> j = a("amethyst");
   public static final akt<dev> k = a("resin");

   public static void a(qe<dev> $$0) {
      a($$0, a, cwr.ph, xl.a.a(14931140));
      a($$0, b, cwr.pk, xl.a.a(15527148), Map.of(der.d, "iron_darker"));
      a($$0, c, cwr.pp, xl.a.a(6445145), Map.of(der.h, "netherite_darker"));
      a($$0, d, cwr.me, xl.a.a(9901575));
      a($$0, e, cwr.pm, xl.a.a(11823181));
      a($$0, f, cwr.po, xl.a.a(14594349), Map.of(der.e, "gold_darker"));
      a($$0, g, cwr.pf, xl.a.a(1155126));
      a($$0, h, cwr.pe, xl.a.a(7269586), Map.of(der.f, "diamond_darker"));
      a($$0, i, cwr.pg, xl.a.a(4288151));
      a($$0, j, cwr.pi, xl.a.a(10116294));
      a($$0, k, cwr.vx, xl.a.a(16545810));
   }

   public static Optional<jr.c<dev>> a(jt.a $$0, cwn $$1) {
      return $$0.d(mc.aZ).c().filter($$1x -> $$1.a(((dev)$$1x.a()).b())).findFirst();
   }

   private static void a(qe<dev> $$0, akt<dev> $$1, cwj $$2, xl $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qe<dev> $$0, akt<dev> $$1, cwj $$2, xl $$3, Map<akt<deq>, String> $$4) {
      dev $$5 = dev.a($$1.a().a(), $$2, wo.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static akt<dev> a(String $$0) {
      return akt.a(mc.aZ, aku.b($$0));
   }
}
