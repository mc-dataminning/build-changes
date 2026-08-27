import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cbv {
   public static final ajs<cbu> a = a("armorer");
   public static final ajs<cbu> b = a("butcher");
   public static final ajs<cbu> c = a("cartographer");
   public static final ajs<cbu> d = a("cleric");
   public static final ajs<cbu> e = a("farmer");
   public static final ajs<cbu> f = a("fisherman");
   public static final ajs<cbu> g = a("fletcher");
   public static final ajs<cbu> h = a("leatherworker");
   public static final ajs<cbu> i = a("librarian");
   public static final ajs<cbu> j = a("mason");
   public static final ajs<cbu> k = a("shepherd");
   public static final ajs<cbu> l = a("toolsmith");
   public static final ajs<cbu> m = a("weaponsmith");
   public static final ajs<cbu> n = a("home");
   public static final ajs<cbu> o = a("meeting");
   public static final ajs<cbu> p = a("beehive");
   public static final ajs<cbu> q = a("bee_nest");
   public static final ajs<cbu> r = a("nether_portal");
   public static final ajs<cbu> s = a("lodestone");
   public static final ajs<cbu> t = a("lightning_rod");
   private static final Set<doz> u = ImmutableList.of(
         dca.bn, dca.bo, dca.bk, dca.bl, dca.bi, dca.bg, dca.bm, dca.bc, dca.bh, dca.be, dca.bb, dca.ba, new dby[]{dca.bf, dca.bj, dca.aZ, dca.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dbr.b) == dpm.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<doz> v = ImmutableList.of(dca.ft, dca.fv, dca.fu, dca.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<doz, il<cbu>> w = Maps.newHashMap();

   private static Set<doz> a(dby $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ajs<cbu> a(String $$0) {
      return ajs.a(ks.U, new ajt($$0));
   }

   private static cbu a(iy<cbu> $$0, ajs<cbu> $$1, Set<doz> $$2, int $$3, int $$4) {
      cbu $$5 = new cbu($$2, $$3, $$4);
      iy.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(il<cbu> $$0, Set<doz> $$1) {
      $$1.forEach($$1x -> {
         il<cbu> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<il<cbu>> a(doz $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(doz $$0) {
      return w.containsKey($$0);
   }

   public static cbu a(iy<cbu> $$0) {
      a($$0, a, a(dca.nW), 1, 1);
      a($$0, b, a(dca.nV), 1, 1);
      a($$0, c, a(dca.nX), 1, 1);
      a($$0, d, a(dca.fs), 1, 1);
      a($$0, e, a(dca.pc), 1, 1);
      a($$0, f, a(dca.nU), 1, 1);
      a($$0, g, a(dca.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dca.oa), 1, 1);
      a($$0, j, a(dca.oc), 1, 1);
      a($$0, k, a(dca.nT), 1, 1);
      a($$0, l, a(dca.ob), 1, 1);
      a($$0, m, a(dca.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dca.od), 32, 6);
      a($$0, p, a(dca.pf), 0, 1);
      a($$0, q, a(dca.pe), 0, 1);
      a($$0, r, a(dca.ed), 0, 1);
      a($$0, s, a(dca.pq), 0, 1);
      return a($$0, t, a(dca.ss), 0, 1);
   }
}
