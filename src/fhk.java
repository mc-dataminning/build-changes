import javax.annotation.Nullable;

public abstract class fhk extends fhq implements fjn {
   @Nullable
   private fjo a;
   private boolean b;

   public fhk(int $$0, int $$1, int $$2, int $$3, wu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aI_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fjo aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fjo $$0) {
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
   public fhc a(flu $$0) {
      return fjn.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fjn.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fjn.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fjn.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aK_() {
      return fjn.super.aK_();
   }

   @Override
   public void a(boolean $$0) {
      fjn.super.a($$0);
   }
}
