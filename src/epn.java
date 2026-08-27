import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class epn {
   private static final aom a = aom.codepoint(32, ts.a);

   private static String a(String $$0) {
      return enn.N().m.G().c() ? $$0 : n.a($$0);
   }

   public static List<aom> a(ta $$0, int $$1, eov $$2) {
      end $$3 = new end();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(ta.a(a($$2x), $$1x));
         return Optional.empty();
      }, ts.a);
      List<aom> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ts.a, ($$1x, $$2x) -> {
         aom $$3x = qm.a().a($$1x);
         $$4.add($$2x ? aom.composite(a, $$3x) : $$3x);
      });
      return (List<aom>)($$4.isEmpty() ? Lists.newArrayList(new aom[]{aom.a}) : $$4);
   }
}
