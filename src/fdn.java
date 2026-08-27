import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum fdn {
   a(new csz(ctc.qS)),
   b(new csz(ddg.cj)),
   c(new csz(ctc.lH)),
   d(new csz(ctc.pd), new csz(ctc.oV)),
   e(new csz(ctc.qA), new csz(ctc.ot)),
   f(new csz(ctc.qS)),
   g(new csz(ctc.pX)),
   h(new csz(ddg.b)),
   i(new csz(ctc.qA), new csz(ctc.oz)),
   j(new csz(ctc.qS)),
   k(new csz(ddg.dI)),
   l(new csz(ctc.pb), new csz(ctc.pQ)),
   m(new csz(ctc.qS)),
   n(new csz(ctc.pX)),
   o(new csz(ctc.fF)),
   p(new csz(ctc.pT)),
   q(new csz(ctc.pX)),
   r(new csz(ctc.hB));

   public static final List<fdn> s = ImmutableList.of(m, n);
   public static final List<fdn> t = ImmutableList.of(j, k, l);
   public static final List<fdn> u = ImmutableList.of(f, g, h, i);
   public static final List<fdn> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<fdn, List<fdn>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<csz> x;

   private fdn(csz... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<fdn> a(cps $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<csz> a() {
      return this.x;
   }
}
