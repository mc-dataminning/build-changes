import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fgs {
   a(new cuh(cuk.sp)),
   b(new cuh(dfe.cU)),
   c(new cuh(cuk.mW)),
   d(new cuh(cuk.qw), new cuh(cuk.qo)),
   e(new cuh(cuk.rX), new cuh(cuk.pJ)),
   f(new cuh(cuk.sp)),
   g(new cuh(cuk.rs)),
   h(new cuh(dfe.b)),
   i(new cuh(cuk.rX), new cuh(cuk.pP)),
   j(new cuh(cuk.sp)),
   k(new cuh(dfe.ew)),
   l(new cuh(cuk.qu), new cuh(cuk.rj)),
   m(new cuh(cuk.sp)),
   n(new cuh(cuk.rs)),
   o(new cuh(cuk.gS)),
   p(new cuh(cuk.rm)),
   q(new cuh(cuk.rs)),
   r(new cuh(cuk.iP));

   public static final List<fgs> s = ImmutableList.of(m, n);
   public static final List<fgs> t = ImmutableList.of(j, k, l);
   public static final List<fgs> u = ImmutableList.of(f, g, h, i);
   public static final List<fgs> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fgs, List<fgs>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cuh> x;

   private fgs(cuh... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fgs> a(cqx $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cuh> a() {
      return this.x;
   }
}
