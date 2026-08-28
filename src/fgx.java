import javax.annotation.Nullable;

public abstract class fgx extends fhd implements fja {
   @Nullable
   private fjb a;
   private boolean b;

   public fgx(int $$0, int $$1, int $$2, int $$3, xp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aF_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fjb aG_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fjb $$0) {
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
   public fgp a(flh $$0) {
      return fja.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fja.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fja.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fja.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aH_() {
      return fja.super.aH_();
   }

   @Override
   public void a(boolean $$0) {
      fja.super.a($$0);
   }
}
