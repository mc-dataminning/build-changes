import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cca {
   public static final aju<cbz> a = a("armorer");
   public static final aju<cbz> b = a("butcher");
   public static final aju<cbz> c = a("cartographer");
   public static final aju<cbz> d = a("cleric");
   public static final aju<cbz> e = a("farmer");
   public static final aju<cbz> f = a("fisherman");
   public static final aju<cbz> g = a("fletcher");
   public static final aju<cbz> h = a("leatherworker");
   public static final aju<cbz> i = a("librarian");
   public static final aju<cbz> j = a("mason");
   public static final aju<cbz> k = a("shepherd");
   public static final aju<cbz> l = a("toolsmith");
   public static final aju<cbz> m = a("weaponsmith");
   public static final aju<cbz> n = a("home");
   public static final aju<cbz> o = a("meeting");
   public static final aju<cbz> p = a("beehive");
   public static final aju<cbz> q = a("bee_nest");
   public static final aju<cbz> r = a("nether_portal");
   public static final aju<cbz> s = a("lodestone");
   public static final aju<cbz> t = a("lightning_rod");
   private static final Set<dpi> u = ImmutableList.of(
         dcj.bn, dcj.bo, dcj.bk, dcj.bl, dcj.bi, dcj.bg, dcj.bm, dcj.bc, dcj.bh, dcj.be, dcj.bb, dcj.ba, new dch[]{dcj.bf, dcj.bj, dcj.aZ, dcj.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dca.b) == dpv.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dpi> v = ImmutableList.of(dcj.ft, dcj.fv, dcj.fu, dcj.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dpi, in<cbz>> w = Maps.newHashMap();

   private static Set<dpi> a(dch $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aju<cbz> a(String $$0) {
      return aju.a(ku.V, new ajv($$0));
   }

   private static cbz a(ja<cbz> $$0, aju<cbz> $$1, Set<dpi> $$2, int $$3, int $$4) {
      cbz $$5 = new cbz($$2, $$3, $$4);
      ja.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(in<cbz> $$0, Set<dpi> $$1) {
      $$1.forEach($$1x -> {
         in<cbz> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<in<cbz>> a(dpi $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dpi $$0) {
      return w.containsKey($$0);
   }

   public static cbz a(ja<cbz> $$0) {
      a($$0, a, a(dcj.nW), 1, 1);
      a($$0, b, a(dcj.nV), 1, 1);
      a($$0, c, a(dcj.nX), 1, 1);
      a($$0, d, a(dcj.fs), 1, 1);
      a($$0, e, a(dcj.pc), 1, 1);
      a($$0, f, a(dcj.nU), 1, 1);
      a($$0, g, a(dcj.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dcj.oa), 1, 1);
      a($$0, j, a(dcj.oc), 1, 1);
      a($$0, k, a(dcj.nT), 1, 1);
      a($$0, l, a(dcj.ob), 1, 1);
      a($$0, m, a(dcj.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dcj.od), 32, 6);
      a($$0, p, a(dcj.pf), 0, 1);
      a($$0, q, a(dcj.pe), 0, 1);
      a($$0, r, a(dcj.ed), 0, 1);
      a($$0, s, a(dcj.pq), 0, 1);
      return a($$0, t, a(dcj.ss), 0, 1);
   }
}
