import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fhi {
   private static final ayk a = ayk.codepoint(32, yl.a);

   private static String a(String $$0) {
      return ffe.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<ayk> a(xt $$0, int $$1, fgo $$2) {
      feu $$3 = new feu();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xt.a(a($$2x), $$1x));
         return Optional.empty();
      }, yl.a);
      List<ayk> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yl.a, ($$1x, $$2x) -> {
         ayk $$3x = um.a().a($$1x);
         $$4.add($$2x ? ayk.composite(a, $$3x) : $$3x);
      });
      return (List<ayk>)($$4.isEmpty() ? Lists.newArrayList(new ayk[]{ayk.a}) : $$4);
   }
}
