import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cek {
   public static final akj<cej> a = a("armorer");
   public static final akj<cej> b = a("butcher");
   public static final akj<cej> c = a("cartographer");
   public static final akj<cej> d = a("cleric");
   public static final akj<cej> e = a("farmer");
   public static final akj<cej> f = a("fisherman");
   public static final akj<cej> g = a("fletcher");
   public static final akj<cej> h = a("leatherworker");
   public static final akj<cej> i = a("librarian");
   public static final akj<cej> j = a("mason");
   public static final akj<cej> k = a("shepherd");
   public static final akj<cej> l = a("toolsmith");
   public static final akj<cej> m = a("weaponsmith");
   public static final akj<cej> n = a("home");
   public static final akj<cej> o = a("meeting");
   public static final akj<cej> p = a("beehive");
   public static final akj<cej> q = a("bee_nest");
   public static final akj<cej> r = a("nether_portal");
   public static final akj<cej> s = a("lodestone");
   public static final akj<cej> t = a("lightning_rod");
   private static final Set<dsl> u = ImmutableList.of(
         dfk.bn, dfk.bo, dfk.bk, dfk.bl, dfk.bi, dfk.bg, dfk.bm, dfk.bc, dfk.bh, dfk.be, dfk.bb, dfk.ba, new dfi[]{dfk.bf, dfk.bj, dfk.aZ, dfk.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dfb.b) == dsy.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsl> v = ImmutableList.of(dfk.ft, dfk.fv, dfk.fu, dfk.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsl, jj<cej>> w = Maps.newHashMap();

   private static Set<dsl> a(dfi $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akj<cej> a(String $$0) {
      return akj.a(lr.Z, new akk($$0));
   }

   private static cej a(jw<cej> $$0, akj<cej> $$1, Set<dsl> $$2, int $$3, int $$4) {
      cej $$5 = new cej($$2, $$3, $$4);
      jw.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jj<cej> $$0, Set<dsl> $$1) {
      $$1.forEach($$1x -> {
         jj<cej> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jj<cej>> a(dsl $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsl $$0) {
      return w.containsKey($$0);
   }

   public static cej a(jw<cej> $$0) {
      a($$0, a, a(dfk.nW), 1, 1);
      a($$0, b, a(dfk.nV), 1, 1);
      a($$0, c, a(dfk.nX), 1, 1);
      a($$0, d, a(dfk.fs), 1, 1);
      a($$0, e, a(dfk.pc), 1, 1);
      a($$0, f, a(dfk.nU), 1, 1);
      a($$0, g, a(dfk.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfk.oa), 1, 1);
      a($$0, j, a(dfk.oc), 1, 1);
      a($$0, k, a(dfk.nT), 1, 1);
      a($$0, l, a(dfk.ob), 1, 1);
      a($$0, m, a(dfk.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfk.od), 32, 6);
      a($$0, p, a(dfk.pf), 0, 1);
      a($$0, q, a(dfk.pe), 0, 1);
      a($$0, r, a(dfk.ed), 0, 1);
      a($$0, s, a(dfk.pq), 0, 1);
      return a($$0, t, a(dfk.ss), 0, 1);
   }
}
