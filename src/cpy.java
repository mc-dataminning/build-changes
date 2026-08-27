import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cpy extends ctm {
   public cpy(dcv $$0, dcv $$1, cry.a $$2) {
      super($$0, $$1, $$2, ir.a);
      Validate.isInstanceOf(dbm.class, $$0);
      Validate.isInstanceOf(dbm.class, $$1);
   }

   public static void a(csd $$0, List<ws> $$1) {
      dmu $$2 = $$0.a(jz.N);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dmu.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cqw b() {
      return ((dbm)this.d()).b();
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      a($$0, $$2);
   }
}
