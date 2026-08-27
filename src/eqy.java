import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eqy {
   a(new cjl(cjo.qe)),
   b(new cjl(cte.cj)),
   c(new cjl(cjo.ll)),
   d(new cjl(cjo.op), new cjl(cjo.oh)),
   e(new cjl(cjo.pM), new cjl(cjo.nF)),
   f(new cjl(cjo.qe)),
   g(new cjl(cjo.pj)),
   h(new cjl(cte.b)),
   i(new cjl(cjo.pM), new cjl(cjo.nL)),
   j(new cjl(cjo.qe)),
   k(new cjl(cte.dI)),
   l(new cjl(cjo.on), new cjl(cjo.pc)),
   m(new cjl(cjo.qe)),
   n(new cjl(cjo.pj)),
   o(new cjl(cjo.fj)),
   p(new cjl(cjo.pf)),
   q(new cjl(cjo.pj)),
   r(new cjl(cjo.hf));

   public static final List<eqy> s = ImmutableList.of(m, n);
   public static final List<eqy> t = ImmutableList.of(j, k, l);
   public static final List<eqy> u = ImmutableList.of(f, g, h, i);
   public static final List<eqy> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eqy, List<eqy>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cjl> x;

   private eqy(cjl... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eqy> a(cgc $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cjl> a() {
      return this.x;
   }
}
