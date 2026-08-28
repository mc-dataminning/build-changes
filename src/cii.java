import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cii {
   public static final alf<cih> a = a("armorer");
   public static final alf<cih> b = a("butcher");
   public static final alf<cih> c = a("cartographer");
   public static final alf<cih> d = a("cleric");
   public static final alf<cih> e = a("farmer");
   public static final alf<cih> f = a("fisherman");
   public static final alf<cih> g = a("fletcher");
   public static final alf<cih> h = a("leatherworker");
   public static final alf<cih> i = a("librarian");
   public static final alf<cih> j = a("mason");
   public static final alf<cih> k = a("shepherd");
   public static final alf<cih> l = a("toolsmith");
   public static final alf<cih> m = a("weaponsmith");
   public static final alf<cih> n = a("home");
   public static final alf<cih> o = a("meeting");
   public static final alf<cih> p = a("beehive");
   public static final alf<cih> q = a("bee_nest");
   public static final alf<cih> r = a("nether_portal");
   public static final alf<cih> s = a("lodestone");
   public static final alf<cih> t = a("lightning_rod");
   private static final Set<dzz> u = ImmutableList.of(
         dmc.bu, dmc.bv, dmc.br, dmc.bs, dmc.bp, dmc.bn, dmc.bt, dmc.bj, dmc.bo, dmc.bl, dmc.bi, dmc.bh, new dma[]{dmc.bm, dmc.bq, dmc.bg, dmc.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dlt.b) == eam.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dzz> v = ImmutableList.of(dmc.fP, dmc.fR, dmc.fQ, dmc.fS)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dzz, je<cih>> w = Maps.newHashMap();

   private static Set<dzz> a(dma $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alf<cih> a(String $$0) {
      return alf.a(mg.aa, alg.b($$0));
   }

   private static cih a(jr<cih> $$0, alf<cih> $$1, Set<dzz> $$2, int $$3, int $$4) {
      cih $$5 = new cih($$2, $$3, $$4);
      jr.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(je<cih> $$0, Set<dzz> $$1) {
      $$1.forEach($$1x -> {
         je<cih> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<je<cih>> a(dzz $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dzz $$0) {
      return w.containsKey($$0);
   }

   public static cih a(jr<cih> $$0) {
      a($$0, a, a(dmc.oz), 1, 1);
      a($$0, b, a(dmc.oy), 1, 1);
      a($$0, c, a(dmc.oA), 1, 1);
      a($$0, d, a(dmc.fO), 1, 1);
      a($$0, e, a(dmc.pH), 1, 1);
      a($$0, f, a(dmc.ox), 1, 1);
      a($$0, g, a(dmc.oB), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dmc.oD), 1, 1);
      a($$0, j, a(dmc.oF), 1, 1);
      a($$0, k, a(dmc.ow), 1, 1);
      a($$0, l, a(dmc.oE), 1, 1);
      a($$0, m, a(dmc.oC), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dmc.oG), 32, 6);
      a($$0, p, a(dmc.pK), 0, 1);
      a($$0, q, a(dmc.pJ), 0, 1);
      a($$0, r, a(dmc.er), 0, 1);
      a($$0, s, a(dmc.pV), 0, 1);
      return a($$0, t, a(dmc.sX), 0, 1);
   }
}
