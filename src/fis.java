import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fis {
   private static final axy a = axy.codepoint(32, yb.a);

   private static String a(String $$0) {
      return fgj.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<axy> a(xj $$0, int $$1, fhy $$2) {
      ffz $$3 = new ffz();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xj.a(a($$2x), $$1x));
         return Optional.empty();
      }, yb.a);
      List<axy> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yb.a, ($$1x, $$2x) -> {
         axy $$3x = uf.a().a($$1x);
         $$4.add($$2x ? axy.composite(a, $$3x) : $$3x);
      });
      return (List<axy>)($$4.isEmpty() ? Lists.newArrayList(new axy[]{axy.a}) : $$4);
   }
}
