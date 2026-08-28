import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class flm {
   private static final ayw a = ayw.codepoint(32, yf.a);

   private static String a(String $$0) {
      return fji.Q().n.M().c() ? $$0 : n.a($$0);
   }

   public static List<ayw> a(xn $$0, int $$1, fks $$2) {
      fiw $$3 = new fiw();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xn.a(a($$2x), $$1x));
         return Optional.empty();
      }, yf.a);
      List<ayw> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yf.a, ($$1x, $$2x) -> {
         ayw $$3x = uf.a().a($$1x);
         $$4.add($$2x ? ayw.composite(a, $$3x) : $$3x);
      });
      return (List<ayw>)($$4.isEmpty() ? Lists.newArrayList(new ayw[]{ayw.a}) : $$4);
   }
}
