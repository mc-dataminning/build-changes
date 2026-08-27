import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ezp {
   a(new cqk(cqn.qR)),
   b(new cqk(dac.cj)),
   c(new cqk(cqn.lG)),
   d(new cqk(cqn.pc), new cqk(cqn.oU)),
   e(new cqk(cqn.qz), new cqk(cqn.os)),
   f(new cqk(cqn.qR)),
   g(new cqk(cqn.pW)),
   h(new cqk(dac.b)),
   i(new cqk(cqn.qz), new cqk(cqn.oy)),
   j(new cqk(cqn.qR)),
   k(new cqk(dac.dI)),
   l(new cqk(cqn.pa), new cqk(cqn.pP)),
   m(new cqk(cqn.qR)),
   n(new cqk(cqn.pW)),
   o(new cqk(cqn.fE)),
   p(new cqk(cqn.pS)),
   q(new cqk(cqn.pW)),
   r(new cqk(cqn.hA));

   public static final List<ezp> s = ImmutableList.of(m, n);
   public static final List<ezp> t = ImmutableList.of(j, k, l);
   public static final List<ezp> u = ImmutableList.of(f, g, h, i);
   public static final List<ezp> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ezp, List<ezp>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cqk> x;

   private ezp(cqk... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ezp> a(cnc $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cqk> a() {
      return this.x;
   }
}
