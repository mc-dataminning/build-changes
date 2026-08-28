import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fii {
   a(new cvl(cvo.qT)),
   b(new cvl(dgx.cj)),
   c(new cvl(cvo.lH)),
   d(new cvl(cvo.pf), new cvl(cvo.oX)),
   e(new cvl(cvo.qB), new cvl(cvo.ov)),
   f(new cvl(cvo.qT)),
   g(new cvl(cvo.pY)),
   h(new cvl(dgx.b)),
   i(new cvl(cvo.qB), new cvl(cvo.oB)),
   j(new cvl(cvo.qT)),
   k(new cvl(dgx.dI)),
   l(new cvl(cvo.pd), new cvl(cvo.pR)),
   m(new cvl(cvo.qT)),
   n(new cvl(cvo.pY)),
   o(new cvl(cvo.fF)),
   p(new cvl(cvo.pU)),
   q(new cvl(cvo.pY)),
   r(new cvl(cvo.hB));

   public static final List<fii> s = ImmutableList.of(m, n);
   public static final List<fii> t = ImmutableList.of(j, k, l);
   public static final List<fii> u = ImmutableList.of(f, g, h, i);
   public static final List<fii> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fii, List<fii>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cvl> x;

   private fii(final cvl... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fii> a(csg $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cvl> a() {
      return this.x;
   }
}
