import java.util.List;
import org.apache.commons.lang3.Validate;

public class cut extends cyd {
   public cut(djn $$0, djn $$1, cwm.a $$2) {
      super($$0, $$1, jn.a, $$2);
      Validate.isInstanceOf(die.class, $$0);
      Validate.isInstanceOf(die.class, $$1);
   }

   public static void a(cwq $$0, List<wp> $$1) {
      dtr $$2 = $$0.a(kv.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dtr.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cvn b() {
      return ((die)this.d()).b();
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      a($$0, $$2);
   }
}
