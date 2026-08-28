import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cho {
   public static final aly<chn> a = a("armorer");
   public static final aly<chn> b = a("butcher");
   public static final aly<chn> c = a("cartographer");
   public static final aly<chn> d = a("cleric");
   public static final aly<chn> e = a("farmer");
   public static final aly<chn> f = a("fisherman");
   public static final aly<chn> g = a("fletcher");
   public static final aly<chn> h = a("leatherworker");
   public static final aly<chn> i = a("librarian");
   public static final aly<chn> j = a("mason");
   public static final aly<chn> k = a("shepherd");
   public static final aly<chn> l = a("toolsmith");
   public static final aly<chn> m = a("weaponsmith");
   public static final aly<chn> n = a("home");
   public static final aly<chn> o = a("meeting");
   public static final aly<chn> p = a("beehive");
   public static final aly<chn> q = a("bee_nest");
   public static final aly<chn> r = a("nether_portal");
   public static final aly<chn> s = a("lodestone");
   public static final aly<chn> t = a("lightning_rod");
   private static final Set<dxv> u = ImmutableList.of(
         dko.bu, dko.bv, dko.br, dko.bs, dko.bp, dko.bn, dko.bt, dko.bj, dko.bo, dko.bl, dko.bi, dko.bh, new dkm[]{dko.bm, dko.bq, dko.bg, dko.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dkf.b) == dyi.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dxv> v = ImmutableList.of(dko.fH, dko.fJ, dko.fI, dko.fK)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dxv, jq<chn>> w = Maps.newHashMap();

   private static Set<dxv> a(dkm $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aly<chn> a(String $$0) {
      return aly.a(mb.aa, alz.b($$0));
   }

   private static chn a(kd<chn> $$0, aly<chn> $$1, Set<dxv> $$2, int $$3, int $$4) {
      chn $$5 = new chn($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<chn> $$0, Set<dxv> $$1) {
      $$1.forEach($$1x -> {
         jq<chn> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<chn>> a(dxv $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dxv $$0) {
      return w.containsKey($$0);
   }

   public static chn a(kd<chn> $$0) {
      a($$0, a, a(dko.or), 1, 1);
      a($$0, b, a(dko.oq), 1, 1);
      a($$0, c, a(dko.os), 1, 1);
      a($$0, d, a(dko.fG), 1, 1);
      a($$0, e, a(dko.px), 1, 1);
      a($$0, f, a(dko.op), 1, 1);
      a($$0, g, a(dko.ot), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dko.ov), 1, 1);
      a($$0, j, a(dko.ox), 1, 1);
      a($$0, k, a(dko.oo), 1, 1);
      a($$0, l, a(dko.ow), 1, 1);
      a($$0, m, a(dko.ou), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dko.oy), 32, 6);
      a($$0, p, a(dko.pA), 0, 1);
      a($$0, q, a(dko.pz), 0, 1);
      a($$0, r, a(dko.eq), 0, 1);
      a($$0, s, a(dko.pL), 0, 1);
      return a($$0, t, a(dko.sN), 0, 1);
   }
}
