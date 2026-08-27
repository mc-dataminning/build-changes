import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum equ {
   a(new cix(cja.qe)),
   b(new cix(csm.cj)),
   c(new cix(cja.ll)),
   d(new cix(cja.op), new cix(cja.oh)),
   e(new cix(cja.pM), new cix(cja.nF)),
   f(new cix(cja.qe)),
   g(new cix(cja.pj)),
   h(new cix(csm.b)),
   i(new cix(cja.pM), new cix(cja.nL)),
   j(new cix(cja.qe)),
   k(new cix(csm.dI)),
   l(new cix(cja.on), new cix(cja.pc)),
   m(new cix(cja.qe)),
   n(new cix(cja.pj)),
   o(new cix(cja.fj)),
   p(new cix(cja.pf)),
   q(new cix(cja.pj)),
   r(new cix(cja.hf));

   public static final List<equ> s = ImmutableList.of(m, n);
   public static final List<equ> t = ImmutableList.of(j, k, l);
   public static final List<equ> u = ImmutableList.of(f, g, h, i);
   public static final List<equ> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<equ, List<equ>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cix> x;

   private equ(cix... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<equ> a(cfo $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cix> a() {
      return this.x;
   }
}
