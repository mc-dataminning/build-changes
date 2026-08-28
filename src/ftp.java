import javax.annotation.Nullable;

public abstract class ftp extends ftr implements fvu {
   @Nullable
   private fvv a;
   private boolean c;

   public ftp(int $$0, int $$1, int $$2, int $$3, xg $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aM_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public fvv aN_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fvv $$0) {
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
   public fth a(fyb $$0) {
      return fvu.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return fvu.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return fvu.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return fvu.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aO_() {
      return fvu.super.aO_();
   }

   @Override
   public void a(boolean $$0) {
      fvu.super.a($$0);
   }
}
