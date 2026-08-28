import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class chg {
   public static final akt<chf> a = a("armorer");
   public static final akt<chf> b = a("butcher");
   public static final akt<chf> c = a("cartographer");
   public static final akt<chf> d = a("cleric");
   public static final akt<chf> e = a("farmer");
   public static final akt<chf> f = a("fisherman");
   public static final akt<chf> g = a("fletcher");
   public static final akt<chf> h = a("leatherworker");
   public static final akt<chf> i = a("librarian");
   public static final akt<chf> j = a("mason");
   public static final akt<chf> k = a("shepherd");
   public static final akt<chf> l = a("toolsmith");
   public static final akt<chf> m = a("weaponsmith");
   public static final akt<chf> n = a("home");
   public static final akt<chf> o = a("meeting");
   public static final akt<chf> p = a("beehive");
   public static final akt<chf> q = a("bee_nest");
   public static final akt<chf> r = a("nether_portal");
   public static final akt<chf> s = a("lodestone");
   public static final akt<chf> t = a("lightning_rod");
   private static final Set<dxq> u = ImmutableList.of(
         dkg.bu, dkg.bv, dkg.br, dkg.bs, dkg.bp, dkg.bn, dkg.bt, dkg.bj, dkg.bo, dkg.bl, dkg.bi, dkg.bh, new dke[]{dkg.bm, dkg.bq, dkg.bg, dkg.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(djx.b) == dyd.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dxq> v = ImmutableList.of(dkg.fO, dkg.fQ, dkg.fP, dkg.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dxq, jr<chf>> w = Maps.newHashMap();

   private static Set<dxq> a(dke $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static akt<chf> a(String $$0) {
      return akt.a(mc.aa, aku.b($$0));
   }

   private static chf a(ke<chf> $$0, akt<chf> $$1, Set<dxq> $$2, int $$3, int $$4) {
      chf $$5 = new chf($$2, $$3, $$4);
      ke.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jr<chf> $$0, Set<dxq> $$1) {
      $$1.forEach($$1x -> {
         jr<chf> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jr<chf>> a(dxq $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dxq $$0) {
      return w.containsKey($$0);
   }

   public static chf a(ke<chf> $$0) {
      a($$0, a, a(dkg.oy), 1, 1);
      a($$0, b, a(dkg.ox), 1, 1);
      a($$0, c, a(dkg.oz), 1, 1);
      a($$0, d, a(dkg.fN), 1, 1);
      a($$0, e, a(dkg.pE), 1, 1);
      a($$0, f, a(dkg.ow), 1, 1);
      a($$0, g, a(dkg.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dkg.oC), 1, 1);
      a($$0, j, a(dkg.oE), 1, 1);
      a($$0, k, a(dkg.ov), 1, 1);
      a($$0, l, a(dkg.oD), 1, 1);
      a($$0, m, a(dkg.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dkg.oF), 32, 6);
      a($$0, p, a(dkg.pH), 0, 1);
      a($$0, q, a(dkg.pG), 0, 1);
      a($$0, r, a(dkg.eq), 0, 1);
      a($$0, s, a(dkg.pS), 0, 1);
      return a($$0, t, a(dkg.sU), 0, 1);
   }
}
