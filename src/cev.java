import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cev {
   public static final ald<ceu> a = a("armorer");
   public static final ald<ceu> b = a("butcher");
   public static final ald<ceu> c = a("cartographer");
   public static final ald<ceu> d = a("cleric");
   public static final ald<ceu> e = a("farmer");
   public static final ald<ceu> f = a("fisherman");
   public static final ald<ceu> g = a("fletcher");
   public static final ald<ceu> h = a("leatherworker");
   public static final ald<ceu> i = a("librarian");
   public static final ald<ceu> j = a("mason");
   public static final ald<ceu> k = a("shepherd");
   public static final ald<ceu> l = a("toolsmith");
   public static final ald<ceu> m = a("weaponsmith");
   public static final ald<ceu> n = a("home");
   public static final ald<ceu> o = a("meeting");
   public static final ald<ceu> p = a("beehive");
   public static final ald<ceu> q = a("bee_nest");
   public static final ald<ceu> r = a("nether_portal");
   public static final ald<ceu> s = a("lodestone");
   public static final ald<ceu> t = a("lightning_rod");
   private static final Set<dsa> u = ImmutableList.of(
         dez.bn, dez.bo, dez.bk, dez.bl, dez.bi, dez.bg, dez.bm, dez.bc, dez.bh, dez.be, dez.bb, dez.ba, new dex[]{dez.bf, dez.bj, dez.aZ, dez.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(deq.b) == dsn.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsa> v = ImmutableList.of(dez.ft, dez.fv, dez.fu, dez.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsa, ji<ceu>> w = Maps.newHashMap();

   private static Set<dsa> a(dex $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ald<ceu> a(String $$0) {
      return ald.a(lq.V, new ale($$0));
   }

   private static ceu a(jv<ceu> $$0, ald<ceu> $$1, Set<dsa> $$2, int $$3, int $$4) {
      ceu $$5 = new ceu($$2, $$3, $$4);
      jv.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ji<ceu> $$0, Set<dsa> $$1) {
      $$1.forEach($$1x -> {
         ji<ceu> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ji<ceu>> a(dsa $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsa $$0) {
      return w.containsKey($$0);
   }

   public static ceu a(jv<ceu> $$0) {
      a($$0, a, a(dez.nW), 1, 1);
      a($$0, b, a(dez.nV), 1, 1);
      a($$0, c, a(dez.nX), 1, 1);
      a($$0, d, a(dez.fs), 1, 1);
      a($$0, e, a(dez.pc), 1, 1);
      a($$0, f, a(dez.nU), 1, 1);
      a($$0, g, a(dez.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dez.oa), 1, 1);
      a($$0, j, a(dez.oc), 1, 1);
      a($$0, k, a(dez.nT), 1, 1);
      a($$0, l, a(dez.ob), 1, 1);
      a($$0, m, a(dez.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dez.od), 32, 6);
      a($$0, p, a(dez.pf), 0, 1);
      a($$0, q, a(dez.pe), 0, 1);
      a($$0, r, a(dez.ed), 0, 1);
      a($$0, s, a(dez.pq), 0, 1);
      return a($$0, t, a(dez.ss), 0, 1);
   }
}
