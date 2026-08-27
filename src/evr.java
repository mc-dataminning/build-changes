import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum evr {
   a(new cmy(cnb.qP)),
   b(new cmy(cws.cj)),
   c(new cmy(cnb.lG)),
   d(new cmy(cnb.pa), new cmy(cnb.oS)),
   e(new cmy(cnb.qx), new cmy(cnb.oq)),
   f(new cmy(cnb.qP)),
   g(new cmy(cnb.pU)),
   h(new cmy(cws.b)),
   i(new cmy(cnb.qx), new cmy(cnb.ow)),
   j(new cmy(cnb.qP)),
   k(new cmy(cws.dI)),
   l(new cmy(cnb.oY), new cmy(cnb.pN)),
   m(new cmy(cnb.qP)),
   n(new cmy(cnb.pU)),
   o(new cmy(cnb.fE)),
   p(new cmy(cnb.pQ)),
   q(new cmy(cnb.pU)),
   r(new cmy(cnb.hA));

   public static final List<evr> s = ImmutableList.of(m, n);
   public static final List<evr> t = ImmutableList.of(j, k, l);
   public static final List<evr> u = ImmutableList.of(f, g, h, i);
   public static final List<evr> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<evr, List<evr>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cmy> x;

   private evr(cmy... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<evr> a(cjp $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cmy> a() {
      return this.x;
   }
}
