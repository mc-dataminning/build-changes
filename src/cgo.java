import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgo {
   public static final aku<cgn> a = a("armorer");
   public static final aku<cgn> b = a("butcher");
   public static final aku<cgn> c = a("cartographer");
   public static final aku<cgn> d = a("cleric");
   public static final aku<cgn> e = a("farmer");
   public static final aku<cgn> f = a("fisherman");
   public static final aku<cgn> g = a("fletcher");
   public static final aku<cgn> h = a("leatherworker");
   public static final aku<cgn> i = a("librarian");
   public static final aku<cgn> j = a("mason");
   public static final aku<cgn> k = a("shepherd");
   public static final aku<cgn> l = a("toolsmith");
   public static final aku<cgn> m = a("weaponsmith");
   public static final aku<cgn> n = a("home");
   public static final aku<cgn> o = a("meeting");
   public static final aku<cgn> p = a("beehive");
   public static final aku<cgn> q = a("bee_nest");
   public static final aku<cgn> r = a("nether_portal");
   public static final aku<cgn> s = a("lodestone");
   public static final aku<cgn> t = a("lightning_rod");
   private static final Set<dww> u = ImmutableList.of(
         djn.bu, djn.bv, djn.br, djn.bs, djn.bp, djn.bn, djn.bt, djn.bj, djn.bo, djn.bl, djn.bi, djn.bh, new djl[]{djn.bm, djn.bq, djn.bg, djn.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dje.b) == dxj.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dww> v = ImmutableList.of(djn.fO, djn.fQ, djn.fP, djn.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dww, jr<cgn>> w = Maps.newHashMap();

   private static Set<dww> a(djl $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aku<cgn> a(String $$0) {
      return aku.a(mc.aa, akv.b($$0));
   }

   private static cgn a(ke<cgn> $$0, aku<cgn> $$1, Set<dww> $$2, int $$3, int $$4) {
      cgn $$5 = new cgn($$2, $$3, $$4);
      ke.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jr<cgn> $$0, Set<dww> $$1) {
      $$1.forEach($$1x -> {
         jr<cgn> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jr<cgn>> a(dww $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dww $$0) {
      return w.containsKey($$0);
   }

   public static cgn a(ke<cgn> $$0) {
      a($$0, a, a(djn.oy), 1, 1);
      a($$0, b, a(djn.ox), 1, 1);
      a($$0, c, a(djn.oz), 1, 1);
      a($$0, d, a(djn.fN), 1, 1);
      a($$0, e, a(djn.pE), 1, 1);
      a($$0, f, a(djn.ow), 1, 1);
      a($$0, g, a(djn.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(djn.oC), 1, 1);
      a($$0, j, a(djn.oE), 1, 1);
      a($$0, k, a(djn.ov), 1, 1);
      a($$0, l, a(djn.oD), 1, 1);
      a($$0, m, a(djn.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(djn.oF), 32, 6);
      a($$0, p, a(djn.pH), 0, 1);
      a($$0, q, a(djn.pG), 0, 1);
      a($$0, r, a(djn.eq), 0, 1);
      a($$0, s, a(djn.pS), 0, 1);
      return a($$0, t, a(djn.sU), 0, 1);
   }
}
