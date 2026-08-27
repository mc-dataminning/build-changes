import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class crz extends cwa {
   public crz(dfc $$0, dfc $$1, cuc.a $$2) {
      super($$0, $$1, $$2, iw.a);
      Validate.isInstanceOf(dds.class, $$0);
      Validate.isInstanceOf(dds.class, $$1);
   }

   public static void a(cuh $$0, List<xe> $$1) {
      dps $$2 = $$0.a(ke.W);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dps.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public csy b() {
      return ((dds)this.d()).b();
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      a($$0, $$2);
   }
}
