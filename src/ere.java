import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ere {
   a(new cjf(cji.qe)),
   b(new cjf(csw.cj)),
   c(new cjf(cji.ll)),
   d(new cjf(cji.op), new cjf(cji.oh)),
   e(new cjf(cji.pM), new cjf(cji.nF)),
   f(new cjf(cji.qe)),
   g(new cjf(cji.pj)),
   h(new cjf(csw.b)),
   i(new cjf(cji.pM), new cjf(cji.nL)),
   j(new cjf(cji.qe)),
   k(new cjf(csw.dI)),
   l(new cjf(cji.on), new cjf(cji.pc)),
   m(new cjf(cji.qe)),
   n(new cjf(cji.pj)),
   o(new cjf(cji.fj)),
   p(new cjf(cji.pf)),
   q(new cjf(cji.pj)),
   r(new cjf(cji.hf));

   public static final List<ere> s = ImmutableList.of(m, n);
   public static final List<ere> t = ImmutableList.of(j, k, l);
   public static final List<ere> u = ImmutableList.of(f, g, h, i);
   public static final List<ere> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ere, List<ere>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cjf> x;

   private ere(cjf... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ere> a(cfw $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cjf> a() {
      return this.x;
   }
}
