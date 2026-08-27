import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bwb {
   public static final agf<bwa> a = a("armorer");
   public static final agf<bwa> b = a("butcher");
   public static final agf<bwa> c = a("cartographer");
   public static final agf<bwa> d = a("cleric");
   public static final agf<bwa> e = a("farmer");
   public static final agf<bwa> f = a("fisherman");
   public static final agf<bwa> g = a("fletcher");
   public static final agf<bwa> h = a("leatherworker");
   public static final agf<bwa> i = a("librarian");
   public static final agf<bwa> j = a("mason");
   public static final agf<bwa> k = a("shepherd");
   public static final agf<bwa> l = a("toolsmith");
   public static final agf<bwa> m = a("weaponsmith");
   public static final agf<bwa> n = a("home");
   public static final agf<bwa> o = a("meeting");
   public static final agf<bwa> p = a("beehive");
   public static final agf<bwa> q = a("bee_nest");
   public static final agf<bwa> r = a("nether_portal");
   public static final agf<bwa> s = a("lodestone");
   public static final agf<bwa> t = a("lightning_rod");
   private static final Set<dgw> u = ImmutableList.of(
         cuv.bn, cuv.bo, cuv.bk, cuv.bl, cuv.bi, cuv.bg, cuv.bm, cuv.bc, cuv.bh, cuv.be, cuv.bb, cuv.ba, new cut[]{cuv.bf, cuv.bj, cuv.aZ, cuv.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .filter($$0 -> $$0.c(cum.b) == dhj.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dgw> v = ImmutableList.of(cuv.ft, cuv.fv, cuv.fu, cuv.fw)
      .stream()
      .flatMap($$0 -> $$0.n().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dgw, ib<bwa>> w = Maps.newHashMap();

   private static Set<dgw> a(cut $$0) {
      return ImmutableSet.copyOf($$0.n().a());
   }

   private static agf<bwa> a(String $$0) {
      return agf.a(jz.T, new agg($$0));
   }

   private static bwa a(io<bwa> $$0, agf<bwa> $$1, Set<dgw> $$2, int $$3, int $$4) {
      bwa $$5 = new bwa($$2, $$3, $$4);
      io.a($$0, $$1, $$5);
      a($$0.f($$1), $$2);
      return $$5;
   }

   private static void a(ib<bwa> $$0, Set<dgw> $$1) {
      $$1.forEach($$1x -> {
         ib<bwa> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ib<bwa>> a(dgw $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dgw $$0) {
      return w.containsKey($$0);
   }

   public static bwa a(io<bwa> $$0) {
      a($$0, a, a(cuv.nW), 1, 1);
      a($$0, b, a(cuv.nV), 1, 1);
      a($$0, c, a(cuv.nX), 1, 1);
      a($$0, d, a(cuv.fs), 1, 1);
      a($$0, e, a(cuv.pc), 1, 1);
      a($$0, f, a(cuv.nU), 1, 1);
      a($$0, g, a(cuv.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(cuv.oa), 1, 1);
      a($$0, j, a(cuv.oc), 1, 1);
      a($$0, k, a(cuv.nT), 1, 1);
      a($$0, l, a(cuv.ob), 1, 1);
      a($$0, m, a(cuv.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(cuv.od), 32, 6);
      a($$0, p, a(cuv.pf), 0, 1);
      a($$0, q, a(cuv.pe), 0, 1);
      a($$0, r, a(cuv.ed), 0, 1);
      a($$0, s, a(cuv.pq), 0, 1);
      return a($$0, t, a(cuv.rr), 0, 1);
   }
}
