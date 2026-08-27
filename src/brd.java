import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class brd {
   public static final acp<brc> a = a("armorer");
   public static final acp<brc> b = a("butcher");
   public static final acp<brc> c = a("cartographer");
   public static final acp<brc> d = a("cleric");
   public static final acp<brc> e = a("farmer");
   public static final acp<brc> f = a("fisherman");
   public static final acp<brc> g = a("fletcher");
   public static final acp<brc> h = a("leatherworker");
   public static final acp<brc> i = a("librarian");
   public static final acp<brc> j = a("mason");
   public static final acp<brc> k = a("shepherd");
   public static final acp<brc> l = a("toolsmith");
   public static final acp<brc> m = a("weaponsmith");
   public static final acp<brc> n = a("home");
   public static final acp<brc> o = a("meeting");
   public static final acp<brc> p = a("beehive");
   public static final acp<brc> q = a("bee_nest");
   public static final acp<brc> r = a("nether_portal");
   public static final acp<brc> s = a("lodestone");
   public static final acp<brc> t = a("lightning_rod");
   private static final Set<dcb> u = ImmutableList.of(
         cpo.bn, cpo.bo, cpo.bk, cpo.bl, cpo.bi, cpo.bg, cpo.bm, cpo.bc, cpo.bh, cpo.be, cpo.bb, cpo.ba, new cpn[]{cpo.bf, cpo.bj, cpo.aZ, cpo.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(cpg.a) == dco.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dcb> v = ImmutableList.of(cpo.ft, cpo.fv, cpo.fu, cpo.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dcb, he<brc>> w = Maps.newHashMap();

   private static Set<dcb> a(cpn $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static acp<brc> a(String $$0) {
      return acp.a(jc.S, new acq($$0));
   }

   private static brc a(hr<brc> $$0, acp<brc> $$1, Set<dcb> $$2, int $$3, int $$4) {
      brc $$5 = new brc($$2, $$3, $$4);
      hr.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(he<brc> $$0, Set<dcb> $$1) {
      $$1.forEach($$1x -> {
         he<brc> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<he<brc>> a(dcb $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dcb $$0) {
      return w.containsKey($$0);
   }

   public static brc a(hr<brc> $$0) {
      a($$0, a, a(cpo.nW), 1, 1);
      a($$0, b, a(cpo.nV), 1, 1);
      a($$0, c, a(cpo.nX), 1, 1);
      a($$0, d, a(cpo.fs), 1, 1);
      a($$0, e, a(cpo.pc), 1, 1);
      a($$0, f, a(cpo.nU), 1, 1);
      a($$0, g, a(cpo.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cpo.oa), 1, 1);
      a($$0, j, a(cpo.oc), 1, 1);
      a($$0, k, a(cpo.nT), 1, 1);
      a($$0, l, a(cpo.ob), 1, 1);
      a($$0, m, a(cpo.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cpo.od), 32, 6);
      a($$0, p, a(cpo.pf), 0, 1);
      a($$0, q, a(cpo.pe), 0, 1);
      a($$0, r, a(cpo.ee), 0, 1);
      a($$0, s, a(cpo.pq), 0, 1);
      return a($$0, t, a(cpo.rr), 0, 1);
   }
}
