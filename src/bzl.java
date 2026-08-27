import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bzl {
   public static final aix<bzk> a = a("armorer");
   public static final aix<bzk> b = a("butcher");
   public static final aix<bzk> c = a("cartographer");
   public static final aix<bzk> d = a("cleric");
   public static final aix<bzk> e = a("farmer");
   public static final aix<bzk> f = a("fisherman");
   public static final aix<bzk> g = a("fletcher");
   public static final aix<bzk> h = a("leatherworker");
   public static final aix<bzk> i = a("librarian");
   public static final aix<bzk> j = a("mason");
   public static final aix<bzk> k = a("shepherd");
   public static final aix<bzk> l = a("toolsmith");
   public static final aix<bzk> m = a("weaponsmith");
   public static final aix<bzk> n = a("home");
   public static final aix<bzk> o = a("meeting");
   public static final aix<bzk> p = a("beehive");
   public static final aix<bzk> q = a("bee_nest");
   public static final aix<bzk> r = a("nether_portal");
   public static final aix<bzk> s = a("lodestone");
   public static final aix<bzk> t = a("lightning_rod");
   private static final Set<dlf> u = ImmutableList.of(
         cyq.bn, cyq.bo, cyq.bk, cyq.bl, cyq.bi, cyq.bg, cyq.bm, cyq.bc, cyq.bh, cyq.be, cyq.bb, cyq.ba, new cyo[]{cyq.bf, cyq.bj, cyq.aZ, cyq.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cyh.b) == dls.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dlf> v = ImmutableList.of(cyq.ft, cyq.fv, cyq.fu, cyq.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dlf, ij<bzk>> w = Maps.newHashMap();

   private static Set<dlf> a(cyo $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static aix<bzk> a(String $$0) {
      return aix.a(kg.U, new aiy($$0));
   }

   private static bzk a(iv<bzk> $$0, aix<bzk> $$1, Set<dlf> $$2, int $$3, int $$4) {
      bzk $$5 = new bzk($$2, $$3, $$4);
      iv.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ij<bzk> $$0, Set<dlf> $$1) {
      $$1.forEach($$1x -> {
         ij<bzk> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ij<bzk>> a(dlf $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dlf $$0) {
      return w.containsKey($$0);
   }

   public static bzk a(iv<bzk> $$0) {
      a($$0, a, a(cyq.nW), 1, 1);
      a($$0, b, a(cyq.nV), 1, 1);
      a($$0, c, a(cyq.nX), 1, 1);
      a($$0, d, a(cyq.fs), 1, 1);
      a($$0, e, a(cyq.pc), 1, 1);
      a($$0, f, a(cyq.nU), 1, 1);
      a($$0, g, a(cyq.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cyq.oa), 1, 1);
      a($$0, j, a(cyq.oc), 1, 1);
      a($$0, k, a(cyq.nT), 1, 1);
      a($$0, l, a(cyq.ob), 1, 1);
      a($$0, m, a(cyq.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cyq.od), 32, 6);
      a($$0, p, a(cyq.pf), 0, 1);
      a($$0, q, a(cyq.pe), 0, 1);
      a($$0, r, a(cyq.ed), 0, 1);
      a($$0, s, a(cyq.pq), 0, 1);
      return a($$0, t, a(cyq.ss), 0, 1);
   }
}
