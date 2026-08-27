import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class exk {
   private static final atz a = atz.codepoint(32, wc.a);

   private static String a(String $$0) {
      return evh.O().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<atz> a(vk $$0, int $$1, ewr $$2) {
      eux $$3 = new eux();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vk.a(a($$2x), $$1x));
         return Optional.empty();
      }, wc.a);
      List<atz> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wc.a, ($$1x, $$2x) -> {
         atz $$3x = si.a().a($$1x);
         $$4.add($$2x ? atz.composite(a, $$3x) : $$3x);
      });
      return (List<atz>)($$4.isEmpty() ? Lists.newArrayList(new atz[]{atz.a}) : $$4);
   }
}
