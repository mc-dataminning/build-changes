import javax.annotation.Nullable;

public class fml extends fnf {
   @Nullable
   private fhr a;

   public fml(xp $$0) {
      super($$0);
   }

   @Override
   protected void aM_() {
      this.a = this.c(new fhr(this.n, this.l, this.p, 12));
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
   public boolean aC_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.a($$3);
      this.a($$0);
   }
}
