import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ceg {
   public static final akj<cef> a = a("armorer");
   public static final akj<cef> b = a("butcher");
   public static final akj<cef> c = a("cartographer");
   public static final akj<cef> d = a("cleric");
   public static final akj<cef> e = a("farmer");
   public static final akj<cef> f = a("fisherman");
   public static final akj<cef> g = a("fletcher");
   public static final akj<cef> h = a("leatherworker");
   public static final akj<cef> i = a("librarian");
   public static final akj<cef> j = a("mason");
   public static final akj<cef> k = a("shepherd");
   public static final akj<cef> l = a("toolsmith");
   public static final akj<cef> m = a("weaponsmith");
   public static final akj<cef> n = a("home");
   public static final akj<cef> o = a("meeting");
   public static final akj<cef> p = a("beehive");
   public static final akj<cef> q = a("bee_nest");
   public static final akj<cef> r = a("nether_portal");
   public static final akj<cef> s = a("lodestone");
   public static final akj<cef> t = a("lightning_rod");
   private static final Set<dsh> u = ImmutableList.of(
         dfh.bn, dfh.bo, dfh.bk, dfh.bl, dfh.bi, dfh.bg, dfh.bm, dfh.bc, dfh.bh, dfh.be, dfh.bb, dfh.ba, new dff[]{dfh.bf, dfh.bj, dfh.aZ, dfh.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dey.b) == dsu.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsh> v = ImmutableList.of(dfh.ft, dfh.fv, dfh.fu, dfh.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsh, jj<cef>> w = Maps.newHashMap();

   private static Set<dsh> a(dff $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akj<cef> a(String $$0) {
      return akj.a(lr.Z, new akk($$0));
   }

   private static cef a(jw<cef> $$0, akj<cef> $$1, Set<dsh> $$2, int $$3, int $$4) {
      cef $$5 = new cef($$2, $$3, $$4);
      jw.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jj<cef> $$0, Set<dsh> $$1) {
      $$1.forEach($$1x -> {
         jj<cef> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jj<cef>> a(dsh $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsh $$0) {
      return w.containsKey($$0);
   }

   public static cef a(jw<cef> $$0) {
      a($$0, a, a(dfh.nW), 1, 1);
      a($$0, b, a(dfh.nV), 1, 1);
      a($$0, c, a(dfh.nX), 1, 1);
      a($$0, d, a(dfh.fs), 1, 1);
      a($$0, e, a(dfh.pc), 1, 1);
      a($$0, f, a(dfh.nU), 1, 1);
      a($$0, g, a(dfh.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfh.oa), 1, 1);
      a($$0, j, a(dfh.oc), 1, 1);
      a($$0, k, a(dfh.nT), 1, 1);
      a($$0, l, a(dfh.ob), 1, 1);
      a($$0, m, a(dfh.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfh.od), 32, 6);
      a($$0, p, a(dfh.pf), 0, 1);
      a($$0, q, a(dfh.pe), 0, 1);
      a($$0, r, a(dfh.ed), 0, 1);
      a($$0, s, a(dfh.pq), 0, 1);
      return a($$0, t, a(dfh.ss), 0, 1);
   }
}
