import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fed {
   private static final awy a = awy.codepoint(32, xf.a);

   private static String a(String $$0) {
      return fby.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<awy> a(wn $$0, int $$1, fdj $$2) {
      fbo $$3 = new fbo();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wn.a(a($$2x), $$1x));
         return Optional.empty();
      }, xf.a);
      List<awy> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xf.a, ($$1x, $$2x) -> {
         awy $$3x = tj.a().a($$1x);
         $$4.add($$2x ? awy.composite(a, $$3x) : $$3x);
      });
      return (List<awy>)($$4.isEmpty() ? Lists.newArrayList(new awy[]{awy.a}) : $$4);
   }
}
