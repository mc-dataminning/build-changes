import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fhr {
   private static final axq a = axq.codepoint(32, xr.a);

   private static String a(String $$0) {
      return ffn.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axq> a(wz $$0, int $$1, fgx $$2) {
      ffd $$3 = new ffd();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wz.a(a($$2x), $$1x));
         return Optional.empty();
      }, xr.a);
      List<axq> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xr.a, ($$1x, $$2x) -> {
         axq $$3x = ts.a().a($$1x);
         $$4.add($$2x ? axq.composite(a, $$3x) : $$3x);
      });
      return (List<axq>)($$4.isEmpty() ? Lists.newArrayList(new axq[]{axq.a}) : $$4);
   }
}
