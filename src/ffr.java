import javax.annotation.Nullable;

public abstract class ffr extends ffx implements fhu {
   @Nullable
   private fhv a;
   private boolean b;

   public ffr(int $$0, int $$1, int $$2, int $$3, wx $$4) {
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
   public fhv aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fhv $$0) {
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
   public ffj a(fkb $$0) {
      return fhu.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fhu.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fhu.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fhu.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aI_() {
      return fhu.super.aI_();
   }

   @Override
   public void a(boolean $$0) {
      fhu.super.a($$0);
   }
}
