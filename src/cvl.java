import java.util.Map;
import javax.annotation.Nullable;

public class cvl extends cry {
   protected final dff a;
   private final jf b;

   public cvl(dff $$0, dff $$1, ctv.a $$2, jf $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcg $$0, dsh $$1, ja $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsh c(cxk $$0) {
      dsh $$1 = this.a.a($$0);
      dsh $$2 = null;
      dcg $$3 = $$0.q();
      ja $$4 = $$0.a();

      for (jf $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsh $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ewe.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dff, ctv> $$0, ctv $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
