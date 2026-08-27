import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eqz {
   a(new cja(cjd.qe)),
   b(new cja(csr.cj)),
   c(new cja(cjd.ll)),
   d(new cja(cjd.op), new cja(cjd.oh)),
   e(new cja(cjd.pM), new cja(cjd.nF)),
   f(new cja(cjd.qe)),
   g(new cja(cjd.pj)),
   h(new cja(csr.b)),
   i(new cja(cjd.pM), new cja(cjd.nL)),
   j(new cja(cjd.qe)),
   k(new cja(csr.dI)),
   l(new cja(cjd.on), new cja(cjd.pc)),
   m(new cja(cjd.qe)),
   n(new cja(cjd.pj)),
   o(new cja(cjd.fj)),
   p(new cja(cjd.pf)),
   q(new cja(cjd.pj)),
   r(new cja(cjd.hf));

   public static final List<eqz> s = ImmutableList.of(m, n);
   public static final List<eqz> t = ImmutableList.of(j, k, l);
   public static final List<eqz> u = ImmutableList.of(f, g, h, i);
   public static final List<eqz> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eqz, List<eqz>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cja> x;

   private eqz(cja... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eqz> a(cfr $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cja> a() {
      return this.x;
   }
}
