import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fmb {
   private static final ayz a = ayz.codepoint(32, yi.a);

   private static String a(String $$0) {
      return fjx.Q().n.M().c() ? $$0 : n.a($$0);
   }

   public static List<ayz> a(xq $$0, int $$1, flh $$2) {
      fjl $$3 = new fjl();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xq.a(a($$2x), $$1x));
         return Optional.empty();
      }, yi.a);
      List<ayz> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yi.a, ($$1x, $$2x) -> {
         ayz $$3x = ui.a().a($$1x);
         $$4.add($$2x ? ayz.composite(a, $$3x) : $$3x);
      });
      return (List<ayz>)($$4.isEmpty() ? Lists.newArrayList(new ayz[]{ayz.a}) : $$4);
   }
}
