import java.util.List;
import org.apache.commons.lang3.Validate;

public class crz extends cvo {
   public crz(dfi $$0, dfi $$1, cty.a $$2) {
      super($$0, $$1, $$2, jf.a);
      Validate.isInstanceOf(ddz.class, $$0);
      Validate.isInstanceOf(ddz.class, $$1);
   }

   public static void a(cud $$0, List<wu> $$1) {
      dph $$2 = $$0.a(kn.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dph.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public csw b() {
      return ((ddz)this.d()).b();
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      a($$0, $$2);
   }
}
