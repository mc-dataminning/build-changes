import java.util.Map;
import java.util.Optional;

public class dfq {
   public static final akt<dfp> a = a("quartz");
   public static final akt<dfp> b = a("iron");
   public static final akt<dfp> c = a("netherite");
   public static final akt<dfp> d = a("redstone");
   public static final akt<dfp> e = a("copper");
   public static final akt<dfp> f = a("gold");
   public static final akt<dfp> g = a("emerald");
   public static final akt<dfp> h = a("diamond");
   public static final akt<dfp> i = a("lapis");
   public static final akt<dfp> j = a("amethyst");
   public static final akt<dfp> k = a("resin");

   public static void a(qe<dfp> $$0) {
      a($$0, a, cxl.pj, xm.a.a(14931140));
      a($$0, b, cxl.pm, xm.a.a(15527148), Map.of(dfl.d, "iron_darker"));
      a($$0, c, cxl.pr, xm.a.a(6445145), Map.of(dfl.h, "netherite_darker"));
      a($$0, d, cxl.mg, xm.a.a(9901575));
      a($$0, e, cxl.po, xm.a.a(11823181));
      a($$0, f, cxl.pq, xm.a.a(14594349), Map.of(dfl.e, "gold_darker"));
      a($$0, g, cxl.ph, xm.a.a(1155126));
      a($$0, h, cxl.pg, xm.a.a(7269586), Map.of(dfl.f, "diamond_darker"));
      a($$0, i, cxl.pi, xm.a.a(4288151));
      a($$0, j, cxl.pk, xm.a.a(10116294));
      a($$0, k, cxl.vz, xm.a.a(16545810));
   }

   public static Optional<jr.c<dfp>> a(jt.a $$0, cxh $$1) {
      return $$0.d(mc.bb).c().filter($$1x -> $$1.a(((dfp)$$1x.a()).b())).findFirst();
   }

   private static void a(qe<dfp> $$0, akt<dfp> $$1, cxd $$2, xm $$3) {
      a($$0, $$1, $$2, $$3, Map.of());
   }

   private static void a(qe<dfp> $$0, akt<dfp> $$1, cxd $$2, xm $$3, Map<akt<dfk>, String> $$4) {
      dfp $$5 = dfp.a($$1.a().a(), $$2, wp.c(af.a("trim_material", $$1.a())).c($$3), $$4);
      $$0.a($$1, $$5);
   }

   private static akt<dfp> a(String $$0) {
      return akt.a(mc.bb, aku.b($$0));
   }
}
