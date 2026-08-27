import java.util.function.BooleanSupplier;

public class esc extends erm {
   private final BooleanSupplier h;

   public esc(String $$0, int $$1, String $$2, BooleanSupplier $$3) {
      super($$0, elc.b.a, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public void a(boolean $$0) {
      if (this.h.getAsBoolean()) {
         if ($$0) {
            super.a(!this.e());
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void n() {
      super.a(false);
   }
}
