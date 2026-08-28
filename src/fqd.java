import javax.annotation.Nullable;

public class fqd extends fqs {
   @Nullable
   private flk a;

   public fqd(xh $$0) {
      super($$0);
   }

   @Override
   protected void aS_() {
      this.a = this.c(new flk(this.n, this.l, this.p, 12));
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
   public boolean aI_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.r();
      this.a($$0);
   }
}
