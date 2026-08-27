import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fbl {
   private static final awi a = awi.codepoint(32, wr.a);

   private static String a(String $$0) {
      return ezg.Q().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<awi> a(vz $$0, int $$1, far $$2) {
      eyw $$3 = new eyw();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vz.a(a($$2x), $$1x));
         return Optional.empty();
      }, wr.a);
      List<awi> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wr.a, ($$1x, $$2x) -> {
         awi $$3x = sv.a().a($$1x);
         $$4.add($$2x ? awi.composite(a, $$3x) : $$3x);
      });
      return (List<awi>)($$4.isEmpty() ? Lists.newArrayList(new awi[]{awi.a}) : $$4);
   }
}
