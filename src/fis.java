import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fis {
   a(new cvp(cvt.qT)),
   b(new cvp(dhl.cj)),
   c(new cvp(cvt.lH)),
   d(new cvp(cvt.pf), new cvp(cvt.oX)),
   e(new cvp(cvt.qB), new cvp(cvt.ov)),
   f(new cvp(cvt.qT)),
   g(new cvp(cvt.pY)),
   h(new cvp(dhl.b)),
   i(new cvp(cvt.qB), new cvp(cvt.oB)),
   j(new cvp(cvt.qT)),
   k(new cvp(dhl.dI)),
   l(new cvp(cvt.pd), new cvp(cvt.pR)),
   m(new cvp(cvt.qT)),
   n(new cvp(cvt.pY)),
   o(new cvp(cvt.fF)),
   p(new cvp(cvt.pU)),
   q(new cvp(cvt.pY)),
   r(new cvp(cvt.hB));

   public static final List<fis> s = ImmutableList.of(m, n);
   public static final List<fis> t = ImmutableList.of(j, k, l);
   public static final List<fis> u = ImmutableList.of(f, g, h, i);
   public static final List<fis> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fis, List<fis>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cvp> x;

   private fis(final cvp... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fis> a(csm $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cvp> a() {
      return this.x;
   }
}
