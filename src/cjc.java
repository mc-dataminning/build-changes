import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cjc {
   public static final alj<cjb> a = a("armorer");
   public static final alj<cjb> b = a("butcher");
   public static final alj<cjb> c = a("cartographer");
   public static final alj<cjb> d = a("cleric");
   public static final alj<cjb> e = a("farmer");
   public static final alj<cjb> f = a("fisherman");
   public static final alj<cjb> g = a("fletcher");
   public static final alj<cjb> h = a("leatherworker");
   public static final alj<cjb> i = a("librarian");
   public static final alj<cjb> j = a("mason");
   public static final alj<cjb> k = a("shepherd");
   public static final alj<cjb> l = a("toolsmith");
   public static final alj<cjb> m = a("weaponsmith");
   public static final alj<cjb> n = a("home");
   public static final alj<cjb> o = a("meeting");
   public static final alj<cjb> p = a("beehive");
   public static final alj<cjb> q = a("bee_nest");
   public static final alj<cjb> r = a("nether_portal");
   public static final alj<cjb> s = a("lodestone");
   public static final alj<cjb> t = a("lightning_rod");
   private static final Set<ebg> u = ImmutableList.of(
         dng.bu, dng.bv, dng.br, dng.bs, dng.bp, dng.bn, dng.bt, dng.bj, dng.bo, dng.bl, dng.bi, dng.bh, new dne[]{dng.bm, dng.bq, dng.bg, dng.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dmx.b) == ebt.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<ebg> v = ImmutableList.of(dng.fS, dng.fU, dng.fT, dng.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<ebg, jg<cjb>> w = Maps.newHashMap();

   private static Set<ebg> a(dne $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alj<cjb> a(String $$0) {
      return alj.a(mi.aa, alk.b($$0));
   }

   private static cjb a(jt<cjb> $$0, alj<cjb> $$1, Set<ebg> $$2, int $$3, int $$4) {
      cjb $$5 = new cjb($$2, $$3, $$4);
      jt.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jg<cjb> $$0, Set<ebg> $$1) {
      $$1.forEach($$1x -> {
         jg<cjb> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ag.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jg<cjb>> a(ebg $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(ebg $$0) {
      return w.containsKey($$0);
   }

   public static cjb a(jt<cjb> $$0) {
      a($$0, a, a(dng.oC), 1, 1);
      a($$0, b, a(dng.oB), 1, 1);
      a($$0, c, a(dng.oD), 1, 1);
      a($$0, d, a(dng.fR), 1, 1);
      a($$0, e, a(dng.pK), 1, 1);
      a($$0, f, a(dng.oA), 1, 1);
      a($$0, g, a(dng.oE), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dng.oG), 1, 1);
      a($$0, j, a(dng.oI), 1, 1);
      a($$0, k, a(dng.oz), 1, 1);
      a($$0, l, a(dng.oH), 1, 1);
      a($$0, m, a(dng.oF), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dng.oJ), 32, 6);
      a($$0, p, a(dng.pN), 0, 1);
      a($$0, q, a(dng.pM), 0, 1);
      a($$0, r, a(dng.eu), 0, 1);
      a($$0, s, a(dng.pY), 0, 1);
      return a($$0, t, a(dng.ta), 0, 1);
   }
}
