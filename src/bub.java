import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bub {
   public static final aeq<bua> a = a("armorer");
   public static final aeq<bua> b = a("butcher");
   public static final aeq<bua> c = a("cartographer");
   public static final aeq<bua> d = a("cleric");
   public static final aeq<bua> e = a("farmer");
   public static final aeq<bua> f = a("fisherman");
   public static final aeq<bua> g = a("fletcher");
   public static final aeq<bua> h = a("leatherworker");
   public static final aeq<bua> i = a("librarian");
   public static final aeq<bua> j = a("mason");
   public static final aeq<bua> k = a("shepherd");
   public static final aeq<bua> l = a("toolsmith");
   public static final aeq<bua> m = a("weaponsmith");
   public static final aeq<bua> n = a("home");
   public static final aeq<bua> o = a("meeting");
   public static final aeq<bua> p = a("beehive");
   public static final aeq<bua> q = a("bee_nest");
   public static final aeq<bua> r = a("nether_portal");
   public static final aeq<bua> s = a("lodestone");
   public static final aeq<bua> t = a("lightning_rod");
   private static final Set<dez> u = ImmutableList.of(
         csm.bn, csm.bo, csm.bk, csm.bl, csm.bi, csm.bg, csm.bm, csm.bc, csm.bh, csm.be, csm.bb, csm.ba, new csl[]{csm.bf, csm.bj, csm.aZ, csm.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(cse.a) == dfm.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dez> v = ImmutableList.of(csm.ft, csm.fv, csm.fu, csm.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dez, he<bua>> w = Maps.newHashMap();

   private static Set<dez> a(csl $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aeq<bua> a(String $$0) {
      return aeq.a(jc.S, new aer($$0));
   }

   private static bua a(hr<bua> $$0, aeq<bua> $$1, Set<dez> $$2, int $$3, int $$4) {
      bua $$5 = new bua($$2, $$3, $$4);
      hr.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(he<bua> $$0, Set<dez> $$1) {
      $$1.forEach($$1x -> {
         he<bua> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<he<bua>> a(dez $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dez $$0) {
      return w.containsKey($$0);
   }

   public static bua a(hr<bua> $$0) {
      a($$0, a, a(csm.nW), 1, 1);
      a($$0, b, a(csm.nV), 1, 1);
      a($$0, c, a(csm.nX), 1, 1);
      a($$0, d, a(csm.fs), 1, 1);
      a($$0, e, a(csm.pc), 1, 1);
      a($$0, f, a(csm.nU), 1, 1);
      a($$0, g, a(csm.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(csm.oa), 1, 1);
      a($$0, j, a(csm.oc), 1, 1);
      a($$0, k, a(csm.nT), 1, 1);
      a($$0, l, a(csm.ob), 1, 1);
      a($$0, m, a(csm.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(csm.od), 32, 6);
      a($$0, p, a(csm.pf), 0, 1);
      a($$0, q, a(csm.pe), 0, 1);
      a($$0, r, a(csm.ee), 0, 1);
      a($$0, s, a(csm.pq), 0, 1);
      return a($$0, t, a(csm.rr), 0, 1);
   }
}
