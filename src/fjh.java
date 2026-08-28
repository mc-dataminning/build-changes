import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fjh {
   a(new cvx(cwb.qT)),
   b(new cvx(dia.cj)),
   c(new cvx(cwb.lH)),
   d(new cvx(cwb.pf), new cvx(cwb.oX)),
   e(new cvx(cwb.qB), new cvx(cwb.ov)),
   f(new cvx(cwb.qT)),
   g(new cvx(cwb.pY)),
   h(new cvx(dia.b)),
   i(new cvx(cwb.qB), new cvx(cwb.oB)),
   j(new cvx(cwb.qT)),
   k(new cvx(dia.dI)),
   l(new cvx(cwb.pd), new cvx(cwb.pR)),
   m(new cvx(cwb.qT)),
   n(new cvx(cwb.pY)),
   o(new cvx(cwb.fF)),
   p(new cvx(cwb.pU)),
   q(new cvx(cwb.pY)),
   r(new cvx(cwb.hB));

   public static final List<fjh> s = ImmutableList.of(m, n);
   public static final List<fjh> t = ImmutableList.of(j, k, l);
   public static final List<fjh> u = ImmutableList.of(f, g, h, i);
   public static final List<fjh> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fjh, List<fjh>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cvx> x;

   private fjh(final cvx... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fjh> a(csz $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cvx> a() {
      return this.x;
   }
}
