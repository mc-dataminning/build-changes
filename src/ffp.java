import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffp {
   a(new cur(cuu.qS)),
   b(new cur(dfd.cj)),
   c(new cur(cuu.lH)),
   d(new cur(cuu.pd), new cur(cuu.oV)),
   e(new cur(cuu.qA), new cur(cuu.ot)),
   f(new cur(cuu.qS)),
   g(new cur(cuu.pX)),
   h(new cur(dfd.b)),
   i(new cur(cuu.qA), new cur(cuu.oz)),
   j(new cur(cuu.qS)),
   k(new cur(dfd.dI)),
   l(new cur(cuu.pb), new cur(cuu.pQ)),
   m(new cur(cuu.qS)),
   n(new cur(cuu.pX)),
   o(new cur(cuu.fF)),
   p(new cur(cuu.pT)),
   q(new cur(cuu.pX)),
   r(new cur(cuu.hB));

   public static final List<ffp> s = ImmutableList.of(m, n);
   public static final List<ffp> t = ImmutableList.of(j, k, l);
   public static final List<ffp> u = ImmutableList.of(f, g, h, i);
   public static final List<ffp> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffp, List<ffp>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cur> x;

   private ffp(final cur... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffp> a(crk $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cur> a() {
      return this.x;
   }
}
