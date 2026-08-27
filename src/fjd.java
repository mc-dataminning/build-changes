import javax.annotation.Nullable;

public class fjd extends fjx {
   @Nullable
   private fej a;

   public fjd(wi $$0) {
      super($$0);
   }

   @Override
   protected void aM_() {
      this.a = this.c(new fej(this.k, this.i, this.m, 12));
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
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.a($$3);
      this.a($$0);
   }
}
