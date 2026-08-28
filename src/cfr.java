import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cfr {
   public static final alb<cfq> a = a("armorer");
   public static final alb<cfq> b = a("butcher");
   public static final alb<cfq> c = a("cartographer");
   public static final alb<cfq> d = a("cleric");
   public static final alb<cfq> e = a("farmer");
   public static final alb<cfq> f = a("fisherman");
   public static final alb<cfq> g = a("fletcher");
   public static final alb<cfq> h = a("leatherworker");
   public static final alb<cfq> i = a("librarian");
   public static final alb<cfq> j = a("mason");
   public static final alb<cfq> k = a("shepherd");
   public static final alb<cfq> l = a("toolsmith");
   public static final alb<cfq> m = a("weaponsmith");
   public static final alb<cfq> n = a("home");
   public static final alb<cfq> o = a("meeting");
   public static final alb<cfq> p = a("beehive");
   public static final alb<cfq> q = a("bee_nest");
   public static final alb<cfq> r = a("nether_portal");
   public static final alb<cfq> s = a("lodestone");
   public static final alb<cfq> t = a("lightning_rod");
   private static final Set<duo> u = ImmutableList.of(
         dhl.bn, dhl.bo, dhl.bk, dhl.bl, dhl.bi, dhl.bg, dhl.bm, dhl.bc, dhl.bh, dhl.be, dhl.bb, dhl.ba, new dhj[]{dhl.bf, dhl.bj, dhl.aZ, dhl.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(dhc.b) == dvb.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<duo> v = ImmutableList.of(dhl.ft, dhl.fv, dhl.fu, dhl.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<duo, jn<cfq>> w = Maps.newHashMap();

   private static Set<duo> a(dhj $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static alb<cfq> a(String $$0) {
      return alb.a(lv.aa, alc.b($$0));
   }

   private static cfq a(ka<cfq> $$0, alb<cfq> $$1, Set<duo> $$2, int $$3, int $$4) {
      cfq $$5 = new cfq($$2, $$3, $$4);
      ka.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(jn<cfq> $$0, Set<duo> $$1) {
      $$1.forEach($$1x -> {
         jn<cfq> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jn<cfq>> a(duo $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(duo $$0) {
      return w.containsKey($$0);
   }

   public static cfq a(ka<cfq> $$0) {
      a($$0, a, a(dhl.nW), 1, 1);
      a($$0, b, a(dhl.nV), 1, 1);
      a($$0, c, a(dhl.nX), 1, 1);
      a($$0, d, a(dhl.fs), 1, 1);
      a($$0, e, a(dhl.pc), 1, 1);
      a($$0, f, a(dhl.nU), 1, 1);
      a($$0, g, a(dhl.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dhl.oa), 1, 1);
      a($$0, j, a(dhl.oc), 1, 1);
      a($$0, k, a(dhl.nT), 1, 1);
      a($$0, l, a(dhl.ob), 1, 1);
      a($$0, m, a(dhl.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dhl.od), 32, 6);
      a($$0, p, a(dhl.pf), 0, 1);
      a($$0, q, a(dhl.pe), 0, 1);
      a($$0, r, a(dhl.ed), 0, 1);
      a($$0, s, a(dhl.pq), 0, 1);
      return a($$0, t, a(dhl.ss), 0, 1);
   }
}
