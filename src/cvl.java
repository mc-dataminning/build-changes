import java.util.List;
import org.apache.commons.lang3.Validate;

public class cvl extends cyt {
   public cvl(dke $$0, dke $$1, cxd.a $$2) {
      super($$0, $$1, jn.a, $$2);
      Validate.isInstanceOf(div.class, $$0);
      Validate.isInstanceOf(div.class, $$1);
   }

   public static void a(cxh $$0, List<wp> $$1) {
      duj $$2 = $$0.a(kv.ak);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            duj.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cwe b() {
      return ((div)this.d()).b();
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      a($$0, $$2);
   }
}
