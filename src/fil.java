import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fil {
   private static final axz a = axz.codepoint(32, xv.a);

   private static String a(String $$0) {
      return fgi.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axz> a(xd $$0, int $$1, fhr $$2) {
      ffx $$3 = new ffx();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xd.a(a($$2x), $$1x));
         return Optional.empty();
      }, xv.a);
      List<axz> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xv.a, ($$1x, $$2x) -> {
         axz $$3x = tv.a().a($$1x);
         $$4.add($$2x ? axz.composite(a, $$3x) : $$3x);
      });
      return (List<axz>)($$4.isEmpty() ? Lists.newArrayList(new axz[]{axz.a}) : $$4);
   }
}
