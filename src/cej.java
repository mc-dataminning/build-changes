import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cej {
   public static final akj<cei> a = a("armorer");
   public static final akj<cei> b = a("butcher");
   public static final akj<cei> c = a("cartographer");
   public static final akj<cei> d = a("cleric");
   public static final akj<cei> e = a("farmer");
   public static final akj<cei> f = a("fisherman");
   public static final akj<cei> g = a("fletcher");
   public static final akj<cei> h = a("leatherworker");
   public static final akj<cei> i = a("librarian");
   public static final akj<cei> j = a("mason");
   public static final akj<cei> k = a("shepherd");
   public static final akj<cei> l = a("toolsmith");
   public static final akj<cei> m = a("weaponsmith");
   public static final akj<cei> n = a("home");
   public static final akj<cei> o = a("meeting");
   public static final akj<cei> p = a("beehive");
   public static final akj<cei> q = a("bee_nest");
   public static final akj<cei> r = a("nether_portal");
   public static final akj<cei> s = a("lodestone");
   public static final akj<cei> t = a("lightning_rod");
   private static final Set<dsk> u = ImmutableList.of(
         dfj.bn, dfj.bo, dfj.bk, dfj.bl, dfj.bi, dfj.bg, dfj.bm, dfj.bc, dfj.bh, dfj.be, dfj.bb, dfj.ba, new dfh[]{dfj.bf, dfj.bj, dfj.aZ, dfj.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dfa.b) == dsx.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsk> v = ImmutableList.of(dfj.ft, dfj.fv, dfj.fu, dfj.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsk, jj<cei>> w = Maps.newHashMap();

   private static Set<dsk> a(dfh $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akj<cei> a(String $$0) {
      return akj.a(lr.Z, new akk($$0));
   }

   private static cei a(jw<cei> $$0, akj<cei> $$1, Set<dsk> $$2, int $$3, int $$4) {
      cei $$5 = new cei($$2, $$3, $$4);
      jw.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jj<cei> $$0, Set<dsk> $$1) {
      $$1.forEach($$1x -> {
         jj<cei> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jj<cei>> a(dsk $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsk $$0) {
      return w.containsKey($$0);
   }

   public static cei a(jw<cei> $$0) {
      a($$0, a, a(dfj.nW), 1, 1);
      a($$0, b, a(dfj.nV), 1, 1);
      a($$0, c, a(dfj.nX), 1, 1);
      a($$0, d, a(dfj.fs), 1, 1);
      a($$0, e, a(dfj.pc), 1, 1);
      a($$0, f, a(dfj.nU), 1, 1);
      a($$0, g, a(dfj.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfj.oa), 1, 1);
      a($$0, j, a(dfj.oc), 1, 1);
      a($$0, k, a(dfj.nT), 1, 1);
      a($$0, l, a(dfj.ob), 1, 1);
      a($$0, m, a(dfj.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfj.od), 32, 6);
      a($$0, p, a(dfj.pf), 0, 1);
      a($$0, q, a(dfj.pe), 0, 1);
      a($$0, r, a(dfj.ed), 0, 1);
      a($$0, s, a(dfj.pq), 0, 1);
      return a($$0, t, a(dfj.ss), 0, 1);
   }
}
