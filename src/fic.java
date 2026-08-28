import javax.annotation.Nullable;

public abstract class fic extends fii implements fkf {
   @Nullable
   private fkg a;
   private boolean b;

   public fic(int $$0, int $$1, int $$2, int $$3, wz $$4) {
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
   public fkg aN_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fkg $$0) {
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
   public fhu a(fmm $$0) {
      return fkf.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fkf.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fkf.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fkf.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aO_() {
      return fkf.super.aO_();
   }

   @Override
   public void a(boolean $$0) {
      fkf.super.a($$0);
   }
}
