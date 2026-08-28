import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cfu {
   public static final ald<cft> a = a("armorer");
   public static final ald<cft> b = a("butcher");
   public static final ald<cft> c = a("cartographer");
   public static final ald<cft> d = a("cleric");
   public static final ald<cft> e = a("farmer");
   public static final ald<cft> f = a("fisherman");
   public static final ald<cft> g = a("fletcher");
   public static final ald<cft> h = a("leatherworker");
   public static final ald<cft> i = a("librarian");
   public static final ald<cft> j = a("mason");
   public static final ald<cft> k = a("shepherd");
   public static final ald<cft> l = a("toolsmith");
   public static final ald<cft> m = a("weaponsmith");
   public static final ald<cft> n = a("home");
   public static final ald<cft> o = a("meeting");
   public static final ald<cft> p = a("beehive");
   public static final ald<cft> q = a("bee_nest");
   public static final ald<cft> r = a("nether_portal");
   public static final ald<cft> s = a("lodestone");
   public static final ald<cft> t = a("lightning_rod");
   private static final Set<dus> u = ImmutableList.of(
         dho.bn, dho.bo, dho.bk, dho.bl, dho.bi, dho.bg, dho.bm, dho.bc, dho.bh, dho.be, dho.bb, dho.ba, new dhm[]{dho.bf, dho.bj, dho.aZ, dho.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.k().a().stream())
      .filter($$0 -> $$0.c(dhf.b) == dvf.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dus> v = ImmutableList.of(dho.ft, dho.fv, dho.fu, dho.fw)
      .stream()
      .flatMap($$0 -> $$0.k().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dus, jo<cft>> w = Maps.newHashMap();

   private static Set<dus> a(dhm $$0) {
      return ImmutableSet.copyOf($$0.k().a());
   }

   private static ald<cft> a(String $$0) {
      return ald.a(lw.aa, ale.b($$0));
   }

   private static cft a(kb<cft> $$0, ald<cft> $$1, Set<dus> $$2, int $$3, int $$4) {
      cft $$5 = new cft($$2, $$3, $$4);
      kb.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jo<cft> $$0, Set<dus> $$1) {
      $$1.forEach($$1x -> {
         jo<cft> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jo<cft>> a(dus $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dus $$0) {
      return w.containsKey($$0);
   }

   public static cft a(kb<cft> $$0) {
      a($$0, a, a(dho.nW), 1, 1);
      a($$0, b, a(dho.nV), 1, 1);
      a($$0, c, a(dho.nX), 1, 1);
      a($$0, d, a(dho.fs), 1, 1);
      a($$0, e, a(dho.pc), 1, 1);
      a($$0, f, a(dho.nU), 1, 1);
      a($$0, g, a(dho.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dho.oa), 1, 1);
      a($$0, j, a(dho.oc), 1, 1);
      a($$0, k, a(dho.nT), 1, 1);
      a($$0, l, a(dho.ob), 1, 1);
      a($$0, m, a(dho.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dho.od), 32, 6);
      a($$0, p, a(dho.pf), 0, 1);
      a($$0, q, a(dho.pe), 0, 1);
      a($$0, r, a(dho.ed), 0, 1);
      a($$0, s, a(dho.pq), 0, 1);
      return a($$0, t, a(dho.ss), 0, 1);
   }
}
