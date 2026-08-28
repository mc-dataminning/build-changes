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
   private static final Set<eao> u = ImmutableList.of(
         dmo.bu, dmo.bv, dmo.br, dmo.bs, dmo.bp, dmo.bn, dmo.bt, dmo.bj, dmo.bo, dmo.bl, dmo.bi, dmo.bh, new dmm[]{dmo.bm, dmo.bq, dmo.bg, dmo.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dmf.b) == ebb.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<eao> v = ImmutableList.of(dmo.fS, dmo.fU, dmo.fT, dmo.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<eao, jf<cio>> w = Maps.newHashMap();

   private static Set<eao> a(dmm $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alf<cio> a(String $$0) {
      return alf.a(mh.aa, alg.b($$0));
   }

   private static cio a(js<cio> $$0, alf<cio> $$1, Set<eao> $$2, int $$3, int $$4) {
      cio $$5 = new cio($$2, $$3, $$4);
      js.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jf<cio> $$0, Set<eao> $$1) {
      $$1.forEach($$1x -> {
         jf<cio> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ag.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jf<cio>> a(eao $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(eao $$0) {
      return w.containsKey($$0);
   }

   public static cio a(js<cio> $$0) {
      a($$0, a, a(dmo.oC), 1, 1);
      a($$0, b, a(dmo.oB), 1, 1);
      a($$0, c, a(dmo.oD), 1, 1);
      a($$0, d, a(dmo.fR), 1, 1);
      a($$0, e, a(dmo.pK), 1, 1);
      a($$0, f, a(dmo.oA), 1, 1);
      a($$0, g, a(dmo.oE), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dmo.oG), 1, 1);
      a($$0, j, a(dmo.oI), 1, 1);
      a($$0, k, a(dmo.oz), 1, 1);
      a($$0, l, a(dmo.oH), 1, 1);
      a($$0, m, a(dmo.oF), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dmo.oJ), 32, 6);
      a($$0, p, a(dmo.pN), 0, 1);
      a($$0, q, a(dmo.pM), 0, 1);
      a($$0, r, a(dmo.eu), 0, 1);
      a($$0, s, a(dmo.pY), 0, 1);
      return a($$0, t, a(dmo.ta), 0, 1);
   }
}
