import javax.annotation.Nullable;

public class fhu extends fhd {
   private final fgq a;

   public fhu(fgq $$0, xp $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fgs $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C() + this.x() / 2;
      int $$5 = this.D() + this.v() / 2;
      xp $$6 = this.y();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fmp.a(ac.c());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(flb $$0) {
   }

   @Override
   public void a(gtw $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgp a(flh $$0) {
      return null;
   }
}
