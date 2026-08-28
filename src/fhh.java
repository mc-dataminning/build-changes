import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fhh {
   private static final ayj a = ayj.codepoint(32, yl.a);

   private static String a(String $$0) {
      return ffd.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<ayj> a(xt $$0, int $$1, fgn $$2) {
      fet $$3 = new fet();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xt.a(a($$2x), $$1x));
         return Optional.empty();
      }, yl.a);
      List<ayj> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yl.a, ($$1x, $$2x) -> {
         ayj $$3x = um.a().a($$1x);
         $$4.add($$2x ? ayj.composite(a, $$3x) : $$3x);
      });
      return (List<ayj>)($$4.isEmpty() ? Lists.newArrayList(new ayj[]{ayj.a}) : $$4);
   }
}
