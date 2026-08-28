import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fgb {
   a(new cuc(cuf.qS)),
   b(new cuc(dfj.cj)),
   c(new cuc(cuf.lH)),
   d(new cuc(cuf.pe), new cuc(cuf.oW)),
   e(new cuc(cuf.qA), new cuc(cuf.ou)),
   f(new cuc(cuf.qS)),
   g(new cuc(cuf.pX)),
   h(new cuc(dfj.b)),
   i(new cuc(cuf.qA), new cuc(cuf.oA)),
   j(new cuc(cuf.qS)),
   k(new cuc(dfj.dI)),
   l(new cuc(cuf.pc), new cuc(cuf.pQ)),
   m(new cuc(cuf.qS)),
   n(new cuc(cuf.pX)),
   o(new cuc(cuf.fF)),
   p(new cuc(cuf.pT)),
   q(new cuc(cuf.pX)),
   r(new cuc(cuf.hB));

   public static final List<fgb> s = ImmutableList.of(m, n);
   public static final List<fgb> t = ImmutableList.of(j, k, l);
   public static final List<fgb> u = ImmutableList.of(f, g, h, i);
   public static final List<fgb> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fgb, List<fgb>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cuc> x;

   private fgb(final cuc... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fgb> a(cqw $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cuc> a() {
      return this.x;
   }
}
