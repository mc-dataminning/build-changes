import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fez {
   private static final axi a = axi.codepoint(32, xp.a);

   private static String a(String $$0) {
      return fcu.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axi> a(wx $$0, int $$1, fef $$2) {
      fck $$3 = new fck();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wx.a(a($$2x), $$1x));
         return Optional.empty();
      }, xp.a);
      List<axi> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xp.a, ($$1x, $$2x) -> {
         axi $$3x = tt.a().a($$1x);
         $$4.add($$2x ? axi.composite(a, $$3x) : $$3x);
      });
      return (List<axi>)($$4.isEmpty() ? Lists.newArrayList(new axi[]{axi.a}) : $$4);
   }
}
