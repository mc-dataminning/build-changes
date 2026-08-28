import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cjl {
   public static final alq<cjk> a = a("armorer");
   public static final alq<cjk> b = a("butcher");
   public static final alq<cjk> c = a("cartographer");
   public static final alq<cjk> d = a("cleric");
   public static final alq<cjk> e = a("farmer");
   public static final alq<cjk> f = a("fisherman");
   public static final alq<cjk> g = a("fletcher");
   public static final alq<cjk> h = a("leatherworker");
   public static final alq<cjk> i = a("librarian");
   public static final alq<cjk> j = a("mason");
   public static final alq<cjk> k = a("shepherd");
   public static final alq<cjk> l = a("toolsmith");
   public static final alq<cjk> m = a("weaponsmith");
   public static final alq<cjk> n = a("home");
   public static final alq<cjk> o = a("meeting");
   public static final alq<cjk> p = a("beehive");
   public static final alq<cjk> q = a("bee_nest");
   public static final alq<cjk> r = a("nether_portal");
   public static final alq<cjk> s = a("lodestone");
   public static final alq<cjk> t = a("lightning_rod");
   private static final Set<ebq> u = ImmutableList.of(
         dnq.bu, dnq.bv, dnq.br, dnq.bs, dnq.bp, dnq.bn, dnq.bt, dnq.bj, dnq.bo, dnq.bl, dnq.bi, dnq.bh, new dno[]{dnq.bm, dnq.bq, dnq.bg, dnq.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dnh.b) == ecd.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<ebq> v = ImmutableList.of(dnq.fS, dnq.fU, dnq.fT, dnq.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<ebq, jg<cjk>> w = Maps.newHashMap();

   private static Set<ebq> a(dno $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alq<cjk> a(String $$0) {
      return alq.a(mi.aa, alr.b($$0));
   }

   private static cjk a(jt<cjk> $$0, alq<cjk> $$1, Set<ebq> $$2, int $$3, int $$4) {
      cjk $$5 = new cjk($$2, $$3, $$4);
      jt.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jg<cjk> $$0, Set<ebq> $$1) {
      $$1.forEach($$1x -> {
         jg<cjk> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ag.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jg<cjk>> a(ebq $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(ebq $$0) {
      return w.containsKey($$0);
   }

   public static cjk a(jt<cjk> $$0) {
      a($$0, a, a(dnq.oC), 1, 1);
      a($$0, b, a(dnq.oB), 1, 1);
      a($$0, c, a(dnq.oD), 1, 1);
      a($$0, d, a(dnq.fR), 1, 1);
      a($$0, e, a(dnq.pK), 1, 1);
      a($$0, f, a(dnq.oA), 1, 1);
      a($$0, g, a(dnq.oE), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dnq.oG), 1, 1);
      a($$0, j, a(dnq.oI), 1, 1);
      a($$0, k, a(dnq.oz), 1, 1);
      a($$0, l, a(dnq.oH), 1, 1);
      a($$0, m, a(dnq.oF), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dnq.oJ), 32, 6);
      a($$0, p, a(dnq.pN), 0, 1);
      a($$0, q, a(dnq.pM), 0, 1);
      a($$0, r, a(dnq.eu), 0, 1);
      a($$0, s, a(dnq.pY), 0, 1);
      return a($$0, t, a(dnq.ta), 0, 1);
   }
}
