import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fgw {
   a(new cuq(cut.qS)),
   b(new cuq(dga.cj)),
   c(new cuq(cut.lH)),
   d(new cuq(cut.pe), new cuq(cut.oW)),
   e(new cuq(cut.qA), new cuq(cut.ou)),
   f(new cuq(cut.qS)),
   g(new cuq(cut.pX)),
   h(new cuq(dga.b)),
   i(new cuq(cut.qA), new cuq(cut.oA)),
   j(new cuq(cut.qS)),
   k(new cuq(dga.dI)),
   l(new cuq(cut.pc), new cuq(cut.pQ)),
   m(new cuq(cut.qS)),
   n(new cuq(cut.pX)),
   o(new cuq(cut.fF)),
   p(new cuq(cut.pT)),
   q(new cuq(cut.pX)),
   r(new cuq(cut.hB));

   public static final List<fgw> s = ImmutableList.of(m, n);
   public static final List<fgw> t = ImmutableList.of(j, k, l);
   public static final List<fgw> u = ImmutableList.of(f, g, h, i);
   public static final List<fgw> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fgw, List<fgw>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cuq> x;

   private fgw(final cuq... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fgw> a(crj $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cuq> a() {
      return this.x;
   }
}
