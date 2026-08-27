import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cdy {
   public static final akm<cdx> a = a("armorer");
   public static final akm<cdx> b = a("butcher");
   public static final akm<cdx> c = a("cartographer");
   public static final akm<cdx> d = a("cleric");
   public static final akm<cdx> e = a("farmer");
   public static final akm<cdx> f = a("fisherman");
   public static final akm<cdx> g = a("fletcher");
   public static final akm<cdx> h = a("leatherworker");
   public static final akm<cdx> i = a("librarian");
   public static final akm<cdx> j = a("mason");
   public static final akm<cdx> k = a("shepherd");
   public static final akm<cdx> l = a("toolsmith");
   public static final akm<cdx> m = a("weaponsmith");
   public static final akm<cdx> n = a("home");
   public static final akm<cdx> o = a("meeting");
   public static final akm<cdx> p = a("beehive");
   public static final akm<cdx> q = a("bee_nest");
   public static final akm<cdx> r = a("nether_portal");
   public static final akm<cdx> s = a("lodestone");
   public static final akm<cdx> t = a("lightning_rod");
   private static final Set<drd> u = ImmutableList.of(
         dec.bn, dec.bo, dec.bk, dec.bl, dec.bi, dec.bg, dec.bm, dec.bc, dec.bh, dec.be, dec.bb, dec.ba, new dea[]{dec.bf, dec.bj, dec.aZ, dec.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(ddt.b) == drq.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<drd> v = ImmutableList.of(dec.ft, dec.fv, dec.fu, dec.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<drd, ix<cdx>> w = Maps.newHashMap();

   private static Set<drd> a(dea $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akm<cdx> a(String $$0) {
      return akm.a(lf.V, new akn($$0));
   }

   private static cdx a(jk<cdx> $$0, akm<cdx> $$1, Set<drd> $$2, int $$3, int $$4) {
      cdx $$5 = new cdx($$2, $$3, $$4);
      jk.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ix<cdx> $$0, Set<drd> $$1) {
      $$1.forEach($$1x -> {
         ix<cdx> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ix<cdx>> a(drd $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(drd $$0) {
      return w.containsKey($$0);
   }

   public static cdx a(jk<cdx> $$0) {
      a($$0, a, a(dec.nW), 1, 1);
      a($$0, b, a(dec.nV), 1, 1);
      a($$0, c, a(dec.nX), 1, 1);
      a($$0, d, a(dec.fs), 1, 1);
      a($$0, e, a(dec.pc), 1, 1);
      a($$0, f, a(dec.nU), 1, 1);
      a($$0, g, a(dec.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dec.oa), 1, 1);
      a($$0, j, a(dec.oc), 1, 1);
      a($$0, k, a(dec.nT), 1, 1);
      a($$0, l, a(dec.ob), 1, 1);
      a($$0, m, a(dec.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dec.od), 32, 6);
      a($$0, p, a(dec.pf), 0, 1);
      a($$0, q, a(dec.pe), 0, 1);
      a($$0, r, a(dec.ed), 0, 1);
      a($$0, s, a(dec.pq), 0, 1);
      return a($$0, t, a(dec.ss), 0, 1);
   }
}
