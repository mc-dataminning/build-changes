import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ewa {
   a(new cng(cnj.qR)),
   b(new cng(cxa.cj)),
   c(new cng(cnj.lG)),
   d(new cng(cnj.pc), new cng(cnj.oU)),
   e(new cng(cnj.qz), new cng(cnj.os)),
   f(new cng(cnj.qR)),
   g(new cng(cnj.pW)),
   h(new cng(cxa.b)),
   i(new cng(cnj.qz), new cng(cnj.oy)),
   j(new cng(cnj.qR)),
   k(new cng(cxa.dI)),
   l(new cng(cnj.pa), new cng(cnj.pP)),
   m(new cng(cnj.qR)),
   n(new cng(cnj.pW)),
   o(new cng(cnj.fE)),
   p(new cng(cnj.pS)),
   q(new cng(cnj.pW)),
   r(new cng(cnj.hA));

   public static final List<ewa> s = ImmutableList.of(m, n);
   public static final List<ewa> t = ImmutableList.of(j, k, l);
   public static final List<ewa> u = ImmutableList.of(f, g, h, i);
   public static final List<ewa> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ewa, List<ewa>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cng> x;

   private ewa(cng... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ewa> a(cjx $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cng> a() {
      return this.x;
   }
}
