import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum erg {
   a(new cjh(cjk.qe)),
   b(new cjh(csy.cj)),
   c(new cjh(cjk.ll)),
   d(new cjh(cjk.op), new cjh(cjk.oh)),
   e(new cjh(cjk.pM), new cjh(cjk.nF)),
   f(new cjh(cjk.qe)),
   g(new cjh(cjk.pj)),
   h(new cjh(csy.b)),
   i(new cjh(cjk.pM), new cjh(cjk.nL)),
   j(new cjh(cjk.qe)),
   k(new cjh(csy.dI)),
   l(new cjh(cjk.on), new cjh(cjk.pc)),
   m(new cjh(cjk.qe)),
   n(new cjh(cjk.pj)),
   o(new cjh(cjk.fj)),
   p(new cjh(cjk.pf)),
   q(new cjh(cjk.pj)),
   r(new cjh(cjk.hf));

   public static final List<erg> s = ImmutableList.of(m, n);
   public static final List<erg> t = ImmutableList.of(j, k, l);
   public static final List<erg> u = ImmutableList.of(f, g, h, i);
   public static final List<erg> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<erg, List<erg>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cjh> x;

   private erg(cjh... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<erg> a(cfy $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cjh> a() {
      return this.x;
   }
}
