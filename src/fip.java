import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fip {
   private static final aya a = aya.codepoint(32, xw.a);

   private static String a(String $$0) {
      return fgm.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<aya> a(xe $$0, int $$1, fhv $$2) {
      fgb $$3 = new fgb();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xe.a(a($$2x), $$1x));
         return Optional.empty();
      }, xw.a);
      List<aya> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xw.a, ($$1x, $$2x) -> {
         aya $$3x = tw.a().a($$1x);
         $$4.add($$2x ? aya.composite(a, $$3x) : $$3x);
      });
      return (List<aya>)($$4.isEmpty() ? Lists.newArrayList(new aya[]{aya.a}) : $$4);
   }
}
