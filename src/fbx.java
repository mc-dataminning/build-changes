import javax.annotation.Nullable;

public class fbx extends fbg {
   private final fat a;

   public fbx(fat $$0, vu $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fav $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.B() + this.w() / 2;
      int $$5 = this.C() + this.u() / 2;
      vu $$6 = this.x();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fgs.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(ffe $$0) {
   }

   @Override
   public void a(gnt $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public fas a(ffk $$0) {
      return null;
   }
}
