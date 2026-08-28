import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cik {
   public static final alf<cij> a = a("armorer");
   public static final alf<cij> b = a("butcher");
   public static final alf<cij> c = a("cartographer");
   public static final alf<cij> d = a("cleric");
   public static final alf<cij> e = a("farmer");
   public static final alf<cij> f = a("fisherman");
   public static final alf<cij> g = a("fletcher");
   public static final alf<cij> h = a("leatherworker");
   public static final alf<cij> i = a("librarian");
   public static final alf<cij> j = a("mason");
   public static final alf<cij> k = a("shepherd");
   public static final alf<cij> l = a("toolsmith");
   public static final alf<cij> m = a("weaponsmith");
   public static final alf<cij> n = a("home");
   public static final alf<cij> o = a("meeting");
   public static final alf<cij> p = a("beehive");
   public static final alf<cij> q = a("bee_nest");
   public static final alf<cij> r = a("nether_portal");
   public static final alf<cij> s = a("lodestone");
   public static final alf<cij> t = a("lightning_rod");
   private static final Set<eah> u = ImmutableList.of(
         dmh.bu, dmh.bv, dmh.br, dmh.bs, dmh.bp, dmh.bn, dmh.bt, dmh.bj, dmh.bo, dmh.bl, dmh.bi, dmh.bh, new dmf[]{dmh.bm, dmh.bq, dmh.bg, dmh.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dly.b) == eau.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<eah> v = ImmutableList.of(dmh.fS, dmh.fU, dmh.fT, dmh.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<eah, je<cij>> w = Maps.newHashMap();

   private static Set<eah> a(dmf $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alf<cij> a(String $$0) {
      return alf.a(mg.aa, alg.b($$0));
   }

   private static cij a(jr<cij> $$0, alf<cij> $$1, Set<eah> $$2, int $$3, int $$4) {
      cij $$5 = new cij($$2, $$3, $$4);
      jr.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(je<cij> $$0, Set<eah> $$1) {
      $$1.forEach($$1x -> {
         je<cij> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<je<cij>> a(eah $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(eah $$0) {
      return w.containsKey($$0);
   }

   public static cij a(jr<cij> $$0) {
      a($$0, a, a(dmh.oC), 1, 1);
      a($$0, b, a(dmh.oB), 1, 1);
      a($$0, c, a(dmh.oD), 1, 1);
      a($$0, d, a(dmh.fR), 1, 1);
      a($$0, e, a(dmh.pK), 1, 1);
      a($$0, f, a(dmh.oA), 1, 1);
      a($$0, g, a(dmh.oE), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dmh.oG), 1, 1);
      a($$0, j, a(dmh.oI), 1, 1);
      a($$0, k, a(dmh.oz), 1, 1);
      a($$0, l, a(dmh.oH), 1, 1);
      a($$0, m, a(dmh.oF), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dmh.oJ), 32, 6);
      a($$0, p, a(dmh.pN), 0, 1);
      a($$0, q, a(dmh.pM), 0, 1);
      a($$0, r, a(dmh.eu), 0, 1);
      a($$0, s, a(dmh.pY), 0, 1);
      return a($$0, t, a(dmh.ta), 0, 1);
   }
}
