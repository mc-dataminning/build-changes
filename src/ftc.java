import javax.annotation.Nullable;

public class ftc extends ftr {
   @Nullable
   private foj a;

   public ftc(xv $$0) {
      super($$0);
   }

   @Override
   protected void aT_() {
      this.a = this.c(new foj(this.n, this.l, this.p, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.n);
         this.a.c(this.n / 2 - this.a.y() / 2, this.o / 2 - 9 / 2);
      }
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.q();
      this.a($$0);
   }
}
