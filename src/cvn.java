import java.util.Map;
import javax.annotation.Nullable;

public class cvn extends csb {
   protected final dfh a;
   private final jf b;

   public cvn(dfh $$0, dfh $$1, ctx.a $$2, jf $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dci $$0, dsk $$1, ja $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsk c(cxm $$0) {
      dsk $$1 = this.a.a($$0);
      dsk $$2 = null;
      dci $$3 = $$0.q();
      ja $$4 = $$0.a();

      for (jf $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsk $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ewk.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfh, ctx> $$0, ctx $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
