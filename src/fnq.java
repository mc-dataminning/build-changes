import javax.annotation.Nullable;

public abstract class fnq extends fnw implements fpv {
   @Nullable
   private fpw a;
   private boolean b;

   public fnq(int $$0, int $$1, int $$2, int $$3, xk $$4) {
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
   public fpw aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fpw $$0) {
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
   public fni a(fsc $$0) {
      return fpv.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fpv.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fpv.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fpv.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aN_() {
      return fpv.super.aN_();
   }

   @Override
   public void a(boolean $$0) {
      fpv.super.a($$0);
   }
}
