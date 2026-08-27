import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ccl {
   public static final ake<cck> a = a("armorer");
   public static final ake<cck> b = a("butcher");
   public static final ake<cck> c = a("cartographer");
   public static final ake<cck> d = a("cleric");
   public static final ake<cck> e = a("farmer");
   public static final ake<cck> f = a("fisherman");
   public static final ake<cck> g = a("fletcher");
   public static final ake<cck> h = a("leatherworker");
   public static final ake<cck> i = a("librarian");
   public static final ake<cck> j = a("mason");
   public static final ake<cck> k = a("shepherd");
   public static final ake<cck> l = a("toolsmith");
   public static final ake<cck> m = a("weaponsmith");
   public static final ake<cck> n = a("home");
   public static final ake<cck> o = a("meeting");
   public static final ake<cck> p = a("beehive");
   public static final ake<cck> q = a("bee_nest");
   public static final ake<cck> r = a("nether_portal");
   public static final ake<cck> s = a("lodestone");
   public static final ake<cck> t = a("lightning_rod");
   private static final Set<dpy> u = ImmutableList.of(
         dcx.bn, dcx.bo, dcx.bk, dcx.bl, dcx.bi, dcx.bg, dcx.bm, dcx.bc, dcx.bh, dcx.be, dcx.bb, dcx.ba, new dcv[]{dcx.bf, dcx.bj, dcx.aZ, dcx.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dco.b) == dql.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dpy> v = ImmutableList.of(dcx.ft, dcx.fv, dcx.fu, dcx.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dpy, iv<cck>> w = Maps.newHashMap();

   private static Set<dpy> a(dcv $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ake<cck> a(String $$0) {
      return ake.a(ld.V, new akf($$0));
   }

   private static cck a(ji<cck> $$0, ake<cck> $$1, Set<dpy> $$2, int $$3, int $$4) {
      cck $$5 = new cck($$2, $$3, $$4);
      ji.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(iv<cck> $$0, Set<dpy> $$1) {
      $$1.forEach($$1x -> {
         iv<cck> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<iv<cck>> a(dpy $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dpy $$0) {
      return w.containsKey($$0);
   }

   public static cck a(ji<cck> $$0) {
      a($$0, a, a(dcx.nW), 1, 1);
      a($$0, b, a(dcx.nV), 1, 1);
      a($$0, c, a(dcx.nX), 1, 1);
      a($$0, d, a(dcx.fs), 1, 1);
      a($$0, e, a(dcx.pc), 1, 1);
      a($$0, f, a(dcx.nU), 1, 1);
      a($$0, g, a(dcx.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dcx.oa), 1, 1);
      a($$0, j, a(dcx.oc), 1, 1);
      a($$0, k, a(dcx.nT), 1, 1);
      a($$0, l, a(dcx.ob), 1, 1);
      a($$0, m, a(dcx.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dcx.od), 32, 6);
      a($$0, p, a(dcx.pf), 0, 1);
      a($$0, q, a(dcx.pe), 0, 1);
      a($$0, r, a(dcx.ed), 0, 1);
      a($$0, s, a(dcx.pq), 0, 1);
      return a($$0, t, a(dcx.ss), 0, 1);
   }
}
