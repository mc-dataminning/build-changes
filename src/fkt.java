import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fkt {
   private static final ayr a = ayr.codepoint(32, yb.a);

   private static String a(String $$0) {
      return fip.Q().n.M().c() ? $$0 : n.a($$0);
   }

   public static List<ayr> a(xj $$0, int $$1, fjz $$2) {
      fid $$3 = new fid();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xj.a(a($$2x), $$1x));
         return Optional.empty();
      }, yb.a);
      List<ayr> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yb.a, ($$1x, $$2x) -> {
         ayr $$3x = ub.a().a($$1x);
         $$4.add($$2x ? ayr.composite(a, $$3x) : $$3x);
      });
      return (List<ayr>)($$4.isEmpty() ? Lists.newArrayList(new ayr[]{ayr.a}) : $$4);
   }
}
