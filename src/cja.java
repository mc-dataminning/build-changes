import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cja {
   public static final alh<ciz> a = a("armorer");
   public static final alh<ciz> b = a("butcher");
   public static final alh<ciz> c = a("cartographer");
   public static final alh<ciz> d = a("cleric");
   public static final alh<ciz> e = a("farmer");
   public static final alh<ciz> f = a("fisherman");
   public static final alh<ciz> g = a("fletcher");
   public static final alh<ciz> h = a("leatherworker");
   public static final alh<ciz> i = a("librarian");
   public static final alh<ciz> j = a("mason");
   public static final alh<ciz> k = a("shepherd");
   public static final alh<ciz> l = a("toolsmith");
   public static final alh<ciz> m = a("weaponsmith");
   public static final alh<ciz> n = a("home");
   public static final alh<ciz> o = a("meeting");
   public static final alh<ciz> p = a("beehive");
   public static final alh<ciz> q = a("bee_nest");
   public static final alh<ciz> r = a("nether_portal");
   public static final alh<ciz> s = a("lodestone");
   public static final alh<ciz> t = a("lightning_rod");
   private static final Set<ebe> u = ImmutableList.of(
         dne.bu, dne.bv, dne.br, dne.bs, dne.bp, dne.bn, dne.bt, dne.bj, dne.bo, dne.bl, dne.bi, dne.bh, new dnc[]{dne.bm, dne.bq, dne.bg, dne.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dmv.b) == ebr.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<ebe> v = ImmutableList.of(dne.fS, dne.fU, dne.fT, dne.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<ebe, jf<ciz>> w = Maps.newHashMap();

   private static Set<ebe> a(dnc $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alh<ciz> a(String $$0) {
      return alh.a(mh.aa, ali.b($$0));
   }

   private static ciz a(js<ciz> $$0, alh<ciz> $$1, Set<ebe> $$2, int $$3, int $$4) {
      ciz $$5 = new ciz($$2, $$3, $$4);
      js.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jf<ciz> $$0, Set<ebe> $$1) {
      $$1.forEach($$1x -> {
         jf<ciz> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ag.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jf<ciz>> a(ebe $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(ebe $$0) {
      return w.containsKey($$0);
   }

   public static ciz a(js<ciz> $$0) {
      a($$0, a, a(dne.oC), 1, 1);
      a($$0, b, a(dne.oB), 1, 1);
      a($$0, c, a(dne.oD), 1, 1);
      a($$0, d, a(dne.fR), 1, 1);
      a($$0, e, a(dne.pK), 1, 1);
      a($$0, f, a(dne.oA), 1, 1);
      a($$0, g, a(dne.oE), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dne.oG), 1, 1);
      a($$0, j, a(dne.oI), 1, 1);
      a($$0, k, a(dne.oz), 1, 1);
      a($$0, l, a(dne.oH), 1, 1);
      a($$0, m, a(dne.oF), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dne.oJ), 32, 6);
      a($$0, p, a(dne.pN), 0, 1);
      a($$0, q, a(dne.pM), 0, 1);
      a($$0, r, a(dne.eu), 0, 1);
      a($$0, s, a(dne.pY), 0, 1);
      return a($$0, t, a(dne.ta), 0, 1);
   }
}
