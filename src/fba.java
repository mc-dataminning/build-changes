import javax.annotation.Nullable;

public abstract class fba extends fbg implements fdd {
   @Nullable
   private fde a;
   private boolean b;

   public fba(int $$0, int $$1, int $$2, int $$3, vu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aH_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fde aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fde $$0) {
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
   public fas a(ffk $$0) {
      return fdd.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fdd.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fdd.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fdd.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aJ_() {
      return fdd.super.aJ_();
   }

   @Override
   public void a(boolean $$0) {
      fdd.super.a($$0);
   }
}
