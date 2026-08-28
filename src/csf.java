import java.util.List;
import org.apache.commons.lang3.Validate;

public class csf extends cvv {
   public csf(deu $$0, deu $$1, cuf.a $$2) {
      super($$0, $$1, $$2, je.a);
      Validate.isInstanceOf(ddl.class, $$0);
      Validate.isInstanceOf(ddl.class, $$1);
   }

   public static void a(cuk $$0, List<xl> $$1) {
      dot $$2 = $$0.a(km.W);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dot.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public ctd b() {
      return ((ddl)this.d()).b();
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      a($$0, $$2);
   }
}
