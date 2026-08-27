import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bvm {
   public static final afv<bvl> a = a("armorer");
   public static final afv<bvl> b = a("butcher");
   public static final afv<bvl> c = a("cartographer");
   public static final afv<bvl> d = a("cleric");
   public static final afv<bvl> e = a("farmer");
   public static final afv<bvl> f = a("fisherman");
   public static final afv<bvl> g = a("fletcher");
   public static final afv<bvl> h = a("leatherworker");
   public static final afv<bvl> i = a("librarian");
   public static final afv<bvl> j = a("mason");
   public static final afv<bvl> k = a("shepherd");
   public static final afv<bvl> l = a("toolsmith");
   public static final afv<bvl> m = a("weaponsmith");
   public static final afv<bvl> n = a("home");
   public static final afv<bvl> o = a("meeting");
   public static final afv<bvl> p = a("beehive");
   public static final afv<bvl> q = a("bee_nest");
   public static final afv<bvl> r = a("nether_portal");
   public static final afv<bvl> s = a("lodestone");
   public static final afv<bvl> t = a("lightning_rod");
   private static final Set<dgb> u = ImmutableList.of(
         cuc.bn, cuc.bo, cuc.bk, cuc.bl, cuc.bi, cuc.bg, cuc.bm, cuc.bc, cuc.bh, cuc.be, cuc.bb, cuc.ba, new cua[]{cuc.bf, cuc.bj, cuc.aZ, cuc.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(ctt.b) == dgo.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dgb> v = ImmutableList.of(cuc.ft, cuc.fv, cuc.fu, cuc.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dgb, ib<bvl>> w = Maps.newHashMap();

   private static Set<dgb> a(cua $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static afv<bvl> a(String $$0) {
      return afv.a(jz.T, new afw($$0));
   }

   private static bvl a(io<bvl> $$0, afv<bvl> $$1, Set<dgb> $$2, int $$3, int $$4) {
      bvl $$5 = new bvl($$2, $$3, $$4);
      io.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ib<bvl> $$0, Set<dgb> $$1) {
      $$1.forEach($$1x -> {
         ib<bvl> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ib<bvl>> a(dgb $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dgb $$0) {
      return w.containsKey($$0);
   }

   public static bvl a(io<bvl> $$0) {
      a($$0, a, a(cuc.nW), 1, 1);
      a($$0, b, a(cuc.nV), 1, 1);
      a($$0, c, a(cuc.nX), 1, 1);
      a($$0, d, a(cuc.fs), 1, 1);
      a($$0, e, a(cuc.pc), 1, 1);
      a($$0, f, a(cuc.nU), 1, 1);
      a($$0, g, a(cuc.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cuc.oa), 1, 1);
      a($$0, j, a(cuc.oc), 1, 1);
      a($$0, k, a(cuc.nT), 1, 1);
      a($$0, l, a(cuc.ob), 1, 1);
      a($$0, m, a(cuc.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cuc.od), 32, 6);
      a($$0, p, a(cuc.pf), 0, 1);
      a($$0, q, a(cuc.pe), 0, 1);
      a($$0, r, a(cuc.ed), 0, 1);
      a($$0, s, a(cuc.pq), 0, 1);
      return a($$0, t, a(cuc.rr), 0, 1);
   }
}
