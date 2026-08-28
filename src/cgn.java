import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgn {
   public static final akt<cgm> a = a("armorer");
   public static final akt<cgm> b = a("butcher");
   public static final akt<cgm> c = a("cartographer");
   public static final akt<cgm> d = a("cleric");
   public static final akt<cgm> e = a("farmer");
   public static final akt<cgm> f = a("fisherman");
   public static final akt<cgm> g = a("fletcher");
   public static final akt<cgm> h = a("leatherworker");
   public static final akt<cgm> i = a("librarian");
   public static final akt<cgm> j = a("mason");
   public static final akt<cgm> k = a("shepherd");
   public static final akt<cgm> l = a("toolsmith");
   public static final akt<cgm> m = a("weaponsmith");
   public static final akt<cgm> n = a("home");
   public static final akt<cgm> o = a("meeting");
   public static final akt<cgm> p = a("beehive");
   public static final akt<cgm> q = a("bee_nest");
   public static final akt<cgm> r = a("nether_portal");
   public static final akt<cgm> s = a("lodestone");
   public static final akt<cgm> t = a("lightning_rod");
   private static final Set<dwv> u = ImmutableList.of(
         djm.bu, djm.bv, djm.br, djm.bs, djm.bp, djm.bn, djm.bt, djm.bj, djm.bo, djm.bl, djm.bi, djm.bh, new djk[]{djm.bm, djm.bq, djm.bg, djm.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(djd.b) == dxi.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dwv> v = ImmutableList.of(djm.fO, djm.fQ, djm.fP, djm.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dwv, jr<cgm>> w = Maps.newHashMap();

   private static Set<dwv> a(djk $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akt<cgm> a(String $$0) {
      return akt.a(mc.aa, aku.b($$0));
   }

   private static cgm a(ke<cgm> $$0, akt<cgm> $$1, Set<dwv> $$2, int $$3, int $$4) {
      cgm $$5 = new cgm($$2, $$3, $$4);
      ke.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jr<cgm> $$0, Set<dwv> $$1) {
      $$1.forEach($$1x -> {
         jr<cgm> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jr<cgm>> a(dwv $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dwv $$0) {
      return w.containsKey($$0);
   }

   public static cgm a(ke<cgm> $$0) {
      a($$0, a, a(djm.oy), 1, 1);
      a($$0, b, a(djm.ox), 1, 1);
      a($$0, c, a(djm.oz), 1, 1);
      a($$0, d, a(djm.fN), 1, 1);
      a($$0, e, a(djm.pE), 1, 1);
      a($$0, f, a(djm.ow), 1, 1);
      a($$0, g, a(djm.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(djm.oC), 1, 1);
      a($$0, j, a(djm.oE), 1, 1);
      a($$0, k, a(djm.ov), 1, 1);
      a($$0, l, a(djm.oD), 1, 1);
      a($$0, m, a(djm.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(djm.oF), 32, 6);
      a($$0, p, a(djm.pH), 0, 1);
      a($$0, q, a(djm.pG), 0, 1);
      a($$0, r, a(djm.eq), 0, 1);
      a($$0, s, a(djm.pS), 0, 1);
      return a($$0, t, a(djm.sU), 0, 1);
   }
}
