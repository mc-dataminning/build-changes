import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class esp {
   private static final arn a = arn.codepoint(32, ui.a);

   private static String a(String $$0) {
      return eqp.O().m.H().c() ? $$0 : n.a($$0);
   }

   public static List<arn> a(tq $$0, int $$1, erx $$2) {
      eqf $$3 = new eqf();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(tq.a(a($$2x), $$1x));
         return Optional.empty();
      }, ui.a);
      List<arn> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ui.a, ($$1x, $$2x) -> {
         arn $$3x = qr.a().a($$1x);
         $$4.add($$2x ? arn.composite(a, $$3x) : $$3x);
      });
      return (List<arn>)($$4.isEmpty() ? Lists.newArrayList(new arn[]{arn.a}) : $$4);
   }
}
