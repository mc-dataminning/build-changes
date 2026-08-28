import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fqs {
   private static final ayw a = ayw.codepoint(32, xs.a);

   private static String a(String $$0) {
      return fnd.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<ayw> a(xa $$0, int $$1, fpx $$2) {
      fmr $$3 = new fmr();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xa.a(a($$2x), $$1x));
         return Optional.empty();
      }, xs.a);
      List<ayw> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xs.a, ($$1x, $$2x) -> {
         ayw $$3x = tr.a().a($$1x);
         $$4.add($$2x ? ayw.composite(a, $$3x) : $$3x);
      });
      return (List<ayw>)($$4.isEmpty() ? Lists.newArrayList(new ayw[]{ayw.a}) : $$4);
   }
}
