import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgo {
   public static final akt<cgn> a = a("armorer");
   public static final akt<cgn> b = a("butcher");
   public static final akt<cgn> c = a("cartographer");
   public static final akt<cgn> d = a("cleric");
   public static final akt<cgn> e = a("farmer");
   public static final akt<cgn> f = a("fisherman");
   public static final akt<cgn> g = a("fletcher");
   public static final akt<cgn> h = a("leatherworker");
   public static final akt<cgn> i = a("librarian");
   public static final akt<cgn> j = a("mason");
   public static final akt<cgn> k = a("shepherd");
   public static final akt<cgn> l = a("toolsmith");
   public static final akt<cgn> m = a("weaponsmith");
   public static final akt<cgn> n = a("home");
   public static final akt<cgn> o = a("meeting");
   public static final akt<cgn> p = a("beehive");
   public static final akt<cgn> q = a("bee_nest");
   public static final akt<cgn> r = a("nether_portal");
   public static final akt<cgn> s = a("lodestone");
   public static final akt<cgn> t = a("lightning_rod");
   private static final Set<dwx> u = ImmutableList.of(
         djo.bu, djo.bv, djo.br, djo.bs, djo.bp, djo.bn, djo.bt, djo.bj, djo.bo, djo.bl, djo.bi, djo.bh, new djm[]{djo.bm, djo.bq, djo.bg, djo.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(djf.b) == dxk.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dwx> v = ImmutableList.of(djo.fO, djo.fQ, djo.fP, djo.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dwx, jr<cgn>> w = Maps.newHashMap();

   private static Set<dwx> a(djm $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akt<cgn> a(String $$0) {
      return akt.a(mc.aa, aku.b($$0));
   }

   private static cgn a(ke<cgn> $$0, akt<cgn> $$1, Set<dwx> $$2, int $$3, int $$4) {
      cgn $$5 = new cgn($$2, $$3, $$4);
      ke.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jr<cgn> $$0, Set<dwx> $$1) {
      $$1.forEach($$1x -> {
         jr<cgn> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jr<cgn>> a(dwx $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dwx $$0) {
      return w.containsKey($$0);
   }

   public static cgn a(ke<cgn> $$0) {
      a($$0, a, a(djo.oy), 1, 1);
      a($$0, b, a(djo.ox), 1, 1);
      a($$0, c, a(djo.oz), 1, 1);
      a($$0, d, a(djo.fN), 1, 1);
      a($$0, e, a(djo.pE), 1, 1);
      a($$0, f, a(djo.ow), 1, 1);
      a($$0, g, a(djo.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(djo.oC), 1, 1);
      a($$0, j, a(djo.oE), 1, 1);
      a($$0, k, a(djo.ov), 1, 1);
      a($$0, l, a(djo.oD), 1, 1);
      a($$0, m, a(djo.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(djo.oF), 32, 6);
      a($$0, p, a(djo.pH), 0, 1);
      a($$0, q, a(djo.pG), 0, 1);
      a($$0, r, a(djo.eq), 0, 1);
      a($$0, s, a(djo.pS), 0, 1);
      return a($$0, t, a(djo.sU), 0, 1);
   }
}
