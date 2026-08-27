import java.util.function.BooleanSupplier;

public class fgx extends fgh {
   private final BooleanSupplier h;

   public fgx(String $$0, int $$1, String $$2, BooleanSupplier $$3) {
      super($$0, ezx.b.a, $$1, $$2);
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
