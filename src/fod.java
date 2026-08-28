import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fod {
   private static final azg a = azg.codepoint(32, yh.a);

   private static String a(String $$0) {
      return flz.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<azg> a(xp $$0, int $$1, fnj $$2) {
      fln $$3 = new fln();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xp.a(a($$2x), $$1x));
         return Optional.empty();
      }, yh.a);
      List<azg> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yh.a, ($$1x, $$2x) -> {
         azg $$3x = uh.a().a($$1x);
         $$4.add($$2x ? azg.composite(a, $$3x) : $$3x);
      });
      return (List<azg>)($$4.isEmpty() ? Lists.newArrayList(new azg[]{azg.a}) : $$4);
   }
}
