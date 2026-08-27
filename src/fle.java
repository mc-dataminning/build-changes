import javax.annotation.Nullable;

public class fle extends fly {
   @Nullable
   private fgk a;

   public fle(wx $$0) {
      super($$0);
   }

   @Override
   protected void aM_() {
      this.a = this.c(new fgk(this.n, this.l, this.p, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.n);
         this.a.c(this.n / 2 - this.a.x() / 2, this.o / 2 - 9 / 2);
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
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.a($$3);
      this.a($$0);
   }
}
