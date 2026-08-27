import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cqu extends cui {
   public cqu(dde $$0, dde $$1, csu.a $$2) {
      super($$0, $$1, $$2, is.a);
      Validate.isInstanceOf(dbv.class, $$0);
      Validate.isInstanceOf(dbv.class, $$1);
   }

   public static void a(csz $$0, List<wu> $$1) {
      dnd $$2 = $$0.a(ka.U);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dnd.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public crs b() {
      return ((dbv)this.d()).b();
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      a($$0, $$2);
   }
}
