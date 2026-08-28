import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cew {
   public static final akq<cev> a = a("armorer");
   public static final akq<cev> b = a("butcher");
   public static final akq<cev> c = a("cartographer");
   public static final akq<cev> d = a("cleric");
   public static final akq<cev> e = a("farmer");
   public static final akq<cev> f = a("fisherman");
   public static final akq<cev> g = a("fletcher");
   public static final akq<cev> h = a("leatherworker");
   public static final akq<cev> i = a("librarian");
   public static final akq<cev> j = a("mason");
   public static final akq<cev> k = a("shepherd");
   public static final akq<cev> l = a("toolsmith");
   public static final akq<cev> m = a("weaponsmith");
   public static final akq<cev> n = a("home");
   public static final akq<cev> o = a("meeting");
   public static final akq<cev> p = a("beehive");
   public static final akq<cev> q = a("bee_nest");
   public static final akq<cev> r = a("nether_portal");
   public static final akq<cev> s = a("lodestone");
   public static final akq<cev> t = a("lightning_rod");
   private static final Set<dtc> u = ImmutableList.of(
         dga.bn, dga.bo, dga.bk, dga.bl, dga.bi, dga.bg, dga.bm, dga.bc, dga.bh, dga.be, dga.bb, dga.ba, new dfy[]{dga.bf, dga.bj, dga.aZ, dga.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dfr.b) == dtp.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dtc> v = ImmutableList.of(dga.ft, dga.fv, dga.fu, dga.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dtc, jm<cev>> w = Maps.newHashMap();

   private static Set<dtc> a(dfy $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akq<cev> a(String $$0) {
      return akq.a(lu.aa, akr.b($$0));
   }

   private static cev a(jz<cev> $$0, akq<cev> $$1, Set<dtc> $$2, int $$3, int $$4) {
      cev $$5 = new cev($$2, $$3, $$4);
      jz.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jm<cev> $$0, Set<dtc> $$1) {
      $$1.forEach($$1x -> {
         jm<cev> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jm<cev>> a(dtc $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dtc $$0) {
      return w.containsKey($$0);
   }

   public static cev a(jz<cev> $$0) {
      a($$0, a, a(dga.nW), 1, 1);
      a($$0, b, a(dga.nV), 1, 1);
      a($$0, c, a(dga.nX), 1, 1);
      a($$0, d, a(dga.fs), 1, 1);
      a($$0, e, a(dga.pc), 1, 1);
      a($$0, f, a(dga.nU), 1, 1);
      a($$0, g, a(dga.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dga.oa), 1, 1);
      a($$0, j, a(dga.oc), 1, 1);
      a($$0, k, a(dga.nT), 1, 1);
      a($$0, l, a(dga.ob), 1, 1);
      a($$0, m, a(dga.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dga.od), 32, 6);
      a($$0, p, a(dga.pf), 0, 1);
      a($$0, q, a(dga.pe), 0, 1);
      a($$0, r, a(dga.ed), 0, 1);
      a($$0, s, a(dga.pq), 0, 1);
      return a($$0, t, a(dga.ss), 0, 1);
   }
}
