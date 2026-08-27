import javax.annotation.Nullable;

public abstract class ewy extends exe implements eza {
   @Nullable
   private ezb a;
   private boolean b;

   public ewy(int $$0, int $$1, int $$2, int $$3, vf $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aG_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public ezb aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ezb $$0) {
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
   public ewr a(fbf $$0) {
      return eza.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return eza.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return eza.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return eza.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aI_() {
      return eza.super.aI_();
   }

   @Override
   public void a(boolean $$0) {
      eza.super.a($$0);
   }
}
