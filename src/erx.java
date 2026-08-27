import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum erx {
   a(new ckj(ckm.qe)),
   b(new ckj(cuc.cj)),
   c(new ckj(ckm.ll)),
   d(new ckj(ckm.op), new ckj(ckm.oh)),
   e(new ckj(ckm.pM), new ckj(ckm.nF)),
   f(new ckj(ckm.qe)),
   g(new ckj(ckm.pj)),
   h(new ckj(cuc.b)),
   i(new ckj(ckm.pM), new ckj(ckm.nL)),
   j(new ckj(ckm.qe)),
   k(new ckj(cuc.dI)),
   l(new ckj(ckm.on), new ckj(ckm.pc)),
   m(new ckj(ckm.qe)),
   n(new ckj(ckm.pj)),
   o(new ckj(ckm.fj)),
   p(new ckj(ckm.pf)),
   q(new ckj(ckm.pj)),
   r(new ckj(ckm.hf));

   public static final List<erx> s = ImmutableList.of(m, n);
   public static final List<erx> t = ImmutableList.of(j, k, l);
   public static final List<erx> u = ImmutableList.of(f, g, h, i);
   public static final List<erx> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<erx, List<erx>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<ckj> x;

   private erx(ckj... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<erx> a(cha $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<ckj> a() {
      return this.x;
   }
}
