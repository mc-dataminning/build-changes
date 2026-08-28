import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fkp {
   private static final ayp a = ayp.codepoint(32, ya.a);

   private static String a(String $$0) {
      return fil.Q().n.M().c() ? $$0 : n.a($$0);
   }

   public static List<ayp> a(xi $$0, int $$1, fjv $$2) {
      fhz $$3 = new fhz();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xi.a(a($$2x), $$1x));
         return Optional.empty();
      }, ya.a);
      List<ayp> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ya.a, ($$1x, $$2x) -> {
         ayp $$3x = ua.a().a($$1x);
         $$4.add($$2x ? ayp.composite(a, $$3x) : $$3x);
      });
      return (List<ayp>)($$4.isEmpty() ? Lists.newArrayList(new ayp[]{ayp.a}) : $$4);
   }
}
