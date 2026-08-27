import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cpn extends cta {
   public cpn(dch $$0, dch $$1, crn.a $$2) {
      super($$0, $$1, $$2, ij.a);
      Validate.isInstanceOf(day.class, $$0);
      Validate.isInstanceOf(day.class, $$1);
   }

   public static void a(crs $$0, List<wi> $$1) {
      dmf $$2 = $$0.a(jr.N);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dmf.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cql b() {
      return ((day)this.d()).b();
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      a($$0, $$2);
   }
}
