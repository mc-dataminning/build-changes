import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgi {
   public static final alh<cgh> a = a("armorer");
   public static final alh<cgh> b = a("butcher");
   public static final alh<cgh> c = a("cartographer");
   public static final alh<cgh> d = a("cleric");
   public static final alh<cgh> e = a("farmer");
   public static final alh<cgh> f = a("fisherman");
   public static final alh<cgh> g = a("fletcher");
   public static final alh<cgh> h = a("leatherworker");
   public static final alh<cgh> i = a("librarian");
   public static final alh<cgh> j = a("mason");
   public static final alh<cgh> k = a("shepherd");
   public static final alh<cgh> l = a("toolsmith");
   public static final alh<cgh> m = a("weaponsmith");
   public static final alh<cgh> n = a("home");
   public static final alh<cgh> o = a("meeting");
   public static final alh<cgh> p = a("beehive");
   public static final alh<cgh> q = a("bee_nest");
   public static final alh<cgh> r = a("nether_portal");
   public static final alh<cgh> s = a("lodestone");
   public static final alh<cgh> t = a("lightning_rod");
   private static final Set<dvj> u = ImmutableList.of(
         dig.bn, dig.bo, dig.bk, dig.bl, dig.bi, dig.bg, dig.bm, dig.bc, dig.bh, dig.be, dig.bb, dig.ba, new die[]{dig.bf, dig.bj, dig.aZ, dig.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dhx.b) == dvw.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dvj> v = ImmutableList.of(dig.ft, dig.fv, dig.fu, dig.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dvj, jq<cgh>> w = Maps.newHashMap();

   private static Set<dvj> a(die $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alh<cgh> a(String $$0) {
      return alh.a(lz.aa, ali.b($$0));
   }

   private static cgh a(kd<cgh> $$0, alh<cgh> $$1, Set<dvj> $$2, int $$3, int $$4) {
      cgh $$5 = new cgh($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<cgh> $$0, Set<dvj> $$1) {
      $$1.forEach($$1x -> {
         jq<cgh> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<cgh>> a(dvj $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dvj $$0) {
      return w.containsKey($$0);
   }

   public static cgh a(kd<cgh> $$0) {
      a($$0, a, a(dig.nW), 1, 1);
      a($$0, b, a(dig.nV), 1, 1);
      a($$0, c, a(dig.nX), 1, 1);
      a($$0, d, a(dig.fs), 1, 1);
      a($$0, e, a(dig.pc), 1, 1);
      a($$0, f, a(dig.nU), 1, 1);
      a($$0, g, a(dig.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dig.oa), 1, 1);
      a($$0, j, a(dig.oc), 1, 1);
      a($$0, k, a(dig.nT), 1, 1);
      a($$0, l, a(dig.ob), 1, 1);
      a($$0, m, a(dig.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dig.od), 32, 6);
      a($$0, p, a(dig.pf), 0, 1);
      a($$0, q, a(dig.pe), 0, 1);
      a($$0, r, a(dig.ed), 0, 1);
      a($$0, s, a(dig.pq), 0, 1);
      return a($$0, t, a(dig.ss), 0, 1);
   }
}
