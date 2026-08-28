import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fkl {
   a(new cwm(cwq.qT)),
   b(new cwm(dis.cj)),
   c(new cwm(cwq.lH)),
   d(new cwm(cwq.pf), new cwm(cwq.oX)),
   e(new cwm(cwq.qB), new cwm(cwq.ov)),
   f(new cwm(cwq.qT)),
   g(new cwm(cwq.pY)),
   h(new cwm(dis.b)),
   i(new cwm(cwq.qB), new cwm(cwq.oB)),
   j(new cwm(cwq.qT)),
   k(new cwm(dis.dI)),
   l(new cwm(cwq.pd), new cwm(cwq.pR)),
   m(new cwm(cwq.qT)),
   n(new cwm(cwq.pY)),
   o(new cwm(cwq.fF)),
   p(new cwm(cwq.pU)),
   q(new cwm(cwq.pY)),
   r(new cwm(cwq.hB));

   public static final List<fkl> s = ImmutableList.of(m, n);
   public static final List<fkl> t = ImmutableList.of(j, k, l);
   public static final List<fkl> u = ImmutableList.of(f, g, h, i);
   public static final List<fkl> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fkl, List<fkl>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cwm> x;

   private fkl(final cwm... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fkl> a(ctp $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cwm> a() {
      return this.x;
   }
}
