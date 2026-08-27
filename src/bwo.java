import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bwo {
   public static final agl<bwn> a = a("armorer");
   public static final agl<bwn> b = a("butcher");
   public static final agl<bwn> c = a("cartographer");
   public static final agl<bwn> d = a("cleric");
   public static final agl<bwn> e = a("farmer");
   public static final agl<bwn> f = a("fisherman");
   public static final agl<bwn> g = a("fletcher");
   public static final agl<bwn> h = a("leatherworker");
   public static final agl<bwn> i = a("librarian");
   public static final agl<bwn> j = a("mason");
   public static final agl<bwn> k = a("shepherd");
   public static final agl<bwn> l = a("toolsmith");
   public static final agl<bwn> m = a("weaponsmith");
   public static final agl<bwn> n = a("home");
   public static final agl<bwn> o = a("meeting");
   public static final agl<bwn> p = a("beehive");
   public static final agl<bwn> q = a("bee_nest");
   public static final agl<bwn> r = a("nether_portal");
   public static final agl<bwn> s = a("lodestone");
   public static final agl<bwn> t = a("lightning_rod");
   private static final Set<dhn> u = ImmutableList.of(
         cvh.bn, cvh.bo, cvh.bk, cvh.bl, cvh.bi, cvh.bg, cvh.bm, cvh.bc, cvh.bh, cvh.be, cvh.bb, cvh.ba, new cvf[]{cvh.bf, cvh.bj, cvh.aZ, cvh.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cuy.b) == dia.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dhn> v = ImmutableList.of(cvh.ft, cvh.fv, cvh.fu, cvh.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dhn, ig<bwn>> w = Maps.newHashMap();

   private static Set<dhn> a(cvf $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static agl<bwn> a(String $$0) {
      return agl.a(kd.T, new agm($$0));
   }

   private static bwn a(is<bwn> $$0, agl<bwn> $$1, Set<dhn> $$2, int $$3, int $$4) {
      bwn $$5 = new bwn($$2, $$3, $$4);
      is.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ig<bwn> $$0, Set<dhn> $$1) {
      $$1.forEach($$1x -> {
         ig<bwn> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ig<bwn>> a(dhn $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dhn $$0) {
      return w.containsKey($$0);
   }

   public static bwn a(is<bwn> $$0) {
      a($$0, a, a(cvh.nW), 1, 1);
      a($$0, b, a(cvh.nV), 1, 1);
      a($$0, c, a(cvh.nX), 1, 1);
      a($$0, d, a(cvh.fs), 1, 1);
      a($$0, e, a(cvh.pc), 1, 1);
      a($$0, f, a(cvh.nU), 1, 1);
      a($$0, g, a(cvh.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cvh.oa), 1, 1);
      a($$0, j, a(cvh.oc), 1, 1);
      a($$0, k, a(cvh.nT), 1, 1);
      a($$0, l, a(cvh.ob), 1, 1);
      a($$0, m, a(cvh.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cvh.od), 32, 6);
      a($$0, p, a(cvh.pf), 0, 1);
      a($$0, q, a(cvh.pe), 0, 1);
      a($$0, r, a(cvh.ed), 0, 1);
      a($$0, s, a(cvh.pq), 0, 1);
      return a($$0, t, a(cvh.ss), 0, 1);
   }
}
