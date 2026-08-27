import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class buj {
   public static final aev<bui> a = a("armorer");
   public static final aev<bui> b = a("butcher");
   public static final aev<bui> c = a("cartographer");
   public static final aev<bui> d = a("cleric");
   public static final aev<bui> e = a("farmer");
   public static final aev<bui> f = a("fisherman");
   public static final aev<bui> g = a("fletcher");
   public static final aev<bui> h = a("leatherworker");
   public static final aev<bui> i = a("librarian");
   public static final aev<bui> j = a("mason");
   public static final aev<bui> k = a("shepherd");
   public static final aev<bui> l = a("toolsmith");
   public static final aev<bui> m = a("weaponsmith");
   public static final aev<bui> n = a("home");
   public static final aev<bui> o = a("meeting");
   public static final aev<bui> p = a("beehive");
   public static final aev<bui> q = a("bee_nest");
   public static final aev<bui> r = a("nether_portal");
   public static final aev<bui> s = a("lodestone");
   public static final aev<bui> t = a("lightning_rod");
   private static final Set<dfj> u = ImmutableList.of(
         csw.bn, csw.bo, csw.bk, csw.bl, csw.bi, csw.bg, csw.bm, csw.bc, csw.bh, csw.be, csw.bb, csw.ba, new csv[]{csw.bf, csw.bj, csw.aZ, csw.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(cso.a) == dfw.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dfj> v = ImmutableList.of(csw.ft, csw.fv, csw.fu, csw.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dfj, he<bui>> w = Maps.newHashMap();

   private static Set<dfj> a(csv $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aev<bui> a(String $$0) {
      return aev.a(jc.S, new aew($$0));
   }

   private static bui a(hq<bui> $$0, aev<bui> $$1, Set<dfj> $$2, int $$3, int $$4) {
      bui $$5 = new bui($$2, $$3, $$4);
      hq.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(he<bui> $$0, Set<dfj> $$1) {
      $$1.forEach($$1x -> {
         he<bui> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<he<bui>> a(dfj $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dfj $$0) {
      return w.containsKey($$0);
   }

   public static bui a(hq<bui> $$0) {
      a($$0, a, a(csw.nW), 1, 1);
      a($$0, b, a(csw.nV), 1, 1);
      a($$0, c, a(csw.nX), 1, 1);
      a($$0, d, a(csw.fs), 1, 1);
      a($$0, e, a(csw.pc), 1, 1);
      a($$0, f, a(csw.nU), 1, 1);
      a($$0, g, a(csw.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(csw.oa), 1, 1);
      a($$0, j, a(csw.oc), 1, 1);
      a($$0, k, a(csw.nT), 1, 1);
      a($$0, l, a(csw.ob), 1, 1);
      a($$0, m, a(csw.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(csw.od), 32, 6);
      a($$0, p, a(csw.pf), 0, 1);
      a($$0, q, a(csw.pe), 0, 1);
      a($$0, r, a(csw.ee), 0, 1);
      a($$0, s, a(csw.pq), 0, 1);
      return a($$0, t, a(csw.rr), 0, 1);
   }
}
