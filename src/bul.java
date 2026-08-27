import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bul {
   public static final aex<buk> a = a("armorer");
   public static final aex<buk> b = a("butcher");
   public static final aex<buk> c = a("cartographer");
   public static final aex<buk> d = a("cleric");
   public static final aex<buk> e = a("farmer");
   public static final aex<buk> f = a("fisherman");
   public static final aex<buk> g = a("fletcher");
   public static final aex<buk> h = a("leatherworker");
   public static final aex<buk> i = a("librarian");
   public static final aex<buk> j = a("mason");
   public static final aex<buk> k = a("shepherd");
   public static final aex<buk> l = a("toolsmith");
   public static final aex<buk> m = a("weaponsmith");
   public static final aex<buk> n = a("home");
   public static final aex<buk> o = a("meeting");
   public static final aex<buk> p = a("beehive");
   public static final aex<buk> q = a("bee_nest");
   public static final aex<buk> r = a("nether_portal");
   public static final aex<buk> s = a("lodestone");
   public static final aex<buk> t = a("lightning_rod");
   private static final Set<dfl> u = ImmutableList.of(
         csy.bn, csy.bo, csy.bk, csy.bl, csy.bi, csy.bg, csy.bm, csy.bc, csy.bh, csy.be, csy.bb, csy.ba, new csx[]{csy.bf, csy.bj, csy.aZ, csy.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(csq.a) == dfy.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dfl> v = ImmutableList.of(csy.ft, csy.fv, csy.fu, csy.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dfl, hg<buk>> w = Maps.newHashMap();

   private static Set<dfl> a(csx $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aex<buk> a(String $$0) {
      return aex.a(je.S, new aey($$0));
   }

   private static buk a(ht<buk> $$0, aex<buk> $$1, Set<dfl> $$2, int $$3, int $$4) {
      buk $$5 = new buk($$2, $$3, $$4);
      ht.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(hg<buk> $$0, Set<dfl> $$1) {
      $$1.forEach($$1x -> {
         hg<buk> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<hg<buk>> a(dfl $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dfl $$0) {
      return w.containsKey($$0);
   }

   public static buk a(ht<buk> $$0) {
      a($$0, a, a(csy.nW), 1, 1);
      a($$0, b, a(csy.nV), 1, 1);
      a($$0, c, a(csy.nX), 1, 1);
      a($$0, d, a(csy.fs), 1, 1);
      a($$0, e, a(csy.pc), 1, 1);
      a($$0, f, a(csy.nU), 1, 1);
      a($$0, g, a(csy.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(csy.oa), 1, 1);
      a($$0, j, a(csy.oc), 1, 1);
      a($$0, k, a(csy.nT), 1, 1);
      a($$0, l, a(csy.ob), 1, 1);
      a($$0, m, a(csy.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(csy.od), 32, 6);
      a($$0, p, a(csy.pf), 0, 1);
      a($$0, q, a(csy.pe), 0, 1);
      a($$0, r, a(csy.ee), 0, 1);
      a($$0, s, a(csy.pq), 0, 1);
      return a($$0, t, a(csy.rr), 0, 1);
   }
}
