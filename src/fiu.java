import javax.annotation.Nullable;

public class fiu extends fjo {
   @Nullable
   private fea a;

   public fiu(wg $$0) {
      super($$0);
   }

   @Override
   protected void aN_() {
      this.a = this.c(new fea(this.k, this.i, this.m, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.k);
         this.a.c(this.k / 2 - this.a.x() / 2, this.l / 2 - 9 / 2);
      }
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.a($$3);
      this.a($$0);
   }
}
