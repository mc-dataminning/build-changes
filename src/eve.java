import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eve {
   private static final asy a = asy.codepoint(32, vo.a);

   private static String a(String $$0) {
      return etd.N().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<asy> a(uw $$0, int $$1, eum $$2) {
      est $$3 = new est();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(uw.a(a($$2x), $$1x));
         return Optional.empty();
      }, vo.a);
      List<asy> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, vo.a, ($$1x, $$2x) -> {
         asy $$3x = ru.a().a($$1x);
         $$4.add($$2x ? asy.composite(a, $$3x) : $$3x);
      });
      return (List<asy>)($$4.isEmpty() ? Lists.newArrayList(new asy[]{asy.a}) : $$4);
   }
}
