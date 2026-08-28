import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class foj {
   private static final azq a = azq.codepoint(32, ys.a);

   private static String a(String $$0) {
      return fmf.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<azq> a(ya $$0, int $$1, fnp $$2) {
      flt $$3 = new flt();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(ya.a(a($$2x), $$1x));
         return Optional.empty();
      }, ys.a);
      List<azq> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ys.a, ($$1x, $$2x) -> {
         azq $$3x = us.a().a($$1x);
         $$4.add($$2x ? azq.composite(a, $$3x) : $$3x);
      });
      return (List<azq>)($$4.isEmpty() ? Lists.newArrayList(new azq[]{azq.a}) : $$4);
   }
}
