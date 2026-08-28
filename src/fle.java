import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fle {
   private static final ayv a = ayv.codepoint(32, ye.a);

   private static String a(String $$0) {
      return fja.Q().n.M().c() ? $$0 : n.a($$0);
   }

   public static List<ayv> a(xm $$0, int $$1, fkk $$2) {
      fio $$3 = new fio();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xm.a(a($$2x), $$1x));
         return Optional.empty();
      }, ye.a);
      List<ayv> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, ye.a, ($$1x, $$2x) -> {
         ayv $$3x = ue.a().a($$1x);
         $$4.add($$2x ? ayv.composite(a, $$3x) : $$3x);
      });
      return (List<ayv>)($$4.isEmpty() ? Lists.newArrayList(new ayv[]{ayv.a}) : $$4);
   }
}
