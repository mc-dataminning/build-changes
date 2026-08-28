import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cey {
   public static final ale<cex> a = a("armorer");
   public static final ale<cex> b = a("butcher");
   public static final ale<cex> c = a("cartographer");
   public static final ale<cex> d = a("cleric");
   public static final ale<cex> e = a("farmer");
   public static final ale<cex> f = a("fisherman");
   public static final ale<cex> g = a("fletcher");
   public static final ale<cex> h = a("leatherworker");
   public static final ale<cex> i = a("librarian");
   public static final ale<cex> j = a("mason");
   public static final ale<cex> k = a("shepherd");
   public static final ale<cex> l = a("toolsmith");
   public static final ale<cex> m = a("weaponsmith");
   public static final ale<cex> n = a("home");
   public static final ale<cex> o = a("meeting");
   public static final ale<cex> p = a("beehive");
   public static final ale<cex> q = a("bee_nest");
   public static final ale<cex> r = a("nether_portal");
   public static final ale<cex> s = a("lodestone");
   public static final ale<cex> t = a("lightning_rod");
   private static final Set<dsd> u = ImmutableList.of(
         dfc.bn, dfc.bo, dfc.bk, dfc.bl, dfc.bi, dfc.bg, dfc.bm, dfc.bc, dfc.bh, dfc.be, dfc.bb, dfc.ba, new dfa[]{dfc.bf, dfc.bj, dfc.aZ, dfc.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(det.b) == dsq.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsd> v = ImmutableList.of(dfc.ft, dfc.fv, dfc.fu, dfc.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsd, ji<cex>> w = Maps.newHashMap();

   private static Set<dsd> a(dfa $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ale<cex> a(String $$0) {
      return ale.a(lq.V, new alf($$0));
   }

   private static cex a(jv<cex> $$0, ale<cex> $$1, Set<dsd> $$2, int $$3, int $$4) {
      cex $$5 = new cex($$2, $$3, $$4);
      jv.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ji<cex> $$0, Set<dsd> $$1) {
      $$1.forEach($$1x -> {
         ji<cex> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ji<cex>> a(dsd $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsd $$0) {
      return w.containsKey($$0);
   }

   public static cex a(jv<cex> $$0) {
      a($$0, a, a(dfc.nW), 1, 1);
      a($$0, b, a(dfc.nV), 1, 1);
      a($$0, c, a(dfc.nX), 1, 1);
      a($$0, d, a(dfc.fs), 1, 1);
      a($$0, e, a(dfc.pc), 1, 1);
      a($$0, f, a(dfc.nU), 1, 1);
      a($$0, g, a(dfc.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfc.oa), 1, 1);
      a($$0, j, a(dfc.oc), 1, 1);
      a($$0, k, a(dfc.nT), 1, 1);
      a($$0, l, a(dfc.ob), 1, 1);
      a($$0, m, a(dfc.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfc.od), 32, 6);
      a($$0, p, a(dfc.pf), 0, 1);
      a($$0, q, a(dfc.pe), 0, 1);
      a($$0, r, a(dfc.ed), 0, 1);
      a($$0, s, a(dfc.pq), 0, 1);
      return a($$0, t, a(dfc.ss), 0, 1);
   }
}
