import javax.annotation.Nullable;

public abstract class frt extends frv implements fty {
   @Nullable
   private ftz a;
   private boolean c;

   public frt(int $$0, int $$1, int $$2, int $$3, wy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aG_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public ftz aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ftz $$0) {
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
   public frl a(fwf $$0) {
      return fty.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return fty.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return fty.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return fty.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aI_() {
      return fty.super.aI_();
   }

   @Override
   public void a(boolean $$0) {
      fty.super.a($$0);
   }
}
