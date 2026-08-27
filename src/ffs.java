import javax.annotation.Nullable;

public abstract class ffs extends ffy implements fhv {
   @Nullable
   private fhw a;
   private boolean b;

   public ffs(int $$0, int $$1, int $$2, int $$3, wx $$4) {
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
   public fhw aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fhw $$0) {
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
   public ffk a(fkc $$0) {
      return fhv.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fhv.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fhv.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fhv.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aJ_() {
      return fhv.super.aJ_();
   }

   @Override
   public void a(boolean $$0) {
      fhv.super.a($$0);
   }
}
