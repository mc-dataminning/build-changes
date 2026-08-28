import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cgd {
   public static final alg<cgc> a = a("armorer");
   public static final alg<cgc> b = a("butcher");
   public static final alg<cgc> c = a("cartographer");
   public static final alg<cgc> d = a("cleric");
   public static final alg<cgc> e = a("farmer");
   public static final alg<cgc> f = a("fisherman");
   public static final alg<cgc> g = a("fletcher");
   public static final alg<cgc> h = a("leatherworker");
   public static final alg<cgc> i = a("librarian");
   public static final alg<cgc> j = a("mason");
   public static final alg<cgc> k = a("shepherd");
   public static final alg<cgc> l = a("toolsmith");
   public static final alg<cgc> m = a("weaponsmith");
   public static final alg<cgc> n = a("home");
   public static final alg<cgc> o = a("meeting");
   public static final alg<cgc> p = a("beehive");
   public static final alg<cgc> q = a("bee_nest");
   public static final alg<cgc> r = a("nether_portal");
   public static final alg<cgc> s = a("lodestone");
   public static final alg<cgc> t = a("lightning_rod");
   private static final Set<dvd> u = ImmutableList.of(
         dia.bn, dia.bo, dia.bk, dia.bl, dia.bi, dia.bg, dia.bm, dia.bc, dia.bh, dia.be, dia.bb, dia.ba, new dhy[]{dia.bf, dia.bj, dia.aZ, dia.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dhr.b) == dvq.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dvd> v = ImmutableList.of(dia.ft, dia.fv, dia.fu, dia.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dvd, jp<cgc>> w = Maps.newHashMap();

   private static Set<dvd> a(dhy $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static alg<cgc> a(String $$0) {
      return alg.a(ly.aa, alh.b($$0));
   }

   private static cgc a(kc<cgc> $$0, alg<cgc> $$1, Set<dvd> $$2, int $$3, int $$4) {
      cgc $$5 = new cgc($$2, $$3, $$4);
      kc.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jp<cgc> $$0, Set<dvd> $$1) {
      $$1.forEach($$1x -> {
         jp<cgc> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jp<cgc>> a(dvd $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dvd $$0) {
      return w.containsKey($$0);
   }

   public static cgc a(kc<cgc> $$0) {
      a($$0, a, a(dia.nW), 1, 1);
      a($$0, b, a(dia.nV), 1, 1);
      a($$0, c, a(dia.nX), 1, 1);
      a($$0, d, a(dia.fs), 1, 1);
      a($$0, e, a(dia.pc), 1, 1);
      a($$0, f, a(dia.nU), 1, 1);
      a($$0, g, a(dia.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dia.oa), 1, 1);
      a($$0, j, a(dia.oc), 1, 1);
      a($$0, k, a(dia.nT), 1, 1);
      a($$0, l, a(dia.ob), 1, 1);
      a($$0, m, a(dia.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dia.od), 32, 6);
      a($$0, p, a(dia.pf), 0, 1);
      a($$0, q, a(dia.pe), 0, 1);
      a($$0, r, a(dia.ed), 0, 1);
      a($$0, s, a(dia.pq), 0, 1);
      return a($$0, t, a(dia.ss), 0, 1);
   }
}
