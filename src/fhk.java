import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fhk {
   private static final ayl a = ayl.codepoint(32, ym.a);

   private static String a(String $$0) {
      return ffg.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<ayl> a(xu $$0, int $$1, fgq $$2) {
      few $$3 = new few();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xu.a(a($$2x), $$1x));
         return Optional.empty();
      }, ym.a);
      List<ayl> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ym.a, ($$1x, $$2x) -> {
         ayl $$3x = un.a().a($$1x);
         $$4.add($$2x ? ayl.composite(a, $$3x) : $$3x);
      });
      return (List<ayl>)($$4.isEmpty() ? Lists.newArrayList(new ayl[]{ayl.a}) : $$4);
   }
}
