import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bxa {
   public static final ags<bwz> a = a("armorer");
   public static final ags<bwz> b = a("butcher");
   public static final ags<bwz> c = a("cartographer");
   public static final ags<bwz> d = a("cleric");
   public static final ags<bwz> e = a("farmer");
   public static final ags<bwz> f = a("fisherman");
   public static final ags<bwz> g = a("fletcher");
   public static final ags<bwz> h = a("leatherworker");
   public static final ags<bwz> i = a("librarian");
   public static final ags<bwz> j = a("mason");
   public static final ags<bwz> k = a("shepherd");
   public static final ags<bwz> l = a("toolsmith");
   public static final ags<bwz> m = a("weaponsmith");
   public static final ags<bwz> n = a("home");
   public static final ags<bwz> o = a("meeting");
   public static final ags<bwz> p = a("beehive");
   public static final ags<bwz> q = a("bee_nest");
   public static final ags<bwz> r = a("nether_portal");
   public static final ags<bwz> s = a("lodestone");
   public static final ags<bwz> t = a("lightning_rod");
   private static final Set<dip> u = ImmutableList.of(
         cwb.bn, cwb.bo, cwb.bk, cwb.bl, cwb.bi, cwb.bg, cwb.bm, cwb.bc, cwb.bh, cwb.be, cwb.bb, cwb.ba, new cvz[]{cwb.bf, cwb.bj, cwb.aZ, cwb.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cvs.b) == djc.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dip> v = ImmutableList.of(cwb.ft, cwb.fv, cwb.fu, cwb.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dip, ie<bwz>> w = Maps.newHashMap();

   private static Set<dip> a(cvz $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ags<bwz> a(String $$0) {
      return ags.a(kc.U, new agt($$0));
   }

   private static bwz a(ir<bwz> $$0, ags<bwz> $$1, Set<dip> $$2, int $$3, int $$4) {
      bwz $$5 = new bwz($$2, $$3, $$4);
      ir.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ie<bwz> $$0, Set<dip> $$1) {
      $$1.forEach($$1x -> {
         ie<bwz> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ie<bwz>> a(dip $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dip $$0) {
      return w.containsKey($$0);
   }

   public static bwz a(ir<bwz> $$0) {
      a($$0, a, a(cwb.nW), 1, 1);
      a($$0, b, a(cwb.nV), 1, 1);
      a($$0, c, a(cwb.nX), 1, 1);
      a($$0, d, a(cwb.fs), 1, 1);
      a($$0, e, a(cwb.pc), 1, 1);
      a($$0, f, a(cwb.nU), 1, 1);
      a($$0, g, a(cwb.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cwb.oa), 1, 1);
      a($$0, j, a(cwb.oc), 1, 1);
      a($$0, k, a(cwb.nT), 1, 1);
      a($$0, l, a(cwb.ob), 1, 1);
      a($$0, m, a(cwb.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cwb.od), 32, 6);
      a($$0, p, a(cwb.pf), 0, 1);
      a($$0, q, a(cwb.pe), 0, 1);
      a($$0, r, a(cwb.ed), 0, 1);
      a($$0, s, a(cwb.pq), 0, 1);
      return a($$0, t, a(cwb.ss), 0, 1);
   }
}
