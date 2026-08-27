import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fch {
   a(new crs(crv.qR)),
   b(new crs(dcj.cj)),
   c(new crs(crv.lG)),
   d(new crs(crv.pc), new crs(crv.oU)),
   e(new crs(crv.qz), new crs(crv.os)),
   f(new crs(crv.qR)),
   g(new crs(crv.pW)),
   h(new crs(dcj.b)),
   i(new crs(crv.qz), new crs(crv.oy)),
   j(new crs(crv.qR)),
   k(new crs(dcj.dI)),
   l(new crs(crv.pa), new crs(crv.pP)),
   m(new crs(crv.qR)),
   n(new crs(crv.pW)),
   o(new crs(crv.fE)),
   p(new crs(crv.pS)),
   q(new crs(crv.pW)),
   r(new crs(crv.hA));

   public static final List<fch> s = ImmutableList.of(m, n);
   public static final List<fch> t = ImmutableList.of(j, k, l);
   public static final List<fch> u = ImmutableList.of(f, g, h, i);
   public static final List<fch> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fch, List<fch>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<crs> x;

   private fch(crs... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fch> a(cok $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<crs> a() {
      return this.x;
   }
}
