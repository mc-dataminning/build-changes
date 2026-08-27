import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cdw {
   public static final akl<cdv> a = a("armorer");
   public static final akl<cdv> b = a("butcher");
   public static final akl<cdv> c = a("cartographer");
   public static final akl<cdv> d = a("cleric");
   public static final akl<cdv> e = a("farmer");
   public static final akl<cdv> f = a("fisherman");
   public static final akl<cdv> g = a("fletcher");
   public static final akl<cdv> h = a("leatherworker");
   public static final akl<cdv> i = a("librarian");
   public static final akl<cdv> j = a("mason");
   public static final akl<cdv> k = a("shepherd");
   public static final akl<cdv> l = a("toolsmith");
   public static final akl<cdv> m = a("weaponsmith");
   public static final akl<cdv> n = a("home");
   public static final akl<cdv> o = a("meeting");
   public static final akl<cdv> p = a("beehive");
   public static final akl<cdv> q = a("bee_nest");
   public static final akl<cdv> r = a("nether_portal");
   public static final akl<cdv> s = a("lodestone");
   public static final akl<cdv> t = a("lightning_rod");
   private static final Set<drb> u = ImmutableList.of(
         dea.bn, dea.bo, dea.bk, dea.bl, dea.bi, dea.bg, dea.bm, dea.bc, dea.bh, dea.be, dea.bb, dea.ba, new ddy[]{dea.bf, dea.bj, dea.aZ, dea.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.m().a().stream())
      .filter($$0 -> $$0.c(ddr.b) == dro.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<drb> v = ImmutableList.of(dea.ft, dea.fv, dea.fu, dea.fw)
      .stream()
      .flatMap($$0 -> $$0.m().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<drb, ix<cdv>> w = Maps.newHashMap();

   private static Set<drb> a(ddy $$0) {
      return ImmutableSet.copyOf($$0.m().a());
   }

   private static akl<cdv> a(String $$0) {
      return akl.a(lf.V, new akm($$0));
   }

   private static cdv a(jk<cdv> $$0, akl<cdv> $$1, Set<drb> $$2, int $$3, int $$4) {
      cdv $$5 = new cdv($$2, $$3, $$4);
      jk.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ix<cdv> $$0, Set<drb> $$1) {
      $$1.forEach($$1x -> {
         ix<cdv> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ix<cdv>> a(drb $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(drb $$0) {
      return w.containsKey($$0);
   }

   public static cdv a(jk<cdv> $$0) {
      a($$0, a, a(dea.nW), 1, 1);
      a($$0, b, a(dea.nV), 1, 1);
      a($$0, c, a(dea.nX), 1, 1);
      a($$0, d, a(dea.fs), 1, 1);
      a($$0, e, a(dea.pc), 1, 1);
      a($$0, f, a(dea.nU), 1, 1);
      a($$0, g, a(dea.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dea.oa), 1, 1);
      a($$0, j, a(dea.oc), 1, 1);
      a($$0, k, a(dea.nT), 1, 1);
      a($$0, l, a(dea.ob), 1, 1);
      a($$0, m, a(dea.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dea.od), 32, 6);
      a($$0, p, a(dea.pf), 0, 1);
      a($$0, q, a(dea.pe), 0, 1);
      a($$0, r, a(dea.ed), 0, 1);
      a($$0, s, a(dea.pq), 0, 1);
      return a($$0, t, a(dea.ss), 0, 1);
   }
}
