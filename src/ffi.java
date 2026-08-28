import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum ffi {
   a(new cuk(cun.qS)),
   b(new cuk(dew.cj)),
   c(new cuk(cun.lH)),
   d(new cuk(cun.pd), new cuk(cun.oV)),
   e(new cuk(cun.qA), new cuk(cun.ot)),
   f(new cuk(cun.qS)),
   g(new cuk(cun.pX)),
   h(new cuk(dew.b)),
   i(new cuk(cun.qA), new cuk(cun.oz)),
   j(new cuk(cun.qS)),
   k(new cuk(dew.dI)),
   l(new cuk(cun.pb), new cuk(cun.pQ)),
   m(new cuk(cun.qS)),
   n(new cuk(cun.pX)),
   o(new cuk(cun.fF)),
   p(new cuk(cun.pT)),
   q(new cuk(cun.pX)),
   r(new cuk(cun.hB));

   public static final List<ffi> s = ImmutableList.of(m, n);
   public static final List<ffi> t = ImmutableList.of(j, k, l);
   public static final List<ffi> u = ImmutableList.of(f, g, h, i);
   public static final List<ffi> v = ImmutableList.of(a, d, b, e, c);
   public static final Map<ffi, List<ffi>> w = ImmutableMap.of(
      a, ImmutableList.of(d, b, e, c), f, ImmutableList.of(g, h, i), j, ImmutableList.of(k, l), m, ImmutableList.of(n)
   );
   private final List<cuk> x;

   private ffi(final cuk... $$0) {
      this.x = ImmutableList.copyOf($$0);
   }

   public static List<ffi> a(crd $$0) {
      return switch ($$0) {
         case a -> v;
         case b -> u;
         case c -> t;
         case d -> s;
      };
   }

   public List<cuk> a() {
      return this.x;
   }
}
