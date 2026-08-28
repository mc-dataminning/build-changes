import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cez {
   public static final ale<cey> a = a("armorer");
   public static final ale<cey> b = a("butcher");
   public static final ale<cey> c = a("cartographer");
   public static final ale<cey> d = a("cleric");
   public static final ale<cey> e = a("farmer");
   public static final ale<cey> f = a("fisherman");
   public static final ale<cey> g = a("fletcher");
   public static final ale<cey> h = a("leatherworker");
   public static final ale<cey> i = a("librarian");
   public static final ale<cey> j = a("mason");
   public static final ale<cey> k = a("shepherd");
   public static final ale<cey> l = a("toolsmith");
   public static final ale<cey> m = a("weaponsmith");
   public static final ale<cey> n = a("home");
   public static final ale<cey> o = a("meeting");
   public static final ale<cey> p = a("beehive");
   public static final ale<cey> q = a("bee_nest");
   public static final ale<cey> r = a("nether_portal");
   public static final ale<cey> s = a("lodestone");
   public static final ale<cey> t = a("lightning_rod");
   private static final Set<dse> u = ImmutableList.of(
         dfd.bn, dfd.bo, dfd.bk, dfd.bl, dfd.bi, dfd.bg, dfd.bm, dfd.bc, dfd.bh, dfd.be, dfd.bb, dfd.ba, new dfb[]{dfd.bf, dfd.bj, dfd.aZ, dfd.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(deu.b) == dsr.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dse> v = ImmutableList.of(dfd.ft, dfd.fv, dfd.fu, dfd.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dse, ji<cey>> w = Maps.newHashMap();

   private static Set<dse> a(dfb $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ale<cey> a(String $$0) {
      return ale.a(lq.V, new alf($$0));
   }

   private static cey a(jv<cey> $$0, ale<cey> $$1, Set<dse> $$2, int $$3, int $$4) {
      cey $$5 = new cey($$2, $$3, $$4);
      jv.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ji<cey> $$0, Set<dse> $$1) {
      $$1.forEach($$1x -> {
         ji<cey> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ji<cey>> a(dse $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dse $$0) {
      return w.containsKey($$0);
   }

   public static cey a(jv<cey> $$0) {
      a($$0, a, a(dfd.nW), 1, 1);
      a($$0, b, a(dfd.nV), 1, 1);
      a($$0, c, a(dfd.nX), 1, 1);
      a($$0, d, a(dfd.fs), 1, 1);
      a($$0, e, a(dfd.pc), 1, 1);
      a($$0, f, a(dfd.nU), 1, 1);
      a($$0, g, a(dfd.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfd.oa), 1, 1);
      a($$0, j, a(dfd.oc), 1, 1);
      a($$0, k, a(dfd.nT), 1, 1);
      a($$0, l, a(dfd.ob), 1, 1);
      a($$0, m, a(dfd.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfd.od), 32, 6);
      a($$0, p, a(dfd.pf), 0, 1);
      a($$0, q, a(dfd.pe), 0, 1);
      a($$0, r, a(dfd.ed), 0, 1);
      a($$0, s, a(dfd.pq), 0, 1);
      return a($$0, t, a(dfd.ss), 0, 1);
   }
}
