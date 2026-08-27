import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class exl {
   private static final aua a = aua.codepoint(32, wc.a);

   private static String a(String $$0) {
      return evi.O().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<aua> a(vk $$0, int $$1, ews $$2) {
      euy $$3 = new euy();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vk.a(a($$2x), $$1x));
         return Optional.empty();
      }, wc.a);
      List<aua> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wc.a, ($$1x, $$2x) -> {
         aua $$3x = si.a().a($$1x);
         $$4.add($$2x ? aua.composite(a, $$3x) : $$3x);
      });
      return (List<aua>)($$4.isEmpty() ? Lists.newArrayList(new aua[]{aua.a}) : $$4);
   }
}
