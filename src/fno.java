import javax.annotation.Nullable;

public class fno extends fod {
   @Nullable
   private fix a;

   public fno(wz $$0) {
      super($$0);
   }

   @Override
   protected void aT_() {
      this.a = this.c(new fix(this.m, this.k, this.o, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.m);
         this.a.c(this.m / 2 - this.a.y() / 2, this.n / 2 - 9 / 2);
      }
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.a($$3);
      this.a($$0);
   }
}
