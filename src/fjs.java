import javax.annotation.Nullable;

public abstract class fjs extends fjy implements flw {
   @Nullable
   private flx a;
   private boolean b;

   public fjs(int $$0, int $$1, int $$2, int $$3, xd $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aM_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public flx aN_() {
      return this.a;
   }

   @Override
   public void a(@Nullable flx $$0) {
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
   public fjk a(fod $$0) {
      return flw.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return flw.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return flw.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return flw.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aO_() {
      return flw.super.aO_();
   }

   @Override
   public void a(boolean $$0) {
      flw.super.a($$0);
   }
}
