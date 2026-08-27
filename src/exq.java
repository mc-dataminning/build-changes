import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum exq {
   a(new coz(cpc.qR)),
   b(new coz(cyq.cj)),
   c(new coz(cpc.lG)),
   d(new coz(cpc.pc), new coz(cpc.oU)),
   e(new coz(cpc.qz), new coz(cpc.os)),
   f(new coz(cpc.qR)),
   g(new coz(cpc.pW)),
   h(new coz(cyq.b)),
   i(new coz(cpc.qz), new coz(cpc.oy)),
   j(new coz(cpc.qR)),
   k(new coz(cyq.dI)),
   l(new coz(cpc.pa), new coz(cpc.pP)),
   m(new coz(cpc.qR)),
   n(new coz(cpc.pW)),
   o(new coz(cpc.fE)),
   p(new coz(cpc.pS)),
   q(new coz(cpc.pW)),
   r(new coz(cpc.hA));

   public static final List<exq> s = ImmutableList.of(m, n);
   public static final List<exq> t = ImmutableList.of(j, k, l);
   public static final List<exq> u = ImmutableList.of(f, g, h, i);
   public static final List<exq> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<exq, List<exq>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<coz> x;

   private exq(coz... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<exq> a(clp $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<coz> a() {
      return this.x;
   }
}
