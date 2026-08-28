import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cfm {
   public static final ala<cfl> a = a("armorer");
   public static final ala<cfl> b = a("butcher");
   public static final ala<cfl> c = a("cartographer");
   public static final ala<cfl> d = a("cleric");
   public static final ala<cfl> e = a("farmer");
   public static final ala<cfl> f = a("fisherman");
   public static final ala<cfl> g = a("fletcher");
   public static final ala<cfl> h = a("leatherworker");
   public static final ala<cfl> i = a("librarian");
   public static final ala<cfl> j = a("mason");
   public static final ala<cfl> k = a("shepherd");
   public static final ala<cfl> l = a("toolsmith");
   public static final ala<cfl> m = a("weaponsmith");
   public static final ala<cfl> n = a("home");
   public static final ala<cfl> o = a("meeting");
   public static final ala<cfl> p = a("beehive");
   public static final ala<cfl> q = a("bee_nest");
   public static final ala<cfl> r = a("nether_portal");
   public static final ala<cfl> s = a("lodestone");
   public static final ala<cfl> t = a("lightning_rod");
   private static final Set<dua> u = ImmutableList.of(
         dgx.bn, dgx.bo, dgx.bk, dgx.bl, dgx.bi, dgx.bg, dgx.bm, dgx.bc, dgx.bh, dgx.be, dgx.bb, dgx.ba, new dgv[]{dgx.bf, dgx.bj, dgx.aZ, dgx.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dgo.b) == dun.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dua> v = ImmutableList.of(dgx.ft, dgx.fv, dgx.fu, dgx.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dua, jn<cfl>> w = Maps.newHashMap();

   private static Set<dua> a(dgv $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ala<cfl> a(String $$0) {
      return ala.a(lv.aa, alb.b($$0));
   }

   private static cfl a(ka<cfl> $$0, ala<cfl> $$1, Set<dua> $$2, int $$3, int $$4) {
      cfl $$5 = new cfl($$2, $$3, $$4);
      ka.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jn<cfl> $$0, Set<dua> $$1) {
      $$1.forEach($$1x -> {
         jn<cfl> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jn<cfl>> a(dua $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dua $$0) {
      return w.containsKey($$0);
   }

   public static cfl a(ka<cfl> $$0) {
      a($$0, a, a(dgx.nW), 1, 1);
      a($$0, b, a(dgx.nV), 1, 1);
      a($$0, c, a(dgx.nX), 1, 1);
      a($$0, d, a(dgx.fs), 1, 1);
      a($$0, e, a(dgx.pc), 1, 1);
      a($$0, f, a(dgx.nU), 1, 1);
      a($$0, g, a(dgx.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dgx.oa), 1, 1);
      a($$0, j, a(dgx.oc), 1, 1);
      a($$0, k, a(dgx.nT), 1, 1);
      a($$0, l, a(dgx.ob), 1, 1);
      a($$0, m, a(dgx.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dgx.od), 32, 6);
      a($$0, p, a(dgx.pf), 0, 1);
      a($$0, q, a(dgx.pe), 0, 1);
      a($$0, r, a(dgx.ed), 0, 1);
      a($$0, s, a(dgx.pq), 0, 1);
      return a($$0, t, a(dgx.ss), 0, 1);
   }
}
