import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class crj extends cuz {
   public crj(ddy $$0, ddy $$1, ctj.a $$2) {
      super($$0, $$1, $$2, it.a);
      Validate.isInstanceOf(dcp.class, $$0);
      Validate.isInstanceOf(dcp.class, $$1);
   }

   public static void a(cto $$0, List<wx> $$1) {
      dnx $$2 = $$0.a(kb.W);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dnx.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public csh b() {
      return ((dcp)this.d()).b();
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      a($$0, $$2);
   }
}
