import javax.annotation.Nullable;

public class ezw extends ezf {
   private final eys a;

   public ezw(eys $$0, vq $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(eyu $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.B() + this.w() / 2;
      int $$5 = this.C() + this.u() / 2;
      vq $$6 = this.x();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fep.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(fdc $$0) {
   }

   @Override
   public void a(gll $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public eyr a(fdi $$0) {
      return null;
   }
}
