import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fud {
   private static final azk a = azk.codepoint(32, yd.a);

   private static String a(String $$0) {
      return fqq.Q().n.N().c() ? $$0 : o.a($$0);
   }

   public static List<azk> a(xl $$0, int $$1, fti $$2) {
      fqe $$3 = new fqe();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xl.a(a($$2x), $$1x));
         return Optional.empty();
      }, yd.a);
      List<azk> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yd.a, ($$1x, $$2x) -> {
         azk $$3x = tv.a().a($$1x);
         $$4.add($$2x ? azk.composite(a, $$3x) : $$3x);
      });
      return (List<azk>)($$4.isEmpty() ? Lists.newArrayList(new azk[]{azk.a}) : $$4);
   }
}
