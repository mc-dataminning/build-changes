import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fjp {
   a(new cwb(cwf.qT)),
   b(new cwb(dig.cj)),
   c(new cwb(cwf.lH)),
   d(new cwb(cwf.pf), new cwb(cwf.oX)),
   e(new cwb(cwf.qB), new cwb(cwf.ov)),
   f(new cwb(cwf.qT)),
   g(new cwb(cwf.pY)),
   h(new cwb(dig.b)),
   i(new cwb(cwf.qB), new cwb(cwf.oB)),
   j(new cwb(cwf.qT)),
   k(new cwb(dig.dI)),
   l(new cwb(cwf.pd), new cwb(cwf.pR)),
   m(new cwb(cwf.qT)),
   n(new cwb(cwf.pY)),
   o(new cwb(cwf.fF)),
   p(new cwb(cwf.pU)),
   q(new cwb(cwf.pY)),
   r(new cwb(cwf.hB));

   public static final List<fjp> s = ImmutableList.of(m, n);
   public static final List<fjp> t = ImmutableList.of(j, k, l);
   public static final List<fjp> u = ImmutableList.of(f, g, h, i);
   public static final List<fjp> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fjp, List<fjp>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cwb> x;

   private fjp(final cwb... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fjp> a(cte $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cwb> a() {
      return this.x;
   }
}
