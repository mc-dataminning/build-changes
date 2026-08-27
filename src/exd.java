import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class exd {
   private static final atu a = atu.codepoint(32, wa.a);

   private static String a(String $$0) {
      return eva.N().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<atu> a(vi $$0, int $$1, ewk $$2) {
      euq $$3 = new euq();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vi.a(a($$2x), $$1x));
         return Optional.empty();
      }, wa.a);
      List<atu> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wa.a, ($$1x, $$2x) -> {
         atu $$3x = sg.a().a($$1x);
         $$4.add($$2x ? atu.composite(a, $$3x) : $$3x);
      });
      return (List<atu>)($$4.isEmpty() ? Lists.newArrayList(new atu[]{atu.a}) : $$4);
   }
}
