import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fge {
   a(new cud(cug.qS)),
   b(new cud(dfk.cj)),
   c(new cud(cug.lH)),
   d(new cud(cug.pe), new cud(cug.oW)),
   e(new cud(cug.qA), new cud(cug.ou)),
   f(new cud(cug.qS)),
   g(new cud(cug.pX)),
   h(new cud(dfk.b)),
   i(new cud(cug.qA), new cud(cug.oA)),
   j(new cud(cug.qS)),
   k(new cud(dfk.dI)),
   l(new cud(cug.pc), new cud(cug.pQ)),
   m(new cud(cug.qS)),
   n(new cud(cug.pX)),
   o(new cud(cug.fF)),
   p(new cud(cug.pT)),
   q(new cud(cug.pX)),
   r(new cud(cug.hB));

   public static final List<fge> s = ImmutableList.of(m, n);
   public static final List<fge> t = ImmutableList.of(j, k, l);
   public static final List<fge> u = ImmutableList.of(f, g, h, i);
   public static final List<fge> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fge, List<fge>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cud> x;

   private fge(final cud... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fge> a(cqx $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cud> a() {
      return this.x;
   }
}
