import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class caw {
   public static final ajg<cav> a = a("armorer");
   public static final ajg<cav> b = a("butcher");
   public static final ajg<cav> c = a("cartographer");
   public static final ajg<cav> d = a("cleric");
   public static final ajg<cav> e = a("farmer");
   public static final ajg<cav> f = a("fisherman");
   public static final ajg<cav> g = a("fletcher");
   public static final ajg<cav> h = a("leatherworker");
   public static final ajg<cav> i = a("librarian");
   public static final ajg<cav> j = a("mason");
   public static final ajg<cav> k = a("shepherd");
   public static final ajg<cav> l = a("toolsmith");
   public static final ajg<cav> m = a("weaponsmith");
   public static final ajg<cav> n = a("home");
   public static final ajg<cav> o = a("meeting");
   public static final ajg<cav> p = a("beehive");
   public static final ajg<cav> q = a("bee_nest");
   public static final ajg<cav> r = a("nether_portal");
   public static final ajg<cav> s = a("lodestone");
   public static final ajg<cav> t = a("lightning_rod");
   private static final Set<dnb> u = ImmutableList.of(
         dae.bn, dae.bo, dae.bk, dae.bl, dae.bi, dae.bg, dae.bm, dae.bc, dae.bh, dae.be, dae.bb, dae.ba, new dac[]{dae.bf, dae.bj, dae.aZ, dae.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(czv.b) == dno.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dnb> v = ImmutableList.of(dae.ft, dae.fv, dae.fu, dae.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dnb, il<cav>> w = Maps.newHashMap();

   private static Set<dnb> a(dac $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ajg<cav> a(String $$0) {
      return ajg.a(kj.U, new ajh($$0));
   }

   private static cav a(iy<cav> $$0, ajg<cav> $$1, Set<dnb> $$2, int $$3, int $$4) {
      cav $$5 = new cav($$2, $$3, $$4);
      iy.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(il<cav> $$0, Set<dnb> $$1) {
      $$1.forEach($$1x -> {
         il<cav> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<il<cav>> a(dnb $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dnb $$0) {
      return w.containsKey($$0);
   }

   public static cav a(iy<cav> $$0) {
      a($$0, a, a(dae.nW), 1, 1);
      a($$0, b, a(dae.nV), 1, 1);
      a($$0, c, a(dae.nX), 1, 1);
      a($$0, d, a(dae.fs), 1, 1);
      a($$0, e, a(dae.pc), 1, 1);
      a($$0, f, a(dae.nU), 1, 1);
      a($$0, g, a(dae.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dae.oa), 1, 1);
      a($$0, j, a(dae.oc), 1, 1);
      a($$0, k, a(dae.nT), 1, 1);
      a($$0, l, a(dae.ob), 1, 1);
      a($$0, m, a(dae.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dae.od), 32, 6);
      a($$0, p, a(dae.pf), 0, 1);
      a($$0, q, a(dae.pe), 0, 1);
      a($$0, r, a(dae.ed), 0, 1);
      a($$0, s, a(dae.pq), 0, 1);
      return a($$0, t, a(dae.ss), 0, 1);
   }
}
