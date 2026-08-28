import javax.annotation.Nullable;

public abstract class fhm extends fhs implements fjp {
   @Nullable
   private fjq a;
   private boolean b;

   public fhm(int $$0, int $$1, int $$2, int $$3, wu $$4) {
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
   public fjq aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fjq $$0) {
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
   public fhe a(flw $$0) {
      return fjp.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fjp.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fjp.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fjp.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aK_() {
      return fjp.super.aK_();
   }

   @Override
   public void a(boolean $$0) {
      fjp.super.a($$0);
   }
}
