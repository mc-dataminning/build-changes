import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fiw {
   a(new cvs(cvw.qT)),
   b(new cvs(dho.cj)),
   c(new cvs(cvw.lH)),
   d(new cvs(cvw.pf), new cvs(cvw.oX)),
   e(new cvs(cvw.qB), new cvs(cvw.ov)),
   f(new cvs(cvw.qT)),
   g(new cvs(cvw.pY)),
   h(new cvs(dho.b)),
   i(new cvs(cvw.qB), new cvs(cvw.oB)),
   j(new cvs(cvw.qT)),
   k(new cvs(dho.dI)),
   l(new cvs(cvw.pd), new cvs(cvw.pR)),
   m(new cvs(cvw.qT)),
   n(new cvs(cvw.pY)),
   o(new cvs(cvw.fF)),
   p(new cvs(cvw.pU)),
   q(new cvs(cvw.pY)),
   r(new cvs(cvw.hB));

   public static final List<fiw> s = ImmutableList.of(m, n);
   public static final List<fiw> t = ImmutableList.of(j, k, l);
   public static final List<fiw> u = ImmutableList.of(f, g, h, i);
   public static final List<fiw> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fiw, List<fiw>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cvs> x;

   private fiw(final cvs... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fiw> a(csp $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cvs> a() {
      return this.x;
   }
}
