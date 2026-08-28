import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cex {
   public static final ale<cew> a = a("armorer");
   public static final ale<cew> b = a("butcher");
   public static final ale<cew> c = a("cartographer");
   public static final ale<cew> d = a("cleric");
   public static final ale<cew> e = a("farmer");
   public static final ale<cew> f = a("fisherman");
   public static final ale<cew> g = a("fletcher");
   public static final ale<cew> h = a("leatherworker");
   public static final ale<cew> i = a("librarian");
   public static final ale<cew> j = a("mason");
   public static final ale<cew> k = a("shepherd");
   public static final ale<cew> l = a("toolsmith");
   public static final ale<cew> m = a("weaponsmith");
   public static final ale<cew> n = a("home");
   public static final ale<cew> o = a("meeting");
   public static final ale<cew> p = a("beehive");
   public static final ale<cew> q = a("bee_nest");
   public static final ale<cew> r = a("nether_portal");
   public static final ale<cew> s = a("lodestone");
   public static final ale<cew> t = a("lightning_rod");
   private static final Set<dsc> u = ImmutableList.of(
         dfb.bn, dfb.bo, dfb.bk, dfb.bl, dfb.bi, dfb.bg, dfb.bm, dfb.bc, dfb.bh, dfb.be, dfb.bb, dfb.ba, new dez[]{dfb.bf, dfb.bj, dfb.aZ, dfb.bd}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(des.b) == dsp.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dsc> v = ImmutableList.of(dfb.ft, dfb.fv, dfb.fu, dfb.fw)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dsc, ji<cew>> w = Maps.newHashMap();

   private static Set<dsc> a(dez $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ale<cew> a(String $$0) {
      return ale.a(lq.V, new alf($$0));
   }

   private static cew a(jv<cew> $$0, ale<cew> $$1, Set<dsc> $$2, int $$3, int $$4) {
      cew $$5 = new cew($$2, $$3, $$4);
      jv.a($$0, $$1, $$5);
      a($$0.g($$1), $$2);
      return $$5;
   }

   private static void a(ji<cew> $$0, Set<dsc> $$1) {
      $$1.forEach($$1x -> {
         ji<cew> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<ji<cew>> a(dsc $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dsc $$0) {
      return w.containsKey($$0);
   }

   public static cew a(jv<cew> $$0) {
      a($$0, a, a(dfb.nW), 1, 1);
      a($$0, b, a(dfb.nV), 1, 1);
      a($$0, c, a(dfb.nX), 1, 1);
      a($$0, d, a(dfb.fs), 1, 1);
      a($$0, e, a(dfb.pc), 1, 1);
      a($$0, f, a(dfb.nU), 1, 1);
      a($$0, g, a(dfb.nY), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dfb.oa), 1, 1);
      a($$0, j, a(dfb.oc), 1, 1);
      a($$0, k, a(dfb.nT), 1, 1);
      a($$0, l, a(dfb.ob), 1, 1);
      a($$0, m, a(dfb.nZ), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dfb.od), 32, 6);
      a($$0, p, a(dfb.pf), 0, 1);
      a($$0, q, a(dfb.pe), 0, 1);
      a($$0, r, a(dfb.ed), 0, 1);
      a($$0, s, a(dfb.pq), 0, 1);
      return a($$0, t, a(dfb.ss), 0, 1);
   }
}
