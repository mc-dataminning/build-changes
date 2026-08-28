import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class chn {
   public static final aly<chm> a = a("armorer");
   public static final aly<chm> b = a("butcher");
   public static final aly<chm> c = a("cartographer");
   public static final aly<chm> d = a("cleric");
   public static final aly<chm> e = a("farmer");
   public static final aly<chm> f = a("fisherman");
   public static final aly<chm> g = a("fletcher");
   public static final aly<chm> h = a("leatherworker");
   public static final aly<chm> i = a("librarian");
   public static final aly<chm> j = a("mason");
   public static final aly<chm> k = a("shepherd");
   public static final aly<chm> l = a("toolsmith");
   public static final aly<chm> m = a("weaponsmith");
   public static final aly<chm> n = a("home");
   public static final aly<chm> o = a("meeting");
   public static final aly<chm> p = a("beehive");
   public static final aly<chm> q = a("bee_nest");
   public static final aly<chm> r = a("nether_portal");
   public static final aly<chm> s = a("lodestone");
   public static final aly<chm> t = a("lightning_rod");
   private static final Set<dxu> u = ImmutableList.of(
         dkn.bu, dkn.bv, dkn.br, dkn.bs, dkn.bp, dkn.bn, dkn.bt, dkn.bj, dkn.bo, dkn.bl, dkn.bi, dkn.bh, new dkl[]{dkn.bm, dkn.bq, dkn.bg, dkn.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dke.b) == dyh.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dxu> v = ImmutableList.of(dkn.fH, dkn.fJ, dkn.fI, dkn.fK)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dxu, jq<chm>> w = Maps.newHashMap();

   private static Set<dxu> a(dkl $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aly<chm> a(String $$0) {
      return aly.a(mb.aa, alz.b($$0));
   }

   private static chm a(kd<chm> $$0, aly<chm> $$1, Set<dxu> $$2, int $$3, int $$4) {
      chm $$5 = new chm($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<chm> $$0, Set<dxu> $$1) {
      $$1.forEach($$1x -> {
         jq<chm> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<chm>> a(dxu $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dxu $$0) {
      return w.containsKey($$0);
   }

   public static chm a(kd<chm> $$0) {
      a($$0, a, a(dkn.or), 1, 1);
      a($$0, b, a(dkn.oq), 1, 1);
      a($$0, c, a(dkn.os), 1, 1);
      a($$0, d, a(dkn.fG), 1, 1);
      a($$0, e, a(dkn.px), 1, 1);
      a($$0, f, a(dkn.op), 1, 1);
      a($$0, g, a(dkn.ot), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dkn.ov), 1, 1);
      a($$0, j, a(dkn.ox), 1, 1);
      a($$0, k, a(dkn.oo), 1, 1);
      a($$0, l, a(dkn.ow), 1, 1);
      a($$0, m, a(dkn.ou), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dkn.oy), 32, 6);
      a($$0, p, a(dkn.pA), 0, 1);
      a($$0, q, a(dkn.pz), 0, 1);
      a($$0, r, a(dkn.eq), 0, 1);
      a($$0, s, a(dkn.pL), 0, 1);
      return a($$0, t, a(dkn.sN), 0, 1);
   }
}
