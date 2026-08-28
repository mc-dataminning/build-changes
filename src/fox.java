import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fox {
   private static final ayl a = ayl.codepoint(32, xm.a);

   private static String a(String $$0) {
      return fli.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<ayl> a(wu $$0, int $$1, fob $$2) {
      fkw $$3 = new fkw();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wu.a(a($$2x), $$1x));
         return Optional.empty();
      }, xm.a);
      List<ayl> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xm.a, ($$1x, $$2x) -> {
         ayl $$3x = tl.a().a($$1x);
         $$4.add($$2x ? ayl.composite(a, $$3x) : $$3x);
      });
      return (List<ayl>)($$4.isEmpty() ? Lists.newArrayList(new ayl[]{ayl.a}) : $$4);
   }
}
