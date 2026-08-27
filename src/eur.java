import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eur {
   private static final asu a = asu.codepoint(32, vo.a);

   private static String a(String $$0) {
      return esr.N().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<asu> a(uw $$0, int $$1, etz $$2) {
      esh $$3 = new esh();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(uw.a(a($$2x), $$1x));
         return Optional.empty();
      }, vo.a);
      List<asu> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, vo.a, ($$1x, $$2x) -> {
         asu $$3x = ru.a().a($$1x);
         $$4.add($$2x ? asu.composite(a, $$3x) : $$3x);
      });
      return (List<asu>)($$4.isEmpty() ? Lists.newArrayList(new asu[]{asu.a}) : $$4);
   }
}
