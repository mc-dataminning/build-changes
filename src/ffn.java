import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffn {
   a(new cup(cus.qS)),
   b(new cup(dfb.cj)),
   c(new cup(cus.lH)),
   d(new cup(cus.pd), new cup(cus.oV)),
   e(new cup(cus.qA), new cup(cus.ot)),
   f(new cup(cus.qS)),
   g(new cup(cus.pX)),
   h(new cup(dfb.b)),
   i(new cup(cus.qA), new cup(cus.oz)),
   j(new cup(cus.qS)),
   k(new cup(dfb.dI)),
   l(new cup(cus.pb), new cup(cus.pQ)),
   m(new cup(cus.qS)),
   n(new cup(cus.pX)),
   o(new cup(cus.fF)),
   p(new cup(cus.pT)),
   q(new cup(cus.pX)),
   r(new cup(cus.hB));

   public static final List<ffn> s = ImmutableList.of(m, n);
   public static final List<ffn> t = ImmutableList.of(j, k, l);
   public static final List<ffn> u = ImmutableList.of(f, g, h, i);
   public static final List<ffn> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffn, List<ffn>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cup> x;

   private ffn(final cup... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffn> a(cri $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cup> a() {
      return this.x;
   }
}
