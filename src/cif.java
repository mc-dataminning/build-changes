import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cif {
   public static final ald<cie> a = a("armorer");
   public static final ald<cie> b = a("butcher");
   public static final ald<cie> c = a("cartographer");
   public static final ald<cie> d = a("cleric");
   public static final ald<cie> e = a("farmer");
   public static final ald<cie> f = a("fisherman");
   public static final ald<cie> g = a("fletcher");
   public static final ald<cie> h = a("leatherworker");
   public static final ald<cie> i = a("librarian");
   public static final ald<cie> j = a("mason");
   public static final ald<cie> k = a("shepherd");
   public static final ald<cie> l = a("toolsmith");
   public static final ald<cie> m = a("weaponsmith");
   public static final ald<cie> n = a("home");
   public static final ald<cie> o = a("meeting");
   public static final ald<cie> p = a("beehive");
   public static final ald<cie> q = a("bee_nest");
   public static final ald<cie> r = a("nether_portal");
   public static final ald<cie> s = a("lodestone");
   public static final ald<cie> t = a("lightning_rod");
   private static final Set<dzo> u = ImmutableList.of(
         dlw.bu, dlw.bv, dlw.br, dlw.bs, dlw.bp, dlw.bn, dlw.bt, dlw.bj, dlw.bo, dlw.bl, dlw.bi, dlw.bh, new dlu[]{dlw.bm, dlw.bq, dlw.bg, dlw.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dln.b) == eab.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<dzo> v = ImmutableList.of(dlw.fO, dlw.fQ, dlw.fP, dlw.fR)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<dzo, je<cie>> w = Maps.newHashMap();

   private static Set<dzo> a(dlu $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static ald<cie> a(String $$0) {
      return ald.a(mg.aa, ale.b($$0));
   }

   private static cie a(jr<cie> $$0, ald<cie> $$1, Set<dzo> $$2, int $$3, int $$4) {
      cie $$5 = new cie($$2, $$3, $$4);
      jr.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(je<cie> $$0, Set<dzo> $$1) {
      $$1.forEach($$1x -> {
         je<cie> $$2 = w.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)af.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<je<cie>> a(dzo $$0) {
      return Optional.ofNullable(w.get($$0));
   }

   public static boolean b(dzo $$0) {
      return w.containsKey($$0);
   }

   public static cie a(jr<cie> $$0) {
      a($$0, a, a(dlw.oy), 1, 1);
      a($$0, b, a(dlw.ox), 1, 1);
      a($$0, c, a(dlw.oz), 1, 1);
      a($$0, d, a(dlw.fN), 1, 1);
      a($$0, e, a(dlw.pG), 1, 1);
      a($$0, f, a(dlw.ow), 1, 1);
      a($$0, g, a(dlw.oA), 1, 1);
      a($$0, h, v, 1, 1);
      a($$0, i, a(dlw.oC), 1, 1);
      a($$0, j, a(dlw.oE), 1, 1);
      a($$0, k, a(dlw.ov), 1, 1);
      a($$0, l, a(dlw.oD), 1, 1);
      a($$0, m, a(dlw.oB), 1, 1);
      a($$0, n, u, 1, 1);
      a($$0, o, a(dlw.oF), 32, 6);
      a($$0, p, a(dlw.pJ), 0, 1);
      a($$0, q, a(dlw.pI), 0, 1);
      a($$0, r, a(dlw.eq), 0, 1);
      a($$0, s, a(dlw.pU), 0, 1);
      return a($$0, t, a(dlw.sW), 0, 1);
   }
}
