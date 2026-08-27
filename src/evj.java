import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum evj {
   a(new cmr(cmu.qP)),
   b(new cmr(cwl.cj)),
   c(new cmr(cmu.lG)),
   d(new cmr(cmu.pa), new cmr(cmu.oS)),
   e(new cmr(cmu.qx), new cmr(cmu.oq)),
   f(new cmr(cmu.qP)),
   g(new cmr(cmu.pU)),
   h(new cmr(cwl.b)),
   i(new cmr(cmu.qx), new cmr(cmu.ow)),
   j(new cmr(cmu.qP)),
   k(new cmr(cwl.dI)),
   l(new cmr(cmu.oY), new cmr(cmu.pN)),
   m(new cmr(cmu.qP)),
   n(new cmr(cmu.pU)),
   o(new cmr(cmu.fE)),
   p(new cmr(cmu.pQ)),
   q(new cmr(cmu.pU)),
   r(new cmr(cmu.hA));

   public static final List<evj> s = ImmutableList.of(m, n);
   public static final List<evj> t = ImmutableList.of(j, k, l);
   public static final List<evj> u = ImmutableList.of(f, g, h, i);
   public static final List<evj> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<evj, List<evj>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cmr> x;

   private evj(cmr... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<evj> a(cji $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cmr> a() {
      return this.x;
   }
}
