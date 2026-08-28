import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fke {
   a(new cwf(cwj.qT)),
   b(new cwf(dil.cj)),
   c(new cwf(cwj.lH)),
   d(new cwf(cwj.pf), new cwf(cwj.oX)),
   e(new cwf(cwj.qB), new cwf(cwj.ov)),
   f(new cwf(cwj.qT)),
   g(new cwf(cwj.pY)),
   h(new cwf(dil.b)),
   i(new cwf(cwj.qB), new cwf(cwj.oB)),
   j(new cwf(cwj.qT)),
   k(new cwf(dil.dI)),
   l(new cwf(cwj.pd), new cwf(cwj.pR)),
   m(new cwf(cwj.qT)),
   n(new cwf(cwj.pY)),
   o(new cwf(cwj.fF)),
   p(new cwf(cwj.pU)),
   q(new cwf(cwj.pY)),
   r(new cwf(cwj.hB));

   public static final List<fke> s = ImmutableList.of(m, n);
   public static final List<fke> t = ImmutableList.of(j, k, l);
   public static final List<fke> u = ImmutableList.of(f, g, h, i);
   public static final List<fke> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fke, List<fke>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cwf> x;

   private fke(final cwf... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fke> a(cti $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cwf> a() {
      return this.x;
   }
}
