import javax.annotation.Nullable;

public abstract class fgv extends fhb implements fiy {
   @Nullable
   private fiz a;
   private boolean b;

   public fgv(int $$0, int $$1, int $$2, int $$3, xo $$4) {
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
   public fiz aG_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fiz $$0) {
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
   public fgn a(flf $$0) {
      return fiy.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fiy.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fiy.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fiy.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aH_() {
      return fiy.super.aH_();
   }

   @Override
   public void a(boolean $$0) {
      fiy.super.a($$0);
   }
}
