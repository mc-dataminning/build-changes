import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eto {
   private static final ask a = ask.codepoint(32, vf.a);

   private static String a(String $$0) {
      return ero.O().m.H().c() ? $$0 : n.a($$0);
   }

   public static List<ask> a(un $$0, int $$1, esw $$2) {
      ere $$3 = new ere();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(un.a(a($$2x), $$1x));
         return Optional.empty();
      }, vf.a);
      List<ask> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, vf.a, ($$1x, $$2x) -> {
         ask $$3x = ro.a().a($$1x);
         $$4.add($$2x ? ask.composite(a, $$3x) : $$3x);
      });
      return (List<ask>)($$4.isEmpty() ? Lists.newArrayList(new ask[]{ask.a}) : $$4);
   }
}
