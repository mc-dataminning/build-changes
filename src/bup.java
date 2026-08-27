import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bup {
   public static final aey<buo> a = a("armorer");
   public static final aey<buo> b = a("butcher");
   public static final aey<buo> c = a("cartographer");
   public static final aey<buo> d = a("cleric");
   public static final aey<buo> e = a("farmer");
   public static final aey<buo> f = a("fisherman");
   public static final aey<buo> g = a("fletcher");
   public static final aey<buo> h = a("leatherworker");
   public static final aey<buo> i = a("librarian");
   public static final aey<buo> j = a("mason");
   public static final aey<buo> k = a("shepherd");
   public static final aey<buo> l = a("toolsmith");
   public static final aey<buo> m = a("weaponsmith");
   public static final aey<buo> n = a("home");
   public static final aey<buo> o = a("meeting");
   public static final aey<buo> p = a("beehive");
   public static final aey<buo> q = a("bee_nest");
   public static final aey<buo> r = a("nether_portal");
   public static final aey<buo> s = a("lodestone");
   public static final aey<buo> t = a("lightning_rod");
   private static final Set<dfd> u = ImmutableList.of(
         cte.bn, cte.bo, cte.bk, cte.bl, cte.bi, cte.bg, cte.bm, cte.bc, cte.bh, cte.be, cte.bb, cte.ba, new ctc[]{cte.bf, cte.bj, cte.aZ, cte.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(csv.b) == dfq.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dfd> v = ImmutableList.of(cte.ft, cte.fv, cte.fu, cte.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dfd, he<buo>> w = Maps.newHashMap();

   private static Set<dfd> a(ctc $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static aey<buo> a(String $$0) {
      return aey.a(jc.T, new aez($$0));
   }

   private static buo a(hq<buo> $$0, aey<buo> $$1, Set<dfd> $$2, int $$3, int $$4) {
      buo $$5 = new buo($$2, $$3, $$4);
      hq.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(he<buo> $$0, Set<dfd> $$1) {
      $$1.forEach($$1x -> {
         he<buo> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<he<buo>> a(dfd $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dfd $$0) {
      return w.containsKey($$0);
   }

   public static buo a(hq<buo> $$0) {
      a($$0, a, a(cte.nW), 1, 1);
      a($$0, b, a(cte.nV), 1, 1);
      a($$0, c, a(cte.nX), 1, 1);
      a($$0, d, a(cte.fs), 1, 1);
      a($$0, e, a(cte.pc), 1, 1);
      a($$0, f, a(cte.nU), 1, 1);
      a($$0, g, a(cte.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cte.oa), 1, 1);
      a($$0, j, a(cte.oc), 1, 1);
      a($$0, k, a(cte.nT), 1, 1);
      a($$0, l, a(cte.ob), 1, 1);
      a($$0, m, a(cte.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cte.od), 32, 6);
      a($$0, p, a(cte.pf), 0, 1);
      a($$0, q, a(cte.pe), 0, 1);
      a($$0, r, a(cte.ed), 0, 1);
      a($$0, s, a(cte.pq), 0, 1);
      return a($$0, t, a(cte.rr), 0, 1);
   }
}
