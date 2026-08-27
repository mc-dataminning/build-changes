import javax.annotation.Nullable;

public class fbv extends fbe {
   private final far a;

   public fbv(far $$0, vu $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fat $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.B() + this.w() / 2;
      int $$5 = this.C() + this.u() / 2;
      vu $$6 = this.x();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fgq.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(ffc $$0) {
   }

   @Override
   public void a(gnq $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public faq a(ffi $$0) {
      return null;
   }
}
