import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eyt {
   a(new cpq(cpt.qR)),
   b(new cpq(czh.cj)),
   c(new cpq(cpt.lG)),
   d(new cpq(cpt.pc), new cpq(cpt.oU)),
   e(new cpq(cpt.qz), new cpq(cpt.os)),
   f(new cpq(cpt.qR)),
   g(new cpq(cpt.pW)),
   h(new cpq(czh.b)),
   i(new cpq(cpt.qz), new cpq(cpt.oy)),
   j(new cpq(cpt.qR)),
   k(new cpq(czh.dI)),
   l(new cpq(cpt.pa), new cpq(cpt.pP)),
   m(new cpq(cpt.qR)),
   n(new cpq(cpt.pW)),
   o(new cpq(cpt.fE)),
   p(new cpq(cpt.pS)),
   q(new cpq(cpt.pW)),
   r(new cpq(cpt.hA));

   public static final List<eyt> s = ImmutableList.of(m, n);
   public static final List<eyt> t = ImmutableList.of(j, k, l);
   public static final List<eyt> u = ImmutableList.of(f, g, h, i);
   public static final List<eyt> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eyt, List<eyt>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cpq> x;

   private eyt(cpq... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eyt> a(cmi $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cpq> a() {
      return this.x;
   }
}
