import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eta {
   a(new clb(cle.qe)),
   b(new clb(cuv.cj)),
   c(new clb(cle.ll)),
   d(new clb(cle.op), new clb(cle.oh)),
   e(new clb(cle.pM), new clb(cle.nF)),
   f(new clb(cle.qe)),
   g(new clb(cle.pj)),
   h(new clb(cuv.b)),
   i(new clb(cle.pM), new clb(cle.nL)),
   j(new clb(cle.qe)),
   k(new clb(cuv.dI)),
   l(new clb(cle.on), new clb(cle.pc)),
   m(new clb(cle.qe)),
   n(new clb(cle.pj)),
   o(new clb(cle.fj)),
   p(new clb(cle.pf)),
   q(new clb(cle.pj)),
   r(new clb(cle.hf));

   public static final List<eta> s = ImmutableList.of(m, n);
   public static final List<eta> t = ImmutableList.of(j, k, l);
   public static final List<eta> u = ImmutableList.of(f, g, h, i);
   public static final List<eta> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eta, List<eta>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<clb> x;

   private eta(clb... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eta> a(chs $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<clb> a() {
      return this.x;
   }
}
