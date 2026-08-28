import javax.annotation.Nullable;

public abstract class fgu extends fha implements fix {
   @Nullable
   private fiy a;
   private boolean b;

   public fgu(int $$0, int $$1, int $$2, int $$3, xo $$4) {
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
   public fiy aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fiy $$0) {
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
   public fgm a(fle $$0) {
      return fix.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fix.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fix.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fix.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aI_() {
      return fix.super.aI_();
   }

   @Override
   public void a(boolean $$0) {
      fix.super.a($$0);
   }
}
