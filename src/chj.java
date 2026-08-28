import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class chj {
   public static final aly<chi> a = a("armorer");
   public static final aly<chi> b = a("butcher");
   public static final aly<chi> c = a("cartographer");
   public static final aly<chi> d = a("cleric");
   public static final aly<chi> e = a("farmer");
   public static final aly<chi> f = a("fisherman");
   public static final aly<chi> g = a("fletcher");
   public static final aly<chi> h = a("leatherworker");
   public static final aly<chi> i = a("librarian");
   public static final aly<chi> j = a("mason");
   public static final aly<chi> k = a("shepherd");
   public static final aly<chi> l = a("toolsmith");
   public static final aly<chi> m = a("weaponsmith");
   public static final aly<chi> n = a("home");
   public static final aly<chi> o = a("meeting");
   public static final aly<chi> p = a("beehive");
   public static final aly<chi> q = a("bee_nest");
   public static final aly<chi> r = a("nether_portal");
   public static final aly<chi> s = a("lodestone");
   public static final aly<chi> t = a("lightning_rod");
   private static final Set<dxn> u = ImmutableList.of(
         dkg.bu, dkg.bv, dkg.br, dkg.bs, dkg.bp, dkg.bn, dkg.bt, dkg.bj, dkg.bo, dkg.bl, dkg.bi, dkg.bh, new dke[]{dkg.bm, dkg.bq, dkg.bg, dkg.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(djx.b) == dya.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dxn> v = ImmutableList.of(dkg.fH, dkg.fJ, dkg.fI, dkg.fK)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dxn, jq<chi>> w = Maps.newHashMap();

   private static Set<dxn> a(dke $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static aly<chi> a(String $$0) {
      return aly.a(mb.aa, alz.b($$0));
   }

   private static chi a(kd<chi> $$0, aly<chi> $$1, Set<dxn> $$2, int $$3, int $$4) {
      chi $$5 = new chi($$2, $$3, $$4);
      kd.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jq<chi> $$0, Set<dxn> $$1) {
      $$1.forEach($$1x -> {
         jq<chi> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ae.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jq<chi>> a(dxn $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dxn $$0) {
      return w.containsKey($$0);
   }

   public static chi a(kd<chi> $$0) {
      a($$0, a, a(dkg.or), 1, 1);
      a($$0, b, a(dkg.oq), 1, 1);
      a($$0, c, a(dkg.os), 1, 1);
      a($$0, d, a(dkg.fG), 1, 1);
      a($$0, e, a(dkg.px), 1, 1);
      a($$0, f, a(dkg.op), 1, 1);
      a($$0, g, a(dkg.ot), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dkg.ov), 1, 1);
      a($$0, j, a(dkg.ox), 1, 1);
      a($$0, k, a(dkg.oo), 1, 1);
      a($$0, l, a(dkg.ow), 1, 1);
      a($$0, m, a(dkg.ou), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dkg.oy), 32, 6);
      a($$0, p, a(dkg.pA), 0, 1);
      a($$0, q, a(dkg.pz), 0, 1);
      a($$0, r, a(dkg.eq), 0, 1);
      a($$0, s, a(dkg.pL), 0, 1);
      return a($$0, t, a(dkg.sN), 0, 1);
   }
}
