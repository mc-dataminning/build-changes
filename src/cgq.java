import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgq {
   public static final aku<cgp> a = a("armorer");
   public static final aku<cgp> b = a("butcher");
   public static final aku<cgp> c = a("cartographer");
   public static final aku<cgp> d = a("cleric");
   public static final aku<cgp> e = a("farmer");
   public static final aku<cgp> f = a("fisherman");
   public static final aku<cgp> g = a("fletcher");
   public static final aku<cgp> h = a("leatherworker");
   public static final aku<cgp> i = a("librarian");
   public static final aku<cgp> j = a("mason");
   public static final aku<cgp> k = a("shepherd");
   public static final aku<cgp> l = a("toolsmith");
   public static final aku<cgp> m = a("weaponsmith");
   public static final aku<cgp> n = a("home");
   public static final aku<cgp> o = a("meeting");
   public static final aku<cgp> p = a("beehive");
   public static final aku<cgp> q = a("bee_nest");
   public static final aku<cgp> r = a("nether_portal");
   public static final aku<cgp> s = a("lodestone");
   public static final aku<cgp> t = a("lightning_rod");
   private static final Set<dwy> u = ImmutableList.of(
         djp.bu, djp.bv, djp.br, djp.bs, djp.bp, djp.bn, djp.bt, djp.bj, djp.bo, djp.bl, djp.bi, djp.bh, new djn[]{djp.bm, djp.bq, djp.bg, djp.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(djg.b) == dxl.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dwy> v = ImmutableList.of(djp.fO, djp.fQ, djp.fP, djp.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dwy, jr<cgp>> w = Maps.newHashMap();

   private static Set<dwy> a(djn $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aku<cgp> a(String $$0) {
      return aku.a(mc.aa, akv.b($$0));
   }

   private static cgp a(ke<cgp> $$0, aku<cgp> $$1, Set<dwy> $$2, int $$3, int $$4) {
      cgp $$5 = new cgp($$2, $$3, $$4);
      ke.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jr<cgp> $$0, Set<dwy> $$1) {
      $$1.forEach($$1x -> {
         jr<cgp> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jr<cgp>> a(dwy $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dwy $$0) {
      return w.containsKey($$0);
   }

   public static cgp a(ke<cgp> $$0) {
      a($$0, a, a(djp.oy), 1, 1);
      a($$0, b, a(djp.ox), 1, 1);
      a($$0, c, a(djp.oz), 1, 1);
      a($$0, d, a(djp.fN), 1, 1);
      a($$0, e, a(djp.pE), 1, 1);
      a($$0, f, a(djp.ow), 1, 1);
      a($$0, g, a(djp.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(djp.oC), 1, 1);
      a($$0, j, a(djp.oE), 1, 1);
      a($$0, k, a(djp.ov), 1, 1);
      a($$0, l, a(djp.oD), 1, 1);
      a($$0, m, a(djp.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(djp.oF), 32, 6);
      a($$0, p, a(djp.pH), 0, 1);
      a($$0, q, a(djp.pG), 0, 1);
      a($$0, r, a(djp.eq), 0, 1);
      a($$0, s, a(djp.pS), 0, 1);
      return a($$0, t, a(djp.sU), 0, 1);
   }
}
