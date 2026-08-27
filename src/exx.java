import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum exx {
   a(new cpd(cpg.qR)),
   b(new cpd(cyu.cj)),
   c(new cpd(cpg.lG)),
   d(new cpd(cpg.pc), new cpd(cpg.oU)),
   e(new cpd(cpg.qz), new cpd(cpg.os)),
   f(new cpd(cpg.qR)),
   g(new cpd(cpg.pW)),
   h(new cpd(cyu.b)),
   i(new cpd(cpg.qz), new cpd(cpg.oy)),
   j(new cpd(cpg.qR)),
   k(new cpd(cyu.dI)),
   l(new cpd(cpg.pa), new cpd(cpg.pP)),
   m(new cpd(cpg.qR)),
   n(new cpd(cpg.pW)),
   o(new cpd(cpg.fE)),
   p(new cpd(cpg.pS)),
   q(new cpd(cpg.pW)),
   r(new cpd(cpg.hA));

   public static final List<exx> s = ImmutableList.of(m, n);
   public static final List<exx> t = ImmutableList.of(j, k, l);
   public static final List<exx> u = ImmutableList.of(f, g, h, i);
   public static final List<exx> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<exx, List<exx>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cpd> x;

   private exx(cpd... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<exx> a(clt $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cpd> a() {
      return this.x;
   }
}
