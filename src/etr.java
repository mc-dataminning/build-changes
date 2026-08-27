import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum etr {
   a(new clo(clr.qP)),
   b(new clo(cvh.cj)),
   c(new clo(clr.lG)),
   d(new clo(clr.pa), new clo(clr.oS)),
   e(new clo(clr.qx), new clo(clr.oq)),
   f(new clo(clr.qP)),
   g(new clo(clr.pU)),
   h(new clo(cvh.b)),
   i(new clo(clr.qx), new clo(clr.ow)),
   j(new clo(clr.qP)),
   k(new clo(cvh.dI)),
   l(new clo(clr.oY), new clo(clr.pN)),
   m(new clo(clr.qP)),
   n(new clo(clr.pU)),
   o(new clo(clr.fE)),
   p(new clo(clr.pQ)),
   q(new clo(clr.pU)),
   r(new clo(clr.hA));

   public static final List<etr> s = ImmutableList.of(m, n);
   public static final List<etr> t = ImmutableList.of(j, k, l);
   public static final List<etr> u = ImmutableList.of(f, g, h, i);
   public static final List<etr> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<etr, List<etr>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<clo> x;

   private etr(clo... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<etr> a(cif $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<clo> a() {
      return this.x;
   }
}
