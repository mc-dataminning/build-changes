import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class esq {
   private static final arf a = arf.codepoint(32, ue.a);

   private static String a(String $$0) {
      return eqq.O().m.H().c() ? $$0 : n.a($$0);
   }

   public static List<arf> a(tm $$0, int $$1, ery $$2) {
      eqg $$3 = new eqg();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(tm.a(a($$2x), $$1x));
         return Optional.empty();
      }, ue.a);
      List<arf> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ue.a, ($$1x, $$2x) -> {
         arf $$3x = qp.a().a($$1x);
         $$4.add($$2x ? arf.composite(a, $$3x) : $$3x);
      });
      return (List<arf>)($$4.isEmpty() ? Lists.newArrayList(new arf[]{arf.a}) : $$4);
   }
}
