import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cdv {
   public static final aks<cdu> a = a("armorer");
   public static final aks<cdu> b = a("butcher");
   public static final aks<cdu> c = a("cartographer");
   public static final aks<cdu> d = a("cleric");
   public static final aks<cdu> e = a("farmer");
   public static final aks<cdu> f = a("fisherman");
   public static final aks<cdu> g = a("fletcher");
   public static final aks<cdu> h = a("leatherworker");
   public static final aks<cdu> i = a("librarian");
   public static final aks<cdu> j = a("mason");
   public static final aks<cdu> k = a("shepherd");
   public static final aks<cdu> l = a("toolsmith");
   public static final aks<cdu> m = a("weaponsmith");
   public static final aks<cdu> n = a("home");
   public static final aks<cdu> o = a("meeting");
   public static final aks<cdu> p = a("beehive");
   public static final aks<cdu> q = a("bee_nest");
   public static final aks<cdu> r = a("nether_portal");
   public static final aks<cdu> s = a("lodestone");
   public static final aks<cdu> t = a("lightning_rod");
   public static final aks<cdu> u = a("potato_portal");
   public static final aks<cdu> v = a("pedestal");
   private static final Set<dtc> w = ImmutableList.of(
         dfe.bX, dfe.bY, dfe.bU, dfe.bV, dfe.bS, dfe.bQ, dfe.bW, dfe.bM, dfe.bR, dfe.bO, dfe.bL, dfe.bK, new dfc[]{dfe.bP, dfe.bT, dfe.bJ, dfe.bN}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(deu.b) == dtp.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dtc> x = ImmutableList.of(dfe.gl, dfe.gn, dfe.gm, dfe.go)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dtc, ja<cdu>> y = Maps.newHashMap();

   private static Set<dtc> a(dfc... $$0) {
      return (Set<dtc>)($$0.length == 1
         ? ImmutableSet.copyOf($$0[0].l().a())
         : Arrays.stream($$0).flatMap($$0x -> $$0x.l().a().stream()).collect(ImmutableSet.toImmutableSet()));
   }

   private static aks<cdu> a(String $$0) {
      return aks.a(li.V, new akt($$0));
   }

   private static cdu a(jn<cdu> $$0, aks<cdu> $$1, Set<dtc> $$2, int $$3, int $$4) {
      cdu $$5 = new cdu($$2, $$3, $$4);
      jn.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ja<cdu> $$0, Set<dtc> $$1) {
      $$1.forEach($$1x -> {
         ja<cdu> $$2 = y.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ja<cdu>> a(dtc $$0) {
      return Optional.ofNullable(y.get($$0));
   }

   public static boolean b(dtc $$0) {
      return y.containsKey($$0);
   }

   public static cdu a(jn<cdu> $$0) {
      a($$0, a, a(dfe.oU), 1, 1);
      a($$0, b, a(dfe.oT), 1, 1);
      a($$0, c, a(dfe.oV), 1, 1);
      a($$0, d, a(dfe.gk), 1, 1);
      a($$0, e, a(dfe.qn), 1, 1);
      a($$0, f, a(dfe.oS), 1, 1);
      a($$0, g, a(dfe.oW), 1, 1);
      a($$0, h, x, 1, 1);
      a($$0, i, a(dfe.oY), 1, 1);
      a($$0, j, a(dfe.pa), 1, 1);
      a($$0, k, a(dfe.oR), 1, 1);
      a($$0, l, a(dfe.oZ), 1, 1);
      a($$0, m, a(dfe.oX), 1, 1);
      a($$0, n, w, 1, 1);
      a($$0, o, a(dfe.pc), 32, 6);
      a($$0, p, a(dfe.qq), 0, 1);
      a($$0, q, a(dfe.qp), 0, 1);
      a($$0, r, a(dfe.eR), 0, 1);
      a($$0, u, a(dfe.eS), 0, 1);
      a($$0, s, a(dfe.qB), 0, 1);
      a($$0, v, a(dfe.eT), 0, 1);
      return a($$0, t, a(dfe.tD), 0, 1);
   }
}
