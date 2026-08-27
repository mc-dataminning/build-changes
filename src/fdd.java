import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fdd {
   a(new csd(csg.qS)),
   b(new csd(dcx.cj)),
   c(new csd(csg.lH)),
   d(new csd(csg.pd), new csd(csg.oV)),
   e(new csd(csg.qA), new csd(csg.ot)),
   f(new csd(csg.qS)),
   g(new csd(csg.pX)),
   h(new csd(dcx.b)),
   i(new csd(csg.qA), new csd(csg.oz)),
   j(new csd(csg.qS)),
   k(new csd(dcx.dI)),
   l(new csd(csg.pb), new csd(csg.pQ)),
   m(new csd(csg.qS)),
   n(new csd(csg.pX)),
   o(new csd(csg.fF)),
   p(new csd(csg.pT)),
   q(new csd(csg.pX)),
   r(new csd(csg.hB));

   public static final List<fdd> s = ImmutableList.of(m, n);
   public static final List<fdd> t = ImmutableList.of(j, k, l);
   public static final List<fdd> u = ImmutableList.of(f, g, h, i);
   public static final List<fdd> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fdd, List<fdd>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<csd> x;

   private fdd(csd... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fdd> a(cow $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<csd> a() {
      return this.x;
   }
}
