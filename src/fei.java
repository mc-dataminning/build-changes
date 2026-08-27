import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fei {
   a(new cto(ctr.qS)),
   b(new cto(dea.cj)),
   c(new cto(ctr.lH)),
   d(new cto(ctr.pd), new cto(ctr.oV)),
   e(new cto(ctr.qA), new cto(ctr.ot)),
   f(new cto(ctr.qS)),
   g(new cto(ctr.pX)),
   h(new cto(dea.b)),
   i(new cto(ctr.qA), new cto(ctr.oz)),
   j(new cto(ctr.qS)),
   k(new cto(dea.dI)),
   l(new cto(ctr.pb), new cto(ctr.pQ)),
   m(new cto(ctr.qS)),
   n(new cto(ctr.pX)),
   o(new cto(ctr.fF)),
   p(new cto(ctr.pT)),
   q(new cto(ctr.pX)),
   r(new cto(ctr.hB));

   public static final List<fei> s = ImmutableList.of(m, n);
   public static final List<fei> t = ImmutableList.of(j, k, l);
   public static final List<fei> u = ImmutableList.of(f, g, h, i);
   public static final List<fei> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fei, List<fei>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cto> x;

   private fei(cto... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fei> a(cqh $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cto> a() {
      return this.x;
   }
}
