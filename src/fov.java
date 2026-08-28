import javax.annotation.Nullable;

public class fov extends fod {
   private final fnq a;

   public fov(fnq $$0, xv $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fns $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.D() + this.y() / 2;
      int $$5 = this.E() + this.w() / 2;
      xv $$6 = this.z();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = ftn.a(ae.c());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(fsd $$0) {
   }

   @Override
   public void a(hgn $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fnp a(fsj $$0) {
      return null;
   }
}
