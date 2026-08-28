import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ces {
   public static final ala<cer> a = a("armorer");
   public static final ala<cer> b = a("butcher");
   public static final ala<cer> c = a("cartographer");
   public static final ala<cer> d = a("cleric");
   public static final ala<cer> e = a("farmer");
   public static final ala<cer> f = a("fisherman");
   public static final ala<cer> g = a("fletcher");
   public static final ala<cer> h = a("leatherworker");
   public static final ala<cer> i = a("librarian");
   public static final ala<cer> j = a("mason");
   public static final ala<cer> k = a("shepherd");
   public static final ala<cer> l = a("toolsmith");
   public static final ala<cer> m = a("weaponsmith");
   public static final ala<cer> n = a("home");
   public static final ala<cer> o = a("meeting");
   public static final ala<cer> p = a("beehive");
   public static final ala<cer> q = a("bee_nest");
   public static final ala<cer> r = a("nether_portal");
   public static final ala<cer> s = a("lodestone");
   public static final ala<cer> t = a("lightning_rod");
   private static final Set<drx> u = ImmutableList.of(
         dew.bn, dew.bo, dew.bk, dew.bl, dew.bi, dew.bg, dew.bm, dew.bc, dew.bh, dew.be, dew.bb, dew.ba, new deu[]{dew.bf, dew.bj, dew.aZ, dew.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(den.b) == dsk.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<drx> v = ImmutableList.of(dew.ft, dew.fv, dew.fu, dew.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<drx, ji<cer>> w = Maps.newHashMap();

   private static Set<drx> a(deu $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ala<cer> a(String $$0) {
      return ala.a(lq.V, new alb($$0));
   }

   private static cer a(jv<cer> $$0, ala<cer> $$1, Set<drx> $$2, int $$3, int $$4) {
      cer $$5 = new cer($$2, $$3, $$4);
      jv.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ji<cer> $$0, Set<drx> $$1) {
      $$1.forEach($$1x -> {
         ji<cer> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ji<cer>> a(drx $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(drx $$0) {
      return w.containsKey($$0);
   }

   public static cer a(jv<cer> $$0) {
      a($$0, a, a(dew.nW), 1, 1);
      a($$0, b, a(dew.nV), 1, 1);
      a($$0, c, a(dew.nX), 1, 1);
      a($$0, d, a(dew.fs), 1, 1);
      a($$0, e, a(dew.pc), 1, 1);
      a($$0, f, a(dew.nU), 1, 1);
      a($$0, g, a(dew.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dew.oa), 1, 1);
      a($$0, j, a(dew.oc), 1, 1);
      a($$0, k, a(dew.nT), 1, 1);
      a($$0, l, a(dew.ob), 1, 1);
      a($$0, m, a(dew.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dew.od), 32, 6);
      a($$0, p, a(dew.pf), 0, 1);
      a($$0, q, a(dew.pe), 0, 1);
      a($$0, r, a(dew.ed), 0, 1);
      a($$0, s, a(dew.pq), 0, 1);
      return a($$0, t, a(dew.ss), 0, 1);
   }
}
