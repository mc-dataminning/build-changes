import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffv {
   a(new cua(cud.qS)),
   b(new cua(dfh.cj)),
   c(new cua(cud.lH)),
   d(new cua(cud.pd), new cua(cud.oV)),
   e(new cua(cud.qA), new cua(cud.ot)),
   f(new cua(cud.qS)),
   g(new cua(cud.pX)),
   h(new cua(dfh.b)),
   i(new cua(cud.qA), new cua(cud.oz)),
   j(new cua(cud.qS)),
   k(new cua(dfh.dI)),
   l(new cua(cud.pb), new cua(cud.pQ)),
   m(new cua(cud.qS)),
   n(new cua(cud.pX)),
   o(new cua(cud.fF)),
   p(new cua(cud.pT)),
   q(new cua(cud.pX)),
   r(new cua(cud.hB));

   public static final List<ffv> s = ImmutableList.of(m, n);
   public static final List<ffv> t = ImmutableList.of(j, k, l);
   public static final List<ffv> u = ImmutableList.of(f, g, h, i);
   public static final List<ffv> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffv, List<ffv>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cua> x;

   private ffv(final cua... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffv> a(cqt $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cua> a() {
      return this.x;
   }
}
