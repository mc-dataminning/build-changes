import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class exw {
   private static final aub a = aub.codepoint(32, wd.a);

   private static String a(String $$0) {
      return evr.O().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<aub> a(vl $$0, int $$1, exc $$2) {
      evh $$3 = new evh();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vl.a(a($$2x), $$1x));
         return Optional.empty();
      }, wd.a);
      List<aub> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wd.a, ($$1x, $$2x) -> {
         aub $$3x = sj.a().a($$1x);
         $$4.add($$2x ? aub.composite(a, $$3x) : $$3x);
      });
      return (List<aub>)($$4.isEmpty() ? Lists.newArrayList(new aub[]{aub.a}) : $$4);
   }
}
