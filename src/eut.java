import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum eut {
   a(new cmh(cmk.qP)),
   b(new cmh(cwb.cj)),
   c(new cmh(cmk.lG)),
   d(new cmh(cmk.pa), new cmh(cmk.oS)),
   e(new cmh(cmk.qx), new cmh(cmk.oq)),
   f(new cmh(cmk.qP)),
   g(new cmh(cmk.pU)),
   h(new cmh(cwb.b)),
   i(new cmh(cmk.qx), new cmh(cmk.ow)),
   j(new cmh(cmk.qP)),
   k(new cmh(cwb.dI)),
   l(new cmh(cmk.oY), new cmh(cmk.pN)),
   m(new cmh(cmk.qP)),
   n(new cmh(cmk.pU)),
   o(new cmh(cmk.fE)),
   p(new cmh(cmk.pQ)),
   q(new cmh(cmk.pU)),
   r(new cmh(cmk.hA));

   public static final List<eut> s = ImmutableList.of(m, n);
   public static final List<eut> t = ImmutableList.of(j, k, l);
   public static final List<eut> u = ImmutableList.of(f, g, h, i);
   public static final List<eut> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<eut, List<eut>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cmh> x;

   private eut(cmh... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<eut> a(ciy $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cmh> a() {
      return this.x;
   }
}
