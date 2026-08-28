import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fhe {
   private static final ayg a = ayg.codepoint(32, yi.a);

   private static String a(String $$0) {
      return ffa.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<ayg> a(xq $$0, int $$1, fgk $$2) {
      feq $$3 = new feq();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xq.a(a($$2x), $$1x));
         return Optional.empty();
      }, yi.a);
      List<ayg> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yi.a, ($$1x, $$2x) -> {
         ayg $$3x = um.a().a($$1x);
         $$4.add($$2x ? ayg.composite(a, $$3x) : $$3x);
      });
      return (List<ayg>)($$4.isEmpty() ? Lists.newArrayList(new ayg[]{ayg.a}) : $$4);
   }
}
