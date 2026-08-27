import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bzp {
   public static final aix<bzo> a = a("armorer");
   public static final aix<bzo> b = a("butcher");
   public static final aix<bzo> c = a("cartographer");
   public static final aix<bzo> d = a("cleric");
   public static final aix<bzo> e = a("farmer");
   public static final aix<bzo> f = a("fisherman");
   public static final aix<bzo> g = a("fletcher");
   public static final aix<bzo> h = a("leatherworker");
   public static final aix<bzo> i = a("librarian");
   public static final aix<bzo> j = a("mason");
   public static final aix<bzo> k = a("shepherd");
   public static final aix<bzo> l = a("toolsmith");
   public static final aix<bzo> m = a("weaponsmith");
   public static final aix<bzo> n = a("home");
   public static final aix<bzo> o = a("meeting");
   public static final aix<bzo> p = a("beehive");
   public static final aix<bzo> q = a("bee_nest");
   public static final aix<bzo> r = a("nether_portal");
   public static final aix<bzo> s = a("lodestone");
   public static final aix<bzo> t = a("lightning_rod");
   private static final Set<dlj> u = ImmutableList.of(
         cyu.bn, cyu.bo, cyu.bk, cyu.bl, cyu.bi, cyu.bg, cyu.bm, cyu.bc, cyu.bh, cyu.be, cyu.bb, cyu.ba, new cys[]{cyu.bf, cyu.bj, cyu.aZ, cyu.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cyl.b) == dlw.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dlj> v = ImmutableList.of(cyu.ft, cyu.fv, cyu.fu, cyu.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dlj, ij<bzo>> w = Maps.newHashMap();

   private static Set<dlj> a(cys $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static aix<bzo> a(String $$0) {
      return aix.a(kg.U, new aiy($$0));
   }

   private static bzo a(iv<bzo> $$0, aix<bzo> $$1, Set<dlj> $$2, int $$3, int $$4) {
      bzo $$5 = new bzo($$2, $$3, $$4);
      iv.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ij<bzo> $$0, Set<dlj> $$1) {
      $$1.forEach($$1x -> {
         ij<bzo> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ij<bzo>> a(dlj $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dlj $$0) {
      return w.containsKey($$0);
   }

   public static bzo a(iv<bzo> $$0) {
      a($$0, a, a(cyu.nW), 1, 1);
      a($$0, b, a(cyu.nV), 1, 1);
      a($$0, c, a(cyu.nX), 1, 1);
      a($$0, d, a(cyu.fs), 1, 1);
      a($$0, e, a(cyu.pc), 1, 1);
      a($$0, f, a(cyu.nU), 1, 1);
      a($$0, g, a(cyu.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cyu.oa), 1, 1);
      a($$0, j, a(cyu.oc), 1, 1);
      a($$0, k, a(cyu.nT), 1, 1);
      a($$0, l, a(cyu.ob), 1, 1);
      a($$0, m, a(cyu.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cyu.od), 32, 6);
      a($$0, p, a(cyu.pf), 0, 1);
      a($$0, q, a(cyu.pe), 0, 1);
      a($$0, r, a(cyu.ed), 0, 1);
      a($$0, s, a(cyu.pq), 0, 1);
      return a($$0, t, a(cyu.ss), 0, 1);
   }
}
