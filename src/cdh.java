import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cdh {
   public static final akg<cdg> a = a("armorer");
   public static final akg<cdg> b = a("butcher");
   public static final akg<cdg> c = a("cartographer");
   public static final akg<cdg> d = a("cleric");
   public static final akg<cdg> e = a("farmer");
   public static final akg<cdg> f = a("fisherman");
   public static final akg<cdg> g = a("fletcher");
   public static final akg<cdg> h = a("leatherworker");
   public static final akg<cdg> i = a("librarian");
   public static final akg<cdg> j = a("mason");
   public static final akg<cdg> k = a("shepherd");
   public static final akg<cdg> l = a("toolsmith");
   public static final akg<cdg> m = a("weaponsmith");
   public static final akg<cdg> n = a("home");
   public static final akg<cdg> o = a("meeting");
   public static final akg<cdg> p = a("beehive");
   public static final akg<cdg> q = a("bee_nest");
   public static final akg<cdg> r = a("nether_portal");
   public static final akg<cdg> s = a("lodestone");
   public static final akg<cdg> t = a("lightning_rod");
   private static final Set<dqh> u = ImmutableList.of(
         ddg.bn, ddg.bo, ddg.bk, ddg.bl, ddg.bi, ddg.bg, ddg.bm, ddg.bc, ddg.bh, ddg.be, ddg.bb, ddg.ba, new dde[]{ddg.bf, ddg.bj, ddg.aZ, ddg.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dcx.b) == dqu.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dqh> v = ImmutableList.of(ddg.ft, ddg.fv, ddg.fu, ddg.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dqh, iw<cdg>> w = Maps.newHashMap();

   private static Set<dqh> a(dde $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akg<cdg> a(String $$0) {
      return akg.a(le.V, new akh($$0));
   }

   private static cdg a(jj<cdg> $$0, akg<cdg> $$1, Set<dqh> $$2, int $$3, int $$4) {
      cdg $$5 = new cdg($$2, $$3, $$4);
      jj.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(iw<cdg> $$0, Set<dqh> $$1) {
      $$1.forEach($$1x -> {
         iw<cdg> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<iw<cdg>> a(dqh $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dqh $$0) {
      return w.containsKey($$0);
   }

   public static cdg a(jj<cdg> $$0) {
      a($$0, a, a(ddg.nW), 1, 1);
      a($$0, b, a(ddg.nV), 1, 1);
      a($$0, c, a(ddg.nX), 1, 1);
      a($$0, d, a(ddg.fs), 1, 1);
      a($$0, e, a(ddg.pc), 1, 1);
      a($$0, f, a(ddg.nU), 1, 1);
      a($$0, g, a(ddg.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(ddg.oa), 1, 1);
      a($$0, j, a(ddg.oc), 1, 1);
      a($$0, k, a(ddg.nT), 1, 1);
      a($$0, l, a(ddg.ob), 1, 1);
      a($$0, m, a(ddg.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(ddg.od), 32, 6);
      a($$0, p, a(ddg.pf), 0, 1);
      a($$0, q, a(ddg.pe), 0, 1);
      a($$0, r, a(ddg.ed), 0, 1);
      a($$0, s, a(ddg.pq), 0, 1);
      return a($$0, t, a(ddg.ss), 0, 1);
   }
}
