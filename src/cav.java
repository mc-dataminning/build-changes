import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cav {
   public static final ajg<cau> a = a("armorer");
   public static final ajg<cau> b = a("butcher");
   public static final ajg<cau> c = a("cartographer");
   public static final ajg<cau> d = a("cleric");
   public static final ajg<cau> e = a("farmer");
   public static final ajg<cau> f = a("fisherman");
   public static final ajg<cau> g = a("fletcher");
   public static final ajg<cau> h = a("leatherworker");
   public static final ajg<cau> i = a("librarian");
   public static final ajg<cau> j = a("mason");
   public static final ajg<cau> k = a("shepherd");
   public static final ajg<cau> l = a("toolsmith");
   public static final ajg<cau> m = a("weaponsmith");
   public static final ajg<cau> n = a("home");
   public static final ajg<cau> o = a("meeting");
   public static final ajg<cau> p = a("beehive");
   public static final ajg<cau> q = a("bee_nest");
   public static final ajg<cau> r = a("nether_portal");
   public static final ajg<cau> s = a("lodestone");
   public static final ajg<cau> t = a("lightning_rod");
   private static final Set<dmz> u = ImmutableList.of(
         dac.bn, dac.bo, dac.bk, dac.bl, dac.bi, dac.bg, dac.bm, dac.bc, dac.bh, dac.be, dac.bb, dac.ba, new daa[]{dac.bf, dac.bj, dac.aZ, dac.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(czt.b) == dnm.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dmz> v = ImmutableList.of(dac.ft, dac.fv, dac.fu, dac.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dmz, il<cau>> w = Maps.newHashMap();

   private static Set<dmz> a(daa $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ajg<cau> a(String $$0) {
      return ajg.a(kj.U, new ajh($$0));
   }

   private static cau a(iy<cau> $$0, ajg<cau> $$1, Set<dmz> $$2, int $$3, int $$4) {
      cau $$5 = new cau($$2, $$3, $$4);
      iy.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(il<cau> $$0, Set<dmz> $$1) {
      $$1.forEach($$1x -> {
         il<cau> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<il<cau>> a(dmz $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dmz $$0) {
      return w.containsKey($$0);
   }

   public static cau a(iy<cau> $$0) {
      a($$0, a, a(dac.nW), 1, 1);
      a($$0, b, a(dac.nV), 1, 1);
      a($$0, c, a(dac.nX), 1, 1);
      a($$0, d, a(dac.fs), 1, 1);
      a($$0, e, a(dac.pc), 1, 1);
      a($$0, f, a(dac.nU), 1, 1);
      a($$0, g, a(dac.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dac.oa), 1, 1);
      a($$0, j, a(dac.oc), 1, 1);
      a($$0, k, a(dac.nT), 1, 1);
      a($$0, l, a(dac.ob), 1, 1);
      a($$0, m, a(dac.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dac.od), 32, 6);
      a($$0, p, a(dac.pf), 0, 1);
      a($$0, q, a(dac.pe), 0, 1);
      a($$0, r, a(dac.ed), 0, 1);
      a($$0, s, a(dac.pq), 0, 1);
      return a($$0, t, a(dac.ss), 0, 1);
   }
}
