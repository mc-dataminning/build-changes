import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class buc {
   public static final aeq<bub> a = a("armorer");
   public static final aeq<bub> b = a("butcher");
   public static final aeq<bub> c = a("cartographer");
   public static final aeq<bub> d = a("cleric");
   public static final aeq<bub> e = a("farmer");
   public static final aeq<bub> f = a("fisherman");
   public static final aeq<bub> g = a("fletcher");
   public static final aeq<bub> h = a("leatherworker");
   public static final aeq<bub> i = a("librarian");
   public static final aeq<bub> j = a("mason");
   public static final aeq<bub> k = a("shepherd");
   public static final aeq<bub> l = a("toolsmith");
   public static final aeq<bub> m = a("weaponsmith");
   public static final aeq<bub> n = a("home");
   public static final aeq<bub> o = a("meeting");
   public static final aeq<bub> p = a("beehive");
   public static final aeq<bub> q = a("bee_nest");
   public static final aeq<bub> r = a("nether_portal");
   public static final aeq<bub> s = a("lodestone");
   public static final aeq<bub> t = a("lightning_rod");
   private static final Set<dfa> u = ImmutableList.of(
         csn.bn, csn.bo, csn.bk, csn.bl, csn.bi, csn.bg, csn.bm, csn.bc, csn.bh, csn.be, csn.bb, csn.ba, new csm[]{csn.bf, csn.bj, csn.aZ, csn.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(csf.a) == dfn.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dfa> v = ImmutableList.of(csn.ft, csn.fv, csn.fu, csn.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dfa, he<bub>> w = Maps.newHashMap();

   private static Set<dfa> a(csm $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aeq<bub> a(String $$0) {
      return aeq.a(jc.S, new aer($$0));
   }

   private static bub a(hr<bub> $$0, aeq<bub> $$1, Set<dfa> $$2, int $$3, int $$4) {
      bub $$5 = new bub($$2, $$3, $$4);
      hr.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(he<bub> $$0, Set<dfa> $$1) {
      $$1.forEach($$1x -> {
         he<bub> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<he<bub>> a(dfa $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dfa $$0) {
      return w.containsKey($$0);
   }

   public static bub a(hr<bub> $$0) {
      a($$0, a, a(csn.nW), 1, 1);
      a($$0, b, a(csn.nV), 1, 1);
      a($$0, c, a(csn.nX), 1, 1);
      a($$0, d, a(csn.fs), 1, 1);
      a($$0, e, a(csn.pc), 1, 1);
      a($$0, f, a(csn.nU), 1, 1);
      a($$0, g, a(csn.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(csn.oa), 1, 1);
      a($$0, j, a(csn.oc), 1, 1);
      a($$0, k, a(csn.nT), 1, 1);
      a($$0, l, a(csn.ob), 1, 1);
      a($$0, m, a(csn.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(csn.od), 32, 6);
      a($$0, p, a(csn.pf), 0, 1);
      a($$0, q, a(csn.pe), 0, 1);
      a($$0, r, a(csn.ee), 0, 1);
      a($$0, s, a(csn.pq), 0, 1);
      return a($$0, t, a(csn.rr), 0, 1);
   }
}
