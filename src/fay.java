import javax.annotation.Nullable;

public abstract class fay extends fbe implements fdb {
   @Nullable
   private fdc a;
   private boolean b;

   public fay(int $$0, int $$1, int $$2, int $$3, vu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aH_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fdc aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fdc $$0) {
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
   public faq a(ffi $$0) {
      return fdb.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fdb.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fdb.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fdb.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aJ_() {
      return fdb.super.aJ_();
   }

   @Override
   public void a(boolean $$0) {
      fdb.super.a($$0);
   }
}
