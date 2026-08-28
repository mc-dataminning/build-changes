import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class chx {
   public static final alc<chw> a = a("armorer");
   public static final alc<chw> b = a("butcher");
   public static final alc<chw> c = a("cartographer");
   public static final alc<chw> d = a("cleric");
   public static final alc<chw> e = a("farmer");
   public static final alc<chw> f = a("fisherman");
   public static final alc<chw> g = a("fletcher");
   public static final alc<chw> h = a("leatherworker");
   public static final alc<chw> i = a("librarian");
   public static final alc<chw> j = a("mason");
   public static final alc<chw> k = a("shepherd");
   public static final alc<chw> l = a("toolsmith");
   public static final alc<chw> m = a("weaponsmith");
   public static final alc<chw> n = a("home");
   public static final alc<chw> o = a("meeting");
   public static final alc<chw> p = a("beehive");
   public static final alc<chw> q = a("bee_nest");
   public static final alc<chw> r = a("nether_portal");
   public static final alc<chw> s = a("lodestone");
   public static final alc<chw> t = a("lightning_rod");
   private static final Set<dym> u = ImmutableList.of(
         dkw.bu, dkw.bv, dkw.br, dkw.bs, dkw.bp, dkw.bn, dkw.bt, dkw.bj, dkw.bo, dkw.bl, dkw.bi, dkw.bh, new dku[]{dkw.bm, dkw.bq, dkw.bg, dkw.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dkn.b) == dyz.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dym> v = ImmutableList.of(dkw.fO, dkw.fQ, dkw.fP, dkw.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dym, js<chw>> w = Maps.newHashMap();

   private static Set<dym> a(dku $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alc<chw> a(String $$0) {
      return alc.a(me.aa, ald.b($$0));
   }

   private static chw a(kf<chw> $$0, alc<chw> $$1, Set<dym> $$2, int $$3, int $$4) {
      chw $$5 = new chw($$2, $$3, $$4);
      kf.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(js<chw> $$0, Set<dym> $$1) {
      $$1.forEach($$1x -> {
         js<chw> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<js<chw>> a(dym $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dym $$0) {
      return w.containsKey($$0);
   }

   public static chw a(kf<chw> $$0) {
      a($$0, a, a(dkw.oy), 1, 1);
      a($$0, b, a(dkw.ox), 1, 1);
      a($$0, c, a(dkw.oz), 1, 1);
      a($$0, d, a(dkw.fN), 1, 1);
      a($$0, e, a(dkw.pG), 1, 1);
      a($$0, f, a(dkw.ow), 1, 1);
      a($$0, g, a(dkw.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dkw.oC), 1, 1);
      a($$0, j, a(dkw.oE), 1, 1);
      a($$0, k, a(dkw.ov), 1, 1);
      a($$0, l, a(dkw.oD), 1, 1);
      a($$0, m, a(dkw.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dkw.oF), 32, 6);
      a($$0, p, a(dkw.pJ), 0, 1);
      a($$0, q, a(dkw.pI), 0, 1);
      a($$0, r, a(dkw.eq), 0, 1);
      a($$0, s, a(dkw.pU), 0, 1);
      return a($$0, t, a(dkw.sW), 0, 1);
   }
}
