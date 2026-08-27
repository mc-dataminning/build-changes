import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bue {
   public static final aet<bud> a = a("armorer");
   public static final aet<bud> b = a("butcher");
   public static final aet<bud> c = a("cartographer");
   public static final aet<bud> d = a("cleric");
   public static final aet<bud> e = a("farmer");
   public static final aet<bud> f = a("fisherman");
   public static final aet<bud> g = a("fletcher");
   public static final aet<bud> h = a("leatherworker");
   public static final aet<bud> i = a("librarian");
   public static final aet<bud> j = a("mason");
   public static final aet<bud> k = a("shepherd");
   public static final aet<bud> l = a("toolsmith");
   public static final aet<bud> m = a("weaponsmith");
   public static final aet<bud> n = a("home");
   public static final aet<bud> o = a("meeting");
   public static final aet<bud> p = a("beehive");
   public static final aet<bud> q = a("bee_nest");
   public static final aet<bud> r = a("nether_portal");
   public static final aet<bud> s = a("lodestone");
   public static final aet<bud> t = a("lightning_rod");
   private static final Set<dfe> u = ImmutableList.of(
         csr.bn, csr.bo, csr.bk, csr.bl, csr.bi, csr.bg, csr.bm, csr.bc, csr.bh, csr.be, csr.bb, csr.ba, new csq[]{csr.bf, csr.bj, csr.aZ, csr.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(csj.a) == dfr.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dfe> v = ImmutableList.of(csr.ft, csr.fv, csr.fu, csr.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dfe, hg<bud>> w = Maps.newHashMap();

   private static Set<dfe> a(csq $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aet<bud> a(String $$0) {
      return aet.a(je.S, new aeu($$0));
   }

   private static bud a(ht<bud> $$0, aet<bud> $$1, Set<dfe> $$2, int $$3, int $$4) {
      bud $$5 = new bud($$2, $$3, $$4);
      ht.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(hg<bud> $$0, Set<dfe> $$1) {
      $$1.forEach($$1x -> {
         hg<bud> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<hg<bud>> a(dfe $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dfe $$0) {
      return w.containsKey($$0);
   }

   public static bud a(ht<bud> $$0) {
      a($$0, a, a(csr.nW), 1, 1);
      a($$0, b, a(csr.nV), 1, 1);
      a($$0, c, a(csr.nX), 1, 1);
      a($$0, d, a(csr.fs), 1, 1);
      a($$0, e, a(csr.pc), 1, 1);
      a($$0, f, a(csr.nU), 1, 1);
      a($$0, g, a(csr.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(csr.oa), 1, 1);
      a($$0, j, a(csr.oc), 1, 1);
      a($$0, k, a(csr.nT), 1, 1);
      a($$0, l, a(csr.ob), 1, 1);
      a($$0, m, a(csr.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(csr.od), 32, 6);
      a($$0, p, a(csr.pf), 0, 1);
      a($$0, q, a(csr.pe), 0, 1);
      a($$0, r, a(csr.ee), 0, 1);
      a($$0, s, a(csr.pq), 0, 1);
      return a($$0, t, a(csr.rr), 0, 1);
   }
}
