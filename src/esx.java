import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class esx {
   private static final arl a = arl.codepoint(32, uj.a);

   private static String a(String $$0) {
      return eqx.O().m.H().c() ? $$0 : n.a($$0);
   }

   public static List<arl> a(tr $$0, int $$1, esf $$2) {
      eqn $$3 = new eqn();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(tr.a(a($$2x), $$1x));
         return Optional.empty();
      }, uj.a);
      List<arl> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, uj.a, ($$1x, $$2x) -> {
         arl $$3x = qt.a().a($$1x);
         $$4.add($$2x ? arl.composite(a, $$3x) : $$3x);
      });
      return (List<arl>)($$4.isEmpty() ? Lists.newArrayList(new arl[]{arl.a}) : $$4);
   }
}
