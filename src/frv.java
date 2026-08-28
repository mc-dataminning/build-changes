import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class frv {
   private static final ayw a = ayw.codepoint(32, xt.a);

   private static String a(String $$0) {
      return fof.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<ayw> a(xb $$0, int $$1, fra $$2) {
      fnt $$3 = new fnt();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xb.a(a($$2x), $$1x));
         return Optional.empty();
      }, xt.a);
      List<ayw> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xt.a, ($$1x, $$2x) -> {
         ayw $$3x = ts.a().a($$1x);
         $$4.add($$2x ? ayw.composite(a, $$3x) : $$3x);
      });
      return (List<ayw>)($$4.isEmpty() ? Lists.newArrayList(new ayw[]{ayw.a}) : $$4);
   }
}
