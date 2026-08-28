import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fov {
   private static final ayk a = ayk.codepoint(32, xl.a);

   private static String a(String $$0) {
      return flh.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<ayk> a(wt $$0, int $$1, fnz $$2) {
      fkv $$3 = new fkv();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wt.a(a($$2x), $$1x));
         return Optional.empty();
      }, xl.a);
      List<ayk> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xl.a, ($$1x, $$2x) -> {
         ayk $$3x = tl.a().a($$1x);
         $$4.add($$2x ? ayk.composite(a, $$3x) : $$3x);
      });
      return (List<ayk>)($$4.isEmpty() ? Lists.newArrayList(new ayk[]{ayk.a}) : $$4);
   }
}
