import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fap {
   private static final avy a = avy.codepoint(32, wp.a);

   private static String a(String $$0) {
      return eyk.P().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<avy> a(vx $$0, int $$1, ezv $$2) {
      eya $$3 = new eya();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vx.a(a($$2x), $$1x));
         return Optional.empty();
      }, wp.a);
      List<avy> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wp.a, ($$1x, $$2x) -> {
         avy $$3x = st.a().a($$1x);
         $$4.add($$2x ? avy.composite(a, $$3x) : $$3x);
      });
      return (List<avy>)($$4.isEmpty() ? Lists.newArrayList(new avy[]{avy.a}) : $$4);
   }
}
