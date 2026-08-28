import java.util.List;
import org.apache.commons.lang3.Validate;

public class cry extends cvn {
   public cry(dfh $$0, dfh $$1, ctx.a $$2) {
      super($$0, $$1, $$2, jf.a);
      Validate.isInstanceOf(ddy.class, $$0);
      Validate.isInstanceOf(ddy.class, $$1);
   }

   public static void a(cuc $$0, List<wu> $$1) {
      dpg $$2 = $$0.a(kn.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dpg.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public csv b() {
      return ((ddy)this.d()).b();
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      a($$0, $$2);
   }
}
