import javax.annotation.Nullable;

public abstract class fnx extends fod implements fqc {
   @Nullable
   private fqd a;
   private boolean b;

   public fnx(int $$0, int $$1, int $$2, int $$3, xv $$4) {
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
   public fqd aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fqd $$0) {
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
   public fnp a(fsj $$0) {
      return fqc.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fqc.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fqc.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fqc.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aN_() {
      return fqc.super.aN_();
   }

   @Override
   public void a(boolean $$0) {
      fqc.super.a($$0);
   }
}
