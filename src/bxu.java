import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bxu {
   public static final ahg<bxt> a = a("armorer");
   public static final ahg<bxt> b = a("butcher");
   public static final ahg<bxt> c = a("cartographer");
   public static final ahg<bxt> d = a("cleric");
   public static final ahg<bxt> e = a("farmer");
   public static final ahg<bxt> f = a("fisherman");
   public static final ahg<bxt> g = a("fletcher");
   public static final ahg<bxt> h = a("leatherworker");
   public static final ahg<bxt> i = a("librarian");
   public static final ahg<bxt> j = a("mason");
   public static final ahg<bxt> k = a("shepherd");
   public static final ahg<bxt> l = a("toolsmith");
   public static final ahg<bxt> m = a("weaponsmith");
   public static final ahg<bxt> n = a("home");
   public static final ahg<bxt> o = a("meeting");
   public static final ahg<bxt> p = a("beehive");
   public static final ahg<bxt> q = a("bee_nest");
   public static final ahg<bxt> r = a("nether_portal");
   public static final ahg<bxt> s = a("lodestone");
   public static final ahg<bxt> t = a("lightning_rod");
   private static final Set<djp> u = ImmutableList.of(
         cxa.bn, cxa.bo, cxa.bk, cxa.bl, cxa.bi, cxa.bg, cxa.bm, cxa.bc, cxa.bh, cxa.be, cxa.bb, cxa.ba, new cwy[]{cxa.bf, cxa.bj, cxa.aZ, cxa.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cwr.b) == dkc.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<djp> v = ImmutableList.of(cxa.ft, cxa.fv, cxa.fu, cxa.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<djp, ih<bxt>> w = Maps.newHashMap();

   private static Set<djp> a(cwy $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ahg<bxt> a(String $$0) {
      return ahg.a(ke.U, new ahh($$0));
   }

   private static bxt a(it<bxt> $$0, ahg<bxt> $$1, Set<djp> $$2, int $$3, int $$4) {
      bxt $$5 = new bxt($$2, $$3, $$4);
      it.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ih<bxt> $$0, Set<djp> $$1) {
      $$1.forEach($$1x -> {
         ih<bxt> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ih<bxt>> a(djp $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(djp $$0) {
      return w.containsKey($$0);
   }

   public static bxt a(it<bxt> $$0) {
      a($$0, a, a(cxa.nW), 1, 1);
      a($$0, b, a(cxa.nV), 1, 1);
      a($$0, c, a(cxa.nX), 1, 1);
      a($$0, d, a(cxa.fs), 1, 1);
      a($$0, e, a(cxa.pc), 1, 1);
      a($$0, f, a(cxa.nU), 1, 1);
      a($$0, g, a(cxa.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cxa.oa), 1, 1);
      a($$0, j, a(cxa.oc), 1, 1);
      a($$0, k, a(cxa.nT), 1, 1);
      a($$0, l, a(cxa.ob), 1, 1);
      a($$0, m, a(cxa.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cxa.od), 32, 6);
      a($$0, p, a(cxa.pf), 0, 1);
      a($$0, q, a(cxa.pe), 0, 1);
      a($$0, r, a(cxa.ed), 0, 1);
      a($$0, s, a(cxa.pq), 0, 1);
      return a($$0, t, a(cxa.ss), 0, 1);
   }
}
