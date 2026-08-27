import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eqv {
   a(new ciy(cjb.qe)),
   b(new ciy(csn.cj)),
   c(new ciy(cjb.ll)),
   d(new ciy(cjb.op), new ciy(cjb.oh)),
   e(new ciy(cjb.pM), new ciy(cjb.nF)),
   f(new ciy(cjb.qe)),
   g(new ciy(cjb.pj)),
   h(new ciy(csn.b)),
   i(new ciy(cjb.pM), new ciy(cjb.nL)),
   j(new ciy(cjb.qe)),
   k(new ciy(csn.dI)),
   l(new ciy(cjb.on), new ciy(cjb.pc)),
   m(new ciy(cjb.qe)),
   n(new ciy(cjb.pj)),
   o(new ciy(cjb.fj)),
   p(new ciy(cjb.pf)),
   q(new ciy(cjb.pj)),
   r(new ciy(cjb.hf));

   public static final List<eqv> s = ImmutableList.of(m, n);
   public static final List<eqv> t = ImmutableList.of(j, k, l);
   public static final List<eqv> u = ImmutableList.of(f, g, h, i);
   public static final List<eqv> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eqv, List<eqv>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<ciy> x;

   private eqv(ciy... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eqv> a(cfp $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<ciy> a() {
      return this.x;
   }
}
