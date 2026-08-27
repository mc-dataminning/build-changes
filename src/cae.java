import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cae {
   public static final ajb<cad> a = a("armorer");
   public static final ajb<cad> b = a("butcher");
   public static final ajb<cad> c = a("cartographer");
   public static final ajb<cad> d = a("cleric");
   public static final ajb<cad> e = a("farmer");
   public static final ajb<cad> f = a("fisherman");
   public static final ajb<cad> g = a("fletcher");
   public static final ajb<cad> h = a("leatherworker");
   public static final ajb<cad> i = a("librarian");
   public static final ajb<cad> j = a("mason");
   public static final ajb<cad> k = a("shepherd");
   public static final ajb<cad> l = a("toolsmith");
   public static final ajb<cad> m = a("weaponsmith");
   public static final ajb<cad> n = a("home");
   public static final ajb<cad> o = a("meeting");
   public static final ajb<cad> p = a("beehive");
   public static final ajb<cad> q = a("bee_nest");
   public static final ajb<cad> r = a("nether_portal");
   public static final ajb<cad> s = a("lodestone");
   public static final ajb<cad> t = a("lightning_rod");
   private static final Set<dme> u = ImmutableList.of(
         czh.bn, czh.bo, czh.bk, czh.bl, czh.bi, czh.bg, czh.bm, czh.bc, czh.bh, czh.be, czh.bb, czh.ba, new czf[]{czh.bf, czh.bj, czh.aZ, czh.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cyy.b) == dmr.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dme> v = ImmutableList.of(czh.ft, czh.fv, czh.fu, czh.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dme, il<cad>> w = Maps.newHashMap();

   private static Set<dme> a(czf $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static ajb<cad> a(String $$0) {
      return ajb.a(ki.U, new ajc($$0));
   }

   private static cad a(ix<cad> $$0, ajb<cad> $$1, Set<dme> $$2, int $$3, int $$4) {
      cad $$5 = new cad($$2, $$3, $$4);
      ix.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(il<cad> $$0, Set<dme> $$1) {
      $$1.forEach($$1x -> {
         il<cad> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<il<cad>> a(dme $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dme $$0) {
      return w.containsKey($$0);
   }

   public static cad a(ix<cad> $$0) {
      a($$0, a, a(czh.nW), 1, 1);
      a($$0, b, a(czh.nV), 1, 1);
      a($$0, c, a(czh.nX), 1, 1);
      a($$0, d, a(czh.fs), 1, 1);
      a($$0, e, a(czh.pc), 1, 1);
      a($$0, f, a(czh.nU), 1, 1);
      a($$0, g, a(czh.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(czh.oa), 1, 1);
      a($$0, j, a(czh.oc), 1, 1);
      a($$0, k, a(czh.nT), 1, 1);
      a($$0, l, a(czh.ob), 1, 1);
      a($$0, m, a(czh.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(czh.od), 32, 6);
      a($$0, p, a(czh.pf), 0, 1);
      a($$0, q, a(czh.pe), 0, 1);
      a($$0, r, a(czh.ed), 0, 1);
      a($$0, s, a(czh.pq), 0, 1);
      return a($$0, t, a(czh.ss), 0, 1);
   }
}
