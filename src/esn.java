import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class esn {
   private static final ara a = ara.codepoint(32, ua.a);

   private static String a(String $$0) {
      return eqn.N().m.G().c() ? $$0 : n.a($$0);
   }

   public static List<ara> a(ti $$0, int $$1, erv $$2) {
      eqd $$3 = new eqd();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(ti.a(a($$2x), $$1x));
         return Optional.empty();
      }, ua.a);
      List<ara> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ua.a, ($$1x, $$2x) -> {
         ara $$3x = qn.a().a($$1x);
         $$4.add($$2x ? ara.composite(a, $$3x) : $$3x);
      });
      return (List<ara>)($$4.isEmpty() ? Lists.newArrayList(new ara[]{ara.a}) : $$4);
   }
}
