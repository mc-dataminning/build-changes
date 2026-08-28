import java.util.function.BooleanSupplier;

public class fmq extends fmd {
   private final BooleanSupplier h;

   public fmq(String $$0, int $$1, String $$2, BooleanSupplier $$3) {
      super($$0, ffm.b.a, $$1, $$2);
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
