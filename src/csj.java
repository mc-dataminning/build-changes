import java.util.List;
import org.apache.commons.lang3.Validate;

public class csj extends cvz {
   public csj(dey $$0, dey $$1, cuj.a $$2) {
      super($$0, $$1, $$2, je.a);
      Validate.isInstanceOf(ddp.class, $$0);
      Validate.isInstanceOf(ddp.class, $$1);
   }

   public static void a(cuo $$0, List<xo> $$1) {
      dox $$2 = $$0.a(km.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dox.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cth b() {
      return ((ddp)this.d()).b();
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      a($$0, $$2);
   }
}
