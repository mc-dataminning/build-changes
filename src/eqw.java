import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eqw {
   a(new ciw(ciz.qe)),
   b(new ciw(csl.cj)),
   c(new ciw(ciz.ll)),
   d(new ciw(ciz.op), new ciw(ciz.oh)),
   e(new ciw(ciz.pM), new ciw(ciz.nF)),
   f(new ciw(ciz.qe)),
   g(new ciw(ciz.pj)),
   h(new ciw(csl.b)),
   i(new ciw(ciz.pM), new ciw(ciz.nL)),
   j(new ciw(ciz.qe)),
   k(new ciw(csl.dI)),
   l(new ciw(ciz.on), new ciw(ciz.pc)),
   m(new ciw(ciz.qe)),
   n(new ciw(ciz.pj)),
   o(new ciw(ciz.fj)),
   p(new ciw(ciz.pf)),
   q(new ciw(ciz.pj)),
   r(new ciw(ciz.hf));

   public static final List<eqw> s = ImmutableList.of(m, n);
   public static final List<eqw> t = ImmutableList.of(j, k, l);
   public static final List<eqw> u = ImmutableList.of(f, g, h, i);
   public static final List<eqw> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eqw, List<eqw>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<ciw> x;

   private eqw(ciw... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eqw> a(cfn $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<ciw> a() {
      return this.x;
   }
}
