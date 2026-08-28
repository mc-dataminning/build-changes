import javax.annotation.Nullable;

public class fmu extends fnj {
   @Nullable
   private fid a;

   public fmu(wu $$0) {
      super($$0);
   }

   @Override
   protected void aP_() {
      this.a = this.c(new fid(this.m, this.k, this.o, 12));
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
   public boolean aF_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.a($$3);
      this.a($$0);
   }
}
