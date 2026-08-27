import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ezr {
   a(new cqm(cqp.qR)),
   b(new cqm(dae.cj)),
   c(new cqm(cqp.lG)),
   d(new cqm(cqp.pc), new cqm(cqp.oU)),
   e(new cqm(cqp.qz), new cqm(cqp.os)),
   f(new cqm(cqp.qR)),
   g(new cqm(cqp.pW)),
   h(new cqm(dae.b)),
   i(new cqm(cqp.qz), new cqm(cqp.oy)),
   j(new cqm(cqp.qR)),
   k(new cqm(dae.dI)),
   l(new cqm(cqp.pa), new cqm(cqp.pP)),
   m(new cqm(cqp.qR)),
   n(new cqm(cqp.pW)),
   o(new cqm(cqp.fE)),
   p(new cqm(cqp.pS)),
   q(new cqm(cqp.pW)),
   r(new cqm(cqp.hA));

   public static final List<ezr> s = ImmutableList.of(m, n);
   public static final List<ezr> t = ImmutableList.of(j, k, l);
   public static final List<ezr> u = ImmutableList.of(f, g, h, i);
   public static final List<ezr> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ezr, List<ezr>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cqm> x;

   private ezr(cqm... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ezr> a(cne $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cqm> a() {
      return this.x;
   }
}
