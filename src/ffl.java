import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffl {
   a(new cun(cuq.qS)),
   b(new cun(dez.cj)),
   c(new cun(cuq.lH)),
   d(new cun(cuq.pd), new cun(cuq.oV)),
   e(new cun(cuq.qA), new cun(cuq.ot)),
   f(new cun(cuq.qS)),
   g(new cun(cuq.pX)),
   h(new cun(dez.b)),
   i(new cun(cuq.qA), new cun(cuq.oz)),
   j(new cun(cuq.qS)),
   k(new cun(dez.dI)),
   l(new cun(cuq.pb), new cun(cuq.pQ)),
   m(new cun(cuq.qS)),
   n(new cun(cuq.pX)),
   o(new cun(cuq.fF)),
   p(new cun(cuq.pT)),
   q(new cun(cuq.pX)),
   r(new cun(cuq.hB));

   public static final List<ffl> s = ImmutableList.of(m, n);
   public static final List<ffl> t = ImmutableList.of(j, k, l);
   public static final List<ffl> u = ImmutableList.of(f, g, h, i);
   public static final List<ffl> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffl, List<ffl>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cun> x;

   private ffl(final cun... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffl> a(crg $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cun> a() {
      return this.x;
   }
}
