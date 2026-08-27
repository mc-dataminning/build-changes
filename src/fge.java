import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fge {
   private static final axq a = axq.codepoint(32, xu.a);

   private static String a(String $$0) {
      return fdz.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axq> a(xc $$0, int $$1, ffk $$2) {
      fdp $$3 = new fdp();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xc.a(a($$2x), $$1x));
         return Optional.empty();
      }, xu.a);
      List<axq> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xu.a, ($$1x, $$2x) -> {
         axq $$3x = ty.a().a($$1x);
         $$4.add($$2x ? axq.composite(a, $$3x) : $$3x);
      });
      return (List<axq>)($$4.isEmpty() ? Lists.newArrayList(new axq[]{axq.a}) : $$4);
   }
}
