import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgp {
   public static final aku<cgo> a = a("armorer");
   public static final aku<cgo> b = a("butcher");
   public static final aku<cgo> c = a("cartographer");
   public static final aku<cgo> d = a("cleric");
   public static final aku<cgo> e = a("farmer");
   public static final aku<cgo> f = a("fisherman");
   public static final aku<cgo> g = a("fletcher");
   public static final aku<cgo> h = a("leatherworker");
   public static final aku<cgo> i = a("librarian");
   public static final aku<cgo> j = a("mason");
   public static final aku<cgo> k = a("shepherd");
   public static final aku<cgo> l = a("toolsmith");
   public static final aku<cgo> m = a("weaponsmith");
   public static final aku<cgo> n = a("home");
   public static final aku<cgo> o = a("meeting");
   public static final aku<cgo> p = a("beehive");
   public static final aku<cgo> q = a("bee_nest");
   public static final aku<cgo> r = a("nether_portal");
   public static final aku<cgo> s = a("lodestone");
   public static final aku<cgo> t = a("lightning_rod");
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
   private static final Map<dwx, jr<cgo>> w = Maps.newHashMap();

   private static Set<dwx> a(djm $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aku<cgo> a(String $$0) {
      return aku.a(mc.aa, akv.b($$0));
   }

   private static cgo a(ke<cgo> $$0, aku<cgo> $$1, Set<dwx> $$2, int $$3, int $$4) {
      cgo $$5 = new cgo($$2, $$3, $$4);
      ke.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jr<cgo> $$0, Set<dwx> $$1) {
      $$1.forEach($$1x -> {
         jr<cgo> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jr<cgo>> a(dwx $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dwx $$0) {
      return w.containsKey($$0);
   }

   public static cgo a(ke<cgo> $$0) {
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
