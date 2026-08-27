import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum etm {
   a(new clj(clm.qP)),
   b(new clj(cvc.cj)),
   c(new clj(clm.lG)),
   d(new clj(clm.pa), new clj(clm.oS)),
   e(new clj(clm.qx), new clj(clm.oq)),
   f(new clj(clm.qP)),
   g(new clj(clm.pU)),
   h(new clj(cvc.b)),
   i(new clj(clm.qx), new clj(clm.ow)),
   j(new clj(clm.qP)),
   k(new clj(cvc.dI)),
   l(new clj(clm.oY), new clj(clm.pN)),
   m(new clj(clm.qP)),
   n(new clj(clm.pU)),
   o(new clj(clm.fE)),
   p(new clj(clm.pQ)),
   q(new clj(clm.pU)),
   r(new clj(clm.hA));

   public static final List<etm> s = ImmutableList.of(m, n);
   public static final List<etm> t = ImmutableList.of(j, k, l);
   public static final List<etm> u = ImmutableList.of(f, g, h, i);
   public static final List<etm> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<etm, List<etm>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<clj> x;

   private etm(clj... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<etm> a(cia $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<clj> a() {
      return this.x;
   }
}
