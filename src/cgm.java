import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgm {
   public static final alk<cgl> a = a("armorer");
   public static final alk<cgl> b = a("butcher");
   public static final alk<cgl> c = a("cartographer");
   public static final alk<cgl> d = a("cleric");
   public static final alk<cgl> e = a("farmer");
   public static final alk<cgl> f = a("fisherman");
   public static final alk<cgl> g = a("fletcher");
   public static final alk<cgl> h = a("leatherworker");
   public static final alk<cgl> i = a("librarian");
   public static final alk<cgl> j = a("mason");
   public static final alk<cgl> k = a("shepherd");
   public static final alk<cgl> l = a("toolsmith");
   public static final alk<cgl> m = a("weaponsmith");
   public static final alk<cgl> n = a("home");
   public static final alk<cgl> o = a("meeting");
   public static final alk<cgl> p = a("beehive");
   public static final alk<cgl> q = a("bee_nest");
   public static final alk<cgl> r = a("nether_portal");
   public static final alk<cgl> s = a("lodestone");
   public static final alk<cgl> t = a("lightning_rod");
   private static final Set<dvo> u = ImmutableList.of(
         dil.bn, dil.bo, dil.bk, dil.bl, dil.bi, dil.bg, dil.bm, dil.bc, dil.bh, dil.be, dil.bb, dil.ba, new dij[]{dil.bf, dil.bj, dil.aZ, dil.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dic.b) == dwb.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dvo> v = ImmutableList.of(dil.ft, dil.fv, dil.fu, dil.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dvo, jq<cgl>> w = Maps.newHashMap();

   private static Set<dvo> a(dij $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alk<cgl> a(String $$0) {
      return alk.a(ma.aa, all.b($$0));
   }

   private static cgl a(kd<cgl> $$0, alk<cgl> $$1, Set<dvo> $$2, int $$3, int $$4) {
      cgl $$5 = new cgl($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<cgl> $$0, Set<dvo> $$1) {
      $$1.forEach($$1x -> {
         jq<cgl> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<cgl>> a(dvo $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dvo $$0) {
      return w.containsKey($$0);
   }

   public static cgl a(kd<cgl> $$0) {
      a($$0, a, a(dil.nW), 1, 1);
      a($$0, b, a(dil.nV), 1, 1);
      a($$0, c, a(dil.nX), 1, 1);
      a($$0, d, a(dil.fs), 1, 1);
      a($$0, e, a(dil.pc), 1, 1);
      a($$0, f, a(dil.nU), 1, 1);
      a($$0, g, a(dil.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dil.oa), 1, 1);
      a($$0, j, a(dil.oc), 1, 1);
      a($$0, k, a(dil.nT), 1, 1);
      a($$0, l, a(dil.ob), 1, 1);
      a($$0, m, a(dil.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dil.od), 32, 6);
      a($$0, p, a(dil.pf), 0, 1);
      a($$0, q, a(dil.pe), 0, 1);
      a($$0, r, a(dil.ed), 0, 1);
      a($$0, s, a(dil.pq), 0, 1);
      return a($$0, t, a(dil.ss), 0, 1);
   }
}
