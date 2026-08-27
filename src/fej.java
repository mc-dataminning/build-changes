import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fej {
   a(new ctq(ctt.qS)),
   b(new ctq(dec.cj)),
   c(new ctq(ctt.lH)),
   d(new ctq(ctt.pd), new ctq(ctt.oV)),
   e(new ctq(ctt.qA), new ctq(ctt.ot)),
   f(new ctq(ctt.qS)),
   g(new ctq(ctt.pX)),
   h(new ctq(dec.b)),
   i(new ctq(ctt.qA), new ctq(ctt.oz)),
   j(new ctq(ctt.qS)),
   k(new ctq(dec.dI)),
   l(new ctq(ctt.pb), new ctq(ctt.pQ)),
   m(new ctq(ctt.qS)),
   n(new ctq(ctt.pX)),
   o(new ctq(ctt.fF)),
   p(new ctq(ctt.pT)),
   q(new ctq(ctt.pX)),
   r(new ctq(ctt.hB));

   public static final List<fej> s = ImmutableList.of(m, n);
   public static final List<fej> t = ImmutableList.of(j, k, l);
   public static final List<fej> u = ImmutableList.of(f, g, h, i);
   public static final List<fej> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fej, List<fej>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<ctq> x;

   private fej(ctq... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fej> a(cqj $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<ctq> a() {
      return this.x;
   }
}
