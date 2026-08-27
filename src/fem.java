import javax.annotation.Nullable;

public abstract class fem extends fes implements fgp {
   @Nullable
   private fgq a;
   private boolean b;

   public fem(int $$0, int $$1, int $$2, int $$3, ws $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aG_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fgq aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fgq $$0) {
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
   public fee a(fiw $$0) {
      return fgp.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fgp.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fgp.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fgp.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aI_() {
      return fgp.super.aI_();
   }

   @Override
   public void a(boolean $$0) {
      fgp.super.a($$0);
   }
}
