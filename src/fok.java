import javax.annotation.Nullable;

public abstract class fok extends fom implements fqq {
   @Nullable
   private fqr a;
   private boolean c;

   public fok(int $$0, int $$1, int $$2, int $$3, wp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aK_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public fqr aL_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fqr $$0) {
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
   public foc a(fsx $$0) {
      return fqq.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return fqq.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return fqq.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return fqq.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aM_() {
      return fqq.super.aM_();
   }

   @Override
   public void a(boolean $$0) {
      fqq.super.a($$0);
   }
}
