import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fgf {
   private static final axr a = axr.codepoint(32, xu.a);

   private static String a(String $$0) {
      return feb.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axr> a(xc $$0, int $$1, ffl $$2) {
      fdr $$3 = new fdr();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xc.a(a($$2x), $$1x));
         return Optional.empty();
      }, xu.a);
      List<axr> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xu.a, ($$1x, $$2x) -> {
         axr $$3x = ty.a().a($$1x);
         $$4.add($$2x ? axr.composite(a, $$3x) : $$3x);
      });
      return (List<axr>)($$4.isEmpty() ? Lists.newArrayList(new axr[]{axr.a}) : $$4);
   }
}
