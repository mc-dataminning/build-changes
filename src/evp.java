import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum evp {
   a(new cmx(cna.qP)),
   b(new cmx(cwr.cj)),
   c(new cmx(cna.lG)),
   d(new cmx(cna.pa), new cmx(cna.oS)),
   e(new cmx(cna.qx), new cmx(cna.oq)),
   f(new cmx(cna.qP)),
   g(new cmx(cna.pU)),
   h(new cmx(cwr.b)),
   i(new cmx(cna.qx), new cmx(cna.ow)),
   j(new cmx(cna.qP)),
   k(new cmx(cwr.dI)),
   l(new cmx(cna.oY), new cmx(cna.pN)),
   m(new cmx(cna.qP)),
   n(new cmx(cna.pU)),
   o(new cmx(cna.fE)),
   p(new cmx(cna.pQ)),
   q(new cmx(cna.pU)),
   r(new cmx(cna.hA));

   public static final List<evp> s = ImmutableList.of(m, n);
   public static final List<evp> t = ImmutableList.of(j, k, l);
   public static final List<evp> u = ImmutableList.of(f, g, h, i);
   public static final List<evp> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<evp, List<evp>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cmx> x;

   private evp(cmx... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<evp> a(cjo $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cmx> a() {
      return this.x;
   }
}
