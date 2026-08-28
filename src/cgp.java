import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgp {
   public static final ali<cgo> a = a("armorer");
   public static final ali<cgo> b = a("butcher");
   public static final ali<cgo> c = a("cartographer");
   public static final ali<cgo> d = a("cleric");
   public static final ali<cgo> e = a("farmer");
   public static final ali<cgo> f = a("fisherman");
   public static final ali<cgo> g = a("fletcher");
   public static final ali<cgo> h = a("leatherworker");
   public static final ali<cgo> i = a("librarian");
   public static final ali<cgo> j = a("mason");
   public static final ali<cgo> k = a("shepherd");
   public static final ali<cgo> l = a("toolsmith");
   public static final ali<cgo> m = a("weaponsmith");
   public static final ali<cgo> n = a("home");
   public static final ali<cgo> o = a("meeting");
   public static final ali<cgo> p = a("beehive");
   public static final ali<cgo> q = a("bee_nest");
   public static final ali<cgo> r = a("nether_portal");
   public static final ali<cgo> s = a("lodestone");
   public static final ali<cgo> t = a("lightning_rod");
   private static final Set<dvv> u = ImmutableList.of(
         dis.bn, dis.bo, dis.bk, dis.bl, dis.bi, dis.bg, dis.bm, dis.bc, dis.bh, dis.be, dis.bb, dis.ba, new diq[]{dis.bf, dis.bj, dis.aZ, dis.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dij.b) == dwi.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dvv> v = ImmutableList.of(dis.ft, dis.fv, dis.fu, dis.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dvv, jq<cgo>> w = Maps.newHashMap();

   private static Set<dvv> a(diq $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ali<cgo> a(String $$0) {
      return ali.a(ma.aa, alj.b($$0));
   }

   private static cgo a(kd<cgo> $$0, ali<cgo> $$1, Set<dvv> $$2, int $$3, int $$4) {
      cgo $$5 = new cgo($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<cgo> $$0, Set<dvv> $$1) {
      $$1.forEach($$1x -> {
         jq<cgo> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<cgo>> a(dvv $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dvv $$0) {
      return w.containsKey($$0);
   }

   public static cgo a(kd<cgo> $$0) {
      a($$0, a, a(dis.nW), 1, 1);
      a($$0, b, a(dis.nV), 1, 1);
      a($$0, c, a(dis.nX), 1, 1);
      a($$0, d, a(dis.fs), 1, 1);
      a($$0, e, a(dis.pc), 1, 1);
      a($$0, f, a(dis.nU), 1, 1);
      a($$0, g, a(dis.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dis.oa), 1, 1);
      a($$0, j, a(dis.oc), 1, 1);
      a($$0, k, a(dis.nT), 1, 1);
      a($$0, l, a(dis.ob), 1, 1);
      a($$0, m, a(dis.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dis.od), 32, 6);
      a($$0, p, a(dis.pf), 0, 1);
      a($$0, q, a(dis.pe), 0, 1);
      a($$0, r, a(dis.ed), 0, 1);
      a($$0, s, a(dis.pq), 0, 1);
      return a($$0, t, a(dis.ss), 0, 1);
   }
}
