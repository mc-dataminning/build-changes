import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cip {
   public static final alf<cio> a = a("armorer");
   public static final alf<cio> b = a("butcher");
   public static final alf<cio> c = a("cartographer");
   public static final alf<cio> d = a("cleric");
   public static final alf<cio> e = a("farmer");
   public static final alf<cio> f = a("fisherman");
   public static final alf<cio> g = a("fletcher");
   public static final alf<cio> h = a("leatherworker");
   public static final alf<cio> i = a("librarian");
   public static final alf<cio> j = a("mason");
   public static final alf<cio> k = a("shepherd");
   public static final alf<cio> l = a("toolsmith");
   public static final alf<cio> m = a("weaponsmith");
   public static final alf<cio> n = a("home");
   public static final alf<cio> o = a("meeting");
   public static final alf<cio> p = a("beehive");
   public static final alf<cio> q = a("bee_nest");
   public static final alf<cio> r = a("nether_portal");
   public static final alf<cio> s = a("lodestone");
   public static final alf<cio> t = a("lightning_rod");
   private static final Set<eat> u = ImmutableList.of(
         dmt.bu, dmt.bv, dmt.br, dmt.bs, dmt.bp, dmt.bn, dmt.bt, dmt.bj, dmt.bo, dmt.bl, dmt.bi, dmt.bh, new dmr[]{dmt.bm, dmt.bq, dmt.bg, dmt.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dmk.b) == ebg.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<eat> v = ImmutableList.of(dmt.fS, dmt.fU, dmt.fT, dmt.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<eat, jf<cio>> w = Maps.newHashMap();

   private static Set<eat> a(dmr $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alf<cio> a(String $$0) {
      return alf.a(mh.aa, alg.b($$0));
   }

   private static cio a(js<cio> $$0, alf<cio> $$1, Set<eat> $$2, int $$3, int $$4) {
      cio $$5 = new cio($$2, $$3, $$4);
      js.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jf<cio> $$0, Set<eat> $$1) {
      $$1.forEach($$1x -> {
         jf<cio> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ag.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jf<cio>> a(eat $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(eat $$0) {
      return w.containsKey($$0);
   }

   public static cio a(js<cio> $$0) {
      a($$0, a, a(dmt.oC), 1, 1);
      a($$0, b, a(dmt.oB), 1, 1);
      a($$0, c, a(dmt.oD), 1, 1);
      a($$0, d, a(dmt.fR), 1, 1);
      a($$0, e, a(dmt.pK), 1, 1);
      a($$0, f, a(dmt.oA), 1, 1);
      a($$0, g, a(dmt.oE), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dmt.oG), 1, 1);
      a($$0, j, a(dmt.oI), 1, 1);
      a($$0, k, a(dmt.oz), 1, 1);
      a($$0, l, a(dmt.oH), 1, 1);
      a($$0, m, a(dmt.oF), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dmt.oJ), 32, 6);
      a($$0, p, a(dmt.pN), 0, 1);
      a($$0, q, a(dmt.pM), 0, 1);
      a($$0, r, a(dmt.eu), 0, 1);
      a($$0, s, a(dmt.pY), 0, 1);
      return a($$0, t, a(dmt.ta), 0, 1);
   }
}
