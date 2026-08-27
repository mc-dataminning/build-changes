import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ffj {
   private static final axl a = axl.codepoint(32, xr.a);

   private static String a(String $$0) {
      return fde.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axl> a(wz $$0, int $$1, fep $$2) {
      fcu $$3 = new fcu();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wz.a(a($$2x), $$1x));
         return Optional.empty();
      }, xr.a);
      List<axl> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xr.a, ($$1x, $$2x) -> {
         axl $$3x = tv.a().a($$1x);
         $$4.add($$2x ? axl.composite(a, $$3x) : $$3x);
      });
      return (List<axl>)($$4.isEmpty() ? Lists.newArrayList(new axl[]{axl.a}) : $$4);
   }
}
