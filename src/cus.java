import java.util.List;
import org.apache.commons.lang3.Validate;

public class cus extends cyc {
   public cus(djm $$0, djm $$1, cwl.a $$2) {
      super($$0, $$1, jn.a, $$2);
      Validate.isInstanceOf(did.class, $$0);
      Validate.isInstanceOf(did.class, $$1);
   }

   public static void a(cwp $$0, List<wp> $$1) {
      dtq $$2 = $$0.a(kv.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dtq.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cvm b() {
      return ((did)this.d()).b();
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      a($$0, $$2);
   }
}
