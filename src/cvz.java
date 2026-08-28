import java.util.Map;
import javax.annotation.Nullable;

public class cvz extends csm {
   protected final dey a;
   private final je b;

   public cvz(dey $$0, dey $$1, cuj.a $$2, je $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dca $$0, dsb $$1, iz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsb c(cxz $$0) {
      dsb $$1 = this.a.a($$0);
      dsb $$2 = null;
      dca $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsb $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, evv.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dey, cuj> $$0, cuj $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
