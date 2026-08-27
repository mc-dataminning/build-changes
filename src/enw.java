import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum enw {
   a(new cfz(cgc.qe)),
   b(new cfz(cpo.cj)),
   c(new cfz(cgc.ll)),
   d(new cfz(cgc.op), new cfz(cgc.oh)),
   e(new cfz(cgc.pM), new cfz(cgc.nF)),
   f(new cfz(cgc.qe)),
   g(new cfz(cgc.pj)),
   h(new cfz(cpo.b)),
   i(new cfz(cgc.pM), new cfz(cgc.nL)),
   j(new cfz(cgc.qe)),
   k(new cfz(cpo.dI)),
   l(new cfz(cgc.on), new cfz(cgc.pc)),
   m(new cfz(cgc.qe)),
   n(new cfz(cgc.pj)),
   o(new cfz(cgc.fj)),
   p(new cfz(cgc.pf)),
   q(new cfz(cgc.pj)),
   r(new cfz(cgc.hf));

   public static final List<enw> s = ImmutableList.of(m, n);
   public static final List<enw> t = ImmutableList.of(j, k, l);
   public static final List<enw> u = ImmutableList.of(f, g, h, i);
   public static final List<enw> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<enw, List<enw>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cfz> x;

   private enw(cfz... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<enw> a(ccq $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cfz> a() {
      return this.x;
   }
}
