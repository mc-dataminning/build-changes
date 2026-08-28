import java.util.List;
import org.apache.commons.lang3.Validate;

public class cup extends cxz {
   public cup(diq $$0, diq $$1, cwi.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(dhh.class, $$0);
      Validate.isInstanceOf(dhh.class, $$1);
   }

   public static void a(cwm $$0, List<xj> $$1) {
      dsp $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dsp.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cvj b() {
      return ((dhh)this.d()).b();
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      a($$0, $$2);
   }
}
