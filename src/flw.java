import javax.annotation.Nullable;

public class flw extends flf {
   private final fks a;

   public flw(fks $$0, xi $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fku $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.D() + this.y() / 2;
      int $$5 = this.E() + this.w() / 2;
      xi $$6 = this.z();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fqp.a(ae.c());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(fpf $$0) {
   }

   @Override
   public void a(hdf $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fkr a(fpl $$0) {
      return null;
   }
}
