import javax.annotation.Nullable;

public abstract class fhe extends fhk implements fjh {
   @Nullable
   private fji a;
   private boolean b;

   public fhe(int $$0, int $$1, int $$2, int $$3, wu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aH_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fji aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fji $$0) {
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
   public fgw a(flo $$0) {
      return fjh.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fjh.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fjh.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fjh.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aJ_() {
      return fjh.super.aJ_();
   }

   @Override
   public void a(boolean $$0) {
      fjh.super.a($$0);
   }
}
