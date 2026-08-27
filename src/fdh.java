import javax.annotation.Nullable;

public abstract class fdh extends fdn implements ffk {
   @Nullable
   private ffl a;
   private boolean b;

   public fdh(int $$0, int $$1, int $$2, int $$3, wg $$4) {
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
   public ffl aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ffl $$0) {
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
   public fcz a(fhr $$0) {
      return ffk.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return ffk.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return ffk.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return ffk.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aJ_() {
      return ffk.super.aJ_();
   }

   @Override
   public void a(boolean $$0) {
      ffk.super.a($$0);
   }
}
