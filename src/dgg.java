import java.util.Map;
import java.util.Optional;

public class dgg {
   public static final alc<dgf> a = a("quartz");
   public static final alc<dgf> b = a("iron");
   public static final alc<dgf> c = a("netherite");
   public static final alc<dgf> d = a("redstone");
   public static final alc<dgf> e = a("copper");
   public static final alc<dgf> f = a("gold");
   public static final alc<dgf> g = a("emerald");
   public static final alc<dgf> h = a("diamond");
   public static final alc<dgf> i = a("lapis");
   public static final alc<dgf> j = a("amethyst");
   public static final alc<dgf> k = a("resin");

   public static void a(qg<dgf> $$0) {
      a($$0, a, cyc.pl, xs.a.a(14931140));
      a($$0, b, cyc.po, xs.a.a(15527148), Map.of(dgb.d, "iron_darker"));
      a($$0, c, cyc.pt, xs.a.a(6445145), Map.of(dgb.h, "netherite_darker"));
      a($$0, d, cyc.mg, xs.a.a(9901575));
      a($$0, e, cyc.pq, xs.a.a(11823181));
      a($$0, f, cyc.ps, xs.a.a(14594349), Map.of(dgb.e, "gold_darker"));
      a($$0, g, cyc.pj, xs.a.a(1155126));
      a($$0, h, cyc.pi, xs.a.a(7269586), Map.of(dgb.f, "diamond_darker"));
      a($$0, i, cyc.pk, xs.a.a(4288151));
      a($$0, j, cyc.pm, xs.a.a(10116294));
      a($$0, k, cyc.vB, xs.a.a(16545810));
   }

   public static Optional<js.c<dgf>> a(ju.a $$0, cxy $$1) {
      return $$0.e(me.bg).c().filter($$1x -> $$1.a(((dgf)$$1x.a()).b())).findFirst();
   }

   private static void a(qg<dgf> $$0, alc<dgf> $$1, cxu $$2, xs $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qg<dgf> $$0, alc<dgf> $$1, cxu $$2, xs $$3, Map<alc<dga>, String> $$4) {
      dgf $$5 = dgf.a($$1.a().a(), $$2, wv.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static alc<dgf> a(String $$0) {
      return alc.a(me.bg, ald.b($$0));
   }
}
