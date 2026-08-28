import java.util.List;
import org.apache.commons.lang3.Validate;

public class cur extends cyb {
   public cur(djl $$0, djl $$1, cwk.a $$2) {
      super($$0, $$1, jn.a, $$2);
      Validate.isInstanceOf(dic.class, $$0);
      Validate.isInstanceOf(dic.class, $$1);
   }

   public static void a(cwo $$0, List<wp> $$1) {
      dtp $$2 = $$0.a(kv.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dtp.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cvl b() {
      return ((dic)this.d()).b();
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      a($$0, $$2);
   }
}
