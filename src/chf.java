import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class chf {
   public static final alo<che> a = a("armorer");
   public static final alo<che> b = a("butcher");
   public static final alo<che> c = a("cartographer");
   public static final alo<che> d = a("cleric");
   public static final alo<che> e = a("farmer");
   public static final alo<che> f = a("fisherman");
   public static final alo<che> g = a("fletcher");
   public static final alo<che> h = a("leatherworker");
   public static final alo<che> i = a("librarian");
   public static final alo<che> j = a("mason");
   public static final alo<che> k = a("shepherd");
   public static final alo<che> l = a("toolsmith");
   public static final alo<che> m = a("weaponsmith");
   public static final alo<che> n = a("home");
   public static final alo<che> o = a("meeting");
   public static final alo<che> p = a("beehive");
   public static final alo<che> q = a("bee_nest");
   public static final alo<che> r = a("nether_portal");
   public static final alo<che> s = a("lodestone");
   public static final alo<che> t = a("lightning_rod");
   private static final Set<dxo> u = ImmutableList.of(
         dkf.bu, dkf.bv, dkf.br, dkf.bs, dkf.bp, dkf.bn, dkf.bt, dkf.bj, dkf.bo, dkf.bl, dkf.bi, dkf.bh, new dkd[]{dkf.bm, dkf.bq, dkf.bg, dkf.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(djw.b) == dyb.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dxo> v = ImmutableList.of(dkf.fO, dkf.fQ, dkf.fP, dkf.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dxo, jq<che>> w = Maps.newHashMap();

   private static Set<dxo> a(dkd $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alo<che> a(String $$0) {
      return alo.a(mb.aa, alp.b($$0));
   }

   private static che a(kd<che> $$0, alo<che> $$1, Set<dxo> $$2, int $$3, int $$4) {
      che $$5 = new che($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<che> $$0, Set<dxo> $$1) {
      $$1.forEach($$1x -> {
         jq<che> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<che>> a(dxo $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dxo $$0) {
      return w.containsKey($$0);
   }

   public static che a(kd<che> $$0) {
      a($$0, a, a(dkf.oy), 1, 1);
      a($$0, b, a(dkf.ox), 1, 1);
      a($$0, c, a(dkf.oz), 1, 1);
      a($$0, d, a(dkf.fN), 1, 1);
      a($$0, e, a(dkf.pE), 1, 1);
      a($$0, f, a(dkf.ow), 1, 1);
      a($$0, g, a(dkf.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dkf.oC), 1, 1);
      a($$0, j, a(dkf.oE), 1, 1);
      a($$0, k, a(dkf.ov), 1, 1);
      a($$0, l, a(dkf.oD), 1, 1);
      a($$0, m, a(dkf.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dkf.oF), 32, 6);
      a($$0, p, a(dkf.pH), 0, 1);
      a($$0, q, a(dkf.pG), 0, 1);
      a($$0, r, a(dkf.eq), 0, 1);
      a($$0, s, a(dkf.pS), 0, 1);
      return a($$0, t, a(dkf.sU), 0, 1);
   }
}
