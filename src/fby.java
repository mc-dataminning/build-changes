import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fby {
   a(new crj(crm.qR)),
   b(new crj(dca.cj)),
   c(new crj(crm.lG)),
   d(new crj(crm.pc), new crj(crm.oU)),
   e(new crj(crm.qz), new crj(crm.os)),
   f(new crj(crm.qR)),
   g(new crj(crm.pW)),
   h(new crj(dca.b)),
   i(new crj(crm.qz), new crj(crm.oy)),
   j(new crj(crm.qR)),
   k(new crj(dca.dI)),
   l(new crj(crm.pa), new crj(crm.pP)),
   m(new crj(crm.qR)),
   n(new crj(crm.pW)),
   o(new crj(crm.fE)),
   p(new crj(crm.pS)),
   q(new crj(crm.pW)),
   r(new crj(crm.hA));

   public static final List<fby> s = ImmutableList.of(m, n);
   public static final List<fby> t = ImmutableList.of(j, k, l);
   public static final List<fby> u = ImmutableList.of(f, g, h, i);
   public static final List<fby> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fby, List<fby>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<crj> x;

   private fby(crj... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fby> a(cod $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<crj> a() {
      return this.x;
   }
}
