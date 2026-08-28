import javax.annotation.Nullable;

public class fld extends fkm {
   private final fjz a;

   public fld(fjz $$0, xe $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fkb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.D() + this.y() / 2;
      int $$5 = this.E() + this.w() / 2;
      xe $$6 = this.z();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fpw.a(ad.c());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(fol $$0) {
   }

   @Override
   public void a(hcf $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fjy a(fos $$0) {
      return null;
   }
}
