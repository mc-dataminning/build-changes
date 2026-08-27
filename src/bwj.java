import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bwj {
   public static final agh<bwi> a = a("armorer");
   public static final agh<bwi> b = a("butcher");
   public static final agh<bwi> c = a("cartographer");
   public static final agh<bwi> d = a("cleric");
   public static final agh<bwi> e = a("farmer");
   public static final agh<bwi> f = a("fisherman");
   public static final agh<bwi> g = a("fletcher");
   public static final agh<bwi> h = a("leatherworker");
   public static final agh<bwi> i = a("librarian");
   public static final agh<bwi> j = a("mason");
   public static final agh<bwi> k = a("shepherd");
   public static final agh<bwi> l = a("toolsmith");
   public static final agh<bwi> m = a("weaponsmith");
   public static final agh<bwi> n = a("home");
   public static final agh<bwi> o = a("meeting");
   public static final agh<bwi> p = a("beehive");
   public static final agh<bwi> q = a("bee_nest");
   public static final agh<bwi> r = a("nether_portal");
   public static final agh<bwi> s = a("lodestone");
   public static final agh<bwi> t = a("lightning_rod");
   private static final Set<dhi> u = ImmutableList.of(
         cvc.bn, cvc.bo, cvc.bk, cvc.bl, cvc.bi, cvc.bg, cvc.bm, cvc.bc, cvc.bh, cvc.be, cvc.bb, cvc.ba, new cva[]{cvc.bf, cvc.bj, cvc.aZ, cvc.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cut.b) == dhv.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dhi> v = ImmutableList.of(cvc.ft, cvc.fv, cvc.fu, cvc.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dhi, ib<bwi>> w = Maps.newHashMap();

   private static Set<dhi> a(cva $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static agh<bwi> a(String $$0) {
      return agh.a(jz.T, new agi($$0));
   }

   private static bwi a(io<bwi> $$0, agh<bwi> $$1, Set<dhi> $$2, int $$3, int $$4) {
      bwi $$5 = new bwi($$2, $$3, $$4);
      io.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ib<bwi> $$0, Set<dhi> $$1) {
      $$1.forEach($$1x -> {
         ib<bwi> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ib<bwi>> a(dhi $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dhi $$0) {
      return w.containsKey($$0);
   }

   public static bwi a(io<bwi> $$0) {
      a($$0, a, a(cvc.nW), 1, 1);
      a($$0, b, a(cvc.nV), 1, 1);
      a($$0, c, a(cvc.nX), 1, 1);
      a($$0, d, a(cvc.fs), 1, 1);
      a($$0, e, a(cvc.pc), 1, 1);
      a($$0, f, a(cvc.nU), 1, 1);
      a($$0, g, a(cvc.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cvc.oa), 1, 1);
      a($$0, j, a(cvc.oc), 1, 1);
      a($$0, k, a(cvc.nT), 1, 1);
      a($$0, l, a(cvc.ob), 1, 1);
      a($$0, m, a(cvc.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cvc.od), 32, 6);
      a($$0, p, a(cvc.pf), 0, 1);
      a($$0, q, a(cvc.pe), 0, 1);
      a($$0, r, a(cvc.ed), 0, 1);
      a($$0, s, a(cvc.pq), 0, 1);
      return a($$0, t, a(cvc.ss), 0, 1);
   }
}
