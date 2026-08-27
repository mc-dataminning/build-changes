import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bxk {
   public static final ahc<bxj> a = a("armorer");
   public static final ahc<bxj> b = a("butcher");
   public static final ahc<bxj> c = a("cartographer");
   public static final ahc<bxj> d = a("cleric");
   public static final ahc<bxj> e = a("farmer");
   public static final ahc<bxj> f = a("fisherman");
   public static final ahc<bxj> g = a("fletcher");
   public static final ahc<bxj> h = a("leatherworker");
   public static final ahc<bxj> i = a("librarian");
   public static final ahc<bxj> j = a("mason");
   public static final ahc<bxj> k = a("shepherd");
   public static final ahc<bxj> l = a("toolsmith");
   public static final ahc<bxj> m = a("weaponsmith");
   public static final ahc<bxj> n = a("home");
   public static final ahc<bxj> o = a("meeting");
   public static final ahc<bxj> p = a("beehive");
   public static final ahc<bxj> q = a("bee_nest");
   public static final ahc<bxj> r = a("nether_portal");
   public static final ahc<bxj> s = a("lodestone");
   public static final ahc<bxj> t = a("lightning_rod");
   private static final Set<dja> u = ImmutableList.of(
         cwl.bn, cwl.bo, cwl.bk, cwl.bl, cwl.bi, cwl.bg, cwl.bm, cwl.bc, cwl.bh, cwl.be, cwl.bb, cwl.ba, new cwj[]{cwl.bf, cwl.bj, cwl.aZ, cwl.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cwc.b) == djn.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dja> v = ImmutableList.of(cwl.ft, cwl.fv, cwl.fu, cwl.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dja, ih<bxj>> w = Maps.newHashMap();

   private static Set<dja> a(cwj $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ahc<bxj> a(String $$0) {
      return ahc.a(ke.U, new ahd($$0));
   }

   private static bxj a(it<bxj> $$0, ahc<bxj> $$1, Set<dja> $$2, int $$3, int $$4) {
      bxj $$5 = new bxj($$2, $$3, $$4);
      it.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ih<bxj> $$0, Set<dja> $$1) {
      $$1.forEach($$1x -> {
         ih<bxj> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ih<bxj>> a(dja $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dja $$0) {
      return w.containsKey($$0);
   }

   public static bxj a(it<bxj> $$0) {
      a($$0, a, a(cwl.nW), 1, 1);
      a($$0, b, a(cwl.nV), 1, 1);
      a($$0, c, a(cwl.nX), 1, 1);
      a($$0, d, a(cwl.fs), 1, 1);
      a($$0, e, a(cwl.pc), 1, 1);
      a($$0, f, a(cwl.nU), 1, 1);
      a($$0, g, a(cwl.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cwl.oa), 1, 1);
      a($$0, j, a(cwl.oc), 1, 1);
      a($$0, k, a(cwl.nT), 1, 1);
      a($$0, l, a(cwl.ob), 1, 1);
      a($$0, m, a(cwl.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cwl.od), 32, 6);
      a($$0, p, a(cwl.pf), 0, 1);
      a($$0, q, a(cwl.pe), 0, 1);
      a($$0, r, a(cwl.ed), 0, 1);
      a($$0, s, a(cwl.pq), 0, 1);
      return a($$0, t, a(cwl.ss), 0, 1);
   }
}
