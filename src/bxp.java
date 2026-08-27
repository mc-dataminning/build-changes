import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bxp {
   public static final ahf<bxo> a = a("armorer");
   public static final ahf<bxo> b = a("butcher");
   public static final ahf<bxo> c = a("cartographer");
   public static final ahf<bxo> d = a("cleric");
   public static final ahf<bxo> e = a("farmer");
   public static final ahf<bxo> f = a("fisherman");
   public static final ahf<bxo> g = a("fletcher");
   public static final ahf<bxo> h = a("leatherworker");
   public static final ahf<bxo> i = a("librarian");
   public static final ahf<bxo> j = a("mason");
   public static final ahf<bxo> k = a("shepherd");
   public static final ahf<bxo> l = a("toolsmith");
   public static final ahf<bxo> m = a("weaponsmith");
   public static final ahf<bxo> n = a("home");
   public static final ahf<bxo> o = a("meeting");
   public static final ahf<bxo> p = a("beehive");
   public static final ahf<bxo> q = a("bee_nest");
   public static final ahf<bxo> r = a("nether_portal");
   public static final ahf<bxo> s = a("lodestone");
   public static final ahf<bxo> t = a("lightning_rod");
   private static final Set<djg> u = ImmutableList.of(
         cwr.bn, cwr.bo, cwr.bk, cwr.bl, cwr.bi, cwr.bg, cwr.bm, cwr.bc, cwr.bh, cwr.be, cwr.bb, cwr.ba, new cwp[]{cwr.bf, cwr.bj, cwr.aZ, cwr.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cwi.b) == djt.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<djg> v = ImmutableList.of(cwr.ft, cwr.fv, cwr.fu, cwr.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<djg, ih<bxo>> w = Maps.newHashMap();

   private static Set<djg> a(cwp $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ahf<bxo> a(String $$0) {
      return ahf.a(ke.U, new ahg($$0));
   }

   private static bxo a(it<bxo> $$0, ahf<bxo> $$1, Set<djg> $$2, int $$3, int $$4) {
      bxo $$5 = new bxo($$2, $$3, $$4);
      it.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ih<bxo> $$0, Set<djg> $$1) {
      $$1.forEach($$1x -> {
         ih<bxo> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ih<bxo>> a(djg $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(djg $$0) {
      return w.containsKey($$0);
   }

   public static bxo a(it<bxo> $$0) {
      a($$0, a, a(cwr.nW), 1, 1);
      a($$0, b, a(cwr.nV), 1, 1);
      a($$0, c, a(cwr.nX), 1, 1);
      a($$0, d, a(cwr.fs), 1, 1);
      a($$0, e, a(cwr.pc), 1, 1);
      a($$0, f, a(cwr.nU), 1, 1);
      a($$0, g, a(cwr.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cwr.oa), 1, 1);
      a($$0, j, a(cwr.oc), 1, 1);
      a($$0, k, a(cwr.nT), 1, 1);
      a($$0, l, a(cwr.ob), 1, 1);
      a($$0, m, a(cwr.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cwr.od), 32, 6);
      a($$0, p, a(cwr.pf), 0, 1);
      a($$0, q, a(cwr.pe), 0, 1);
      a($$0, r, a(cwr.ed), 0, 1);
      a($$0, s, a(cwr.pq), 0, 1);
      return a($$0, t, a(cwr.ss), 0, 1);
   }
}
