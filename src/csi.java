import java.util.List;
import org.apache.commons.lang3.Validate;

public class csi extends cvy {
   public csi(dex $$0, dex $$1, cui.a $$2) {
      super($$0, $$1, $$2, je.a);
      Validate.isInstanceOf(ddo.class, $$0);
      Validate.isInstanceOf(ddo.class, $$1);
   }

   public static void a(cun $$0, List<xo> $$1) {
      dow $$2 = $$0.a(km.W);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dow.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public ctg b() {
      return ((ddo)this.d()).b();
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      a($$0, $$2);
   }
}
