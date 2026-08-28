import javax.annotation.Nullable;

public abstract class fkg extends fkm implements fmk {
   @Nullable
   private fml a;
   private boolean b;

   public fkg(int $$0, int $$1, int $$2, int $$3, xe $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aL_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fml aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fml $$0) {
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
   public fjy a(fos $$0) {
      return fmk.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fmk.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fmk.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fmk.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aN_() {
      return fmk.super.aN_();
   }

   @Override
   public void a(boolean $$0) {
      fmk.super.a($$0);
   }
}
