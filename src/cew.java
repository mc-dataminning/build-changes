import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cew {
   public static final ald<cev> a = a("armorer");
   public static final ald<cev> b = a("butcher");
   public static final ald<cev> c = a("cartographer");
   public static final ald<cev> d = a("cleric");
   public static final ald<cev> e = a("farmer");
   public static final ald<cev> f = a("fisherman");
   public static final ald<cev> g = a("fletcher");
   public static final ald<cev> h = a("leatherworker");
   public static final ald<cev> i = a("librarian");
   public static final ald<cev> j = a("mason");
   public static final ald<cev> k = a("shepherd");
   public static final ald<cev> l = a("toolsmith");
   public static final ald<cev> m = a("weaponsmith");
   public static final ald<cev> n = a("home");
   public static final ald<cev> o = a("meeting");
   public static final ald<cev> p = a("beehive");
   public static final ald<cev> q = a("bee_nest");
   public static final ald<cev> r = a("nether_portal");
   public static final ald<cev> s = a("lodestone");
   public static final ald<cev> t = a("lightning_rod");
   private static final Set<dsb> u = ImmutableList.of(
         dfa.bn, dfa.bo, dfa.bk, dfa.bl, dfa.bi, dfa.bg, dfa.bm, dfa.bc, dfa.bh, dfa.be, dfa.bb, dfa.ba, new dey[]{dfa.bf, dfa.bj, dfa.aZ, dfa.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(der.b) == dso.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsb> v = ImmutableList.of(dfa.ft, dfa.fv, dfa.fu, dfa.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsb, ji<cev>> w = Maps.newHashMap();

   private static Set<dsb> a(dey $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ald<cev> a(String $$0) {
      return ald.a(lq.V, new ale($$0));
   }

   private static cev a(jv<cev> $$0, ald<cev> $$1, Set<dsb> $$2, int $$3, int $$4) {
      cev $$5 = new cev($$2, $$3, $$4);
      jv.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ji<cev> $$0, Set<dsb> $$1) {
      $$1.forEach($$1x -> {
         ji<cev> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ji<cev>> a(dsb $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsb $$0) {
      return w.containsKey($$0);
   }

   public static cev a(jv<cev> $$0) {
      a($$0, a, a(dfa.nW), 1, 1);
      a($$0, b, a(dfa.nV), 1, 1);
      a($$0, c, a(dfa.nX), 1, 1);
      a($$0, d, a(dfa.fs), 1, 1);
      a($$0, e, a(dfa.pc), 1, 1);
      a($$0, f, a(dfa.nU), 1, 1);
      a($$0, g, a(dfa.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfa.oa), 1, 1);
      a($$0, j, a(dfa.oc), 1, 1);
      a($$0, k, a(dfa.nT), 1, 1);
      a($$0, l, a(dfa.ob), 1, 1);
      a($$0, m, a(dfa.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfa.od), 32, 6);
      a($$0, p, a(dfa.pf), 0, 1);
      a($$0, q, a(dfa.pe), 0, 1);
      a($$0, r, a(dfa.ed), 0, 1);
      a($$0, s, a(dfa.pq), 0, 1);
      return a($$0, t, a(dfa.ss), 0, 1);
   }
}
