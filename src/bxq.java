import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bxq {
   public static final ahf<bxp> a = a("armorer");
   public static final ahf<bxp> b = a("butcher");
   public static final ahf<bxp> c = a("cartographer");
   public static final ahf<bxp> d = a("cleric");
   public static final ahf<bxp> e = a("farmer");
   public static final ahf<bxp> f = a("fisherman");
   public static final ahf<bxp> g = a("fletcher");
   public static final ahf<bxp> h = a("leatherworker");
   public static final ahf<bxp> i = a("librarian");
   public static final ahf<bxp> j = a("mason");
   public static final ahf<bxp> k = a("shepherd");
   public static final ahf<bxp> l = a("toolsmith");
   public static final ahf<bxp> m = a("weaponsmith");
   public static final ahf<bxp> n = a("home");
   public static final ahf<bxp> o = a("meeting");
   public static final ahf<bxp> p = a("beehive");
   public static final ahf<bxp> q = a("bee_nest");
   public static final ahf<bxp> r = a("nether_portal");
   public static final ahf<bxp> s = a("lodestone");
   public static final ahf<bxp> t = a("lightning_rod");
   private static final Set<djh> u = ImmutableList.of(
         cws.bn, cws.bo, cws.bk, cws.bl, cws.bi, cws.bg, cws.bm, cws.bc, cws.bh, cws.be, cws.bb, cws.ba, new cwq[]{cws.bf, cws.bj, cws.aZ, cws.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cwj.b) == dju.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<djh> v = ImmutableList.of(cws.ft, cws.fv, cws.fu, cws.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<djh, ih<bxp>> w = Maps.newHashMap();

   private static Set<djh> a(cwq $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ahf<bxp> a(String $$0) {
      return ahf.a(ke.U, new ahg($$0));
   }

   private static bxp a(it<bxp> $$0, ahf<bxp> $$1, Set<djh> $$2, int $$3, int $$4) {
      bxp $$5 = new bxp($$2, $$3, $$4);
      it.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ih<bxp> $$0, Set<djh> $$1) {
      $$1.forEach($$1x -> {
         ih<bxp> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ih<bxp>> a(djh $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(djh $$0) {
      return w.containsKey($$0);
   }

   public static bxp a(it<bxp> $$0) {
      a($$0, a, a(cws.nW), 1, 1);
      a($$0, b, a(cws.nV), 1, 1);
      a($$0, c, a(cws.nX), 1, 1);
      a($$0, d, a(cws.fs), 1, 1);
      a($$0, e, a(cws.pc), 1, 1);
      a($$0, f, a(cws.nU), 1, 1);
      a($$0, g, a(cws.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cws.oa), 1, 1);
      a($$0, j, a(cws.oc), 1, 1);
      a($$0, k, a(cws.nT), 1, 1);
      a($$0, l, a(cws.ob), 1, 1);
      a($$0, m, a(cws.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cws.od), 32, 6);
      a($$0, p, a(cws.pf), 0, 1);
      a($$0, q, a(cws.pe), 0, 1);
      a($$0, r, a(cws.ed), 0, 1);
      a($$0, s, a(cws.pq), 0, 1);
      return a($$0, t, a(cws.ss), 0, 1);
   }
}
