import javax.annotation.Nullable;

public abstract class fhy extends fie implements fkb {
   @Nullable
   private fkc a;
   private boolean b;

   public fhy(int $$0, int $$1, int $$2, int $$3, wy $$4) {
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
   public fkc aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fkc $$0) {
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
   public fhq a(fmi $$0) {
      return fkb.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fkb.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fkb.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fkb.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aK_() {
      return fkb.super.aK_();
   }

   @Override
   public void a(boolean $$0) {
      fkb.super.a($$0);
   }
}
