import javax.annotation.Nullable;

public abstract class exj extends exp implements ezl {
   @Nullable
   private ezm a;
   private boolean b;

   public exj(int $$0, int $$1, int $$2, int $$3, vg $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aI_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public ezm aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ezm $$0) {
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
   public exb a(fbq $$0) {
      return ezl.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return ezl.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return ezl.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return ezl.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aK_() {
      return ezl.super.aK_();
   }

   @Override
   public void a(boolean $$0) {
      ezl.super.a($$0);
   }
}
