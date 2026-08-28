import javax.annotation.Nullable;

public abstract class fkr extends fkx implements fmv {
   @Nullable
   private fmw a;
   private boolean b;

   public fkr(int $$0, int $$1, int $$2, int $$3, xh $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aL_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fmw aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fmw $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }

   @Nullable
   @Override
   public fkj a(fpd $$0) {
      return fmv.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fmv.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fmv.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fmv.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aN_() {
      return fmv.super.aN_();
   }

   @Override
   public void a(boolean $$0) {
      fmv.super.a($$0);
   }
}
