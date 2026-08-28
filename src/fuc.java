import javax.annotation.Nullable;

public abstract class fuc extends fue implements fwh {
   @Nullable
   private fwi a;
   private boolean c;

   public fuc(int $$0, int $$1, int $$2, int $$3, xa $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aL_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public fwi aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fwi $$0) {
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
   public ftu a(fyo $$0) {
      return fwh.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return fwh.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return fwh.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return fwh.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aN_() {
      return fwh.super.aN_();
   }

   @Override
   public void a(boolean $$0) {
      fwh.super.a($$0);
   }
}
