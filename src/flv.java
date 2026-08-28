import javax.annotation.Nullable;

public abstract class flv extends fmb implements fnz {
   @Nullable
   private foa a;
   private boolean b;

   public flv(int $$0, int $$1, int $$2, int $$3, xj $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aJ_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public foa aK_() {
      return this.a;
   }

   @Override
   public void a(@Nullable foa $$0) {
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
   public fln a(fqh $$0) {
      return fnz.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fnz.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fnz.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fnz.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aL_() {
      return fnz.super.aL_();
   }

   @Override
   public void a(boolean $$0) {
      fnz.super.a($$0);
   }
}
