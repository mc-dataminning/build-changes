import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ezt {
   private static final avu a = avu.codepoint(32, wn.a);

   private static String a(String $$0) {
      return exo.P().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<avu> a(vv $$0, int $$1, eyz $$2) {
      exe $$3 = new exe();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vv.a(a($$2x), $$1x));
         return Optional.empty();
      }, wn.a);
      List<avu> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wn.a, ($$1x, $$2x) -> {
         avu $$3x = sr.a().a($$1x);
         $$4.add($$2x ? avu.composite(a, $$3x) : $$3x);
      });
      return (List<avu>)($$4.isEmpty() ? Lists.newArrayList(new avu[]{avu.a}) : $$4);
   }
}
