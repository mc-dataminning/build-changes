import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffo {
   a(new cuq(cut.qS)),
   b(new cuq(dfc.cj)),
   c(new cuq(cut.lH)),
   d(new cuq(cut.pd), new cuq(cut.oV)),
   e(new cuq(cut.qA), new cuq(cut.ot)),
   f(new cuq(cut.qS)),
   g(new cuq(cut.pX)),
   h(new cuq(dfc.b)),
   i(new cuq(cut.qA), new cuq(cut.oz)),
   j(new cuq(cut.qS)),
   k(new cuq(dfc.dI)),
   l(new cuq(cut.pb), new cuq(cut.pQ)),
   m(new cuq(cut.qS)),
   n(new cuq(cut.pX)),
   o(new cuq(cut.fF)),
   p(new cuq(cut.pT)),
   q(new cuq(cut.pX)),
   r(new cuq(cut.hB));

   public static final List<ffo> s = ImmutableList.of(m, n);
   public static final List<ffo> t = ImmutableList.of(j, k, l);
   public static final List<ffo> u = ImmutableList.of(f, g, h, i);
   public static final List<ffo> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffo, List<ffo>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cuq> x;

   private ffo(final cuq... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffo> a(crj $$0) {
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
