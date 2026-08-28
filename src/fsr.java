import javax.annotation.Nullable;

public abstract class fsr extends fst implements fuw {
   @Nullable
   private fux a;
   private boolean c;

   public fsr(int $$0, int $$1, int $$2, int $$3, wy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aH_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public fux aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fux $$0) {
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
   public fsj a(fxd $$0) {
      return fuw.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return fuw.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return fuw.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return fuw.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aJ_() {
      return fuw.super.aJ_();
   }

   @Override
   public void a(boolean $$0) {
      fuw.super.a($$0);
   }
}
