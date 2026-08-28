import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ceu {
   public static final akp<cet> a = a("armorer");
   public static final akp<cet> b = a("butcher");
   public static final akp<cet> c = a("cartographer");
   public static final akp<cet> d = a("cleric");
   public static final akp<cet> e = a("farmer");
   public static final akp<cet> f = a("fisherman");
   public static final akp<cet> g = a("fletcher");
   public static final akp<cet> h = a("leatherworker");
   public static final akp<cet> i = a("librarian");
   public static final akp<cet> j = a("mason");
   public static final akp<cet> k = a("shepherd");
   public static final akp<cet> l = a("toolsmith");
   public static final akp<cet> m = a("weaponsmith");
   public static final akp<cet> n = a("home");
   public static final akp<cet> o = a("meeting");
   public static final akp<cet> p = a("beehive");
   public static final akp<cet> q = a("bee_nest");
   public static final akp<cet> r = a("nether_portal");
   public static final akp<cet> s = a("lodestone");
   public static final akp<cet> t = a("lightning_rod");
   private static final Set<dta> u = ImmutableList.of(
         dfy.bn, dfy.bo, dfy.bk, dfy.bl, dfy.bi, dfy.bg, dfy.bm, dfy.bc, dfy.bh, dfy.be, dfy.bb, dfy.ba, new dfw[]{dfy.bf, dfy.bj, dfy.aZ, dfy.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dfp.b) == dtn.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dta> v = ImmutableList.of(dfy.ft, dfy.fv, dfy.fu, dfy.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dta, jm<cet>> w = Maps.newHashMap();

   private static Set<dta> a(dfw $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akp<cet> a(String $$0) {
      return akp.a(lu.aa, akq.b($$0));
   }

   private static cet a(jz<cet> $$0, akp<cet> $$1, Set<dta> $$2, int $$3, int $$4) {
      cet $$5 = new cet($$2, $$3, $$4);
      jz.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jm<cet> $$0, Set<dta> $$1) {
      $$1.forEach($$1x -> {
         jm<cet> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jm<cet>> a(dta $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dta $$0) {
      return w.containsKey($$0);
   }

   public static cet a(jz<cet> $$0) {
      a($$0, a, a(dfy.nW), 1, 1);
      a($$0, b, a(dfy.nV), 1, 1);
      a($$0, c, a(dfy.nX), 1, 1);
      a($$0, d, a(dfy.fs), 1, 1);
      a($$0, e, a(dfy.pc), 1, 1);
      a($$0, f, a(dfy.nU), 1, 1);
      a($$0, g, a(dfy.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfy.oa), 1, 1);
      a($$0, j, a(dfy.oc), 1, 1);
      a($$0, k, a(dfy.nT), 1, 1);
      a($$0, l, a(dfy.ob), 1, 1);
      a($$0, m, a(dfy.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfy.od), 32, 6);
      a($$0, p, a(dfy.pf), 0, 1);
      a($$0, q, a(dfy.pe), 0, 1);
      a($$0, r, a(dfy.ed), 0, 1);
      a($$0, s, a(dfy.pq), 0, 1);
      return a($$0, t, a(dfy.ss), 0, 1);
   }
}
