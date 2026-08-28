import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fsh {
   private static final ayy a = ayy.codepoint(32, xv.a);

   private static String a(String $$0) {
      return fos.Q().n.N().c() ? $$0 : n.a($$0);
   }

   public static List<ayy> a(xd $$0, int $$1, frm $$2) {
      fof $$3 = new fof();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xd.a(a($$2x), $$1x));
         return Optional.empty();
      }, xv.a);
      List<ayy> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xv.a, ($$1x, $$2x) -> {
         ayy $$3x = tu.a().a($$1x);
         $$4.add($$2x ? ayy.composite(a, $$3x) : $$3x);
      });
      return (List<ayy>)($$4.isEmpty() ? Lists.newArrayList(new ayy[]{ayy.a}) : $$4);
   }
}
