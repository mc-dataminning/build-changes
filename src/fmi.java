import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fmi {
   private static final ayy a = ayy.codepoint(32, yg.a);

   private static String a(String $$0) {
      return fke.Q().n.M().c() ? $$0 : n.a($$0);
   }

   public static List<ayy> a(xo $$0, int $$1, flo $$2) {
      fjs $$3 = new fjs();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xo.a(a($$2x), $$1x));
         return Optional.empty();
      }, yg.a);
      List<ayy> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yg.a, ($$1x, $$2x) -> {
         ayy $$3x = ug.a().a($$1x);
         $$4.add($$2x ? ayy.composite(a, $$3x) : $$3x);
      });
      return (List<ayy>)($$4.isEmpty() ? Lists.newArrayList(new ayy[]{ayy.a}) : $$4);
   }
}
