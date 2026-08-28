import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffm {
   a(new cuo(cur.qS)),
   b(new cuo(dfa.cj)),
   c(new cuo(cur.lH)),
   d(new cuo(cur.pd), new cuo(cur.oV)),
   e(new cuo(cur.qA), new cuo(cur.ot)),
   f(new cuo(cur.qS)),
   g(new cuo(cur.pX)),
   h(new cuo(dfa.b)),
   i(new cuo(cur.qA), new cuo(cur.oz)),
   j(new cuo(cur.qS)),
   k(new cuo(dfa.dI)),
   l(new cuo(cur.pb), new cuo(cur.pQ)),
   m(new cuo(cur.qS)),
   n(new cuo(cur.pX)),
   o(new cuo(cur.fF)),
   p(new cuo(cur.pT)),
   q(new cuo(cur.pX)),
   r(new cuo(cur.hB));

   public static final List<ffm> s = ImmutableList.of(m, n);
   public static final List<ffm> t = ImmutableList.of(j, k, l);
   public static final List<ffm> u = ImmutableList.of(f, g, h, i);
   public static final List<ffm> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffm, List<ffm>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cuo> x;

   private ffm(final cuo... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffm> a(crh $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cuo> a() {
      return this.x;
   }
}
