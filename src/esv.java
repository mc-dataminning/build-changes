import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class esv {
   private static final arj a = arj.codepoint(32, uh.a);

   private static String a(String $$0) {
      return eqv.O().m.H().c() ? $$0 : n.a($$0);
   }

   public static List<arj> a(tp $$0, int $$1, esd $$2) {
      eql $$3 = new eql();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(tp.a(a($$2x), $$1x));
         return Optional.empty();
      }, uh.a);
      List<arj> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, uh.a, ($$1x, $$2x) -> {
         arj $$3x = qr.a().a($$1x);
         $$4.add($$2x ? arj.composite(a, $$3x) : $$3x);
      });
      return (List<arj>)($$4.isEmpty() ? Lists.newArrayList(new arj[]{arj.a}) : $$4);
   }
}
