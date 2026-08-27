import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bua {
   public static final aeo<btz> a = a("armorer");
   public static final aeo<btz> b = a("butcher");
   public static final aeo<btz> c = a("cartographer");
   public static final aeo<btz> d = a("cleric");
   public static final aeo<btz> e = a("farmer");
   public static final aeo<btz> f = a("fisherman");
   public static final aeo<btz> g = a("fletcher");
   public static final aeo<btz> h = a("leatherworker");
   public static final aeo<btz> i = a("librarian");
   public static final aeo<btz> j = a("mason");
   public static final aeo<btz> k = a("shepherd");
   public static final aeo<btz> l = a("toolsmith");
   public static final aeo<btz> m = a("weaponsmith");
   public static final aeo<btz> n = a("home");
   public static final aeo<btz> o = a("meeting");
   public static final aeo<btz> p = a("beehive");
   public static final aeo<btz> q = a("bee_nest");
   public static final aeo<btz> r = a("nether_portal");
   public static final aeo<btz> s = a("lodestone");
   public static final aeo<btz> t = a("lightning_rod");
   private static final Set<dey> u = ImmutableList.of(
         csl.bn, csl.bo, csl.bk, csl.bl, csl.bi, csl.bg, csl.bm, csl.bc, csl.bh, csl.be, csl.bb, csl.ba, new csk[]{csl.bf, csl.bj, csl.aZ, csl.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(csd.a) == dfl.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dey> v = ImmutableList.of(csl.ft, csl.fv, csl.fu, csl.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dey, hf<btz>> w = Maps.newHashMap();

   private static Set<dey> a(csk $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aeo<btz> a(String $$0) {
      return aeo.a(jd.S, new aep($$0));
   }

   private static btz a(hs<btz> $$0, aeo<btz> $$1, Set<dey> $$2, int $$3, int $$4) {
      btz $$5 = new btz($$2, $$3, $$4);
      hs.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(hf<btz> $$0, Set<dey> $$1) {
      $$1.forEach($$1x -> {
         hf<btz> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<hf<btz>> a(dey $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dey $$0) {
      return w.containsKey($$0);
   }

   public static btz a(hs<btz> $$0) {
      a($$0, a, a(csl.nW), 1, 1);
      a($$0, b, a(csl.nV), 1, 1);
      a($$0, c, a(csl.nX), 1, 1);
      a($$0, d, a(csl.fs), 1, 1);
      a($$0, e, a(csl.pc), 1, 1);
      a($$0, f, a(csl.nU), 1, 1);
      a($$0, g, a(csl.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(csl.oa), 1, 1);
      a($$0, j, a(csl.oc), 1, 1);
      a($$0, k, a(csl.nT), 1, 1);
      a($$0, l, a(csl.ob), 1, 1);
      a($$0, m, a(csl.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(csl.od), 32, 6);
      a($$0, p, a(csl.pf), 0, 1);
      a($$0, q, a(csl.pe), 0, 1);
      a($$0, r, a(csl.ee), 0, 1);
      a($$0, s, a(csl.pq), 0, 1);
      return a($$0, t, a(csl.rr), 0, 1);
   }
}
